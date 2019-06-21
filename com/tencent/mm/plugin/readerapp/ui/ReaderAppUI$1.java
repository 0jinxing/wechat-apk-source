package com.tencent.mm.plugin.readerapp.ui;

import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.View;
import android.view.View.OnCreateContextMenuListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;

final class ReaderAppUI$1
  implements View.OnCreateContextMenuListener
{
  ReaderAppUI$1(ReaderAppUI paramReaderAppUI, boolean paramBoolean)
  {
  }

  public final void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    AppMethodBeat.i(76813);
    int i = ((Integer)paramView.getTag()).intValue();
    paramContextMenu.clear();
    if (ReaderAppUI.a(this.pFj) == 20)
      paramContextMenu.setHeaderTitle(2131300497);
    while (true)
    {
      if (20 == ReaderAppUI.a(this.pFj))
      {
        if (this.pFi)
          paramContextMenu.add(i, 0, 1, 2131302147);
        if (d.afj("favorite"))
          paramContextMenu.add(i, 1, 2, 2131301955);
        ReaderAppUI.a(this.pFj, ((Integer)paramView.getTag(2131820654)).intValue());
      }
      paramContextMenu.add(i, 2, 3, 2131302146);
      AppMethodBeat.o(76813);
      return;
      paramContextMenu.setHeaderTitle(2131300500);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.readerapp.ui.ReaderAppUI.1
 * JD-Core Version:    0.6.2
 */