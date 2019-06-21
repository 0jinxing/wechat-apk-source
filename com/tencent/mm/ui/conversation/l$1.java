package com.tencent.mm.ui.conversation;

import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cf.d;

final class l$1
  implements AbsListView.OnScrollListener
{
  l$1(l paraml)
  {
  }

  public final void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public final void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
  {
    AppMethodBeat.i(34573);
    if (paramInt == 2)
      d.dvV().ev(MainUI.class.getName() + ".Listview", 4);
    if (paramInt == 0)
      if (this.zvt.zqz == null)
        AppMethodBeat.o(34573);
    while (true)
    {
      return;
      l.a(this.zvt, -1);
      AppMethodBeat.o(34573);
      continue;
      this.zvt.dIV();
      AppMethodBeat.o(34573);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.l.1
 * JD-Core Version:    0.6.2
 */