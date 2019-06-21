package com.tencent.mm.plugin.emojicapture.d;

import android.opengl.GLES20;
import android.util.Pair;
import com.tencent.filter.BaseFilter;
import com.tencent.filter.GLSLRender;
import com.tencent.filter.h;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bu.b;
import com.tencent.mm.plugin.emojicapture.model.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.ttpic.PTFaceAttr;
import com.tencent.ttpic.PTSegAttr;
import com.tencent.ttpic.PTSegmentor;
import com.tencent.ttpic.PTSticker;
import com.tencent.ttpic.config.BeautyRealConfig;
import com.tencent.ttpic.config.BeautyRealConfig.TYPE;
import com.tencent.ttpic.filter.BeautyFaceList;
import com.tencent.ttpic.filter.BeautyParam;
import com.tencent.ttpic.filter.BeautyTransformList;
import com.tencent.ttpic.filter.BrightnessAdjustmentFilter;
import com.tencent.ttpic.filter.RemodelFilter;
import com.tencent.ttpic.filter.SmoothBFilters;
import com.tencent.ttpic.util.BeautyRealUtil;
import com.tencent.ttpic.util.FrameUtil;
import com.tencent.ttpic.util.VideoFilterUtil;
import com.tencent.view.g;
import java.util.List;
import java.util.Map;

public final class a
{
  public static boolean ENABLE_GESTURE = true;
  public static float FACE_DETECT_IMG_WIDTH = 180.0F;
  public static boolean lhg = true;
  private boolean bZi;
  public int eYQ;
  public int eYW;
  public int eYX;
  private int frameIndex;
  public BrightnessAdjustmentFilter lhh;
  private boolean lhi;
  public BaseFilter lhj;
  private h lhk;
  private h lhl;
  public b lhm;
  public int lhn;
  private byte[] lho;
  public int lhp;
  public BeautyFaceList mBeautyFaceList;
  private h mBeautyFrame2;
  public BeautyParam mBeautyParam;
  private h mBeautyTransformCopyFrame;
  public BeautyTransformList mBeautyTransformList;
  public BaseFilter mCopyFilter;
  public PTSticker mPTSticker;
  public RemodelFilter mRemodelFilter;
  public SmoothBFilters mSmoothBFilters;
  public BaseFilter mSwapCopyFilter;
  public h[] mSwapFrames;
  private h mTempFrame;

  public a()
  {
    AppMethodBeat.i(2549);
    this.mSwapCopyFilter = new BaseFilter(GLSLRender.bJB);
    this.lhi = true;
    this.mSwapFrames = new h[2];
    this.frameIndex = -1;
    this.bZi = false;
    try
    {
      Object localObject = new com/tencent/filter/BaseFilter;
      ((BaseFilter)localObject).<init>(GLSLRender.bJB);
      this.lhj = ((BaseFilter)localObject);
      localObject = new com/tencent/filter/h;
      ((h)localObject).<init>();
      this.lhk = ((h)localObject);
      localObject = new com/tencent/filter/BaseFilter;
      ((BaseFilter)localObject).<init>(GLSLRender.bJB);
      this.mCopyFilter = ((BaseFilter)localObject);
      localObject = new com/tencent/filter/h;
      ((h)localObject).<init>();
      this.mTempFrame = ((h)localObject);
      localObject = new com/tencent/ttpic/filter/BrightnessAdjustmentFilter;
      ((BrightnessAdjustmentFilter)localObject).<init>();
      this.lhh = ((BrightnessAdjustmentFilter)localObject);
      localObject = new com/tencent/ttpic/filter/SmoothBFilters;
      ((SmoothBFilters)localObject).<init>();
      this.mSmoothBFilters = ((SmoothBFilters)localObject);
      localObject = new com/tencent/ttpic/filter/BeautyFaceList;
      ((BeautyFaceList)localObject).<init>();
      this.mBeautyFaceList = ((BeautyFaceList)localObject);
      localObject = new com/tencent/ttpic/filter/RemodelFilter;
      ((RemodelFilter)localObject).<init>();
      this.mRemodelFilter = ((RemodelFilter)localObject);
      localObject = new com/tencent/ttpic/filter/BeautyTransformList;
      ((BeautyTransformList)localObject).<init>();
      this.mBeautyTransformList = ((BeautyTransformList)localObject);
      localObject = new com/tencent/filter/h;
      ((h)localObject).<init>();
      this.lhl = ((h)localObject);
      localObject = new com/tencent/filter/h;
      ((h)localObject).<init>();
      this.mBeautyTransformCopyFrame = ((h)localObject);
      localObject = new com/tencent/filter/h;
      ((h)localObject).<init>();
      this.mBeautyFrame2 = ((h)localObject);
      localObject = new com/tencent/ttpic/filter/BeautyParam;
      ((BeautyParam)localObject).<init>(true);
      this.mBeautyParam = ((BeautyParam)localObject);
      localObject = new com/tencent/mm/bu/b;
      ((b)localObject).<init>('\000');
      this.lhm = ((b)localObject);
      AppMethodBeat.o(2549);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.EmojiFilterProcess", localException, "create FilterProcess error", new Object[0]);
        d locald = d.lhz;
        d.bmX();
        AppMethodBeat.o(2549);
      }
    }
  }

  private void b(BeautyRealConfig.TYPE paramTYPE, int paramInt)
  {
    AppMethodBeat.i(2553);
    ab.i("MicroMsg.EmojiFilterProcess", "setupCosmeticsLevelInner: %s, %s", new Object[] { paramTYPE, Integer.valueOf(paramInt) });
    switch (a.1.$SwitchMap$com$tencent$ttpic$config$BeautyRealConfig$TYPE[paramTYPE.ordinal()])
    {
    default:
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
    case 6:
    case 7:
    case 8:
    case 9:
    case 10:
    case 11:
    case 12:
    case 13:
    case 14:
    case 15:
    case 16:
    case 17:
    case 18:
    case 19:
    case 20:
    }
    while (true)
    {
      AppMethodBeat.o(2553);
      while (true)
      {
        return;
        this.mSmoothBFilters.updateBlurAlpha(paramInt * 0.6F / 100.0F);
        if (this.mBeautyFaceList == null)
          break;
        this.mBeautyFaceList.setLightRemovePouchAlpha(paramInt * 0.6F / 100.0F);
        AppMethodBeat.o(2553);
        continue;
        AppMethodBeat.o(2553);
        continue;
        if (this.mBeautyFaceList == null)
          break;
        this.mBeautyFaceList.setRemovePounchAlpha(paramInt / 100.0F);
        AppMethodBeat.o(2553);
        continue;
        if (this.mBeautyFaceList == null)
          break;
        this.mBeautyFaceList.setEyeLightenAlpha(paramInt / 100.0F);
        AppMethodBeat.o(2553);
        continue;
        if (this.mBeautyFaceList == null)
          break;
        this.mBeautyFaceList.setToothWhitenAlpha(paramInt / 80.0F);
        AppMethodBeat.o(2553);
        continue;
        this.mRemodelFilter.setParam(paramTYPE.value, paramInt);
        AppMethodBeat.o(2553);
      }
      if ((this.mBeautyParam != null) && (this.mBeautyTransformList != null))
        this.mBeautyTransformList.setBeautyParam(paramTYPE.value, BeautyRealUtil.getDistortParam(this.mBeautyParam.getDistortList(paramTYPE.value), paramInt, paramTYPE.value));
    }
  }

  private boolean bmE()
  {
    if (this.mPTSticker != null);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final void a(BeautyRealConfig.TYPE paramTYPE, int paramInt)
  {
    int i = 0;
    AppMethodBeat.i(2552);
    if (BeautyRealUtil.isCombinedType(paramTYPE.value))
    {
      Map localMap = BeautyRealUtil.getBeautyLevels(paramTYPE.value, false);
      if (localMap.containsKey(BeautyRealConfig.TYPE.BEAUTY))
        b(BeautyRealConfig.TYPE.BEAUTY, ((Integer)localMap.get(BeautyRealConfig.TYPE.BEAUTY)).intValue());
      if (localMap.containsKey(BeautyRealConfig.TYPE.BASIC3))
        b(BeautyRealConfig.TYPE.BASIC3, ((Integer)localMap.get(BeautyRealConfig.TYPE.BASIC3)).intValue());
      paramTYPE = BeautyRealConfig.SINGLE_TRANS_TYPE;
      int j = paramTYPE.length;
      for (paramInt = i; paramInt < j; paramInt++)
      {
        Object localObject = paramTYPE[paramInt];
        b(localObject, ((Integer)localMap.get(localObject)).intValue());
      }
      AppMethodBeat.o(2552);
    }
    while (true)
    {
      return;
      if (paramTYPE == BeautyRealConfig.TYPE.LIPS_THICKNESS)
      {
        b(paramTYPE, 0 - paramInt);
        AppMethodBeat.o(2552);
      }
      else
      {
        b(paramTYPE, paramInt);
        AppMethodBeat.o(2552);
      }
    }
  }

  public final void bmD()
  {
    AppMethodBeat.i(2551);
    long l = bo.yz();
    try
    {
      this.frameIndex = ((this.frameIndex + 1) % 2);
      this.lhj.RenderProcess(this.eYQ, this.eYW, this.eYX, -1, 1.0D, this.lhk);
      Object localObject1 = FrameUtil.getLastRenderFrame(this.lhk);
      this.mSwapCopyFilter.RenderProcess(localObject1.texture[0], this.eYW, this.eYX, -1, 0.0D, this.mSwapFrames[this.frameIndex]);
      localObject1 = this.mSwapFrames[this.frameIndex];
      if (!lhg)
      {
        this.mCopyFilter.RenderProcess(localObject1.texture[0], this.eYW, this.eYX, this.lhn, 1.0D, this.mTempFrame);
        if (this.lho != null)
          g.a(localObject1.texture[0], this.eYW, this.eYX, this.lho, this.lhp);
        GLES20.glBindFramebuffer(36160, 0);
        GLES20.glBindTexture(3553, 0);
        AppMethodBeat.o(2551);
        return;
      }
      int i = VideoFilterUtil.get4DirectionAngle(this.lhm.getPhotoAngle());
      if (bmE())
        GLES20.glFinish();
      localObject2 = this.lhm;
      label235: PTFaceAttr localPTFaceAttr;
      label272: PTSegAttr localPTSegAttr;
      float f;
      label329: int j;
      int k;
      Object localObject3;
      if ((this.mPTSticker != null) && (this.mPTSticker.needDetectGesture()))
      {
        bool = true;
        localPTFaceAttr = ((b)localObject2).a((h)localObject1, bool, false, false);
        localObject2 = PTSegmentor.getInstance();
        if ((this.mPTSticker == null) || (!this.mPTSticker.isSegmentRequired()))
          break label861;
        bool = true;
        localPTSegAttr = ((PTSegmentor)localObject2).detectFrame((h)localObject1, (i + 360) % 360, bool);
        if (localPTFaceAttr != null)
        {
          localObject1 = localPTFaceAttr.getOrigFrame();
          i = ((Integer)localPTFaceAttr.getHistogram().first).intValue();
          if (i > 40)
            break label867;
          f = 0.0F;
          this.mBeautyFaceList.setNormalAlphaFactor(f);
        }
        if ((localPTFaceAttr == null) || (localPTFaceAttr.getBrightnessAdjustmentCurve() == null))
          break label935;
        this.lhh.updateCurve(localPTFaceAttr.getBrightnessAdjustmentCurve(), true);
        this.lhh.RenderProcess(localObject1.texture[0], this.eYW, this.eYX, -1, 0.0D, this.lhl);
        localObject1 = this.lhl;
        if ((((h)localObject1).width <= 0) || (((h)localObject1).height <= 0) || (localPTFaceAttr == null))
          break label929;
        localObject2 = localPTFaceAttr.getAllFacePoints();
        j = (int)(((h)localObject1).width * localPTFaceAttr.getFaceDetectScale());
        k = (int)(((h)localObject1).height * localPTFaceAttr.getFaceDetectScale());
        i = localPTFaceAttr.getRotation();
        localObject3 = this.mSmoothBFilters;
        if (this.lhi)
          break label896;
      }
      label896: for (boolean bool = true; ; bool = false)
      {
        ((SmoothBFilters)localObject3).setOnlyDetFaceRectSkin(bool);
        this.mSmoothBFilters.updateAndRender((h)localObject1, this.mBeautyFrame2, (List)localObject2, j, k, i);
        localObject2 = this.mBeautyFrame2;
        localObject1 = localObject2;
        if (localPTFaceAttr != null)
        {
          this.mBeautyFaceList.updateVideoSize(this.eYW, this.eYX, localPTFaceAttr.getFaceDetectScale());
          this.mBeautyFaceList.setLightRemovePouchSkinTexture(this.mSmoothBFilters.getVarianceFrame().texture[0]);
          localObject1 = this.mBeautyFaceList.render((h)localObject2, localPTFaceAttr.getAllFacePoints());
        }
        if ((this.mBeautyTransformList == null) || (localPTFaceAttr == null))
          break label926;
        localObject2 = localPTFaceAttr.getAllFacePoints();
        double d = localPTFaceAttr.getFaceDetectScale();
        localObject3 = localPTFaceAttr.getAllFaceAngles();
        i = localPTFaceAttr.getRotation();
        h localh = this.mBeautyTransformList.process((h)localObject1, (List)localObject2, d, (List)localObject3, i);
        if (localPTSegAttr.getMaskFrame() != null)
        {
          localObject1 = localPTSegAttr.getMaskFrame();
          this.mCopyFilter.RenderProcess(localObject1.texture[0], ((h)localObject1).width, ((h)localObject1).height, -1, 0.0D, this.mBeautyTransformCopyFrame);
          localPTSegAttr.setMaskFrame(this.mBeautyTransformList.process(this.mBeautyTransformCopyFrame, (List)localObject2, d, (List)localObject3, i));
        }
        localObject1 = this.mRemodelFilter.process(localh, (List)localObject2, (List)localObject3, d);
        localObject2 = localObject1;
        if (bmE())
        {
          localObject2 = localObject1;
          if (localPTFaceAttr != null)
          {
            this.mPTSticker.updateVideoSize(this.eYW, this.eYX, localPTFaceAttr.getFaceDetectScale(), localPTFaceAttr.getRotation());
            localObject1 = this.mPTSticker.processTransformRelatedFilters((h)localObject1, localPTFaceAttr, localPTSegAttr);
            localObject2 = this.mPTSticker.processStickerFilters((h)localObject1, localPTFaceAttr, localPTSegAttr);
          }
        }
        this.mCopyFilter.RenderProcess(localObject2.texture[0], this.eYW, this.eYX, this.lhn, 1.0D, this.mTempFrame);
        GLES20.glBindFramebuffer(36160, 0);
        GLES20.glBindTexture(3553, 0);
        ab.d("MicroMsg.EmojiFilterProcess", "filterProcess: cost %s", new Object[] { Long.valueOf(bo.az(l)) });
        AppMethodBeat.o(2551);
        break;
        bool = false;
        break label235;
        label861: bool = false;
        break label272;
        label867: if (i >= 80)
        {
          f = 1.0F;
          break label329;
        }
        f = (i - 40.0F) / 40.0F;
        break label329;
      }
    }
    catch (Exception localException)
    {
      label926: label929: label935: 
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.EmojiFilterProcess", localException, "filterProcess error", new Object[0]);
        d locald = d.lhz;
        d.bmY();
        continue;
        continue;
        Object localObject2 = locald;
      }
    }
  }

  public final void ch(int paramInt1, int paramInt2)
  {
    this.eYW = paramInt1;
    this.eYX = paramInt2;
    com.tencent.ttpic.config.MediaConfig.VIDEO_OUTPUT_WIDTH = paramInt1;
    com.tencent.ttpic.config.MediaConfig.VIDEO_OUTPUT_HEIGHT = paramInt2;
  }

  public final void clear()
  {
    AppMethodBeat.i(2550);
    ab.i("MicroMsg.EmojiFilterProcess", "clear %s %d", new Object[] { this, Long.valueOf(Thread.currentThread().getId()) });
    try
    {
      this.lhj.ClearGLSL();
      this.lhk.clear();
      this.mSwapCopyFilter.ClearGLSL();
      for (h localh : this.mSwapFrames)
        if (localh != null)
          localh.clear();
      this.mCopyFilter.ClearGLSL();
      this.mTempFrame.clear();
      this.lhh.ClearGLSL();
      this.mSmoothBFilters.clear();
      this.mBeautyFaceList.clear();
      this.mRemodelFilter.clear();
      this.mBeautyTransformList.clear();
      this.lhl.clear();
      this.mBeautyTransformCopyFrame.clear();
      this.mBeautyFrame2.clear();
      if (this.mPTSticker != null)
      {
        this.mPTSticker.destroy();
        this.mPTSticker = null;
      }
      this.lhm.destroy();
      PTSegmentor.getInstance().destroy();
      GLES20.glDeleteFramebuffers(1, new int[] { this.lhp }, 0);
      AppMethodBeat.o(2550);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.EmojiFilterProcess", localException, "clear error: %s", new Object[] { localException.getMessage() });
        d locald = d.lhz;
        d.bmZ();
        AppMethodBeat.o(2550);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emojicapture.d.a
 * JD-Core Version:    0.6.2
 */