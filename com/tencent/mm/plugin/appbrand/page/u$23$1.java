package com.tencent.mm.plugin.appbrand.page;

import android.view.View.OnLayoutChangeListener;
import android.widget.FrameLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class u$23$1
  implements Runnable
{
  u$23$1(u.23 param23, View.OnLayoutChangeListener paramOnLayoutChangeListener)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(87181);
    this.itk.ita.aBk().removeOnLayoutChangeListener(this.itj);
    AppMethodBeat.o(87181);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.page.u.23.1
 * JD-Core Version:    0.6.2
 */