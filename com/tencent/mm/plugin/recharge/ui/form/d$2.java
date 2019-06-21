package com.tencent.mm.plugin.recharge.ui.form;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.recharge.a.a;
import java.util.LinkedList;

final class d$2
  implements View.OnClickListener
{
  d$2(d paramd)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(44404);
    a.cea().cK(null);
    d.b(this.pIW).cey();
    this.pIW.cK(new LinkedList());
    if (d.c(this.pIW) != null)
      d.c(this.pIW).cen();
    AppMethodBeat.o(44404);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.recharge.ui.form.d.2
 * JD-Core Version:    0.6.2
 */