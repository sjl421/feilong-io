/*
 * Copyright (C) 2008 feilong
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.feilong.io;

import static com.feilong.core.CharsetType.UTF8;

import java.io.InputStream;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.feilong.core.lang.StringUtil;

/**
 * The Class IOReaderUtilTest.
 * 
 * @author <a href="http://feitianbenyue.iteye.com/">feilong</a>
 */
public class IOReaderUtilTest{

    /** The Constant LOGGER. */
    private static final Logger LOGGER         = LoggerFactory.getLogger(IOReaderUtilTest.class);

    private static final String propertiesPath = "C:\\Users\\feilong\\.m2\\settings.xml";

    /**
     * Testname.
     */
    @Test
    public void testname(){
        String fileName = "F:\\Life 生活\\Job 工作\\淘宝开店\\商家编码.txt";
        String content = IOReaderUtil.readFileToString(fileName, UTF8);
        // 将内容以换行符转成数组
        String[] rowsContents = StringUtil.split(content, "\r\n");
        LOGGER.debug(content);
        LOGGER.debug("" + rowsContents.length);
    }

    /**
     * Parses the nginx.
     */
    @Test
    public void parseNginx(){
        String fileName = "C:\\Users\\feilong\\Documents\\AJ11\\AJ11\\1.txt";
        LOGGER.debug(IOReaderUtil.readFileToString(fileName, UTF8));
    }

    /**
     * Gets the file content.
     */
    @Test
    public void testGetFileContent(){
        LOGGER.debug(IOReaderUtil.readFileToString(propertiesPath, UTF8));
    }

    @Test
    public void testGetFileContent2(){
        InputStream inputStream = FileUtil.getFileInputStream(propertiesPath);
        LOGGER.debug(IOReaderUtil.getContent(inputStream, UTF8));
    }
}
