package com.tencent.mm.plugin.downloader_app.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class TaskManagerHeaderView$1
  implements View.OnClickListener
{
  TaskManagerHeaderView$1(TaskManagerHeaderView paramTaskManagerHeaderView)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(136314);
    if ((this.kRk.getContext() instanceof DownloadMainUI))
      ((DownloadMainUI)this.kRk.getContext()).kQc.biU();
    AppMethodBeat.o(136314);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader_app.ui.TaskManagerHeaderView.1
 * JD-Core Version:    0.6.2
 */