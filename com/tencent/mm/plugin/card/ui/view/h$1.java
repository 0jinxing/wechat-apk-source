package com.tencent.mm.plugin.card.ui.view;

import android.view.View;
import android.view.View.OnLongClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.card.base.b;
import com.tencent.mm.protocal.protobuf.no;

final class h$1
  implements View.OnLongClickListener
{
  h$1(h paramh, b paramb)
  {
  }

  public final boolean onLongClick(View paramView)
  {
    AppMethodBeat.i(88745);
    if (paramView.getId() == 2131821958)
    {
      com.tencent.mm.plugin.card.d.p.wG(this.kqI.aZW().code);
      com.tencent.mm.ui.base.h.bQ(this.kqJ.jiE, com.tencent.mm.a.p.getString(2131296876));
    }
    AppMethodBeat.o(88745);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.ui.view.h.1
 * JD-Core Version:    0.6.2
 */