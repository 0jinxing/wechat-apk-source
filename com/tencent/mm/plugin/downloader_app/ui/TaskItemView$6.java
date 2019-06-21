package com.tencent.mm.plugin.downloader_app.ui;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class TaskItemView$6
  implements View.OnClickListener
{
  TaskItemView$6(TaskItemView paramTaskItemView)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(136267);
    TaskItemView.a(this.kQO, false);
    TaskItemView.g(this.kQO).setMaxLines(2);
    TaskItemView.e(this.kQO).setVisibility(8);
    TaskItemView.d(this.kQO).setVisibility(0);
    AppMethodBeat.o(136267);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader_app.ui.TaskItemView.6
 * JD-Core Version:    0.6.2
 */