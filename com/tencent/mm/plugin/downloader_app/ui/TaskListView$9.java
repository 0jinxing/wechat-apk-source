package com.tencent.mm.plugin.downloader_app.ui;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.b;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.appbrand.widget.recyclerview.MRecyclerView.a;
import com.tencent.mm.plugin.downloader_app.a.d;
import com.tencent.mm.plugin.downloader_app.b.h;
import com.tencent.mm.plugin.downloader_app.b.i;
import com.tencent.mm.plugin.downloader_app.c.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class TaskListView$9
  implements MRecyclerView.a
{
  TaskListView$9(TaskListView paramTaskListView)
  {
  }

  public final void I(View paramView, int paramInt)
  {
    AppMethodBeat.i(136299);
    ab.d("MicroMsg.TaskListView", "onItemClick");
    paramView = ((ViewGroup)paramView).getChildAt(0);
    Object localObject = TaskListView.b(this.kRj).kQR;
    if ((paramInt < 0) || (paramInt >= ((h)localObject).size()))
      AppMethodBeat.o(136299);
    while (true)
    {
      return;
      localObject = (i)((h)localObject).get(paramInt);
      if (((i)localObject).type == 7)
      {
        paramView = TaskListView.b(this.kRj);
        if (paramView.kQW != true)
        {
          paramView.kQW = true;
          paramView.aop.notifyChanged();
        }
        a.a(10, 1004, 101, 2, "", "", "");
        AppMethodBeat.o(136299);
      }
      else
      {
        if (!TaskListView.a(this.kRj))
        {
          if (!((i)localObject).gBF);
          for (boolean bool = true; ; bool = false)
          {
            paramView.setSelected(bool);
            AppMethodBeat.o(136299);
            break;
          }
        }
        if (bo.isNullOrNil(((i)localObject).jumpUrl))
        {
          AppMethodBeat.o(136299);
        }
        else
        {
          paramView = new Bundle();
          paramView.putString("rawUrl", ((i)localObject).jumpUrl);
          ((d)g.K(d.class)).f(this.kRj.getContext(), paramView);
          a.a(10, a.tQ(((i)localObject).type), ((i)localObject).position, 40, ((i)localObject).appId, "", "");
          AppMethodBeat.o(136299);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader_app.ui.TaskListView.9
 * JD-Core Version:    0.6.2
 */