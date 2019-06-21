package com.tencent.mm.plugin.location.ui;

import android.os.Looper;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelgeo.b.a;
import com.tencent.mm.plugin.k.b;
import com.tencent.mm.plugin.k.d;
import com.tencent.mm.sdk.platformtools.ak;

final class MyLocationButton$1
  implements b.a
{
  MyLocationButton$1(MyLocationButton paramMyLocationButton)
  {
  }

  public final boolean a(boolean paramBoolean, float paramFloat1, float paramFloat2, int paramInt, double paramDouble1, double paramDouble2, double paramDouble3)
  {
    AppMethodBeat.i(113448);
    if (!paramBoolean)
      AppMethodBeat.o(113448);
    while (true)
    {
      return false;
      MyLocationButton.a(this.nLI).setVisibility(8);
      MyLocationButton.b(this.nLI).setVisibility(0);
      if ((MyLocationButton.c(this.nLI) != null) && (MyLocationButton.d(this.nLI)))
      {
        MyLocationButton.c(this.nLI).getIController().setCenter(paramFloat2, paramFloat1);
        if (MyLocationButton.c(this.nLI).getZoomLevel() < 16)
          MyLocationButton.c(this.nLI).getIController().setZoom(16);
      }
      new ak(Looper.getMainLooper()).post(new MyLocationButton.1.1(this));
      AppMethodBeat.o(113448);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.location.ui.MyLocationButton.1
 * JD-Core Version:    0.6.2
 */