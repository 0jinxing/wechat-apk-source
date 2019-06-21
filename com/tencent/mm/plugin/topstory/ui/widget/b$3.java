package com.tencent.mm.plugin.topstory.ui.widget;

import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class b$3
  implements DialogInterface.OnDismissListener
{
  b$3(b paramb, b.a parama)
  {
  }

  public final void onDismiss(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(2229);
    this.sHW.onDismiss();
    AppMethodBeat.o(2229);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.ui.widget.b.3
 * JD-Core Version:    0.6.2
 */