package com.tencent.mm.ui.chatting;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.mogic.a;
import com.tencent.mm.ui.widget.SwipeBackLayout;
import com.tencent.mm.ui.widget.SwipeBackLayout.a;
import com.tencent.mm.ui.widget.h;

final class ChattingUIFragment$12
  implements Runnable
{
  ChattingUIFragment$12(ChattingUIFragment paramChattingUIFragment)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(30842);
    this.yLv.onExitBegin();
    if ((this.yLv.isCurrentActivity) || (!this.yLv.isSupportNavigationSwipeBack()))
    {
      this.yLv.dCF();
      AppMethodBeat.o(30842);
    }
    while (true)
    {
      return;
      SwipeBackLayout localSwipeBackLayout = this.yLv.getSwipeBackLayout();
      ab.i("MicroMsg.SwipeBackLayout", "scrollToFinishActivity, Scrolling %B, hasTranslucent %B, hasCallPopOut %B", new Object[] { Boolean.valueOf(localSwipeBackLayout.zOp), Boolean.valueOf(localSwipeBackLayout.zOn), Boolean.valueOf(localSwipeBackLayout.zOo) });
      if (!localSwipeBackLayout.dKR())
      {
        h.bq(0.0F);
        localSwipeBackLayout.zOp = true;
        localSwipeBackLayout.zOo = false;
        int i = localSwipeBackLayout.WL.getWidth();
        int j = localSwipeBackLayout.zOk.getIntrinsicWidth();
        a locala = localSwipeBackLayout.zOi;
        locala.SU = localSwipeBackLayout.WL;
        locala.mActivePointerId = -1;
        locala.b(i + j + 10, 0, 0, 0, 320L);
        localSwipeBackLayout.invalidate();
        if (localSwipeBackLayout.zOv != null)
          localSwipeBackLayout.zOv.onDrag();
        h.J(true, 0);
      }
      AppMethodBeat.o(30842);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.ChattingUIFragment.12
 * JD-Core Version:    0.6.2
 */