package com.tencent.mm.plugin.appbrand.jsapi.g.a;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.tencent.mapsdk.raster.model.Marker;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

public final class d extends LinearLayout
  implements h
{
  private Context context;
  Marker hNK;
  private ImageView hOq;
  double hOr;
  double hOs;
  double hOt;
  double hOu;
  float hOv;
  float hOw;
  private float hOx;
  boolean hOy;

  public d(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(51235);
    this.hOr = -1.0D;
    this.hOs = -1.0D;
    this.hOt = -1.0D;
    this.hOu = -1.0D;
    this.hOv = 900.0F;
    this.hOw = 900.0F;
    this.hOx = 0.0F;
    this.context = paramContext;
    this.hOq = ((ImageView)View.inflate(this.context, 2130969265, this).findViewById(2131823251));
    this.hOq.requestFocus();
    AppMethodBeat.o(51235);
  }

  private void ao(float paramFloat)
  {
    AppMethodBeat.i(51237);
    if (this.hNK != null)
    {
      ab.v("MicroMsg.AppbrandMapLocationPoint", "updateRotation rotation:%f", new Object[] { Float.valueOf(paramFloat) });
      this.hNK.setRotation(paramFloat);
    }
    AppMethodBeat.o(51237);
  }

  private float getHeading()
  {
    if (this.hOy);
    for (float f = this.hOv; ; f = this.hOx)
      return f;
  }

  public final void J(float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(51236);
    this.hOx = paramFloat2;
    ao(getHeading());
    AppMethodBeat.o(51236);
  }

  public final double getLatitude()
  {
    return this.hOr;
  }

  public final double getLongitude()
  {
    return this.hOs;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.g.a.d
 * JD-Core Version:    0.6.2
 */