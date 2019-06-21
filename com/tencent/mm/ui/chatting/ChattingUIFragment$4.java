package com.tencent.mm.ui.chatting;

import android.view.View;
import android.view.View.OnLayoutChangeListener;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.chatting.a.a;

final class ChattingUIFragment$4
  implements View.OnLayoutChangeListener
{
  ChattingUIFragment$4(ChattingUIFragment paramChattingUIFragment)
  {
  }

  public final void onLayoutChange(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8)
  {
    AppMethodBeat.i(30833);
    this.yLv.yLk.dD(ChattingUIFragment.a(this.yLv).getFirstVisiblePosition(), ChattingUIFragment.a(this.yLv).getLastVisiblePosition());
    ChattingUIFragment.a(this.yLv).removeOnLayoutChangeListener(this);
    AppMethodBeat.o(30833);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.ChattingUIFragment.4
 * JD-Core Version:    0.6.2
 */