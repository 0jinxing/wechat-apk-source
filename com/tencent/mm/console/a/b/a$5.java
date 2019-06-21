package com.tencent.mm.console.a.b;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class a$5
  implements DialogInterface.OnClickListener
{
  a$5(a parama)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(16158);
    paramDialogInterface.dismiss();
    AppMethodBeat.o(16158);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.console.a.b.a.5
 * JD-Core Version:    0.6.2
 */