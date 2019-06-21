package com.tencent.mm.ui.widget.picker;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class a$3
  implements DialogInterface.OnCancelListener
{
  a$3(a parama)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(112810);
    a.a(this.zSk, false, 0, 0, 0);
    this.zSk.hide();
    AppMethodBeat.o(112810);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.widget.picker.a.3
 * JD-Core Version:    0.6.2
 */