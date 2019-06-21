package com.tencent.mm.plugin.appbrand.jsapi.media;

import android.content.Context;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.f.a;
import com.tencent.mm.sdk.platformtools.ah;

final class g$1
  implements Runnable
{
  g$1(g paramg)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(114366);
    Toast.makeText(ah.getContext(), ah.getContext().getString(2131298807, new Object[] { a.dlz() }), 1).show();
    AppMethodBeat.o(114366);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.media.g.1
 * JD-Core Version:    0.6.2
 */