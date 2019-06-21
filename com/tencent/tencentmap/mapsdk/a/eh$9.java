package com.tencent.tencentmap.mapsdk.a;

import android.graphics.Bitmap;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.tencentmap.mapsdk.map.TencentMap.OnScreenShotListener;

class eh$9
  implements aj.p
{
  eh$9(eh parameh, TencentMap.OnScreenShotListener paramOnScreenShotListener)
  {
  }

  public void a(Bitmap paramBitmap)
  {
    AppMethodBeat.i(101475);
    if (this.a != null)
      this.a.onMapScreenShot(paramBitmap);
    AppMethodBeat.o(101475);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.a.eh.9
 * JD-Core Version:    0.6.2
 */