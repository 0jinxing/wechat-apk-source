package com.tencent.mm.ui.base;

import android.app.Dialog;
import android.widget.LinearLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class h$14$1
  implements Runnable
{
  h$14$1(h.14 param14, int paramInt)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(106417);
    ((Dialog)this.ytC.qmm.getTag()).dismiss();
    if (this.ytC.ytA != null)
      this.ytC.ytA.BB(this.ytB);
    AppMethodBeat.o(106417);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.h.14.1
 * JD-Core Version:    0.6.2
 */