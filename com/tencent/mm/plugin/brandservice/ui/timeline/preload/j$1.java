package com.tencent.mm.plugin.brandservice.ui.timeline.preload;

import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ah;

final class j$1
  implements Runnable
{
  j$1(String paramString)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(14390);
    Toast.makeText(ah.getContext(), this.fOH, 0).show();
    AppMethodBeat.o(14390);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.preload.j.1
 * JD-Core Version:    0.6.2
 */