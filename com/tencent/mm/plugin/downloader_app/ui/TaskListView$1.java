package com.tencent.mm.plugin.downloader_app.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.downloader.f.a;
import com.tencent.mm.plugin.downloader.model.c;
import com.tencent.mm.plugin.downloader_app.b.d.d;

final class TaskListView$1
  implements d.d
{
  TaskListView$1(TaskListView paramTaskListView)
  {
  }

  public final void E(int paramInt, long paramLong)
  {
    AppMethodBeat.i(136292);
    a locala = c.hv(paramLong);
    if (locala != null)
      TaskListView.a(this.kRj, paramInt, locala.field_appId);
    AppMethodBeat.o(136292);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader_app.ui.TaskListView.1
 * JD-Core Version:    0.6.2
 */