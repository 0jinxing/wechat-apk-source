package com.tencent.mm.plugin.webview.ui.tools.bag;

import android.graphics.Point;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class n$1
  implements f
{
  n$1(n paramn)
  {
  }

  public final void bh(float paramFloat)
  {
    AppMethodBeat.i(8248);
    Bundle localBundle = new Bundle();
    localBundle.putFloat("key_alpha", paramFloat);
    n.a(this.uzN, localBundle);
    AppMethodBeat.o(8248);
  }

  public final void d(float paramFloat, int paramInt)
  {
    AppMethodBeat.i(8247);
    ab.i("MicroMsg.WebViewUIBagHelper", "showBag swipedPosX:%f reportScene:%d", new Object[] { Float.valueOf(paramFloat), Integer.valueOf(paramInt) });
    n.a(this.uzN, paramInt);
    Point localPoint = (Point)n.b(this.uzN, 8).getParcelable("key_current_bag_pos");
    i.a(n.a(this.uzN), localPoint, paramFloat, n.b(this.uzN));
    AppMethodBeat.o(8247);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.bag.n.1
 * JD-Core Version:    0.6.2
 */