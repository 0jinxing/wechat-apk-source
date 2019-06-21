package com.tencent.mm.plugin.downloader_app.ui;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.downloader_app.b.i;
import com.tencent.mm.plugin.downloader_app.c.a;

final class TaskItemView$7
  implements View.OnClickListener
{
  TaskItemView$7(TaskItemView paramTaskItemView)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(136268);
    TaskItemView.a(this.kQO, true);
    TaskItemView.g(this.kQO).setMaxLines(2147483647);
    TaskItemView.e(this.kQO).setVisibility(0);
    TaskItemView.d(this.kQO).setVisibility(8);
    a.a(10, 1003, 0, 2, TaskItemView.a(this.kQO).appId, "", "");
    AppMethodBeat.o(136268);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader_app.ui.TaskItemView.7
 * JD-Core Version:    0.6.2
 */