package com.tencent.mm.plugin.wallet_payu.pwd.a;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;
import com.tencent.mm.plugin.wallet_payu.pwd.ui.WalletPayUPwdConfirmUI;
import com.tencent.mm.plugin.wallet_payu.pwd.ui.WalletPayUSetPasswordUI;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.t;
import com.tencent.mm.wallet_core.c;
import com.tencent.mm.wallet_core.d.g;
import com.tencent.mm.wallet_core.d.i;

public abstract class e extends c
{
  public g a(MMActivity paramMMActivity, i parami)
  {
    if ((paramMMActivity instanceof WalletPayUPwdConfirmUI));
    for (paramMMActivity = new e.1(this, paramMMActivity, parami); ; paramMMActivity = super.a(paramMMActivity, parami))
      return paramMMActivity;
  }

  public void a(Activity paramActivity, int paramInt, Bundle paramBundle)
  {
    if ((paramActivity instanceof WalletPayUSetPasswordUI))
      b(paramActivity, WalletPayUPwdConfirmUI.class, paramBundle);
  }

  public final void b(Activity paramActivity, Bundle paramBundle)
  {
    if (this.mqu.getInt("key_errcode_payu", -1) == 0)
      t.makeText(paramActivity, 2131305068, 0).show();
    while (true)
    {
      d(paramActivity, "mall", ".ui.MallIndexUI");
      return;
      t.makeText(paramActivity, 2131304790, 0).show();
    }
  }

  public final void c(Activity paramActivity, int paramInt)
  {
    if ((paramActivity instanceof WalletPayUPwdConfirmUI))
      a(paramActivity, WalletPayUSetPasswordUI.class, paramInt);
  }

  public final boolean c(Activity paramActivity, Bundle paramBundle)
  {
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_payu.pwd.a.e
 * JD-Core Version:    0.6.2
 */