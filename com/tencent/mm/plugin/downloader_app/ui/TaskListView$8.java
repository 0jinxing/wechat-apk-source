package com.tencent.mm.plugin.downloader_app.ui;

import android.view.View;
import android.view.ViewGroup;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.widget.recyclerview.MRecyclerView.b;
import com.tencent.mm.plugin.downloader_app.b.h;
import com.tencent.mm.plugin.downloader_app.b.i;
import java.util.Iterator;

final class TaskListView$8
  implements MRecyclerView.b
{
  TaskListView$8(TaskListView paramTaskListView)
  {
  }

  public final boolean L(View paramView, int paramInt)
  {
    AppMethodBeat.i(136298);
    if (!TaskListView.a(this.kRj))
      AppMethodBeat.o(136298);
    for (boolean bool = false; ; bool = true)
    {
      return bool;
      if ((((ViewGroup)paramView).getChildAt(0) instanceof TaskItemView))
      {
        Object localObject = TaskListView.b(this.kRj).kQR;
        if (localObject != null)
        {
          localObject = ((h)localObject).iterator();
          while (((Iterator)localObject).hasNext())
            ((i)((Iterator)localObject).next()).kci = true;
          ((TaskItemView)((ViewGroup)paramView).getChildAt(0)).setSelected(true);
          TaskListView.c(this.kRj);
        }
      }
      AppMethodBeat.o(136298);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader_app.ui.TaskListView.8
 * JD-Core Version:    0.6.2
 */