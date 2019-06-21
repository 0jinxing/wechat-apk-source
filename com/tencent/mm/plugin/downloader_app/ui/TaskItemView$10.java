package com.tencent.mm.plugin.downloader_app.ui;

import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class TaskItemView$10
  implements Runnable
{
  TaskItemView$10(TaskItemView paramTaskItemView)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(136271);
    TaskItemView.i(this.kQO).setVisibility(0);
    TaskItemView.h(this.kQO).setIndeterminate(true);
    TaskItemView.j(this.kQO).setVisibility(8);
    TaskItemView.c(this.kQO).setVisibility(8);
    AppMethodBeat.o(136271);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader_app.ui.TaskItemView.10
 * JD-Core Version:    0.6.2
 */