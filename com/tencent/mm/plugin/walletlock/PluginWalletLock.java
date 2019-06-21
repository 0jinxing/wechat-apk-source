package com.tencent.mm.plugin.walletlock;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.api.c;
import com.tencent.mm.kernel.e.c;
import com.tencent.mm.plugin.messenger.foundation.a.u;
import com.tencent.mm.plugin.walletlock.a.b;
import com.tencent.mm.plugin.walletlock.c.i;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashSet;

public class PluginWalletLock extends com.tencent.mm.kernel.b.f
  implements c, com.tencent.mm.plugin.walletlock.a.a
{
  private com.tencent.mm.plugin.walletlock.c.f tUZ = null;

  public void configure(com.tencent.mm.kernel.b.g paramg)
  {
    AppMethodBeat.i(51442);
    if (paramg.SG())
    {
      ab.i("MicroMsg.PluginWalletLock", "alvinluo registerService IWalletLock and add listeners");
      com.tencent.mm.kernel.g.a(b.class, new com.tencent.mm.kernel.c.e(new com.tencent.mm.plugin.walletlock.c.e()));
      u.a(1, new PluginWalletLock.a(this, (byte)0));
    }
    AppMethodBeat.o(51442);
  }

  public void dependency()
  {
    AppMethodBeat.i(51441);
    dependsOn(com.tencent.mm.plugin.soter.a.a.class);
    AppMethodBeat.o(51441);
  }

  public void execute(com.tencent.mm.kernel.b.g paramg)
  {
  }

  public void installed()
  {
    AppMethodBeat.i(51440);
    alias(com.tencent.mm.plugin.walletlock.a.a.class);
    AppMethodBeat.o(51440);
  }

  public String name()
  {
    return "plugin-wallet-lock";
  }

  public void onAccountInitialized(e.c paramc)
  {
    AppMethodBeat.i(51443);
    ab.i("MicroMsg.PluginWalletLock", "alvinluo PluginWalletLock onAccountInitialized");
    this.tUZ = new com.tencent.mm.plugin.walletlock.c.f();
    paramc = this.tUZ;
    if (!com.tencent.mm.sdk.b.a.xxA.e(paramc.tWT))
      com.tencent.mm.sdk.b.a.xxA.c(paramc.tWT);
    if (!com.tencent.mm.sdk.b.a.xxA.e(paramc.tWU))
      com.tencent.mm.sdk.b.a.xxA.c(paramc.tWU);
    if (!com.tencent.mm.sdk.b.a.xxA.e(paramc.tWW))
      com.tencent.mm.sdk.b.a.xxA.c(paramc.tWW);
    try
    {
      paramc = ((com.tencent.mm.plugin.zero.b.a)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.zero.b.a.class)).Nu().getValue("PatternLockTimeInterval");
      if (!bo.isNullOrNil(paramc))
      {
        int i = bo.getInt(paramc, 0);
        if (i >= 0)
        {
          ab.d("MicroMsg.WalletLockInitTask", String.format("Dynamic config for PatternLockInterval override default config, newval=%d", new Object[] { Integer.valueOf(i) }));
          com.tencent.mm.plugin.walletlock.gesture.a.a.tVy = i;
          ((b)com.tencent.mm.kernel.g.K(b.class)).init();
          AppMethodBeat.o(51443);
          return;
        }
      }
    }
    catch (Exception paramc)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.WalletLockInitTask", paramc, "", new Object[0]);
        paramc = null;
        continue;
        ab.d("MicroMsg.WalletLockInitTask", "PatternLockInterval keeps default value.");
        com.tencent.mm.plugin.walletlock.gesture.a.a.tVy = 300;
        continue;
        ab.d("MicroMsg.WalletLockInitTask", "PatternLockInterval keeps default value.");
        com.tencent.mm.plugin.walletlock.gesture.a.a.tVy = 300;
      }
    }
  }

  public void onAccountRelease()
  {
    AppMethodBeat.i(51444);
    ab.i("MicroMsg.PluginWalletLock", "alvinluo PluginWalletLock onAccountRelease");
    if (this.tUZ != null)
    {
      Object localObject = this.tUZ;
      if (com.tencent.mm.sdk.b.a.xxA.e(((com.tencent.mm.plugin.walletlock.c.f)localObject).tWT))
        com.tencent.mm.sdk.b.a.xxA.d(((com.tencent.mm.plugin.walletlock.c.f)localObject).tWT);
      if (com.tencent.mm.sdk.b.a.xxA.e(((com.tencent.mm.plugin.walletlock.c.f)localObject).tWU))
        com.tencent.mm.sdk.b.a.xxA.d(((com.tencent.mm.plugin.walletlock.c.f)localObject).tWU);
      if (com.tencent.mm.sdk.b.a.xxA.e(((com.tencent.mm.plugin.walletlock.c.f)localObject).tWW))
        com.tencent.mm.sdk.b.a.xxA.d(((com.tencent.mm.plugin.walletlock.c.f)localObject).tWW);
      localObject = i.tXc;
      if (((i)localObject).tXg != null)
        ((i)localObject).tXg.clear();
    }
    AppMethodBeat.o(51444);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.walletlock.PluginWalletLock
 * JD-Core Version:    0.6.2
 */