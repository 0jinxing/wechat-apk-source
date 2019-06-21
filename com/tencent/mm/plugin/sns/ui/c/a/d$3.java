package com.tencent.mm.plugin.sns.ui.c.a;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.a.b.g;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.plugin.sns.ui.d.b;

final class d$3
  implements View.OnClickListener
{
  d$3(d paramd, int paramInt)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(40105);
    if ((this.rHj.rqn != null) && (this.rHo > 0))
      this.rHj.rqn.jQ(this.rHj.ros.field_snsId);
    this.rHj.rqo.rKn.onClick(paramView);
    AppMethodBeat.o(40105);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.c.a.d.3
 * JD-Core Version:    0.6.2
 */