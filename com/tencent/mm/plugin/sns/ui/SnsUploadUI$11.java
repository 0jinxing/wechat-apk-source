package com.tencent.mm.plugin.sns.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Parcel;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.e.k;

final class SnsUploadUI$11
  implements DialogInterface.OnClickListener
{
  SnsUploadUI$11(SnsUploadUI paramSnsUploadUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(39750);
    paramDialogInterface = Parcel.obtain();
    this.rCO.getIntent().putExtra(e.k.ygd, SnsUploadUI.f(this.rCO).getText().toString());
    this.rCO.getIntent().writeToParcel(paramDialogInterface, 0);
    paramDialogInterface = paramDialogInterface.marshall();
    if (SnsUploadUI.g(this.rCO) == 9)
    {
      g.RQ();
      g.RP().Ry().set(ac.a.xLh, com.tencent.d.f.e.bytesToHexString(paramDialogInterface));
      SnsUploadUI.h(this.rCO);
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
      SnsUploadUI.j(this.rCO);
      AppMethodBeat.o(39750);
      return;
      g.RQ();
      g.RP().Ry().set(ac.a.xLg, com.tencent.d.f.e.bytesToHexString(paramDialogInterface));
      break;
      paramInt = 1;
      continue;
      paramInt = 3;
      continue;
      paramInt = 5;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsUploadUI.11
 * JD-Core Version:    0.6.2
 */