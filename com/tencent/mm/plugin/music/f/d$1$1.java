package com.tencent.mm.plugin.music.f;

import android.content.Context;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ah;

final class d$1$1
  implements Runnable
{
  d$1$1(d.1 param1)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(137577);
    if (System.currentTimeMillis() - this.oNG.oNE > 10000L)
    {
      this.oNG.oNE = System.currentTimeMillis();
      Toast.makeText(ah.getContext(), ah.getContext().getString(2131301592), 0).show();
    }
    AppMethodBeat.o(137577);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.music.f.d.1.1
 * JD-Core Version:    0.6.2
 */