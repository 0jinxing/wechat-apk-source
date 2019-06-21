package com.tencent.mm.plugin.subapp.ui.openapi;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.s;
import com.tencent.mm.pluginsdk.model.app.f;
import com.tencent.mm.sdk.platformtools.ab;

final class ServiceAppUI$2
  implements AdapterView.OnItemClickListener
{
  ServiceAppUI$2(ServiceAppUI paramServiceAppUI)
  {
  }

  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(25472);
    if (ServiceAppUI.a(this.suP) == null)
    {
      ab.e("MicroMsg.ServiceAppUI", "wx onItemClick wxServicePref null");
      AppMethodBeat.o(25472);
    }
    while (true)
    {
      return;
      paramAdapterView = ServiceAppUI.a(this.suP).Fq(paramInt);
      if (paramAdapterView == null)
      {
        ab.e("MicroMsg.ServiceAppUI", "wx onItemClick app is null");
        AppMethodBeat.o(25472);
      }
      else
      {
        ab.i("MicroMsg.ServiceAppUI", "onItemClick, jumpType[%d], package[%s], appid[%s]", new Object[] { Integer.valueOf(paramAdapterView.dnv), paramAdapterView.field_packageName, paramAdapterView.field_appId });
        ServiceAppUI.a(this.suP, paramAdapterView);
        AppMethodBeat.o(25472);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.subapp.ui.openapi.ServiceAppUI.2
 * JD-Core Version:    0.6.2
 */