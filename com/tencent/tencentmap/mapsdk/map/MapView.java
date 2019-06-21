package com.tencent.tencentmap.mapsdk.map;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import com.tencent.mapsdk.raster.model.LatLng;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.tencentmap.mapsdk.a.j;
import com.tencent.tencentmap.mapsdk.a.y;
import com.tencent.tencentmap.mapsdk.dynamic.b;

public class MapView extends FrameLayout
  implements IMapView
{
  private b mMapProvider;
  private int mMapType;
  private Projection mProjection;
  private UiSettings mUiSettings;
  private IMapView mapView;

  public MapView(Context paramContext)
  {
    this(paramContext, null);
  }

  public MapView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(101294);
    this.mMapType = 1;
    init(null);
    AppMethodBeat.o(101294);
  }

  public MapView(Context paramContext, TencentMapOptions paramTencentMapOptions)
  {
    super(paramContext);
    AppMethodBeat.i(101295);
    this.mMapType = 1;
    init(paramTencentMapOptions);
    AppMethodBeat.o(101295);
  }

  private void init(TencentMapOptions paramTencentMapOptions)
  {
    AppMethodBeat.i(101296);
    Context localContext = getContext();
    this.mMapProvider = new b();
    y.a(localContext.getApplicationContext());
    j.a(localContext.getApplicationContext());
    this.mapView = this.mMapProvider.a(localContext.getApplicationContext(), paramTencentMapOptions);
    if (this.mapView != null)
    {
      paramTencentMapOptions = new ViewGroup.LayoutParams(-1, -1);
      addView(this.mapView.getMapView(), paramTencentMapOptions);
    }
    if ((localContext instanceof MapActivity))
      ((MapActivity)localContext).setMapView(this);
    AppMethodBeat.o(101296);
  }

  public void addView(View paramView, LayoutParams paramLayoutParams)
  {
    AppMethodBeat.i(101297);
    if ((this.mapView == null) || (paramLayoutParams == null))
      AppMethodBeat.o(101297);
    while (true)
    {
      return;
      this.mapView.addView(paramView, paramLayoutParams);
      AppMethodBeat.o(101297);
    }
  }

  public boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(101301);
    this.mapView.dispatchTouchEvent(paramMotionEvent);
    boolean bool = super.dispatchTouchEvent(paramMotionEvent);
    AppMethodBeat.o(101301);
    return bool;
  }

  public TencentMap getMap()
  {
    AppMethodBeat.i(101298);
    TencentMap localTencentMap;
    if (this.mapView == null)
    {
      localTencentMap = null;
      AppMethodBeat.o(101298);
    }
    while (true)
    {
      return localTencentMap;
      localTencentMap = this.mapView.getMap();
      AppMethodBeat.o(101298);
    }
  }

  @Deprecated
  public LatLng getMapCenter()
  {
    AppMethodBeat.i(101313);
    LatLng localLatLng;
    if ((this.mapView == null) || (this.mapView.getMap() == null))
    {
      localLatLng = null;
      AppMethodBeat.o(101313);
    }
    while (true)
    {
      return localLatLng;
      localLatLng = this.mapView.getMap().getMapCenter();
      AppMethodBeat.o(101313);
    }
  }

  public MapController getMapController()
  {
    AppMethodBeat.i(101312);
    MapController localMapController;
    if (this.mapView == null)
    {
      localMapController = null;
      AppMethodBeat.o(101312);
    }
    while (true)
    {
      return localMapController;
      localMapController = this.mapView.getMapController();
      AppMethodBeat.o(101312);
    }
  }

  public View getMapView()
  {
    return this;
  }

  public Projection getProjection()
  {
    AppMethodBeat.i(101311);
    Projection localProjection;
    if (this.mapView == null)
    {
      localProjection = null;
      AppMethodBeat.o(101311);
    }
    while (true)
    {
      return localProjection;
      localProjection = this.mapView.getProjection();
      AppMethodBeat.o(101311);
    }
  }

  public UiSettings getUiSettings()
  {
    AppMethodBeat.i(101314);
    UiSettings localUiSettings;
    if (this.mapView == null)
    {
      localUiSettings = null;
      AppMethodBeat.o(101314);
    }
    while (true)
    {
      return localUiSettings;
      localUiSettings = this.mapView.getUiSettings();
      AppMethodBeat.o(101314);
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(101299);
    if (this.mapView == null)
      AppMethodBeat.o(101299);
    while (true)
    {
      return;
      this.mapView.onCreate(paramBundle);
      AppMethodBeat.o(101299);
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(101308);
    if (this.mapView == null)
      AppMethodBeat.o(101308);
    while (true)
    {
      return;
      this.mapView.onDestroy();
      AppMethodBeat.o(101308);
    }
  }

  public void onDestroyView()
  {
    AppMethodBeat.i(101307);
    if (this.mapView == null)
      AppMethodBeat.o(101307);
    while (true)
    {
      return;
      this.mapView.onDestroyView();
      AppMethodBeat.o(101307);
    }
  }

  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    return true;
  }

  public void onLowMemory()
  {
    AppMethodBeat.i(101310);
    if (this.mapView == null)
      AppMethodBeat.o(101310);
    while (true)
    {
      return;
      this.mapView.onLowMemory();
      AppMethodBeat.o(101310);
    }
  }

  public void onPause()
  {
    AppMethodBeat.i(101304);
    if (this.mapView == null)
      AppMethodBeat.o(101304);
    while (true)
    {
      return;
      this.mapView.onPause();
      AppMethodBeat.o(101304);
    }
  }

  public void onRestart()
  {
    AppMethodBeat.i(101306);
    if (this.mapView == null)
      AppMethodBeat.o(101306);
    while (true)
    {
      return;
      this.mapView.onRestart();
      AppMethodBeat.o(101306);
    }
  }

  public void onResume()
  {
    AppMethodBeat.i(101303);
    if (this.mapView == null)
      AppMethodBeat.o(101303);
    while (true)
    {
      return;
      this.mapView.onResume();
      AppMethodBeat.o(101303);
    }
  }

  public void onSaveInstanceState(Bundle paramBundle)
  {
    AppMethodBeat.i(101309);
    if (this.mapView == null)
      AppMethodBeat.o(101309);
    while (true)
    {
      return;
      this.mapView.onSaveInstanceState(paramBundle);
      AppMethodBeat.o(101309);
    }
  }

  public void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(101316);
    if (this.mapView != null)
      this.mapView.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    AppMethodBeat.o(101316);
  }

  public void onStart()
  {
    AppMethodBeat.i(101302);
    if (this.mapView == null)
      AppMethodBeat.o(101302);
    while (true)
    {
      return;
      this.mapView.onStart();
      AppMethodBeat.o(101302);
    }
  }

  public void onStop()
  {
    AppMethodBeat.i(101305);
    if (this.mapView == null)
      AppMethodBeat.o(101305);
    while (true)
    {
      return;
      this.mapView.onStop();
      AppMethodBeat.o(101305);
    }
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(101300);
    boolean bool;
    if (this.mapView != null)
    {
      bool = this.mapView.onTouchEvent(paramMotionEvent);
      AppMethodBeat.o(101300);
    }
    while (true)
    {
      return bool;
      bool = super.onTouchEvent(paramMotionEvent);
      AppMethodBeat.o(101300);
    }
  }

  public void updateViewLayout(View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    AppMethodBeat.i(101315);
    if (this.mapView == null)
      AppMethodBeat.o(101315);
    while (true)
    {
      return;
      this.mapView.updateViewLayout(paramView, paramLayoutParams);
      AppMethodBeat.o(101315);
    }
  }

  public static class LayoutParams extends ViewGroup.LayoutParams
  {
    public static final int BOTTOM_CENTER = 81;
    public static final int CENTER = 17;
    public int alignment = 17;
    public int height = 0;
    public LatLng point = null;
    public int width = 0;

    public LayoutParams(int paramInt1, int paramInt2, LatLng paramLatLng, int paramInt3)
    {
      super(paramInt2);
      this.width = paramInt1;
      this.height = paramInt2;
      this.point = paramLatLng;
      this.alignment = paramInt3;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.map.MapView
 * JD-Core Version:    0.6.2
 */