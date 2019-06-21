package com.tencent.mm.plugin.wallet_core.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.bp.d;
import com.tencent.mm.g.a.uv;
import com.tencent.mm.g.a.vs;
import com.tencent.mm.protocal.GeneralControlWrapper;
import com.tencent.mm.protocal.JsapiPermissionWrapper;
import com.tencent.mm.protocal.protobuf.nb;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;

@com.tencent.mm.ui.base.a(3)
public class WalletMixOrderInfoUI extends WalletBaseUI
{
  private String appId;
  private String cQF;
  private int cQO;
  private String czZ;
  private String nonceStr;
  private String packageExt;
  private String prepayId;
  private String signType;
  private boolean tHU;
  private boolean tHV;
  private nb tHW;
  private int tHX;
  private com.tencent.mm.sdk.b.c tHY;
  private String timeStamp;

  public WalletMixOrderInfoUI()
  {
    AppMethodBeat.i(47416);
    this.prepayId = null;
    this.appId = null;
    this.timeStamp = null;
    this.nonceStr = null;
    this.packageExt = null;
    this.czZ = null;
    this.signType = null;
    this.cQF = null;
    this.tHY = new WalletMixOrderInfoUI.3(this);
    AppMethodBeat.o(47416);
  }

  private void ada(String paramString)
  {
    AppMethodBeat.i(47421);
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(47421);
    while (true)
    {
      return;
      ab.d("MicroMsg.WalletMixOrderInfoUI", "H5 wallet url: %s", new Object[] { paramString });
      Intent localIntent = new Intent();
      localIntent.putExtra("rawUrl", paramString);
      localIntent.putExtra("showShare", false);
      localIntent.putExtra("show_bottom", false);
      localIntent.putExtra("needRedirect", false);
      localIntent.putExtra("hardcode_jspermission", JsapiPermissionWrapper.vxI);
      localIntent.putExtra("hardcode_general_ctrl", GeneralControlWrapper.vxE);
      d.b(this, "webview", ".ui.tools.WebViewUI", localIntent, 1);
      AppMethodBeat.o(47421);
    }
  }

  private void be(Context paramContext, String paramString)
  {
    AppMethodBeat.i(47422);
    if (!this.tHU)
    {
      vs localvs = new vs();
      localvs.cSF.result = 0;
      com.tencent.mm.sdk.b.a.xxA.m(localvs);
    }
    h.a(paramContext, paramString, "", false, new WalletMixOrderInfoUI.4(this)).setCancelable(false);
    AppMethodBeat.o(47422);
  }

  public final boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(47419);
    boolean bool;
    if ((paramm instanceof com.tencent.mm.plugin.wallet_core.c.c.a))
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        this.tHV = false;
        paramString = new vs();
        paramString.cSF.result = -1;
        com.tencent.mm.sdk.b.a.xxA.m(paramString);
        paramm = ((com.tencent.mm.plugin.wallet_core.c.c.a)paramm).tuL;
        paramString = new Intent(this, WalletMixOrderInfoProxyUI.class);
        paramString.putExtra("key_orders", paramm);
        paramString.putExtra("prepayId", this.prepayId);
        startActivity(paramString);
        setResult(-1);
        finish();
        bool = true;
        AppMethodBeat.o(47419);
      }
    while (true)
    {
      return bool;
      if (this.tHX == 0);
      for (paramInt1 = 0; ; paramInt1 = 1)
      {
        if (paramInt1 == 0)
          break label227;
        ab.d("MicroMsg.WalletMixOrderInfoUI", "retryGetPaidOrderDetailAgain again");
        ab.d("MicroMsg.WalletMixOrderInfoUI", "retryGetPaidOrderDetailAgain：m_currentRetryCount: %d", new Object[] { Integer.valueOf(this.tHX) });
        this.tHX -= 1;
        a(new com.tencent.mm.plugin.wallet_core.c.c.a(this.appId, this.timeStamp, this.nonceStr, this.packageExt, this.prepayId, this.cQO, this.signType, this.cQF), true, false, this.tHW.vRF);
        break;
      }
      label227: this.tHV = false;
      paramm = paramString;
      if (paramString.isEmpty())
        paramm = this.tHW.vRH;
      be(this, paramm);
      break;
      bool = false;
      AppMethodBeat.o(47419);
    }
  }

  public final int getLayoutId()
  {
    return 2130970969;
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(47420);
    if ((paramInt1 == 1) && (paramInt2 == 0))
    {
      ab.d("MicroMsg.WalletMixOrderInfoUI", "requestCode: %d, resultCode: %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
      if (this.tHV)
      {
        com.tencent.mm.sdk.b.a.xxA.d(this.tHY);
        paramIntent = new uv();
        paramIntent.cRF.czZ = this.prepayId;
        paramIntent.cRF.result = 0;
        com.tencent.mm.sdk.b.a.xxA.m(paramIntent);
        finish();
      }
    }
    AppMethodBeat.o(47420);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(47417);
    super.onCreate(paramBundle);
    paramBundle = getIntent();
    this.tHW = new nb();
    this.tHW.vRG = paramBundle.getIntExtra("max_count", 3);
    this.tHW.vRF = paramBundle.getIntExtra("inteval_time", 4);
    this.tHW.vRH = paramBundle.getStringExtra("default_wording");
    if (bo.isNullOrNil(this.tHW.vRH))
      this.tHW.vRH = getString(2131304763);
    this.tHX = this.tHW.vRG;
    this.tHU = paramBundle.getBooleanExtra("is_jsapi_offline_pay", false);
    this.tHV = true;
    String str1;
    if (!this.tHU)
    {
      str1 = paramBundle.getStringExtra("pay_gate_url");
      boolean bool = paramBundle.getBooleanExtra("need_dialog", false);
      String str2 = paramBundle.getStringExtra("dialog_text");
      this.prepayId = paramBundle.getStringExtra("prepayId");
      if (bool)
      {
        h.a(this, str2, "", new WalletMixOrderInfoUI.1(this, str1), new WalletMixOrderInfoUI.2(this)).setCancelable(false);
        com.tencent.mm.sdk.b.a.xxA.c(this.tHY);
        AppMethodBeat.o(47417);
      }
    }
    while (true)
    {
      return;
      ada(str1);
      break;
      this.appId = getIntent().getStringExtra("appId");
      this.timeStamp = getIntent().getStringExtra("timeStamp");
      this.nonceStr = getIntent().getStringExtra("nonceStr");
      this.packageExt = getIntent().getStringExtra("packageExt");
      this.czZ = getIntent().getStringExtra("reqKey");
      this.cQO = getIntent().getIntExtra("payScene", -1);
      this.signType = getIntent().getStringExtra("signtype");
      this.cQF = getIntent().getStringExtra("paySignature");
      if ((this.cQO == 2) && (bo.isNullOrNil(this.prepayId)))
      {
        a(new com.tencent.mm.plugin.wallet_core.c.c.a(this.appId, this.timeStamp, this.nonceStr, this.packageExt, this.czZ, this.cQO, this.signType, this.cQF), true, false);
        AppMethodBeat.o(47417);
      }
      else
      {
        be(this, getString(2131305088));
        AppMethodBeat.o(47417);
      }
    }
  }

  public void onResume()
  {
    AppMethodBeat.i(47418);
    super.onResume();
    AppMethodBeat.o(47418);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.WalletMixOrderInfoUI
 * JD-Core Version:    0.6.2
 */