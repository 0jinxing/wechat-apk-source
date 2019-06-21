package com.tencent.mm.plugin.downloader_app.ui;

import android.content.res.Resources;
import android.widget.Button;
import android.widget.FrameLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class TaskItemView$2
  implements Runnable
{
  TaskItemView$2(TaskItemView paramTaskItemView)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(136261);
    TaskItemView.i(this.kQO).setVisibility(8);
    TaskItemView.c(this.kQO).setText(this.kQO.getResources().getString(2131304503));
    TaskItemView.c(this.kQO).setVisibility(0);
    AppMethodBeat.o(136261);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader_app.ui.TaskItemView.2
 * JD-Core Version:    0.6.2
 */