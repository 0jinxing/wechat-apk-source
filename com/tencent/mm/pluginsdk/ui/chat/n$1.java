package com.tencent.mm.pluginsdk.ui.chat;

import android.view.View;
import android.view.View.OnLongClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class n$1
  implements View.OnLongClickListener
{
  n$1(n paramn)
  {
  }

  public final boolean onLongClick(View paramView)
  {
    AppMethodBeat.i(27965);
    if (n.a(this.vpC))
      n.b(this.vpC);
    AppMethodBeat.o(27965);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.chat.n.1
 * JD-Core Version:    0.6.2
 */