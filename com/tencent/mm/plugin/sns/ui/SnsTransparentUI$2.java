package com.tencent.mm.plugin.sns.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.ad;

final class SnsTransparentUI$2
  implements DialogInterface.OnDismissListener
{
  SnsTransparentUI$2(SnsTransparentUI paramSnsTransparentUI)
  {
  }

  public final void onDismiss(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(39634);
    ad.eQ(this.rBH);
    this.rBH.finish();
    AppMethodBeat.o(39634);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsTransparentUI.2
 * JD-Core Version:    0.6.2
 */