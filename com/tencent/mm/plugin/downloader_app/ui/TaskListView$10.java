package com.tencent.mm.plugin.downloader_app.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.downloader_app.b.c;
import com.tencent.mm.plugin.downloader_app.b.d;
import com.tencent.mm.plugin.downloader_app.b.h;
import com.tencent.mm.plugin.downloader_app.b.i;
import com.tencent.mm.plugin.downloader_app.b.j;
import com.tencent.mm.plugin.downloader_app.c.a;
import java.util.Iterator;
import java.util.LinkedList;

final class TaskListView$10
  implements DialogInterface.OnClickListener
{
  TaskListView$10(TaskListView paramTaskListView)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(136300);
    TaskListView localTaskListView = this.kRj;
    paramDialogInterface = new LinkedList();
    Iterator localIterator = localTaskListView.kQZ.kQR.iterator();
    while (localIterator.hasNext())
    {
      i locali = (i)localIterator.next();
      if (locali.gBF)
      {
        paramDialogInterface.add(locali);
        j.kP(locali.appId);
        c.b(locali);
        switch (locali.type)
        {
        case 3:
        case 5:
        default:
          paramInt = 0;
        case 2:
        case 4:
        case 6:
        }
        while (true)
        {
          a.a(11, paramInt, locali.position, 81, locali.appId, "", "");
          break;
          paramInt = 1101;
          continue;
          paramInt = 1102;
          continue;
          paramInt = 1103;
        }
      }
    }
    if (paramDialogInterface.size() != 0)
    {
      localTaskListView.kQZ.P(paramDialogInterface);
      if (localTaskListView.kQZ.biL())
        localTaskListView.biU();
    }
    d.gf(false);
    AppMethodBeat.o(136300);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader_app.ui.TaskListView.10
 * JD-Core Version:    0.6.2
 */