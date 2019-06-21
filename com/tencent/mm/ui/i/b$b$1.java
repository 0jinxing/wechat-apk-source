package com.tencent.mm.ui.i;

import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class b$b$1
  implements DialogInterface.OnDismissListener
{
  b$b$1(b.b paramb)
  {
  }

  public final void onDismiss(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(80360);
    if ((this.zLj.zxZ) && (this.zLj.zLi != null))
    {
      b.a(this.zLj.zLi).onCancel();
      this.zLj.zLi.dismiss();
    }
    AppMethodBeat.o(80360);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.i.b.b.1
 * JD-Core Version:    0.6.2
 */