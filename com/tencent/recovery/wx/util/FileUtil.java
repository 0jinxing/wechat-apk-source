package com.tencent.recovery.wx.util;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class FileUtil
{
  // ERROR //
  public static java.lang.String ae(java.io.File paramFile)
  {
    // Byte code:
    //   0: new 17	java/io/FileInputStream
    //   3: astore_1
    //   4: aload_1
    //   5: aload_0
    //   6: invokespecial 20	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   9: new 22	java/lang/String
    //   12: astore_0
    //   13: aload_0
    //   14: aload_1
    //   15: invokestatic 26	com/tencent/recovery/wx/util/FileUtil:q	(Ljava/io/InputStream;)[B
    //   18: invokespecial 29	java/lang/String:<init>	([B)V
    //   21: aload_1
    //   22: invokevirtual 34	java/io/InputStream:close	()V
    //   25: aload_0
    //   26: areturn
    //   27: astore_0
    //   28: aconst_null
    //   29: astore_1
    //   30: aload_1
    //   31: ifnull +7 -> 38
    //   34: aload_1
    //   35: invokevirtual 34	java/io/InputStream:close	()V
    //   38: aconst_null
    //   39: astore_0
    //   40: goto -15 -> 25
    //   43: astore_0
    //   44: aconst_null
    //   45: astore_1
    //   46: aload_1
    //   47: ifnull +7 -> 54
    //   50: aload_1
    //   51: invokevirtual 34	java/io/InputStream:close	()V
    //   54: aload_0
    //   55: athrow
    //   56: astore_1
    //   57: goto -32 -> 25
    //   60: astore_0
    //   61: goto -23 -> 38
    //   64: astore_1
    //   65: goto -11 -> 54
    //   68: astore_0
    //   69: goto -23 -> 46
    //   72: astore_0
    //   73: goto -43 -> 30
    //
    // Exception table:
    //   from	to	target	type
    //   0	9	27	java/lang/Exception
    //   0	9	43	finally
    //   21	25	56	java/io/IOException
    //   34	38	60	java/io/IOException
    //   50	54	64	java/io/IOException
    //   9	21	68	finally
    //   9	21	72	java/lang/Exception
  }

  public static byte[] q(InputStream paramInputStream)
  {
    if (paramInputStream == null)
      paramInputStream = null;
    while (true)
    {
      return paramInputStream;
      ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
      byte[] arrayOfByte = new byte[1024];
      int i = 0;
      try
      {
        while (true)
        {
          int j = paramInputStream.read(arrayOfByte, 0, 1024);
          i = j;
          label38: if (i <= 0)
            break;
          localByteArrayOutputStream.write(arrayOfByte, 0, i);
        }
        paramInputStream = localByteArrayOutputStream.toByteArray();
      }
      catch (IOException localIOException)
      {
        break label38;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.recovery.wx.util.FileUtil
 * JD-Core Version:    0.6.2
 */