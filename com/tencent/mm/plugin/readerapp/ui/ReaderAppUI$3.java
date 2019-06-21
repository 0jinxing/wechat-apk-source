package com.tencent.mm.plugin.readerapp.ui;

import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.tools.k;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.MMPullDownView;
import com.tencent.mm.ui.base.MMPullDownView.g;

final class ReaderAppUI$3
  implements MMPullDownView.g
{
  ReaderAppUI$3(ReaderAppUI paramReaderAppUI)
  {
  }

  public final boolean bhn()
  {
    AppMethodBeat.i(76815);
    if (ReaderAppUI.b(this.pFj).bdn())
    {
      ReaderAppUI.e(this.pFj).setSelectionFromTop(0, ReaderAppUI.d(this.pFj).getTopHeight());
      AppMethodBeat.o(76815);
    }
    while (true)
    {
      return true;
      int i = ReaderAppUI.b(this.pFj).getCount();
      int j = ReaderAppUI.b(this.pFj).bdo();
      ab.v("MicroMsg.ReaderAppUI", "onLoadData add count:".concat(String.valueOf(j)));
      ReaderAppUI.b(this.pFj).a(null, null);
      int k = ReaderAppUI.b(this.pFj).getCount();
      ab.d("MicroMsg.ReaderAppUI", "onTopLoadData nowCount:%d, preCount:%d", new Object[] { Integer.valueOf(k), Integer.valueOf(i) });
      if (k > i)
      {
        ab.i("MicroMsg.ReaderAppUI", "pullDownView nowCount > preCount on set position %d, set pullDownView.getTopHeight() %d", new Object[] { Integer.valueOf(j + 1), Integer.valueOf(ReaderAppUI.d(this.pFj).getTopHeight()) });
        k.a(ReaderAppUI.e(this.pFj), j + 1, ReaderAppUI.d(this.pFj).getTopHeight(), false);
      }
      AppMethodBeat.o(76815);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.readerapp.ui.ReaderAppUI.3
 * JD-Core Version:    0.6.2
 */