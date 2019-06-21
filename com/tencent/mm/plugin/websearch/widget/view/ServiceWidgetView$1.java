package com.tencent.mm.plugin.websearch.widget.view;

import android.support.v4.view.ViewPager;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ServiceWidgetView$1
  implements b.b
{
  ServiceWidgetView$1(ServiceWidgetView paramServiceWidgetView)
  {
  }

  public final void It(int paramInt)
  {
    AppMethodBeat.i(91480);
    this.udI.Iq(paramInt);
    AppMethodBeat.o(91480);
  }

  public final void a(b paramb)
  {
    AppMethodBeat.i(91481);
    if (paramb == this.udI.udF.Iu(this.udI.rap.getCurrentItem()))
      ServiceWidgetView.a(this.udI);
    AppMethodBeat.o(91481);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.websearch.widget.view.ServiceWidgetView.1
 * JD-Core Version:    0.6.2
 */