package com.tencent.mm.ui.widget.snackbar;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class SnackContainer$1
  implements Runnable
{
  SnackContainer$1(SnackContainer paramSnackContainer)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(112991);
    if (this.zTZ.getVisibility() == 0)
      this.zTZ.startAnimation(SnackContainer.a(this.zTZ));
    AppMethodBeat.o(112991);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.widget.snackbar.SnackContainer.1
 * JD-Core Version:    0.6.2
 */