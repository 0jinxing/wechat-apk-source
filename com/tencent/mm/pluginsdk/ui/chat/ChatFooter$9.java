package com.tencent.mm.pluginsdk.ui.chat;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.Window;
import android.widget.Button;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;
import com.tencent.mm.sdk.platformtools.ab;

final class ChatFooter$9
  implements View.OnTouchListener
{
  ChatFooter$9(ChatFooter paramChatFooter)
  {
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(27793);
    if (paramView != ChatFooter.s(this.vnX))
    {
      AppMethodBeat.o(27793);
      return false;
    }
    ab.v("RcdBtnEvent", "event.getAction():" + paramMotionEvent.getAction());
    switch (paramMotionEvent.getAction())
    {
    default:
    case 0:
    case 2:
    case 1:
    case 3:
    }
    while (true)
    {
      AppMethodBeat.o(27793);
      break;
      ab.i("RcdBtnEvent", "on MotionEvent.ACTION_DOWN:[%d]", new Object[] { Integer.valueOf(ChatFooter.dkF()) });
      if ((ChatFooter.t(this.vnX) instanceof Activity))
        ((Activity)ChatFooter.t(this.vnX)).getWindow().addFlags(128);
      if ((!ChatFooter.u(this.vnX)) && (!ChatFooter.v(this.vnX)))
      {
        ChatFooter.c(this.vnX, true);
        ChatFooter.s(this.vnX).setBackgroundDrawable(a.g(this.vnX.getContext(), 2130840009));
        ChatFooter.s(this.vnX).setText(2131298058);
        if (ChatFooter.i(this.vnX) != null)
          ChatFooter.i(this.vnX).bNJ();
        ChatFooter.s(this.vnX).setContentDescription(this.vnX.getContext().getString(2131298033));
        continue;
        if ((ChatFooter.w(this.vnX) == null) || (ChatFooter.x(this.vnX) == null))
          ab.e("MicroMsg.ChatFooter", "[arthurdan.initRcdBtn] Notice!!! rcdAnimArea is %s, rcdCancelArea is %s", new Object[] { ChatFooter.w(this.vnX), ChatFooter.x(this.vnX) });
        if ((paramMotionEvent.getX() > 0.0F) && (paramMotionEvent.getY() > -ChatFooter.y(this.vnX) / 2) && (paramMotionEvent.getX() < ChatFooter.s(this.vnX).getWidth()))
        {
          if (ChatFooter.w(this.vnX) != null)
            ChatFooter.w(this.vnX).setVisibility(0);
          if (ChatFooter.x(this.vnX) != null)
          {
            ChatFooter.s(this.vnX).setText(2131298058);
            ChatFooter.x(this.vnX).setVisibility(8);
          }
        }
        else
        {
          ab.i("MicroMsg.ChatFooter", "show cancel Tips, ACTION_MOVE (x:%f y:%f) rcdHintPopUpMarginTop:%d voiceRcdBtn.getWidth():%d voiceRcdBtn.getHeight():%d", new Object[] { Float.valueOf(paramMotionEvent.getX()), Float.valueOf(paramMotionEvent.getY()), Integer.valueOf(ChatFooter.y(this.vnX)), Integer.valueOf(ChatFooter.s(this.vnX).getWidth()), Integer.valueOf(ChatFooter.s(this.vnX).getHeight()) });
          if (ChatFooter.w(this.vnX) != null)
            ChatFooter.w(this.vnX).setVisibility(8);
          if (ChatFooter.x(this.vnX) != null)
          {
            ChatFooter.s(this.vnX).setText(2131298042);
            ChatFooter.x(this.vnX).setVisibility(0);
            continue;
            if ((ChatFooter.t(this.vnX) instanceof Activity))
              ((Activity)ChatFooter.t(this.vnX)).getWindow().clearFlags(128);
            ab.i("RcdBtnEvent", "enter on MotionEvent.ACTION_UP/ACTION_CANCEL:[%d]", new Object[] { Integer.valueOf(ChatFooter.dkF()) });
            ChatFooter.z(this.vnX);
            ab.i("RcdBtnEvent", "outer on MotionEvent.ACTION_UP/ACTION_CANCEL:[%d]", new Object[] { Integer.valueOf(ChatFooter.dkG()) });
          }
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.chat.ChatFooter.9
 * JD-Core Version:    0.6.2
 */