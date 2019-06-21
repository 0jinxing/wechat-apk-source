package com.tencent.mm.ui.conversation;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class BizConversationUI$BizConversationFmUI$2
  implements View.OnTouchListener
{
  BizConversationUI$BizConversationFmUI$2(BizConversationUI.BizConversationFmUI paramBizConversationFmUI)
  {
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(34117);
    switch (paramMotionEvent.getAction())
    {
    default:
    case 0:
    }
    while (true)
    {
      AppMethodBeat.o(34117);
      return false;
      BizConversationUI.BizConversationFmUI.b(this.zqR, (int)paramMotionEvent.getRawX());
      BizConversationUI.BizConversationFmUI.c(this.zqR, (int)paramMotionEvent.getRawY());
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.BizConversationUI.BizConversationFmUI.2
 * JD-Core Version:    0.6.2
 */