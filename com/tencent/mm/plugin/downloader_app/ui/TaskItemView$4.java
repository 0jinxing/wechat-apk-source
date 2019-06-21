package com.tencent.mm.plugin.downloader_app.ui;

import android.content.res.Resources;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.downloader.f.a;
import com.tencent.mm.plugin.downloader_app.a.a.a;
import com.tencent.mm.plugin.downloader_app.a.a.b;
import com.tencent.mm.plugin.downloader_app.b.i;
import com.tencent.mm.vfs.e;

final class TaskItemView$4
  implements View.OnClickListener
{
  TaskItemView$4(TaskItemView paramTaskItemView)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(136265);
    if (TaskItemView.a(this.kQO).type == 6)
    {
      com.tencent.mm.plugin.downloader_app.b.c.c(this.kQO.getContext(), TaskItemView.a(this.kQO));
      AppMethodBeat.o(136265);
    }
    while (true)
    {
      return;
      paramView = com.tencent.mm.plugin.downloader.model.c.In(TaskItemView.a(this.kQO).appId);
      if (paramView != null)
      {
        if (TaskItemView.c(this.kQO).getText().equals(this.kQO.getResources().getString(2131304503)))
        {
          com.tencent.mm.plugin.downloader_app.b.c.a(this.kQO.getContext(), paramView.field_downloadId, new a.b()
          {
            public final void a(a.a paramAnonymousa, long paramAnonymousLong)
            {
              AppMethodBeat.i(136264);
              if (paramAnonymousa != a.a.kOb)
                TaskItemView.b(TaskItemView.4.this.kQO);
              AppMethodBeat.o(136264);
            }
          });
          AppMethodBeat.o(136265);
        }
        else if (TaskItemView.c(this.kQO).getText().equals(this.kQO.getResources().getString(2131300623)))
        {
          com.tencent.mm.plugin.downloader_app.b.c.b(this.kQO.getContext(), TaskItemView.a(this.kQO));
          AppMethodBeat.o(136265);
        }
        else if (TaskItemView.c(this.kQO).getText().equals(this.kQO.getResources().getString(2131301418)))
        {
          if (!e.ct(paramView.field_filePath))
          {
            com.tencent.mm.plugin.downloader_app.b.c.a(this.kQO.getContext(), TaskItemView.a(this.kQO));
            AppMethodBeat.o(136265);
          }
        }
        else
        {
          com.tencent.mm.plugin.downloader_app.b.c.a(this.kQO.getContext(), TaskItemView.a(this.kQO));
          AppMethodBeat.o(136265);
        }
      }
      else
      {
        com.tencent.mm.plugin.downloader_app.b.c.a(this.kQO.getContext(), TaskItemView.a(this.kQO));
        AppMethodBeat.o(136265);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader_app.ui.TaskItemView.4
 * JD-Core Version:    0.6.2
 */