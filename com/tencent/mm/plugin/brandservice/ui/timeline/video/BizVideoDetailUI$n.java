package com.tencent.mm.plugin.brandservice.ui.timeline.video;

import a.l;
import android.content.Context;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.brandservice.ui.timeline.video.a.g;
import com.tencent.mm.plugin.brandservice.ui.timeline.video.a.g.a;
import com.tencent.mm.plugin.brandservice.ui.timeline.video.a.g.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.n.c;
import com.tencent.mm.ui.base.n.d;
import com.tencent.mm.ui.widget.a.d;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "it", "Landroid/view/MenuItem;", "kotlin.jvm.PlatformType", "onMenuItemClick"})
final class BizVideoDetailUI$n
  implements MenuItem.OnMenuItemClickListener
{
  BizVideoDetailUI$n(BizVideoDetailUI paramBizVideoDetailUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(15156);
    paramMenuItem = BizVideoDetailUI.a(this.jWD);
    Object localObject;
    boolean bool2;
    if ((paramMenuItem.isFinished()) || (paramMenuItem.jXv == null))
    {
      localObject = paramMenuItem.TAG;
      boolean bool1 = paramMenuItem.isFinished();
      if (paramMenuItem.jXv == null)
      {
        bool2 = true;
        ab.i((String)localObject, "showMenu return:isFinished=%b,appMsgStat null=%b", new Object[] { Boolean.valueOf(bool1), Boolean.valueOf(bool2) });
      }
    }
    while (true)
    {
      AppMethodBeat.o(15156);
      return true;
      bool2 = false;
      break;
      paramMenuItem.iHZ = new d((Context)paramMenuItem.aYo(), 0, true);
      localObject = paramMenuItem.iHZ;
      if (localObject != null)
        ((d)localObject).a((n.c)new g.a(paramMenuItem));
      localObject = paramMenuItem.iHZ;
      if (localObject != null)
        ((d)localObject).a((n.d)new g.b(paramMenuItem));
      localObject = paramMenuItem.iHZ;
      if (localObject != null)
        ((d)localObject).q((CharSequence)" ", 1);
      paramMenuItem = paramMenuItem.iHZ;
      if (paramMenuItem != null)
        paramMenuItem.cpD();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.video.BizVideoDetailUI.n
 * JD-Core Version:    0.6.2
 */