package com.tencent.ttpic.device;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.ttpic.baseutils.LogUtils;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class DeviceUpdate
{
  private static final String CHARSET_UTF8 = "UTF-8";
  private static final int DEFAULT_TIMEOUT_MILLIS = 10000;
  private static final String TAG;

  static
  {
    AppMethodBeat.i(49867);
    TAG = DeviceUpdate.class.getSimpleName();
    AppMethodBeat.o(49867);
  }

  private static HttpURLConnection buildConnection(String paramString, int paramInt)
  {
    AppMethodBeat.i(49864);
    paramString = (HttpURLConnection)new URL(paramString).openConnection();
    paramString.setConnectTimeout(paramInt);
    paramString.setReadTimeout(paramInt);
    AppMethodBeat.o(49864);
    return paramString;
  }

  public static String checkConfigVersion(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    AppMethodBeat.i(49859);
    Object localObject = null;
    HashMap localHashMap = new HashMap();
    localHashMap.put("PackageName", paramString2);
    localHashMap.put("camCoreVersion", paramString3);
    localHashMap.put("AppId", paramString4);
    localHashMap.put("AppVersion", paramString5);
    try
    {
      paramString1 = post(paramString1, localHashMap);
      AppMethodBeat.o(49859);
      return paramString1;
    }
    catch (Exception paramString1)
    {
      while (true)
      {
        LogUtils.d(TAG, "checkConfigVersion Exception! e = ".concat(String.valueOf(paramString1)));
        paramString1 = localObject;
      }
    }
  }

  public static String get(String paramString)
  {
    AppMethodBeat.i(49860);
    paramString = get(paramString, 10000);
    AppMethodBeat.o(49860);
    return paramString;
  }

  public static String get(String paramString, int paramInt)
  {
    AppMethodBeat.i(49861);
    paramString = buildConnection(paramString, paramInt);
    paramString.setRequestMethod("GET");
    paramString = getResponse(paramString);
    AppMethodBeat.o(49861);
    return paramString;
  }

  private static String getResponse(HttpURLConnection paramHttpURLConnection)
  {
    AppMethodBeat.i(49865);
    if (paramHttpURLConnection.getResponseCode() == 200)
    {
      InputStream localInputStream = paramHttpURLConnection.getInputStream();
      StringBuilder localStringBuilder = new StringBuilder();
      paramHttpURLConnection = new byte[1024];
      while (true)
      {
        int i = localInputStream.read(paramHttpURLConnection);
        if (i == -1)
          break;
        localStringBuilder.append(new String(paramHttpURLConnection, 0, i));
      }
      localInputStream.close();
      paramHttpURLConnection = localStringBuilder.toString();
      AppMethodBeat.o(49865);
    }
    while (true)
    {
      return paramHttpURLConnection;
      paramHttpURLConnection = null;
      AppMethodBeat.o(49865);
    }
  }

  // ERROR //
  public static boolean httpDownloadFile(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: ldc 151
    //   2: invokestatic 21	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: getstatic 29	com/tencent/ttpic/device/DeviceUpdate:TAG	Ljava/lang/String;
    //   8: ldc 153
    //   10: invokestatic 98	com/tencent/ttpic/baseutils/LogUtils:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   13: new 41	java/net/URL
    //   16: astore_2
    //   17: aload_2
    //   18: aload_0
    //   19: invokespecial 44	java/net/URL:<init>	(Ljava/lang/String;)V
    //   22: aload_2
    //   23: invokevirtual 48	java/net/URL:openConnection	()Ljava/net/URLConnection;
    //   26: checkcast 50	java/net/HttpURLConnection
    //   29: astore_3
    //   30: aload_3
    //   31: sipush 5000
    //   34: invokevirtual 53	java/net/HttpURLConnection:setConnectTimeout	(I)V
    //   37: aload_3
    //   38: ldc 108
    //   40: invokevirtual 111	java/net/HttpURLConnection:setRequestMethod	(Ljava/lang/String;)V
    //   43: new 155	java/io/File
    //   46: astore_2
    //   47: aload_2
    //   48: aload_1
    //   49: invokespecial 156	java/io/File:<init>	(Ljava/lang/String;)V
    //   52: aload_2
    //   53: invokevirtual 160	java/io/File:exists	()Z
    //   56: ifeq +16 -> 72
    //   59: getstatic 29	com/tencent/ttpic/device/DeviceUpdate:TAG	Ljava/lang/String;
    //   62: ldc 162
    //   64: invokestatic 98	com/tencent/ttpic/baseutils/LogUtils:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   67: aload_2
    //   68: invokevirtual 165	java/io/File:delete	()Z
    //   71: pop
    //   72: getstatic 29	com/tencent/ttpic/device/DeviceUpdate:TAG	Ljava/lang/String;
    //   75: ldc 167
    //   77: invokestatic 98	com/tencent/ttpic/baseutils/LogUtils:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   80: aload_2
    //   81: invokevirtual 170	java/io/File:createNewFile	()Z
    //   84: pop
    //   85: aload_3
    //   86: invokevirtual 124	java/net/HttpURLConnection:getInputStream	()Ljava/io/InputStream;
    //   89: astore_0
    //   90: new 172	java/io/FileOutputStream
    //   93: astore_1
    //   94: aload_1
    //   95: aload_2
    //   96: invokespecial 175	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   99: aload_1
    //   100: astore 4
    //   102: aload_0
    //   103: astore_2
    //   104: sipush 4096
    //   107: newarray byte
    //   109: astore 5
    //   111: aload_1
    //   112: astore 4
    //   114: aload_0
    //   115: astore_2
    //   116: aload_0
    //   117: aload 5
    //   119: invokevirtual 133	java/io/InputStream:read	([B)I
    //   122: istore 6
    //   124: iload 6
    //   126: iconst_m1
    //   127: if_icmpeq +80 -> 207
    //   130: aload_1
    //   131: astore 4
    //   133: aload_0
    //   134: astore_2
    //   135: aload_1
    //   136: aload 5
    //   138: iconst_0
    //   139: iload 6
    //   141: invokevirtual 180	java/io/OutputStream:write	([BII)V
    //   144: goto -33 -> 111
    //   147: astore 5
    //   149: aload_1
    //   150: astore 4
    //   152: aload_0
    //   153: astore_2
    //   154: getstatic 29	com/tencent/ttpic/device/DeviceUpdate:TAG	Ljava/lang/String;
    //   157: ldc 182
    //   159: invokestatic 98	com/tencent/ttpic/baseutils/LogUtils:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   162: aload_1
    //   163: astore 4
    //   165: aload_0
    //   166: astore_2
    //   167: aload 5
    //   169: invokestatic 186	com/tencent/ttpic/baseutils/LogUtils:e	(Ljava/lang/Throwable;)V
    //   172: aload_3
    //   173: ifnull +7 -> 180
    //   176: aload_3
    //   177: invokevirtual 189	java/net/HttpURLConnection:disconnect	()V
    //   180: aload_0
    //   181: ifnull +7 -> 188
    //   184: aload_0
    //   185: invokevirtual 143	java/io/InputStream:close	()V
    //   188: aload_1
    //   189: ifnull +116 -> 305
    //   192: aload_1
    //   193: invokevirtual 190	java/io/OutputStream:close	()V
    //   196: iconst_0
    //   197: istore 7
    //   199: ldc 151
    //   201: invokestatic 32	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   204: iload 7
    //   206: ireturn
    //   207: aload_1
    //   208: astore 4
    //   210: aload_0
    //   211: astore_2
    //   212: aload_1
    //   213: invokevirtual 193	java/io/OutputStream:flush	()V
    //   216: aload_1
    //   217: astore 4
    //   219: aload_0
    //   220: astore_2
    //   221: getstatic 29	com/tencent/ttpic/device/DeviceUpdate:TAG	Ljava/lang/String;
    //   224: ldc 195
    //   226: invokestatic 98	com/tencent/ttpic/baseutils/LogUtils:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   229: aload_3
    //   230: ifnull +7 -> 237
    //   233: aload_3
    //   234: invokevirtual 189	java/net/HttpURLConnection:disconnect	()V
    //   237: aload_0
    //   238: ifnull +7 -> 245
    //   241: aload_0
    //   242: invokevirtual 143	java/io/InputStream:close	()V
    //   245: aload_1
    //   246: invokevirtual 190	java/io/OutputStream:close	()V
    //   249: iconst_1
    //   250: istore 7
    //   252: goto -53 -> 199
    //   255: astore_1
    //   256: aconst_null
    //   257: astore 4
    //   259: aconst_null
    //   260: astore_0
    //   261: aload_3
    //   262: ifnull +7 -> 269
    //   265: aload_3
    //   266: invokevirtual 189	java/net/HttpURLConnection:disconnect	()V
    //   269: aload_0
    //   270: ifnull +7 -> 277
    //   273: aload_0
    //   274: invokevirtual 143	java/io/InputStream:close	()V
    //   277: aload 4
    //   279: ifnull +8 -> 287
    //   282: aload 4
    //   284: invokevirtual 190	java/io/OutputStream:close	()V
    //   287: ldc 151
    //   289: invokestatic 32	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   292: aload_1
    //   293: athrow
    //   294: astore_0
    //   295: aload_0
    //   296: invokestatic 186	com/tencent/ttpic/baseutils/LogUtils:e	(Ljava/lang/Throwable;)V
    //   299: iconst_0
    //   300: istore 7
    //   302: goto -103 -> 199
    //   305: iconst_0
    //   306: istore 7
    //   308: goto -109 -> 199
    //   311: astore_1
    //   312: aconst_null
    //   313: astore 4
    //   315: goto -54 -> 261
    //   318: astore_1
    //   319: aload_2
    //   320: astore_0
    //   321: goto -60 -> 261
    //   324: astore 5
    //   326: aconst_null
    //   327: astore_1
    //   328: aconst_null
    //   329: astore_0
    //   330: goto -181 -> 149
    //   333: astore 5
    //   335: aconst_null
    //   336: astore_1
    //   337: goto -188 -> 149
    //
    // Exception table:
    //   from	to	target	type
    //   104	111	147	java/lang/Exception
    //   116	124	147	java/lang/Exception
    //   135	144	147	java/lang/Exception
    //   212	216	147	java/lang/Exception
    //   221	229	147	java/lang/Exception
    //   85	90	255	finally
    //   13	72	294	java/io/IOException
    //   72	85	294	java/io/IOException
    //   176	180	294	java/io/IOException
    //   184	188	294	java/io/IOException
    //   192	196	294	java/io/IOException
    //   233	237	294	java/io/IOException
    //   241	245	294	java/io/IOException
    //   245	249	294	java/io/IOException
    //   265	269	294	java/io/IOException
    //   273	277	294	java/io/IOException
    //   282	287	294	java/io/IOException
    //   287	294	294	java/io/IOException
    //   90	99	311	finally
    //   104	111	318	finally
    //   116	124	318	finally
    //   135	144	318	finally
    //   154	162	318	finally
    //   167	172	318	finally
    //   212	216	318	finally
    //   221	229	318	finally
    //   85	90	324	java/lang/Exception
    //   90	99	333	java/lang/Exception
  }

  public static String post(String paramString, HashMap<String, String> paramHashMap)
  {
    AppMethodBeat.i(49862);
    paramString = post(paramString, paramHashMap, 10000);
    AppMethodBeat.o(49862);
    return paramString;
  }

  public static String post(String paramString, HashMap<String, String> paramHashMap, int paramInt)
  {
    AppMethodBeat.i(49863);
    HttpURLConnection localHttpURLConnection = buildConnection(paramString, paramInt);
    localHttpURLConnection.setRequestMethod("POST");
    if ((paramHashMap != null) && (!paramHashMap.isEmpty()))
    {
      OutputStream localOutputStream = localHttpURLConnection.getOutputStream();
      paramString = new BufferedWriter(new OutputStreamWriter(localOutputStream, "UTF-8"));
      StringBuilder localStringBuilder = new StringBuilder("");
      Iterator localIterator = paramHashMap.keySet().iterator();
      while (localIterator.hasNext())
      {
        if (localStringBuilder.indexOf("=") > 0)
          localStringBuilder.append("&");
        String str = (String)localIterator.next();
        localStringBuilder.append(URLEncoder.encode(str, "UTF-8")).append("=").append(URLEncoder.encode((String)paramHashMap.get(str), "UTF-8"));
      }
      paramString.write(localStringBuilder.toString());
      paramString.flush();
      paramString.close();
      localOutputStream.close();
    }
    paramString = getResponse(localHttpURLConnection);
    AppMethodBeat.o(49863);
    return paramString;
  }

  // ERROR //
  public static String unZip(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: ldc_w 269
    //   3: invokestatic 21	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: ldc 223
    //   8: astore_2
    //   9: new 271	java/io/FileInputStream
    //   12: astore_3
    //   13: aload_3
    //   14: aload_0
    //   15: invokespecial 272	java/io/FileInputStream:<init>	(Ljava/lang/String;)V
    //   18: aload_2
    //   19: astore 4
    //   21: aload_3
    //   22: ifnull +401 -> 423
    //   25: new 274	java/util/zip/ZipInputStream
    //   28: dup
    //   29: new 276	java/io/BufferedInputStream
    //   32: dup
    //   33: aload_3
    //   34: invokespecial 279	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   37: invokespecial 280	java/util/zip/ZipInputStream:<init>	(Ljava/io/InputStream;)V
    //   40: astore 5
    //   42: aconst_null
    //   43: astore_0
    //   44: aconst_null
    //   45: astore 6
    //   47: aload_2
    //   48: astore 4
    //   50: aload 5
    //   52: invokevirtual 284	java/util/zip/ZipInputStream:getNextEntry	()Ljava/util/zip/ZipEntry;
    //   55: astore_2
    //   56: aload_2
    //   57: ifnull +571 -> 628
    //   60: aload_2
    //   61: invokevirtual 289	java/util/zip/ZipEntry:getName	()Ljava/lang/String;
    //   64: astore 7
    //   66: aload 7
    //   68: ldc_w 291
    //   71: invokevirtual 295	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   74: ifne -24 -> 50
    //   77: new 155	java/io/File
    //   80: astore 8
    //   82: new 126	java/lang/StringBuilder
    //   85: astore_2
    //   86: aload_2
    //   87: invokespecial 127	java/lang/StringBuilder:<init>	()V
    //   90: aload 8
    //   92: aload_2
    //   93: aload_1
    //   94: invokevirtual 140	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   97: aload 7
    //   99: invokevirtual 140	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   102: invokevirtual 146	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   105: invokespecial 156	java/io/File:<init>	(Ljava/lang/String;)V
    //   108: aload 8
    //   110: invokevirtual 298	java/io/File:getParent	()Ljava/lang/String;
    //   113: astore_2
    //   114: aload_2
    //   115: ifnull -65 -> 50
    //   118: new 155	java/io/File
    //   121: astore 7
    //   123: aload 7
    //   125: aload_2
    //   126: invokespecial 156	java/io/File:<init>	(Ljava/lang/String;)V
    //   129: aload 7
    //   131: invokevirtual 160	java/io/File:exists	()Z
    //   134: ifne +9 -> 143
    //   137: aload 7
    //   139: invokevirtual 301	java/io/File:mkdirs	()Z
    //   142: pop
    //   143: new 172	java/io/FileOutputStream
    //   146: astore_2
    //   147: aload_2
    //   148: aload 8
    //   150: invokespecial 175	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   153: new 303	java/io/BufferedOutputStream
    //   156: astore 6
    //   158: aload 6
    //   160: aload_2
    //   161: sipush 4096
    //   164: invokespecial 306	java/io/BufferedOutputStream:<init>	(Ljava/io/OutputStream;I)V
    //   167: aload 6
    //   169: astore 9
    //   171: aload_2
    //   172: astore 7
    //   174: sipush 4096
    //   177: newarray byte
    //   179: astore_0
    //   180: aload 6
    //   182: astore 9
    //   184: aload_2
    //   185: astore 7
    //   187: aload 5
    //   189: aload_0
    //   190: iconst_0
    //   191: sipush 4096
    //   194: invokevirtual 309	java/util/zip/ZipInputStream:read	([BII)I
    //   197: istore 10
    //   199: iload 10
    //   201: iconst_m1
    //   202: if_icmpeq +74 -> 276
    //   205: aload 6
    //   207: astore 9
    //   209: aload_2
    //   210: astore 7
    //   212: aload 6
    //   214: aload_0
    //   215: iconst_0
    //   216: iload 10
    //   218: invokevirtual 310	java/io/BufferedOutputStream:write	([BII)V
    //   221: goto -41 -> 180
    //   224: astore 7
    //   226: aload 6
    //   228: astore_0
    //   229: aload 7
    //   231: astore 6
    //   233: aload_0
    //   234: astore 9
    //   236: aload_2
    //   237: astore 7
    //   239: aload 6
    //   241: invokestatic 186	com/tencent/ttpic/baseutils/LogUtils:e	(Ljava/lang/Throwable;)V
    //   244: aload_0
    //   245: ifnull +7 -> 252
    //   248: aload_0
    //   249: invokevirtual 311	java/io/BufferedOutputStream:close	()V
    //   252: aload_2
    //   253: ifnull +7 -> 260
    //   256: aload_2
    //   257: invokevirtual 312	java/io/FileOutputStream:close	()V
    //   260: aload_2
    //   261: astore 6
    //   263: goto -213 -> 50
    //   266: astore_0
    //   267: aload_0
    //   268: invokestatic 186	com/tencent/ttpic/baseutils/LogUtils:e	(Ljava/lang/Throwable;)V
    //   271: aconst_null
    //   272: astore_3
    //   273: goto -255 -> 18
    //   276: aload 6
    //   278: astore 9
    //   280: aload_2
    //   281: astore 7
    //   283: aload 6
    //   285: invokevirtual 313	java/io/BufferedOutputStream:flush	()V
    //   288: aload 6
    //   290: astore 9
    //   292: aload_2
    //   293: astore 7
    //   295: aload 8
    //   297: invokevirtual 316	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   300: astore_0
    //   301: aload 6
    //   303: invokevirtual 311	java/io/BufferedOutputStream:close	()V
    //   306: aload_2
    //   307: invokevirtual 312	java/io/FileOutputStream:close	()V
    //   310: aload 6
    //   312: astore 7
    //   314: aload_2
    //   315: astore 6
    //   317: aload_0
    //   318: astore 4
    //   320: aload 7
    //   322: astore_0
    //   323: goto -273 -> 50
    //   326: astore 4
    //   328: aload 4
    //   330: invokestatic 186	com/tencent/ttpic/baseutils/LogUtils:e	(Ljava/lang/Throwable;)V
    //   333: aload 6
    //   335: astore 7
    //   337: aload_2
    //   338: astore 6
    //   340: aload_0
    //   341: astore 4
    //   343: aload 7
    //   345: astore_0
    //   346: goto -296 -> 50
    //   349: astore 4
    //   351: aload 4
    //   353: invokestatic 186	com/tencent/ttpic/baseutils/LogUtils:e	(Ljava/lang/Throwable;)V
    //   356: aload_2
    //   357: invokevirtual 312	java/io/FileOutputStream:close	()V
    //   360: aload_0
    //   361: astore 4
    //   363: aload 6
    //   365: astore_0
    //   366: aload_2
    //   367: astore 6
    //   369: goto -319 -> 50
    //   372: astore 4
    //   374: aload 4
    //   376: invokestatic 186	com/tencent/ttpic/baseutils/LogUtils:e	(Ljava/lang/Throwable;)V
    //   379: aload_0
    //   380: astore 4
    //   382: aload 6
    //   384: astore_0
    //   385: aload_2
    //   386: astore 6
    //   388: goto -338 -> 50
    //   391: astore_1
    //   392: aload_2
    //   393: invokevirtual 312	java/io/FileOutputStream:close	()V
    //   396: ldc_w 269
    //   399: invokestatic 32	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   402: aload_1
    //   403: athrow
    //   404: astore_1
    //   405: aload_0
    //   406: astore 4
    //   408: aload_1
    //   409: astore_0
    //   410: aload_0
    //   411: invokestatic 186	com/tencent/ttpic/baseutils/LogUtils:e	(Ljava/lang/Throwable;)V
    //   414: aload 5
    //   416: invokevirtual 317	java/util/zip/ZipInputStream:close	()V
    //   419: aload_3
    //   420: invokevirtual 318	java/io/FileInputStream:close	()V
    //   423: ldc_w 269
    //   426: invokestatic 32	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   429: aload 4
    //   431: areturn
    //   432: astore 6
    //   434: aload 6
    //   436: invokestatic 186	com/tencent/ttpic/baseutils/LogUtils:e	(Ljava/lang/Throwable;)V
    //   439: goto -43 -> 396
    //   442: astore_0
    //   443: aload 5
    //   445: invokevirtual 317	java/util/zip/ZipInputStream:close	()V
    //   448: aload_3
    //   449: invokevirtual 318	java/io/FileInputStream:close	()V
    //   452: ldc_w 269
    //   455: invokestatic 32	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   458: aload_0
    //   459: athrow
    //   460: astore 6
    //   462: aload 6
    //   464: invokestatic 186	com/tencent/ttpic/baseutils/LogUtils:e	(Ljava/lang/Throwable;)V
    //   467: aload_2
    //   468: astore 6
    //   470: goto -420 -> 50
    //   473: astore 6
    //   475: aload 6
    //   477: invokestatic 186	com/tencent/ttpic/baseutils/LogUtils:e	(Ljava/lang/Throwable;)V
    //   480: aload_2
    //   481: ifnull +7 -> 488
    //   484: aload_2
    //   485: invokevirtual 312	java/io/FileOutputStream:close	()V
    //   488: aload_2
    //   489: astore 6
    //   491: goto -441 -> 50
    //   494: astore 6
    //   496: aload 6
    //   498: invokestatic 186	com/tencent/ttpic/baseutils/LogUtils:e	(Ljava/lang/Throwable;)V
    //   501: aload_2
    //   502: astore 6
    //   504: goto -454 -> 50
    //   507: astore_0
    //   508: aload_2
    //   509: ifnull +7 -> 516
    //   512: aload_2
    //   513: invokevirtual 312	java/io/FileOutputStream:close	()V
    //   516: ldc_w 269
    //   519: invokestatic 32	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   522: aload_0
    //   523: athrow
    //   524: astore_0
    //   525: goto -115 -> 410
    //   528: astore_1
    //   529: aload_1
    //   530: invokestatic 186	com/tencent/ttpic/baseutils/LogUtils:e	(Ljava/lang/Throwable;)V
    //   533: goto -17 -> 516
    //   536: astore_1
    //   537: aload 6
    //   539: astore_2
    //   540: aload_0
    //   541: astore 9
    //   543: aload_1
    //   544: astore_0
    //   545: aload 9
    //   547: ifnull +8 -> 555
    //   550: aload 9
    //   552: invokevirtual 311	java/io/BufferedOutputStream:close	()V
    //   555: aload_2
    //   556: ifnull +7 -> 563
    //   559: aload_2
    //   560: invokevirtual 312	java/io/FileOutputStream:close	()V
    //   563: ldc_w 269
    //   566: invokestatic 32	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   569: aload_0
    //   570: athrow
    //   571: astore_1
    //   572: aload_1
    //   573: invokestatic 186	com/tencent/ttpic/baseutils/LogUtils:e	(Ljava/lang/Throwable;)V
    //   576: goto -13 -> 563
    //   579: astore_1
    //   580: aload_1
    //   581: invokestatic 186	com/tencent/ttpic/baseutils/LogUtils:e	(Ljava/lang/Throwable;)V
    //   584: aload_2
    //   585: ifnull -22 -> 563
    //   588: aload_2
    //   589: invokevirtual 312	java/io/FileOutputStream:close	()V
    //   592: goto -29 -> 563
    //   595: astore_1
    //   596: aload_1
    //   597: invokestatic 186	com/tencent/ttpic/baseutils/LogUtils:e	(Ljava/lang/Throwable;)V
    //   600: goto -37 -> 563
    //   603: astore_0
    //   604: aload_2
    //   605: ifnull +7 -> 612
    //   608: aload_2
    //   609: invokevirtual 312	java/io/FileOutputStream:close	()V
    //   612: ldc_w 269
    //   615: invokestatic 32	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   618: aload_0
    //   619: athrow
    //   620: astore_1
    //   621: aload_1
    //   622: invokestatic 186	com/tencent/ttpic/baseutils/LogUtils:e	(Ljava/lang/Throwable;)V
    //   625: goto -13 -> 612
    //   628: aload 5
    //   630: invokevirtual 317	java/util/zip/ZipInputStream:close	()V
    //   633: aload_3
    //   634: invokevirtual 318	java/io/FileInputStream:close	()V
    //   637: goto -214 -> 423
    //   640: astore_0
    //   641: aload_0
    //   642: invokestatic 186	com/tencent/ttpic/baseutils/LogUtils:e	(Ljava/lang/Throwable;)V
    //   645: goto -222 -> 423
    //   648: astore_0
    //   649: aload_0
    //   650: invokestatic 186	com/tencent/ttpic/baseutils/LogUtils:e	(Ljava/lang/Throwable;)V
    //   653: aload_3
    //   654: invokevirtual 318	java/io/FileInputStream:close	()V
    //   657: goto -234 -> 423
    //   660: astore_0
    //   661: aload_0
    //   662: invokestatic 186	com/tencent/ttpic/baseutils/LogUtils:e	(Ljava/lang/Throwable;)V
    //   665: goto -242 -> 423
    //   668: astore_0
    //   669: aload_3
    //   670: invokevirtual 318	java/io/FileInputStream:close	()V
    //   673: ldc_w 269
    //   676: invokestatic 32	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   679: aload_0
    //   680: athrow
    //   681: astore_1
    //   682: aload_1
    //   683: invokestatic 186	com/tencent/ttpic/baseutils/LogUtils:e	(Ljava/lang/Throwable;)V
    //   686: goto -13 -> 673
    //   689: astore_0
    //   690: aload_0
    //   691: invokestatic 186	com/tencent/ttpic/baseutils/LogUtils:e	(Ljava/lang/Throwable;)V
    //   694: goto -271 -> 423
    //   697: astore_0
    //   698: aload_0
    //   699: invokestatic 186	com/tencent/ttpic/baseutils/LogUtils:e	(Ljava/lang/Throwable;)V
    //   702: aload_3
    //   703: invokevirtual 318	java/io/FileInputStream:close	()V
    //   706: goto -283 -> 423
    //   709: astore_0
    //   710: aload_0
    //   711: invokestatic 186	com/tencent/ttpic/baseutils/LogUtils:e	(Ljava/lang/Throwable;)V
    //   714: goto -291 -> 423
    //   717: astore_0
    //   718: aload_3
    //   719: invokevirtual 318	java/io/FileInputStream:close	()V
    //   722: ldc_w 269
    //   725: invokestatic 32	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   728: aload_0
    //   729: athrow
    //   730: astore_1
    //   731: aload_1
    //   732: invokestatic 186	com/tencent/ttpic/baseutils/LogUtils:e	(Ljava/lang/Throwable;)V
    //   735: goto -13 -> 722
    //   738: astore_1
    //   739: aload_1
    //   740: invokestatic 186	com/tencent/ttpic/baseutils/LogUtils:e	(Ljava/lang/Throwable;)V
    //   743: goto -291 -> 452
    //   746: astore_1
    //   747: aload_1
    //   748: invokestatic 186	com/tencent/ttpic/baseutils/LogUtils:e	(Ljava/lang/Throwable;)V
    //   751: aload_3
    //   752: invokevirtual 318	java/io/FileInputStream:close	()V
    //   755: goto -303 -> 452
    //   758: astore_1
    //   759: aload_1
    //   760: invokestatic 186	com/tencent/ttpic/baseutils/LogUtils:e	(Ljava/lang/Throwable;)V
    //   763: goto -311 -> 452
    //   766: astore_0
    //   767: aload_3
    //   768: invokevirtual 318	java/io/FileInputStream:close	()V
    //   771: ldc_w 269
    //   774: invokestatic 32	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   777: aload_0
    //   778: athrow
    //   779: astore_1
    //   780: aload_1
    //   781: invokestatic 186	com/tencent/ttpic/baseutils/LogUtils:e	(Ljava/lang/Throwable;)V
    //   784: goto -13 -> 771
    //   787: astore_1
    //   788: aload_0
    //   789: astore 9
    //   791: aload_1
    //   792: astore_0
    //   793: goto -248 -> 545
    //   796: astore_0
    //   797: aload 7
    //   799: astore_2
    //   800: goto -255 -> 545
    //   803: astore 7
    //   805: aload 6
    //   807: astore_2
    //   808: aload 7
    //   810: astore 6
    //   812: goto -579 -> 233
    //   815: astore 6
    //   817: goto -584 -> 233
    //
    // Exception table:
    //   from	to	target	type
    //   174	180	224	java/lang/Exception
    //   187	199	224	java/lang/Exception
    //   212	221	224	java/lang/Exception
    //   283	288	224	java/lang/Exception
    //   295	301	224	java/lang/Exception
    //   9	18	266	java/io/FileNotFoundException
    //   306	310	326	java/lang/Exception
    //   301	306	349	java/lang/Exception
    //   356	360	372	java/lang/Exception
    //   301	306	391	finally
    //   351	356	391	finally
    //   328	333	404	java/lang/Exception
    //   374	379	404	java/lang/Exception
    //   396	404	404	java/lang/Exception
    //   434	439	404	java/lang/Exception
    //   392	396	432	java/lang/Exception
    //   50	56	442	finally
    //   60	114	442	finally
    //   118	143	442	finally
    //   256	260	442	finally
    //   306	310	442	finally
    //   328	333	442	finally
    //   356	360	442	finally
    //   374	379	442	finally
    //   392	396	442	finally
    //   396	404	442	finally
    //   410	414	442	finally
    //   434	439	442	finally
    //   462	467	442	finally
    //   484	488	442	finally
    //   496	501	442	finally
    //   512	516	442	finally
    //   516	524	442	finally
    //   529	533	442	finally
    //   559	563	442	finally
    //   563	571	442	finally
    //   572	576	442	finally
    //   588	592	442	finally
    //   596	600	442	finally
    //   608	612	442	finally
    //   612	620	442	finally
    //   621	625	442	finally
    //   256	260	460	java/lang/Exception
    //   248	252	473	java/lang/Exception
    //   484	488	494	java/lang/Exception
    //   248	252	507	finally
    //   475	480	507	finally
    //   50	56	524	java/lang/Exception
    //   60	114	524	java/lang/Exception
    //   118	143	524	java/lang/Exception
    //   462	467	524	java/lang/Exception
    //   496	501	524	java/lang/Exception
    //   516	524	524	java/lang/Exception
    //   529	533	524	java/lang/Exception
    //   563	571	524	java/lang/Exception
    //   572	576	524	java/lang/Exception
    //   596	600	524	java/lang/Exception
    //   612	620	524	java/lang/Exception
    //   621	625	524	java/lang/Exception
    //   512	516	528	java/lang/Exception
    //   143	153	536	finally
    //   559	563	571	java/lang/Exception
    //   550	555	579	java/lang/Exception
    //   588	592	595	java/lang/Exception
    //   550	555	603	finally
    //   580	584	603	finally
    //   608	612	620	java/lang/Exception
    //   633	637	640	java/io/IOException
    //   628	633	648	java/io/IOException
    //   653	657	660	java/io/IOException
    //   628	633	668	finally
    //   649	653	668	finally
    //   669	673	681	java/io/IOException
    //   419	423	689	java/io/IOException
    //   414	419	697	java/io/IOException
    //   702	706	709	java/io/IOException
    //   414	419	717	finally
    //   698	702	717	finally
    //   718	722	730	java/io/IOException
    //   448	452	738	java/io/IOException
    //   443	448	746	java/io/IOException
    //   751	755	758	java/io/IOException
    //   443	448	766	finally
    //   747	751	766	finally
    //   767	771	779	java/io/IOException
    //   153	167	787	finally
    //   174	180	796	finally
    //   187	199	796	finally
    //   212	221	796	finally
    //   239	244	796	finally
    //   283	288	796	finally
    //   295	301	796	finally
    //   143	153	803	java/lang/Exception
    //   153	167	815	java/lang/Exception
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.device.DeviceUpdate
 * JD-Core Version:    0.6.2
 */