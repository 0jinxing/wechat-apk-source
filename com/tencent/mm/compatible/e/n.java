package com.tencent.mm.compatible.e;

import android.os.Build.VERSION;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.File;
import java.io.FileFilter;
import java.util.Map;
import java.util.regex.Pattern;

public final class n
{
  private static Map<String, String> esN = null;

  public static Map<String, String> LA()
  {
    AppMethodBeat.i(92946);
    if (esN == null)
      esN = LF();
    Map localMap = esN;
    AppMethodBeat.o(92946);
    return localMap;
  }

  public static String LB()
  {
    AppMethodBeat.i(92947);
    if (esN == null)
      esN = LF();
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append(": ");
    ((StringBuilder)localObject).append(b(esN, "Features"));
    ((StringBuilder)localObject).append(": ");
    ((StringBuilder)localObject).append(b(esN, "Processor"));
    ((StringBuilder)localObject).append(": ");
    ((StringBuilder)localObject).append(b(esN, "CPU architecture"));
    ((StringBuilder)localObject).append(": ");
    ((StringBuilder)localObject).append(b(esN, "Hardware"));
    ((StringBuilder)localObject).append(": ");
    ((StringBuilder)localObject).append(b(esN, "Serial"));
    localObject = ((StringBuilder)localObject).toString();
    AppMethodBeat.o(92947);
    return localObject;
  }

  public static boolean LC()
  {
    boolean bool = true;
    AppMethodBeat.i(92948);
    if (esN == null)
      esN = LF();
    String str;
    if (esN != null)
    {
      str = b(esN, "Features");
      if ((str != null) && (str.contains("neon")))
        AppMethodBeat.o(92948);
    }
    while (true)
    {
      return bool;
      if ((str != null) && (str.contains("asimd")))
      {
        AppMethodBeat.o(92948);
      }
      else
      {
        bool = false;
        AppMethodBeat.o(92948);
      }
    }
  }

  public static boolean LD()
  {
    boolean bool = true;
    AppMethodBeat.i(92949);
    try
    {
      int i;
      if (Build.VERSION.SDK_INT >= 4)
      {
        i = 1;
        if ((i == 0) || (!LC()))
          break label38;
        AppMethodBeat.o(92949);
      }
      while (true)
      {
        return bool;
        i = 0;
        break;
        label38: AppMethodBeat.o(92949);
        bool = false;
      }
    }
    catch (IncompatibleClassChangeError localIncompatibleClassChangeError1)
    {
      ab.printErrStackTrace("MicroMsg.Crash", localIncompatibleClassChangeError1, "May cause dvmFindCatchBlock crash!", new Object[0]);
      IncompatibleClassChangeError localIncompatibleClassChangeError2 = (IncompatibleClassChangeError)new IncompatibleClassChangeError("May cause dvmFindCatchBlock crash!").initCause(localIncompatibleClassChangeError1);
      AppMethodBeat.o(92949);
      throw localIncompatibleClassChangeError2;
    }
    catch (Throwable localThrowable)
    {
      while (true)
      {
        AppMethodBeat.o(92949);
        bool = false;
      }
    }
  }

  public static boolean LE()
  {
    boolean bool = false;
    AppMethodBeat.i(92950);
    if (esN == null)
      esN = LF();
    String str;
    if (esN != null)
    {
      str = b(esN, "CPU architecture");
      ab.d("CpuFeatures", "arch ".concat(String.valueOf(str)));
      if (str == null);
    }
    while (true)
    {
      try
      {
        if (str.length() > 0)
        {
          int i = bo.getInt(kt(ks(str)), 0);
          ab.d("CpuFeatures", "armarch ".concat(String.valueOf(i)));
          if (i >= 6)
          {
            bool = true;
            AppMethodBeat.o(92950);
            return bool;
          }
        }
      }
      catch (Exception localException)
      {
        ab.printErrStackTrace("CpuFeatures", localException, "", new Object[0]);
      }
      AppMethodBeat.o(92950);
    }
  }

  // ERROR //
  public static java.util.HashMap<String, String> LF()
  {
    // Byte code:
    //   0: ldc 154
    //   2: invokestatic 24	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: new 156	java/util/HashMap
    //   8: dup
    //   9: invokespecial 157	java/util/HashMap:<init>	()V
    //   12: astore_0
    //   13: new 159	java/io/BufferedReader
    //   16: astore_1
    //   17: new 161	java/io/InputStreamReader
    //   20: astore_2
    //   21: new 163	java/io/FileInputStream
    //   24: astore_3
    //   25: aload_3
    //   26: ldc 165
    //   28: invokespecial 166	java/io/FileInputStream:<init>	(Ljava/lang/String;)V
    //   31: aload_2
    //   32: aload_3
    //   33: ldc 168
    //   35: invokespecial 171	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;Ljava/lang/String;)V
    //   38: aload_1
    //   39: aload_2
    //   40: invokespecial 174	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   43: aload_1
    //   44: astore_3
    //   45: aload_1
    //   46: invokevirtual 177	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   49: astore_2
    //   50: aload_2
    //   51: ifnull +98 -> 149
    //   54: aload_1
    //   55: astore_3
    //   56: aload_2
    //   57: ldc 179
    //   59: iconst_2
    //   60: invokevirtual 183	java/lang/String:split	(Ljava/lang/String;I)[Ljava/lang/String;
    //   63: astore 4
    //   65: aload 4
    //   67: ifnull -24 -> 43
    //   70: aload_1
    //   71: astore_3
    //   72: aload 4
    //   74: arraylength
    //   75: iconst_2
    //   76: if_icmplt -33 -> 43
    //   79: aload_1
    //   80: astore_3
    //   81: aload 4
    //   83: iconst_0
    //   84: aaload
    //   85: invokevirtual 186	java/lang/String:trim	()Ljava/lang/String;
    //   88: astore_2
    //   89: aload_1
    //   90: astore_3
    //   91: aload 4
    //   93: iconst_1
    //   94: aaload
    //   95: invokevirtual 186	java/lang/String:trim	()Ljava/lang/String;
    //   98: astore 4
    //   100: aload_1
    //   101: astore_3
    //   102: aload_0
    //   103: aload_2
    //   104: invokevirtual 190	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   107: ifnonnull -64 -> 43
    //   110: aload_1
    //   111: astore_3
    //   112: aload_0
    //   113: aload_2
    //   114: aload 4
    //   116: invokevirtual 194	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   119: pop
    //   120: goto -77 -> 43
    //   123: astore_2
    //   124: aload_1
    //   125: astore_3
    //   126: ldc 114
    //   128: aload_2
    //   129: ldc 196
    //   131: iconst_0
    //   132: anewarray 4	java/lang/Object
    //   135: invokestatic 101	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   138: aload_1
    //   139: invokestatic 199	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   142: ldc 154
    //   144: invokestatic 31	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   147: aload_0
    //   148: areturn
    //   149: aload_1
    //   150: invokestatic 199	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   153: goto -11 -> 142
    //   156: astore_1
    //   157: aconst_null
    //   158: astore_3
    //   159: aload_3
    //   160: invokestatic 199	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   163: ldc 154
    //   165: invokestatic 31	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   168: aload_1
    //   169: athrow
    //   170: astore_1
    //   171: goto -12 -> 159
    //   174: astore_2
    //   175: aconst_null
    //   176: astore_1
    //   177: goto -53 -> 124
    //
    // Exception table:
    //   from	to	target	type
    //   45	50	123	java/io/IOException
    //   56	65	123	java/io/IOException
    //   72	79	123	java/io/IOException
    //   81	89	123	java/io/IOException
    //   91	100	123	java/io/IOException
    //   102	110	123	java/io/IOException
    //   112	120	123	java/io/IOException
    //   13	43	156	finally
    //   45	50	170	finally
    //   56	65	170	finally
    //   72	79	170	finally
    //   81	89	170	finally
    //   91	100	170	finally
    //   102	110	170	finally
    //   112	120	170	finally
    //   126	138	170	finally
    //   13	43	174	java/io/IOException
  }

  private static String b(Map<String, String> paramMap, String paramString)
  {
    AppMethodBeat.i(92954);
    paramMap = (String)paramMap.get(paramString);
    AppMethodBeat.o(92954);
    return paramMap;
  }

  public static int getNumCores()
  {
    AppMethodBeat.i(92951);
    try
    {
      File localFile = new java/io/File;
      localFile.<init>("/sys/devices/system/cpu/");
      a locala = new com/tencent/mm/compatible/e/n$a;
      locala.<init>();
      i = localFile.listFiles(locala).length;
      AppMethodBeat.o(92951);
      return i;
    }
    catch (Exception localException)
    {
      while (true)
      {
        int i = 1;
        AppMethodBeat.o(92951);
      }
    }
  }

  private static String ks(String paramString)
  {
    AppMethodBeat.i(92952);
    Object localObject = paramString;
    String str;
    if (paramString != null)
    {
      str = paramString;
      localObject = paramString;
    }
    while (true)
    {
      try
      {
        if (paramString.length() > 0)
        {
          str = paramString;
          localObject = paramString;
          if (!q(paramString.charAt(0)))
          {
            str = paramString;
            int i = paramString.length();
            if (i == 1)
            {
              localObject = null;
              AppMethodBeat.o(92952);
              return localObject;
            }
            str = paramString;
            paramString = paramString.substring(1);
            continue;
          }
        }
      }
      catch (Exception paramString)
      {
        ab.printErrStackTrace("CpuFeatures", paramString, "", new Object[0]);
        localObject = str;
      }
      AppMethodBeat.o(92952);
    }
  }

  private static String kt(String paramString)
  {
    AppMethodBeat.i(92953);
    int i = 0;
    while (true)
    {
      int j = i + 1;
      try
      {
        if ((!q(paramString.charAt(i))) || (paramString.length() <= j))
        {
          i = j - 1;
          String str = paramString;
          if (paramString.length() > i + 1)
          {
            str = paramString;
            if (i > 0)
              str = paramString.substring(0, i);
          }
          AppMethodBeat.o(92953);
          paramString = str;
          return paramString;
        }
      }
      catch (Exception localException)
      {
        while (true)
        {
          ab.printErrStackTrace("CpuFeatures", localException, "", new Object[0]);
          AppMethodBeat.o(92953);
        }
        i = j;
      }
    }
  }

  private static boolean q(char paramChar)
  {
    if ((paramChar >= '0') && (paramChar <= '9'));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  final class a
    implements FileFilter
  {
    public final boolean accept(File paramFile)
    {
      AppMethodBeat.i(92945);
      boolean bool;
      if (Pattern.matches("cpu[0-9]", paramFile.getName()))
      {
        bool = true;
        AppMethodBeat.o(92945);
      }
      while (true)
      {
        return bool;
        bool = false;
        AppMethodBeat.o(92945);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.compatible.e.n
 * JD-Core Version:    0.6.2
 */