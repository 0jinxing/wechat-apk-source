package com.tencent.mm.plugin.fingerprint.b;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
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

public final class n
  implements com.tencent.mm.pluginsdk.wallet.j
{
  private String gEk = "";
  private com.tencent.mm.pluginsdk.wallet.a mrH = null;
  private com.tencent.mm.pluginsdk.wallet.a mrI = null;
  WeakReference<WalletBaseUI> msa = null;

  private void aG(int paramInt, String paramString)
  {
    AppMethodBeat.i(41554);
    ab.i("MicroMsg.SoterFingerprintOpenDelegate", "hy: callback total");
    clear();
    this.mrI.aC(paramInt, paramString);
    this.mrI = null;
    AppMethodBeat.o(41554);
  }

  public final void a(Context paramContext, com.tencent.mm.pluginsdk.wallet.a parama, String paramString)
  {
    AppMethodBeat.i(41550);
    ab.i("MicroMsg.SoterFingerprintOpenDelegate", "hy: prepare");
    this.msa = new WeakReference((WalletBaseUI)paramContext);
    this.mrH = parama;
    this.gEk = paramString;
    ((WalletBaseUI)this.msa.get()).nf(1586);
    ((WalletBaseUI)this.msa.get()).nf(1638);
    com.tencent.mm.plugin.soter.d.a.cvN();
    ab.i("MicroMsg.SoterFingerprintOpenDelegate", "hy: start gen auth key");
    com.tencent.soter.a.a.a(new n.1(this), true, 1, new c(this.gEk, 1), new f());
    AppMethodBeat.o(41550);
  }

  public final void a(com.tencent.mm.pluginsdk.wallet.a parama, String paramString, int paramInt)
  {
    AppMethodBeat.i(41555);
    ab.i("MicroMsg.SoterFingerprintOpenDelegate", "hy: doOpenFP");
    this.mrI = parama;
    parama = v.tCn.tCp;
    if (parama != null)
    {
      if ((this.msa == null) || (this.msa.get() == null))
        break label116;
      ((WalletBaseUI)this.msa.get()).a(new b(parama.Avx, parama.signature, this.gEk, 1), true, true);
      AppMethodBeat.o(41555);
    }
    while (true)
    {
      return;
      ab.e("MicroMsg.SoterFingerprintOpenDelegate", "hy: signature is null");
      com.tencent.mm.plugin.soter.d.a.d(9, -1000223, -1, "signature is null");
      aF(-1, ah.getContext().getString(2131299873));
      label116: AppMethodBeat.o(41555);
    }
  }

  final void aF(int paramInt, String paramString)
  {
    AppMethodBeat.i(41552);
    if (this.mrH != null)
      this.mrH.aC(paramInt, paramString);
    AppMethodBeat.o(41552);
  }

  public final boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(41553);
    ab.i("MicroMsg.SoterFingerprintOpenDelegate", "hy: onSceneEnd: errType: %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    String str = paramString;
    if (bo.isNullOrNil(paramString))
      str = ah.getContext().getString(2131299873);
    boolean bool;
    if ((paramm instanceof com.tencent.mm.plugin.fingerprint.c.a))
    {
      if ((paramInt1 != 0) || (paramInt2 != 0))
        break label172;
      ab.i("MicroMsg.SoterFingerprintOpenDelegate", "get challenge success");
      if (bo.isNullOrNil(((com.tencent.mm.plugin.fingerprint.c.a)paramm).msn))
      {
        aF(-1, str);
        AppMethodBeat.o(41553);
        bool = true;
      }
    }
    while (true)
    {
      return bool;
      al.d(new n.2(this));
      if ((paramm instanceof b))
      {
        if ((paramInt2 == 0) && (paramInt1 == 0))
        {
          ab.i("MicroMsg.SoterFingerprintOpenDelegate", "hy: open success");
          com.tencent.mm.plugin.soter.d.a.cvO();
          com.tencent.mm.plugin.soter.d.a.d(0, 0, 0, "OK");
          aG(0, str);
        }
        while (true)
        {
          AppMethodBeat.o(41553);
          bool = true;
          break;
          label172: ab.e("MicroMsg.SoterFingerprintOpenDelegate", "hy: failed get challenge");
          aF(paramInt2, str);
          com.tencent.mm.plugin.soter.d.a.d(7, paramInt1, paramInt2, "get challenge failed");
          AppMethodBeat.o(41553);
          bool = true;
          break;
          ab.i("MicroMsg.SoterFingerprintOpenDelegate", "hy: open");
          com.tencent.mm.plugin.soter.d.a.d(8, paramInt1, paramInt2, "open fp pay failed");
          aG(-1, str);
        }
      }
      AppMethodBeat.o(41553);
      bool = false;
    }
  }

  public final void clear()
  {
    AppMethodBeat.i(41551);
    ab.i("MicroMsg.SoterFingerprintOpenDelegate", "hy: clear");
    if ((this.msa != null) && (this.msa.get() != null))
    {
      ((WalletBaseUI)this.msa.get()).ng(1586);
      ((WalletBaseUI)this.msa.get()).ng(1638);
    }
    this.mrH = null;
    v.tCn.reset();
    if ((this.msa != null) && (this.msa.get() != null))
      this.msa.clear();
    AppMethodBeat.o(41551);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fingerprint.b.n
 * JD-Core Version:    0.6.2
 */