package com.tencent.mm.plugin.wallet.balance;

import android.app.Activity;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.wallet.a.s;
import com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchPwdInputUI;
import com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchResultUI;
import com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchUI;
import com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceManagerUI;
import com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceResultUI;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.plugin.wallet_core.model.ak;
import com.tencent.mm.plugin.wallet_core.model.r;
import com.tencent.mm.plugin.wallet_core.ui.WalletBankcardIdUI;
import com.tencent.mm.plugin.wallet_core.ui.WalletCardElementUI;
import com.tencent.mm.plugin.wallet_core.ui.WalletCheckPwdUI;
import com.tencent.mm.plugin.wallet_core.ui.WalletConfirmCardIDUI;
import com.tencent.mm.plugin.wallet_core.ui.WalletPwdConfirmUI;
import com.tencent.mm.plugin.wallet_core.ui.WalletSetPasswordUI;
import com.tencent.mm.plugin.wallet_core.ui.WalletVerifyCodeUI;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.wallet_core.c;
import com.tencent.mm.wallet_core.c.x;
import com.tencent.mm.wallet_core.d.g;
import com.tencent.mm.wallet_core.d.i;
import com.tencent.mm.wallet_core.ui.e;
import java.text.SimpleDateFormat;
import java.util.Date;

public class b extends c
{
  public final int a(MMActivity paramMMActivity, int paramInt)
  {
    return 2131304538;
  }

  public final c a(Activity paramActivity, Bundle paramBundle)
  {
    AppMethodBeat.i(45213);
    x.QN(14);
    if ((paramActivity instanceof WalletBalanceFetchUI))
    {
      s.cNC();
      if (s.cND().cQg())
        if ((Bankcard)this.mqu.getParcelable("key_bankcard") != null)
        {
          this.mqu.putInt("key_pay_flag", 3);
          this.mqu.putString("key_pwd_cash_title", paramActivity.getString(2131304543));
          Orders localOrders = (Orders)this.mqu.getParcelable("key_orders");
          if (localOrders != null)
            this.mqu.putString("key_pwd_cash_money", e.G(localOrders.pTN));
          b(paramActivity, WalletBalanceFetchPwdInputUI.class, paramBundle);
        }
    }
    while (true)
    {
      AppMethodBeat.o(45213);
      return this;
      this.mqu.putInt("key_pay_flag", 2);
      b(paramActivity, WalletCheckPwdUI.class, paramBundle);
      continue;
      this.mqu.putInt("key_pay_flag", 1);
      b(paramActivity, WalletBankcardIdUI.class, paramBundle);
      continue;
      b(paramActivity, WalletBalanceFetchUI.class, paramBundle);
    }
  }

  public final g a(MMActivity paramMMActivity, i parami)
  {
    AppMethodBeat.i(45217);
    if ((paramMMActivity instanceof WalletBalanceFetchUI))
    {
      paramMMActivity = new b.1(this, paramMMActivity, parami);
      AppMethodBeat.o(45217);
    }
    while (true)
    {
      return paramMMActivity;
      if ((paramMMActivity instanceof WalletBalanceFetchPwdInputUI))
      {
        paramMMActivity = new b.2(this, paramMMActivity, parami);
        AppMethodBeat.o(45217);
      }
      else if ((paramMMActivity instanceof WalletCardElementUI))
      {
        paramMMActivity = new b.3(this, paramMMActivity, parami);
        AppMethodBeat.o(45217);
      }
      else if ((paramMMActivity instanceof WalletVerifyCodeUI))
      {
        paramMMActivity = new b.4(this, paramMMActivity, parami);
        AppMethodBeat.o(45217);
      }
      else if ((paramMMActivity instanceof WalletBalanceFetchResultUI))
      {
        paramMMActivity = new g(paramMMActivity, parami)
        {
          public final CharSequence Au(int paramAnonymousInt)
          {
            AppMethodBeat.i(45209);
            Object localObject;
            switch (paramAnonymousInt)
            {
            default:
              localObject = super.Au(paramAnonymousInt);
              AppMethodBeat.o(45209);
            case 0:
            case 1:
            case 2:
            }
            while (true)
            {
              return localObject;
              localObject = this.hwd.getString(2131304565);
              AppMethodBeat.o(45209);
              continue;
              localObject = (Orders)b.B(b.this).getParcelable("key_orders");
              if ((localObject != null) && (!bo.isNullOrNil(((Orders)localObject).tAl)))
              {
                localObject = ((Orders)localObject).tAl;
                AppMethodBeat.o(45209);
              }
              else
              {
                localObject = this.hwd.getString(2131304562);
                AppMethodBeat.o(45209);
                continue;
                localObject = (Orders)b.C(b.this).getParcelable("key_orders");
                if ((localObject == null) || (((Orders)localObject).tAk <= 0L))
                  break;
                localObject = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(((Orders)localObject).tAk));
                AppMethodBeat.o(45209);
              }
            }
          }

          public final boolean c(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, m paramAnonymousm)
          {
            return false;
          }

          public final boolean p(Object[] paramAnonymousArrayOfObject)
          {
            return false;
          }

          public final boolean w(Object[] paramAnonymousArrayOfObject)
          {
            AppMethodBeat.i(45208);
            Orders localOrders = (Orders)b.z(b.this).getParcelable("key_orders");
            Bankcard localBankcard = r.cPI().thy;
            localBankcard.twS -= localOrders.pTN;
            b.A(b.this).putInt("key_balance_result_logo", 2131231871);
            boolean bool = super.w(paramAnonymousArrayOfObject);
            AppMethodBeat.o(45208);
            return bool;
          }
        };
        AppMethodBeat.o(45217);
      }
      else if ((paramMMActivity instanceof WalletPwdConfirmUI))
      {
        paramMMActivity = new b.6(this, paramMMActivity, parami);
        AppMethodBeat.o(45217);
      }
      else
      {
        paramMMActivity = super.a(paramMMActivity, parami);
        AppMethodBeat.o(45217);
      }
    }
  }

  public final void a(Activity paramActivity, int paramInt, Bundle paramBundle)
  {
    AppMethodBeat.i(45214);
    if ((paramActivity instanceof WalletBalanceFetchUI))
    {
      s.cNC();
      if (s.cND().cQg())
        if ((Bankcard)this.mqu.getParcelable("key_bankcard") != null)
        {
          this.mqu.putInt("key_pay_flag", 3);
          this.mqu.putString("key_pwd_cash_title", paramActivity.getString(2131304543));
          Orders localOrders = (Orders)this.mqu.getParcelable("key_orders");
          if (localOrders != null)
            this.mqu.putString("key_pwd_cash_money", e.G(localOrders.pTN));
          b(paramActivity, WalletBalanceFetchPwdInputUI.class, paramBundle);
          AppMethodBeat.o(45214);
        }
    }
    while (true)
    {
      return;
      this.mqu.putInt("key_pay_flag", 2);
      b(paramActivity, WalletCheckPwdUI.class, paramBundle);
      AppMethodBeat.o(45214);
      continue;
      this.mqu.putInt("key_pay_flag", 1);
      b(paramActivity, WalletBankcardIdUI.class, paramBundle);
      AppMethodBeat.o(45214);
      continue;
      if ((paramActivity instanceof WalletBalanceFetchPwdInputUI))
      {
        if (paramBundle.getBoolean("key_need_verify_sms", false))
        {
          b(paramActivity, WalletVerifyCodeUI.class, paramBundle);
          AppMethodBeat.o(45214);
        }
        else
        {
          b(paramActivity, WalletBalanceFetchResultUI.class, paramBundle);
          AppMethodBeat.o(45214);
        }
      }
      else if ((paramActivity instanceof WalletCheckPwdUI))
      {
        b(paramActivity, WalletBankcardIdUI.class, paramBundle);
        AppMethodBeat.o(45214);
      }
      else if (((paramActivity instanceof WalletBankcardIdUI)) || ((paramActivity instanceof WalletConfirmCardIDUI)))
      {
        b(paramActivity, WalletCardElementUI.class, paramBundle);
        AppMethodBeat.o(45214);
      }
      else if ((paramActivity instanceof WalletCardElementUI))
      {
        b(paramActivity, WalletVerifyCodeUI.class, paramBundle);
        AppMethodBeat.o(45214);
      }
      else if ((paramActivity instanceof WalletVerifyCodeUI))
      {
        s.cNC();
        if (s.cND().cQg())
        {
          b(paramActivity, WalletBalanceFetchResultUI.class, paramBundle);
          AppMethodBeat.o(45214);
        }
        else
        {
          b(paramActivity, WalletSetPasswordUI.class, paramBundle);
          AppMethodBeat.o(45214);
        }
      }
      else if ((paramActivity instanceof WalletSetPasswordUI))
      {
        b(paramActivity, WalletPwdConfirmUI.class, paramBundle);
        AppMethodBeat.o(45214);
      }
      else if ((paramActivity instanceof WalletPwdConfirmUI))
      {
        b(paramActivity, WalletBalanceFetchResultUI.class, paramBundle);
        AppMethodBeat.o(45214);
      }
      else
      {
        if ((paramActivity instanceof WalletBalanceFetchResultUI))
          b(paramActivity, paramBundle);
        AppMethodBeat.o(45214);
      }
    }
  }

  public final void b(Activity paramActivity, Bundle paramBundle)
  {
    AppMethodBeat.i(45216);
    a(paramActivity, WalletBalanceManagerUI.class, -1, true);
    AppMethodBeat.o(45216);
  }

  public final String bxP()
  {
    return "BalanceFetchProcess";
  }

  public final void c(Activity paramActivity, int paramInt)
  {
    AppMethodBeat.i(45215);
    if ((paramActivity instanceof WalletPwdConfirmUI))
    {
      a(paramActivity, WalletSetPasswordUI.class, paramInt);
      AppMethodBeat.o(45215);
    }
    while (true)
    {
      return;
      if ((paramActivity instanceof WalletBalanceResultUI))
      {
        x.dNV();
        b(paramActivity, this.mqu);
        AppMethodBeat.o(45215);
      }
      else
      {
        x.dNV();
        F(paramActivity);
        AppMethodBeat.o(45215);
      }
    }
  }

  public final boolean c(Activity paramActivity, Bundle paramBundle)
  {
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.balance.b
 * JD-Core Version:    0.6.2
 */