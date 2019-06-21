package com.tencent.qqvideo.proxy.httpproxy;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public final class TVHttpProxyLoadLibrary
{
  public static final String ASSETS_LIBRARY_SRC_DIR = "libs/";
  private static Context mContext;
  private static final HashMap<String, WeakReference<ClassLoader>> mLoadedLibs;

  static
  {
    AppMethodBeat.i(124392);
    mLoadedLibs = new HashMap();
    mContext = null;
    AppMethodBeat.o(124392);
  }

  private static void extractAllLibraries(Context paramContext)
  {
    AppMethodBeat.i(124399);
    if (paramContext == null)
      AppMethodBeat.o(124399);
    while (true)
    {
      return;
      List localList = generateAbiList();
      File localFile1 = paramContext.getDir("recover_lib", 0);
      paramContext = new ZipFile(paramContext.getApplicationInfo().sourceDir);
      try
      {
        HashSet localHashSet = new java/util/HashSet;
        localHashSet.<init>();
        Pattern localPattern = Pattern.compile("lib/[A-Za-z0-9-_=]+/lib([A-Za-z0-9-_=]+)\\.so");
        Enumeration localEnumeration = paramContext.entries();
        while (true)
        {
          boolean bool = localEnumeration.hasMoreElements();
          if (!bool)
          {
            paramContext.close();
            AppMethodBeat.o(124399);
            break;
          }
          Object localObject2 = localPattern.matcher(((ZipEntry)localEnumeration.nextElement()).getName());
          if (((Matcher)localObject2).matches())
          {
            String str = ((Matcher)localObject2).group(1);
            if (!localHashSet.contains(str))
            {
              File localFile2 = new java/io/File;
              localObject2 = new java/lang/StringBuilder;
              ((StringBuilder)localObject2).<init>("lib");
              localFile2.<init>(localFile1, str + ".so");
              extractLibrary(paramContext, str, localList, localFile2);
              localHashSet.add(str);
            }
          }
        }
      }
      finally
      {
        paramContext.close();
        AppMethodBeat.o(124399);
      }
    }
  }

  private static boolean extractLibrary(ZipFile paramZipFile, String paramString, List<String> paramList, File paramFile)
  {
    AppMethodBeat.i(124398);
    boolean bool;
    if (paramFile.isFile())
    {
      AppMethodBeat.o(124398);
      bool = true;
    }
    while (true)
    {
      return bool;
      paramList = paramList.iterator();
      Object localObject;
      do
      {
        if (!paramList.hasNext())
        {
          AppMethodBeat.o(124398);
          bool = false;
          break;
        }
        localObject = (String)paramList.next();
        localObject = paramZipFile.getEntry("lib/" + (String)localObject + "/lib" + paramString + ".so");
      }
      while (localObject == null);
      paramString = paramZipFile.getInputStream((ZipEntry)localObject);
      paramZipFile = new FileOutputStream(paramFile);
      paramList = new byte[2048];
      try
      {
        while (true)
        {
          int i = paramString.read(paramList, 0, 2048);
          if (i == -1)
          {
            paramString.close();
            paramZipFile.close();
            paramFile.setReadOnly();
            AppMethodBeat.o(124398);
            bool = true;
            break;
          }
          paramZipFile.write(paramList, 0, i);
        }
      }
      finally
      {
        paramString.close();
        paramZipFile.close();
        AppMethodBeat.o(124398);
      }
    }
    throw paramList;
  }

  public static String find(String paramString, Context paramContext)
  {
    AppMethodBeat.i(124393);
    Object localObject1;
    if (paramContext == null)
    {
      AppMethodBeat.o(124393);
      localObject1 = null;
    }
    while (true)
    {
      return localObject1;
      try
      {
        localObject2 = TVHttpProxyLoadLibrary.class.getClassLoader();
        localObject1 = ClassLoader.class.getDeclaredMethod("findLibrary", new Class[] { String.class });
        ((Method)localObject1).setAccessible(true);
        localObject2 = (String)((Method)localObject1).invoke(localObject2, new Object[] { paramString });
        localObject1 = localObject2;
        if (localObject2 == null)
        {
          paramString = new File(paramContext.getDir("recover_lib", 0), "lib" + paramString + ".so");
          localObject1 = localObject2;
          if (paramString.canRead())
            localObject1 = paramString.getAbsolutePath();
        }
        AppMethodBeat.o(124393);
      }
      catch (Exception localException)
      {
        while (true)
          Object localObject2 = null;
      }
    }
  }

  private static List<String> generateAbiList()
  {
    AppMethodBeat.i(124397);
    ArrayList localArrayList = new ArrayList(3);
    Object localObject = Class.forName("android.os.SystemProperties").getMethod("get", new Class[] { String.class });
    String str = (String)((Method)localObject).invoke(null, new Object[] { "ro.product.cpu.abi" });
    if ((str != null) && (str.length() > 0))
      localArrayList.add(str);
    localObject = (String)((Method)localObject).invoke(null, new Object[] { "ro.product.cpu.abi2" });
    if ((localObject != null) && (((String)localObject).length() > 0))
      localArrayList.add(localObject);
    localArrayList.add("armeabi");
    AppMethodBeat.o(124397);
    return localArrayList;
  }

  // ERROR //
  public static void load(String paramString, ClassLoader paramClassLoader, Context arg2)
  {
    // Byte code:
    //   0: ldc_w 278
    //   3: invokestatic 24	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: aload_0
    //   7: ifnull +14 -> 21
    //   10: aload_0
    //   11: invokevirtual 261	java/lang/String:length	()I
    //   14: ifeq +7 -> 21
    //   17: aload_1
    //   18: ifnonnull +10 -> 28
    //   21: ldc_w 278
    //   24: invokestatic 36	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   27: return
    //   28: aload_2
    //   29: putstatic 33	com/tencent/qqvideo/proxy/httpproxy/TVHttpProxyLoadLibrary:mContext	Landroid/content/Context;
    //   32: getstatic 31	com/tencent/qqvideo/proxy/httpproxy/TVHttpProxyLoadLibrary:mLoadedLibs	Ljava/util/HashMap;
    //   35: astore_3
    //   36: aload_3
    //   37: monitorenter
    //   38: getstatic 31	com/tencent/qqvideo/proxy/httpproxy/TVHttpProxyLoadLibrary:mLoadedLibs	Ljava/util/HashMap;
    //   41: aload_0
    //   42: invokevirtual 281	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   45: checkcast 283	java/lang/ref/WeakReference
    //   48: astore 4
    //   50: aload 4
    //   52: ifnull +911 -> 963
    //   55: aload 4
    //   57: invokevirtual 285	java/lang/ref/WeakReference:get	()Ljava/lang/Object;
    //   60: checkcast 217	java/lang/ClassLoader
    //   63: astore 4
    //   65: aload 4
    //   67: ifnull +72 -> 139
    //   70: aload 4
    //   72: aload_1
    //   73: if_acmpne +14 -> 87
    //   76: aload_3
    //   77: monitorexit
    //   78: ldc_w 278
    //   81: invokestatic 36	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   84: goto -57 -> 27
    //   87: new 273	java/lang/UnsatisfiedLinkError
    //   90: astore_2
    //   91: new 128	java/lang/StringBuilder
    //   94: astore_1
    //   95: aload_1
    //   96: ldc_w 287
    //   99: invokespecial 131	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   102: aload_2
    //   103: aload_1
    //   104: aload_0
    //   105: invokevirtual 135	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   108: ldc_w 289
    //   111: invokevirtual 135	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   114: invokevirtual 140	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   117: invokespecial 290	java/lang/UnsatisfiedLinkError:<init>	(Ljava/lang/String;)V
    //   120: ldc_w 278
    //   123: invokestatic 36	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   126: aload_2
    //   127: athrow
    //   128: astore_0
    //   129: aload_3
    //   130: monitorexit
    //   131: ldc_w 278
    //   134: invokestatic 36	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   137: aload_0
    //   138: athrow
    //   139: aload_3
    //   140: monitorexit
    //   141: aload_2
    //   142: ifnonnull +130 -> 272
    //   145: aload_0
    //   146: aload_1
    //   147: invokestatic 294	com/tencent/qqvideo/proxy/httpproxy/TVHttpProxyLoadLibrary:reflectSystemLoadlibrary	(Ljava/lang/String;Ljava/lang/ClassLoader;)V
    //   150: getstatic 31	com/tencent/qqvideo/proxy/httpproxy/TVHttpProxyLoadLibrary:mLoadedLibs	Ljava/util/HashMap;
    //   153: astore_2
    //   154: aload_2
    //   155: monitorenter
    //   156: getstatic 31	com/tencent/qqvideo/proxy/httpproxy/TVHttpProxyLoadLibrary:mLoadedLibs	Ljava/util/HashMap;
    //   159: astore_3
    //   160: new 283	java/lang/ref/WeakReference
    //   163: astore 4
    //   165: aload 4
    //   167: aload_1
    //   168: invokespecial 297	java/lang/ref/WeakReference:<init>	(Ljava/lang/Object;)V
    //   171: aload_3
    //   172: aload_0
    //   173: aload 4
    //   175: invokevirtual 301	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   178: pop
    //   179: aload_2
    //   180: monitorexit
    //   181: ldc_w 278
    //   184: invokestatic 36	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   187: goto -160 -> 27
    //   190: astore_1
    //   191: new 273	java/lang/UnsatisfiedLinkError
    //   194: dup
    //   195: ldc_w 303
    //   198: aload_0
    //   199: invokestatic 307	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   202: invokevirtual 311	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   205: invokespecial 290	java/lang/UnsatisfiedLinkError:<init>	(Ljava/lang/String;)V
    //   208: aload_1
    //   209: invokevirtual 315	java/lang/reflect/InvocationTargetException:getCause	()Ljava/lang/Throwable;
    //   212: invokevirtual 319	java/lang/UnsatisfiedLinkError:initCause	(Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   215: checkcast 273	java/lang/UnsatisfiedLinkError
    //   218: astore_0
    //   219: ldc_w 278
    //   222: invokestatic 36	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   225: aload_0
    //   226: athrow
    //   227: astore_1
    //   228: aload_2
    //   229: monitorexit
    //   230: ldc_w 278
    //   233: invokestatic 36	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   236: aload_1
    //   237: athrow
    //   238: astore_1
    //   239: new 273	java/lang/UnsatisfiedLinkError
    //   242: dup
    //   243: ldc_w 303
    //   246: aload_0
    //   247: invokestatic 307	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   250: invokevirtual 311	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   253: invokespecial 290	java/lang/UnsatisfiedLinkError:<init>	(Ljava/lang/String;)V
    //   256: aload_1
    //   257: invokevirtual 319	java/lang/UnsatisfiedLinkError:initCause	(Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   260: checkcast 273	java/lang/UnsatisfiedLinkError
    //   263: astore_0
    //   264: ldc_w 278
    //   267: invokestatic 36	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   270: aload_0
    //   271: athrow
    //   272: new 126	java/io/File
    //   275: dup
    //   276: aload_2
    //   277: ldc 53
    //   279: iconst_0
    //   280: invokevirtual 59	android/content/Context:getDir	(Ljava/lang/String;I)Ljava/io/File;
    //   283: new 128	java/lang/StringBuilder
    //   286: dup
    //   287: ldc 130
    //   289: invokespecial 131	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   292: aload_0
    //   293: invokevirtual 135	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   296: ldc 137
    //   298: invokevirtual 135	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   301: invokevirtual 140	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   304: invokespecial 143	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   307: astore 5
    //   309: aload 5
    //   311: invokevirtual 154	java/io/File:isFile	()Z
    //   314: ifeq +643 -> 957
    //   317: aload 5
    //   319: invokevirtual 239	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   322: aload_1
    //   323: invokestatic 322	com/tencent/qqvideo/proxy/httpproxy/TVHttpProxyLoadLibrary:reflectSystemLoad	(Ljava/lang/String;Ljava/lang/ClassLoader;)V
    //   326: getstatic 31	com/tencent/qqvideo/proxy/httpproxy/TVHttpProxyLoadLibrary:mLoadedLibs	Ljava/util/HashMap;
    //   329: astore 4
    //   331: aload 4
    //   333: monitorenter
    //   334: getstatic 31	com/tencent/qqvideo/proxy/httpproxy/TVHttpProxyLoadLibrary:mLoadedLibs	Ljava/util/HashMap;
    //   337: astore 6
    //   339: new 283	java/lang/ref/WeakReference
    //   342: astore_3
    //   343: aload_3
    //   344: aload_1
    //   345: invokespecial 297	java/lang/ref/WeakReference:<init>	(Ljava/lang/Object;)V
    //   348: aload 6
    //   350: aload_0
    //   351: aload_3
    //   352: invokevirtual 301	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   355: pop
    //   356: aload 4
    //   358: monitorexit
    //   359: ldc_w 278
    //   362: invokestatic 36	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   365: goto -338 -> 27
    //   368: astore 4
    //   370: aload 5
    //   372: invokevirtual 325	java/io/File:delete	()Z
    //   375: pop
    //   376: aload_0
    //   377: aload_1
    //   378: invokestatic 294	com/tencent/qqvideo/proxy/httpproxy/TVHttpProxyLoadLibrary:reflectSystemLoadlibrary	(Ljava/lang/String;Ljava/lang/ClassLoader;)V
    //   381: getstatic 31	com/tencent/qqvideo/proxy/httpproxy/TVHttpProxyLoadLibrary:mLoadedLibs	Ljava/util/HashMap;
    //   384: astore_3
    //   385: aload_3
    //   386: monitorenter
    //   387: getstatic 31	com/tencent/qqvideo/proxy/httpproxy/TVHttpProxyLoadLibrary:mLoadedLibs	Ljava/util/HashMap;
    //   390: astore 7
    //   392: new 283	java/lang/ref/WeakReference
    //   395: astore 6
    //   397: aload 6
    //   399: aload_1
    //   400: invokespecial 297	java/lang/ref/WeakReference:<init>	(Ljava/lang/Object;)V
    //   403: aload 7
    //   405: aload_0
    //   406: aload 6
    //   408: invokevirtual 301	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   411: pop
    //   412: aload_3
    //   413: monitorexit
    //   414: ldc_w 278
    //   417: invokestatic 36	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   420: goto -393 -> 27
    //   423: astore_3
    //   424: aload 4
    //   426: ifnonnull +528 -> 954
    //   429: aload_3
    //   430: astore 4
    //   432: aload_2
    //   433: invokevirtual 65	android/content/Context:getApplicationInfo	()Landroid/content/pm/ApplicationInfo;
    //   436: getfield 70	android/content/pm/ApplicationInfo:sourceDir	Ljava/lang/String;
    //   439: astore_2
    //   440: new 61	java/util/zip/ZipFile
    //   443: astore_3
    //   444: aload_3
    //   445: aload_2
    //   446: invokespecial 73	java/util/zip/ZipFile:<init>	(Ljava/lang/String;)V
    //   449: aload_3
    //   450: astore_2
    //   451: aload_3
    //   452: aload_0
    //   453: invokestatic 51	com/tencent/qqvideo/proxy/httpproxy/TVHttpProxyLoadLibrary:generateAbiList	()Ljava/util/List;
    //   456: aload 5
    //   458: invokestatic 147	com/tencent/qqvideo/proxy/httpproxy/TVHttpProxyLoadLibrary:extractLibrary	(Ljava/util/zip/ZipFile;Ljava/lang/String;Ljava/util/List;Ljava/io/File;)Z
    //   461: ifne +318 -> 779
    //   464: aload_3
    //   465: astore_2
    //   466: new 327	java/lang/RuntimeException
    //   469: astore_1
    //   470: aload_3
    //   471: astore_2
    //   472: aload_1
    //   473: ldc_w 329
    //   476: aload_0
    //   477: invokestatic 307	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   480: invokevirtual 311	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   483: invokespecial 330	java/lang/RuntimeException:<init>	(Ljava/lang/String;)V
    //   486: aload_3
    //   487: astore_2
    //   488: ldc_w 278
    //   491: invokestatic 36	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   494: aload_3
    //   495: astore_2
    //   496: aload_1
    //   497: athrow
    //   498: astore_1
    //   499: aload_3
    //   500: astore_0
    //   501: aload_0
    //   502: astore_2
    //   503: new 273	java/lang/UnsatisfiedLinkError
    //   506: astore 4
    //   508: aload_0
    //   509: astore_2
    //   510: aload 4
    //   512: ldc_w 332
    //   515: invokespecial 290	java/lang/UnsatisfiedLinkError:<init>	(Ljava/lang/String;)V
    //   518: aload_0
    //   519: astore_2
    //   520: aload 4
    //   522: aload_1
    //   523: invokevirtual 319	java/lang/UnsatisfiedLinkError:initCause	(Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   526: checkcast 273	java/lang/UnsatisfiedLinkError
    //   529: astore_1
    //   530: aload_0
    //   531: astore_2
    //   532: ldc_w 278
    //   535: invokestatic 36	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   538: aload_0
    //   539: astore_2
    //   540: aload_1
    //   541: athrow
    //   542: astore_0
    //   543: aload_2
    //   544: ifnull +7 -> 551
    //   547: aload_2
    //   548: invokevirtual 97	java/util/zip/ZipFile:close	()V
    //   551: ldc_w 278
    //   554: invokestatic 36	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   557: aload_0
    //   558: athrow
    //   559: astore_3
    //   560: aload 4
    //   562: monitorexit
    //   563: ldc_w 278
    //   566: invokestatic 36	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   569: aload_3
    //   570: athrow
    //   571: astore 4
    //   573: aload 4
    //   575: invokevirtual 315	java/lang/reflect/InvocationTargetException:getCause	()Ljava/lang/Throwable;
    //   578: instanceof 273
    //   581: ifeq +16 -> 597
    //   584: aload 4
    //   586: invokevirtual 315	java/lang/reflect/InvocationTargetException:getCause	()Ljava/lang/Throwable;
    //   589: checkcast 273	java/lang/UnsatisfiedLinkError
    //   592: astore 4
    //   594: goto -224 -> 370
    //   597: new 273	java/lang/UnsatisfiedLinkError
    //   600: dup
    //   601: ldc_w 334
    //   604: aload_0
    //   605: invokestatic 307	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   608: invokevirtual 311	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   611: invokespecial 290	java/lang/UnsatisfiedLinkError:<init>	(Ljava/lang/String;)V
    //   614: aload 4
    //   616: invokevirtual 315	java/lang/reflect/InvocationTargetException:getCause	()Ljava/lang/Throwable;
    //   619: invokevirtual 319	java/lang/UnsatisfiedLinkError:initCause	(Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   622: checkcast 273	java/lang/UnsatisfiedLinkError
    //   625: astore_0
    //   626: ldc_w 278
    //   629: invokestatic 36	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   632: aload_0
    //   633: athrow
    //   634: astore_1
    //   635: new 273	java/lang/UnsatisfiedLinkError
    //   638: dup
    //   639: ldc_w 334
    //   642: aload_0
    //   643: invokestatic 307	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   646: invokevirtual 311	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   649: invokespecial 290	java/lang/UnsatisfiedLinkError:<init>	(Ljava/lang/String;)V
    //   652: aload_1
    //   653: invokevirtual 319	java/lang/UnsatisfiedLinkError:initCause	(Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   656: checkcast 273	java/lang/UnsatisfiedLinkError
    //   659: astore_0
    //   660: ldc_w 278
    //   663: invokestatic 36	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   666: aload_0
    //   667: athrow
    //   668: astore 6
    //   670: aload_3
    //   671: monitorexit
    //   672: ldc_w 278
    //   675: invokestatic 36	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   678: aload 6
    //   680: athrow
    //   681: astore_3
    //   682: aload_3
    //   683: invokevirtual 315	java/lang/reflect/InvocationTargetException:getCause	()Ljava/lang/Throwable;
    //   686: instanceof 273
    //   689: ifeq +20 -> 709
    //   692: aload 4
    //   694: ifnonnull +260 -> 954
    //   697: aload_3
    //   698: invokevirtual 315	java/lang/reflect/InvocationTargetException:getCause	()Ljava/lang/Throwable;
    //   701: checkcast 273	java/lang/UnsatisfiedLinkError
    //   704: astore 4
    //   706: goto -274 -> 432
    //   709: new 273	java/lang/UnsatisfiedLinkError
    //   712: dup
    //   713: ldc_w 334
    //   716: aload_0
    //   717: invokestatic 307	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   720: invokevirtual 311	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   723: invokespecial 290	java/lang/UnsatisfiedLinkError:<init>	(Ljava/lang/String;)V
    //   726: aload_3
    //   727: invokevirtual 315	java/lang/reflect/InvocationTargetException:getCause	()Ljava/lang/Throwable;
    //   730: invokevirtual 319	java/lang/UnsatisfiedLinkError:initCause	(Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   733: checkcast 273	java/lang/UnsatisfiedLinkError
    //   736: astore_0
    //   737: ldc_w 278
    //   740: invokestatic 36	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   743: aload_0
    //   744: athrow
    //   745: astore_1
    //   746: new 273	java/lang/UnsatisfiedLinkError
    //   749: dup
    //   750: ldc_w 334
    //   753: aload_0
    //   754: invokestatic 307	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   757: invokevirtual 311	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   760: invokespecial 290	java/lang/UnsatisfiedLinkError:<init>	(Ljava/lang/String;)V
    //   763: aload_1
    //   764: invokevirtual 319	java/lang/UnsatisfiedLinkError:initCause	(Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   767: checkcast 273	java/lang/UnsatisfiedLinkError
    //   770: astore_0
    //   771: ldc_w 278
    //   774: invokestatic 36	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   777: aload_0
    //   778: athrow
    //   779: aload_3
    //   780: invokevirtual 97	java/util/zip/ZipFile:close	()V
    //   783: aload 5
    //   785: invokevirtual 239	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   788: aload_1
    //   789: invokestatic 322	com/tencent/qqvideo/proxy/httpproxy/TVHttpProxyLoadLibrary:reflectSystemLoad	(Ljava/lang/String;Ljava/lang/ClassLoader;)V
    //   792: getstatic 31	com/tencent/qqvideo/proxy/httpproxy/TVHttpProxyLoadLibrary:mLoadedLibs	Ljava/util/HashMap;
    //   795: astore_2
    //   796: aload_2
    //   797: monitorenter
    //   798: getstatic 31	com/tencent/qqvideo/proxy/httpproxy/TVHttpProxyLoadLibrary:mLoadedLibs	Ljava/util/HashMap;
    //   801: astore 5
    //   803: new 283	java/lang/ref/WeakReference
    //   806: astore_3
    //   807: aload_3
    //   808: aload_1
    //   809: invokespecial 297	java/lang/ref/WeakReference:<init>	(Ljava/lang/Object;)V
    //   812: aload 5
    //   814: aload_0
    //   815: aload_3
    //   816: invokevirtual 301	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   819: pop
    //   820: aload_2
    //   821: monitorexit
    //   822: ldc_w 278
    //   825: invokestatic 36	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   828: goto -801 -> 27
    //   831: astore_1
    //   832: aload 4
    //   834: ifnonnull +82 -> 916
    //   837: new 273	java/lang/UnsatisfiedLinkError
    //   840: dup
    //   841: ldc_w 334
    //   844: aload_0
    //   845: invokestatic 307	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   848: invokevirtual 311	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   851: invokespecial 290	java/lang/UnsatisfiedLinkError:<init>	(Ljava/lang/String;)V
    //   854: aload_1
    //   855: invokevirtual 315	java/lang/reflect/InvocationTargetException:getCause	()Ljava/lang/Throwable;
    //   858: invokevirtual 319	java/lang/UnsatisfiedLinkError:initCause	(Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   861: checkcast 273	java/lang/UnsatisfiedLinkError
    //   864: astore_0
    //   865: ldc_w 278
    //   868: invokestatic 36	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   871: aload_0
    //   872: athrow
    //   873: astore_1
    //   874: aload_2
    //   875: monitorexit
    //   876: ldc_w 278
    //   879: invokestatic 36	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   882: aload_1
    //   883: athrow
    //   884: astore_0
    //   885: aload 4
    //   887: ifnonnull +38 -> 925
    //   890: new 273	java/lang/UnsatisfiedLinkError
    //   893: dup
    //   894: ldc_w 332
    //   897: invokespecial 290	java/lang/UnsatisfiedLinkError:<init>	(Ljava/lang/String;)V
    //   900: aload_0
    //   901: invokevirtual 319	java/lang/UnsatisfiedLinkError:initCause	(Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   904: checkcast 273	java/lang/UnsatisfiedLinkError
    //   907: astore_0
    //   908: ldc_w 278
    //   911: invokestatic 36	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   914: aload_0
    //   915: athrow
    //   916: ldc_w 278
    //   919: invokestatic 36	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   922: aload 4
    //   924: athrow
    //   925: ldc_w 278
    //   928: invokestatic 36	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   931: aload 4
    //   933: athrow
    //   934: astore_1
    //   935: goto -384 -> 551
    //   938: astore_2
    //   939: goto -156 -> 783
    //   942: astore_0
    //   943: aconst_null
    //   944: astore_2
    //   945: goto -402 -> 543
    //   948: astore_1
    //   949: aconst_null
    //   950: astore_0
    //   951: goto -450 -> 501
    //   954: goto -522 -> 432
    //   957: aconst_null
    //   958: astore 4
    //   960: goto -584 -> 376
    //   963: aconst_null
    //   964: astore 4
    //   966: goto -901 -> 65
    //
    // Exception table:
    //   from	to	target	type
    //   38	50	128	finally
    //   55	65	128	finally
    //   76	78	128	finally
    //   87	128	128	finally
    //   129	131	128	finally
    //   139	141	128	finally
    //   145	156	190	java/lang/reflect/InvocationTargetException
    //   181	187	190	java/lang/reflect/InvocationTargetException
    //   230	238	190	java/lang/reflect/InvocationTargetException
    //   156	181	227	finally
    //   228	230	227	finally
    //   145	156	238	java/lang/Exception
    //   181	187	238	java/lang/Exception
    //   230	238	238	java/lang/Exception
    //   317	334	368	java/lang/UnsatisfiedLinkError
    //   359	365	368	java/lang/UnsatisfiedLinkError
    //   563	571	368	java/lang/UnsatisfiedLinkError
    //   376	387	423	java/lang/UnsatisfiedLinkError
    //   414	420	423	java/lang/UnsatisfiedLinkError
    //   672	681	423	java/lang/UnsatisfiedLinkError
    //   451	464	498	java/lang/Exception
    //   466	470	498	java/lang/Exception
    //   472	486	498	java/lang/Exception
    //   488	494	498	java/lang/Exception
    //   496	498	498	java/lang/Exception
    //   451	464	542	finally
    //   466	470	542	finally
    //   472	486	542	finally
    //   488	494	542	finally
    //   496	498	542	finally
    //   503	508	542	finally
    //   510	518	542	finally
    //   520	530	542	finally
    //   532	538	542	finally
    //   540	542	542	finally
    //   334	359	559	finally
    //   560	563	559	finally
    //   317	334	571	java/lang/reflect/InvocationTargetException
    //   359	365	571	java/lang/reflect/InvocationTargetException
    //   563	571	571	java/lang/reflect/InvocationTargetException
    //   317	334	634	java/lang/Throwable
    //   359	365	634	java/lang/Throwable
    //   563	571	634	java/lang/Throwable
    //   387	414	668	finally
    //   670	672	668	finally
    //   376	387	681	java/lang/reflect/InvocationTargetException
    //   414	420	681	java/lang/reflect/InvocationTargetException
    //   672	681	681	java/lang/reflect/InvocationTargetException
    //   376	387	745	java/lang/Throwable
    //   414	420	745	java/lang/Throwable
    //   672	681	745	java/lang/Throwable
    //   783	798	831	java/lang/reflect/InvocationTargetException
    //   822	828	831	java/lang/reflect/InvocationTargetException
    //   876	884	831	java/lang/reflect/InvocationTargetException
    //   798	822	873	finally
    //   874	876	873	finally
    //   783	798	884	java/lang/Exception
    //   822	828	884	java/lang/Exception
    //   876	884	884	java/lang/Exception
    //   547	551	934	java/io/IOException
    //   779	783	938	java/io/IOException
    //   432	449	942	finally
    //   432	449	948	java/lang/Exception
  }

  private static void reflectSystemLoad(String paramString, ClassLoader paramClassLoader)
  {
    AppMethodBeat.i(124395);
    Runtime localRuntime = Runtime.getRuntime();
    Method localMethod = localRuntime.getClass().getDeclaredMethod("load", new Class[] { String.class, ClassLoader.class });
    localMethod.setAccessible(true);
    localMethod.invoke(localRuntime, new Object[] { paramString, paramClassLoader });
    AppMethodBeat.o(124395);
  }

  private static void reflectSystemLoadlibrary(String paramString, ClassLoader paramClassLoader)
  {
    AppMethodBeat.i(124396);
    Runtime localRuntime = Runtime.getRuntime();
    Method localMethod = localRuntime.getClass().getDeclaredMethod("loadLibrary", new Class[] { String.class, ClassLoader.class });
    localMethod.setAccessible(true);
    localMethod.invoke(localRuntime, new Object[] { paramString, paramClassLoader });
    AppMethodBeat.o(124396);
  }

  public static void setupBrokenLibraryHandler()
  {
    AppMethodBeat.i(124400);
    Thread.setDefaultUncaughtExceptionHandler(new TVHttpProxyLoadLibrary.LibraryBrokenHandler(Thread.getDefaultUncaughtExceptionHandler()));
    AppMethodBeat.o(124400);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.qqvideo.proxy.httpproxy.TVHttpProxyLoadLibrary
 * JD-Core Version:    0.6.2
 */