package com.tencent.mm.plugin.nearlife.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;

final class NearLifeCreatePoiUI$8
  implements DialogInterface.OnClickListener
{
  NearLifeCreatePoiUI$8(NearLifeCreatePoiUI paramNearLifeCreatePoiUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(22979);
    h.pYm.e(11138, new Object[] { "3", "0", NearLifeCreatePoiUI.b(this.oSJ) });
    this.oSJ.setResult(0, new Intent());
    this.oSJ.finish();
    AppMethodBeat.o(22979);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.nearlife.ui.NearLifeCreatePoiUI.8
 * JD-Core Version:    0.6.2
 */