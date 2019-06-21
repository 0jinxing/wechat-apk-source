package com.tencent.mm.plugin.freewifi.ui;

import android.view.View;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.bk;
import com.tencent.mm.g.a.bk.a;
import com.tencent.mm.sdk.g.a.c;
import com.tencent.mm.sdk.g.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class a$2$1$1
  implements Runnable
{
  a$2$1$1(a.2.1 param1, bk parambk)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(20923);
    if (bo.isNullOrNil(this.myn.cuE.cuJ))
    {
      this.myo.myl.setVisibility(8);
      AppMethodBeat.o(20923);
    }
    while (true)
    {
      return;
      a.c(this.myo.mym.myk).setText(this.myn.cuE.cuJ);
      String str1 = this.myn.cuE.cuG;
      if ("0".equalsIgnoreCase(this.myn.cuE.cuF));
      String str3;
      String str4;
      String str5;
      String str6;
      for (String str2 = "0"; ; str2 = "1")
      {
        str3 = this.myn.cuE.cuH;
        str4 = this.myn.cuE.ssid;
        str5 = this.myn.cuE.bssid;
        str6 = this.myn.cuE.cuI;
        ab.i("MicroMsg.FreeWifi.FreeWifiBanner", "desc=it tries to show bar. pingEnabled = %s,  pingUrl= %s", new Object[] { str2, str1 });
        if ("1".equals(str2))
          break label200;
        this.myo.myl.setVisibility(0);
        AppMethodBeat.o(20923);
        break;
      }
      label200: d.xDH.ak(new a.2.1.1.1(this, str1, str4, str5, str6, str3));
      AppMethodBeat.o(20923);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.ui.a.2.1.1
 * JD-Core Version:    0.6.2
 */