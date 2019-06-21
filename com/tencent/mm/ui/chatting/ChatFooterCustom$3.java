package com.tencent.mm.ui.chatting;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ChatFooterCustom$3
  implements View.OnClickListener
{
  ChatFooterCustom$3(ChatFooterCustom paramChatFooterCustom)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(30465);
    ChatFooterCustom.d(this.yHI).dBX();
    paramView = (ImageView)paramView;
    int i;
    int j;
    if (paramView.getTag() == null)
    {
      paramView.setTag(new Object());
      paramView.setImageResource(2130839572);
      i = 0;
      if (i < ChatFooterCustom.e(this.yHI))
      {
        paramView = ChatFooterCustom.f(this.yHI).getChildAt(i);
        if (i >= 3);
        for (j = 0; ; j = 8)
        {
          paramView.setVisibility(j);
          i++;
          break;
        }
      }
      AppMethodBeat.o(30465);
    }
    while (true)
    {
      return;
      paramView.setTag(null);
      paramView.setImageResource(2130839571);
      i = 0;
      if (i < ChatFooterCustom.e(this.yHI))
      {
        paramView = ChatFooterCustom.f(this.yHI).getChildAt(i);
        if (i < 3);
        for (j = 0; ; j = 8)
        {
          paramView.setVisibility(j);
          i++;
          break;
        }
      }
      AppMethodBeat.o(30465);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.ChatFooterCustom.3
 * JD-Core Version:    0.6.2
 */