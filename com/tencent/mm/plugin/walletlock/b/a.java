package com.tencent.mm.plugin.walletlock.b;

import android.app.Activity;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.ur;
import com.tencent.mm.g.a.ur.b;
import com.tencent.mm.kernel.c;
import com.tencent.mm.plugin.walletlock.a.b.a;
import com.tencent.mm.plugin.walletlock.a.b.b;
import com.tencent.mm.plugin.walletlock.c.d;
import com.tencent.mm.plugin.walletlock.fingerprint.ui.FingerprintWalletLockUI;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;

public final class a extends com.tencent.mm.plugin.walletlock.c.a
{
  public final void a(Activity paramActivity, b.b paramb)
  {
    AppMethodBeat.i(51446);
    if (!com.tencent.mm.kernel.g.RL().J(com.tencent.mm.plugin.walletlock.a.a.class))
    {
      ab.d("MicroMsg.FaceIdLockImpl", "Plugin gesture is not installed.");
      AppMethodBeat.o(51446);
    }
    while (true)
    {
      return;
      if ((paramb == null) || (paramb.ae(paramActivity)))
        break;
      ab.d("MicroMsg.FaceIdLockImpl", "protectMeOnCreate: still in filter range, do not activate protection.");
      AppMethodBeat.o(51446);
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
      AppMethodBeat.o(51446);
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
    AppMethodBeat.i(51447);
    super.a(paramActivity, paramb, parama);
    AppMethodBeat.o(51447);
  }

  public final void b(Activity paramActivity, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(51448);
    super.b(paramActivity, paramInt1, paramInt2);
    AppMethodBeat.o(51448);
  }

  public final b.b cTi()
  {
    AppMethodBeat.i(51449);
    d locald = d.cTU();
    AppMethodBeat.o(51449);
    return locald;
  }

  public final boolean cTj()
  {
    AppMethodBeat.i(51450);
    com.tencent.mm.plugin.walletlock.c.g localg = com.tencent.mm.plugin.walletlock.c.g.tWY;
    boolean bool = com.tencent.mm.plugin.walletlock.c.g.cTo();
    AppMethodBeat.o(51450);
    return bool;
  }

  public final void init()
  {
    AppMethodBeat.i(51445);
    com.tencent.mm.plugin.walletlock.c.g localg = com.tencent.mm.plugin.walletlock.c.g.tWY;
    com.tencent.mm.plugin.walletlock.c.g.cTX();
    com.tencent.mm.plugin.walletlock.c.g.tWY.HG(3);
    AppMethodBeat.o(51445);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.walletlock.b.a
 * JD-Core Version:    0.6.2
 */