package com.tencent.mm.ui.chatting.c;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.j.b;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.g.c.s;
import com.tencent.mm.model.ag;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.bf;
import com.tencent.mm.model.bv;
import com.tencent.mm.model.t;
import com.tencent.mm.opensdk.modelmsg.WXAppExtendObject;
import com.tencent.mm.opensdk.modelmsg.WXFileObject;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject;
import com.tencent.mm.pluginsdk.model.app.aj;
import com.tencent.mm.pluginsdk.model.app.am;
import com.tencent.mm.pluginsdk.model.app.f;
import com.tencent.mm.pluginsdk.model.app.i;
import com.tencent.mm.pluginsdk.model.app.l;
import com.tencent.mm.pluginsdk.model.app.p;
import com.tencent.mm.pluginsdk.r;
import com.tencent.mm.pluginsdk.r.a;
import com.tencent.mm.sdk.e.k.a;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bi;
import com.tencent.mm.storage.u;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.MMFragment;
import com.tencent.mm.ui.chatting.BaseChattingUIFragment;
import com.tencent.mm.ui.chatting.ao;
import com.tencent.mm.ui.chatting.ar;
import com.tencent.mm.ui.chatting.as;
import com.tencent.mm.vfs.e;
import java.io.UnsupportedEncodingException;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

@com.tencent.mm.ui.chatting.c.a.a(dFp=com.tencent.mm.ui.chatting.c.b.b.class)
public class b extends a
  implements com.tencent.mm.ui.chatting.c.b.b
{
  private com.tencent.mm.plugin.wallet.a pQU;
  private ar yNS;
  private final k.a yNT;
  private final k.a yNU;

  public b()
  {
    AppMethodBeat.i(31181);
    this.pQU = null;
    this.yNS = null;
    this.yNT = new b.1(this);
    this.yNU = new k.a()
    {
      public final void a(String paramAnonymousString, com.tencent.mm.sdk.e.m paramAnonymousm)
      {
        AppMethodBeat.i(31179);
        ab.v("MicroMsg.ChattingUI.AppMsgComponent", "app info watcher notify");
        ((com.tencent.mm.ui.chatting.c.b.h)b.this.cgL.aF(com.tencent.mm.ui.chatting.c.b.h.class)).dCT();
        AppMethodBeat.o(31179);
      }
    };
    AppMethodBeat.o(31181);
  }

  private boolean a(bi parambi, f paramf)
  {
    AppMethodBeat.i(31186);
    boolean bool;
    if ((!parambi.field_talker.endsWith("@qqim")) || (!paramf.field_packageName.equals("com.tencent.mobileqq")))
    {
      AppMethodBeat.o(31186);
      bool = false;
      return bool;
    }
    ab.d("MicroMsg.ChattingUI.AppMsgComponent", "jacks open QQ");
    parambi = new Intent("android.intent.action.MAIN", null);
    parambi.addCategory("android.intent.category.LAUNCHER");
    parambi.addFlags(268435456);
    parambi.setClassName("com.tencent.mobileqq", aO(this.cgL.yTx.getContext(), "com.tencent.mobileqq"));
    parambi.putExtra("platformId", "wechat");
    aw.ZK();
    paramf = com.tencent.mm.model.c.Ry().get(9, null);
    if ((paramf != null) && ((paramf instanceof Integer)));
    for (int i = ((Integer)paramf).intValue(); ; i = 0)
      while (true)
      {
        if (i != 0);
        try
        {
          byte[] arrayOfByte = String.valueOf(i).getBytes("utf-8");
          paramf = "asdfghjkl;'".getBytes("utf-8");
          int j = paramf.length;
          int k = 0;
          for (i = 0; k < j; i++)
          {
            int m = paramf[k];
            if (i >= arrayOfByte.length)
              break;
            arrayOfByte[i] = ((byte)(byte)(m ^ arrayOfByte[i]));
            k++;
          }
          parambi.putExtra("tencent_gif", arrayOfByte);
        }
        catch (UnsupportedEncodingException paramf)
        {
          try
          {
            while (true)
            {
              this.cgL.yTx.startActivity(parambi);
              label237: bool = true;
              AppMethodBeat.o(31186);
              break;
              paramf = paramf;
              ab.printErrStackTrace("MicroMsg.ChattingUI.AppMsgComponent", paramf, "", new Object[0]);
            }
          }
          catch (Exception parambi)
          {
            break label237;
          }
        }
      }
  }

  private static String aO(Context paramContext, String paramString)
  {
    AppMethodBeat.i(31187);
    paramContext = paramContext.getPackageManager();
    try
    {
      PackageInfo localPackageInfo = paramContext.getPackageInfo(paramString, 0);
      paramString = new android/content/Intent;
      paramString.<init>("android.intent.action.MAIN", null);
      paramString.addCategory("android.intent.category.LAUNCHER");
      paramString.setPackage(localPackageInfo.packageName);
      paramContext = (ResolveInfo)paramContext.queryIntentActivities(paramString, 0).iterator().next();
      if (paramContext != null)
      {
        paramContext = paramContext.activityInfo.name;
        AppMethodBeat.o(31187);
        return paramContext;
      }
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.ChattingUI.AppMsgComponent", paramContext, "", new Object[0]);
        paramContext = null;
      }
    }
  }

  private void dDi()
  {
    AppMethodBeat.i(31182);
    if (this.yNS != null)
      ar.b(this.yNS);
    if (aw.RK())
    {
      am.aUq().d(this.yNT);
      am.bYJ().d(this.yNU);
    }
    AppMethodBeat.o(31182);
  }

  private void r(f paramf)
  {
    AppMethodBeat.i(31184);
    if ((paramf == null) || (bo.isNullOrNil(paramf.field_appId)))
    {
      ab.e("MicroMsg.ChattingUI.AppMsgComponent", "jumpServiceH5 error args");
      AppMethodBeat.o(31184);
    }
    while (true)
    {
      return;
      if (!bo.isNullOrNil(paramf.dnu))
        break;
      ab.e("MicroMsg.ChattingUI.AppMsgComponent", "ForwardUrl is null");
      AppMethodBeat.o(31184);
    }
    Object localObject1 = this.cgL.yTx.getContext().getSharedPreferences(ah.doA(), 0);
    this.cgL.yTx.getContext();
    Object localObject2 = aa.g((SharedPreferences)localObject1);
    localObject1 = localObject2;
    if ("language_default".equalsIgnoreCase((String)localObject2))
    {
      localObject1 = localObject2;
      if (Locale.getDefault() != null)
        localObject1 = Locale.getDefault().toString();
    }
    if (t.kH(this.cgL.getTalkerUserName()))
    {
      aw.ZK();
      localObject2 = com.tencent.mm.model.c.XV().oa(this.cgL.getTalkerUserName());
      if (localObject2 == null);
    }
    for (int i = ((u)localObject2).afg().size(); ; i = 1)
    {
      Intent localIntent = new Intent();
      localObject2 = new Bundle();
      ((Bundle)localObject2).putString("jsapi_args_appid", paramf.field_appId);
      ((Bundle)localObject2).putBoolean("isFromService", true);
      localIntent.putExtra("forceHideShare", true);
      ((Bundle)localObject2).putString("sendAppMsgToUserName", this.cgL.sRl.field_username);
      localIntent.putExtra("jsapiargs", (Bundle)localObject2);
      localIntent.putExtra("show_bottom", false);
      localIntent.putExtra("rawUrl", String.format("%s&wxchatmembers=%s&lang=%s", new Object[] { paramf.dnu, Integer.valueOf(i), localObject1 }));
      com.tencent.mm.bp.d.b(this.cgL.yTx.getContext(), "webview", ".ui.tools.WebViewUI", localIntent);
      AppMethodBeat.o(31184);
      break;
    }
  }

  public final void a(com.tencent.mm.pluginsdk.ui.tools.o paramo)
  {
    AppMethodBeat.i(31188);
    bv.aaq().c(38, new Object[] { Integer.valueOf(1) });
    Object localObject = paramo.filePath;
    paramo = new WXMediaMessage(new WXFileObject((String)localObject));
    localObject = new com.tencent.mm.vfs.b((String)localObject);
    paramo.title = ((com.tencent.mm.vfs.b)localObject).getName();
    paramo.description = bo.ga(((com.tencent.mm.vfs.b)localObject).length());
    localObject = new f();
    ((f)localObject).field_appId = "wx4310bbd51be7d979";
    am.bYJ().b((com.tencent.mm.sdk.e.c)localObject, new String[0]);
    l.a(paramo, ((f)localObject).field_appId, ((f)localObject).field_appName, this.cgL.getTalkerUserName(), 2, null);
    AppMethodBeat.o(31188);
  }

  public final void a(bi parambi, aj paramaj)
  {
    AppMethodBeat.i(31185);
    Object localObject1 = parambi.field_content;
    Object localObject2;
    if (parambi.field_isSend == 0)
    {
      localObject2 = this.cgL;
      int i = parambi.field_isSend;
      if ((!((com.tencent.mm.ui.chatting.c.b.d)((com.tencent.mm.ui.chatting.d.a)localObject2).aF(com.tencent.mm.ui.chatting.c.b.d.class)).dDn()) && (((com.tencent.mm.ui.chatting.d.a)localObject2).dFw()) && (localObject1 != null) && (i == 0))
        localObject1 = bf.oz((String)localObject1);
    }
    while (true)
    {
      j.b localb = j.b.me((String)localObject1);
      f localf = com.tencent.mm.pluginsdk.model.app.g.bT(localb.appId, true);
      if ((localf != null) && (p.u(this.cgL.yTx.getContext(), localf.field_packageName)))
        if (localf.field_status == 3)
        {
          ab.e("MicroMsg.ChattingUI.AppMsgComponent", "requestAppShow fail, app is in blacklist, packageName = " + localf.field_packageName);
          AppMethodBeat.o(31185);
        }
      while (true)
      {
        return;
        if (!p.b(this.cgL.yTx.getContext(), localf))
        {
          ab.e("MicroMsg.ChattingUI.AppMsgComponent", "The app %s signature is incorrect.", new Object[] { localf.field_appName });
          Toast.makeText(this.cgL.yTx.getContext(), this.cgL.yTx.getMMResources().getString(2131300276, new Object[] { com.tencent.mm.pluginsdk.model.app.g.b(this.cgL.yTx.getContext(), localf, null) }), 1).show();
          AppMethodBeat.o(31185);
        }
        else if (a(parambi, localf))
        {
          AppMethodBeat.o(31185);
        }
        else
        {
          localObject2 = new WXAppExtendObject();
          ((WXAppExtendObject)localObject2).extInfo = localb.extInfo;
          if ((localb.csD != null) && (localb.csD.length() > 0))
          {
            localObject1 = am.aUq().aiE(localb.csD);
            if (localObject1 != null)
              break label462;
          }
          label462: for (localObject1 = null; ; localObject1 = ((com.tencent.mm.pluginsdk.model.app.b)localObject1).field_fileFullPath)
          {
            ((WXAppExtendObject)localObject2).filePath = ((String)localObject1);
            localObject1 = new WXMediaMessage();
            ((WXMediaMessage)localObject1).sdkVer = 620954368;
            ((WXMediaMessage)localObject1).mediaObject = ((WXMediaMessage.IMediaObject)localObject2);
            ((WXMediaMessage)localObject1).title = localb.title;
            ((WXMediaMessage)localObject1).description = localb.description;
            ((WXMediaMessage)localObject1).messageAction = localb.messageAction;
            ((WXMediaMessage)localObject1).messageExt = localb.messageExt;
            ((WXMediaMessage)localObject1).thumbData = e.e(com.tencent.mm.at.o.ahl().sj(parambi.field_imgPath), 0, -1);
            new as(this.cgL.yTx.getContext()).a(localf.field_packageName, (WXMediaMessage)localObject1, localf.field_appId, localf.field_openId, paramaj);
            AppMethodBeat.o(31185);
            break;
          }
          parambi = p.C(this.cgL.yTx.getContext(), localb.appId, "message");
          paramaj = new Intent();
          paramaj.putExtra("rawUrl", parambi);
          com.tencent.mm.bp.d.b(this.cgL.yTx.getContext(), "webview", ".ui.tools.WebViewUI", paramaj);
          AppMethodBeat.o(31185);
        }
      }
    }
  }

  public final void dDh()
  {
    AppMethodBeat.i(31193);
    super.dDh();
    dDi();
    AppMethodBeat.o(31193);
  }

  public final void dxB()
  {
    AppMethodBeat.i(31191);
    ao.clear();
    AppMethodBeat.o(31191);
  }

  public final void dxC()
  {
    AppMethodBeat.i(31192);
    dDi();
    AppMethodBeat.o(31192);
  }

  public final void dxz()
  {
    AppMethodBeat.i(31190);
    this.pQU = com.tencent.mm.plugin.wallet.a.dq(this.cgL.sRl.field_username, 1);
    this.pQU.bs(1, this.cgL.sRl.field_username);
    am.aUq().c(this.yNT);
    am.bYJ().c(this.yNU);
    if (this.yNS == null)
      this.yNS = new ar(this.cgL);
    ar.a(this.yNS);
    AppMethodBeat.o(31190);
  }

  public final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(31189);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    switch (paramInt1)
    {
    default:
    case 210:
    case 222:
    }
    while (true)
    {
      AppMethodBeat.o(31189);
      String str1;
      String str2;
      while (true)
      {
        return;
        if (paramInt2 == -1)
        {
          long l = paramIntent.getLongExtra("App_MsgId", 0L);
          aw.ZK();
          a(com.tencent.mm.model.c.XO().jf(l), null);
        }
        AppMethodBeat.o(31189);
        continue;
        if ((paramInt2 != -1) || (paramIntent == null))
          break;
        str1 = paramIntent.getStringExtra("service_app_package_name");
        str2 = paramIntent.getStringExtra("service_app_openid");
        paramIntent = paramIntent.getStringExtra("service_app_appid");
        if (this.yNS != null);
        for (bool = true; ; bool = false)
        {
          ab.i("MicroMsg.ChattingUI.AppMsgComponent", "request send wx msg, wxmessage[%b], package[%s], appId[%s], openId[%s]", new Object[] { Boolean.valueOf(bool), str1, paramIntent, str2 });
          if (!bo.isNullOrNil(paramIntent))
            break label199;
          ab.e("MicroMsg.ChattingUI.AppMsgComponent", "REQUEST_CODE_SERVICE_APP openId is null");
          AppMethodBeat.o(31189);
          break;
        }
        label199: if ((this.yNS == null) || (bo.isNullOrNil(str1)))
        {
          r(com.tencent.mm.pluginsdk.model.app.g.bT(paramIntent, true));
          AppMethodBeat.o(31189);
        }
        else
        {
          if (!bo.isNullOrNil(str2))
            break label264;
          am.bYL().wy(paramIntent);
          ab.e("MicroMsg.ChattingUI.AppMsgComponent", "request send wx msg fail, openId is null, go get it");
          AppMethodBeat.o(31189);
        }
      }
      label264: boolean bool = this.yNS.im(str1, str2);
      ab.d("MicroMsg.ChattingUI.AppMsgComponent", "request send wx msg success = %b", new Object[] { Boolean.valueOf(bool) });
      if (!bool)
        r(com.tencent.mm.pluginsdk.model.app.g.bT(paramIntent, true));
    }
  }

  public final void q(f paramf)
  {
    AppMethodBeat.i(31183);
    if (paramf == null)
    {
      ab.e("MicroMsg.ChattingUI.AppMsgComponent", "onAppSelected, info is null, %s", new Object[] { bo.dpG() });
      AppMethodBeat.o(31183);
    }
    while (true)
    {
      return;
      if ((paramf != null) && (f.vbQ.equals(paramf.field_appId)) && (this.pQU != null))
        this.pQU.bs(2, this.cgL.sRl.field_username);
      if (paramf.dhx())
      {
        if ((paramf == null) || (!paramf.dhx()))
        {
          ab.e("MicroMsg.ChattingUI.AppMsgComponent", "serviceAppSelect not service app");
          AppMethodBeat.o(31183);
        }
        else if ((this.cgL.sRl == null) || (bo.isNullOrNil(this.cgL.sRl.field_username)))
        {
          ab.e("MicroMsg.ChattingUI.AppMsgComponent", "serviceAppSelect talker is null");
          AppMethodBeat.o(31183);
        }
        else
        {
          ab.i("MicroMsg.ChattingUI.AppMsgComponent", "serviceApp, jumpType[%d], package[%s], appid[%s]", new Object[] { Integer.valueOf(paramf.dnv), paramf.field_packageName, paramf.field_appId });
          if ((paramf.dnv == 2) && (!bo.isNullOrNil(paramf.dnu)))
          {
            r(paramf);
            AppMethodBeat.o(31183);
          }
          else if (paramf.dnv == 3)
          {
            if (bo.isNullOrNil(paramf.field_openId))
            {
              am.bYL().wy(paramf.field_appId);
              ab.e("MicroMsg.ChattingUI.AppMsgComponent", "JUMP 3RD APP fail, openId is null, go get it");
              AppMethodBeat.o(31183);
            }
            else if ((this.yNS == null) || (bo.isNullOrNil(paramf.field_packageName)))
            {
              ab.e("MicroMsg.ChattingUI.AppMsgComponent", "JUMP 3RD APP fail");
              r(paramf);
              AppMethodBeat.o(31183);
            }
            else
            {
              boolean bool = this.yNS.im(paramf.field_packageName, paramf.field_openId);
              ab.i("MicroMsg.ChattingUI.AppMsgComponent", "JUMP 3RD APP success[%s]", new Object[] { Boolean.valueOf(bool) });
              if (!bool)
                r(paramf);
              AppMethodBeat.o(31183);
            }
          }
          else
          {
            if (paramf.dnv == 1)
            {
              ab.i("MicroMsg.ChattingUI.AppMsgComponent", "JUMP NATIVE ForwardUrl[%s]", new Object[] { paramf.dnu });
              r.a.vax.a(this.cgL.yTx.getContext(), paramf.dnu, false, new b.3(this));
            }
            AppMethodBeat.o(31183);
          }
        }
      }
      else if (paramf.field_status == 3)
      {
        ab.e("MicroMsg.ChattingUI.AppMsgComponent", "onAppSeleted fail, app is in blacklist, packageName = " + paramf.field_packageName);
        AppMethodBeat.o(31183);
      }
      else if ((!this.yNS.im(paramf.field_packageName, paramf.field_openId)) && (paramf.field_status == 5))
      {
        ab.d("MicroMsg.ChattingUI.AppMsgComponent", "SuggestionApp appSuggestionIntroUrl = %s", new Object[] { paramf.dni });
        if (bo.isNullOrNil(paramf.dni))
        {
          AppMethodBeat.o(31183);
        }
        else
        {
          Intent localIntent = new Intent();
          localIntent.putExtra("rawUrl", paramf.dni);
          com.tencent.mm.bp.d.b(this.cgL.yTx.getContext(), "webview", ".ui.tools.WebViewUI", localIntent);
        }
      }
      else
      {
        AppMethodBeat.o(31183);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.c.b
 * JD-Core Version:    0.6.2
 */