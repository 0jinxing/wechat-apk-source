package com.tencent.mm.pluginsdk.ui.tools;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.storage.z;
import java.io.File;

final class FileExplorerUI$1
  implements MenuItem.OnMenuItemClickListener
{
  FileExplorerUI$1(FileExplorerUI paramFileExplorerUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(105840);
    if (FileExplorerUI.a.a(FileExplorerUI.a(this.vtZ)) != null)
      if (1 == FileExplorerUI.b(this.vtZ))
      {
        FileExplorerUI.a(this.vtZ, FileExplorerUI.a.a(FileExplorerUI.a(this.vtZ)));
        FileExplorerUI.a(this.vtZ).g(FileExplorerUI.a.a(FileExplorerUI.a(this.vtZ)).getParentFile(), FileExplorerUI.a.a(FileExplorerUI.a(this.vtZ)));
        FileExplorerUI.a(this.vtZ).notifyDataSetChanged();
        FileExplorerUI.c(this.vtZ).setSelection(0);
        FileExplorerUI.dlo();
        AppMethodBeat.o(105840);
      }
    while (true)
    {
      return true;
      if (FileExplorerUI.b(this.vtZ) != 0)
        break;
      FileExplorerUI.b(this.vtZ, FileExplorerUI.a.a(FileExplorerUI.a(this.vtZ)));
      break;
      g.RP().Ry().set(131074, FileExplorerUI.d(this.vtZ).getAbsolutePath());
      g.RP().Ry().set(131073, FileExplorerUI.e(this.vtZ).getAbsolutePath());
      this.vtZ.finish();
      AppMethodBeat.o(105840);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.tools.FileExplorerUI.1
 * JD-Core Version:    0.6.2
 */