package com.tencent.mm.plugin.webview.ui.tools;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextPaint;
import android.view.KeyEvent;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.at.a.a.c.a;
import com.tencent.mm.at.o;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.gdpr.c;
import com.tencent.mm.plugin.webview.model.ag;
import com.tencent.mm.plugin.webview.model.z;
import com.tencent.mm.protocal.protobuf.bew;
import com.tencent.mm.protocal.protobuf.buo;
import com.tencent.mm.ui.MMActivity;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;

@com.tencent.mm.ui.base.a(3)
public class SDKOAuthFriendUI extends MMActivity
  implements f
{
  private int accountType = 2;
  private String appId;
  private String cOG;
  private long startTime;
  private String state;
  private String transaction;
  private ag usm;
  private buo usn;
  private int uso;
  private boolean usp = false;

  private void Jk(int paramInt)
  {
    AppMethodBeat.i(7501);
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.SDKOAuthFriendUI", "accept go  MPGdprPolicyUtil.checkPolicy");
    c.a(this, com.tencent.mm.model.gdpr.a.fom, this.appId, new SDKOAuthFriendUI.5(this, paramInt));
    AppMethodBeat.o(7501);
  }

  private void a(buo parambuo, Class<?> paramClass, int paramInt)
  {
    AppMethodBeat.i(7502);
    paramClass = new Intent(this, paramClass);
    paramClass.putExtra("0", this.appId);
    paramClass.putExtra("1", this.transaction);
    paramClass.putExtra("4", this.state);
    paramClass.putExtra("6", paramInt);
    paramClass.putExtra("auth_raw_url", this.cOG);
    paramClass.putExtra("auth_from_scan", this.usp);
    try
    {
      paramClass.putExtra("2", parambuo.toByteArray());
      startActivity(paramClass);
      AppMethodBeat.o(7502);
      return;
    }
    catch (IOException parambuo)
    {
      while (true)
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.SDKOAuthFriendUI", "SdkOauthAuthorizeResp toByteArray failed");
    }
  }

  private void a(buo parambuo, Class<?> paramClass, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(7503);
    paramClass = new Intent(this, paramClass);
    paramClass.putExtra("0", this.appId);
    paramClass.putExtra("1", this.transaction);
    paramClass.putExtra("4", this.state);
    paramClass.putExtra("3", paramInt1);
    paramClass.putExtra("5", paramInt2);
    paramClass.putExtra("6", paramInt3);
    paramClass.putExtra("auth_raw_url", this.cOG);
    paramClass.putExtra("auth_from_scan", this.usp);
    try
    {
      paramClass.putExtra("2", parambuo.toByteArray());
      startActivity(paramClass);
      AppMethodBeat.o(7503);
      return;
    }
    catch (IOException parambuo)
    {
      while (true)
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.SDKOAuthFriendUI", "SdkOauthAuthorizeResp toByteArray failed");
    }
  }

  private void gy(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(7500);
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.SDKOAuthFriendUI", "accept go  MPGdprPolicyUtil.checkPolicy");
    c.a(this, com.tencent.mm.model.gdpr.a.fom, this.appId, new SDKOAuthFriendUI.4(this, paramInt1, paramInt2));
    AppMethodBeat.o(7500);
  }

  public final int getLayoutId()
  {
    return 2130970562;
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(7495);
    super.onCreate(paramBundle);
    xE(getResources().getColor(2131689613));
    dyb();
    setMMTitle(getString(2131301683));
    pP(false);
    b(null, new SDKOAuthFriendUI.1(this));
    paramBundle = getIntent();
    this.appId = paramBundle.getStringExtra("0");
    this.transaction = paramBundle.getStringExtra("1");
    try
    {
      Object localObject1 = new com/tencent/mm/protocal/protobuf/buo;
      ((buo)localObject1).<init>();
      this.usn = ((buo)((buo)localObject1).parseFrom(paramBundle.getByteArrayExtra("2")));
      this.state = paramBundle.getStringExtra("4");
      this.usp = paramBundle.getBooleanExtra("auth_from_scan", false);
      if (this.usp)
      {
        this.accountType = 3;
        this.cOG = paramBundle.getStringExtra("auth_raw_url");
        this.usm = new ag(this, this.appId, this.cOG);
        this.uso = paramBundle.getIntExtra("3", -1);
        localObject3 = (TextView)findViewById(2131827259);
        localObject1 = this.usn.wIK.iterator();
        while (((Iterator)localObject1).hasNext())
        {
          localObject4 = (bew)((Iterator)localObject1).next();
          if (((bew)localObject4).scope.equals("snsapi_friend"))
            ((TextView)localObject3).setText(((bew)localObject4).desc);
        }
      }
    }
    catch (IOException localIOException)
    {
      while (true)
      {
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.SDKOAuthFriendUI", "SdkOauthAuthorizeResp parseFrom byteArray failed");
        continue;
        this.usm = new ag(this, this.appId, this.transaction, this.state);
      }
      ((TextView)localObject3).getPaint().setFakeBoldText(true);
      Object localObject4 = (ImageView)findViewById(2131827257);
      Object localObject3 = (TextView)findViewById(2131827258);
      Object localObject2 = new c.a();
      ((c.a)localObject2).ePT = 2131231695;
      ((c.a)localObject2).eQg = getResources().getDimension(2131428616);
      ((c.a)localObject2).eQf = true;
      o.ahp().a(this.usn.wIL, (ImageView)localObject4, ((c.a)localObject2).ahG());
      ((TextView)localObject3).setText(this.usn.fhH);
      localObject4 = (Button)findViewById(2131827260);
      localObject3 = (Button)findViewById(2131827261);
      localObject2 = ag.d("snsapi_friend", this.usn.wIK);
      int i = paramBundle.getIntExtra("5", -1);
      this.startTime = System.currentTimeMillis();
      ((Button)localObject4).setOnClickListener(new SDKOAuthFriendUI.2(this, i));
      ((Button)localObject3).setOnClickListener(new SDKOAuthFriendUI.3(this, (bew)localObject2, i));
      AppMethodBeat.o(7495);
    }
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    boolean bool = true;
    AppMethodBeat.i(7498);
    if ((paramInt == 4) && (paramKeyEvent.getRepeatCount() == 0))
    {
      this.usm.IH(-2);
      paramKeyEvent = com.tencent.mm.plugin.webview.e.a.uKJ;
      com.tencent.mm.plugin.webview.e.a.a(this.appId, this.startTime, 0, this.accountType, 3, 1, 0);
      finish();
      AppMethodBeat.o(7498);
    }
    while (true)
    {
      return bool;
      bool = super.onKeyDown(paramInt, paramKeyEvent);
      AppMethodBeat.o(7498);
    }
  }

  public void onPause()
  {
    AppMethodBeat.i(7497);
    super.onPause();
    g.Rg().b(1346, this);
    g.Rg().b(1137, this);
    AppMethodBeat.o(7497);
  }

  public void onResume()
  {
    AppMethodBeat.i(7496);
    super.onResume();
    g.Rg().a(1346, this);
    g.Rg().a(1137, this);
    AppMethodBeat.o(7496);
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(7499);
    if ((paramInt1 != 0) || (paramInt2 != 0))
    {
      com.tencent.mm.plugin.webview.e.a locala = com.tencent.mm.plugin.webview.e.a.uKJ;
      com.tencent.mm.plugin.webview.e.a.a(this.appId, this.startTime, 2, this.accountType, 3, 1, paramInt2);
    }
    if ((paramm instanceof com.tencent.mm.plugin.webview.model.ab))
    {
      this.usm.j(paramInt1, paramInt2, paramString, paramm);
      AppMethodBeat.o(7499);
    }
    while (true)
    {
      return;
      if ((paramm instanceof z))
        this.usm.z(paramInt1, paramInt2, paramString);
      AppMethodBeat.o(7499);
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.SDKOAuthFriendUI
 * JD-Core Version:    0.6.2
 */