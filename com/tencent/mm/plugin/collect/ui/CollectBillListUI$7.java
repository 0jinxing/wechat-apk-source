package com.tencent.mm.plugin.collect.ui;

import android.content.Intent;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

final class CollectBillListUI$7
  implements AdapterView.OnItemClickListener
{
  CollectBillListUI$7(CollectBillListUI paramCollectBillListUI)
  {
  }

  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(41191);
    ab.d("MicroMsg.CollectBillListUI", "click item: %d", new Object[] { Integer.valueOf(paramInt) });
    if ((paramInt < 0) || (paramInt >= paramAdapterView.getAdapter().getCount()))
      AppMethodBeat.o(41191);
    while (true)
    {
      return;
      paramView = new Intent(this.kFH.mController.ylL, CollectBillUI.class);
      paramAdapterView = (com.tencent.mm.plugin.collect.model.h)paramAdapterView.getItemAtPosition(paramInt);
      if (paramAdapterView == null)
      {
        ab.w("MicroMsg.CollectBillListUI", "invaild record: %d", new Object[] { Integer.valueOf(paramInt) });
        AppMethodBeat.o(41191);
      }
      else
      {
        paramView.putExtra("key_type", paramAdapterView.type);
        paramView.putExtra("key_timestamp", paramAdapterView.kCc);
        paramView.putExtra("key_from_scene", 2);
        this.kFH.startActivity(paramView);
        com.tencent.mm.plugin.report.service.h.pYm.e(13944, new Object[] { Integer.valueOf(3) });
        AppMethodBeat.o(41191);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.collect.ui.CollectBillListUI.7
 * JD-Core Version:    0.6.2
 */