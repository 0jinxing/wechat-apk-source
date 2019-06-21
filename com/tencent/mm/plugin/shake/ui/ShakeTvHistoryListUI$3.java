package com.tencent.mm.plugin.shake.ui;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.shake.d.a.k;
import com.tencent.mm.plugin.shake.d.a.n;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

final class ShakeTvHistoryListUI$3
  implements AdapterView.OnItemClickListener
{
  ShakeTvHistoryListUI$3(ShakeTvHistoryListUI paramShakeTvHistoryListUI)
  {
  }

  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(24895);
    paramAdapterView = (n)ShakeTvHistoryListUI.a(this.qwx).getItem(paramInt);
    paramView = this.qwx.mController.ylL;
    if (paramAdapterView != null)
      if ((bo.isNullOrNil(paramAdapterView.field_username)) && (bo.isNullOrNil(paramAdapterView.field_deeplink)))
      {
        h.pYm.e(12108, new Object[] { bo.nullAsNil(paramAdapterView.field_username), Integer.valueOf(2), Integer.valueOf(0) });
        AppMethodBeat.o(24895);
      }
    while (true)
    {
      return;
      k.a(paramAdapterView.field_username, paramAdapterView.field_deeplink, 2, paramView);
      ab.i("Micromsg.ShakeTVLogic", "doShakeTvHistoryItemClick start do nth");
      AppMethodBeat.o(24895);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.shake.ui.ShakeTvHistoryListUI.3
 * JD-Core Version:    0.6.2
 */