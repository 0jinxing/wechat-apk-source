package com.tencent.mm.plugin.location.ui.impl;

import android.content.Intent;
import android.view.MenuItem;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.expt.a.a;
import com.tencent.mm.plugin.expt.a.a.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.base.n.d;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

final class h$9
  implements n.d
{
  h$9(h paramh)
  {
  }

  public final void onMMMenuItemSelected(MenuItem paramMenuItem, int paramInt)
  {
    AppMethodBeat.i(113702);
    switch (paramMenuItem.getItemId())
    {
    default:
      if (this.nRb.nQY != null)
      {
        Iterator localIterator = this.nRb.nQY.entrySet().iterator();
        while (localIterator.hasNext())
        {
          Map.Entry localEntry = (Map.Entry)localIterator.next();
          if (((String)localEntry.getValue()).equals(paramMenuItem.getTitle()))
          {
            this.nRb.nOI.a(this.nRb.nOJ, this.nRb.nOK, (String)localEntry.getKey(), false);
            com.tencent.mm.plugin.report.service.h.pYm.e(12809, new Object[] { Integer.valueOf(4), localEntry.getKey() });
            AppMethodBeat.o(113702);
          }
        }
      }
      break;
    case 1:
    case 2:
    }
    while (true)
    {
      return;
      this.nRb.bKI();
      com.tencent.mm.plugin.report.service.h.pYm.e(12809, new Object[] { Integer.valueOf(4) });
      AppMethodBeat.o(113702);
      continue;
      ab.i("MicroMsg.TrackMapUI", "click tencent map: %s", new Object[] { Boolean.valueOf(this.nRb.nQY.containsKey("com.tencent.map")) });
      if (h.a(this.nRb))
      {
        this.nRb.nOI.a(this.nRb.nOJ, this.nRb.nOK, "com.tencent.map", false);
        com.tencent.mm.plugin.report.service.h.pYm.e(12809, new Object[] { Integer.valueOf(4), "com.tencent.map" });
        AppMethodBeat.o(113702);
      }
      else
      {
        if (this.nRb.nQZ < 4)
        {
          paramMenuItem = this.nRb;
          paramMenuItem.nQZ += 1;
          g.RP().Ry().set(ac.a.xRD, Integer.valueOf(this.nRb.nQZ));
        }
        if (1 == ((a)g.K(a.class)).a(a.a.lFT, 0));
        for (paramInt = 1; ; paramInt = 0)
        {
          if (paramInt == 0)
            break label431;
          new h.a(this.nRb.activity, this.nRb.nRa).execute(new String[] { "https://3gimg.qq.com/tencentMapTouch/app/download/apkForWXAndroidConf.json" });
          AppMethodBeat.o(113702);
          break;
        }
        label431: paramMenuItem = new Intent();
        paramMenuItem.putExtra("rawUrl", "http://mapdownload.map.qq.com/?key=wx&referer=wx1&channel=00008");
        com.tencent.mm.bp.d.b(this.nRb.activity, "webview", ".ui.tools.WebViewUI", paramMenuItem);
        com.tencent.mm.plugin.report.service.h.pYm.e(12809, new Object[] { Integer.valueOf(5) });
        AppMethodBeat.o(113702);
        continue;
        AppMethodBeat.o(113702);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.location.ui.impl.h.9
 * JD-Core Version:    0.6.2
 */