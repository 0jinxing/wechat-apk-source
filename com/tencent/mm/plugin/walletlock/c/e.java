package com.tencent.mm.plugin.walletlock.c;

import android.app.Activity;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.plugin.soter.d.m;
import com.tencent.mm.plugin.walletlock.a.b.a;
import com.tencent.mm.plugin.walletlock.a.b.b;
import com.tencent.mm.plugin.walletlock.gesture.a.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;

public final class e extends a
{
  private static com.tencent.mm.plugin.walletlock.a.b tWS;

  private static void aDp()
  {
    AppMethodBeat.i(51693);
    ab.i("MicroMsg.WalletLockImpl", "alvinluo WalletLock init end, wallet lock type: %d", new Object[] { Integer.valueOf(g.tWY.cTV()) });
    AppMethodBeat.o(51693);
  }

  public final void HB(int paramInt)
  {
    AppMethodBeat.i(51705);
    Object localObject;
    if (paramInt == 1)
    {
      ab.i("MicroMsg.WalletLockImpl", "alvinluo wallet lock switch to gesture");
      localObject = new c();
      tWS = (com.tencent.mm.plugin.walletlock.a.b)localObject;
      ((com.tencent.mm.plugin.walletlock.a.b)localObject).init();
      localObject = g.tWY;
      g.nz(true);
      AppMethodBeat.o(51705);
    }
    while (true)
    {
      return;
      if (paramInt == 2)
      {
        ab.i("MicroMsg.WalletLockImpl", "alvinluo wallet lock switch to fingerprint lock");
        localObject = new com.tencent.mm.plugin.walletlock.fingerprint.a.b();
        tWS = (com.tencent.mm.plugin.walletlock.a.b)localObject;
        ((com.tencent.mm.plugin.walletlock.a.b)localObject).init();
        localObject = g.tWY;
        g.nx(false);
        AppMethodBeat.o(51705);
      }
      else if (paramInt == 3)
      {
        ab.i("MicroMsg.WalletLockImpl", "wallet lock switch to faceid lock");
        localObject = new com.tencent.mm.plugin.walletlock.b.a();
        tWS = (com.tencent.mm.plugin.walletlock.a.b)localObject;
        ((com.tencent.mm.plugin.walletlock.a.b)localObject).init();
        AppMethodBeat.o(51705);
      }
      else if (paramInt == 0)
      {
        ab.i("MicroMsg.WalletLockImpl", "alvinluo wallet lock switch to none");
        localObject = new a();
        tWS = (com.tencent.mm.plugin.walletlock.a.b)localObject;
        ((com.tencent.mm.plugin.walletlock.a.b)localObject).init();
        localObject = g.tWY;
        g.ny(true);
        AppMethodBeat.o(51705);
      }
      else
      {
        ab.e("MicroMsg.WalletLockImpl", "alvinluo unknown wallet lock type, ignore switch");
        AppMethodBeat.o(51705);
      }
    }
  }

  public final void a(Activity paramActivity, b.b paramb)
  {
    AppMethodBeat.i(51694);
    if (tWS != null)
      tWS.a(paramActivity, paramb);
    AppMethodBeat.o(51694);
  }

  public final void a(Activity paramActivity, b.b paramb, b.a parama)
  {
    AppMethodBeat.i(51695);
    if (tWS != null)
      tWS.a(paramActivity, paramb, parama);
    AppMethodBeat.o(51695);
  }

  public final void ad(Activity paramActivity)
  {
    AppMethodBeat.i(51698);
    if (tWS != null)
      tWS.ad(paramActivity);
    AppMethodBeat.o(51698);
  }

  public final void b(Activity paramActivity, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(51697);
    super.b(paramActivity, paramInt1, paramInt2);
    AppMethodBeat.o(51697);
  }

  public final void b(Activity paramActivity, Intent paramIntent)
  {
    AppMethodBeat.i(51703);
    if (tWS != null)
    {
      tWS.b(paramActivity, paramIntent);
      AppMethodBeat.o(51703);
    }
    while (true)
    {
      return;
      super.b(paramActivity, paramIntent);
      AppMethodBeat.o(51703);
    }
  }

  public final void b(Activity paramActivity, Intent paramIntent, int paramInt)
  {
    AppMethodBeat.i(51704);
    if (tWS != null)
    {
      tWS.b(paramActivity, paramIntent, paramInt);
      AppMethodBeat.o(51704);
    }
    while (true)
    {
      return;
      super.b(paramActivity, paramIntent, paramInt);
      AppMethodBeat.o(51704);
    }
  }

  public final b.b cTi()
  {
    AppMethodBeat.i(51700);
    b.b localb;
    if (tWS != null)
    {
      localb = tWS.cTi();
      AppMethodBeat.o(51700);
    }
    while (true)
    {
      return localb;
      localb = null;
      AppMethodBeat.o(51700);
    }
  }

  public final boolean cTj()
  {
    AppMethodBeat.i(51701);
    g localg = g.tWY;
    boolean bool;
    if (!g.cTz())
    {
      localg = g.tWY;
      if (!g.cTn());
    }
    else
    {
      bool = true;
      AppMethodBeat.o(51701);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(51701);
    }
  }

  public final boolean cTk()
  {
    AppMethodBeat.i(51702);
    boolean bool;
    if (tWS != null)
    {
      bool = tWS.cTk();
      AppMethodBeat.o(51702);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(51702);
    }
  }

  public final void h(Activity paramActivity, int paramInt)
  {
    AppMethodBeat.i(51696);
    super.h(paramActivity, paramInt);
    AppMethodBeat.o(51696);
  }

  public final void i(Activity paramActivity, int paramInt)
  {
    AppMethodBeat.i(51699);
    Intent localIntent = new Intent();
    localIntent.putExtra("action", "action.close_wallet_lock");
    d.b(paramActivity, "wallet", ".pwd.ui.WalletLockCheckPwdUI", localIntent, paramInt);
    AppMethodBeat.o(51699);
  }

  public final void init()
  {
    AppMethodBeat.i(51692);
    ab.i("MicroMsg.WalletLockImpl", "alvinluo WalletLock init start, call stack: %s", new Object[] { bo.l(new Throwable()) });
    int i = bo.g(com.tencent.mm.kernel.g.RP().Ry().get(40, null), 0);
    ab.i("MicroMsg.WalletLockImpl", "alvinluo pluginSwitch %d %d", new Object[] { Integer.valueOf(i), Integer.valueOf(i & 0x800000) });
    Object localObject;
    if ((i & 0x800000) != 0)
    {
      ab.i("MicroMsg.WalletLockImpl", "alvinluo fingerprint wallet lock is opened");
      localObject = new com.tencent.mm.plugin.walletlock.fingerprint.a.b();
      tWS = (com.tencent.mm.plugin.walletlock.a.b)localObject;
      ((com.tencent.mm.plugin.walletlock.a.b)localObject).init();
      localObject = g.tWY;
      boolean bool = g.cTY();
      ab.i("MicroMsg.WalletLockImpl", "alvinluo init isSupportSoter: %b, isSupportFingerprintLock: %b", new Object[] { Boolean.valueOf(m.cvU()), Boolean.valueOf(bool) });
      if ((com.tencent.mm.plugin.walletlock.gesture.a.b.cTz()) && (!bool))
      {
        bool = com.tencent.mm.kernel.g.RP().Ry().getBoolean(ac.a.xTm, false);
        ab.i("MicroMsg.WalletLockImpl", "alvinluo has opened fingerprint lock, but device not support soter, and use gesture, isAutoJumpToGesture: %b", new Object[] { Boolean.valueOf(bool) });
        if (bool)
        {
          localObject = new c();
          tWS = (com.tencent.mm.plugin.walletlock.a.b)localObject;
          ((com.tencent.mm.plugin.walletlock.a.b)localObject).init();
          aDp();
          AppMethodBeat.o(51692);
        }
      }
    }
    else
    {
      if (!com.tencent.mm.plugin.walletlock.gesture.a.b.cTz())
        break label264;
      ab.i("MicroMsg.WalletLockImpl", "alvinluo gesture wallet lock is opened");
      localObject = new c();
      tWS = (com.tencent.mm.plugin.walletlock.a.b)localObject;
      ((com.tencent.mm.plugin.walletlock.a.b)localObject).init();
      localObject = g.tWY;
      g.nz(false);
    }
    while (true)
    {
      aDp();
      AppMethodBeat.o(51692);
      break;
      label264: ab.i("MicroMsg.WalletLockImpl", "alvinluo wallet lock is not open");
      tWS = new a();
      localObject = g.tWY;
      g.ny(false);
      tWS.init();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.walletlock.c.e
 * JD-Core Version:    0.6.2
 */