package com.tencent.mm.plugin.downloader_app.ui;

import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class TaskItemView$5
  implements ViewTreeObserver.OnGlobalLayoutListener
{
  TaskItemView$5(TaskItemView paramTaskItemView)
  {
  }

  public final void onGlobalLayout()
  {
    AppMethodBeat.i(136266);
    if (TaskItemView.d(this.kQO).getLineCount() <= 2)
    {
      TaskItemView.e(this.kQO).setVisibility(8);
      TaskItemView.d(this.kQO).setVisibility(8);
      AppMethodBeat.o(136266);
    }
    while (true)
    {
      return;
      if (TaskItemView.f(this.kQO))
      {
        TaskItemView.e(this.kQO).setVisibility(8);
        TaskItemView.d(this.kQO).setVisibility(0);
        AppMethodBeat.o(136266);
      }
      else
      {
        TaskItemView.e(this.kQO).setVisibility(0);
        TaskItemView.d(this.kQO).setVisibility(8);
        AppMethodBeat.o(136266);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader_app.ui.TaskItemView.5
 * JD-Core Version:    0.6.2
 */