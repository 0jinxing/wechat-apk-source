package com.tencent.mm.ui.chatting;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.chatting.c.b.h;

final class o$2
  implements View.OnClickListener
{
  o$2(o paramo, h paramh)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(30621);
    this.yJc.nf(((Long)paramView.getTag()).longValue());
    AppMethodBeat.o(30621);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.o.2
 * JD-Core Version:    0.6.2
 */