package com.tencent.ttpic.filter;

import android.graphics.PointF;
import com.tencent.filter.BaseFilter;
import com.tencent.filter.GLSLRender;
import com.tencent.filter.h;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.ttpic.factory.ShakaFilterFactory;
import com.tencent.ttpic.gles.GlUtil;
import com.tencent.ttpic.model.GridModel;
import com.tencent.ttpic.model.GridSettingModel;
import com.tencent.ttpic.model.Rect;
import com.tencent.ttpic.model.ShakaEffectItem;
import com.tencent.ttpic.util.BenchUtil;
import com.tencent.ttpic.util.FrameUtil;
import com.tencent.ttpic.util.VideoFilterFactory;
import com.tencent.ttpic.util.VideoFilterUtil;
import com.tencent.ttpic.util.VideoFrameUtil;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class FabbyMvFilter
{
  public StaticStickerFilter bgFilter;
  public StaticStickerFilter coverFilter;
  private FastRenderFilter fastRenderFilter;
  public StaticStickerFilter fgFilter;
  private GridEffectFilter gridEffectFilter;
  private CanvasFilters mCanvasFilters;
  private BaseFilter mCopyFilter;
  private h[] mCopyFrame;
  public BaseFilter mEffectFilter;
  private h mFilterFrame;
  private h mGridFrame;
  private h mLastRenderFrame;
  private BaseFilter mMaskFilter;
  private h mMotionBlurFrame;
  private h mRotateScaleFrame;
  public ShakaFilterBase mShakaFilter;
  private h mShakaFrame;
  private ShakaMotionBlurFilter motionBlurFilter;
  public FabbyMvPart mvPart;
  private float progress;
  private RotateScaleFilter rotateScaleFilter;
  private long startTimeStamp;

  public FabbyMvFilter()
  {
    AppMethodBeat.i(82264);
    this.mMaskFilter = new BaseFilter(VideoFilterFactory.FRAGMENT_SHADER_MASK);
    this.mCopyFilter = new BaseFilter(GLSLRender.bJB);
    this.mCanvasFilters = new CanvasFilters();
    this.fastRenderFilter = new FastRenderFilter();
    this.gridEffectFilter = new GridEffectFilter();
    this.rotateScaleFilter = new RotateScaleFilter();
    this.motionBlurFilter = new ShakaMotionBlurFilter();
    this.startTimeStamp = -1L;
    this.mRotateScaleFrame = new h();
    this.mMotionBlurFrame = new h();
    this.mGridFrame = new h();
    this.mCopyFrame = new h[2];
    this.mShakaFrame = new h();
    this.mFilterFrame = new h();
    AppMethodBeat.o(82264);
  }

  private boolean isRenderReady()
  {
    boolean bool1 = true;
    AppMethodBeat.i(82266);
    boolean bool2;
    if (this.bgFilter != null)
      if (this.bgFilter.isRenderReady())
        bool2 = true;
    while (true)
    {
      boolean bool3 = bool2;
      if (this.coverFilter != null)
      {
        if ((bool2) && (this.coverFilter.isRenderReady()))
          bool3 = true;
      }
      else
      {
        label51: if (this.fgFilter == null)
          break label96;
        if ((!bool3) || (!this.fgFilter.isRenderReady()))
          break label91;
        bool2 = bool1;
      }
      while (true)
      {
        AppMethodBeat.o(82266);
        return bool2;
        bool2 = false;
        break;
        bool3 = false;
        break label51;
        label91: bool2 = false;
        continue;
        label96: bool2 = bool3;
      }
      bool2 = true;
    }
  }

  private void mergeFrame(h paramh1, h paramh2)
  {
    AppMethodBeat.i(82282);
    paramh1.a(-1, paramh1.width, paramh1.height, 0.0D);
    GlUtil.setBlendMode(true);
    this.mMaskFilter.OnDrawFrameGLSL();
    this.mMaskFilter.renderTexture(paramh2.texture[0], paramh2.width, paramh2.height);
    GlUtil.setBlendMode(false);
    AppMethodBeat.o(82282);
  }

  private boolean needMotionBlur(float paramFloat)
  {
    AppMethodBeat.i(82268);
    boolean bool;
    if (Float.compare(paramFloat, 0.0F) != 0)
    {
      bool = true;
      AppMethodBeat.o(82268);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(82268);
    }
  }

  private boolean needTransform(double paramDouble1, double paramDouble2, double paramDouble3, PointF paramPointF1, PointF paramPointF2)
  {
    AppMethodBeat.i(82269);
    boolean bool;
    if ((Double.compare(paramDouble1, 1.0D) != 0) || (paramDouble2 % 360.0D != 0.0D) || (Double.compare(paramDouble3, 1.0D) != 0) || (Float.compare(paramPointF1.x, 0.0F) != 0) || (Float.compare(paramPointF1.y, 0.0F) != 0) || (Float.compare(paramPointF2.x, 0.0F) != 0) || (Float.compare(paramPointF2.y, 0.0F) != 0))
    {
      bool = true;
      AppMethodBeat.o(82269);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(82269);
    }
  }

  private h renderForStaticFilters(h paramh, StaticStickerFilter paramStaticStickerFilter)
  {
    AppMethodBeat.i(82278);
    paramh.a(-1, paramh.width, paramh.height, 0.0D);
    if ((paramStaticStickerFilter == null) || (!paramStaticStickerFilter.isRenderReady()))
    {
      AppMethodBeat.o(82278);
      return paramh;
    }
    paramStaticStickerFilter.updateVideoSize(paramh.width, paramh.height, 0.0D);
    h localh1;
    if (paramh.texture[0] == this.mCopyFrame[0].texture[0])
    {
      localh1 = this.mCopyFrame[1];
      label77: paramh.a(-1, paramh.width, paramh.height, 0.0D);
      GlUtil.setBlendMode(true);
      if (VideoFilterUtil.canUseBlendMode(paramStaticStickerFilter))
        break label231;
      if (!VideoFilterUtil.needCopy(paramStaticStickerFilter))
        break label268;
    }
    label268: for (h localh2 = FrameUtil.renderProcessBySwitchFbo(paramh.texture[0], paramh.width, paramh.height, this.mCopyFilter, paramh, localh1); ; localh2 = paramh)
    {
      BenchUtil.benchStart("[showPreview]renderProcessBySwitchFbo " + paramStaticStickerFilter.getClass().getName());
      paramh = VideoFrameUtil.renderProcessBySwitchFbo(localh2.texture[0], localh2.width, localh2.height, paramStaticStickerFilter, paramh, localh1);
      BenchUtil.benchEnd("[showPreview]renderProcessBySwitchFbo " + paramStaticStickerFilter.getClass().getName());
      while (true)
      {
        GlUtil.setBlendMode(false);
        AppMethodBeat.o(82278);
        break;
        localh1 = this.mCopyFrame[0];
        break label77;
        label231: BenchUtil.benchStart("[showPreview]OnDrawFrameGLSL");
        paramStaticStickerFilter.OnDrawFrameGLSL();
        paramStaticStickerFilter.renderTexture(paramh.texture[0], paramh.width, paramh.height);
        BenchUtil.benchEnd("[showPreview]OnDrawFrameGLSL");
      }
    }
  }

  private h updateAndRenderCameraFrame(h paramh, float paramFloat)
  {
    AppMethodBeat.i(82267);
    h localh = updateAndRenderShakaEffect(paramh, paramFloat);
    double d1 = this.mvPart.getScale(paramFloat);
    double d2 = this.mvPart.getDegree(paramFloat);
    double d3 = this.mvPart.getAlpha(paramFloat);
    Object localObject = this.mvPart.getAnchor(paramFloat);
    PointF localPointF = this.mvPart.getTranslate(paramFloat);
    double d4 = this.mvPart.getBlurSize(paramFloat);
    double d5 = this.mvPart.getBlurAngle(paramFloat);
    this.rotateScaleFilter.updateParams((float)d1, (float)(3.141592653589793D * d2 / 180.0D), (float)d3, (PointF)localObject, localPointF, new PointF(localh.width, localh.height));
    this.motionBlurFilter.updateParams((float)d4, (float)d5, localh.width, localh.height);
    if (needTransform(d1, d2, d3, (PointF)localObject, localPointF))
    {
      FrameUtil.clearFrame(this.mRotateScaleFrame, 0.0F, 0.0F, 0.0F, 0.0F, localh.width, localh.height);
      this.rotateScaleFilter.RenderProcess(localh.texture[0], localh.width, localh.height, -1, 0.0D, this.mRotateScaleFrame);
      localh = this.mRotateScaleFrame;
    }
    while (true)
    {
      localObject = localh;
      if (needMotionBlur((float)d4))
      {
        FrameUtil.clearFrame(this.mMotionBlurFrame, 0.0F, 0.0F, 0.0F, 0.0F, localh.width, localh.height);
        this.motionBlurFilter.RenderProcess(localh.texture[0], localh.width, localh.height, -1, 0.0D, this.mMotionBlurFrame);
        localObject = FrameUtil.getLastRenderFrame(this.mMotionBlurFrame);
      }
      if (paramh != localObject)
        this.mCopyFilter.RenderProcess(localObject.texture[0], ((h)localObject).width, ((h)localObject).height, -1, 0.0D, paramh);
      AppMethodBeat.o(82267);
      return paramh;
    }
  }

  private h updateAndRenderFilterEffect(h paramh, float paramFloat)
  {
    AppMethodBeat.i(82271);
    int i;
    if (this.mvPart.getFilterParam(paramFloat) != 0)
    {
      i = 1;
      if ((this.mEffectFilter != null) && (i != 0))
        break label43;
      AppMethodBeat.o(82271);
    }
    while (true)
    {
      return paramh;
      i = 0;
      break;
      label43: this.mEffectFilter.RenderProcess(paramh.texture[0], paramh.width, paramh.height, -1, 0.0D, this.mFilterFrame);
      paramh = FrameUtil.getLastRenderFrame(this.mFilterFrame);
      AppMethodBeat.o(82271);
    }
  }

  private h updateAndRenderGrid(h paramh1, h paramh2, float paramFloat)
  {
    AppMethodBeat.i(82272);
    this.gridEffectFilter.setGridType(this.mvPart.getGridType(paramFloat));
    paramh1.a(-1, paramh1.width, paramh1.height, 0.0D);
    GlUtil.setBlendMode(true);
    this.gridEffectFilter.OnDrawFrameGLSL();
    this.gridEffectFilter.renderTexture(paramh2.texture[0], paramh2.width, paramh2.height);
    GlUtil.setBlendMode(false);
    AppMethodBeat.o(82272);
    return paramh1;
  }

  private h updateAndRenderShakaEffect(h paramh, float paramFloat)
  {
    AppMethodBeat.i(82270);
    if (this.mShakaFilter == null)
      AppMethodBeat.o(82270);
    while (true)
    {
      return paramh;
      Map localMap = this.mvPart.getShakaValueMap(paramFloat);
      this.mShakaFilter.setParameters(localMap);
      FrameUtil.clearFrame(this.mShakaFrame, 0.0F, 0.0F, 0.0F, 0.0F, paramh.width, paramh.height);
      this.mShakaFilter.RenderProcess(paramh.texture[0], paramh.width, paramh.height, -1, 0.0D, this.mShakaFrame);
      paramh = this.mShakaFrame;
      AppMethodBeat.o(82270);
    }
  }

  public void ApplyGLSLFilter()
  {
    AppMethodBeat.i(82279);
    if (this.bgFilter != null)
      this.bgFilter.ApplyGLSLFilter();
    if (this.fgFilter != null)
      this.fgFilter.ApplyGLSLFilter();
    if (this.coverFilter != null)
      this.coverFilter.ApplyGLSLFilter();
    this.mCopyFilter.ApplyGLSLFilter();
    this.mCanvasFilters.ApplyGLSLFilter();
    this.gridEffectFilter.ApplyGLSLFilter();
    this.rotateScaleFilter.ApplyGLSLFilter();
    this.mMaskFilter.ApplyGLSLFilter();
    if (this.mvPart.getShakaEffectItem() != null)
    {
      this.mShakaFilter = ShakaFilterFactory.create(this.mvPart.getShakaEffectItem().getFilterType());
      if (this.mShakaFilter != null)
        this.mShakaFilter.ApplyGLSLFilter();
    }
    if (this.mEffectFilter != null)
      this.mEffectFilter.ApplyGLSLFilter(false, 0.0F, 0.0F);
    for (int i = 0; i < this.mCopyFrame.length; i++)
      this.mCopyFrame[i] = new h();
    this.motionBlurFilter.ApplyGLSLFilter(false, 0.0F, 0.0F);
    this.fastRenderFilter.applyGLSLFilter();
    AppMethodBeat.o(82279);
  }

  public void clear()
  {
    AppMethodBeat.i(82281);
    if (this.bgFilter != null)
      this.bgFilter.clearGLSLSelf();
    if (this.fgFilter != null)
      this.fgFilter.clearGLSLSelf();
    if (this.coverFilter != null)
      this.coverFilter.clearGLSLSelf();
    if (this.mEffectFilter != null)
      this.mEffectFilter.clearGLSLSelf();
    this.gridEffectFilter.clearGLSLSelf();
    this.rotateScaleFilter.clearGLSLSelf();
    this.mMaskFilter.clearGLSLSelf();
    this.mCopyFilter.clearGLSLSelf();
    this.mCanvasFilters.clearGLSLSelf();
    this.motionBlurFilter.ClearGLSL();
    h[] arrayOfh = this.mCopyFrame;
    int i = arrayOfh.length;
    for (int j = 0; j < i; j++)
      arrayOfh[j].clear();
    this.mShakaFrame.clear();
    this.mMotionBlurFrame.clear();
    this.mRotateScaleFrame.clear();
    this.mFilterFrame.clear();
    if (this.mLastRenderFrame != null)
      this.mLastRenderFrame.clear();
    this.fastRenderFilter.clearGLSLSelf();
    if (this.mGridFrame != null)
      this.mGridFrame.clear();
    AppMethodBeat.o(82281);
  }

  public Map<Integer, PointF> getGridScaleMap()
  {
    AppMethodBeat.i(82284);
    HashMap localHashMap = new HashMap();
    if (this.mvPart.getGridType(this.progress) == 6)
    {
      GridSettingModel localGridSettingModel = this.mvPart.getGridSetting(this.progress);
      if (localGridSettingModel != null)
      {
        Iterator localIterator = localGridSettingModel.canvasRectList.iterator();
        while (localIterator.hasNext())
        {
          GridModel localGridModel = (GridModel)localIterator.next();
          float f = Math.min(Math.max(localGridModel.canvasRect.width / localGridSettingModel.canvasRect.width, localGridModel.canvasRect.height / localGridSettingModel.canvasRect.height), 1.0F);
          PointF localPointF;
          if (localHashMap.get(Integer.valueOf(localGridModel.renderId)) != null)
          {
            localPointF = (PointF)localHashMap.get(Integer.valueOf(localGridModel.renderId));
            if ((localPointF.x < f) || (localPointF.y < f))
            {
              localPointF.x = f;
              localPointF.y = f;
              localHashMap.put(Integer.valueOf(localGridModel.renderId), localPointF);
            }
          }
          else
          {
            localPointF = new PointF(f, f);
            localHashMap.put(Integer.valueOf(localGridModel.renderId), localPointF);
          }
        }
      }
    }
    else
    {
      localHashMap.put(Integer.valueOf(0), new PointF(1.0F, 1.0F));
    }
    AppMethodBeat.o(82284);
    return localHashMap;
  }

  public h getLastRenderFrame()
  {
    return this.mLastRenderFrame;
  }

  public long getTimestamp()
  {
    return this.startTimeStamp;
  }

  public h renderBgFilter(h paramh)
  {
    AppMethodBeat.i(82275);
    paramh = renderForStaticFilters(paramh, this.bgFilter);
    AppMethodBeat.o(82275);
    return paramh;
  }

  public h renderCoverFilter(h paramh)
  {
    AppMethodBeat.i(82276);
    paramh = renderForStaticFilters(paramh, this.coverFilter);
    AppMethodBeat.o(82276);
    return paramh;
  }

  public h renderFgFilter(h paramh)
  {
    AppMethodBeat.i(82277);
    paramh = renderForStaticFilters(paramh, this.fgFilter);
    AppMethodBeat.o(82277);
    return paramh;
  }

  public void reset()
  {
    AppMethodBeat.i(82273);
    this.startTimeStamp = -1L;
    if (this.bgFilter != null)
      this.bgFilter.resetFabbyProgress();
    if (this.fgFilter != null)
      this.fgFilter.resetFabbyProgress();
    if (this.coverFilter != null)
      this.coverFilter.resetFabbyProgress();
    AppMethodBeat.o(82273);
  }

  public void setRenderMode(int paramInt)
  {
    AppMethodBeat.i(82280);
    if (this.bgFilter != null)
      VideoFilterUtil.setRenderMode(this.bgFilter, paramInt);
    if (this.fgFilter != null)
      VideoFilterUtil.setRenderMode(this.fgFilter, paramInt);
    if (this.coverFilter != null)
      VideoFilterUtil.setRenderMode(this.coverFilter, paramInt);
    if (this.mEffectFilter != null)
      VideoFilterUtil.setRenderMode(this.mEffectFilter, paramInt);
    VideoFilterUtil.setRenderMode(this.gridEffectFilter, paramInt);
    VideoFilterUtil.setRenderMode(this.rotateScaleFilter, paramInt);
    this.mCanvasFilters.setRenderMode(paramInt);
    AppMethodBeat.o(82280);
  }

  public h updateAndRender(h paramh, Map<Integer, h> paramMap, long paramLong)
  {
    AppMethodBeat.i(82265);
    if (!isRenderReady())
    {
      AppMethodBeat.o(82265);
      return paramh;
    }
    if (this.mvPart.getGridType(this.progress) == 6)
    {
      i = this.mvPart.getGridOrder(this.progress);
      BenchUtil.benchStart("[showPreview][FABBY] bg");
      Object localObject1 = renderBgFilter(paramh);
      BenchUtil.benchEnd("[showPreview][FABBY] bg");
      this.mCopyFilter.RenderProcess(localObject1.texture[0], ((h)localObject1).width, ((h)localObject1).height, -1, 0.0D, this.mGridFrame);
      Object localObject2;
      Object localObject3;
      Object localObject4;
      if (i == 0)
      {
        BenchUtil.benchStart("[showPreview][FABBY] grid");
        paramh = new ArrayList();
        localObject1 = this.mvPart.getGridSetting(this.progress);
        if (localObject1 != null)
        {
          localObject2 = ((GridSettingModel)localObject1).canvasRectList.iterator();
          while (((Iterator)localObject2).hasNext())
          {
            localObject3 = (GridModel)((Iterator)localObject2).next();
            if (paramMap.containsKey(Integer.valueOf(((GridModel)localObject3).renderId)))
            {
              localObject4 = updateAndRenderCameraFrame((h)paramMap.get(Integer.valueOf(((GridModel)localObject3).renderId)), this.progress);
              localObject4 = this.mCanvasFilters.drawOnFrame((GridModel)localObject3, (h)localObject4, ((GridSettingModel)localObject1).canvasRect.width, ((GridSettingModel)localObject1).canvasRect.height);
              if (localObject4 != null)
                paramh.add(localObject4);
            }
          }
        }
        GlUtil.setBlendMode(true);
        this.fastRenderFilter.render(paramh, this.mGridFrame);
        GlUtil.setBlendMode(false);
        paramh = this.mGridFrame;
        BenchUtil.benchEnd("[showPreview][FABBY] grid");
      }
      while (true)
      {
        BenchUtil.benchStart("[showPreview][FABBY] cover");
        paramh = renderCoverFilter(paramh);
        BenchUtil.benchEnd("[showPreview][FABBY] cover");
        BenchUtil.benchStart("[showPreview][FABBY] fg");
        paramh = renderFgFilter(paramh);
        BenchUtil.benchEnd("[showPreview][FABBY] fg");
        BenchUtil.benchStart("[showPreview][FABBY] effect");
        paramh = updateAndRenderFilterEffect(paramh, this.progress);
        BenchUtil.benchEnd("[showPreview][FABBY] effect");
        this.mLastRenderFrame = paramh;
        AppMethodBeat.o(82265);
        break;
        if (i == 1)
        {
          BenchUtil.benchStart("[showPreview][FABBY] grid");
          paramh = new ArrayList();
          localObject2 = this.mvPart.getGridSetting(this.progress);
          if (localObject2 != null)
          {
            localObject1 = ((GridSettingModel)localObject2).canvasRectList.iterator();
            while (((Iterator)localObject1).hasNext())
            {
              localObject4 = (GridModel)((Iterator)localObject1).next();
              if (paramMap.containsKey(Integer.valueOf(((GridModel)localObject4).renderId)))
              {
                localObject3 = (h)paramMap.get(Integer.valueOf(((GridModel)localObject4).renderId));
                localObject4 = this.mCanvasFilters.drawOnFrame((GridModel)localObject4, (h)localObject3, ((GridSettingModel)localObject2).canvasRect.width, ((GridSettingModel)localObject2).canvasRect.height);
                if (localObject4 != null)
                  paramh.add(localObject4);
              }
            }
          }
          GlUtil.setBlendMode(true);
          this.fastRenderFilter.render(paramh, this.mGridFrame);
          GlUtil.setBlendMode(false);
          paramh = updateAndRenderCameraFrame(this.mGridFrame, this.progress);
          BenchUtil.benchEnd("[showPreview][FABBY] grid");
        }
      }
    }
    paramMap = (h)paramMap.values().iterator().next();
    BenchUtil.benchStart("[showPreview][FABBY] bg");
    paramh = renderBgFilter(paramh);
    BenchUtil.benchEnd("[showPreview][FABBY] bg");
    int i = this.mvPart.getGridMode(this.progress);
    int j = this.mvPart.getGridOrder(this.progress);
    if (i == 0)
    {
      BenchUtil.benchStart("[showPreview][FABBY] merge");
      if (j == 0)
      {
        mergeFrame(paramh, updateAndRenderCameraFrame(paramMap, this.progress));
        label660: BenchUtil.benchEnd("[showPreview][FABBY] merge");
      }
    }
    label667: label895: 
    while (true)
    {
      BenchUtil.benchStart("[showPreview][FABBY] cover");
      paramh = renderCoverFilter(paramh);
      BenchUtil.benchEnd("[showPreview][FABBY] cover");
      BenchUtil.benchStart("[showPreview][FABBY] fg");
      paramh = renderFgFilter(paramh);
      BenchUtil.benchEnd("[showPreview][FABBY] fg");
      if (i == 0)
      {
        BenchUtil.benchStart("[showPreview][FABBY] grid");
        FrameUtil.clearFrame(this.mGridFrame, 0.0F, 0.0F, 0.0F, 0.0F, paramh.width, paramh.height);
        paramMap = updateAndRenderGrid(this.mGridFrame, paramh, this.progress);
        BenchUtil.benchEnd("[showPreview][FABBY] grid");
        paramh = paramMap;
        if (j == 1)
          paramh = updateAndRenderCameraFrame(paramMap, this.progress);
      }
      while (true)
      {
        paramh = updateAndRenderFilterEffect(paramh, this.progress);
        break;
        if (j != 1)
          break label660;
        mergeFrame(paramh, paramMap);
        break label660;
        this.mCopyFilter.RenderProcess(paramh.texture[0], paramh.width, paramh.height, -1, 0.0D, this.mGridFrame);
        if (j == 0)
        {
          paramh = updateAndRenderCameraFrame(paramMap, this.progress);
          paramh = updateAndRenderGrid(this.mGridFrame, paramh, this.progress);
          break label667;
        }
        if (j != 1)
          break label895;
        paramh = updateAndRenderCameraFrame(updateAndRenderGrid(this.mGridFrame, paramMap, this.progress), this.progress);
        break label667;
      }
    }
  }

  public void updateTextureParam(long paramLong)
  {
    AppMethodBeat.i(82283);
    if (this.startTimeStamp < 0L)
      this.startTimeStamp = paramLong;
    this.progress = ((float)(paramLong - this.startTimeStamp) / (float)this.mvPart.duration);
    if (this.bgFilter != null)
      this.bgFilter.updateFabbyProgress(paramLong);
    if (this.coverFilter != null)
      this.coverFilter.updateFabbyProgress(paramLong);
    if (this.fgFilter != null)
      this.fgFilter.updateFabbyProgress(paramLong);
    AppMethodBeat.o(82283);
  }

  public void updateVideoSize(int paramInt1, int paramInt2, double paramDouble)
  {
    AppMethodBeat.i(82274);
    if (this.bgFilter != null)
      this.bgFilter.updateVideoSize(paramInt1, paramInt2, paramDouble);
    if (this.fgFilter != null)
      this.fgFilter.updateVideoSize(paramInt1, paramInt2, paramDouble);
    if (this.coverFilter != null)
      this.coverFilter.updateVideoSize(paramInt1, paramInt2, paramDouble);
    AppMethodBeat.o(82274);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.filter.FabbyMvFilter
 * JD-Core Version:    0.6.2
 */