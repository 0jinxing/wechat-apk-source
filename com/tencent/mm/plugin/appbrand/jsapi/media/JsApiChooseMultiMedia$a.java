package com.tencent.mm.plugin.appbrand.jsapi.media;

import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.BitmapFactory.Options;
import android.media.MediaMetadataRetriever;
import android.media.ThumbnailUtils;
import android.text.TextUtils;
import android.widget.Toast;
import com.tencent.map.geolocation.TencentLocationUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.Exif;
import com.tencent.mm.graphics.MMBitmapFactory;
import com.tencent.mm.kernel.g;
import com.tencent.mm.modelgeo.a;
import com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalMediaObject;
import com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalMediaObjectManager;
import com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalVideoObject;
import com.tencent.mm.plugin.appbrand.g.b;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask.ProcessRequest;
import com.tencent.mm.plugin.appbrand.r.m;
import com.tencent.mm.plugin.appbrand.s.c;
import com.tencent.mm.plugin.mmsight.SightCaptureResult;
import com.tencent.mm.plugin.mmsight.SightParams;
import com.tencent.mm.pluginsdk.ui.tools.n;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.ExifHelper;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.ExifHelper.LatLongData;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.d;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.p;
import com.tencent.mm.ui.base.t;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import org.json.JSONArray;
import org.json.JSONObject;

final class JsApiChooseMultiMedia$a extends AppBrandProxyUIProcessTask
{
  private p ejZ;
  int hOZ;
  JsApiChooseMultiMedia.ChooseRequest hPJ;
  JsApiChooseMultiMedia.ChooseResult hPK;
  private DialogInterface.OnCancelListener hPa;

  private JsApiChooseMultiMedia$a()
  {
    AppMethodBeat.i(131235);
    this.hPK = new JsApiChooseMultiMedia.ChooseResult();
    this.hOZ = 7;
    AppMethodBeat.o(131235);
  }

  private static String Bn(String paramString)
  {
    AppMethodBeat.i(131248);
    int i = Exif.fromFile(paramString).getOrientationInDegree();
    if (i != 0);
    while (true)
    {
      try
      {
        BitmapFactory.Options localOptions = new android/graphics/BitmapFactory$Options;
        localOptions.<init>();
        Object localObject1 = MMBitmapFactory.decodeFile(paramString, localOptions);
        if (localObject1 == null)
        {
          ab.e("MicroMsg.JsApiChooseMultiMedia", "rotate image, get null bmp");
          AppMethodBeat.o(131248);
          return paramString;
        }
        float f = i % 360;
        Bitmap localBitmap = d.b((Bitmap)localObject1, f);
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        Object localObject2 = ((StringBuilder)localObject1).append(com.tencent.mm.compatible.util.e.euR).append("microMsg.tmp.").append(System.currentTimeMillis());
        if (c.e(localOptions))
        {
          localObject1 = ".jpg";
          localObject2 = (String)localObject1;
          if (!c.e(localOptions))
            continue;
          localObject1 = Bitmap.CompressFormat.JPEG;
        }
        try
        {
          d.a(localBitmap, 80, (Bitmap.CompressFormat)localObject1, (String)localObject2, true);
          if (c.e(localOptions))
            b.bY(paramString, (String)localObject2);
          AppMethodBeat.o(131248);
          paramString = (String)localObject2;
          continue;
          localObject1 = ".png";
          continue;
          localObject1 = Bitmap.CompressFormat.PNG;
          continue;
        }
        catch (Exception localException)
        {
          ab.e("MicroMsg.JsApiChooseMultiMedia", "rotate image, exception occurred when saving | %s", new Object[] { localException });
          com.tencent.mm.a.e.deleteFile((String)localObject2);
          AppMethodBeat.o(131248);
        }
        continue;
      }
      catch (OutOfMemoryError localOutOfMemoryError)
      {
        AppMethodBeat.o(131248);
        continue;
      }
      catch (NullPointerException localNullPointerException)
      {
        AppMethodBeat.o(131248);
        continue;
      }
      AppMethodBeat.o(131248);
    }
  }

  private static String Bo(String paramString)
  {
    AppMethodBeat.i(131247);
    String str = com.tencent.mm.compatible.util.e.euR + "microMsg." + System.currentTimeMillis() + ".jpg";
    try
    {
      Bitmap localBitmap1 = MMBitmapFactory.decodeFile(paramString);
      if (localBitmap1 == null)
      {
        ab.e("MicroMsg.JsApiChooseMultiMedia", "doCompressImage, decode bmp return null");
        AppMethodBeat.o(131247);
        paramString = null;
        return paramString;
      }
    }
    catch (OutOfMemoryError localOutOfMemoryError1)
    {
      while (true)
      {
        ab.e("MicroMsg.JsApiChooseMultiMedia", "doCompressImage, decode bmp oom");
        try
        {
          Bitmap localBitmap2 = d.decodeFile(paramString, null);
        }
        catch (OutOfMemoryError localOutOfMemoryError2)
        {
          ab.e("MicroMsg.JsApiChooseMultiMedia", "doCompressImage, decode bmp oom retry, oom again");
          Object localObject1 = null;
        }
        catch (Exception localException1)
        {
          ab.e("MicroMsg.JsApiChooseMultiMedia", "doCompressImage, decode bmp oom retry, e ".concat(String.valueOf(localException1)));
          Object localObject2 = null;
        }
      }
    }
    catch (NullPointerException localNullPointerException)
    {
      while (true)
        try
        {
          Bitmap localBitmap3 = d.decodeFile(paramString, null);
        }
        catch (Exception localException2)
        {
          ab.e("MicroMsg.JsApiChooseMultiMedia", "doCompressImage, decode bmp npe retry, e ".concat(String.valueOf(localException2)));
          Object localObject3 = null;
        }
    }
    catch (Exception localException3)
    {
      while (true)
      {
        ab.e("MicroMsg.JsApiChooseMultiMedia", "doCompressImage, decode bmp e ".concat(String.valueOf(localException3)));
        Object localObject4 = null;
        continue;
        long l = bo.anU();
        boolean bool = c.cU(str, paramString);
        ab.i("MicroMsg.JsApiChooseMultiMedia", "doCompressImage, ret = %b, cost = %d, %s (%d) -> %s (%d)", new Object[] { Boolean.valueOf(bool), Long.valueOf(bo.anU() - l), paramString, Long.valueOf(new File(paramString).length()), str, Long.valueOf(new File(str).length()) });
        if (bool)
        {
          AppMethodBeat.o(131247);
          paramString = str;
        }
        else
        {
          AppMethodBeat.o(131247);
        }
      }
    }
  }

  // ERROR //
  private static String Bu(String paramString)
  {
    // Byte code:
    //   0: ldc 216
    //   2: invokestatic 30	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: iconst_2
    //   6: newarray int
    //   8: astore_1
    //   9: new 218	android/media/MediaMetadataRetriever
    //   12: astore_2
    //   13: aload_2
    //   14: invokespecial 219	android/media/MediaMetadataRetriever:<init>	()V
    //   17: aload_2
    //   18: aload_0
    //   19: invokevirtual 222	android/media/MediaMetadataRetriever:setDataSource	(Ljava/lang/String;)V
    //   22: aload_2
    //   23: bipush 18
    //   25: invokevirtual 226	android/media/MediaMetadataRetriever:extractMetadata	(I)Ljava/lang/String;
    //   28: iconst_0
    //   29: invokestatic 230	com/tencent/mm/sdk/platformtools/bo:getInt	(Ljava/lang/String;I)I
    //   32: istore_3
    //   33: aload_2
    //   34: bipush 19
    //   36: invokevirtual 226	android/media/MediaMetadataRetriever:extractMetadata	(I)Ljava/lang/String;
    //   39: iconst_0
    //   40: invokestatic 230	com/tencent/mm/sdk/platformtools/bo:getInt	(Ljava/lang/String;I)I
    //   43: istore 4
    //   45: aload_1
    //   46: iconst_0
    //   47: iload_3
    //   48: iastore
    //   49: aload_1
    //   50: iconst_1
    //   51: iload 4
    //   53: iastore
    //   54: invokestatic 236	com/tencent/mm/modelcontrol/d:afF	()Lcom/tencent/mm/modelcontrol/d;
    //   57: invokevirtual 240	com/tencent/mm/modelcontrol/d:afK	()Lcom/tencent/mm/modelcontrol/VideoTransPara;
    //   60: astore 5
    //   62: aload 5
    //   64: getfield 245	com/tencent/mm/modelcontrol/VideoTransPara:width	I
    //   67: istore 6
    //   69: aload 5
    //   71: getfield 248	com/tencent/mm/modelcontrol/VideoTransPara:height	I
    //   74: istore 7
    //   76: new 87	java/lang/StringBuilder
    //   79: astore 8
    //   81: aload 8
    //   83: ldc 250
    //   85: invokespecial 251	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   88: ldc 71
    //   90: aload 8
    //   92: iload_3
    //   93: invokevirtual 254	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   96: ldc_w 256
    //   99: invokevirtual 98	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   102: iload 4
    //   104: invokevirtual 254	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   107: ldc_w 258
    //   110: invokevirtual 98	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   113: iload 6
    //   115: invokevirtual 254	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   118: ldc_w 260
    //   121: invokevirtual 98	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   124: iload 7
    //   126: invokevirtual 254	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   129: ldc_w 262
    //   132: invokevirtual 98	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   135: invokevirtual 120	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   138: invokestatic 265	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   141: iload_3
    //   142: iload 6
    //   144: if_icmpgt +255 -> 399
    //   147: iload 4
    //   149: iload 7
    //   151: if_icmpgt +248 -> 399
    //   154: ldc 71
    //   156: ldc_w 267
    //   159: invokestatic 269	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   162: aconst_null
    //   163: astore 8
    //   165: aload 8
    //   167: ifnull +19 -> 186
    //   170: aload_1
    //   171: iconst_0
    //   172: aload 8
    //   174: getfield 274	android/graphics/Point:x	I
    //   177: iastore
    //   178: aload_1
    //   179: iconst_1
    //   180: aload 8
    //   182: getfield 277	android/graphics/Point:y	I
    //   185: iastore
    //   186: ldc 71
    //   188: ldc_w 279
    //   191: bipush 6
    //   193: anewarray 143	java/lang/Object
    //   196: dup
    //   197: iconst_0
    //   198: iload_3
    //   199: invokestatic 284	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   202: aastore
    //   203: dup
    //   204: iconst_1
    //   205: iload 4
    //   207: invokestatic 284	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   210: aastore
    //   211: dup
    //   212: iconst_2
    //   213: aload 5
    //   215: getfield 245	com/tencent/mm/modelcontrol/VideoTransPara:width	I
    //   218: invokestatic 284	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   221: aastore
    //   222: dup
    //   223: iconst_3
    //   224: aload 5
    //   226: getfield 248	com/tencent/mm/modelcontrol/VideoTransPara:height	I
    //   229: invokestatic 284	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   232: aastore
    //   233: dup
    //   234: iconst_4
    //   235: aload_1
    //   236: iconst_0
    //   237: iaload
    //   238: invokestatic 284	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   241: aastore
    //   242: dup
    //   243: iconst_5
    //   244: aload_1
    //   245: iconst_1
    //   246: iaload
    //   247: invokestatic 284	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   250: aastore
    //   251: invokestatic 286	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   254: aload_2
    //   255: invokevirtual 289	android/media/MediaMetadataRetriever:release	()V
    //   258: aload_1
    //   259: iconst_0
    //   260: iaload
    //   261: istore 9
    //   263: aload_1
    //   264: iconst_1
    //   265: iaload
    //   266: istore 7
    //   268: new 87	java/lang/StringBuilder
    //   271: dup
    //   272: invokespecial 88	java/lang/StringBuilder:<init>	()V
    //   275: getstatic 94	com/tencent/mm/compatible/util/e:euR	Ljava/lang/String;
    //   278: invokevirtual 98	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   281: ldc 156
    //   283: invokevirtual 98	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   286: invokestatic 106	java/lang/System:currentTimeMillis	()J
    //   289: invokevirtual 109	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   292: ldc_w 291
    //   295: invokevirtual 98	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   298: invokevirtual 120	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   301: astore 8
    //   303: invokestatic 236	com/tencent/mm/modelcontrol/d:afF	()Lcom/tencent/mm/modelcontrol/d;
    //   306: invokevirtual 240	com/tencent/mm/modelcontrol/d:afK	()Lcom/tencent/mm/modelcontrol/VideoTransPara;
    //   309: astore_2
    //   310: ldc 71
    //   312: ldc_w 293
    //   315: iconst_1
    //   316: anewarray 143	java/lang/Object
    //   319: dup
    //   320: iconst_0
    //   321: aload_2
    //   322: getfield 296	com/tencent/mm/modelcontrol/VideoTransPara:videoBitrate	I
    //   325: invokestatic 284	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   328: aastore
    //   329: invokestatic 286	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   332: new 298	java/util/concurrent/CountDownLatch
    //   335: dup
    //   336: iconst_1
    //   337: invokespecial 300	java/util/concurrent/CountDownLatch:<init>	(I)V
    //   340: astore 5
    //   342: getstatic 306	com/tencent/mm/media/g/c:eXz	Lcom/tencent/mm/media/g/c$a;
    //   345: aload_0
    //   346: aload 8
    //   348: iload 9
    //   350: iload 7
    //   352: aload_2
    //   353: getfield 296	com/tencent/mm/modelcontrol/VideoTransPara:videoBitrate	I
    //   356: aload_2
    //   357: getfield 309	com/tencent/mm/modelcontrol/VideoTransPara:fps	I
    //   360: new 311	com/tencent/mm/plugin/appbrand/jsapi/media/JsApiChooseMultiMedia$a$5
    //   363: dup
    //   364: aload 5
    //   366: invokespecial 314	com/tencent/mm/plugin/appbrand/jsapi/media/JsApiChooseMultiMedia$a$5:<init>	(Ljava/util/concurrent/CountDownLatch;)V
    //   369: invokeinterface 319 8 0
    //   374: invokevirtual 322	com/tencent/mm/media/g/c:Va	()I
    //   377: pop
    //   378: ldc 71
    //   380: ldc_w 324
    //   383: invokestatic 265	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   386: aload 5
    //   388: invokevirtual 327	java/util/concurrent/CountDownLatch:await	()V
    //   391: ldc 216
    //   393: invokestatic 40	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   396: aload 8
    //   398: areturn
    //   399: iload_3
    //   400: iload 4
    //   402: invokestatic 333	java/lang/Math:max	(II)I
    //   405: istore 10
    //   407: iload_3
    //   408: iload 4
    //   410: invokestatic 336	java/lang/Math:min	(II)I
    //   413: istore 11
    //   415: iload 6
    //   417: iload 7
    //   419: invokestatic 333	java/lang/Math:max	(II)I
    //   422: istore 12
    //   424: iload 6
    //   426: iload 7
    //   428: invokestatic 336	java/lang/Math:min	(II)I
    //   431: istore 9
    //   433: iload 10
    //   435: bipush 16
    //   437: irem
    //   438: ifne +51 -> 489
    //   441: iload 10
    //   443: iload 12
    //   445: isub
    //   446: invokestatic 340	java/lang/Math:abs	(I)I
    //   449: bipush 16
    //   451: if_icmpge +38 -> 489
    //   454: iload 11
    //   456: bipush 16
    //   458: irem
    //   459: ifne +30 -> 489
    //   462: iload 11
    //   464: iload 9
    //   466: isub
    //   467: invokestatic 340	java/lang/Math:abs	(I)I
    //   470: bipush 16
    //   472: if_icmpge +17 -> 489
    //   475: ldc 71
    //   477: ldc_w 342
    //   480: invokestatic 269	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   483: aconst_null
    //   484: astore 8
    //   486: goto -321 -> 165
    //   489: iload 10
    //   491: iconst_2
    //   492: idiv
    //   493: istore 10
    //   495: iload 11
    //   497: iconst_2
    //   498: idiv
    //   499: istore 11
    //   501: iload 10
    //   503: bipush 16
    //   505: irem
    //   506: ifne +113 -> 619
    //   509: iload 10
    //   511: iload 12
    //   513: isub
    //   514: invokestatic 340	java/lang/Math:abs	(I)I
    //   517: bipush 16
    //   519: if_icmpge +100 -> 619
    //   522: iload 11
    //   524: bipush 16
    //   526: irem
    //   527: ifne +92 -> 619
    //   530: iload 11
    //   532: iload 9
    //   534: isub
    //   535: invokestatic 340	java/lang/Math:abs	(I)I
    //   538: bipush 16
    //   540: if_icmpge +79 -> 619
    //   543: ldc 71
    //   545: ldc_w 344
    //   548: invokestatic 269	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   551: iload_3
    //   552: iconst_2
    //   553: idiv
    //   554: istore 7
    //   556: iload 4
    //   558: iconst_2
    //   559: idiv
    //   560: istore 9
    //   562: iload 7
    //   564: iconst_2
    //   565: irem
    //   566: ifeq +240 -> 806
    //   569: iinc 7 1
    //   572: iload 9
    //   574: iconst_2
    //   575: irem
    //   576: ifeq +227 -> 803
    //   579: iinc 9 1
    //   582: new 271	android/graphics/Point
    //   585: dup
    //   586: iload 7
    //   588: iload 9
    //   590: invokespecial 347	android/graphics/Point:<init>	(II)V
    //   593: astore 8
    //   595: goto -430 -> 165
    //   598: astore_0
    //   599: aload_2
    //   600: astore 8
    //   602: aload 8
    //   604: ifnull +8 -> 612
    //   607: aload 8
    //   609: invokevirtual 289	android/media/MediaMetadataRetriever:release	()V
    //   612: ldc 216
    //   614: invokestatic 40	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   617: aload_0
    //   618: athrow
    //   619: new 271	android/graphics/Point
    //   622: astore 8
    //   624: aload 8
    //   626: invokespecial 348	android/graphics/Point:<init>	()V
    //   629: iload_3
    //   630: iload 4
    //   632: if_icmpge +110 -> 742
    //   635: iload 6
    //   637: iload 7
    //   639: invokestatic 336	java/lang/Math:min	(II)I
    //   642: istore 7
    //   644: dconst_1
    //   645: iload_3
    //   646: i2d
    //   647: dmul
    //   648: iload 7
    //   650: i2d
    //   651: ddiv
    //   652: dstore 13
    //   654: iload 4
    //   656: i2d
    //   657: dload 13
    //   659: ddiv
    //   660: d2i
    //   661: istore 9
    //   663: iload 9
    //   665: istore 6
    //   667: iload 9
    //   669: iconst_2
    //   670: irem
    //   671: ifeq +9 -> 680
    //   674: iload 9
    //   676: iconst_1
    //   677: iadd
    //   678: istore 6
    //   680: iload 7
    //   682: istore 9
    //   684: iload 7
    //   686: iconst_2
    //   687: irem
    //   688: ifeq +9 -> 697
    //   691: iload 7
    //   693: iconst_1
    //   694: iadd
    //   695: istore 9
    //   697: ldc 71
    //   699: ldc_w 350
    //   702: iconst_2
    //   703: anewarray 143	java/lang/Object
    //   706: dup
    //   707: iconst_0
    //   708: iload 9
    //   710: invokestatic 284	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   713: aastore
    //   714: dup
    //   715: iconst_1
    //   716: iload 6
    //   718: invokestatic 284	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   721: aastore
    //   722: invokestatic 212	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   725: aload 8
    //   727: iload 9
    //   729: putfield 274	android/graphics/Point:x	I
    //   732: aload 8
    //   734: iload 6
    //   736: putfield 277	android/graphics/Point:y	I
    //   739: goto -574 -> 165
    //   742: iload 6
    //   744: iload 7
    //   746: invokestatic 336	java/lang/Math:min	(II)I
    //   749: istore 9
    //   751: dconst_1
    //   752: iload 4
    //   754: i2d
    //   755: dmul
    //   756: iload 9
    //   758: i2d
    //   759: ddiv
    //   760: dstore 13
    //   762: iload_3
    //   763: i2d
    //   764: dload 13
    //   766: ddiv
    //   767: d2i
    //   768: istore 7
    //   770: goto -107 -> 663
    //   773: astore_0
    //   774: ldc 71
    //   776: ldc_w 352
    //   779: iconst_1
    //   780: anewarray 143	java/lang/Object
    //   783: dup
    //   784: iconst_0
    //   785: aload_0
    //   786: invokevirtual 355	java/lang/InterruptedException:getMessage	()Ljava/lang/String;
    //   789: aastore
    //   790: invokestatic 146	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   793: goto -402 -> 391
    //   796: astore_0
    //   797: aconst_null
    //   798: astore 8
    //   800: goto -198 -> 602
    //   803: goto -221 -> 582
    //   806: goto -234 -> 572
    //
    // Exception table:
    //   from	to	target	type
    //   17	45	598	finally
    //   54	141	598	finally
    //   154	162	598	finally
    //   170	186	598	finally
    //   186	254	598	finally
    //   399	433	598	finally
    //   441	454	598	finally
    //   462	483	598	finally
    //   489	501	598	finally
    //   509	522	598	finally
    //   530	562	598	finally
    //   582	595	598	finally
    //   619	629	598	finally
    //   635	644	598	finally
    //   697	739	598	finally
    //   742	751	598	finally
    //   378	391	773	java/lang/InterruptedException
    //   9	17	796	finally
  }

  private static String Bv(String paramString)
  {
    AppMethodBeat.i(131244);
    String str1 = "";
    String str2 = str1;
    if (!bo.isNullOrNil(paramString))
    {
      Object localObject = new File(paramString);
      str2 = str1;
      if (((File)localObject).exists())
      {
        localObject = ((File)localObject).getName();
        str1 = null;
        str2 = str1;
        if (!TextUtils.isEmpty((CharSequence)localObject))
        {
          str2 = str1;
          if (((String)localObject).contains("."))
            str2 = ((String)localObject).substring(0, ((String)localObject).lastIndexOf("."));
        }
        if (!TextUtils.isEmpty(str2))
          if ((com.tencent.mm.compatible.util.e.euR != null) && (com.tencent.mm.compatible.util.e.euR.endsWith("/")))
            str2 = com.tencent.mm.compatible.util.e.euR + str2 + System.currentTimeMillis() + ".jpeg";
        while (true)
        {
          if (new File(str2).exists())
            break label345;
          ab.i("MicroMsg.JsApiChooseMultiMedia", "file not exist for path:%s! create it!", new Object[] { str2 });
          paramString = ThumbnailUtils.createVideoThumbnail(paramString, 2);
          if (paramString != null)
            break;
          ab.e("MicroMsg.JsApiChooseMultiMedia", "createVideoThumbnail bitmap fail for path:%s!", new Object[] { str2 });
          str2 = "";
          AppMethodBeat.o(131244);
          return str2;
          str2 = com.tencent.mm.compatible.util.e.euR + "/" + str2 + System.currentTimeMillis() + ".jpeg";
          continue;
          str2 = "microMsg_" + System.currentTimeMillis();
          str2 = com.tencent.mm.compatible.util.e.euR + str2 + ".jpeg";
        }
      }
    }
    while (true)
    {
      try
      {
        d.a(paramString, 80, Bitmap.CompressFormat.JPEG, str2, true);
        AppMethodBeat.o(131244);
      }
      catch (IOException paramString)
      {
        ab.e("MicroMsg.JsApiChooseMultiMedia", "saveBitmapToImage exist IOException:" + paramString.getMessage());
        continue;
      }
      label345: ab.i("MicroMsg.JsApiChooseMultiMedia", "file is exist for path:%s!", new Object[] { str2 });
    }
  }

  private static String a(String paramString1, long paramLong, int paramInt1, int paramInt2, int paramInt3, String paramString2, String paramString3)
  {
    AppMethodBeat.i(131246);
    ab.i("MicroMsg.JsApiChooseMultiMedia", "parseImageItemToJson()");
    JSONArray localJSONArray = new JSONArray();
    try
    {
      JSONObject localJSONObject = new org/json/JSONObject;
      localJSONObject.<init>();
      localJSONObject.put("type", "video");
      localJSONObject.put("tempFilePath", paramString1);
      localJSONObject.put("size", paramLong);
      localJSONObject.put("width", paramInt1);
      localJSONObject.put("height", paramInt2);
      localJSONObject.put("duration", paramInt3);
      localJSONObject.put("thumbTempFilePath", paramString2);
      localJSONObject.put("mark", paramString3);
      localJSONObject.put("scene", "camera");
      localJSONArray.put(localJSONObject);
      paramString1 = localJSONArray.toString();
      AppMethodBeat.o(131246);
      return paramString1;
    }
    catch (Exception paramString1)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.JsApiChooseMultiMedia", paramString1, "", new Object[0]);
        paramString1 = "";
        AppMethodBeat.o(131246);
      }
    }
  }

  private static String a(String paramString1, long paramLong, int paramInt1, int paramInt2, String paramString2, String paramString3)
  {
    AppMethodBeat.i(131245);
    JSONArray localJSONArray = new JSONArray();
    try
    {
      JSONObject localJSONObject = new org/json/JSONObject;
      localJSONObject.<init>();
      localJSONObject.put("type", "image");
      localJSONObject.put("tempFilePath", paramString1);
      localJSONObject.put("size", paramLong);
      localJSONObject.put("width", paramInt1);
      localJSONObject.put("height", paramInt2);
      localJSONObject.put("orientation", paramString2);
      localJSONObject.put("mark", paramString3);
      localJSONObject.put("scene", "camera");
      localJSONArray.put(localJSONObject);
      paramString1 = localJSONArray.toString();
      ab.i("MicroMsg.JsApiChooseMultiMedia", "parseImageItemToJson, res: %s.", new Object[] { paramString1 });
      AppMethodBeat.o(131245);
      return paramString1;
    }
    catch (Exception paramString1)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.JsApiChooseMultiMedia", paramString1, "", new Object[0]);
        paramString1 = "";
        AppMethodBeat.o(131245);
      }
    }
  }

  private void aEi()
  {
    AppMethodBeat.i(131240);
    this.hPa = new JsApiChooseMultiMedia.a.4(this);
    MMActivity localMMActivity = aBQ();
    ah.getResources().getString(2131297061);
    this.ejZ = h.b(localMMActivity, ah.getResources().getString(2131296579), true, this.hPa);
    AppMethodBeat.o(131240);
  }

  private Intent aEj()
  {
    AppMethodBeat.i(131237);
    Intent localIntent = new Intent();
    localIntent.putExtra("album_business_tag", "album_business_bubble_media_by_coordinate");
    localIntent.putExtra("album_video_max_duration", this.hPJ.gLP);
    localIntent.putExtra("album_business_bubble_media_by_coordinate_distance", this.hPJ.fNN);
    localIntent.putExtra("album_business_bubble_media_by_coordinate_latitude", this.hPJ.latitude);
    localIntent.putExtra("album_business_bubble_media_by_coordinate_longitude", this.hPJ.longitude);
    localIntent.putExtra("album_business_bubble_media_by_coordinate_posname", this.hPJ.eUu);
    localIntent.putExtra("query_media_type", 3);
    localIntent.putExtra("send_btn_string", ah.getResources().getString(2131296989));
    AppMethodBeat.o(131237);
    return localIntent;
  }

  private static BackwardSupportUtil.ExifHelper.LatLongData aEk()
  {
    AppMethodBeat.i(131239);
    Object localObject = ah.getContext().getSharedPreferences(ah.doA() + "_locCache", 0).getString("locStr", null);
    String[] arrayOfString;
    float f1;
    float f2;
    if (localObject != null)
    {
      arrayOfString = ((String)localObject).split(",");
      f1 = Integer.valueOf(arrayOfString[0]).intValue() / 1000000.0F;
      f2 = Integer.valueOf(arrayOfString[1]).intValue() / 1000000.0F;
      ab.d("MicroMsg.JsApiChooseMultiMedia", "locStr: %s, latitude: %f, longitude: %f", new Object[] { localObject, Float.valueOf(f1), Float.valueOf(f2) });
      localObject = new BackwardSupportUtil.ExifHelper.LatLongData(f1, f2);
    }
    while (true)
    {
      AppMethodBeat.o(131239);
      return localObject;
      localObject = (String)g.RP().Ry().get(67591, null);
      if (localObject != null)
        while (true)
        {
          try
          {
            arrayOfString = ((String)localObject).split(",");
            int i = Integer.valueOf(arrayOfString[0]).intValue();
            if (1 != Integer.valueOf(arrayOfString[1]).intValue())
              break label295;
            localObject = "network";
            f1 = Integer.valueOf(arrayOfString[2]).intValue() / 1000000.0F;
            f2 = Integer.valueOf(arrayOfString[3]).intValue() / 1000000.0F;
            ab.d("MicroMsg.JsApiChooseMultiMedia", "cached gps coordinate, precision: %d source: %s latitude: %f longitude: %f", new Object[] { Integer.valueOf(i), localObject, Float.valueOf(f1), Float.valueOf(f2) });
            localObject = new com/tencent/mm/sdk/platformtools/BackwardSupportUtil$ExifHelper$LatLongData;
            ((BackwardSupportUtil.ExifHelper.LatLongData)localObject).<init>(f1, f2);
          }
          catch (Exception localException)
          {
            ab.e("MicroMsg.JsApiChooseMultiMedia", "getCurrentGPSData parse value error.", new Object[] { localException });
            str = null;
          }
          break;
          label295: str = "gps";
        }
      ab.i("MicroMsg.JsApiChooseMultiMedia", "lbs location is null, no cached data!");
      ab.e("MicroMsg.JsApiChooseMultiMedia", "location get error!");
      String str = null;
    }
  }

  private AppBrandLocalVideoObject aj(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(131243);
    String str1 = paramString;
    if (paramBoolean);
    String str2;
    int i;
    int j;
    int k;
    try
    {
      str1 = Bu(paramString);
    }
    catch (Exception localException)
    {
      try
      {
        while (true)
        {
          paramString = new android/media/MediaMetadataRetriever;
          paramString.<init>();
          paramString.setDataSource(str1);
          if (paramString != null)
            break;
          ab.e("MicroMsg.JsApiChooseMultiMedia", "addVideoItem, null meta data");
          AppMethodBeat.o(131243);
          paramString = null;
          return paramString;
          localException = localException;
          ab.e("MicroMsg.JsApiChooseMultiMedia", "addVideoItem, remux failed, exp = %s", new Object[] { bo.l(localException) });
          str2 = paramString;
        }
      }
      catch (Exception paramString)
      {
        while (true)
        {
          ab.e("MicroMsg.JsApiChooseMultiMedia", "addVideoItem, MetaDataRetriever setDataSource failed, e = %s", new Object[] { paramString });
          paramString = null;
        }
        i = bo.getInt(paramString.extractMetadata(18), 0);
        j = bo.getInt(paramString.extractMetadata(19), 0);
        k = bo.getInt(paramString.extractMetadata(9), 0);
        if (!"90".equals(paramString.extractMetadata(24)))
          break label263;
      }
    }
    int m;
    if (i > j)
    {
      m = i;
      i = j;
    }
    while (true)
    {
      paramString.release();
      paramString = AppBrandLocalMediaObjectManager.bs(this.hPJ.appId, str2);
      if (paramString == null)
      {
        ab.e("MicroMsg.JsApiChooseMultiMedia", "attachVideo error, return null");
        AppMethodBeat.o(131243);
        paramString = null;
        break;
      }
      paramString.duration = ((k + 500) / 1000);
      paramString.width = i;
      paramString.height = m;
      paramString.size = com.tencent.mm.a.e.cs(str2);
      ab.i("MicroMsg.JsApiChooseMultiMedia", "addVideoItem, return %s", new Object[] { paramString });
      AppMethodBeat.o(131243);
      break;
      label263: m = j;
    }
  }

  public final void a(AppBrandProxyUIProcessTask.ProcessRequest paramProcessRequest)
  {
    AppMethodBeat.i(131236);
    this.hPJ = ((JsApiChooseMultiMedia.ChooseRequest)paramProcessRequest);
    int i;
    if (bo.gO(aBQ()) > 200L)
    {
      i = 1;
      if (i == 0)
        t.makeText(aBQ(), ah.getResources().getString(2131296577), 1).show();
      aBQ().ifE = this;
      if ((!this.hPJ.hOS) || (!this.hPJ.hOT))
        break label117;
      n.a(aBQ(), 1, this.hPJ.count, this.hOZ, aEj());
      AppMethodBeat.o(131236);
    }
    while (true)
    {
      return;
      i = 0;
      break;
      label117: if (this.hPJ.hOT)
      {
        paramProcessRequest = aEj();
        paramProcessRequest.putExtra("show_header_view", false);
        n.a(aBQ(), 1, this.hPJ.count, this.hOZ, paramProcessRequest);
        AppMethodBeat.o(131236);
      }
      else if (this.hPJ.hOS)
      {
        Intent localIntent = new Intent();
        localIntent.putExtra("album_business_bubble_media_by_coordinate_latitude", this.hPJ.latitude);
        localIntent.putExtra("album_business_bubble_media_by_coordinate_longitude", this.hPJ.longitude);
        paramProcessRequest = new SightParams(7, 1);
        paramProcessRequest.mode = 0;
        paramProcessRequest.fcY.duration = this.hPJ.gLP;
        localIntent.putExtra("KEY_SIGHT_PARAMS", paramProcessRequest);
        n.a(aBQ(), 2, localIntent, 7, 0);
        AppMethodBeat.o(131236);
      }
      else
      {
        ab.e("MicroMsg.JsApiChooseMultiMedia", "unknown scene, ignore this request");
        this.hPK.bFZ = -2;
        a(this.hPK);
        AppMethodBeat.o(131236);
      }
    }
  }

  public final void aBX()
  {
    AppMethodBeat.i(131241);
    super.aBX();
    if (this.ejZ != null)
    {
      this.ejZ.dismiss();
      this.ejZ = null;
    }
    AppMethodBeat.o(131241);
  }

  public final void c(int paramInt1, int paramInt2, Intent paramIntent)
  {
    double d1 = 91.0D;
    boolean bool1 = true;
    AppMethodBeat.i(131238);
    if (paramInt2 == 0)
    {
      this.hPK.bFZ = 0;
      a(this.hPK);
      AppMethodBeat.o(131238);
    }
    while (true)
    {
      label40: return;
      if (paramIntent != null)
        d1 = paramIntent.getDoubleExtra("longitude", 91.0D);
      if (paramIntent != null);
      for (final double d2 = paramIntent.getDoubleExtra("latitude", 181.0D); ; d2 = 181.0D)
      {
        ab.d("MicroMsg.JsApiChooseMultiMedia", "longitude: %f, latitude: %f.", new Object[] { Double.valueOf(d1), Double.valueOf(d2) });
        ab.i("MicroMsg.JsApiChooseMultiMedia", "requestCode: %d.", new Object[] { Integer.valueOf(paramInt1) });
        switch (paramInt1)
        {
        default:
          this.hPK.bFZ = -2;
          a(this.hPK);
          AppMethodBeat.o(131238);
          break label40;
        case 1:
        case 2:
        }
      }
      ab.i("MicroMsg.JsApiChooseMultiMedia", "REQUEST_CODE_GALLERY");
      if (paramIntent == null)
      {
        this.hPK.bFZ = 0;
        a(this.hPK);
        AppMethodBeat.o(131238);
      }
      else
      {
        Object localObject = paramIntent.getStringArrayListExtra("CropImage_OutputPath_List");
        final ArrayList localArrayList = paramIntent.getStringArrayListExtra("key_select_video_list");
        final boolean bool2 = paramIntent.getBooleanExtra("CropImage_Compress_Img", false);
        aEi();
        if (!bool2)
          if (!bo.ek((List)localObject))
          {
            paramIntent = ((List)localObject).iterator();
            while (paramIntent.hasNext())
              if (Exif.fromFile((String)paramIntent.next()).getOrientationInDegree() != 0)
              {
                paramInt1 = 1;
                label297: if (paramInt1 == 0)
                  break label342;
              }
          }
        while (true)
        {
          m.aNS().aa(new Runnable()
          {
            public final void run()
            {
              AppMethodBeat.i(131230);
              JSONArray localJSONArray = new JSONArray();
              Object localObject1;
              Object localObject2;
              long l1;
              long l2;
              if ((this.hPL != null) && (this.hPL.size() > 0))
              {
                localObject1 = this.hPL.iterator();
                while (((Iterator)localObject1).hasNext())
                {
                  localObject2 = (String)((Iterator)localObject1).next();
                  if ((!bo.isNullOrNil((String)localObject2)) && (new File((String)localObject2).exists()))
                  {
                    ab.i("MicroMsg.JsApiChooseMultiMedia", "local img file exist, success");
                    l1 = 0L;
                    l2 = l1;
                  }
                }
              }
              while (true)
              {
                Object localObject5;
                double d;
                Object localObject6;
                try
                {
                  while (true)
                  {
                    if (!bo.isNullOrNil((String)localObject2))
                      break label443;
                    l2 = l1;
                    ab.d("MicroMsg.SDK.BackwardSupportUtil", "filepath is null or nil");
                    Object localObject3 = null;
                    l2 = l1;
                    if (localObject3 != null)
                    {
                      l2 = l1;
                      localObject5 = new java/text/SimpleDateFormat;
                      l2 = l1;
                      ((SimpleDateFormat)localObject5).<init>("yyyy:MM:dd HH:mm:ss");
                      l2 = l1;
                      l1 = ((SimpleDateFormat)localObject5).parse((String)localObject3).getTime() / 1000L;
                      l2 = l1;
                      ab.d("MicroMsg.JsApiChooseMultiMedia", "parse result time: %d, imgPath: %s.", new Object[] { Long.valueOf(l1), localObject2 });
                      l2 = l1;
                    }
                    d = -1.0D;
                    if ((!a.r(d2)) || (!a.q(bool2)))
                      break label536;
                    localObject3 = BackwardSupportUtil.ExifHelper.ami((String)localObject2);
                    if (localObject3 == null)
                      break label517;
                    d = TencentLocationUtils.distanceBetween(((BackwardSupportUtil.ExifHelper.LatLongData)localObject3).cEB, ((BackwardSupportUtil.ExifHelper.LatLongData)localObject3).fFz, d2, bool2);
                    localObject5 = JsApiChooseMultiMedia.a.a(l2, d);
                    if (!localArrayList)
                      break label555;
                    localObject3 = JsApiChooseMultiMedia.a.Bw((String)localObject2);
                    bool = true;
                    localObject6 = JsApiChooseMultiMedia.Bt((String)localObject3);
                    localObject2 = AppBrandLocalMediaObjectManager.j(JsApiChooseMultiMedia.a.this.hPJ.appId, (String)localObject3, bool);
                    if (localObject2 == null)
                      break label583;
                    try
                    {
                      localObject3 = new org/json/JSONObject;
                      ((JSONObject)localObject3).<init>();
                      ((JSONObject)localObject3).put("type", "image");
                      ((JSONObject)localObject3).put("tempFilePath", ((AppBrandLocalMediaObject)localObject2).czD);
                      ((JSONObject)localObject3).put("size", ((AppBrandLocalMediaObject)localObject2).gjQ);
                      ((JSONObject)localObject3).put("width", ((JsApiChooseMultiMedia.b)localObject6).width);
                      ((JSONObject)localObject3).put("height", ((JsApiChooseMultiMedia.b)localObject6).height);
                      ((JSONObject)localObject3).put("orientation", ((JsApiChooseMultiMedia.b)localObject6).hfh);
                      ((JSONObject)localObject3).put("mark", localObject5);
                      ((JSONObject)localObject3).put("scene", "album");
                      localJSONArray.put(localObject3);
                    }
                    catch (Exception localException2)
                    {
                      ab.printErrStackTrace("MicroMsg.JsApiChooseMultiMedia", localException2, "", new Object[0]);
                    }
                  }
                  break;
                  label443: l2 = l1;
                  if (!com.tencent.mm.vfs.e.ct((String)localObject2))
                  {
                    l2 = l1;
                    ab.d("MicroMsg.SDK.BackwardSupportUtil", "file not exist:[%s]", new Object[] { localObject2 });
                    str1 = null;
                    continue;
                  }
                  l2 = l1;
                  String str1 = Exif.fromFile((String)localObject2).dateTime;
                  continue;
                }
                catch (Exception localException3)
                {
                  ab.e("MicroMsg.JsApiChooseMultiMedia", "parse from Date String error, imgPath: %s.", new Object[] { localObject2 });
                  continue;
                  label517: ab.w("MicroMsg.JsApiChooseMultiMedia", "calculate X fail, locData is null. imgPath: %s.", new Object[] { localObject2 });
                  continue;
                  label536: ab.w("MicroMsg.JsApiChooseMultiMedia", "calculate X fail, lat/long is invalid. imgPath: %s.", new Object[] { localObject2 });
                  continue;
                }
                label555: if (this.hPf)
                {
                  String str2 = JsApiChooseMultiMedia.a.Bx((String)localObject2);
                  if (!str2.equals(localObject2))
                  {
                    bool = true;
                    continue;
                    label583: ab.e("MicroMsg.JsApiChooseMultiMedia", "handle chosen list from gallery, get null obj from path: %s", new Object[] { str2 });
                    break;
                    if ((this.hPM != null) && (this.hPM.size() > 0))
                    {
                      localObject2 = this.hPM.iterator();
                      while (((Iterator)localObject2).hasNext())
                      {
                        str2 = (String)((Iterator)localObject2).next();
                        if ((!bo.isNullOrNil(str2)) && (new File(str2).exists()))
                        {
                          ab.i("MicroMsg.JsApiChooseMultiMedia", "local video file exist, success");
                          l1 = 0L;
                          l2 = l1;
                        }
                      }
                    }
                    while (true)
                    {
                      try
                      {
                        localObject5 = BackwardSupportUtil.amh(str2);
                        l2 = l1;
                        if (localObject5 != null)
                        {
                          l2 = l1;
                          localObject1 = new java/text/SimpleDateFormat;
                          l2 = l1;
                          ((SimpleDateFormat)localObject1).<init>("yyyyMMdd'T'hhmmss.SSS'Z'");
                          l2 = l1;
                          long l3 = ((SimpleDateFormat)localObject1).parse((String)localObject5).getTime();
                          l2 = l1;
                          localObject1 = Calendar.getInstance(TimeZone.getDefault());
                          l2 = l1;
                          int i = ((Calendar)localObject1).get(15);
                          l2 = l1;
                          int j = ((Calendar)localObject1).get(16);
                          l2 = l1;
                          localObject1 = Calendar.getInstance();
                          l2 = l1;
                          ((Calendar)localObject1).setTimeInMillis(l3);
                          l2 = l1;
                          ((Calendar)localObject1).add(14, i + j);
                          l2 = l1;
                          l1 = ((Calendar)localObject1).getTimeInMillis() / 1000L;
                          l2 = l1;
                          ab.d("MicroMsg.JsApiChooseMultiMedia", "parse result time: %d, videoPath: %s.", new Object[] { Long.valueOf(l1), str2 });
                          l2 = l1;
                        }
                        d = -1.0D;
                        if ((a.r(d2)) && (a.q(bool2)))
                        {
                          localObject1 = BackwardSupportUtil.amg(str2);
                          if (localObject1 != null)
                          {
                            d = TencentLocationUtils.distanceBetween(((BackwardSupportUtil.ExifHelper.LatLongData)localObject1).cEB, ((BackwardSupportUtil.ExifHelper.LatLongData)localObject1).fFz, d2, bool2);
                            localObject1 = JsApiChooseMultiMedia.a.a(l2, d);
                            localObject5 = JsApiChooseMultiMedia.a.a(JsApiChooseMultiMedia.a.this, str2, true);
                            if (localObject5 != null)
                              continue;
                            ab.e("MicroMsg.JsApiChooseMultiMedia", "addVideoItem fail, mVideoFilePath is %s", new Object[] { str2 });
                            JsApiChooseMultiMedia.a.this.hPK.bFZ = -2;
                            JsApiChooseMultiMedia.a.a(JsApiChooseMultiMedia.a.this, JsApiChooseMultiMedia.a.this.hPK);
                            AppMethodBeat.o(131230);
                            return;
                          }
                        }
                      }
                      catch (Exception localException1)
                      {
                        while (true)
                        {
                          ab.e("MicroMsg.JsApiChooseMultiMedia", "parse from Date String error, videoPath: %s.", new Object[] { str2 });
                          continue;
                          ab.w("MicroMsg.JsApiChooseMultiMedia", "calculate X fail, locData is null. videoPath: %s.", new Object[] { str2 });
                          continue;
                          ab.w("MicroMsg.JsApiChooseMultiMedia", "calculate X fail, lat/long is invalid. videoPath: %s.", new Object[] { str2 });
                          continue;
                          localObject6 = JsApiChooseMultiMedia.a.By(str2);
                          str2 = "";
                          if (!bo.isNullOrNil((String)localObject6))
                            str2 = JsApiChooseMultiMedia.a.a(JsApiChooseMultiMedia.a.this, (String)localObject6);
                          try
                          {
                            localObject6 = new org/json/JSONObject;
                            ((JSONObject)localObject6).<init>();
                            ((JSONObject)localObject6).put("type", "video");
                            ((JSONObject)localObject6).put("tempFilePath", ((AppBrandLocalVideoObject)localObject5).czD);
                            ((JSONObject)localObject6).put("size", ((AppBrandLocalVideoObject)localObject5).size);
                            ((JSONObject)localObject6).put("width", ((AppBrandLocalVideoObject)localObject5).width);
                            ((JSONObject)localObject6).put("height", ((AppBrandLocalVideoObject)localObject5).height);
                            ((JSONObject)localObject6).put("duration", ((AppBrandLocalVideoObject)localObject5).duration);
                            ((JSONObject)localObject6).put("thumbTempFilePath", str2);
                            ((JSONObject)localObject6).put("mark", localException1);
                            ((JSONObject)localObject6).put("scene", "album");
                            localJSONArray.put(localObject6);
                          }
                          catch (Exception localException4)
                          {
                            ab.printErrStackTrace("MicroMsg.JsApiChooseMultiMedia", localException4, "", new Object[0]);
                          }
                        }
                      }
                      break;
                      JsApiChooseMultiMedia.a.this.hPK.bFZ = -1;
                      JsApiChooseMultiMedia.a.this.hPK.hPI = localJSONArray.toString();
                      JsApiChooseMultiMedia.a.b(JsApiChooseMultiMedia.a.this, JsApiChooseMultiMedia.a.this.hPK);
                      AppMethodBeat.o(131230);
                    }
                  }
                }
                boolean bool = false;
                Object localObject4 = localObject2;
              }
            }
          });
          AppMethodBeat.o(131238);
          break;
          paramInt1 = 0;
          break label297;
          label342: bool1 = false;
        }
        ab.i("MicroMsg.JsApiChooseMultiMedia", "REQUEST_CODE_TAKE_MEDIA_CAMERA");
        if (paramIntent == null)
        {
          this.hPK.bFZ = 0;
          a(this.hPK);
          AppMethodBeat.o(131238);
        }
        else
        {
          ab.i("MicroMsg.JsApiChooseMultiMedia", "data is valid!");
          localObject = (SightCaptureResult)paramIntent.getParcelableExtra("key_req_result");
          if (localObject == null)
          {
            ab.e("MicroMsg.JsApiChooseMultiMedia", "sight capture result is null!");
            this.hPK.bFZ = -2;
            a(this.hPK);
            AppMethodBeat.o(131238);
          }
          else if (((SightCaptureResult)localObject).osA)
          {
            localObject = ((SightCaptureResult)localObject).osI;
            if ((bo.isNullOrNil((String)localObject)) || (!new File((String)localObject).exists()))
            {
              ab.e("MicroMsg.JsApiChooseMultiMedia", "picture_picturePath file is not exist! path:%s", new Object[] { localObject });
              this.hPK.bFZ = -2;
              a(this.hPK);
              AppMethodBeat.o(131238);
            }
            else
            {
              ab.i("MicroMsg.JsApiChooseMultiMedia", "filePath:%s", new Object[] { localObject });
              bool1 = paramIntent.getBooleanExtra("CropImage_Compress_Img", false);
              aEi();
              m.aNS().aa(new JsApiChooseMultiMedia.a.2(this, bool1, (String)localObject, d2, d1));
              AppMethodBeat.o(131238);
            }
          }
          else
          {
            paramIntent = ((SightCaptureResult)localObject).osC;
            if (bo.isNullOrNil(paramIntent))
            {
              ab.e("MicroMsg.JsApiChooseMultiMedia", "mVideoFilePath is null");
              this.hPK.bFZ = -2;
              a(this.hPK);
              AppMethodBeat.o(131238);
            }
            else
            {
              ab.i("MicroMsg.JsApiChooseMultiMedia", "mVideoFilePath:%s", new Object[] { paramIntent });
              aEi();
              m.aNS().aa(new JsApiChooseMultiMedia.a.3(this, paramIntent, d2, d1));
              AppMethodBeat.o(131238);
            }
          }
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMultiMedia.a
 * JD-Core Version:    0.6.2
 */