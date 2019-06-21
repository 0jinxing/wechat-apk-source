package com.tencent.mm.plugin.wallet_core.b;

import android.app.Activity;
import android.os.Bundle;
import com.tencent.mm.plugin.wallet_core.ui.WalletBankcardIdUI;
import com.tencent.mm.plugin.wallet_core.ui.WalletCardElementUI;
import com.tencent.mm.plugin.wallet_core.ui.WalletConfirmCardIDUI;
import com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoUI;
import com.tencent.mm.plugin.wallet_core.ui.WalletPwdConfirmUI;
import com.tencent.mm.plugin.wallet_core.ui.WalletSetPasswordUI;
import com.tencent.mm.plugin.wallet_core.ui.WalletVerifyCodeUI;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.wallet_core.c;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;

public abstract class a extends c
{
  public int a(MMActivity paramMMActivity, int paramInt)
  {
    return 2131304862;
  }

  public c a(Activity paramActivity, Bundle paramBundle)
  {
    F(new Object[] { "start", paramActivity, paramBundle });
    if (paramBundle != null)
      paramBundle.putBoolean("key_is_bind_reg_process", true);
    b(paramActivity, WalletBankcardIdUI.class, paramBundle);
    return this;
  }

  public void a(Activity paramActivity, int paramInt, Bundle paramBundle)
  {
    F(new Object[] { "forward", paramActivity, Integer.valueOf(paramInt), paramBundle });
    if (((paramActivity instanceof WalletBankcardIdUI)) || ((paramActivity instanceof WalletConfirmCardIDUI)))
      b(paramActivity, WalletCardElementUI.class, paramBundle);
    while (true)
    {
      return;
      if ((paramActivity instanceof WalletVerifyCodeUI))
        b(paramActivity, WalletSetPasswordUI.class, paramBundle);
      else if ((paramActivity instanceof WalletSetPasswordUI))
        b(paramActivity, WalletPwdConfirmUI.class, paramBundle);
      else if ((paramActivity instanceof WalletOrderInfoUI))
        b(paramActivity, paramBundle);
    }
  }

  public boolean a(WalletBaseUI paramWalletBaseUI, int paramInt, String paramString)
  {
    boolean bool = false;
    switch (paramInt)
    {
    default:
    case 404:
    }
    while (true)
    {
      return bool;
      ab.i("MicroMsg.ProcessManager", "404 bind error, cancel bind!");
      h.a(paramWalletBaseUI, paramString, null, paramWalletBaseUI.getString(2131304623), false, new a.1(this, paramWalletBaseUI));
      bool = true;
    }
  }

  public void c(Activity paramActivity, int paramInt)
  {
    F(new Object[] { "back", paramActivity, Integer.valueOf(paramInt) });
    if ((paramActivity instanceof WalletPwdConfirmUI))
      a(paramActivity, WalletSetPasswordUI.class, paramInt);
    while (true)
    {
      return;
      F(paramActivity);
    }
  }

  public boolean c(Activity paramActivity, Bundle paramBundle)
  {
    return paramActivity instanceof WalletOrderInfoUI;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.b.a
 * JD-Core Version:    0.6.2
 */