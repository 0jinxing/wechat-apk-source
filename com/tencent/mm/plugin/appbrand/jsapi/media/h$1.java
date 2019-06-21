package com.tencent.mm.plugin.appbrand.jsapi.media;

import android.content.Context;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ah;

final class h$1
  implements Runnable
{
  h$1(h paramh, String paramString)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(114370);
    Toast.makeText(ah.getContext(), ah.getContext().getString(2131304257, new Object[] { this.hQm }), 1).show();
    AppMethodBeat.o(114370);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.media.h.1
 * JD-Core Version:    0.6.2
 */