package com.tencent.mm.plugin.sns.ui.d;

import android.app.Activity;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.model.ap;
import com.tencent.mm.plugin.sns.model.ap.b;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.plugin.sns.storage.o;
import com.tencent.mm.plugin.sns.ui.l;
import com.tencent.mm.plugin.sns.ui.widget.d;
import com.tencent.mm.protocal.protobuf.cat;

final class b$19 extends c
{
  b$19(b paramb)
  {
  }

  public final void a(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    AppMethodBeat.i(40267);
    long l;
    int i;
    if ((paramView.getTag() instanceof l))
    {
      paramView = (l)paramView.getTag();
      if (!d.fF(paramView.qJj.wZL, 16))
        paramContextMenu.add(0, 11, 0, this.rKt.activity.getString(2131296875));
      if ((paramView.jBB != null) && (paramView.jBB.equals(r.Yz())))
        paramContextMenu.add(0, 7, 0, this.rKt.activity.getString(2131296881));
      if (!d.fF(paramView.qJj.wZL, 16))
      {
        String str = paramView.rib;
        paramContextMenuInfo = new StringBuilder();
        if (paramView.qJj.wZG != 0)
        {
          l = paramView.qJj.wZG;
          paramContextMenuInfo = ap.ga(str, l);
          if (paramView.scene != 1)
            break label243;
          i = 2;
        }
      }
    }
    while (true)
    {
      label179: paramView = ap.Ye(paramContextMenuInfo);
      if ((paramView != null) && (paramView.foa) && (!paramView.aAR) && ((i & paramView.dtW) != 0))
      {
        i = 1;
        label215: if (i != 0)
          break label263;
        ap.a(paramContextMenu, false);
        AppMethodBeat.o(40267);
      }
      while (true)
      {
        return;
        l = paramView.qJj.wZJ;
        break;
        label243: if (paramView.scene != 2)
          break label276;
        i = 4;
        break label179;
        i = 0;
        break label215;
        label263: ap.b(paramContextMenu, false);
        AppMethodBeat.o(40267);
      }
      label276: i = -1;
    }
  }

  public final boolean dR(View paramView)
  {
    AppMethodBeat.i(40268);
    boolean bool;
    if ((paramView.getTag() instanceof l))
    {
      Object localObject = (l)paramView.getTag();
      localObject = af.cnF().YS(((l)localObject).rib);
      this.rKt.rJH.a(paramView, ((n)localObject).cqU(), ((n)localObject).cqu());
      bool = true;
      AppMethodBeat.o(40268);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(40268);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.d.b.19
 * JD-Core Version:    0.6.2
 */