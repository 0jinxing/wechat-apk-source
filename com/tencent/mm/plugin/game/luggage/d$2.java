package com.tencent.mm.plugin.game.luggage;

import android.text.TextUtils;
import com.tencent.luggage.d.k;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import java.util.HashMap;
import java.util.LinkedList;

final class d$2
  implements Runnable
{
  d$2(Class paramClass, String paramString, d.a parama)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(135832);
    k localk = new k(ah.getContext(), this.mTW);
    d.bDq().put(this.val$url, localk);
    d.bDr().remove(this.val$url);
    if (!TextUtils.isEmpty(this.val$url))
    {
      ab.i("MicroMsg.PreloadGameWebCoreHelp", "loadUrl: %s", new Object[] { this.val$url });
      localk.loadUrl(this.val$url);
    }
    if (this.mTV != null)
      this.mTV.wM();
    AppMethodBeat.o(135832);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.luggage.d.2
 * JD-Core Version:    0.6.2
 */