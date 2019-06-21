package com.tencent.mm.plugin.multitalk.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.voip.video.i;

public final class f$6
  implements Runnable
{
  public f$6(f paramf)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(53948);
    f.n(this.oGB).stop();
    f.n(this.oGB).Gx(1);
    AppMethodBeat.o(53948);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.multitalk.model.f.6
 * JD-Core Version:    0.6.2
 */