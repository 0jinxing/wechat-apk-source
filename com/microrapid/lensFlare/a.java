package com.microrapid.lensFlare;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import com.tencent.filter.BaseFilter;
import com.tencent.filter.GLSLRender;
import com.tencent.filter.QImage;
import com.tencent.filter.c;
import com.tencent.filter.h;
import com.tencent.filter.m;
import com.tencent.filter.m.a;
import com.tencent.filter.m.k;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.view.b;
import java.util.Map;

public final class a extends c
{
  private float param = 1.0F;
  private int type = 0;

  public final QImage ApplyFilter(QImage paramQImage)
  {
    AppMethodBeat.i(86249);
    while (true)
    {
      LensFlareHandle localLensFlareHandle;
      try
      {
        localLensFlareHandle = new com/microrapid/lensFlare/LensFlareHandle;
        localLensFlareHandle.<init>();
        localLensFlareHandle.bCm = 2;
        localLensFlareHandle.bCl = 1;
        localLensFlareHandle.vT();
        localLensFlareHandle.nativeUpdateOpType(localLensFlareHandle.bCj, 1);
        switch (this.type)
        {
        default:
          localObject1 = "lens/01star.jpg";
          localLensFlareHandle.vT();
          localObject3 = b.vt((String)localObject1);
          if (localObject3 != null)
          {
            localObject1 = QImage.BindBitmap((Bitmap)localObject3);
            localLensFlareHandle.nativeUpdatePatternImage(localLensFlareHandle.bCj, (QImage)localObject1);
            ((QImage)localObject1).UnBindBitmap((Bitmap)localObject3);
            ((Bitmap)localObject3).recycle();
          }
          float f = this.param;
          localLensFlareHandle.vT();
          localLensFlareHandle.nativeUpdateCrossNumStrength(localLensFlareHandle.bCj, 0.2F + 0.6F * f);
          f = this.param;
          localLensFlareHandle.vT();
          localLensFlareHandle.nativeUpdateCrossSizeStrength(localLensFlareHandle.bCj, 0.2F + 0.6F * f);
          localLensFlareHandle.vT();
          if (localLensFlareHandle.nativeGetPatternImage(localLensFlareHandle.bCj) != null)
          {
            if (localLensFlareHandle.bCl != 0)
              continue;
            if (!localLensFlareHandle.hasInit)
            {
              localLensFlareHandle.a(paramQImage);
              localLensFlareHandle.hasInit = true;
            }
            if (!localLensFlareHandle.nativeIsLightSourceExisted(localLensFlareHandle.bCj, paramQImage))
              continue;
            LensFlareHandle.bn("processLensImage 1");
            localObject3 = new float[2];
            localObject1 = localLensFlareHandle.nativePreProcessLensImgWithLightSource(localLensFlareHandle.bCj, paramQImage, (float[])localObject3);
            localLensFlareHandle.a((QImage)localObject1, localObject3[0], localObject3[1]);
            localLensFlareHandle.nativeBlurImage(localLensFlareHandle.bCj, (QImage)localObject1);
            localObject3 = paramQImage.CreateImageFromQImage();
            localLensFlareHandle.nativeLightSourceCrossImgSingle(localLensFlareHandle.bCj, (QImage)localObject3);
            localObject4 = Bitmap.createBitmap(((QImage)localObject1).getWidth(), ((QImage)localObject1).getHeight(), Bitmap.Config.ARGB_8888);
            ((QImage)localObject1).ToBitmap((Bitmap)localObject4);
            ((QImage)localObject1).Dispose();
            localObject1 = Bitmap.createBitmap(((QImage)localObject3).getWidth(), ((QImage)localObject3).getHeight(), Bitmap.Config.ARGB_8888);
            ((QImage)localObject3).ToBitmap((Bitmap)localObject1);
            ((QImage)localObject3).Dispose();
            localObject3 = new com/tencent/filter/BaseFilter;
            ((BaseFilter)localObject3).<init>(GLSLRender.bMx, GLSLRender.bLy);
            localObject5 = new com/tencent/filter/m$k;
            ((m.k)localObject5).<init>("inputImageTexture2", (Bitmap)localObject4, 33986, true);
            ((BaseFilter)localObject3).addParam((m)localObject5);
            localObject4 = new com/tencent/filter/m$k;
            ((m.k)localObject4).<init>("inputImageTexture3", (Bitmap)localObject1, 33987, true);
            ((BaseFilter)localObject3).addParam((m)localObject4);
            ((BaseFilter)localObject3).ApplyGLSLFilter(false, paramQImage.getWidth(), paramQImage.getHeight());
            localObject1 = new com/tencent/filter/h;
            ((h)localObject1).<init>();
            ((BaseFilter)localObject3).RendProcessImage(paramQImage, (h)localObject1);
            ((BaseFilter)localObject3).ClearGLSL();
            ((h)localObject1).clear();
          }
          localLensFlareHandle.dispose();
          return paramQImage;
        case 1:
          localObject1 = "lens/02star.jpg";
          break;
        case 2:
          localObject1 = "lens/03star.jpg";
          break;
        case 3:
          localObject1 = "lens/04star.jpg";
          break;
        case 4:
          localObject1 = "lens/05star.jpg";
          break;
        case 5:
          localObject1 = "lens/06sun.jpg";
          break;
        case 6:
          localObject1 = "lens/07sun.jpg";
          break;
        case 7:
        }
        Object localObject1 = "lens/08sun.jpg";
        continue;
        LensFlareHandle.bn("processLensImage 2");
        localObject1 = new float[2];
        localObject3 = localLensFlareHandle.nativePreProcessLensImgNoLightSource(localLensFlareHandle.bCj, paramQImage, (float[])localObject1);
        localLensFlareHandle.a((QImage)localObject3, localObject1[0], localObject1[1]);
        localObject1 = localLensFlareHandle.nativePostProcessForBg(localLensFlareHandle.bCj, (QImage)localObject3);
        ((QImage)localObject3).Dispose();
        localObject3 = Bitmap.createBitmap(((QImage)localObject1).getWidth(), ((QImage)localObject1).getHeight(), Bitmap.Config.ARGB_8888);
        ((QImage)localObject1).ToBitmap((Bitmap)localObject3);
        ((QImage)localObject1).Dispose();
        localObject1 = new com/tencent/filter/BaseFilter;
        ((BaseFilter)localObject1).<init>(GLSLRender.bMx, GLSLRender.bLz);
        localObject4 = new com/tencent/filter/m$k;
        ((m.k)localObject4).<init>("inputImageTexture2", (Bitmap)localObject3, 33986, true);
        ((BaseFilter)localObject1).addParam((m)localObject4);
        ((BaseFilter)localObject1).ApplyGLSLFilter(false, paramQImage.getWidth(), paramQImage.getHeight());
        localObject3 = new com/tencent/filter/h;
        ((h)localObject3).<init>();
        ((BaseFilter)localObject1).RendProcessImage(paramQImage, (h)localObject3);
        ((BaseFilter)localObject1).ClearGLSL();
        ((h)localObject3).clear();
        continue;
      }
      catch (Throwable localThrowable)
      {
        continue;
        if (!localLensFlareHandle.hasInit)
        {
          localLensFlareHandle.a(paramQImage);
          localLensFlareHandle.nativeRefineLabelmapEx(localLensFlareHandle.bCj);
          localLensFlareHandle.hasInit = true;
        }
        if (localLensFlareHandle.bCm == 2)
        {
          localLensFlareHandle.nativeLightSourceCrossImgTotalCPU(localLensFlareHandle.bCj, paramQImage);
          continue;
        }
      }
      finally
      {
        AppMethodBeat.o(86249);
      }
      Object localObject6 = new float[55];
      Object localObject7 = new float[55];
      Object localObject8 = new float[55];
      Object localObject9 = new float[55];
      Object localObject10 = new float[55];
      Object localObject11 = new float[55];
      Object localObject12 = new float[55];
      Object localObject13 = new float[55];
      Object localObject5 = new float[55];
      Object localObject4 = new float[55];
      Object localObject2 = new float[55];
      localLensFlareHandle.nativeAttachLightSourceCrossGPUOne(localLensFlareHandle.bCj, paramQImage, (float[])localObject6, (float[])localObject7, (float[])localObject8, (float[])localObject9, (float[])localObject10, (float[])localObject11, (float[])localObject12, (float[])localObject13, (float[])localObject5, (float[])localObject4, (float[])localObject2);
      Object localObject3 = localLensFlareHandle.nativeGetPatternImage(localLensFlareHandle.bCj);
      Object localObject14 = Bitmap.createBitmap(((QImage)localObject3).getWidth(), ((QImage)localObject3).getHeight(), Bitmap.Config.ARGB_8888);
      ((QImage)localObject3).ToBitmap((Bitmap)localObject14);
      localLensFlareHandle.nativeGrayProcess((Bitmap)localObject14);
      localObject3 = new com/tencent/filter/BaseFilter;
      ((BaseFilter)localObject3).<init>(GLSLRender.bLA);
      m.k localk = new com/tencent/filter/m$k;
      localk.<init>("inputImageTexture2", (Bitmap)localObject14, 33986, true);
      ((BaseFilter)localObject3).addParam(localk);
      localObject14 = new com/tencent/filter/m$a;
      ((m.a)localObject14).<init>("rlist", (float[])localObject6);
      ((BaseFilter)localObject3).addParam((m)localObject14);
      localObject6 = new com/tencent/filter/m$a;
      ((m.a)localObject6).<init>("glist", (float[])localObject7);
      ((BaseFilter)localObject3).addParam((m)localObject6);
      localObject7 = new com/tencent/filter/m$a;
      ((m.a)localObject7).<init>("blist", (float[])localObject8);
      ((BaseFilter)localObject3).addParam((m)localObject7);
      localObject8 = new com/tencent/filter/m$a;
      ((m.a)localObject8).<init>("offsetx_txlist", (float[])localObject9);
      ((BaseFilter)localObject3).addParam((m)localObject8);
      localObject9 = new com/tencent/filter/m$a;
      ((m.a)localObject9).<init>("offsety_tylist", (float[])localObject10);
      ((BaseFilter)localObject3).addParam((m)localObject9);
      localObject10 = new com/tencent/filter/m$a;
      ((m.a)localObject10).<init>("offsetx_rw_txlist", (float[])localObject11);
      ((BaseFilter)localObject3).addParam((m)localObject10);
      localObject11 = new com/tencent/filter/m$a;
      ((m.a)localObject11).<init>("offsety_rh_tylist", (float[])localObject12);
      ((BaseFilter)localObject3).addParam((m)localObject11);
      localObject12 = new com/tencent/filter/m$a;
      ((m.a)localObject12).<init>("alphaxlist", (float[])localObject13);
      ((BaseFilter)localObject3).addParam((m)localObject12);
      localObject13 = new com/tencent/filter/m$a;
      ((m.a)localObject13).<init>("alphaylist", (float[])localObject5);
      ((BaseFilter)localObject3).addParam((m)localObject13);
      localObject5 = new com/tencent/filter/m$a;
      ((m.a)localObject5).<init>("betaxlist", (float[])localObject4);
      ((BaseFilter)localObject3).addParam((m)localObject5);
      localObject4 = new com/tencent/filter/m$a;
      ((m.a)localObject4).<init>("betaylist", (float[])localObject2);
      ((BaseFilter)localObject3).addParam((m)localObject4);
      ((BaseFilter)localObject3).ApplyGLSLFilter(false, paramQImage.getWidth(), paramQImage.getHeight());
      LensFlareHandle.bn("processCrosssImage ApplyGLSLFilter ");
      localObject2 = new com/tencent/filter/h;
      ((h)localObject2).<init>();
      ((BaseFilter)localObject3).RendProcessImage(paramQImage, (h)localObject2);
      ((BaseFilter)localObject3).ClearGLSL();
      ((h)localObject2).clear();
    }
  }

  public final boolean isAdjustFilter()
  {
    return true;
  }

  public final void setAdjustParam(float paramFloat)
  {
    this.param = paramFloat;
  }

  public final void setParameterDic(Map<String, Object> paramMap)
  {
    AppMethodBeat.i(86248);
    if (paramMap.containsKey("filterAdjustParam"))
      this.param = ((Float)paramMap.get("filterAdjustParam")).floatValue();
    if (paramMap.containsKey("effectIndex"))
      this.type = ((Integer)paramMap.get("effectIndex")).intValue();
    AppMethodBeat.o(86248);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.microrapid.lensFlare.a
 * JD-Core Version:    0.6.2
 */