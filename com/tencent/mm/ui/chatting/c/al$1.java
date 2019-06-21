package com.tencent.mm.ui.chatting.c;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.b.a.ar;
import com.tencent.mm.plugin.story.api.n;
import com.tencent.mm.plugin.story.g.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.chatting.BaseChattingUIFragment;
import com.tencent.mm.ui.chatting.d.a;
import java.util.List;

final class al$1
  implements MenuItem.OnMenuItemClickListener
{
  al$1(al paramal)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    long l = 1L;
    AppMethodBeat.i(31720);
    boolean bool;
    if (System.currentTimeMillis() - al.a(this.ySq) <= al.b(this.ySq))
    {
      ab.i("MicroMsg.StoryStateComponent", "onclick pass $clickTime now: %s", new Object[] { Long.valueOf(System.currentTimeMillis()) });
      AppMethodBeat.o(31720);
      bool = true;
    }
    while (true)
    {
      return bool;
      al.a(this.ySq, System.currentTimeMillis());
      ab.i("MicroMsg.StoryStateComponent", "menuItemClickListener clickTime %s storyUserList size %s", new Object[] { Long.valueOf(al.a(this.ySq)), Integer.valueOf(al.c(this.ySq).size()) });
      if (al.c(this.ySq).size() > 0)
      {
        paramMenuItem = (String)al.c(this.ySq).get(0);
        ab.i("MicroMsg.StoryStateComponent", "menuItemClickListener click go %s", new Object[] { paramMenuItem });
        n.bj(1, paramMenuItem);
        n.enterGallery(al.d(this.ySq));
        n.ZX(paramMenuItem);
        paramMenuItem = h.scu;
        h.cAs().fC(al.e(this.ySq));
        if (al.f(this.ySq))
        {
          paramMenuItem = h.scu;
          h.cAs().cYQ = 4L;
          n.a(this.ySq.cgL.yTx.getContext(), al.c(this.ySq), this.ySq.cgL.getTalkerUserName(), al.e(this.ySq));
          label262: paramMenuItem = h.scu;
          paramMenuItem = h.cAs();
          if (!al.g(this.ySq))
            break label347;
        }
        label347: for (l = 1L; ; l = 0L)
        {
          paramMenuItem.cYR = l;
          AppMethodBeat.o(31720);
          bool = true;
          break;
          paramMenuItem = h.scu;
          h.cAs().cYQ = 5L;
          n.aT(this.ySq.cgL.yTx.getContext(), (String)al.c(this.ySq).get(0));
          break label262;
        }
      }
      if ((al.h(this.ySq)) && (al.f(this.ySq)))
      {
        paramMenuItem = h.scu;
        paramMenuItem = h.cAs();
        if (al.g(this.ySq));
        while (true)
        {
          paramMenuItem.cYR = l;
          n.a(this.ySq.cgL.yTx.getContext(), al.c(this.ySq), this.ySq.cgL.getTalkerUserName(), al.e(this.ySq));
          paramMenuItem = h.scu;
          h.cAs().cYQ = 4L;
          AppMethodBeat.o(31720);
          bool = true;
          break;
          l = 0L;
        }
      }
      AppMethodBeat.o(31720);
      bool = false;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.c.al.1
 * JD-Core Version:    0.6.2
 */