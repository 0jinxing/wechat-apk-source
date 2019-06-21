package com.tencent.mm.ui.conversation;

import android.content.Intent;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.Window;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.g.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.OnLayoutChangedLinearLayout;
import com.tencent.mm.ui.chatting.ChattingUIFragment;
import com.tencent.mm.ui.tools.TestTimeForChatting;
import com.tencent.mm.ui.widget.h;

final class BaseConversationUI$8
  implements Runnable
{
  BaseConversationUI$8(BaseConversationUI paramBaseConversationUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(34058);
    if (!this.zqF.mChattingClosed)
    {
      ab.e("MicroMsg.BaseConversationUI", "start chatting but last chatting does't be close!");
      this.zqF.closeChatting(false);
    }
    if ((this.zqF.isFinishing()) || (this.zqF.isPaused()) || (!this.zqF.mChattingClosed))
    {
      ab.w("MicroMsg.BaseConversationUI", "[startChattingRunnable] pass! isPause:%s mChattingClosed:%s", new Object[] { Boolean.valueOf(this.zqF.isPaused()), Boolean.valueOf(this.zqF.mChattingClosed) });
      AppMethodBeat.o(34058);
      return;
    }
    this.zqF.mChattingClosed = false;
    boolean bool;
    if (BaseConversationUI.access$200(this.zqF) == null)
    {
      bool = false;
      label123: ab.i("MicroMsg.BaseConversationUI", "ashutest::startChatting, ishow:%b", new Object[] { Boolean.valueOf(bool) });
      Intent localIntent = new Intent().putExtra("Chat_User", this.zqF.pendingUser);
      if (this.zqF.pendingBundle != null)
        localIntent.putExtras(this.zqF.pendingBundle);
      localIntent.putExtra("img_gallery_enter_from_chatting_ui", true);
      BaseConversationUI.access$300(this.zqF, localIntent, false);
      BaseConversationUI.access$1200(this.zqF).setOnChattingLayoutChangedListener(BaseConversationUI.access$1400(this.zqF));
      if (this.zqF.getWindow().getDecorView().getWidth() != 0)
        break label346;
    }
    label346: for (float f = this.zqF.getResources().getDisplayMetrics().widthPixels; ; f = this.zqF.getWindow().getDecorView().getWidth())
    {
      BaseConversationUI.access$200(this.zqF).setTranslationX(f - 0.1F);
      BaseConversationUI.access$200(this.zqF).setVisibility(0);
      this.zqF.pauseMainFragment();
      if (BaseConversationUI.access$100(this.zqF).isSupportNavigationSwipeBack())
        h.a(this.zqF);
      d.post(new BaseConversationUI.8.1(this), "directReport_startChattingRunnable");
      BaseConversationUI.access$402(this.zqF, bo.anT());
      AppMethodBeat.o(34058);
      break;
      bool = BaseConversationUI.access$200(this.zqF).isShown();
      break label123;
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(34059);
    String str = super.toString() + "|startChattingRunnable";
    AppMethodBeat.o(34059);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.BaseConversationUI.8
 * JD-Core Version:    0.6.2
 */