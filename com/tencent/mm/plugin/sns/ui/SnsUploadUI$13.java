package com.tencent.mm.plugin.sns.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;

final class SnsUploadUI$13
  implements DialogInterface.OnClickListener
{
  SnsUploadUI$13(SnsUploadUI paramSnsUploadUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(39752);
    if (SnsUploadUI.g(this.rCO) == 9)
    {
      g.RQ();
      g.RP().Ry().set(ac.a.xLh, "");
    }
    while (true)
    {
      SnsUploadUI.h(this.rCO);
      SnsUploadUI.k(this.rCO);
      AppMethodBeat.o(39752);
      return;
      g.RQ();
      g.RP().Ry().set(ac.a.xLg, "");
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsUploadUI.13
 * JD-Core Version:    0.6.2
 */