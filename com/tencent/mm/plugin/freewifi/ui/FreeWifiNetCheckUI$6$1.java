package com.tencent.mm.plugin.freewifi.ui;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.freewifi.d.k;
import com.tencent.mm.sdk.platformtools.bo;

final class FreeWifiNetCheckUI$6$1
  implements f
{
  FreeWifiNetCheckUI$6$1(FreeWifiNetCheckUI.6 param6)
  {
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(21039);
    paramString = ((k)paramm).bzq();
    if (!bo.isNullOrNil(paramString))
    {
      FreeWifiNetCheckUI.a(this.mzP.mzM, paramString);
      this.mzP.mzM.getIntent().putExtra("free_wifi_ap_key", paramString);
      FreeWifiNetCheckUI.d(this.mzP.mzM);
      FreeWifiNetCheckUI.e(this.mzP.mzM);
      AppMethodBeat.o(21039);
    }
    while (true)
    {
      return;
      this.mzP.mzM.finish();
      FreeWifiNetCheckUI.c(this.mzP.mzM);
      AppMethodBeat.o(21039);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.ui.FreeWifiNetCheckUI.6.1
 * JD-Core Version:    0.6.2
 */