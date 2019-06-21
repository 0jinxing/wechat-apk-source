package com.tencent.mm.ui.base;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class MMGridPaperGridView$1
  implements AdapterView.OnItemClickListener
{
  MMGridPaperGridView$1(MMGridPaperGridView paramMMGridPaperGridView)
  {
  }

  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(106639);
    if (MMGridPaperGridView.a(this.yvk) == null)
    {
      ab.w("MicroMsg.MMGridPaperGridView", "on item click, but main adapter is null");
      AppMethodBeat.o(106639);
    }
    while (true)
    {
      return;
      MMGridPaperGridView.a(this.yvk);
      MMGridPaperGridView.b(this.yvk);
      AppMethodBeat.o(106639);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.MMGridPaperGridView.1
 * JD-Core Version:    0.6.2
 */