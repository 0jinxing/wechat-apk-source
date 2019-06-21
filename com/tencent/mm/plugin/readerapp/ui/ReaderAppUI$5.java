package com.tencent.mm.plugin.readerapp.ui;

import android.view.View;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.MMPullDownView.d;

final class ReaderAppUI$5
  implements MMPullDownView.d
{
  ReaderAppUI$5(ReaderAppUI paramReaderAppUI)
  {
  }

  public final boolean bhl()
  {
    AppMethodBeat.i(76817);
    View localView = ReaderAppUI.e(this.pFj).getChildAt(ReaderAppUI.e(this.pFj).getFirstVisiblePosition());
    boolean bool;
    if ((localView != null) && (localView.getTop() == 0))
    {
      bool = true;
      AppMethodBeat.o(76817);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(76817);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.readerapp.ui.ReaderAppUI.5
 * JD-Core Version:    0.6.2
 */