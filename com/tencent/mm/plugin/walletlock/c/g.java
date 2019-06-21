package com.tencent.mm.plugin.walletlock.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.soter.d.m;
import com.tencent.mm.plugin.walletlock.gesture.a.b;
import com.tencent.mm.plugin.walletlock.gesture.a.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import com.tencent.soter.core.c.j;

public enum g
{
  int mType = -1;
  public String tWZ;
  public j tXa;

  static
  {
    AppMethodBeat.i(51731);
    tWY = new g("instance");
    tXb = new g[] { tWY };
    AppMethodBeat.o(51731);
  }

  public static void cTW()
  {
    AppMethodBeat.i(51722);
    com.tencent.mm.plugin.walletlock.fingerprint.a.a.nu(true);
    AppMethodBeat.o(51722);
  }

  public static void cTX()
  {
    AppMethodBeat.i(51724);
    com.tencent.mm.plugin.walletlock.fingerprint.a.a.nv(true);
    AppMethodBeat.o(51724);
  }

  public static boolean cTY()
  {
    AppMethodBeat.i(51729);
    boolean bool;
    if ((cTZ()) && (m.cvU()) && (com.tencent.soter.core.a.iP(ah.getContext())))
    {
      bool = true;
      AppMethodBeat.o(51729);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(51729);
    }
  }

  public static boolean cTZ()
  {
    AppMethodBeat.i(51730);
    if (((com.tencent.mm.plugin.zero.b.a)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.zero.b.a.class)).Nu().getInt("TouchLockFunction", 0) != 1)
      AppMethodBeat.o(51730);
    for (boolean bool = true; ; bool = false)
    {
      return bool;
      AppMethodBeat.o(51730);
    }
  }

  public static boolean cTn()
  {
    AppMethodBeat.i(51721);
    boolean bool = com.tencent.mm.plugin.walletlock.fingerprint.a.a.cTn();
    ab.i("MicroMsg.WalletLockManager", "isUserSetFingerprintLock: %b", new Object[] { Boolean.valueOf(bool) });
    AppMethodBeat.o(51721);
    return bool;
  }

  public static boolean cTo()
  {
    AppMethodBeat.i(51723);
    boolean bool = com.tencent.mm.plugin.walletlock.fingerprint.a.a.cTo();
    AppMethodBeat.o(51723);
    return bool;
  }

  public static void cTq()
  {
    AppMethodBeat.i(51728);
    d.cTq();
    com.tencent.mm.plugin.walletlock.fingerprint.a.a.cTq();
    AppMethodBeat.o(51728);
  }

  public static boolean cTz()
  {
    AppMethodBeat.i(51719);
    boolean bool = b.cTz();
    AppMethodBeat.o(51719);
    return bool;
  }

  public static void nx(boolean paramBoolean)
  {
    AppMethodBeat.i(51720);
    b.nx(paramBoolean);
    AppMethodBeat.o(51720);
  }

  public static void ny(boolean paramBoolean)
  {
    AppMethodBeat.i(51725);
    ab.i("MicroMsg.WalletLockManager", "alvinluo closeAllWalletLock");
    nz(paramBoolean);
    b.nx(false);
    com.tencent.mm.plugin.walletlock.fingerprint.a.a.nv(false);
    if (paramBoolean)
      com.tencent.mm.plugin.walletlock.fingerprint.a.a.cTm();
    AppMethodBeat.o(51725);
  }

  public static void nz(boolean paramBoolean)
  {
    AppMethodBeat.i(51726);
    com.tencent.mm.plugin.walletlock.fingerprint.a.a.nu(false);
    if (paramBoolean)
      com.tencent.mm.plugin.walletlock.fingerprint.a.a.cTm();
    AppMethodBeat.o(51726);
  }

  public final void HG(int paramInt)
  {
    AppMethodBeat.i(51717);
    ab.i("MicroMsg.WalletLockManager", "alvinluo old wallet lock type: %d, new type: %d", new Object[] { Integer.valueOf(this.mType), Integer.valueOf(paramInt) });
    this.mType = paramInt;
    com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xTg, Integer.valueOf(paramInt));
    com.tencent.mm.kernel.g.RP().Ry().dsb();
    AppMethodBeat.o(51717);
  }

  public final int cTV()
  {
    AppMethodBeat.i(51718);
    if (this.mType == -1)
      this.mType = ((Integer)com.tencent.mm.kernel.g.RP().Ry().get(ac.a.xTg, Integer.valueOf(0))).intValue();
    int i = this.mType;
    AppMethodBeat.o(51718);
    return i;
  }

  public final boolean cTk()
  {
    boolean bool = false;
    AppMethodBeat.i(51727);
    if (this.mType == 1)
    {
      bool = b.cTA();
      AppMethodBeat.o(51727);
    }
    while (true)
    {
      return bool;
      if (this.mType == 2)
      {
        ab.i("MicroMsg.WalletLockManager", "alvinluo isUserBlockedInFingerprint: %b", new Object[] { Boolean.valueOf(com.tencent.mm.plugin.walletlock.fingerprint.a.a.cTp()) });
        bool = com.tencent.mm.plugin.walletlock.fingerprint.a.a.cTp();
        AppMethodBeat.o(51727);
      }
      else
      {
        AppMethodBeat.o(51727);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.walletlock.c.g
 * JD-Core Version:    0.6.2
 */