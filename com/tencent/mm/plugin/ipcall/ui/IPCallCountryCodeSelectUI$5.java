package com.tencent.mm.plugin.ipcall.ui;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class IPCallCountryCodeSelectUI$5
  implements AdapterView.OnItemClickListener
{
  IPCallCountryCodeSelectUI$5(IPCallCountryCodeSelectUI paramIPCallCountryCodeSelectUI)
  {
  }

  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(22116);
    paramView = new Intent();
    if (paramInt >= IPCallCountryCodeSelectUI.b(this.nCf).getHeaderViewsCount())
    {
      paramAdapterView = (a)IPCallCountryCodeSelectUI.c(this.nCf).getItem(paramInt - IPCallCountryCodeSelectUI.b(this.nCf).getHeaderViewsCount());
      paramView.putExtra("country_name", paramAdapterView.fHE);
      paramView.putExtra("couttry_code", paramAdapterView.countryCode);
      this.nCf.setResult(100, paramView);
    }
    this.nCf.finish();
    AppMethodBeat.o(22116);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.ui.IPCallCountryCodeSelectUI.5
 * JD-Core Version:    0.6.2
 */