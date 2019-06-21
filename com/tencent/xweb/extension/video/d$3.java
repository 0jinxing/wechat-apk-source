package com.tencent.xweb.extension.video;

import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class d$3
  implements Runnable
{
  d$3(d paramd, boolean paramBoolean, double paramDouble)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(84577);
    if ((this.AOu) && (d.a(this.AOs) != 0.0D))
      d.l(this.AOs).c((int)(100.0D * (this.AOv / d.a(this.AOs))), false);
    d.m(this.AOs).setText(d.a(this.AOs, this.AOv));
    d.o(this.AOs).setText(d.n(this.AOs));
    AppMethodBeat.o(84577);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.extension.video.d.3
 * JD-Core Version:    0.6.2
 */