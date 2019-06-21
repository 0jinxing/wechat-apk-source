package com.tencent.mm.pluginsdk.model.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;

final class g$4
  implements DialogInterface.OnClickListener
{
  g$4(Context paramContext, Intent paramIntent, String paramString1, String paramString2, String paramString3, aj paramaj)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(79258);
    this.val$context.startActivity(this.val$intent);
    h.pYm.e(14102, new Object[] { Integer.valueOf(0), Integer.valueOf(1), "", Integer.valueOf(1), this.II, this.vbV, this.vbW });
    if (this.kNO != null)
      this.kNO.dR(true);
    AppMethodBeat.o(79258);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.model.app.g.4
 * JD-Core Version:    0.6.2
 */