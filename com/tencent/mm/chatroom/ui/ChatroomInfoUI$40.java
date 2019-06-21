package com.tencent.mm.chatroom.ui;

import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.widget.LinearLayout;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.preference.MMPreference;

final class ChatroomInfoUI$40
  implements Animation.AnimationListener
{
  ChatroomInfoUI$40(ChatroomInfoUI paramChatroomInfoUI, LinearLayout paramLinearLayout)
  {
  }

  public final void onAnimationEnd(Animation paramAnimation)
  {
    boolean bool = true;
    AppMethodBeat.i(104009);
    paramAnimation = (ViewGroup)this.eiz.getWindow().findViewById(16908290);
    if (paramAnimation == null);
    while (true)
    {
      ab.i("MicroMsg.ChatroomInfoUI", "remove cover view now. contentView is null [%b]", new Object[] { Boolean.valueOf(bool) });
      if (paramAnimation != null)
        paramAnimation.removeView(this.eiU);
      this.eiz.nDp.setTranscriptMode(ChatroomInfoUI.C(this.eiz));
      AppMethodBeat.o(104009);
      return;
      bool = false;
    }
  }

  public final void onAnimationRepeat(Animation paramAnimation)
  {
  }

  public final void onAnimationStart(Animation paramAnimation)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.chatroom.ui.ChatroomInfoUI.40
 * JD-Core Version:    0.6.2
 */