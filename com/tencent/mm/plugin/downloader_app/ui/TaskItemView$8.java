package com.tencent.mm.plugin.downloader_app.ui;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.downloader_app.a.d;
import com.tencent.mm.plugin.downloader_app.b.i;
import com.tencent.mm.sdk.platformtools.bo;

final class TaskItemView$8
  implements View.OnClickListener
{
  TaskItemView$8(TaskItemView paramTaskItemView)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(136269);
    if ((TaskItemView.a(this.kQO) != null) && (TaskItemView.a(this.kQO).kPe != null) && (!bo.isNullOrNil(TaskItemView.a(this.kQO).kPe.kKN)))
    {
      paramView = new Bundle();
      paramView.putString("rawUrl", TaskItemView.a(this.kQO).kPe.kKN);
      ((d)g.K(d.class)).f(this.kQO.getContext(), paramView);
      com.tencent.mm.plugin.downloader_app.c.a.a(10, 1006, TaskItemView.a(this.kQO).position, 40, TaskItemView.a(this.kQO).appId, "", "");
    }
    AppMethodBeat.o(136269);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader_app.ui.TaskItemView.8
 * JD-Core Version:    0.6.2
 */