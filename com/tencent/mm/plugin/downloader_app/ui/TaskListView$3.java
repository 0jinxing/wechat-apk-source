package com.tencent.mm.plugin.downloader_app.ui;

import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.b;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.downloader_app.b.d;
import com.tencent.mm.plugin.downloader_app.b.d.a;
import com.tencent.mm.plugin.downloader_app.b.h;
import com.tencent.mm.plugin.downloader_app.b.i;
import java.util.Iterator;

final class TaskListView$3
  implements d.a
{
  TaskListView$3(TaskListView paramTaskListView)
  {
  }

  public final void gg(boolean paramBoolean)
  {
    AppMethodBeat.i(136293);
    TaskListView localTaskListView = this.kRj;
    Iterator localIterator = localTaskListView.kQZ.kQR.iterator();
    while (localIterator.hasNext())
    {
      i locali = (i)localIterator.next();
      if (locali.biN())
        locali.gBF = paramBoolean;
    }
    localTaskListView.kQZ.aop.notifyChanged();
    d.gf(paramBoolean);
    AppMethodBeat.o(136293);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader_app.ui.TaskListView.3
 * JD-Core Version:    0.6.2
 */