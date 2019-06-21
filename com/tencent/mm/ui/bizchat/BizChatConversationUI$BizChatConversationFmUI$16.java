package com.tencent.mm.ui.bizchat;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class BizChatConversationUI$BizChatConversationFmUI$16
  implements View.OnTouchListener
{
  BizChatConversationUI$BizChatConversationFmUI$16(BizChatConversationUI.BizChatConversationFmUI paramBizChatConversationFmUI)
  {
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(30073);
    if (paramMotionEvent.getAction() == 0)
    {
      BizChatConversationUI.BizChatConversationFmUI.a(this.yEp, (int)paramMotionEvent.getRawX());
      BizChatConversationUI.BizChatConversationFmUI.b(this.yEp, (int)paramMotionEvent.getRawY());
    }
    AppMethodBeat.o(30073);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.bizchat.BizChatConversationUI.BizChatConversationFmUI.16
 * JD-Core Version:    0.6.2
 */