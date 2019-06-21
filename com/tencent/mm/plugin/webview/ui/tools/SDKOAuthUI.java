package com.tencent.mm.plugin.webview.ui.tools;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextPaint;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.m;
import com.tencent.mm.at.a.a.c.a;
import com.tencent.mm.at.o;
import com.tencent.mm.bp.d;
import com.tencent.mm.g.a.hh;
import com.tencent.mm.kernel.e;
import com.tencent.mm.model.gdpr.c;
import com.tencent.mm.opensdk.channel.MMessageActV2;
import com.tencent.mm.opensdk.channel.MMessageActV2.Args;
import com.tencent.mm.opensdk.modelmsg.SendAuth.Req;
import com.tencent.mm.opensdk.modelmsg.SendAuth.Resp;
import com.tencent.mm.plugin.webview.model.ag;
import com.tencent.mm.plugin.webview.model.i;
import com.tencent.mm.plugin.webview.model.y;
import com.tencent.mm.protocal.protobuf.bet;
import com.tencent.mm.protocal.protobuf.bew;
import com.tencent.mm.protocal.protobuf.bnb;
import com.tencent.mm.protocal.protobuf.bum;
import com.tencent.mm.protocal.protobuf.buo;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.n.d;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;

@com.tencent.mm.ui.base.a(3)
public final class SDKOAuthUI extends MMActivity
  implements com.tencent.mm.ai.f
{
  private static int usH;
  private int accountType;
  private String cOG;
  private com.tencent.mm.ui.base.p ejZ;
  private int jLX;
  private int jLY;
  private n.d jOb;
  private String mAppId;
  private long startTime;
  private boolean ump;
  private SendAuth.Req usF;
  private int usG;
  private ap usI;
  private SDKOAuthUI.a usJ;
  private SDKOAuthUI.b usK;
  private com.tencent.mm.ui.widget.b.a usL;
  private boolean usM;
  private ag usN;
  private boolean usO;
  private String usP;
  private boolean usp;

  public SDKOAuthUI()
  {
    AppMethodBeat.i(7551);
    this.usO = true;
    this.usp = false;
    this.accountType = 2;
    this.jOb = new SDKOAuthUI.6(this);
    AppMethodBeat.o(7551);
  }

  private void IH(int paramInt)
  {
    Object localObject = null;
    AppMethodBeat.i(7559);
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.SdkOAuthUI", "dealWithCancel");
    if (this.usp)
    {
      localObject = new com.tencent.mm.plugin.webview.model.z(2, this.cOG, null, 0);
      com.tencent.mm.kernel.g.Rg().a((m)localObject, 0);
      AppMethodBeat.o(7559);
    }
    while (true)
    {
      return;
      if (this.usF != null)
        break;
      AppMethodBeat.o(7559);
    }
    String str1 = aer(this.mAppId);
    String str2 = this.mAppId;
    String str3 = this.usF.state;
    if (this.usJ == null);
    while (true)
    {
      localObject = new com.tencent.mm.plugin.webview.model.ab(2, str2, str3, str1, (LinkedList)localObject);
      com.tencent.mm.kernel.g.Rg().a((m)localObject, 0);
      localObject = new SendAuth.Resp();
      ((SendAuth.Resp)localObject).transaction = this.usF.transaction;
      ((SendAuth.Resp)localObject).errCode = paramInt;
      ((SendAuth.Resp)localObject).lang = cXI();
      ((SendAuth.Resp)localObject).country = getCountry();
      a(str1, (SendAuth.Resp)localObject);
      AppMethodBeat.o(7559);
      break;
      localObject = this.usJ.cZG();
    }
  }

  private boolean II(int paramInt)
  {
    boolean bool = false;
    AppMethodBeat.i(7569);
    if ((paramInt == 1) || (paramInt == 2) || (paramInt == 7) || (paramInt == 8))
    {
      com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.SdkOAuthUI", "isNetworkAvailable false, errType = ".concat(String.valueOf(paramInt)));
      AppMethodBeat.o(7569);
    }
    while (true)
    {
      return bool;
      if (!at.isConnected(this))
      {
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.SdkOAuthUI", "isNetworkAvailable false, not connected");
        AppMethodBeat.o(7569);
      }
      else
      {
        AppMethodBeat.o(7569);
        bool = true;
      }
    }
  }

  private void a(int paramInt1, int paramInt2, String paramString, buo parambuo)
  {
    AppMethodBeat.i(7557);
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.SdkOAuthUI", "onSDKOauthAuthorizeEnd errType:%d errCode:%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    cZx();
    this.startTime = System.currentTimeMillis();
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.SdkOAuthUI", "onSDKOauthAuthorizeEnd is_use_newpage %b", new Object[] { Boolean.valueOf(parambuo.wWf) });
      this.usP = parambuo.wPV;
      if ((parambuo.wIM) || (parambuo.wIN))
      {
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.SdkOAuthUI", "onSDKOauthAuthorizeEnd direct login");
        c.a(this, com.tencent.mm.model.gdpr.a.fom, this.mAppId, new SDKOAuthUI.7(this, parambuo));
        AppMethodBeat.o(7557);
      }
    }
    while (true)
    {
      return;
      Object localObject1;
      Object localObject2;
      if (parambuo.wWf)
      {
        if (ag.a(parambuo))
        {
          paramString = (TextView)findViewById(2131827247);
          localObject1 = parambuo.wIK.iterator();
          while (((Iterator)localObject1).hasNext())
          {
            localObject2 = (bew)((Iterator)localObject1).next();
            if (ag.a(parambuo))
              paramString.setText(((bew)localObject2).desc);
          }
          paramString.getPaint().setFakeBoldText(true);
          localObject1 = (ImageView)findViewById(2131827245);
          paramString = (TextView)findViewById(2131827246);
          localObject2 = new c.a();
          ((c.a)localObject2).ePT = 2131231695;
          ((c.a)localObject2).eQg = getResources().getDimension(2131428616);
          ((c.a)localObject2).eQf = true;
          o.ahp().a(parambuo.wIL, (ImageView)localObject1, ((c.a)localObject2).ahG());
          paramString.setText(parambuo.fhH);
          paramString = (Button)findViewById(2131827252);
          localObject1 = (Button)findViewById(2131827253);
          paramString.setOnClickListener(new SDKOAuthUI.9(this, parambuo));
          ((Button)localObject1).setOnClickListener(new SDKOAuthUI.10(this, parambuo));
          usH = parambuo.wPS;
          this.usL = new com.tencent.mm.ui.widget.b.a(this);
          this.usK = new SDKOAuthUI.b(this, parambuo.wPQ, parambuo.wPT);
          cZF();
          paramString = (ListView)findViewById(2131824644);
          paramString.setAdapter(this.usK);
          paramString.setOnItemClickListener(new SDKOAuthUI.11(this));
          paramString.setOnTouchListener(new SDKOAuthUI.12(this));
          paramString.setOnItemLongClickListener(new SDKOAuthUI.13(this));
          findViewById(2131827249).setOnClickListener(new SDKOAuthUI.14(this));
          this.usM = parambuo.wPR;
          if (parambuo.wPR)
            findViewById(2131827248).setVisibility(8);
          findViewById(2131827244).setVisibility(0);
          AppMethodBeat.o(7557);
        }
        else if (ag.d("snsapi_friend", parambuo.wIK) != null)
        {
          a(parambuo, SDKOAuthFriendUI.class);
          ag.ag(this);
          AppMethodBeat.o(7557);
        }
        else
        {
          a(parambuo, SDKOAuthOtherUI.class);
          ag.ag(this);
          AppMethodBeat.o(7557);
        }
      }
      else
      {
        this.usO = false;
        localObject1 = (ImageView)findViewById(2131821137);
        paramString = (TextView)findViewById(2131821138);
        localObject2 = new c.a();
        ((c.a)localObject2).ePT = 2131231695;
        o.ahp().a(parambuo.wIL, (ImageView)localObject1, ((c.a)localObject2).ahG());
        paramString.setText(parambuo.fhH);
        paramString = (ListView)findViewById(2131821140);
        this.usJ = new SDKOAuthUI.a(this, parambuo.wIK);
        paramString.setAdapter(this.usJ);
        ((Button)findViewById(2131825292)).setOnClickListener(new SDKOAuthUI.8(this, parambuo));
        findViewById(2131820987).setVisibility(0);
        AppMethodBeat.o(7557);
        continue;
        if (!II(paramInt1))
        {
          bH(getString(2131305622), true);
          paramString = com.tencent.mm.plugin.webview.e.a.uKJ;
          com.tencent.mm.plugin.webview.e.a.a(this.mAppId, this.startTime, 2, this.accountType, 0, 0, paramInt2);
          AppMethodBeat.o(7557);
        }
        else
        {
          parambuo = com.tencent.mm.plugin.webview.e.a.uKJ;
          com.tencent.mm.plugin.webview.e.a.a(this.mAppId, this.startTime, 2, this.accountType, 0, 0, paramInt2);
          bH(paramString, true);
          AppMethodBeat.o(7557);
        }
      }
    }
  }

  private void a(buo parambuo, Class<?> paramClass)
  {
    AppMethodBeat.i(7562);
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.SdkOAuthUI", "startScopeActivity %s", new Object[] { paramClass.getSimpleName() });
    paramClass = new Intent(this, paramClass);
    paramClass.putExtra("0", this.mAppId);
    if (this.usF != null)
    {
      paramClass.putExtra("1", this.usF.transaction);
      paramClass.putExtra("4", this.usF.state);
    }
    paramClass.putExtra("auth_from_scan", this.usp);
    paramClass.putExtra("auth_raw_url", this.cOG);
    try
    {
      paramClass.putExtra("2", parambuo.toByteArray());
      startActivity(paramClass);
      AppMethodBeat.o(7562);
      return;
    }
    catch (IOException parambuo)
    {
      while (true)
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.SdkOAuthUI", "SdkOauthAuthorizeResp toByteArray failed");
    }
  }

  private void a(buo parambuo, Class<?> paramClass, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(7561);
    paramClass = new Intent(this, paramClass);
    paramClass.putExtra("0", this.mAppId);
    if (this.usF != null)
    {
      paramClass.putExtra("1", this.usF.transaction);
      paramClass.putExtra("4", this.usF.state);
    }
    paramClass.putExtra("3", paramInt1);
    paramClass.putExtra("5", paramInt2);
    paramClass.putExtra("auth_from_scan", this.usp);
    paramClass.putExtra("auth_raw_url", this.cOG);
    try
    {
      paramClass.putExtra("2", parambuo.toByteArray());
      startActivity(paramClass);
      AppMethodBeat.o(7561);
      return;
    }
    catch (IOException parambuo)
    {
      while (true)
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.SdkOAuthUI", "SdkOauthAuthorizeResp toByteArray failed");
    }
  }

  private void a(String paramString, SendAuth.Resp paramResp)
  {
    AppMethodBeat.i(7560);
    if (this.ump)
    {
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.SdkOAuthUI", "doCallback has callback");
      AppMethodBeat.o(7560);
    }
    while (true)
    {
      return;
      if (bo.isNullOrNil(paramString))
      {
        AppMethodBeat.o(7560);
      }
      else
      {
        this.ump = true;
        Bundle localBundle = new Bundle();
        paramResp.toBundle(localBundle);
        com.tencent.mm.pluginsdk.model.app.p.at(localBundle);
        paramResp = new MMessageActV2.Args();
        paramResp.targetPkgName = paramString;
        paramResp.bundle = localBundle;
        MMessageActV2.send(this, paramResp);
        AppMethodBeat.o(7560);
      }
    }
  }

  private static String aer(String paramString)
  {
    AppMethodBeat.i(7572);
    Object localObject = null;
    com.tencent.mm.pluginsdk.model.app.f localf = com.tencent.mm.pluginsdk.model.app.g.bT(paramString, false);
    if (localf != null);
    for (paramString = localf.field_packageName; ; paramString = localObject)
    {
      AppMethodBeat.o(7572);
      return paramString;
      com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.SdkOAuthUI", "dealWithCancel getAppInfo null; appid: %s", new Object[] { paramString });
    }
  }

  private void afA(String paramString)
  {
    String str1 = null;
    AppMethodBeat.i(7558);
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.SdkOAuthUI", "dealWithLoginCallback url : %s", new Object[] { paramString });
    String str2 = aer(this.mAppId);
    if (bo.isNullOrNil(str2))
    {
      com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.SdkOAuthUI", "dealWithLoginCallback pkg nil");
      AppMethodBeat.o(7558);
      return;
    }
    SendAuth.Resp localResp = new SendAuth.Resp();
    localResp.transaction = this.usF.transaction;
    localResp.lang = cXI();
    localResp.country = getCountry();
    if (!bo.isNullOrNil(paramString));
    for (Uri localUri = Uri.parse(paramString); ; localUri = null)
    {
      if (localUri != null)
      {
        str1 = localUri.getQueryParameter("code");
        localResp.state = localUri.getQueryParameter("state");
        localResp.errStr = localUri.getQueryParameter("reason");
      }
      if (bo.isNullOrNil(str1))
        localResp.errCode = -1;
      while (true)
      {
        localResp.url = paramString;
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.SdkOAuthUI", "dealWithLoginCallback, pkg:%s code:%s errCode:%d state:%s", new Object[] { str2, localResp.code, Integer.valueOf(localResp.errCode), localResp.state });
        a(str2, localResp);
        finish();
        AppMethodBeat.o(7558);
        break;
        if (str1.toLowerCase().equals("authdeny"))
        {
          localResp.errCode = -4;
        }
        else
        {
          localResp.errCode = 0;
          localResp.code = str1;
        }
      }
    }
  }

  private void afB(String paramString)
  {
    AppMethodBeat.i(7566);
    h.b(this, paramString, getString(2131301674), true);
    AppMethodBeat.o(7566);
  }

  private void bH(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(7565);
    h.a(this, paramString, getString(2131305621), new SDKOAuthUI.3(this, paramString, paramBoolean));
    AppMethodBeat.o(7565);
  }

  private String cXI()
  {
    AppMethodBeat.i(7570);
    String str = com.tencent.mm.sdk.platformtools.aa.g(getSharedPreferences(ah.doA(), 0));
    AppMethodBeat.o(7570);
    return str;
  }

  private int cZE()
  {
    if (this.usO);
    for (int i = 2; ; i = 1)
      return i;
  }

  private void cZF()
  {
    AppMethodBeat.i(7563);
    if (this.usM)
      AppMethodBeat.o(7563);
    while (true)
    {
      return;
      if (this.usK.getCount() >= usH)
      {
        findViewById(2131827249).setVisibility(8);
        findViewById(2131827250).setVisibility(0);
        findViewById(2131827251).setVisibility(4);
        AppMethodBeat.o(7563);
      }
      else
      {
        findViewById(2131827249).setVisibility(0);
        findViewById(2131827250).setVisibility(8);
        findViewById(2131827251).setVisibility(0);
        AppMethodBeat.o(7563);
      }
    }
  }

  private void cZw()
  {
    AppMethodBeat.i(7567);
    if ((this.ejZ != null) && (!this.ejZ.isShowing()))
    {
      this.ejZ.show();
      AppMethodBeat.o(7567);
    }
    while (true)
    {
      return;
      this.ejZ = h.b(this, getString(2131301856), true, new SDKOAuthUI.4(this));
      AppMethodBeat.o(7567);
    }
  }

  private void cZx()
  {
    AppMethodBeat.i(7568);
    if (this.ejZ == null)
      AppMethodBeat.o(7568);
    while (true)
    {
      return;
      this.ejZ.dismiss();
      AppMethodBeat.o(7568);
    }
  }

  private static String getCountry()
  {
    AppMethodBeat.i(7571);
    String str = bo.bc((String)com.tencent.mm.kernel.g.RP().Ry().get(274436, null), null);
    AppMethodBeat.o(7571);
    return str;
  }

  public final int getLayoutId()
  {
    return 2130970560;
  }

  public final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    int i = 1;
    AppMethodBeat.i(7564);
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.SdkOAuthUI", "onAcvityResult requestCode:%d, resultCode:%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if (paramInt2 != -1)
    {
      com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.SdkOAuthUI", "Create avatar cancel or failed");
      AppMethodBeat.o(7564);
      return;
    }
    switch (paramInt1)
    {
    default:
    case 6:
    }
    label211: 
    while (true)
    {
      AppMethodBeat.o(7564);
      break;
      bet localbet = new bet();
      localbet.id = paramIntent.getIntExtra("id", -1);
      localbet.nickname = paramIntent.getStringExtra("nickname");
      localbet.wrK = paramIntent.getStringExtra("avatarurl");
      localbet.desc = null;
      paramIntent = this.usK;
      if ((localbet.id != -1) && (paramIntent.usV.size() < usH))
        paramIntent.usV.add(localbet);
      for (paramInt1 = i; ; paramInt1 = 0)
      {
        if (paramInt1 == 0)
          break label211;
        SDKOAuthUI.b.a(this.usK, localbet.id);
        cZF();
        this.usK.notifyDataSetChanged();
        break;
      }
    }
  }

  public final void onCreate(Bundle paramBundle)
  {
    Object localObject1 = null;
    AppMethodBeat.i(7552);
    super.onCreate(paramBundle);
    xE(getResources().getColor(2131689613));
    dyb();
    setMMTitle(getString(2131301683));
    pP(false);
    b(null, new SDKOAuthUI.1(this));
    if (!com.tencent.mm.kernel.g.RK())
    {
      com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.SdkOAuthUI", "start, hasSetUin fail");
      Toast.makeText(this, 2131296387, 1).show();
      AppMethodBeat.o(7552);
    }
    while (true)
    {
      return;
      this.ump = false;
      paramBundle = getIntent();
      this.usp = paramBundle.getBooleanExtra("auth_from_scan", false);
      if (this.usp)
      {
        this.accountType = 3;
        this.cOG = paramBundle.getStringExtra("auth_raw_url");
        paramBundle = this.cOG;
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.SdkOAuthUI", "doQRCodeOauthAuthorize url: %s", new Object[] { paramBundle });
        cZw();
        paramBundle = new y(paramBundle);
        com.tencent.mm.kernel.g.Rg().a(paramBundle, 0);
        this.usN = new ag(this, null, this.cOG);
        AppMethodBeat.o(7552);
      }
      else
      {
        paramBundle = getIntent().getExtras();
        str1 = paramBundle.getString("_mmessage_content");
        if (!bo.isNullOrNil(str1))
          break;
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.SdkOAuthUI", "init content is nil");
        AppMethodBeat.o(7552);
      }
    }
    this.mAppId = Uri.parse(str1).getQueryParameter("appid");
    if (bo.isNullOrNil(this.mAppId))
    {
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.SdkOAuthUI", "parseAppId try case not sensitive, content:%s", new Object[] { str1 });
      this.mAppId = Uri.parse(str1.toLowerCase()).getQueryParameter("appid");
    }
    String str1 = this.mAppId;
    Object localObject2 = com.tencent.mm.pluginsdk.model.app.g.bT(str1, false);
    if ((localObject2 != null) && (bo.isNullOrNil(((com.tencent.mm.pluginsdk.model.app.f)localObject2).field_openId)))
    {
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.SdkOAuthUI", "checkGetAppSetting appId: %s ", new Object[] { str1 });
      localObject2 = new hh();
      ((hh)localObject2).cCd.appId = str1;
      com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject2);
    }
    this.usF = new SendAuth.Req(paramBundle);
    this.usN = new ag(this, this.mAppId, this.usF.transaction, this.usF.state);
    str1 = this.mAppId;
    String str2 = this.usF.scope;
    localObject2 = this.usF.state;
    String str3 = aer(this.mAppId);
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.SdkOAuthUI", "doSDKOauthAuthorize appid: %s", new Object[] { str1 });
    cZw();
    if (bo.isNullOrNil(str3))
      paramBundle = localObject1;
    while (true)
    {
      paramBundle = new com.tencent.mm.plugin.webview.model.aa(str1, str2, (String)localObject2, str3, paramBundle);
      com.tencent.mm.kernel.g.Rg().a(paramBundle, 0);
      AppMethodBeat.o(7552);
      break;
      paramBundle = com.tencent.mm.pluginsdk.model.app.p.bx(this, str3);
      if ((paramBundle == null) || (paramBundle.length == 0))
      {
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.SdkOAuthUI", "getSignature signatures failed");
        paramBundle = localObject1;
      }
      else
      {
        paramBundle = com.tencent.mm.a.g.x(paramBundle[0].toByteArray());
      }
    }
  }

  public final void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    AppMethodBeat.i(7574);
    super.onCreateContextMenu(paramContextMenu, paramView, paramContextMenuInfo);
    paramContextMenu.add(0, 1, 0, getString(2131301673));
    AppMethodBeat.o(7574);
  }

  public final void onDestroy()
  {
    AppMethodBeat.i(7555);
    super.onDestroy();
    if (this.ejZ != null)
      this.ejZ.dismiss();
    if (this.usI != null)
      this.usI.stopTimer();
    AppMethodBeat.o(7555);
  }

  public final boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    boolean bool = true;
    AppMethodBeat.i(7556);
    if ((paramInt == 4) && (paramKeyEvent.getRepeatCount() == 0))
    {
      paramKeyEvent = com.tencent.mm.plugin.webview.e.a.uKJ;
      com.tencent.mm.plugin.webview.e.a.a(this.mAppId, this.startTime, 0, this.accountType, cZE(), 1, 0);
      IH(-2);
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.SdkOAuthUI", "key back click");
      finish();
      AppMethodBeat.o(7556);
    }
    while (true)
    {
      return bool;
      bool = super.onKeyDown(paramInt, paramKeyEvent);
      AppMethodBeat.o(7556);
    }
  }

  public final void onPause()
  {
    AppMethodBeat.i(7554);
    super.onPause();
    com.tencent.mm.kernel.g.Rg().b(1388, this);
    com.tencent.mm.kernel.g.Rg().b(1346, this);
    com.tencent.mm.kernel.g.Rg().b(2700, this);
    com.tencent.mm.kernel.g.Rg().b(2543, this);
    com.tencent.mm.kernel.g.Rg().b(1137, this);
    AppMethodBeat.o(7554);
  }

  public final void onResume()
  {
    AppMethodBeat.i(7553);
    super.onResume();
    com.tencent.mm.kernel.g.Rg().a(1346, this);
    com.tencent.mm.kernel.g.Rg().a(1388, this);
    com.tencent.mm.kernel.g.Rg().a(2700, this);
    com.tencent.mm.kernel.g.Rg().a(2543, this);
    com.tencent.mm.kernel.g.Rg().a(1137, this);
    AppMethodBeat.o(7553);
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(7573);
    Object localObject;
    if ((paramm instanceof com.tencent.mm.plugin.webview.model.aa))
    {
      a(paramInt1, paramInt2, paramString, (buo)((com.tencent.mm.plugin.webview.model.aa)paramm).ehh.fsH.fsP);
      if (!(paramm instanceof y))
        break label814;
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.SdkOAuthUI", "onQRCodeOauthAuthorizeEnd errType:%d errCode:%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
      this.startTime = System.currentTimeMillis();
      if ((paramInt1 != 0) || (paramInt2 != 0))
        break label731;
      localObject = (bnb)((y)paramm).ehh.fsH.fsP;
      this.mAppId = ((bnb)localObject).csB;
      this.usN.mAppId = ((bnb)localObject).csB;
      if (!((bnb)localObject).wPP)
        break label565;
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.SdkOAuthUI", "fallback to h5");
      paramInt1 = 1;
      paramString = com.tencent.mm.plugin.webview.e.a.uKJ;
      com.tencent.mm.plugin.webview.e.a.a(this.mAppId, this.startTime, 1, this.accountType, 0, 0, paramInt2);
      d.b(ah.getContext(), "webview", ".ui.tools.WebViewUI", getIntent());
      ag.ag(this);
      label188: if (paramInt1 == 0)
        cZx();
      AppMethodBeat.o(7573);
    }
    while (true)
    {
      return;
      if ((paramm instanceof com.tencent.mm.plugin.webview.model.ab))
      {
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.SdkOAuthUI", "onSDKOauthAuthorizeConfirmEnd errType:%d errCode:%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
        if (this.usI != null)
          this.usI.stopTimer();
        cZx();
        if ((paramInt1 == 0) && (paramInt2 == 0))
        {
          localObject = ((com.tencent.mm.plugin.webview.model.ab)paramm).cXC();
          com.tencent.mm.plugin.webview.e.a locala = com.tencent.mm.plugin.webview.e.a.uKJ;
          com.tencent.mm.plugin.webview.e.a.a(this.mAppId, this.startTime, 1, this.accountType, cZE(), 1, 0);
          afA(((bum)localObject).vGi);
          break;
        }
        if (!II(paramInt1))
        {
          bH(getString(2131305622), false);
          localObject = com.tencent.mm.plugin.webview.e.a.uKJ;
          com.tencent.mm.plugin.webview.e.a.a(this.mAppId, this.startTime, 2, this.accountType, cZE(), 1, paramInt2);
          break;
        }
        bH(paramString, false);
        localObject = com.tencent.mm.plugin.webview.e.a.uKJ;
        com.tencent.mm.plugin.webview.e.a.a(this.mAppId, this.startTime, 2, this.accountType, cZE(), 1, paramInt2);
        break;
      }
      if (!(paramm instanceof i))
        break;
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.SdkOAuthUI", "onAddAvatarEnd errType:%d errCode:%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        if (this.usK.Jm(this.usG).id == SDKOAuthUI.b.a(this.usK))
          SDKOAuthUI.b.a(this.usK, this.usK.Jm(0).id);
        localObject = this.usK;
        int i = this.usG;
        if (!((SDKOAuthUI.b)localObject).usV.remove(((SDKOAuthUI.b)localObject).Jm(i)))
          com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.SdkOAuthUI", "remove avatar failed: not found");
        cZF();
        this.usK.notifyDataSetChanged();
        break;
      }
      if (!II(paramInt1))
      {
        afB(getString(2131305622));
        break;
      }
      afB(paramString);
      break;
      label565: if (localObject == null)
        paramm = null;
      while (true)
      {
        a(paramInt1, paramInt2, paramString, paramm);
        paramInt1 = 0;
        break;
        paramm = new buo();
        paramm.BaseResponse = ((bnb)localObject).BaseResponse;
        paramm.wIM = false;
        paramm.wIN = false;
        paramm.wWf = true;
        paramm.wIO = false;
        paramm.wIK = ((bnb)localObject).wIK;
        paramm.fhH = ((bnb)localObject).fhH;
        paramm.wIL = ((bnb)localObject).wIL;
        paramm.vGi = "";
        paramm.wPQ = ((bnb)localObject).wPQ;
        paramm.wPR = ((bnb)localObject).wPR;
        paramm.wPS = ((bnb)localObject).wPS;
        paramm.wPT = ((bnb)localObject).wPT;
        paramm.wPU = ((bnb)localObject).wPU;
        paramm.wPV = ((bnb)localObject).wPV;
      }
      label731: if (!II(paramInt1))
      {
        bH(getString(2131305622), true);
        paramString = com.tencent.mm.plugin.webview.e.a.uKJ;
        com.tencent.mm.plugin.webview.e.a.a(this.mAppId, this.startTime, 2, this.accountType, 0, 0, paramInt2);
        paramInt1 = 0;
        break label188;
      }
      paramm = com.tencent.mm.plugin.webview.e.a.uKJ;
      com.tencent.mm.plugin.webview.e.a.a(this.mAppId, this.startTime, 2, this.accountType, 0, 0, paramInt2);
      bH(paramString, true);
      paramInt1 = 0;
      break label188;
      label814: if ((paramm instanceof com.tencent.mm.plugin.webview.model.z))
      {
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.SdkOAuthUI", "onQRCodeOauthAuthorizeConfirmEnd errType:%d errCode:%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
        cZx();
        if ((paramInt1 == 0) && (paramInt2 == 0))
        {
          paramString = com.tencent.mm.plugin.webview.e.a.uKJ;
          com.tencent.mm.plugin.webview.e.a.a(this.mAppId, this.startTime, 1, this.accountType, cZE(), 1, 0);
          finish();
          AppMethodBeat.o(7573);
        }
        else if (!II(paramInt1))
        {
          bH(getString(2131305622), false);
          paramString = com.tencent.mm.plugin.webview.e.a.uKJ;
          com.tencent.mm.plugin.webview.e.a.a(this.mAppId, this.startTime, 2, this.accountType, cZE(), 1, paramInt2);
          AppMethodBeat.o(7573);
        }
        else
        {
          bH(paramString, false);
          paramString = com.tencent.mm.plugin.webview.e.a.uKJ;
          com.tencent.mm.plugin.webview.e.a.a(this.mAppId, this.startTime, 2, this.accountType, cZE(), 1, paramInt2);
        }
      }
      else
      {
        AppMethodBeat.o(7573);
      }
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }

  static final class a$a
  {
    TextView jbS;
    ImageView usE;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.SDKOAuthUI
 * JD-Core Version:    0.6.2
 */