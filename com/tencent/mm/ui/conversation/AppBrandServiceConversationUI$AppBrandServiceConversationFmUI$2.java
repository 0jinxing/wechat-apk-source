package com.tencent.mm.ui.conversation;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.MMSlideDelView.f;

final class AppBrandServiceConversationUI$AppBrandServiceConversationFmUI$2
  implements MMSlideDelView.f
{
  AppBrandServiceConversationUI$AppBrandServiceConversationFmUI$2(AppBrandServiceConversationUI.AppBrandServiceConversationFmUI paramAppBrandServiceConversationFmUI)
  {
  }

  public final void bN(Object paramObject)
  {
    AppMethodBeat.i(33986);
    if (paramObject == null)
    {
      ab.e("MicroMsg.AppBrandServiceConversationFmUI", "onItemDel object null");
      AppMethodBeat.o(33986);
    }
    while (true)
    {
      return;
      paramObject = paramObject.toString();
      AppBrandServiceConversationUI.AppBrandServiceConversationFmUI.access$800(this.zqn, paramObject);
      AppMethodBeat.o(33986);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.AppBrandServiceConversationUI.AppBrandServiceConversationFmUI.2
 * JD-Core Version:    0.6.2
 */