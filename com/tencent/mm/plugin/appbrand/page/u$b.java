package com.tencent.mm.plugin.appbrand.page;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import android.webkit.JavascriptInterface;
import com.tencent.luggage.g.d;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class u$b
{
  private u$b(u paramu)
  {
  }

  @JavascriptInterface
  public final float getPixelRatio()
  {
    AppMethodBeat.i(87196);
    float f = u.j(this.ita).getResources().getDisplayMetrics().density;
    AppMethodBeat.o(87196);
    return f;
  }

  @JavascriptInterface
  public final float getWidth()
  {
    AppMethodBeat.i(87197);
    d.i("MicroMsg.AppBrandPageView", "DeviceInfoForSDK.getWidth %d", new Object[] { Integer.valueOf(this.ita.getContentView().getWidth()) });
    float f = u.j(this.ita).getResources().getDisplayMetrics().widthPixels / getPixelRatio();
    AppMethodBeat.o(87197);
    return f;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.page.u.b
 * JD-Core Version:    0.6.2
 */