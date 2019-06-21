package com.tencent.mm.plugin.exdevice.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.exdevice.service.c.a;
import com.tencent.mm.sdk.platformtools.ab;

final class d$11 extends c.a
{
  d$11(d paramd)
  {
    super(0);
  }

  public final void onServiceConnected()
  {
    AppMethodBeat.i(19109);
    ab.d("MicroMsg.exdevice.ExdeviceConnectManager", "onServiceConnected");
    AppMethodBeat.o(19109);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.model.d.11
 * JD-Core Version:    0.6.2
 */