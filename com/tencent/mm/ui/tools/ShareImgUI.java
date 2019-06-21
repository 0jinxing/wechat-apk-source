package com.tencent.mm.ui.tools;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.widget.Toast;
import com.jg.JgClassChecked;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.model.aw;
import com.tencent.mm.modelsimple.z;
import com.tencent.mm.opensdk.modelmsg.SendMessageToWX.Req;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.mm.opensdk.modelmsg.WXTextObject;
import com.tencent.mm.plugin.account.ui.SimpleLoginUI;
import com.tencent.mm.pluginsdk.ui.AutoLoginActivity;
import com.tencent.mm.pluginsdk.ui.AutoLoginActivity.a;
import com.tencent.mm.protocal.protobuf.rt;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.transmit.SelectConversationUI;
import com.tencent.mm.ui.transmit.SendAppMessageWrapperUI;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@JgClassChecked(author=20, fComment="checked", lastDate="20140422", reviewer=20, vComment={com.jg.EType.ACTIVITYCHECK})
public class ShareImgUI extends AutoLoginActivity
  implements f
{
  private ProgressDialog ehJ;
  String filePath;
  private ak handler;
  private Intent intent;
  Uri uri;
  ArrayList<String> zAu;
  Intent zHq;

  public ShareImgUI()
  {
    AppMethodBeat.i(34944);
    this.ehJ = null;
    this.intent = null;
    this.filePath = null;
    this.uri = null;
    this.zAu = null;
    this.zHq = null;
    this.handler = new ShareImgUI.3(this);
    AppMethodBeat.o(34944);
  }

  private void PI(int paramInt)
  {
    AppMethodBeat.i(34954);
    switch (paramInt)
    {
    default:
      Toast.makeText(this, 2131303506, 1).show();
      AppMethodBeat.o(34954);
    case 1:
    }
    while (true)
    {
      return;
      Toast.makeText(this, 2131303503, 1).show();
      AppMethodBeat.o(34954);
    }
  }

  // ERROR //
  private String a(Uri paramUri, android.database.Cursor paramCursor)
  {
    // Byte code:
    //   0: ldc 96
    //   2: invokestatic 50	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aload_1
    //   6: ifnull +367 -> 373
    //   9: ldc 98
    //   11: astore_3
    //   12: aload_2
    //   13: ldc 100
    //   15: invokeinterface 106 2 0
    //   20: istore 4
    //   22: aload_3
    //   23: astore 5
    //   25: iload 4
    //   27: iconst_m1
    //   28: if_icmpeq +55 -> 83
    //   31: aload_2
    //   32: iload 4
    //   34: invokeinterface 110 2 0
    //   39: astore 5
    //   41: aload 5
    //   43: astore_3
    //   44: aload_3
    //   45: astore 5
    //   47: aload_3
    //   48: ifnull +20 -> 68
    //   51: aload_3
    //   52: astore 5
    //   54: aload_3
    //   55: ifnull +13 -> 68
    //   58: aload_3
    //   59: ldc 112
    //   61: ldc 114
    //   63: invokevirtual 120	java/lang/String:replaceAll	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   66: astore 5
    //   68: ldc 122
    //   70: ldc 124
    //   72: aload 5
    //   74: invokestatic 128	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   77: invokevirtual 132	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   80: invokestatic 137	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   83: aload_2
    //   84: invokeinterface 140 1 0
    //   89: aload_0
    //   90: invokevirtual 144	com/tencent/mm/ui/tools/ShareImgUI:getContentResolver	()Landroid/content/ContentResolver;
    //   93: aload_1
    //   94: ldc 146
    //   96: invokevirtual 152	android/content/ContentResolver:openAssetFileDescriptor	(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/res/AssetFileDescriptor;
    //   99: astore_1
    //   100: aload_1
    //   101: invokevirtual 158	android/content/res/AssetFileDescriptor:createInputStream	()Ljava/io/FileInputStream;
    //   104: astore_2
    //   105: invokestatic 164	com/tencent/mm/model/aw:ZK	()Lcom/tencent/mm/model/c;
    //   108: pop
    //   109: invokestatic 170	com/tencent/mm/model/c:isSDCardAvailable	()Z
    //   112: ifeq +296 -> 408
    //   115: new 172	java/lang/StringBuilder
    //   118: astore_3
    //   119: aload_3
    //   120: invokespecial 173	java/lang/StringBuilder:<init>	()V
    //   123: aload_3
    //   124: getstatic 178	com/tencent/mm/compatible/util/e:eSn	Ljava/lang/String;
    //   127: invokevirtual 182	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   130: ldc 184
    //   132: invokevirtual 182	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   135: invokevirtual 188	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   138: astore_3
    //   139: new 172	java/lang/StringBuilder
    //   142: astore 6
    //   144: aload 6
    //   146: invokespecial 173	java/lang/StringBuilder:<init>	()V
    //   149: aload 6
    //   151: getstatic 178	com/tencent/mm/compatible/util/e:eSn	Ljava/lang/String;
    //   154: invokevirtual 182	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   157: ldc 190
    //   159: invokevirtual 182	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   162: aload 5
    //   164: invokevirtual 182	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   167: invokevirtual 188	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   170: astore 7
    //   172: new 192	com/tencent/mm/vfs/b
    //   175: astore 5
    //   177: aload 5
    //   179: aload_3
    //   180: invokespecial 195	com/tencent/mm/vfs/b:<init>	(Ljava/lang/String;)V
    //   183: aload 5
    //   185: invokevirtual 198	com/tencent/mm/vfs/b:exists	()Z
    //   188: ifne +9 -> 197
    //   191: aload 5
    //   193: invokevirtual 201	com/tencent/mm/vfs/b:mkdirs	()Z
    //   196: pop
    //   197: new 192	com/tencent/mm/vfs/b
    //   200: astore_3
    //   201: aload_3
    //   202: aload 7
    //   204: invokespecial 195	com/tencent/mm/vfs/b:<init>	(Ljava/lang/String;)V
    //   207: aload_3
    //   208: invokevirtual 198	com/tencent/mm/vfs/b:exists	()Z
    //   211: ifne +8 -> 219
    //   214: aload_3
    //   215: invokevirtual 204	com/tencent/mm/vfs/b:createNewFile	()Z
    //   218: pop
    //   219: aload 7
    //   221: iconst_0
    //   222: invokestatic 210	com/tencent/mm/vfs/e:L	(Ljava/lang/String;Z)Ljava/io/OutputStream;
    //   225: astore_3
    //   226: aload_3
    //   227: astore 8
    //   229: aload_1
    //   230: astore 6
    //   232: aload_2
    //   233: astore 5
    //   235: sipush 5120
    //   238: newarray byte
    //   240: astore 9
    //   242: aload_3
    //   243: astore 8
    //   245: aload_1
    //   246: astore 6
    //   248: aload_2
    //   249: astore 5
    //   251: aload_2
    //   252: aload 9
    //   254: iconst_0
    //   255: sipush 5120
    //   258: invokevirtual 216	java/io/InputStream:read	([BII)I
    //   261: istore 4
    //   263: iload 4
    //   265: iconst_m1
    //   266: if_icmpeq +195 -> 461
    //   269: aload_3
    //   270: astore 8
    //   272: aload_1
    //   273: astore 6
    //   275: aload_2
    //   276: astore 5
    //   278: aload_3
    //   279: aload 9
    //   281: iconst_0
    //   282: iload 4
    //   284: invokevirtual 222	java/io/OutputStream:write	([BII)V
    //   287: goto -45 -> 242
    //   290: astore 7
    //   292: aload_3
    //   293: astore 8
    //   295: aload_1
    //   296: astore 6
    //   298: aload_2
    //   299: astore 5
    //   301: new 172	java/lang/StringBuilder
    //   304: astore 9
    //   306: aload_3
    //   307: astore 8
    //   309: aload_1
    //   310: astore 6
    //   312: aload_2
    //   313: astore 5
    //   315: aload 9
    //   317: ldc 224
    //   319: invokespecial 225	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   322: aload_3
    //   323: astore 8
    //   325: aload_1
    //   326: astore 6
    //   328: aload_2
    //   329: astore 5
    //   331: ldc 122
    //   333: aload 9
    //   335: aload 7
    //   337: invokevirtual 228	java/io/FileNotFoundException:getMessage	()Ljava/lang/String;
    //   340: invokevirtual 182	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   343: invokevirtual 188	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   346: invokestatic 231	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   349: aload_2
    //   350: ifnull +7 -> 357
    //   353: aload_2
    //   354: invokevirtual 232	java/io/InputStream:close	()V
    //   357: aload_1
    //   358: ifnull +7 -> 365
    //   361: aload_1
    //   362: invokevirtual 233	android/content/res/AssetFileDescriptor:close	()V
    //   365: aload_3
    //   366: ifnull +7 -> 373
    //   369: aload_3
    //   370: invokevirtual 234	java/io/OutputStream:close	()V
    //   373: ldc 96
    //   375: invokestatic 72	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   378: aconst_null
    //   379: astore 7
    //   381: aload 7
    //   383: areturn
    //   384: astore 5
    //   386: ldc 122
    //   388: ldc 236
    //   390: iconst_1
    //   391: anewarray 238	java/lang/Object
    //   394: dup
    //   395: iconst_0
    //   396: aload 5
    //   398: invokevirtual 239	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   401: aastore
    //   402: invokestatic 243	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   405: goto -361 -> 44
    //   408: aload_0
    //   409: aload 5
    //   411: invokevirtual 247	com/tencent/mm/ui/tools/ShareImgUI:deleteFile	(Ljava/lang/String;)Z
    //   414: pop
    //   415: new 172	java/lang/StringBuilder
    //   418: astore_3
    //   419: aload_3
    //   420: invokespecial 173	java/lang/StringBuilder:<init>	()V
    //   423: aload_3
    //   424: aload_0
    //   425: invokevirtual 251	com/tencent/mm/ui/tools/ShareImgUI:getFilesDir	()Ljava/io/File;
    //   428: invokevirtual 256	java/io/File:getPath	()Ljava/lang/String;
    //   431: invokevirtual 182	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   434: ldc_w 258
    //   437: invokevirtual 182	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   440: aload 5
    //   442: invokevirtual 182	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   445: invokevirtual 188	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   448: astore 7
    //   450: aload_0
    //   451: aload 5
    //   453: iconst_0
    //   454: invokevirtual 262	com/tencent/mm/ui/tools/ShareImgUI:openFileOutput	(Ljava/lang/String;I)Ljava/io/FileOutputStream;
    //   457: astore_3
    //   458: goto -232 -> 226
    //   461: aload_3
    //   462: astore 8
    //   464: aload_1
    //   465: astore 6
    //   467: aload_2
    //   468: astore 5
    //   470: aload_3
    //   471: invokevirtual 265	java/io/OutputStream:flush	()V
    //   474: aload_3
    //   475: astore 8
    //   477: aload_1
    //   478: astore 6
    //   480: aload_2
    //   481: astore 5
    //   483: aload_3
    //   484: invokevirtual 234	java/io/OutputStream:close	()V
    //   487: aload_2
    //   488: ifnull +7 -> 495
    //   491: aload_2
    //   492: invokevirtual 232	java/io/InputStream:close	()V
    //   495: aload_1
    //   496: ifnull +7 -> 503
    //   499: aload_1
    //   500: invokevirtual 233	android/content/res/AssetFileDescriptor:close	()V
    //   503: aload_3
    //   504: ifnull +7 -> 511
    //   507: aload_3
    //   508: invokevirtual 234	java/io/OutputStream:close	()V
    //   511: ldc 96
    //   513: invokestatic 72	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   516: goto -135 -> 381
    //   519: astore 7
    //   521: aconst_null
    //   522: astore_3
    //   523: aconst_null
    //   524: astore_1
    //   525: aconst_null
    //   526: astore_2
    //   527: aload_3
    //   528: astore 8
    //   530: aload_1
    //   531: astore 6
    //   533: aload_2
    //   534: astore 5
    //   536: new 172	java/lang/StringBuilder
    //   539: astore 9
    //   541: aload_3
    //   542: astore 8
    //   544: aload_1
    //   545: astore 6
    //   547: aload_2
    //   548: astore 5
    //   550: aload 9
    //   552: ldc_w 267
    //   555: invokespecial 225	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   558: aload_3
    //   559: astore 8
    //   561: aload_1
    //   562: astore 6
    //   564: aload_2
    //   565: astore 5
    //   567: ldc 122
    //   569: aload 9
    //   571: aload 7
    //   573: invokevirtual 268	java/io/IOException:getMessage	()Ljava/lang/String;
    //   576: invokevirtual 182	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   579: invokevirtual 188	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   582: invokestatic 231	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   585: aload_2
    //   586: ifnull +7 -> 593
    //   589: aload_2
    //   590: invokevirtual 232	java/io/InputStream:close	()V
    //   593: aload_1
    //   594: ifnull +7 -> 601
    //   597: aload_1
    //   598: invokevirtual 233	android/content/res/AssetFileDescriptor:close	()V
    //   601: aload_3
    //   602: ifnull -229 -> 373
    //   605: aload_3
    //   606: invokevirtual 234	java/io/OutputStream:close	()V
    //   609: goto -236 -> 373
    //   612: astore_1
    //   613: goto -240 -> 373
    //   616: astore 7
    //   618: aconst_null
    //   619: astore_3
    //   620: aconst_null
    //   621: astore_1
    //   622: aconst_null
    //   623: astore_2
    //   624: aload_3
    //   625: astore 8
    //   627: aload_1
    //   628: astore 6
    //   630: aload_2
    //   631: astore 5
    //   633: new 172	java/lang/StringBuilder
    //   636: astore 9
    //   638: aload_3
    //   639: astore 8
    //   641: aload_1
    //   642: astore 6
    //   644: aload_2
    //   645: astore 5
    //   647: aload 9
    //   649: ldc_w 270
    //   652: invokespecial 225	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   655: aload_3
    //   656: astore 8
    //   658: aload_1
    //   659: astore 6
    //   661: aload_2
    //   662: astore 5
    //   664: ldc 122
    //   666: aload 9
    //   668: aload 7
    //   670: invokevirtual 239	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   673: invokevirtual 182	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   676: invokevirtual 188	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   679: invokestatic 231	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   682: aload_3
    //   683: astore 8
    //   685: aload_1
    //   686: astore 6
    //   688: aload_2
    //   689: astore 5
    //   691: ldc 122
    //   693: aload 7
    //   695: invokevirtual 271	java/lang/Exception:toString	()Ljava/lang/String;
    //   698: invokestatic 231	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   701: aload_2
    //   702: ifnull +7 -> 709
    //   705: aload_2
    //   706: invokevirtual 232	java/io/InputStream:close	()V
    //   709: aload_1
    //   710: ifnull +7 -> 717
    //   713: aload_1
    //   714: invokevirtual 233	android/content/res/AssetFileDescriptor:close	()V
    //   717: aload_3
    //   718: ifnull -345 -> 373
    //   721: aload_3
    //   722: invokevirtual 234	java/io/OutputStream:close	()V
    //   725: goto -352 -> 373
    //   728: astore_1
    //   729: goto -356 -> 373
    //   732: astore_3
    //   733: aconst_null
    //   734: astore 8
    //   736: aconst_null
    //   737: astore_1
    //   738: aconst_null
    //   739: astore_2
    //   740: aload_2
    //   741: ifnull +7 -> 748
    //   744: aload_2
    //   745: invokevirtual 232	java/io/InputStream:close	()V
    //   748: aload_1
    //   749: ifnull +7 -> 756
    //   752: aload_1
    //   753: invokevirtual 233	android/content/res/AssetFileDescriptor:close	()V
    //   756: aload 8
    //   758: ifnull +8 -> 766
    //   761: aload 8
    //   763: invokevirtual 234	java/io/OutputStream:close	()V
    //   766: ldc 96
    //   768: invokestatic 72	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   771: aload_3
    //   772: athrow
    //   773: astore_1
    //   774: goto -8 -> 766
    //   777: astore_3
    //   778: aconst_null
    //   779: astore 8
    //   781: aconst_null
    //   782: astore_2
    //   783: goto -43 -> 740
    //   786: astore_3
    //   787: aconst_null
    //   788: astore 8
    //   790: goto -50 -> 740
    //   793: astore_3
    //   794: aload 6
    //   796: astore_1
    //   797: aload 5
    //   799: astore_2
    //   800: goto -60 -> 740
    //   803: astore 7
    //   805: aconst_null
    //   806: astore_3
    //   807: aconst_null
    //   808: astore_2
    //   809: goto -185 -> 624
    //   812: astore 7
    //   814: aconst_null
    //   815: astore_3
    //   816: goto -192 -> 624
    //   819: astore 7
    //   821: goto -197 -> 624
    //   824: astore 7
    //   826: aconst_null
    //   827: astore_3
    //   828: aconst_null
    //   829: astore_2
    //   830: goto -303 -> 527
    //   833: astore 7
    //   835: aconst_null
    //   836: astore_3
    //   837: goto -310 -> 527
    //   840: astore 7
    //   842: goto -315 -> 527
    //   845: astore_1
    //   846: goto -473 -> 373
    //   849: astore 7
    //   851: aconst_null
    //   852: astore_3
    //   853: aconst_null
    //   854: astore_1
    //   855: aconst_null
    //   856: astore_2
    //   857: goto -565 -> 292
    //   860: astore 7
    //   862: aconst_null
    //   863: astore_3
    //   864: aconst_null
    //   865: astore_2
    //   866: goto -574 -> 292
    //   869: astore 7
    //   871: aconst_null
    //   872: astore_3
    //   873: goto -581 -> 292
    //   876: astore_1
    //   877: goto -366 -> 511
    //
    // Exception table:
    //   from	to	target	type
    //   235	242	290	java/io/FileNotFoundException
    //   251	263	290	java/io/FileNotFoundException
    //   278	287	290	java/io/FileNotFoundException
    //   470	474	290	java/io/FileNotFoundException
    //   483	487	290	java/io/FileNotFoundException
    //   31	41	384	java/lang/Exception
    //   89	100	519	java/io/IOException
    //   589	593	612	java/lang/Exception
    //   597	601	612	java/lang/Exception
    //   605	609	612	java/lang/Exception
    //   89	100	616	java/lang/Exception
    //   705	709	728	java/lang/Exception
    //   713	717	728	java/lang/Exception
    //   721	725	728	java/lang/Exception
    //   89	100	732	finally
    //   744	748	773	java/lang/Exception
    //   752	756	773	java/lang/Exception
    //   761	766	773	java/lang/Exception
    //   100	105	777	finally
    //   105	197	786	finally
    //   197	219	786	finally
    //   219	226	786	finally
    //   408	458	786	finally
    //   235	242	793	finally
    //   251	263	793	finally
    //   278	287	793	finally
    //   301	306	793	finally
    //   315	322	793	finally
    //   331	349	793	finally
    //   470	474	793	finally
    //   483	487	793	finally
    //   536	541	793	finally
    //   550	558	793	finally
    //   567	585	793	finally
    //   633	638	793	finally
    //   647	655	793	finally
    //   664	682	793	finally
    //   691	701	793	finally
    //   100	105	803	java/lang/Exception
    //   105	197	812	java/lang/Exception
    //   197	219	812	java/lang/Exception
    //   219	226	812	java/lang/Exception
    //   408	458	812	java/lang/Exception
    //   235	242	819	java/lang/Exception
    //   251	263	819	java/lang/Exception
    //   278	287	819	java/lang/Exception
    //   470	474	819	java/lang/Exception
    //   483	487	819	java/lang/Exception
    //   100	105	824	java/io/IOException
    //   105	197	833	java/io/IOException
    //   197	219	833	java/io/IOException
    //   219	226	833	java/io/IOException
    //   408	458	833	java/io/IOException
    //   235	242	840	java/io/IOException
    //   251	263	840	java/io/IOException
    //   278	287	840	java/io/IOException
    //   470	474	840	java/io/IOException
    //   483	487	840	java/io/IOException
    //   353	357	845	java/lang/Exception
    //   361	365	845	java/lang/Exception
    //   369	373	845	java/lang/Exception
    //   89	100	849	java/io/FileNotFoundException
    //   100	105	860	java/io/FileNotFoundException
    //   105	197	869	java/io/FileNotFoundException
    //   197	219	869	java/io/FileNotFoundException
    //   219	226	869	java/io/FileNotFoundException
    //   408	458	869	java/io/FileNotFoundException
    //   491	495	876	java/lang/Exception
    //   499	503	876	java/lang/Exception
    //   507	511	876	java/lang/Exception
  }

  private void a(Bundle paramBundle, ShareImgUI.b paramb)
  {
    AppMethodBeat.i(34950);
    com.tencent.mm.sdk.g.d.post(new ShareImgUI.4(this, paramBundle, paramb, System.currentTimeMillis()), "getMultiSendFilePathList");
    AppMethodBeat.o(34950);
  }

  private boolean aY(Intent paramIntent)
  {
    boolean bool = false;
    AppMethodBeat.i(34951);
    if (paramIntent == null)
    {
      ab.e("MicroMsg.ShareImgUI", "intent is null");
      AppMethodBeat.o(34951);
    }
    String str;
    while (true)
    {
      return bool;
      str = w.n(paramIntent, "android.intent.extra.TEXT");
      paramIntent = w.n(paramIntent, "android.intent.extra.SUBJECT");
      if ((str != null) && (str.length() != 0))
        break;
      ab.i("MicroMsg.ShareImgUI", "text is null");
      AppMethodBeat.o(34951);
    }
    Object localObject1 = new WXMediaMessage(new WXTextObject(str));
    ((WXMediaMessage)localObject1).description = str;
    Object localObject2 = new SendMessageToWX.Req();
    ((SendMessageToWX.Req)localObject2).transaction = null;
    ((SendMessageToWX.Req)localObject2).message = ((WXMediaMessage)localObject1);
    localObject1 = new Bundle();
    ((SendMessageToWX.Req)localObject2).toBundle((Bundle)localObject1);
    ((Bundle)localObject1).putInt("_mmessage_sdkVersion", 620954368);
    ((Bundle)localObject1).putString("_mmessage_appPackage", "com.tencent.mm.openapi");
    ((Bundle)localObject1).putString("SendAppMessageWrapper_AppId", "wx4310bbd51be7d979");
    localObject2 = new Intent();
    ((Intent)localObject2).setClass(this, SelectConversationUI.class);
    ((Intent)localObject2).putExtra("Select_Conv_NextStep", new Intent(this, SendAppMessageWrapperUI.class).putExtras((Bundle)localObject1).putExtra("animation_pop_in", true));
    if ((aw.ZM()) && (!aw.QT()))
    {
      aw.Rg().a(837, this);
      localObject1 = new ArrayList();
      ((ArrayList)localObject1).add(paramIntent + "|" + str);
      paramIntent = new com.tencent.mm.modelsimple.d(5, (List)localObject1, dyh());
      com.tencent.mm.kernel.g.Rg().a(paramIntent, 0);
      showDialog();
      this.zHq = ((Intent)localObject2);
    }
    while (true)
    {
      AppMethodBeat.o(34951);
      bool = true;
      break;
      ab.w("MicroMsg.ShareImgUI", "not logged in, jump to simple login");
      MMWizardActivity.b(this, new Intent(this, SimpleLoginUI.class), getIntent().addFlags(67108864));
    }
  }

  private void asS()
  {
    AppMethodBeat.i(34948);
    if (this.intent == null)
    {
      ab.e("MicroMsg.ShareImgUI", "launch : fail, intent is null");
      PI(0);
      finish();
      AppMethodBeat.o(34948);
    }
    while (true)
    {
      return;
      String str = this.intent.getAction();
      Bundle localBundle = this.intent.getExtras();
      if (bo.isNullOrNil(str))
      {
        ab.e("MicroMsg.ShareImgUI", "launch : fail, action is null");
        PI(0);
        finish();
        AppMethodBeat.o(34948);
      }
      else if (localBundle != null)
      {
        Parcelable localParcelable = localBundle.getParcelable("android.intent.extra.STREAM");
        if ((localParcelable != null) && ((localParcelable instanceof Uri)))
        {
          this.uri = ((Uri)localParcelable);
          if (!bo.v(this.uri))
          {
            ab.e("MicroMsg.ShareImgUI", "launch : fail, not accepted: %s", new Object[] { this.uri });
            PI(0);
            finish();
            AppMethodBeat.o(34948);
          }
        }
      }
      else
      {
        showDialog();
        if (str.equals("android.intent.action.SEND"))
        {
          ab.i("MicroMsg.ShareImgUI", "send signal: ".concat(String.valueOf(str)));
          if (this.uri == null)
          {
            boolean bool = aY(getIntent());
            ab.i("MicroMsg.ShareImgUI", "dealWithText: %b", new Object[] { Boolean.valueOf(bool) });
            if (!bool)
            {
              PI(0);
              finish();
            }
            AppMethodBeat.o(34948);
          }
          else
          {
            com.tencent.mm.sdk.g.d.post(new ShareImgUI.a(this, this.uri, new ShareImgUI.c()
            {
              public final void dJx()
              {
                AppMethodBeat.i(34935);
                ShareImgUI.a(ShareImgUI.this).sendEmptyMessage(0);
                AppMethodBeat.o(34935);
              }
            }), "ShareImgUI_getFilePath");
            AppMethodBeat.o(34948);
          }
        }
        else if ((str.equals("android.intent.action.SEND_MULTIPLE")) && (localBundle != null) && (localBundle.containsKey("android.intent.extra.STREAM")))
        {
          ab.i("MicroMsg.ShareImgUI", "send multi: ".concat(String.valueOf(str)));
          a(localBundle, new ShareImgUI.2(this));
          AppMethodBeat.o(34948);
        }
        else
        {
          ab.e("MicroMsg.ShareImgUI", "launch : fail, uri is null");
          PI(0);
          finish();
          AppMethodBeat.o(34948);
        }
      }
    }
  }

  private static int asc(String paramString)
  {
    AppMethodBeat.i(34953);
    int i;
    if ((paramString == null) || (paramString.length() == 0))
    {
      ab.e("MicroMsg.ShareImgUI", "map : mimeType is null");
      i = -1;
      AppMethodBeat.o(34953);
    }
    while (true)
    {
      return i;
      paramString = paramString.toLowerCase();
      if (paramString.equalsIgnoreCase("image/gif"))
      {
        i = 5;
        AppMethodBeat.o(34953);
      }
      else if (paramString.contains("image"))
      {
        i = 0;
        AppMethodBeat.o(34953);
      }
      else if (paramString.contains("video"))
      {
        i = 1;
        AppMethodBeat.o(34953);
      }
      else
      {
        ab.d("MicroMsg.ShareImgUI", "map : unknown mimetype, send as file");
        i = 3;
        AppMethodBeat.o(34953);
      }
    }
  }

  private boolean dJU()
  {
    boolean bool = false;
    AppMethodBeat.i(34949);
    Intent localIntent = new Intent(this, ShareImgUI.class);
    if ("android.intent.action.SEND".equals(getIntent().getAction()))
      if (!bo.isNullOrNil(this.filePath))
      {
        localIntent.putExtra("android.intent.extra.STREAM", com.tencent.mm.vfs.e.asY(this.filePath));
        localIntent.setAction("android.intent.action.SEND");
        localIntent.setType(getIntent().getType());
        localIntent.addFlags(67108864);
        MMWizardActivity.b(this, new Intent(this, SimpleLoginUI.class).addFlags(32768).addFlags(268435456), localIntent);
        bool = true;
        AppMethodBeat.o(34949);
      }
    while (true)
    {
      return bool;
      AppMethodBeat.o(34949);
      continue;
      if ("android.intent.action.SEND_MULTIPLE".equals(getIntent().getAction()))
      {
        if (!bo.ek(this.zAu))
        {
          ArrayList localArrayList = new ArrayList(this.zAu.size());
          Iterator localIterator = this.zAu.iterator();
          while (localIterator.hasNext())
            localArrayList.add(com.tencent.mm.vfs.e.asY((String)localIterator.next()));
          localIntent.putParcelableArrayListExtra("android.intent.extra.STREAM", localArrayList);
          localIntent.setAction("android.intent.action.SEND_MULTIPLE");
          localIntent.setType(getIntent().getType());
          break;
        }
        AppMethodBeat.o(34949);
        continue;
      }
      AppMethodBeat.o(34949);
    }
  }

  private void dJV()
  {
    AppMethodBeat.i(34955);
    Toast.makeText(this, 2131299043, 1).show();
    finish();
    AppMethodBeat.o(34955);
  }

  private void dismissDialog()
  {
    AppMethodBeat.i(34957);
    if ((this.ehJ != null) && (this.ehJ.isShowing()))
      this.ehJ.dismiss();
    AppMethodBeat.o(34957);
  }

  private void showDialog()
  {
    AppMethodBeat.i(34956);
    getString(2131297061);
    this.ehJ = h.b(this, getString(2131297086), true, new ShareImgUI.6(this));
    AppMethodBeat.o(34956);
  }

  public final boolean O(Intent paramIntent)
  {
    return true;
  }

  public final void a(AutoLoginActivity.a parama, Intent paramIntent)
  {
    AppMethodBeat.i(34946);
    switch (ShareImgUI.7.jDI[parama.ordinal()])
    {
    default:
      finish();
      com.tencent.mm.ui.base.b.hM(this);
      AppMethodBeat.o(34946);
    case 1:
    }
    while (true)
    {
      return;
      this.intent = paramIntent;
      int i = bo.getInt(com.tencent.mm.m.g.Nu().getValue("SystemShareControlBitset"), 0);
      ab.i("MicroMsg.ShareImgUI", "now permission = %d", new Object[] { Integer.valueOf(i) });
      if ((i & 0x1) > 0)
      {
        ab.e("MicroMsg.ShareImgUI", "now allowed to share to friend");
        finish();
        AppMethodBeat.o(34946);
      }
      else
      {
        parama = w.n(paramIntent, "android.intent.extra.TEXT");
        ab.i("MicroMsg.ShareImgUI", "postLogin, text = %s", new Object[] { parama });
        if (!bo.isNullOrNil(parama))
        {
          parama = String.format("weixin://dl/business/systemshare/?txt=%s", new Object[] { URLEncoder.encode(parama) });
          showDialog();
          aw.Rg().a(1200, this);
          parama = new z(parama, 15, null);
          aw.Rg().a(parama, 0);
          AppMethodBeat.o(34946);
        }
        else
        {
          asS();
          AppMethodBeat.o(34946);
        }
      }
    }
  }

  public final boolean bVD()
  {
    AppMethodBeat.i(34945);
    boolean bool;
    if ((!aw.ZM()) || (aw.QT()))
    {
      ab.w("MicroMsg.ShareImgUI", "not login");
      this.intent = getIntent();
      asS();
      bool = true;
      AppMethodBeat.o(34945);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(34945);
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(34947);
    aw.Rg().b(1200, this);
    aw.Rg().b(837, this);
    dismissDialog();
    super.onDestroy();
    AppMethodBeat.o(34947);
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(34958);
    ab.i("MicroMsg.ShareImgUI", "onSceneEnd, errType = %d, errCode = %d, errMsg = %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    dismissDialog();
    if ((paramm instanceof z))
    {
      if ((paramInt1 == 0) && (paramInt2 == 0))
        asS();
    }
    else if ((paramm instanceof com.tencent.mm.modelsimple.d))
    {
      if ((paramInt1 == 0) && (paramInt2 == 0))
        break label198;
      if (paramm.ftl != null)
      {
        paramString = (rt)((com.tencent.mm.ai.b)paramm.ftl).fsH.fsP;
        if ((paramString == null) || (bo.isNullOrNil(paramString.vZf)))
          break label198;
        paramm = new Intent();
        paramm.putExtra("rawUrl", paramString.vZf);
        paramm.putExtra("showShare", false);
        paramm.putExtra("show_bottom", false);
        paramm.putExtra("needRedirect", false);
        com.tencent.mm.bp.d.b(this, "webview", ".ui.tools.WebViewUI", paramm);
      }
    }
    while (true)
    {
      finish();
      AppMethodBeat.o(34958);
      return;
      finish();
      break;
      label198: startActivity(this.zHq);
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.ShareImgUI
 * JD-Core Version:    0.6.2
 */