package com.tencent.mm.plugin.wallet.pwd.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.wallet.pwd.c;
import com.tencent.mm.pluginsdk.wallet.f;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;

@com.tencent.mm.ui.base.a(7)
public class WalletResetPwdAdapterUI extends WalletBaseUI
{
  protected String edV = null;
  protected boolean pQP = false;
  protected com.tencent.mm.plugin.wallet.a pQQ = null;
  protected String tsy = "";

  public final boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    boolean bool = true;
    AppMethodBeat.i(46388);
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      if (!(paramm instanceof com.tencent.mm.plugin.wallet_core.c.a))
        break label94;
      f.akr(((com.tencent.mm.plugin.wallet_core.c.a)paramm).cOS());
      paramString = new Bundle();
      paramString.putString("kreq_token", this.tsy);
      com.tencent.mm.wallet_core.a.a(this, c.class, paramString, null);
      AppMethodBeat.o(46388);
    }
    while (true)
    {
      return bool;
      setResult(-1000);
      h.bQ(this, paramString);
      finish();
      AppMethodBeat.o(46388);
      continue;
      label94: bool = false;
      AppMethodBeat.o(46388);
    }
  }

  public final int getLayoutId()
  {
    return -1;
  }

  public void onBackPressed()
  {
    AppMethodBeat.i(46387);
    if (!this.pQP)
    {
      ab.d("MicroMsg.WalletResetPwdAdapterUI", "back press not lock");
      finish();
      AppMethodBeat.o(46387);
    }
    while (true)
    {
      return;
      ab.d("MicroMsg.WalletResetPwdAdapterUI", "back press but lock");
      AppMethodBeat.o(46387);
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(46384);
    super.onCreate(paramBundle);
    AM(8);
    this.tsy = getIntent().getStringExtra("reset_pwd_token");
    ab.i("MicroMsg.WalletResetPwdAdapterUI", "token_by_resetPwd %s", new Object[] { this.tsy });
    nf(580);
    if (getIntent() == null)
    {
      ab.d("MicroMsg.WalletResetPwdAdapterUI", "func[doCheckPayNetscene] intent null");
      setResult(0);
      finish();
      AppMethodBeat.o(46384);
    }
    while (true)
    {
      return;
      paramBundle = new com.tencent.mm.plugin.wallet_core.c.a(getIntent().getStringExtra("appId"), getIntent().getStringExtra("timeStamp"), getIntent().getStringExtra("nonceStr"), getIntent().getStringExtra("packageExt"), getIntent().getStringExtra("signtype"), getIntent().getStringExtra("paySignature"), getIntent().getStringExtra("url"), 13, "setWCPayPassword", getIntent().getIntExtra("pay_channel", 0));
      paramBundle.eHT = "RemittanceProcess";
      a(paramBundle, true, false);
      AppMethodBeat.o(46384);
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(46386);
    ng(580);
    super.onDestroy();
    AppMethodBeat.o(46386);
  }

  public void onNewIntent(Intent paramIntent)
  {
    AppMethodBeat.i(46385);
    ab.v("MicroMsg.WalletResetPwdAdapterUI", "onNewIntent");
    int i = paramIntent.getIntExtra("RESET_PWD_USER_ACTION", 0);
    if (i == 1)
    {
      setResult(-1);
      finish();
      AppMethodBeat.o(46385);
    }
    while (true)
    {
      return;
      if (i == 2)
      {
        setResult(-1000);
        finish();
        AppMethodBeat.o(46385);
      }
      else
      {
        setResult(0);
        finish();
        AppMethodBeat.o(46385);
      }
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.pwd.ui.WalletResetPwdAdapterUI
 * JD-Core Version:    0.6.2
 */