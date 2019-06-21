package com.tencent.mm.plugin.offline;

import android.app.Activity;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.g.a.lf;
import com.tencent.mm.plugin.offline.a.k;
import com.tencent.mm.plugin.offline.ui.WalletOfflineEntranceUI;
import com.tencent.mm.plugin.wallet_core.b.b;
import com.tencent.mm.plugin.wallet_core.c.q;
import com.tencent.mm.plugin.wallet_core.c.y;
import com.tencent.mm.plugin.wallet_core.model.s;
import com.tencent.mm.plugin.wallet_core.ui.WalletPwdConfirmUI;
import com.tencent.mm.plugin.wallet_core.ui.WalletVerifyCodeUI;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.wallet_core.d.g;
import com.tencent.mm.wallet_core.d.i;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;

public class c extends b
{
  public final com.tencent.mm.wallet_core.c a(Activity paramActivity, Bundle paramBundle)
  {
    AppMethodBeat.i(43288);
    paramActivity = super.a(paramActivity, paramBundle);
    AppMethodBeat.o(43288);
    return paramActivity;
  }

  public final g a(MMActivity paramMMActivity, i parami)
  {
    AppMethodBeat.i(43291);
    if ((paramMMActivity instanceof WalletVerifyCodeUI))
    {
      paramMMActivity = new g(paramMMActivity, parami)
      {
        public final boolean c(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, m paramAnonymousm)
        {
          AppMethodBeat.i(43285);
          boolean bool;
          if ((paramAnonymousInt1 == 0) && (paramAnonymousInt2 == 0))
            if ((paramAnonymousm instanceof y))
            {
              if ((((WalletBaseUI)this.hwd).mBundle == null) || (((WalletBaseUI)this.hwd).mBundle.getInt("key_bind_scene", -1) != 5) || (com.tencent.mm.plugin.offline.c.a.bYd()))
                break label121;
              c.h(this.hwd);
              AppMethodBeat.o(43285);
              bool = true;
            }
          while (true)
          {
            return bool;
            if ((paramAnonymousm instanceof k))
            {
              com.tencent.mm.wallet_core.a.j(this.hwd, ((WalletBaseUI)this.hwd).mBundle);
              com.tencent.mm.plugin.offline.c.a.W(this.hwd);
              AppMethodBeat.o(43285);
              bool = true;
            }
            else
            {
              label121: bool = false;
              AppMethodBeat.o(43285);
            }
          }
        }

        public final boolean p(Object[] paramAnonymousArrayOfObject)
        {
          AppMethodBeat.i(43284);
          paramAnonymousArrayOfObject = (s)paramAnonymousArrayOfObject[1];
          paramAnonymousArrayOfObject.flag = "2";
          this.Agm.a(new q(paramAnonymousArrayOfObject), true, 1);
          AppMethodBeat.o(43284);
          return true;
        }
      };
      AppMethodBeat.o(43291);
    }
    while (true)
    {
      return paramMMActivity;
      if ((paramMMActivity instanceof WalletPwdConfirmUI))
      {
        paramMMActivity = new c.2(this, paramMMActivity, parami);
        AppMethodBeat.o(43291);
      }
      else
      {
        paramMMActivity = super.a(paramMMActivity, parami);
        AppMethodBeat.o(43291);
      }
    }
  }

  public final void a(Activity paramActivity, int paramInt, Bundle paramBundle)
  {
    AppMethodBeat.i(43289);
    super.a(paramActivity, paramInt, paramBundle);
    AppMethodBeat.o(43289);
  }

  public final void b(Activity paramActivity, Bundle paramBundle)
  {
    AppMethodBeat.i(43290);
    com.tencent.mm.sdk.b.a.xxA.m(new lf());
    if (com.tencent.mm.plugin.offline.c.a.bYd())
      c(paramActivity, WalletOfflineEntranceUI.class);
    while (true)
    {
      if (paramActivity != null)
        paramActivity.finish();
      AppMethodBeat.o(43290);
      return;
      if (paramBundle.getInt("key_entry_scene", -1) == 2)
        d(paramActivity, "offline", "ui.WalletOfflineEntranceUI");
      else
        d(paramActivity, "mall", ".ui.MallIndexUI");
    }
  }

  public final String bxP()
  {
    return "OfflineBindCardProcess";
  }

  public final boolean c(Activity paramActivity, Bundle paramBundle)
  {
    AppMethodBeat.i(43292);
    boolean bool = super.c(paramActivity, paramBundle);
    AppMethodBeat.o(43292);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.offline.c
 * JD-Core Version:    0.6.2
 */