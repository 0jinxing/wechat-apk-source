package com.tencent.mm.pluginsdk.ui.tools;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class NewFileExplorerUI$1
  implements View.OnClickListener
{
  NewFileExplorerUI$1(NewFileExplorerUI paramNewFileExplorerUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(28175);
    if (NewFileExplorerUI.a(this.vva) != null)
    {
      paramView = NewFileExplorerUI.a(this.vva);
      if (paramView.aej)
        break label45;
    }
    label45: for (boolean bool = true; ; bool = false)
    {
      paramView.hE(bool);
      AppMethodBeat.o(28175);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.tools.NewFileExplorerUI.1
 * JD-Core Version:    0.6.2
 */