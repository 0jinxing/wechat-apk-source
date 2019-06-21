package com.tencent.mm.plugin.walletlock.fingerprint.a;

import android.content.SharedPreferences;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.plugin.walletlock.c.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.soter.a.a;

public final class c
  implements com.tencent.mm.ai.f, d
{
  private String gHr = null;
  boolean isCancelled = false;
  d.a tVc = null;
  private d.a tVd = null;
  private boolean tVe = false;

  static void gP(String paramString1, String paramString2)
  {
    AppMethodBeat.i(51474);
    paramString1 = new e(paramString1, paramString2);
    com.tencent.mm.kernel.g.Rg().a(paramString1, 0);
    AppMethodBeat.o(51474);
  }

  private void nw(boolean paramBoolean)
  {
    AppMethodBeat.i(51473);
    ab.i("MicroMsg.FingerprintLockOpenDelegate", "alvinluo prepareAuthKey isNeedChangeAuthKey: %b", new Object[] { Boolean.valueOf(paramBoolean) });
    com.tencent.soter.a.b.b local1 = new com.tencent.soter.a.b.b()
    {
    };
    if (this.tVe);
    for (Object localObject = null; ; localObject = new g(this.gHr))
    {
      a.a(local1, paramBoolean, 3, (com.tencent.soter.a.f.e)localObject, new com.tencent.mm.plugin.soter.b.f());
      AppMethodBeat.o(51473);
      return;
    }
  }

  public final void a(d.a parama, Bundle paramBundle)
  {
    AppMethodBeat.i(51472);
    this.gHr = paramBundle.getString("key_pay_passwd");
    this.tVe = paramBundle.getBoolean("key_fp_lock_offline_mode");
    ab.i("MicroMsg.FingerprintLockOpenDelegate", "alvinluo prepare pwd: %s, isOfflineMode: %b", new Object[] { this.gHr, Boolean.valueOf(this.tVe) });
    this.tVc = parama;
    this.isCancelled = false;
    com.tencent.mm.plugin.walletlock.c.g.tWY.tWZ = null;
    com.tencent.mm.plugin.walletlock.c.g.tWY.tXa = null;
    com.tencent.mm.kernel.g.Rg().a(1967, this);
    com.tencent.mm.kernel.g.Rg().a(1548, this);
    if (this.tVe)
    {
      long l = System.currentTimeMillis();
      com.tencent.mm.plugin.walletlock.c.g.tWY.tWZ = String.valueOf(l);
      nw(false);
      AppMethodBeat.o(51472);
    }
    while (true)
    {
      return;
      parama = ah.doB();
      if (parama == null)
      {
        if (this.tVc != null)
          this.tVc.aC(2, "system error");
        AppMethodBeat.o(51472);
      }
      else
      {
        String str = parama.getString("cpu_id", null);
        paramBundle = parama.getString("uid", null);
        ab.i("MicroMsg.FingerprintLockOpenDelegate", "alvinluo cpuId: %s, uid: %s", new Object[] { str, paramBundle });
        if ((bo.isNullOrNil(str)) || (bo.isNullOrNil(paramBundle)))
        {
          com.tencent.mm.plugin.soter.e.b.a(true, true, new c.2(this, parama));
          AppMethodBeat.o(51472);
        }
        else
        {
          gP(str, paramBundle);
          AppMethodBeat.o(51472);
        }
      }
    }
  }

  public final void a(d.a parama, String paramString1, String paramString2, String paramString3)
  {
    AppMethodBeat.i(51475);
    ab.i("MicroMsg.FingerprintLockOpenDelegate", "alvinluo do open fingerprint lock");
    this.tVd = parama;
    com.tencent.mm.kernel.g.Rg().a(new f(paramString2, paramString3, paramString1), 0);
    AppMethodBeat.o(51475);
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(51477);
    ab.i("MicroMsg.FingerprintLockOpenDelegate", "alvinluo fingerprint wallet lock open delegate errType: %d, errCode: %d, errMsg: %s, cgi type: %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString, Integer.valueOf(paramm.getType()) });
    if (this.isCancelled)
      AppMethodBeat.o(51477);
    while (true)
    {
      return;
      if ((paramm instanceof e))
      {
        if ((paramInt1 == 0) && (paramInt2 == 0))
        {
          paramm = (e)paramm;
          paramString = paramm.msn;
          com.tencent.mm.plugin.walletlock.c.g.tWY.tWZ = paramString;
          nw(paramm.tVh);
          AppMethodBeat.o(51477);
        }
        else if (this.tVc != null)
        {
          this.tVc.aC(7, "get challenge failed");
          AppMethodBeat.o(51477);
        }
      }
      else if ((paramm instanceof f))
      {
        if ((paramInt1 == 0) && (paramInt2 == 0))
        {
          h.nA(true);
          if (this.tVd != null)
          {
            this.tVd.aC(0, "open touch lock ok");
            AppMethodBeat.o(51477);
          }
        }
        else
        {
          h.nA(false);
          if (this.tVd != null)
            this.tVd.aC(6, "open touch lock failed");
        }
      }
      else
        AppMethodBeat.o(51477);
    }
  }

  public final void release()
  {
    AppMethodBeat.i(51476);
    ab.d("MicroMsg.FingerprintLockOpenDelegate", "alvinluo release open delegate");
    this.tVc = null;
    this.tVd = null;
    this.isCancelled = true;
    com.tencent.mm.kernel.g.Rg().b(1967, this);
    com.tencent.mm.kernel.g.Rg().b(1548, this);
    AppMethodBeat.o(51476);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.walletlock.fingerprint.a.c
 * JD-Core Version:    0.6.2
 */