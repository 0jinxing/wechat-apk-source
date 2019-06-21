package com.tencent.mm.plugin.appbrand.widget.recentview;

import android.support.v7.widget.RecyclerView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class ConversationAppBrandRecentView$2
  implements e.a
{
  ConversationAppBrandRecentView$2(ConversationAppBrandRecentView paramConversationAppBrandRecentView)
  {
  }

  public final void L(int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(134361);
    if (ConversationAppBrandRecentView.f(this.joa) != null)
      ConversationAppBrandRecentView.f(this.joa).L(paramInt, paramBoolean);
    AppMethodBeat.o(134361);
  }

  public final void e(RecyclerView paramRecyclerView, int paramInt)
  {
    AppMethodBeat.i(134360);
    ab.i("MicroMsg.ConversationAppBrandRecentView", "alvinluo ScrollPageListener onScrolled offsetOfCurPage: %d, , currentPage: %d", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(this.joa.getCurrentPage()) });
    ConversationAppBrandRecentView.e(this.joa);
    if (ConversationAppBrandRecentView.f(this.joa) != null)
      ConversationAppBrandRecentView.f(this.joa).e(paramRecyclerView, paramInt);
    AppMethodBeat.o(134360);
  }

  public final void h(RecyclerView paramRecyclerView, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(134362);
    if (ConversationAppBrandRecentView.f(this.joa) != null)
      ConversationAppBrandRecentView.f(this.joa).h(paramRecyclerView, paramInt1, paramInt2);
    AppMethodBeat.o(134362);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.recentview.ConversationAppBrandRecentView.2
 * JD-Core Version:    0.6.2
 */