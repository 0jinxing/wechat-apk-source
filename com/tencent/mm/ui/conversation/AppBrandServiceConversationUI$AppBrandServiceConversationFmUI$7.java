package com.tencent.mm.ui.conversation;

import android.view.View;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.MMSlideDelView.c;

final class AppBrandServiceConversationUI$AppBrandServiceConversationFmUI$7
  implements MMSlideDelView.c
{
  AppBrandServiceConversationUI$AppBrandServiceConversationFmUI$7(AppBrandServiceConversationUI.AppBrandServiceConversationFmUI paramAppBrandServiceConversationFmUI)
  {
  }

  public final int cZ(View paramView)
  {
    AppMethodBeat.i(33992);
    int i = AppBrandServiceConversationUI.AppBrandServiceConversationFmUI.access$300(this.zqn).getPositionForView(paramView);
    AppMethodBeat.o(33992);
    return i;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.AppBrandServiceConversationUI.AppBrandServiceConversationFmUI.7
 * JD-Core Version:    0.6.2
 */