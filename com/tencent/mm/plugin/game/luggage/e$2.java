package com.tencent.mm.plugin.game.luggage;

import android.os.Bundle;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import com.tencent.luggage.d.l;
import com.tencent.luggage.g.i;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class e$2 extends l
{
  e$2(e parame)
  {
  }

  public final WebResourceResponse a(WebResourceRequest paramWebResourceRequest, Bundle paramBundle)
  {
    return null;
  }

  public final void bE(String paramString)
  {
  }

  public final void bF(String paramString)
  {
  }

  public final String xt()
  {
    AppMethodBeat.i(135840);
    String str = i.p(this.mTY.getContext(), "preload_game_adapter.js");
    AppMethodBeat.o(135840);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.luggage.e.2
 * JD-Core Version:    0.6.2
 */