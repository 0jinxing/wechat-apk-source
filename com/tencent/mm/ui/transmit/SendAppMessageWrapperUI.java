package com.tencent.mm.ui.transmit;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.MotionEvent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.j.b;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.w.a;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.r;
import com.tencent.mm.model.v;
import com.tencent.mm.model.v.b;
import com.tencent.mm.opensdk.modelmsg.WXDynamicVideoMiniProgramObject;
import com.tencent.mm.opensdk.modelmsg.WXEnterpriseCardObject;
import com.tencent.mm.opensdk.modelmsg.WXImageObject;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.mm.opensdk.modelmsg.WXMiniProgramObject;
import com.tencent.mm.opensdk.modelmsg.WXVideoFileObject;
import com.tencent.mm.opensdk.modelmsg.WXWebpageObject;
import com.tencent.mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.mm.pluginsdk.model.app.ReportUtil;
import com.tencent.mm.pluginsdk.model.j;
import com.tencent.mm.pluginsdk.ui.applet.q.a;
import com.tencent.mm.protocal.protobuf.cwm;
import com.tencent.mm.protocal.protobuf.cwu;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

@com.tencent.mm.ui.base.a(3)
public class SendAppMessageWrapperUI extends MMActivity
{
  private ap che;
  private int jDs;
  private int mqx;
  private int scene;
  private String source;
  private com.tencent.mm.ui.base.p tipDialog;
  private String toUser;
  private WXMediaMessage yKN;
  private com.tencent.mm.pluginsdk.model.app.f zKw;
  private boolean zKx;
  private boolean zKy;
  private boolean zKz;

  public SendAppMessageWrapperUI()
  {
    AppMethodBeat.i(35222);
    this.source = null;
    this.zKw = null;
    this.toUser = null;
    this.yKN = null;
    this.scene = 0;
    this.zKx = false;
    this.zKy = false;
    this.zKz = false;
    this.jDs = 0;
    this.mqx = 0;
    this.che = new ap(new SendAppMessageWrapperUI.1(this), true);
    AppMethodBeat.o(35222);
  }

  private q.a a(WXMediaMessage paramWXMediaMessage)
  {
    AppMethodBeat.i(35229);
    paramWXMediaMessage = new SendAppMessageWrapperUI.3(this, paramWXMediaMessage);
    AppMethodBeat.o(35229);
    return paramWXMediaMessage;
  }

  private static void a(j.b paramb, WXMediaMessage paramWXMediaMessage)
  {
    AppMethodBeat.i(35231);
    if ((paramb == null) || (paramWXMediaMessage == null) || (paramWXMediaMessage.mediaObject == null))
      AppMethodBeat.o(35231);
    while (true)
    {
      return;
      if ((paramWXMediaMessage.mediaObject instanceof WXDynamicVideoMiniProgramObject))
      {
        WXDynamicVideoMiniProgramObject localWXDynamicVideoMiniProgramObject = (WXDynamicVideoMiniProgramObject)paramWXMediaMessage.mediaObject;
        com.tencent.mm.af.a locala = new com.tencent.mm.af.a();
        if ((paramWXMediaMessage.thumbData != null) && (paramWXMediaMessage.thumbData.length > 0))
        {
          paramWXMediaMessage = BitmapFactory.decodeByteArray(paramWXMediaMessage.thumbData, 0, paramWXMediaMessage.thumbData.length);
          if (paramWXMediaMessage != null)
          {
            locala.ffn = paramWXMediaMessage.getWidth();
            locala.ffo = paramWXMediaMessage.getHeight();
          }
        }
        locala.videoSource = localWXDynamicVideoMiniProgramObject.videoSource;
        locala.appThumbUrl = localWXDynamicVideoMiniProgramObject.appThumbUrl;
        locala.ffp = 1;
        paramb.a(locala);
        paramb.cMh = null;
      }
      AppMethodBeat.o(35231);
    }
  }

  private void a(WXMediaMessage paramWXMediaMessage, LinkedList<String> paramLinkedList)
  {
    AppMethodBeat.i(35230);
    Object localObject1;
    if ((paramWXMediaMessage == null) || (!(paramWXMediaMessage.mediaObject instanceof WXImageObject)))
    {
      ab.w("MicroMsg.SendAppMessageWrapperUI", "sendImgMsg msg not img");
      localObject1 = null;
      if (!bo.isNullOrNil((String)localObject1))
        break label115;
      ab.e("MicroMsg.SendAppMessageWrapperUI", "sendImgMsg imgPath is null");
      setResult(0);
      AppMethodBeat.o(35230);
    }
    while (true)
    {
      return;
      localObject1 = (WXImageObject)paramWXMediaMessage.mediaObject;
      if (!bo.cb(((WXImageObject)localObject1).imageData))
      {
        ab.d("MicroMsg.SendAppMessageWrapperUI", "getImagePath fileData:" + ((WXImageObject)localObject1).imageData.length);
        localObject1 = com.tencent.mm.pluginsdk.model.app.l.bH(((WXImageObject)localObject1).imageData);
        break;
      }
      localObject1 = ((WXImageObject)localObject1).imagePath;
      break;
      label115: int i = bo.getInt(((com.tencent.mm.plugin.zero.b.a)g.K(com.tencent.mm.plugin.zero.b.a.class)).Nu().getValue("PicCompressAvoidanceActiveSizeNormal"), 100);
      int j = i;
      if (i <= 0)
        j = 100;
      i = 1;
      long l = com.tencent.mm.vfs.e.asZ((String)localObject1);
      if ((l > 26214400L) || (l <= j * 1024))
        i = 0;
      if ((!this.zKy) && (dKq()))
        paramWXMediaMessage = null;
      while (true)
      {
        paramLinkedList = paramLinkedList.iterator();
        while (paramLinkedList.hasNext())
        {
          localObject2 = (String)paramLinkedList.next();
          localObject2 = new com.tencent.mm.at.l(6, r.Yz(), (String)localObject2, (String)localObject1, i, null, 0, paramWXMediaMessage, "", true, 2130838183);
          aw.Rg().a((m)localObject2, 0);
        }
        String str1 = this.zKw.field_appId;
        Object localObject2 = paramWXMediaMessage.mediaTagName;
        String str2 = paramWXMediaMessage.messageExt;
        String str3 = paramWXMediaMessage.messageAction;
        paramWXMediaMessage = null;
        if (!bo.isNullOrNil(str1))
          paramWXMediaMessage = "<msg>" + com.tencent.mm.at.f.c(str1, (String)localObject2, str2, str3) + "</msg>";
      }
      AppMethodBeat.o(35230);
    }
  }

  private void asv(String paramString)
  {
    AppMethodBeat.i(138663);
    if ("wx5dfbe0a95623607b".equals(this.zKw.field_appId))
      if (this.yKN.getType() == 5)
      {
        ab.i("MicroMsg.SendAppMessageWrapperUI", "report(17256) url, to timeline, appId : %s", new Object[] { this.zKw.field_appId });
        com.tencent.mm.plugin.report.service.h.pYm.e(17256, new Object[] { paramString, Integer.valueOf(2) });
        AppMethodBeat.o(138663);
      }
    while (true)
    {
      return;
      if (this.yKN.getType() == 38)
      {
        ab.i("MicroMsg.SendAppMessageWrapperUI", "report(17256) video file, to timeline, appId : %s", new Object[] { this.zKw.field_appId });
        com.tencent.mm.plugin.report.service.h.pYm.e(17256, new Object[] { paramString, Integer.valueOf(1) });
      }
      AppMethodBeat.o(138663);
    }
  }

  private void b(WXMediaMessage paramWXMediaMessage, LinkedList<String> paramLinkedList)
  {
    AppMethodBeat.i(35232);
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(((WXVideoFileObject)paramWXMediaMessage.mediaObject).filePath);
    if (localArrayList.size() > 0)
    {
      paramWXMediaMessage = paramLinkedList.iterator();
      while (paramWXMediaMessage.hasNext())
      {
        paramLinkedList = (String)paramWXMediaMessage.next();
        ab.i("MicroMsg.SendAppMessageWrapperUI", "sendMultiVedeo");
        paramLinkedList = new j(this, localArrayList, getIntent(), paramLinkedList, 1, new SendAppMessageWrapperUI.8(this));
        com.tencent.mm.sdk.g.d.post(paramLinkedList, "ChattingUI_importMultiVideo");
        getString(2131297061);
        this.tipDialog = com.tencent.mm.ui.base.h.b(this, getString(2131297086), true, new SendAppMessageWrapperUI.9(this, paramLinkedList));
      }
    }
    AppMethodBeat.o(35232);
  }

  private void c(WXMediaMessage paramWXMediaMessage, LinkedList<String> paramLinkedList)
  {
    AppMethodBeat.i(35233);
    paramWXMediaMessage = (WXEnterpriseCardObject)paramWXMediaMessage.mediaObject;
    if ((paramWXMediaMessage.msgType != 66) && (paramWXMediaMessage.msgType != 42))
    {
      ab.e("MicroMsg.SendAppMessageWrapperUI", "sendCardMsg msgType invalid");
      setResult(0);
      finish();
      AppMethodBeat.o(35233);
    }
    while (true)
    {
      return;
      paramLinkedList = paramLinkedList.iterator();
      while (paramLinkedList.hasNext())
      {
        com.tencent.mm.modelmulti.h localh = new com.tencent.mm.modelmulti.h((String)paramLinkedList.next(), paramWXMediaMessage.cardInfo, paramWXMediaMessage.msgType);
        aw.Rg().a(localh, 0);
      }
      AppMethodBeat.o(35233);
    }
  }

  private void dKp()
  {
    AppMethodBeat.i(35224);
    Intent localIntent;
    if ((!this.zKy) && (dKq()))
    {
      localIntent = com.tencent.mm.modelsns.a.a(this.jDs, this.yKN, "", "", this.zKw.xy());
      if (localIntent != null)
        break label96;
      finish();
      AppMethodBeat.o(35224);
    }
    while (true)
    {
      return;
      localIntent = com.tencent.mm.modelsns.a.a(this.jDs, this.yKN, this.zKw.field_appId, this.zKw.field_appName, this.zKw.xy());
      break;
      label96: String str = null;
      if ((this.yKN.getType() == 5) || (this.yKN.getType() == 2) || (this.yKN.getType() == 38))
      {
        ab.d("MicroMsg.SendAppMessageWrapperUI", "report(11954), to timeline, appId : %s", new Object[] { this.zKw.field_appId });
        str = v.nW("app_" + this.zKw.field_appId);
        v.b localb = v.Zp().y(str, true);
        localb.j("prePublishId", "app_" + this.zKw.field_appId);
        if ((this.yKN.mediaObject instanceof WXWebpageObject))
          localb.j("url", ((WXWebpageObject)this.yKN.mediaObject).webpageUrl);
      }
      asv(str);
      localIntent.putExtra("reportSessionId", str);
      com.tencent.mm.bp.d.b(this, "sns", ".ui.SnsUploadUI", localIntent, 1);
      AppMethodBeat.o(35224);
    }
  }

  private boolean dKq()
  {
    AppMethodBeat.i(35225);
    ab.i("MicroMsg.SendAppMessageWrapperUI", "blockInvalidToken block %b", new Object[] { Boolean.valueOf(this.zKz) });
    boolean bool = this.zKz;
    AppMethodBeat.o(35225);
    return bool;
  }

  public final int getLayoutId()
  {
    return -1;
  }

  public final void initView()
  {
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(35226);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    ab.i("MicroMsg.SendAppMessageWrapperUI", "requestCode " + paramInt1 + " resultCode " + paramInt2);
    if (paramInt1 == 1)
      if (paramInt2 == -1)
      {
        ReportUtil.a(this, ReportUtil.c(getIntent().getExtras(), 0), false);
        finish();
        AppMethodBeat.o(35226);
      }
    while (true)
    {
      return;
      ReportUtil.a(this, ReportUtil.c(getIntent().getExtras(), 0), true);
      break;
      if ((paramInt1 == 2) && (paramInt2 == -1))
      {
        WXVideoFileObject localWXVideoFileObject = (WXVideoFileObject)this.yKN.mediaObject;
        localWXVideoFileObject.filePath = paramIntent.getStringExtra("K_SEGMENTVIDEOPATH");
        if ((!bo.isNullOrNil(localWXVideoFileObject.filePath)) && (com.tencent.mm.vfs.e.ct(localWXVideoFileObject.filePath)))
        {
          dKp();
          AppMethodBeat.o(35226);
        }
        else
        {
          setResult(-5);
          finish();
        }
      }
      else
      {
        AppMethodBeat.o(35226);
      }
    }
  }

  // ERROR //
  public void onCreate(android.os.Bundle paramBundle)
  {
    // Byte code:
    //   0: ldc_w 1079
    //   3: invokestatic 39	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: aload_0
    //   7: aload_1
    //   8: invokespecial 1081	com/tencent/mm/ui/MMActivity:onCreate	(Landroid/os/Bundle;)V
    //   11: aload_0
    //   12: invokevirtual 1085	com/tencent/mm/ui/transmit/SendAppMessageWrapperUI:getSupportActionBar	()Landroid/support/v7/app/ActionBar;
    //   15: invokevirtual 1090	android/support/v7/app/ActionBar:hide	()V
    //   18: aload_0
    //   19: invokestatic 1095	com/tencent/mm/sdk/platformtools/ah:doA	()Ljava/lang/String;
    //   22: iconst_0
    //   23: invokevirtual 1099	com/tencent/mm/ui/transmit/SendAppMessageWrapperUI:getSharedPreferences	(Ljava/lang/String;I)Landroid/content/SharedPreferences;
    //   26: astore_1
    //   27: aload_1
    //   28: ldc_w 1101
    //   31: iconst_0
    //   32: invokeinterface 1107 3 0
    //   37: ifne +42 -> 79
    //   40: ldc 147
    //   42: ldc_w 1109
    //   45: invokestatic 194	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   48: aload_0
    //   49: iconst_1
    //   50: putfield 51	com/tencent/mm/ui/transmit/SendAppMessageWrapperUI:zKx	Z
    //   53: aload_0
    //   54: iconst_m1
    //   55: invokevirtual 1112	com/tencent/mm/ui/transmit/SendAppMessageWrapperUI:setRequestedOrientation	(I)V
    //   58: aload_1
    //   59: invokeinterface 1116 1 0
    //   64: ldc_w 1101
    //   67: iconst_1
    //   68: invokeinterface 1122 3 0
    //   73: invokeinterface 1125 1 0
    //   78: pop
    //   79: aload_0
    //   80: invokevirtual 539	com/tencent/mm/ui/transmit/SendAppMessageWrapperUI:getIntent	()Landroid/content/Intent;
    //   83: invokevirtual 545	android/content/Intent:getExtras	()Landroid/os/Bundle;
    //   86: astore_1
    //   87: new 1127	com/tencent/mm/opensdk/modelmsg/SendMessageToWX$Req
    //   90: dup
    //   91: aload_1
    //   92: invokespecial 1129	com/tencent/mm/opensdk/modelmsg/SendMessageToWX$Req:<init>	(Landroid/os/Bundle;)V
    //   95: astore_2
    //   96: aload_0
    //   97: aload_1
    //   98: ldc_w 845
    //   101: invokevirtual 1131	android/os/Bundle:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   104: putfield 45	com/tencent/mm/ui/transmit/SendAppMessageWrapperUI:toUser	Ljava/lang/String;
    //   107: aload_0
    //   108: aload_1
    //   109: ldc_w 1133
    //   112: iconst_0
    //   113: invokevirtual 1134	android/os/Bundle:getBoolean	(Ljava/lang/String;Z)Z
    //   116: putfield 53	com/tencent/mm/ui/transmit/SendAppMessageWrapperUI:zKy	Z
    //   119: aload_0
    //   120: aload_1
    //   121: ldc_w 1136
    //   124: iconst_0
    //   125: invokevirtual 1134	android/os/Bundle:getBoolean	(Ljava/lang/String;Z)Z
    //   128: putfield 55	com/tencent/mm/ui/transmit/SendAppMessageWrapperUI:zKz	Z
    //   131: aload_0
    //   132: aload_0
    //   133: invokevirtual 539	com/tencent/mm/ui/transmit/SendAppMessageWrapperUI:getIntent	()Landroid/content/Intent;
    //   136: ldc_w 1138
    //   139: iconst_0
    //   140: invokestatic 1143	com/tencent/mm/sdk/platformtools/w:a	(Landroid/content/Intent;Ljava/lang/String;I)I
    //   143: putfield 57	com/tencent/mm/ui/transmit/SendAppMessageWrapperUI:jDs	I
    //   146: aload_0
    //   147: aload_1
    //   148: ldc_w 1145
    //   151: iconst_0
    //   152: invokevirtual 1146	android/os/Bundle:getInt	(Ljava/lang/String;I)I
    //   155: putfield 49	com/tencent/mm/ui/transmit/SendAppMessageWrapperUI:scene	I
    //   158: aload_1
    //   159: ldc_w 1148
    //   162: invokevirtual 1131	android/os/Bundle:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   165: astore_3
    //   166: aload_3
    //   167: ifnonnull +1421 -> 1588
    //   170: aload_1
    //   171: ldc_w 1150
    //   174: invokevirtual 1131	android/os/Bundle:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   177: invokestatic 1156	android/net/Uri:parse	(Ljava/lang/String;)Landroid/net/Uri;
    //   180: ldc_w 1158
    //   183: invokevirtual 1161	android/net/Uri:getQueryParameter	(Ljava/lang/String;)Ljava/lang/String;
    //   186: astore_3
    //   187: aload_0
    //   188: new 282	com/tencent/mm/pluginsdk/model/app/f
    //   191: dup
    //   192: invokespecial 1162	com/tencent/mm/pluginsdk/model/app/f:<init>	()V
    //   195: putfield 43	com/tencent/mm/ui/transmit/SendAppMessageWrapperUI:zKw	Lcom/tencent/mm/pluginsdk/model/app/f;
    //   198: aload_0
    //   199: getfield 43	com/tencent/mm/ui/transmit/SendAppMessageWrapperUI:zKw	Lcom/tencent/mm/pluginsdk/model/app/f;
    //   202: aload_3
    //   203: putfield 285	com/tencent/mm/pluginsdk/model/app/f:field_appId	Ljava/lang/String;
    //   206: invokestatic 1168	com/tencent/mm/pluginsdk/model/app/am:bYJ	()Lcom/tencent/mm/pluginsdk/model/app/i;
    //   209: aload_0
    //   210: getfield 43	com/tencent/mm/ui/transmit/SendAppMessageWrapperUI:zKw	Lcom/tencent/mm/pluginsdk/model/app/f;
    //   213: iconst_0
    //   214: anewarray 256	java/lang/String
    //   217: invokevirtual 1173	com/tencent/mm/pluginsdk/model/app/i:b	(Lcom/tencent/mm/sdk/e/c;[Ljava/lang/String;)Z
    //   220: pop
    //   221: aload_0
    //   222: getfield 43	com/tencent/mm/ui/transmit/SendAppMessageWrapperUI:zKw	Lcom/tencent/mm/pluginsdk/model/app/f;
    //   225: getfield 388	com/tencent/mm/pluginsdk/model/app/f:field_appName	Ljava/lang/String;
    //   228: ifnonnull +99 -> 327
    //   231: aload_0
    //   232: ldc_w 1174
    //   235: invokevirtual 461	com/tencent/mm/ui/transmit/SendAppMessageWrapperUI:getString	(I)Ljava/lang/String;
    //   238: astore_1
    //   239: aload_0
    //   240: aload_0
    //   241: ldc_w 1175
    //   244: iconst_1
    //   245: anewarray 315	java/lang/Object
    //   248: dup
    //   249: iconst_0
    //   250: aload_1
    //   251: aastore
    //   252: invokevirtual 502	com/tencent/mm/ui/transmit/SendAppMessageWrapperUI:getString	(I[Ljava/lang/Object;)Ljava/lang/String;
    //   255: putfield 41	com/tencent/mm/ui/transmit/SendAppMessageWrapperUI:source	Ljava/lang/String;
    //   258: aload_0
    //   259: aload_2
    //   260: getfield 1178	com/tencent/mm/opensdk/modelmsg/SendMessageToWX$Req:message	Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage;
    //   263: putfield 47	com/tencent/mm/ui/transmit/SendAppMessageWrapperUI:yKN	Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage;
    //   266: ldc 147
    //   268: ldc_w 1180
    //   271: iconst_2
    //   272: anewarray 315	java/lang/Object
    //   275: dup
    //   276: iconst_0
    //   277: aload_0
    //   278: getfield 47	com/tencent/mm/ui/transmit/SendAppMessageWrapperUI:yKN	Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage;
    //   281: getfield 294	com/tencent/mm/opensdk/modelmsg/WXMediaMessage:messageAction	Ljava/lang/String;
    //   284: aastore
    //   285: dup
    //   286: iconst_1
    //   287: aload_0
    //   288: getfield 47	com/tencent/mm/ui/transmit/SendAppMessageWrapperUI:yKN	Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage;
    //   291: getfield 291	com/tencent/mm/opensdk/modelmsg/WXMediaMessage:messageExt	Ljava/lang/String;
    //   294: aastore
    //   295: invokestatic 705	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   298: aload_0
    //   299: getfield 49	com/tencent/mm/ui/transmit/SendAppMessageWrapperUI:scene	I
    //   302: iconst_1
    //   303: if_icmpne +1254 -> 1557
    //   306: aload_0
    //   307: getfield 47	com/tencent/mm/ui/transmit/SendAppMessageWrapperUI:yKN	Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage;
    //   310: getfield 92	com/tencent/mm/opensdk/modelmsg/WXMediaMessage:mediaObject	Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage$IMediaObject;
    //   313: ifnonnull +33 -> 346
    //   316: aload_0
    //   317: invokevirtual 556	com/tencent/mm/ui/transmit/SendAppMessageWrapperUI:finish	()V
    //   320: ldc_w 1079
    //   323: invokestatic 74	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   326: return
    //   327: aload_0
    //   328: getfield 895	com/tencent/mm/ui/MMActivity:mController	Lcom/tencent/mm/ui/q;
    //   331: getfield 810	com/tencent/mm/ui/q:ylL	Landroid/support/v7/app/AppCompatActivity;
    //   334: aload_0
    //   335: getfield 43	com/tencent/mm/ui/transmit/SendAppMessageWrapperUI:zKw	Lcom/tencent/mm/pluginsdk/model/app/f;
    //   338: aconst_null
    //   339: invokestatic 1183	com/tencent/mm/pluginsdk/model/app/g:b	(Landroid/content/Context;Lcom/tencent/mm/pluginsdk/model/app/f;Ljava/lang/String;)Ljava/lang/String;
    //   342: astore_1
    //   343: goto -104 -> 239
    //   346: aload_0
    //   347: getfield 47	com/tencent/mm/ui/transmit/SendAppMessageWrapperUI:yKN	Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage;
    //   350: invokevirtual 336	com/tencent/mm/opensdk/modelmsg/WXMediaMessage:getType	()I
    //   353: bipush 38
    //   355: if_icmpne +524 -> 879
    //   358: aload_0
    //   359: getfield 47	com/tencent/mm/ui/transmit/SendAppMessageWrapperUI:yKN	Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage;
    //   362: getfield 92	com/tencent/mm/opensdk/modelmsg/WXMediaMessage:mediaObject	Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage$IMediaObject;
    //   365: checkcast 714	com/tencent/mm/opensdk/modelmsg/WXVideoFileObject
    //   368: astore 4
    //   370: aload_0
    //   371: getfield 47	com/tencent/mm/ui/transmit/SendAppMessageWrapperUI:yKN	Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage;
    //   374: getfield 291	com/tencent/mm/opensdk/modelmsg/WXMediaMessage:messageExt	Ljava/lang/String;
    //   377: astore 5
    //   379: aload 4
    //   381: getfield 717	com/tencent/mm/opensdk/modelmsg/WXVideoFileObject:filePath	Ljava/lang/String;
    //   384: astore 6
    //   386: aload 4
    //   388: getfield 717	com/tencent/mm/opensdk/modelmsg/WXVideoFileObject:filePath	Ljava/lang/String;
    //   391: invokestatic 161	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   394: ifne +404 -> 798
    //   397: aload 4
    //   399: getfield 717	com/tencent/mm/opensdk/modelmsg/WXVideoFileObject:filePath	Ljava/lang/String;
    //   402: invokestatic 1072	com/tencent/mm/vfs/e:ct	(Ljava/lang/String;)Z
    //   405: ifeq +393 -> 798
    //   408: new 1185	android/media/MediaMetadataRetriever
    //   411: astore_2
    //   412: aload_2
    //   413: invokespecial 1186	android/media/MediaMetadataRetriever:<init>	()V
    //   416: aload_2
    //   417: astore_1
    //   418: aload_2
    //   419: aload 6
    //   421: invokevirtual 1189	android/media/MediaMetadataRetriever:setDataSource	(Ljava/lang/String;)V
    //   424: aload_2
    //   425: astore_1
    //   426: aload_2
    //   427: bipush 9
    //   429: invokevirtual 1192	android/media/MediaMetadataRetriever:extractMetadata	(I)Ljava/lang/String;
    //   432: iconst_m1
    //   433: invokestatic 227	com/tencent/mm/sdk/platformtools/bo:getInt	(Ljava/lang/String;I)I
    //   436: istore 7
    //   438: bipush 10
    //   440: istore 8
    //   442: aload_2
    //   443: astore_1
    //   444: ldc_w 701
    //   447: aload_3
    //   448: invokevirtual 456	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   451: ifeq +18 -> 469
    //   454: aload_2
    //   455: astore_1
    //   456: invokestatic 374	com/tencent/mm/m/g:Nu	()Lcom/tencent/mm/m/e;
    //   459: ldc_w 1194
    //   462: bipush 10
    //   464: invokevirtual 1195	com/tencent/mm/m/e:getInt	(Ljava/lang/String;I)I
    //   467: istore 8
    //   469: aload_2
    //   470: astore_1
    //   471: ldc 147
    //   473: ldc_w 1197
    //   476: iconst_2
    //   477: anewarray 315	java/lang/Object
    //   480: dup
    //   481: iconst_0
    //   482: iload 7
    //   484: invokestatic 321	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   487: aastore
    //   488: dup
    //   489: iconst_1
    //   490: iload 8
    //   492: invokestatic 321	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   495: aastore
    //   496: invokestatic 705	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   499: iload 7
    //   501: i2d
    //   502: iload 8
    //   504: i2d
    //   505: ldc2_w 1198
    //   508: dadd
    //   509: ldc2_w 1200
    //   512: dmul
    //   513: dcmpl
    //   514: iflt +60 -> 574
    //   517: aload_2
    //   518: astore_1
    //   519: aload_0
    //   520: bipush 251
    //   522: invokevirtual 169	com/tencent/mm/ui/transmit/SendAppMessageWrapperUI:setResult	(I)V
    //   525: aload_2
    //   526: astore_1
    //   527: aload_0
    //   528: invokevirtual 556	com/tencent/mm/ui/transmit/SendAppMessageWrapperUI:finish	()V
    //   531: aload_2
    //   532: invokevirtual 1204	android/media/MediaMetadataRetriever:release	()V
    //   535: ldc_w 1079
    //   538: invokestatic 74	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   541: goto -215 -> 326
    //   544: astore_1
    //   545: ldc 147
    //   547: aload_1
    //   548: ldc_w 1206
    //   551: iconst_1
    //   552: anewarray 315	java/lang/Object
    //   555: dup
    //   556: iconst_0
    //   557: aload_1
    //   558: invokevirtual 1209	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   561: aastore
    //   562: invokestatic 1213	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   565: ldc_w 1079
    //   568: invokestatic 74	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   571: goto -245 -> 326
    //   574: aload_2
    //   575: invokevirtual 1204	android/media/MediaMetadataRetriever:release	()V
    //   578: ldc_w 701
    //   581: aload_3
    //   582: invokevirtual 456	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   585: ifeq +244 -> 829
    //   588: aload 4
    //   590: getfield 717	com/tencent/mm/opensdk/modelmsg/WXVideoFileObject:filePath	Ljava/lang/String;
    //   593: invokestatic 161	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   596: ifne +214 -> 810
    //   599: aload 4
    //   601: getfield 717	com/tencent/mm/opensdk/modelmsg/WXVideoFileObject:filePath	Ljava/lang/String;
    //   604: invokestatic 1072	com/tencent/mm/vfs/e:ct	(Ljava/lang/String;)Z
    //   607: ifeq +203 -> 810
    //   610: aload 4
    //   612: getfield 717	com/tencent/mm/opensdk/modelmsg/WXVideoFileObject:filePath	Ljava/lang/String;
    //   615: astore_1
    //   616: aload_1
    //   617: ifnull +188 -> 805
    //   620: new 1215	java/io/File
    //   623: dup
    //   624: aload_1
    //   625: invokespecial 1216	java/io/File:<init>	(Ljava/lang/String;)V
    //   628: astore_1
    //   629: aload_1
    //   630: invokevirtual 1219	java/io/File:exists	()Z
    //   633: ifeq +172 -> 805
    //   636: aload_1
    //   637: invokestatic 1224	com/tencent/xweb/util/d:w	(Ljava/io/File;)Ljava/lang/String;
    //   640: astore_1
    //   641: aload 5
    //   643: aload_1
    //   644: invokestatic 1228	com/tencent/mm/sdk/platformtools/bo:isEqual	(Ljava/lang/String;Ljava/lang/String;)Z
    //   647: ifeq +163 -> 810
    //   650: aload_0
    //   651: invokespecial 1074	com/tencent/mm/ui/transmit/SendAppMessageWrapperUI:dKp	()V
    //   654: ldc_w 1079
    //   657: invokestatic 74	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   660: goto -334 -> 326
    //   663: astore_1
    //   664: ldc 147
    //   666: aload_1
    //   667: ldc_w 1206
    //   670: iconst_1
    //   671: anewarray 315	java/lang/Object
    //   674: dup
    //   675: iconst_0
    //   676: aload_1
    //   677: invokevirtual 1209	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   680: aastore
    //   681: invokestatic 1213	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   684: goto -106 -> 578
    //   687: astore 9
    //   689: aconst_null
    //   690: astore_2
    //   691: aload_2
    //   692: astore_1
    //   693: ldc 147
    //   695: aload 9
    //   697: ldc_w 1230
    //   700: iconst_2
    //   701: anewarray 315	java/lang/Object
    //   704: dup
    //   705: iconst_0
    //   706: aload 6
    //   708: aastore
    //   709: dup
    //   710: iconst_1
    //   711: aload 9
    //   713: invokevirtual 1209	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   716: aastore
    //   717: invokestatic 1213	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   720: aload_2
    //   721: ifnull -143 -> 578
    //   724: aload_2
    //   725: invokevirtual 1204	android/media/MediaMetadataRetriever:release	()V
    //   728: goto -150 -> 578
    //   731: astore_1
    //   732: ldc 147
    //   734: aload_1
    //   735: ldc_w 1206
    //   738: iconst_1
    //   739: anewarray 315	java/lang/Object
    //   742: dup
    //   743: iconst_0
    //   744: aload_1
    //   745: invokevirtual 1209	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   748: aastore
    //   749: invokestatic 1213	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   752: goto -174 -> 578
    //   755: astore_2
    //   756: aconst_null
    //   757: astore_1
    //   758: aload_1
    //   759: ifnull +7 -> 766
    //   762: aload_1
    //   763: invokevirtual 1204	android/media/MediaMetadataRetriever:release	()V
    //   766: ldc_w 1079
    //   769: invokestatic 74	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   772: aload_2
    //   773: athrow
    //   774: astore_1
    //   775: ldc 147
    //   777: aload_1
    //   778: ldc_w 1206
    //   781: iconst_1
    //   782: anewarray 315	java/lang/Object
    //   785: dup
    //   786: iconst_0
    //   787: aload_1
    //   788: invokevirtual 1209	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   791: aastore
    //   792: invokestatic 1213	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   795: goto -29 -> 766
    //   798: aload_0
    //   799: invokevirtual 556	com/tencent/mm/ui/transmit/SendAppMessageWrapperUI:finish	()V
    //   802: goto -224 -> 578
    //   805: aconst_null
    //   806: astore_1
    //   807: goto -166 -> 641
    //   810: aload_0
    //   811: bipush 251
    //   813: invokevirtual 169	com/tencent/mm/ui/transmit/SendAppMessageWrapperUI:setResult	(I)V
    //   816: aload_0
    //   817: invokevirtual 556	com/tencent/mm/ui/transmit/SendAppMessageWrapperUI:finish	()V
    //   820: ldc_w 1079
    //   823: invokestatic 74	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   826: goto -500 -> 326
    //   829: new 541	android/content/Intent
    //   832: dup
    //   833: invokespecial 1000	android/content/Intent:<init>	()V
    //   836: astore_1
    //   837: aload_1
    //   838: ldc_w 1066
    //   841: aload 6
    //   843: invokevirtual 1033	android/content/Intent:putExtra	(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   846: pop
    //   847: aload_1
    //   848: ldc_w 1232
    //   851: ldc_w 265
    //   854: invokevirtual 1033	android/content/Intent:putExtra	(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   857: pop
    //   858: aload_0
    //   859: ldc_w 1234
    //   862: ldc_w 1236
    //   865: aload_1
    //   866: iconst_2
    //   867: invokestatic 1042	com/tencent/mm/bp/d:b	(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/content/Intent;I)V
    //   870: ldc_w 1079
    //   873: invokestatic 74	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   876: goto -550 -> 326
    //   879: aload_0
    //   880: getfield 47	com/tencent/mm/ui/transmit/SendAppMessageWrapperUI:yKN	Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage;
    //   883: invokevirtual 336	com/tencent/mm/opensdk/modelmsg/WXMediaMessage:getType	()I
    //   886: bipush 39
    //   888: if_icmpne +656 -> 1544
    //   891: aload_0
    //   892: getfield 47	com/tencent/mm/ui/transmit/SendAppMessageWrapperUI:yKN	Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage;
    //   895: getfield 92	com/tencent/mm/opensdk/modelmsg/WXMediaMessage:mediaObject	Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage$IMediaObject;
    //   898: checkcast 1238	com/tencent/mm/opensdk/modelmsg/WXGameVideoFileObject
    //   901: astore_1
    //   902: aload_1
    //   903: getfield 1239	com/tencent/mm/opensdk/modelmsg/WXGameVideoFileObject:filePath	Ljava/lang/String;
    //   906: invokestatic 161	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   909: ifne +68 -> 977
    //   912: aload_1
    //   913: getfield 1239	com/tencent/mm/opensdk/modelmsg/WXGameVideoFileObject:filePath	Ljava/lang/String;
    //   916: invokestatic 1072	com/tencent/mm/vfs/e:ct	(Ljava/lang/String;)Z
    //   919: ifeq +58 -> 977
    //   922: aload_1
    //   923: getfield 1239	com/tencent/mm/opensdk/modelmsg/WXGameVideoFileObject:filePath	Ljava/lang/String;
    //   926: astore_1
    //   927: invokestatic 374	com/tencent/mm/m/g:Nu	()Lcom/tencent/mm/m/e;
    //   930: ldc_w 1241
    //   933: ldc_w 1242
    //   936: invokevirtual 1195	com/tencent/mm/m/e:getInt	(Ljava/lang/String;I)I
    //   939: istore 8
    //   941: aload_1
    //   942: invokestatic 233	com/tencent/mm/vfs/e:asZ	(Ljava/lang/String;)J
    //   945: iload 8
    //   947: i2l
    //   948: lcmp
    //   949: ifle +58 -> 1007
    //   952: ldc_w 1244
    //   955: ldc_w 1246
    //   958: invokestatic 166	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   961: iconst_1
    //   962: istore 8
    //   964: iload 8
    //   966: ifeq +47 -> 1013
    //   969: iconst_1
    //   970: istore 8
    //   972: iload 8
    //   974: ifeq +570 -> 1544
    //   977: aload_0
    //   978: aload_0
    //   979: invokevirtual 539	com/tencent/mm/ui/transmit/SendAppMessageWrapperUI:getIntent	()Landroid/content/Intent;
    //   982: invokevirtual 545	android/content/Intent:getExtras	()Landroid/os/Bundle;
    //   985: bipush 251
    //   987: invokestatic 550	com/tencent/mm/pluginsdk/model/app/ReportUtil:c	(Landroid/os/Bundle;I)Lcom/tencent/mm/pluginsdk/model/app/ReportUtil$ReportArgs;
    //   990: iconst_0
    //   991: invokestatic 553	com/tencent/mm/pluginsdk/model/app/ReportUtil:a	(Landroid/content/Context;Lcom/tencent/mm/pluginsdk/model/app/ReportUtil$ReportArgs;Z)V
    //   994: aload_0
    //   995: invokevirtual 556	com/tencent/mm/ui/transmit/SendAppMessageWrapperUI:finish	()V
    //   998: ldc_w 1079
    //   1001: invokestatic 74	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1004: goto -678 -> 326
    //   1007: iconst_0
    //   1008: istore 8
    //   1010: goto -46 -> 964
    //   1013: aload_1
    //   1014: invokestatic 1252	com/tencent/mm/modelsns/a$a:tw	(Ljava/lang/String;)Lcom/tencent/mm/modelsns/a$a;
    //   1017: astore_1
    //   1018: aload_1
    //   1019: getfield 1255	com/tencent/mm/modelsns/a$a:videoWidth	I
    //   1022: ifle +46 -> 1068
    //   1025: aload_1
    //   1026: getfield 1258	com/tencent/mm/modelsns/a$a:videoHeight	I
    //   1029: ifle +39 -> 1068
    //   1032: aload_1
    //   1033: getfield 1255	com/tencent/mm/modelsns/a$a:videoWidth	I
    //   1036: i2f
    //   1037: aload_1
    //   1038: getfield 1258	com/tencent/mm/modelsns/a$a:videoHeight	I
    //   1041: i2f
    //   1042: fdiv
    //   1043: ldc_w 1259
    //   1046: fcmpl
    //   1047: ifgt +21 -> 1068
    //   1050: aload_1
    //   1051: getfield 1255	com/tencent/mm/modelsns/a$a:videoWidth	I
    //   1054: i2f
    //   1055: aload_1
    //   1056: getfield 1258	com/tencent/mm/modelsns/a$a:videoHeight	I
    //   1059: i2f
    //   1060: fdiv
    //   1061: ldc_w 1260
    //   1064: fcmpg
    //   1065: ifge +228 -> 1293
    //   1068: ldc_w 1244
    //   1071: ldc_w 1262
    //   1074: iconst_2
    //   1075: anewarray 315	java/lang/Object
    //   1078: dup
    //   1079: iconst_0
    //   1080: aload_1
    //   1081: getfield 1255	com/tencent/mm/modelsns/a$a:videoWidth	I
    //   1084: invokestatic 321	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1087: aastore
    //   1088: dup
    //   1089: iconst_1
    //   1090: aload_1
    //   1091: getfield 1258	com/tencent/mm/modelsns/a$a:videoHeight	I
    //   1094: invokestatic 321	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1097: aastore
    //   1098: invokestatic 705	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1101: iconst_1
    //   1102: istore 8
    //   1104: iload 8
    //   1106: ifne +181 -> 1287
    //   1109: ldc_w 1244
    //   1112: ldc_w 1264
    //   1115: iconst_1
    //   1116: anewarray 315	java/lang/Object
    //   1119: dup
    //   1120: iconst_0
    //   1121: aload_1
    //   1122: getfield 1267	com/tencent/mm/modelsns/a$a:fPW	I
    //   1125: invokestatic 321	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1128: aastore
    //   1129: invokestatic 705	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1132: aload_1
    //   1133: getfield 1267	com/tencent/mm/modelsns/a$a:fPW	I
    //   1136: sipush 1000
    //   1139: if_icmpgt +160 -> 1299
    //   1142: iconst_1
    //   1143: istore 8
    //   1145: iload 8
    //   1147: ifne +140 -> 1287
    //   1150: ldc_w 1244
    //   1153: ldc_w 1269
    //   1156: iconst_1
    //   1157: anewarray 315	java/lang/Object
    //   1160: dup
    //   1161: iconst_0
    //   1162: aload_1
    //   1163: aastore
    //   1164: invokestatic 324	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1167: aload_1
    //   1168: getfield 1272	com/tencent/mm/modelsns/a$a:fPT	Ljava/lang/String;
    //   1171: invokestatic 161	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   1174: ifne +59 -> 1233
    //   1177: aload_1
    //   1178: getfield 1272	com/tencent/mm/modelsns/a$a:fPT	Ljava/lang/String;
    //   1181: astore_2
    //   1182: aload_2
    //   1183: invokestatic 161	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   1186: ifeq +135 -> 1321
    //   1189: iconst_1
    //   1190: istore 8
    //   1192: iload 8
    //   1194: ifne +39 -> 1233
    //   1197: ldc_w 1274
    //   1200: aload_1
    //   1201: getfield 1277	com/tencent/mm/modelsns/a$a:fPU	Ljava/lang/String;
    //   1204: invokevirtual 1280	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   1207: ifeq +26 -> 1233
    //   1210: aload_1
    //   1211: getfield 1283	com/tencent/mm/modelsns/a$a:fPV	Ljava/lang/String;
    //   1214: invokestatic 161	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   1217: ifne +315 -> 1532
    //   1220: ldc_w 1285
    //   1223: aload_1
    //   1224: getfield 1283	com/tencent/mm/modelsns/a$a:fPV	Ljava/lang/String;
    //   1227: invokevirtual 1280	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   1230: ifne +302 -> 1532
    //   1233: ldc_w 1244
    //   1236: ldc_w 1287
    //   1239: iconst_1
    //   1240: anewarray 315	java/lang/Object
    //   1243: dup
    //   1244: iconst_0
    //   1245: aload_1
    //   1246: getfield 1277	com/tencent/mm/modelsns/a$a:fPU	Ljava/lang/String;
    //   1249: aastore
    //   1250: invokestatic 705	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1253: ldc_w 1244
    //   1256: ldc_w 1289
    //   1259: iconst_2
    //   1260: anewarray 315	java/lang/Object
    //   1263: dup
    //   1264: iconst_0
    //   1265: ldc_w 1285
    //   1268: aastore
    //   1269: dup
    //   1270: iconst_1
    //   1271: aload_1
    //   1272: getfield 1283	com/tencent/mm/modelsns/a$a:fPV	Ljava/lang/String;
    //   1275: aastore
    //   1276: invokestatic 705	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1279: iconst_1
    //   1280: istore 8
    //   1282: iload 8
    //   1284: ifeq +254 -> 1538
    //   1287: iconst_1
    //   1288: istore 8
    //   1290: goto -318 -> 972
    //   1293: iconst_0
    //   1294: istore 8
    //   1296: goto -192 -> 1104
    //   1299: aload_1
    //   1300: getfield 1267	com/tencent/mm/modelsns/a$a:fPW	I
    //   1303: sipush 10500
    //   1306: if_icmplt +9 -> 1315
    //   1309: iconst_1
    //   1310: istore 8
    //   1312: goto -167 -> 1145
    //   1315: iconst_0
    //   1316: istore 8
    //   1318: goto -173 -> 1145
    //   1321: getstatic 1293	com/tencent/mm/modelsns/a:fPS	Ljava/util/Set;
    //   1324: ifnonnull +145 -> 1469
    //   1327: new 1295	java/util/HashSet
    //   1330: dup
    //   1331: invokespecial 1296	java/util/HashSet:<init>	()V
    //   1334: astore_3
    //   1335: aload_3
    //   1336: putstatic 1293	com/tencent/mm/modelsns/a:fPS	Ljava/util/Set;
    //   1339: aload_3
    //   1340: ldc_w 1298
    //   1343: invokeinterface 1301 2 0
    //   1348: pop
    //   1349: getstatic 1293	com/tencent/mm/modelsns/a:fPS	Ljava/util/Set;
    //   1352: ldc_w 1303
    //   1355: invokeinterface 1301 2 0
    //   1360: pop
    //   1361: getstatic 1293	com/tencent/mm/modelsns/a:fPS	Ljava/util/Set;
    //   1364: ldc_w 1305
    //   1367: invokeinterface 1301 2 0
    //   1372: pop
    //   1373: getstatic 1293	com/tencent/mm/modelsns/a:fPS	Ljava/util/Set;
    //   1376: ldc_w 1307
    //   1379: invokeinterface 1301 2 0
    //   1384: pop
    //   1385: getstatic 1293	com/tencent/mm/modelsns/a:fPS	Ljava/util/Set;
    //   1388: ldc_w 1309
    //   1391: invokeinterface 1301 2 0
    //   1396: pop
    //   1397: getstatic 1293	com/tencent/mm/modelsns/a:fPS	Ljava/util/Set;
    //   1400: ldc_w 1311
    //   1403: invokeinterface 1301 2 0
    //   1408: pop
    //   1409: getstatic 1293	com/tencent/mm/modelsns/a:fPS	Ljava/util/Set;
    //   1412: ldc_w 1313
    //   1415: invokeinterface 1301 2 0
    //   1420: pop
    //   1421: getstatic 1293	com/tencent/mm/modelsns/a:fPS	Ljava/util/Set;
    //   1424: ldc_w 1315
    //   1427: invokeinterface 1301 2 0
    //   1432: pop
    //   1433: getstatic 1293	com/tencent/mm/modelsns/a:fPS	Ljava/util/Set;
    //   1436: ldc_w 1317
    //   1439: invokeinterface 1301 2 0
    //   1444: pop
    //   1445: getstatic 1293	com/tencent/mm/modelsns/a:fPS	Ljava/util/Set;
    //   1448: ldc_w 1319
    //   1451: invokeinterface 1301 2 0
    //   1456: pop
    //   1457: getstatic 1293	com/tencent/mm/modelsns/a:fPS	Ljava/util/Set;
    //   1460: ldc_w 1321
    //   1463: invokeinterface 1301 2 0
    //   1468: pop
    //   1469: aload_2
    //   1470: invokevirtual 1324	java/lang/String:trim	()Ljava/lang/String;
    //   1473: astore_2
    //   1474: aload_2
    //   1475: ldc_w 1326
    //   1478: invokevirtual 1329	java/lang/String:lastIndexOf	(Ljava/lang/String;)I
    //   1481: istore 8
    //   1483: iload 8
    //   1485: iflt +12 -> 1497
    //   1488: iload 8
    //   1490: aload_2
    //   1491: invokevirtual 481	java/lang/String:length	()I
    //   1494: if_icmplt +9 -> 1503
    //   1497: iconst_1
    //   1498: istore 8
    //   1500: goto -308 -> 1192
    //   1503: getstatic 1293	com/tencent/mm/modelsns/a:fPS	Ljava/util/Set;
    //   1506: aload_2
    //   1507: iload 8
    //   1509: invokevirtual 1332	java/lang/String:substring	(I)Ljava/lang/String;
    //   1512: invokeinterface 1335 2 0
    //   1517: ifne +9 -> 1526
    //   1520: iconst_1
    //   1521: istore 8
    //   1523: goto -331 -> 1192
    //   1526: iconst_0
    //   1527: istore 8
    //   1529: goto -337 -> 1192
    //   1532: iconst_0
    //   1533: istore 8
    //   1535: goto -253 -> 1282
    //   1538: iconst_0
    //   1539: istore 8
    //   1541: goto -569 -> 972
    //   1544: aload_0
    //   1545: invokespecial 1074	com/tencent/mm/ui/transmit/SendAppMessageWrapperUI:dKp	()V
    //   1548: ldc_w 1079
    //   1551: invokestatic 74	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1554: goto -1228 -> 326
    //   1557: aload_0
    //   1558: getfield 71	com/tencent/mm/ui/transmit/SendAppMessageWrapperUI:che	Lcom/tencent/mm/sdk/platformtools/ap;
    //   1561: ldc2_w 1336
    //   1564: ldc2_w 1336
    //   1567: invokevirtual 1341	com/tencent/mm/sdk/platformtools/ap:ae	(JJ)V
    //   1570: ldc_w 1079
    //   1573: invokestatic 74	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1576: goto -1250 -> 326
    //   1579: astore_2
    //   1580: goto -822 -> 758
    //   1583: astore 9
    //   1585: goto -894 -> 691
    //   1588: goto -1401 -> 187
    //
    // Exception table:
    //   from	to	target	type
    //   531	535	544	java/lang/Exception
    //   574	578	663	java/lang/Exception
    //   408	416	687	java/lang/Exception
    //   724	728	731	java/lang/Exception
    //   408	416	755	finally
    //   762	766	774	java/lang/Exception
    //   418	424	1579	finally
    //   426	438	1579	finally
    //   444	454	1579	finally
    //   456	469	1579	finally
    //   471	499	1579	finally
    //   519	525	1579	finally
    //   527	531	1579	finally
    //   693	720	1579	finally
    //   418	424	1583	java/lang/Exception
    //   426	438	1583	java/lang/Exception
    //   444	454	1583	java/lang/Exception
    //   456	469	1583	java/lang/Exception
    //   471	499	1583	java/lang/Exception
    //   519	525	1583	java/lang/Exception
    //   527	531	1583	java/lang/Exception
  }

  public void onDestroy()
  {
    AppMethodBeat.i(35227);
    super.onDestroy();
    if (this.zKx)
    {
      ab.d("MicroMsg.SendAppMessageWrapperUI", "restore orientation");
      SharedPreferences localSharedPreferences = getSharedPreferences(ah.doA(), 0);
      setRequestedOrientation(1);
      localSharedPreferences.edit().putBoolean("settings_landscape_mode", false).commit();
    }
    AppMethodBeat.o(35227);
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(35228);
    aqX();
    boolean bool = super.onTouchEvent(paramMotionEvent);
    AppMethodBeat.o(35228);
    return bool;
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.transmit.SendAppMessageWrapperUI
 * JD-Core Version:    0.6.2
 */