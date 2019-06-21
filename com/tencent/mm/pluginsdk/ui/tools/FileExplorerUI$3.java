package com.tencent.mm.pluginsdk.ui.tools;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.File;

final class FileExplorerUI$3
  implements View.OnClickListener
{
  FileExplorerUI$3(FileExplorerUI paramFileExplorerUI, File paramFile)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(105842);
    FileExplorerUI.a(this.vtZ, 0);
    FileExplorerUI.a(this.vtZ).fUJ = this.vua.getPath();
    FileExplorerUI.a(this.vtZ).g(FileExplorerUI.e(this.vtZ).getParentFile(), FileExplorerUI.e(this.vtZ));
    FileExplorerUI.a(this.vtZ).notifyDataSetInvalidated();
    FileExplorerUI.a(this.vtZ).notifyDataSetChanged();
    FileExplorerUI.c(this.vtZ).setSelection(0);
    AppMethodBeat.o(105842);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.tools.FileExplorerUI.3
 * JD-Core Version:    0.6.2
 */