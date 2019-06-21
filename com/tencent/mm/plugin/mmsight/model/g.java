package com.tencent.mm.plugin.mmsight.model;

import android.graphics.Point;
import android.hardware.Camera.Parameters;
import android.hardware.Camera.Size;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.mmsight.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class g
{
  private static Point a(ArrayList<Camera.Size> paramArrayList, Point paramPoint, boolean paramBoolean, int paramInt)
  {
    AppMethodBeat.i(76517);
    int i = paramPoint.x;
    int j = paramPoint.y;
    if (j * paramInt % i != 0)
    {
      AppMethodBeat.o(76517);
      paramArrayList = null;
      return paramArrayList;
    }
    i = j * paramInt / i;
    if (paramBoolean)
    {
      j = paramInt ^ i;
      i = j ^ i;
      j ^= i;
    }
    while (true)
    {
      paramArrayList = paramArrayList.iterator();
      while (true)
        if (paramArrayList.hasNext())
        {
          paramPoint = (Camera.Size)paramArrayList.next();
          if ((paramPoint.width == j) && (paramPoint.height == i))
          {
            ab.i("MicroMsg.MMSightCameraInfo", "findEqualsPrewViewSize FindBestSize %d %d", new Object[] { Integer.valueOf(j), Integer.valueOf(i) });
            paramArrayList = new Point(j, i);
            AppMethodBeat.o(76517);
            break;
          }
          if (Math.min(paramPoint.width, paramPoint.height) < paramInt)
          {
            AppMethodBeat.o(76517);
            paramArrayList = null;
            break;
          }
        }
      AppMethodBeat.o(76517);
      paramArrayList = null;
      break;
      j = paramInt;
    }
  }

  public static g.b a(Camera.Parameters paramParameters, Point paramPoint, int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(76514);
    Object localObject1 = new ArrayList(paramParameters.getSupportedPreviewSizes());
    Collections.sort((List)localObject1, new g.a((byte)0));
    new ArrayList(paramParameters.getSupportedPictureSizes());
    ab.i("MicroMsg.MMSightCameraInfo", "supportedPreviewSizes: %s", new Object[] { d.cq((List)localObject1) });
    float f = paramPoint.x / paramPoint.y;
    ab.i("MicroMsg.MMSightCameraInfo", "screen.x: %d, screen.y: %d, ratio: %f, upperBoundPrewView: %s lowerBoundPreView: %s", new Object[] { Integer.valueOf(paramPoint.x), Integer.valueOf(paramPoint.y), Float.valueOf(f), Integer.valueOf(paramInt), Integer.valueOf(0) });
    ab.d("MicroMsg.MMSightCameraInfo", "systemAvailableMemInMB: %d", new Object[] { Long.valueOf(bo.gO(ah.getContext())) });
    paramParameters = new g.b();
    paramParameters.oum = a((ArrayList)localObject1, paramPoint, paramBoolean, paramInt);
    if (paramParameters.oum != null)
    {
      paramParameters.oun = d.a(paramPoint, paramParameters.oum, paramBoolean);
      paramParameters.ouo = d.a(paramPoint, paramParameters.oum, paramBoolean, true);
      paramInt = 0;
    }
    while (true)
    {
      ab.i("MicroMsg.MMSightCameraInfo", "final tryFindBestSize prewViewSize %s cropSize %s findcount %d", new Object[] { paramParameters.oum, paramParameters.oun, Integer.valueOf(paramInt) });
      AppMethodBeat.o(76514);
      Object localObject2;
      while (true)
      {
        return paramParameters;
        localPoint = new Point();
        localObject1 = ((ArrayList)localObject1).iterator();
        do
        {
          while (true)
          {
            if (!((Iterator)localObject1).hasNext())
              break label734;
            localObject2 = (Camera.Size)((Iterator)localObject1).next();
            localPoint.x = ((Camera.Size)localObject2).width;
            localPoint.y = ((Camera.Size)localObject2).height;
            if (localPoint.x == localPoint.y)
            {
              ab.i("MicroMsg.MMSightCameraInfo", "exclude square curSize: %s", new Object[] { localPoint });
            }
            else
            {
              ab.i("MicroMsg.MMSightCameraInfo", "cursize is %s * %s , and isRotate %s, screenRes.x %s, screenRes.y %s", new Object[] { Integer.valueOf(localPoint.x), Integer.valueOf(localPoint.y), Boolean.valueOf(paramBoolean), Integer.valueOf(paramPoint.x), Integer.valueOf(paramPoint.y) });
              if (paramPoint.y > paramPoint.x)
              {
                if (localPoint.y >= localPoint.x)
                  ab.i("MicroMsg.MMSightCameraInfo", "screen ratio is differ from preview ratio  1 and unSupport preview is %s * %s", new Object[] { Integer.valueOf(((Camera.Size)localObject2).height), Integer.valueOf(((Camera.Size)localObject2).width) });
              }
              else if (localPoint.x >= localPoint.y)
              {
                ab.i("MicroMsg.MMSightCameraInfo", "screen ratio is differ from preview ratio 2 and unSupport preview is %s * %s", new Object[] { Integer.valueOf(((Camera.Size)localObject2).height), Integer.valueOf(((Camera.Size)localObject2).width) });
              }
              else
              {
                localObject2 = d.a(paramPoint, localPoint, paramBoolean);
                if (localObject2 != null)
                  break;
                ab.i("MicroMsg.MMSightCameraInfo", "curSize: %s, can not find crop size", new Object[] { localPoint });
              }
            }
          }
          ab.i("MicroMsg.MMSightCameraInfo", "preViewPoint: %s --> bestSize %s ", new Object[] { localPoint, localObject2 });
          paramParameters.ouq = new Point(((Point)localObject2).x, ((Point)localObject2).y);
          paramParameters.oup = new Point(localPoint.x, localPoint.y);
          paramParameters.our = d.a(paramPoint, localPoint, paramBoolean, true);
        }
        while (Math.min(((Point)localObject2).x, ((Point)localObject2).y) > paramInt);
        if (Math.min(((Point)localObject2).x, ((Point)localObject2).y) >= 0)
          break;
        paramParameters = null;
        AppMethodBeat.o(76514);
      }
      Point localPoint = new Point(localPoint.x, localPoint.y);
      paramParameters.oum = localPoint;
      paramParameters.oun = ((Point)localObject2);
      paramParameters.ouo = d.a(paramPoint, paramParameters.oum, paramBoolean, true);
      paramInt = 1;
      ab.i("MicroMsg.MMSightCameraInfo", "find bestPreviewSize  %s -> %s findcount %d", new Object[] { localPoint, localObject2, Integer.valueOf(1) });
      continue;
      label734: paramInt = 0;
    }
  }

  public static g.b b(Camera.Parameters paramParameters, Point paramPoint, int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(76515);
    Object localObject = new ArrayList(paramParameters.getSupportedPreviewSizes());
    Collections.sort((List)localObject, new g.a((byte)0));
    ab.i("MicroMsg.MMSightCameraInfo", "supportedPreviewSizes: %s", new Object[] { d.cq((List)localObject) });
    float f = paramPoint.x / paramPoint.y;
    ab.i("MicroMsg.MMSightCameraInfo", "screen.x: %d, screen.y: %d, ratio: %f, upperBoundPrewView: %s lowerBoundPreView: %s", new Object[] { Integer.valueOf(paramPoint.x), Integer.valueOf(paramPoint.y), Float.valueOf(f), Integer.valueOf(paramInt), Integer.valueOf(0) });
    ab.d("MicroMsg.MMSightCameraInfo", "systemAvailableMemInMB: %d", new Object[] { Long.valueOf(bo.gO(ah.getContext())) });
    paramParameters = new g.b();
    Point localPoint = new Point();
    paramInt = (int)(paramInt * 1.05F);
    Iterator localIterator = ((ArrayList)localObject).iterator();
    while (localIterator.hasNext())
    {
      localObject = (Camera.Size)localIterator.next();
      if (((Camera.Size)localObject).height <= paramInt + 64)
      {
        localPoint.x = ((Camera.Size)localObject).width;
        localPoint.y = ((Camera.Size)localObject).height;
        ab.i("MicroMsg.MMSightCameraInfo", "cursize is %s * %s , and isRotate %s, screenRes.x %s, screenRes.y %s", new Object[] { Integer.valueOf(localPoint.x), Integer.valueOf(localPoint.y), Boolean.valueOf(paramBoolean), Integer.valueOf(paramPoint.x), Integer.valueOf(paramPoint.y) });
        if (paramPoint.y > paramPoint.x)
        {
          if (localPoint.y >= localPoint.x)
            ab.i("MicroMsg.MMSightCameraInfo", "screen ratio is differ from preview ratio  1 and unSupport preview is %s * %s", new Object[] { Integer.valueOf(((Camera.Size)localObject).height), Integer.valueOf(((Camera.Size)localObject).width) });
        }
        else if (localPoint.x >= localPoint.y)
        {
          ab.i("MicroMsg.MMSightCameraInfo", "screen ratio is differ from preview ratio 2 and unSupport preview is %s * %s", new Object[] { Integer.valueOf(((Camera.Size)localObject).height), Integer.valueOf(((Camera.Size)localObject).width) });
        }
        else
        {
          localObject = d.a(paramPoint, localPoint, paramBoolean, false);
          if (localObject != null)
          {
            ab.i("MicroMsg.MMSightCameraInfo", "preViewPoint: %s --> bestSize %s ", new Object[] { localPoint, localObject });
            paramParameters.ouq = new Point(((Point)localObject).x, ((Point)localObject).y);
            paramParameters.oup = new Point(localPoint.x, localPoint.y);
            paramParameters.our = d.a(paramPoint, localPoint, paramBoolean, true);
            localPoint = new Point(localPoint.x, localPoint.y);
            paramParameters.oum = localPoint;
            paramParameters.oun = ((Point)localObject);
            paramParameters.ouo = d.a(paramPoint, paramParameters.oum, paramBoolean, true);
            ab.i("MicroMsg.MMSightCameraInfo", "find bestPreviewSize  %s -> %s findcount %d", new Object[] { localPoint, localObject, Integer.valueOf(1) });
            AppMethodBeat.o(76515);
          }
        }
      }
    }
    while (true)
    {
      return paramParameters;
      ab.i("MicroMsg.MMSightCameraInfo", "final tryFindBestSize prewViewSize %s cropSize %s findcount %d with crop width", new Object[] { paramParameters.oum, paramParameters.oun, Integer.valueOf(0) });
      AppMethodBeat.o(76515);
    }
  }

  public static g.b c(Camera.Parameters paramParameters, Point paramPoint, int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(76516);
    Object localObject = new ArrayList(paramParameters.getSupportedPreviewSizes());
    Collections.sort((List)localObject, new g.a((byte)0));
    new ArrayList(paramParameters.getSupportedPictureSizes());
    ab.i("MicroMsg.MMSightCameraInfo", "tryFindPreviewSizeAnyWay supportedPreviewSizes: %s", new Object[] { d.cq((List)localObject) });
    float f = paramPoint.x / paramPoint.y;
    ab.i("MicroMsg.MMSightCameraInfo", "screen.x: %d, screen.y: %d, ratio: %f, upperBoundPrewView: %s", new Object[] { Integer.valueOf(paramPoint.x), Integer.valueOf(paramPoint.y), Float.valueOf(f), Integer.valueOf(paramInt) });
    ab.d("MicroMsg.MMSightCameraInfo", "systemAvailableMemInMB: %d", new Object[] { Long.valueOf(bo.gO(ah.getContext())) });
    paramParameters = new g.b();
    paramParameters.oum = a((ArrayList)localObject, paramPoint, paramBoolean, paramInt);
    if (paramParameters.oum != null)
    {
      paramParameters.oun = d.b(paramPoint, paramParameters.oum, paramBoolean);
      paramParameters.ouo = d.b(paramPoint, paramParameters.oum, paramBoolean, true);
    }
    while (true)
    {
      ab.i("MicroMsg.MMSightCameraInfo", "final tryFindBestSize prewViewSize %s cropSize %s findcount %d with any way", new Object[] { paramParameters.oum, paramParameters.oun, Integer.valueOf(0) });
      AppMethodBeat.o(76516);
      return paramParameters;
      Point localPoint = new Point();
      Math.min(paramPoint.x, paramPoint.y);
      Math.max(paramPoint.x, paramPoint.y);
      Iterator localIterator = ((ArrayList)localObject).iterator();
      if (localIterator.hasNext())
      {
        localObject = (Camera.Size)localIterator.next();
        localPoint.x = ((Camera.Size)localObject).width;
        localPoint.y = ((Camera.Size)localObject).height;
        if ((localPoint.x == localPoint.y) || (Math.min(localPoint.x, localPoint.y) > paramInt) || (Math.max(localPoint.x, localPoint.y) > 2000) || (d.b(paramPoint, localPoint, paramBoolean) == null))
          break;
        paramParameters.oum = null;
      }
    }
  }

  public static g.b d(Camera.Parameters paramParameters, Point paramPoint, int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(76518);
    paramParameters = new ArrayList(paramParameters.getSupportedPreviewSizes());
    Collections.sort(paramParameters, new g.a((byte)0));
    ab.i("MicroMsg.MMSightCameraInfo", "findPreviewSizeWithoutCrop supportedPreviewSizes: %s", new Object[] { d.cq(paramParameters) });
    float f = paramPoint.x / paramPoint.y;
    ab.i("MicroMsg.MMSightCameraInfo", "screen.x: %d, screen.y: %d, ratio: %f, upperBoundPrewView: %s ", new Object[] { Integer.valueOf(paramPoint.x), Integer.valueOf(paramPoint.y), Float.valueOf(f), Integer.valueOf(paramInt) });
    ab.d("MicroMsg.MMSightCameraInfo", "systemAvailableMemInMB: %d", new Object[] { Long.valueOf(bo.gO(ah.getContext())) });
    g.b localb = new g.b();
    paramInt = (int)(paramInt * 1.05F);
    paramParameters = paramParameters.iterator();
    Object localObject;
    while (paramParameters.hasNext())
    {
      localObject = (Camera.Size)paramParameters.next();
      if ((((Camera.Size)localObject).height <= paramInt + 64) && (((Camera.Size)localObject).width <= 2000))
      {
        paramParameters = new Point();
        paramParameters.x = ((Camera.Size)localObject).width;
        paramParameters.y = ((Camera.Size)localObject).height;
      }
    }
    while (true)
    {
      ab.i("MicroMsg.MMSightCameraInfo", "preViewPoint: %s ", new Object[] { paramParameters });
      localb.ouq = new Point(paramParameters.x, paramParameters.y);
      localb.oup = new Point(paramParameters.x, paramParameters.y);
      localb.our = d.a(paramPoint, paramParameters, paramBoolean, true);
      localObject = new Point(paramParameters.x, paramParameters.y);
      localb.oum = ((Point)localObject);
      localb.oun = paramParameters;
      localb.ouo = d.a(paramPoint, localb.oum, paramBoolean, true);
      ab.i("MicroMsg.MMSightCameraInfo", "find bestPreviewSize  %s -> %s ", new Object[] { localObject, paramParameters });
      AppMethodBeat.o(76518);
      return localb;
      paramParameters = null;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.model.g
 * JD-Core Version:    0.6.2
 */