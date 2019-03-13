package com.aifocus;

import org.apache.commons.lang3.StringUtils;

import java.io.*;

/**
 * @description: 修改文件
 * @author: 北望
 * @date: 2019-03-12 10:15
 **/

public class ModifyFile {
    public static void main(String[] args) throws IOException {
        File f = new File("/Users/Joyin/Desktop/文档/详细设计/文档名");

        // 构建InputStreamReader对象,编码与写入相同
        FileReader fileReader = new FileReader(f);
        BufferedReader bufferedReader = new BufferedReader(fileReader);


        File f1 = new File("/Users/Joyin/Desktop/文档/详细设计/文档名");
        f1.delete();
        f1.createNewFile();
        FileWriter fileWriter = new FileWriter(f1);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);



        String readString = null;
        String writeString = null;
        int i = 0;
        while((readString = bufferedReader.readLine()) != null) {
            if(StringUtils.isNotBlank(readString)) {
                writeString = "\"" + readString + "\",\n";
                bufferedWriter.write(writeString);
                i++;
            }
        }

        bufferedReader.close();
        fileReader.close();

        bufferedWriter.close();
        fileWriter.close();

        System.out.println("共计：" + i);

    }

}

