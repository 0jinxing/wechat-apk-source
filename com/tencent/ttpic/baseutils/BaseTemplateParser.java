package com.tencent.ttpic.baseutils;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.ttpic.device.DeviceCoffee;
import com.tencent.ttpic.util.Coffee;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import org.json.JSONObject;

public class BaseTemplateParser
{
  public static final String POSTFIX_DAT = "dat";
  private static final String POSTFIX_JSON = "json";
  public static final String POSTFIX_ORIG = "xml";
  private static final String POSTFIX_TXT = "txt";
  public static final String POSTFIX_WMC = "wmc";

  private static int RGBAStr2Int(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    int i = 1;
    AppMethodBeat.i(49587);
    if ((TextUtils.isEmpty(paramString4)) || (TextUtils.isEmpty(paramString1)) || (TextUtils.isEmpty(paramString2)) || (TextUtils.isEmpty(paramString3)))
    {
      j = 0;
      AppMethodBeat.o(49587);
      return j;
    }
    int k = Integer.parseInt(paramString4);
    int m = Integer.parseInt(paramString1);
    int n = Integer.parseInt(paramString2);
    int i1 = Integer.parseInt(paramString3);
    int j = m;
    if (m == 0)
      j = 1;
    m = n;
    if (n == 0)
      m = 1;
    if (i1 == 0);
    while (true)
    {
      j = Color.argb(k, j, m, i);
      AppMethodBeat.o(49587);
      break;
      i = i1;
    }
  }

  private static InputStream drinkACupOfCoffee(InputStream paramInputStream, boolean paramBoolean)
  {
    AppMethodBeat.i(49586);
    paramInputStream = IOUtils.toByteArray(paramInputStream);
    if (paramBoolean);
    for (paramInputStream = Coffee.drink_ios(paramInputStream, Coffee.getDefaultSign()); ; paramInputStream = Coffee.drink(paramInputStream, Coffee.getDefaultSign()))
    {
      paramInputStream = IOUtils.toInputStream(paramInputStream);
      AppMethodBeat.o(49586);
      return paramInputStream;
    }
  }

  private static InputStream drinkACupOfCoffeeForCamera(InputStream paramInputStream, String paramString1, String paramString2)
  {
    AppMethodBeat.i(49588);
    paramInputStream = new ByteArrayInputStream(DeviceCoffee.drink(IOUtils.toByteArray(paramInputStream), paramString1, paramString2));
    AppMethodBeat.o(49588);
    return paramInputStream;
  }

  private static InputStream drinkACupOfCoffeeForFast(InputStream paramInputStream, String paramString)
  {
    AppMethodBeat.i(49590);
    paramInputStream = new ByteArrayInputStream(DeviceCoffee.drinkRawData(IOUtils.toByteArray(paramInputStream), paramString));
    AppMethodBeat.o(49590);
    return paramInputStream;
  }

  // ERROR //
  public static String parseCameraAttrsFile(Context paramContext, String paramString1, String paramString2, String paramString3)
  {
    // Byte code:
    //   0: ldc 107
    //   2: invokestatic 34	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: ldc 109
    //   7: ldc 111
    //   9: aload_1
    //   10: invokestatic 117	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   13: invokevirtual 121	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   16: invokestatic 127	com/tencent/ttpic/baseutils/LogUtils:v	(Ljava/lang/String;Ljava/lang/String;)V
    //   19: new 129	java/io/File
    //   22: astore 4
    //   24: aload 4
    //   26: aload_1
    //   27: invokespecial 132	java/io/File:<init>	(Ljava/lang/String;)V
    //   30: aload 4
    //   32: invokevirtual 136	java/io/File:exists	()Z
    //   35: ifeq +156 -> 191
    //   38: aload 4
    //   40: invokevirtual 139	java/io/File:isFile	()Z
    //   43: ifeq +148 -> 191
    //   46: ldc 109
    //   48: ldc 141
    //   50: invokestatic 127	com/tencent/ttpic/baseutils/LogUtils:v	(Ljava/lang/String;Ljava/lang/String;)V
    //   53: new 143	java/io/FileInputStream
    //   56: astore_0
    //   57: aload_0
    //   58: aload 4
    //   60: invokespecial 146	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   63: aload_0
    //   64: aload_2
    //   65: aload_3
    //   66: invokestatic 148	com/tencent/ttpic/baseutils/BaseTemplateParser:drinkACupOfCoffeeForCamera	(Ljava/io/InputStream;Ljava/lang/String;Ljava/lang/String;)Ljava/io/InputStream;
    //   69: astore_1
    //   70: aload_0
    //   71: invokestatic 152	com/tencent/ttpic/baseutils/IOUtils:closeQuietly	(Ljava/io/InputStream;)V
    //   74: aload_1
    //   75: astore 4
    //   77: aload_0
    //   78: astore_3
    //   79: aload 4
    //   81: ifnull +611 -> 692
    //   84: new 154	java/io/InputStreamReader
    //   87: astore_0
    //   88: aload_0
    //   89: aload 4
    //   91: invokespecial 156	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   94: new 158	java/io/BufferedReader
    //   97: astore_1
    //   98: aload_1
    //   99: aload_0
    //   100: sipush 1024
    //   103: invokespecial 161	java/io/BufferedReader:<init>	(Ljava/io/Reader;I)V
    //   106: new 163	java/lang/StringBuffer
    //   109: astore 5
    //   111: aload 5
    //   113: invokespecial 164	java/lang/StringBuffer:<init>	()V
    //   116: aload_1
    //   117: invokevirtual 167	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   120: astore_2
    //   121: aload_2
    //   122: ifnull +195 -> 317
    //   125: aload 5
    //   127: aload_2
    //   128: invokevirtual 171	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
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
    //   145: invokestatic 175	com/tencent/ttpic/baseutils/LogUtils:e	(Ljava/lang/Throwable;)V
    //   148: aload_2
    //   149: ifnull +7 -> 156
    //   152: aload_2
    //   153: invokevirtual 178	java/io/BufferedReader:close	()V
    //   156: aload_1
    //   157: ifnull +7 -> 164
    //   160: aload_1
    //   161: invokevirtual 179	java/io/InputStreamReader:close	()V
    //   164: aload 4
    //   166: ifnull +8 -> 174
    //   169: aload 4
    //   171: invokevirtual 182	java/io/InputStream:close	()V
    //   174: aload_3
    //   175: ifnull +7 -> 182
    //   178: aload_3
    //   179: invokevirtual 183	java/io/FileInputStream:close	()V
    //   182: aconst_null
    //   183: astore_1
    //   184: ldc 107
    //   186: invokestatic 43	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   189: aload_1
    //   190: areturn
    //   191: ldc 109
    //   193: ldc 185
    //   195: invokestatic 127	com/tencent/ttpic/baseutils/LogUtils:v	(Ljava/lang/String;Ljava/lang/String;)V
    //   198: aload_0
    //   199: ifnull +519 -> 718
    //   202: aload_0
    //   203: invokevirtual 191	android/content/Context:getAssets	()Landroid/content/res/AssetManager;
    //   206: aload_1
    //   207: invokevirtual 197	android/content/res/AssetManager:open	(Ljava/lang/String;)Ljava/io/InputStream;
    //   210: astore_1
    //   211: aload_1
    //   212: aload_2
    //   213: aload_3
    //   214: invokestatic 148	com/tencent/ttpic/baseutils/BaseTemplateParser:drinkACupOfCoffeeForCamera	(Ljava/io/InputStream;Ljava/lang/String;Ljava/lang/String;)Ljava/io/InputStream;
    //   217: astore_0
    //   218: aload_1
    //   219: invokestatic 152	com/tencent/ttpic/baseutils/IOUtils:closeQuietly	(Ljava/io/InputStream;)V
    //   222: aload_1
    //   223: astore_3
    //   224: aload_3
    //   225: ifnull +485 -> 710
    //   228: aload_0
    //   229: astore_1
    //   230: aload_0
    //   231: astore_2
    //   232: aload_3
    //   233: invokevirtual 182	java/io/InputStream:close	()V
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
    //   250: ifnull +452 -> 702
    //   253: aload_1
    //   254: invokevirtual 182	java/io/InputStream:close	()V
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
    //   282: invokevirtual 182	java/io/InputStream:close	()V
    //   285: aload_0
    //   286: astore_1
    //   287: aload_0
    //   288: astore_2
    //   289: ldc 107
    //   291: invokestatic 43	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
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
    //   319: invokevirtual 200	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   322: astore_2
    //   323: aload_0
    //   324: astore 5
    //   326: aload_2
    //   327: astore_0
    //   328: aload_1
    //   329: ifnull +7 -> 336
    //   332: aload_1
    //   333: invokevirtual 178	java/io/BufferedReader:close	()V
    //   336: aload 5
    //   338: ifnull +8 -> 346
    //   341: aload 5
    //   343: invokevirtual 179	java/io/InputStreamReader:close	()V
    //   346: aload 4
    //   348: ifnull +8 -> 356
    //   351: aload 4
    //   353: invokevirtual 182	java/io/InputStream:close	()V
    //   356: aload_0
    //   357: astore_1
    //   358: aload_3
    //   359: ifnull -175 -> 184
    //   362: aload_3
    //   363: invokevirtual 183	java/io/FileInputStream:close	()V
    //   366: aload_0
    //   367: astore_1
    //   368: goto -184 -> 184
    //   371: astore_1
    //   372: aload_1
    //   373: invokestatic 175	com/tencent/ttpic/baseutils/LogUtils:e	(Ljava/lang/Throwable;)V
    //   376: aload_0
    //   377: astore_1
    //   378: goto -194 -> 184
    //   381: astore_0
    //   382: aload_0
    //   383: invokestatic 175	com/tencent/ttpic/baseutils/LogUtils:e	(Ljava/lang/Throwable;)V
    //   386: aconst_null
    //   387: astore_1
    //   388: goto -204 -> 184
    //   391: astore_0
    //   392: aconst_null
    //   393: astore_3
    //   394: aconst_null
    //   395: astore_1
    //   396: aconst_null
    //   397: astore_2
    //   398: aconst_null
    //   399: astore 4
    //   401: aload_2
    //   402: ifnull +7 -> 409
    //   405: aload_2
    //   406: invokevirtual 178	java/io/BufferedReader:close	()V
    //   409: aload_1
    //   410: ifnull +7 -> 417
    //   413: aload_1
    //   414: invokevirtual 179	java/io/InputStreamReader:close	()V
    //   417: aload 4
    //   419: ifnull +8 -> 427
    //   422: aload 4
    //   424: invokevirtual 182	java/io/InputStream:close	()V
    //   427: aload_3
    //   428: ifnull +7 -> 435
    //   431: aload_3
    //   432: invokevirtual 183	java/io/FileInputStream:close	()V
    //   435: ldc 107
    //   437: invokestatic 43	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   440: aload_0
    //   441: athrow
    //   442: astore_1
    //   443: aload_1
    //   444: invokestatic 175	com/tencent/ttpic/baseutils/LogUtils:e	(Ljava/lang/Throwable;)V
    //   447: goto -12 -> 435
    //   450: astore_1
    //   451: aload_0
    //   452: astore_3
    //   453: aconst_null
    //   454: astore 5
    //   456: aconst_null
    //   457: astore_2
    //   458: aconst_null
    //   459: astore 4
    //   461: aload_1
    //   462: astore_0
    //   463: aload 5
    //   465: astore_1
    //   466: goto -65 -> 401
    //   469: astore_2
    //   470: aload_0
    //   471: astore_3
    //   472: aconst_null
    //   473: astore 6
    //   475: aconst_null
    //   476: astore 5
    //   478: aload_1
    //   479: astore 4
    //   481: aload_2
    //   482: astore_0
    //   483: aload 6
    //   485: astore_1
    //   486: aload 5
    //   488: astore_2
    //   489: goto -88 -> 401
    //   492: astore_0
    //   493: aconst_null
    //   494: astore_3
    //   495: aconst_null
    //   496: astore_1
    //   497: aconst_null
    //   498: astore 5
    //   500: aload_2
    //   501: astore 4
    //   503: aload 5
    //   505: astore_2
    //   506: goto -105 -> 401
    //   509: astore_1
    //   510: aconst_null
    //   511: astore_3
    //   512: aconst_null
    //   513: astore 5
    //   515: aconst_null
    //   516: astore_2
    //   517: aload_0
    //   518: astore 4
    //   520: aload_1
    //   521: astore_0
    //   522: aload 5
    //   524: astore_1
    //   525: goto -124 -> 401
    //   528: astore_0
    //   529: aconst_null
    //   530: astore_1
    //   531: aconst_null
    //   532: astore_2
    //   533: goto -132 -> 401
    //   536: astore_2
    //   537: aload_0
    //   538: astore_1
    //   539: aconst_null
    //   540: astore 5
    //   542: aload_2
    //   543: astore_0
    //   544: aload 5
    //   546: astore_2
    //   547: goto -146 -> 401
    //   550: astore 6
    //   552: aload_0
    //   553: astore 5
    //   555: aload_1
    //   556: astore_2
    //   557: aload 6
    //   559: astore_0
    //   560: aload 5
    //   562: astore_1
    //   563: goto -162 -> 401
    //   566: astore_0
    //   567: goto -166 -> 401
    //   570: astore_0
    //   571: aconst_null
    //   572: astore_3
    //   573: aconst_null
    //   574: astore_1
    //   575: aconst_null
    //   576: astore_2
    //   577: aconst_null
    //   578: astore 4
    //   580: goto -436 -> 144
    //   583: astore_1
    //   584: aload_0
    //   585: astore_3
    //   586: aconst_null
    //   587: astore 5
    //   589: aconst_null
    //   590: astore_2
    //   591: aconst_null
    //   592: astore 4
    //   594: aload_1
    //   595: astore_0
    //   596: aload 5
    //   598: astore_1
    //   599: goto -455 -> 144
    //   602: astore_2
    //   603: aload_0
    //   604: astore_3
    //   605: aconst_null
    //   606: astore 6
    //   608: aconst_null
    //   609: astore 5
    //   611: aload_1
    //   612: astore 4
    //   614: aload_2
    //   615: astore_0
    //   616: aload 6
    //   618: astore_1
    //   619: aload 5
    //   621: astore_2
    //   622: goto -478 -> 144
    //   625: astore_1
    //   626: aconst_null
    //   627: astore_3
    //   628: aconst_null
    //   629: astore 5
    //   631: aconst_null
    //   632: astore_2
    //   633: aload_0
    //   634: astore 4
    //   636: aload_1
    //   637: astore_0
    //   638: aload 5
    //   640: astore_1
    //   641: goto -497 -> 144
    //   644: astore_0
    //   645: aconst_null
    //   646: astore_1
    //   647: aconst_null
    //   648: astore_2
    //   649: goto -505 -> 144
    //   652: astore_2
    //   653: aload_0
    //   654: astore_1
    //   655: aconst_null
    //   656: astore 5
    //   658: aload_2
    //   659: astore_0
    //   660: aload 5
    //   662: astore_2
    //   663: goto -519 -> 144
    //   666: astore_3
    //   667: aconst_null
    //   668: astore_0
    //   669: aload_1
    //   670: astore 4
    //   672: goto -401 -> 271
    //   675: astore_3
    //   676: aload_1
    //   677: astore 4
    //   679: goto -408 -> 271
    //   682: astore_0
    //   683: aconst_null
    //   684: astore_0
    //   685: goto -436 -> 249
    //   688: astore_2
    //   689: goto -440 -> 249
    //   692: aconst_null
    //   693: astore 5
    //   695: aconst_null
    //   696: astore_1
    //   697: aconst_null
    //   698: astore_0
    //   699: goto -371 -> 328
    //   702: aconst_null
    //   703: astore_3
    //   704: aload_0
    //   705: astore 4
    //   707: goto -628 -> 79
    //   710: aconst_null
    //   711: astore_3
    //   712: aload_0
    //   713: astore 4
    //   715: goto -636 -> 79
    //   718: aconst_null
    //   719: astore_3
    //   720: aconst_null
    //   721: astore_0
    //   722: goto -498 -> 224
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
    //   332	336	371	java/io/IOException
    //   341	346	371	java/io/IOException
    //   351	356	371	java/io/IOException
    //   362	366	371	java/io/IOException
    //   152	156	381	java/io/IOException
    //   160	164	381	java/io/IOException
    //   169	174	381	java/io/IOException
    //   178	182	381	java/io/IOException
    //   19	63	391	finally
    //   191	198	391	finally
    //   405	409	442	java/io/IOException
    //   413	417	442	java/io/IOException
    //   422	427	442	java/io/IOException
    //   431	435	442	java/io/IOException
    //   63	70	450	finally
    //   70	74	469	finally
    //   232	236	492	finally
    //   280	285	492	finally
    //   289	294	492	finally
    //   298	300	492	finally
    //   253	257	509	finally
    //   84	94	528	finally
    //   94	106	536	finally
    //   106	116	550	finally
    //   116	121	550	finally
    //   125	132	550	finally
    //   317	323	550	finally
    //   144	148	566	finally
    //   19	63	570	java/lang/Exception
    //   191	198	570	java/lang/Exception
    //   63	70	583	java/lang/Exception
    //   70	74	602	java/lang/Exception
    //   253	257	625	java/lang/Exception
    //   84	94	644	java/lang/Exception
    //   94	106	652	java/lang/Exception
    //   211	218	666	finally
    //   218	222	675	finally
    //   211	218	682	java/io/IOException
    //   218	222	688	java/io/IOException
  }

  // ERROR //
  public static String parseFastCaptureFile(Context paramContext, String paramString1, String paramString2)
  {
    // Byte code:
    //   0: ldc 203
    //   2: invokestatic 34	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: ldc 109
    //   7: ldc 205
    //   9: aload_1
    //   10: invokestatic 117	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   13: invokevirtual 121	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   16: invokestatic 127	com/tencent/ttpic/baseutils/LogUtils:v	(Ljava/lang/String;Ljava/lang/String;)V
    //   19: ldc 109
    //   21: ldc 207
    //   23: invokestatic 127	com/tencent/ttpic/baseutils/LogUtils:v	(Ljava/lang/String;Ljava/lang/String;)V
    //   26: aload_0
    //   27: ifnull +483 -> 510
    //   30: aload_0
    //   31: invokevirtual 191	android/content/Context:getAssets	()Landroid/content/res/AssetManager;
    //   34: aload_1
    //   35: invokevirtual 197	android/content/res/AssetManager:open	(Ljava/lang/String;)Ljava/io/InputStream;
    //   38: astore_0
    //   39: aload_0
    //   40: aload_2
    //   41: invokestatic 209	com/tencent/ttpic/baseutils/BaseTemplateParser:drinkACupOfCoffeeForFast	(Ljava/io/InputStream;Ljava/lang/String;)Ljava/io/InputStream;
    //   44: astore_1
    //   45: aload_0
    //   46: invokestatic 152	com/tencent/ttpic/baseutils/IOUtils:closeQuietly	(Ljava/io/InputStream;)V
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
    //   63: invokevirtual 182	java/io/InputStream:close	()V
    //   66: aload_1
    //   67: astore_0
    //   68: aload_0
    //   69: ifnull +427 -> 496
    //   72: aload_0
    //   73: astore_3
    //   74: aload_0
    //   75: astore 4
    //   77: new 154	java/io/InputStreamReader
    //   80: astore_1
    //   81: aload_0
    //   82: astore_3
    //   83: aload_0
    //   84: astore 4
    //   86: aload_1
    //   87: aload_0
    //   88: invokespecial 156	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   91: new 158	java/io/BufferedReader
    //   94: astore 5
    //   96: aload 5
    //   98: aload_1
    //   99: sipush 1024
    //   102: invokespecial 161	java/io/BufferedReader:<init>	(Ljava/io/Reader;I)V
    //   105: new 163	java/lang/StringBuffer
    //   108: astore_2
    //   109: aload_2
    //   110: invokespecial 164	java/lang/StringBuffer:<init>	()V
    //   113: aload 5
    //   115: invokevirtual 167	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   118: astore 4
    //   120: aload 4
    //   122: ifnull +121 -> 243
    //   125: aload_2
    //   126: aload 4
    //   128: invokevirtual 171	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   131: pop
    //   132: goto -19 -> 113
    //   135: astore 4
    //   137: aload_1
    //   138: astore_2
    //   139: aload 4
    //   141: astore_1
    //   142: aload_1
    //   143: invokestatic 175	com/tencent/ttpic/baseutils/LogUtils:e	(Ljava/lang/Throwable;)V
    //   146: aload 5
    //   148: ifnull +8 -> 156
    //   151: aload 5
    //   153: invokevirtual 178	java/io/BufferedReader:close	()V
    //   156: aload_2
    //   157: ifnull +7 -> 164
    //   160: aload_2
    //   161: invokevirtual 179	java/io/InputStreamReader:close	()V
    //   164: aload_0
    //   165: ifnull +7 -> 172
    //   168: aload_0
    //   169: invokevirtual 182	java/io/InputStream:close	()V
    //   172: aconst_null
    //   173: astore_2
    //   174: ldc 203
    //   176: invokestatic 43	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   179: aload_2
    //   180: areturn
    //   181: astore_0
    //   182: aconst_null
    //   183: astore_2
    //   184: aconst_null
    //   185: astore_0
    //   186: aload_2
    //   187: ifnull +320 -> 507
    //   190: aload_2
    //   191: invokevirtual 182	java/io/InputStream:close	()V
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
    //   212: invokevirtual 182	java/io/InputStream:close	()V
    //   215: aload_0
    //   216: astore_3
    //   217: aload_0
    //   218: astore 4
    //   220: ldc 203
    //   222: invokestatic 43	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
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
    //   243: aload_2
    //   244: invokevirtual 200	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   247: astore_2
    //   248: aload 5
    //   250: astore 4
    //   252: aload_1
    //   253: astore 5
    //   255: aload_2
    //   256: astore_1
    //   257: aload 4
    //   259: ifnull +8 -> 267
    //   262: aload 4
    //   264: invokevirtual 178	java/io/BufferedReader:close	()V
    //   267: aload 5
    //   269: ifnull +8 -> 277
    //   272: aload 5
    //   274: invokevirtual 179	java/io/InputStreamReader:close	()V
    //   277: aload_1
    //   278: astore_2
    //   279: aload_0
    //   280: ifnull -106 -> 174
    //   283: aload_0
    //   284: invokevirtual 182	java/io/InputStream:close	()V
    //   287: aload_1
    //   288: astore_2
    //   289: goto -115 -> 174
    //   292: astore_0
    //   293: aload_0
    //   294: invokestatic 175	com/tencent/ttpic/baseutils/LogUtils:e	(Ljava/lang/Throwable;)V
    //   297: aload_1
    //   298: astore_2
    //   299: goto -125 -> 174
    //   302: astore_0
    //   303: aload_0
    //   304: invokestatic 175	com/tencent/ttpic/baseutils/LogUtils:e	(Ljava/lang/Throwable;)V
    //   307: aconst_null
    //   308: astore_2
    //   309: goto -135 -> 174
    //   312: astore_1
    //   313: aconst_null
    //   314: astore_2
    //   315: aconst_null
    //   316: astore 5
    //   318: aconst_null
    //   319: astore_0
    //   320: aload 5
    //   322: ifnull +8 -> 330
    //   325: aload 5
    //   327: invokevirtual 178	java/io/BufferedReader:close	()V
    //   330: aload_2
    //   331: ifnull +7 -> 338
    //   334: aload_2
    //   335: invokevirtual 179	java/io/InputStreamReader:close	()V
    //   338: aload_0
    //   339: ifnull +7 -> 346
    //   342: aload_0
    //   343: invokevirtual 182	java/io/InputStream:close	()V
    //   346: ldc 203
    //   348: invokestatic 43	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   351: aload_1
    //   352: athrow
    //   353: astore_0
    //   354: aload_0
    //   355: invokestatic 175	com/tencent/ttpic/baseutils/LogUtils:e	(Ljava/lang/Throwable;)V
    //   358: goto -12 -> 346
    //   361: astore_1
    //   362: aconst_null
    //   363: astore_2
    //   364: aconst_null
    //   365: astore 5
    //   367: aload 4
    //   369: astore_0
    //   370: goto -50 -> 320
    //   373: astore_1
    //   374: aconst_null
    //   375: astore_2
    //   376: aconst_null
    //   377: astore 5
    //   379: goto -59 -> 320
    //   382: astore 5
    //   384: aload_1
    //   385: astore_2
    //   386: aconst_null
    //   387: astore 4
    //   389: aload 5
    //   391: astore_1
    //   392: aload 4
    //   394: astore 5
    //   396: goto -76 -> 320
    //   399: astore_2
    //   400: aload_1
    //   401: astore 4
    //   403: aload_2
    //   404: astore_1
    //   405: aload 4
    //   407: astore_2
    //   408: goto -88 -> 320
    //   411: astore_1
    //   412: goto -92 -> 320
    //   415: astore_1
    //   416: aconst_null
    //   417: astore_2
    //   418: aconst_null
    //   419: astore 5
    //   421: aconst_null
    //   422: astore_0
    //   423: goto -281 -> 142
    //   426: astore_1
    //   427: aconst_null
    //   428: astore_2
    //   429: aconst_null
    //   430: astore 5
    //   432: goto -290 -> 142
    //   435: astore 5
    //   437: aload_1
    //   438: astore_2
    //   439: aconst_null
    //   440: astore 4
    //   442: aload 5
    //   444: astore_1
    //   445: aload 4
    //   447: astore 5
    //   449: goto -307 -> 142
    //   452: astore_1
    //   453: aconst_null
    //   454: astore 5
    //   456: aload_0
    //   457: astore_2
    //   458: aload 5
    //   460: astore_0
    //   461: goto -259 -> 202
    //   464: astore_2
    //   465: aload_1
    //   466: astore 5
    //   468: aload_2
    //   469: astore_1
    //   470: aload_0
    //   471: astore_2
    //   472: aload 5
    //   474: astore_0
    //   475: goto -273 -> 202
    //   478: astore_1
    //   479: aconst_null
    //   480: astore_1
    //   481: aload_0
    //   482: astore_2
    //   483: aload_1
    //   484: astore_0
    //   485: goto -299 -> 186
    //   488: astore_2
    //   489: aload_0
    //   490: astore_2
    //   491: aload_1
    //   492: astore_0
    //   493: goto -307 -> 186
    //   496: aconst_null
    //   497: astore 5
    //   499: aconst_null
    //   500: astore 4
    //   502: aconst_null
    //   503: astore_1
    //   504: goto -247 -> 257
    //   507: goto -439 -> 68
    //   510: aconst_null
    //   511: astore_2
    //   512: aconst_null
    //   513: astore_1
    //   514: goto -463 -> 51
    //
    // Exception table:
    //   from	to	target	type
    //   105	113	135	java/lang/Exception
    //   113	120	135	java/lang/Exception
    //   125	132	135	java/lang/Exception
    //   243	248	135	java/lang/Exception
    //   30	39	181	java/io/IOException
    //   30	39	197	finally
    //   62	66	232	java/lang/Exception
    //   77	81	232	java/lang/Exception
    //   86	91	232	java/lang/Exception
    //   211	215	232	java/lang/Exception
    //   220	225	232	java/lang/Exception
    //   230	232	232	java/lang/Exception
    //   262	267	292	java/io/IOException
    //   272	277	292	java/io/IOException
    //   283	287	292	java/io/IOException
    //   151	156	302	java/io/IOException
    //   160	164	302	java/io/IOException
    //   168	172	302	java/io/IOException
    //   19	26	312	finally
    //   325	330	353	java/io/IOException
    //   334	338	353	java/io/IOException
    //   342	346	353	java/io/IOException
    //   62	66	361	finally
    //   77	81	361	finally
    //   86	91	361	finally
    //   211	215	361	finally
    //   220	225	361	finally
    //   230	232	361	finally
    //   190	194	373	finally
    //   91	105	382	finally
    //   105	113	399	finally
    //   113	120	399	finally
    //   125	132	399	finally
    //   243	248	399	finally
    //   142	146	411	finally
    //   19	26	415	java/lang/Exception
    //   190	194	426	java/lang/Exception
    //   91	105	435	java/lang/Exception
    //   39	45	452	finally
    //   45	49	464	finally
    //   39	45	478	java/io/IOException
    //   45	49	488	java/io/IOException
  }

  public static JSONObject parseFile(Context paramContext, String paramString1, String paramString2, boolean paramBoolean)
  {
    AppMethodBeat.i(49583);
    if (paramBoolean)
    {
      paramContext = parseIOSFileProcess(paramContext, paramString1, paramString2, false);
      AppMethodBeat.o(49583);
    }
    while (true)
    {
      return paramContext;
      paramContext = parseFileProcess(paramContext, paramString1, paramString2, false);
      AppMethodBeat.o(49583);
    }
  }

  // ERROR //
  private static JSONObject parseFileProcess(Context paramContext, String paramString1, String paramString2, boolean paramBoolean)
  {
    // Byte code:
    //   0: ldc 219
    //   2: invokestatic 34	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: new 221	java/lang/StringBuilder
    //   8: dup
    //   9: invokespecial 222	java/lang/StringBuilder:<init>	()V
    //   12: aload_1
    //   13: invokevirtual 225	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   16: ldc 227
    //   18: invokevirtual 225	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   21: aload_2
    //   22: invokevirtual 225	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   25: ldc 229
    //   27: invokevirtual 225	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   30: astore 4
    //   32: iload_3
    //   33: ifeq +287 -> 320
    //   36: ldc 14
    //   38: astore 5
    //   40: aload 4
    //   42: aload 5
    //   44: invokevirtual 225	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   47: invokevirtual 230	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   50: astore 5
    //   52: new 221	java/lang/StringBuilder
    //   55: dup
    //   56: invokespecial 222	java/lang/StringBuilder:<init>	()V
    //   59: aload_1
    //   60: invokevirtual 225	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   63: ldc 227
    //   65: invokevirtual 225	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   68: aload_2
    //   69: invokevirtual 225	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   72: ldc 229
    //   74: invokevirtual 225	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   77: astore_2
    //   78: iload_3
    //   79: ifne +248 -> 327
    //   82: ldc 14
    //   84: astore_1
    //   85: aload_2
    //   86: aload_1
    //   87: invokevirtual 225	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   90: invokevirtual 230	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   93: astore 6
    //   95: ldc 109
    //   97: ldc 232
    //   99: iconst_1
    //   100: anewarray 4	java/lang/Object
    //   103: dup
    //   104: iconst_0
    //   105: aload 5
    //   107: aastore
    //   108: invokestatic 235	com/tencent/ttpic/baseutils/LogUtils:v	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   111: new 129	java/io/File
    //   114: astore_1
    //   115: aload_1
    //   116: aload 5
    //   118: invokespecial 132	java/io/File:<init>	(Ljava/lang/String;)V
    //   121: new 129	java/io/File
    //   124: astore_2
    //   125: aload_2
    //   126: aload 6
    //   128: invokespecial 132	java/io/File:<init>	(Ljava/lang/String;)V
    //   131: aload_1
    //   132: invokevirtual 136	java/io/File:exists	()Z
    //   135: ifeq +10 -> 145
    //   138: aload_1
    //   139: invokevirtual 139	java/io/File:isFile	()Z
    //   142: ifne +17 -> 159
    //   145: aload_2
    //   146: invokevirtual 136	java/io/File:exists	()Z
    //   149: ifeq +230 -> 379
    //   152: aload_2
    //   153: invokevirtual 139	java/io/File:isFile	()Z
    //   156: ifeq +223 -> 379
    //   159: ldc 109
    //   161: ldc 237
    //   163: invokestatic 127	com/tencent/ttpic/baseutils/LogUtils:v	(Ljava/lang/String;Ljava/lang/String;)V
    //   166: aload_1
    //   167: invokevirtual 136	java/io/File:exists	()Z
    //   170: ifeq +163 -> 333
    //   173: aload_1
    //   174: invokevirtual 139	java/io/File:isFile	()Z
    //   177: ifeq +156 -> 333
    //   180: new 143	java/io/FileInputStream
    //   183: astore_0
    //   184: aload_0
    //   185: aload_1
    //   186: invokespecial 146	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   189: iload_3
    //   190: ifne +180 -> 370
    //   193: aload_0
    //   194: iconst_0
    //   195: invokestatic 239	com/tencent/ttpic/baseutils/BaseTemplateParser:drinkACupOfCoffee	(Ljava/io/InputStream;Z)Ljava/io/InputStream;
    //   198: astore_1
    //   199: aload_0
    //   200: invokestatic 152	com/tencent/ttpic/baseutils/IOUtils:closeQuietly	(Ljava/io/InputStream;)V
    //   203: aload_1
    //   204: ifnull +735 -> 939
    //   207: new 154	java/io/InputStreamReader
    //   210: astore_2
    //   211: aload_2
    //   212: aload_1
    //   213: invokespecial 156	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   216: new 158	java/io/BufferedReader
    //   219: astore 4
    //   221: aload 4
    //   223: aload_2
    //   224: sipush 1024
    //   227: invokespecial 161	java/io/BufferedReader:<init>	(Ljava/io/Reader;I)V
    //   230: new 163	java/lang/StringBuffer
    //   233: astore 5
    //   235: aload 5
    //   237: invokespecial 164	java/lang/StringBuffer:<init>	()V
    //   240: aload 4
    //   242: invokevirtual 167	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   245: astore 6
    //   247: aload 6
    //   249: ifnull +285 -> 534
    //   252: aload 5
    //   254: aload 6
    //   256: invokevirtual 171	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   259: pop
    //   260: goto -20 -> 240
    //   263: astore 6
    //   265: aload_2
    //   266: astore 5
    //   268: aload 6
    //   270: astore_2
    //   271: aload_2
    //   272: invokestatic 175	com/tencent/ttpic/baseutils/LogUtils:e	(Ljava/lang/Throwable;)V
    //   275: aload 4
    //   277: ifnull +8 -> 285
    //   280: aload 4
    //   282: invokevirtual 178	java/io/BufferedReader:close	()V
    //   285: aload 5
    //   287: ifnull +8 -> 295
    //   290: aload 5
    //   292: invokevirtual 179	java/io/InputStreamReader:close	()V
    //   295: aload_1
    //   296: ifnull +7 -> 303
    //   299: aload_1
    //   300: invokevirtual 182	java/io/InputStream:close	()V
    //   303: aload_0
    //   304: ifnull +7 -> 311
    //   307: aload_0
    //   308: invokevirtual 183	java/io/FileInputStream:close	()V
    //   311: aconst_null
    //   312: astore_1
    //   313: ldc 219
    //   315: invokestatic 43	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   318: aload_1
    //   319: areturn
    //   320: ldc 8
    //   322: astore 5
    //   324: goto -284 -> 40
    //   327: ldc 8
    //   329: astore_1
    //   330: goto -245 -> 85
    //   333: aload_2
    //   334: invokevirtual 136	java/io/File:exists	()Z
    //   337: ifeq +613 -> 950
    //   340: aload_2
    //   341: invokevirtual 139	java/io/File:isFile	()Z
    //   344: ifeq +606 -> 950
    //   347: new 143	java/io/FileInputStream
    //   350: dup
    //   351: aload_2
    //   352: invokespecial 146	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   355: astore_0
    //   356: iload_3
    //   357: ifne +8 -> 365
    //   360: iconst_1
    //   361: istore_3
    //   362: goto -173 -> 189
    //   365: iconst_0
    //   366: istore_3
    //   367: goto -5 -> 362
    //   370: aload_0
    //   371: astore_2
    //   372: aload_0
    //   373: astore_1
    //   374: aload_2
    //   375: astore_0
    //   376: goto -173 -> 203
    //   379: ldc 109
    //   381: ldc 241
    //   383: invokestatic 127	com/tencent/ttpic/baseutils/LogUtils:v	(Ljava/lang/String;Ljava/lang/String;)V
    //   386: aload_0
    //   387: invokevirtual 191	android/content/Context:getAssets	()Landroid/content/res/AssetManager;
    //   390: aload 5
    //   392: invokevirtual 197	android/content/res/AssetManager:open	(Ljava/lang/String;)Ljava/io/InputStream;
    //   395: astore 4
    //   397: iload_3
    //   398: ifne +25 -> 423
    //   401: aload 4
    //   403: iconst_0
    //   404: invokestatic 239	com/tencent/ttpic/baseutils/BaseTemplateParser:drinkACupOfCoffee	(Ljava/io/InputStream;Z)Ljava/io/InputStream;
    //   407: astore_1
    //   408: aload_1
    //   409: astore_2
    //   410: aload_1
    //   411: astore 5
    //   413: aload 4
    //   415: invokestatic 152	com/tencent/ttpic/baseutils/IOUtils:closeQuietly	(Ljava/io/InputStream;)V
    //   418: aconst_null
    //   419: astore_0
    //   420: goto -217 -> 203
    //   423: aconst_null
    //   424: astore_0
    //   425: aload 4
    //   427: astore_1
    //   428: goto -225 -> 203
    //   431: astore_1
    //   432: aconst_null
    //   433: astore_1
    //   434: iload_3
    //   435: istore 7
    //   437: aload_1
    //   438: astore_2
    //   439: aload_1
    //   440: astore 5
    //   442: aload_0
    //   443: invokevirtual 191	android/content/Context:getAssets	()Landroid/content/res/AssetManager;
    //   446: aload 6
    //   448: invokevirtual 197	android/content/res/AssetManager:open	(Ljava/lang/String;)Ljava/io/InputStream;
    //   451: astore 4
    //   453: iload_3
    //   454: ifne +42 -> 496
    //   457: iconst_1
    //   458: istore_3
    //   459: iload_3
    //   460: ifne +41 -> 501
    //   463: iload_3
    //   464: istore 7
    //   466: aload_1
    //   467: astore_2
    //   468: aload_1
    //   469: astore 5
    //   471: aload 4
    //   473: iconst_0
    //   474: invokestatic 239	com/tencent/ttpic/baseutils/BaseTemplateParser:drinkACupOfCoffee	(Ljava/io/InputStream;Z)Ljava/io/InputStream;
    //   477: astore_0
    //   478: aload_0
    //   479: astore_1
    //   480: aload_0
    //   481: astore_2
    //   482: aload 4
    //   484: invokestatic 152	com/tencent/ttpic/baseutils/IOUtils:closeQuietly	(Ljava/io/InputStream;)V
    //   487: aconst_null
    //   488: astore_2
    //   489: aload_0
    //   490: astore_1
    //   491: aload_2
    //   492: astore_0
    //   493: goto -290 -> 203
    //   496: iconst_0
    //   497: istore_3
    //   498: goto -39 -> 459
    //   501: aconst_null
    //   502: astore_0
    //   503: aload 4
    //   505: astore_1
    //   506: goto -303 -> 203
    //   509: astore 5
    //   511: aload_1
    //   512: astore_0
    //   513: iload 7
    //   515: istore_3
    //   516: aload_0
    //   517: astore_1
    //   518: aload_0
    //   519: astore_2
    //   520: aload 5
    //   522: invokestatic 175	com/tencent/ttpic/baseutils/LogUtils:e	(Ljava/lang/Throwable;)V
    //   525: aconst_null
    //   526: astore_2
    //   527: aload_0
    //   528: astore_1
    //   529: aload_2
    //   530: astore_0
    //   531: goto -328 -> 203
    //   534: iload_3
    //   535: ifeq +107 -> 642
    //   538: aload 5
    //   540: invokevirtual 200	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   543: invokestatic 247	com/tencent/ttpic/json/XML:toJSONObject	(Ljava/lang/String;)Lcom/tencent/ttpic/json/JSONObject;
    //   546: invokevirtual 250	com/tencent/ttpic/json/JSONObject:toString	()Ljava/lang/String;
    //   549: astore 5
    //   551: ldc 109
    //   553: aload 5
    //   555: invokestatic 253	com/tencent/ttpic/baseutils/LogUtils:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   558: aload 5
    //   560: invokestatic 40	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   563: ifne +370 -> 933
    //   566: new 255	org/json/JSONTokener
    //   569: astore 6
    //   571: aload 6
    //   573: aload 5
    //   575: invokespecial 256	org/json/JSONTokener:<init>	(Ljava/lang/String;)V
    //   578: aload 6
    //   580: invokevirtual 260	org/json/JSONTokener:nextValue	()Ljava/lang/Object;
    //   583: checkcast 262	org/json/JSONObject
    //   586: astore 5
    //   588: aload 4
    //   590: ifnull +8 -> 598
    //   593: aload 4
    //   595: invokevirtual 178	java/io/BufferedReader:close	()V
    //   598: aload_2
    //   599: ifnull +7 -> 606
    //   602: aload_2
    //   603: invokevirtual 179	java/io/InputStreamReader:close	()V
    //   606: aload_1
    //   607: ifnull +7 -> 614
    //   610: aload_1
    //   611: invokevirtual 182	java/io/InputStream:close	()V
    //   614: aload 5
    //   616: astore_1
    //   617: aload_0
    //   618: ifnull -305 -> 313
    //   621: aload_0
    //   622: invokevirtual 183	java/io/FileInputStream:close	()V
    //   625: aload 5
    //   627: astore_1
    //   628: goto -315 -> 313
    //   631: astore_0
    //   632: aload_0
    //   633: invokestatic 175	com/tencent/ttpic/baseutils/LogUtils:e	(Ljava/lang/Throwable;)V
    //   636: aload 5
    //   638: astore_1
    //   639: goto -326 -> 313
    //   642: aload 5
    //   644: invokevirtual 200	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   647: astore 5
    //   649: goto -98 -> 551
    //   652: astore_0
    //   653: aload_0
    //   654: invokestatic 175	com/tencent/ttpic/baseutils/LogUtils:e	(Ljava/lang/Throwable;)V
    //   657: aconst_null
    //   658: astore_1
    //   659: goto -346 -> 313
    //   662: astore_2
    //   663: aconst_null
    //   664: astore_0
    //   665: aconst_null
    //   666: astore 5
    //   668: aconst_null
    //   669: astore 4
    //   671: aconst_null
    //   672: astore_1
    //   673: aload 4
    //   675: ifnull +8 -> 683
    //   678: aload 4
    //   680: invokevirtual 178	java/io/BufferedReader:close	()V
    //   683: aload 5
    //   685: ifnull +8 -> 693
    //   688: aload 5
    //   690: invokevirtual 179	java/io/InputStreamReader:close	()V
    //   693: aload_1
    //   694: ifnull +7 -> 701
    //   697: aload_1
    //   698: invokevirtual 182	java/io/InputStream:close	()V
    //   701: aload_0
    //   702: ifnull +7 -> 709
    //   705: aload_0
    //   706: invokevirtual 183	java/io/FileInputStream:close	()V
    //   709: ldc 219
    //   711: invokestatic 43	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   714: aload_2
    //   715: athrow
    //   716: astore_0
    //   717: aload_0
    //   718: invokestatic 175	com/tencent/ttpic/baseutils/LogUtils:e	(Ljava/lang/Throwable;)V
    //   721: goto -12 -> 709
    //   724: astore_2
    //   725: aconst_null
    //   726: astore 5
    //   728: aconst_null
    //   729: astore 4
    //   731: aconst_null
    //   732: astore_1
    //   733: goto -60 -> 673
    //   736: astore_2
    //   737: aconst_null
    //   738: astore 5
    //   740: aconst_null
    //   741: astore 4
    //   743: goto -70 -> 673
    //   746: astore_0
    //   747: aconst_null
    //   748: astore 6
    //   750: aconst_null
    //   751: astore 5
    //   753: aconst_null
    //   754: astore 4
    //   756: aload_2
    //   757: astore_1
    //   758: aload_0
    //   759: astore_2
    //   760: aload 6
    //   762: astore_0
    //   763: goto -90 -> 673
    //   766: astore_2
    //   767: aconst_null
    //   768: astore_0
    //   769: aconst_null
    //   770: astore 5
    //   772: aconst_null
    //   773: astore 4
    //   775: goto -102 -> 673
    //   778: astore_2
    //   779: aconst_null
    //   780: astore 5
    //   782: aconst_null
    //   783: astore 4
    //   785: goto -112 -> 673
    //   788: astore 4
    //   790: aload_2
    //   791: astore 5
    //   793: aconst_null
    //   794: astore 6
    //   796: aload 4
    //   798: astore_2
    //   799: aload 6
    //   801: astore 4
    //   803: goto -130 -> 673
    //   806: astore 6
    //   808: aload_2
    //   809: astore 5
    //   811: aload 6
    //   813: astore_2
    //   814: goto -141 -> 673
    //   817: astore_2
    //   818: goto -145 -> 673
    //   821: astore_2
    //   822: aconst_null
    //   823: astore_0
    //   824: aconst_null
    //   825: astore 5
    //   827: aconst_null
    //   828: astore 4
    //   830: aconst_null
    //   831: astore_1
    //   832: goto -561 -> 271
    //   835: astore_2
    //   836: aconst_null
    //   837: astore 5
    //   839: aconst_null
    //   840: astore 4
    //   842: aconst_null
    //   843: astore_1
    //   844: goto -573 -> 271
    //   847: astore_2
    //   848: aconst_null
    //   849: astore 5
    //   851: aconst_null
    //   852: astore 4
    //   854: goto -583 -> 271
    //   857: astore_2
    //   858: aconst_null
    //   859: astore_0
    //   860: aconst_null
    //   861: astore 6
    //   863: aconst_null
    //   864: astore 4
    //   866: aload 5
    //   868: astore_1
    //   869: aload 6
    //   871: astore 5
    //   873: goto -602 -> 271
    //   876: astore_0
    //   877: aconst_null
    //   878: astore 6
    //   880: aconst_null
    //   881: astore 5
    //   883: aconst_null
    //   884: astore 4
    //   886: aload_2
    //   887: astore_1
    //   888: aload_0
    //   889: astore_2
    //   890: aload 6
    //   892: astore_0
    //   893: goto -622 -> 271
    //   896: astore_2
    //   897: aconst_null
    //   898: astore 5
    //   900: aconst_null
    //   901: astore 4
    //   903: goto -632 -> 271
    //   906: astore 4
    //   908: aload_2
    //   909: astore 5
    //   911: aconst_null
    //   912: astore 6
    //   914: aload 4
    //   916: astore_2
    //   917: aload 6
    //   919: astore 4
    //   921: goto -650 -> 271
    //   924: astore 5
    //   926: goto -410 -> 516
    //   929: astore_2
    //   930: goto -496 -> 434
    //   933: aconst_null
    //   934: astore 5
    //   936: goto -348 -> 588
    //   939: aconst_null
    //   940: astore_2
    //   941: aconst_null
    //   942: astore 4
    //   944: aconst_null
    //   945: astore 5
    //   947: goto -359 -> 588
    //   950: aconst_null
    //   951: astore_0
    //   952: goto -763 -> 189
    //
    // Exception table:
    //   from	to	target	type
    //   230	240	263	java/lang/Exception
    //   240	247	263	java/lang/Exception
    //   252	260	263	java/lang/Exception
    //   538	551	263	java/lang/Exception
    //   551	588	263	java/lang/Exception
    //   642	649	263	java/lang/Exception
    //   386	397	431	java/io/IOException
    //   401	408	431	java/io/IOException
    //   442	453	509	java/io/IOException
    //   471	478	509	java/io/IOException
    //   593	598	631	java/io/IOException
    //   602	606	631	java/io/IOException
    //   610	614	631	java/io/IOException
    //   621	625	631	java/io/IOException
    //   280	285	652	java/io/IOException
    //   290	295	652	java/io/IOException
    //   299	303	652	java/io/IOException
    //   307	311	652	java/io/IOException
    //   111	145	662	finally
    //   145	159	662	finally
    //   159	189	662	finally
    //   333	356	662	finally
    //   379	386	662	finally
    //   386	397	662	finally
    //   401	408	662	finally
    //   678	683	716	java/io/IOException
    //   688	693	716	java/io/IOException
    //   697	701	716	java/io/IOException
    //   705	709	716	java/io/IOException
    //   193	199	724	finally
    //   199	203	736	finally
    //   413	418	746	finally
    //   442	453	746	finally
    //   471	478	746	finally
    //   482	487	766	finally
    //   520	525	766	finally
    //   207	216	778	finally
    //   216	230	788	finally
    //   230	240	806	finally
    //   240	247	806	finally
    //   252	260	806	finally
    //   538	551	806	finally
    //   551	588	806	finally
    //   642	649	806	finally
    //   271	275	817	finally
    //   111	145	821	java/lang/Exception
    //   145	159	821	java/lang/Exception
    //   159	189	821	java/lang/Exception
    //   333	356	821	java/lang/Exception
    //   379	386	821	java/lang/Exception
    //   386	397	821	java/lang/Exception
    //   401	408	821	java/lang/Exception
    //   193	199	835	java/lang/Exception
    //   199	203	847	java/lang/Exception
    //   413	418	857	java/lang/Exception
    //   442	453	857	java/lang/Exception
    //   471	478	857	java/lang/Exception
    //   482	487	876	java/lang/Exception
    //   520	525	876	java/lang/Exception
    //   207	216	896	java/lang/Exception
    //   216	230	906	java/lang/Exception
    //   482	487	924	java/io/IOException
    //   413	418	929	java/io/IOException
  }

  // ERROR //
  private static JSONObject parseIOSFileProcess(Context paramContext, String paramString1, String paramString2, boolean paramBoolean)
  {
    // Byte code:
    //   0: ldc_w 263
    //   3: invokestatic 34	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: new 221	java/lang/StringBuilder
    //   9: dup
    //   10: invokespecial 222	java/lang/StringBuilder:<init>	()V
    //   13: aload_1
    //   14: invokevirtual 225	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   17: ldc 227
    //   19: invokevirtual 225	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   22: aload_2
    //   23: invokevirtual 225	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   26: ldc 229
    //   28: invokevirtual 225	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   31: astore 4
    //   33: iload_3
    //   34: ifeq +272 -> 306
    //   37: ldc 14
    //   39: astore 5
    //   41: aload 4
    //   43: aload 5
    //   45: invokevirtual 225	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   48: invokevirtual 230	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   51: astore 5
    //   53: new 221	java/lang/StringBuilder
    //   56: dup
    //   57: invokespecial 222	java/lang/StringBuilder:<init>	()V
    //   60: aload_1
    //   61: invokevirtual 225	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   64: ldc 227
    //   66: invokevirtual 225	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   69: aload_2
    //   70: invokevirtual 225	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   73: ldc 229
    //   75: invokevirtual 225	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   78: astore_2
    //   79: iload_3
    //   80: ifne +233 -> 313
    //   83: ldc 14
    //   85: astore_1
    //   86: aload_2
    //   87: aload_1
    //   88: invokevirtual 225	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   91: invokevirtual 230	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   94: astore 6
    //   96: new 129	java/io/File
    //   99: astore_1
    //   100: aload_1
    //   101: aload 5
    //   103: invokespecial 132	java/io/File:<init>	(Ljava/lang/String;)V
    //   106: new 129	java/io/File
    //   109: astore_2
    //   110: aload_2
    //   111: aload 6
    //   113: invokespecial 132	java/io/File:<init>	(Ljava/lang/String;)V
    //   116: aload_1
    //   117: invokevirtual 136	java/io/File:exists	()Z
    //   120: ifeq +10 -> 130
    //   123: aload_1
    //   124: invokevirtual 139	java/io/File:isFile	()Z
    //   127: ifne +17 -> 144
    //   130: aload_2
    //   131: invokevirtual 136	java/io/File:exists	()Z
    //   134: ifeq +233 -> 367
    //   137: aload_2
    //   138: invokevirtual 139	java/io/File:isFile	()Z
    //   141: ifeq +226 -> 367
    //   144: ldc 109
    //   146: ldc 237
    //   148: invokestatic 127	com/tencent/ttpic/baseutils/LogUtils:v	(Ljava/lang/String;Ljava/lang/String;)V
    //   151: aload_1
    //   152: invokevirtual 136	java/io/File:exists	()Z
    //   155: ifeq +164 -> 319
    //   158: aload_1
    //   159: invokevirtual 139	java/io/File:isFile	()Z
    //   162: ifeq +157 -> 319
    //   165: new 143	java/io/FileInputStream
    //   168: astore_0
    //   169: aload_0
    //   170: aload_1
    //   171: invokespecial 146	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   174: iload_3
    //   175: ifne +181 -> 356
    //   178: aload_0
    //   179: iconst_1
    //   180: invokestatic 239	com/tencent/ttpic/baseutils/BaseTemplateParser:drinkACupOfCoffee	(Ljava/io/InputStream;Z)Ljava/io/InputStream;
    //   183: astore_1
    //   184: aload_0
    //   185: invokestatic 152	com/tencent/ttpic/baseutils/IOUtils:closeQuietly	(Ljava/io/InputStream;)V
    //   188: aload_1
    //   189: ifnull +739 -> 928
    //   192: new 154	java/io/InputStreamReader
    //   195: astore_2
    //   196: aload_2
    //   197: aload_1
    //   198: invokespecial 156	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   201: new 158	java/io/BufferedReader
    //   204: astore 4
    //   206: aload 4
    //   208: aload_2
    //   209: sipush 1024
    //   212: invokespecial 161	java/io/BufferedReader:<init>	(Ljava/io/Reader;I)V
    //   215: new 163	java/lang/StringBuffer
    //   218: astore 6
    //   220: aload 6
    //   222: invokespecial 164	java/lang/StringBuffer:<init>	()V
    //   225: aload 4
    //   227: invokevirtual 167	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   230: astore 5
    //   232: aload 5
    //   234: ifnull +288 -> 522
    //   237: aload 6
    //   239: aload 5
    //   241: invokevirtual 171	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   244: pop
    //   245: goto -20 -> 225
    //   248: astore 6
    //   250: aload_2
    //   251: astore 5
    //   253: aload 6
    //   255: astore_2
    //   256: aload_2
    //   257: invokestatic 175	com/tencent/ttpic/baseutils/LogUtils:e	(Ljava/lang/Throwable;)V
    //   260: aload 4
    //   262: ifnull +8 -> 270
    //   265: aload 4
    //   267: invokevirtual 178	java/io/BufferedReader:close	()V
    //   270: aload 5
    //   272: ifnull +8 -> 280
    //   275: aload 5
    //   277: invokevirtual 179	java/io/InputStreamReader:close	()V
    //   280: aload_1
    //   281: ifnull +7 -> 288
    //   284: aload_1
    //   285: invokevirtual 182	java/io/InputStream:close	()V
    //   288: aload_0
    //   289: ifnull +7 -> 296
    //   292: aload_0
    //   293: invokevirtual 183	java/io/FileInputStream:close	()V
    //   296: aconst_null
    //   297: astore_1
    //   298: ldc_w 263
    //   301: invokestatic 43	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   304: aload_1
    //   305: areturn
    //   306: ldc 20
    //   308: astore 5
    //   310: goto -269 -> 41
    //   313: ldc 20
    //   315: astore_1
    //   316: goto -230 -> 86
    //   319: aload_2
    //   320: invokevirtual 136	java/io/File:exists	()Z
    //   323: ifeq +616 -> 939
    //   326: aload_2
    //   327: invokevirtual 139	java/io/File:isFile	()Z
    //   330: ifeq +609 -> 939
    //   333: new 143	java/io/FileInputStream
    //   336: dup
    //   337: aload_2
    //   338: invokespecial 146	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   341: astore_0
    //   342: iload_3
    //   343: ifne +8 -> 351
    //   346: iconst_1
    //   347: istore_3
    //   348: goto -174 -> 174
    //   351: iconst_0
    //   352: istore_3
    //   353: goto -5 -> 348
    //   356: aload_0
    //   357: astore_1
    //   358: aload_0
    //   359: astore_2
    //   360: aload_1
    //   361: astore_0
    //   362: aload_2
    //   363: astore_1
    //   364: goto -176 -> 188
    //   367: ldc 109
    //   369: ldc 241
    //   371: invokestatic 127	com/tencent/ttpic/baseutils/LogUtils:v	(Ljava/lang/String;Ljava/lang/String;)V
    //   374: aload_0
    //   375: invokevirtual 191	android/content/Context:getAssets	()Landroid/content/res/AssetManager;
    //   378: aload 5
    //   380: invokevirtual 197	android/content/res/AssetManager:open	(Ljava/lang/String;)Ljava/io/InputStream;
    //   383: astore 4
    //   385: iload_3
    //   386: ifne +25 -> 411
    //   389: aload 4
    //   391: iconst_1
    //   392: invokestatic 239	com/tencent/ttpic/baseutils/BaseTemplateParser:drinkACupOfCoffee	(Ljava/io/InputStream;Z)Ljava/io/InputStream;
    //   395: astore_1
    //   396: aload_1
    //   397: astore 5
    //   399: aload_1
    //   400: astore_2
    //   401: aload 4
    //   403: invokestatic 152	com/tencent/ttpic/baseutils/IOUtils:closeQuietly	(Ljava/io/InputStream;)V
    //   406: aconst_null
    //   407: astore_0
    //   408: goto -220 -> 188
    //   411: aconst_null
    //   412: astore_0
    //   413: aload 4
    //   415: astore_1
    //   416: goto -228 -> 188
    //   419: astore_1
    //   420: aconst_null
    //   421: astore_1
    //   422: iload_3
    //   423: istore 7
    //   425: aload_1
    //   426: astore 5
    //   428: aload_1
    //   429: astore_2
    //   430: aload_0
    //   431: invokevirtual 191	android/content/Context:getAssets	()Landroid/content/res/AssetManager;
    //   434: aload 6
    //   436: invokevirtual 197	android/content/res/AssetManager:open	(Ljava/lang/String;)Ljava/io/InputStream;
    //   439: astore 4
    //   441: iload_3
    //   442: ifne +42 -> 484
    //   445: iconst_1
    //   446: istore_3
    //   447: iload_3
    //   448: ifne +41 -> 489
    //   451: iload_3
    //   452: istore 7
    //   454: aload_1
    //   455: astore 5
    //   457: aload_1
    //   458: astore_2
    //   459: aload 4
    //   461: iconst_1
    //   462: invokestatic 239	com/tencent/ttpic/baseutils/BaseTemplateParser:drinkACupOfCoffee	(Ljava/io/InputStream;Z)Ljava/io/InputStream;
    //   465: astore_0
    //   466: aload_0
    //   467: astore_2
    //   468: aload_0
    //   469: astore_1
    //   470: aload 4
    //   472: invokestatic 152	com/tencent/ttpic/baseutils/IOUtils:closeQuietly	(Ljava/io/InputStream;)V
    //   475: aconst_null
    //   476: astore_2
    //   477: aload_0
    //   478: astore_1
    //   479: aload_2
    //   480: astore_0
    //   481: goto -293 -> 188
    //   484: iconst_0
    //   485: istore_3
    //   486: goto -39 -> 447
    //   489: aconst_null
    //   490: astore_0
    //   491: aload 4
    //   493: astore_1
    //   494: goto -306 -> 188
    //   497: astore 5
    //   499: aload_1
    //   500: astore_0
    //   501: iload 7
    //   503: istore_3
    //   504: aload_0
    //   505: astore_2
    //   506: aload_0
    //   507: astore_1
    //   508: aload 5
    //   510: invokestatic 175	com/tencent/ttpic/baseutils/LogUtils:e	(Ljava/lang/Throwable;)V
    //   513: aconst_null
    //   514: astore_2
    //   515: aload_0
    //   516: astore_1
    //   517: aload_2
    //   518: astore_0
    //   519: goto -331 -> 188
    //   522: iload_3
    //   523: ifeq +107 -> 630
    //   526: aload 6
    //   528: invokevirtual 200	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   531: invokestatic 247	com/tencent/ttpic/json/XML:toJSONObject	(Ljava/lang/String;)Lcom/tencent/ttpic/json/JSONObject;
    //   534: invokevirtual 250	com/tencent/ttpic/json/JSONObject:toString	()Ljava/lang/String;
    //   537: astore 5
    //   539: ldc 109
    //   541: aload 5
    //   543: invokestatic 253	com/tencent/ttpic/baseutils/LogUtils:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   546: aload 5
    //   548: invokestatic 40	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   551: ifne +371 -> 922
    //   554: new 255	org/json/JSONTokener
    //   557: astore 6
    //   559: aload 6
    //   561: aload 5
    //   563: invokespecial 256	org/json/JSONTokener:<init>	(Ljava/lang/String;)V
    //   566: aload 6
    //   568: invokevirtual 260	org/json/JSONTokener:nextValue	()Ljava/lang/Object;
    //   571: checkcast 262	org/json/JSONObject
    //   574: astore 5
    //   576: aload 4
    //   578: ifnull +8 -> 586
    //   581: aload 4
    //   583: invokevirtual 178	java/io/BufferedReader:close	()V
    //   586: aload_2
    //   587: ifnull +7 -> 594
    //   590: aload_2
    //   591: invokevirtual 179	java/io/InputStreamReader:close	()V
    //   594: aload_1
    //   595: ifnull +7 -> 602
    //   598: aload_1
    //   599: invokevirtual 182	java/io/InputStream:close	()V
    //   602: aload 5
    //   604: astore_1
    //   605: aload_0
    //   606: ifnull -308 -> 298
    //   609: aload_0
    //   610: invokevirtual 183	java/io/FileInputStream:close	()V
    //   613: aload 5
    //   615: astore_1
    //   616: goto -318 -> 298
    //   619: astore_0
    //   620: aload_0
    //   621: invokestatic 175	com/tencent/ttpic/baseutils/LogUtils:e	(Ljava/lang/Throwable;)V
    //   624: aload 5
    //   626: astore_1
    //   627: goto -329 -> 298
    //   630: aload 6
    //   632: invokevirtual 200	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   635: astore 5
    //   637: goto -98 -> 539
    //   640: astore_0
    //   641: aload_0
    //   642: invokestatic 175	com/tencent/ttpic/baseutils/LogUtils:e	(Ljava/lang/Throwable;)V
    //   645: aconst_null
    //   646: astore_1
    //   647: goto -349 -> 298
    //   650: astore_2
    //   651: aconst_null
    //   652: astore_0
    //   653: aconst_null
    //   654: astore 5
    //   656: aconst_null
    //   657: astore 4
    //   659: aconst_null
    //   660: astore_1
    //   661: aload 4
    //   663: ifnull +8 -> 671
    //   666: aload 4
    //   668: invokevirtual 178	java/io/BufferedReader:close	()V
    //   671: aload 5
    //   673: ifnull +8 -> 681
    //   676: aload 5
    //   678: invokevirtual 179	java/io/InputStreamReader:close	()V
    //   681: aload_1
    //   682: ifnull +7 -> 689
    //   685: aload_1
    //   686: invokevirtual 182	java/io/InputStream:close	()V
    //   689: aload_0
    //   690: ifnull +7 -> 697
    //   693: aload_0
    //   694: invokevirtual 183	java/io/FileInputStream:close	()V
    //   697: ldc_w 263
    //   700: invokestatic 43	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   703: aload_2
    //   704: athrow
    //   705: astore_0
    //   706: aload_0
    //   707: invokestatic 175	com/tencent/ttpic/baseutils/LogUtils:e	(Ljava/lang/Throwable;)V
    //   710: goto -13 -> 697
    //   713: astore_2
    //   714: aconst_null
    //   715: astore 5
    //   717: aconst_null
    //   718: astore 4
    //   720: aconst_null
    //   721: astore_1
    //   722: goto -61 -> 661
    //   725: astore_2
    //   726: aconst_null
    //   727: astore 5
    //   729: aconst_null
    //   730: astore 4
    //   732: goto -71 -> 661
    //   735: astore_2
    //   736: aconst_null
    //   737: astore_0
    //   738: aconst_null
    //   739: astore 6
    //   741: aconst_null
    //   742: astore 4
    //   744: aload 5
    //   746: astore_1
    //   747: aload 6
    //   749: astore 5
    //   751: goto -90 -> 661
    //   754: astore_0
    //   755: aconst_null
    //   756: astore 6
    //   758: aconst_null
    //   759: astore 5
    //   761: aconst_null
    //   762: astore 4
    //   764: aload_2
    //   765: astore_1
    //   766: aload_0
    //   767: astore_2
    //   768: aload 6
    //   770: astore_0
    //   771: goto -110 -> 661
    //   774: astore_2
    //   775: aconst_null
    //   776: astore 5
    //   778: aconst_null
    //   779: astore 4
    //   781: goto -120 -> 661
    //   784: astore 4
    //   786: aload_2
    //   787: astore 5
    //   789: aconst_null
    //   790: astore 6
    //   792: aload 4
    //   794: astore_2
    //   795: aload 6
    //   797: astore 4
    //   799: goto -138 -> 661
    //   802: astore 6
    //   804: aload_2
    //   805: astore 5
    //   807: aload 6
    //   809: astore_2
    //   810: goto -149 -> 661
    //   813: astore_2
    //   814: goto -153 -> 661
    //   817: astore_2
    //   818: aconst_null
    //   819: astore_0
    //   820: aconst_null
    //   821: astore 5
    //   823: aconst_null
    //   824: astore 4
    //   826: aconst_null
    //   827: astore_1
    //   828: goto -572 -> 256
    //   831: astore_2
    //   832: aconst_null
    //   833: astore 5
    //   835: aconst_null
    //   836: astore 4
    //   838: aconst_null
    //   839: astore_1
    //   840: goto -584 -> 256
    //   843: astore_2
    //   844: aconst_null
    //   845: astore 5
    //   847: aconst_null
    //   848: astore 4
    //   850: goto -594 -> 256
    //   853: astore_0
    //   854: aconst_null
    //   855: astore 6
    //   857: aconst_null
    //   858: astore 5
    //   860: aconst_null
    //   861: astore 4
    //   863: aload_2
    //   864: astore_1
    //   865: aload_0
    //   866: astore_2
    //   867: aload 6
    //   869: astore_0
    //   870: goto -614 -> 256
    //   873: astore_2
    //   874: aconst_null
    //   875: astore_0
    //   876: aconst_null
    //   877: astore 5
    //   879: aconst_null
    //   880: astore 4
    //   882: goto -626 -> 256
    //   885: astore_2
    //   886: aconst_null
    //   887: astore 5
    //   889: aconst_null
    //   890: astore 4
    //   892: goto -636 -> 256
    //   895: astore 4
    //   897: aload_2
    //   898: astore 5
    //   900: aconst_null
    //   901: astore 6
    //   903: aload 4
    //   905: astore_2
    //   906: aload 6
    //   908: astore 4
    //   910: goto -654 -> 256
    //   913: astore 5
    //   915: goto -411 -> 504
    //   918: astore_2
    //   919: goto -497 -> 422
    //   922: aconst_null
    //   923: astore 5
    //   925: goto -349 -> 576
    //   928: aconst_null
    //   929: astore_2
    //   930: aconst_null
    //   931: astore 4
    //   933: aconst_null
    //   934: astore 5
    //   936: goto -360 -> 576
    //   939: aconst_null
    //   940: astore_0
    //   941: goto -767 -> 174
    //
    // Exception table:
    //   from	to	target	type
    //   215	225	248	java/lang/Exception
    //   225	232	248	java/lang/Exception
    //   237	245	248	java/lang/Exception
    //   526	539	248	java/lang/Exception
    //   539	576	248	java/lang/Exception
    //   630	637	248	java/lang/Exception
    //   374	385	419	java/io/IOException
    //   389	396	419	java/io/IOException
    //   430	441	497	java/io/IOException
    //   459	466	497	java/io/IOException
    //   581	586	619	java/io/IOException
    //   590	594	619	java/io/IOException
    //   598	602	619	java/io/IOException
    //   609	613	619	java/io/IOException
    //   265	270	640	java/io/IOException
    //   275	280	640	java/io/IOException
    //   284	288	640	java/io/IOException
    //   292	296	640	java/io/IOException
    //   96	130	650	finally
    //   130	144	650	finally
    //   144	174	650	finally
    //   319	342	650	finally
    //   367	374	650	finally
    //   374	385	650	finally
    //   389	396	650	finally
    //   666	671	705	java/io/IOException
    //   676	681	705	java/io/IOException
    //   685	689	705	java/io/IOException
    //   693	697	705	java/io/IOException
    //   178	184	713	finally
    //   184	188	725	finally
    //   401	406	735	finally
    //   430	441	735	finally
    //   459	466	735	finally
    //   470	475	754	finally
    //   508	513	754	finally
    //   192	201	774	finally
    //   201	215	784	finally
    //   215	225	802	finally
    //   225	232	802	finally
    //   237	245	802	finally
    //   526	539	802	finally
    //   539	576	802	finally
    //   630	637	802	finally
    //   256	260	813	finally
    //   96	130	817	java/lang/Exception
    //   130	144	817	java/lang/Exception
    //   144	174	817	java/lang/Exception
    //   319	342	817	java/lang/Exception
    //   367	374	817	java/lang/Exception
    //   374	385	817	java/lang/Exception
    //   389	396	817	java/lang/Exception
    //   178	184	831	java/lang/Exception
    //   184	188	843	java/lang/Exception
    //   401	406	853	java/lang/Exception
    //   430	441	853	java/lang/Exception
    //   459	466	853	java/lang/Exception
    //   470	475	873	java/lang/Exception
    //   508	513	873	java/lang/Exception
    //   192	201	885	java/lang/Exception
    //   201	215	895	java/lang/Exception
    //   470	475	913	java/io/IOException
    //   401	406	918	java/io/IOException
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.baseutils.BaseTemplateParser
 * JD-Core Version:    0.6.2
 */