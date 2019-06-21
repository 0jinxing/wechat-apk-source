package com.tencent.xweb.extension.video;

import android.view.ViewGroup;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class d$9
  implements Runnable
{
  d$9(d paramd, boolean paramBoolean, double paramDouble1, double paramDouble2)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(84583);
    if (this.AOy)
      d.q(this.AOs).setVisibility(0);
    this.AOs.ii((int)this.AOz, (int)this.AOA);
    AppMethodBeat.o(84583);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.extension.video.d.9
 * JD-Core Version:    0.6.2
 */