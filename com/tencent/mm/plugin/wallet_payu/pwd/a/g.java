package com.tencent.mm.plugin.wallet_payu.pwd.a;

import android.app.Activity;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.wallet_core.model.s;
import com.tencent.mm.plugin.wallet_payu.pwd.ui.WalletPayUCheckPwdUI;
import com.tencent.mm.plugin.wallet_payu.pwd.ui.WalletPayUPwdConfirmUI;
import com.tencent.mm.plugin.wallet_payu.pwd.ui.WalletPayUSetPasswordUI;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.wallet_core.a;
import com.tencent.mm.wallet_core.c;
import com.tencent.mm.wallet_core.d.i;

public class g extends e
{
  public final c a(Activity paramActivity, Bundle paramBundle)
  {
    AppMethodBeat.i(48516);
    b(paramActivity, WalletPayUCheckPwdUI.class, paramBundle);
    AppMethodBeat.o(48516);
    return this;
  }

  public final com.tencent.mm.wallet_core.d.g a(MMActivity paramMMActivity, i parami)
  {
    AppMethodBeat.i(48518);
    if ((paramMMActivity instanceof WalletPayUCheckPwdUI))
    {
      paramMMActivity = new g.1(this, paramMMActivity, parami, this.mqu);
      AppMethodBeat.o(48518);
    }
    while (true)
    {
      return paramMMActivity;
      if ((paramMMActivity instanceof WalletPayUPwdConfirmUI))
      {
        paramMMActivity = new com.tencent.mm.wallet_core.d.g(paramMMActivity, parami)
        {
          public final boolean c(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, m paramAnonymousm)
          {
            boolean bool = false;
            AppMethodBeat.i(48514);
            if ((paramAnonymousm instanceof b))
            {
              ab.d("MicroMsg.PayUModifyPasswordProcess", "hy: change pwd user success");
              if ((paramAnonymousInt1 == 0) && (paramAnonymousInt2 == 0))
              {
                g.a(g.this).putInt("key_errcode_payu", 0);
                a.b(this.hwd, g.this.mqu, 0);
                bool = true;
                AppMethodBeat.o(48514);
              }
            }
            while (true)
            {
              return bool;
              AppMethodBeat.o(48514);
            }
          }

          public final boolean p(Object[] paramAnonymousArrayOfObject)
          {
            AppMethodBeat.i(48515);
            Object localObject = (s)paramAnonymousArrayOfObject[0];
            paramAnonymousArrayOfObject = g.b(g.this).getString("key_pwd1");
            localObject = ((s)localObject).guu;
            this.Agm.a(new b(paramAnonymousArrayOfObject, (String)localObject), true);
            AppMethodBeat.o(48515);
            return true;
          }
        };
        AppMethodBeat.o(48518);
      }
      else
      {
        paramMMActivity = super.a(paramMMActivity, parami);
        AppMethodBeat.o(48518);
      }
    }
  }

  public final void a(Activity paramActivity, int paramInt, Bundle paramBundle)
  {
    AppMethodBeat.i(48517);
    if ((paramActivity instanceof WalletPayUCheckPwdUI))
    {
      b(paramActivity, WalletPayUSetPasswordUI.class, paramBundle);
      AppMethodBeat.o(48517);
    }
    while (true)
    {
      return;
      super.a(paramActivity, paramInt, paramBundle);
      AppMethodBeat.o(48517);
    }
  }

  public final String bxP()
  {
    return "PayUModifyPasswordProcess";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_payu.pwd.a.g
 * JD-Core Version:    0.6.2
 */