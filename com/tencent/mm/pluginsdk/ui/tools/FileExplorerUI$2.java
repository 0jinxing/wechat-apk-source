package com.tencent.mm.pluginsdk.ui.tools;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.storage.z;
import java.io.File;

final class FileExplorerUI$2
  implements AdapterView.OnItemClickListener
{
  FileExplorerUI$2(FileExplorerUI paramFileExplorerUI)
  {
  }

  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(105841);
    paramAdapterView = (File)FileExplorerUI.a(this.vtZ).getItem(paramInt);
    if (1 == FileExplorerUI.b(this.vtZ))
      if (paramAdapterView.isFile())
      {
        g.RP().Ry().set(131074, FileExplorerUI.a.b(FileExplorerUI.a(this.vtZ)).getAbsolutePath());
        g.RP().Ry().set(131073, FileExplorerUI.e(this.vtZ).getAbsolutePath());
        if (paramAdapterView != FileExplorerUI.a.a(FileExplorerUI.a(this.vtZ)))
          break label249;
        FileExplorerUI.a(this.vtZ).g(FileExplorerUI.a.a(FileExplorerUI.a(this.vtZ)).getParentFile(), FileExplorerUI.a.a(FileExplorerUI.a(this.vtZ)));
      }
    while (true)
    {
      FileExplorerUI.dlo();
      FileExplorerUI.a(this.vtZ).notifyDataSetChanged();
      FileExplorerUI.c(this.vtZ).setSelection(0);
      AppMethodBeat.o(105841);
      return;
      FileExplorerUI.a(this.vtZ, paramAdapterView);
      break;
      if (FileExplorerUI.b(this.vtZ) != 0)
        break;
      if (paramAdapterView.isFile())
      {
        g.RP().Ry().set(131073, FileExplorerUI.a.b(FileExplorerUI.a(this.vtZ)).getAbsolutePath());
        g.RP().Ry().set(131074, FileExplorerUI.d(this.vtZ).getAbsolutePath());
        break;
      }
      FileExplorerUI.b(this.vtZ, paramAdapterView);
      break;
      label249: if (paramAdapterView.isDirectory())
      {
        FileExplorerUI.a(this.vtZ).g(FileExplorerUI.a.b(FileExplorerUI.a(this.vtZ)), paramAdapterView);
      }
      else if (paramAdapterView.isFile())
      {
        this.vtZ.setResult(-1, new Intent().putExtra("choosed_file_path", paramAdapterView.getAbsolutePath()));
        this.vtZ.finish();
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.tools.FileExplorerUI.2
 * JD-Core Version:    0.6.2
 */