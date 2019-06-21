package com.tencent.mm.pluginsdk.ui.tools;

import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.e;
import com.tencent.mm.sdk.platformtools.ab;
import java.io.File;

final class NewFileExplorerUI$7
  implements FileSelectorFolderView.a
{
  NewFileExplorerUI$7(NewFileExplorerUI paramNewFileExplorerUI)
  {
  }

  public final void Ls(int paramInt)
  {
    AppMethodBeat.i(28181);
    ab.i("MicroMsg.FileExplorerUI", "position: %d", new Object[] { Integer.valueOf(paramInt) });
    if (paramInt == 0)
    {
      this.vva.setMMTitle(2131299785);
      this.vva.setMMSubTitle(null);
      NewFileExplorerUI.a(this.vva, (TextView)this.vva.findViewById(2131826346));
      NewFileExplorerUI.g(this.vva).setText(2131299785);
      NewFileExplorerUI.b(this.vva).c(new File(e.euQ), true);
      NewFileExplorerUI.b(this.vva).a(new File(e.euQ), null);
    }
    while (true)
    {
      NewFileExplorerUI.b(this.vva).notifyDataSetChanged();
      NewFileExplorerUI.c(this.vva);
      AppMethodBeat.o(28181);
      return;
      NewFileExplorerUI.b(this.vva).c(new File(e.eSl), false);
      NewFileExplorerUI.b(this.vva).a(new File(e.eSl), null);
      this.vva.setMMTitle(2131299786);
      NewFileExplorerUI.g(this.vva).setText(2131299786);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.tools.NewFileExplorerUI.7
 * JD-Core Version:    0.6.2
 */