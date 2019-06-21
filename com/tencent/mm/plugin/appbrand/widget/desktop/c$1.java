package com.tencent.mm.plugin.appbrand.widget.desktop;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.f.a;
import android.support.v7.widget.RecyclerView.v;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.widget.recentview.ConversationAppBrandRecentView;
import com.tencent.mm.sdk.platformtools.ab;

final class c$1
  implements RecyclerView.f.a
{
  c$1(c paramc)
  {
  }

  public final void jT()
  {
    AppMethodBeat.i(133774);
    if (this.iWY.iWW != null)
    {
      ConversationAppBrandRecentView localConversationAppBrandRecentView = this.iWY.iWW;
      this.iWY.iWW.getCurrentPage();
      Object localObject = (LinearLayoutManager)localConversationAppBrandRecentView.getLayoutManager();
      int i = ((LinearLayoutManager)localObject).iQ();
      int j = ((LinearLayoutManager)localObject).iS();
      ab.i("MicroMsg.AppBrandDesktopRecyclerItemAnimator", "alvinluo checkAlphaChange firstPos: %d, lastPos: %d", new Object[] { Integer.valueOf(i), Integer.valueOf(j) });
      if (i <= j)
      {
        localObject = localConversationAppBrandRecentView.cf(i);
        if ((localObject != null) && (((RecyclerView.v)localObject).apJ != null))
        {
          ((RecyclerView.v)localObject).apJ.setScaleX(1.0F);
          ((RecyclerView.v)localObject).apJ.setScaleY(1.0F);
          if (i != j)
            break label139;
          ((RecyclerView.v)localObject).apJ.setAlpha(0.3F);
        }
        while (true)
        {
          i++;
          break;
          label139: ((RecyclerView.v)localObject).apJ.setAlpha(1.0F);
        }
      }
    }
    AppMethodBeat.o(133774);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.desktop.c.1
 * JD-Core Version:    0.6.2
 */