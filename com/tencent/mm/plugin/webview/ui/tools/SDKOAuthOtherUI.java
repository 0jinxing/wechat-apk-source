package com.tencent.mm.plugin.webview.ui.tools;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextPaint;
import android.view.KeyEvent;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
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
public class SDKOAuthOtherUI extends MMActivity
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
  private SDKOAuthOtherUI.a usv;

  private void ap(int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(7521);
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.SDKOAuthOtherUI", "accept go  MPGdprPolicyUtil.checkPolicy");
    c.a(this, com.tencent.mm.model.gdpr.a.fom, this.appId, new SDKOAuthOtherUI.4(this, paramInt3, paramInt1, paramInt2));
    AppMethodBeat.o(7521);
  }

  public final int getLayoutId()
  {
    return 2130970563;
  }

  public void onCreate(Bundle paramBundle)
  {
    boolean bool = false;
    AppMethodBeat.i(7516);
    super.onCreate(paramBundle);
    xE(getResources().getColor(2131689613));
    dyb();
    setMMTitle(getString(2131301683));
    pP(false);
    b(null, new SDKOAuthOtherUI.1(this));
    paramBundle = getIntent();
    this.appId = paramBundle.getStringExtra("0");
    this.transaction = paramBundle.getStringExtra("1");
    label579: 
    while (true)
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
          localObject1 = (TextView)findViewById(2131827264);
          ((TextView)localObject1).setText(2131301682);
          ((TextView)localObject1).getPaint().setFakeBoldText(true);
          localObject2 = (ImageView)findViewById(2131827262);
          localObject1 = (TextView)findViewById(2131827263);
          localObject3 = new c.a();
          ((c.a)localObject3).ePT = 2131231695;
          ((c.a)localObject3).eQg = getResources().getDimension(2131428616);
          ((c.a)localObject3).eQf = true;
          o.ahp().a(this.usn.wIL, (ImageView)localObject2, ((c.a)localObject3).ahG());
          ((TextView)localObject1).setText(this.usn.fhH);
          localObject3 = (ListView)findViewById(2131827265);
          localObject1 = new LinkedList();
          Iterator localIterator = this.usn.wIK.iterator();
          if (!localIterator.hasNext())
            continue;
          localObject2 = (bew)localIterator.next();
          if ((((bew)localObject2).scope.equals("snsapi_userinfo")) || (((bew)localObject2).scope.equals("snsapi_login")) || (((bew)localObject2).scope.equals("group_sns_login")) || (((bew)localObject2).scope.equals("snsapi_friend")))
            break label579;
          ((LinkedList)localObject1).add(localObject2);
          if (((bew)localObject2).wIR != 3)
            break label579;
          bool = true;
          continue;
        }
      }
      catch (IOException localIOException)
      {
        Object localObject3;
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.SDKOAuthOtherUI", "SdkOauthAuthorizeResp parseFrom byteArray failed");
        continue;
        this.usm = new ag(this, this.appId, this.transaction, this.state);
        continue;
        this.usv = new SDKOAuthOtherUI.a(this, localIOException);
        ((ListView)localObject3).setAdapter(this.usv);
        Button localButton = (Button)findViewById(2131827266);
        Object localObject2 = (Button)findViewById(2131827267);
        int i = paramBundle.getIntExtra("5", -2);
        int j = paramBundle.getIntExtra("6", -2);
        this.startTime = System.currentTimeMillis();
        localButton.setOnClickListener(new SDKOAuthOtherUI.2(this, i, j));
        ((Button)localObject2).setOnClickListener(new SDKOAuthOtherUI.3(this, bool, i, j));
        AppMethodBeat.o(7516);
        return;
      }
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    boolean bool = true;
    AppMethodBeat.i(7519);
    if ((paramInt == 4) && (paramKeyEvent.getRepeatCount() == 0))
    {
      paramKeyEvent = com.tencent.mm.plugin.webview.e.a.uKJ;
      com.tencent.mm.plugin.webview.e.a.a(this.appId, this.startTime, 0, this.accountType, 4, 1, 0);
      this.usm.IH(-2);
      finish();
      AppMethodBeat.o(7519);
    }
    while (true)
    {
      return bool;
      bool = super.onKeyDown(paramInt, paramKeyEvent);
      AppMethodBeat.o(7519);
    }
  }

  public void onPause()
  {
    AppMethodBeat.i(7518);
    super.onPause();
    g.Rg().b(1346, this);
    g.Rg().b(1137, this);
    AppMethodBeat.o(7518);
  }

  public void onResume()
  {
    AppMethodBeat.i(7517);
    super.onResume();
    g.Rg().a(1346, this);
    g.Rg().a(1137, this);
    AppMethodBeat.o(7517);
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(7520);
    if ((paramInt1 != 0) || (paramInt2 != 0))
    {
      com.tencent.mm.plugin.webview.e.a locala = com.tencent.mm.plugin.webview.e.a.uKJ;
      com.tencent.mm.plugin.webview.e.a.a(this.appId, this.startTime, 2, this.accountType, 4, 1, paramInt2);
    }
    if ((paramm instanceof com.tencent.mm.plugin.webview.model.ab))
    {
      this.usm.j(paramInt1, paramInt2, paramString, paramm);
      AppMethodBeat.o(7520);
    }
    while (true)
    {
      return;
      if ((paramm instanceof z))
        this.usm.z(paramInt1, paramInt2, paramString);
      AppMethodBeat.o(7520);
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.SDKOAuthOtherUI
 * JD-Core Version:    0.6.2
 */