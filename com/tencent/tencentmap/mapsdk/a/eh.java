package com.tencent.tencentmap.mapsdk.a;

import android.graphics.Point;
import android.graphics.Rect;
import com.tencent.mapsdk.raster.model.CameraPosition;
import com.tencent.mapsdk.raster.model.Circle;
import com.tencent.mapsdk.raster.model.CircleOptions;
import com.tencent.mapsdk.raster.model.Language;
import com.tencent.mapsdk.raster.model.LatLng;
import com.tencent.mapsdk.raster.model.Marker;
import com.tencent.mapsdk.raster.model.MarkerOptions;
import com.tencent.mapsdk.raster.model.Polygon;
import com.tencent.mapsdk.raster.model.PolygonOptions;
import com.tencent.mapsdk.raster.model.Polyline;
import com.tencent.mapsdk.raster.model.PolylineOptions;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.tencentmap.mapsdk.map.CameraUpdate;
import com.tencent.tencentmap.mapsdk.map.CancelableCallback;
import com.tencent.tencentmap.mapsdk.map.TencentMap;
import com.tencent.tencentmap.mapsdk.map.TencentMap.InfoWindowAdapter;
import com.tencent.tencentmap.mapsdk.map.TencentMap.OnErrorListener;
import com.tencent.tencentmap.mapsdk.map.TencentMap.OnIndoorStateChangeListener;
import com.tencent.tencentmap.mapsdk.map.TencentMap.OnInfoWindowClickListener;
import com.tencent.tencentmap.mapsdk.map.TencentMap.OnMapCameraChangeListener;
import com.tencent.tencentmap.mapsdk.map.TencentMap.OnMapClickListener;
import com.tencent.tencentmap.mapsdk.map.TencentMap.OnMapLoadedListener;
import com.tencent.tencentmap.mapsdk.map.TencentMap.OnMapLongClickListener;
import com.tencent.tencentmap.mapsdk.map.TencentMap.OnMapPoiClickListener;
import com.tencent.tencentmap.mapsdk.map.TencentMap.OnMarkerClickListener;
import com.tencent.tencentmap.mapsdk.map.TencentMap.OnMarkerDraggedListener;
import com.tencent.tencentmap.mapsdk.map.TencentMap.OnScreenShotListener;
import com.tencent.tencentmap.mapsdk.map.TencentMap.TencentMapGestureListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class eh
  implements TencentMap
{
  private aj a;
  private HashMap<Integer, ed> b;
  private List<de> c;
  private boolean d;
  private dn e;

  public eh(aj paramaj)
  {
    AppMethodBeat.i(101489);
    this.b = new HashMap();
    this.c = new ArrayList();
    this.d = false;
    this.a = paramaj;
    AppMethodBeat.o(101489);
  }

  private ed a(de paramde)
  {
    AppMethodBeat.i(101518);
    if (paramde == null)
    {
      paramde = null;
      AppMethodBeat.o(101518);
    }
    while (true)
    {
      return paramde;
      paramde = (ed)this.b.get(Integer.valueOf(paramde.c().hashCode()));
      AppMethodBeat.o(101518);
    }
  }

  protected List<de> a()
  {
    return this.c;
  }

  public Circle addCircle(CircleOptions paramCircleOptions)
  {
    Object localObject = null;
    AppMethodBeat.i(101492);
    if (this.a == null)
    {
      AppMethodBeat.o(101492);
      paramCircleOptions = localObject;
    }
    while (true)
    {
      return paramCircleOptions;
      if (paramCircleOptions == null)
      {
        AppMethodBeat.o(101492);
        paramCircleOptions = localObject;
      }
      else
      {
        paramCircleOptions = new eb(this.a.a(ej.a(paramCircleOptions)));
        AppMethodBeat.o(101492);
      }
    }
  }

  public Marker addMarker(MarkerOptions paramMarkerOptions)
  {
    Object localObject = null;
    AppMethodBeat.i(101493);
    if (this.a == null)
    {
      AppMethodBeat.o(101493);
      paramMarkerOptions = localObject;
    }
    while (true)
    {
      return paramMarkerOptions;
      if (paramMarkerOptions == null)
      {
        AppMethodBeat.o(101493);
        paramMarkerOptions = localObject;
      }
      else
      {
        paramMarkerOptions = new ed(this, this.a.a(ej.a(paramMarkerOptions)));
        this.b.put(Integer.valueOf(paramMarkerOptions.getId().hashCode()), paramMarkerOptions);
        AppMethodBeat.o(101493);
      }
    }
  }

  public Polygon addPolygon(PolygonOptions paramPolygonOptions)
  {
    Object localObject = null;
    AppMethodBeat.i(101495);
    if (this.a == null)
    {
      AppMethodBeat.o(101495);
      paramPolygonOptions = localObject;
    }
    while (true)
    {
      return paramPolygonOptions;
      if (paramPolygonOptions == null)
      {
        AppMethodBeat.o(101495);
        paramPolygonOptions = localObject;
      }
      else
      {
        paramPolygonOptions = new ef(this.a.a(ej.a(paramPolygonOptions)));
        AppMethodBeat.o(101495);
      }
    }
  }

  public Polyline addPolyline(PolylineOptions paramPolylineOptions)
  {
    Object localObject = null;
    AppMethodBeat.i(101494);
    if (this.a == null)
    {
      AppMethodBeat.o(101494);
      paramPolylineOptions = localObject;
    }
    while (true)
    {
      return paramPolylineOptions;
      if (paramPolylineOptions == null)
      {
        AppMethodBeat.o(101494);
        paramPolylineOptions = localObject;
      }
      else
      {
        paramPolylineOptions = new ee(this.a.a(ej.a(paramPolylineOptions)));
        AppMethodBeat.o(101494);
      }
    }
  }

  public void animateCamera(CameraUpdate paramCameraUpdate)
  {
    AppMethodBeat.i(101507);
    if (this.a == null)
      AppMethodBeat.o(101507);
    while (true)
    {
      return;
      if (paramCameraUpdate != null)
        this.a.b(ej.a(paramCameraUpdate, this.a));
      AppMethodBeat.o(101507);
    }
  }

  public void animateCamera(CameraUpdate paramCameraUpdate, long paramLong, CancelableCallback paramCancelableCallback)
  {
    AppMethodBeat.i(101508);
    if (this.a == null)
      AppMethodBeat.o(101508);
    while (true)
    {
      return;
      if (paramCameraUpdate != null)
        this.a.a(ej.a(paramCameraUpdate, this.a), paramLong, new eh.11(this, paramCancelableCallback));
      AppMethodBeat.o(101508);
    }
  }

  public void animateTo(LatLng paramLatLng)
  {
    AppMethodBeat.i(101496);
    if (this.a == null)
      AppMethodBeat.o(101496);
    while (true)
    {
      return;
      if (paramLatLng != null)
        this.a.b(ae.a(ej.a(paramLatLng)));
      AppMethodBeat.o(101496);
    }
  }

  public void animateTo(LatLng paramLatLng, long paramLong, CancelableCallback paramCancelableCallback)
  {
    AppMethodBeat.i(101498);
    if (this.a == null)
      AppMethodBeat.o(101498);
    while (true)
    {
      return;
      this.a.a(ae.a(ej.a(paramLatLng)), paramLong, new eh.10(this, paramCancelableCallback));
      AppMethodBeat.o(101498);
    }
  }

  @Deprecated
  public void animateTo(LatLng paramLatLng, final Runnable paramRunnable)
  {
    AppMethodBeat.i(101497);
    if (this.a == null)
      AppMethodBeat.o(101497);
    while (true)
    {
      return;
      if (paramLatLng != null)
        this.a.a(ae.a(ej.a(paramLatLng)), new aj.a()
        {
          public void a()
          {
            AppMethodBeat.i(101456);
            if (paramRunnable != null)
              paramRunnable.run();
            AppMethodBeat.o(101456);
          }

          public void b()
          {
            AppMethodBeat.i(101457);
            if (paramRunnable != null)
              paramRunnable.run();
            AppMethodBeat.o(101457);
          }
        });
      AppMethodBeat.o(101497);
    }
  }

  public void clearAllOverlays()
  {
    AppMethodBeat.i(101499);
    if (this.a != null)
      this.a.h();
    AppMethodBeat.o(101499);
  }

  public boolean clearCache()
  {
    return false;
  }

  public void enableMultipleInfowindow(boolean paramBoolean)
  {
    AppMethodBeat.i(101535);
    if (this.a == null)
      AppMethodBeat.o(101535);
    while (true)
    {
      return;
      this.a.h(paramBoolean);
      AppMethodBeat.o(101535);
    }
  }

  public String getActivedIndoorBuilding(LatLng paramLatLng)
  {
    AppMethodBeat.i(101532);
    if (this.a == null)
    {
      paramLatLng = null;
      AppMethodBeat.o(101532);
    }
    while (true)
    {
      return paramLatLng;
      paramLatLng = this.a.a(ej.a(paramLatLng));
      AppMethodBeat.o(101532);
    }
  }

  public String[] getActivedIndoorFloorNames()
  {
    AppMethodBeat.i(101533);
    String[] arrayOfString;
    if (this.a == null)
    {
      arrayOfString = null;
      AppMethodBeat.o(101533);
    }
    while (true)
    {
      return arrayOfString;
      arrayOfString = this.a.v();
      AppMethodBeat.o(101533);
    }
  }

  public CameraPosition getCameraPosition()
  {
    AppMethodBeat.i(101539);
    CameraPosition localCameraPosition;
    if (this.a == null)
    {
      localCameraPosition = null;
      AppMethodBeat.o(101539);
    }
    while (true)
    {
      return localCameraPosition;
      localCameraPosition = ej.a(this.a.d());
      AppMethodBeat.o(101539);
    }
  }

  public String getDebugError()
  {
    AppMethodBeat.i(101540);
    String str;
    if (this.a == null)
    {
      str = null;
      AppMethodBeat.o(101540);
    }
    while (true)
    {
      return str;
      str = this.a.z();
      AppMethodBeat.o(101540);
    }
  }

  public int getIndoorFloorId()
  {
    AppMethodBeat.i(101534);
    int i;
    if (this.a == null)
    {
      i = 0;
      AppMethodBeat.o(101534);
    }
    while (true)
    {
      return i;
      i = this.a.u();
      AppMethodBeat.o(101534);
    }
  }

  public LatLng getMapCenter()
  {
    AppMethodBeat.i(101500);
    LatLng localLatLng;
    if (this.a == null)
    {
      localLatLng = null;
      AppMethodBeat.o(101500);
    }
    while (true)
    {
      return localLatLng;
      this.a.d();
      localLatLng = ej.a(this.a.d().a);
      AppMethodBeat.o(101500);
    }
  }

  public int getMaxZoomLevel()
  {
    AppMethodBeat.i(101502);
    int i;
    if (this.a == null)
    {
      i = 19;
      AppMethodBeat.o(101502);
    }
    while (true)
    {
      return i;
      i = (int)this.a.e();
      AppMethodBeat.o(101502);
    }
  }

  public int getMinZoomLevel()
  {
    AppMethodBeat.i(101503);
    int i;
    if (this.a == null)
    {
      i = 4;
      AppMethodBeat.o(101503);
    }
    while (true)
    {
      return i;
      i = (int)this.a.f();
      AppMethodBeat.o(101503);
    }
  }

  public void getScreenShot(TencentMap.OnScreenShotListener paramOnScreenShotListener)
  {
    AppMethodBeat.i(101542);
    if (this.a == null)
      AppMethodBeat.o(101542);
    while (true)
    {
      return;
      this.a.a(new eh.8(this, paramOnScreenShotListener));
      AppMethodBeat.o(101542);
    }
  }

  @Deprecated
  public void getScreenShot(TencentMap.OnScreenShotListener paramOnScreenShotListener, Rect paramRect)
  {
    AppMethodBeat.i(101543);
    if (this.a == null)
      AppMethodBeat.o(101543);
    while (true)
    {
      return;
      this.a.a(new eh.9(this, paramOnScreenShotListener));
      AppMethodBeat.o(101543);
    }
  }

  public String getVersion()
  {
    AppMethodBeat.i(101504);
    String str;
    if (this.a == null)
    {
      str = null;
      AppMethodBeat.o(101504);
    }
    while (true)
    {
      return str;
      str = this.a.t();
      AppMethodBeat.o(101504);
    }
  }

  public int getZoomLevel()
  {
    AppMethodBeat.i(101501);
    int i;
    if ((this.a == null) || (this.a.d() == null))
    {
      i = -1;
      AppMethodBeat.o(101501);
    }
    while (true)
    {
      return i;
      i = (int)this.a.d().b;
      AppMethodBeat.o(101501);
    }
  }

  public boolean isAppKeyAvailable()
  {
    return true;
  }

  public boolean isHandDrawMapEnable()
  {
    AppMethodBeat.i(101549);
    boolean bool;
    if (this.a == null)
    {
      bool = false;
      AppMethodBeat.o(101549);
    }
    while (true)
    {
      return bool;
      bool = this.a.w();
      AppMethodBeat.o(101549);
    }
  }

  public boolean isSatelliteEnabled()
  {
    return this.d;
  }

  public boolean isTrafficEnabled()
  {
    AppMethodBeat.i(101545);
    boolean bool;
    if (this.a == null)
    {
      bool = false;
      AppMethodBeat.o(101545);
    }
    while (true)
    {
      return bool;
      bool = this.a.i();
      AppMethodBeat.o(101545);
    }
  }

  public void moveCamera(CameraUpdate paramCameraUpdate)
  {
    AppMethodBeat.i(101506);
    if (this.a == null)
      AppMethodBeat.o(101506);
    while (true)
    {
      return;
      if (paramCameraUpdate != null)
        this.a.a(ej.a(paramCameraUpdate, this.a));
      AppMethodBeat.o(101506);
    }
  }

  public void removeTencentMapGestureListener(TencentMap.TencentMapGestureListener paramTencentMapGestureListener)
  {
    AppMethodBeat.i(101537);
    this.a.c(this.e);
    AppMethodBeat.o(101537);
  }

  public void scrollBy(float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(101509);
    if (this.a == null)
      AppMethodBeat.o(101509);
    while (true)
    {
      return;
      this.a.b(ae.a(paramFloat1, paramFloat2));
      AppMethodBeat.o(101509);
    }
  }

  public void scrollBy(float paramFloat1, float paramFloat2, long paramLong, CancelableCallback paramCancelableCallback)
  {
    AppMethodBeat.i(101510);
    if (this.a == null)
      AppMethodBeat.o(101510);
    while (true)
    {
      return;
      this.a.a(ae.a(paramFloat1, paramFloat2), new eh.12(this, paramCancelableCallback));
      AppMethodBeat.o(101510);
    }
  }

  public void set3DEnable(boolean paramBoolean)
  {
    AppMethodBeat.i(101546);
    if (this.a == null)
      AppMethodBeat.o(101546);
    while (true)
    {
      return;
      this.a.e(paramBoolean);
      AppMethodBeat.o(101546);
    }
  }

  public void setCenter(LatLng paramLatLng)
  {
    AppMethodBeat.i(101490);
    if (this.a == null)
      AppMethodBeat.o(101490);
    while (true)
    {
      return;
      if (paramLatLng != null)
        this.a.a(ae.a(new db(paramLatLng.getLatitude(), paramLatLng.getLongitude())));
      AppMethodBeat.o(101490);
    }
  }

  @Deprecated
  public void setErrorListener(TencentMap.OnErrorListener paramOnErrorListener)
  {
    if (this.a == null);
  }

  public void setForeignLanguage(Language paramLanguage)
  {
    AppMethodBeat.i(101538);
    if (this.a == null)
      AppMethodBeat.o(101538);
    while (true)
    {
      return;
      this.a.a(ej.a(paramLanguage));
      AppMethodBeat.o(101538);
    }
  }

  public void setHandDrawMapEnable(boolean paramBoolean)
  {
    AppMethodBeat.i(101548);
    if (this.a == null)
      AppMethodBeat.o(101548);
    while (true)
    {
      return;
      this.a.g(paramBoolean);
      AppMethodBeat.o(101548);
    }
  }

  public void setIndoorEnabled(boolean paramBoolean)
  {
    AppMethodBeat.i(101529);
    if (this.a == null)
      AppMethodBeat.o(101529);
    while (true)
    {
      return;
      this.a.f(paramBoolean);
      AppMethodBeat.o(101529);
    }
  }

  public void setIndoorFloor(int paramInt)
  {
    AppMethodBeat.i(101530);
    if (this.a == null)
      AppMethodBeat.o(101530);
    while (true)
    {
      return;
      this.a.c(paramInt);
      AppMethodBeat.o(101530);
    }
  }

  public void setIndoorFloor(String paramString1, String paramString2)
  {
    AppMethodBeat.i(101531);
    if (this.a == null)
      AppMethodBeat.o(101531);
    while (true)
    {
      return;
      this.a.a(paramString1, paramString2);
      AppMethodBeat.o(101531);
    }
  }

  public void setInfoWindowAdapter(TencentMap.InfoWindowAdapter paramInfoWindowAdapter)
  {
    AppMethodBeat.i(101517);
    if (this.a == null)
      AppMethodBeat.o(101517);
    while (true)
    {
      return;
      this.a.a(new eh.13(this, paramInfoWindowAdapter));
      AppMethodBeat.o(101517);
    }
  }

  public void setMapAnchor(float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(101547);
    if (this.a == null)
      AppMethodBeat.o(101547);
    while (true)
    {
      return;
      this.a.a(paramFloat1, paramFloat2, false);
      this.a.l().i(true);
      AppMethodBeat.o(101547);
    }
  }

  public void setMapStyle(int paramInt)
  {
    AppMethodBeat.i(101527);
    if (this.a == null)
      AppMethodBeat.o(101527);
    while (true)
    {
      return;
      this.a.a(paramInt);
      AppMethodBeat.o(101527);
    }
  }

  public void setOnIndoorStateChangeListener(TencentMap.OnIndoorStateChangeListener paramOnIndoorStateChangeListener)
  {
    AppMethodBeat.i(101528);
    if (this.a == null)
      AppMethodBeat.o(101528);
    while (true)
    {
      return;
      this.a.a(new eh.6(this, paramOnIndoorStateChangeListener));
      AppMethodBeat.o(101528);
    }
  }

  public void setOnInfoWindowClickListener(TencentMap.OnInfoWindowClickListener paramOnInfoWindowClickListener)
  {
    AppMethodBeat.i(101521);
    if (this.a == null)
      AppMethodBeat.o(101521);
    while (true)
    {
      return;
      this.a.a(new eh.16(this, paramOnInfoWindowClickListener));
      AppMethodBeat.o(101521);
    }
  }

  public void setOnMapCameraChangeListener(final TencentMap.OnMapCameraChangeListener paramOnMapCameraChangeListener)
  {
    AppMethodBeat.i(101523);
    if (this.a == null)
      AppMethodBeat.o(101523);
    while (true)
    {
      return;
      this.a.a(new aj.c()
      {
        public void onCameraChange(cp paramAnonymouscp)
        {
          AppMethodBeat.i(101458);
          if (paramOnMapCameraChangeListener != null)
            paramOnMapCameraChangeListener.onCameraChange(ej.a(paramAnonymouscp));
          AppMethodBeat.o(101458);
        }

        public void onCameraChangeFinished(cp paramAnonymouscp)
        {
          AppMethodBeat.i(101459);
          if (paramOnMapCameraChangeListener != null)
            paramOnMapCameraChangeListener.onCameraChangeFinish(ej.a(paramAnonymouscp));
          AppMethodBeat.o(101459);
        }
      });
      AppMethodBeat.o(101523);
    }
  }

  public void setOnMapClickListener(final TencentMap.OnMapClickListener paramOnMapClickListener)
  {
    AppMethodBeat.i(101524);
    if (this.a == null)
      AppMethodBeat.o(101524);
    while (true)
    {
      return;
      this.a.a(new aj.h()
      {
        public void a(db paramAnonymousdb)
        {
          AppMethodBeat.i(101460);
          if (paramOnMapClickListener != null)
            paramOnMapClickListener.onMapClick(ej.a(paramAnonymousdb));
          AppMethodBeat.o(101460);
        }
      });
      AppMethodBeat.o(101524);
    }
  }

  public void setOnMapLoadedListener(TencentMap.OnMapLoadedListener paramOnMapLoadedListener)
  {
    AppMethodBeat.i(101520);
    if (this.a == null)
      AppMethodBeat.o(101520);
    while (true)
    {
      return;
      this.a.a(new eh.15(this, paramOnMapLoadedListener));
      AppMethodBeat.o(101520);
    }
  }

  public void setOnMapLongClickListener(TencentMap.OnMapLongClickListener paramOnMapLongClickListener)
  {
    AppMethodBeat.i(101525);
    if (this.a == null)
      AppMethodBeat.o(101525);
    while (true)
    {
      return;
      this.a.a(new eh.4(this, paramOnMapLongClickListener));
      AppMethodBeat.o(101525);
    }
  }

  public void setOnMapPoiClickListener(TencentMap.OnMapPoiClickListener paramOnMapPoiClickListener)
  {
    AppMethodBeat.i(101526);
    if (this.a == null)
      AppMethodBeat.o(101526);
    while (true)
    {
      return;
      this.a.a(new eh.5(this, paramOnMapPoiClickListener));
      AppMethodBeat.o(101526);
    }
  }

  public void setOnMarkerClickListener(TencentMap.OnMarkerClickListener paramOnMarkerClickListener)
  {
    AppMethodBeat.i(101522);
    if (this.a == null)
      AppMethodBeat.o(101522);
    while (true)
    {
      return;
      this.a.a(new eh.17(this, paramOnMarkerClickListener));
      AppMethodBeat.o(101522);
    }
  }

  public void setOnMarkerDraggedListener(TencentMap.OnMarkerDraggedListener paramOnMarkerDraggedListener)
  {
    AppMethodBeat.i(101519);
    if (this.a == null)
      AppMethodBeat.o(101519);
    while (true)
    {
      return;
      this.a.a(new eh.14(this, paramOnMarkerDraggedListener));
      AppMethodBeat.o(101519);
    }
  }

  public void setSatelliteEnabled(boolean paramBoolean)
  {
    AppMethodBeat.i(101505);
    if (this.a == null)
      AppMethodBeat.o(101505);
    while (true)
    {
      return;
      this.d = paramBoolean;
      this.a.b(paramBoolean);
      AppMethodBeat.o(101505);
    }
  }

  public void setTencentMapGestureListener(TencentMap.TencentMapGestureListener paramTencentMapGestureListener)
  {
    AppMethodBeat.i(101536);
    if ((this.a == null) || (paramTencentMapGestureListener == null))
      AppMethodBeat.o(101536);
    while (true)
    {
      return;
      if (this.e != null)
        this.a.c(this.e);
      this.e = new eh.7(this, paramTencentMapGestureListener);
      this.a.a(this.e);
      AppMethodBeat.o(101536);
    }
  }

  public void setTrafficEnabled(boolean paramBoolean)
  {
    AppMethodBeat.i(101544);
    if (this.a == null)
      AppMethodBeat.o(101544);
    while (true)
    {
      return;
      this.a.a(paramBoolean);
      AppMethodBeat.o(101544);
    }
  }

  public void setZoom(int paramInt)
  {
    AppMethodBeat.i(101491);
    if (this.a == null)
      AppMethodBeat.o(101491);
    while (true)
    {
      return;
      this.a.a(ae.a(paramInt));
      AppMethodBeat.o(101491);
    }
  }

  public void stopAnimation()
  {
    AppMethodBeat.i(101541);
    if (this.a == null)
      AppMethodBeat.o(101541);
    while (true)
    {
      return;
      this.a.g();
      AppMethodBeat.o(101541);
    }
  }

  public void zoomIn()
  {
    AppMethodBeat.i(101511);
    if (this.a == null)
      AppMethodBeat.o(101511);
    while (true)
    {
      return;
      this.a.b(ae.a());
      AppMethodBeat.o(101511);
    }
  }

  public void zoomInFixing(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(101512);
    if (this.a == null)
      AppMethodBeat.o(101512);
    while (true)
    {
      return;
      this.a.a(ae.a(1.0F, new Point(paramInt1, paramInt2)));
      AppMethodBeat.o(101512);
    }
  }

  public void zoomOut()
  {
    AppMethodBeat.i(101513);
    if (this.a == null)
      AppMethodBeat.o(101513);
    while (true)
    {
      return;
      this.a.b(ae.b());
      AppMethodBeat.o(101513);
    }
  }

  public void zoomOutFixing(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(101514);
    if (this.a == null)
      AppMethodBeat.o(101514);
    while (true)
    {
      return;
      this.a.a(ae.a(-1.0F, new Point(paramInt1, paramInt2)));
      AppMethodBeat.o(101514);
    }
  }

  public void zoomToSpan(double paramDouble1, double paramDouble2)
  {
    AppMethodBeat.i(101516);
    zoomToSpan(new LatLng(getMapCenter().getLatitude() - paramDouble1 / 2.0D, getMapCenter().getLongitude() + paramDouble2 / 2.0D), new LatLng(getMapCenter().getLatitude() + paramDouble1 / 2.0D, getMapCenter().getLongitude() - paramDouble2 / 2.0D));
    AppMethodBeat.o(101516);
  }

  public void zoomToSpan(LatLng paramLatLng1, LatLng paramLatLng2)
  {
    AppMethodBeat.i(101515);
    if (this.a == null)
      AppMethodBeat.o(101515);
    while (true)
    {
      return;
      this.a.a(ae.a(new dc(ej.a(paramLatLng1), ej.a(paramLatLng2)), 0));
      AppMethodBeat.o(101515);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.a.eh
 * JD-Core Version:    0.6.2
 */