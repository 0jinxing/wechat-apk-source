package com.tencent.tinker.loader.shareutil;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Process;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.PrintStream;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ShareTinkerInternals
{
  private static final boolean AFi = auv(System.getProperty("java.vm.version"));
  private static final boolean AFj = dSt();
  private static Boolean AFk = null;
  private static String AFl = null;
  private static String AFm = null;
  private static String processName = null;

  // ERROR //
  public static java.util.Properties S(File paramFile)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: aload_1
    //   3: astore_2
    //   4: aload_0
    //   5: invokevirtual 56	java/io/File:isFile	()Z
    //   8: ifeq +14 -> 22
    //   11: aload_0
    //   12: invokevirtual 60	java/io/File:length	()J
    //   15: lconst_0
    //   16: lcmp
    //   17: ifne +7 -> 24
    //   20: aload_1
    //   21: astore_2
    //   22: aload_2
    //   23: areturn
    //   24: new 62	java/util/zip/ZipFile
    //   27: astore_2
    //   28: aload_2
    //   29: aload_0
    //   30: invokespecial 65	java/util/zip/ZipFile:<init>	(Ljava/io/File;)V
    //   33: aload_2
    //   34: ldc 67
    //   36: invokevirtual 71	java/util/zip/ZipFile:getEntry	(Ljava/lang/String;)Ljava/util/zip/ZipEntry;
    //   39: astore_0
    //   40: aload_0
    //   41: ifnonnull +12 -> 53
    //   44: aload_2
    //   45: invokestatic 77	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:a	(Ljava/util/zip/ZipFile;)V
    //   48: aload_1
    //   49: astore_2
    //   50: goto -28 -> 22
    //   53: aload_2
    //   54: aload_0
    //   55: invokevirtual 81	java/util/zip/ZipFile:getInputStream	(Ljava/util/zip/ZipEntry;)Ljava/io/InputStream;
    //   58: astore_0
    //   59: new 83	java/util/Properties
    //   62: astore_3
    //   63: aload_3
    //   64: invokespecial 84	java/util/Properties:<init>	()V
    //   67: aload_3
    //   68: aload_0
    //   69: invokevirtual 88	java/util/Properties:load	(Ljava/io/InputStream;)V
    //   72: aload_0
    //   73: invokestatic 92	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:ah	(Ljava/lang/Object;)V
    //   76: aload_2
    //   77: invokestatic 77	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:a	(Ljava/util/zip/ZipFile;)V
    //   80: aload_3
    //   81: astore_2
    //   82: goto -60 -> 22
    //   85: astore_3
    //   86: aconst_null
    //   87: astore_0
    //   88: aload_0
    //   89: invokestatic 92	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:ah	(Ljava/lang/Object;)V
    //   92: aload_3
    //   93: athrow
    //   94: astore_3
    //   95: aload_2
    //   96: astore_0
    //   97: new 94	java/lang/StringBuilder
    //   100: astore_2
    //   101: aload_2
    //   102: ldc 96
    //   104: invokespecial 99	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   107: aload_2
    //   108: aload_3
    //   109: invokevirtual 103	java/io/IOException:getMessage	()Ljava/lang/String;
    //   112: invokevirtual 107	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   115: pop
    //   116: aload_0
    //   117: invokestatic 77	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:a	(Ljava/util/zip/ZipFile;)V
    //   120: aload_1
    //   121: astore_2
    //   122: goto -100 -> 22
    //   125: astore_0
    //   126: aconst_null
    //   127: astore_2
    //   128: aload_2
    //   129: invokestatic 77	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:a	(Ljava/util/zip/ZipFile;)V
    //   132: aload_0
    //   133: athrow
    //   134: astore_0
    //   135: goto -7 -> 128
    //   138: astore_2
    //   139: aload_0
    //   140: astore_3
    //   141: aload_2
    //   142: astore_0
    //   143: aload_3
    //   144: astore_2
    //   145: goto -17 -> 128
    //   148: astore_3
    //   149: aconst_null
    //   150: astore_0
    //   151: goto -54 -> 97
    //   154: astore_3
    //   155: goto -67 -> 88
    //
    // Exception table:
    //   from	to	target	type
    //   53	59	85	finally
    //   33	40	94	java/io/IOException
    //   72	76	94	java/io/IOException
    //   88	94	94	java/io/IOException
    //   24	33	125	finally
    //   33	40	134	finally
    //   72	76	134	finally
    //   88	94	134	finally
    //   97	116	138	finally
    //   24	33	148	java/io/IOException
    //   59	72	154	finally
  }

  public static boolean Sa(int paramInt)
  {
    if ((paramInt & 0x1) != 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public static boolean Sb(int paramInt)
  {
    if ((paramInt & 0x2) != 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public static boolean Sc(int paramInt)
  {
    if ((paramInt & 0x4) != 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public static String Sd(int paramInt)
  {
    String str;
    switch (paramInt)
    {
    default:
      str = "unknown";
    case 3:
    case 4:
    case 5:
    case 1:
    case 2:
    case 6:
    }
    while (true)
    {
      return str;
      str = "dex";
      continue;
      str = "dex_opt";
      continue;
      str = "lib";
      continue;
      str = "patch_file";
      continue;
      str = "patch_info";
      continue;
      str = "resource";
    }
  }

  public static boolean Se(int paramInt)
  {
    if (paramInt != 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public static int a(Context paramContext, int paramInt, File paramFile, ShareSecurityCheck paramShareSecurityCheck)
  {
    int i;
    int j;
    if (!paramShareSecurityCheck.aw(paramFile))
    {
      i = -1;
      j = i;
      if (i == 0)
      {
        if (paramInt != 7)
          break label159;
        i = 1;
        label29: if (i != 0)
          break label211;
        paramContext = paramShareSecurityCheck.AFg;
        if ((Sa(paramInt)) || (!paramContext.containsKey("assets/dex_meta.txt")))
          break label165;
        j = -9;
      }
    }
    while (true)
    {
      return j;
      paramContext = jl(paramContext);
      if (paramContext == null)
      {
        i = -5;
        break;
      }
      paramFile = paramShareSecurityCheck.dSo();
      if (paramFile == null)
      {
        i = -2;
        break;
      }
      paramFile = (String)paramFile.get("TINKER_ID");
      if (paramFile == null)
      {
        i = -6;
        break;
      }
      if (!paramContext.equals(paramFile))
      {
        new StringBuilder("tinkerId is not equal, base is ").append(paramContext).append(", but patch is ").append(paramFile);
        i = -7;
        break;
      }
      i = 0;
      break;
      label159: i = 0;
      break label29;
      label165: if ((!Sb(paramInt)) && (paramContext.containsKey("assets/so_meta.txt")))
        j = -9;
      else if ((!Sc(paramInt)) && (paramContext.containsKey("assets/res_meta.txt")))
        j = -9;
      else
        label211: j = 0;
    }
  }

  public static ShareDexDiffPatchInfo a(ShareDexDiffPatchInfo paramShareDexDiffPatchInfo, int paramInt)
  {
    String str;
    if (paramShareDexDiffPatchInfo.ADN.startsWith("test.dex"))
      if (paramInt != 1)
        str = "classes" + paramInt + ".dex";
    for (paramShareDexDiffPatchInfo = new ShareDexDiffPatchInfo(str, paramShareDexDiffPatchInfo.path, paramShareDexDiffPatchInfo.ADO, paramShareDexDiffPatchInfo.ADP, paramShareDexDiffPatchInfo.ADS, paramShareDexDiffPatchInfo.ADQ, paramShareDexDiffPatchInfo.ADR, paramShareDexDiffPatchInfo.ADT); ; paramShareDexDiffPatchInfo = null)
    {
      return paramShareDexDiffPatchInfo;
      str = "classes.dex";
      break;
    }
  }

  public static String aD(Context paramContext)
  {
    if (processName != null)
      paramContext = processName;
    while (true)
    {
      return paramContext;
      paramContext = aE(paramContext);
      processName = paramContext;
    }
  }

  public static void aD(Context paramContext, int paramInt)
  {
    String str = "tinker_own_config_".concat(String.valueOf(aD(paramContext)));
    paramContext.getSharedPreferences(str, 0).edit().putInt("safe_mode_count_1.9.10", paramInt).commit();
    new StringBuilder("setSafeModeCount: preferName:").append(str).append(" count:").append(paramInt);
  }

  // ERROR //
  private static String aE(Context paramContext)
  {
    // Byte code:
    //   0: invokestatic 278	android/os/Process:myPid	()I
    //   3: istore_1
    //   4: aload_0
    //   5: ifnull +7 -> 12
    //   8: iload_1
    //   9: ifgt +9 -> 18
    //   12: ldc_w 280
    //   15: astore_0
    //   16: aload_0
    //   17: areturn
    //   18: aload_0
    //   19: ldc_w 282
    //   22: invokevirtual 286	android/content/Context:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
    //   25: checkcast 288	android/app/ActivityManager
    //   28: astore_0
    //   29: aload_0
    //   30: ifnull +77 -> 107
    //   33: aload_0
    //   34: invokevirtual 292	android/app/ActivityManager:getRunningAppProcesses	()Ljava/util/List;
    //   37: astore_0
    //   38: aload_0
    //   39: ifnull +68 -> 107
    //   42: aload_0
    //   43: invokeinterface 298 1 0
    //   48: astore_2
    //   49: aload_2
    //   50: invokeinterface 303 1 0
    //   55: ifeq +267 -> 322
    //   58: aload_2
    //   59: invokeinterface 307 1 0
    //   64: checkcast 309	android/app/ActivityManager$RunningAppProcessInfo
    //   67: astore_0
    //   68: aload_0
    //   69: getfield 313	android/app/ActivityManager$RunningAppProcessInfo:pid	I
    //   72: iload_1
    //   73: if_icmpne -24 -> 49
    //   76: aload_0
    //   77: ifnull +30 -> 107
    //   80: aload_0
    //   81: getfield 314	android/app/ActivityManager$RunningAppProcessInfo:processName	Ljava/lang/String;
    //   84: astore_0
    //   85: goto -69 -> 16
    //   88: astore_0
    //   89: new 94	java/lang/StringBuilder
    //   92: dup
    //   93: ldc_w 316
    //   96: invokespecial 99	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   99: aload_0
    //   100: invokevirtual 317	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   103: invokevirtual 107	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   106: pop
    //   107: sipush 128
    //   110: newarray byte
    //   112: astore_3
    //   113: new 319	java/io/FileInputStream
    //   116: astore_2
    //   117: new 94	java/lang/StringBuilder
    //   120: astore_0
    //   121: aload_0
    //   122: ldc_w 321
    //   125: invokespecial 99	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   128: aload_2
    //   129: aload_0
    //   130: iload_1
    //   131: invokevirtual 196	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   134: ldc_w 323
    //   137: invokevirtual 107	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   140: invokevirtual 201	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   143: invokespecial 324	java/io/FileInputStream:<init>	(Ljava/lang/String;)V
    //   146: aload_2
    //   147: astore_0
    //   148: aload_2
    //   149: aload_3
    //   150: invokevirtual 328	java/io/FileInputStream:read	([B)I
    //   153: istore 4
    //   155: iload 4
    //   157: ifle +78 -> 235
    //   160: iconst_0
    //   161: istore_1
    //   162: iload 4
    //   164: istore 5
    //   166: iload_1
    //   167: iload 4
    //   169: if_icmpge +25 -> 194
    //   172: aload_3
    //   173: iload_1
    //   174: baload
    //   175: sipush 255
    //   178: iand
    //   179: sipush 128
    //   182: if_icmpgt +9 -> 191
    //   185: aload_3
    //   186: iload_1
    //   187: baload
    //   188: ifgt +41 -> 229
    //   191: iload_1
    //   192: istore 5
    //   194: aload_2
    //   195: astore_0
    //   196: new 165	java/lang/String
    //   199: astore 6
    //   201: aload_2
    //   202: astore_0
    //   203: aload 6
    //   205: aload_3
    //   206: iconst_0
    //   207: iload 5
    //   209: invokespecial 331	java/lang/String:<init>	([BII)V
    //   212: aload_2
    //   213: invokevirtual 334	java/io/FileInputStream:close	()V
    //   216: aload 6
    //   218: astore_0
    //   219: goto -203 -> 16
    //   222: astore_0
    //   223: aload 6
    //   225: astore_0
    //   226: goto -210 -> 16
    //   229: iinc 1 1
    //   232: goto -70 -> 162
    //   235: aload_2
    //   236: invokevirtual 334	java/io/FileInputStream:close	()V
    //   239: ldc_w 280
    //   242: astore_0
    //   243: goto -227 -> 16
    //   246: astore 6
    //   248: aconst_null
    //   249: astore_2
    //   250: aload_2
    //   251: astore_0
    //   252: new 94	java/lang/StringBuilder
    //   255: astore_3
    //   256: aload_2
    //   257: astore_0
    //   258: aload_3
    //   259: ldc_w 316
    //   262: invokespecial 99	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   265: aload_2
    //   266: astore_0
    //   267: aload_3
    //   268: aload 6
    //   270: invokevirtual 317	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   273: invokevirtual 107	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   276: pop
    //   277: aload_2
    //   278: ifnull -39 -> 239
    //   281: aload_2
    //   282: invokevirtual 334	java/io/FileInputStream:close	()V
    //   285: goto -46 -> 239
    //   288: astore_0
    //   289: goto -50 -> 239
    //   292: astore_2
    //   293: aconst_null
    //   294: astore_0
    //   295: aload_0
    //   296: ifnull +7 -> 303
    //   299: aload_0
    //   300: invokevirtual 334	java/io/FileInputStream:close	()V
    //   303: aload_2
    //   304: athrow
    //   305: astore_0
    //   306: goto -67 -> 239
    //   309: astore_0
    //   310: goto -7 -> 303
    //   313: astore_2
    //   314: goto -19 -> 295
    //   317: astore 6
    //   319: goto -69 -> 250
    //   322: aconst_null
    //   323: astore_0
    //   324: goto -248 -> 76
    //
    // Exception table:
    //   from	to	target	type
    //   33	38	88	java/lang/Exception
    //   42	49	88	java/lang/Exception
    //   49	76	88	java/lang/Exception
    //   80	85	88	java/lang/Exception
    //   212	216	222	java/lang/Exception
    //   113	146	246	java/lang/Exception
    //   281	285	288	java/lang/Exception
    //   113	146	292	finally
    //   235	239	305	java/lang/Exception
    //   299	303	309	java/lang/Exception
    //   148	155	313	finally
    //   196	201	313	finally
    //   203	212	313	finally
    //   252	256	313	finally
    //   258	265	313	finally
    //   267	277	313	finally
    //   148	155	317	java/lang/Exception
    //   196	201	317	java/lang/Exception
    //   203	212	317	java/lang/Exception
  }

  private static String amD(String paramString)
  {
    if (paramString == null)
      paramString = null;
    label24: label72: 
    while (true)
    {
      return paramString;
      char[] arrayOfChar = paramString.toCharArray();
      if (arrayOfChar == null)
      {
        paramString = null;
      }
      else
      {
        int i = 0;
        if (i < arrayOfChar.length)
          if (arrayOfChar[i] > '')
            arrayOfChar[i] = ((char)0);
        for (int j = 1; ; j = 0)
        {
          if (j == 0)
            break label72;
          paramString = new String(arrayOfChar, 0, i);
          break;
          i++;
          break label24;
        }
      }
    }
  }

  public static boolean auu(String paramString)
  {
    boolean bool = false;
    String str = Build.FINGERPRINT;
    if ((paramString == null) || (paramString.equals("")) || (str == null) || (str.equals("")))
      new StringBuilder("fingerprint empty:").append(paramString).append(",current:").append(str);
    while (true)
    {
      return bool;
      if (!paramString.equals(str))
      {
        new StringBuilder("system OTA,fingerprint not equal:").append(paramString).append(",").append(str);
        bool = true;
      }
    }
  }

  private static boolean auv(String paramString)
  {
    boolean bool1 = false;
    boolean bool2 = bool1;
    if (paramString != null)
    {
      paramString = Pattern.compile("(\\d+)\\.(\\d+)(\\.\\d+)?").matcher(paramString);
      bool2 = bool1;
      if (!paramString.matches());
    }
    try
    {
      int i = Integer.parseInt(paramString.group(1));
      int j = Integer.parseInt(paramString.group(2));
      if (i <= 2)
      {
        bool2 = bool1;
        if (i == 2)
        {
          bool2 = bool1;
          if (j <= 0);
        }
      }
      else
      {
        bool2 = true;
      }
      return bool2;
    }
    catch (NumberFormatException paramString)
    {
      while (true)
        bool2 = bool1;
    }
  }

  public static String ch(Context paramContext, String paramString)
  {
    String str = paramString;
    if (paramString.equals("changing"))
      if (!jp(paramContext))
        break label25;
    label25: for (str = "odex"; ; str = "interpet")
      return str;
  }

  public static boolean dSp()
  {
    if ((AFi) || (Build.VERSION.SDK_INT >= 21));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public static boolean dSq()
  {
    if ((AFj) && (Build.VERSION.SDK_INT < 24));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public static boolean dSr()
  {
    if (Build.VERSION.SDK_INT > 25);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public static String dSs()
  {
    if (AFm != null);
    for (String str = AFm; ; str = AFm)
    {
      return str;
      AFm = (String)Class.forName("dalvik.system.VMRuntime").getDeclaredMethod("getCurrentInstructionSet", new Class[0]).invoke(null, new Object[0]);
      new StringBuilder("getCurrentInstructionSet:").append(AFm);
    }
  }

  private static boolean dSt()
  {
    try
    {
      Object localObject = Class.forName("android.os.SystemProperties").getDeclaredMethod("get", new Class[] { String.class });
      String str = (String)((Method)localObject).invoke(null, new Object[] { "dalvik.vm.usejit" });
      localObject = (String)((Method)localObject).invoke(null, new Object[] { "dalvik.vm.usejitprofiles" });
      if ((!isNullOrNil(str)) && (isNullOrNil((String)localObject)))
      {
        bool = str.equals("true");
        if (bool)
        {
          bool = true;
          return bool;
        }
      }
    }
    catch (Throwable localThrowable)
    {
      while (true)
      {
        new StringBuilder("isVmJitInternal ex:").append(localThrowable);
        boolean bool = false;
      }
    }
  }

  public static boolean isNullOrNil(String paramString)
  {
    if ((paramString == null) || (paramString.length() <= 0));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  private static String jl(Context paramContext)
  {
    Object localObject = null;
    if (AFl != null)
      paramContext = AFl;
    while (true)
    {
      return paramContext;
      try
      {
        paramContext = paramContext.getPackageManager().getApplicationInfo(paramContext.getPackageName(), 128).metaData.get("TINKER_ID");
        if (paramContext != null);
        for (AFl = String.valueOf(paramContext); ; AFl = null)
        {
          paramContext = AFl;
          break;
        }
      }
      catch (Exception paramContext)
      {
        new StringBuilder("getManifestTinkerID exception:").append(paramContext.getMessage());
        paramContext = localObject;
      }
    }
  }

  public static void jm(Context paramContext)
  {
    paramContext.getSharedPreferences("tinker_share_config", 4).edit().putBoolean("tinker_enable_1.9.10", false).commit();
  }

  public static boolean jn(Context paramContext)
  {
    if (paramContext == null);
    for (boolean bool = false; ; bool = paramContext.getSharedPreferences("tinker_share_config", 4).getBoolean("tinker_enable_1.9.10", true))
      return bool;
  }

  public static int jo(Context paramContext)
  {
    String str = "tinker_own_config_".concat(String.valueOf(aD(paramContext)));
    int i = paramContext.getSharedPreferences(str, 0).getInt("safe_mode_count_1.9.10", 0);
    new StringBuilder("getSafeModeCount: preferName:").append(str).append(" count:").append(i);
    return i;
  }

  public static boolean jp(Context paramContext)
  {
    String str = null;
    Object localObject = paramContext.getApplicationInfo();
    if (localObject != null)
      str = ((ApplicationInfo)localObject).processName;
    localObject = str;
    if (isNullOrNil(str))
      localObject = paramContext.getPackageName();
    str = aD(paramContext);
    if (str != null)
    {
      paramContext = str;
      if (str.length() != 0);
    }
    else
    {
      paramContext = "";
    }
    return ((String)localObject).equals(paramContext);
  }

  public static boolean jq(Context paramContext)
  {
    if (AFk != null);
    for (boolean bool = AFk.booleanValue(); ; bool = paramContext.booleanValue())
    {
      return bool;
      paramContext = Boolean.valueOf(aD(paramContext).endsWith(":patch"));
      AFk = paramContext;
    }
  }

  public static void jr(Context paramContext)
  {
    paramContext = (ActivityManager)paramContext.getSystemService("activity");
    if (paramContext == null);
    while (true)
    {
      return;
      paramContext = paramContext.getRunningAppProcesses();
      if (paramContext != null)
      {
        Iterator localIterator = paramContext.iterator();
        while (localIterator.hasNext())
        {
          paramContext = (ActivityManager.RunningAppProcessInfo)localIterator.next();
          if ((paramContext.uid == Process.myUid()) && (paramContext.pid != Process.myPid()))
            Process.killProcess(paramContext.pid);
        }
      }
    }
  }

  public static void js(Context paramContext)
  {
    Object localObject = (ActivityManager)paramContext.getSystemService("activity");
    if (localObject == null);
    while (true)
    {
      return;
      localObject = ((ActivityManager)localObject).getRunningAppProcesses();
      if (localObject != null)
      {
        Iterator localIterator = ((List)localObject).iterator();
        while (localIterator.hasNext())
        {
          localObject = (ActivityManager.RunningAppProcessInfo)localIterator.next();
          if ((((ActivityManager.RunningAppProcessInfo)localObject).uid == Process.myUid()) && (!((ActivityManager.RunningAppProcessInfo)localObject).processName.equals(paramContext.getPackageName())))
            Process.killProcess(((ActivityManager.RunningAppProcessInfo)localObject).pid);
        }
      }
    }
  }

  public static String m(Throwable paramThrowable)
  {
    if (paramThrowable == null)
      paramThrowable = "";
    while (true)
    {
      return paramThrowable;
      ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
      PrintStream localPrintStream = new PrintStream(localByteArrayOutputStream);
      try
      {
        while (true)
        {
          Throwable localThrowable = paramThrowable.getCause();
          if (localThrowable == null)
            break;
          paramThrowable = localThrowable;
        }
        paramThrowable.printStackTrace(localPrintStream);
        paramThrowable = amD(localByteArrayOutputStream.toString());
        SharePatchFileUtil.ah(localPrintStream);
      }
      finally
      {
        SharePatchFileUtil.ah(localPrintStream);
      }
    }
    throw paramThrowable;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.tinker.loader.shareutil.ShareTinkerInternals
 * JD-Core Version:    0.6.2
 */