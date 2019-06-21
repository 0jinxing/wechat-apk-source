package com.tencent.mm.plugin.sns.ui;

import android.content.Context;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.View;
import android.view.View.OnCreateContextMenuListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.plugin.sns.storage.o;
import com.tencent.mm.protocal.protobuf.TimeLineObject;
import com.tencent.mm.protocal.protobuf.bau;
import com.tencent.mm.protocal.protobuf.uf;
import java.util.LinkedList;

final class au$c
  implements View.OnCreateContextMenuListener
{
  private String czD;
  private bau qJh;
  private TimeLineObject rin;
  private n ros;
  private View targetView;
  private String url;

  public final void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    AppMethodBeat.i(39415);
    paramContextMenuInfo = paramView.getTag();
    if ((paramContextMenuInfo instanceof q))
    {
      paramContextMenuInfo = (q)paramContextMenuInfo;
      TimeLineObject localTimeLineObject = paramContextMenuInfo.rin;
      paramView.getContext();
      String str = au.ZJ(localTimeLineObject.xfI.Url);
      if ((str == null) || (str.length() == 0))
      {
        AppMethodBeat.o(39415);
        return;
      }
      this.url = str;
      this.czD = paramContextMenuInfo.cwT;
      this.targetView = paramView;
      if (localTimeLineObject.xfI.wbK.size() > 0);
      for (paramContextMenuInfo = (bau)localTimeLineObject.xfI.wbK.get(0); ; paramContextMenuInfo = null)
      {
        this.qJh = paramContextMenuInfo;
        this.ros = af.cnF().YT(this.czD);
        this.rin = localTimeLineObject;
        if ((localTimeLineObject.xfI.wbJ != 10) && (localTimeLineObject.xfI.wbJ != 13))
          break label178;
        AppMethodBeat.o(39415);
        break;
      }
      label178: if (d.afj("favorite"))
        switch (localTimeLineObject.xfI.wbJ)
        {
        default:
          paramContextMenu.add(0, 3, 0, paramView.getContext().getString(2131301955));
        case 4:
        case 9:
        case 14:
        }
    }
    while (true)
    {
      if ((this.ros != null) && (!this.ros.field_userName.equals(af.cnk())))
        paramContextMenu.add(0, 8, 0, paramView.getContext().getString(2131298604));
      AppMethodBeat.o(39415);
      break;
      paramContextMenu.add(0, 4, 0, paramView.getContext().getString(2131301955));
      continue;
      paramContextMenu.add(0, 5, 0, paramView.getContext().getString(2131301955));
      continue;
      paramContextMenu.add(0, 9, 0, paramView.getContext().getString(2131301955));
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.au.c
 * JD-Core Version:    0.6.2
 */