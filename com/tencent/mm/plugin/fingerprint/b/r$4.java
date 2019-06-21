package com.tencent.mm.plugin.fingerprint.b;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.i;
import com.tencent.mm.wallet_core.c;

final class r$4
  implements View.OnClickListener
{
  r$4(r paramr, c paramc, Bundle paramBundle, Activity paramActivity, i parami)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(41564);
    ab.i("MicroMsg.WalletSoterService", "click fingerprint btn");
    if (this.msl != null)
    {
      this.msi.putBoolean("key_show_guide", false);
      paramView = new Intent();
      paramView.putExtras(this.msi);
      d.b(this.ghG, "fingerprint", ".ui.FingerPrintAuthTransparentUI", paramView);
    }
    this.iGU.dismiss();
    AppMethodBeat.o(41564);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fingerprint.b.r.4
 * JD-Core Version:    0.6.2
 */