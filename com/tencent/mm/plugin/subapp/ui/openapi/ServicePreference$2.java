package com.tencent.mm.plugin.subapp.ui.openapi;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemLongClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ServicePreference$2
  implements AdapterView.OnItemLongClickListener
{
  ServicePreference$2(ServicePreference paramServicePreference)
  {
  }

  public final boolean onItemLongClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(25484);
    paramAdapterView = this.suT;
    if (paramAdapterView.suS != null)
    {
      paramView = paramAdapterView.suS;
      if (paramAdapterView.suS.suv)
        break label50;
    }
    label50: for (boolean bool = true; ; bool = false)
    {
      paramView.lX(bool);
      AppMethodBeat.o(25484);
      return true;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.subapp.ui.openapi.ServicePreference.2
 * JD-Core Version:    0.6.2
 */