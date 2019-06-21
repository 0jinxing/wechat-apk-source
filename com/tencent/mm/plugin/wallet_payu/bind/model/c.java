package com.tencent.mm.plugin.wallet_payu.bind.model;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.wallet_payu.bind.ui.WalletPayUBankcardManageUI;
import com.tencent.mm.plugin.wallet_payu.bind.ui.WalletPayUCardElementUI;
import com.tencent.mm.plugin.wallet_payu.pwd.ui.WalletPayUCheckPwdUI;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.t;
import com.tencent.mm.wallet_core.d.g;
import com.tencent.mm.wallet_core.d.i;

public class c extends com.tencent.mm.wallet_core.c
{
  public final com.tencent.mm.wallet_core.c a(Activity paramActivity, Bundle paramBundle)
  {
    AppMethodBeat.i(48341);
    ab.d("MicroMsg.PayUBindProcess", "hy: start process: PayUBindProcess");
    b(paramActivity, WalletPayUCheckPwdUI.class, paramBundle);
    AppMethodBeat.o(48341);
    return this;
  }

  public final g a(MMActivity paramMMActivity, i parami)
  {
    AppMethodBeat.i(48345);
    if ((paramMMActivity instanceof WalletPayUCheckPwdUI))
    {
      paramMMActivity = new c.1(this, paramMMActivity, parami, this.mqu);
      AppMethodBeat.o(48345);
    }
    while (true)
    {
      return paramMMActivity;
      if ((paramMMActivity instanceof WalletPayUCardElementUI))
      {
        paramMMActivity = new g(paramMMActivity, parami)
        {
          public final boolean c(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, m paramAnonymousm)
          {
            AppMethodBeat.i(48339);
            if (((paramAnonymousm instanceof a)) && (paramAnonymousInt1 == 0) && (paramAnonymousInt2 == 0))
            {
              c.a(c.this).putInt("key_errcode_payu", 0);
              c.this.b(this.hwd, c.b(c.this));
            }
            if ((paramAnonymousm instanceof NetScenePayUElementQuery))
            {
              if ((paramAnonymousInt1 != 0) || (paramAnonymousInt2 != 0))
                break label126;
              paramAnonymousString = ((NetScenePayUElementQuery)paramAnonymousm).tSF;
              if (bo.isNullOrNil(paramAnonymousString.tSG))
                paramAnonymousString.tSH = ah.getContext().getString(2131305207);
              c.c(c.this).putParcelable("key_card_element", ((NetScenePayUElementQuery)paramAnonymousm).tSF);
            }
            while (true)
            {
              AppMethodBeat.o(48339);
              return false;
              label126: NetScenePayUElementQuery.PayUBankcardElement localPayUBankcardElement = new NetScenePayUElementQuery.PayUBankcardElement();
              paramAnonymousm = paramAnonymousString;
              if (bo.isNullOrNil(paramAnonymousString))
                paramAnonymousm = "err card element";
              localPayUBankcardElement.tSH = paramAnonymousm;
              c.d(c.this).putParcelable("key_card_element", localPayUBankcardElement);
            }
          }

          public final boolean p(Object[] paramAnonymousArrayOfObject)
          {
            AppMethodBeat.i(48340);
            paramAnonymousArrayOfObject = (NetScenePayUElementQuery.PayUBankcardElement)c.e(c.this).getParcelable("key_card_element");
            this.Agm.a(new a(paramAnonymousArrayOfObject.pcj, paramAnonymousArrayOfObject.tSH, c.f(c.this).getString("key_bank_username"), c.g(c.this).getString("key_card_id"), c.h(c.this).getString("key_expire_data"), paramAnonymousArrayOfObject.cardType, c.i(c.this).getString("key_cvv"), c.j(c.this).getString("key_pwd1")), true);
            AppMethodBeat.o(48340);
            return false;
          }
        };
        AppMethodBeat.o(48345);
      }
      else
      {
        paramMMActivity = super.a(paramMMActivity, parami);
        AppMethodBeat.o(48345);
      }
    }
  }

  public final void a(Activity paramActivity, int paramInt, Bundle paramBundle)
  {
    AppMethodBeat.i(48342);
    if ((paramActivity instanceof WalletPayUCheckPwdUI))
      b(paramActivity, WalletPayUCardElementUI.class, paramBundle);
    AppMethodBeat.o(48342);
  }

  public final void b(Activity paramActivity, Bundle paramBundle)
  {
    AppMethodBeat.i(48344);
    if (this.mqu.getInt("key_errcode_payu", -1) == 0)
    {
      t.makeText(paramActivity, 2131305068, 0).show();
      a(paramActivity, WalletPayUBankcardManageUI.class, -1, false);
      AppMethodBeat.o(48344);
    }
    while (true)
    {
      return;
      t.makeText(paramActivity, 2131304790, 0).show();
      a(paramActivity, WalletPayUBankcardManageUI.class, 0, false);
      AppMethodBeat.o(48344);
    }
  }

  public final String bxP()
  {
    return "PayUBindProcess";
  }

  public final void c(Activity paramActivity, int paramInt)
  {
    AppMethodBeat.i(48343);
    F(paramActivity);
    AppMethodBeat.o(48343);
  }

  public final boolean c(Activity paramActivity, Bundle paramBundle)
  {
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_payu.bind.model.c
 * JD-Core Version:    0.6.2
 */