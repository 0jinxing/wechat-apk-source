package com.tencent.tencentmap.mapsdk.a;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import com.tencent.mapsdk.raster.model.BitmapDescriptor;
import com.tencent.mapsdk.raster.model.CameraPosition;
import com.tencent.mapsdk.raster.model.CircleOptions;
import com.tencent.mapsdk.raster.model.IndoorBuilding;
import com.tencent.mapsdk.raster.model.IndoorInfo;
import com.tencent.mapsdk.raster.model.IndoorLevel;
import com.tencent.mapsdk.raster.model.IndoorMapPoi;
import com.tencent.mapsdk.raster.model.Language;
import com.tencent.mapsdk.raster.model.LatLng;
import com.tencent.mapsdk.raster.model.LatLngBounds;
import com.tencent.mapsdk.raster.model.MapPoi;
import com.tencent.mapsdk.raster.model.MarkerOptions;
import com.tencent.mapsdk.raster.model.PolygonOptions;
import com.tencent.mapsdk.raster.model.PolylineOptions;
import com.tencent.mapsdk.raster.model.VisibleRegion;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.tencentmap.mapsdk.map.CameraParameter;
import com.tencent.tencentmap.mapsdk.map.CameraUpdate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ej
{
  public static float a(float paramFloat)
  {
    return paramFloat;
  }

  public static CameraPosition a(cp paramcp)
  {
    AppMethodBeat.i(101572);
    if (paramcp == null)
    {
      paramcp = null;
      AppMethodBeat.o(101572);
    }
    while (true)
    {
      return paramcp;
      paramcp = new CameraPosition(a(paramcp.a), b(paramcp.b), paramcp.c, paramcp.d);
      AppMethodBeat.o(101572);
    }
  }

  static IndoorBuilding a(cw paramcw)
  {
    Object localObject = null;
    AppMethodBeat.i(101581);
    if (paramcw == null)
    {
      AppMethodBeat.o(101581);
      paramcw = localObject;
    }
    while (true)
    {
      return paramcw;
      List localList = c(paramcw.c());
      if (localList == null)
      {
        AppMethodBeat.o(101581);
        paramcw = localObject;
      }
      else
      {
        paramcw = new IndoorBuilding(paramcw.a(), paramcw.b(), localList, paramcw.d());
        AppMethodBeat.o(101581);
      }
    }
  }

  public static LatLng a(db paramdb)
  {
    AppMethodBeat.i(101567);
    if (paramdb == null)
    {
      paramdb = null;
      AppMethodBeat.o(101567);
    }
    while (true)
    {
      return paramdb;
      paramdb = new LatLng(paramdb.a, paramdb.b);
      AppMethodBeat.o(101567);
    }
  }

  static LatLngBounds a(dc paramdc)
  {
    AppMethodBeat.i(101575);
    if ((paramdc == null) || (paramdc.b == null) || (paramdc.a == null))
    {
      paramdc = null;
      AppMethodBeat.o(101575);
    }
    while (true)
    {
      return paramdc;
      paramdc = new LatLngBounds(new LatLng(paramdc.a.a, paramdc.a.b), new LatLng(paramdc.b.a, paramdc.b.b));
      AppMethodBeat.o(101575);
    }
  }

  public static MapPoi a(dd paramdd)
  {
    AppMethodBeat.i(101568);
    if (paramdd == null)
    {
      paramdd = null;
      AppMethodBeat.o(101568);
    }
    while (true)
    {
      return paramdd;
      if ((paramdd instanceof cz))
      {
        paramdd = (cz)paramdd;
        paramdd = new IndoorMapPoi(paramdd.d(), a(paramdd.e()), paramdd.a(), paramdd.b(), paramdd.c());
        AppMethodBeat.o(101568);
      }
      else
      {
        paramdd = new MapPoi(paramdd.d(), a(paramdd.e()));
        AppMethodBeat.o(101568);
      }
    }
  }

  public static VisibleRegion a(do paramdo)
  {
    AppMethodBeat.i(101573);
    if (paramdo == null)
    {
      paramdo = null;
      AppMethodBeat.o(101573);
    }
    while (true)
    {
      return paramdo;
      paramdo = new VisibleRegion(a(paramdo.a), a(paramdo.b), a(paramdo.c), a(paramdo.d), a(paramdo.e));
      AppMethodBeat.o(101573);
    }
  }

  static ad a(CameraUpdate paramCameraUpdate, aj paramaj)
  {
    Object localObject = null;
    AppMethodBeat.i(101580);
    if ((paramCameraUpdate == null) || (paramCameraUpdate.getParams() == null))
    {
      AppMethodBeat.o(101580);
      paramCameraUpdate = localObject;
    }
    CameraParameter localCameraParameter;
    while (true)
    {
      return paramCameraUpdate;
      localCameraParameter = paramCameraUpdate.getParams();
      switch (paramCameraUpdate.getParams().cameraUpdate_type)
      {
      default:
        AppMethodBeat.o(101580);
        paramCameraUpdate = localObject;
        break;
      case 6:
        paramCameraUpdate = ae.a(a(localCameraParameter.newCameraPosition));
        AppMethodBeat.o(101580);
        break;
      case 7:
        paramCameraUpdate = ae.a(a(localCameraParameter.newLatLng));
        AppMethodBeat.o(101580);
        break;
      case 9:
        paramCameraUpdate = ae.a(a(localCameraParameter.newLatLngBounds_bounds), localCameraParameter.newLatLngBounds_padding, localCameraParameter.newLatLngBounds_padding, localCameraParameter.newLatLngBounds_padding, localCameraParameter.newLatLngBounds_padding);
        AppMethodBeat.o(101580);
      case 10:
      case 8:
      case 2:
      case 5:
      case 4:
      case 0:
      case 1:
      case 3:
      case 11:
      }
    }
    int i;
    int j;
    label236: int k;
    int m;
    if ((paramaj != null) && (paramaj.x() != 0) && (paramaj.x() != 0))
      if (localCameraParameter.newLatLngBounds_dimension_width < paramaj.x())
      {
        i = paramaj.x() / 2 - (localCameraParameter.newLatLngBounds_dimension_width / 2 - localCameraParameter.newLatLngBounds_dimension_padding);
        j = i;
        if (localCameraParameter.newLatLngBounds_dimension_height < paramaj.y())
        {
          k = paramaj.y() / 2 - (localCameraParameter.newLatLngBounds_dimension_height / 2 - localCameraParameter.newLatLngBounds_dimension_padding);
          m = k;
        }
      }
    while (true)
    {
      paramCameraUpdate = ae.a(a(localCameraParameter.newLatLngBounds_dimension_bounds), j, i, k, m);
      AppMethodBeat.o(101580);
      break;
      paramCameraUpdate = ae.a(a(localCameraParameter.newLatLngZoom_latlng), a(localCameraParameter.newLatLngZoom_zoom));
      AppMethodBeat.o(101580);
      break;
      paramCameraUpdate = ae.a(localCameraParameter.scrollBy_xPixel, localCameraParameter.scrollBy_yPixel);
      AppMethodBeat.o(101580);
      break;
      paramCameraUpdate = ae.a(localCameraParameter.zoomBy_Point_amount, localCameraParameter.zoomBy_Point_focus);
      AppMethodBeat.o(101580);
      break;
      paramCameraUpdate = ae.b(localCameraParameter.zoomBy_amount);
      AppMethodBeat.o(101580);
      break;
      paramCameraUpdate = ae.a();
      AppMethodBeat.o(101580);
      break;
      paramCameraUpdate = ae.b();
      AppMethodBeat.o(101580);
      break;
      float f;
      if (localCameraParameter.zoomTo_zoom < paramaj.f())
        f = paramaj.f();
      while (true)
      {
        paramCameraUpdate = ae.a(a(f));
        AppMethodBeat.o(101580);
        break;
        if (localCameraParameter.zoomTo_zoom > paramaj.e())
          f = paramaj.e();
        else
          f = localCameraParameter.zoomTo_zoom;
      }
      paramCameraUpdate = ae.a(a(localCameraParameter.newLatLngBounds_bounds), a(localCameraParameter.newLatLng), localCameraParameter.newLatLngBounds_padding);
      AppMethodBeat.o(101580);
      break;
      m = 0;
      k = 0;
      continue;
      j = 0;
      i = 0;
      break label236;
      m = 0;
      j = 0;
      k = 0;
      i = 0;
    }
  }

  public static cp a(CameraPosition paramCameraPosition)
  {
    AppMethodBeat.i(101571);
    if (paramCameraPosition == null)
    {
      paramCameraPosition = null;
      AppMethodBeat.o(101571);
    }
    while (true)
    {
      return paramCameraPosition;
      paramCameraPosition = new cp(a(paramCameraPosition.getTarget()), a(paramCameraPosition.getZoom()), paramCameraPosition.getSkew(), paramCameraPosition.getBearing());
      AppMethodBeat.o(101571);
    }
  }

  public static cr a(CircleOptions paramCircleOptions)
  {
    AppMethodBeat.i(101576);
    if (paramCircleOptions == null)
    {
      paramCircleOptions = null;
      AppMethodBeat.o(101576);
    }
    while (true)
    {
      return paramCircleOptions;
      cr localcr = new cr();
      db localdb = a(paramCircleOptions.getCenter());
      if (localdb != null)
        localcr.a(localdb);
      localcr.a(a(paramCircleOptions.getCenter())).b(paramCircleOptions.getFillColor()).a(paramCircleOptions.getRadius()).a(paramCircleOptions.getStrokeColor()).a(paramCircleOptions.getStrokeWidth() / y.g()).a(paramCircleOptions.isVisible()).c((int)paramCircleOptions.getZIndex()).d(paramCircleOptions.getLevel());
      AppMethodBeat.o(101576);
      paramCircleOptions = localcr;
    }
  }

  static cx a(IndoorInfo paramIndoorInfo)
  {
    AppMethodBeat.i(101582);
    if (paramIndoorInfo == null)
    {
      paramIndoorInfo = null;
      AppMethodBeat.o(101582);
    }
    while (true)
    {
      return paramIndoorInfo;
      paramIndoorInfo = new cx(paramIndoorInfo.getBuildingId(), paramIndoorInfo.getFloorName());
      AppMethodBeat.o(101582);
    }
  }

  public static da a(Language paramLanguage)
  {
    AppMethodBeat.i(101584);
    if (paramLanguage == null)
    {
      paramLanguage = da.a;
      AppMethodBeat.o(101584);
    }
    while (true)
    {
      return paramLanguage;
      switch (ej.1.a[paramLanguage.ordinal()])
      {
      default:
        paramLanguage = da.a;
        AppMethodBeat.o(101584);
        break;
      case 1:
        paramLanguage = da.a;
        AppMethodBeat.o(101584);
        break;
      case 2:
        paramLanguage = da.b;
        AppMethodBeat.o(101584);
      }
    }
  }

  public static db a(LatLng paramLatLng)
  {
    AppMethodBeat.i(101566);
    if (paramLatLng == null)
    {
      paramLatLng = null;
      AppMethodBeat.o(101566);
    }
    while (true)
    {
      return paramLatLng;
      paramLatLng = new db(paramLatLng.getLatitude(), paramLatLng.getLongitude());
      AppMethodBeat.o(101566);
    }
  }

  static dc a(LatLngBounds paramLatLngBounds)
  {
    AppMethodBeat.i(101574);
    if ((paramLatLngBounds == null) || (paramLatLngBounds.getNortheast() == null) || (paramLatLngBounds.getSouthwest() == null))
    {
      paramLatLngBounds = null;
      AppMethodBeat.o(101574);
    }
    while (true)
    {
      return paramLatLngBounds;
      paramLatLngBounds = new dc(new db(paramLatLngBounds.getSouthwest().getLatitude(), paramLatLngBounds.getSouthwest().getLongitude()), new db(paramLatLngBounds.getNortheast().getLatitude(), paramLatLngBounds.getNortheast().getLongitude()));
      AppMethodBeat.o(101574);
    }
  }

  public static df a(MarkerOptions paramMarkerOptions)
  {
    df localdf = null;
    AppMethodBeat.i(101577);
    if (paramMarkerOptions == null)
      AppMethodBeat.o(101577);
    for (paramMarkerOptions = localdf; ; paramMarkerOptions = localdf)
    {
      return paramMarkerOptions;
      localObject = a(paramMarkerOptions.getPosition());
      if (localObject != null)
        break;
      AppMethodBeat.o(101577);
    }
    localdf = new df((db)localObject);
    Object localObject = localdf.b(paramMarkerOptions.getAlpha()).b(paramMarkerOptions.isVisible()).a(paramMarkerOptions.isDraggable()).a(paramMarkerOptions.getAnchorU(), paramMarkerOptions.getAnchorV()).a(paramMarkerOptions.getRotation()).a(a(paramMarkerOptions.getIndoorInfo())).c(paramMarkerOptions.getZIndex()).a(paramMarkerOptions.getLevel()).c(paramMarkerOptions.isFlat());
    if (paramMarkerOptions.isFlat() != paramMarkerOptions.isClockwise());
    for (boolean bool = true; ; bool = false)
    {
      ((df)localObject).d(bool).a(paramMarkerOptions.getInfoWindowOffsetX(), paramMarkerOptions.getInfowindowOffsetY()).c(paramMarkerOptions.getContentDescription());
      if (paramMarkerOptions.getIcon() != null)
        localdf.a(cn.a(paramMarkerOptions.getIcon().getBitmap()));
      if (paramMarkerOptions.getMarkerView() != null)
        localdf.a(cn.a(paramMarkerOptions.getMarkerView()));
      if (paramMarkerOptions.getSnippet() != null)
        localdf.b(paramMarkerOptions.getSnippet());
      if (paramMarkerOptions.getTitle() != null)
        localdf.a(paramMarkerOptions.getTitle());
      if (paramMarkerOptions.getTag() != null)
        localdf.a(paramMarkerOptions.getTag());
      AppMethodBeat.o(101577);
      paramMarkerOptions = localdf;
      break;
    }
  }

  public static dk a(PolygonOptions paramPolygonOptions)
  {
    Object localObject = null;
    AppMethodBeat.i(101579);
    if (paramPolygonOptions == null)
    {
      AppMethodBeat.o(101579);
      paramPolygonOptions = localObject;
    }
    while (true)
    {
      return paramPolygonOptions;
      dk localdk = new dk();
      List localList = b(paramPolygonOptions.getPoints());
      if ((localList != null) && (localList.size() > 2))
      {
        localdk.b(localList);
        localdk.a(paramPolygonOptions.isVisible()).c((int)paramPolygonOptions.getZIndex()).d(paramPolygonOptions.getLevel()).a(paramPolygonOptions.getStrokeWidth() / y.g()).a(paramPolygonOptions.getStrokeColor()).b(paramPolygonOptions.getFillColor());
        AppMethodBeat.o(101579);
        paramPolygonOptions = localdk;
      }
      else
      {
        AppMethodBeat.o(101579);
        paramPolygonOptions = localObject;
      }
    }
  }

  public static dm a(PolylineOptions paramPolylineOptions)
  {
    Object localObject1 = null;
    AppMethodBeat.i(101578);
    if (paramPolylineOptions == null)
    {
      AppMethodBeat.o(101578);
      paramPolylineOptions = (PolylineOptions)localObject1;
    }
    while (true)
    {
      return paramPolylineOptions;
      dm localdm = new dm();
      Object localObject2 = b(paramPolylineOptions.getPoints());
      if ((localObject2 == null) || (((List)localObject2).size() == 0))
      {
        AppMethodBeat.o(101578);
        paramPolylineOptions = (PolylineOptions)localObject1;
        continue;
      }
      localdm.a((Iterable)localObject2);
      float f = paramPolylineOptions.getWidth();
      localdm.d((int)paramPolylineOptions.getZIndex()).f(paramPolylineOptions.getLevel()).a(f).a(paramPolylineOptions.isVisible()).a(paramPolylineOptions.getColor()).b(paramPolylineOptions.getEdgeColor()).b(paramPolylineOptions.getEdgeWidth()).e(paramPolylineOptions.getLineType()).c(paramPolylineOptions.getEraseColor()).a(a(paramPolylineOptions.getIndoorInfo()));
      if (paramPolylineOptions.getColorTexture() != null)
        localdm.a(cn.a(paramPolylineOptions.getColorTexture().getBitmap()));
      if (paramPolylineOptions.getArrowTexture() != null)
      {
        localdm.b(true);
        localdm.g((int)paramPolylineOptions.getArrowGap());
        localObject1 = new Matrix();
        ((Matrix)localObject1).postRotate(-90.0F);
      }
      try
      {
        localObject2 = paramPolylineOptions.getArrowTexture().getBitmap();
        localObject2 = Bitmap.createScaledBitmap((Bitmap)localObject2, ((Bitmap)localObject2).getWidth(), ((Bitmap)localObject2).getHeight(), true);
        localdm.b(cn.a(Bitmap.createBitmap((Bitmap)localObject2, 0, 0, ((Bitmap)localObject2).getWidth(), ((Bitmap)localObject2).getHeight(), (Matrix)localObject1, true)));
        label255: if (paramPolylineOptions.isDottedLine())
        {
          localObject1 = new ArrayList();
          ((List)localObject1).add(Integer.valueOf((int)(3.0F * paramPolylineOptions.getWidth())));
          ((List)localObject1).add(Integer.valueOf((int)paramPolylineOptions.getWidth()));
          localdm.c((List)localObject1);
        }
        AppMethodBeat.o(101578);
        paramPolylineOptions = localdm;
      }
      catch (Exception localException)
      {
        break label255;
      }
    }
  }

  public static List<LatLng> a(List<db> paramList)
  {
    AppMethodBeat.i(101569);
    if (paramList == null)
    {
      paramList = null;
      AppMethodBeat.o(101569);
    }
    while (true)
    {
      return paramList;
      db[] arrayOfdb = (db[])paramList.toArray(new db[paramList.size()]);
      paramList = new ArrayList();
      int i = arrayOfdb.length;
      for (int j = 0; j < i; j++)
        paramList.add(a(arrayOfdb[j]));
      AppMethodBeat.o(101569);
    }
  }

  public static float b(float paramFloat)
  {
    return paramFloat;
  }

  public static List<db> b(List<LatLng> paramList)
  {
    AppMethodBeat.i(101570);
    if (paramList == null)
    {
      paramList = null;
      AppMethodBeat.o(101570);
    }
    while (true)
    {
      return paramList;
      LatLng[] arrayOfLatLng = (LatLng[])paramList.toArray(new LatLng[paramList.size()]);
      paramList = new ArrayList();
      int i = arrayOfLatLng.length;
      for (int j = 0; j < i; j++)
        paramList.add(a(arrayOfLatLng[j]));
      AppMethodBeat.o(101570);
    }
  }

  static List<IndoorLevel> c(List<cy> paramList)
  {
    AppMethodBeat.i(101583);
    if (paramList == null)
    {
      AppMethodBeat.o(101583);
      paramList = null;
    }
    while (true)
    {
      return paramList;
      Object localObject = new CopyOnWriteArrayList(paramList);
      paramList = new ArrayList();
      Iterator localIterator = ((List)localObject).iterator();
      while (true)
      {
        if (!localIterator.hasNext())
          break label99;
        localObject = (cy)localIterator.next();
        if (localObject == null)
        {
          AppMethodBeat.o(101583);
          paramList = null;
          break;
        }
        paramList.add(new IndoorLevel(((cy)localObject).a()));
      }
      label99: AppMethodBeat.o(101583);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.a.ej
 * JD-Core Version:    0.6.2
 */