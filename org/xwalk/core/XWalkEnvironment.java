package org.xwalk.core;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Process;
import android.telephony.TelephonyManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.xweb.WebView.d;
import com.tencent.xweb.c.k;
import com.tencent.xweb.c.k.a;
import com.tencent.xweb.m;
import com.tencent.xweb.util.b;
import com.tencent.xweb.util.f;
import java.io.Closeable;
import java.io.File;
import java.lang.reflect.Method;
import java.security.MessageDigest;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class XWalkEnvironment
{
  private static final String APK_DIR = "apk";
  public static final String DOWNLOAD_CONFIG_URL = "https://dldir1.qq.com/weixin/android/wxweb/updateConfig.xml";
  public static final String DOWNLOAD_PLUGIN_UPDATE_CONFIG_URL = "http://dldir1.qq.com/weixin/android/wxweb/plugin/pluginUpdateConfig.xml";
  public static final String DOWNLOAD_PLUGIN_UPDATE_TEST_CONFIG_DEFAULT_URL = "http://dldir1.qq.com/weixin/android/wxweb/plugin/pluginUpdateConfig_test.xml";
  public static final String DOWNLOAD_X86_CONFIG_URL = "https://dldir1.qq.com/weixin/android/wxweb/updateConfig_x86.xml";
  public static final int LOCAL_TEST_VERSION = 100000;
  public static final String LOCAL_TEST_ZIP_NAME = "runtime_package.zip";
  public static final String[] MANDATORY_RESOURCES;
  private static final String META_XWALK_DOWNCONFIG_URL = "xwalk_downconfig_url";
  public static final String MM_PACKAGE_NAME = "com.tencent.mm";
  private static final String OPTIMIZED_DEX_DIR = "dex";
  private static final String PACKAGE_RE = "[a-z]+\\.[a-z0-9]+\\.[a-z0-9]+.*";
  private static final String PATCH_ZIP_TEMP_DECOMPRESS_DIR = "patch_temp_decompress";
  public static final int SDK_SUPPORT_INVOKE_NOTIFY_MIN_APKVERSION = 153;
  public static final int SDK_SUPPORT_INVOKE_RUNTIME_MIN_APKVERSION = 255;
  public static final int SDK_SUPPORT_MIN_APKVERSION = 49;
  public static final int SDK_VERSION = 190301;
  private static final int SPECIAL_TEST_USER_ID = 10001;
  private static final String SP_KEY_DEVICE_RD = "sNDeviceRd";
  private static final String SP_KEY_FILE_READER_RECORD = "xwalk_reader_record";
  private static final String SP_KEY_GRAY_VALUE = "GRAY_VALUE";
  private static final String SP_KEY_GRAY_VALUE_TEST = "TEST_GRAY_VALUE";
  private static final String SP_KEY_IP_TYPE = "IP_TYPE";
  public static final String SP_KEY_PLUGIN_AVAILABLE_VERSION = "availableVersion";
  private static final String SP_KEY_PLUGIN_TEST_CONFIG_URL = "XWEB_PLUGIN_TEST_CONFIG_URL";
  public static final String SP_KEY_PLUGIN_UPDATE_CONFIG_LAST_FETCH_TIME = "nLastFetchPluginConfigTime";
  public static final String SP_KEY_PLUGIN_UPDATE_PROCESS_ID = "nUpdatingProcessId";
  private static final String SP_NAME_PLUGIN_UPDATE_INFO = "xwalk_plugin_update_info";
  private static final String SP_NAME_PLUGIN_VERSION_INFO_PREFIX = "xwalk_plugin_version_info_";
  private static final String SP_NAME_VERSION_INFO = "XWALKINFOS";
  private static final String TAG = "XWalkEnvironment";
  public static final int TEST_APK_START_VERSION = 100000;
  public static String UPDATEINFOTAG;
  public static final String XWALK_CORE_APK_NAME = "base.apk";
  public static final String XWALK_CORE_CLASSES_DEX = "classes.dex";
  private static final String XWALK_CORE_EXTRACTED_DIR = "extracted_xwalkcore";
  public static final String XWALK_CORE_FILELIST_CONFIG_NAME = "filelist.config";
  private static final String XWALK_CORE_NAME_PREFIX = "xwalk_";
  private static final String XWALK_CORE_PATCH_CONFIG_NAME = "patch.config";
  private static final String XWALK_CORE_PATCH_NAME = "patch.zip";
  public static final String[] XWALK_CORE_PROVIDER_LIST;
  private static final String XWALK_CORE_RES_FILELIST_CONFIG_NAME = "reslist.config";
  private static final String XWALK_CORE_ZIP_NAME = "base.zip";
  public static final String XWALK_ENV_MAP_KEY_ISGPVERSION = "isgpversion";
  public static final String XWALK_ENV_MAP_KEY_PROCESSNAME = "processname";
  public static final int XWALK_GET_FROM_PROVIDER_MAX_COUNT = 2;
  private static final String XWALK_PLUGIN_BASE_DIR = "xwalkplugin";
  public static final String XWALK_PLUGIN_NAME_FILE_READER = "FileReader";
  public static final String XWALK_PLUGIN_NAME_FULL_SCREEN_VIDEO = "FullScreenVideo";
  private static final String XWALK_PLUGIN_UPDATE_CONFIG_NAME = "pluginUpdateConfig.xml";
  private static final String XWALK_UPDATE_CONFIG_DIR = "xwalkconfig";
  private static final String ZIP_DIR = "zip";
  private static Context sApplicationContext;
  private static String sApplicationName;
  private static int sAvailableVersion;
  static boolean sBHasInitedSafePsProvider;
  static boolean sBIsIpTypeChanged;
  private static String sDeviceAbi;
  private static Boolean sIsDownloadMode;
  private static Boolean sIsDownloadModeUpdate;
  private static boolean sIsForbidDownloadCode;
  private static boolean sIsPluginInited;
  private static Boolean sIsXWalkVerify;
  static Method sMMKVMethod;
  static int sNChromiuVersion;
  static int sNDeviceRd;
  static int sPid;
  private static String sRuntimeAbi;
  static com.tencent.xweb.e sSPProvider;
  static String sStrCurentProcessName;
  static String sStrDeviceId;
  private static String sStrTempUpdateConfigUrl;
  private static String sStrVersionDetail;
  private static boolean sUsingCustomContext;
  private static String sXWalkApkUrl;
  private static String sXWalkDownConfigUrl;
  static HashMap<String, Object> sXWebArgs;
  static int s_grayValue;

  static
  {
    AppMethodBeat.i(4296);
    UPDATEINFOTAG = "xwalk_update_info";
    XWALK_CORE_PROVIDER_LIST = new String[] { "com.tencent.mm" };
    sIsPluginInited = false;
    sIsForbidDownloadCode = false;
    sIsDownloadMode = Boolean.TRUE;
    sIsDownloadModeUpdate = Boolean.TRUE;
    sAvailableVersion = -1;
    sUsingCustomContext = false;
    sBHasInitedSafePsProvider = false;
    sSPProvider = null;
    sPid = Process.myPid();
    s_grayValue = 0;
    sNChromiuVersion = -1;
    sNDeviceRd = 0;
    sBIsIpTypeChanged = false;
    sStrDeviceId = null;
    MANDATORY_RESOURCES = new String[] { "classes.dex", "icudtl.dat", "xwalk.pak", "xwalk_100_percent.pak", "xweb_fullscreen_video.js" };
    AppMethodBeat.o(4296);
  }

  static int _getChromiunVersion()
  {
    AppMethodBeat.i(4252);
    Object localObject1 = getApplicationContext().getPackageManager();
    try
    {
      localObject1 = ((PackageManager)localObject1).getPackageInfo("com.google.android.webview", 0);
      if (localObject1 != null)
      {
        i = getVerFromVersionName(((PackageInfo)localObject1).versionName);
        if (i > 0)
        {
          AppMethodBeat.o(4252);
          return i;
        }
      }
    }
    catch (Exception localException1)
    {
      while (true)
      {
        int i;
        Log.e("XWalkEnvironment", "Android System WebView is not found");
        try
        {
          Object localObject2 = new android/webkit/WebView;
          ((WebView)localObject2).<init>(getApplicationContext());
          String str = ((WebView)localObject2).getSettings().getUserAgentString();
          if (str != null)
          {
            localObject2 = str.split("Chrome/");
            if ((localObject2 != null) && (localObject2.length != 0))
            {
              if (localObject2.length == 1)
              {
                int j = localObject2[0].length();
                i = str.length();
                if (j != i);
              }
            }
            else
            {
              AppMethodBeat.o(4252);
              i = 0;
              continue;
            }
            i = getVerFromVersionName(localObject2[1]);
            AppMethodBeat.o(4252);
          }
        }
        catch (Exception localException2)
        {
          Log.e("XWalkEnvironment", "Android System WebView is not found");
          AppMethodBeat.o(4252);
          i = 0;
        }
      }
    }
  }

  public static void addXWalkInitializeLog(String paramString)
  {
    AppMethodBeat.i(4230);
    if ((paramString == null) || (paramString.isEmpty()))
      AppMethodBeat.o(4230);
    while (true)
    {
      return;
      Log.i("XWalkUpdater", paramString);
      String str1 = new SimpleDateFormat("MM-dd hh:mm:ss").format(new Date());
      String str2 = sPid + ":" + str1 + " : " + paramString;
      SharedPreferences localSharedPreferences = getSharedPreferencesForLog();
      str1 = localSharedPreferences.getString("log", "");
      paramString = str1;
      if (str1.length() > 10240)
        paramString = str1.substring(0, 5120);
      paramString = str2 + "\n" + paramString;
      localSharedPreferences.edit().putString("log", paramString).apply();
      AppMethodBeat.o(4230);
    }
  }

  public static void addXWalkInitializeLog(String paramString1, String paramString2)
  {
    AppMethodBeat.i(4229);
    addXWalkInitializeLog(paramString1 + ": " + paramString2);
    AppMethodBeat.o(4229);
  }

  public static boolean checkApiVersionAllFileExist(int paramInt)
  {
    AppMethodBeat.i(4279);
    boolean bool;
    if ((checkApiVersionExtractResourceExist(paramInt)) && (checkApiVersionBaseApkExist(paramInt)))
    {
      bool = true;
      AppMethodBeat.o(4279);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(4279);
    }
  }

  // ERROR //
  public static boolean checkApiVersionAvailable(int paramInt)
  {
    // Byte code:
    //   0: sipush 4278
    //   3: invokestatic 188	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: iload_0
    //   7: invokestatic 406	org/xwalk/core/XWalkEnvironment:getExtractedCoreDir	(I)Ljava/lang/String;
    //   10: astore_1
    //   11: iload_0
    //   12: invokestatic 409	org/xwalk/core/XWalkEnvironment:getClassDexFilePath	(I)Ljava/lang/String;
    //   15: astore_2
    //   16: new 411	java/io/File
    //   19: astore_3
    //   20: aload_3
    //   21: aload_2
    //   22: invokespecial 412	java/io/File:<init>	(Ljava/lang/String;)V
    //   25: aload_3
    //   26: invokevirtual 415	java/io/File:exists	()Z
    //   29: istore 4
    //   31: iload 4
    //   33: ifne +15 -> 48
    //   36: sipush 4278
    //   39: invokestatic 248	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   42: iconst_0
    //   43: istore 4
    //   45: iload 4
    //   47: ireturn
    //   48: iload_0
    //   49: invokestatic 418	org/xwalk/core/XWalkEnvironment:getOptimizedDexDir	(I)Ljava/lang/String;
    //   52: astore 5
    //   54: invokestatic 424	java/lang/ClassLoader:getSystemClassLoader	()Ljava/lang/ClassLoader;
    //   57: astore 6
    //   59: new 426	dalvik/system/DexClassLoader
    //   62: astore_3
    //   63: aload_3
    //   64: aload_2
    //   65: aload 5
    //   67: aload_1
    //   68: aload 6
    //   70: invokespecial 429	dalvik/system/DexClassLoader:<init>	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/ClassLoader;)V
    //   73: aload_3
    //   74: ldc_w 431
    //   77: invokevirtual 435	dalvik/system/DexClassLoader:loadClass	(Ljava/lang/String;)Ljava/lang/Class;
    //   80: astore_3
    //   81: ldc_w 362
    //   84: astore_1
    //   85: new 437	org/xwalk/core/ReflectField
    //   88: astore_2
    //   89: aload_2
    //   90: aload_3
    //   91: ldc_w 439
    //   94: invokespecial 442	org/xwalk/core/ReflectField:<init>	(Ljava/lang/Class;Ljava/lang/String;)V
    //   97: aload_2
    //   98: invokevirtual 446	org/xwalk/core/ReflectField:get	()Ljava/lang/Object;
    //   101: checkcast 194	java/lang/String
    //   104: astore_2
    //   105: aload_2
    //   106: astore_1
    //   107: new 437	org/xwalk/core/ReflectField
    //   110: astore_2
    //   111: aload_2
    //   112: aload_3
    //   113: ldc_w 448
    //   116: invokespecial 442	org/xwalk/core/ReflectField:<init>	(Ljava/lang/Class;Ljava/lang/String;)V
    //   119: aload_2
    //   120: invokevirtual 446	org/xwalk/core/ReflectField:get	()Ljava/lang/Object;
    //   123: checkcast 450	java/lang/Integer
    //   126: invokevirtual 453	java/lang/Integer:intValue	()I
    //   129: istore 7
    //   131: new 437	org/xwalk/core/ReflectField
    //   134: astore_2
    //   135: aload_2
    //   136: aload_3
    //   137: ldc_w 455
    //   140: invokespecial 442	org/xwalk/core/ReflectField:<init>	(Ljava/lang/Class;Ljava/lang/String;)V
    //   143: aload_2
    //   144: invokevirtual 446	org/xwalk/core/ReflectField:get	()Ljava/lang/Object;
    //   147: checkcast 450	java/lang/Integer
    //   150: invokevirtual 453	java/lang/Integer:intValue	()I
    //   153: istore_0
    //   154: new 339	java/lang/StringBuilder
    //   157: astore_2
    //   158: aload_2
    //   159: ldc_w 457
    //   162: invokespecial 458	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   165: ldc 92
    //   167: aload_2
    //   168: aload_1
    //   169: invokevirtual 349	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   172: ldc_w 460
    //   175: invokevirtual 349	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   178: iload 7
    //   180: invokevirtual 344	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   183: ldc_w 462
    //   186: invokevirtual 349	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   189: iload_0
    //   190: invokevirtual 344	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   193: invokevirtual 354	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   196: invokestatic 465	org/xwalk/core/Log:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   199: iconst_1
    //   200: istore 4
    //   202: sipush 4278
    //   205: invokestatic 248	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   208: goto -163 -> 45
    //   211: astore_1
    //   212: sipush 4278
    //   215: invokestatic 248	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   218: iconst_0
    //   219: istore 4
    //   221: goto -176 -> 45
    //   224: astore_1
    //   225: sipush 4278
    //   228: invokestatic 248	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   231: iconst_0
    //   232: istore 4
    //   234: goto -189 -> 45
    //   237: astore_2
    //   238: goto -131 -> 107
    //
    // Exception table:
    //   from	to	target	type
    //   73	81	211	java/lang/Exception
    //   85	105	211	java/lang/Exception
    //   107	199	211	java/lang/Exception
    //   6	31	224	java/lang/Exception
    //   48	73	224	java/lang/Exception
    //   85	105	237	java/lang/RuntimeException
  }

  public static boolean checkApiVersionBaseApkExist(int paramInt)
  {
    AppMethodBeat.i(4280);
    boolean bool;
    if (new File(getDownloadApkPath(paramInt)).exists())
    {
      bool = true;
      AppMethodBeat.o(4280);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(4280);
    }
  }

  private static boolean checkApiVersionExtractResourceExist(int paramInt)
  {
    boolean bool = false;
    AppMethodBeat.i(4281);
    String[] arrayOfString = MANDATORY_RESOURCES;
    int i = arrayOfString.length;
    int j = 0;
    if (j < i)
    {
      String str = arrayOfString[j];
      if (!str.equals("xweb_fullscreen_video.js"))
      {
        File localFile = new File(getExtractedCoreDir(paramInt) + str);
        if (!localFile.exists())
        {
          Log.i("XWalkEnvironment", "XWalkEnvironment checkApiVersionExtractResourceExist not exist Version:" + paramInt + ", resource name:" + str + ", Path:" + localFile.getAbsolutePath());
          AppMethodBeat.o(4281);
        }
      }
    }
    while (true)
    {
      return bool;
      j++;
      break;
      bool = true;
      AppMethodBeat.o(4281);
    }
  }

  public static void clearAllVersion(Context paramContext)
  {
    AppMethodBeat.i(4228);
    if ((paramContext == null) || (paramContext.getApplicationInfo() == null) || (paramContext.getApplicationInfo().dataDir == null))
      AppMethodBeat.o(4228);
    while (true)
    {
      return;
      File[] arrayOfFile = new File(paramContext.getApplicationInfo().dataDir).listFiles();
      if (arrayOfFile == null)
      {
        AppMethodBeat.o(4228);
      }
      else
      {
        int i = arrayOfFile.length;
        for (int j = 0; j < i; j++)
        {
          paramContext = arrayOfFile[j];
          if ((paramContext.getName().startsWith("app_xwalk_")) && (paramContext.isDirectory()))
            b.avl(paramContext.getAbsolutePath());
        }
        setAvailableVersion(-1, "");
        AppMethodBeat.o(4228);
      }
    }
  }

  public static boolean delApiVersion(int paramInt)
  {
    AppMethodBeat.i(4282);
    boolean bool = b.avl(getVesionDir(paramInt));
    AppMethodBeat.o(4282);
    return bool;
  }

  public static Context getApplicationContext()
  {
    return sApplicationContext;
  }

  private static String getApplicationMetaData(String paramString)
  {
    AppMethodBeat.i(4277);
    try
    {
      paramString = sApplicationContext.getPackageManager().getApplicationInfo(sApplicationContext.getPackageName(), 128).metaData.get(paramString).toString();
      AppMethodBeat.o(4277);
      return paramString;
    }
    catch (NullPointerException paramString)
    {
      while (true)
      {
        paramString = null;
        AppMethodBeat.o(4277);
      }
    }
    catch (PackageManager.NameNotFoundException paramString)
    {
      label44: break label44;
    }
  }

  public static String getApplicationName()
  {
    AppMethodBeat.i(4261);
    if (sApplicationName == null);
    try
    {
      Object localObject = sApplicationContext.getPackageManager();
      sApplicationName = (String)((PackageManager)localObject).getApplicationLabel(((PackageManager)localObject).getApplicationInfo(sApplicationContext.getPackageName(), 0));
      label40: if ((sApplicationName == null) || (sApplicationName.isEmpty()) || (sApplicationName.matches("[a-z]+\\.[a-z0-9]+\\.[a-z0-9]+.*")))
        sApplicationName = "this application";
      Log.d("XWalkEnvironment", "Crosswalk application name: " + sApplicationName);
      localObject = sApplicationName;
      AppMethodBeat.o(4261);
      return localObject;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      break label40;
    }
  }

  public static int getAvailableVersion()
  {
    return sAvailableVersion;
  }

  public static String getAvailableVersionDetail()
  {
    return sStrVersionDetail;
  }

  public static int getChromiunVersion()
  {
    AppMethodBeat.i(4250);
    if (sNChromiuVersion < 0)
      sNChromiuVersion = _getChromiunVersion();
    int i = sNChromiuVersion;
    AppMethodBeat.o(4250);
    return i;
  }

  public static String getClassDexFilePath(int paramInt)
  {
    AppMethodBeat.i(4248);
    String str = getExtractedCoreDir(paramInt) + File.separator + "classes.dex";
    AppMethodBeat.o(4248);
    return str;
  }

  public static ContentResolver getContentResolver()
  {
    AppMethodBeat.i(4284);
    ContentResolver localContentResolver;
    if (sApplicationContext == null)
    {
      Log.e("XWalkEnvironment", "getContentResolver sApplicationContext is null");
      localContentResolver = null;
      AppMethodBeat.o(4284);
    }
    while (true)
    {
      return localContentResolver;
      localContentResolver = sApplicationContext.getContentResolver();
      AppMethodBeat.o(4284);
    }
  }

  // ERROR //
  public static String getDeviceAbi()
  {
    // Byte code:
    //   0: sipush 4276
    //   3: invokestatic 188	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: getstatic 579	org/xwalk/core/XWalkEnvironment:sDeviceAbi	Ljava/lang/String;
    //   9: ifnonnull +105 -> 114
    //   12: getstatic 584	android/os/Build$VERSION:SDK_INT	I
    //   15: bipush 21
    //   17: if_icmplt +14 -> 31
    //   20: getstatic 589	android/os/Build:SUPPORTED_ABIS	[Ljava/lang/String;
    //   23: iconst_0
    //   24: aaload
    //   25: invokevirtual 592	java/lang/String:toLowerCase	()Ljava/lang/String;
    //   28: putstatic 579	org/xwalk/core/XWalkEnvironment:sDeviceAbi	Ljava/lang/String;
    //   31: getstatic 579	org/xwalk/core/XWalkEnvironment:sDeviceAbi	Ljava/lang/String;
    //   34: ifnonnull +56 -> 90
    //   37: invokestatic 598	java/lang/Runtime:getRuntime	()Ljava/lang/Runtime;
    //   40: ldc_w 600
    //   43: invokevirtual 604	java/lang/Runtime:exec	(Ljava/lang/String;)Ljava/lang/Process;
    //   46: astore_0
    //   47: new 606	java/io/InputStreamReader
    //   50: astore_1
    //   51: aload_1
    //   52: aload_0
    //   53: invokevirtual 612	java/lang/Process:getInputStream	()Ljava/io/InputStream;
    //   56: invokespecial 615	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   59: new 617	java/io/BufferedReader
    //   62: astore_0
    //   63: aload_0
    //   64: aload_1
    //   65: invokespecial 620	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   68: aload_0
    //   69: astore_2
    //   70: aload_1
    //   71: astore_3
    //   72: aload_0
    //   73: invokevirtual 623	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   76: invokevirtual 592	java/lang/String:toLowerCase	()Ljava/lang/String;
    //   79: putstatic 579	org/xwalk/core/XWalkEnvironment:sDeviceAbi	Ljava/lang/String;
    //   82: aload_1
    //   83: invokestatic 627	org/xwalk/core/XWalkEnvironment:tryClose	(Ljava/io/Closeable;)V
    //   86: aload_0
    //   87: invokestatic 627	org/xwalk/core/XWalkEnvironment:tryClose	(Ljava/io/Closeable;)V
    //   90: ldc 92
    //   92: new 339	java/lang/StringBuilder
    //   95: dup
    //   96: ldc_w 629
    //   99: invokespecial 458	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   102: getstatic 579	org/xwalk/core/XWalkEnvironment:sDeviceAbi	Ljava/lang/String;
    //   105: invokevirtual 349	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   108: invokevirtual 354	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   111: invokestatic 465	org/xwalk/core/Log:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   114: getstatic 579	org/xwalk/core/XWalkEnvironment:sDeviceAbi	Ljava/lang/String;
    //   117: ifnonnull +154 -> 271
    //   120: ldc_w 362
    //   123: astore_0
    //   124: sipush 4276
    //   127: invokestatic 248	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   130: aload_0
    //   131: areturn
    //   132: astore_0
    //   133: ldc 92
    //   135: new 339	java/lang/StringBuilder
    //   138: dup
    //   139: ldc_w 631
    //   142: invokespecial 458	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   145: aload_0
    //   146: invokevirtual 634	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   149: invokevirtual 349	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   152: invokevirtual 354	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   155: invokestatic 290	org/xwalk/core/Log:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   158: goto -127 -> 31
    //   161: astore_0
    //   162: ldc 92
    //   164: new 339	java/lang/StringBuilder
    //   167: dup
    //   168: ldc_w 636
    //   171: invokespecial 458	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   174: aload_0
    //   175: invokevirtual 637	java/lang/NoSuchFieldError:getMessage	()Ljava/lang/String;
    //   178: invokevirtual 349	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   181: invokevirtual 354	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   184: invokestatic 290	org/xwalk/core/Log:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   187: goto -156 -> 31
    //   190: astore 4
    //   192: aconst_null
    //   193: astore_0
    //   194: aconst_null
    //   195: astore_1
    //   196: aload_0
    //   197: astore_2
    //   198: aload_1
    //   199: astore_3
    //   200: new 339	java/lang/StringBuilder
    //   203: astore 5
    //   205: aload_0
    //   206: astore_2
    //   207: aload_1
    //   208: astore_3
    //   209: aload 5
    //   211: ldc_w 629
    //   214: invokespecial 458	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   217: aload_0
    //   218: astore_2
    //   219: aload_1
    //   220: astore_3
    //   221: ldc 92
    //   223: aload 5
    //   225: aload 4
    //   227: invokevirtual 634	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   230: invokevirtual 349	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   233: invokevirtual 354	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   236: invokestatic 290	org/xwalk/core/Log:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   239: aload_1
    //   240: invokestatic 627	org/xwalk/core/XWalkEnvironment:tryClose	(Ljava/io/Closeable;)V
    //   243: aload_0
    //   244: invokestatic 627	org/xwalk/core/XWalkEnvironment:tryClose	(Ljava/io/Closeable;)V
    //   247: goto -157 -> 90
    //   250: astore_0
    //   251: aconst_null
    //   252: astore_2
    //   253: aconst_null
    //   254: astore_1
    //   255: aload_1
    //   256: invokestatic 627	org/xwalk/core/XWalkEnvironment:tryClose	(Ljava/io/Closeable;)V
    //   259: aload_2
    //   260: invokestatic 627	org/xwalk/core/XWalkEnvironment:tryClose	(Ljava/io/Closeable;)V
    //   263: sipush 4276
    //   266: invokestatic 248	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   269: aload_0
    //   270: athrow
    //   271: getstatic 579	org/xwalk/core/XWalkEnvironment:sDeviceAbi	Ljava/lang/String;
    //   274: astore_0
    //   275: sipush 4276
    //   278: invokestatic 248	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   281: goto -151 -> 130
    //   284: astore_0
    //   285: aconst_null
    //   286: astore_2
    //   287: goto -32 -> 255
    //   290: astore_0
    //   291: aload_3
    //   292: astore_1
    //   293: goto -38 -> 255
    //   296: astore 4
    //   298: aconst_null
    //   299: astore_0
    //   300: goto -104 -> 196
    //   303: astore 4
    //   305: goto -109 -> 196
    //
    // Exception table:
    //   from	to	target	type
    //   12	31	132	java/lang/Exception
    //   12	31	161	java/lang/NoSuchFieldError
    //   37	59	190	java/lang/Exception
    //   37	59	250	finally
    //   59	68	284	finally
    //   72	82	290	finally
    //   200	205	290	finally
    //   209	217	290	finally
    //   221	239	290	finally
    //   59	68	296	java/lang/Exception
    //   72	82	303	java/lang/Exception
  }

  public static String getDeviceId()
  {
    AppMethodBeat.i(4274);
    if (sStrDeviceId == null);
    try
    {
      Object localObject = (TelephonyManager)getApplicationContext().getSystemService("phone");
      if (localObject == null);
      for (sStrDeviceId = ""; ; sStrDeviceId = ((TelephonyManager)localObject).getDeviceId())
      {
        localObject = sStrDeviceId;
        AppMethodBeat.o(4274);
        return localObject;
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        sStrDeviceId = "";
        Log.e("XWalkEnvironment", "getDeviceId failed " + localException.getMessage());
      }
    }
  }

  public static int getDeviceRd()
  {
    AppMethodBeat.i(4268);
    if (sNDeviceRd <= 0)
    {
      i = getSharedPreferences().getInt("sNDeviceRd", -1);
      sNDeviceRd = i;
      if (i <= 0)
      {
        sNDeviceRd = new Random().nextInt(10000000) + 1;
        getSharedPreferences().edit().putInt("sNDeviceRd", sNDeviceRd).apply();
      }
    }
    int i = sNDeviceRd;
    AppMethodBeat.o(4268);
    return i % 10000 + 1;
  }

  public static String getDownloadApkDir(int paramInt)
  {
    AppMethodBeat.i(4245);
    String str = getVesionDir(paramInt) + File.separator + "apk";
    File localFile = new File(str);
    if (!localFile.exists())
      localFile.mkdirs();
    AppMethodBeat.o(4245);
    return str;
  }

  public static String getDownloadApkPath(int paramInt)
  {
    AppMethodBeat.i(4246);
    String str = getVesionDir(paramInt) + File.separator + "apk";
    File localFile = new File(str);
    if (!localFile.exists())
      localFile.mkdirs();
    str = str + File.separator + "base.apk";
    AppMethodBeat.o(4246);
    return str;
  }

  public static String getDownloadApkPath(Context paramContext, int paramInt)
  {
    AppMethodBeat.i(4290);
    if (paramContext == null)
    {
      Log.e("XWalkEnvironment", "getDownloadApkPath with context, context is null");
      paramContext = "";
      AppMethodBeat.o(4290);
    }
    while (true)
    {
      return paramContext;
      paramContext = getVesionDir(paramContext, paramInt);
      if (paramContext.isEmpty())
      {
        Log.e("XWalkEnvironment", "getDownloadApkPath with context, versionDir is empty");
        paramContext = "";
        AppMethodBeat.o(4290);
      }
      else
      {
        paramContext = paramContext + File.separator + "apk" + File.separator + "base.apk";
        AppMethodBeat.o(4290);
      }
    }
  }

  public static String getDownloadPatchPath(int paramInt)
  {
    AppMethodBeat.i(4247);
    String str = getVesionDir(paramInt) + File.separator + "apk";
    File localFile = new File(str);
    if (!localFile.exists())
      localFile.mkdirs();
    str = str + File.separator + "patch.zip";
    AppMethodBeat.o(4247);
    return str;
  }

  public static String getDownloadResFileListConfig(int paramInt)
  {
    AppMethodBeat.i(4242);
    String str = getExtractedCoreFile(paramInt, "reslist.config");
    AppMethodBeat.o(4242);
    return str;
  }

  public static String getDownloadZipDir(int paramInt)
  {
    AppMethodBeat.i(4238);
    String str = getVesionDir(paramInt) + File.separator + "zip";
    File localFile = new File(str);
    if (!localFile.exists())
      localFile.mkdirs();
    str = str + File.separator + "base.zip";
    AppMethodBeat.o(4238);
    return str;
  }

  public static String getDownloadZipFileListConfig(int paramInt)
  {
    AppMethodBeat.i(4241);
    String str = getExtractedCoreFile(paramInt, "filelist.config");
    AppMethodBeat.o(4241);
    return str;
  }

  public static String getDownloadZipFileListConfig(Context paramContext, int paramInt)
  {
    AppMethodBeat.i(4293);
    paramContext = getExtractedCoreFile(paramContext, paramInt, "filelist.config");
    AppMethodBeat.o(4293);
    return paramContext;
  }

  public static String getExtractedCoreDir(int paramInt)
  {
    AppMethodBeat.i(4235);
    String str = getVesionDir(paramInt) + File.separator + "extracted_xwalkcore";
    File localFile = new File(str);
    if (!localFile.exists())
      localFile.mkdirs();
    AppMethodBeat.o(4235);
    return str;
  }

  public static String getExtractedCoreFile(int paramInt, String paramString)
  {
    AppMethodBeat.i(4236);
    String str = getVesionDir(paramInt) + File.separator + "extracted_xwalkcore";
    File localFile = new File(str);
    if (!localFile.exists())
      localFile.mkdirs();
    paramString = str + File.separator + paramString;
    AppMethodBeat.o(4236);
    return paramString;
  }

  public static String getExtractedCoreFile(Context paramContext, int paramInt, String paramString)
  {
    AppMethodBeat.i(4291);
    if (paramContext == null)
    {
      Log.e("XWalkEnvironment", "getExtractedCoreFile with context, context is null");
      paramContext = "";
      AppMethodBeat.o(4291);
    }
    while (true)
    {
      return paramContext;
      paramContext = getVesionDir(paramContext, paramInt);
      if (paramContext.isEmpty())
      {
        Log.e("XWalkEnvironment", "getExtractedCoreFile with context, versionDir is empty");
        paramContext = "";
        AppMethodBeat.o(4291);
      }
      else
      {
        paramContext = paramContext + File.separator + "extracted_xwalkcore" + File.separator + paramString;
        AppMethodBeat.o(4291);
      }
    }
  }

  private static boolean getFeatureSupport(int paramInt)
  {
    AppMethodBeat.i(4222);
    boolean bool = ((Boolean)k.f(WebView.d.ANb).excute("STR_CMD_FEATURE_SUPPORT", new Object[] { Integer.valueOf(paramInt) })).booleanValue();
    AppMethodBeat.o(4222);
    return bool;
  }

  public static int getGrayValue()
  {
    AppMethodBeat.i(4231);
    int i;
    if (s_grayValue != 0)
    {
      i = s_grayValue;
      AppMethodBeat.o(4231);
    }
    while (true)
    {
      return i;
      try
      {
        i = getSharedPreferences().getInt("TEST_GRAY_VALUE", -1);
        s_grayValue = i;
        if (i <= 0)
          s_grayValue = getSharedPreferences().getInt("GRAY_VALUE", -1);
        if (s_grayValue <= 0)
          s_grayValue = getDeviceRd();
        i = s_grayValue;
        AppMethodBeat.o(4231);
      }
      catch (Exception localException)
      {
        while (true)
          Log.e("XWalkEnvironment", "match gray rate exception: " + localException.getMessage());
      }
    }
  }

  public static int getInstalledNewstVersion()
  {
    AppMethodBeat.i(4224);
    int i = getSharedPreferencesForVersionInfo().getInt("availableVersion", -1);
    AppMethodBeat.o(4224);
    return i;
  }

  public static int getInstalledNewstVersion(Context paramContext)
  {
    AppMethodBeat.i(4225);
    int i;
    if (paramContext == null)
    {
      i = 0;
      AppMethodBeat.o(4225);
    }
    while (true)
    {
      return i;
      i = paramContext.getSharedPreferences("XWALKINFOS", 4).getInt("availableVersion", -1);
      AppMethodBeat.o(4225);
    }
  }

  public static int getIpType()
  {
    AppMethodBeat.i(4271);
    int i = getSharedPreferences().getInt("IP_TYPE", -2);
    AppMethodBeat.o(4271);
    return i;
  }

  public static SharedPreferences getMMKVSharedPreferences(String paramString)
  {
    AppMethodBeat.i(4206);
    paramString = getMMKVSharedPreferencesEx(paramString, 4, false);
    AppMethodBeat.o(4206);
    return paramString;
  }

  public static SharedPreferences getMMKVSharedPreferencesEx(String paramString, int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(4208);
    if (sSPProvider != null);
    while (true)
    {
      Object localObject2;
      try
      {
        Object localObject1 = sSPProvider;
        getApplicationContext();
        localObject1 = ((com.tencent.xweb.e)localObject1).x(paramString, paramInt, paramBoolean);
        if (localObject1 != null)
        {
          AppMethodBeat.o(4208);
          paramString = (String)localObject1;
          return paramString;
        }
      }
      catch (Exception localException1)
      {
        Log.e("XWalkEnvironment", "got sp from mmkv callback failed " + localException1.getMessage());
        localObject2 = null;
        continue;
        f.nI(176L);
      }
      while (true)
      {
        initSafePsProvider();
        if (sMMKVMethod != null)
          break label117;
        paramString = sApplicationContext.getSharedPreferences(paramString, paramInt);
        AppMethodBeat.o(4208);
        break;
        f.nI(177L);
      }
      try
      {
        label117: localObject2 = sMMKVMethod.invoke(null, new Object[] { getApplicationContext(), paramString, Integer.valueOf(paramInt), Boolean.valueOf(paramBoolean) });
        if ((localObject2 == null) || (!(localObject2 instanceof SharedPreferences)))
        {
          Log.e("XWalkEnvironment", "get mmmkv from reflection failed");
          label172: f.nI(179L);
          paramString = sApplicationContext.getSharedPreferences(paramString, paramInt);
          AppMethodBeat.o(4208);
          continue;
        }
        localObject2 = (SharedPreferences)localObject2;
        AppMethodBeat.o(4208);
        paramString = (String)localObject2;
      }
      catch (Exception localException2)
      {
        break label172;
      }
    }
  }

  public static SharedPreferences getMMKVSharedTransportOld(String paramString)
  {
    AppMethodBeat.i(4207);
    paramString = getMMKVSharedPreferencesEx(paramString, 4, true);
    AppMethodBeat.o(4207);
    return paramString;
  }

  public static String getOptimizedDexDir(int paramInt)
  {
    AppMethodBeat.i(4237);
    String str = getVesionDir(paramInt) + File.separator + "dex";
    File localFile = new File(str);
    if (!localFile.exists())
      localFile.mkdirs();
    AppMethodBeat.o(4237);
    return str;
  }

  public static Context getPackageContext(String paramString)
  {
    Object localObject1 = null;
    Object localObject2 = null;
    AppMethodBeat.i(4285);
    if (sApplicationContext == null)
    {
      Log.e("XWalkEnvironment", "getTargetPackageContext sApplicationContext is null");
      AppMethodBeat.o(4285);
      paramString = localObject2;
    }
    while (true)
    {
      return paramString;
      try
      {
        paramString = sApplicationContext.createPackageContext(paramString, 2);
        AppMethodBeat.o(4285);
      }
      catch (Exception paramString)
      {
        while (true)
        {
          Log.e("XWalkEnvironment", paramString.getMessage());
          paramString = localObject1;
        }
      }
    }
  }

  public static String getPackageName()
  {
    AppMethodBeat.i(4288);
    String str;
    if (sApplicationContext == null)
    {
      Log.e("XWalkEnvironment", "getPackageName sApplicationContext is null");
      str = "";
      AppMethodBeat.o(4288);
    }
    while (true)
    {
      return str;
      str = sApplicationContext.getPackageName();
      AppMethodBeat.o(4288);
    }
  }

  public static String getPatchConfig(int paramInt)
  {
    AppMethodBeat.i(4244);
    String str = getPatchZipTempDecompressFilePath(paramInt, "patch.config");
    AppMethodBeat.o(4244);
    return str;
  }

  public static String getPatchFileListConfig(int paramInt)
  {
    AppMethodBeat.i(4243);
    String str = getPatchZipTempDecompressFilePath(paramInt, "filelist.config");
    AppMethodBeat.o(4243);
    return str;
  }

  public static String getPatchFileListConfig(Context paramContext, int paramInt)
  {
    AppMethodBeat.i(4294);
    paramContext = getPatchZipTempDecompressFilePath(paramContext, paramInt, "filelist.config");
    AppMethodBeat.o(4294);
    return paramContext;
  }

  public static String getPatchZipTempDecompressFilePath(int paramInt, String paramString)
  {
    AppMethodBeat.i(4240);
    String str = getVesionDir(paramInt) + File.separator + "patch_temp_decompress";
    File localFile = new File(str);
    if (!localFile.exists())
      localFile.mkdirs();
    paramString = str + File.separator + paramString;
    AppMethodBeat.o(4240);
    return paramString;
  }

  public static String getPatchZipTempDecompressFilePath(Context paramContext, int paramInt, String paramString)
  {
    AppMethodBeat.i(4292);
    if (paramContext == null)
    {
      Log.e("XWalkEnvironment", "getPatchZipTempDecompressFilePath with context, context is null");
      paramContext = "";
      AppMethodBeat.o(4292);
    }
    while (true)
    {
      return paramContext;
      paramContext = getVesionDir(paramContext, paramInt);
      if (paramContext.isEmpty())
      {
        Log.e("XWalkEnvironment", "getPatchZipTempDecompressFilePath with context, versionDir is empty");
        paramContext = "";
        AppMethodBeat.o(4292);
      }
      else
      {
        paramContext = paramContext + File.separator + "patch_temp_decompress" + File.separator + paramString;
        AppMethodBeat.o(4292);
      }
    }
  }

  public static String getPatchZipTempDecompressPath(int paramInt)
  {
    AppMethodBeat.i(4239);
    String str = getVesionDir(paramInt) + File.separator + "patch_temp_decompress";
    File localFile = new File(str);
    if (!localFile.exists())
      localFile.mkdirs();
    AppMethodBeat.o(4239);
    return str;
  }

  public static String getPluginBaseDir()
  {
    AppMethodBeat.i(4216);
    String str;
    if (sApplicationContext == null)
    {
      str = "";
      AppMethodBeat.o(4216);
    }
    while (true)
    {
      return str;
      str = sApplicationContext.getDir("xwalkplugin", 0).getAbsolutePath();
      AppMethodBeat.o(4216);
    }
  }

  public static String getPluginConfigUrl()
  {
    AppMethodBeat.i(4258);
    Object localObject = getSharedPreferencesForTestXWeb();
    if (localObject == null)
    {
      Log.e("XWalkEnvironment", "getPluginConfigUrl sp is null, use default");
      localObject = "http://dldir1.qq.com/weixin/android/wxweb/plugin/pluginUpdateConfig.xml";
      AppMethodBeat.o(4258);
    }
    while (true)
    {
      return localObject;
      localObject = ((SharedPreferences)localObject).getString("XWEB_PLUGIN_TEST_CONFIG_URL", "");
      if (!((String)localObject).trim().isEmpty())
      {
        addXWalkInitializeLog("plugin use test config url");
        Log.i("XWalkEnvironment", "plugin use test config url: ".concat(String.valueOf(localObject)));
        AppMethodBeat.o(4258);
      }
      else
      {
        addXWalkInitializeLog("plugin use release config url");
        Log.i("XWalkEnvironment", "plugin use release config url: http://dldir1.qq.com/weixin/android/wxweb/plugin/pluginUpdateConfig.xml");
        localObject = "http://dldir1.qq.com/weixin/android/wxweb/plugin/pluginUpdateConfig.xml";
        AppMethodBeat.o(4258);
      }
    }
  }

  public static String getPluginUpdateConfigFilePath()
  {
    AppMethodBeat.i(4215);
    String str;
    if (sApplicationContext == null)
    {
      str = "";
      AppMethodBeat.o(4215);
    }
    while (true)
    {
      return str;
      str = getUpdateConfigDir() + File.separator + "pluginUpdateConfig.xml";
      AppMethodBeat.o(4215);
    }
  }

  public static String getProcessName()
  {
    AppMethodBeat.i(4283);
    Object localObject;
    if (sStrCurentProcessName != null)
    {
      localObject = sStrCurentProcessName;
      AppMethodBeat.o(4283);
    }
    while (true)
    {
      return localObject;
      localObject = getXWebInitArgs("processname");
      if (localObject != null)
      {
        localObject = localObject.toString();
        sStrCurentProcessName = (String)localObject;
        AppMethodBeat.o(4283);
      }
      else
      {
        localObject = getApplicationContext();
        int i = Process.myPid();
        if (localObject == null)
        {
          localObject = null;
          AppMethodBeat.o(4283);
        }
        else
        {
          localObject = (ActivityManager)((Context)localObject).getSystemService("activity");
          if (localObject != null)
          {
            localObject = ((ActivityManager)localObject).getRunningAppProcesses();
            if ((localObject != null) && (!((List)localObject).isEmpty()))
            {
              localObject = ((List)localObject).iterator();
              while (((Iterator)localObject).hasNext())
              {
                ActivityManager.RunningAppProcessInfo localRunningAppProcessInfo = (ActivityManager.RunningAppProcessInfo)((Iterator)localObject).next();
                if (localRunningAppProcessInfo.pid == i)
                  sStrCurentProcessName = localRunningAppProcessInfo.processName;
              }
            }
          }
          localObject = sStrCurentProcessName;
          AppMethodBeat.o(4283);
        }
      }
    }
  }

  public static SharedPreferences getProcessSafePreferences(String paramString, int paramInt)
  {
    AppMethodBeat.i(4205);
    paramString = sApplicationContext.getSharedPreferences(paramString, paramInt);
    AppMethodBeat.o(4205);
    return paramString;
  }

  public static String getRuntimeAbi()
  {
    int i = 0;
    AppMethodBeat.i(4267);
    Object localObject;
    int j;
    if (sRuntimeAbi == null)
    {
      try
      {
        if (Build.VERSION.SDK_INT < 21)
          break label250;
        NoSuchFieldError localNoSuchFieldError1 = new java/lang/NoSuchFieldError;
        localNoSuchFieldError1.<init>();
        AppMethodBeat.o(4267);
        throw localNoSuchFieldError1;
      }
      catch (NoSuchFieldError localNoSuchFieldError2)
      {
        localObject = System.getProperty("os.arch").toLowerCase();
        switch (((String)localObject).hashCode())
        {
        default:
        case 117110:
        case 3181739:
        case 3178856:
        case 3222903:
        case 117046:
        case -806050265:
        case -1409295825:
        case -738963905:
        case 145444210:
        case -1221096139:
        case 93086174:
        case 93084186:
        }
      }
      j = -1;
      switch (j)
      {
      default:
        label162: localObject = new RuntimeException("Unexpected os.arch: ".concat(String.valueOf(localObject)));
        AppMethodBeat.o(4267);
        throw ((Throwable)localObject);
        label250: localObject = Build.CPU_ABI.toLowerCase();
        switch (((String)localObject).hashCode())
        {
        default:
          label312: j = -1;
        case -738963905:
        case 145444210:
        case 1431565292:
        case 117110:
        case -806050265:
        }
        while (true)
          switch (j)
          {
          default:
            RuntimeException localRuntimeException = new java/lang/RuntimeException;
            localRuntimeException.<init>("Unexpected CPU_ABI: ".concat(String.valueOf(localObject)));
            AppMethodBeat.o(4267);
            throw localRuntimeException;
            if (!((String)localObject).equals("armeabi"))
              break label312;
            j = 0;
            continue;
            if (!((String)localObject).equals("armeabi-v7a"))
              break label312;
            j = 1;
            continue;
            if (!((String)localObject).equals("arm64-v8a"))
              break label312;
            j = 2;
            continue;
            if (!((String)localObject).equals("x86"))
              break label312;
            j = 3;
            continue;
            if (!((String)localObject).equals("x86_64"))
              break label312;
            j = 4;
          case 0:
          case 1:
          case 2:
          case 3:
          case 4:
          }
        sRuntimeAbi = "armeabi-v7a";
        label455: if (sRuntimeAbi.equals("armeabi-v7a"))
          if (!isIaDevice())
            break;
        break;
      case 0:
      case 1:
      case 2:
      case 3:
      case 4:
      case 5:
      case 6:
      case 7:
      case 8:
      case 9:
      case 10:
      case 11:
      }
    }
    for (sRuntimeAbi = "x86"; ; sRuntimeAbi = "x86_64")
      do
      {
        Log.d("XWalkEnvironment", "Runtime ABI: " + sRuntimeAbi);
        localObject = sRuntimeAbi;
        AppMethodBeat.o(4267);
        return localObject;
        sRuntimeAbi = "arm64-v8a";
        break label455;
        sRuntimeAbi = "x86";
        break label455;
        sRuntimeAbi = "x86_64";
        break label455;
        if (!((String)localObject).equals("x86"))
          break;
        j = i;
        break label162;
        if (!((String)localObject).equals("i686"))
          break;
        j = 1;
        break label162;
        if (!((String)localObject).equals("i386"))
          break;
        j = 2;
        break label162;
        if (!((String)localObject).equals("ia32"))
          break;
        j = 3;
        break label162;
        if (!((String)localObject).equals("x64"))
          break;
        j = 4;
        break label162;
        if (!((String)localObject).equals("x86_64"))
          break;
        j = 5;
        break label162;
        if (!((String)localObject).equals("armv7l"))
          break;
        j = 6;
        break label162;
        if (!((String)localObject).equals("armeabi"))
          break;
        j = 7;
        break label162;
        if (!((String)localObject).equals("armeabi-v7a"))
          break;
        j = 8;
        break label162;
        if (!((String)localObject).equals("aarch64"))
          break;
        j = 9;
        break label162;
        if (!((String)localObject).equals("armv8"))
          break;
        j = 10;
        break label162;
        if (!((String)localObject).equals("arm64"))
          break;
        j = 11;
        break label162;
        sRuntimeAbi = "x86";
        break label455;
        if (is64bitDevice())
        {
          sRuntimeAbi = "x86_64";
          break label455;
        }
        sRuntimeAbi = "x86";
        break label455;
        sRuntimeAbi = "armeabi-v7a";
        break label455;
        if (is64bitDevice())
        {
          sRuntimeAbi = "arm64-v8a";
          break label455;
        }
        sRuntimeAbi = "armeabi-v7a";
        break label455;
      }
      while ((!sRuntimeAbi.equals("arm64-v8a")) || (!isIaDevice()));
  }

  public static SharedPreferences getSharedPreferences()
  {
    AppMethodBeat.i(4217);
    SharedPreferences localSharedPreferences = sApplicationContext.getSharedPreferences("libxwalkcore", 4);
    AppMethodBeat.o(4217);
    return localSharedPreferences;
  }

  public static SharedPreferences getSharedPreferencesForFileReaderRecord()
  {
    AppMethodBeat.i(4214);
    SharedPreferences localSharedPreferences;
    if (sApplicationContext == null)
    {
      localSharedPreferences = null;
      AppMethodBeat.o(4214);
    }
    while (true)
    {
      return localSharedPreferences;
      localSharedPreferences = getProcessSafePreferences("xwalk_reader_record", 4);
      AppMethodBeat.o(4214);
    }
  }

  public static SharedPreferences getSharedPreferencesForLog()
  {
    AppMethodBeat.i(4211);
    SharedPreferences localSharedPreferences;
    if (sApplicationContext == null)
    {
      localSharedPreferences = null;
      AppMethodBeat.o(4211);
    }
    while (true)
    {
      return localSharedPreferences;
      localSharedPreferences = getMMKVSharedPreferencesEx("UPDATELOG", 4, true);
      AppMethodBeat.o(4211);
    }
  }

  public static SharedPreferences getSharedPreferencesForPluginUpdateInfo()
  {
    AppMethodBeat.i(4212);
    SharedPreferences localSharedPreferences;
    if (sApplicationContext == null)
    {
      localSharedPreferences = null;
      AppMethodBeat.o(4212);
    }
    while (true)
    {
      return localSharedPreferences;
      localSharedPreferences = getProcessSafePreferences("xwalk_plugin_update_info", 4);
      AppMethodBeat.o(4212);
    }
  }

  public static SharedPreferences getSharedPreferencesForPluginVersionInfo(String paramString)
  {
    AppMethodBeat.i(4213);
    if (sApplicationContext == null)
    {
      paramString = null;
      AppMethodBeat.o(4213);
    }
    while (true)
    {
      return paramString;
      paramString = getProcessSafePreferences("xwalk_plugin_version_info_".concat(String.valueOf(paramString)), 4);
      AppMethodBeat.o(4213);
    }
  }

  public static SharedPreferences getSharedPreferencesForTestXWeb()
  {
    AppMethodBeat.i(4257);
    SharedPreferences localSharedPreferences;
    if (sApplicationContext == null)
    {
      Log.e("XWalkEnvironment", "getSharedPreferencesForTestXWeb context is null");
      localSharedPreferences = null;
      AppMethodBeat.o(4257);
    }
    while (true)
    {
      return localSharedPreferences;
      localSharedPreferences = sApplicationContext.getSharedPreferences("TESTXWEB", 4);
      AppMethodBeat.o(4257);
    }
  }

  public static SharedPreferences getSharedPreferencesForUpdateConfig()
  {
    AppMethodBeat.i(4209);
    SharedPreferences localSharedPreferences = getProcessSafePreferences("UPDATEINFOTAG", 4);
    AppMethodBeat.o(4209);
    return localSharedPreferences;
  }

  public static SharedPreferences getSharedPreferencesForVersionInfo()
  {
    AppMethodBeat.i(4210);
    SharedPreferences localSharedPreferences = sApplicationContext.getSharedPreferences("XWALKINFOS", 4);
    AppMethodBeat.o(4210);
    return localSharedPreferences;
  }

  public static String getTempUpdateConfigUrl()
  {
    try
    {
      String str = sStrTempUpdateConfigUrl;
      return str;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public static String getTestDownLoadUrl(Context paramContext)
  {
    AppMethodBeat.i(4254);
    paramContext = paramContext.getSharedPreferences("TESTXWEB", 4).getString("XWEB_TEST_CONFIG_URL", "");
    AppMethodBeat.o(4254);
    return paramContext;
  }

  public static String getUpdateConfigDir()
  {
    AppMethodBeat.i(4233);
    String str = sApplicationContext.getDir("xwalkconfig", 0).getAbsolutePath();
    AppMethodBeat.o(4233);
    return str;
  }

  public static String getUpdateConfigFullPath()
  {
    AppMethodBeat.i(4234);
    String str = getUpdateConfigDir() + File.separator + "updateConfg.xml";
    AppMethodBeat.o(4234);
    return str;
  }

  public static int getUserType()
  {
    AppMethodBeat.i(4272);
    int i = getIpType();
    AppMethodBeat.o(4272);
    return i;
  }

  public static boolean getUsingCustomContext()
  {
    return sUsingCustomContext;
  }

  static int getVerFromVersionName(String paramString)
  {
    int i = 0;
    AppMethodBeat.i(4253);
    int j;
    if ((paramString == null) || (paramString.isEmpty()))
    {
      AppMethodBeat.o(4253);
      j = i;
    }
    while (true)
    {
      return j;
      String[] arrayOfString = paramString.split("\\.");
      try
      {
        j = Integer.parseInt(arrayOfString[0]);
        AppMethodBeat.o(4253);
      }
      catch (Exception localException)
      {
        Log.e("XWalkEnvironment", "parse to int error str is :".concat(String.valueOf(paramString)));
        AppMethodBeat.o(4253);
        j = i;
      }
    }
  }

  public static String getVesionDir(int paramInt)
  {
    AppMethodBeat.i(4227);
    String str = sApplicationContext.getDir("xwalk_".concat(String.valueOf(paramInt)), 0).getAbsolutePath();
    File localFile = new File(str);
    if (!localFile.exists())
      localFile.mkdirs();
    AppMethodBeat.o(4227);
    return str;
  }

  public static String getVesionDir(Context paramContext, int paramInt)
  {
    AppMethodBeat.i(4289);
    if (paramContext == null)
    {
      Log.e("XWalkEnvironment", "getVersionDir with context, context is null");
      paramContext = "";
      AppMethodBeat.o(4289);
    }
    while (true)
    {
      return paramContext;
      paramContext = paramContext.getDir("xwalk_".concat(String.valueOf(paramInt)), 0).getAbsolutePath();
      AppMethodBeat.o(4289);
    }
  }

  public static String getXWalkInitializeLog()
  {
    AppMethodBeat.i(4232);
    Object localObject = getSharedPreferencesForLog();
    if (localObject == null)
    {
      localObject = "";
      AppMethodBeat.o(4232);
    }
    while (true)
    {
      return localObject;
      localObject = ((SharedPreferences)localObject).getString("log", "");
      AppMethodBeat.o(4232);
    }
  }

  public static String getXWalkUpdateConfigUrl()
  {
    AppMethodBeat.i(4256);
    String str = getTestDownLoadUrl(getApplicationContext());
    sXWalkDownConfigUrl = str;
    if ((str != null) && (!sXWalkDownConfigUrl.trim().isEmpty()))
      addXWalkInitializeLog("use test config url : " + sXWalkDownConfigUrl);
    while (true)
    {
      Log.i("XWalkEnvironment", "use update config url = " + sXWalkDownConfigUrl);
      str = sXWalkDownConfigUrl;
      AppMethodBeat.o(4256);
      return str;
      str = getTempUpdateConfigUrl();
      sXWalkDownConfigUrl = str;
      if ((str != null) && (!sXWalkDownConfigUrl.trim().isEmpty()))
        addXWalkInitializeLog("use temp config url : " + sXWalkDownConfigUrl);
      else if (isIaDevice())
        sXWalkDownConfigUrl = "https://dldir1.qq.com/weixin/android/wxweb/updateConfig_x86.xml";
      else
        sXWalkDownConfigUrl = "https://dldir1.qq.com/weixin/android/wxweb/updateConfig.xml";
    }
  }

  public static Object getXWebInitArgs(String paramString)
  {
    try
    {
      AppMethodBeat.i(4203);
      if ((sXWebArgs == null) || (!sXWebArgs.containsKey(paramString)))
      {
        paramString = null;
        AppMethodBeat.o(4203);
      }
      while (true)
      {
        return paramString;
        paramString = sXWebArgs.get(paramString);
        AppMethodBeat.o(4203);
      }
    }
    finally
    {
    }
    throw paramString;
  }

  // ERROR //
  public static boolean getXWebInitArgs(String paramString, boolean paramBoolean)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: sipush 4204
    //   6: invokestatic 188	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   9: aload_0
    //   10: invokestatic 839	org/xwalk/core/XWalkEnvironment:getXWebInitArgs	(Ljava/lang/String;)Ljava/lang/Object;
    //   13: astore_0
    //   14: aload_0
    //   15: ifnonnull +14 -> 29
    //   18: sipush 4204
    //   21: invokestatic 248	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   24: ldc 2
    //   26: monitorexit
    //   27: iload_1
    //   28: ireturn
    //   29: aload_0
    //   30: invokevirtual 544	java/lang/Object:toString	()Ljava/lang/String;
    //   33: invokestatic 995	java/lang/Boolean:valueOf	(Ljava/lang/String;)Ljava/lang/Boolean;
    //   36: invokevirtual 723	java/lang/Boolean:booleanValue	()Z
    //   39: istore_2
    //   40: iload_2
    //   41: istore_1
    //   42: sipush 4204
    //   45: invokestatic 248	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   48: goto -24 -> 24
    //   51: astore_0
    //   52: ldc 2
    //   54: monitorexit
    //   55: aload_0
    //   56: athrow
    //   57: astore_0
    //   58: ldc 92
    //   60: ldc_w 997
    //   63: invokestatic 290	org/xwalk/core/Log:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   66: sipush 4204
    //   69: invokestatic 248	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   72: goto -48 -> 24
    //
    // Exception table:
    //   from	to	target	type
    //   3	14	51	finally
    //   18	24	51	finally
    //   29	40	51	finally
    //   42	48	51	finally
    //   58	72	51	finally
    //   29	40	57	java/lang/Exception
  }

  public static boolean hasAvailableVersion()
  {
    AppMethodBeat.i(4223);
    boolean bool;
    if (49 > getAvailableVersion())
    {
      bool = false;
      AppMethodBeat.o(4223);
    }
    while (true)
    {
      return bool;
      bool = true;
      AppMethodBeat.o(4223);
    }
  }

  public static boolean hasPluginTestConfigUrl()
  {
    boolean bool = false;
    AppMethodBeat.i(4259);
    SharedPreferences localSharedPreferences = getSharedPreferencesForTestXWeb();
    if (localSharedPreferences == null)
    {
      Log.e("XWalkEnvironment", "hasPluginTestConfigUrl sp is null");
      AppMethodBeat.o(4259);
    }
    while (true)
    {
      return bool;
      if (!localSharedPreferences.getString("XWEB_PLUGIN_TEST_CONFIG_URL", "").trim().isEmpty())
      {
        bool = true;
        AppMethodBeat.o(4259);
      }
      else
      {
        AppMethodBeat.o(4259);
      }
    }
  }

  public static void init(Context paramContext)
  {
    AppMethodBeat.i(4199);
    if ((paramContext == null) || (sApplicationContext != null))
      AppMethodBeat.o(4199);
    while (true)
    {
      return;
      sApplicationContext = paramContext.getApplicationContext();
      if (sAvailableVersion == -1)
      {
        sAvailableVersion = getSharedPreferencesForVersionInfo().getInt("availableVersion", -1);
        sStrVersionDetail = getSharedPreferencesForVersionInfo().getString("versionDetail", "");
        if (sAvailableVersion != -1)
          getSharedPreferences().edit().putString("XWALK_CORE_EXTRACTED_DIR", getExtractedCoreDir(sAvailableVersion)).commit();
      }
      if (!sIsPluginInited)
        sIsPluginInited = initXWalkPlugins();
      m.jy(paramContext);
      AppMethodBeat.o(4199);
    }
  }

  static void initSafePsProvider()
  {
    AppMethodBeat.i(4202);
    if (sBHasInitedSafePsProvider)
      AppMethodBeat.o(4202);
    while (true)
    {
      return;
      try
      {
        sMMKVMethod = Class.forName("com.tencent.mm.cj.b").getMethod("getMMKV", new Class[] { Context.class, String.class, Integer.TYPE, Boolean.TYPE });
        label61: if (sMMKVMethod == null)
        {
          f.nI(178L);
          Log.e("XWalkEnvironment", "initSafePsProvider failed");
        }
        while (true)
        {
          sBHasInitedSafePsProvider = true;
          AppMethodBeat.o(4202);
          break;
          Log.i("XWalkEnvironment", "initSafePsProvider suscsess");
        }
      }
      catch (Exception localException)
      {
        break label61;
      }
    }
  }

  private static boolean initXWalkPlugins()
  {
    AppMethodBeat.i(4200);
    boolean bool = com.tencent.xweb.xwalk.a.e.dVP();
    AppMethodBeat.o(4200);
    return bool;
  }

  public static boolean is64bitApp()
  {
    AppMethodBeat.i(4266);
    String str = getRuntimeAbi();
    boolean bool;
    if ((str.equals("arm64-v8a")) || (str.equals("x86_64")))
    {
      bool = true;
      AppMethodBeat.o(4266);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(4266);
    }
  }

  public static boolean is64bitDevice()
  {
    AppMethodBeat.i(4265);
    String str = getDeviceAbi();
    boolean bool;
    if ((str.equals("arm64-v8a")) || (str.equals("x86_64")))
    {
      bool = true;
      AppMethodBeat.o(4265);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(4265);
    }
  }

  public static boolean isCurrentVersionSupportCustomContext()
  {
    AppMethodBeat.i(4220);
    boolean bool;
    if ((hasAvailableVersion()) && (getFeatureSupport(1020)))
    {
      bool = true;
      AppMethodBeat.o(4220);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(4220);
    }
  }

  public static boolean isCurrentVersionSupportExtendPluginForAppbrand()
  {
    AppMethodBeat.i(4218);
    boolean bool;
    if ((hasAvailableVersion()) && (getAvailableVersion() >= 300))
    {
      bool = true;
      AppMethodBeat.o(4218);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(4218);
    }
  }

  public static boolean isCurrentVersionSupportMapExtendPluginForAppbrand()
  {
    AppMethodBeat.i(4219);
    boolean bool;
    if ((hasAvailableVersion()) && (getFeatureSupport(1011)))
    {
      bool = true;
      AppMethodBeat.o(4219);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(4219);
    }
  }

  public static boolean isDownloadMode()
  {
    AppMethodBeat.i(4262);
    boolean bool = sIsDownloadMode.booleanValue();
    AppMethodBeat.o(4262);
    return bool;
  }

  public static boolean isDownloadModeUpdate()
  {
    AppMethodBeat.i(4263);
    boolean bool = sIsDownloadModeUpdate.booleanValue();
    AppMethodBeat.o(4263);
    return bool;
  }

  public static boolean isForbidDownloadCode()
  {
    return sIsForbidDownloadCode;
  }

  public static boolean isIaDevice()
  {
    AppMethodBeat.i(4264);
    String str = getDeviceAbi();
    boolean bool;
    if ((str.equals("x86")) || (str.equals("x86_64")))
    {
      bool = true;
      AppMethodBeat.o(4264);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(4264);
    }
  }

  public static boolean isInTestMode()
  {
    AppMethodBeat.i(4249);
    String str = getTestDownLoadUrl(getApplicationContext());
    boolean bool;
    if ((str == null) || (str.isEmpty()))
    {
      bool = false;
      AppMethodBeat.o(4249);
    }
    while (true)
    {
      return bool;
      bool = true;
      AppMethodBeat.o(4249);
    }
  }

  public static boolean isProvider(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(4287);
    if ((paramString == null) || (paramString.isEmpty()))
    {
      Log.e("XWalkEnvironment", "isProvider packageName is null or empty");
      AppMethodBeat.o(4287);
    }
    while (true)
    {
      return bool;
      String[] arrayOfString = XWALK_CORE_PROVIDER_LIST;
      int i = arrayOfString.length;
      for (int j = 0; ; j++)
      {
        if (j >= i)
          break label79;
        if (arrayOfString[j].equals(paramString))
        {
          bool = true;
          AppMethodBeat.o(4287);
          break;
        }
      }
      label79: AppMethodBeat.o(4287);
    }
  }

  public static boolean isSelfProvider()
  {
    AppMethodBeat.i(4286);
    boolean bool;
    if (sApplicationContext == null)
    {
      Log.e("XWalkEnvironment", "isSelfProvider sApplicationContext is null");
      bool = true;
      AppMethodBeat.o(4286);
    }
    while (true)
    {
      return bool;
      bool = isProvider(sApplicationContext.getPackageName());
      AppMethodBeat.o(4286);
    }
  }

  public static boolean isTestVersion(int paramInt)
  {
    if (paramInt >= 100000);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public static int readAvailableVersionFromSP(Context paramContext)
  {
    int i = -1;
    AppMethodBeat.i(4295);
    if (paramContext == null)
    {
      Log.e("XWalkEnvironment", "readAvailableVersionFromSP context is null");
      AppMethodBeat.o(4295);
    }
    while (true)
    {
      return i;
      paramContext = paramContext.getSharedPreferences("XWALKINFOS", 4);
      if (paramContext == null)
      {
        Log.e("XWalkEnvironment", "readAvailableVersionFromSP sp is null");
        AppMethodBeat.o(4295);
      }
      else
      {
        i = paramContext.getInt("availableVersion", -1);
        AppMethodBeat.o(4295);
      }
    }
  }

  public static int safeGetChromiunVersion()
  {
    AppMethodBeat.i(4251);
    Object localObject;
    if (sNChromiuVersion < 0)
      localObject = getApplicationContext().getPackageManager();
    while (true)
    {
      try
      {
        localObject = ((PackageManager)localObject).getPackageInfo("com.google.android.webview", 0);
        if (localObject != null)
        {
          i = getVerFromVersionName(((PackageInfo)localObject).versionName);
          if (i > 0)
          {
            sNChromiuVersion = i;
            AppMethodBeat.o(4251);
            return i;
          }
        }
      }
      catch (Exception localException)
      {
        Log.e("XWalkEnvironment", "Android System WebView is not found");
      }
      int i = sNChromiuVersion;
      AppMethodBeat.o(4251);
    }
  }

  public static boolean setAvailableVersion(int paramInt, String paramString)
  {
    AppMethodBeat.i(4226);
    Log.i("XWalkEnvironment", "setAvailableVersion:".concat(String.valueOf(paramInt)));
    SharedPreferences.Editor localEditor = getSharedPreferencesForVersionInfo().edit();
    localEditor.putInt("availableVersion", paramInt);
    localEditor.putString("versionDetail", paramString);
    boolean bool = localEditor.commit();
    addXWalkInitializeLog("XWalkEnvironment", "set xwalk version to " + paramInt + " suc = " + bool);
    AppMethodBeat.o(4226);
    return bool;
  }

  public static void setGrayValueByUserId(int paramInt)
  {
    AppMethodBeat.i(4273);
    if (paramInt == 0)
      AppMethodBeat.o(4273);
    while (true)
    {
      return;
      Object localObject = "xweb_gray_value".concat(String.valueOf(0xFFFFFFFF & paramInt));
      try
      {
        localObject = MessageDigest.getInstance("MD5").digest(((String)localObject).getBytes());
        if (localObject != null)
        {
          paramInt = localObject.length;
          if (paramInt > 3);
        }
        else
        {
          AppMethodBeat.o(4273);
          continue;
        }
        int i = localObject[3];
        int j = localObject[2];
        paramInt = localObject[1];
        int k = localObject[0];
        paramInt = (k & 0x7F) << 24 | (i & 0xFF | (j & 0xFF) << 8 | (paramInt & 0xFF) << 16);
        if (paramInt == 0)
        {
          AppMethodBeat.o(4273);
          continue;
        }
        s_grayValue = paramInt % 10000 + 1;
        paramInt = getSharedPreferences().getInt("GRAY_VALUE", -1);
        getSharedPreferences().edit().putInt("GRAY_VALUE", s_grayValue).commit();
        if (paramInt != s_grayValue)
        {
          Log.i("XWalkEnvironment", "gray value changed to " + s_grayValue);
          k.f(WebView.d.ANb).excute("STR_CMD_SET_RECHECK_COMMAND", null);
        }
        AppMethodBeat.o(4273);
      }
      catch (Exception localException)
      {
        while (true)
          s_grayValue = 0;
      }
    }
  }

  public static void setGrayValueForTest(int paramInt)
  {
    AppMethodBeat.i(4269);
    if (paramInt != 10001)
      s_grayValue = paramInt % 10000;
    getSharedPreferences().edit().putInt("TEST_GRAY_VALUE", s_grayValue).commit();
    AppMethodBeat.o(4269);
  }

  public static void setIpType(int paramInt)
  {
    AppMethodBeat.i(4270);
    int i = getIpType();
    if (paramInt != i)
    {
      getSharedPreferences().edit().putInt("IP_TYPE", paramInt).commit();
      addXWalkInitializeLog("setIpType", " to  ".concat(String.valueOf(paramInt)));
      if ((i != 0) || (paramInt != 1))
        break label103;
      f.nI(197L);
    }
    while (true)
    {
      if ((i > 0) || (paramInt > 0))
      {
        sBIsIpTypeChanged = true;
        k.f(WebView.d.ANb).excute("STR_CMD_SET_RECHECK_COMMAND", null);
      }
      AppMethodBeat.o(4270);
      return;
      label103: if ((i == 1) && (paramInt == 0))
        f.nI(198L);
    }
  }

  public static void setIsForbidDownloadCode(boolean paramBoolean)
  {
    AppMethodBeat.i(4201);
    sIsForbidDownloadCode = paramBoolean;
    addXWalkInitializeLog("XWalkEnvironment", "setIsForbidDownloadCode: " + sIsForbidDownloadCode);
    AppMethodBeat.o(4201);
  }

  public static boolean setPluginTestConfigUrl(String paramString)
  {
    AppMethodBeat.i(4260);
    Object localObject = getSharedPreferencesForTestXWeb();
    boolean bool;
    if (localObject == null)
    {
      Log.e("XWalkEnvironment", "setPluginTestConfigUrl sp is null");
      bool = false;
      AppMethodBeat.o(4260);
      return bool;
    }
    localObject = ((SharedPreferences)localObject).edit();
    if ((paramString == null) || (paramString.trim().isEmpty()))
      ((SharedPreferences.Editor)localObject).remove("XWEB_PLUGIN_TEST_CONFIG_URL");
    while (true)
    {
      bool = ((SharedPreferences.Editor)localObject).commit();
      AppMethodBeat.o(4260);
      break;
      ((SharedPreferences.Editor)localObject).putString("XWEB_PLUGIN_TEST_CONFIG_URL", paramString);
    }
  }

  public static void setSharedPreferenceProvider(com.tencent.xweb.e parame)
  {
    if (parame != null);
    try
    {
      sSPProvider = parame;
      return;
    }
    finally
    {
      parame = finally;
    }
    throw parame;
  }

  public static void setTempUpdateConfigUrl(String paramString)
  {
    try
    {
      sStrTempUpdateConfigUrl = paramString;
      return;
    }
    finally
    {
      paramString = finally;
    }
    throw paramString;
  }

  public static void setTestDownLoadUrl(Context paramContext, String paramString)
  {
    AppMethodBeat.i(4255);
    sXWalkDownConfigUrl = null;
    if ((paramString == null) || (paramString.isEmpty()))
    {
      paramContext.getSharedPreferences("TESTXWEB", 4).edit().putString("XWEB_TEST_CONFIG_URL", "").commit();
      getXWalkUpdateConfigUrl();
      AppMethodBeat.o(4255);
    }
    while (true)
    {
      return;
      paramContext.getSharedPreferences("TESTXWEB", 4).edit().putString("XWEB_TEST_CONFIG_URL", paramString).commit();
      getXWalkUpdateConfigUrl();
      AppMethodBeat.o(4255);
    }
  }

  public static void setUsingCustomContext(boolean paramBoolean)
  {
    AppMethodBeat.i(4221);
    sUsingCustomContext = paramBoolean;
    Log.i("XWalkEnvironment", "setUsingCustomContext usingCustomContext:".concat(String.valueOf(paramBoolean)));
    AppMethodBeat.o(4221);
  }

  public static void setXWebInitArgs(HashMap paramHashMap)
  {
    try
    {
      sXWebArgs = paramHashMap;
      return;
    }
    finally
    {
      paramHashMap = finally;
    }
    throw paramHashMap;
  }

  static void tryClose(Closeable paramCloseable)
  {
    AppMethodBeat.i(4275);
    if (paramCloseable == null)
      AppMethodBeat.o(4275);
    while (true)
    {
      return;
      if (paramCloseable != null);
      try
      {
        paramCloseable.close();
        AppMethodBeat.o(4275);
      }
      catch (Exception paramCloseable)
      {
        Log.e("XWalkEnvironment", "closeable close  failed " + paramCloseable.getMessage());
        AppMethodBeat.o(4275);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     org.xwalk.core.XWalkEnvironment
 * JD-Core Version:    0.6.2
 */