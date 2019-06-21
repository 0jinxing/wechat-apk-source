package com.tencent.mm.pluginsdk.ui.e;

import android.content.DialogInterface.OnDismissListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.k;

final class l$5
  implements l.a.a
{
  l$5(k paramk, DialogInterface.OnDismissListener paramOnDismissListener)
  {
  }

  public final void iv(boolean paramBoolean)
  {
    AppMethodBeat.i(28135);
    if (paramBoolean)
    {
      this.vse.dismiss();
      if (this.vsb != null)
        this.vsb.onDismiss(null);
    }
    AppMethodBeat.o(28135);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.e.l.5
 * JD-Core Version:    0.6.2
 */