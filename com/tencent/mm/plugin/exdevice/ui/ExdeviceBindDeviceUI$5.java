package com.tencent.mm.plugin.exdevice.ui;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.asr;

final class ExdeviceBindDeviceUI$5
  implements AdapterView.OnItemClickListener
{
  ExdeviceBindDeviceUI$5(ExdeviceBindDeviceUI paramExdeviceBindDeviceUI)
  {
  }

  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(19829);
    int i = ((ListView)paramAdapterView).getHeaderViewsCount();
    paramAdapterView = ExdeviceBindDeviceUI.a(this.lze).uO(paramInt - i);
    if (paramAdapterView.lzC.dFp != 0)
    {
      ExdeviceBindDeviceUI.a(this.lze, paramAdapterView);
      AppMethodBeat.o(19829);
    }
    while (true)
    {
      return;
      ExdeviceBindDeviceUI.b(this.lze, paramAdapterView);
      AppMethodBeat.o(19829);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.ui.ExdeviceBindDeviceUI.5
 * JD-Core Version:    0.6.2
 */