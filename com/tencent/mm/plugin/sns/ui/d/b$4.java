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
import com.tencent.mm.plugin.sns.storage.h;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.plugin.sns.storage.o;
import com.tencent.mm.plugin.sns.ui.aj;
import com.tencent.mm.plugin.sns.ui.ao;
import com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder;

final class b$4 extends c
{
  b$4(b paramb)
  {
  }

  public final void a(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    AppMethodBeat.i(40246);
    paramContextMenuInfo = paramView.getTag();
    if (((paramContextMenuInfo instanceof BaseTimeLineItem.BaseViewHolder)) || ((paramContextMenuInfo instanceof n)) || ((paramContextMenuInfo instanceof aj)) || ((paramContextMenuInfo instanceof ao)) || ((paramContextMenuInfo instanceof com.tencent.mm.plugin.sns.ui.c.a.a)))
      if ((paramContextMenuInfo instanceof BaseTimeLineItem.BaseViewHolder))
        paramContextMenuInfo = h.YS(((BaseTimeLineItem.BaseViewHolder)paramContextMenuInfo).cFc);
    while (true)
    {
      if (!paramContextMenuInfo.DI(32))
        AppMethodBeat.o(40246);
      while (true)
      {
        return;
        if ((paramContextMenuInfo instanceof n))
        {
          paramContextMenuInfo = (n)paramContextMenuInfo;
          break;
        }
        if ((paramContextMenuInfo instanceof aj))
        {
          paramContextMenuInfo = (aj)paramContextMenuInfo;
          paramContextMenuInfo = af.cnF().YT(paramContextMenuInfo.cwT);
          break;
        }
        if ((paramView.getTag() instanceof ao))
        {
          paramContextMenuInfo = ((ao)paramView.getTag()).czD;
          paramContextMenuInfo = af.cnF().YT(paramContextMenuInfo);
          break;
        }
        if (!(paramView.getTag() instanceof com.tencent.mm.plugin.sns.ui.c.a.a))
          break label338;
        paramContextMenuInfo = ((com.tencent.mm.plugin.sns.ui.c.a.a)paramView.getTag()).ros;
        break;
        if ((paramContextMenuInfo.cqo() == null) || (!paramContextMenuInfo.cqo().coP()))
        {
          AppMethodBeat.o(40246);
        }
        else if (b.a(this.rKt, paramContextMenuInfo).qTO != null)
        {
          AppMethodBeat.o(40246);
        }
        else
        {
          if (d.afj("favorite"))
          {
            if (paramContextMenuInfo.cqo().coP())
              paramContextMenu.add(0, 20, 0, paramView.getContext().getString(2131301955));
            dq localdq = new dq();
            localdq.cxc.cwT = paramContextMenuInfo.cqU();
            com.tencent.mm.sdk.b.a.xxA.m(localdq);
            if (localdq.cxd.cwB)
              paramContextMenu.add(0, 18, 0, paramView.getContext().getString(2131296995));
          }
          if (paramContextMenuInfo != null)
            com.tencent.mm.plugin.sns.abtest.a.a(paramContextMenu, paramContextMenuInfo);
          AppMethodBeat.o(40246);
        }
      }
      label338: paramContextMenuInfo = null;
    }
  }

  public final boolean dR(View paramView)
  {
    AppMethodBeat.i(40245);
    Object localObject;
    if (((paramView.getTag() instanceof BaseTimeLineItem.BaseViewHolder)) || ((paramView.getTag() instanceof n)) || ((paramView.getTag() instanceof aj)) || ((paramView.getTag() instanceof ao)) || ((paramView.getTag() instanceof com.tencent.mm.plugin.sns.ui.c.a.a)))
    {
      localObject = paramView.getTag();
      if ((localObject instanceof BaseTimeLineItem.BaseViewHolder))
        localObject = h.YS(((BaseTimeLineItem.BaseViewHolder)paramView.getTag()).cFc);
    }
    while (true)
    {
      boolean bool;
      if (localObject != null)
        if (!((n)localObject).DI(32))
        {
          AppMethodBeat.o(40245);
          bool = false;
        }
      while (true)
      {
        return bool;
        if ((localObject instanceof n))
        {
          localObject = (n)localObject;
          break;
        }
        if ((localObject instanceof aj))
        {
          localObject = (aj)localObject;
          localObject = af.cnF().YT(((aj)localObject).cwT);
          break;
        }
        if ((paramView.getTag() instanceof ao))
        {
          localObject = ((ao)paramView.getTag()).czD;
          localObject = af.cnF().YT((String)localObject);
          break;
        }
        if (!(paramView.getTag() instanceof com.tencent.mm.plugin.sns.ui.c.a.a))
          break label266;
        localObject = ((com.tencent.mm.plugin.sns.ui.c.a.a)paramView.getTag()).ros;
        break;
        if ((((n)localObject).cqo() == null) || (!((n)localObject).cqo().coP()))
        {
          AppMethodBeat.o(40245);
          bool = false;
        }
        else
        {
          this.rKt.rJH.a(paramView, ((n)localObject).cqU(), ((n)localObject).cqu());
          bool = true;
          AppMethodBeat.o(40245);
          continue;
          AppMethodBeat.o(40245);
          bool = false;
        }
      }
      label266: localObject = null;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.d.b.4
 * JD-Core Version:    0.6.2
 */