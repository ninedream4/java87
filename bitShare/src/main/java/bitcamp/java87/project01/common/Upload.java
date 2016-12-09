package bitcamp.java87.project01.common;

import java.io.File;
import java.io.FileOutputStream;

import org.springframework.web.multipart.MultipartFile;

public class Upload {
	private FileOutputStream fos;
    private ConvertFile convertFile;
    private String filePath;
    
    public void uploadFile(MultipartFile file, String title, String fileName) {
         
        try{
        	
            byte fileData[] = file.getBytes();
             filePath = "c:/bitshare/"+ title + "/";
             
             File dir = new File(filePath);
             
             if (!dir.exists()) { //폴더 없으면 폴더 생성
                 dir.mkdirs();
             }
             
            fos = new FileOutputStream(filePath + fileName);
             
            fos.write(fileData);
         
        }catch(Exception e){
             
            e.printStackTrace();
             
        }finally{
             
            if(fos != null){
                 
                try{
                    fos.close();
                    convertFile.convertFileToJpg(filePath, fileName);
                }catch(Exception e){}
                 
                }
        }// try end;
    }
}
