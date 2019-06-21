package com.tencent.mm.plugin.downloader_app.ui;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.downloader_app.b.d.b;
import com.tencent.mm.ui.base.h;

final class TaskListView$4
  implements d.b
{
  TaskListView$4(TaskListView paramTaskListView)
  {
  }

  public final void onClick()
  {
    AppMethodBeat.i(136294);
    TaskListView localTaskListView = this.kRj;
    h.d(localTaskListView.getContext(), localTaskListView.getContext().getString(2131298870), "", localTaskListView.getContext().getString(2131304027), localTaskListView.getContext().getString(2131304026), new TaskListView.10(localTaskListView), new TaskListView.2(localTaskListView));
    AppMethodBeat.o(136294);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader_app.ui.TaskListView.4
 * JD-Core Version:    0.6.2
 */