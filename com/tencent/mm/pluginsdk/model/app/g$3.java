package com.tencent.mm.pluginsdk.model.app;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;

final class g$3
  implements DialogInterface.OnClickListener
{
  g$3(String paramString1, String paramString2, String paramString3, String paramString4, aj paramaj)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(79257);
    h.pYm.e(14102, new Object[] { Integer.valueOf(0), Integer.valueOf(0), "", Integer.valueOf(0), this.II, this.vbV, this.vbW });
    if ("wx073f4a4daff0abe8".equalsIgnoreCase(this.vbX))
      h.pYm.e(15413, new Object[] { Integer.valueOf(3), "", "" });
    if (this.kNO != null)
      this.kNO.dR(false);
    AppMethodBeat.o(79257);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.model.app.g.3
 * JD-Core Version:    0.6.2
 */