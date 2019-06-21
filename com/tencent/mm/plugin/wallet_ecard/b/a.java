package com.tencent.mm.plugin.wallet_ecard.b;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet_core.b.b;
import com.tencent.mm.plugin.wallet_core.model.ak;
import com.tencent.mm.plugin.wallet_core.model.r;
import com.tencent.mm.plugin.wallet_core.ui.WalletBankcardIdUI;
import com.tencent.mm.plugin.wallet_core.ui.WalletCardImportUI;
import com.tencent.mm.plugin.wallet_core.utils.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.wallet_core.c;
import com.tencent.mm.wallet_core.c.x;
import com.tencent.mm.wallet_core.c.z;

public class a extends b
{
  public final c a(Activity paramActivity, Bundle paramBundle)
  {
    AppMethodBeat.i(48071);
    F(new Object[] { "start", paramActivity, paramBundle });
    ab.d("MicroMsg.BindCardProcess", "start Process : BindCardProcess");
    if (paramBundle != null)
    {
      z.hL(6, paramBundle.getInt("key_bind_scene"));
      x.QN(paramBundle.getInt("key_bind_scene"));
      if (!r.cPI().cQg())
        break label136;
      if (paramBundle == null)
        break label121;
      if (!paramBundle.getBoolean("key_is_import_bind", false))
        break label110;
      b(paramActivity, WalletCardImportUI.class, paramBundle);
      label88: AppMethodBeat.o(48071);
      paramActivity = this;
    }
    while (true)
    {
      return paramActivity;
      z.hL(6, 0);
      x.QN(0);
      break;
      label110: b(paramActivity, WalletBankcardIdUI.class, paramBundle);
      break label88;
      label121: paramActivity = super.a(paramActivity, paramBundle);
      AppMethodBeat.o(48071);
      continue;
      label136: if (paramBundle != null)
        d.gj(paramBundle.getInt("key_bind_scene", 0), 1);
      if ((paramBundle != null) && (paramBundle.getBoolean("key_is_import_bind", false)))
      {
        b(paramActivity, WalletCardImportUI.class, paramBundle);
        AppMethodBeat.o(48071);
        paramActivity = this;
      }
      else
      {
        paramActivity = super.a(paramActivity, paramBundle);
        AppMethodBeat.o(48071);
      }
    }
  }

  public final void b(Activity paramActivity, Bundle paramBundle)
  {
    AppMethodBeat.i(48072);
    if ((paramBundle != null) && (paramBundle.getBoolean("intent_bind_end", false)))
    {
      a(paramActivity, "wallet_ecard", ".ui.WalletECardBindCardListUI", -1, new Intent(), true);
      AppMethodBeat.o(48072);
    }
    while (true)
    {
      return;
      a(paramActivity, "wallet_ecard", ".ui.WalletECardBindCardListUI", 0, new Intent(), true);
      paramActivity.finish();
      AppMethodBeat.o(48072);
    }
  }

  public final String bxP()
  {
    return "OpenECardBindCardProcess";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_ecard.b.a
 * JD-Core Version:    0.6.2
 */