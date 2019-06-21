package com.tencent.ttpic.filter;

import android.graphics.PointF;
import com.tencent.filter.m.i;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.ttpic.gles.GlUtil;
import com.tencent.ttpic.model.StickerItem;
import com.tencent.ttpic.model.TriggerCtrlItem;
import com.tencent.ttpic.util.AlgoUtils;
import com.tencent.ttpic.util.VideoFilterFactory.POSITION_TYPE;
import com.tencent.ttpic.util.VideoFilterUtil.RATIO_MODE;
import java.util.ArrayList;
import java.util.List;

public class StaticStickerFilter extends NormalVideoFilter
{
  private boolean initialized = false;
  private VideoFilterUtil.RATIO_MODE ratioMode = VideoFilterUtil.RATIO_MODE.RATIO_MODE_16_9;
  private List<PointF> relativePivotsPts_16_9;
  private List<PointF> relativePivotsPts_1_1;
  private List<PointF> relativePivotsPts_4_3;
  private List<PointF> relativePosPts_16_9;
  private List<PointF> relativePosPts_1_1;
  private List<PointF> relativePosPts_4_3;

  public StaticStickerFilter(StickerItem paramStickerItem, String paramString)
  {
    super(paramStickerItem, paramString);
  }

  private void initFabbyPositionAdjust()
  {
    AppMethodBeat.i(82971);
    if (this.item.aspectMode == 1)
    {
      setPositions(GlUtil.ORIGIN_POSITION_COORDS);
      AppMethodBeat.o(82971);
    }
    while (true)
    {
      return;
      double d1 = this.width / this.height;
      double d2 = this.item.width / this.item.height;
      int i;
      int k;
      float f1;
      float f2;
      if (d1 >= d2)
      {
        d1 = this.width / 720.0D;
        i = (int)(this.width / d2);
        int j = (int)(i * this.item.position[1]);
        k = (int)(this.width * this.item.position[0]);
        i = j - (i - this.height) / 2;
        f1 = k;
        f2 = (float)(i + this.item.height * d1);
        d2 = k;
        setPositions(AlgoUtils.calPositions(f1, f2, (float)(d1 * this.item.width + d2), i, this.width, this.height));
        AppMethodBeat.o(82971);
      }
      else
      {
        d1 = this.height / 720.0D * d2;
        i = (int)(this.height * d2);
        k = (int)(this.height * this.item.position[1]);
        i = (int)(i * this.item.position[0]) - (i - this.width) / 2;
        f2 = i;
        f1 = (float)(k + this.item.height * d1);
        d2 = i;
        setPositions(AlgoUtils.calPositions(f2, f1, (float)(d1 * this.item.width + d2), k, this.width, this.height));
        AppMethodBeat.o(82971);
      }
    }
  }

  private void initRelativeParams()
  {
    AppMethodBeat.i(82972);
    this.relativePivotsPts_4_3 = new ArrayList();
    this.relativePivotsPts_4_3.add(new PointF(360.0F, 480.0F));
    this.relativePivotsPts_4_3.add(new PointF(0.0F, 0.0F));
    this.relativePivotsPts_4_3.add(new PointF(360.0F, 0.0F));
    this.relativePivotsPts_4_3.add(new PointF(720.0F, 0.0F));
    this.relativePivotsPts_4_3.add(new PointF(0.0F, 480.0F));
    this.relativePivotsPts_4_3.add(new PointF(720.0F, 480.0F));
    this.relativePivotsPts_4_3.add(new PointF(0.0F, 960.0F));
    this.relativePivotsPts_4_3.add(new PointF(360.0F, 960.0F));
    this.relativePivotsPts_4_3.add(new PointF(720.0F, 960.0F));
    this.relativePivotsPts_16_9 = new ArrayList();
    this.relativePivotsPts_16_9.add(new PointF(360.0F, 480.0F));
    this.relativePivotsPts_16_9.add(new PointF(90.0F, 0.0F));
    this.relativePivotsPts_16_9.add(new PointF(360.0F, 0.0F));
    this.relativePivotsPts_16_9.add(new PointF(630.0F, 0.0F));
    this.relativePivotsPts_16_9.add(new PointF(90.0F, 480.0F));
    this.relativePivotsPts_16_9.add(new PointF(630.0F, 480.0F));
    this.relativePivotsPts_16_9.add(new PointF(90.0F, 960.0F));
    this.relativePivotsPts_16_9.add(new PointF(360.0F, 960.0F));
    this.relativePivotsPts_16_9.add(new PointF(630.0F, 960.0F));
    this.relativePivotsPts_1_1 = new ArrayList();
    this.relativePivotsPts_1_1.add(new PointF(360.0F, 480.0F));
    this.relativePivotsPts_1_1.add(new PointF(0.0F, 120.0F));
    this.relativePivotsPts_1_1.add(new PointF(360.0F, 120.0F));
    this.relativePivotsPts_1_1.add(new PointF(720.0F, 120.0F));
    this.relativePivotsPts_1_1.add(new PointF(0.0F, 480.0F));
    this.relativePivotsPts_1_1.add(new PointF(720.0F, 480.0F));
    this.relativePivotsPts_1_1.add(new PointF(0.0F, 840.0F));
    this.relativePivotsPts_1_1.add(new PointF(360.0F, 840.0F));
    this.relativePivotsPts_1_1.add(new PointF(720.0F, 840.0F));
    this.relativePosPts_4_3 = new ArrayList();
    this.relativePosPts_4_3.add(new PointF(0.5F, 0.5F));
    this.relativePosPts_4_3.add(new PointF(0.0F, 0.0F));
    this.relativePosPts_4_3.add(new PointF(0.5F, 0.0F));
    this.relativePosPts_4_3.add(new PointF(1.0F, 0.0F));
    this.relativePosPts_4_3.add(new PointF(0.0F, 0.5F));
    this.relativePosPts_4_3.add(new PointF(1.0F, 0.5F));
    this.relativePosPts_4_3.add(new PointF(0.0F, 1.0F));
    this.relativePosPts_4_3.add(new PointF(0.5F, 1.0F));
    this.relativePosPts_4_3.add(new PointF(1.0F, 1.0F));
    this.relativePosPts_16_9 = new ArrayList();
    this.relativePosPts_16_9.add(new PointF(0.5F, 0.5F));
    this.relativePosPts_16_9.add(new PointF(0.125F, 0.0F));
    this.relativePosPts_16_9.add(new PointF(0.5F, 0.0F));
    this.relativePosPts_16_9.add(new PointF(0.875F, 0.0F));
    this.relativePosPts_16_9.add(new PointF(0.125F, 0.5F));
    this.relativePosPts_16_9.add(new PointF(0.875F, 0.5F));
    this.relativePosPts_16_9.add(new PointF(0.125F, 1.0F));
    this.relativePosPts_16_9.add(new PointF(0.5F, 1.0F));
    this.relativePosPts_16_9.add(new PointF(0.875F, 1.0F));
    this.relativePosPts_1_1 = new ArrayList();
    this.relativePosPts_1_1.add(new PointF(0.5F, 0.5F));
    this.relativePosPts_1_1.add(new PointF(0.0F, 0.125F));
    this.relativePosPts_1_1.add(new PointF(0.5F, 0.125F));
    this.relativePosPts_1_1.add(new PointF(1.0F, 0.125F));
    this.relativePosPts_1_1.add(new PointF(0.0F, 0.5F));
    this.relativePosPts_1_1.add(new PointF(1.0F, 0.5F));
    this.relativePosPts_1_1.add(new PointF(0.0F, 0.875F));
    this.relativePosPts_1_1.add(new PointF(0.5F, 0.875F));
    this.relativePosPts_1_1.add(new PointF(1.0F, 0.875F));
    AppMethodBeat.o(82972);
  }

  public void clearTextureParam()
  {
    AppMethodBeat.i(82968);
    super.clearTextureParam();
    this.initialized = false;
    AppMethodBeat.o(82968);
  }

  public void initParams()
  {
    AppMethodBeat.i(82964);
    super.initParams();
    addParam(new m.i("texNeedTransform", -1));
    initRelativeParams();
    AppMethodBeat.o(82964);
  }

  public void initPositionAdjusted()
  {
    AppMethodBeat.i(82970);
    if ((this.item == null) || (this.item.position == null) || (this.item.position.length < 2))
    {
      setPositions(GlUtil.EMPTY_POSITIONS);
      AppMethodBeat.o(82970);
    }
    while (true)
    {
      return;
      int i = this.item.width;
      int j = this.item.height;
      int k = j;
      int m = i;
      label101: List localList;
      label117: double[] arrayOfDouble;
      if (this.item.type == VideoFilterFactory.POSITION_TYPE.RELATIVE.type)
      {
        if (this.ratioMode != VideoFilterUtil.RATIO_MODE.RATIO_MODE_4_3)
          break label576;
        localObject = this.relativePivotsPts_4_3;
        if (this.ratioMode != VideoFilterUtil.RATIO_MODE.RATIO_MODE_4_3)
          break label604;
        localList = this.relativePosPts_4_3;
        f1 = AlgoUtils.getDistance((PointF)((List)localObject).get(this.item.scalePivots[0]), (PointF)((List)localObject).get(this.item.scalePivots[1])) / this.item.scaleFactor;
        i = (int)(i * f1);
        j = (int)(j * f1);
        arrayOfDouble = new double[2];
        localObject = arrayOfDouble;
        if (this.item.alignFacePoints != null)
        {
          localObject = arrayOfDouble;
          if (this.item.alignFacePoints.length > 0)
          {
            if (this.item.alignFacePoints.length != 1)
              break label632;
            localObject = arrayOfDouble;
            if (this.item.alignFacePoints[0] < localList.size())
              localObject = new double[] { ((PointF)localList.get(this.item.alignFacePoints[0])).x, ((PointF)localList.get(this.item.alignFacePoints[0])).y };
          }
        }
      }
      while (true)
      {
        k = j;
        m = i;
        if (this.item.anchorPoint != null)
        {
          k = j;
          m = i;
          if (this.item.anchorPoint.length >= 2)
          {
            this.item.position[0] = (localObject[0] - this.item.anchorPoint[0] * f1 / 720.0F);
            this.item.position[1] = (localObject[1] - this.item.anchorPoint[1] * f1 / 960.0F);
            m = i;
            k = j;
          }
        }
        if (this.width / this.height < 0.75D)
          break label856;
        d1 = this.width / 720.0D;
        j = (int)(this.width / 0.75D);
        int n = (int)(j * this.item.position[1]);
        i = (int)(this.width * this.item.position[0]);
        j = n - (j - this.height) / 2;
        f1 = i;
        f2 = (float)(j + k * d1);
        d2 = i;
        localObject = AlgoUtils.calPositions(f1, f2, (float)(d1 * m + d2), j, this.width, this.height);
        if (this.item.scaleDirection != 0)
          break label816;
        setPositions(AlgoUtils.adjustPosition((float[])localObject, (float)this.triggerCtrlItem.getAudioScaleFactor()));
        AppMethodBeat.o(82970);
        break;
        label576: if (this.ratioMode == VideoFilterUtil.RATIO_MODE.RATIO_MODE_16_9)
        {
          localObject = this.relativePivotsPts_16_9;
          break label101;
        }
        localObject = this.relativePivotsPts_1_1;
        break label101;
        label604: if (this.ratioMode == VideoFilterUtil.RATIO_MODE.RATIO_MODE_16_9)
        {
          localList = this.relativePosPts_16_9;
          break label117;
        }
        localList = this.relativePosPts_1_1;
        break label117;
        label632: localObject = arrayOfDouble;
        if (this.item.alignFacePoints.length == 2)
        {
          localObject = arrayOfDouble;
          if (this.item.alignFacePoints[0] < localList.size())
          {
            localObject = arrayOfDouble;
            if (this.item.alignFacePoints[1] < localList.size())
            {
              f2 = ((PointF)localList.get(this.item.alignFacePoints[0])).x;
              d2 = (((PointF)localList.get(this.item.alignFacePoints[1])).x + f2) / 2.0F;
              f2 = ((PointF)localList.get(this.item.alignFacePoints[0])).y;
              localObject = new double[] { d2, (((PointF)localList.get(this.item.alignFacePoints[1])).y + f2) / 2.0F };
            }
          }
        }
      }
      label816: setPositions(AlgoUtils.adjustPosition((float[])localObject, (float)this.triggerCtrlItem.getAudioScaleFactor(), this.item.anchorPointAudio, this.item.scaleDirection));
      AppMethodBeat.o(82970);
      continue;
      label856: double d2 = this.height / 960.0D;
      j = (int)(this.height * 0.75D);
      i = (int)(this.height * this.item.position[1]);
      j = (int)(j * this.item.position[0]) - (j - this.width) / 2;
      float f1 = j;
      float f2 = (float)(i + k * d2);
      double d1 = j;
      Object localObject = AlgoUtils.calPositions(f1, f2, (float)(d2 * m + d1), i, this.width, this.height);
      if (this.item.scaleDirection == 0)
      {
        setPositions(AlgoUtils.adjustPosition((float[])localObject, (float)this.triggerCtrlItem.getAudioScaleFactor()));
        AppMethodBeat.o(82970);
      }
      else
      {
        setPositions(AlgoUtils.adjustPosition((float[])localObject, (float)this.triggerCtrlItem.getAudioScaleFactor(), this.item.anchorPointAudio, this.item.scaleDirection));
        AppMethodBeat.o(82970);
      }
    }
  }

  public void initPositions()
  {
    AppMethodBeat.i(82969);
    if ((this.item == null) || (this.item.position == null) || (this.item.position.length < 2))
    {
      setPositions(GlUtil.EMPTY_POSITIONS);
      AppMethodBeat.o(82969);
    }
    while (true)
    {
      return;
      double d = this.width / 720.0D;
      int i = (int)(this.height * (1.0D - this.item.position[1]));
      int j = (int)(this.width * this.item.position[0]);
      setPositions(AlgoUtils.calPositions(j, i, j + (int)(this.item.width * d), (int)(i - d * this.item.height), this.width, this.height));
      this.initialized = true;
      AppMethodBeat.o(82969);
    }
  }

  public void resetFabbyProgress()
  {
    this.triggered = false;
  }

  public void setRatioMode(VideoFilterUtil.RATIO_MODE paramRATIO_MODE)
  {
    this.ratioMode = paramRATIO_MODE;
  }

  public void updateFabbyProgress(long paramLong)
  {
    AppMethodBeat.i(82965);
    if (!this.triggered)
      this.triggerCtrlItem.setFrameStartTime(paramLong);
    this.triggered = true;
    updateTextureParam((int)((paramLong - this.triggerCtrlItem.getFrameStartTime()) / Math.max(this.item.frameDuration, 1.0D)) % Math.max(this.item.frames, 1), paramLong);
    initFabbyPositionAdjust();
    AppMethodBeat.o(82965);
  }

  protected void updatePositions(List<PointF> paramList, float[] paramArrayOfFloat, float paramFloat)
  {
    AppMethodBeat.i(82967);
    if (this.initialized)
      AppMethodBeat.o(82967);
    while (true)
    {
      return;
      if (this.item.isFabbyMvItem)
      {
        initFabbyPositionAdjust();
        AppMethodBeat.o(82967);
      }
      else
      {
        initPositionAdjusted();
        AppMethodBeat.o(82967);
      }
    }
  }

  public void updateVideoSize(int paramInt1, int paramInt2, double paramDouble)
  {
    AppMethodBeat.i(82966);
    super.updateVideoSize(paramInt1, paramInt2, paramDouble);
    if (this.item.isFabbyMvItem)
    {
      initFabbyPositionAdjust();
      AppMethodBeat.o(82966);
    }
    while (true)
    {
      return;
      initPositionAdjusted();
      AppMethodBeat.o(82966);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.filter.StaticStickerFilter
 * JD-Core Version:    0.6.2
 */