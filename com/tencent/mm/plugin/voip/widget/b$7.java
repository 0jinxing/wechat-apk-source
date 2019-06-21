package com.tencent.mm.plugin.voip.widget;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.voip.video.a.d;

final class b$7
  implements d
{
  b$7(b paramb)
  {
  }

  public final void bu(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(5179);
    if (paramArrayOfByte != null)
      b.a(this.tcB, paramArrayOfByte);
    AppMethodBeat.o(5179);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.widget.b.7
 * JD-Core Version:    0.6.2
 */