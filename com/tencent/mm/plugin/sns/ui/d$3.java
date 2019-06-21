package com.tencent.mm.plugin.sns.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.List;

final class d$3
  implements Runnable
{
  d$3(d paramd, boolean paramBoolean)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(38079);
    if (this.rge)
    {
      d locald = this.rgc;
      if (locald.rga.size() > 1)
        locald.rga.remove(0);
    }
    AppMethodBeat.o(38079);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.d.3
 * JD-Core Version:    0.6.2
 */