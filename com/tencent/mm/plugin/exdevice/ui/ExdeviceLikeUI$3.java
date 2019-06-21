package com.tencent.mm.plugin.exdevice.ui;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.exdevice.f.b.a.e;

final class ExdeviceLikeUI$3
  implements AdapterView.OnItemClickListener
{
  ExdeviceLikeUI$3(ExdeviceLikeUI paramExdeviceLikeUI)
  {
  }

  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(19970);
    paramAdapterView = (e)ExdeviceLikeUI.b(this.lAY).getItem(paramInt);
    paramView = new Intent(this.lAY, ExdeviceRankInfoUI.class);
    paramView.putExtra("app_username", paramAdapterView.field_appusername);
    paramView.putExtra("rank_id", paramAdapterView.field_rankID);
    paramView.putExtra("device_type", 1);
    this.lAY.startActivity(paramView);
    this.lAY.finish();
    AppMethodBeat.o(19970);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.ui.ExdeviceLikeUI.3
 * JD-Core Version:    0.6.2
 */