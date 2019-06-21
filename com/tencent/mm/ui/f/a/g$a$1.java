package com.tencent.mm.ui.f.a;

import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class g$a$1
  implements DialogInterface.OnDismissListener
{
  g$a$1(g.a parama)
  {
  }

  public final void onDismiss(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(80332);
    if ((this.zya.zxZ) && (this.zya.zxY != null))
    {
      g.a(this.zya.zxY).onCancel();
      this.zya.zxY.dismiss();
    }
    AppMethodBeat.o(80332);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.f.a.g.a.1
 * JD-Core Version:    0.6.2
 */