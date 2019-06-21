package com.tencent.mm.plugin.appbrand.widget.actionbar;

import android.graphics.drawable.ColorDrawable;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class d$a extends ColorDrawable
{
  d$a(d paramd)
  {
    super(0);
  }

  private void aOP()
  {
    AppMethodBeat.i(87486);
    this.iUY.setStatusBarColor(getColor());
    AppMethodBeat.o(87486);
  }

  public final void setAlpha(int paramInt)
  {
    AppMethodBeat.i(87485);
    super.setAlpha(paramInt);
    aOP();
    AppMethodBeat.o(87485);
  }

  public final void setColor(int paramInt)
  {
    AppMethodBeat.i(87484);
    super.setColor(paramInt);
    aOP();
    AppMethodBeat.o(87484);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.actionbar.d.a
 * JD-Core Version:    0.6.2
 */