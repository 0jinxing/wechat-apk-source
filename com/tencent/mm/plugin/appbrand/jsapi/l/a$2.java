package com.tencent.mm.plugin.appbrand.jsapi.l;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity.a;
import java.util.HashMap;
import java.util.Map;

final class a$2
  implements MMActivity.a
{
  a$2(a parama, b.a parama1)
  {
  }

  public final void c(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(131402);
    if (paramInt1 != (this.hTM.hashCode() & 0xFFFF))
      AppMethodBeat.o(131402);
    while (true)
    {
      return;
      if (paramInt2 == -1)
      {
        HashMap localHashMap = new HashMap();
        String str = bo.bc(paramIntent.getStringExtra("token"), "");
        paramIntent = bo.bc(paramIntent.getStringExtra("bind_serial"), "");
        localHashMap.put("token", str);
        localHashMap.put("bindSerial", paramIntent);
        if (this.hTL != null)
          this.hTL.a(1, null, localHashMap);
        AppMethodBeat.o(131402);
      }
      else
      {
        if (this.hTL != null)
          this.hTL.a(2, null, null);
        AppMethodBeat.o(131402);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.l.a.2
 * JD-Core Version:    0.6.2
 */