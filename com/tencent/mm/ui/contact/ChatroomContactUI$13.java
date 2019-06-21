package com.tencent.mm.ui.contact;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ChatroomContactUI$13
  implements View.OnTouchListener
{
  ChatroomContactUI$13(ChatroomContactUI paramChatroomContactUI)
  {
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(33585);
    switch (paramMotionEvent.getAction())
    {
    default:
    case 0:
    }
    while (true)
    {
      if (ChatroomContactUI.f(this.zls) != null)
      {
        paramView = ChatroomContactUI.f(this.zls);
        if (paramView.gvm != null)
          paramView.gvm.onTouchEvent(paramMotionEvent);
      }
      if (ChatroomContactUI.d(this.zls) != null)
      {
        paramView = ChatroomContactUI.d(this.zls);
        if (paramView.gvm != null)
          paramView.gvm.onTouchEvent(paramMotionEvent);
      }
      AppMethodBeat.o(33585);
      return false;
      this.zls.aqX();
      ChatroomContactUI.a(this.zls, (int)paramMotionEvent.getRawX());
      ChatroomContactUI.b(this.zls, (int)paramMotionEvent.getRawY());
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.ChatroomContactUI.13
 * JD-Core Version:    0.6.2
 */