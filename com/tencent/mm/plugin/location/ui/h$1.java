package com.tencent.mm.plugin.location.ui;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;

final class h$1
  implements AdapterView.OnItemClickListener
{
  h$1(h paramh)
  {
  }

  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(113492);
    paramAdapterView = (String)paramView.getTag();
    if (!bo.isNullOrNil(paramAdapterView))
    {
      com.tencent.mm.plugin.report.service.h.pYm.e(10997, new Object[] { "15", Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0) });
      if (this.nMB.nMA != null)
        this.nMB.nMA.PX(paramAdapterView);
    }
    AppMethodBeat.o(113492);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.location.ui.h.1
 * JD-Core Version:    0.6.2
 */