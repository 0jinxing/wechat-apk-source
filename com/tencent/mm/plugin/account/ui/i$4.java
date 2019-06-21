package com.tencent.mm.plugin.account.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.b.a.ba;
import com.tencent.mm.ui.base.m;
import com.tencent.mm.ui.widget.a.d;
import java.util.List;

final class i$4
  implements View.OnClickListener
{
  i$4(i parami, d paramd, List paramList, m paramm)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(125098);
    this.gDv.gDo.aqX();
    this.gCw.cpD();
    if (this.gCz.contains(this.gDw))
    {
      this.gDv.gBm.daR = 1L;
      this.gDv.gBm.cVS = 9L;
      this.gDv.gBm.ajK();
    }
    AppMethodBeat.o(125098);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.i.4
 * JD-Core Version:    0.6.2
 */