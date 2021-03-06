package com.tencent.mm.plugin.nfc_open;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.plugin.appbrand.jsapi.nfc.hce.a.d;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.MultiProcessSharedPreferences;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;

final class a$1
  implements Runnable
{
  a$1(a parama)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(23053);
    Object localObject = MultiProcessSharedPreferences.getSharedPreferences(ah.getContext(), "system_config_prefs", 4);
    int i;
    int j;
    if (bo.az(((SharedPreferences)localObject).getLong("NFC_REPORT_TIME", 0L)) > 86400000L)
    {
      i = com.tencent.mm.plugin.nfc.b.a.a.bVz().eG(ah.getContext());
      if (i != 0)
        break label167;
      j = 0;
      if (!d.aEA())
        break label172;
    }
    label167: label172: for (int k = 1; ; k = 0)
    {
      ab.i("MicroMsg.SubCoreCpuCard", "alvinluo NFC report isSupportNFC: %d, isSupportHCE: %d", new Object[] { Integer.valueOf(j), Integer.valueOf(k) });
      h.pYm.e(12779, new Object[] { q.LK(), Integer.valueOf(j), Integer.valueOf(k) });
      localObject = ((SharedPreferences)localObject).edit();
      ((SharedPreferences.Editor)localObject).putLong("NFC_REPORT_TIME", bo.yz());
      ((SharedPreferences.Editor)localObject).commit();
      ab.i("MicroMsg.SubCoreCpuCard", "doNFCReport status = ".concat(String.valueOf(i)));
      AppMethodBeat.o(23053);
      return;
      j = 1;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.nfc_open.a.1
 * JD-Core Version:    0.6.2
 */