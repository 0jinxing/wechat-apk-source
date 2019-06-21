package com.tencent.mm.plugin.appbrand.launching;

import android.content.Intent;
import android.os.Build.VERSION;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity.a;

public class ae
  implements MMActivity.a
{
  public final int requestCode;

  protected ae()
  {
    AppMethodBeat.i(131946);
    this.requestCode = (ae.class.hashCode() & 0xFFFF);
    AppMethodBeat.o(131946);
  }

  public void aHw()
  {
  }

  public final void aHx()
  {
    AppMethodBeat.i(131947);
    if (d.iW(17))
      onReady();
    AppMethodBeat.o(131947);
  }

  public final void c(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(131948);
    if (this.requestCode != paramInt1)
      AppMethodBeat.o(131948);
    while (true)
    {
      return;
      if (paramInt2 == -1)
      {
        ab.i("MicroMsg.AppBrand.PreLaunchCheckForXWEB", "onActivityResult, tbs download ok");
        com.tencent.mm.plugin.appbrand.task.h.pN(0);
        onReady();
        AppMethodBeat.o(131948);
      }
      else if (paramInt2 == 2)
      {
        ab.i("MicroMsg.AppBrand.PreLaunchCheckForXWEB", "onActivityResult, tbs cancel loading, download in background");
        aHw();
        AppMethodBeat.o(131948);
      }
      else
      {
        ab.i("MicroMsg.AppBrand.PreLaunchCheckForXWEB", "onActivityResult, tbs download unknown error, resultCode = %d, apiLevel = %d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(Build.VERSION.SDK_INT) });
        com.tencent.mm.plugin.report.service.h.pYm.a(366L, 8L, 1L, false);
        aHx();
        AppMethodBeat.o(131948);
      }
    }
  }

  public void onReady()
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.launching.ae
 * JD-Core Version:    0.6.2
 */