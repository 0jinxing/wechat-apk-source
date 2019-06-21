package com.tencent.mm.plugin.subapp.ui.openapi;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemLongClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class AppPreference$2
  implements AdapterView.OnItemLongClickListener
{
  AppPreference$2(AppPreference paramAppPreference)
  {
  }

  public final boolean onItemLongClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(25442);
    paramView = this.suE;
    if (paramView.suy != null)
    {
      paramAdapterView = paramView.suy;
      if (paramView.suy.suv)
        break label50;
    }
    label50: for (boolean bool = true; ; bool = false)
    {
      paramAdapterView.lX(bool);
      AppMethodBeat.o(25442);
      return true;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.subapp.ui.openapi.AppPreference.2
 * JD-Core Version:    0.6.2
 */