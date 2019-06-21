package com.tencent.mm.plugin.sns.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;

final class SnsUploadUI$12
  implements DialogInterface.OnClickListener
{
  SnsUploadUI$12(SnsUploadUI paramSnsUploadUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(39751);
    if (SnsUploadUI.g(this.rCO) == 9)
    {
      g.RQ();
      g.RP().Ry().set(ac.a.xLh, "");
      SnsUploadUI.h(this.rCO);
      if ((SnsUploadUI.d(this.rCO) instanceof ad))
        SnsUploadUI.f(this.rCO).setText("");
      switch (SnsUploadUI.g(this.rCO))
      {
      default:
        paramInt = 0;
      case 9:
      case 0:
      case 14:
      }
    }
    while (true)
    {
      h.pYm.e(14247, new Object[] { Integer.valueOf(0), Integer.valueOf(paramInt), SnsUploadUI.i(this.rCO), Long.valueOf(bo.anT()) });
      SnsUploadUI.k(this.rCO);
      AppMethodBeat.o(39751);
      return;
      g.RQ();
      g.RP().Ry().set(ac.a.xLg, "");
      break;
      paramInt = 2;
      continue;
      paramInt = 4;
      continue;
      paramInt = 6;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsUploadUI.12
 * JD-Core Version:    0.6.2
 */