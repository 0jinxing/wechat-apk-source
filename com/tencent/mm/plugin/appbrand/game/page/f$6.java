package com.tencent.mm.plugin.appbrand.game.page;

import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class f$6
  implements Runnable
{
  f$6(f paramf)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(130245);
    f.e(this.hsW).setVisibility(0);
    f.e(this.hsW).setImageBitmap(f.d(this.hsW));
    AppMethodBeat.o(130245);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.game.page.f.6
 * JD-Core Version:    0.6.2
 */