package com.tencent.mm.plugin.sns.ui.d;

import android.content.Context;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.g.a.dq;
import com.tencent.mm.g.a.dq.b;
import com.tencent.mm.plugin.sns.storage.h;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder;

final class b$5 extends c
{
  b$5(b paramb)
  {
  }

  public final void a(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    AppMethodBeat.i(40248);
    paramContextMenuInfo = paramView.getTag();
    if (((paramContextMenuInfo instanceof BaseTimeLineItem.BaseViewHolder)) || ((paramContextMenuInfo instanceof n)))
    {
      if (!(paramContextMenuInfo instanceof BaseTimeLineItem.BaseViewHolder))
        break label177;
      paramContextMenuInfo = h.YS(((BaseTimeLineItem.BaseViewHolder)paramContextMenuInfo).cFc);
    }
    while (true)
    {
      Object localObject;
      com.tencent.mm.plugin.sns.storage.a locala;
      if (d.afj("favorite"))
      {
        localObject = paramContextMenuInfo.cqo();
        locala = b.a(this.rKt, paramContextMenuInfo);
        if (((com.tencent.mm.plugin.sns.storage.b)localObject).coO())
        {
          if (!((com.tencent.mm.plugin.sns.storage.b)localObject).coK())
            break label192;
          paramContextMenu.add(0, 2, 0, paramView.getContext().getString(2131301955));
        }
      }
      while (true)
      {
        localObject = new dq();
        ((dq)localObject).cxc.cwT = paramContextMenuInfo.cqU();
        com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject);
        if (((dq)localObject).cxd.cwB)
          paramContextMenu.add(0, 18, 0, paramView.getContext().getString(2131296995));
        if (paramContextMenuInfo != null)
          com.tencent.mm.plugin.sns.abtest.a.a(paramContextMenu, paramContextMenuInfo);
        AppMethodBeat.o(40248);
        return;
        label177: if (!(paramContextMenuInfo instanceof n))
          break label222;
        paramContextMenuInfo = (n)paramContextMenuInfo;
        break;
        label192: if (locala.qTw == 0)
          paramContextMenu.add(0, 3, 0, paramView.getContext().getString(2131301955));
      }
      label222: paramContextMenuInfo = null;
    }
  }

  public final boolean dR(View paramView)
  {
    AppMethodBeat.i(40247);
    Object localObject;
    if (((paramView.getTag() instanceof BaseTimeLineItem.BaseViewHolder)) || ((paramView.getTag() instanceof n)))
    {
      localObject = paramView.getTag();
      if ((localObject instanceof BaseTimeLineItem.BaseViewHolder))
        localObject = h.YS(((BaseTimeLineItem.BaseViewHolder)paramView.getTag()).cFc);
    }
    while (true)
    {
      if (localObject != null)
        this.rKt.rJH.a(paramView, ((n)localObject).cqU(), ((n)localObject).cqu());
      boolean bool = true;
      AppMethodBeat.o(40247);
      while (true)
      {
        return bool;
        if (!(localObject instanceof n))
          break label108;
        localObject = (n)localObject;
        break;
        bool = false;
        AppMethodBeat.o(40247);
      }
      label108: localObject = null;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.d.b.5
 * JD-Core Version:    0.6.2
 */