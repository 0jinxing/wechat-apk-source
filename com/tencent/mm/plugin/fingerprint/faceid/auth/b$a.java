package com.tencent.mm.plugin.fingerprint.faceid.auth;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface.OnShowListener;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.wallet_core.model.v;
import com.tencent.mm.pluginsdk.l;
import com.tencent.mm.pluginsdk.wallet.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.soter.a.g.f;

final class b$a
  implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener, DialogInterface.OnShowListener
{
  private Bundle fPq;
  b mrl;
  private l mrm;
  private a mrn;
  private int mro;
  boolean mrp;
  private c mrq;
  private int retryCount;
  private int scene;

  public b$a(b paramb, a parama, Bundle paramBundle)
  {
    AppMethodBeat.i(41400);
    this.retryCount = 0;
    this.mrp = false;
    this.mrq = new b.a.1(this);
    this.mrl = paramb;
    this.mrn = parama;
    this.fPq = paramBundle;
    if (this.fPq != null)
      this.scene = this.fPq.getInt("face_auth_scene");
    AppMethodBeat.o(41400);
  }

  private void bxb()
  {
    AppMethodBeat.i(41401);
    this.mrm.bxk();
    AppMethodBeat.o(41401);
  }

  final void bwO()
  {
    AppMethodBeat.i(41404);
    ab.i("MicroMsg.WalletFaceIdDialog", "auth cancel");
    if (this.mrn != null)
    {
      this.mrn.bwO();
      this.mrn = null;
    }
    AppMethodBeat.o(41404);
  }

  final void bxc()
  {
    AppMethodBeat.i(41402);
    ab.i("MicroMsg.WalletFaceIdDialog", "req faceid auth");
    if (this.mrm == null)
    {
      ab.w("MicroMsg.WalletFaceIdDialog", "mgr is null");
      AppMethodBeat.o(41402);
    }
    while (true)
    {
      return;
      this.mrm.bxu();
      this.mrm.bxt();
      if (!this.mrm.bxB())
      {
        ab.w("MicroMsg.WalletFaceIdDialog", "no faceid enrolled");
        vJ(-2);
        AppMethodBeat.o(41402);
      }
      else if (bo.isNullOrNil(v.tCn.msn))
      {
        ab.i("MicroMsg.WalletFaceIdDialog", "no challenge");
        vJ(-3);
        AppMethodBeat.o(41402);
      }
      else
      {
        this.mrm.a(this.mrq);
        this.mrl.bxa();
        AppMethodBeat.o(41402);
      }
    }
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(41407);
    ab.d("MicroMsg.WalletFaceIdDialog", "face id dialog cancel");
    bwO();
    AppMethodBeat.o(41407);
  }

  public final void onDismiss(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(41405);
    ab.i("MicroMsg.WalletFaceIdDialog", "face id dialog dismiss");
    bxb();
    if (this.scene == 1)
      bwO();
    AppMethodBeat.o(41405);
  }

  public final void onShow(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(41406);
    ab.i("MicroMsg.WalletFaceIdDialog", "face id dialog show");
    this.mrm = ((l)g.K(l.class));
    f.dRn().dRo();
    bxc();
    AppMethodBeat.o(41406);
  }

  final void vJ(int paramInt)
  {
    AppMethodBeat.i(41403);
    ab.i("MicroMsg.WalletFaceIdDialog", "auth fail");
    if (this.mrn != null)
    {
      this.mrn.vJ(paramInt);
      this.mrn = null;
    }
    this.mrl.dismiss();
    AppMethodBeat.o(41403);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fingerprint.faceid.auth.b.a
 * JD-Core Version:    0.6.2
 */