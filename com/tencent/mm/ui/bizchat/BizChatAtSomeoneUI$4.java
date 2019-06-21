package com.tencent.mm.ui.bizchat;

import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.at.a.a;
import com.tencent.mm.at.o;

final class BizChatAtSomeoneUI$4
  implements AbsListView.OnScrollListener
{
  BizChatAtSomeoneUI$4(BizChatAtSomeoneUI paramBizChatAtSomeoneUI)
  {
  }

  public final void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public final void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
  {
    AppMethodBeat.i(30030);
    o.ahp().cm(paramInt);
    AppMethodBeat.o(30030);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.bizchat.BizChatAtSomeoneUI.4
 * JD-Core Version:    0.6.2
 */