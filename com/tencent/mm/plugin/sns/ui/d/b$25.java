package com.tencent.mm.plugin.sns.ui.d;

import android.app.Activity;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.g.a.dq;
import com.tencent.mm.g.a.dq.b;
import com.tencent.mm.m.g;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.model.an;
import com.tencent.mm.plugin.sns.model.aq;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.plugin.sns.storage.o;
import com.tencent.mm.plugin.sns.ui.aj;
import com.tencent.mm.protocal.protobuf.TimeLineObject;
import com.tencent.mm.protocal.protobuf.bau;
import com.tencent.mm.protocal.protobuf.uf;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.LinkedList;

final class b$25 extends c
{
  b$25(b paramb)
  {
  }

  public final void a(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    AppMethodBeat.i(40280);
    if ((paramView.getTag() instanceof aj))
    {
      paramView = (aj)paramView.getTag();
      if (!paramView.qFG)
        paramContextMenu.add(0, 19, 0, this.rKt.activity.getString(2131298159));
      if (bo.ank(g.Nu().getValue("SIGHTCannotTransmitForFav")) != 0)
        break label308;
      if (paramView.rnr.xfI.wbK.size() <= 0)
        break label301;
      paramContextMenuInfo = (bau)paramView.rnr.xfI.wbK.get(0);
      String str = paramContextMenuInfo.Id;
      str = an.fZ(af.getAccSnsPath(), str) + i.e(paramContextMenuInfo);
      paramContextMenuInfo = aq.a(paramView.cwT, paramContextMenuInfo);
      boolean bool1 = com.tencent.mm.vfs.e.ct(str);
      boolean bool2 = com.tencent.mm.vfs.e.ct(paramContextMenuInfo);
      ab.i("MicroMsg.TimelineOnCreateContextMenuListener", "config can forward sight, thumb existed %B, video existed %B", new Object[] { Boolean.valueOf(bool1), Boolean.valueOf(bool2) });
      if ((!bool1) || (!bool2))
        break label308;
    }
    label301: label308: for (int i = 1; ; i = 0)
    {
      if (d.afj("favorite"))
        paramContextMenu.add(0, 10, 0, this.rKt.activity.getString(2131301955));
      if (i != 0)
      {
        paramContextMenuInfo = new dq();
        paramContextMenuInfo.cxc.cwT = paramView.cwT;
        com.tencent.mm.sdk.b.a.xxA.m(paramContextMenuInfo);
        if (paramContextMenuInfo.cxd.cwB)
          paramContextMenu.add(0, 18, 0, this.rKt.activity.getString(2131296995));
      }
      AppMethodBeat.o(40280);
      return;
      ab.w("MicroMsg.TimelineOnCreateContextMenuListener", "sight item had not attch.");
    }
  }

  public final boolean dR(View paramView)
  {
    AppMethodBeat.i(40281);
    boolean bool;
    if ((paramView.getTag() instanceof aj))
    {
      String str = ((aj)paramView.getTag()).cwT;
      n localn = af.cnF().YT(str);
      this.rKt.rJH.a(paramView, str, localn.cqu());
      bool = true;
      AppMethodBeat.o(40281);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(40281);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.d.b.25
 * JD-Core Version:    0.6.2
 */