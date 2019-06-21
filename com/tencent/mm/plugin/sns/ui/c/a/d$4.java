package com.tencent.mm.plugin.sns.ui.c.a;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.a.b.g;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.plugin.sns.ui.d.b;

final class d$4
  implements View.OnClickListener
{
  d$4(d paramd, boolean paramBoolean)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(40106);
    if ((this.rHj.rqn != null) && (this.qEa))
      this.rHj.rqn.jQ(this.rHj.ros.field_snsId);
    this.rHj.rqo.rKn.onClick(paramView);
    AppMethodBeat.o(40106);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.c.a.d.4
 * JD-Core Version:    0.6.2
 */