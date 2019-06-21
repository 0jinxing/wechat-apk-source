package com.tencent.mm.ui.chatting;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.chat.ChatFooter;
import com.tencent.mm.ui.chatting.c.b.o;
import com.tencent.mm.ui.chatting.d.a;

final class ChattingUIFragment$2
  implements View.OnTouchListener
{
  boolean jXS = false;

  ChattingUIFragment$2(ChattingUIFragment paramChattingUIFragment)
  {
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(30830);
    ChattingUIFragment.g(this.yLv);
    if (paramMotionEvent.getAction() == 0)
    {
      this.jXS = true;
      if ((this.jXS) && (this.yLv.yLp))
        break label67;
      AppMethodBeat.o(30830);
    }
    while (true)
    {
      return false;
      if (paramMotionEvent.getAction() != 1)
        break;
      this.jXS = false;
      break;
      label67: paramView = (o)this.yLv.cgL.aF(o.class);
      if ((paramView == null) || (paramView.dDX() == null))
      {
        AppMethodBeat.o(30830);
      }
      else
      {
        paramView.dDX().u(0, -1, false);
        AppMethodBeat.o(30830);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.ChattingUIFragment.2
 * JD-Core Version:    0.6.2
 */