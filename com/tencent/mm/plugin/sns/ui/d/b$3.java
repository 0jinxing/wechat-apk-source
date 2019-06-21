package com.tencent.mm.plugin.sns.ui.d;

import android.app.Activity;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.model.ap;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.plugin.sns.storage.o;
import com.tencent.mm.plugin.sns.ui.ar;
import com.tencent.mm.protocal.protobuf.TimeLineObject;

final class b$3 extends c
{
  b$3(b paramb)
  {
  }

  public final void a(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    AppMethodBeat.i(40243);
    paramView = (ar)paramView.getTag();
    n localn = af.cnF().YS(paramView.cFc);
    if (localn == null)
    {
      AppMethodBeat.o(40243);
      return;
    }
    paramContextMenu.add(0, 0, 0, this.rKt.activity.getString(2131296875));
    if (d.afj("favorite"))
      paramContextMenu.add(0, 1, 0, this.rKt.activity.getString(2131301955));
    paramContextMenuInfo = localn.cqu();
    if ((paramView.rvm) || ((paramContextMenuInfo != null) && (paramContextMenuInfo.xfK != 1) && (!paramView.rvn)))
    {
      if (paramView.ctI())
        break label146;
      ap.a(paramContextMenu, true);
    }
    while (true)
    {
      com.tencent.mm.plugin.sns.abtest.a.a(paramContextMenu, localn);
      AppMethodBeat.o(40243);
      break;
      label146: ap.b(paramContextMenu, true);
    }
  }

  public final boolean dR(View paramView)
  {
    AppMethodBeat.i(40244);
    Object localObject;
    n localn;
    boolean bool;
    if ((paramView.getTag() instanceof ar))
    {
      localObject = (ar)paramView.getTag();
      localn = af.cnF().YS(((ar)localObject).cFc);
      if (localn == null)
      {
        AppMethodBeat.o(40244);
        bool = false;
      }
    }
    while (true)
    {
      return bool;
      localObject = localn.cqU();
      this.rKt.rJH.a(paramView, (String)localObject, localn.cqu());
      bool = true;
      AppMethodBeat.o(40244);
      continue;
      AppMethodBeat.o(40244);
      bool = false;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.d.b.3
 * JD-Core Version:    0.6.2
 */