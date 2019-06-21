package com.tencent.mm.plugin.readerapp.ui;

import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.MMPullDownView.c;

final class ReaderAppUI$4
  implements MMPullDownView.c
{
  ReaderAppUI$4(ReaderAppUI paramReaderAppUI)
  {
  }

  public final boolean bhm()
  {
    boolean bool = false;
    AppMethodBeat.i(76816);
    View localView = ReaderAppUI.e(this.pFj).getChildAt(ReaderAppUI.e(this.pFj).getChildCount() - 1);
    if (localView == null)
      AppMethodBeat.o(76816);
    while (true)
    {
      return bool;
      if ((localView.getBottom() <= ReaderAppUI.e(this.pFj).getHeight()) && (ReaderAppUI.e(this.pFj).getLastVisiblePosition() == ReaderAppUI.e(this.pFj).getAdapter().getCount() - 1))
      {
        bool = true;
        AppMethodBeat.o(76816);
      }
      else
      {
        AppMethodBeat.o(76816);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.readerapp.ui.ReaderAppUI.4
 * JD-Core Version:    0.6.2
 */