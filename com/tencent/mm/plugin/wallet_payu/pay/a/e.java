package com.tencent.mm.plugin.wallet_payu.pay.a;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.g.a.uv;
import com.tencent.mm.plugin.wallet_core.ui.WalletPwdConfirmUI;
import com.tencent.mm.plugin.wallet_core.ui.WalletSetPasswordUI;
import com.tencent.mm.plugin.wallet_payu.balance.ui.WalletPayUBalanceManagerUI;
import com.tencent.mm.plugin.wallet_payu.balance.ui.WalletPayUBalanceResultUI;
import com.tencent.mm.plugin.wallet_payu.create.ui.WalletPayUVerifyCodeUI;
import com.tencent.mm.plugin.wallet_payu.pay.ui.WalletPayUChangeBankcardUI;
import com.tencent.mm.plugin.wallet_payu.pay.ui.WalletPayUOrderInfoUI;
import com.tencent.mm.plugin.wallet_payu.pay.ui.WalletPayUPayUI;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.wallet_core.d.g;
import com.tencent.mm.wallet_core.d.i;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;

public class e extends com.tencent.mm.plugin.wallet_core.b.a
{
  private static void b(Context paramContext, String paramString1, boolean paramBoolean, String paramString2)
  {
    AppMethodBeat.i(48454);
    Intent localIntent = new Intent();
    localIntent.putExtra("rawUrl", paramString1);
    localIntent.putExtra("showShare", false);
    localIntent.putExtra("shouldForceViewPort", paramBoolean);
    localIntent.putExtra("pay_channel", 2);
    localIntent.putExtra("view_port_code", paramString2);
    d.b(paramContext, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", localIntent, 23351);
    AppMethodBeat.o(48454);
  }

  private void f(Activity paramActivity, Bundle paramBundle)
  {
    AppMethodBeat.i(48455);
    int i = paramBundle.getInt("key_pay_scene", 6);
    if ((i == 11) || (i == 21))
    {
      b(paramActivity, WalletPayUBalanceResultUI.class, paramBundle);
      AppMethodBeat.o(48455);
    }
    while (true)
    {
      return;
      if ((i == 31) || (i == 32) || (i == 33))
      {
        a(paramActivity, "remittance", ".ui.RemittanceResultUI", paramBundle);
        AppMethodBeat.o(48455);
      }
      else
      {
        b(paramActivity, WalletPayUOrderInfoUI.class, paramBundle);
        AppMethodBeat.o(48455);
      }
    }
  }

  private void i(Activity paramActivity, Bundle paramBundle)
  {
    AppMethodBeat.i(48453);
    if (paramBundle.getBoolean("key_should_redirect", false))
    {
      paramBundle.getString("key_gateway_code");
      b(paramActivity, paramBundle.getString("key_gateway_reference"), paramBundle.getBoolean("key_should_force_adjust"), paramBundle.getString("key_force_adjust_code"));
      AppMethodBeat.o(48453);
    }
    while (true)
    {
      return;
      f(paramActivity, paramBundle);
      AppMethodBeat.o(48453);
    }
  }

  public final int a(MMActivity paramMMActivity, int paramInt)
  {
    return 2131305188;
  }

  public final com.tencent.mm.wallet_core.c a(Activity paramActivity, Bundle paramBundle)
  {
    AppMethodBeat.i(48449);
    paramBundle.putInt("key_pay_scene", ((PayInfo)paramBundle.getParcelable("key_pay_info")).cIf);
    switch (paramBundle.getInt("key_err_code", 0))
    {
    default:
      ab.d("MicroMsg.PayUPayProcess", "start pay_flag : " + paramBundle.getInt("key_pay_flag", 0));
      switch (paramBundle.getInt("key_pay_flag", 0))
      {
      default:
      case 3:
      }
      break;
    case -1004:
    case -1003:
    }
    while (true)
    {
      AppMethodBeat.o(48449);
      while (true)
      {
        return this;
        paramBundle.putInt("key_pay_flag", 3);
        paramBundle.putInt("key_err_code", 0);
        b(paramActivity, WalletPayUChangeBankcardUI.class, paramBundle);
        AppMethodBeat.o(48449);
      }
      i(paramActivity, paramBundle);
    }
  }

  public final g a(MMActivity paramMMActivity, i parami)
  {
    AppMethodBeat.i(48457);
    if ((paramMMActivity instanceof WalletPayUPayUI))
    {
      paramMMActivity = new e.1(this, paramMMActivity, parami);
      AppMethodBeat.o(48457);
    }
    while (true)
    {
      return paramMMActivity;
      if ((paramMMActivity instanceof WalletPayUBalanceResultUI))
      {
        paramMMActivity = new e.2(this, paramMMActivity, parami);
        AppMethodBeat.o(48457);
      }
      else
      {
        paramMMActivity = super.a(paramMMActivity, parami);
        AppMethodBeat.o(48457);
      }
    }
  }

  public final void a(Activity paramActivity, int paramInt, Bundle paramBundle)
  {
    paramInt = 1;
    AppMethodBeat.i(48450);
    switch (paramBundle.getInt("key_err_code", 0))
    {
    default:
      paramInt = 0;
    case 402:
    case 403:
    case 408:
    case -1003:
    case -1004:
    }
    while (paramInt != 0)
    {
      ab.i("MicroMsg.PayUPayProcess", "deal with the err!");
      AppMethodBeat.o(48450);
      return;
      b(paramActivity, paramBundle);
      continue;
      com.tencent.mm.wallet_core.a.a(paramActivity, com.tencent.mm.plugin.wallet_payu.bind.model.c.class, paramBundle);
      continue;
      paramBundle.putInt("key_pay_flag", 3);
      paramBundle.putInt("key_err_code", 0);
      b(paramActivity, WalletPayUChangeBankcardUI.class, paramBundle);
    }
    if (paramBundle.containsKey("key_pay_flag"))
    {
      paramInt = paramBundle.getInt("key_pay_flag", 0);
      label144: ab.d("MicroMsg.PayUPayProcess", "forward pay_flag : ".concat(String.valueOf(paramInt)));
      switch (paramInt)
      {
      default:
      case 3:
      }
    }
    while (true)
    {
      AppMethodBeat.o(48450);
      break;
      paramInt = this.mqu.getInt("key_pay_flag", 0);
      break label144;
      if ((paramActivity instanceof WalletPayUVerifyCodeUI))
      {
        f(paramActivity, paramBundle);
        AppMethodBeat.o(48450);
        break;
      }
      if ((paramActivity instanceof WalletPayUChangeBankcardUI))
      {
        i(paramActivity, paramBundle);
        AppMethodBeat.o(48450);
        break;
      }
      if ((paramActivity instanceof WalletPayUBalanceResultUI))
      {
        Intent localIntent = new Intent(paramActivity, WalletPayUBalanceManagerUI.class);
        localIntent.putExtras(new Bundle());
        localIntent.getExtras().putAll(paramBundle);
        a(paramActivity, WalletPayUBalanceManagerUI.class, localIntent);
        AppMethodBeat.o(48450);
        break;
      }
      super.a(paramActivity, 0, paramBundle);
    }
  }

  public final boolean a(WalletBaseUI paramWalletBaseUI, int paramInt, String paramString)
  {
    return false;
  }

  public final void b(Activity paramActivity, Bundle paramBundle)
  {
    int i = -1;
    AppMethodBeat.i(48452);
    ab.d("MicroMsg.PayUPayProcess", "end pay_flag : " + this.mqu.getInt("key_pay_flag", 0));
    int j;
    Intent localIntent;
    uv localuv;
    if (this.mqu.getBoolean("intent_pay_end", false))
    {
      j = -1;
      localIntent = new Intent();
      if (paramBundle != null)
      {
        paramBundle = new Bundle();
        paramBundle.putInt("intent_pay_end_errcode", this.mqu.getInt("intent_pay_end_errcode"));
        paramBundle.putString("intent_pay_app_url", this.mqu.getString("intent_pay_app_url"));
        paramBundle.putBoolean("intent_pay_end", this.mqu.getBoolean("intent_pay_end"));
        paramBundle.putString("intent_wap_pay_jump_url", this.mqu.getString("intent_wap_pay_jump_url"));
        localIntent.putExtras(paramBundle);
      }
      localuv = new uv();
      localuv.cRF.intent = localIntent;
      paramBundle = localuv.cRF;
      if (!this.mqu.getBoolean("intent_pay_end", false))
        break label221;
    }
    while (true)
    {
      paramBundle.result = i;
      com.tencent.mm.sdk.b.a.xxA.m(localuv);
      a(paramActivity, "wallet_payu", ".pay.ui.WalletPayUPayUI", j, localIntent, false);
      AppMethodBeat.o(48452);
      return;
      j = 0;
      break;
      label221: i = 0;
    }
  }

  public final String bxP()
  {
    return "PayUPayProcess";
  }

  public final void c(Activity paramActivity, int paramInt)
  {
    AppMethodBeat.i(48451);
    ab.d("MicroMsg.PayUPayProcess", "bakck pay_flag : " + this.mqu.getInt("key_pay_flag", 0));
    if ((paramActivity instanceof WalletPwdConfirmUI))
    {
      a(paramActivity, WalletSetPasswordUI.class, paramInt);
      AppMethodBeat.o(48451);
    }
    while (true)
    {
      return;
      F(paramActivity);
      AppMethodBeat.o(48451);
    }
  }

  public final boolean c(Activity paramActivity, Bundle paramBundle)
  {
    AppMethodBeat.i(48456);
    ab.d("MicroMsg.PayUPayProcess", "needupdatebankcardlist pay_flag : " + this.mqu.getInt("key_pay_flag", 0));
    switch (this.mqu.getInt("key_pay_flag", 0))
    {
    default:
      AppMethodBeat.o(48456);
    case 3:
    }
    while (true)
    {
      return false;
      AppMethodBeat.o(48456);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_payu.pay.a.e
 * JD-Core Version:    0.6.2
 */