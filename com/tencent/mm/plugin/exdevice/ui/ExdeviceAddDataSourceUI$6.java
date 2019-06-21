package com.tencent.mm.plugin.exdevice.ui;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class ExdeviceAddDataSourceUI$6
  implements AdapterView.OnItemClickListener
{
  ExdeviceAddDataSourceUI$6(ExdeviceAddDataSourceUI paramExdeviceAddDataSourceUI)
  {
  }

  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(19780);
    int i = ((ListView)paramAdapterView).getHeaderViewsCount();
    paramAdapterView = ExdeviceAddDataSourceUI.c(this.lyl).uN(paramInt - i);
    if (paramAdapterView.lys != ExdeviceAddDataSourceUI.c.lyt)
      AppMethodBeat.o(19780);
    while (true)
    {
      return;
      if (!ExdeviceAddDataSourceUI.Kz(paramAdapterView.mac))
      {
        ab.i("MicroMsg.ExdeviceAddDataSourceUI", "try connect device failed.");
        AppMethodBeat.o(19780);
      }
      else
      {
        ExdeviceAddDataSourceUI.a(this.lyl, paramAdapterView.mac);
        paramAdapterView.lys = ExdeviceAddDataSourceUI.c.lyu;
        ExdeviceAddDataSourceUI.c(this.lyl).notifyDataSetChanged();
        AppMethodBeat.o(19780);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.ui.ExdeviceAddDataSourceUI.6
 * JD-Core Version:    0.6.2
 */