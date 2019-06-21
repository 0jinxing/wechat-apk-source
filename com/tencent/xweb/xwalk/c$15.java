package com.tencent.xweb.xwalk;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.xweb.util.b;
import com.tencent.xweb.xwalk.a.e;
import java.util.Iterator;
import java.util.List;
import org.xwalk.core.XWalkEnvironment;

final class c$15
  implements View.OnClickListener
{
  c$15(c paramc)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(85136);
    paramView = e.dVQ().iterator();
    while (paramView.hasNext())
      ((com.tencent.xweb.xwalk.a.c)paramView.next()).SD(-1);
    paramView = XWalkEnvironment.getPluginBaseDir();
    if (paramView.isEmpty())
      AppMethodBeat.o(85136);
    while (true)
    {
      return;
      b.avl(paramView);
      this.ARk.aAe();
      AppMethodBeat.o(85136);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.xwalk.c.15
 * JD-Core Version:    0.6.2
 */