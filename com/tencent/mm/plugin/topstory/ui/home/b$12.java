package com.tencent.mm.plugin.topstory.ui.home;

import android.content.res.Resources;
import android.support.design.widget.TabLayout.b;
import android.support.design.widget.TabLayout.e;
import android.view.View;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.topstory.ui.c.b;
import com.tencent.mm.plugin.topstory.ui.widget.TopStoryViewPager;
import com.tencent.mm.plugin.websearch.api.an;
import com.tencent.mm.protocal.protobuf.chn;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.MMActivity;
import java.util.Iterator;
import java.util.List;

final class b$12
  implements TabLayout.b
{
  b$12(b paramb)
  {
  }

  public final void f(TabLayout.e parame)
  {
    AppMethodBeat.i(1590);
    int i = 0;
    if (i < this.sCf.sBO.size())
    {
      c.b localb = (c.b)this.sCf.sBO.get(i);
      if (localb.sBy.equals(parame))
      {
        ab.i("MicroMsg.TopStory.TopStoryUIComponentImpl", "tab selected, " + localb.cEh);
        localb.gne.setTextColor(this.sCf.sBH.getResources().getColor(2131690590));
        localb.sBz.setBackgroundColor(this.sCf.sBH.getResources().getColor(2131689761));
        this.sCf.al(i, false);
        this.sCf.sBU.setCurrentItem(i);
        if ((localb.category == 100) && (localb.sBu > 0))
        {
          localb.bo(0, "");
          ((com.tencent.mm.plugin.topstory.a.b)g.M(com.tencent.mm.plugin.topstory.a.b.class)).getRedDotMgr().cFd();
        }
        i = localb.category;
        g.RP().Ry().set(ac.a.xVV, Integer.valueOf(i));
        this.sCf.sBQ = localb.category;
        AppMethodBeat.o(1590);
      }
    }
    while (true)
    {
      return;
      i++;
      break;
      AppMethodBeat.o(1590);
    }
  }

  public final void g(TabLayout.e parame)
  {
    AppMethodBeat.i(1591);
    Iterator localIterator = this.sCf.sBO.iterator();
    while (localIterator.hasNext())
    {
      c.b localb = (c.b)localIterator.next();
      if (localb.sBy.equals(parame))
      {
        this.sCf.sBX = localb.category;
        ab.i("MicroMsg.TopStory.TopStoryUIComponentImpl", "tab unselected, " + localb.cEh);
        localb.gne.setTextColor(this.sCf.sBH.getResources().getColor(2131690591));
        localb.sBz.setBackgroundColor(this.sCf.sBH.getResources().getColor(2131690597));
        AppMethodBeat.o(1591);
      }
    }
    while (true)
    {
      return;
      AppMethodBeat.o(1591);
    }
  }

  public final void h(TabLayout.e parame)
  {
    AppMethodBeat.i(1592);
    Iterator localIterator = this.sCf.sBO.iterator();
    c.b localb;
    while (true)
      if (localIterator.hasNext())
      {
        localb = (c.b)localIterator.next();
        if (localb.sBy.equals(parame))
        {
          ab.i("MicroMsg.TopStory.TopStoryUIComponentImpl", "tab reselected, " + localb.cEh);
          localb.gne.setTextColor(this.sCf.sBH.getResources().getColor(2131690590));
          localb.sBz.setBackgroundColor(this.sCf.sBH.getResources().getColor(2131689761));
          this.sCf.sBL.aj(localb.sBt, localb.sBu, localb.sBv);
          if ((localb.category == 100) && (localb.sBu > 0))
          {
            localb.bo(0, "");
            ((com.tencent.mm.plugin.topstory.a.b)g.M(com.tencent.mm.plugin.topstory.a.b.class)).getRedDotMgr().cFd();
          }
          if (bo.isNullOrNil(localb.sBx))
          {
            parame = localb.sBw;
            an.b(localb.category, this.sCf.sBQ, parame, this.sCf.cPu.hlm, false);
            this.sCf.sBQ = localb.category;
            AppMethodBeat.o(1592);
          }
        }
      }
    while (true)
    {
      return;
      parame = localb.sBx;
      break;
      AppMethodBeat.o(1592);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.ui.home.b.12
 * JD-Core Version:    0.6.2
 */