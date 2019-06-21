package com.tencent.mm.plugin.walletlock.c;

import android.app.Activity;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.walletlock.a.b.a;
import com.tencent.mm.plugin.walletlock.a.b.b;
import com.tencent.mm.plugin.walletlock.gesture.a.c;
import com.tencent.mm.plugin.walletlock.ui.WalletLockSettingUI;
import com.tencent.mm.sdk.platformtools.ab;

public class a
  implements com.tencent.mm.plugin.walletlock.a.b
{
  protected static int af(Activity paramActivity)
  {
    int i = 1;
    AppMethodBeat.i(51682);
    ab.i("MicroMsg.BaseWalletLockImpl", "alvinluo activity %s", new Object[] { paramActivity.getClass().getSimpleName() });
    if (paramActivity.getClass().getSimpleName().equals("MallIndexUI"))
      AppMethodBeat.o(51682);
    while (true)
    {
      return i;
      if (paramActivity.getClass().getSimpleName().equals("WalletOfflineCoinPurseUI"))
      {
        i = 2;
        AppMethodBeat.o(51682);
      }
      else
      {
        i = -1;
        AppMethodBeat.o(51682);
      }
    }
  }

  public void HB(int paramInt)
  {
  }

  public void a(Activity paramActivity, b.b paramb)
  {
  }

  public void a(Activity paramActivity, b.b paramb, b.a parama)
  {
  }

  public void ad(Activity paramActivity)
  {
  }

  public void b(Activity paramActivity, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(51685);
    ab.i("MicroMsg.BaseWalletLockImpl", "alvinluo enterNewWalletLockProcessForResult walletLockType: %d, requestCode: %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if (paramInt1 == 1)
    {
      new c().b(paramActivity, paramInt1, paramInt2);
      AppMethodBeat.o(51685);
    }
    while (true)
    {
      return;
      if (paramInt1 == 2)
        new com.tencent.mm.plugin.walletlock.fingerprint.a.b().b(paramActivity, paramInt1, paramInt2);
      AppMethodBeat.o(51685);
    }
  }

  public void b(Activity paramActivity, Intent paramIntent)
  {
    AppMethodBeat.i(51686);
    paramIntent.setClass(paramActivity, WalletLockSettingUI.class);
    paramActivity.startActivity(paramIntent);
    AppMethodBeat.o(51686);
  }

  public void b(Activity paramActivity, Intent paramIntent, int paramInt)
  {
    AppMethodBeat.i(51687);
    paramIntent.setClass(paramActivity, WalletLockSettingUI.class);
    paramActivity.startActivityForResult(paramIntent, paramInt);
    AppMethodBeat.o(51687);
  }

  public b.b cTi()
  {
    return null;
  }

  public boolean cTj()
  {
    return false;
  }

  public boolean cTk()
  {
    return false;
  }

  public void h(Activity paramActivity, int paramInt)
  {
    AppMethodBeat.i(51684);
    ab.i("MicroMsg.BaseWalletLockImpl", "alvinluo enterNewWalletLockProcess walletLockType: %d", new Object[] { Integer.valueOf(paramInt) });
    if (paramInt == 1)
    {
      new c().h(paramActivity, paramInt);
      AppMethodBeat.o(51684);
    }
    while (true)
    {
      return;
      if (paramInt == 2)
        new com.tencent.mm.plugin.walletlock.fingerprint.a.b().h(paramActivity, paramInt);
      AppMethodBeat.o(51684);
    }
  }

  public void i(Activity paramActivity, int paramInt)
  {
  }

  public void init()
  {
    AppMethodBeat.i(51683);
    g.tWY.HG(0);
    AppMethodBeat.o(51683);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.walletlock.c.a
 * JD-Core Version:    0.6.2
 */