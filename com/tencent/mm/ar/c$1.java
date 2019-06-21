package com.tencent.mm.ar;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.f;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Set;

final class c$1
  implements Runnable
{
  c$1(c paramc, String paramString)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(16470);
    Object[] arrayOfObject = this.fCH.fCy.keySet().toArray();
    for (int i = 0; i < arrayOfObject.length; i++)
    {
      String str = (String)arrayOfObject[i];
      if (str.startsWith(this.eiH))
      {
        ab.d("MicroMsg.GetContactService", "clearMapRecentDown(): key = %s", new Object[] { str });
        this.fCH.fCy.remove(str);
      }
    }
    AppMethodBeat.o(16470);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ar.c.1
 * JD-Core Version:    0.6.2
 */