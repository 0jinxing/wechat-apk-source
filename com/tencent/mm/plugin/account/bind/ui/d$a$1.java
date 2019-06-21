package com.tencent.mm.plugin.account.bind.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class d$a$1
  implements View.OnClickListener
{
  d$a$1(d.a parama, d paramd)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(13710);
    if (d.f(this.gtS.gtL) != null)
      d.f(this.gtS.gtL).c(this.gtS.gtF, this.gtS.account, this.gtS.status);
    AppMethodBeat.o(13710);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.bind.ui.d.a.1
 * JD-Core Version:    0.6.2
 */