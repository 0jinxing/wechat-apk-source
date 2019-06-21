package com.tencent.mm.plugin.wallet_core.id_verify;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.pluginsdk.wallet.f;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;

@com.tencent.mm.ui.base.a(7)
public class WalletRealNameProcessProxyUI extends WalletBaseUI
{
  private void R(Bundle paramBundle)
  {
    AppMethodBeat.i(46616);
    ab.i("MicroMsg.WalletRealNameProcessProxyUI", "goRealNameUI");
    Bundle localBundle = paramBundle;
    if (paramBundle == null)
    {
      ab.i("MicroMsg.WalletRealNameProcessProxyUI", "goRealNameUI, param is null");
      localBundle = new Bundle();
    }
    localBundle.putString("realname_verify_process_jump_plugin", "wallet_core");
    localBundle.putString("realname_verify_process_jump_activity", ".id_verify.WalletRealNameProcessProxyUI");
    localBundle.putBoolean("process_finish_stay_orgpage", false);
    com.tencent.mm.wallet_core.a.a(this, a.class, localBundle);
    AppMethodBeat.o(46616);
  }

  public final boolean bwP()
  {
    return true;
  }

  public final boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(46617);
    boolean bool;
    if ((paramm instanceof com.tencent.mm.plugin.wallet_core.c.a))
    {
      ab.e("MicroMsg.WalletRealNameProcessProxyUI", "NetSceneCheckPayJsapi resp,errType = " + paramInt1 + ",errCode=" + paramInt2);
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        f.akr(((com.tencent.mm.plugin.wallet_core.c.a)paramm).cOS());
        R(this.mBundle);
        bool = true;
        AppMethodBeat.o(46617);
      }
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(46617);
    }
  }

  public final int getLayoutId()
  {
    return -1;
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(46614);
    super.onCreate(paramBundle);
    nf(580);
    paramBundle = this.mBundle;
    if (paramBundle != null);
    for (int i = paramBundle.getInt("realname_scene", 0); ; i = 0)
    {
      int j = i;
      if (i == 0)
        j = getIntent().getIntExtra("realname_scene", 0);
      if (j == 1)
      {
        ab.i("MicroMsg.WalletRealNameProcessProxyUI", "from jsapi, do NetSceneCheckPayJsapi");
        if (getIntent() == null)
        {
          paramBundle = "";
          if (bo.isNullOrNil(""))
            paramBundle = getString(2131305389);
          h.a(this, paramBundle, null, false, new WalletRealNameProcessProxyUI.1(this));
          AppMethodBeat.o(46614);
        }
      }
      while (true)
      {
        return;
        String str1 = getIntent().getStringExtra("appId");
        String str2 = getIntent().getStringExtra("timeStamp");
        paramBundle = getIntent().getStringExtra("nonceStr");
        String str3 = getIntent().getStringExtra("packageExt");
        String str4 = getIntent().getStringExtra("signtype");
        String str5 = getIntent().getStringExtra("paySignature");
        String str6 = getIntent().getStringExtra("url");
        i = 8;
        if (this.mBundle.getInt("realname_scene") == 2)
          i = 12;
        a(new com.tencent.mm.plugin.wallet_core.c.a(str1, str2, paramBundle, str3, str4, str5, str6, i, "idCardRealnameVerify", getIntent().getIntExtra("pay_channel", 0)), true, false);
        AppMethodBeat.o(46614);
        continue;
        R(paramBundle);
        AppMethodBeat.o(46614);
      }
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(46619);
    super.onDestroy();
    ng(580);
    AppMethodBeat.o(46619);
  }

  public void onNewIntent(Intent paramIntent)
  {
    AppMethodBeat.i(46618);
    ab.i("MicroMsg.WalletRealNameProcessProxyUI", "onNewIntent");
    paramIntent = getIntent().getExtras();
    if ((paramIntent != null) && (paramIntent.getBoolean("key_is_realname_verify_process")))
      switch (paramIntent.getInt("realname_verify_process_ret", 0))
      {
      default:
        setResult(0);
      case -1:
      }
    while (true)
    {
      finish();
      AppMethodBeat.o(46618);
      return;
      setResult(-1);
      break;
      setResult(0);
    }
  }

  public void onResume()
  {
    AppMethodBeat.i(46615);
    super.onResume();
    AppMethodBeat.o(46615);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.id_verify.WalletRealNameProcessProxyUI
 * JD-Core Version:    0.6.2
 */