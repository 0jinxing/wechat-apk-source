package com.tencent.mm.plugin.honey_pay.ui;

import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.protobuf.bir;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tencent.mm.wallet_core.ui.e;

final class HoneyPayCardManagerUI$1
  implements AdapterView.OnItemClickListener
{
  HoneyPayCardManagerUI$1(HoneyPayCardManagerUI paramHoneyPayCardManagerUI)
  {
  }

  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(41793);
    paramAdapterView = (bir)paramAdapterView.getAdapter().getItem(paramInt);
    if ((paramAdapterView != null) && (!bo.isNullOrNil(paramAdapterView.url)))
    {
      ab.i(this.nrS.TAG, "click item: %s, %s", new Object[] { Integer.valueOf(paramInt), Long.valueOf(paramAdapterView.wMc) });
      e.n(this.nrS.mController.ylL, paramAdapterView.url, false);
      h.pYm.e(15191, new Object[] { Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(0) });
    }
    AppMethodBeat.o(41793);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.honey_pay.ui.HoneyPayCardManagerUI.1
 * JD-Core Version:    0.6.2
 */