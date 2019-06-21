package com.tencent.mm.plugin.appbrand.jsapi.g.a;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.tencentmap.mapsdk.map.TencentMap.OnScreenShotListener;

final class a$21
  implements TencentMap.OnScreenShotListener
{
  a$21(a parama)
  {
  }

  public final void onMapScreenShot(Bitmap paramBitmap)
  {
    AppMethodBeat.i(51172);
    if (paramBitmap != null)
      this.hNv.cAw.setImageBitmap(paramBitmap);
    AppMethodBeat.o(51172);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.g.a.a.21
 * JD-Core Version:    0.6.2
 */