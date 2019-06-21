package com.tencent.mm.ui.conversation;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class NewBizConversationUI$2
  implements View.OnTouchListener
{
  NewBizConversationUI$2(NewBizConversationUI paramNewBizConversationUI)
  {
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(34533);
    switch (paramMotionEvent.getAction())
    {
    default:
    case 0:
    }
    while (true)
    {
      AppMethodBeat.o(34533);
      return false;
      NewBizConversationUI.b(this.zvm, (int)paramMotionEvent.getRawX());
      NewBizConversationUI.c(this.zvm, (int)paramMotionEvent.getRawY());
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.NewBizConversationUI.2
 * JD-Core Version:    0.6.2
 */