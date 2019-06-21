package com.tencent.smtt.utils;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.provider.Settings.Secure;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.File;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.net.NetworkInterface;
import java.security.cert.Certificate;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

public class b
{
  public static String a = "";
  public static String b = "";
  public static String c = "";
  public static String d = "";
  public static String e = "";

  private static PackageInfo a(String paramString, int paramInt)
  {
    AppMethodBeat.i(65185);
    try
    {
      Object localObject1 = Class.forName("android.content.pm.PackageParser");
      Object localObject2 = ((Class)localObject1).getDeclaredClasses();
      int i = localObject2.length;
      int j = 0;
      if (j < i)
      {
        localMethod1 = localObject2[j];
        if (localMethod1.getName().compareTo("android.content.pm.PackageParser$Package") == 0)
        {
          Object localObject3 = ((Class)localObject1).getConstructor(new Class[] { String.class });
          Method localMethod2 = ((Class)localObject1).getDeclaredMethod("parsePackage", new Class[] { File.class, String.class, DisplayMetrics.class, Integer.TYPE });
          localObject2 = ((Class)localObject1).getDeclaredMethod("collectCertificates", new Class[] { localMethod1, Integer.TYPE });
          localMethod1 = ((Class)localObject1).getDeclaredMethod("generatePackageInfo", new Class[] { localMethod1, [I.class, Integer.TYPE, Long.TYPE, Long.TYPE });
          ((Constructor)localObject3).setAccessible(true);
          localMethod2.setAccessible(true);
          ((Method)localObject2).setAccessible(true);
          localMethod1.setAccessible(true);
          localObject1 = ((Constructor)localObject3).newInstance(new Object[] { paramString });
          localObject3 = new android/util/DisplayMetrics;
          ((DisplayMetrics)localObject3).<init>();
          ((DisplayMetrics)localObject3).setToDefaults();
          File localFile = new java/io/File;
          localFile.<init>(paramString);
          paramString = localMethod2.invoke(localObject1, new Object[] { localFile, paramString, localObject3, Integer.valueOf(0) });
          if (paramString != null)
            break label273;
          AppMethodBeat.o(65185);
          paramString = null;
        }
        while (true)
        {
          return paramString;
          j++;
          break;
          label273: if ((paramInt & 0x40) != 0)
            ((Method)localObject2).invoke(localObject1, new Object[] { paramString, Integer.valueOf(0) });
          paramString = (PackageInfo)localMethod1.invoke(null, new Object[] { paramString, null, Integer.valueOf(paramInt), Integer.valueOf(0), Integer.valueOf(0) });
          AppMethodBeat.o(65185);
        }
      }
    }
    catch (Exception paramString)
    {
      while (true)
      {
        AppMethodBeat.o(65185);
        paramString = null;
        continue;
        Method localMethod1 = null;
      }
    }
  }

  // ERROR //
  public static String a()
  {
    // Byte code:
    //   0: ldc 128
    //   2: invokestatic 35	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: getstatic 20	com/tencent/smtt/utils/b:c	Ljava/lang/String;
    //   8: invokestatic 134	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   11: ifne +14 -> 25
    //   14: getstatic 20	com/tencent/smtt/utils/b:c	Ljava/lang/String;
    //   17: astore_0
    //   18: ldc 128
    //   20: invokestatic 121	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   23: aload_0
    //   24: areturn
    //   25: invokestatic 140	java/lang/Runtime:getRuntime	()Ljava/lang/Runtime;
    //   28: ldc 142
    //   30: invokevirtual 146	java/lang/Runtime:exec	(Ljava/lang/String;)Ljava/lang/Process;
    //   33: astore_1
    //   34: new 148	java/io/InputStreamReader
    //   37: astore_2
    //   38: aload_2
    //   39: aload_1
    //   40: invokevirtual 154	java/lang/Process:getInputStream	()Ljava/io/InputStream;
    //   43: invokespecial 157	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   46: new 159	java/io/BufferedReader
    //   49: astore_3
    //   50: aload_3
    //   51: aload_2
    //   52: invokespecial 162	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   55: aload_3
    //   56: astore 4
    //   58: aload_2
    //   59: astore_0
    //   60: aload_3
    //   61: invokevirtual 165	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   64: ldc 167
    //   66: invokevirtual 170	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   69: ifeq +44 -> 113
    //   72: aload_3
    //   73: astore 4
    //   75: aload_2
    //   76: astore_0
    //   77: ldc 172
    //   79: invokestatic 175	com/tencent/smtt/utils/b:a	(Ljava/lang/String;)Ljava/lang/String;
    //   82: astore_1
    //   83: aload_3
    //   84: ifnull +7 -> 91
    //   87: aload_3
    //   88: invokevirtual 178	java/io/BufferedReader:close	()V
    //   91: aload_1
    //   92: astore_0
    //   93: aload_2
    //   94: ifnull +11 -> 105
    //   97: aload_1
    //   98: astore_0
    //   99: aload_2
    //   100: invokevirtual 179	java/io/InputStreamReader:close	()V
    //   103: aload_1
    //   104: astore_0
    //   105: ldc 128
    //   107: invokestatic 121	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   110: goto -87 -> 23
    //   113: aload_3
    //   114: astore 4
    //   116: aload_2
    //   117: astore_0
    //   118: ldc 181
    //   120: invokestatic 186	java/lang/System:getProperty	(Ljava/lang/String;)Ljava/lang/String;
    //   123: invokestatic 175	com/tencent/smtt/utils/b:a	(Ljava/lang/String;)Ljava/lang/String;
    //   126: astore_1
    //   127: goto -44 -> 83
    //   130: astore_1
    //   131: aconst_null
    //   132: astore_1
    //   133: aconst_null
    //   134: astore_2
    //   135: aload_1
    //   136: astore 4
    //   138: aload_2
    //   139: astore_0
    //   140: ldc 181
    //   142: invokestatic 186	java/lang/System:getProperty	(Ljava/lang/String;)Ljava/lang/String;
    //   145: invokestatic 175	com/tencent/smtt/utils/b:a	(Ljava/lang/String;)Ljava/lang/String;
    //   148: astore_3
    //   149: aload_3
    //   150: astore 4
    //   152: aload_1
    //   153: ifnull +7 -> 160
    //   156: aload_1
    //   157: invokevirtual 178	java/io/BufferedReader:close	()V
    //   160: aload 4
    //   162: astore_0
    //   163: aload_2
    //   164: ifnull -59 -> 105
    //   167: aload 4
    //   169: astore_0
    //   170: aload_2
    //   171: invokevirtual 179	java/io/InputStreamReader:close	()V
    //   174: aload 4
    //   176: astore_0
    //   177: goto -72 -> 105
    //   180: astore_1
    //   181: goto -76 -> 105
    //   184: astore_1
    //   185: aconst_null
    //   186: astore_2
    //   187: aconst_null
    //   188: astore_0
    //   189: aload_2
    //   190: ifnull +7 -> 197
    //   193: aload_2
    //   194: invokevirtual 178	java/io/BufferedReader:close	()V
    //   197: aload_0
    //   198: ifnull +7 -> 205
    //   201: aload_0
    //   202: invokevirtual 179	java/io/InputStreamReader:close	()V
    //   205: ldc 128
    //   207: invokestatic 121	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   210: aload_1
    //   211: athrow
    //   212: astore_2
    //   213: goto -16 -> 197
    //   216: astore_0
    //   217: goto -12 -> 205
    //   220: astore_1
    //   221: goto -61 -> 160
    //   224: astore_0
    //   225: goto -134 -> 91
    //   228: astore_1
    //   229: aconst_null
    //   230: astore 4
    //   232: aload_2
    //   233: astore_0
    //   234: aload 4
    //   236: astore_2
    //   237: goto -48 -> 189
    //   240: astore_1
    //   241: aload 4
    //   243: astore_2
    //   244: goto -55 -> 189
    //   247: astore_1
    //   248: aconst_null
    //   249: astore_1
    //   250: goto -115 -> 135
    //   253: astore_1
    //   254: aload_3
    //   255: astore_1
    //   256: goto -121 -> 135
    //
    // Exception table:
    //   from	to	target	type
    //   25	46	130	java/lang/Throwable
    //   99	103	180	java/io/IOException
    //   170	174	180	java/io/IOException
    //   25	46	184	finally
    //   193	197	212	java/io/IOException
    //   201	205	216	java/io/IOException
    //   156	160	220	java/io/IOException
    //   87	91	224	java/io/IOException
    //   46	55	228	finally
    //   60	72	240	finally
    //   77	83	240	finally
    //   118	127	240	finally
    //   140	149	240	finally
    //   46	55	247	java/lang/Throwable
    //   60	72	253	java/lang/Throwable
    //   77	83	253	java/lang/Throwable
    //   118	127	253	java/lang/Throwable
  }

  public static String a(Context paramContext)
  {
    AppMethodBeat.i(65173);
    Object localObject = null;
    try
    {
      String str = paramContext.getPackageName();
      paramContext = paramContext.getPackageManager().getPackageInfo(str, 0).versionName;
      AppMethodBeat.o(65173);
      return paramContext;
    }
    catch (Exception paramContext)
    {
      while (true)
        paramContext = localObject;
    }
  }

  private static String a(Context paramContext, File paramFile, boolean paramBoolean)
  {
    Object localObject = null;
    AppMethodBeat.i(65183);
    if (paramBoolean)
    {
      paramContext = a(paramFile.getAbsolutePath(), 65);
      if (paramContext == null)
        break label89;
      if ((paramContext.signatures == null) || (paramContext.signatures.length <= 0))
        break label82;
    }
    label82: label89: for (paramContext = paramContext.signatures[0]; ; paramContext = null)
    {
      paramFile = localObject;
      if (paramContext != null)
        paramFile = paramContext.toCharsString();
      AppMethodBeat.o(65183);
      return paramFile;
      paramContext = paramContext.getPackageManager().getPackageArchiveInfo(paramFile.getAbsolutePath(), 65);
      break;
      TbsLog.w("AppUtil", "[getSignatureFromApk] pkgInfo is not null BUT signatures is null!");
    }
  }

  public static String a(Context paramContext, String paramString)
  {
    AppMethodBeat.i(65175);
    Object localObject = null;
    try
    {
      String str = paramContext.getPackageName();
      paramContext = String.valueOf(paramContext.getPackageManager().getApplicationInfo(str, 128).metaData.get(paramString));
    }
    catch (Exception paramContext)
    {
      try
      {
        paramString = String.valueOf(Integer.toHexString(Integer.parseInt(paramContext)));
        for (paramContext = paramString; ; paramContext = localObject)
        {
          label47: AppMethodBeat.o(65175);
          return paramContext;
          paramContext = paramContext;
        }
      }
      catch (Exception paramString)
      {
        break label47;
      }
    }
  }

  // ERROR //
  public static String a(Context paramContext, boolean paramBoolean, File paramFile)
  {
    // Byte code:
    //   0: ldc_w 264
    //   3: invokestatic 35	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: aload_2
    //   7: ifnull +10 -> 17
    //   10: aload_2
    //   11: invokevirtual 268	java/io/File:exists	()Z
    //   14: ifne +14 -> 28
    //   17: ldc 14
    //   19: astore_0
    //   20: ldc_w 264
    //   23: invokestatic 121	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   26: aload_0
    //   27: areturn
    //   28: iload_1
    //   29: ifeq +96 -> 125
    //   32: aconst_null
    //   33: astore_3
    //   34: iconst_2
    //   35: newarray byte
    //   37: astore 4
    //   39: new 270	java/io/RandomAccessFile
    //   42: astore 5
    //   44: aload 5
    //   46: aload_2
    //   47: ldc_w 272
    //   50: invokespecial 275	java/io/RandomAccessFile:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   53: aload 5
    //   55: aload 4
    //   57: invokevirtual 279	java/io/RandomAccessFile:read	([B)I
    //   60: pop
    //   61: new 55	java/lang/String
    //   64: astore_3
    //   65: aload_3
    //   66: aload 4
    //   68: invokespecial 282	java/lang/String:<init>	([B)V
    //   71: aload_3
    //   72: ldc_w 284
    //   75: invokevirtual 288	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   78: ifne +225 -> 303
    //   81: ldc 14
    //   83: astore_0
    //   84: aload 5
    //   86: invokevirtual 289	java/io/RandomAccessFile:close	()V
    //   89: ldc_w 264
    //   92: invokestatic 121	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   95: goto -69 -> 26
    //   98: astore_0
    //   99: aconst_null
    //   100: astore 5
    //   102: aload 5
    //   104: invokevirtual 289	java/io/RandomAccessFile:close	()V
    //   107: ldc_w 264
    //   110: invokestatic 121	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   113: aload_0
    //   114: athrow
    //   115: astore 5
    //   117: aload_3
    //   118: astore 5
    //   120: aload 5
    //   122: invokevirtual 289	java/io/RandomAccessFile:close	()V
    //   125: aload_0
    //   126: invokevirtual 293	android/content/Context:getApplicationContext	()Landroid/content/Context;
    //   129: invokevirtual 193	android/content/Context:getPackageName	()Ljava/lang/String;
    //   132: ldc_w 295
    //   135: invokevirtual 170	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   138: ifeq +52 -> 190
    //   141: ldc 226
    //   143: ldc_w 297
    //   146: invokestatic 299	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   149: aload_2
    //   150: invokestatic 302	com/tencent/smtt/utils/b:a	(Ljava/io/File;)Ljava/lang/String;
    //   153: astore 5
    //   155: aload 5
    //   157: ifnull +33 -> 190
    //   160: ldc 226
    //   162: ldc_w 304
    //   165: invokestatic 299	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   168: ldc_w 264
    //   171: invokestatic 121	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   174: aload 5
    //   176: astore_0
    //   177: goto -151 -> 26
    //   180: astore 5
    //   182: ldc 226
    //   184: ldc_w 306
    //   187: invokestatic 299	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   190: ldc 226
    //   192: ldc_w 308
    //   195: invokestatic 299	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   198: aload_0
    //   199: aload_2
    //   200: iconst_0
    //   201: invokestatic 310	com/tencent/smtt/utils/b:a	(Landroid/content/Context;Ljava/io/File;Z)Ljava/lang/String;
    //   204: astore_3
    //   205: ldc 226
    //   207: ldc_w 312
    //   210: aload_3
    //   211: invokestatic 255	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   214: invokevirtual 315	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   217: invokestatic 299	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   220: aload_3
    //   221: astore 5
    //   223: aload_3
    //   224: ifnonnull +25 -> 249
    //   227: aload_2
    //   228: invokestatic 302	com/tencent/smtt/utils/b:a	(Ljava/io/File;)Ljava/lang/String;
    //   231: astore 5
    //   233: ldc 226
    //   235: ldc_w 317
    //   238: aload 5
    //   240: invokestatic 255	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   243: invokevirtual 315	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   246: invokestatic 299	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   249: aload 5
    //   251: astore_3
    //   252: aload 5
    //   254: ifnonnull +25 -> 279
    //   257: aload_0
    //   258: aload_2
    //   259: iconst_1
    //   260: invokestatic 310	com/tencent/smtt/utils/b:a	(Landroid/content/Context;Ljava/io/File;Z)Ljava/lang/String;
    //   263: astore_3
    //   264: ldc 226
    //   266: ldc_w 319
    //   269: aload_3
    //   270: invokestatic 255	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   273: invokevirtual 315	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   276: invokestatic 299	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   279: ldc_w 264
    //   282: invokestatic 121	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   285: aload_3
    //   286: astore_0
    //   287: goto -261 -> 26
    //   290: astore 5
    //   292: goto -167 -> 125
    //   295: astore_2
    //   296: goto -189 -> 107
    //   299: astore_2
    //   300: goto -211 -> 89
    //   303: aload 5
    //   305: invokevirtual 289	java/io/RandomAccessFile:close	()V
    //   308: goto -183 -> 125
    //   311: astore_0
    //   312: goto -210 -> 102
    //   315: astore_3
    //   316: goto -196 -> 120
    //
    // Exception table:
    //   from	to	target	type
    //   34	53	98	finally
    //   34	53	115	java/lang/Exception
    //   125	155	180	java/lang/Throwable
    //   160	168	180	java/lang/Throwable
    //   120	125	290	java/io/IOException
    //   303	308	290	java/io/IOException
    //   102	107	295	java/io/IOException
    //   84	89	299	java/io/IOException
    //   53	81	311	finally
    //   53	81	315	java/lang/Exception
  }

  private static String a(File paramFile)
  {
    AppMethodBeat.i(65184);
    try
    {
      JarFile localJarFile = new java/util/jar/JarFile;
      localJarFile.<init>(paramFile);
      paramFile = localJarFile.getJarEntry("AndroidManifest.xml");
      byte[] arrayOfByte = new byte[8192];
      String str1 = a(a(localJarFile, paramFile, arrayOfByte)[0].getEncoded());
      Enumeration localEnumeration = localJarFile.entries();
      boolean bool;
      while (true)
        if (localEnumeration.hasMoreElements())
        {
          paramFile = (JarEntry)localEnumeration.nextElement();
          String str2 = paramFile.getName();
          if (str2 != null)
          {
            paramFile = a(localJarFile, paramFile, arrayOfByte);
            if (paramFile == null)
              break label160;
            paramFile = a(paramFile[0].getEncoded());
            if (paramFile == null)
            {
              bool = str2.startsWith("META-INF/");
              if (bool)
                continue;
              paramFile = null;
            }
          }
        }
      while (true)
      {
        AppMethodBeat.o(65184);
        return paramFile;
        bool = paramFile.equals(str1);
        if (bool)
          break;
        paramFile = null;
        continue;
        paramFile = str1;
      }
    }
    catch (Exception paramFile)
    {
      while (true)
      {
        paramFile = null;
        continue;
        label160: paramFile = null;
      }
    }
  }

  private static String a(String paramString)
  {
    String str = paramString;
    if (paramString == null)
      str = "";
    return str;
  }

  private static String a(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(65187);
    int i = paramArrayOfByte.length;
    char[] arrayOfChar = new char[i * 2];
    int j = 0;
    if (j < i)
    {
      int k = paramArrayOfByte[j];
      int m = k >> 4 & 0xF;
      if (m >= 10)
      {
        m = m + 97 - 10;
        label53: arrayOfChar[(j * 2)] = ((char)(char)m);
        m = k & 0xF;
        if (m < 10)
          break label109;
      }
      label109: for (m = m + 97 - 10; ; m += 48)
      {
        arrayOfChar[(j * 2 + 1)] = ((char)(char)m);
        j++;
        break;
        m += 48;
        break label53;
      }
    }
    paramArrayOfByte = new String(arrayOfChar);
    AppMethodBeat.o(65187);
    return paramArrayOfByte;
  }

  private static Certificate[] a(JarFile paramJarFile, JarEntry paramJarEntry, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(65186);
    paramJarFile = paramJarFile.getInputStream(paramJarEntry);
    while (paramJarFile.read(paramArrayOfByte, 0, paramArrayOfByte.length) != -1);
    paramJarFile.close();
    if (paramJarEntry != null)
    {
      paramJarFile = paramJarEntry.getCertificates();
      AppMethodBeat.o(65186);
    }
    while (true)
    {
      return paramJarFile;
      paramJarFile = null;
      AppMethodBeat.o(65186);
    }
  }

  public static int b(Context paramContext)
  {
    int i = 0;
    AppMethodBeat.i(65174);
    try
    {
      String str = paramContext.getPackageName();
      j = paramContext.getPackageManager().getPackageInfo(str, 0).versionCode;
      AppMethodBeat.o(65174);
      return j;
    }
    catch (Exception paramContext)
    {
      while (true)
        int j = i;
    }
  }

  public static String b()
  {
    AppMethodBeat.i(65180);
    try
    {
      Object localObject1 = Collections.list(NetworkInterface.getNetworkInterfaces()).iterator();
      Object localObject2;
      do
      {
        if (!((Iterator)localObject1).hasNext())
          break;
        localObject2 = (NetworkInterface)((Iterator)localObject1).next();
      }
      while (!((NetworkInterface)localObject2).getName().equalsIgnoreCase("wlan0"));
      localObject1 = ((NetworkInterface)localObject2).getHardwareAddress();
      if (localObject1 == null)
      {
        localObject1 = "";
        AppMethodBeat.o(65180);
      }
      while (true)
      {
        return localObject1;
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        int i = localObject1.length;
        for (int j = 0; j < i; j++)
          ((StringBuilder)localObject2).append(String.format("%02X:", new Object[] { Byte.valueOf(localObject1[j]) }));
        if (((StringBuilder)localObject2).length() > 0)
          ((StringBuilder)localObject2).deleteCharAt(((StringBuilder)localObject2).length() - 1);
        localObject1 = ((StringBuilder)localObject2).toString();
        AppMethodBeat.o(65180);
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        String str = "02:00:00:00:00:00";
        AppMethodBeat.o(65180);
      }
    }
  }

  public static String c(Context paramContext)
  {
    AppMethodBeat.i(65176);
    if (!TextUtils.isEmpty(a))
      paramContext = a;
    while (true)
    {
      AppMethodBeat.o(65176);
      return paramContext;
      try
      {
        paramContext = ((TelephonyManager)paramContext.getSystemService("phone")).getDeviceId();
      }
      catch (Exception paramContext)
      {
        paramContext = "";
      }
    }
  }

  public static String d(Context paramContext)
  {
    AppMethodBeat.i(65177);
    if (!TextUtils.isEmpty(b))
      paramContext = b;
    while (true)
    {
      AppMethodBeat.o(65177);
      return paramContext;
      try
      {
        paramContext = ((TelephonyManager)paramContext.getSystemService("phone")).getSubscriberId();
      }
      catch (Exception paramContext)
      {
        paramContext = "";
      }
    }
  }

  public static String e(Context paramContext)
  {
    AppMethodBeat.i(65179);
    if ((!TextUtils.isEmpty(d)) || (Build.VERSION.SDK_INT < 23));
    try
    {
      paramContext = (WifiManager)paramContext.getApplicationContext().getSystemService("wifi");
      if (paramContext == null)
      {
        paramContext = null;
        if (paramContext != null)
          break label74;
        paramContext = "";
      }
      label50: for (d = paramContext; ; d = b())
      {
        label54: paramContext = d;
        AppMethodBeat.o(65179);
        return paramContext;
        paramContext = paramContext.getConnectionInfo();
        break;
        label74: paramContext = paramContext.getMacAddress();
        break label50;
      }
    }
    catch (Exception paramContext)
    {
      break label54;
    }
  }

  public static String f(Context paramContext)
  {
    AppMethodBeat.i(65181);
    if (!TextUtils.isEmpty(e))
    {
      paramContext = e;
      AppMethodBeat.o(65181);
    }
    while (true)
    {
      return paramContext;
      try
      {
        e = Settings.Secure.getString(paramContext.getContentResolver(), "android_id");
        label40: paramContext = e;
        AppMethodBeat.o(65181);
      }
      catch (Exception paramContext)
      {
        break label40;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.smtt.utils.b
 * JD-Core Version:    0.6.2
 */