package com.tencent.mm.plugin.cloudvoip.cloudvoice.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ipcinvoker.f;
import com.tencent.mm.network.n.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.at;

final class h$a$1 extends n.a
{
  public final void gl(int paramInt)
  {
    AppMethodBeat.i(135498);
    ab.i("MicroMsg.OpenVoice.OpenVoiceNetworkMgr", "hy: on network changed: %d, changed to %s", new Object[] { Integer.valueOf(paramInt), at.gB(ah.getContext()) });
    f.a(h.a.access$000(), null, h.a.a.class);
    AppMethodBeat.o(135498);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.cloudvoip.cloudvoice.c.h.a.1
 * JD-Core Version:    0.6.2
 */