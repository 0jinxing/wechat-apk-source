package com.tencent.mm.ui.tools;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.au.b.a;

final class CountryCodeUI$7
  implements AdapterView.OnItemClickListener
{
  CountryCodeUI$7(CountryCodeUI paramCountryCodeUI)
  {
  }

  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(34806);
    paramAdapterView = new Intent();
    if (paramInt >= CountryCodeUI.b(this.zAO).getHeaderViewsCount())
    {
      paramView = (b.a)CountryCodeUI.c(this.zAO).getItem(paramInt - CountryCodeUI.b(this.zAO).getHeaderViewsCount());
      paramAdapterView.putExtra("country_name", paramView.fHE);
      paramAdapterView.putExtra("couttry_code", paramView.fHD);
      paramAdapterView.putExtra("iso_code", paramView.fHC);
      this.zAO.setResult(100, paramAdapterView);
    }
    this.zAO.finish();
    AppMethodBeat.o(34806);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.CountryCodeUI.7
 * JD-Core Version:    0.6.2
 */