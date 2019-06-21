package com.tencent.mars.xlog;

import android.os.Debug;
import android.os.Process;
import com.tencent.mm.protocal.d;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class LogLogic
{
  static long printVMSizeTime;

  public static String appendMemLog(String paramString)
  {
    if (d.vxp);
    while (true)
    {
      return paramString;
      long l = System.currentTimeMillis();
      if (l - printVMSizeTime > 120000L)
      {
        printVMSizeTime = l;
        paramString = String.format("[%s] %s", new Object[] { getVmStatus(), paramString });
      }
      else
      {
        paramString = String.format("[%sK] %s", new Object[] { Long.valueOf(getDalvikHeap()), paramString });
      }
    }
  }

  public static String convertStreamToString(InputStream paramInputStream)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    try
    {
      BufferedReader localBufferedReader = new java/io/BufferedReader;
      InputStreamReader localInputStreamReader = new java/io/InputStreamReader;
      localInputStreamReader.<init>(paramInputStream);
      localBufferedReader.<init>(localInputStreamReader);
      try
      {
        while (true)
        {
          paramInputStream = localBufferedReader.readLine();
          if (paramInputStream == null)
            break;
          localStringBuilder.append(paramInputStream).append('\n');
        }
      }
      finally
      {
        paramInputStream = localBufferedReader;
      }
      if (paramInputStream != null)
        paramInputStream.close();
      throw localObject1;
      localBufferedReader.close();
      return localObject1.toString();
    }
    finally
    {
      while (true)
        paramInputStream = null;
    }
  }

  public static native int getAppenderModeFromCfg();

  public static long getDalvikHeap()
  {
    Runtime localRuntime = Runtime.getRuntime();
    return (localRuntime.totalMemory() - localRuntime.freeMemory()) / 1024L;
  }

  public static native int getIPxxLogLevel();

  public static native int getLogLevelFromCfg();

  public static long getNativeHeap()
  {
    return Debug.getNativeHeapAllocatedSize() / 1024L;
  }

  // ERROR //
  public static String getStringFromFile(String paramString)
  {
    // Byte code:
    //   0: new 110	java/io/File
    //   3: dup
    //   4: aload_0
    //   5: invokespecial 113	java/io/File:<init>	(Ljava/lang/String;)V
    //   8: astore_0
    //   9: new 115	java/io/FileInputStream
    //   12: astore_1
    //   13: aload_1
    //   14: aload_0
    //   15: invokespecial 118	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   18: aload_1
    //   19: invokestatic 120	com/tencent/mars/xlog/LogLogic:convertStreamToString	(Ljava/io/InputStream;)Ljava/lang/String;
    //   22: astore_0
    //   23: aload_1
    //   24: invokevirtual 121	java/io/FileInputStream:close	()V
    //   27: aload_0
    //   28: areturn
    //   29: astore_0
    //   30: aconst_null
    //   31: astore_1
    //   32: aload_1
    //   33: ifnull +7 -> 40
    //   36: aload_1
    //   37: invokevirtual 121	java/io/FileInputStream:close	()V
    //   40: aload_0
    //   41: athrow
    //   42: astore_0
    //   43: goto -11 -> 32
    //
    // Exception table:
    //   from	to	target	type
    //   9	18	29	finally
    //   18	23	42	finally
  }

  public static String getVmSize()
  {
    String str1 = String.format("/proc/%s/status", new Object[] { Integer.valueOf(Process.myPid()) });
    try
    {
      String[] arrayOfString = getStringFromFile(str1).trim().split("\n");
      int i = arrayOfString.length;
      int j = 0;
      if (j < i)
      {
        str1 = arrayOfString[j];
        if (!str1.startsWith("VmSize"));
      }
      while (true)
      {
        return str1;
        j++;
        break;
        str1 = arrayOfString[12];
      }
    }
    catch (Exception localException)
    {
      while (true)
        String str2 = "";
    }
  }

  public static String getVmStatus()
  {
    String str = String.format("/proc/%s/status", new Object[] { Integer.valueOf(Process.myPid()) });
    Object localObject = new StringBuilder();
    try
    {
      ((StringBuilder)localObject).append(getStringFromFile(str).trim());
      localObject = ((StringBuilder)localObject).toString();
      return localObject;
    }
    catch (Exception localException)
    {
      while (true)
        localObject = ((StringBuilder)localObject).toString();
    }
  }

  public static native void initIPxxLogInfo();

  public static native void setIPxxLogML(int paramInt1, int paramInt2);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mars.xlog.LogLogic
 * JD-Core Version:    0.6.2
 */