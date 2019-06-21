package com.tencent.mm.ui.conversation;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.widget.header.HeaderContainer;
import com.tencent.mm.plugin.appbrand.widget.header.a.a.a;
import com.tencent.mm.sdk.platformtools.ab;

final class ConversationWithAppBrandListView$7
  implements a.a
{
  ConversationWithAppBrandListView$7(ConversationWithAppBrandListView paramConversationWithAppBrandListView)
  {
  }

  public final void fa(boolean paramBoolean)
  {
    AppMethodBeat.i(34273);
    ab.v("MicroMsg.ConversationWithAppBrandListView", "alvinluo onShowEmptyView show: %b, isOpenAppBrandRecentView: %b", new Object[] { Boolean.valueOf(paramBoolean), Boolean.valueOf(ConversationWithAppBrandListView.g(this.ztq)) });
    ConversationWithAppBrandListView.d(this.ztq, paramBoolean);
    if (ConversationWithAppBrandListView.h(this.ztq))
    {
      ConversationWithAppBrandListView.c(this.ztq, true);
      ConversationWithAppBrandListView.b(this.ztq, true);
    }
    if (!ConversationWithAppBrandListView.g(this.ztq))
      AppMethodBeat.o(34273);
    while (true)
    {
      return;
      if ((ConversationWithAppBrandListView.i(this.ztq) != null) && (paramBoolean))
        ConversationWithAppBrandListView.i(this.ztq).setTranslationY(0.0F);
      if ((ConversationWithAppBrandListView.j(this.ztq) != null) && (paramBoolean))
        ConversationWithAppBrandListView.j(this.ztq).setTranslationY(0.0F);
      AppMethodBeat.o(34273);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.ConversationWithAppBrandListView.7
 * JD-Core Version:    0.6.2
 */