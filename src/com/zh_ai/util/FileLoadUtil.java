package com.zh_ai.util;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * @description:
 * @author: LiWenJie
 * @time: 2020/9/11 11:35
 */
public class FileLoadUtil {

    private static final String DEFAULT_TEMP_FILEPATH = "E:\\temp\\buffer\\";

    private static final String[] DEFAULT_FILETYPE = {"jpg", "png", "bmp", "gif"};

    private static final int DEFAULT_SIZE_THRESHOLD = 1024 * 4;

    private static final int DEFAULT_SIZE_MAX = 1024 * 5000;

    private String fileLoadPath; //�ϴ�����ļ�·��

    private String fileName; //Ҫ�ϴ����ļ�����

    private String tempFilePath; //�ϴ���ʱ�ļ���

    private String[] fileType; //���Ƶ��ļ�����

    private int sizeThreshold; //��������С

    private int sizeMax; //�����ļ���С

    private DiskFileItemFactory factory; //�ļ��ϴ����

    private ServletFileUpload upload; //��Ӧ���ļ�

    /**
     * �ļ��ϴ����캯��
     *
     * @param loadPath
     * @param tempFilePath
     * @param fileType
     * @param sizeThreshold
     * @param sizeMax
     */
    public FileLoadUtil(String loadPath, String tempFilePath, String[] fileType, int sizeThreshold, int sizeMax) {
        this.fileLoadPath = loadPath;
        this.tempFilePath = tempFilePath;
        this.fileType = fileType;
        this.sizeThreshold = sizeThreshold;
        this.sizeMax = sizeMax;
    }

    public FileLoadUtil(String loadPath) {
        this.tempFilePath = DEFAULT_TEMP_FILEPATH;
        this.fileType = DEFAULT_FILETYPE;
        this.sizeThreshold = DEFAULT_SIZE_THRESHOLD;
        this.sizeMax = DEFAULT_SIZE_MAX;
        this.fileLoadPath = loadPath;
        this.factory = new DiskFileItemFactory();
    }

    public FileLoadUtil(){

    }

    public static String getDefaultTempFilepath() {
        return DEFAULT_TEMP_FILEPATH;
    }

    public String getFileLoadPath() {
        return fileLoadPath;
    }

    public void setFileLoadPath(String fileLoadPath) {
        this.fileLoadPath = fileLoadPath;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getTempFilePath() {
        return tempFilePath;
    }

    public void setTempFilePath(String tempFilePath) {
        this.tempFilePath = tempFilePath;
    }

    public String[] getFileType() {
        return fileType;
    }

    public void setFileType(String[] fileType) {
        this.fileType = fileType;
    }

    public int getSizeThreshold() {
        return sizeThreshold;
    }

    public void setSizeThreshold(int sizeThreshold) {
        this.sizeThreshold = sizeThreshold;
    }

    public int getSizeMax() {
        return sizeMax;
    }

    public void setSizeMax(int sizeMax) {
        this.sizeMax = sizeMax;
    }

    public boolean createTempDirectory() {
        File tempPatchFile = new File("E:\\temp\\buffer\\");
        //�ж��ļ���Ŀ¼�Ƿ����
        if (!tempPatchFile.exists()) {
            //���ָ�����ļ���Ŀ¼�������򴴽�ָ����Ŀ¼���������б���ĵ������ڵĸ�Ŀ¼
            if (!tempPatchFile.mkdirs()) {
                return false;
            }
        }
        return true;
    }

    public void setUploadParam() {
        DiskFileItemFactory factory = new DiskFileItemFactory();
        //���û�������С4kb,�������ֽ�Ϊ��λ
        factory.setSizeThreshold(sizeThreshold);
        //�����ϴ��ļ��õ���ʱ�ļ����·��
        factory.setRepository(new File(tempFilePath));
        //��֮ǰ���ú��ļ��ϴ����Ե�factory���󽻸�ServletFileUpload�ϴ�
        upload = new ServletFileUpload(factory);
        //���Ƶ����ļ��ϴ���СΪ1mb���������ֽ�Ϊ��λ
        upload.setSizeMax(sizeMax);
    }

    public List<String> processFormFile(List<FileItem> fileItems) throws Exception {
        List<String> nameArr = new ArrayList<>();
        Iterator<FileItem> itemIterator = fileItems.iterator();
        //���δ���������е�ÿһ�����ļ�
        while (itemIterator.hasNext()) {
            //�õ�ÿһ�����ļ�
            FileItem fileItem = itemIterator.next();
            //�ж��Ƿ�Ϊ�ļ����ֶ�
            if (!fileItem.isFormField()) {
                String name;
                if((name = fileUploading(fileItem)) != null)
                    nameArr.add(name);
            }
        }
        return nameArr;
    }

    private String fileUploading(FileItem fileItem) throws Exception {
        String fileName = fileItem.getName();
        //ͨ��Arrays���asList()���������̶����ȵļ���
        List<String> fileType = Arrays.asList(this.fileType);
        //��ȡ�ļ���׺��
        String ext = fileName.substring(fileName.lastIndexOf(".") + 1);
        //�ж��ļ������Ƿ�������ķ�Χ��
        if (!fileType.contains(ext)) {
            System.out.println("只能是gif、bmp、jpg");
        } else {
            //����ļ����Ʋ�Ϊ��
            if (fileName != null && !fileName.equals("")) {
                //��uploadPath��Ϊ��·������fileName��Ϊ�ø�·�����ļ���Ŀ¼��ʽ�������ļ�ʾ��
                File fullFile = new File(fileName);
                File fileSave = new File(fileLoadPath, fullFile.getName());
                //���ļ��ϴ���ָ��Ŀ¼
                fileItem.write(fileSave);
                return fileName;
            }
        }
        return null;
    }



    public List<String> defUpload(HttpServletRequest req) throws Exception{
        if(!this.createTempDirectory()){
            System.out.println("创建临时文件夹失败");
        }
        this.setUploadParam();
        List<FileItem> fileItems = null;
        if(ServletFileUpload.isMultipartContent(req)) {
            fileItems = upload.parseRequest(req);
            return this.processFormFile(fileItems);
        }
        return null;
    }

}
