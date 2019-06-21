package com.tencent.mm.plugin.setting.ui.setting;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.h;
import com.tencent.mm.modelstat.k;
import com.tencent.mm.modelstat.m;
import com.tencent.mm.modelstat.q;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.bb;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.LinkedHashMap;

final class SettingsNetStatUI$3
  implements DialogInterface.OnClickListener
{
  SettingsNetStatUI$3(SettingsNetStatUI paramSettingsNetStatUI)
  {
  }

  public final void onClick(DialogInterface arg1, int paramInt)
  {
    AppMethodBeat.i(127343);
    m localm = q.aks();
    paramInt = (int)(bo.dpB() / 86400000L);
    synchronized (localm.fTM)
    {
      ???.exy.trimToSize(-1);
      ???.xBc.clear();
      ???.che.stopTimer();
      ???.xBe.stopTimer();
      ???.chh = true;
      localm.fni.delete("netstat", null, null);
      ??? = new k();
      ???.fSZ = paramInt;
      ???.id = -1;
      localm.b(???);
      SettingsNetStatUI.b(this.qod);
      AppMethodBeat.o(127343);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SettingsNetStatUI.3
 * JD-Core Version:    0.6.2
 */