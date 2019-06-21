package com.tencent.ttpic.filter;

import android.graphics.PointF;
import com.tencent.filter.BaseFilter;
import com.tencent.filter.GLSLRender;
import com.tencent.filter.h;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.ttpic.baseutils.BitUtils;
import com.tencent.ttpic.fabby.FabbyUtil.TRANSFORM_TYPE;
import com.tencent.ttpic.model.GridModel;
import com.tencent.ttpic.model.Rect;
import com.tencent.ttpic.model.RenderParam;
import com.tencent.ttpic.util.AlgoUtils;

public class CanvasFilters
{
  private BaseFilter mDrawFilter;

  public CanvasFilters()
  {
    AppMethodBeat.i(82068);
    this.mDrawFilter = new BaseFilter(GLSLRender.bJB);
    AppMethodBeat.o(82068);
  }

  private float[] calculateTexPosTriangles(GridModel paramGridModel, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
  {
    AppMethodBeat.i(82071);
    int i = paramInt3;
    int j = paramInt4;
    if (paramGridModel.positionMode == 0)
    {
      i = paramInt3 * paramInt5 / paramInt1;
      j = paramInt4 * paramInt6 / paramInt2;
    }
    if (paramGridModel.aspectMode == 1)
    {
      paramGridModel = new float[12];
      GridModel tmp52_51 = paramGridModel;
      tmp52_51[0] = 0.0F;
      GridModel tmp56_52 = tmp52_51;
      tmp56_52[1] = 0.0F;
      GridModel tmp60_56 = tmp56_52;
      tmp60_56[2] = 0.0F;
      GridModel tmp64_60 = tmp60_56;
      tmp64_60[3] = 1.0F;
      GridModel tmp68_64 = tmp64_60;
      tmp68_64[4] = 1.0F;
      GridModel tmp72_68 = tmp68_64;
      tmp72_68[5] = 1.0F;
      GridModel tmp76_72 = tmp72_68;
      tmp76_72[6] = 0.0F;
      GridModel tmp81_76 = tmp76_72;
      tmp81_76[7] = 0.0F;
      GridModel tmp86_81 = tmp81_76;
      tmp86_81[8] = 1.0F;
      GridModel tmp91_86 = tmp86_81;
      tmp91_86[9] = 1.0F;
      GridModel tmp96_91 = tmp91_86;
      tmp96_91[10] = 1.0F;
      GridModel tmp101_96 = tmp96_91;
      tmp101_96[11] = 0.0F;
      tmp101_96;
      AppMethodBeat.o(82071);
    }
    while (true)
    {
      return paramGridModel;
      float f1 = i / j;
      float f2 = paramInt5 / paramInt6;
      PointF localPointF1;
      PointF localPointF2;
      PointF localPointF3;
      PointF localPointF4;
      if (f1 > f2)
      {
        f2 = i / f2;
        localPointF1 = new PointF(0.0F, 0.5F + 0.5F * j / f2);
        localPointF2 = new PointF(0.0F, 0.5F - 0.5F * j / f2);
        localPointF3 = new PointF(1.0F, 0.5F - 0.5F * j / f2);
        localPointF4 = new PointF(1.0F, 0.5F * j / f2 + 0.5F);
        paramGridModel = new float[12];
        paramGridModel[0] = localPointF2.x;
        paramGridModel[1] = localPointF2.y;
        paramGridModel[2] = localPointF1.x;
        paramGridModel[3] = localPointF1.y;
        paramGridModel[4] = localPointF4.x;
        paramGridModel[5] = localPointF4.y;
        paramGridModel[6] = localPointF2.x;
        paramGridModel[7] = localPointF2.y;
        paramGridModel[8] = localPointF4.x;
        paramGridModel[9] = localPointF4.y;
        paramGridModel[10] = localPointF3.x;
        paramGridModel[11] = localPointF3.y;
        AppMethodBeat.o(82071);
      }
      else
      {
        f2 = j * f2;
        localPointF4 = new PointF(0.5F - 0.5F * i / f2, 1.0F);
        localPointF2 = new PointF(0.5F - 0.5F * i / f2, 0.0F);
        localPointF1 = new PointF(0.5F + 0.5F * i / f2, 0.0F);
        localPointF3 = new PointF(0.5F * i / f2 + 0.5F, 1.0F);
        paramGridModel = new float[12];
        paramGridModel[0] = localPointF2.x;
        paramGridModel[1] = localPointF2.y;
        paramGridModel[2] = localPointF4.x;
        paramGridModel[3] = localPointF4.y;
        paramGridModel[4] = localPointF3.x;
        paramGridModel[5] = localPointF3.y;
        paramGridModel[6] = localPointF2.x;
        paramGridModel[7] = localPointF2.y;
        paramGridModel[8] = localPointF3.x;
        paramGridModel[9] = localPointF3.y;
        paramGridModel[10] = localPointF1.x;
        paramGridModel[11] = localPointF1.y;
        AppMethodBeat.o(82071);
      }
    }
  }

  private float[] calculateVerPosTriangles(GridModel paramGridModel, int paramInt1, int paramInt2, float paramFloat)
  {
    AppMethodBeat.i(82070);
    float f1 = paramInt1 / paramInt2;
    Object localObject1;
    if ((Math.abs(f1 - paramFloat) < 0.0001D) || (paramGridModel.positionMode == 0))
      localObject1 = AlgoUtils.calPositionsTriangles(paramGridModel.canvasRect.x, paramGridModel.canvasRect.y, paramGridModel.canvasRect.x + paramGridModel.canvasRect.width, paramGridModel.canvasRect.y + paramGridModel.canvasRect.height, paramInt1, paramInt2);
    while (true)
    {
      Object localObject2 = localObject1;
      float f2;
      float f3;
      if (BitUtils.checkBit(paramGridModel.transformType, FabbyUtil.TRANSFORM_TYPE.MIRROR_TOP_BOTTOM.value))
      {
        f2 = localObject1[0];
        f3 = localObject1[1];
        f1 = localObject1[3];
        paramFloat = localObject1[4];
        localObject2 = new float[12];
        localObject2[0] = f2;
        localObject2[1] = f1;
        localObject2[2] = f2;
        localObject2[3] = f3;
        localObject2[4] = paramFloat;
        localObject2[5] = f3;
        localObject2[6] = f2;
        localObject2[7] = f1;
        localObject2[8] = paramFloat;
        localObject2[9] = f3;
        localObject2[10] = paramFloat;
        localObject2[11] = f1;
      }
      localObject1 = localObject2;
      if (BitUtils.checkBit(paramGridModel.transformType, FabbyUtil.TRANSFORM_TYPE.MIRROR_LEFT_RIGHT.value))
      {
        f1 = localObject2[0];
        f3 = localObject2[1];
        f2 = localObject2[3];
        paramFloat = localObject2[4];
        localObject1 = new float[12];
        localObject1[0] = paramFloat;
        localObject1[1] = f3;
        localObject1[2] = paramFloat;
        localObject1[3] = f2;
        localObject1[4] = f1;
        localObject1[5] = f2;
        localObject1[6] = paramFloat;
        localObject1[7] = f3;
        localObject1[8] = f1;
        localObject1[9] = f2;
        localObject1[10] = f1;
        localObject1[11] = f3;
      }
      AppMethodBeat.o(82070);
      return localObject1;
      if (f1 > paramFloat)
      {
        paramFloat = paramInt2 * paramFloat;
        f1 = (paramInt1 - paramFloat) / 2.0F;
        f1 = paramGridModel.canvasRect.x - f1;
        f2 = paramGridModel.canvasRect.y;
        localObject1 = AlgoUtils.calPositionsTriangles(f1, f2, paramGridModel.canvasRect.width + f1, paramGridModel.canvasRect.height + f2, (int)paramFloat, paramInt2);
      }
      else
      {
        paramFloat = paramInt1 / paramFloat;
        f2 = (paramInt2 - paramFloat) / 2.0F;
        f1 = paramGridModel.canvasRect.x;
        f2 = paramGridModel.canvasRect.y - f2;
        localObject1 = AlgoUtils.calPositionsTriangles(f1, f2, paramGridModel.canvasRect.width + f1, paramGridModel.canvasRect.height + f2, paramInt1, (int)paramFloat);
      }
    }
  }

  public void ApplyGLSLFilter()
  {
    AppMethodBeat.i(82074);
    this.mDrawFilter.ApplyGLSLFilter();
    AppMethodBeat.o(82074);
  }

  public void clearGLSLSelf()
  {
    AppMethodBeat.i(82072);
    this.mDrawFilter.clearGLSLSelf();
    AppMethodBeat.o(82072);
  }

  public RenderParam drawOnFrame(GridModel paramGridModel, h paramh, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(82069);
    if ((paramGridModel != null) && (paramGridModel.canvasRect != null))
    {
      RenderParam localRenderParam = new RenderParam();
      localRenderParam.texture = paramh.texture[0];
      localRenderParam.texCords = calculateTexPosTriangles(paramGridModel, paramInt1, paramInt2, paramGridModel.canvasRect.width, paramGridModel.canvasRect.height, paramh.width, paramh.height);
      localRenderParam.position = calculateVerPosTriangles(paramGridModel, paramInt1, paramInt2, paramh.width / paramh.height);
      localRenderParam.texScale = 1.0F;
      AppMethodBeat.o(82069);
      paramGridModel = localRenderParam;
    }
    while (true)
    {
      return paramGridModel;
      paramGridModel = null;
      AppMethodBeat.o(82069);
    }
  }

  public void setRenderMode(int paramInt)
  {
    AppMethodBeat.i(82073);
    this.mDrawFilter.setRenderMode(paramInt);
    AppMethodBeat.o(82073);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.filter.CanvasFilters
 * JD-Core Version:    0.6.2
 */