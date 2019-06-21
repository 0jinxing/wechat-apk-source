package com.tencent.mm.ui.tools;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Message;
import android.os.Parcelable;
import android.widget.Toast;
import com.jg.JgClassChecked;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.booter.NotifyReceiver;
import com.tencent.mm.g.a.cl;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.aw;
import com.tencent.mm.opensdk.modelmsg.SendMessageToWX.Req;
import com.tencent.mm.opensdk.modelmsg.WXFileObject;
import com.tencent.mm.opensdk.modelmsg.WXImageObject;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject;
import com.tencent.mm.opensdk.modelmsg.WXTextObject;
import com.tencent.mm.opensdk.modelmsg.WXVideoFileObject;
import com.tencent.mm.plugin.account.ui.SimpleLoginUI;
import com.tencent.mm.protocal.protobuf.aar;
import com.tencent.mm.protocal.protobuf.abf;
import com.tencent.mm.protocal.protobuf.abl;
import com.tencent.mm.protocal.protobuf.rt;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.ui.base.h;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@com.tencent.mm.ui.base.a(3)
@JgClassChecked(author=12, fComment="checked", lastDate="20141010", reviewer=20, vComment={com.jg.EType.ACTIVITYCHECK})
public class AddFavoriteUI extends MMActivity
  implements f
{
  private ProgressDialog ehJ;
  String filePath;
  private ak handler;
  private Intent intent;
  Uri uri;
  private cl zAt;
  ArrayList<String> zAu;
  private ak zAv;
  private ak zAw;

  public AddFavoriteUI()
  {
    AppMethodBeat.i(34759);
    this.ehJ = null;
    this.intent = null;
    this.filePath = null;
    this.uri = null;
    this.zAu = null;
    this.zAv = new ak()
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        AppMethodBeat.i(34752);
        AddFavoriteUI.d(AddFavoriteUI.this);
        ab.i("MicroMsg.AddFavoriteUI", "dealWithText: %b", new Object[] { Boolean.valueOf(AddFavoriteUI.e(AddFavoriteUI.this)) });
        AppMethodBeat.o(34752);
      }
    };
    this.zAw = new AddFavoriteUI.11(this);
    this.handler = new ak()
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        AppMethodBeat.i(34754);
        AddFavoriteUI.d(AddFavoriteUI.this);
        if ((bo.isNullOrNil(AddFavoriteUI.this.filePath)) || ((bo.anx(AddFavoriteUI.this.filePath)) && (!AddFavoriteUI.asd(AddFavoriteUI.this.filePath))))
        {
          ab.e("MicroMsg.AddFavoriteUI", "launch : fail, filePath is null or file is not a valid img.");
          AddFavoriteUI.g(AddFavoriteUI.this);
          AddFavoriteUI.this.finish();
          AppMethodBeat.o(34754);
        }
        while (true)
        {
          return;
          AddFavoriteUI.h(AddFavoriteUI.this);
          AppMethodBeat.o(34754);
        }
      }
    };
    AppMethodBeat.o(34759);
  }

  private void PI(int paramInt)
  {
    AppMethodBeat.i(34773);
    switch (paramInt)
    {
    default:
      Toast.makeText(this, 2131303506, 1).show();
      AppMethodBeat.o(34773);
    case 1:
    }
    while (true)
    {
      return;
      Toast.makeText(this, 2131303503, 1).show();
      AppMethodBeat.o(34773);
    }
  }

  // ERROR //
  private String a(Uri paramUri, android.database.Cursor paramCursor)
  {
    // Byte code:
    //   0: ldc 107
    //   2: invokestatic 57	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aload_1
    //   6: ifnull +478 -> 484
    //   9: ldc 109
    //   11: astore_3
    //   12: aload_2
    //   13: ldc 111
    //   15: invokeinterface 117 2 0
    //   20: istore 4
    //   22: iload 4
    //   24: iconst_m1
    //   25: if_icmpeq +51 -> 76
    //   28: aload_2
    //   29: iload 4
    //   31: invokeinterface 121 2 0
    //   36: astore 5
    //   38: aload 5
    //   40: astore 6
    //   42: aload 5
    //   44: ifnull +14 -> 58
    //   47: aload 5
    //   49: ldc 123
    //   51: ldc 125
    //   53: invokevirtual 131	java/lang/String:replaceAll	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   56: astore 6
    //   58: ldc 133
    //   60: ldc 135
    //   62: aload 6
    //   64: invokestatic 139	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   67: invokevirtual 143	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   70: invokestatic 148	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   73: aload 6
    //   75: astore_3
    //   76: aload_2
    //   77: invokeinterface 151 1 0
    //   82: aload_0
    //   83: invokevirtual 155	com/tencent/mm/ui/tools/AddFavoriteUI:getContentResolver	()Landroid/content/ContentResolver;
    //   86: aload_1
    //   87: ldc 157
    //   89: invokevirtual 163	android/content/ContentResolver:openAssetFileDescriptor	(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/res/AssetFileDescriptor;
    //   92: astore_1
    //   93: aload_1
    //   94: invokevirtual 169	android/content/res/AssetFileDescriptor:createInputStream	()Ljava/io/FileInputStream;
    //   97: astore_2
    //   98: aload_1
    //   99: invokevirtual 173	android/content/res/AssetFileDescriptor:getDeclaredLength	()J
    //   102: l2i
    //   103: newarray byte
    //   105: astore 7
    //   107: aload_2
    //   108: aload 7
    //   110: invokevirtual 179	java/io/FileInputStream:read	([B)I
    //   113: ifle +355 -> 468
    //   116: invokestatic 185	com/tencent/mm/model/aw:ZK	()Lcom/tencent/mm/model/c;
    //   119: pop
    //   120: invokestatic 191	com/tencent/mm/model/c:isSDCardAvailable	()Z
    //   123: ifne +171 -> 294
    //   126: aload_0
    //   127: aload_3
    //   128: invokevirtual 195	com/tencent/mm/ui/tools/AddFavoriteUI:deleteFile	(Ljava/lang/String;)Z
    //   131: pop
    //   132: aload_0
    //   133: aload_3
    //   134: iconst_0
    //   135: invokevirtual 199	com/tencent/mm/ui/tools/AddFavoriteUI:openFileOutput	(Ljava/lang/String;I)Ljava/io/FileOutputStream;
    //   138: astore 8
    //   140: aload 8
    //   142: astore 9
    //   144: aload_2
    //   145: astore 5
    //   147: aload_1
    //   148: astore 6
    //   150: aload 8
    //   152: aload 7
    //   154: invokevirtual 205	java/io/FileOutputStream:write	([B)V
    //   157: aload 8
    //   159: astore 9
    //   161: aload_2
    //   162: astore 5
    //   164: aload_1
    //   165: astore 6
    //   167: aload 8
    //   169: invokevirtual 208	java/io/FileOutputStream:flush	()V
    //   172: aload 8
    //   174: astore 9
    //   176: aload_2
    //   177: astore 5
    //   179: aload_1
    //   180: astore 6
    //   182: new 210	java/lang/StringBuilder
    //   185: astore 7
    //   187: aload 8
    //   189: astore 9
    //   191: aload_2
    //   192: astore 5
    //   194: aload_1
    //   195: astore 6
    //   197: aload 7
    //   199: invokespecial 211	java/lang/StringBuilder:<init>	()V
    //   202: aload 8
    //   204: astore 9
    //   206: aload_2
    //   207: astore 5
    //   209: aload_1
    //   210: astore 6
    //   212: aload 7
    //   214: aload_0
    //   215: invokevirtual 215	com/tencent/mm/ui/tools/AddFavoriteUI:getFilesDir	()Ljava/io/File;
    //   218: invokevirtual 221	java/io/File:getPath	()Ljava/lang/String;
    //   221: invokevirtual 225	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   224: ldc 227
    //   226: invokevirtual 225	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   229: aload_3
    //   230: invokevirtual 225	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   233: invokevirtual 230	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   236: astore_3
    //   237: aload_3
    //   238: astore 6
    //   240: aload_2
    //   241: ifnull +7 -> 248
    //   244: aload_2
    //   245: invokevirtual 231	java/io/FileInputStream:close	()V
    //   248: aload_1
    //   249: ifnull +7 -> 256
    //   252: aload_1
    //   253: invokevirtual 232	android/content/res/AssetFileDescriptor:close	()V
    //   256: aload 8
    //   258: ifnull +8 -> 266
    //   261: aload 8
    //   263: invokevirtual 233	java/io/FileOutputStream:close	()V
    //   266: ldc 107
    //   268: invokestatic 83	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   271: aload 6
    //   273: astore_1
    //   274: aload_1
    //   275: areturn
    //   276: astore_1
    //   277: ldc 133
    //   279: aload_1
    //   280: aload_1
    //   281: invokevirtual 236	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   284: iconst_0
    //   285: anewarray 238	java/lang/Object
    //   288: invokestatic 242	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   291: goto -25 -> 266
    //   294: new 210	java/lang/StringBuilder
    //   297: astore 6
    //   299: aload 6
    //   301: invokespecial 211	java/lang/StringBuilder:<init>	()V
    //   304: aload 6
    //   306: getstatic 247	com/tencent/mm/compatible/util/e:eSn	Ljava/lang/String;
    //   309: invokevirtual 225	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   312: ldc 249
    //   314: invokevirtual 225	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   317: invokevirtual 230	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   320: astore 5
    //   322: new 210	java/lang/StringBuilder
    //   325: astore 6
    //   327: aload 6
    //   329: invokespecial 211	java/lang/StringBuilder:<init>	()V
    //   332: aload 6
    //   334: getstatic 247	com/tencent/mm/compatible/util/e:eSn	Ljava/lang/String;
    //   337: invokevirtual 225	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   340: ldc 251
    //   342: invokevirtual 225	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   345: aload_3
    //   346: invokevirtual 225	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   349: invokevirtual 230	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   352: astore 6
    //   354: new 217	java/io/File
    //   357: astore 9
    //   359: aload 9
    //   361: aload 5
    //   363: invokespecial 254	java/io/File:<init>	(Ljava/lang/String;)V
    //   366: aload 9
    //   368: invokevirtual 257	java/io/File:exists	()Z
    //   371: ifne +9 -> 380
    //   374: aload 9
    //   376: invokevirtual 260	java/io/File:mkdir	()Z
    //   379: pop
    //   380: new 217	java/io/File
    //   383: astore 5
    //   385: aload 5
    //   387: aload 6
    //   389: invokespecial 254	java/io/File:<init>	(Ljava/lang/String;)V
    //   392: aload 5
    //   394: invokevirtual 257	java/io/File:exists	()Z
    //   397: ifne +9 -> 406
    //   400: aload 5
    //   402: invokevirtual 263	java/io/File:createNewFile	()Z
    //   405: pop
    //   406: aload 6
    //   408: aload 7
    //   410: aload 7
    //   412: arraylength
    //   413: invokestatic 269	com/tencent/mm/vfs/e:b	(Ljava/lang/String;[BI)I
    //   416: istore 4
    //   418: iload 4
    //   420: ifne +48 -> 468
    //   423: aload_2
    //   424: ifnull +7 -> 431
    //   427: aload_2
    //   428: invokevirtual 231	java/io/FileInputStream:close	()V
    //   431: aload_1
    //   432: ifnull +7 -> 439
    //   435: aload_1
    //   436: invokevirtual 232	android/content/res/AssetFileDescriptor:close	()V
    //   439: ldc 107
    //   441: invokestatic 83	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   444: aload 6
    //   446: astore_1
    //   447: goto -173 -> 274
    //   450: astore_1
    //   451: ldc 133
    //   453: aload_1
    //   454: aload_1
    //   455: invokevirtual 236	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   458: iconst_0
    //   459: anewarray 238	java/lang/Object
    //   462: invokestatic 242	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   465: goto -26 -> 439
    //   468: aload_2
    //   469: ifnull +7 -> 476
    //   472: aload_2
    //   473: invokevirtual 231	java/io/FileInputStream:close	()V
    //   476: aload_1
    //   477: ifnull +7 -> 484
    //   480: aload_1
    //   481: invokevirtual 232	android/content/res/AssetFileDescriptor:close	()V
    //   484: ldc 107
    //   486: invokestatic 83	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   489: aconst_null
    //   490: astore_1
    //   491: goto -217 -> 274
    //   494: astore_1
    //   495: ldc 133
    //   497: aload_1
    //   498: aload_1
    //   499: invokevirtual 236	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   502: iconst_0
    //   503: anewarray 238	java/lang/Object
    //   506: invokestatic 242	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   509: goto -25 -> 484
    //   512: astore_3
    //   513: aconst_null
    //   514: astore 8
    //   516: aconst_null
    //   517: astore_2
    //   518: aconst_null
    //   519: astore_1
    //   520: aload 8
    //   522: astore 9
    //   524: aload_2
    //   525: astore 5
    //   527: aload_1
    //   528: astore 6
    //   530: new 210	java/lang/StringBuilder
    //   533: astore 7
    //   535: aload 8
    //   537: astore 9
    //   539: aload_2
    //   540: astore 5
    //   542: aload_1
    //   543: astore 6
    //   545: aload 7
    //   547: ldc_w 271
    //   550: invokespecial 272	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   553: aload 8
    //   555: astore 9
    //   557: aload_2
    //   558: astore 5
    //   560: aload_1
    //   561: astore 6
    //   563: ldc 133
    //   565: aload 7
    //   567: aload_3
    //   568: invokevirtual 273	java/io/FileNotFoundException:getMessage	()Ljava/lang/String;
    //   571: invokevirtual 225	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   574: invokevirtual 230	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   577: invokestatic 276	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   580: aload_2
    //   581: ifnull +7 -> 588
    //   584: aload_2
    //   585: invokevirtual 231	java/io/FileInputStream:close	()V
    //   588: aload_1
    //   589: ifnull +7 -> 596
    //   592: aload_1
    //   593: invokevirtual 232	android/content/res/AssetFileDescriptor:close	()V
    //   596: aload 8
    //   598: ifnull -114 -> 484
    //   601: aload 8
    //   603: invokevirtual 233	java/io/FileOutputStream:close	()V
    //   606: goto -122 -> 484
    //   609: astore_1
    //   610: ldc 133
    //   612: aload_1
    //   613: aload_1
    //   614: invokevirtual 236	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   617: iconst_0
    //   618: anewarray 238	java/lang/Object
    //   621: invokestatic 242	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   624: goto -140 -> 484
    //   627: astore_3
    //   628: aconst_null
    //   629: astore 8
    //   631: aconst_null
    //   632: astore_2
    //   633: aconst_null
    //   634: astore_1
    //   635: aload 8
    //   637: astore 9
    //   639: aload_2
    //   640: astore 5
    //   642: aload_1
    //   643: astore 6
    //   645: new 210	java/lang/StringBuilder
    //   648: astore 7
    //   650: aload 8
    //   652: astore 9
    //   654: aload_2
    //   655: astore 5
    //   657: aload_1
    //   658: astore 6
    //   660: aload 7
    //   662: ldc_w 278
    //   665: invokespecial 272	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   668: aload 8
    //   670: astore 9
    //   672: aload_2
    //   673: astore 5
    //   675: aload_1
    //   676: astore 6
    //   678: ldc 133
    //   680: aload 7
    //   682: aload_3
    //   683: invokevirtual 279	java/io/IOException:getMessage	()Ljava/lang/String;
    //   686: invokevirtual 225	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   689: invokevirtual 230	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   692: invokestatic 276	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   695: aload_2
    //   696: ifnull +7 -> 703
    //   699: aload_2
    //   700: invokevirtual 231	java/io/FileInputStream:close	()V
    //   703: aload_1
    //   704: ifnull +7 -> 711
    //   707: aload_1
    //   708: invokevirtual 232	android/content/res/AssetFileDescriptor:close	()V
    //   711: aload 8
    //   713: ifnull -229 -> 484
    //   716: aload 8
    //   718: invokevirtual 233	java/io/FileOutputStream:close	()V
    //   721: goto -237 -> 484
    //   724: astore_1
    //   725: ldc 133
    //   727: aload_1
    //   728: aload_1
    //   729: invokevirtual 236	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   732: iconst_0
    //   733: anewarray 238	java/lang/Object
    //   736: invokestatic 242	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   739: goto -255 -> 484
    //   742: astore_3
    //   743: aconst_null
    //   744: astore 8
    //   746: aconst_null
    //   747: astore_2
    //   748: aconst_null
    //   749: astore_1
    //   750: aload 8
    //   752: astore 9
    //   754: aload_2
    //   755: astore 5
    //   757: aload_1
    //   758: astore 6
    //   760: new 210	java/lang/StringBuilder
    //   763: astore 7
    //   765: aload 8
    //   767: astore 9
    //   769: aload_2
    //   770: astore 5
    //   772: aload_1
    //   773: astore 6
    //   775: aload 7
    //   777: ldc_w 281
    //   780: invokespecial 272	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   783: aload 8
    //   785: astore 9
    //   787: aload_2
    //   788: astore 5
    //   790: aload_1
    //   791: astore 6
    //   793: ldc 133
    //   795: aload 7
    //   797: aload_3
    //   798: invokevirtual 236	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   801: invokevirtual 225	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   804: invokevirtual 230	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   807: invokestatic 276	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   810: aload_2
    //   811: ifnull +7 -> 818
    //   814: aload_2
    //   815: invokevirtual 231	java/io/FileInputStream:close	()V
    //   818: aload_1
    //   819: ifnull +7 -> 826
    //   822: aload_1
    //   823: invokevirtual 232	android/content/res/AssetFileDescriptor:close	()V
    //   826: aload 8
    //   828: ifnull -344 -> 484
    //   831: aload 8
    //   833: invokevirtual 233	java/io/FileOutputStream:close	()V
    //   836: goto -352 -> 484
    //   839: astore_1
    //   840: ldc 133
    //   842: aload_1
    //   843: aload_1
    //   844: invokevirtual 236	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   847: iconst_0
    //   848: anewarray 238	java/lang/Object
    //   851: invokestatic 242	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   854: goto -370 -> 484
    //   857: astore 8
    //   859: aconst_null
    //   860: astore 9
    //   862: aconst_null
    //   863: astore_2
    //   864: aconst_null
    //   865: astore_1
    //   866: aload_2
    //   867: ifnull +7 -> 874
    //   870: aload_2
    //   871: invokevirtual 231	java/io/FileInputStream:close	()V
    //   874: aload_1
    //   875: ifnull +7 -> 882
    //   878: aload_1
    //   879: invokevirtual 232	android/content/res/AssetFileDescriptor:close	()V
    //   882: aload 9
    //   884: ifnull +8 -> 892
    //   887: aload 9
    //   889: invokevirtual 233	java/io/FileOutputStream:close	()V
    //   892: ldc 107
    //   894: invokestatic 83	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   897: aload 8
    //   899: athrow
    //   900: astore_1
    //   901: ldc 133
    //   903: aload_1
    //   904: aload_1
    //   905: invokevirtual 236	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   908: iconst_0
    //   909: anewarray 238	java/lang/Object
    //   912: invokestatic 242	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   915: goto -23 -> 892
    //   918: astore 8
    //   920: aconst_null
    //   921: astore 9
    //   923: aconst_null
    //   924: astore_2
    //   925: goto -59 -> 866
    //   928: astore 8
    //   930: aconst_null
    //   931: astore 9
    //   933: goto -67 -> 866
    //   936: astore 8
    //   938: aload 5
    //   940: astore_2
    //   941: aload 6
    //   943: astore_1
    //   944: goto -78 -> 866
    //   947: astore_3
    //   948: aconst_null
    //   949: astore 8
    //   951: aconst_null
    //   952: astore_2
    //   953: goto -203 -> 750
    //   956: astore_3
    //   957: aconst_null
    //   958: astore 8
    //   960: goto -210 -> 750
    //   963: astore_3
    //   964: goto -214 -> 750
    //   967: astore_3
    //   968: aconst_null
    //   969: astore 8
    //   971: aconst_null
    //   972: astore_2
    //   973: goto -338 -> 635
    //   976: astore_3
    //   977: aconst_null
    //   978: astore 8
    //   980: goto -345 -> 635
    //   983: astore_3
    //   984: goto -349 -> 635
    //   987: astore_3
    //   988: aconst_null
    //   989: astore 8
    //   991: aconst_null
    //   992: astore_2
    //   993: goto -473 -> 520
    //   996: astore_3
    //   997: aconst_null
    //   998: astore 8
    //   1000: goto -480 -> 520
    //   1003: astore_3
    //   1004: goto -484 -> 520
    //
    // Exception table:
    //   from	to	target	type
    //   244	248	276	java/lang/Exception
    //   252	256	276	java/lang/Exception
    //   261	266	276	java/lang/Exception
    //   427	431	450	java/lang/Exception
    //   435	439	450	java/lang/Exception
    //   472	476	494	java/lang/Exception
    //   480	484	494	java/lang/Exception
    //   82	93	512	java/io/FileNotFoundException
    //   584	588	609	java/lang/Exception
    //   592	596	609	java/lang/Exception
    //   601	606	609	java/lang/Exception
    //   82	93	627	java/io/IOException
    //   699	703	724	java/lang/Exception
    //   707	711	724	java/lang/Exception
    //   716	721	724	java/lang/Exception
    //   82	93	742	java/lang/Exception
    //   814	818	839	java/lang/Exception
    //   822	826	839	java/lang/Exception
    //   831	836	839	java/lang/Exception
    //   82	93	857	finally
    //   870	874	900	java/lang/Exception
    //   878	882	900	java/lang/Exception
    //   887	892	900	java/lang/Exception
    //   93	98	918	finally
    //   98	140	928	finally
    //   294	380	928	finally
    //   380	406	928	finally
    //   406	418	928	finally
    //   150	157	936	finally
    //   167	172	936	finally
    //   182	187	936	finally
    //   197	202	936	finally
    //   212	237	936	finally
    //   530	535	936	finally
    //   545	553	936	finally
    //   563	580	936	finally
    //   645	650	936	finally
    //   660	668	936	finally
    //   678	695	936	finally
    //   760	765	936	finally
    //   775	783	936	finally
    //   793	810	936	finally
    //   93	98	947	java/lang/Exception
    //   98	140	956	java/lang/Exception
    //   294	380	956	java/lang/Exception
    //   380	406	956	java/lang/Exception
    //   406	418	956	java/lang/Exception
    //   150	157	963	java/lang/Exception
    //   167	172	963	java/lang/Exception
    //   182	187	963	java/lang/Exception
    //   197	202	963	java/lang/Exception
    //   212	237	963	java/lang/Exception
    //   93	98	967	java/io/IOException
    //   98	140	976	java/io/IOException
    //   294	380	976	java/io/IOException
    //   380	406	976	java/io/IOException
    //   406	418	976	java/io/IOException
    //   150	157	983	java/io/IOException
    //   167	172	983	java/io/IOException
    //   182	187	983	java/io/IOException
    //   197	202	983	java/io/IOException
    //   212	237	983	java/io/IOException
    //   93	98	987	java/io/FileNotFoundException
    //   98	140	996	java/io/FileNotFoundException
    //   294	380	996	java/io/FileNotFoundException
    //   380	406	996	java/io/FileNotFoundException
    //   406	418	996	java/io/FileNotFoundException
    //   150	157	1003	java/io/FileNotFoundException
    //   167	172	1003	java/io/FileNotFoundException
    //   182	187	1003	java/io/FileNotFoundException
    //   197	202	1003	java/io/FileNotFoundException
    //   212	237	1003	java/io/FileNotFoundException
  }

  private ArrayList<String> aB(Bundle paramBundle)
  {
    AppMethodBeat.i(34767);
    Object localObject1 = paramBundle.getParcelableArrayList("android.intent.extra.STREAM");
    Object localObject2;
    label84: int i;
    if ((localObject1 != null) && (((ArrayList)localObject1).size() > 0))
    {
      paramBundle = new ArrayList();
      localObject1 = ((ArrayList)localObject1).iterator();
      if (((Iterator)localObject1).hasNext())
      {
        localObject2 = (Parcelable)((Iterator)localObject1).next();
        if ((localObject2 == null) || (!(localObject2 instanceof Uri)))
        {
          ab.e("MicroMsg.AddFavoriteUI", "getMultiSendFilePath failed, error parcelable, %s", new Object[] { localObject2 });
          i = 0;
          label87: if (i != 0)
            break label173;
          AppMethodBeat.o(34767);
          paramBundle = null;
        }
      }
    }
    while (true)
    {
      return paramBundle;
      localObject2 = (Uri)localObject2;
      if ((bo.v((Uri)localObject2)) && (((Uri)localObject2).getScheme() != null))
      {
        localObject2 = bo.h(this, (Uri)localObject2);
        if (bo.isNullOrNil((String)localObject2))
          break label84;
        if ((bo.anx((String)localObject2)) && (com.tencent.mm.sdk.platformtools.r.amn((String)localObject2)))
        {
          ab.i("MicroMsg.AddFavoriteUI", "multisend file path: ".concat(String.valueOf(localObject2)));
          paramBundle.add(localObject2);
          i = 1;
          break label87;
          label173: break;
        }
        ab.w("MicroMsg.AddFavoriteUI", "multisend tries to send illegal img: ".concat(String.valueOf(localObject2)));
        break label84;
      }
      ab.e("MicroMsg.AddFavoriteUI", "unaccepted uri: ".concat(String.valueOf(localObject2)));
      break label84;
      if (paramBundle.size() > 0)
      {
        AppMethodBeat.o(34767);
      }
      else
      {
        AppMethodBeat.o(34767);
        paramBundle = null;
        continue;
        ab.e("MicroMsg.AddFavoriteUI", "getParcelableArrayList failed");
        AppMethodBeat.o(34767);
        paramBundle = null;
      }
    }
  }

  private static int asc(String paramString)
  {
    AppMethodBeat.i(34771);
    int i;
    if ((paramString == null) || (paramString.length() == 0))
    {
      ab.e("MicroMsg.AddFavoriteUI", "map : mimeType is null");
      i = -1;
      AppMethodBeat.o(34771);
    }
    while (true)
    {
      return i;
      paramString = paramString.toLowerCase();
      if ((paramString.contains("image")) || (paramString.equals("application/vnd.google.panorama360+jpg")))
      {
        i = 2;
        AppMethodBeat.o(34771);
      }
      else if (paramString.contains("video"))
      {
        i = 4;
        AppMethodBeat.o(34771);
      }
      else
      {
        ab.d("MicroMsg.AddFavoriteUI", "map : unknown mimetype, send as file");
        i = 8;
        AppMethodBeat.o(34771);
      }
    }
  }

  private void bO(int paramInt, String paramString)
  {
    AppMethodBeat.i(34769);
    if ((paramString == null) || (paramString.length() == 0))
    {
      ab.e("MicroMsg.AddFavoriteUI", "dealWithFile fail, filePath is empty");
      AppMethodBeat.o(34769);
    }
    while (true)
    {
      return;
      long l = com.tencent.mm.vfs.e.asZ(paramString);
      ab.i("MicroMsg.AddFavoriteUI", "filelength: [%d]", new Object[] { Long.valueOf(l) });
      if (l == 0L)
      {
        ab.e("MicroMsg.AddFavoriteUI", "dealWithFile fail, fileLength is 0");
        Toast.makeText(this, 2131299642, 1).show();
        finish();
        AppMethodBeat.o(34769);
      }
      else if (l > 26214400L)
      {
        ab.e("MicroMsg.AddFavoriteUI", "dealWithFile fail, fileLength is too large");
        Toast.makeText(this, 2131299756, 1).show();
        finish();
        AppMethodBeat.o(34769);
      }
      else
      {
        if ((aw.ZM()) && (!aw.QT()))
        {
          Object localObject1 = new ArrayList();
          ((ArrayList)localObject1).add(paramString);
          cl localcl = new cl();
          String str = com.tencent.mm.vfs.e.atd(paramString) + "." + com.tencent.mm.vfs.e.cv(paramString);
          Object localObject2;
          switch (paramInt)
          {
          case 3:
          default:
            localObject2 = new WXFileObject(paramString);
            localObject1 = new com.tencent.mm.modelsimple.d(4, (List)localObject1, dyh());
            com.tencent.mm.pluginsdk.model.e.a(localcl, paramString, str, "");
            label270: localObject2 = new WXMediaMessage((WXMediaMessage.IMediaObject)localObject2);
            ((WXMediaMessage)localObject2).title = new File(paramString).getName();
            if (bo.isNullOrNil(null))
            {
              ((WXMediaMessage)localObject2).description = bo.ga(l);
              label313: if (l >= 30720L)
                break label843;
              ((WXMediaMessage)localObject2).thumbData = com.tencent.mm.vfs.e.e(paramString, 0, -1);
            }
            break;
          case 2:
          case 4:
          }
          while (true)
          {
            paramString = new SendMessageToWX.Req();
            paramString.transaction = null;
            paramString.message = ((WXMediaMessage)localObject2);
            localObject2 = new Bundle();
            paramString.toBundle((Bundle)localObject2);
            ((Bundle)localObject2).putInt("_mmessage_sdkVersion", 620954368);
            ((Bundle)localObject2).putString("_mmessage_appPackage", "com.tencent.mm.openapi");
            ((Bundle)localObject2).putString("SendAppMessageWrapper_AppId", "wx4310bbd51be7d979");
            localcl.cvA.activity = this;
            localcl.cvA.cvI = new AddFavoriteUI.5(this);
            localcl.cvA.cvJ = new AddFavoriteUI.6(this);
            this.zAt = localcl;
            g.Rg().a(837, this);
            g.Rg().a((m)localObject1, 0);
            showDialog();
            AppMethodBeat.o(34769);
            break;
            localObject2 = new WXImageObject();
            ((WXImageObject)localObject2).setImagePath(paramString);
            localObject1 = new com.tencent.mm.modelsimple.d(1, (List)localObject1, dyh());
            com.tencent.mm.pluginsdk.model.e.a(localcl, 13, paramString);
            break label270;
            localObject2 = new WXVideoFileObject(paramString);
            localObject1 = new com.tencent.mm.modelsimple.d(3, (List)localObject1, dyh());
            if (bo.isNullOrNil(paramString))
            {
              ab.w("MicroMsg.GetFavDataSource", "fill favorite event fail, event is null or image path is empty");
              localcl.cvA.cvG = 2131299622;
              break label270;
            }
            ab.d("MicroMsg.GetFavDataSource", "do fill event info(fav simple file), title %s, desc %s, path %s, sourceType %d", new Object[] { str, "", paramString, Integer.valueOf(13) });
            if (new com.tencent.mm.vfs.b(paramString).length() > com.tencent.mm.m.b.Nc())
            {
              localcl.cvA.cvG = 2131299756;
              break label270;
            }
            abf localabf = new abf();
            abl localabl = new abl();
            aar localaar = new aar();
            localaar.akV(paramString);
            localaar.LE(4);
            localaar.akR(com.tencent.mm.vfs.e.cv(paramString));
            localaar.akW(null);
            localaar.LD(0);
            localaar.akH(str);
            localaar.akI("");
            localabl.alD(com.tencent.mm.model.r.Yz());
            localabl.alE(com.tencent.mm.model.r.Yz());
            localabl.LN(13);
            localabl.ml(bo.anU());
            localabf.a(localabl);
            localabf.wiv.add(localaar);
            localcl.cvA.title = localaar.title;
            localcl.cvA.desc = localaar.title;
            localcl.cvA.cvC = localabf;
            localcl.cvA.type = 4;
            break label270;
            ((WXMediaMessage)localObject2).description = null;
            break label313;
            label843: ab.i("MicroMsg.AddFavoriteUI", "thumb data is exceed 30k, ignore");
          }
        }
        ab.w("MicroMsg.AddFavoriteUI", "not logged in, jump to simple login");
        finish();
        dJu();
        AppMethodBeat.o(34769);
      }
    }
  }

  private void dJu()
  {
    AppMethodBeat.i(34766);
    Intent localIntent = new Intent(this, AddFavoriteUI.class);
    localIntent.setAction("android.intent.action.SEND");
    if (bo.isNullOrNil(this.filePath));
    for (Object localObject = null; ; localObject = Uri.fromFile(new File(this.filePath)))
    {
      localIntent.putExtra("android.intent.extra.STREAM", (Parcelable)localObject);
      localIntent.addFlags(268435456).addFlags(32768);
      localIntent.setType(getIntent().getType());
      MMWizardActivity.b(this, new Intent(this, SimpleLoginUI.class).addFlags(32768).addFlags(268435456), localIntent);
      AppMethodBeat.o(34766);
      return;
    }
  }

  private boolean dJv()
  {
    boolean bool = false;
    AppMethodBeat.i(34768);
    this.intent = getIntent();
    if (this.intent == null)
    {
      ab.e("MicroMsg.AddFavoriteUI", "intent is null");
      AppMethodBeat.o(34768);
    }
    Object localObject1;
    while (true)
    {
      return bool;
      localObject1 = w.n(this.intent, "android.intent.extra.TEXT");
      if ((localObject1 != null) && (((String)localObject1).length() != 0))
        break;
      ab.i("MicroMsg.AddFavoriteUI", "text is null");
      AppMethodBeat.o(34768);
    }
    Object localObject2 = new WXMediaMessage(new WXTextObject((String)localObject1));
    ((WXMediaMessage)localObject2).description = ((String)localObject1);
    Object localObject3 = new SendMessageToWX.Req();
    ((SendMessageToWX.Req)localObject3).transaction = null;
    ((SendMessageToWX.Req)localObject3).message = ((WXMediaMessage)localObject2);
    int i = ((SendMessageToWX.Req)localObject3).message.getType();
    localObject2 = new Bundle();
    ((SendMessageToWX.Req)localObject3).toBundle((Bundle)localObject2);
    ((Bundle)localObject2).putInt("_mmessage_sdkVersion", 620954368);
    ((Bundle)localObject2).putString("_mmessage_appPackage", "com.tencent.mm.openapi");
    ((Bundle)localObject2).putString("SendAppMessageWrapper_AppId", "wx4310bbd51be7d979");
    if ((aw.ZM()) && (!aw.QT()))
    {
      localObject2 = new cl();
      localObject3 = com.tencent.mm.vfs.e.atd(this.filePath) + "." + com.tencent.mm.vfs.e.cv(this.filePath);
      if (i == 1)
      {
        com.tencent.mm.pluginsdk.model.e.b((cl)localObject2, (String)localObject1, 13);
        label246: ((cl)localObject2).cvA.activity = this;
        ((cl)localObject2).cvA.cvI = new AddFavoriteUI.3(this);
        ((cl)localObject2).cvA.cvJ = new AddFavoriteUI.4(this);
        this.zAt = ((cl)localObject2);
        localObject3 = new ArrayList();
        ((ArrayList)localObject3).add(localObject1);
        localObject1 = new com.tencent.mm.modelsimple.d(5, (List)localObject3, dyh());
        aw.Rg().a(837, this);
        g.Rg().a((m)localObject1, 0);
        showDialog();
      }
    }
    while (true)
    {
      AppMethodBeat.o(34768);
      bool = true;
      break;
      com.tencent.mm.pluginsdk.model.e.a((cl)localObject2, this.filePath, (String)localObject3, "");
      break label246;
      ab.w("MicroMsg.AddFavoriteUI", "not logged in, jump to simple login");
      MMWizardActivity.b(this, new Intent(this, SimpleLoginUI.class), getIntent().addFlags(67108864));
      finish();
    }
  }

  private void dJw()
  {
    AppMethodBeat.i(34772);
    PI(0);
    Toast.makeText(this, 2131303506, 1).show();
    AppMethodBeat.o(34772);
  }

  private void dismissDialog()
  {
    AppMethodBeat.i(34775);
    if ((this.ehJ != null) && (this.ehJ.isShowing()))
      this.ehJ.dismiss();
    AppMethodBeat.o(34775);
  }

  private void showDialog()
  {
    AppMethodBeat.i(34774);
    getString(2131297061);
    this.ehJ = h.b(this, getString(2131297086), true, new AddFavoriteUI.7(this));
    AppMethodBeat.o(34774);
  }

  public final int getLayoutId()
  {
    return -1;
  }

  public final void initView()
  {
    AppMethodBeat.i(34765);
    this.intent = getIntent();
    if (this.intent == null)
    {
      ab.e("MicroMsg.AddFavoriteUI", "launch : fail, intent is null");
      dJw();
      finish();
      AppMethodBeat.o(34765);
    }
    while (true)
    {
      return;
      String str = this.intent.getAction();
      Bundle localBundle = w.aM(this.intent);
      if (bo.isNullOrNil(str))
      {
        ab.e("MicroMsg.AddFavoriteUI", "launch : fail, action is null");
        dJw();
        finish();
        AppMethodBeat.o(34765);
      }
      else
      {
        Object localObject;
        if (localBundle != null)
        {
          localObject = localBundle.getParcelable("android.intent.extra.STREAM");
          if ((localObject instanceof Uri))
          {
            this.uri = ((Uri)localObject);
            if (!bo.v(this.uri))
            {
              ab.e("MicroMsg.AddFavoriteUI", "launch : fail, not accept, %s", new Object[] { this.uri });
              dJw();
              finish();
              AppMethodBeat.o(34765);
            }
          }
          else if (localObject != null)
          {
            ab.e("MicroMsg.AddFavoriteUI", "launch : fail, uri check fail, %s", new Object[] { localObject });
            dJw();
            finish();
            AppMethodBeat.o(34765);
          }
        }
        else if (str.equals("android.intent.action.SEND"))
        {
          ab.i("MicroMsg.AddFavoriteUI", "send signal: ".concat(String.valueOf(str)));
          if (this.uri == null)
          {
            showDialog();
            com.tencent.mm.sdk.g.d.post(new AddFavoriteUI.1(this), "AddFavoriteUI_dealWithTextHandler");
            AppMethodBeat.o(34765);
          }
          else
          {
            showDialog();
            com.tencent.mm.sdk.g.d.post(new AddFavoriteUI.a(this, this.uri, new AddFavoriteUI.8(this)), "AddFavoriteUI_getFilePath");
            AppMethodBeat.o(34765);
          }
        }
        else if ((str.equals("android.intent.action.SEND_MULTIPLE")) && (localBundle != null) && (localBundle.containsKey("android.intent.extra.STREAM")))
        {
          localObject = getIntent().resolveType(this);
          ab.i("MicroMsg.AddFavoriteUI", "send multi: %s, mimeType %s", new Object[] { str, localObject });
          if (!bo.bc((String)localObject, "").contains("image"))
          {
            ab.e("MicroMsg.AddFavoriteUI", "launch : fail, mimeType not contains image");
            PI(1);
            finish();
            AppMethodBeat.o(34765);
          }
          else
          {
            this.zAu = aB(localBundle);
            if ((this.zAu == null) || (this.zAu.size() == 0))
            {
              ab.e("MicroMsg.AddFavoriteUI", "launch : fail, filePathList is null");
              PI(1);
              finish();
              AppMethodBeat.o(34765);
            }
            else
            {
              showDialog();
              com.tencent.mm.sdk.g.d.post(new AddFavoriteUI.9(this), "AddFavoriteUI_dealWithMultiItemHandler");
              AppMethodBeat.o(34765);
            }
          }
        }
        else
        {
          ab.e("MicroMsg.AddFavoriteUI", "launch : fail, uri is null");
          dJw();
          finish();
          AppMethodBeat.o(34765);
        }
      }
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(34760);
    ab.i("MicroMsg.AddFavoriteUI", "on create");
    super.onCreate(paramBundle);
    setTitleVisibility(8);
    int i = w.a(getIntent(), "wizard_activity_result_code", 0);
    switch (i)
    {
    default:
      ab.e("MicroMsg.AddFavoriteUI", "onCreate, should not reach here, resultCode = ".concat(String.valueOf(i)));
      finish();
      AppMethodBeat.o(34760);
    case 1:
    case -1:
    case 0:
    }
    while (true)
    {
      return;
      finish();
      AppMethodBeat.o(34760);
      continue;
      NotifyReceiver.Io();
      initView();
      AppMethodBeat.o(34760);
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(34764);
    ab.i("MicroMsg.AddFavoriteUI", "on Destroy");
    aw.Rg().b(837, this);
    super.onDestroy();
    AppMethodBeat.o(34764);
  }

  public void onNewIntent(Intent paramIntent)
  {
    AppMethodBeat.i(34762);
    ab.i("MicroMsg.AddFavoriteUI", "on NewIntent");
    super.onNewIntent(paramIntent);
    AppMethodBeat.o(34762);
  }

  protected void onRestoreInstanceState(Bundle paramBundle)
  {
    AppMethodBeat.i(34763);
    ab.i("MicroMsg.AddFavoriteUI", "on RestoreInstanceState");
    super.onRestoreInstanceState(paramBundle);
    AppMethodBeat.o(34763);
  }

  public void onSaveInstanceState(Bundle paramBundle)
  {
    AppMethodBeat.i(34761);
    ab.i("MicroMsg.AddFavoriteUI", "on SaveInstanceState");
    super.onSaveInstanceState(paramBundle);
    AppMethodBeat.o(34761);
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(34776);
    ab.i("MicroMsg.AddFavoriteUI", "onSceneEnd, errType = %d, errCode = %d, errMsg = %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    dismissDialog();
    if ((paramm instanceof com.tencent.mm.modelsimple.d))
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        if (this.zAt == null)
          break label224;
        com.tencent.mm.sdk.b.a.xxA.m(this.zAt);
        this.zAt = null;
        AppMethodBeat.o(34776);
      }
    while (true)
    {
      return;
      if (paramm.ftl != null)
      {
        paramm = (rt)((com.tencent.mm.ai.b)paramm.ftl).fsH.fsP;
        if ((paramm != null) && (!bo.isNullOrNil(paramm.vZf)))
        {
          paramString = new Intent();
          paramString.putExtra("rawUrl", paramm.vZf);
          paramString.putExtra("showShare", false);
          paramString.putExtra("show_bottom", false);
          paramString.putExtra("needRedirect", false);
          com.tencent.mm.bp.d.b(this, "webview", ".ui.tools.WebViewUI", paramString);
          finish();
          AppMethodBeat.o(34776);
        }
        else if (this.zAt != null)
        {
          com.tencent.mm.sdk.b.a.xxA.m(this.zAt);
          this.zAt = null;
        }
      }
      else
      {
        label224: AppMethodBeat.o(34776);
      }
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.AddFavoriteUI
 * JD-Core Version:    0.6.2
 */