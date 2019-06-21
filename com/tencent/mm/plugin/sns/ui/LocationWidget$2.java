package com.tencent.mm.plugin.sns.ui;

import android.content.res.Resources;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.account.a.b.a;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;

final class LocationWidget$2
  implements View.OnClickListener
{
  LocationWidget$2(LocationWidget paramLocationWidget)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(38286);
    if (com.tencent.mm.au.b.sO((String)g.RP().Ry().get(274436, null)))
    {
      if (com.tencent.mm.pluginsdk.permission.b.o(LocationWidget.d(this.rko), "android.permission.ACCESS_COARSE_LOCATION"))
        break label178;
      if (!((Boolean)g.RP().Ry().get(ac.a.xVP, Boolean.FALSE)).booleanValue())
      {
        a.b(LocationWidget.d(this.rko), this.rko.getResources().getString(2131305910, new Object[] { aa.dor() }), 30764, true);
        AppMethodBeat.o(38286);
      }
    }
    while (true)
    {
      return;
      com.tencent.mm.pluginsdk.permission.b.b(LocationWidget.d(this.rko), "android.permission.ACCESS_COARSE_LOCATION", 64);
      AppMethodBeat.o(38286);
      continue;
      boolean bool = com.tencent.mm.pluginsdk.permission.b.a(LocationWidget.d(this.rko), "android.permission.ACCESS_COARSE_LOCATION", 64, "", "");
      ab.i("MicroMsg.LocationWidget", "summerper checkPermission checkLocation[%b]", new Object[] { Boolean.valueOf(bool) });
      if (!bool)
      {
        AppMethodBeat.o(38286);
      }
      else
      {
        label178: this.rko.crS();
        AppMethodBeat.o(38286);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.LocationWidget.2
 * JD-Core Version:    0.6.2
 */