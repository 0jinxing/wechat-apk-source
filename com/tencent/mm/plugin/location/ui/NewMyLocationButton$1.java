package com.tencent.mm.plugin.location.ui;

import android.os.Looper;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelgeo.b.a;
import com.tencent.mm.plugin.k.b;
import com.tencent.mm.plugin.k.d;
import com.tencent.mm.sdk.platformtools.ak;

final class NewMyLocationButton$1
  implements b.a
{
  NewMyLocationButton$1(NewMyLocationButton paramNewMyLocationButton)
  {
  }

  public final boolean a(boolean paramBoolean, float paramFloat1, float paramFloat2, int paramInt, double paramDouble1, double paramDouble2, double paramDouble3)
  {
    AppMethodBeat.i(113462);
    if (!paramBoolean)
      AppMethodBeat.o(113462);
    while (true)
    {
      return false;
      NewMyLocationButton.a(this.nMc).setVisibility(8);
      NewMyLocationButton.b(this.nMc).setVisibility(0);
      if ((NewMyLocationButton.c(this.nMc) != null) && (NewMyLocationButton.d(this.nMc)))
      {
        NewMyLocationButton.c(this.nMc).getIController().setCenter(paramFloat2, paramFloat1);
        if (NewMyLocationButton.c(this.nMc).getZoomLevel() < 16)
          NewMyLocationButton.c(this.nMc).getIController().setZoom(16);
      }
      new ak(Looper.getMainLooper()).post(new NewMyLocationButton.1.1(this));
      AppMethodBeat.o(113462);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.location.ui.NewMyLocationButton.1
 * JD-Core Version:    0.6.2
 */