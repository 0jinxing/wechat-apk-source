package com.tencent.mm.plugin.walletlock.fingerprint.a;

import android.app.Activity;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.ur;
import com.tencent.mm.g.a.ur.b;
import com.tencent.mm.kernel.c;
import com.tencent.mm.plugin.walletlock.a.b.a;
import com.tencent.mm.plugin.walletlock.a.b.b;
import com.tencent.mm.plugin.walletlock.fingerprint.ui.FingerprintWalletLockUI;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;

public final class b extends com.tencent.mm.plugin.walletlock.c.a
{
  public final void a(Activity paramActivity, b.b paramb)
  {
    AppMethodBeat.i(51464);
    if (!com.tencent.mm.kernel.g.RL().J(com.tencent.mm.plugin.walletlock.a.a.class))
    {
      ab.d("MicroMsg.FingerprintLockImpl", "Plugin gesture is not installed.");
      AppMethodBeat.o(51464);
    }
    while (true)
    {
      return;
      if ((paramb == null) || (paramb.ae(paramActivity)))
        break;
      ab.d("MicroMsg.FingerprintLockImpl", "protectMeOnCreate: still in filter range, do not activate protection.");
      AppMethodBeat.o(51464);
    }
    paramb = new ur();
    paramb.cRv.cRx = 0;
    paramb.cRv.activity = paramActivity;
    com.tencent.mm.sdk.b.a.xxA.m(paramb);
    switch (((Integer)paramb.cRw.data).intValue())
    {
    default:
    case 17:
    }
    while (true)
    {
      AppMethodBeat.o(51464);
      break;
      paramActivity.finish();
      paramb = new Intent(paramActivity, FingerprintWalletLockUI.class);
      paramb.addFlags(131072);
      paramb.putExtra("action", "action.verify_pattern");
      paramb.putExtra("next_action", "next_action.goto_protected_page");
      paramb.putExtra("page_intent", paramActivity.getIntent());
      paramb.putExtra("scene", af(paramActivity));
      paramb.setPackage(ah.getPackageName());
      paramActivity.startActivity(paramb);
    }
  }

  public final void a(Activity paramActivity, b.b paramb, b.a parama)
  {
    AppMethodBeat.i(51465);
    if (!com.tencent.mm.kernel.g.RL().J(com.tencent.mm.plugin.walletlock.a.a.class))
    {
      ab.d("MicroMsg.FingerprintLockImpl", "Plugin gesture is not installed.");
      AppMethodBeat.o(51465);
      return;
    }
    parama = new ur();
    parama.cRv.cRx = 1;
    parama.cRv.activity = paramActivity;
    com.tencent.mm.sdk.b.a.xxA.m(parama);
    switch (((Integer)parama.cRw.data).intValue())
    {
    default:
    case 17:
    }
    while (true)
    {
      AppMethodBeat.o(51465);
      break;
      if ((paramb == null) || (paramb.ae(paramActivity)))
      {
        paramb = new Intent(paramActivity, FingerprintWalletLockUI.class);
        paramb.addFlags(131072);
        paramb.putExtra("action", "action.verify_pattern");
        paramb.putExtra("next_action", "next_action.goto_protected_page");
        paramb.putExtra("page_intent", paramActivity.getIntent());
        paramb.putExtra("scene", af(paramActivity));
        paramb.setPackage(ah.getPackageName());
        paramActivity.startActivity(paramb);
        AppMethodBeat.o(51465);
        break;
      }
      ab.d("MicroMsg.FingerprintLockImpl", "protectMeOnResume: still in filter range, do not activate protection.");
    }
  }

  public final void ad(Activity paramActivity)
  {
  }

  public final void b(Activity paramActivity, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(51467);
    if (paramInt1 != 2)
      AppMethodBeat.o(51467);
    while (true)
    {
      return;
      if (!com.tencent.mm.kernel.g.RL().J(com.tencent.mm.plugin.walletlock.a.a.class))
      {
        ab.d("MicroMsg.FingerprintLockImpl", "Plugin gesture is not installed.");
        AppMethodBeat.o(51467);
      }
      else
      {
        Intent localIntent = new Intent();
        localIntent.putExtra("action", "action.verify_paypwd");
        localIntent.putExtra("next_action", "next_action.switch_on_pattern");
        localIntent.putExtra("key_wallet_lock_type", 2);
        ab.i("MicroMsg.FingerprintLockImpl", "alvinluo enterNewWalletLockProcessForResult start check pwd ui, wallet lock type: %d", new Object[] { Integer.valueOf(paramInt1) });
        com.tencent.mm.bp.d.b(paramActivity, "wallet", ".pwd.ui.WalletLockCheckPwdUI", localIntent, paramInt2);
        AppMethodBeat.o(51467);
      }
    }
  }

  public final b.b cTi()
  {
    AppMethodBeat.i(51468);
    com.tencent.mm.plugin.walletlock.c.d locald = com.tencent.mm.plugin.walletlock.c.d.cTU();
    AppMethodBeat.o(51468);
    return locald;
  }

  public final boolean cTj()
  {
    AppMethodBeat.i(51469);
    com.tencent.mm.plugin.walletlock.c.g localg = com.tencent.mm.plugin.walletlock.c.g.tWY;
    boolean bool = com.tencent.mm.plugin.walletlock.c.g.cTn();
    AppMethodBeat.o(51469);
    return bool;
  }

  public final boolean cTk()
  {
    return false;
  }

  public final void h(Activity paramActivity, int paramInt)
  {
    AppMethodBeat.i(51466);
    if (paramInt != 2)
      AppMethodBeat.o(51466);
    while (true)
    {
      return;
      if (!com.tencent.mm.kernel.g.RL().J(com.tencent.mm.plugin.walletlock.a.a.class))
      {
        ab.d("MicroMsg.FingerprintLockImpl", "Plugin gesture is not installed.");
        AppMethodBeat.o(51466);
      }
      else
      {
        Intent localIntent = new Intent();
        localIntent.putExtra("action", "action.verify_paypwd");
        localIntent.putExtra("next_action", "next_action.switch_on_pattern");
        localIntent.putExtra("key_wallet_lock_type", 2);
        com.tencent.mm.bp.d.b(paramActivity, "wallet", ".pwd.ui.WalletLockCheckPwdUI", localIntent);
        AppMethodBeat.o(51466);
      }
    }
  }

  public final void i(Activity paramActivity, int paramInt)
  {
  }

  public final void init()
  {
    AppMethodBeat.i(51463);
    com.tencent.mm.plugin.walletlock.c.g localg = com.tencent.mm.plugin.walletlock.c.g.tWY;
    com.tencent.mm.plugin.walletlock.c.g.cTW();
    com.tencent.mm.plugin.walletlock.c.g.tWY.HG(2);
    AppMethodBeat.o(51463);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.walletlock.fingerprint.a.b
 * JD-Core Version:    0.6.2
 */