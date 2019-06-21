package org.xwalk.core;

import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.Signature;
import android.content.res.AssetFileDescriptor;
import android.os.AsyncTask;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.xweb.XWebCoreContentProvider;
import com.tencent.xweb.a;
import com.tencent.xweb.util.BSpatch;
import com.tencent.xweb.util.b;
import com.tencent.xweb.util.d;
import com.tencent.xweb.util.f;
import com.tencent.xweb.xwalk.b.c.a;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class XWalkUpdater
{
  private static final String ANDROID_MARKET_DETAILS = "market://details?id=";
  public static final int ERROR_DOPATCH_FAILED = -3;
  public static final int ERROR_DOPATCH_MD5_FAILED = -4;
  public static final int ERROR_DOWNLOAD_FAILED = -1;
  public static final int ERROR_DOWNLOAD_MD5_FAILED = -2;
  public static final int ERROR_EXTRACT_RESOURCE_FAILED = -5;
  public static final int ERROR_EXTRACT_RESOURCE_FAILED_FOR_RETRY = -12;
  public static final int ERROR_NONE = 0;
  public static final int ERROR_SET_VERNUM = -101;
  public static final int ERROR_SHARED_MODE_EXCEED_MAX_COUNT = -7;
  public static final int ERROR_SHARED_MODE_FORCE_DOWNLOAD = -6;
  public static final int ERROR_SHARED_MODE_NO_CONTENT_RESOLVER = -8;
  public static final int ERROR_SHARED_MODE_NO_PROVIDER = -9;
  public static final int ERROR_SHARED_MODE_OTHER = -11;
  public static final int ERROR_SHARED_MODE_TRY_AGAIN = -10;
  private static final String GOOGLE_PLAY_PACKAGE = "com.android.vending";
  private static final int RES_EXTRACTOR_MAXTIMES = 1;
  private static final String TAG = "XWalkLib";
  public static final int UPDATE_BIZ_TYPE_RUNTIME_PACKAGE = 1;
  public static final int UPDATE_BIZ_TYPE_RUNTIME_PATCH = 2;
  private static int mCurrentTimeForRetryRes = 0;
  private XWalkUpdater.XWalkBackgroundUpdateListener mBackgroundUpdateListener;
  private Runnable mCancelCommand;
  private Context mContext;
  private XWalkDialogManager mDialogManager;
  private Runnable mDownloadCommand;
  private XWalkUpdater.XWalkUpdateListener mUpdateListener;

  public XWalkUpdater(XWalkUpdater.XWalkBackgroundUpdateListener paramXWalkBackgroundUpdateListener, Context paramContext)
  {
    this.mBackgroundUpdateListener = paramXWalkBackgroundUpdateListener;
    this.mContext = paramContext;
  }

  public XWalkUpdater(XWalkUpdater.XWalkUpdateListener paramXWalkUpdateListener, Context paramContext)
  {
    AppMethodBeat.i(85916);
    this.mUpdateListener = paramXWalkUpdateListener;
    this.mContext = paramContext;
    this.mDialogManager = new XWalkDialogManager(paramContext);
    AppMethodBeat.o(85916);
  }

  public XWalkUpdater(XWalkUpdater.XWalkUpdateListener paramXWalkUpdateListener, Context paramContext, XWalkDialogManager paramXWalkDialogManager)
  {
    this.mUpdateListener = paramXWalkUpdateListener;
    this.mContext = paramContext;
    this.mDialogManager = paramXWalkDialogManager;
  }

  // ERROR //
  public static boolean checkExtractResFileLengtgAndMd5(String paramString1, String paramString2, int paramInt)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_3
    //   2: ldc 120
    //   4: invokestatic 100	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   7: new 122	java/io/File
    //   10: astore 4
    //   12: aload 4
    //   14: aload_0
    //   15: invokespecial 125	java/io/File:<init>	(Ljava/lang/String;)V
    //   18: aload 4
    //   20: invokevirtual 129	java/io/File:exists	()Z
    //   23: ifne +109 -> 132
    //   26: iload_2
    //   27: invokestatic 135	org/xwalk/core/XWalkEnvironment:isTestVersion	(I)Z
    //   30: ifne +10 -> 40
    //   33: iload_2
    //   34: sipush 362
    //   37: if_icmpge +30 -> 67
    //   40: iconst_1
    //   41: istore_2
    //   42: iload_2
    //   43: ifeq +29 -> 72
    //   46: ldc 64
    //   48: ldc 137
    //   50: aload_0
    //   51: invokestatic 143	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   54: invokevirtual 147	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   57: invokestatic 153	org/xwalk/core/XWalkInitializer:addXWalkInitializeLog	(Ljava/lang/String;Ljava/lang/String;)V
    //   60: ldc 120
    //   62: invokestatic 112	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   65: iload_3
    //   66: ireturn
    //   67: iconst_0
    //   68: istore_2
    //   69: goto -27 -> 42
    //   72: ldc2_w 154
    //   75: invokestatic 161	com/tencent/xweb/util/f:nI	(J)V
    //   78: ldc 64
    //   80: ldc 163
    //   82: aload_0
    //   83: invokestatic 143	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   86: invokevirtual 147	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   89: invokestatic 153	org/xwalk/core/XWalkInitializer:addXWalkInitializeLog	(Ljava/lang/String;Ljava/lang/String;)V
    //   92: ldc 165
    //   94: ldc 167
    //   96: ldc 169
    //   98: invokestatic 175	com/tencent/xweb/a:iG	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   101: invokevirtual 179	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   104: ifeq +18 -> 122
    //   107: ldc 64
    //   109: ldc 181
    //   111: invokestatic 153	org/xwalk/core/XWalkInitializer:addXWalkInitializeLog	(Ljava/lang/String;Ljava/lang/String;)V
    //   114: ldc 120
    //   116: invokestatic 112	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   119: goto -54 -> 65
    //   122: ldc 120
    //   124: invokestatic 112	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   127: iconst_0
    //   128: istore_3
    //   129: goto -64 -> 65
    //   132: new 183	java/io/FileInputStream
    //   135: dup
    //   136: aload 4
    //   138: invokespecial 186	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   141: astore 5
    //   143: new 188	java/io/InputStreamReader
    //   146: astore 4
    //   148: aload 4
    //   150: aload 5
    //   152: invokespecial 191	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   155: new 193	java/io/BufferedReader
    //   158: astore_0
    //   159: aload_0
    //   160: aload 4
    //   162: invokespecial 196	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   165: aload_0
    //   166: astore 6
    //   168: aload 4
    //   170: astore 7
    //   172: aload 5
    //   174: astore 8
    //   176: aload_0
    //   177: invokevirtual 200	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   180: astore 9
    //   182: aload 9
    //   184: ifnull +359 -> 543
    //   187: aload 9
    //   189: ifnull -24 -> 165
    //   192: aload_0
    //   193: astore 6
    //   195: aload 4
    //   197: astore 7
    //   199: aload 5
    //   201: astore 8
    //   203: aload 9
    //   205: invokevirtual 203	java/lang/String:isEmpty	()Z
    //   208: ifne -43 -> 165
    //   211: aload_0
    //   212: astore 6
    //   214: aload 4
    //   216: astore 7
    //   218: aload 5
    //   220: astore 8
    //   222: aload 9
    //   224: ldc 205
    //   226: invokevirtual 209	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   229: astore 9
    //   231: aload 9
    //   233: ifnull -68 -> 165
    //   236: aload_0
    //   237: astore 6
    //   239: aload 4
    //   241: astore 7
    //   243: aload 5
    //   245: astore 8
    //   247: aload 9
    //   249: arraylength
    //   250: iconst_2
    //   251: if_icmpne -86 -> 165
    //   254: aload 9
    //   256: iconst_0
    //   257: aaload
    //   258: ifnull -93 -> 165
    //   261: aload_0
    //   262: astore 6
    //   264: aload 4
    //   266: astore 7
    //   268: aload 5
    //   270: astore 8
    //   272: aload 9
    //   274: iconst_0
    //   275: aaload
    //   276: invokevirtual 203	java/lang/String:isEmpty	()Z
    //   279: ifne -114 -> 165
    //   282: aload 9
    //   284: iconst_1
    //   285: aaload
    //   286: ifnull -121 -> 165
    //   289: aload_0
    //   290: astore 6
    //   292: aload 4
    //   294: astore 7
    //   296: aload 5
    //   298: astore 8
    //   300: aload 9
    //   302: iconst_1
    //   303: aaload
    //   304: invokevirtual 203	java/lang/String:isEmpty	()Z
    //   307: ifne -142 -> 165
    //   310: aload_0
    //   311: astore 6
    //   313: aload 4
    //   315: astore 7
    //   317: aload 5
    //   319: astore 8
    //   321: new 122	java/io/File
    //   324: astore 10
    //   326: aload_0
    //   327: astore 6
    //   329: aload 4
    //   331: astore 7
    //   333: aload 5
    //   335: astore 8
    //   337: aload 10
    //   339: aload_1
    //   340: aload 9
    //   342: iconst_0
    //   343: aaload
    //   344: invokespecial 211	java/io/File:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   347: aload_0
    //   348: astore 6
    //   350: aload 4
    //   352: astore 7
    //   354: aload 5
    //   356: astore 8
    //   358: aload 10
    //   360: invokestatic 217	com/tencent/xweb/util/d:v	(Ljava/io/File;)Ljava/lang/String;
    //   363: astore 11
    //   365: aload_0
    //   366: astore 6
    //   368: aload 4
    //   370: astore 7
    //   372: aload 5
    //   374: astore 8
    //   376: aload 11
    //   378: aload 9
    //   380: iconst_1
    //   381: aaload
    //   382: invokevirtual 179	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   385: ifne -220 -> 165
    //   388: aload_0
    //   389: astore 6
    //   391: aload 4
    //   393: astore 7
    //   395: aload 5
    //   397: astore 8
    //   399: new 219	java/lang/StringBuilder
    //   402: astore_1
    //   403: aload_0
    //   404: astore 6
    //   406: aload 4
    //   408: astore 7
    //   410: aload 5
    //   412: astore 8
    //   414: aload_1
    //   415: ldc 221
    //   417: invokespecial 222	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   420: aload_0
    //   421: astore 6
    //   423: aload 4
    //   425: astore 7
    //   427: aload 5
    //   429: astore 8
    //   431: ldc 64
    //   433: aload_1
    //   434: aload 9
    //   436: iconst_0
    //   437: aaload
    //   438: invokevirtual 226	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   441: ldc 228
    //   443: invokevirtual 226	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   446: aload 9
    //   448: iconst_1
    //   449: aaload
    //   450: invokevirtual 226	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   453: ldc 230
    //   455: invokevirtual 226	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   458: aload 11
    //   460: invokevirtual 226	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   463: invokevirtual 233	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   466: invokestatic 153	org/xwalk/core/XWalkInitializer:addXWalkInitializeLog	(Ljava/lang/String;Ljava/lang/String;)V
    //   469: aload_0
    //   470: astore 6
    //   472: aload 4
    //   474: astore 7
    //   476: aload 5
    //   478: astore 8
    //   480: aload 10
    //   482: invokevirtual 236	java/io/File:delete	()Z
    //   485: pop
    //   486: aload 5
    //   488: invokevirtual 239	java/io/FileInputStream:close	()V
    //   491: aload 4
    //   493: invokevirtual 240	java/io/InputStreamReader:close	()V
    //   496: aload_0
    //   497: invokevirtual 241	java/io/BufferedReader:close	()V
    //   500: ldc 120
    //   502: invokestatic 112	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   505: iconst_0
    //   506: istore_3
    //   507: goto -442 -> 65
    //   510: astore_1
    //   511: ldc 64
    //   513: ldc 243
    //   515: invokestatic 248	org/xwalk/core/Log:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   518: goto -27 -> 491
    //   521: astore_1
    //   522: ldc 64
    //   524: ldc 250
    //   526: invokestatic 248	org/xwalk/core/Log:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   529: goto -33 -> 496
    //   532: astore_0
    //   533: ldc 64
    //   535: ldc 252
    //   537: invokestatic 248	org/xwalk/core/Log:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   540: goto -40 -> 500
    //   543: aload 5
    //   545: invokevirtual 239	java/io/FileInputStream:close	()V
    //   548: aload 4
    //   550: invokevirtual 240	java/io/InputStreamReader:close	()V
    //   553: aload_0
    //   554: invokevirtual 241	java/io/BufferedReader:close	()V
    //   557: ldc 120
    //   559: invokestatic 112	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   562: goto -497 -> 65
    //   565: astore_1
    //   566: ldc 64
    //   568: ldc 243
    //   570: invokestatic 248	org/xwalk/core/Log:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   573: goto -25 -> 548
    //   576: astore_1
    //   577: ldc 64
    //   579: ldc 250
    //   581: invokestatic 248	org/xwalk/core/Log:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   584: goto -31 -> 553
    //   587: astore_0
    //   588: ldc 64
    //   590: ldc 252
    //   592: invokestatic 248	org/xwalk/core/Log:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   595: goto -38 -> 557
    //   598: astore_1
    //   599: aconst_null
    //   600: astore_0
    //   601: aconst_null
    //   602: astore 4
    //   604: aconst_null
    //   605: astore 5
    //   607: aload_0
    //   608: astore 6
    //   610: aload 4
    //   612: astore 7
    //   614: aload 5
    //   616: astore 8
    //   618: new 219	java/lang/StringBuilder
    //   621: astore 9
    //   623: aload_0
    //   624: astore 6
    //   626: aload 4
    //   628: astore 7
    //   630: aload 5
    //   632: astore 8
    //   634: aload 9
    //   636: ldc 254
    //   638: invokespecial 222	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   641: aload_0
    //   642: astore 6
    //   644: aload 4
    //   646: astore 7
    //   648: aload 5
    //   650: astore 8
    //   652: ldc 64
    //   654: aload 9
    //   656: aload_1
    //   657: invokevirtual 257	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   660: invokevirtual 226	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   663: invokevirtual 233	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   666: invokestatic 248	org/xwalk/core/Log:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   669: aload 5
    //   671: ifnull +8 -> 679
    //   674: aload 5
    //   676: invokevirtual 239	java/io/FileInputStream:close	()V
    //   679: aload 4
    //   681: ifnull +8 -> 689
    //   684: aload 4
    //   686: invokevirtual 240	java/io/InputStreamReader:close	()V
    //   689: aload_0
    //   690: ifnull +7 -> 697
    //   693: aload_0
    //   694: invokevirtual 241	java/io/BufferedReader:close	()V
    //   697: ldc 120
    //   699: invokestatic 112	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   702: iconst_0
    //   703: istore_3
    //   704: goto -639 -> 65
    //   707: astore_1
    //   708: ldc 64
    //   710: ldc 243
    //   712: invokestatic 248	org/xwalk/core/Log:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   715: goto -36 -> 679
    //   718: astore_1
    //   719: ldc 64
    //   721: ldc 250
    //   723: invokestatic 248	org/xwalk/core/Log:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   726: goto -37 -> 689
    //   729: astore_0
    //   730: ldc 64
    //   732: ldc 252
    //   734: invokestatic 248	org/xwalk/core/Log:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   737: goto -40 -> 697
    //   740: astore_0
    //   741: aconst_null
    //   742: astore_1
    //   743: aconst_null
    //   744: astore 4
    //   746: aconst_null
    //   747: astore 5
    //   749: aload 5
    //   751: ifnull +8 -> 759
    //   754: aload 5
    //   756: invokevirtual 239	java/io/FileInputStream:close	()V
    //   759: aload 4
    //   761: ifnull +8 -> 769
    //   764: aload 4
    //   766: invokevirtual 240	java/io/InputStreamReader:close	()V
    //   769: aload_1
    //   770: ifnull +7 -> 777
    //   773: aload_1
    //   774: invokevirtual 241	java/io/BufferedReader:close	()V
    //   777: ldc 120
    //   779: invokestatic 112	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   782: aload_0
    //   783: athrow
    //   784: astore 5
    //   786: ldc 64
    //   788: ldc 243
    //   790: invokestatic 248	org/xwalk/core/Log:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   793: goto -34 -> 759
    //   796: astore 4
    //   798: ldc 64
    //   800: ldc 250
    //   802: invokestatic 248	org/xwalk/core/Log:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   805: goto -36 -> 769
    //   808: astore_1
    //   809: ldc 64
    //   811: ldc 252
    //   813: invokestatic 248	org/xwalk/core/Log:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   816: goto -39 -> 777
    //   819: astore_0
    //   820: aconst_null
    //   821: astore_1
    //   822: aconst_null
    //   823: astore 4
    //   825: goto -76 -> 749
    //   828: astore_0
    //   829: aconst_null
    //   830: astore_1
    //   831: goto -82 -> 749
    //   834: astore_0
    //   835: aload 6
    //   837: astore_1
    //   838: aload 7
    //   840: astore 4
    //   842: aload 8
    //   844: astore 5
    //   846: goto -97 -> 749
    //   849: astore_1
    //   850: aconst_null
    //   851: astore_0
    //   852: aconst_null
    //   853: astore 4
    //   855: goto -248 -> 607
    //   858: astore_1
    //   859: aconst_null
    //   860: astore_0
    //   861: goto -254 -> 607
    //   864: astore_1
    //   865: goto -258 -> 607
    //
    // Exception table:
    //   from	to	target	type
    //   486	491	510	java/lang/Exception
    //   491	496	521	java/lang/Exception
    //   496	500	532	java/lang/Exception
    //   543	548	565	java/lang/Exception
    //   548	553	576	java/lang/Exception
    //   553	557	587	java/lang/Exception
    //   7	33	598	java/lang/Exception
    //   46	60	598	java/lang/Exception
    //   72	114	598	java/lang/Exception
    //   132	143	598	java/lang/Exception
    //   674	679	707	java/lang/Exception
    //   684	689	718	java/lang/Exception
    //   693	697	729	java/lang/Exception
    //   7	33	740	finally
    //   46	60	740	finally
    //   72	114	740	finally
    //   132	143	740	finally
    //   754	759	784	java/lang/Exception
    //   764	769	796	java/lang/Exception
    //   773	777	808	java/lang/Exception
    //   143	155	819	finally
    //   155	165	828	finally
    //   176	182	834	finally
    //   203	211	834	finally
    //   222	231	834	finally
    //   247	254	834	finally
    //   272	282	834	finally
    //   300	310	834	finally
    //   321	326	834	finally
    //   337	347	834	finally
    //   358	365	834	finally
    //   376	388	834	finally
    //   399	403	834	finally
    //   414	420	834	finally
    //   431	469	834	finally
    //   480	486	834	finally
    //   618	623	834	finally
    //   634	641	834	finally
    //   652	669	834	finally
    //   143	155	849	java/lang/Exception
    //   155	165	858	java/lang/Exception
    //   176	182	864	java/lang/Exception
    //   203	211	864	java/lang/Exception
    //   222	231	864	java/lang/Exception
    //   247	254	864	java/lang/Exception
    //   272	282	864	java/lang/Exception
    //   300	310	864	java/lang/Exception
    //   321	326	864	java/lang/Exception
    //   337	347	864	java/lang/Exception
    //   358	365	864	java/lang/Exception
    //   376	388	864	java/lang/Exception
    //   399	403	864	java/lang/Exception
    //   414	420	864	java/lang/Exception
    //   431	469	864	java/lang/Exception
    //   480	486	864	java/lang/Exception
  }

  private static Integer extractResource(UpdateConfig paramUpdateConfig)
  {
    AppMethodBeat.i(85927);
    String str = XWalkEnvironment.getExtractedCoreDir(paramUpdateConfig.apkVer);
    if (!XWalkDecompressor.extractResource(XWalkEnvironment.getDownloadApkPath(paramUpdateConfig.apkVer), str))
    {
      XWalkInitializer.addXWalkInitializeLog("XWalkLib", "extract faield");
      paramUpdateConfig = Integer.valueOf(-5);
      AppMethodBeat.o(85927);
    }
    while (true)
    {
      return paramUpdateConfig;
      if (checkExtractResFileLengtgAndMd5(XWalkEnvironment.getDownloadResFileListConfig(paramUpdateConfig.apkVer), str, paramUpdateConfig.apkVer) == true)
      {
        XWalkInitializer.addXWalkInitializeLog("XWalkLib", "checkExtractResFileLengtgAndMd5 success!!!!");
        if (!generateOptDex(paramUpdateConfig.apkVer))
        {
          f.nI(251L);
          if ("true".equalsIgnoreCase(a.iG("update_need_check_dex", "tools")))
          {
            paramUpdateConfig = Integer.valueOf(-101);
            AppMethodBeat.o(85927);
          }
        }
      }
      else
      {
        if (mCurrentTimeForRetryRes <= 0)
        {
          XWalkInitializer.addXWalkInitializeLog("XWalkLib", "checkExtractResFileLengtgAndMd5 failed retry extractResource");
          mCurrentTimeForRetryRes += 1;
          break;
        }
        XWalkInitializer.addXWalkInitializeLog("XWalkLib", "checkResourceLengthAndMd5 failed can not retry!!!!!!!!!! mCurrentTimeForRetryRes = " + mCurrentTimeForRetryRes);
        paramUpdateConfig = Integer.valueOf(-12);
        AppMethodBeat.o(85927);
        continue;
        boolean bool = XWalkEnvironment.setAvailableVersion(paramUpdateConfig.apkVer, paramUpdateConfig.versionDetail);
        XWalkInitializer.addXWalkInitializeLog("XWalkLib", "do update sucsess");
        if (!bool)
        {
          XWalkInitializer.addXWalkInitializeLog("XWalkLib", "set version failed");
          paramUpdateConfig = Integer.valueOf(-101);
          AppMethodBeat.o(85927);
        }
        else
        {
          paramUpdateConfig = Integer.valueOf(0);
          AppMethodBeat.o(85927);
        }
      }
    }
  }

  private static boolean generateOptDex(int paramInt)
  {
    AppMethodBeat.i(85928);
    try
    {
      String str1 = XWalkEnvironment.getExtractedCoreDir(paramInt);
      String str2 = XWalkEnvironment.getClassDexFilePath(paramInt);
      String str3 = XWalkEnvironment.getOptimizedDexDir(paramInt);
      ClassLoader localClassLoader = ClassLoader.getSystemClassLoader();
      new DexClassLoader(str2, str3, str1, localClassLoader);
      bool = true;
      AppMethodBeat.o(85928);
      return bool;
    }
    catch (Exception localException)
    {
      while (true)
      {
        XWalkInitializer.addXWalkInitializeLog("XWalkLib", "dex output error");
        boolean bool = false;
        AppMethodBeat.o(85928);
      }
    }
  }

  // ERROR //
  private static boolean isProviderExist(ContentResolver paramContentResolver, String paramString)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_2
    //   2: ldc_w 337
    //   5: invokestatic 100	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   8: aload_0
    //   9: ifnull +14 -> 23
    //   12: aload_1
    //   13: ifnull +10 -> 23
    //   16: aload_1
    //   17: invokevirtual 203	java/lang/String:isEmpty	()Z
    //   20: ifeq +13 -> 33
    //   23: ldc_w 337
    //   26: invokestatic 112	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   29: iconst_0
    //   30: istore_2
    //   31: iload_2
    //   32: ireturn
    //   33: aload_0
    //   34: aload_1
    //   35: invokestatic 340	org/xwalk/core/XWalkEnvironment:getPackageName	()Ljava/lang/String;
    //   38: iconst_1
    //   39: iconst_0
    //   40: ldc_w 342
    //   43: invokestatic 348	com/tencent/xweb/XWebCoreContentProvider:b	(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;)Landroid/net/Uri;
    //   46: ldc_w 342
    //   49: invokevirtual 354	android/content/ContentResolver:openAssetFileDescriptor	(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/res/AssetFileDescriptor;
    //   52: astore_0
    //   53: aload_0
    //   54: invokestatic 360	com/tencent/xweb/util/b:a	(Landroid/content/res/AssetFileDescriptor;)V
    //   57: ldc_w 337
    //   60: invokestatic 112	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   63: goto -32 -> 31
    //   66: astore_0
    //   67: aconst_null
    //   68: invokestatic 360	com/tencent/xweb/util/b:a	(Landroid/content/res/AssetFileDescriptor;)V
    //   71: iconst_0
    //   72: istore_2
    //   73: goto -16 -> 57
    //   76: astore_0
    //   77: aconst_null
    //   78: invokestatic 360	com/tencent/xweb/util/b:a	(Landroid/content/res/AssetFileDescriptor;)V
    //   81: ldc_w 337
    //   84: invokestatic 112	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   87: aload_0
    //   88: athrow
    //
    // Exception table:
    //   from	to	target	type
    //   33	53	66	java/lang/Exception
    //   33	53	76	finally
  }

  public static boolean onDoPatch(String paramString, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(85930);
    Log.i("XWalkLib", "onDoPatch:" + paramString + ",currentVersion:" + paramInt1 + ",newVersion:" + paramInt2);
    boolean bool;
    if (!new File(paramString).exists())
    {
      Log.e("XWalkLib", "onDoPatch no patch zip file");
      AppMethodBeat.o(85930);
      bool = false;
    }
    while (true)
    {
      return bool;
      if (!XWalkDecompressor.decompressDownloadPatchZip(paramString, XWalkEnvironment.getPatchZipTempDecompressPath(paramInt2)))
      {
        Log.e("XWalkLib", "onDoPatch decompress zip error");
        f.nI(37L);
        AppMethodBeat.o(85930);
        bool = false;
      }
      else
      {
        paramString = XWalkUpdater.PatchFileConfigParser.getPatchFileConfigList(paramInt2);
        if (paramString == null)
        {
          Log.e("XWalkLib", "onDoPatch patchFileConfigList = null");
          f.nI(38L);
          AppMethodBeat.o(85930);
          bool = false;
        }
        else if (!b.iI(XWalkEnvironment.getExtractedCoreDir(paramInt1), XWalkEnvironment.getExtractedCoreDir(paramInt2)))
        {
          Log.e("XWalkLib", "onDoPatch copy all extraced file error");
          f.nI(39L);
          AppMethodBeat.o(85930);
          bool = false;
        }
        else
        {
          Log.i("XWalkLib", "onDoPatch copy all extraced file finished");
          Object localObject1 = new ArrayList();
          Object localObject2 = paramString.iterator();
          while (((Iterator)localObject2).hasNext())
          {
            localObject3 = (XWalkUpdater.PatchFileConfig)((Iterator)localObject2).next();
            if (((XWalkUpdater.PatchFileConfig)localObject3).isTypeAdd())
              ((ArrayList)localObject1).add(localObject3);
          }
          Object localObject3 = ((ArrayList)localObject1).iterator();
          while (true)
          {
            if (!((Iterator)localObject3).hasNext())
              break label358;
            localObject2 = (XWalkUpdater.PatchFileConfig)((Iterator)localObject3).next();
            if (!b.copyFile(XWalkEnvironment.getPatchZipTempDecompressFilePath(paramInt2, ((XWalkUpdater.PatchFileConfig)localObject2).originalFileName), XWalkEnvironment.getExtractedCoreFile(paramInt2, ((XWalkUpdater.PatchFileConfig)localObject2).originalFileName)))
            {
              Log.e("XWalkLib", "onDoPatch add file error:".concat(String.valueOf(localObject2)));
              f.nI(40L);
              AppMethodBeat.o(85930);
              bool = false;
              break;
            }
            Log.i("XWalkLib", "onDoPatch add file:".concat(String.valueOf(localObject2)));
          }
          label358: Log.i("XWalkLib", "onDoPatch add file finished");
          localObject2 = new ArrayList();
          localObject1 = paramString.iterator();
          while (((Iterator)localObject1).hasNext())
          {
            localObject3 = (XWalkUpdater.PatchFileConfig)((Iterator)localObject1).next();
            if (((XWalkUpdater.PatchFileConfig)localObject3).isTypeRemove())
              ((ArrayList)localObject2).add(localObject3);
          }
          localObject2 = ((ArrayList)localObject2).iterator();
          while (((Iterator)localObject2).hasNext())
          {
            localObject3 = (XWalkUpdater.PatchFileConfig)((Iterator)localObject2).next();
            if (!b.deleteFile(XWalkEnvironment.getExtractedCoreFile(paramInt2, ((XWalkUpdater.PatchFileConfig)localObject3).originalFileName)))
            {
              Log.e("XWalkLib", "onDoPatch delete file error:".concat(String.valueOf(localObject3)));
              f.nI(41L);
            }
            else
            {
              Log.i("XWalkLib", "onDoPatch delete file:".concat(String.valueOf(localObject3)));
            }
          }
          Log.i("XWalkLib", "onDoPatch remove file finished");
          localObject3 = new ArrayList();
          paramString = paramString.iterator();
          while (paramString.hasNext())
          {
            localObject2 = (XWalkUpdater.PatchFileConfig)paramString.next();
            if (((XWalkUpdater.PatchFileConfig)localObject2).isTypeModify())
              ((ArrayList)localObject3).add(localObject2);
          }
          paramString = ((ArrayList)localObject3).iterator();
          while (true)
          {
            if (!paramString.hasNext())
              break label676;
            localObject2 = (XWalkUpdater.PatchFileConfig)paramString.next();
            if (((XWalkUpdater.PatchFileConfig)localObject2).isExtractedFile())
            {
              if (BSpatch.aH(XWalkEnvironment.getExtractedCoreFile(paramInt2, ((XWalkUpdater.PatchFileConfig)localObject2).originalFileName), XWalkEnvironment.getPatchZipTempDecompressFilePath(paramInt2, ((XWalkUpdater.PatchFileConfig)localObject2).patchFileName), XWalkEnvironment.getExtractedCoreFile(paramInt2, ((XWalkUpdater.PatchFileConfig)localObject2).originalFileName)) < 0)
              {
                Log.e("XWalkLib", "onDoPatch patch error file:".concat(String.valueOf(localObject2)));
                AppMethodBeat.o(85930);
                bool = false;
                break;
              }
              Log.i("XWalkLib", "onDoPatch patch file finished");
            }
          }
          label676: Log.i("XWalkLib", "onDoPatch patch file finished");
          paramString = ((ArrayList)localObject3).iterator();
          while (true)
            if (paramString.hasNext())
            {
              localObject3 = (XWalkUpdater.PatchFileConfig)paramString.next();
              if (((XWalkUpdater.PatchFileConfig)localObject3).isOriginalFileTypeApk())
                if (BSpatch.aH(XWalkEnvironment.getDownloadApkPath(paramInt1), XWalkEnvironment.getPatchZipTempDecompressFilePath(paramInt2, ((XWalkUpdater.PatchFileConfig)localObject3).patchFileName), XWalkEnvironment.getDownloadApkPath(paramInt2)) < 0)
                {
                  Log.e("XWalkLib", "onDoPatch apk patch error file:".concat(String.valueOf(localObject3)));
                  AppMethodBeat.o(85930);
                  bool = false;
                  break;
                }
            }
          Log.i("XWalkLib", "onDoPatch apk patch finished");
          bool = true;
          AppMethodBeat.o(85930);
        }
      }
    }
  }

  public static Integer onHandleFile(UpdateConfig paramUpdateConfig)
  {
    AppMethodBeat.i(85926);
    String str = paramUpdateConfig.getDownloadPath();
    Log.d("XWalkLib", "Download mode extract dir: ".concat(String.valueOf(XWalkEnvironment.getExtractedCoreDir(paramUpdateConfig.apkVer))));
    if ((paramUpdateConfig.isMatchMd5) && (!d.gA(str, paramUpdateConfig.downloadFileMd5)))
    {
      XWalkInitializer.addXWalkInitializeLog("XWalkLib", "downloaded apk md5 check failed");
      paramUpdateConfig = Integer.valueOf(-2);
      AppMethodBeat.o(85926);
    }
    while (true)
    {
      return paramUpdateConfig;
      if (paramUpdateConfig.isPatchUpdate)
      {
        if (!onDoPatch(str, XWalkEnvironment.getInstalledNewstVersion(), paramUpdateConfig.apkVer))
        {
          XWalkInitializer.addXWalkInitializeLog("XWalkLib", "patch update mode ,but patch error");
          paramUpdateConfig = Integer.valueOf(-3);
          AppMethodBeat.o(85926);
        }
        else if ((paramUpdateConfig.isMatchMd5) && (!XWalkUpdater.FileListMD5Checker.checkFileListMd5(paramUpdateConfig.apkVer, XWalkEnvironment.getPatchFileListConfig(paramUpdateConfig.apkVer))))
        {
          XWalkInitializer.addXWalkInitializeLog("XWalkLib", "patch update mode, but md5 not match");
          f.nI(36L);
          paramUpdateConfig = Integer.valueOf(-4);
          AppMethodBeat.o(85926);
        }
        else
        {
          XWalkInitializer.addXWalkInitializeLog("XWalkLib", "do patch sucsess");
        }
      }
      else
      {
        do
        {
          paramUpdateConfig = extractResource(paramUpdateConfig);
          AppMethodBeat.o(85926);
          break;
          if (!XWalkDecompressor.decompressDownloadFullZip(str, paramUpdateConfig.apkVer))
          {
            f.nI(32L);
            paramUpdateConfig = Integer.valueOf(-5);
            AppMethodBeat.o(85926);
            break;
          }
        }
        while ((!paramUpdateConfig.isMatchMd5) || (XWalkUpdater.FileListMD5Checker.checkFileListMd5(paramUpdateConfig.apkVer, XWalkEnvironment.getDownloadZipFileListConfig(paramUpdateConfig.apkVer))));
        XWalkInitializer.addXWalkInitializeLog("XWalkLib", "patch update mode, but md5 not match");
        f.nI(33L);
        paramUpdateConfig = Integer.valueOf(-4);
        AppMethodBeat.o(85926);
      }
    }
  }

  private static boolean tryCopyVersion(ContentResolver paramContentResolver, String paramString, int paramInt, Map<String, String> paramMap, XWalkUpdater.ErrorInfo paramErrorInfo)
  {
    AppMethodBeat.i(85921);
    try
    {
      Iterator localIterator = paramMap.entrySet().iterator();
      if (localIterator.hasNext())
      {
        paramMap = (Map.Entry)localIterator.next();
        str1 = (String)paramMap.getKey();
        str2 = (String)paramMap.getValue();
        AssetFileDescriptor localAssetFileDescriptor = paramContentResolver.openAssetFileDescriptor(XWebCoreContentProvider.b(paramString, XWalkEnvironment.getPackageName(), 2, paramInt, str1), "");
        if (localAssetFileDescriptor == null)
        {
          paramErrorInfo.copyFailedCount += 1;
          XWalkInitializer.addXWalkInitializeLog("tryCopyVersion no file ".concat(String.valueOf(str1)));
          AppMethodBeat.o(85921);
          bool = false;
          return bool;
        }
        if ("base.apk".equals(str1))
        {
          paramMap = new java/io/File;
          paramMap.<init>(XWalkEnvironment.getDownloadApkPath(paramInt));
        }
        while (true)
        {
          if (b.a(localAssetFileDescriptor, paramMap))
            break label252;
          paramErrorInfo.copyFailedCount += 1;
          XWalkInitializer.addXWalkInitializeLog("tryCopyVersion copy error");
          AppMethodBeat.o(85921);
          bool = false;
          break;
          paramMap = new File(XWalkEnvironment.getExtractedCoreFile(paramInt, str1));
        }
      }
    }
    catch (Exception paramContentResolver)
    {
      while (true)
      {
        String str1;
        String str2;
        XWalkInitializer.addXWalkInitializeLog("tryCopyVersion copy error:" + paramContentResolver.getMessage());
        paramErrorInfo.copyFailedCount += 1;
        AppMethodBeat.o(85921);
        boolean bool = false;
        continue;
        label252: if (!d.gA(paramMap.getAbsolutePath(), str2))
        {
          XWalkInitializer.addXWalkInitializeLog("tryCopyVersion md5 error ".concat(String.valueOf(str1)));
          paramErrorInfo.md5FailedCount += 1;
          if (paramMap.exists())
            paramMap.delete();
          AppMethodBeat.o(85921);
          bool = false;
          continue;
          bool = true;
          AppMethodBeat.o(85921);
        }
      }
    }
  }

  // ERROR //
  private static Map<String, String> tryGetFileList(ContentResolver paramContentResolver, String paramString, int paramInt)
  {
    // Byte code:
    //   0: ldc_w 594
    //   3: invokestatic 100	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: new 596	java/util/HashMap
    //   9: dup
    //   10: invokespecial 597	java/util/HashMap:<init>	()V
    //   13: astore_3
    //   14: aload_0
    //   15: aload_1
    //   16: invokestatic 340	org/xwalk/core/XWalkEnvironment:getPackageName	()Ljava/lang/String;
    //   19: iconst_2
    //   20: iload_2
    //   21: ldc_w 599
    //   24: invokestatic 348	com/tencent/xweb/XWebCoreContentProvider:b	(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;)Landroid/net/Uri;
    //   27: ldc_w 342
    //   30: invokevirtual 354	android/content/ContentResolver:openAssetFileDescriptor	(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/res/AssetFileDescriptor;
    //   33: astore_1
    //   34: aload_1
    //   35: ifnonnull +31 -> 66
    //   38: ldc_w 601
    //   41: invokestatic 569	org/xwalk/core/XWalkInitializer:addXWalkInitializeLog	(Ljava/lang/String;)V
    //   44: aconst_null
    //   45: invokestatic 605	com/tencent/xweb/util/b:tryClose	(Ljava/io/Closeable;)V
    //   48: aconst_null
    //   49: invokestatic 605	com/tencent/xweb/util/b:tryClose	(Ljava/io/Closeable;)V
    //   52: aload_1
    //   53: invokestatic 360	com/tencent/xweb/util/b:a	(Landroid/content/res/AssetFileDescriptor;)V
    //   56: ldc_w 594
    //   59: invokestatic 112	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   62: aload_3
    //   63: astore_0
    //   64: aload_0
    //   65: areturn
    //   66: new 122	java/io/File
    //   69: astore_0
    //   70: aload_0
    //   71: iload_2
    //   72: ldc_w 599
    //   75: invokestatic 433	org/xwalk/core/XWalkEnvironment:getExtractedCoreFile	(ILjava/lang/String;)Ljava/lang/String;
    //   78: invokespecial 125	java/io/File:<init>	(Ljava/lang/String;)V
    //   81: aload_0
    //   82: invokevirtual 129	java/io/File:exists	()Z
    //   85: ifeq +8 -> 93
    //   88: aload_0
    //   89: invokevirtual 236	java/io/File:delete	()Z
    //   92: pop
    //   93: new 607	java/io/PrintWriter
    //   96: dup
    //   97: aload_0
    //   98: invokespecial 608	java/io/PrintWriter:<init>	(Ljava/io/File;)V
    //   101: astore 4
    //   103: new 193	java/io/BufferedReader
    //   106: astore_0
    //   107: new 188	java/io/InputStreamReader
    //   110: astore 5
    //   112: aload 5
    //   114: aload_1
    //   115: invokevirtual 614	android/content/res/AssetFileDescriptor:createInputStream	()Ljava/io/FileInputStream;
    //   118: invokespecial 191	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   121: aload_0
    //   122: aload 5
    //   124: invokespecial 196	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   127: aload 4
    //   129: astore 6
    //   131: aload_0
    //   132: astore 7
    //   134: aload_1
    //   135: astore 5
    //   137: aload_0
    //   138: invokevirtual 200	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   141: astore 8
    //   143: aload 8
    //   145: ifnull +239 -> 384
    //   148: aload 4
    //   150: astore 6
    //   152: aload_0
    //   153: astore 7
    //   155: aload_1
    //   156: astore 5
    //   158: aload 4
    //   160: aload 8
    //   162: invokevirtual 617	java/io/PrintWriter:println	(Ljava/lang/String;)V
    //   165: aload 4
    //   167: astore 6
    //   169: aload_0
    //   170: astore 7
    //   172: aload_1
    //   173: astore 5
    //   175: aload 8
    //   177: invokevirtual 203	java/lang/String:isEmpty	()Z
    //   180: ifne -53 -> 127
    //   183: aload 4
    //   185: astore 6
    //   187: aload_0
    //   188: astore 7
    //   190: aload_1
    //   191: astore 5
    //   193: aload 8
    //   195: ldc 205
    //   197: invokevirtual 209	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   200: astore 8
    //   202: aload 4
    //   204: astore 6
    //   206: aload_0
    //   207: astore 7
    //   209: aload_1
    //   210: astore 5
    //   212: aload 8
    //   214: arraylength
    //   215: iconst_2
    //   216: if_icmpne -89 -> 127
    //   219: aload 8
    //   221: iconst_0
    //   222: aaload
    //   223: ifnull -96 -> 127
    //   226: aload 4
    //   228: astore 6
    //   230: aload_0
    //   231: astore 7
    //   233: aload_1
    //   234: astore 5
    //   236: aload 8
    //   238: iconst_0
    //   239: aaload
    //   240: invokevirtual 203	java/lang/String:isEmpty	()Z
    //   243: ifne -116 -> 127
    //   246: aload 8
    //   248: iconst_1
    //   249: aaload
    //   250: ifnull -123 -> 127
    //   253: aload 4
    //   255: astore 6
    //   257: aload_0
    //   258: astore 7
    //   260: aload_1
    //   261: astore 5
    //   263: aload 8
    //   265: iconst_1
    //   266: aaload
    //   267: invokevirtual 203	java/lang/String:isEmpty	()Z
    //   270: ifne -143 -> 127
    //   273: aload 4
    //   275: astore 6
    //   277: aload_0
    //   278: astore 7
    //   280: aload_1
    //   281: astore 5
    //   283: aload_3
    //   284: aload 8
    //   286: iconst_0
    //   287: aaload
    //   288: aload 8
    //   290: iconst_1
    //   291: aaload
    //   292: invokeinterface 621 3 0
    //   297: pop
    //   298: goto -171 -> 127
    //   301: astore_3
    //   302: aload 4
    //   304: astore 6
    //   306: aload_0
    //   307: astore 7
    //   309: aload_1
    //   310: astore 5
    //   312: new 219	java/lang/StringBuilder
    //   315: astore 8
    //   317: aload 4
    //   319: astore 6
    //   321: aload_0
    //   322: astore 7
    //   324: aload_1
    //   325: astore 5
    //   327: aload 8
    //   329: ldc_w 623
    //   332: invokespecial 222	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   335: aload 4
    //   337: astore 6
    //   339: aload_0
    //   340: astore 7
    //   342: aload_1
    //   343: astore 5
    //   345: aload 8
    //   347: aload_3
    //   348: invokevirtual 257	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   351: invokevirtual 226	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   354: invokevirtual 233	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   357: invokestatic 569	org/xwalk/core/XWalkInitializer:addXWalkInitializeLog	(Ljava/lang/String;)V
    //   360: aload 4
    //   362: invokestatic 605	com/tencent/xweb/util/b:tryClose	(Ljava/io/Closeable;)V
    //   365: aload_0
    //   366: invokestatic 605	com/tencent/xweb/util/b:tryClose	(Ljava/io/Closeable;)V
    //   369: aload_1
    //   370: invokestatic 360	com/tencent/xweb/util/b:a	(Landroid/content/res/AssetFileDescriptor;)V
    //   373: ldc_w 594
    //   376: invokestatic 112	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   379: aconst_null
    //   380: astore_0
    //   381: goto -317 -> 64
    //   384: aload 4
    //   386: astore 6
    //   388: aload_0
    //   389: astore 7
    //   391: aload_1
    //   392: astore 5
    //   394: aload 4
    //   396: invokevirtual 626	java/io/PrintWriter:flush	()V
    //   399: aload 4
    //   401: invokestatic 605	com/tencent/xweb/util/b:tryClose	(Ljava/io/Closeable;)V
    //   404: aload_0
    //   405: invokestatic 605	com/tencent/xweb/util/b:tryClose	(Ljava/io/Closeable;)V
    //   408: aload_1
    //   409: invokestatic 360	com/tencent/xweb/util/b:a	(Landroid/content/res/AssetFileDescriptor;)V
    //   412: ldc_w 594
    //   415: invokestatic 112	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   418: aload_3
    //   419: astore_0
    //   420: goto -356 -> 64
    //   423: astore_0
    //   424: aconst_null
    //   425: astore_3
    //   426: aconst_null
    //   427: astore 4
    //   429: aconst_null
    //   430: astore_1
    //   431: aload_3
    //   432: invokestatic 605	com/tencent/xweb/util/b:tryClose	(Ljava/io/Closeable;)V
    //   435: aload 4
    //   437: invokestatic 605	com/tencent/xweb/util/b:tryClose	(Ljava/io/Closeable;)V
    //   440: aload_1
    //   441: invokestatic 360	com/tencent/xweb/util/b:a	(Landroid/content/res/AssetFileDescriptor;)V
    //   444: ldc_w 594
    //   447: invokestatic 112	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   450: aload_0
    //   451: athrow
    //   452: astore_0
    //   453: aconst_null
    //   454: astore_3
    //   455: aconst_null
    //   456: astore 4
    //   458: goto -27 -> 431
    //   461: astore_0
    //   462: aconst_null
    //   463: astore 5
    //   465: aload 4
    //   467: astore_3
    //   468: aload 5
    //   470: astore 4
    //   472: goto -41 -> 431
    //   475: astore_0
    //   476: aload 6
    //   478: astore_3
    //   479: aload 7
    //   481: astore 4
    //   483: aload 5
    //   485: astore_1
    //   486: goto -55 -> 431
    //   489: astore_3
    //   490: aconst_null
    //   491: astore 4
    //   493: aconst_null
    //   494: astore_0
    //   495: aconst_null
    //   496: astore_1
    //   497: goto -195 -> 302
    //   500: astore_3
    //   501: aconst_null
    //   502: astore 4
    //   504: aconst_null
    //   505: astore_0
    //   506: goto -204 -> 302
    //   509: astore_3
    //   510: aconst_null
    //   511: astore_0
    //   512: goto -210 -> 302
    //
    // Exception table:
    //   from	to	target	type
    //   137	143	301	java/lang/Exception
    //   158	165	301	java/lang/Exception
    //   175	183	301	java/lang/Exception
    //   193	202	301	java/lang/Exception
    //   212	219	301	java/lang/Exception
    //   236	246	301	java/lang/Exception
    //   263	273	301	java/lang/Exception
    //   283	298	301	java/lang/Exception
    //   394	399	301	java/lang/Exception
    //   14	34	423	finally
    //   38	44	452	finally
    //   66	93	452	finally
    //   93	103	452	finally
    //   103	127	461	finally
    //   137	143	475	finally
    //   158	165	475	finally
    //   175	183	475	finally
    //   193	202	475	finally
    //   212	219	475	finally
    //   236	246	475	finally
    //   263	273	475	finally
    //   283	298	475	finally
    //   312	317	475	finally
    //   327	335	475	finally
    //   345	360	475	finally
    //   394	399	475	finally
    //   14	34	489	java/lang/Exception
    //   38	44	500	java/lang/Exception
    //   66	93	500	java/lang/Exception
    //   93	103	500	java/lang/Exception
    //   103	127	509	java/lang/Exception
  }

  public static void updateLocalXWalkRuntime()
  {
    AppMethodBeat.i(85922);
    onHandleFile(new UpdateConfig("runtime_package.zip", false, 100000));
    AppMethodBeat.o(85922);
  }

  private boolean verifyDownloadedXWalkRuntime(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(85931);
    PackageInfo localPackageInfo = this.mContext.getPackageManager().getPackageArchiveInfo(paramString, 64);
    if (localPackageInfo == null)
    {
      Log.e("XWalkLib", "The downloaded XWalkRuntimeLib.apk is invalid!");
      AppMethodBeat.o(85931);
    }
    label205: 
    while (true)
    {
      return bool;
      try
      {
        paramString = this.mContext.getPackageManager().getPackageInfo(this.mContext.getPackageName(), 64);
        if ((localPackageInfo.signatures != null) && (paramString.signatures != null))
          break label103;
        Log.e("XWalkLib", "No signature in package info");
        AppMethodBeat.o(85931);
      }
      catch (PackageManager.NameNotFoundException paramString)
      {
        AppMethodBeat.o(85931);
      }
      continue;
      label103: if (localPackageInfo.signatures.length != paramString.signatures.length)
      {
        Log.e("XWalkLib", "signatures length not equal");
        AppMethodBeat.o(85931);
      }
      else
      {
        for (int i = 0; ; i++)
        {
          if (i >= localPackageInfo.signatures.length)
            break label205;
          Log.d("XWalkLib", "Checking signature ".concat(String.valueOf(i)));
          if (!paramString.signatures[i].equals(localPackageInfo.signatures[i]))
          {
            Log.e("XWalkLib", "signatures do not match");
            AppMethodBeat.o(85931);
            break;
          }
        }
        Log.d("XWalkLib", "Signature check passed");
        bool = true;
        AppMethodBeat.o(85931);
      }
    }
  }

  public boolean cancelBackgroundDownload()
  {
    AppMethodBeat.i(85925);
    boolean bool = XWalkLibraryLoader.cancelHttpDownload();
    AppMethodBeat.o(85925);
    return bool;
  }

  public void cancelXWalkRuntimeDownload()
  {
    AppMethodBeat.i(85923);
    if (XWalkLibraryLoader.isDownloading())
    {
      XWalkInitializer.addXWalkInitializeLog("XWalkLib", "canceled download apk");
      XWalkLibraryLoader.cancelHttpDownload();
    }
    AppMethodBeat.o(85923);
  }

  public boolean dismissDialog()
  {
    AppMethodBeat.i(85924);
    boolean bool;
    if ((this.mDialogManager == null) || (!this.mDialogManager.isShowingDialog()))
    {
      bool = false;
      AppMethodBeat.o(85924);
    }
    while (true)
    {
      return bool;
      this.mDialogManager.dismissDialog();
      bool = true;
      AppMethodBeat.o(85924);
    }
  }

  public XWalkUpdater.ErrorInfo updateRuntimeFromProvider(c.a parama)
  {
    XWalkUpdater.ErrorInfo localErrorInfo;
    while (true)
    {
      Object localObject;
      UpdateConfig localUpdateConfig;
      String str;
      int m;
      Map localMap;
      try
      {
        AppMethodBeat.i(85918);
        localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>("updateFromProvider target ver ");
        XWalkInitializer.addXWalkInitializeLog(parama.ATn);
        localErrorInfo = new org/xwalk/core/XWalkUpdater$ErrorInfo;
        localErrorInfo.<init>();
        localErrorInfo.targetVer = parama.ATn;
        if (!parama.bTryUseSharedCore)
        {
          XWalkInitializer.addXWalkInitializeLog("updateFromProvider force download");
          localErrorInfo.errorCode = -6;
          AppMethodBeat.o(85918);
          return localErrorInfo;
        }
        if (parama.ATy >= 2)
        {
          XWalkInitializer.addXWalkInitializeLog("updateFromProvider exceed max count");
          localErrorInfo.errorCode = -7;
          AppMethodBeat.o(85918);
          continue;
        }
        localObject = XWalkEnvironment.getContentResolver();
        if (localObject == null)
        {
          XWalkInitializer.addXWalkInitializeLog("updateFromProvider content resolver null");
          localErrorInfo.errorCode = -8;
          AppMethodBeat.o(85918);
          continue;
        }
        localUpdateConfig = parama.dWe();
        String[] arrayOfString = XWalkEnvironment.XWALK_CORE_PROVIDER_LIST;
        int i = arrayOfString.length;
        int j = 0;
        k = 0;
        if (j >= i)
          break label406;
        str = arrayOfString[j];
        if (isProviderExist((ContentResolver)localObject, str))
        {
          m = 1;
          XWalkInitializer.addXWalkInitializeLog("updateFromProvider find ".concat(String.valueOf(str)));
          localMap = tryGetFileList((ContentResolver)localObject, str, localUpdateConfig.apkVer);
          if (localMap == null)
          {
            XWalkInitializer.addXWalkInitializeLog("updateFromProvider read fileList failed");
            localErrorInfo.readFileListFailedCount += 1;
            k = m;
          }
        }
        else
        {
          j++;
          continue;
        }
        if (localMap.size() == 0)
        {
          XWalkInitializer.addXWalkInitializeLog("updateFromProvider no matched version");
          localErrorInfo.noMatchedVersionCount += 1;
          k = m;
          continue;
        }
      }
      finally
      {
      }
      int k = m;
      if (tryCopyVersion((ContentResolver)localObject, str, localUpdateConfig.apkVer, localMap, localErrorInfo))
      {
        int n = extractResource(localUpdateConfig).intValue();
        if (n == 0)
        {
          localErrorInfo.errorCode = 0;
          AppMethodBeat.o(85918);
        }
        else if (n == -5)
        {
          localErrorInfo.extractFailedCount += 1;
          k = m;
        }
        else if (n == -12)
        {
          localErrorInfo.extractRetryFailedCount += 1;
          k = m;
        }
        else
        {
          k = m;
          if (n == -101)
          {
            localErrorInfo.setVersionFailedCount += 1;
            k = m;
            continue;
            label406: if (k != 0)
              break;
            XWalkInitializer.addXWalkInitializeLog("updateFromProvider no provider");
            localErrorInfo.errorCode = -9;
            AppMethodBeat.o(85918);
          }
        }
      }
    }
    if ((XWalkEnvironment.hasAvailableVersion()) && (parama.ATy + 1 < 2))
      XWalkInitializer.addXWalkInitializeLog("updateFromProvider failed, can try again");
    for (localErrorInfo.errorCode = -10; ; localErrorInfo.errorCode = -11)
    {
      AppMethodBeat.o(85918);
      break;
      XWalkInitializer.addXWalkInitializeLog("updateFromProvider failed, do not try again");
    }
  }

  public boolean updateXWalkRuntime(UpdateConfig paramUpdateConfig)
  {
    boolean bool = false;
    AppMethodBeat.i(85917);
    if (XWalkLibraryLoader.isDownloading())
    {
      XWalkInitializer.addXWalkInitializeLog("XWalkLib", "Other initialization or download is proceeding");
      AppMethodBeat.o(85917);
    }
    while (true)
    {
      return bool;
      if (this.mBackgroundUpdateListener != null)
      {
        if ((paramUpdateConfig == null) || (!paramUpdateConfig.checkValid()))
        {
          XWalkInitializer.addXWalkInitializeLog("XWalkLib", "royle:XWalkUpdater updateXWalkRuntime updateConfig is not valid");
          f.dVd();
          AppMethodBeat.o(85917);
        }
        else
        {
          XWalkInitializer.addXWalkInitializeLog("XWalkLib", "start download apk");
          XWalkLibraryLoader.startHttpDownload(new XWalkUpdater.BackgroundListener(this, paramUpdateConfig), this.mContext, paramUpdateConfig);
          bool = true;
          AppMethodBeat.o(85917);
        }
      }
      else
      {
        XWalkInitializer.addXWalkInitializeLog("XWalkLib", "Update listener is null");
        AppMethodBeat.o(85917);
      }
    }
  }

  public static class UpdateConfig
  {
    public int apkVer;
    public boolean bTryUseSharedCore;
    public boolean bUseCdn;
    public String downUrl;
    public String downloadFileMd5;
    public boolean isMatchMd5;
    public boolean isPatchUpdate;
    public String patchEndFileMd5;
    public String versionDetail;

    public UpdateConfig(String paramString, boolean paramBoolean, int paramInt)
    {
      AppMethodBeat.i(85911);
      this.apkVer = -1;
      this.isMatchMd5 = false;
      this.isPatchUpdate = paramBoolean;
      this.downUrl = paramString;
      this.apkVer = paramInt;
      if (!checkValid())
      {
        paramString = new RuntimeException("royle:UpdateConfig is not valid");
        AppMethodBeat.o(85911);
        throw paramString;
      }
      AppMethodBeat.o(85911);
    }

    public UpdateConfig(String paramString1, boolean paramBoolean, String paramString2, String paramString3, int paramInt)
    {
      AppMethodBeat.i(85912);
      this.apkVer = -1;
      this.isMatchMd5 = true;
      this.downloadFileMd5 = paramString1;
      this.isPatchUpdate = paramBoolean;
      this.patchEndFileMd5 = paramString2;
      this.downUrl = paramString3;
      this.apkVer = paramInt;
      if (!checkValid())
      {
        paramString1 = new RuntimeException("royle:UpdateConfig is not valid");
        AppMethodBeat.o(85912);
        throw paramString1;
      }
      AppMethodBeat.o(85912);
    }

    public boolean checkValid()
    {
      boolean bool = false;
      AppMethodBeat.i(85914);
      if ((this.isMatchMd5) && ((this.downloadFileMd5 == null) || (this.downloadFileMd5.isEmpty())))
        AppMethodBeat.o(85914);
      while (true)
      {
        return bool;
        if ((this.downUrl == null) || (this.downUrl.isEmpty()))
        {
          AppMethodBeat.o(85914);
        }
        else if (this.apkVer == -1)
        {
          AppMethodBeat.o(85914);
        }
        else if ((this.isMatchMd5) && (this.isPatchUpdate) && ((this.patchEndFileMd5 == null) || (this.patchEndFileMd5.isEmpty())))
        {
          AppMethodBeat.o(85914);
        }
        else
        {
          bool = true;
          AppMethodBeat.o(85914);
        }
      }
    }

    public String getDownloadPath()
    {
      AppMethodBeat.i(85913);
      if (checkValid())
      {
        if (this.isPatchUpdate)
        {
          localObject = XWalkEnvironment.getDownloadPatchPath(this.apkVer);
          AppMethodBeat.o(85913);
        }
        while (true)
        {
          return localObject;
          localObject = XWalkEnvironment.getDownloadZipDir(this.apkVer);
          AppMethodBeat.o(85913);
        }
      }
      Object localObject = new RuntimeException("royle:UpdateConfig is not valid");
      AppMethodBeat.o(85913);
      throw ((Throwable)localObject);
    }

    public String getLogSelf()
    {
      AppMethodBeat.i(85915);
      String str;
      if (checkValid())
      {
        str = "UpdateConfig isMatchMd5:" + this.isMatchMd5 + " downloadFileMd5:" + this.downloadFileMd5 + ",isPatchUpdate:" + this.isPatchUpdate + ",downUrl:" + this.downUrl + ",apkVer:" + this.apkVer + ",useCDN:" + this.bUseCdn + ",downloadPath:" + getDownloadPath() + ".";
        AppMethodBeat.o(85915);
      }
      while (true)
      {
        return str;
        str = "UpdateConfig is not valid";
        AppMethodBeat.o(85915);
      }
    }

    public int getUpdateBizType()
    {
      if (this.isPatchUpdate);
      for (int i = 2; ; i = 1)
        return i;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     org.xwalk.core.XWalkUpdater
 * JD-Core Version:    0.6.2
 */