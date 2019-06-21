package com.tencent.mm.ui.tools;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class b$2
  implements DialogInterface.OnCancelListener
{
  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(34786);
    b.Pu();
    AppMethodBeat.o(34786);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.b.2
 * JD-Core Version:    0.6.2
 */