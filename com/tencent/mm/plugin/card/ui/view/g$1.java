package com.tencent.mm.plugin.card.ui.view;

import android.view.View;
import android.view.View.OnLongClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.card.base.b;
import com.tencent.mm.plugin.card.d.p;
import com.tencent.mm.protocal.protobuf.no;
import com.tencent.mm.ui.base.h;

final class g$1
  implements View.OnLongClickListener
{
  g$1(g paramg)
  {
  }

  public final boolean onLongClick(View paramView)
  {
    AppMethodBeat.i(88744);
    if (paramView.getId() == 2131821958)
    {
      p.wG(this.kqG.kaS.aZW().code);
      h.bQ(this.kqG.jiE, this.kqG.getString(2131296876));
    }
    AppMethodBeat.o(88744);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.ui.view.g.1
 * JD-Core Version:    0.6.2
 */