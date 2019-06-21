package com.tencent.mm.plugin.appbrand.t.e;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

public final class d extends g
  implements b
{
  private String iSM = "*";

  public final void Eo(String paramString)
  {
    AppMethodBeat.i(73266);
    if (paramString == null)
    {
      ab.i("MicroMsg.AppBrandNetWork.HandshakeImpl1Client", "http resource descriptor must not be null");
      AppMethodBeat.o(73266);
    }
    while (true)
    {
      return;
      this.iSM = paramString;
      AppMethodBeat.o(73266);
    }
  }

  public final String aOu()
  {
    return this.iSM;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.t.e.d
 * JD-Core Version:    0.6.2
 */