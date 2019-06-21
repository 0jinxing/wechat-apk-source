package com.tencent.ttpic.model;

import android.graphics.PointF;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.ttpic.PTDetectInfo;
import com.tencent.ttpic.PTFaceAttr.PTExpression;
import com.tencent.ttpic.fabby.FabbyUtil;
import com.tencent.ttpic.util.VideoMaterialUtil;
import com.tencent.ttpic.util.youtu.GestureDetector;
import com.tencent.ttpic.util.youtu.VideoPreviewFaceOutlineDetector;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TriggerCtrlItem
{
  private static final double MAX_AUDIO_FACTOR = 0.6D;
  private static final double MIN_AUDIO_FACTOR = 0.08D;
  private AgeRange ageRange;
  private double audioScaleFactor;
  private List<PointF> bodyPositionRecord;
  private int bodyPositionRecordMinNum;
  private CharmRange charmRange;
  private TriggerConfig config;
  private CpRange cpRange;
  private double frameDuration;
  private int frameIndex;
  private long frameStartTime;
  private int frames;
  private GenderRange genderRange;
  private int mRandomGroupValue;
  private int playCount;
  private PopularRange popularRange;
  private TRIGGERED_STATUS status;

  public TriggerCtrlItem()
  {
    AppMethodBeat.i(83556);
    this.status = TRIGGERED_STATUS.NOT_TRIGGERED;
    this.audioScaleFactor = 1.0D;
    this.bodyPositionRecordMinNum = 2;
    this.config = new TriggerConfig();
    this.bodyPositionRecord = new ArrayList();
    AppMethodBeat.o(83556);
  }

  public TriggerCtrlItem(FaceItem paramFaceItem)
  {
    AppMethodBeat.i(83558);
    this.status = TRIGGERED_STATUS.NOT_TRIGGERED;
    this.audioScaleFactor = 1.0D;
    this.bodyPositionRecordMinNum = 2;
    this.config = new TriggerConfig(paramFaceItem);
    this.charmRange = paramFaceItem.charmRange;
    this.frames = paramFaceItem.frames;
    this.frameDuration = paramFaceItem.frameDuration;
    AppMethodBeat.o(83558);
  }

  public TriggerCtrlItem(FaceMeshItem paramFaceMeshItem)
  {
    AppMethodBeat.i(83559);
    this.status = TRIGGERED_STATUS.NOT_TRIGGERED;
    this.audioScaleFactor = 1.0D;
    this.bodyPositionRecordMinNum = 2;
    this.config = new TriggerConfig(paramFaceMeshItem);
    this.charmRange = paramFaceMeshItem.charmRange;
    this.frames = paramFaceMeshItem.frames;
    this.frameDuration = paramFaceMeshItem.frameDuration;
    AppMethodBeat.o(83559);
  }

  public TriggerCtrlItem(StickerItem paramStickerItem)
  {
    AppMethodBeat.i(83557);
    this.status = TRIGGERED_STATUS.NOT_TRIGGERED;
    this.audioScaleFactor = 1.0D;
    this.bodyPositionRecordMinNum = 2;
    this.config = new TriggerConfig(paramStickerItem);
    this.charmRange = paramStickerItem.charmRange;
    this.ageRange = paramStickerItem.ageRange;
    this.genderRange = paramStickerItem.genderRange;
    this.popularRange = paramStickerItem.popularRange;
    this.cpRange = paramStickerItem.cpRange;
    this.frames = paramStickerItem.frames;
    this.frameDuration = paramStickerItem.frameDuration;
    this.bodyPositionRecord = new ArrayList();
    if (Math.ceil(this.config.bodyTriggerTimeGap * 1000.0D / this.frameDuration) >= 1.0D)
      i = (int)Math.ceil(this.config.bodyTriggerTimeGap * 1000.0D / this.frameDuration) + 1;
    this.bodyPositionRecordMinNum = i;
    AppMethodBeat.o(83557);
  }

  private int calPointsAngle(PointF paramPointF1, PointF paramPointF2)
  {
    AppMethodBeat.i(83571);
    float f1 = (float)Math.toDegrees(Math.atan2(paramPointF2.y - paramPointF1.y, paramPointF2.x - paramPointF1.x));
    float f2 = f1;
    if (f1 < 0.0F)
      f2 = f1 + 360.0F;
    int i = (int)f2;
    AppMethodBeat.o(83571);
    return i;
  }

  private int calPointsDistance(PointF paramPointF1, PointF paramPointF2)
  {
    AppMethodBeat.i(83570);
    int i = (int)Math.sqrt(Math.pow(paramPointF2.x - paramPointF1.x, 2.0D) + Math.pow(paramPointF2.y - paramPointF1.y, 2.0D));
    AppMethodBeat.o(83570);
    return i;
  }

  private double getAudioScale(int paramInt)
  {
    AppMethodBeat.i(83569);
    double d = FabbyUtil.getRangeValue(0, paramInt, this.config.audioScaleFactorMap, 1.0D);
    AppMethodBeat.o(83569);
    return d;
  }

  private double getAudioValidScale(double paramDouble)
  {
    double d;
    if (paramDouble < 0.08D)
      d = paramDouble + 0.08D;
    while (true)
    {
      return d;
      d = paramDouble;
      if (paramDouble > 0.6D)
        d = 0.6D;
    }
  }

  private boolean isAudioTriggered()
  {
    if (this.config.audioTriggerType == 0);
    return true;
  }

  private boolean isInRange(double paramDouble1, double paramDouble2, double paramDouble3)
  {
    if ((paramDouble1 >= paramDouble2) && (paramDouble1 <= paramDouble3));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  private boolean isNormalTriggered(PTDetectInfo paramPTDetectInfo)
  {
    boolean bool1 = true;
    boolean bool2 = false;
    AppMethodBeat.i(83562);
    Object localObject1 = paramPTDetectInfo.triggeredExpression;
    Object localObject2 = paramPTDetectInfo.faceActionCounter;
    Map localMap = paramPTDetectInfo.handActionCounter;
    List localList = paramPTDetectInfo.bodyPoints;
    boolean bool3;
    label114: int i;
    if (this.config.activateTriggerTotalCount != 0)
      if (this.config.preTriggerType != PTFaceAttr.PTExpression.ALWAYS.value)
      {
        if (!VideoMaterialUtil.isFaceTriggerType(this.config.preTriggerType))
          break label255;
        bool3 = bool2;
        if (!((Set)localObject1).contains(Integer.valueOf(this.config.preTriggerType)));
      }
      else
      {
        bool1 = VideoMaterialUtil.isFaceTriggerType(this.config.countTriggerType);
        if (!bool1)
          break label277;
        localObject1 = localObject2;
        bool3 = bool2;
        if (localObject1 != null)
        {
          if (!bool1)
            break label284;
          localObject1 = localObject2;
          label130: bool3 = bool2;
          if (((Map)localObject1).size() != 0)
          {
            if (!bool1)
              break label291;
            i = ((FaceActionCounter)((Map)localObject2).get(Integer.valueOf(this.config.countTriggerType))).count;
            label172: bool3 = bool2;
            if (i % this.config.activateTriggerTotalCount == this.config.activateTriggerCount)
            {
              if ((this.config.playCount != 0) && (this.playCount >= this.config.playCount))
                break label319;
              bool3 = true;
              label222: if (this.playCount >= this.config.playCount)
                break label334;
              if (!bool1)
                break label325;
              paramPTDetectInfo.faceDetector.lockActionCounter();
            }
          }
        }
      }
    while (true)
    {
      AppMethodBeat.o(83562);
      return bool3;
      label255: bool3 = bool2;
      if (GestureDetector.getInstance().isGestureTriggered(this.config.preTriggerType))
      {
        break;
        label277: localObject1 = localMap;
        break label114;
        label284: localObject1 = localMap;
        break label130;
        label291: i = ((HandActionCounter)localMap.get(Integer.valueOf(this.config.countTriggerType))).count;
        break label172;
        label319: bool3 = false;
        break label222;
        label325: GestureDetector.getInstance().lockActionCounter();
        continue;
        label334: if (this.config.playCount > 0)
        {
          if (bool1)
            paramPTDetectInfo.faceDetector.clearActionCounter();
          else
            GestureDetector.getInstance().clearActionCounter();
        }
        else
        {
          continue;
          if (VideoMaterialUtil.isFaceTriggerType(this.config.triggerType))
          {
            bool3 = bool2;
            if (localObject1 != null)
              bool3 = ((Set)localObject1).contains(Integer.valueOf(this.config.triggerType));
          }
          else if (VideoMaterialUtil.isGestureTriggerType(this.config.triggerType))
          {
            bool3 = GestureDetector.getInstance().isGestureTriggered(this.config.triggerType);
          }
          else
          {
            bool3 = bool2;
            if (!VideoMaterialUtil.isAudioTextTriggerType(this.config.triggerType))
            {
              if (VideoMaterialUtil.isBodyDetectType(this.config.triggerType))
              {
                if ((localList != null) && (!localList.isEmpty()));
                for (bool3 = bool1; ; bool3 = false)
                  break;
              }
              bool3 = bool2;
              if (VideoMaterialUtil.isBodyTriggerType(this.config.triggerType))
              {
                bool3 = bool2;
                if (localList != null)
                {
                  bool3 = bool2;
                  if (!localList.isEmpty())
                  {
                    if (this.bodyPositionRecord.size() == this.bodyPositionRecordMinNum)
                      this.bodyPositionRecord.remove(0);
                    this.bodyPositionRecord.add(localList.get(this.config.bodyTriggerPoint));
                    bool3 = bool2;
                    if (this.bodyPositionRecord.size() > 1)
                    {
                      localObject2 = (PointF)localList.get(this.config.bodyTriggerPoint);
                      paramPTDetectInfo = (PointF)this.bodyPositionRecord.get(0);
                      i = calPointsDistance(paramPTDetectInfo, (PointF)localObject2);
                      int j = calPointsAngle(paramPTDetectInfo, (PointF)localObject2);
                      bool3 = bool2;
                      if (i >= this.config.bodyTriggerDistance)
                      {
                        i = Math.abs(j - this.config.getBodyTriggerAngle());
                        this.config.getClass();
                        bool3 = bool2;
                        if (i <= 15)
                          bool3 = true;
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
  }

  private boolean isRandomGroupValueHit()
  {
    boolean bool = true;
    if (this.config.randomGroupNum == 0);
    while (true)
    {
      return bool;
      if (this.mRandomGroupValue != this.config.randomGroupNum)
        bool = false;
    }
  }

  private boolean isRangeValueHit()
  {
    AppMethodBeat.i(83564);
    boolean bool;
    if (((this.charmRange != null) && (!this.charmRange.isHit())) || ((this.ageRange != null) && (!this.ageRange.isHit())) || ((this.genderRange != null) && (!this.genderRange.isHit())) || ((this.popularRange != null) && (!this.popularRange.isHit())) || ((this.cpRange != null) && (!this.cpRange.isHit())))
    {
      bool = false;
      AppMethodBeat.o(83564);
    }
    while (true)
    {
      return bool;
      bool = true;
      AppMethodBeat.o(83564);
    }
  }

  private void updateTriggeredStatus(PTDetectInfo paramPTDetectInfo)
  {
    int i = 1;
    AppMethodBeat.i(83561);
    int j;
    int k;
    if ((isNormalTriggered(paramPTDetectInfo)) && (isRangeValueHit()) && (isRandomGroupValueHit()) && (isAudioTriggered()))
    {
      j = 1;
      k = i;
      if (j == 0)
      {
        if (!this.config.renderForBitmap)
          break label113;
        k = i;
      }
      label59: if (k == 0)
        break label129;
      if (this.status != TRIGGERED_STATUS.NOT_TRIGGERED)
        break label119;
      this.frameStartTime = paramPTDetectInfo.timestamp;
      this.status = TRIGGERED_STATUS.FIRST_TRIGGERED;
    }
    while (true)
    {
      if (!isTriggered())
        this.playCount = 0;
      AppMethodBeat.o(83561);
      return;
      j = 0;
      break;
      label113: k = 0;
      break label59;
      label119: this.status = TRIGGERED_STATUS.TRIGGERED;
      continue;
      label129: if ((this.config.alwaysTriggered) || (this.playCount >= this.config.playCount))
        this.status = TRIGGERED_STATUS.NOT_TRIGGERED;
    }
  }

  public double getAudioScaleFactor()
  {
    return this.audioScaleFactor;
  }

  public int getFrameIndex()
  {
    return this.frameIndex;
  }

  public long getFrameStartTime()
  {
    return this.frameStartTime;
  }

  public int getPlayCount()
  {
    return this.playCount;
  }

  public TRIGGERED_STATUS getTriggeredStatus(PTDetectInfo paramPTDetectInfo)
  {
    AppMethodBeat.i(83560);
    updateFrameIndex(paramPTDetectInfo.timestamp);
    updateTriggeredStatus(paramPTDetectInfo);
    paramPTDetectInfo = this.status;
    AppMethodBeat.o(83560);
    return paramPTDetectInfo;
  }

  public boolean isRenderForBitmap()
  {
    AppMethodBeat.i(83566);
    boolean bool = this.config.isRenderForBitmap();
    AppMethodBeat.o(83566);
    return bool;
  }

  public boolean isTriggered()
  {
    if ((this.status == TRIGGERED_STATUS.FIRST_TRIGGERED) || (this.status == TRIGGERED_STATUS.TRIGGERED));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public void reset()
  {
    AppMethodBeat.i(83568);
    this.playCount = 0;
    this.status = TRIGGERED_STATUS.NOT_TRIGGERED;
    if (this.bodyPositionRecord != null)
      this.bodyPositionRecord.clear();
    AppMethodBeat.o(83568);
  }

  public void setFrameStartTime(long paramLong)
  {
    this.frameStartTime = paramLong;
  }

  public void setPlayCount(int paramInt)
  {
    this.playCount = paramInt;
  }

  public void setRandomGroupValue(int paramInt)
  {
    this.mRandomGroupValue = paramInt;
  }

  public void setRenderForBitmap(boolean paramBoolean)
  {
    AppMethodBeat.i(83565);
    this.config.setRenderForBitmap(paramBoolean);
    AppMethodBeat.o(83565);
  }

  public void setTriggerWords(String paramString)
  {
    AppMethodBeat.i(83567);
    this.config.setTriggerWords(paramString);
    AppMethodBeat.o(83567);
  }

  public void updateFrameIndex(long paramLong)
  {
    AppMethodBeat.i(83563);
    if (!isTriggered())
      this.frameStartTime = paramLong;
    this.frameIndex = ((int)((paramLong - this.frameStartTime) / Math.max(this.frameDuration, 1.0D)));
    if (this.frameIndex >= this.frames * (this.playCount + 1))
      this.playCount += 1;
    this.frameIndex %= Math.max(this.frames, 1);
    AppMethodBeat.o(83563);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.model.TriggerCtrlItem
 * JD-Core Version:    0.6.2
 */