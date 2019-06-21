package com.tencent.mm.plugin.masssend.ui;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class MassSendHistoryUI$9
  implements AdapterView.OnItemClickListener
{
  MassSendHistoryUI$9(MassSendHistoryUI paramMassSendHistoryUI)
  {
  }

  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(22802);
    ab.v("MicroMsg.MassSendHistoryUI", "onItemClick");
    AppMethodBeat.o(22802);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.masssend.ui.MassSendHistoryUI.9
 * JD-Core Version:    0.6.2
 */