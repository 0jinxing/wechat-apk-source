package com.tencent.mm.plugin.appbrand.widget.e;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.animation.LinearInterpolator;
import com.tencent.mapsdk.raster.model.LatLng;
import com.tencent.mapsdk.raster.model.Marker;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.g.a.b.g;
import com.tencent.mm.plugin.location_soso.api.SoSoMapView;
import com.tencent.tencentmap.mapsdk.map.Projection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class c
{
  private LinkedList<b.g> jkb;
  Marker jkc;
  private SoSoMapView jkd;
  f jke;
  public AnimatorSet uB;

  public c(LinkedList<b.g> paramLinkedList, Marker paramMarker, SoSoMapView paramSoSoMapView)
  {
    AppMethodBeat.i(51262);
    this.jkb = paramLinkedList;
    this.jkc = paramMarker;
    this.jkd = paramSoSoMapView;
    init();
    AppMethodBeat.o(51262);
  }

  private ValueAnimator a(b.g paramg)
  {
    AppMethodBeat.i(51264);
    LatLng[] arrayOfLatLng = new LatLng[2];
    arrayOfLatLng[0] = new LatLng(paramg.hNS, paramg.hNR);
    arrayOfLatLng[1] = new LatLng(paramg.latitude, paramg.longitude);
    final e locale1 = this.jke.b(arrayOfLatLng[0]);
    final e locale2 = this.jke.b(arrayOfLatLng[1]);
    final double[] arrayOfDouble = new double[1];
    Object localObject = this.jkd.getProjection();
    int i = 0;
    double d = 0.0D;
    while (i <= 0)
    {
      arrayOfDouble[0] = ((Projection)localObject).distanceBetween(arrayOfLatLng[0], arrayOfLatLng[1]);
      d = arrayOfDouble[0] + 0.0D;
      i++;
    }
    localObject = new ValueAnimator();
    ((ValueAnimator)localObject).setDuration(()(paramg.duration * arrayOfDouble[0] / d));
    ((ValueAnimator)localObject).setInterpolator(new LinearInterpolator());
    ((ValueAnimator)localObject).setFloatValues(new float[] { (float)arrayOfDouble[0] });
    ((ValueAnimator)localObject).addUpdateListener(new ValueAnimator.AnimatorUpdateListener()
    {
      public final void onAnimationUpdate(ValueAnimator paramAnonymousValueAnimator)
      {
        AppMethodBeat.i(51260);
        if (locale1.equals(locale2))
          AppMethodBeat.o(51260);
        while (true)
        {
          return;
          double d1 = Double.parseDouble(String.valueOf(paramAnonymousValueAnimator.getAnimatedValue()));
          double d2 = locale1.x;
          double d3 = (locale2.x - locale1.x) * d1 / arrayOfDouble[0];
          double d4 = locale1.y;
          d1 = d1 * (locale2.y - locale1.y) / arrayOfDouble[0];
          Marker localMarker = c.this.jkc;
          paramAnonymousValueAnimator = c.this.jke;
          e locale = new e(d2 + d3, d1 + d4);
          d2 = locale.x / paramAnonymousValueAnimator.jkq;
          localMarker.setPosition(new LatLng(90.0D - Math.toDegrees(Math.atan(Math.exp(-(0.5D - locale.y / paramAnonymousValueAnimator.jkq) * 2.0D * 3.141592653589793D)) * 2.0D), (d2 - 0.5D) * 360.0D));
          AppMethodBeat.o(51260);
        }
      }
    });
    AppMethodBeat.o(51264);
    return localObject;
  }

  private void init()
  {
    AppMethodBeat.i(51263);
    this.uB = new AnimatorSet();
    this.jke = new f();
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = this.jkb.iterator();
    while (localIterator.hasNext())
    {
      b.g localg = (b.g)localIterator.next();
      if (localg.rotate != 0.0F)
      {
        ValueAnimator localValueAnimator = ValueAnimator.ofFloat(new float[] { this.jkc.getRotation(), this.jkc.getRotation() + localg.rotate });
        localValueAnimator.setDuration(localg.duration);
        localValueAnimator.setInterpolator(new LinearInterpolator());
        localValueAnimator.addUpdateListener(new c.2(this));
        localArrayList.add(localValueAnimator);
      }
      else
      {
        localArrayList.add(a(localg));
      }
    }
    this.uB.playSequentially(localArrayList);
    AppMethodBeat.o(51263);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.e.c
 * JD-Core Version:    0.6.2
 */