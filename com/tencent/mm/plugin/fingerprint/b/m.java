package com.tencent.mm.plugin.fingerprint.b;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fingerprint.c.b;
import com.tencent.mm.plugin.fingerprint.c.c;
import com.tencent.mm.plugin.soter.b.f;
import com.tencent.mm.plugin.wallet_core.model.v;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import java.lang.ref.WeakReference;

public final class m
  implements com.tencent.mm.pluginsdk.wallet.j
{
  private String gEk;
  WeakReference<WalletBaseUI> msa;
  private com.tencent.mm.pluginsdk.wallet.a msb;
  private com.tencent.mm.pluginsdk.wallet.a msc;

  private void aE(int paramInt, String paramString)
  {
    AppMethodBeat.i(41547);
    if (this.msc != null)
      this.msc.aC(paramInt, paramString);
    AppMethodBeat.o(41547);
  }

  private void bxN()
  {
    AppMethodBeat.i(41545);
    com.tencent.soter.a.a.a(new m.2(this), true, 1, new c(this.gEk, 2), new f());
    AppMethodBeat.o(41545);
  }

  public final void a(Context paramContext, com.tencent.mm.pluginsdk.wallet.a parama, String paramString)
  {
    AppMethodBeat.i(41541);
    ab.i("MicroMsg.SoterFaceIdOpenDelegate", "do prepare");
    this.msb = parama;
    this.gEk = paramString;
    this.msa = new WeakReference((WalletBaseUI)paramContext);
    ((WalletBaseUI)this.msa.get()).nf(1586);
    ((WalletBaseUI)this.msa.get()).nf(1638);
    bxN();
    AppMethodBeat.o(41541);
  }

  public final void a(com.tencent.mm.pluginsdk.wallet.a parama, String paramString, int paramInt)
  {
    AppMethodBeat.i(41544);
    ab.i("MicroMsg.SoterFaceIdOpenDelegate", "hy: doOpenFP");
    this.msc = parama;
    parama = v.tCn.tCp;
    if (parama != null)
    {
      if ((this.msa == null) || (this.msa.get() == null))
        break label116;
      ((WalletBaseUI)this.msa.get()).a(new b(parama.Avx, parama.signature, this.gEk, 2), true, true);
      AppMethodBeat.o(41544);
    }
    while (true)
    {
      return;
      ab.e("MicroMsg.SoterFaceIdOpenDelegate", "hy: signature is null");
      com.tencent.mm.plugin.soter.d.a.e(9, -1000223, -1, "signature is null");
      aE(-1, ah.getContext().getString(2131299559));
      label116: AppMethodBeat.o(41544);
    }
  }

  final void aD(int paramInt, String paramString)
  {
    AppMethodBeat.i(41546);
    if (this.msb != null)
      this.msb.aC(paramInt, paramString);
    AppMethodBeat.o(41546);
  }

  public final boolean c(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm)
  {
    AppMethodBeat.i(41543);
    ab.i("MicroMsg.SoterFaceIdOpenDelegate", "hy: onSceneEnd: errType: %d, errCode: %d, errMsg: %s, scene: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString, paramm });
    String str = paramString;
    if (bo.isNullOrNil(paramString))
      str = ah.getContext().getString(2131299559);
    boolean bool;
    if ((paramm instanceof com.tencent.mm.plugin.fingerprint.c.a))
    {
      if ((paramInt1 != 0) || (paramInt2 != 0))
        break label177;
      ab.i("MicroMsg.SoterFaceIdOpenDelegate", "get challenge success");
      if (bo.isNullOrNil(((com.tencent.mm.plugin.fingerprint.c.a)paramm).msn))
      {
        aD(-1, str);
        AppMethodBeat.o(41543);
        bool = true;
      }
    }
    while (true)
    {
      return bool;
      al.d(new m.1(this));
      if ((paramm instanceof b))
      {
        if ((paramInt2 == 0) && (paramInt1 == 0))
        {
          ab.i("MicroMsg.SoterFaceIdOpenDelegate", "hy: open success");
          com.tencent.mm.plugin.soter.d.a.cvO();
          com.tencent.mm.plugin.soter.d.a.e(0, 0, 0, "OK");
          aE(0, str);
        }
        while (true)
        {
          AppMethodBeat.o(41543);
          bool = true;
          break;
          label177: ab.e("MicroMsg.SoterFaceIdOpenDelegate", "hy: failed get challenge");
          aD(paramInt2, str);
          com.tencent.mm.plugin.soter.d.a.e(7, paramInt1, paramInt2, "get challenge failed");
          AppMethodBeat.o(41543);
          bool = true;
          break;
          ab.i("MicroMsg.SoterFaceIdOpenDelegate", "hy: open");
          com.tencent.mm.plugin.soter.d.a.e(8, paramInt1, paramInt2, "open fp pay failed");
          aE(-1, str);
        }
      }
      AppMethodBeat.o(41543);
      bool = false;
    }
  }

  public final void clear()
  {
    AppMethodBeat.i(41542);
    ab.i("MicroMsg.SoterFaceIdOpenDelegate", "hy: clear");
    if ((this.msa != null) && (this.msa.get() != null))
    {
      ((WalletBaseUI)this.msa.get()).ng(1586);
      ((WalletBaseUI)this.msa.get()).ng(1638);
    }
    v.tCn.reset();
    if ((this.msa != null) && (this.msa.get() != null))
      this.msa.clear();
    AppMethodBeat.o(41542);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fingerprint.b.m
 * JD-Core Version:    0.6.2
 */