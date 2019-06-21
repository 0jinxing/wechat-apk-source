package com.tencent.mm.ui.base;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemLongClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class MMGridPaperGridView$2
  implements AdapterView.OnItemLongClickListener
{
  MMGridPaperGridView$2(MMGridPaperGridView paramMMGridPaperGridView)
  {
  }

  public final boolean onItemLongClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(106640);
    if (MMGridPaperGridView.a(this.yvk) == null)
    {
      ab.w("MicroMsg.MMGridPaperGridView", "on item long click, but main adapter is null");
      AppMethodBeat.o(106640);
    }
    while (true)
    {
      return false;
      MMGridPaperGridView.a(this.yvk);
      MMGridPaperGridView.b(this.yvk);
      AppMethodBeat.o(106640);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.MMGridPaperGridView.2
 * JD-Core Version:    0.6.2
 */