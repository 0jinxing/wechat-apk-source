package com.tencent.mm.plugin.sns.ui.d;

import android.content.Context;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.g.a.dq;
import com.tencent.mm.g.a.dq.b;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.storage.o;
import com.tencent.mm.plugin.sns.ui.q;
import com.tencent.mm.protocal.protobuf.TimeLineObject;
import com.tencent.mm.protocal.protobuf.uf;

final class b$30 extends c
{
  b$30(b paramb)
  {
  }

  public final void a(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    AppMethodBeat.i(40287);
    paramContextMenuInfo = paramView.getTag();
    Object localObject;
    if ((paramContextMenuInfo instanceof q))
    {
      paramContextMenuInfo = (q)paramContextMenuInfo;
      localObject = paramContextMenuInfo.rin;
      if (d.afj("favorite"))
        switch (((TimeLineObject)localObject).xfI.wbJ)
        {
        default:
          paramContextMenu.add(0, 3, 0, paramView.getContext().getString(2131301955));
        case 4:
        case 9:
        case 14:
        case 3:
        case 15:
        case 26:
        case 1:
        }
    }
    while (true)
    {
      com.tencent.mm.plugin.sns.abtest.a.a(paramContextMenu, af.cnF().YT(paramContextMenuInfo.cwT));
      AppMethodBeat.o(40287);
      return;
      paramContextMenu.add(0, 4, 0, paramView.getContext().getString(2131301955));
      localObject = new dq();
      ((dq)localObject).cxc.cwT = paramContextMenuInfo.cwT;
      com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject);
      if (((dq)localObject).cxd.cwB)
      {
        paramContextMenu.add(0, 18, 0, paramView.getContext().getString(2131296995));
        continue;
        paramContextMenu.add(0, 5, 0, paramView.getContext().getString(2131301955));
        continue;
        paramContextMenu.add(0, 9, 0, paramView.getContext().getString(2131301955));
        continue;
        paramContextMenu.add(0, 3, 0, paramView.getContext().getString(2131301955));
        localObject = new dq();
        ((dq)localObject).cxc.cwT = paramContextMenuInfo.cwT;
        com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject);
        if (((dq)localObject).cxd.cwB)
        {
          paramContextMenu.add(0, 18, 0, paramView.getContext().getString(2131296995));
          continue;
          paramContextMenu.add(0, 10, 0, paramView.getContext().getString(2131301955));
          continue;
          paramContextMenu.add(0, 22, 0, paramView.getContext().getString(2131301955));
          continue;
          paramContextMenu.add(0, 2, 0, paramView.getContext().getString(2131301955));
        }
      }
    }
  }

  public final boolean dR(View paramView)
  {
    AppMethodBeat.i(40286);
    Object localObject = paramView.getTag();
    q localq;
    boolean bool;
    if ((localObject instanceof q))
    {
      localq = (q)localObject;
      localObject = localq.rin;
      if ((((TimeLineObject)localObject).xfI.wbJ == 10) || (((TimeLineObject)localObject).xfI.wbJ == 17) || (((TimeLineObject)localObject).xfI.wbJ == 22) || (((TimeLineObject)localObject).xfI.wbJ == 23))
      {
        AppMethodBeat.o(40286);
        bool = false;
      }
    }
    while (true)
    {
      return bool;
      this.rKt.rJH.a(paramView, localq.cwT, (TimeLineObject)localObject);
      bool = true;
      AppMethodBeat.o(40286);
      continue;
      AppMethodBeat.o(40286);
      bool = false;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.d.b.30
 * JD-Core Version:    0.6.2
 */