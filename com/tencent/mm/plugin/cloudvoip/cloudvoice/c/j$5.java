package com.tencent.mm.plugin.cloudvoip.cloudvoice.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.cloudvoip.cloudvoice.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.ArrayList;

final class j$5
  implements e.a
{
  j$5(j paramj)
  {
  }

  public final void v(ArrayList<a> paramArrayList)
  {
    AppMethodBeat.i(135521);
    ab.v("MicroMsg.OpenVoice.OpenVoiceService", "hy: current talking members are %s", new Object[] { paramArrayList });
    this.kAJ.R(new j.5.1(this, paramArrayList));
    AppMethodBeat.o(135521);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.cloudvoip.cloudvoice.c.j.5
 * JD-Core Version:    0.6.2
 */