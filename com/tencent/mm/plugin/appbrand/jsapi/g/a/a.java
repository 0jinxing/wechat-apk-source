package com.tencent.mm.plugin.appbrand.jsapi.g.a;

import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import com.tencent.luggage.a.e;
import com.tencent.mapsdk.raster.model.BitmapDescriptor;
import com.tencent.mapsdk.raster.model.CameraPosition;
import com.tencent.mapsdk.raster.model.CameraPosition.Builder;
import com.tencent.mapsdk.raster.model.Circle;
import com.tencent.mapsdk.raster.model.CircleOptions;
import com.tencent.mapsdk.raster.model.IndoorBuilding;
import com.tencent.mapsdk.raster.model.IndoorInfo;
import com.tencent.mapsdk.raster.model.IndoorLevel;
import com.tencent.mapsdk.raster.model.LatLng;
import com.tencent.mapsdk.raster.model.LatLngBounds;
import com.tencent.mapsdk.raster.model.LatLngBounds.Builder;
import com.tencent.mapsdk.raster.model.Marker;
import com.tencent.mapsdk.raster.model.MarkerOptions;
import com.tencent.mapsdk.raster.model.OverlayLevel;
import com.tencent.mapsdk.raster.model.Polygon;
import com.tencent.mapsdk.raster.model.PolygonOptions;
import com.tencent.mapsdk.raster.model.Polyline;
import com.tencent.mapsdk.raster.model.PolylineOptions;
import com.tencent.mapsdk.raster.model.VisibleRegion;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.r.m;
import com.tencent.mm.plugin.appbrand.widget.e.c;
import com.tencent.mm.plugin.location_soso.api.SoSoMapView;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.tencentmap.mapsdk.map.CameraUpdateFactory;
import com.tencent.tencentmap.mapsdk.map.Projection;
import com.tencent.tencentmap.mapsdk.map.TencentMap;
import com.tencent.tencentmap.mapsdk.map.TencentMap.OnIndoorStateChangeListener;
import com.tencent.tencentmap.mapsdk.map.TencentMapOptions;
import com.tencent.tencentmap.mapsdk.map.UiSettings;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

public class a
  implements b
{
  ImageView cAw;
  Context context;
  private String hMR;
  FrameLayout hMS;
  protected final SoSoMapView hMT;
  b.k hMU;
  b.n hMV;
  private String hMW;
  private String hMX;
  private int hMY;
  CameraPosition hMZ;
  SurfaceView hNa;
  private Runnable hNb;
  b.l hNc;
  b.u hNd;
  boolean hNe;
  private Runnable hNf;
  b.t hNg;
  b.e hNh;
  public ArrayList<Circle> hNi;
  public ArrayList<b> hNj;
  private Map<String, Polyline> hNk;
  private a.a hNl;
  Map<String, d> hNm;
  public ArrayList<c> hNn;
  public ArrayList<Polygon> hNo;
  boolean hNp;
  d hNq;
  private com.tencent.mm.plugin.appbrand.s.b.a.b hNr;
  private final int hNs;
  AtomicBoolean hNt;
  private AtomicBoolean hNu;
  boolean isBackground;
  private long lastCheckTime;
  private int mMapType;

  public a(Context paramContext, String paramString, Map<String, Object> paramMap)
  {
    AppMethodBeat.i(51177);
    this.hNb = new a.22(this);
    this.hNe = false;
    this.hNi = new ArrayList();
    this.hNj = new ArrayList();
    this.hNk = new ConcurrentHashMap();
    this.hNl = new a.a(this);
    this.hNm = new ConcurrentHashMap();
    this.hNn = new ArrayList();
    this.hNo = new ArrayList();
    this.hNr = new a.15(this);
    this.lastCheckTime = 0L;
    this.hNs = 500;
    this.hNt = new AtomicBoolean(false);
    this.hNu = new AtomicBoolean(false);
    this.context = paramContext;
    this.hMR = paramString;
    this.hMS = new FrameLayout(paramContext);
    paramString = new FrameLayout.LayoutParams(-1, -1);
    this.hMS.setBackgroundColor(0);
    this.hMS.setLayoutParams(paramString);
    this.hMT = new SoSoMapView(paramContext, A(paramMap));
    this.hMS.addView(this.hMT, new FrameLayout.LayoutParams(-1, -1));
    this.cAw = new ImageView(paramContext);
    this.cAw.setScaleType(ImageView.ScaleType.FIT_XY);
    this.hMS.addView(this.cAw, new ViewGroup.LayoutParams(-1, -1));
    ab.i("MicroMsg.DefaultTencentMapView", "map:%s, init", new Object[] { this });
    this.hMT.getMap().setInfoWindowAdapter(this.hNl);
    this.hMT.getMap().setMapAnchor(0.5F, 0.5F);
    this.hMT.getMap().enableMultipleInfowindow(true);
    this.hMT.getMap().setMapStyle(this.hMY);
    this.hMT.getMap().setOnInfoWindowClickListener(new a.1(this));
    this.hMT.getMap().setOnMarkerClickListener(new a.12(this));
    this.hMT.getMap().setOnMapClickListener(new a.17(this));
    this.hMT.getMap().setOnMapLoadedListener(new a.18(this));
    this.hMT.getMap().setOnMapPoiClickListener(new a.19(this));
    this.hMT.getMap().setOnIndoorStateChangeListener(new TencentMap.OnIndoorStateChangeListener()
    {
      public final boolean onIndoorBuildingDeactivated()
      {
        AppMethodBeat.i(51171);
        ab.v("MicroMsg.DefaultTencentMapView", "[onIndoorBuildingDeactivated]");
        if (a.this.hNg != null)
        {
          b.e locale = a.aDN();
          a.this.hNh = locale;
          a.this.hNg.a(locale);
        }
        AppMethodBeat.o(51171);
        return true;
      }

      public final boolean onIndoorBuildingFocused()
      {
        AppMethodBeat.i(51169);
        ab.v("MicroMsg.DefaultTencentMapView", "[onIndoorBuildingFocused]");
        AppMethodBeat.o(51169);
        return true;
      }

      public final boolean onIndoorLevelActivated(IndoorBuilding paramAnonymousIndoorBuilding)
      {
        AppMethodBeat.i(51170);
        ab.v("MicroMsg.DefaultTencentMapView", "[onIndoorLevelActivated]indoorBuilding:%s", new Object[] { paramAnonymousIndoorBuilding });
        if (a.this.hNg != null)
        {
          b.e locale = new b.e();
          locale.buildingId = paramAnonymousIndoorBuilding.getBuidlingId();
          locale.buildingName = paramAnonymousIndoorBuilding.getBuildingName();
          locale.hNP = new LinkedList();
          Iterator localIterator = paramAnonymousIndoorBuilding.getLevels().iterator();
          while (localIterator.hasNext())
          {
            IndoorLevel localIndoorLevel = (IndoorLevel)localIterator.next();
            b.f localf = new b.f();
            localf.floorName = localIndoorLevel.getName();
            locale.hNP.add(localf);
          }
          locale.hNQ = paramAnonymousIndoorBuilding.getActiveLevelIndex();
          a.this.hNh = locale;
          a.this.hNg.a(locale);
        }
        AppMethodBeat.o(51170);
        return true;
      }
    });
    ab.i("MicroMsg.DefaultTencentMapView", "map:%s onCreate", new Object[] { this });
    this.hMT.onCreate(null);
    onResume();
    AppMethodBeat.o(51177);
  }

  static void a(float paramFloat1, float paramFloat2, Bitmap paramBitmap, ImageView paramImageView)
  {
    AppMethodBeat.i(51222);
    float f;
    if (paramFloat1 != 0.0F)
    {
      f = paramFloat1;
      paramFloat1 = paramFloat2;
      if (paramFloat2 != 0.0F);
    }
    else
    {
      f = com.tencent.mm.plugin.appbrand.r.g.qb(paramBitmap.getWidth());
      paramFloat1 = com.tencent.mm.plugin.appbrand.r.g.qb(paramBitmap.getHeight());
    }
    if ((f > 0.0F) && (paramFloat1 > 0.0F) && ((f != paramBitmap.getWidth()) || (paramFloat1 != paramBitmap.getHeight())))
    {
      paramFloat2 = f / paramBitmap.getWidth();
      paramFloat1 /= paramBitmap.getHeight();
      Matrix localMatrix = new Matrix();
      localMatrix.postScale(paramFloat2, paramFloat1);
      paramImageView.setImageBitmap(Bitmap.createBitmap(paramBitmap, 0, 0, paramBitmap.getWidth(), paramBitmap.getHeight(), localMatrix, true));
      AppMethodBeat.o(51222);
    }
    while (true)
    {
      return;
      paramImageView.setImageBitmap(paramBitmap);
      paramImageView.setScaleType(ImageView.ScaleType.CENTER);
      AppMethodBeat.o(51222);
    }
  }

  private void a(String paramString, d paramd)
  {
    AppMethodBeat.i(51223);
    ab.i("MicroMsg.DefaultTencentMapView", "map:%s addMarker markerId:%s", new Object[] { this, paramString });
    this.hNm.put(paramString, paramd);
    AppMethodBeat.o(51223);
  }

  static b.e aDN()
  {
    AppMethodBeat.i(51179);
    b.e locale = new b.e();
    locale.buildingId = "";
    locale.buildingName = "";
    locale.hNP = new LinkedList();
    locale.hNQ = -1;
    AppMethodBeat.o(51179);
    return locale;
  }

  private SurfaceView aDO()
  {
    AppMethodBeat.i(51182);
    SurfaceView localSurfaceView;
    if (this.hNa != null)
    {
      localSurfaceView = this.hNa;
      AppMethodBeat.o(51182);
    }
    while (true)
    {
      return localSurfaceView;
      this.hNa = h(this.hMT);
      localSurfaceView = this.hNa;
      AppMethodBeat.o(51182);
    }
  }

  private void aDP()
  {
    AppMethodBeat.i(51183);
    if (this.hNa == null)
      this.hNa = aDO();
    if (this.hNa != null)
    {
      al.af(this.hNb);
      this.hNa.setVisibility(0);
      AppMethodBeat.o(51183);
    }
    while (true)
    {
      return;
      ab.e("MicroMsg.DefaultTencentMapView", "showTencentMap err");
      AppMethodBeat.o(51183);
    }
  }

  private Bundle aEc()
  {
    AppMethodBeat.i(51230);
    Bundle localBundle = new Bundle();
    if (!"E6FBZ-OLSCQ-UIU5C-GWLJ7-ABUPT-V7FJX".equals(this.hMW))
    {
      String str = bo.nullAsNil(localBundle.getString("smallAppKey"));
      localBundle.putString("smallAppKey", str + this.hMW + "#" + this.hMX + ";");
    }
    AppMethodBeat.o(51230);
    return localBundle;
  }

  private static SurfaceView h(ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(51233);
    if ((paramViewGroup == null) || (paramViewGroup.getChildCount() == 0))
    {
      AppMethodBeat.o(51233);
      paramViewGroup = null;
    }
    while (true)
    {
      label25: return paramViewGroup;
      int i = paramViewGroup.getChildCount();
      for (int j = 0; ; j++)
      {
        if (j >= i)
          break label87;
        View localView = paramViewGroup.getChildAt(j);
        if ((localView instanceof SurfaceView))
        {
          paramViewGroup = (SurfaceView)localView;
          AppMethodBeat.o(51233);
          break label25;
        }
        if ((localView instanceof ViewGroup))
        {
          paramViewGroup = (ViewGroup)localView;
          break;
        }
      }
      label87: AppMethodBeat.o(51233);
      paramViewGroup = null;
    }
  }

  protected TencentMapOptions A(Map<String, Object> paramMap)
  {
    AppMethodBeat.i(51178);
    TencentMapOptions localTencentMapOptions = new TencentMapOptions();
    if (paramMap == null)
    {
      ab.w("MicroMsg.DefaultTencentMapView", "params is null, return");
      AppMethodBeat.o(51178);
    }
    while (true)
    {
      return localTencentMapOptions;
      String str = f.a(paramMap, "theme", "normal");
      boolean bool = str.equals("handDraw");
      localTencentMapOptions.enableHandDrawMap(bool);
      this.mMapType = f.a(paramMap, "mapType", 1);
      localTencentMapOptions.setMapType(this.mMapType);
      this.hMW = f.a(paramMap, "subKey", "");
      this.hMX = f.a(paramMap, "subId", "");
      if (bo.isNullOrNil(this.hMW))
      {
        this.hMW = "E6FBZ-OLSCQ-UIU5C-GWLJ7-ABUPT-V7FJX";
        this.hMX = "";
      }
      localTencentMapOptions.setSubInfo(this.hMW, this.hMX);
      this.hMY = f.a(paramMap, "styleId", 0);
      ab.d("MicroMsg.DefaultTencentMapView", "MapReport subId:%s, subKey:%s", new Object[] { this.hMX, this.hMW });
      ab.i("MicroMsg.DefaultTencentMapView", "[createTencentMapOptions]theme:%s isHandDraw:%b, mapType:%d, subId:%s, subKey:%s, styleId:%d", new Object[] { str, Boolean.valueOf(bool), Integer.valueOf(this.mMapType), this.hMX, this.hMW, Integer.valueOf(this.hMY) });
      AppMethodBeat.o(51178);
    }
  }

  public final boolean Bg(String paramString)
  {
    AppMethodBeat.i(51215);
    ab.i("MicroMsg.DefaultTencentMapView", "map:%s removeLine lineId:%s", new Object[] { this, paramString });
    Polyline localPolyline = (Polyline)this.hNk.get(paramString);
    if (localPolyline == null)
    {
      ab.w("MicroMsg.DefaultTencentMapView", "lineId:%s is null", new Object[] { paramString });
      AppMethodBeat.o(51215);
    }
    for (boolean bool = false; ; bool = true)
    {
      return bool;
      localPolyline.remove();
      this.hNk.remove(paramString);
      AppMethodBeat.o(51215);
    }
  }

  public final b.q Bh(String paramString)
  {
    AppMethodBeat.i(51218);
    paramString = (b.q)this.hNm.get(paramString);
    AppMethodBeat.o(51218);
    return paramString;
  }

  public final boolean Bi(String paramString)
  {
    AppMethodBeat.i(51220);
    ab.i("MicroMsg.DefaultTencentMapView", "map:%s removeMarker markerId:%s", new Object[] { this, paramString });
    d locald = (d)this.hNm.get(paramString);
    if (locald == null)
    {
      ab.w("MicroMsg.DefaultTencentMapView", "marker:%s is null", new Object[] { paramString });
      AppMethodBeat.o(51220);
    }
    for (boolean bool = false; ; bool = true)
    {
      return bool;
      locald.hNK.remove();
      if (locald.hNL != null)
      {
        if ((locald.hNL.getMarkerView() != null) && ((locald.hNL.getMarkerView() instanceof com.tencent.mm.plugin.appbrand.widget.e.d)))
          i.a((com.tencent.mm.plugin.appbrand.widget.e.d)locald.hNL.getMarkerView());
        locald.hNL.remove();
        this.hNm.remove(paramString + "#label");
      }
      this.hNm.remove(paramString);
      AppMethodBeat.o(51220);
    }
  }

  public final void I(float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(51206);
    this.hMT.getIController().setCenter(paramFloat1, paramFloat2);
    AppMethodBeat.o(51206);
  }

  public final void J(float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(51231);
    if ((!this.hNp) || (this.isBackground))
      AppMethodBeat.o(51231);
    while (true)
    {
      return;
      if (this.hNq != null)
        this.hNq.J(paramFloat1, paramFloat2);
      AppMethodBeat.o(51231);
    }
  }

  public final void a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5)
  {
    AppMethodBeat.i(51209);
    TencentMap localTencentMap = this.hMT.getMap();
    if (localTencentMap != null)
    {
      localTencentMap.moveCamera(CameraUpdateFactory.newCameraPosition(new CameraPosition(new LatLng(paramFloat1, paramFloat2), paramFloat3, paramFloat5, paramFloat4)));
      this.hNf = null;
    }
    AppMethodBeat.o(51209);
  }

  public final void a(b.b arg1)
  {
    AppMethodBeat.i(51211);
    Object localObject1 = new CircleOptions();
    ((CircleOptions)localObject1).center(new LatLng(???.latitude, ???.longitude));
    ((CircleOptions)localObject1).radius(???.radius);
    ((CircleOptions)localObject1).strokeColor(???.strokeColor);
    ((CircleOptions)localObject1).strokeWidth(???.strokeWidth);
    ((CircleOptions)localObject1).fillColor(???.fillColor);
    localObject1 = this.hMT.getMap().addCircle((CircleOptions)localObject1);
    synchronized (this.hNi)
    {
      this.hNi.add(localObject1);
      AppMethodBeat.o(51211);
      return;
    }
  }

  public final void a(b.j paramj, com.tencent.mm.plugin.appbrand.d.a parama)
  {
    AppMethodBeat.i(51216);
    Object localObject = new PolylineOptions();
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = paramj.hNV.iterator();
    while (localIterator.hasNext())
    {
      b.h localh = (b.h)localIterator.next();
      localArrayList.add(new LatLng(localh.latitude, localh.longitude));
    }
    ((PolylineOptions)localObject).addAll(localArrayList);
    if (paramj.style != -1)
      ((PolylineOptions)localObject).color(paramj.style);
    while (true)
    {
      ((PolylineOptions)localObject).width(paramj.width);
      ((PolylineOptions)localObject).setDottedLine(paramj.hNW);
      ((PolylineOptions)localObject).edgeColor(paramj.borderColor);
      ((PolylineOptions)localObject).edgeWidth(paramj.borderWidth);
      if (paramj.hNX)
      {
        parama = parama.bB(paramj.hNY);
        ((PolylineOptions)localObject).arrowTexture(new BitmapDescriptor(parama));
        if (parama == null)
          ((PolylineOptions)localObject).arrowTexture(new BitmapDescriptor(BitmapFactory.decodeResource(this.context.getResources(), 2130837745)));
      }
      ((PolylineOptions)localObject).zIndex(1.0F);
      if ((!bo.isNullOrNil(paramj.buildingId)) && (!bo.isNullOrNil(paramj.floorName)))
        ((PolylineOptions)localObject).indoorInfo(new IndoorInfo(paramj.buildingId, paramj.floorName));
      ((PolylineOptions)localObject).arrowGap(paramj.hNZ);
      if (this.hMT.getMap().isHandDrawMapEnable())
        ((PolylineOptions)localObject).level(OverlayLevel.OverlayLevelAboveBuildings);
      localObject = this.hMT.getMap().addPolyline((PolylineOptions)localObject);
      if (localObject != null)
        break;
      ab.e("MicroMsg.DefaultTencentMapView", "polyline is null, return");
      AppMethodBeat.o(51216);
      return;
      ((PolylineOptions)localObject).color(paramj.color);
    }
    if (bo.isNullOrNil(paramj.id));
    for (parama = paramj.hashCode(); ; parama = paramj.id)
    {
      this.hNk.put(bo.bc(parama, paramj.toString()), localObject);
      AppMethodBeat.o(51216);
      break;
    }
  }

  public final void a(b.k paramk)
  {
    this.hMU = paramk;
  }

  public final void a(b.l paraml)
  {
    this.hNc = paraml;
  }

  public final void a(b.n paramn)
  {
    this.hMV = paramn;
  }

  public final void a(b.s params)
  {
    AppMethodBeat.i(51186);
    this.hMT.getMap().setTencentMapGestureListener(new a.23(this));
    this.hMT.getMap().setOnMapCameraChangeListener(new a.2(this, params));
    AppMethodBeat.o(51186);
  }

  public final void a(b.t paramt)
  {
    this.hNg = paramt;
  }

  public final void a(b.u paramu)
  {
    this.hNd = paramu;
  }

  public final void a(String paramString, int paramInt, b.h paramh, boolean paramBoolean)
  {
    AppMethodBeat.i(51217);
    Polyline localPolyline = (Polyline)this.hNk.get(paramString);
    if (localPolyline == null)
    {
      ab.w("MicroMsg.DefaultTencentMapView", "lineId:%s is null", new Object[] { paramString });
      AppMethodBeat.o(51217);
    }
    while (true)
    {
      return;
      localPolyline.setEraseable(paramBoolean);
      localPolyline.eraseTo(paramInt, new LatLng(paramh.latitude, paramh.longitude));
      AppMethodBeat.o(51217);
    }
  }

  public final void a(String paramString, b.r paramr, com.tencent.mm.plugin.appbrand.d.a parama)
  {
    Object localObject1 = null;
    AppMethodBeat.i(51221);
    ab.i("MicroMsg.DefaultTencentMapView", "map:%s addMarker markerId:%s", new Object[] { this, paramString });
    MarkerOptions localMarkerOptions = new MarkerOptions();
    localMarkerOptions.position(new LatLng(paramr.latitude, paramr.longitude));
    if (!bo.isNullOrNil(paramr.title))
      localMarkerOptions.title(paramr.title);
    if (!bo.isNullOrNil(paramr.hOd))
      localMarkerOptions.contentDescription(paramr.hOd);
    localMarkerOptions.rotation(paramr.rotate);
    localMarkerOptions.alpha(paramr.alpha);
    Object localObject2 = (FrameLayout)((LayoutInflater)this.context.getSystemService("layout_inflater")).inflate(2130969266, null);
    Object localObject3 = (ImageView)((FrameLayout)localObject2).findViewById(2131821236);
    final float f1 = paramr.hOb;
    final float f2 = paramr.hOc;
    if (parama != null)
      localObject1 = parama.a(paramr.hNN, null, new com.tencent.mm.plugin.appbrand.d.a.c()
      {
        public final void E(Bitmap paramAnonymousBitmap)
        {
          AppMethodBeat.i(138418);
          if (paramAnonymousBitmap != null)
            a.a(f1, f2, paramAnonymousBitmap, this.hND);
          AppMethodBeat.o(138418);
        }
      });
    if (localObject1 != null)
      a(f1, f2, (Bitmap)localObject1, (ImageView)localObject3);
    while (true)
    {
      localMarkerOptions.markerView((View)localObject2);
      localMarkerOptions.anchor(paramr.bDv, paramr.bDw);
      localMarkerOptions.tag(paramString);
      localMarkerOptions.infoWindowHideAnimation(new Animation()
      {
      });
      localMarkerOptions.infoWindowShowAnimation(new a.10(this));
      localMarkerOptions.visible(true);
      localMarkerOptions.zIndex(paramr.zIndex + 2);
      if ((!bo.isNullOrNil(paramr.buildingId)) && (!bo.isNullOrNil(paramr.floorName)))
        localMarkerOptions.indoorInfo(new IndoorInfo(paramr.buildingId, paramr.floorName));
      parama = this.hMT.getMap().addMarker(localMarkerOptions);
      localObject3 = new d();
      ((d)localObject3).hNK = parama;
      ((d)localObject3).data = paramr.data;
      ((d)localObject3).hOa = paramr;
      a(paramString, (d)localObject3);
      if ((paramr.hOe != null) && (paramr.hOe.hOl == b.r.a.hOn))
        ((d)localObject3).hNK.showInfoWindow();
      if (paramr.hOf != null)
      {
        localObject2 = new MarkerOptions();
        ((MarkerOptions)localObject2).position(new LatLng(paramr.latitude, paramr.longitude));
        ((MarkerOptions)localObject2).alpha(paramr.alpha);
        localObject1 = i.aEf();
        parama = (com.tencent.mm.plugin.appbrand.d.a)localObject1;
        if (localObject1 == null)
          parama = new com.tencent.mm.plugin.appbrand.widget.e.d(this.context);
        parama.setText("");
        parama.setTextSize(12);
        parama.setTextColor(com.tencent.mm.plugin.appbrand.widget.e.d.jjZ);
        parama.setTextPadding(0);
        parama.setGravity("center");
        int i = com.tencent.mm.plugin.appbrand.widget.e.d.jka;
        parama.x(0, 0, i, i);
        parama.setTextColor(paramr.hOf.color);
        parama.setTextSize(paramr.hOf.hOg);
        parama.setText(paramr.hOf.content);
        parama.setTextPadding(paramr.hOf.padding);
        parama.setGravity(paramr.hOf.hdq);
        parama.x(paramr.hOf.hOh, paramr.hOf.borderWidth, paramr.hOf.borderColor, paramr.hOf.bgColor);
        parama.setX(paramr.hOf.x);
        parama.setY(paramr.hOf.y);
        parama.measure(0, 0);
        ((MarkerOptions)localObject2).anchor(parama.getAnchorX(), parama.getAnchorY());
        ((MarkerOptions)localObject2).markerView(parama);
        ((MarkerOptions)localObject2).visible(true);
        ((MarkerOptions)localObject2).tag(paramString + "#label");
        ((MarkerOptions)localObject2).zIndex(paramr.zIndex + 2);
        if ((!bo.isNullOrNil(paramr.buildingId)) && (!bo.isNullOrNil(paramr.floorName)))
          ((MarkerOptions)localObject2).indoorInfo(new IndoorInfo(paramr.buildingId, paramr.floorName));
        ((d)localObject3).hNL = this.hMT.getMap().addMarker((MarkerOptions)localObject2);
        a(paramString + "#label", (d)localObject3);
      }
      AppMethodBeat.o(51221);
      return;
      ab.e("MicroMsg.DefaultTencentMapView", "[addMarker] bitmap is null, use default");
    }
  }

  public final void a(String paramString, LinkedList<b.g> paramLinkedList, b.o paramo)
  {
    AppMethodBeat.i(51224);
    paramString = (d)Bh(paramString);
    if ((paramString == null) || (paramString.hNK == null))
    {
      ab.e("MicroMsg.DefaultTencentMapView", "get marker failed!");
      paramo.ec(false);
      AppMethodBeat.o(51224);
    }
    while (true)
    {
      return;
      if (paramLinkedList.size() <= 0)
      {
        ab.e("MicroMsg.DefaultTencentMapView", "keyFrame is empty, err, return");
        paramo.ec(false);
        AppMethodBeat.o(51224);
      }
      else
      {
        Object localObject = (b.g)paramLinkedList.get(0);
        ((b.g)localObject).hNS = paramString.hNK.getPosition().getLatitude();
        ((b.g)localObject).hNR = paramString.hNK.getPosition().getLongitude();
        int i = paramLinkedList.size();
        int j = 1;
        if (j < i)
        {
          b.g localg = (b.g)paramLinkedList.get(j - 1);
          localObject = (b.g)paramLinkedList.get(j);
          if (localg.rotate == 0.0F)
            ((b.g)localObject).hNR = localg.longitude;
          for (((b.g)localObject).hNS = localg.latitude; ; ((b.g)localObject).hNS = paramString.hNK.getPosition().getLatitude())
          {
            j++;
            break;
            ((b.g)localObject).hNR = paramString.hNK.getPosition().getLongitude();
          }
        }
        localObject = new c(paramLinkedList, paramString.hNK, this.hMT);
        paramo = new a.11(this, paramo);
        ((c)localObject).uB.addListener(paramo);
        m.runOnUiThread(new a.13(this, (c)localObject));
        if (paramString.hNL != null)
          m.runOnUiThread(new a.14(this, new c(paramLinkedList, paramString.hNL, this.hMT)));
        AppMethodBeat.o(51224);
      }
    }
  }

  public final boolean a(final b.c paramc, final b.m paramm, com.tencent.mm.plugin.appbrand.d.a parama)
  {
    AppMethodBeat.i(51213);
    if (bo.isNullOrNil(paramc.hNN))
      AppMethodBeat.o(51213);
    Object localObject;
    for (final boolean bool = false; ; bool = false)
    {
      return bool;
      localObject = parama.bB(paramc.hNN);
      if (localObject != null)
        break;
      AppMethodBeat.o(51213);
    }
    parama = new ImageView(this.context);
    parama.setScaleType(ImageView.ScaleType.FIT_XY);
    parama.setImageBitmap((Bitmap)localObject);
    int i = paramc.left;
    int j = paramc.top;
    int k;
    if (paramc.height == 0)
    {
      k = com.tencent.mm.plugin.appbrand.r.g.qb(((Bitmap)localObject).getHeight());
      label111: if (paramc.width != 0)
        break label229;
    }
    label229: for (int m = com.tencent.mm.plugin.appbrand.r.g.qb(((Bitmap)localObject).getWidth()); ; m = paramc.width)
    {
      localObject = new FrameLayout.LayoutParams(m, k);
      ((FrameLayout.LayoutParams)localObject).setMargins(i, j, 0, 0);
      bool = paramc.hNO;
      paramc = paramc.data;
      parama.setOnTouchListener(new a.5(this, bool, parama));
      parama.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          AppMethodBeat.i(138416);
          if ((bool) && (paramm != null))
            paramm.Bf(paramc);
          AppMethodBeat.o(138416);
        }
      });
      m.runOnUiThread(new a.7(this, parama, (FrameLayout.LayoutParams)localObject));
      bool = true;
      AppMethodBeat.o(51213);
      break;
      k = paramc.height;
      break label111;
    }
  }

  public final boolean a(b.d arg1, com.tencent.mm.plugin.appbrand.d.a parama)
  {
    AppMethodBeat.i(51226);
    boolean bool;
    if (bo.isNullOrNil(???.hNN))
    {
      bool = false;
      AppMethodBeat.o(51226);
    }
    while (true)
    {
      return bool;
      Object localObject = new MarkerOptions();
      ((MarkerOptions)localObject).position(new LatLng(???.latitude, ???.longitude));
      parama = parama.bB(???.hNN);
      if ((parama != null) && (!parama.isRecycled()))
        ((MarkerOptions)localObject).icon(new BitmapDescriptor(parama));
      ((MarkerOptions)localObject).rotation(???.rotate);
      Marker localMarker = this.hMT.getMap().addMarker((MarkerOptions)localObject);
      synchronized (this.hNn)
      {
        localObject = this.hNn;
        parama = new com/tencent/mm/plugin/appbrand/jsapi/g/a/a$c;
        parama.<init>(this, localMarker);
        ((ArrayList)localObject).add(parama);
        bool = true;
        AppMethodBeat.o(51226);
      }
    }
  }

  public final boolean a(b.v arg1)
  {
    AppMethodBeat.i(51228);
    PolygonOptions localPolygonOptions = new PolygonOptions();
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = ???.hNV.iterator();
    while (localIterator.hasNext())
    {
      localObject1 = (b.h)localIterator.next();
      localArrayList.add(new LatLng(((b.h)localObject1).latitude, ((b.h)localObject1).longitude));
    }
    localPolygonOptions.addAll(localArrayList);
    localPolygonOptions.fillColor(???.fillColor);
    localPolygonOptions.strokeColor(???.strokeColor);
    localPolygonOptions.strokeWidth(???.strokeWidth);
    localPolygonOptions.zIndex(???.zIndex);
    Object localObject1 = this.hMT.getMap().addPolygon(localPolygonOptions);
    synchronized (this.hNo)
    {
      this.hNo.add(localObject1);
      AppMethodBeat.o(51228);
      return true;
    }
  }

  public final b.w aDQ()
  {
    AppMethodBeat.i(51185);
    Object localObject1 = this.hMT.getProjection().getVisibleRegion().getLatLngBounds();
    Object localObject2 = new b.i();
    ((b.i)localObject2).hNT = new b.h(((LatLngBounds)localObject1).getSouthwest().getLatitude(), ((LatLngBounds)localObject1).getSouthwest().getLongitude());
    ((b.i)localObject2).hNU = new b.h(((LatLngBounds)localObject1).getNortheast().getLatitude(), ((LatLngBounds)localObject1).getNortheast().getLongitude());
    localObject1 = new b.x();
    ((b.x)localObject1).hOp = ((b.i)localObject2);
    localObject2 = new b.w();
    ((b.w)localObject2).hOo = ((b.x)localObject1);
    AppMethodBeat.o(51185);
    return localObject2;
  }

  public final void aDR()
  {
    AppMethodBeat.i(51187);
    ab.i("MicroMsg.DefaultTencentMapView", "map:%s moveToMapLocation", new Object[] { this });
    this.hNf = new a.3(this);
    if ((this.hNq != null) && (this.hNp))
    {
      this.hNf.run();
      this.hNf = null;
    }
    AppMethodBeat.o(51187);
  }

  public final float aDS()
  {
    AppMethodBeat.i(51192);
    float f;
    if (this.hMZ != null)
    {
      f = this.hMZ.getBearing();
      AppMethodBeat.o(51192);
    }
    while (true)
    {
      return f;
      ab.e("MicroMsg.DefaultTencentMapView", "getRotate fail, curCameraPosition is null");
      f = 0.0F;
      AppMethodBeat.o(51192);
    }
  }

  public final b.e aDT()
  {
    AppMethodBeat.i(51204);
    b.e locale;
    if (this.hNh != null)
    {
      locale = this.hNh;
      AppMethodBeat.o(51204);
    }
    while (true)
    {
      return locale;
      locale = aDN();
      AppMethodBeat.o(51204);
    }
  }

  public boolean aDU()
  {
    return false;
  }

  public final b.h aDV()
  {
    AppMethodBeat.i(51207);
    Object localObject = this.hMT.getMap().getMapCenter();
    localObject = new b.h(((LatLng)localObject).getLatitude(), ((LatLng)localObject).getLongitude());
    AppMethodBeat.o(51207);
    return localObject;
  }

  public final void aDW()
  {
    AppMethodBeat.i(51210);
    synchronized (this.hNi)
    {
      Iterator localIterator = this.hNi.iterator();
      if (localIterator.hasNext())
        ((Circle)localIterator.next()).remove();
    }
    this.hNi.clear();
    AppMethodBeat.o(51210);
  }

  public final void aDX()
  {
    AppMethodBeat.i(51212);
    m.runOnUiThread(new a.4(this));
    AppMethodBeat.o(51212);
  }

  public final void aDY()
  {
    AppMethodBeat.i(51214);
    Iterator localIterator = this.hNk.values().iterator();
    while (localIterator.hasNext())
      ((Polyline)localIterator.next()).remove();
    this.hNk.clear();
    AppMethodBeat.o(51214);
  }

  public final void aDZ()
  {
    AppMethodBeat.i(51219);
    ab.i("MicroMsg.DefaultTencentMapView", "map:%s removeAllMarker", new Object[] { this });
    Iterator localIterator = this.hNm.values().iterator();
    while (localIterator.hasNext())
    {
      d locald = (d)localIterator.next();
      locald.hNK.remove();
      if (locald.hNL != null)
      {
        if ((locald.hNL.getMarkerView() != null) && ((locald.hNL.getMarkerView() instanceof com.tencent.mm.plugin.appbrand.widget.e.d)))
          i.a((com.tencent.mm.plugin.appbrand.widget.e.d)locald.hNL.getMarkerView());
        locald.hNL.remove();
      }
    }
    this.hNm.clear();
    AppMethodBeat.o(51219);
  }

  public final void aEa()
  {
    AppMethodBeat.i(51225);
    synchronized (this.hNn)
    {
      Iterator localIterator = this.hNn.iterator();
      if (localIterator.hasNext())
        ((c)localIterator.next()).hNK.remove();
    }
    this.hNn.clear();
    AppMethodBeat.o(51225);
  }

  public final void aEb()
  {
    AppMethodBeat.i(51227);
    synchronized (this.hNo)
    {
      Iterator localIterator = this.hNo.iterator();
      if (localIterator.hasNext())
        ((Polygon)localIterator.next()).remove();
    }
    this.hNo.clear();
    AppMethodBeat.o(51227);
  }

  public final void al(float paramFloat)
  {
    AppMethodBeat.i(51188);
    ab.i("MicroMsg.DefaultTencentMapView", "map:%s zoomTo scale:%f", new Object[] { this, Float.valueOf(paramFloat) });
    TencentMap localTencentMap = this.hMT.getMap();
    if (localTencentMap != null)
      localTencentMap.animateCamera(CameraUpdateFactory.zoomTo(paramFloat));
    AppMethodBeat.o(51188);
  }

  public final void am(float paramFloat)
  {
    AppMethodBeat.i(51189);
    TencentMap localTencentMap = this.hMT.getMap();
    if ((localTencentMap != null) && (this.hMZ != null))
      localTencentMap.animateCamera(CameraUpdateFactory.newCameraPosition(new CameraPosition.Builder(this.hMZ).skew(this.hMZ.getSkew()).bearing(paramFloat).build()));
    AppMethodBeat.o(51189);
  }

  public final void an(float paramFloat)
  {
    AppMethodBeat.i(51190);
    TencentMap localTencentMap = this.hMT.getMap();
    if ((localTencentMap != null) && (this.hMZ != null))
      localTencentMap.animateCamera(CameraUpdateFactory.newCameraPosition(new CameraPosition.Builder(this.hMZ).skew(paramFloat).bearing(this.hMZ.getBearing()).build()));
    AppMethodBeat.o(51190);
  }

  public final void ci(String paramString1, String paramString2)
  {
    AppMethodBeat.i(51203);
    this.hMT.getMap().setIndoorFloor(paramString1, paramString2);
    AppMethodBeat.o(51203);
  }

  public final void ed(boolean paramBoolean)
  {
    AppMethodBeat.i(51194);
    this.hMT.getUiSettings().setZoomGesturesEnabled(paramBoolean);
    AppMethodBeat.o(51194);
  }

  public final void ee(boolean paramBoolean)
  {
    AppMethodBeat.i(51195);
    this.hMT.getUiSettings().setScrollGesturesEnabled(paramBoolean);
    AppMethodBeat.o(51195);
  }

  public final void ef(boolean paramBoolean)
  {
    AppMethodBeat.i(51196);
    this.hMT.getUiSettings().setRotateGesturesEnabled(paramBoolean);
    AppMethodBeat.o(51196);
  }

  public final void eg(boolean paramBoolean)
  {
    AppMethodBeat.i(51197);
    this.hMT.getUiSettings().setCompassEnabled(paramBoolean);
    AppMethodBeat.o(51197);
  }

  public final void eh(boolean paramBoolean)
  {
    AppMethodBeat.i(51198);
    this.hMT.getMap().set3DEnable(paramBoolean);
    AppMethodBeat.o(51198);
  }

  public final void ei(boolean paramBoolean)
  {
    AppMethodBeat.i(51199);
    this.hMT.getUiSettings().setTiltGesturesEnabled(paramBoolean);
    AppMethodBeat.o(51199);
  }

  public final void ej(boolean paramBoolean)
  {
    AppMethodBeat.i(51200);
    this.hMT.getMap().setSatelliteEnabled(paramBoolean);
    AppMethodBeat.o(51200);
  }

  public final void ek(boolean paramBoolean)
  {
    AppMethodBeat.i(51201);
    this.hMT.getMap().setTrafficEnabled(paramBoolean);
    AppMethodBeat.o(51201);
  }

  public final void el(boolean paramBoolean)
  {
    AppMethodBeat.i(51202);
    this.hMT.getMap().setIndoorEnabled(paramBoolean);
    AppMethodBeat.o(51202);
  }

  public final void em(boolean paramBoolean)
  {
    AppMethodBeat.i(51205);
    this.hMT.getUiSettings().setIndoorLevelPickerEnabled(paramBoolean);
    AppMethodBeat.o(51205);
  }

  public final void en(boolean paramBoolean)
  {
    AppMethodBeat.i(51229);
    ab.i("MicroMsg.DefaultTencentMapView", "map:%s show location", new Object[] { this });
    this.hNp = paramBoolean;
    d locald;
    if (paramBoolean)
    {
      if (this.hNq != null)
      {
        locald = this.hNq;
        if (locald.hNK != null)
          locald.hNK.setVisible(true);
      }
      ((com.tencent.mm.plugin.appbrand.s.b.a)e.B(com.tencent.mm.plugin.appbrand.s.b.a.class)).b("gcj02", this.hNr, aEc());
      g.a(this);
      AppMethodBeat.o(51229);
    }
    while (true)
    {
      return;
      if (this.hNq != null)
      {
        locald = this.hNq;
        if (locald.hNK != null)
          locald.hNK.setVisible(false);
      }
      ((com.tencent.mm.plugin.appbrand.s.b.a)e.B(com.tencent.mm.plugin.appbrand.s.b.a.class)).c("gcj02", this.hNr, aEc());
      g.b(this);
      AppMethodBeat.o(51229);
    }
  }

  public final float getSkew()
  {
    AppMethodBeat.i(51193);
    float f;
    if (this.hMZ != null)
    {
      f = this.hMZ.getSkew();
      AppMethodBeat.o(51193);
    }
    while (true)
    {
      return f;
      ab.e("MicroMsg.DefaultTencentMapView", "getRotate fail, curCameraPosition is null");
      f = 0.0F;
      AppMethodBeat.o(51193);
    }
  }

  public final View getView()
  {
    return this.hMS;
  }

  public final int getZoomLevel()
  {
    AppMethodBeat.i(51191);
    int i = this.hMT.getMap().getZoomLevel();
    AppMethodBeat.o(51191);
    return i;
  }

  public final void h(List<b.h> paramList, int paramInt)
  {
    AppMethodBeat.i(51208);
    LatLngBounds.Builder localBuilder = new LatLngBounds.Builder();
    LinkedList localLinkedList = new LinkedList();
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      b.h localh = (b.h)paramList.next();
      localLinkedList.add(new LatLng(localh.latitude, localh.longitude));
    }
    localBuilder.include(localLinkedList);
    this.hMT.getMap().animateCamera(CameraUpdateFactory.newLatLngBounds(localBuilder.build(), paramInt));
    this.hNf = null;
    AppMethodBeat.o(51208);
  }

  public final void onDestroy()
  {
    AppMethodBeat.i(51184);
    ab.i("MicroMsg.DefaultTencentMapView", "map:%s onDestroy", new Object[] { this });
    this.hNu.set(true);
    this.hMT.getMap().setOnMapCameraChangeListener(null);
    aDZ();
    aDY();
    aDY();
    aDX();
    aEa();
    aEb();
    if (this.hMT != null)
    {
      this.hMT.clean();
      this.hMT.onDestroy();
    }
    if (this.hNq != null)
    {
      d locald = this.hNq;
      if (locald.hNK != null)
      {
        locald.hNK.remove();
        locald.hNK = null;
      }
      this.hNq = null;
    }
    AppMethodBeat.o(51184);
  }

  public final void onPause()
  {
    AppMethodBeat.i(51181);
    ab.i("MicroMsg.DefaultTencentMapView", "map:%s onPause", new Object[] { this });
    if (this.mMapType == 0)
    {
      this.cAw.setVisibility(0);
      if (this.hNa == null)
        this.hNa = aDO();
      if (this.hNa != null)
      {
        al.n(this.hNb, 100L);
        this.hMT.setVisibility(4);
        this.hMT.getMap().getScreenShot(new a.21(this));
      }
    }
    while (true)
    {
      this.isBackground = true;
      if (this.hNp)
      {
        ((com.tencent.mm.plugin.appbrand.s.b.a)e.B(com.tencent.mm.plugin.appbrand.s.b.a.class)).c("gcj02", this.hNr, aEc());
        g.b(this);
      }
      AppMethodBeat.o(51181);
      return;
      ab.e("MicroMsg.DefaultTencentMapView", "hideTencentMap err");
      break;
      this.hMT.onPause();
    }
  }

  public final void onResume()
  {
    AppMethodBeat.i(51180);
    ab.i("MicroMsg.DefaultTencentMapView", "map:%s onResume", new Object[] { this });
    if (this.mMapType == 0)
    {
      this.cAw.setVisibility(4);
      this.hMT.setVisibility(0);
      this.hMT.onResume();
      aDP();
    }
    while (true)
    {
      this.isBackground = false;
      if (this.hNp)
      {
        ((com.tencent.mm.plugin.appbrand.s.b.a)e.B(com.tencent.mm.plugin.appbrand.s.b.a.class)).b("gcj02", this.hNr, aEc());
        g.a(this);
      }
      AppMethodBeat.o(51180);
      return;
      this.hMT.onResume();
    }
  }

  public void onSizeChanged(int paramInt1, int paramInt2)
  {
  }

  public void onTouchEvent(MotionEvent paramMotionEvent)
  {
  }

  public String toString()
  {
    AppMethodBeat.i(51232);
    String str = "DefaultTencentMapView{mapId=" + this.hMR + '}';
    AppMethodBeat.o(51232);
    return str;
  }

  public final class b
  {
    ImageView hNJ;

    public b(ImageView arg2)
    {
      Object localObject;
      this.hNJ = localObject;
    }
  }

  public final class c
  {
    Marker hNK;

    public c(Marker arg2)
    {
      Object localObject;
      this.hNK = localObject;
    }
  }

  public static final class d extends b.q
  {
    public Marker hNK;
    public Marker hNL;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.g.a.a
 * JD-Core Version:    0.6.2
 */