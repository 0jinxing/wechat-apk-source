package com.google.android.gms.common.util;

import android.os.Binder;
import android.os.Process;
import android.os.StrictMode;
import android.os.StrictMode.ThreadPolicy;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.FileReader;
import java.io.IOException;
import javax.annotation.Nullable;

public class ProcessUtils
{
  private static String zzaai = null;
  private static int zzaaj = 0;

  @Nullable
  public static String getCallingProcessName()
  {
    AppMethodBeat.i(90256);
    int i = Binder.getCallingPid();
    String str;
    if (i == zzde())
    {
      str = getMyProcessName();
      AppMethodBeat.o(90256);
    }
    while (true)
    {
      return str;
      str = zzl(i);
      AppMethodBeat.o(90256);
    }
  }

  @Nullable
  public static String getMyProcessName()
  {
    AppMethodBeat.i(90257);
    if (zzaai == null)
      zzaai = zzl(zzde());
    String str = zzaai;
    AppMethodBeat.o(90257);
    return str;
  }

  public static boolean hasSystemGroups()
  {
    AppMethodBeat.i(90258);
    ProcessUtils.SystemGroupsNotAvailableException localSystemGroupsNotAvailableException = null;
    BufferedReader localBufferedReader1 = null;
    BufferedReader localBufferedReader2 = localBufferedReader1;
    Object localObject2 = localSystemGroupsNotAvailableException;
    try
    {
      int i = zzde();
      localBufferedReader2 = localBufferedReader1;
      localObject2 = localSystemGroupsNotAvailableException;
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localBufferedReader2 = localBufferedReader1;
      localObject2 = localSystemGroupsNotAvailableException;
      localStringBuilder.<init>(24);
      localBufferedReader2 = localBufferedReader1;
      localObject2 = localSystemGroupsNotAvailableException;
      localBufferedReader1 = zzm("/proc/" + i + "/status");
      localBufferedReader2 = localBufferedReader1;
      localObject2 = localBufferedReader1;
      boolean bool = zzk(localBufferedReader1);
      IOUtils.closeQuietly(localBufferedReader1);
      AppMethodBeat.o(90258);
      return bool;
    }
    catch (IOException localIOException)
    {
      localObject2 = localBufferedReader2;
      localSystemGroupsNotAvailableException = new com/google/android/gms/common/util/ProcessUtils$SystemGroupsNotAvailableException;
      localObject2 = localBufferedReader2;
      localSystemGroupsNotAvailableException.<init>("Unable to access /proc/pid/status.", localIOException);
      localObject2 = localBufferedReader2;
      AppMethodBeat.o(90258);
      localObject2 = localBufferedReader2;
      throw localSystemGroupsNotAvailableException;
    }
    finally
    {
      IOUtils.closeQuietly((Closeable)localObject2);
      AppMethodBeat.o(90258);
    }
  }

  private static int zzde()
  {
    AppMethodBeat.i(90262);
    if (zzaaj == 0)
      zzaaj = Process.myPid();
    int i = zzaaj;
    AppMethodBeat.o(90262);
    return i;
  }

  private static boolean zzk(BufferedReader paramBufferedReader)
  {
    boolean bool = false;
    AppMethodBeat.i(90259);
    String str2;
    for (String str1 = paramBufferedReader.readLine(); str1 != null; str2 = paramBufferedReader.readLine())
    {
      str1 = str1.trim();
      if (str1.startsWith("Groups:"))
      {
        paramBufferedReader = str1.substring(7).trim().split("\\s", -1);
        int i = paramBufferedReader.length;
        int j = 0;
        if (j < i)
          str1 = paramBufferedReader[j];
        while (true)
        {
          try
          {
            long l = Long.parseLong(str1);
            if ((l >= 1000L) && (l < 2000L))
            {
              bool = true;
              AppMethodBeat.o(90259);
              return bool;
            }
          }
          catch (NumberFormatException localNumberFormatException)
          {
            j++;
          }
          break;
          AppMethodBeat.o(90259);
        }
      }
    }
    paramBufferedReader = new ProcessUtils.SystemGroupsNotAvailableException("Missing Groups entry from proc/pid/status.");
    AppMethodBeat.o(90259);
    throw paramBufferedReader;
  }

  // ERROR //
  @Nullable
  private static String zzl(int paramInt)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: aconst_null
    //   3: astore_2
    //   4: ldc 143
    //   6: invokestatic 30	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   9: iload_0
    //   10: ifgt +10 -> 20
    //   13: ldc 143
    //   15: invokestatic 45	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   18: aload_2
    //   19: areturn
    //   20: new 58	java/lang/StringBuilder
    //   23: astore_2
    //   24: aload_2
    //   25: bipush 25
    //   27: invokespecial 60	java/lang/StringBuilder:<init>	(I)V
    //   30: aload_2
    //   31: ldc 62
    //   33: invokevirtual 66	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   36: iload_0
    //   37: invokevirtual 69	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   40: ldc 145
    //   42: invokevirtual 66	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   45: invokevirtual 74	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   48: invokestatic 78	com/google/android/gms/common/util/ProcessUtils:zzm	(Ljava/lang/String;)Ljava/io/BufferedReader;
    //   51: astore_2
    //   52: aload_2
    //   53: invokevirtual 107	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   56: invokevirtual 112	java/lang/String:trim	()Ljava/lang/String;
    //   59: astore_3
    //   60: aload_3
    //   61: astore_1
    //   62: aload_2
    //   63: invokestatic 88	com/google/android/gms/common/util/IOUtils:closeQuietly	(Ljava/io/Closeable;)V
    //   66: aload_1
    //   67: astore_2
    //   68: ldc 143
    //   70: invokestatic 45	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   73: goto -55 -> 18
    //   76: astore_2
    //   77: aconst_null
    //   78: astore_2
    //   79: aload_2
    //   80: invokestatic 88	com/google/android/gms/common/util/IOUtils:closeQuietly	(Ljava/io/Closeable;)V
    //   83: aload_1
    //   84: astore_2
    //   85: goto -17 -> 68
    //   88: astore_1
    //   89: aconst_null
    //   90: astore_2
    //   91: aload_2
    //   92: invokestatic 88	com/google/android/gms/common/util/IOUtils:closeQuietly	(Ljava/io/Closeable;)V
    //   95: ldc 143
    //   97: invokestatic 45	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   100: aload_1
    //   101: athrow
    //   102: astore_1
    //   103: goto -12 -> 91
    //   106: astore_3
    //   107: goto -28 -> 79
    //
    // Exception table:
    //   from	to	target	type
    //   20	52	76	java/io/IOException
    //   20	52	88	finally
    //   52	60	102	finally
    //   52	60	106	java/io/IOException
  }

  private static BufferedReader zzm(String paramString)
  {
    AppMethodBeat.i(90261);
    StrictMode.ThreadPolicy localThreadPolicy = StrictMode.allowThreadDiskReads();
    try
    {
      FileReader localFileReader = new java/io/FileReader;
      localFileReader.<init>(paramString);
      paramString = new BufferedReader(localFileReader);
      return paramString;
    }
    finally
    {
      StrictMode.setThreadPolicy(localThreadPolicy);
      AppMethodBeat.o(90261);
    }
    throw paramString;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.util.ProcessUtils
 * JD-Core Version:    0.6.2
 */