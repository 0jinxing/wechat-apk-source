package com.tencent.mm.plugin.freewifi.model;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.freewifi.g.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class g$2
  implements Runnable
{
  g$2(g paramg, String paramString1, String paramString2, Intent paramIntent)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(20725);
    String str1 = g.MH(this.mvV);
    ab.i("MicroMsg.FreeWifi.FreeWifiNetwork", "get redirect location from loginurl : %s, %s", new Object[] { str1, this.mvV });
    if (!bo.isNullOrNil(str1))
    {
      String str2 = g.er(str1, "res=");
      ab.i("MicroMsg.FreeWifi.FreeWifiNetwork", "get connect result from location : %s, %s", new Object[] { str2, str1 });
      if ((!bo.isNullOrNil(str2)) && ((str2.startsWith("success")) || (str2.startsWith("already"))))
      {
        g.b(this.mvg, 2, this.val$intent);
        str2 = this.mvg;
        j.byW().MM(str2);
        AppMethodBeat.o(20725);
      }
    }
    while (true)
    {
      return;
      g.b(this.mvg, 3, this.val$intent);
      AppMethodBeat.o(20725);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.model.g.2
 * JD-Core Version:    0.6.2
 */