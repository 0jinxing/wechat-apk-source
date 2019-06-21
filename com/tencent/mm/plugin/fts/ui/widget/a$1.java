package com.tencent.mm.plugin.fts.ui.widget;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class a$1
  implements View.OnClickListener
{
  a$1(a parama)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(62157);
    if (a.a(this.mMs) != null)
      a.a(this.mMs).onClickBackBtn(paramView);
    AppMethodBeat.o(62157);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.ui.widget.a.1
 * JD-Core Version:    0.6.2
 */