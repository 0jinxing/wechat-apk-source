package com.tencent.mm.ui;

import android.database.DataSetObserver;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ServiceNotifySettingsUI$3 extends DataSetObserver
{
  ServiceNotifySettingsUI$3(ServiceNotifySettingsUI paramServiceNotifySettingsUI)
  {
  }

  public final void onChanged()
  {
    AppMethodBeat.i(29852);
    View localView = this.ypY.findViewById(2131827357);
    if (ServiceNotifySettingsUI.a(this.ypY).isEmpty());
    for (int i = 4; ; i = 0)
    {
      localView.setVisibility(i);
      AppMethodBeat.o(29852);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.ServiceNotifySettingsUI.3
 * JD-Core Version:    0.6.2
 */