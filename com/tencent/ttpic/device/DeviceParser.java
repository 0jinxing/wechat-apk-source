package com.tencent.ttpic.device;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.ttpic.baseutils.IOUtils;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class DeviceParser
{
  private static InputStream drinkACupOfCoffeeForCamera(InputStream paramInputStream, String paramString1, String paramString2)
  {
    AppMethodBeat.i(49855);
    paramInputStream = new ByteArrayInputStream(DeviceCoffee.drink(IOUtils.toByteArray(paramInputStream), paramString1, paramString2));
    AppMethodBeat.o(49855);
    return paramInputStream;
  }

  private static InputStream drinkACupOfCoffeeForFast(InputStream paramInputStream, String paramString)
  {
    AppMethodBeat.i(49857);
    paramInputStream = new ByteArrayInputStream(DeviceCoffee.drinkRawData(IOUtils.toByteArray(paramInputStream), paramString));
    AppMethodBeat.o(49857);
    return paramInputStream;
  }

  // ERROR //
  public static String parseCameraAttrsFile(android.content.Context paramContext, String paramString1, String paramString2, String paramString3)
  {
    // Byte code:
    //   0: ldc 52
    //   2: invokestatic 18	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: ldc 54
    //   7: ldc 56
    //   9: aload_1
    //   10: invokestatic 62	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   13: invokevirtual 66	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   16: invokestatic 72	com/tencent/ttpic/baseutils/LogUtils:v	(Ljava/lang/String;Ljava/lang/String;)V
    //   19: new 74	java/io/File
    //   22: astore 4
    //   24: aload 4
    //   26: aload_1
    //   27: invokespecial 77	java/io/File:<init>	(Ljava/lang/String;)V
    //   30: aload 4
    //   32: invokevirtual 81	java/io/File:exists	()Z
    //   35: ifeq +156 -> 191
    //   38: aload 4
    //   40: invokevirtual 84	java/io/File:isFile	()Z
    //   43: ifeq +148 -> 191
    //   46: ldc 54
    //   48: ldc 86
    //   50: invokestatic 72	com/tencent/ttpic/baseutils/LogUtils:v	(Ljava/lang/String;Ljava/lang/String;)V
    //   53: new 88	java/io/FileInputStream
    //   56: astore_0
    //   57: aload_0
    //   58: aload 4
    //   60: invokespecial 91	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   63: aload_0
    //   64: aload_2
    //   65: aload_3
    //   66: invokestatic 93	com/tencent/ttpic/device/DeviceParser:drinkACupOfCoffeeForCamera	(Ljava/io/InputStream;Ljava/lang/String;Ljava/lang/String;)Ljava/io/InputStream;
    //   69: astore_1
    //   70: aload_0
    //   71: invokestatic 97	com/tencent/ttpic/baseutils/IOUtils:closeQuietly	(Ljava/io/InputStream;)V
    //   74: aload_1
    //   75: astore 4
    //   77: aload_0
    //   78: astore_3
    //   79: aload 4
    //   81: ifnull +613 -> 694
    //   84: new 99	java/io/InputStreamReader
    //   87: astore_0
    //   88: aload_0
    //   89: aload 4
    //   91: invokespecial 101	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   94: new 103	java/io/BufferedReader
    //   97: astore_1
    //   98: aload_1
    //   99: aload_0
    //   100: sipush 1024
    //   103: invokespecial 106	java/io/BufferedReader:<init>	(Ljava/io/Reader;I)V
    //   106: new 108	java/lang/StringBuffer
    //   109: astore 5
    //   111: aload 5
    //   113: invokespecial 109	java/lang/StringBuffer:<init>	()V
    //   116: aload_1
    //   117: invokevirtual 113	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   120: astore_2
    //   121: aload_2
    //   122: ifnull +195 -> 317
    //   125: aload 5
    //   127: aload_2
    //   128: invokevirtual 117	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   131: pop
    //   132: goto -16 -> 116
    //   135: astore 5
    //   137: aload_1
    //   138: astore_2
    //   139: aload_0
    //   140: astore_1
    //   141: aload 5
    //   143: astore_0
    //   144: aload_0
    //   145: invokestatic 121	com/tencent/ttpic/baseutils/LogUtils:e	(Ljava/lang/Throwable;)V
    //   148: aload_2
    //   149: ifnull +7 -> 156
    //   152: aload_2
    //   153: invokevirtual 124	java/io/BufferedReader:close	()V
    //   156: aload_1
    //   157: ifnull +7 -> 164
    //   160: aload_1
    //   161: invokevirtual 125	java/io/InputStreamReader:close	()V
    //   164: aload 4
    //   166: ifnull +8 -> 174
    //   169: aload 4
    //   171: invokevirtual 128	java/io/InputStream:close	()V
    //   174: aload_3
    //   175: ifnull +7 -> 182
    //   178: aload_3
    //   179: invokevirtual 129	java/io/FileInputStream:close	()V
    //   182: aconst_null
    //   183: astore_1
    //   184: ldc 52
    //   186: invokestatic 38	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   189: aload_1
    //   190: areturn
    //   191: ldc 54
    //   193: ldc 131
    //   195: invokestatic 72	com/tencent/ttpic/baseutils/LogUtils:v	(Ljava/lang/String;Ljava/lang/String;)V
    //   198: aload_0
    //   199: ifnull +521 -> 720
    //   202: aload_0
    //   203: invokevirtual 137	android/content/Context:getAssets	()Landroid/content/res/AssetManager;
    //   206: aload_1
    //   207: invokevirtual 143	android/content/res/AssetManager:open	(Ljava/lang/String;)Ljava/io/InputStream;
    //   210: astore_1
    //   211: aload_1
    //   212: aload_2
    //   213: aload_3
    //   214: invokestatic 93	com/tencent/ttpic/device/DeviceParser:drinkACupOfCoffeeForCamera	(Ljava/io/InputStream;Ljava/lang/String;Ljava/lang/String;)Ljava/io/InputStream;
    //   217: astore_0
    //   218: aload_1
    //   219: invokestatic 97	com/tencent/ttpic/baseutils/IOUtils:closeQuietly	(Ljava/io/InputStream;)V
    //   222: aload_1
    //   223: astore_3
    //   224: aload_3
    //   225: ifnull +487 -> 712
    //   228: aload_0
    //   229: astore_1
    //   230: aload_0
    //   231: astore_2
    //   232: aload_3
    //   233: invokevirtual 128	java/io/InputStream:close	()V
    //   236: aconst_null
    //   237: astore_3
    //   238: aload_0
    //   239: astore 4
    //   241: goto -162 -> 79
    //   244: astore_0
    //   245: aconst_null
    //   246: astore_1
    //   247: aconst_null
    //   248: astore_0
    //   249: aload_1
    //   250: ifnull +454 -> 704
    //   253: aload_1
    //   254: invokevirtual 128	java/io/InputStream:close	()V
    //   257: aconst_null
    //   258: astore_3
    //   259: aload_0
    //   260: astore 4
    //   262: goto -183 -> 79
    //   265: astore_3
    //   266: aconst_null
    //   267: astore 4
    //   269: aconst_null
    //   270: astore_0
    //   271: aload 4
    //   273: ifnull +12 -> 285
    //   276: aload_0
    //   277: astore_1
    //   278: aload_0
    //   279: astore_2
    //   280: aload 4
    //   282: invokevirtual 128	java/io/InputStream:close	()V
    //   285: aload_0
    //   286: astore_1
    //   287: aload_0
    //   288: astore_2
    //   289: ldc 52
    //   291: invokestatic 38	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   294: aload_0
    //   295: astore_1
    //   296: aload_0
    //   297: astore_2
    //   298: aload_3
    //   299: athrow
    //   300: astore_0
    //   301: aconst_null
    //   302: astore_3
    //   303: aconst_null
    //   304: astore 5
    //   306: aconst_null
    //   307: astore_2
    //   308: aload_1
    //   309: astore 4
    //   311: aload 5
    //   313: astore_1
    //   314: goto -170 -> 144
    //   317: aload 5
    //   319: invokevirtual 146	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   322: astore_2
    //   323: aload_1
    //   324: astore 5
    //   326: aload_0
    //   327: astore_1
    //   328: aload_2
    //   329: astore_0
    //   330: aload 5
    //   332: ifnull +8 -> 340
    //   335: aload 5
    //   337: invokevirtual 124	java/io/BufferedReader:close	()V
    //   340: aload_1
    //   341: ifnull +7 -> 348
    //   344: aload_1
    //   345: invokevirtual 125	java/io/InputStreamReader:close	()V
    //   348: aload 4
    //   350: ifnull +8 -> 358
    //   353: aload 4
    //   355: invokevirtual 128	java/io/InputStream:close	()V
    //   358: aload_0
    //   359: astore_1
    //   360: aload_3
    //   361: ifnull -177 -> 184
    //   364: aload_3
    //   365: invokevirtual 129	java/io/FileInputStream:close	()V
    //   368: aload_0
    //   369: astore_1
    //   370: goto -186 -> 184
    //   373: astore_1
    //   374: aload_1
    //   375: invokestatic 121	com/tencent/ttpic/baseutils/LogUtils:e	(Ljava/lang/Throwable;)V
    //   378: aload_0
    //   379: astore_1
    //   380: goto -196 -> 184
    //   383: astore_0
    //   384: aload_0
    //   385: invokestatic 121	com/tencent/ttpic/baseutils/LogUtils:e	(Ljava/lang/Throwable;)V
    //   388: aconst_null
    //   389: astore_1
    //   390: goto -206 -> 184
    //   393: astore_0
    //   394: aconst_null
    //   395: astore_3
    //   396: aconst_null
    //   397: astore_1
    //   398: aconst_null
    //   399: astore_2
    //   400: aconst_null
    //   401: astore 4
    //   403: aload_2
    //   404: ifnull +7 -> 411
    //   407: aload_2
    //   408: invokevirtual 124	java/io/BufferedReader:close	()V
    //   411: aload_1
    //   412: ifnull +7 -> 419
    //   415: aload_1
    //   416: invokevirtual 125	java/io/InputStreamReader:close	()V
    //   419: aload 4
    //   421: ifnull +8 -> 429
    //   424: aload 4
    //   426: invokevirtual 128	java/io/InputStream:close	()V
    //   429: aload_3
    //   430: ifnull +7 -> 437
    //   433: aload_3
    //   434: invokevirtual 129	java/io/FileInputStream:close	()V
    //   437: ldc 52
    //   439: invokestatic 38	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   442: aload_0
    //   443: athrow
    //   444: astore_1
    //   445: aload_1
    //   446: invokestatic 121	com/tencent/ttpic/baseutils/LogUtils:e	(Ljava/lang/Throwable;)V
    //   449: goto -12 -> 437
    //   452: astore_1
    //   453: aload_0
    //   454: astore_3
    //   455: aconst_null
    //   456: astore 5
    //   458: aconst_null
    //   459: astore_2
    //   460: aconst_null
    //   461: astore 4
    //   463: aload_1
    //   464: astore_0
    //   465: aload 5
    //   467: astore_1
    //   468: goto -65 -> 403
    //   471: astore_2
    //   472: aload_0
    //   473: astore_3
    //   474: aconst_null
    //   475: astore 6
    //   477: aconst_null
    //   478: astore 5
    //   480: aload_1
    //   481: astore 4
    //   483: aload_2
    //   484: astore_0
    //   485: aload 6
    //   487: astore_1
    //   488: aload 5
    //   490: astore_2
    //   491: goto -88 -> 403
    //   494: astore_0
    //   495: aconst_null
    //   496: astore_3
    //   497: aconst_null
    //   498: astore_1
    //   499: aconst_null
    //   500: astore 5
    //   502: aload_2
    //   503: astore 4
    //   505: aload 5
    //   507: astore_2
    //   508: goto -105 -> 403
    //   511: astore_1
    //   512: aconst_null
    //   513: astore_3
    //   514: aconst_null
    //   515: astore 5
    //   517: aconst_null
    //   518: astore_2
    //   519: aload_0
    //   520: astore 4
    //   522: aload_1
    //   523: astore_0
    //   524: aload 5
    //   526: astore_1
    //   527: goto -124 -> 403
    //   530: astore_0
    //   531: aconst_null
    //   532: astore_1
    //   533: aconst_null
    //   534: astore_2
    //   535: goto -132 -> 403
    //   538: astore_2
    //   539: aload_0
    //   540: astore_1
    //   541: aconst_null
    //   542: astore 5
    //   544: aload_2
    //   545: astore_0
    //   546: aload 5
    //   548: astore_2
    //   549: goto -146 -> 403
    //   552: astore 6
    //   554: aload_0
    //   555: astore 5
    //   557: aload_1
    //   558: astore_2
    //   559: aload 6
    //   561: astore_0
    //   562: aload 5
    //   564: astore_1
    //   565: goto -162 -> 403
    //   568: astore_0
    //   569: goto -166 -> 403
    //   572: astore_0
    //   573: aconst_null
    //   574: astore_3
    //   575: aconst_null
    //   576: astore_1
    //   577: aconst_null
    //   578: astore_2
    //   579: aconst_null
    //   580: astore 4
    //   582: goto -438 -> 144
    //   585: astore_1
    //   586: aload_0
    //   587: astore_3
    //   588: aconst_null
    //   589: astore 5
    //   591: aconst_null
    //   592: astore_2
    //   593: aconst_null
    //   594: astore 4
    //   596: aload_1
    //   597: astore_0
    //   598: aload 5
    //   600: astore_1
    //   601: goto -457 -> 144
    //   604: astore_2
    //   605: aload_0
    //   606: astore_3
    //   607: aconst_null
    //   608: astore 6
    //   610: aconst_null
    //   611: astore 5
    //   613: aload_1
    //   614: astore 4
    //   616: aload_2
    //   617: astore_0
    //   618: aload 6
    //   620: astore_1
    //   621: aload 5
    //   623: astore_2
    //   624: goto -480 -> 144
    //   627: astore_1
    //   628: aconst_null
    //   629: astore_3
    //   630: aconst_null
    //   631: astore 5
    //   633: aconst_null
    //   634: astore_2
    //   635: aload_0
    //   636: astore 4
    //   638: aload_1
    //   639: astore_0
    //   640: aload 5
    //   642: astore_1
    //   643: goto -499 -> 144
    //   646: astore_0
    //   647: aconst_null
    //   648: astore_1
    //   649: aconst_null
    //   650: astore_2
    //   651: goto -507 -> 144
    //   654: astore_2
    //   655: aload_0
    //   656: astore_1
    //   657: aconst_null
    //   658: astore 5
    //   660: aload_2
    //   661: astore_0
    //   662: aload 5
    //   664: astore_2
    //   665: goto -521 -> 144
    //   668: astore_3
    //   669: aconst_null
    //   670: astore_0
    //   671: aload_1
    //   672: astore 4
    //   674: goto -403 -> 271
    //   677: astore_3
    //   678: aload_1
    //   679: astore 4
    //   681: goto -410 -> 271
    //   684: astore_0
    //   685: aconst_null
    //   686: astore_0
    //   687: goto -438 -> 249
    //   690: astore_2
    //   691: goto -442 -> 249
    //   694: aconst_null
    //   695: astore_1
    //   696: aconst_null
    //   697: astore 5
    //   699: aconst_null
    //   700: astore_0
    //   701: goto -371 -> 330
    //   704: aconst_null
    //   705: astore_3
    //   706: aload_0
    //   707: astore 4
    //   709: goto -630 -> 79
    //   712: aconst_null
    //   713: astore_3
    //   714: aload_0
    //   715: astore 4
    //   717: goto -638 -> 79
    //   720: aconst_null
    //   721: astore_3
    //   722: aconst_null
    //   723: astore_0
    //   724: goto -500 -> 224
    //
    // Exception table:
    //   from	to	target	type
    //   106	116	135	java/lang/Exception
    //   116	121	135	java/lang/Exception
    //   125	132	135	java/lang/Exception
    //   317	323	135	java/lang/Exception
    //   202	211	244	java/io/IOException
    //   202	211	265	finally
    //   232	236	300	java/lang/Exception
    //   280	285	300	java/lang/Exception
    //   289	294	300	java/lang/Exception
    //   298	300	300	java/lang/Exception
    //   335	340	373	java/io/IOException
    //   344	348	373	java/io/IOException
    //   353	358	373	java/io/IOException
    //   364	368	373	java/io/IOException
    //   152	156	383	java/io/IOException
    //   160	164	383	java/io/IOException
    //   169	174	383	java/io/IOException
    //   178	182	383	java/io/IOException
    //   19	63	393	finally
    //   191	198	393	finally
    //   407	411	444	java/io/IOException
    //   415	419	444	java/io/IOException
    //   424	429	444	java/io/IOException
    //   433	437	444	java/io/IOException
    //   63	70	452	finally
    //   70	74	471	finally
    //   232	236	494	finally
    //   280	285	494	finally
    //   289	294	494	finally
    //   298	300	494	finally
    //   253	257	511	finally
    //   84	94	530	finally
    //   94	106	538	finally
    //   106	116	552	finally
    //   116	121	552	finally
    //   125	132	552	finally
    //   317	323	552	finally
    //   144	148	568	finally
    //   19	63	572	java/lang/Exception
    //   191	198	572	java/lang/Exception
    //   63	70	585	java/lang/Exception
    //   70	74	604	java/lang/Exception
    //   253	257	627	java/lang/Exception
    //   84	94	646	java/lang/Exception
    //   94	106	654	java/lang/Exception
    //   211	218	668	finally
    //   218	222	677	finally
    //   211	218	684	java/io/IOException
    //   218	222	690	java/io/IOException
  }

  // ERROR //
  public static String parseFastCaptureFile(android.content.Context paramContext, String paramString1, String paramString2)
  {
    // Byte code:
    //   0: ldc 149
    //   2: invokestatic 18	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: ldc 54
    //   7: ldc 151
    //   9: aload_1
    //   10: invokestatic 62	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   13: invokevirtual 66	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   16: invokestatic 72	com/tencent/ttpic/baseutils/LogUtils:v	(Ljava/lang/String;Ljava/lang/String;)V
    //   19: ldc 54
    //   21: ldc 153
    //   23: invokestatic 72	com/tencent/ttpic/baseutils/LogUtils:v	(Ljava/lang/String;Ljava/lang/String;)V
    //   26: aload_0
    //   27: ifnull +482 -> 509
    //   30: aload_0
    //   31: invokevirtual 137	android/content/Context:getAssets	()Landroid/content/res/AssetManager;
    //   34: aload_1
    //   35: invokevirtual 143	android/content/res/AssetManager:open	(Ljava/lang/String;)Ljava/io/InputStream;
    //   38: astore_0
    //   39: aload_0
    //   40: aload_2
    //   41: invokestatic 155	com/tencent/ttpic/device/DeviceParser:drinkACupOfCoffeeForFast	(Ljava/io/InputStream;Ljava/lang/String;)Ljava/io/InputStream;
    //   44: astore_1
    //   45: aload_0
    //   46: invokestatic 97	com/tencent/ttpic/baseutils/IOUtils:closeQuietly	(Ljava/io/InputStream;)V
    //   49: aload_0
    //   50: astore_2
    //   51: aload_1
    //   52: astore_0
    //   53: aload_2
    //   54: ifnull +14 -> 68
    //   57: aload_1
    //   58: astore_3
    //   59: aload_1
    //   60: astore 4
    //   62: aload_2
    //   63: invokevirtual 128	java/io/InputStream:close	()V
    //   66: aload_1
    //   67: astore_0
    //   68: aload_0
    //   69: ifnull +426 -> 495
    //   72: aload_0
    //   73: astore_3
    //   74: aload_0
    //   75: astore 4
    //   77: new 99	java/io/InputStreamReader
    //   80: astore_1
    //   81: aload_0
    //   82: astore_3
    //   83: aload_0
    //   84: astore 4
    //   86: aload_1
    //   87: aload_0
    //   88: invokespecial 101	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   91: new 103	java/io/BufferedReader
    //   94: astore 5
    //   96: aload 5
    //   98: aload_1
    //   99: sipush 1024
    //   102: invokespecial 106	java/io/BufferedReader:<init>	(Ljava/io/Reader;I)V
    //   105: new 108	java/lang/StringBuffer
    //   108: astore 4
    //   110: aload 4
    //   112: invokespecial 109	java/lang/StringBuffer:<init>	()V
    //   115: aload 5
    //   117: invokevirtual 113	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   120: astore_2
    //   121: aload_2
    //   122: ifnull +121 -> 243
    //   125: aload 4
    //   127: aload_2
    //   128: invokevirtual 117	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   131: pop
    //   132: goto -17 -> 115
    //   135: astore 4
    //   137: aload_1
    //   138: astore_2
    //   139: aload 4
    //   141: astore_1
    //   142: aload_1
    //   143: invokestatic 121	com/tencent/ttpic/baseutils/LogUtils:e	(Ljava/lang/Throwable;)V
    //   146: aload 5
    //   148: ifnull +8 -> 156
    //   151: aload 5
    //   153: invokevirtual 124	java/io/BufferedReader:close	()V
    //   156: aload_2
    //   157: ifnull +7 -> 164
    //   160: aload_2
    //   161: invokevirtual 125	java/io/InputStreamReader:close	()V
    //   164: aload_0
    //   165: ifnull +7 -> 172
    //   168: aload_0
    //   169: invokevirtual 128	java/io/InputStream:close	()V
    //   172: aconst_null
    //   173: astore_2
    //   174: ldc 149
    //   176: invokestatic 38	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   179: aload_2
    //   180: areturn
    //   181: astore_0
    //   182: aconst_null
    //   183: astore_2
    //   184: aconst_null
    //   185: astore_0
    //   186: aload_2
    //   187: ifnull +319 -> 506
    //   190: aload_2
    //   191: invokevirtual 128	java/io/InputStream:close	()V
    //   194: goto -126 -> 68
    //   197: astore_1
    //   198: aconst_null
    //   199: astore_2
    //   200: aconst_null
    //   201: astore_0
    //   202: aload_2
    //   203: ifnull +12 -> 215
    //   206: aload_0
    //   207: astore_3
    //   208: aload_0
    //   209: astore 4
    //   211: aload_2
    //   212: invokevirtual 128	java/io/InputStream:close	()V
    //   215: aload_0
    //   216: astore_3
    //   217: aload_0
    //   218: astore 4
    //   220: ldc 149
    //   222: invokestatic 38	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   225: aload_0
    //   226: astore_3
    //   227: aload_0
    //   228: astore 4
    //   230: aload_1
    //   231: athrow
    //   232: astore_1
    //   233: aconst_null
    //   234: astore_2
    //   235: aconst_null
    //   236: astore 5
    //   238: aload_3
    //   239: astore_0
    //   240: goto -98 -> 142
    //   243: aload 4
    //   245: invokevirtual 146	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   248: astore_2
    //   249: aload_1
    //   250: astore 4
    //   252: aload_2
    //   253: astore_1
    //   254: aload 5
    //   256: ifnull +8 -> 264
    //   259: aload 5
    //   261: invokevirtual 124	java/io/BufferedReader:close	()V
    //   264: aload 4
    //   266: ifnull +8 -> 274
    //   269: aload 4
    //   271: invokevirtual 125	java/io/InputStreamReader:close	()V
    //   274: aload_1
    //   275: astore_2
    //   276: aload_0
    //   277: ifnull -103 -> 174
    //   280: aload_0
    //   281: invokevirtual 128	java/io/InputStream:close	()V
    //   284: aload_1
    //   285: astore_2
    //   286: goto -112 -> 174
    //   289: astore_0
    //   290: aload_0
    //   291: invokestatic 121	com/tencent/ttpic/baseutils/LogUtils:e	(Ljava/lang/Throwable;)V
    //   294: aload_1
    //   295: astore_2
    //   296: goto -122 -> 174
    //   299: astore_0
    //   300: aload_0
    //   301: invokestatic 121	com/tencent/ttpic/baseutils/LogUtils:e	(Ljava/lang/Throwable;)V
    //   304: aconst_null
    //   305: astore_2
    //   306: goto -132 -> 174
    //   309: astore_1
    //   310: aconst_null
    //   311: astore_2
    //   312: aconst_null
    //   313: astore 5
    //   315: aconst_null
    //   316: astore_0
    //   317: aload 5
    //   319: ifnull +8 -> 327
    //   322: aload 5
    //   324: invokevirtual 124	java/io/BufferedReader:close	()V
    //   327: aload_2
    //   328: ifnull +7 -> 335
    //   331: aload_2
    //   332: invokevirtual 125	java/io/InputStreamReader:close	()V
    //   335: aload_0
    //   336: ifnull +7 -> 343
    //   339: aload_0
    //   340: invokevirtual 128	java/io/InputStream:close	()V
    //   343: ldc 149
    //   345: invokestatic 38	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   348: aload_1
    //   349: athrow
    //   350: astore_0
    //   351: aload_0
    //   352: invokestatic 121	com/tencent/ttpic/baseutils/LogUtils:e	(Ljava/lang/Throwable;)V
    //   355: goto -12 -> 343
    //   358: astore_1
    //   359: aconst_null
    //   360: astore_2
    //   361: aconst_null
    //   362: astore 5
    //   364: aload 4
    //   366: astore_0
    //   367: goto -50 -> 317
    //   370: astore_1
    //   371: aconst_null
    //   372: astore_2
    //   373: aconst_null
    //   374: astore 5
    //   376: goto -59 -> 317
    //   379: astore_2
    //   380: aload_1
    //   381: astore 5
    //   383: aconst_null
    //   384: astore 4
    //   386: aload_2
    //   387: astore_1
    //   388: aload 5
    //   390: astore_2
    //   391: aload 4
    //   393: astore 5
    //   395: goto -78 -> 317
    //   398: astore_2
    //   399: aload_1
    //   400: astore 4
    //   402: aload_2
    //   403: astore_1
    //   404: aload 4
    //   406: astore_2
    //   407: goto -90 -> 317
    //   410: astore_1
    //   411: goto -94 -> 317
    //   414: astore_1
    //   415: aconst_null
    //   416: astore_2
    //   417: aconst_null
    //   418: astore 5
    //   420: aconst_null
    //   421: astore_0
    //   422: goto -280 -> 142
    //   425: astore_1
    //   426: aconst_null
    //   427: astore_2
    //   428: aconst_null
    //   429: astore 5
    //   431: goto -289 -> 142
    //   434: astore 5
    //   436: aload_1
    //   437: astore_2
    //   438: aconst_null
    //   439: astore 4
    //   441: aload 5
    //   443: astore_1
    //   444: aload 4
    //   446: astore 5
    //   448: goto -306 -> 142
    //   451: astore_1
    //   452: aconst_null
    //   453: astore 5
    //   455: aload_0
    //   456: astore_2
    //   457: aload 5
    //   459: astore_0
    //   460: goto -258 -> 202
    //   463: astore_2
    //   464: aload_0
    //   465: astore 5
    //   467: aload_1
    //   468: astore_0
    //   469: aload_2
    //   470: astore_1
    //   471: aload 5
    //   473: astore_2
    //   474: goto -272 -> 202
    //   477: astore_1
    //   478: aconst_null
    //   479: astore_1
    //   480: aload_0
    //   481: astore_2
    //   482: aload_1
    //   483: astore_0
    //   484: goto -298 -> 186
    //   487: astore_2
    //   488: aload_0
    //   489: astore_2
    //   490: aload_1
    //   491: astore_0
    //   492: goto -306 -> 186
    //   495: aconst_null
    //   496: astore 4
    //   498: aconst_null
    //   499: astore 5
    //   501: aconst_null
    //   502: astore_1
    //   503: goto -249 -> 254
    //   506: goto -438 -> 68
    //   509: aconst_null
    //   510: astore_2
    //   511: aconst_null
    //   512: astore_1
    //   513: goto -462 -> 51
    //
    // Exception table:
    //   from	to	target	type
    //   105	115	135	java/lang/Exception
    //   115	121	135	java/lang/Exception
    //   125	132	135	java/lang/Exception
    //   243	249	135	java/lang/Exception
    //   30	39	181	java/io/IOException
    //   30	39	197	finally
    //   62	66	232	java/lang/Exception
    //   77	81	232	java/lang/Exception
    //   86	91	232	java/lang/Exception
    //   211	215	232	java/lang/Exception
    //   220	225	232	java/lang/Exception
    //   230	232	232	java/lang/Exception
    //   259	264	289	java/io/IOException
    //   269	274	289	java/io/IOException
    //   280	284	289	java/io/IOException
    //   151	156	299	java/io/IOException
    //   160	164	299	java/io/IOException
    //   168	172	299	java/io/IOException
    //   19	26	309	finally
    //   322	327	350	java/io/IOException
    //   331	335	350	java/io/IOException
    //   339	343	350	java/io/IOException
    //   62	66	358	finally
    //   77	81	358	finally
    //   86	91	358	finally
    //   211	215	358	finally
    //   220	225	358	finally
    //   230	232	358	finally
    //   190	194	370	finally
    //   91	105	379	finally
    //   105	115	398	finally
    //   115	121	398	finally
    //   125	132	398	finally
    //   243	249	398	finally
    //   142	146	410	finally
    //   19	26	414	java/lang/Exception
    //   190	194	425	java/lang/Exception
    //   91	105	434	java/lang/Exception
    //   39	45	451	finally
    //   45	49	463	finally
    //   39	45	477	java/io/IOException
    //   45	49	487	java/io/IOException
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.device.DeviceParser
 * JD-Core Version:    0.6.2
 */