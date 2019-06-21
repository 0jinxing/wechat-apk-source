package com.tencent.ttpic;

import android.graphics.Bitmap;
import android.graphics.PointF;
import com.tencent.a.a;
import com.tencent.filter.BaseFilter;
import com.tencent.filter.GLSLRender;
import com.tencent.filter.e;
import com.tencent.filter.h;
import com.tencent.filter.m.o;
import com.tencent.filter.o;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.ttpic.baseutils.BitmapUtils;
import com.tencent.ttpic.baseutils.LogUtils;
import com.tencent.ttpic.factory.TTPicFilterFactoryLocal;
import com.tencent.ttpic.filter.AlphaAdjustFilter;
import com.tencent.ttpic.filter.FaceBeautysRealAutoFilter;
import com.tencent.ttpic.filter.FaceColorAndBrightnessFilter;
import com.tencent.ttpic.filter.NewFaceColorFilter;
import com.tencent.ttpic.filter.ThinBodyFilter;
import com.tencent.ttpic.filter.ThinShoulderFilter;
import com.tencent.ttpic.manager.FeatureManager;
import com.tencent.ttpic.model.CameraFilterParamSDK;
import com.tencent.ttpic.util.FrameUtil;
import com.tencent.ttpic.util.VideoGlobalContext;
import java.util.List;
import java.util.Map;

public class PTFilter
{
  protected BaseFilter mFilter;
  protected h mFilterFrame;

  static
  {
    AppMethodBeat.i(80708);
    if (FeatureManager.isFilterReady());
    while (true)
    {
      try
      {
        FeatureManager.loadLibrary("image_filter_cpu");
        AppMethodBeat.o(80708);
        return;
      }
      catch (UnsatisfiedLinkError localUnsatisfiedLinkError)
      {
        LogUtils.e(localUnsatisfiedLinkError);
        AppMethodBeat.o(80708);
        continue;
      }
      catch (RuntimeException localRuntimeException)
      {
        LogUtils.e(localRuntimeException);
        AppMethodBeat.o(80708);
        continue;
      }
      catch (Exception localException)
      {
        LogUtils.e(localException);
      }
      AppMethodBeat.o(80708);
    }
  }

  public PTFilter()
  {
    AppMethodBeat.i(80695);
    this.mFilter = new BaseFilter(GLSLRender.bJB);
    this.mFilterFrame = new h();
    AppMethodBeat.o(80695);
  }

  @Deprecated
  public static PTFilter createByFile(String paramString)
  {
    return null;
  }

  public static PTFilter createById(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(80696);
    PTFilter localPTFilter = new PTFilter();
    localPTFilter.mFilter = a.createFilter(paramInt1);
    localPTFilter.mFilter.needFlipBlend = true;
    localPTFilter.mFilter.setSrcFilterIndex(-1);
    localPTFilter.mFilter.setEffectIndex(paramInt2);
    AppMethodBeat.o(80696);
    return localPTFilter;
  }

  public static PTFilter createByLut(String paramString)
  {
    AppMethodBeat.i(80697);
    PTFilter localPTFilter = new PTFilter();
    Bitmap localBitmap1 = BitmapUtils.decodeSampleBitmap(VideoGlobalContext.getContext(), paramString, 1);
    Bitmap localBitmap2 = localBitmap1;
    if (localBitmap1 == null)
      localBitmap2 = TTPicFilterFactoryLocal.getBitmapFromEncryptedFile(paramString);
    localPTFilter.mFilter = TTPicFilterFactoryLocal.lutFilterWithBitmap(localBitmap2);
    if (localPTFilter.mFilter == null)
    {
      paramString = null;
      AppMethodBeat.o(80697);
    }
    while (true)
    {
      return paramString;
      localPTFilter.mFilter.needFlipBlend = true;
      localPTFilter.mFilter.setSrcFilterIndex(-1);
      localPTFilter.mFilterFrame = new h();
      AppMethodBeat.o(80697);
      paramString = localPTFilter;
    }
  }

  public static PTFilter createCopyFilter()
  {
    AppMethodBeat.i(80700);
    PTFilter.PTCopyFilter localPTCopyFilter = new PTFilter.PTCopyFilter();
    AppMethodBeat.o(80700);
    return localPTCopyFilter;
  }

  public static PTFilter createCurve2D(String paramString)
  {
    AppMethodBeat.i(80698);
    paramString = createCurve2D(paramString, null);
    AppMethodBeat.o(80698);
    return paramString;
  }

  public static PTFilter createCurve2D(String paramString, float[] paramArrayOfFloat)
  {
    AppMethodBeat.i(80699);
    PTFilter localPTFilter = new PTFilter();
    paramString = new e(paramString);
    if (paramArrayOfFloat != null)
      paramString.setMatrix(paramArrayOfFloat);
    localPTFilter.mFilter = paramString;
    localPTFilter.mFilter.needFlipBlend = true;
    localPTFilter.mFilter.setSrcFilterIndex(-1);
    localPTFilter.mFilterFrame = new h();
    AppMethodBeat.o(80699);
    return localPTFilter;
  }

  public static PTFilter createYUV2RGBAFilter()
  {
    AppMethodBeat.i(80701);
    PTFilter localPTFilter = new PTFilter();
    localPTFilter.mFilter = new o();
    AppMethodBeat.o(80701);
    return localPTFilter;
  }

  public void destroy()
  {
    AppMethodBeat.i(80703);
    this.mFilter.ClearGLSL();
    this.mFilterFrame.clear();
    AppMethodBeat.o(80703);
  }

  public BaseFilter getFilter()
  {
    return this.mFilter;
  }

  public int init()
  {
    AppMethodBeat.i(80702);
    this.mFilter.ApplyGLSLFilter(true, 1.0F, 1.0F);
    AppMethodBeat.o(80702);
    return 0;
  }

  public h process(h paramh)
  {
    AppMethodBeat.i(80704);
    this.mFilter.RenderProcess(paramh.texture[0], paramh.width, paramh.height, -1, 0.0D, this.mFilterFrame);
    paramh = FrameUtil.getLastRenderFrame(this.mFilterFrame);
    AppMethodBeat.o(80704);
    return paramh;
  }

  public h process(h paramh, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(80705);
    this.mFilter.RenderProcess(paramh.texture[0], paramInt1, paramInt2, -1, 0.0D, this.mFilterFrame);
    paramh = FrameUtil.getLastRenderFrame(this.mFilterFrame);
    AppMethodBeat.o(80705);
    return paramh;
  }

  public void processToScreen(h paramh, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(80706);
    this.mFilter.RenderProcess(paramh.texture[0], paramInt1, paramInt2, 0, 0.0D, this.mFilterFrame);
    AppMethodBeat.o(80706);
  }

  public void setFilter(BaseFilter paramBaseFilter)
  {
    this.mFilter = paramBaseFilter;
  }

  public void setRenderMode(int paramInt)
  {
    AppMethodBeat.i(80707);
    this.mFilter.setRenderMode(paramInt);
    AppMethodBeat.o(80707);
  }

  public static class PTAlphaFilter extends PTFilter
  {
    public PTAlphaFilter()
    {
      AppMethodBeat.i(80646);
      this.mFilter = new AlphaAdjustFilter();
      AppMethodBeat.o(80646);
    }

    public int init()
    {
      AppMethodBeat.i(80647);
      int i = super.init();
      this.mFilter.setAdjustParam(0.0F);
      this.mFilter.ApplyGLSLFilter(true, 0.0F, 0.0F);
      AppMethodBeat.o(80647);
      return i;
    }
  }

  public static class PTFaceColorAndBrightnessFilter extends PTFilter
  {
    public PTFaceColorAndBrightnessFilter()
    {
      AppMethodBeat.i(80654);
      this.mFilter = new FaceColorAndBrightnessFilter();
      AppMethodBeat.o(80654);
    }

    public void updateCurve(int[] paramArrayOfInt, boolean paramBoolean)
    {
      AppMethodBeat.i(80655);
      ((FaceColorAndBrightnessFilter)this.mFilter).updateCurve(paramArrayOfInt, paramBoolean);
      AppMethodBeat.o(80655);
    }
  }

  public static class PTNewFaceColorFilter extends PTFilter
  {
    public PTNewFaceColorFilter()
    {
      AppMethodBeat.i(80662);
      this.mFilter = new NewFaceColorFilter();
      AppMethodBeat.o(80662);
    }

    public int init()
    {
      AppMethodBeat.i(80663);
      int i = super.init();
      new m.o("inputImageTexture2", "sh/facecolor_b.png", 33986).initialParams(this.mFilter.getmProgramIds());
      AppMethodBeat.o(80663);
      return i;
    }
  }

  public static class PTSmoothSkin extends PTFilter
  {
    private CameraFilterParamSDK mBeautyParam;

    public PTSmoothSkin()
    {
      AppMethodBeat.i(80676);
      this.mFilter = new FaceBeautysRealAutoFilter();
      this.mBeautyParam = new CameraFilterParamSDK();
      setBeautyLevel(1);
      AppMethodBeat.o(80676);
    }

    public int getBeautyLevel()
    {
      return this.mBeautyParam.smoothLevel;
    }

    public void setBeautyLevel(int paramInt)
    {
      AppMethodBeat.i(80677);
      this.mBeautyParam.smoothLevel = paramInt;
      Map localMap = this.mBeautyParam.getSmoothMap();
      this.mFilter.setParameterDic(localMap);
      AppMethodBeat.o(80677);
    }
  }

  public static class PTThinBodyFilter extends PTFilter
  {
    private boolean enable;
    private ThinBodyFilter mThinBodyFilter;
    private h mThinBodyFrame;
    private float strength;

    public PTThinBodyFilter()
    {
      AppMethodBeat.i(80678);
      this.mThinBodyFilter = new ThinBodyFilter();
      this.mThinBodyFrame = new h();
      this.enable = true;
      this.strength = 0.0F;
      AppMethodBeat.o(80678);
    }

    public void destroy()
    {
      AppMethodBeat.i(80684);
      this.mThinBodyFilter.clearGLSLSelf();
      this.mThinBodyFrame.clear();
      super.destroy();
      AppMethodBeat.o(80684);
    }

    public float getStrength()
    {
      return this.strength;
    }

    public int init()
    {
      AppMethodBeat.i(80679);
      int i = super.init();
      this.mThinBodyFilter.ApplyGLSLFilter();
      AppMethodBeat.o(80679);
      return i;
    }

    public boolean isEnable()
    {
      return this.enable;
    }

    public h process(h paramh, int paramInt1, int paramInt2)
    {
      AppMethodBeat.i(80682);
      if (this.enable)
      {
        this.mThinBodyFilter.RenderProcess(paramh.texture[0], paramInt1, paramInt2, -1, 0.0D, this.mThinBodyFrame);
        paramh = this.mThinBodyFrame;
        AppMethodBeat.o(80682);
      }
      while (true)
      {
        return paramh;
        AppMethodBeat.o(80682);
      }
    }

    public void setBodyPoints(List<PointF> paramList, int paramInt1, int paramInt2)
    {
      AppMethodBeat.i(80681);
      if ((paramList != null) && (paramList.size() > 0))
        this.mThinBodyFilter.setupBodyPoints(paramList, paramInt1, paramInt2);
      AppMethodBeat.o(80681);
    }

    public void setEnable(boolean paramBoolean)
    {
      AppMethodBeat.i(80680);
      this.mThinBodyFilter.setShowMark(true);
      this.mThinBodyFilter.setEnable(paramBoolean);
      this.enable = paramBoolean;
      AppMethodBeat.o(80680);
    }

    public void setStrength(float paramFloat)
    {
      AppMethodBeat.i(80683);
      this.mThinBodyFilter.setStrength(paramFloat);
      this.strength = paramFloat;
      AppMethodBeat.o(80683);
    }
  }

  public static class PTThinShoulderFilter extends PTFilter
  {
    private boolean enable;
    private ThinShoulderFilter mThinShoulderFilter;
    private h mThinShoulderFrame;
    private float strength;

    public PTThinShoulderFilter()
    {
      AppMethodBeat.i(80685);
      this.mThinShoulderFilter = new ThinShoulderFilter();
      this.mThinShoulderFrame = new h();
      this.enable = true;
      this.strength = 0.0F;
      AppMethodBeat.o(80685);
    }

    public void destroy()
    {
      AppMethodBeat.i(80691);
      this.mThinShoulderFilter.clearGLSLSelf();
      this.mThinShoulderFrame.clear();
      super.destroy();
      AppMethodBeat.o(80691);
    }

    public float getStrength()
    {
      return this.strength;
    }

    public int init()
    {
      AppMethodBeat.i(80686);
      int i = super.init();
      this.mThinShoulderFilter.ApplyGLSLFilter();
      AppMethodBeat.o(80686);
      return i;
    }

    public boolean isEnable()
    {
      return this.enable;
    }

    public h process(h paramh, int paramInt1, int paramInt2)
    {
      AppMethodBeat.i(80689);
      if (this.enable)
      {
        this.mThinShoulderFilter.RenderProcess(paramh.texture[0], paramInt1, paramInt2, -1, 0.0D, this.mThinShoulderFrame);
        paramh = this.mThinShoulderFrame;
        AppMethodBeat.o(80689);
      }
      while (true)
      {
        return paramh;
        AppMethodBeat.o(80689);
      }
    }

    public boolean setBodyPoints(List<PointF> paramList, int paramInt1, int paramInt2)
    {
      AppMethodBeat.i(80688);
      boolean bool = this.mThinShoulderFilter.setupBodyPoints(paramList, paramInt1, paramInt2);
      AppMethodBeat.o(80688);
      return bool;
    }

    public void setEnable(boolean paramBoolean)
    {
      AppMethodBeat.i(80687);
      this.mThinShoulderFilter.setShowMark(true);
      this.mThinShoulderFilter.setEnable(paramBoolean);
      this.enable = paramBoolean;
      AppMethodBeat.o(80687);
    }

    public void setStrength(float paramFloat)
    {
      AppMethodBeat.i(80690);
      this.mThinShoulderFilter.setStrength(paramFloat);
      this.strength = paramFloat;
      AppMethodBeat.o(80690);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.PTFilter
 * JD-Core Version:    0.6.2
 */