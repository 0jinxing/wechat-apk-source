package com.tencent.mm.plugin.walletlock.gesture.a;

import android.app.Activity;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.g.a.ur;
import com.tencent.mm.g.a.ur.b;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.walletlock.a.b.a;
import com.tencent.mm.plugin.walletlock.a.b.b;
import com.tencent.mm.plugin.walletlock.gesture.ui.GestureGuardLogicUI;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;

public final class c extends com.tencent.mm.plugin.walletlock.c.a
{
  public final void a(Activity paramActivity, b.b paramb)
  {
    AppMethodBeat.i(51551);
    if (!com.tencent.mm.kernel.g.RL().J(com.tencent.mm.plugin.walletlock.a.a.class))
    {
      ab.d("MicroMsg.GestureImpl", "Plugin gesture is not installed.");
      AppMethodBeat.o(51551);
    }
    while (true)
    {
      return;
      if ((paramb == null) || (paramb.ae(paramActivity)))
        break;
      ab.d("MicroMsg.GestureImpl", "protectMeOnCreate: still in filter range, do not activate protection.");
      AppMethodBeat.o(51551);
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
      AppMethodBeat.o(51551);
      break;
      paramActivity.finish();
      paramb = new Intent(paramActivity, GestureGuardLogicUI.class);
      paramb.addFlags(131072);
      paramb.putExtra("action", "action.verify_pattern");
      paramb.putExtra("next_action", "next_action.goto_protected_page");
      paramb.putExtra("page_intent", paramActivity.getIntent());
      paramb.putExtra("scene", af(paramActivity));
      paramb.setPackage(ah.getPackageName());
      paramActivity.startActivity(paramb);
      h.pYm.e(12097, new Object[] { Integer.valueOf(8), Integer.valueOf(0), Long.valueOf(System.currentTimeMillis()) });
    }
  }

  public final void a(Activity paramActivity, b.b paramb, b.a parama)
  {
    AppMethodBeat.i(51552);
    if (!com.tencent.mm.kernel.g.RL().J(com.tencent.mm.plugin.walletlock.a.a.class))
    {
      ab.d("MicroMsg.GestureImpl", "Plugin gesture is not installed.");
      AppMethodBeat.o(51552);
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
      AppMethodBeat.o(51552);
      break;
      if ((paramb == null) || (paramb.ae(paramActivity)))
      {
        paramb = new Intent(paramActivity, GestureGuardLogicUI.class);
        paramb.addFlags(131072);
        paramb.putExtra("action", "action.verify_pattern");
        paramb.putExtra("next_action", "next_action.goto_protected_page");
        paramb.putExtra("page_intent", paramActivity.getIntent());
        paramb.putExtra("scene", af(paramActivity));
        paramb.setPackage(ah.getPackageName());
        paramActivity.startActivity(paramb);
        AppMethodBeat.o(51552);
        break;
      }
      ab.d("MicroMsg.GestureImpl", "protectMeOnResume: still in filter range, do not activate protection.");
    }
  }

  public final void ad(Activity paramActivity)
  {
    AppMethodBeat.i(51555);
    if (!com.tencent.mm.kernel.g.RL().J(com.tencent.mm.plugin.walletlock.a.a.class))
    {
      ab.d("MicroMsg.GestureImpl", "Plugin gesture is not installed.");
      AppMethodBeat.o(51555);
    }
    while (true)
    {
      return;
      if (!b.cTz())
      {
        ab.d("MicroMsg.GestureImpl", "try to enter modify gesture password process while gesture password has been switched off.");
        AppMethodBeat.o(51555);
      }
      else
      {
        Intent localIntent = new Intent(paramActivity, GestureGuardLogicUI.class);
        localIntent.addFlags(131072);
        localIntent.putExtra("action", "action.verify_pattern");
        localIntent.putExtra("next_action", "next_action.modify_pattern");
        localIntent.setPackage(ah.getPackageName());
        paramActivity.startActivity(localIntent);
        AppMethodBeat.o(51555);
      }
    }
  }

  public final void b(Activity paramActivity, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(51554);
    if (paramInt1 != 1)
      AppMethodBeat.o(51554);
    while (true)
    {
      return;
      if (!com.tencent.mm.kernel.g.RL().J(com.tencent.mm.plugin.walletlock.a.a.class))
      {
        ab.d("MicroMsg.GestureImpl", "Plugin gesture is not installed.");
        AppMethodBeat.o(51554);
      }
      else
      {
        Intent localIntent = new Intent();
        localIntent.putExtra("action", "action.verify_paypwd");
        localIntent.putExtra("next_action", "next_action.switch_on_pattern");
        localIntent.putExtra("key_wallet_lock_type", 1);
        d.b(paramActivity, "wallet", ".pwd.ui.WalletLockCheckPwdUI", localIntent, paramInt2);
        AppMethodBeat.o(51554);
      }
    }
  }

  public final boolean cTj()
  {
    AppMethodBeat.i(138725);
    boolean bool = b.cTz();
    AppMethodBeat.o(138725);
    return bool;
  }

  public final boolean cTk()
  {
    AppMethodBeat.i(51558);
    boolean bool = b.cTA();
    AppMethodBeat.o(51558);
    return bool;
  }

  public final void h(Activity paramActivity, int paramInt)
  {
    AppMethodBeat.i(51553);
    if (paramInt != 1)
      AppMethodBeat.o(51553);
    while (true)
    {
      return;
      if (!com.tencent.mm.kernel.g.RL().J(com.tencent.mm.plugin.walletlock.a.a.class))
      {
        ab.d("MicroMsg.GestureImpl", "Plugin gesture is not installed.");
        AppMethodBeat.o(51553);
      }
      else
      {
        Intent localIntent = new Intent();
        localIntent.putExtra("action", "action.verify_paypwd");
        localIntent.putExtra("next_action", "next_action.switch_on_pattern");
        localIntent.putExtra("key_wallet_lock_type", 1);
        d.b(paramActivity, "wallet", ".pwd.ui.WalletLockCheckPwdUI", localIntent);
        AppMethodBeat.o(51553);
      }
    }
  }

  public final void i(Activity paramActivity, int paramInt)
  {
    AppMethodBeat.i(51556);
    if (!com.tencent.mm.kernel.g.RL().J(com.tencent.mm.plugin.walletlock.a.a.class))
    {
      ab.d("MicroMsg.GestureImpl", "Plugin gesture is not installed.");
      AppMethodBeat.o(51556);
    }
    while (true)
    {
      return;
      if (!b.cTz())
      {
        ab.d("MicroMsg.GestureImpl", "try to enter close gesture password process while gesture password has been switched off.");
        AppMethodBeat.o(51556);
      }
      else
      {
        Intent localIntent = new Intent(paramActivity, GestureGuardLogicUI.class);
        localIntent.addFlags(131072);
        localIntent.putExtra("action", "action.verify_pattern");
        localIntent.putExtra("next_action", "next_action.switch_off_pattern");
        localIntent.setPackage(ah.getPackageName());
        paramActivity.startActivity(localIntent);
        AppMethodBeat.o(51556);
      }
    }
  }

  public final void init()
  {
    AppMethodBeat.i(51550);
    ab.e("MicroMsg.GestureImpl", "alvinluo gestureimpl init");
    com.tencent.mm.plugin.walletlock.c.g localg = com.tencent.mm.plugin.walletlock.c.g.tWY;
    com.tencent.mm.plugin.walletlock.c.g.nx(true);
    com.tencent.mm.plugin.walletlock.c.g.tWY.HG(1);
    AppMethodBeat.o(51550);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.walletlock.gesture.a.c
 * JD-Core Version:    0.6.2
 */