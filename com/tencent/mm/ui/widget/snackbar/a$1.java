package com.tencent.mm.ui.widget.snackbar;

import android.os.Handler;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class a$1
  implements View.OnClickListener
{
  a$1(a parama)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(112973);
    if ((this.zTR.zTO != null) && (this.zTR.zTN.isShowing()))
      this.zTR.zTO.aIu();
    this.zTR.mHandler.postDelayed(new a.1.1(this), 100L);
    AppMethodBeat.o(112973);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.widget.snackbar.a.1
 * JD-Core Version:    0.6.2
 */