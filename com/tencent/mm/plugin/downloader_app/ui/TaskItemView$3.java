package com.tencent.mm.plugin.downloader_app.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.downloader.f.a;
import com.tencent.mm.plugin.downloader_app.a.a.a;
import com.tencent.mm.plugin.downloader_app.a.a.b;
import com.tencent.mm.plugin.downloader_app.b.i;

final class TaskItemView$3
  implements View.OnClickListener
{
  TaskItemView$3(TaskItemView paramTaskItemView)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(136263);
    if (com.tencent.mm.plugin.downloader.model.c.In(TaskItemView.a(this.kQO).appId).field_status == 1)
    {
      com.tencent.mm.plugin.downloader_app.b.c.a(TaskItemView.a(this.kQO));
      AppMethodBeat.o(136263);
    }
    while (true)
    {
      return;
      com.tencent.mm.plugin.downloader_app.b.c.a(this.kQO.getContext(), TaskItemView.a(this.kQO), new a.b()
      {
        public final void a(a.a paramAnonymousa, long paramAnonymousLong)
        {
          AppMethodBeat.i(136262);
          if (paramAnonymousa == a.a.kOb)
            TaskItemView.b(TaskItemView.3.this.kQO);
          AppMethodBeat.o(136262);
        }
      });
      AppMethodBeat.o(136263);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader_app.ui.TaskItemView.3
 * JD-Core Version:    0.6.2
 */