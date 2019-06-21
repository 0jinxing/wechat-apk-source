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

public class ec
  implements IMapView
{
  private ah a;
  private TencentMap b;

  public ec(Context paramContext, TencentMapOptions paramTencentMapOptions)
  {
    AppMethodBeat.i(101364);
    dy.a("vector MapView construct function start");
    ak localak = null;
    if (paramTencentMapOptions != null)
    {
      localak = new ak();
      if (paramTencentMapOptions.getExtSurface() != null)
        localak.a(paramTencentMapOptions.getExtSurface());
      localak.a(paramTencentMapOptions.isHandDrawMapEnable());
      localak.a(paramTencentMapOptions.getSubKey(), paramTencentMapOptions.getSubId());
      localak.b(paramTencentMapOptions.isMutipleInfowindowEnabled());
    }
    this.a = new ah(paramContext, localak);
    this.b = new eh(this.a.getMap());
    this.a.getMap().l().a(false);
    AppMethodBeat.o(101364);
  }

  public void addView(View paramView, MapView.LayoutParams paramLayoutParams)
  {
    AppMethodBeat.i(101367);
    if (this.a.getMap() != null)
      this.a.getMap().a(new df().a(cn.a(paramView)).a(ej.a(paramLayoutParams.point)));
    AppMethodBeat.o(101367);
  }

  public boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    boolean bool = false;
    AppMethodBeat.i(101376);
    if (this.a == null)
      AppMethodBeat.o(101376);
    while (true)
    {
      return bool;
      if ((this.a.dispatchTouchEvent(paramMotionEvent)) || (this.a.onTouchEvent(paramMotionEvent)))
      {
        bool = true;
        AppMethodBeat.o(101376);
      }
      else
      {
        AppMethodBeat.o(101376);
      }
    }
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
    AppMethodBeat.i(101366);
    eg localeg;
    if (this.a.getMap() != null)
    {
      localeg = new eg(this.a.getMap());
      AppMethodBeat.o(101366);
    }
    while (true)
    {
      return localeg;
      localeg = null;
      AppMethodBeat.o(101366);
    }
  }

  public UiSettings getUiSettings()
  {
    AppMethodBeat.i(101365);
    ek localek;
    if (this.a.getMap() != null)
    {
      localek = new ek(this.a.getMap().l());
      AppMethodBeat.o(101365);
    }
    while (true)
    {
      return localek;
      localek = null;
      AppMethodBeat.o(101365);
    }
  }

  public void onCreate(Bundle paramBundle)
  {
  }

  public void onDestroy()
  {
    AppMethodBeat.i(101374);
    this.a.c();
    AppMethodBeat.o(101374);
  }

  public void onDestroyView()
  {
  }

  public void onLowMemory()
  {
  }

  public void onPause()
  {
    AppMethodBeat.i(101371);
    this.a.e();
    AppMethodBeat.o(101371);
  }

  public void onRestart()
  {
    AppMethodBeat.i(101373);
    this.a.f();
    AppMethodBeat.o(101373);
  }

  public void onResume()
  {
    AppMethodBeat.i(101370);
    this.a.d();
    AppMethodBeat.o(101370);
  }

  public void onSaveInstanceState(Bundle paramBundle)
  {
  }

  public void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(101377);
    if (this.a != null)
      this.a.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    AppMethodBeat.o(101377);
  }

  public void onStart()
  {
    AppMethodBeat.i(101369);
    this.a.a();
    AppMethodBeat.o(101369);
  }

  public void onStop()
  {
    AppMethodBeat.i(101372);
    this.a.b();
    AppMethodBeat.o(101372);
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(101375);
    boolean bool;
    if (paramMotionEvent.getAction() == 0)
    {
      bool = true;
      AppMethodBeat.o(101375);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(101375);
    }
  }

  public void updateViewLayout(View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    AppMethodBeat.i(101368);
    if (this.a != null)
      this.a.updateViewLayout(paramView, paramLayoutParams);
    AppMethodBeat.o(101368);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.a.ec
 * JD-Core Version:    0.6.2
 */