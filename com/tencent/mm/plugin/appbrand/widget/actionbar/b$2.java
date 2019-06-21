package com.tencent.mm.plugin.appbrand.widget.actionbar;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.HashSet;
import java.util.Iterator;

final class b$2
  implements View.OnClickListener
{
  b$2(b paramb)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(87450);
    Object localObject = this.iUQ.iUK;
    paramView = this.iUQ.iUC;
    if (((c)localObject).iUS.isEmpty());
    for (int i = 0; ; i = 1)
    {
      if (i == 0)
        this.iUQ.iUK.cA(this.iUQ.iUC);
      AppMethodBeat.o(87450);
      return;
      localObject = ((c)localObject).iUS.iterator();
      while (((Iterator)localObject).hasNext())
        ((View.OnClickListener)((Iterator)localObject).next()).onClick(paramView);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.actionbar.b.2
 * JD-Core Version:    0.6.2
 */