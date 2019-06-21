package com.tencent.mm.plugin.fingerprint.b;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.soter.d.m;
import com.tencent.mm.plugin.wallet_core.model.ai;
import com.tencent.mm.plugin.wallet_core.model.ak;
import com.tencent.mm.plugin.wallet_core.model.r;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import java.io.File;

public final class e
{
  private static boolean isSoLoaded = false;

  public static String bxC()
  {
    AppMethodBeat.i(41459);
    String str = m.cvT();
    AppMethodBeat.o(41459);
    return str;
  }

  public static void bxD()
  {
    AppMethodBeat.i(41460);
    g.RQ();
    g.RP().Ry().set(ac.a.xKH, Boolean.TRUE);
    AppMethodBeat.o(41460);
  }

  public static boolean bxE()
  {
    AppMethodBeat.i(41461);
    g.RQ();
    Object localObject = g.RP().Ry().get(ac.a.xKH, Boolean.FALSE);
    if (localObject != null);
    for (boolean bool = ((Boolean)localObject).booleanValue(); ; bool = false)
    {
      AppMethodBeat.o(41461);
      return bool;
    }
  }

  public static void bxF()
  {
    AppMethodBeat.i(41462);
    g.RQ();
    g.RP().Ry().set(ac.a.xKI, Boolean.TRUE);
    AppMethodBeat.o(41462);
  }

  public static boolean bxG()
  {
    AppMethodBeat.i(41464);
    g.RQ();
    Object localObject = g.RP().Ry().get(ac.a.xKK, Boolean.FALSE);
    if (localObject != null);
    for (boolean bool = ((Boolean)localObject).booleanValue(); ; bool = false)
    {
      AppMethodBeat.o(41464);
      return bool;
    }
  }

  public static boolean bxH()
  {
    AppMethodBeat.i(41466);
    g.RQ();
    Object localObject = g.RP().Ry().get(ac.a.xKL, Boolean.FALSE);
    if (localObject != null);
    for (boolean bool = ((Boolean)localObject).booleanValue(); ; bool = false)
    {
      AppMethodBeat.o(41466);
      return bool;
    }
  }

  public static boolean bxI()
  {
    return isSoLoaded;
  }

  public static boolean bxJ()
  {
    AppMethodBeat.i(41468);
    ab.i("MicroMsg.FingerPrintUtil", "isShowFPSettingGuide");
    if (bxG())
    {
      ab.e("MicroMsg.FingerPrintUtil", "the fingerprint is open ready");
      AppMethodBeat.o(41468);
      bool = false;
    }
    while (true)
    {
      return bool;
      if (!c.bxj())
      {
        ab.e("MicroMsg.FingerPrintUtil", "device is not support");
        AppMethodBeat.o(41468);
        bool = false;
      }
      else if ((r.cPI().cQi()) || (r.cPI().cQh()))
      {
        ab.e("MicroMsg.FingerPrintUtil", "user had not reg wxpay");
        AppMethodBeat.o(41468);
        bool = false;
      }
      else
      {
        if (r.cPI().cQo().cPY())
          break;
        ab.e("MicroMsg.FingerPrintUtil", "isSupportTouchPay is false");
        AppMethodBeat.o(41468);
        bool = false;
      }
    }
    new c();
    Object localObject;
    if (!c.bxl())
    {
      g.RQ();
      localObject = g.RP().Ry().get(ac.a.xKI, Boolean.FALSE);
      if (localObject == null)
        break label198;
    }
    label198: for (boolean bool = ((Boolean)localObject).booleanValue(); ; bool = false)
    {
      if (!bool)
      {
        ab.i("MicroMsg.FingerPrintUtil", "will call showSetFingerPrintGuide()");
        bool = true;
        AppMethodBeat.o(41468);
        break;
      }
      AppMethodBeat.o(41468);
      bool = false;
      break;
    }
  }

  public static boolean bxs()
  {
    AppMethodBeat.i(41467);
    boolean bool;
    if ((c.bxj()) && (bxH()) && (isSoLoaded))
    {
      bool = true;
      AppMethodBeat.o(41467);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(41467);
    }
  }

  public static final String dQ(Context paramContext)
  {
    AppMethodBeat.i(41469);
    paramContext = paramContext.getApplicationContext().getFilesDir().getAbsolutePath() + "/b7c9a7fd-851e-7761-07df-8ab7c0b02787.sec";
    AppMethodBeat.o(41469);
    return paramContext;
  }

  // ERROR //
  public static int dR(Context paramContext)
  {
    // Byte code:
    //   0: ldc 194
    //   2: invokestatic 20	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aconst_null
    //   6: astore_1
    //   7: aconst_null
    //   8: astore_2
    //   9: aload_0
    //   10: invokestatic 196	com/tencent/mm/plugin/fingerprint/b/e:dQ	(Landroid/content/Context;)Ljava/lang/String;
    //   13: astore_3
    //   14: new 175	java/io/File
    //   17: dup
    //   18: aload_3
    //   19: invokespecial 199	java/io/File:<init>	(Ljava/lang/String;)V
    //   22: astore 4
    //   24: aload 4
    //   26: invokevirtual 202	java/io/File:exists	()Z
    //   29: ifne +225 -> 254
    //   32: iconst_1
    //   33: istore 5
    //   35: aconst_null
    //   36: astore_1
    //   37: iload 5
    //   39: ifeq +835 -> 874
    //   42: aload_1
    //   43: astore_2
    //   44: aload_0
    //   45: invokevirtual 206	android/content/Context:getAssets	()Landroid/content/res/AssetManager;
    //   48: ldc 208
    //   50: invokevirtual 214	android/content/res/AssetManager:open	(Ljava/lang/String;)Ljava/io/InputStream;
    //   53: astore_0
    //   54: aload_0
    //   55: astore_2
    //   56: aload_0
    //   57: astore_1
    //   58: new 216	java/io/FileOutputStream
    //   61: astore 6
    //   63: aload_0
    //   64: astore_2
    //   65: aload_0
    //   66: astore_1
    //   67: aload 6
    //   69: aload 4
    //   71: invokespecial 219	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   74: aload 6
    //   76: astore_2
    //   77: aload_0
    //   78: astore_1
    //   79: sipush 1024
    //   82: newarray byte
    //   84: astore 7
    //   86: aload 6
    //   88: astore_2
    //   89: aload_0
    //   90: astore_1
    //   91: aload_0
    //   92: aload 7
    //   94: invokevirtual 225	java/io/InputStream:read	([B)I
    //   97: istore 5
    //   99: iload 5
    //   101: iconst_m1
    //   102: if_icmpeq +399 -> 501
    //   105: aload 6
    //   107: astore_2
    //   108: aload_0
    //   109: astore_1
    //   110: aload 6
    //   112: aload 7
    //   114: iconst_0
    //   115: iload 5
    //   117: invokevirtual 229	java/io/FileOutputStream:write	([BII)V
    //   120: goto -34 -> 86
    //   123: astore_1
    //   124: aload_0
    //   125: astore 7
    //   127: aload 6
    //   129: astore_0
    //   130: aload_1
    //   131: astore 6
    //   133: aload_0
    //   134: astore_2
    //   135: aload 7
    //   137: astore_1
    //   138: ldc 97
    //   140: aload 6
    //   142: ldc 231
    //   144: iconst_0
    //   145: anewarray 4	java/lang/Object
    //   148: invokestatic 235	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   151: aload_0
    //   152: astore_2
    //   153: aload 7
    //   155: astore_1
    //   156: new 162	java/lang/StringBuilder
    //   159: astore 8
    //   161: aload_0
    //   162: astore_2
    //   163: aload 7
    //   165: astore_1
    //   166: aload 8
    //   168: ldc 237
    //   170: invokespecial 238	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   173: aload_0
    //   174: astore_2
    //   175: aload 7
    //   177: astore_1
    //   178: ldc 97
    //   180: aload 8
    //   182: aload 6
    //   184: invokevirtual 241	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   187: invokevirtual 182	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   190: invokevirtual 187	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   193: invokestatic 111	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   196: aload 7
    //   198: ifnull +8 -> 206
    //   201: aload 7
    //   203: invokevirtual 244	java/io/InputStream:close	()V
    //   206: aload_0
    //   207: ifnull +661 -> 868
    //   210: aload_0
    //   211: invokevirtual 245	java/io/FileOutputStream:close	()V
    //   214: iconst_m1
    //   215: istore 5
    //   217: invokestatic 251	java/lang/Runtime:getRuntime	()Ljava/lang/Runtime;
    //   220: ldc 253
    //   222: aload_3
    //   223: invokestatic 259	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   226: invokevirtual 263	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   229: invokevirtual 267	java/lang/Runtime:exec	(Ljava/lang/String;)Ljava/lang/Process;
    //   232: invokevirtual 273	java/lang/Process:waitFor	()I
    //   235: ifne +579 -> 814
    //   238: ldc 97
    //   240: ldc_w 275
    //   243: invokestatic 104	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   246: ldc 194
    //   248: invokestatic 28	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   251: iload 5
    //   253: ireturn
    //   254: aload 4
    //   256: invokestatic 281	com/tencent/mm/a/g:v	(Ljava/io/File;)Ljava/lang/String;
    //   259: astore 9
    //   261: ldc 231
    //   263: astore 6
    //   265: aload_0
    //   266: invokevirtual 206	android/content/Context:getAssets	()Landroid/content/res/AssetManager;
    //   269: ldc 208
    //   271: invokevirtual 214	android/content/res/AssetManager:open	(Ljava/lang/String;)Ljava/io/InputStream;
    //   274: astore 7
    //   276: aload 6
    //   278: astore_2
    //   279: aload 7
    //   281: ifnull +22 -> 303
    //   284: aload 7
    //   286: astore_2
    //   287: aload 7
    //   289: astore_1
    //   290: aload 7
    //   292: sipush 1024
    //   295: invokestatic 285	com/tencent/mm/a/g:b	(Ljava/io/InputStream;I)Ljava/lang/String;
    //   298: astore 8
    //   300: aload 8
    //   302: astore_2
    //   303: aload_2
    //   304: astore 8
    //   306: aload 7
    //   308: astore_1
    //   309: aload 7
    //   311: ifnull +14 -> 325
    //   314: aload 7
    //   316: invokevirtual 244	java/io/InputStream:close	()V
    //   319: aload 7
    //   321: astore_1
    //   322: aload_2
    //   323: astore 8
    //   325: aload 9
    //   327: invokestatic 291	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   330: ifne +143 -> 473
    //   333: aload 8
    //   335: invokestatic 291	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   338: ifne +135 -> 473
    //   341: aload 9
    //   343: aload 8
    //   345: invokevirtual 295	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   348: ifeq +125 -> 473
    //   351: iconst_0
    //   352: istore 5
    //   354: goto -317 -> 37
    //   357: astore_1
    //   358: ldc 97
    //   360: aload_1
    //   361: ldc 231
    //   363: iconst_0
    //   364: anewarray 4	java/lang/Object
    //   367: invokestatic 235	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   370: aload_2
    //   371: astore 8
    //   373: aload 7
    //   375: astore_1
    //   376: goto -51 -> 325
    //   379: astore 7
    //   381: aload_2
    //   382: astore_1
    //   383: ldc 97
    //   385: aload 7
    //   387: ldc 231
    //   389: iconst_0
    //   390: anewarray 4	java/lang/Object
    //   393: invokestatic 235	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   396: aload 6
    //   398: astore 8
    //   400: aload_2
    //   401: astore_1
    //   402: aload_2
    //   403: ifnull -78 -> 325
    //   406: aload_2
    //   407: invokevirtual 244	java/io/InputStream:close	()V
    //   410: aload 6
    //   412: astore 8
    //   414: aload_2
    //   415: astore_1
    //   416: goto -91 -> 325
    //   419: astore_1
    //   420: ldc 97
    //   422: aload_1
    //   423: ldc 231
    //   425: iconst_0
    //   426: anewarray 4	java/lang/Object
    //   429: invokestatic 235	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   432: aload 6
    //   434: astore 8
    //   436: aload_2
    //   437: astore_1
    //   438: goto -113 -> 325
    //   441: astore_0
    //   442: aload_1
    //   443: ifnull +7 -> 450
    //   446: aload_1
    //   447: invokevirtual 244	java/io/InputStream:close	()V
    //   450: ldc 194
    //   452: invokestatic 28	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   455: aload_0
    //   456: athrow
    //   457: astore_1
    //   458: ldc 97
    //   460: aload_1
    //   461: ldc 231
    //   463: iconst_0
    //   464: anewarray 4	java/lang/Object
    //   467: invokestatic 235	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   470: goto -20 -> 450
    //   473: aload 9
    //   475: invokestatic 291	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   478: ifne +17 -> 495
    //   481: aload 8
    //   483: invokestatic 291	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   486: ifeq +9 -> 495
    //   489: iconst_0
    //   490: istore 5
    //   492: goto -455 -> 37
    //   495: iconst_1
    //   496: istore 5
    //   498: goto -461 -> 37
    //   501: aload 6
    //   503: astore_2
    //   504: aload_0
    //   505: astore_1
    //   506: aload 6
    //   508: invokevirtual 298	java/io/FileOutputStream:flush	()V
    //   511: aload_0
    //   512: ifnull +7 -> 519
    //   515: aload_0
    //   516: invokevirtual 244	java/io/InputStream:close	()V
    //   519: aload 6
    //   521: invokevirtual 245	java/io/FileOutputStream:close	()V
    //   524: iconst_0
    //   525: istore 5
    //   527: goto -310 -> 217
    //   530: astore_0
    //   531: ldc 97
    //   533: aload_0
    //   534: ldc 231
    //   536: iconst_0
    //   537: anewarray 4	java/lang/Object
    //   540: invokestatic 235	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   543: ldc 97
    //   545: new 162	java/lang/StringBuilder
    //   548: dup
    //   549: ldc_w 300
    //   552: invokespecial 238	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   555: aload_0
    //   556: invokevirtual 301	java/io/IOException:getMessage	()Ljava/lang/String;
    //   559: invokevirtual 182	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   562: invokevirtual 187	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   565: invokestatic 111	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   568: goto -49 -> 519
    //   571: astore_0
    //   572: ldc 97
    //   574: aload_0
    //   575: ldc 231
    //   577: iconst_0
    //   578: anewarray 4	java/lang/Object
    //   581: invokestatic 235	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   584: ldc 97
    //   586: new 162	java/lang/StringBuilder
    //   589: dup
    //   590: ldc_w 303
    //   593: invokespecial 238	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   596: aload_0
    //   597: invokevirtual 301	java/io/IOException:getMessage	()Ljava/lang/String;
    //   600: invokevirtual 182	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   603: invokevirtual 187	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   606: invokestatic 111	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   609: iconst_0
    //   610: istore 5
    //   612: goto -395 -> 217
    //   615: astore_1
    //   616: ldc 97
    //   618: aload_1
    //   619: ldc 231
    //   621: iconst_0
    //   622: anewarray 4	java/lang/Object
    //   625: invokestatic 235	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   628: ldc 97
    //   630: new 162	java/lang/StringBuilder
    //   633: dup
    //   634: ldc_w 300
    //   637: invokespecial 238	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   640: aload_1
    //   641: invokevirtual 301	java/io/IOException:getMessage	()Ljava/lang/String;
    //   644: invokevirtual 182	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   647: invokevirtual 187	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   650: invokestatic 111	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   653: goto -447 -> 206
    //   656: astore_0
    //   657: ldc 97
    //   659: aload_0
    //   660: ldc 231
    //   662: iconst_0
    //   663: anewarray 4	java/lang/Object
    //   666: invokestatic 235	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   669: ldc 97
    //   671: new 162	java/lang/StringBuilder
    //   674: dup
    //   675: ldc_w 303
    //   678: invokespecial 238	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   681: aload_0
    //   682: invokevirtual 301	java/io/IOException:getMessage	()Ljava/lang/String;
    //   685: invokevirtual 182	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   688: invokevirtual 187	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   691: invokestatic 111	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   694: iconst_m1
    //   695: istore 5
    //   697: goto -480 -> 217
    //   700: astore_0
    //   701: aconst_null
    //   702: astore 7
    //   704: aload_2
    //   705: astore_1
    //   706: aload 7
    //   708: astore_2
    //   709: aload_1
    //   710: ifnull +7 -> 717
    //   713: aload_1
    //   714: invokevirtual 244	java/io/InputStream:close	()V
    //   717: aload_2
    //   718: ifnull +7 -> 725
    //   721: aload_2
    //   722: invokevirtual 245	java/io/FileOutputStream:close	()V
    //   725: ldc 194
    //   727: invokestatic 28	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   730: aload_0
    //   731: athrow
    //   732: astore_1
    //   733: ldc 97
    //   735: aload_1
    //   736: ldc 231
    //   738: iconst_0
    //   739: anewarray 4	java/lang/Object
    //   742: invokestatic 235	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   745: ldc 97
    //   747: new 162	java/lang/StringBuilder
    //   750: dup
    //   751: ldc_w 300
    //   754: invokespecial 238	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   757: aload_1
    //   758: invokevirtual 301	java/io/IOException:getMessage	()Ljava/lang/String;
    //   761: invokevirtual 182	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   764: invokevirtual 187	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   767: invokestatic 111	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   770: goto -53 -> 717
    //   773: astore_1
    //   774: ldc 97
    //   776: aload_1
    //   777: ldc 231
    //   779: iconst_0
    //   780: anewarray 4	java/lang/Object
    //   783: invokestatic 235	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   786: ldc 97
    //   788: new 162	java/lang/StringBuilder
    //   791: dup
    //   792: ldc_w 303
    //   795: invokespecial 238	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   798: aload_1
    //   799: invokevirtual 301	java/io/IOException:getMessage	()Ljava/lang/String;
    //   802: invokevirtual 182	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   805: invokevirtual 187	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   808: invokestatic 111	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   811: goto -86 -> 725
    //   814: ldc 97
    //   816: ldc_w 305
    //   819: invokestatic 111	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   822: goto -576 -> 246
    //   825: astore_0
    //   826: ldc 97
    //   828: new 162	java/lang/StringBuilder
    //   831: dup
    //   832: ldc_w 307
    //   835: invokespecial 238	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   838: aload_0
    //   839: invokevirtual 241	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   842: invokevirtual 182	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   845: invokevirtual 187	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   848: invokestatic 104	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   851: goto -605 -> 246
    //   854: astore_0
    //   855: goto -146 -> 709
    //   858: astore 6
    //   860: aconst_null
    //   861: astore_0
    //   862: aload_1
    //   863: astore 7
    //   865: goto -732 -> 133
    //   868: iconst_m1
    //   869: istore 5
    //   871: goto -654 -> 217
    //   874: iconst_0
    //   875: istore 5
    //   877: goto -631 -> 246
    //
    // Exception table:
    //   from	to	target	type
    //   79	86	123	java/lang/Exception
    //   91	99	123	java/lang/Exception
    //   110	120	123	java/lang/Exception
    //   506	511	123	java/lang/Exception
    //   314	319	357	java/io/IOException
    //   265	276	379	java/io/IOException
    //   290	300	379	java/io/IOException
    //   406	410	419	java/io/IOException
    //   265	276	441	finally
    //   290	300	441	finally
    //   383	396	441	finally
    //   446	450	457	java/io/IOException
    //   515	519	530	java/io/IOException
    //   519	524	571	java/io/IOException
    //   201	206	615	java/io/IOException
    //   210	214	656	java/io/IOException
    //   44	54	700	finally
    //   58	63	700	finally
    //   67	74	700	finally
    //   713	717	732	java/io/IOException
    //   721	725	773	java/io/IOException
    //   217	246	825	java/lang/Exception
    //   814	822	825	java/lang/Exception
    //   79	86	854	finally
    //   91	99	854	finally
    //   110	120	854	finally
    //   138	151	854	finally
    //   156	161	854	finally
    //   166	173	854	finally
    //   178	196	854	finally
    //   506	511	854	finally
    //   44	54	858	java/lang/Exception
    //   58	63	858	java/lang/Exception
    //   67	74	858	java/lang/Exception
  }

  public static String getUserId()
  {
    AppMethodBeat.i(41458);
    String str = com.tencent.mm.wallet_core.ui.e.getUsername();
    str = ag.ck(ag.ck(str) + ag.ck(q.LM()));
    AppMethodBeat.o(41458);
    return str;
  }

  public static void hs(boolean paramBoolean)
  {
    AppMethodBeat.i(41463);
    g.RQ();
    g.RP().Ry().set(ac.a.xKK, Boolean.valueOf(paramBoolean));
    AppMethodBeat.o(41463);
  }

  public static void ht(boolean paramBoolean)
  {
    AppMethodBeat.i(41465);
    g.RQ();
    g.RP().Ry().set(ac.a.xKL, Boolean.valueOf(paramBoolean));
    AppMethodBeat.o(41465);
  }

  public static void hu(boolean paramBoolean)
  {
    isSoLoaded = paramBoolean;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fingerprint.b.e
 * JD-Core Version:    0.6.2
 */