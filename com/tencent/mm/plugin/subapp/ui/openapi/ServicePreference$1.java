package com.tencent.mm.plugin.subapp.ui.openapi;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ServicePreference$1
  implements AdapterView.OnItemClickListener
{
  ServicePreference$1(ServicePreference paramServicePreference)
  {
  }

  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(25483);
    if (ServicePreference.a(this.suT).wK(paramInt))
    {
      ServicePreference.a(this.suT).lX(false);
      AppMethodBeat.o(25483);
    }
    while (true)
    {
      return;
      if (ServicePreference.a(this.suT).suv)
      {
        if (ServicePreference.b(this.suT) != null)
        {
          ServicePreference.b(this.suT).onItemClick(paramAdapterView, paramView, paramInt, paramLong);
          AppMethodBeat.o(25483);
        }
      }
      else
      {
        if (ServicePreference.c(this.suT) != null)
          ServicePreference.c(this.suT).onItemClick(paramAdapterView, paramView, paramInt, paramLong);
        AppMethodBeat.o(25483);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.subapp.ui.openapi.ServicePreference.1
 * JD-Core Version:    0.6.2
 */