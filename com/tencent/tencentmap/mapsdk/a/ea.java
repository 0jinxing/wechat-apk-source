package com.tencent.tencentmap.mapsdk.a;

import android.content.Context;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.tencentmap.mapsdk.map.IMapView;
import com.tencent.tencentmap.mapsdk.map.MapController;
import com.tencent.tencentmap.mapsdk.map.MapView.LayoutParams;
import com.tencent.tencentmap.mapsdk.map.Projection;
import com.tencent.tencentmap.mapsdk.map.TencentMap;
import com.tencent.tencentmap.mapsdk.map.TencentMapOptions;
import com.tencent.tencentmap.mapsdk.map.UiSettings;

public class ea
  implements IMapView
{
  private ag a;
  private TencentMap b;

  public ea(Context paramContext, TencentMapOptions paramTencentMapOptions)
  {
    AppMethodBeat.i(101332);
    dy.a("VecotrMapRenderLayer construct function start");
    ak localak = null;
    if (paramTencentMapOptions != null)
    {
      localak = new ak();
      if (paramTencentMapOptions.getExtSurface() != null)
      {
        localak.a(paramTencentMapOptions.getExtSurface());
        localak.a(paramTencentMapOptions.getExtSurfaceWidth(), paramTencentMapOptions.getExtSurfaceHeight());
      }
      localak.a(paramTencentMapOptions.isHandDrawMapEnable());
      localak.a(paramTencentMapOptions.getSubKey(), paramTencentMapOptions.getSubId());
      localak.b(paramTencentMapOptions.isMutipleInfowindowEnabled());
    }
    this.a = new ag(paramContext, localak);
    this.b = new eh(this.a.getMap());
    this.a.getMap().l().a(false);
    AppMethodBeat.o(101332);
  }

  public void addView(View paramView, MapView.LayoutParams paramLayoutParams)
  {
    AppMethodBeat.i(101335);
    if (this.a.getMap() != null)
      this.a.getMap().a(new df().a(cn.a(paramView)).a(ej.a(paramLayoutParams.point)));
    AppMethodBeat.o(101335);
  }

  public boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    return false;
  }

  public TencentMap getMap()
  {
    return this.b;
  }

  public MapController getMapController()
  {
    return this.b;
  }

  public View getMapView()
  {
    return this.a;
  }

  public Projection getProjection()
  {
    AppMethodBeat.i(101334);
    eg localeg;
    if (this.a.getMap() != null)
    {
      localeg = new eg(this.a.getMap());
      AppMethodBeat.o(101334);
    }
    while (true)
    {
      return localeg;
      localeg = null;
      AppMethodBeat.o(101334);
    }
  }

  public UiSettings getUiSettings()
  {
    AppMethodBeat.i(101333);
    ek localek;
    if (this.a.getMap() != null)
    {
      localek = new ek(this.a.getMap().l());
      AppMethodBeat.o(101333);
    }
    while (true)
    {
      return localek;
      localek = null;
      AppMethodBeat.o(101333);
    }
  }

  public void onCreate(Bundle paramBundle)
  {
  }

  public void onDestroy()
  {
    AppMethodBeat.i(101342);
    this.a.c();
    AppMethodBeat.o(101342);
  }

  public void onDestroyView()
  {
  }

  public void onLowMemory()
  {
  }

  public void onPause()
  {
    AppMethodBeat.i(101339);
    this.a.e();
    AppMethodBeat.o(101339);
  }

  public void onRestart()
  {
    AppMethodBeat.i(101341);
    this.a.f();
    AppMethodBeat.o(101341);
  }

  public void onResume()
  {
    AppMethodBeat.i(101338);
    this.a.d();
    AppMethodBeat.o(101338);
  }

  public void onSaveInstanceState(Bundle paramBundle)
  {
  }

  public void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(101344);
    if (this.a != null)
      this.a.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    AppMethodBeat.o(101344);
  }

  public void onStart()
  {
    AppMethodBeat.i(101337);
    this.a.a();
    AppMethodBeat.o(101337);
  }

  public void onStop()
  {
    AppMethodBeat.i(101340);
    this.a.b();
    AppMethodBeat.o(101340);
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(101343);
    boolean bool = this.a.onTouchEvent(paramMotionEvent);
    AppMethodBeat.o(101343);
    return bool;
  }

  public void updateViewLayout(View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    AppMethodBeat.i(101336);
    if (this.a != null)
      this.a.updateViewLayout(paramView, paramLayoutParams);
    AppMethodBeat.o(101336);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.a.ea
 * JD-Core Version:    0.6.2
 */