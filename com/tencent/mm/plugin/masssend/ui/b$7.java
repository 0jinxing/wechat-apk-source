package com.tencent.mm.plugin.masssend.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.aw;
import com.tencent.mm.plugin.masssend.a.f;

final class b$7
  implements DialogInterface.OnCancelListener
{
  b$7(b paramb, f paramf)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(22773);
    aw.Rg().c(this.ooA);
    if (this.ooz.tipDialog != null)
    {
      this.ooz.tipDialog.dismiss();
      this.ooz.tipDialog = null;
    }
    AppMethodBeat.o(22773);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.masssend.ui.b.7
 * JD-Core Version:    0.6.2
 */