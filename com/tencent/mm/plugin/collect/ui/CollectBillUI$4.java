package com.tencent.mm.plugin.collect.ui;

import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemLongClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.tools.j;

final class CollectBillUI$4
  implements AdapterView.OnItemLongClickListener
{
  CollectBillUI$4(CollectBillUI paramCollectBillUI)
  {
  }

  public final boolean onItemLongClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    boolean bool = true;
    AppMethodBeat.i(41214);
    if ((paramInt < 0) || (paramInt >= paramAdapterView.getAdapter().getCount()))
    {
      ab.i("MicroMsg.CollectBillUI", "illegal position: %s, count: %s", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramAdapterView.getAdapter().getCount()) });
      AppMethodBeat.o(41214);
      bool = false;
    }
    while (true)
    {
      return bool;
      CollectBillUI.i(this.kFX).a(paramView, paramInt, paramLong, this.kFX, CollectBillUI.h(this.kFX));
      AppMethodBeat.o(41214);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.collect.ui.CollectBillUI.4
 * JD-Core Version:    0.6.2
 */