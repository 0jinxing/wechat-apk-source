package com.tencent.mm.plugin.appbrand.widget.actionbar;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Iterator;
import java.util.Set;

final class b$3
  implements View.OnClickListener
{
  private long iUR = 0L;

  b$3(b paramb)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(87451);
    if (System.currentTimeMillis() - this.iUR < 250L)
    {
      paramView = b.a(this.iUQ).iterator();
      while (paramView.hasNext())
        ((a)paramView.next()).aGw();
      this.iUR = 0L;
    }
    this.iUR = System.currentTimeMillis();
    AppMethodBeat.o(87451);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.actionbar.b.3
 * JD-Core Version:    0.6.2
 */