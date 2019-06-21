package com.tencent.mm.plugin.wallet_payu.create.a;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet.a.s;
import com.tencent.mm.plugin.wallet_payu.create.ui.WalletPayUStartOpenUI;
import com.tencent.mm.plugin.wallet_payu.create.ui.WalletPayUVerifyCodeUI;
import com.tencent.mm.plugin.wallet_payu.pwd.ui.WalletPayUPwdConfirmUI;
import com.tencent.mm.plugin.wallet_payu.pwd.ui.WalletPayUSetPasswordUI;
import com.tencent.mm.plugin.wallet_payu.security_question.model.a;
import com.tencent.mm.plugin.wallet_payu.security_question.ui.WalletPayUSecurityQuestionAnswerUI;
import com.tencent.mm.plugin.wallet_payu.security_question.ui.WalletPayUSecurityQuestionSettingUI;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.t;
import com.tencent.mm.wallet_core.d.g;
import com.tencent.mm.wallet_core.d.i;
import com.tencent.mm.wallet_core.ui.e;

public class c extends com.tencent.mm.wallet_core.c
{
  public final int a(MMActivity paramMMActivity, int paramInt)
  {
    AppMethodBeat.i(48387);
    if (paramInt == 1)
    {
      paramInt = 2131305209;
      AppMethodBeat.o(48387);
    }
    while (true)
    {
      return paramInt;
      paramInt = super.a(paramMMActivity, paramInt);
      AppMethodBeat.o(48387);
    }
  }

  public final com.tencent.mm.wallet_core.c a(Activity paramActivity, Bundle paramBundle)
  {
    AppMethodBeat.i(48382);
    ab.d("MicroMsg.PayUOpenProcess", "hy: start process PayUOpenProcess");
    s.cNC();
    String str1 = s.agi();
    s.cNC();
    String str2 = s.cNE();
    if (paramBundle != null)
    {
      paramBundle.putString("key_mobile", str1);
      paramBundle.putString("dial_code", str2);
    }
    b(paramActivity, WalletPayUStartOpenUI.class, paramBundle);
    AppMethodBeat.o(48382);
    return this;
  }

  public final g a(MMActivity paramMMActivity, i parami)
  {
    AppMethodBeat.i(48388);
    if ((paramMMActivity instanceof WalletPayUStartOpenUI))
    {
      paramMMActivity = new c.1(this, paramMMActivity, parami);
      AppMethodBeat.o(48388);
    }
    while (true)
    {
      return paramMMActivity;
      if ((paramMMActivity instanceof WalletPayUVerifyCodeUI))
      {
        paramMMActivity = new c.2(this, paramMMActivity, parami);
        AppMethodBeat.o(48388);
      }
      else if ((paramMMActivity instanceof WalletPayUSecurityQuestionSettingUI))
      {
        paramMMActivity = new c.3(this, paramMMActivity, parami);
        AppMethodBeat.o(48388);
      }
      else if ((paramMMActivity instanceof WalletPayUPwdConfirmUI))
      {
        paramMMActivity = new c.4(this, paramMMActivity, parami);
        AppMethodBeat.o(48388);
      }
      else if ((paramMMActivity instanceof WalletPayUSecurityQuestionAnswerUI))
      {
        paramMMActivity = new a(paramMMActivity, parami, this.mqu);
        AppMethodBeat.o(48388);
      }
      else
      {
        paramMMActivity = super.a(paramMMActivity, parami);
        AppMethodBeat.o(48388);
      }
    }
  }

  public final void a(Activity paramActivity, int paramInt, Bundle paramBundle)
  {
    AppMethodBeat.i(48383);
    if ((paramActivity instanceof WalletPayUStartOpenUI))
      b(paramActivity, WalletPayUVerifyCodeUI.class, paramBundle);
    if ((paramActivity instanceof WalletPayUVerifyCodeUI))
    {
      if (paramBundle.getBoolean("key_is_has_mobile"))
        break label95;
      b(paramActivity, WalletPayUSecurityQuestionSettingUI.class, paramBundle);
    }
    while (true)
    {
      if ((paramActivity instanceof WalletPayUSecurityQuestionSettingUI))
        b(paramActivity, WalletPayUSetPasswordUI.class, paramBundle);
      if ((paramActivity instanceof WalletPayUSetPasswordUI))
        b(paramActivity, WalletPayUPwdConfirmUI.class, paramBundle);
      if ((paramActivity instanceof WalletPayUSecurityQuestionAnswerUI))
        b(paramActivity, WalletPayUSetPasswordUI.class, paramBundle);
      AppMethodBeat.o(48383);
      return;
      label95: b(paramActivity, WalletPayUSecurityQuestionAnswerUI.class, paramBundle);
    }
  }

  public final void b(Activity paramActivity, Bundle paramBundle)
  {
    AppMethodBeat.i(48386);
    if (paramBundle.getInt("key_open_error_code", -1) == 0)
    {
      ab.i("MicroMsg.PayUOpenProcess", "hy: user open success");
      d(paramActivity, "mall", ".ui.MallIndexUI");
      AppMethodBeat.o(48386);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.PayUOpenProcess", "hy: user interrupted the process. go to preference");
      super.aG(paramActivity);
      e.iu(paramActivity);
      AppMethodBeat.o(48386);
    }
  }

  public final String bxP()
  {
    return "PayUOpenProcess";
  }

  public final void c(Activity paramActivity, int paramInt)
  {
    AppMethodBeat.i(48384);
    if ((paramActivity instanceof WalletPayUPwdConfirmUI))
    {
      a(paramActivity, WalletPayUSetPasswordUI.class, paramInt);
      AppMethodBeat.o(48384);
    }
    while (true)
    {
      return;
      b(paramActivity, this.mqu);
      AppMethodBeat.o(48384);
    }
  }

  public final boolean c(Activity paramActivity, Bundle paramBundle)
  {
    return false;
  }

  public final boolean h(Activity paramActivity, Bundle paramBundle)
  {
    AppMethodBeat.i(48385);
    paramBundle.putInt("key_open_error_code", 1);
    t.makeText(paramActivity, paramActivity.getString(2131305220), 0).show();
    b(paramActivity, paramBundle);
    AppMethodBeat.o(48385);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_payu.create.a.c
 * JD-Core Version:    0.6.2
 */