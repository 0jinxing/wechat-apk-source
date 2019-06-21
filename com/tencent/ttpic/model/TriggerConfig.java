package com.tencent.ttpic.model;

import android.util.Pair;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.ttpic.PTFaceAttr.PTExpression;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TriggerConfig
{
  public final int BODY_TRIGGER_ANGLE_TOLERANCE = 15;
  public int activateTriggerCount;
  public int activateTriggerTotalCount;
  public boolean alwaysTriggered;
  public boolean audioNeedAdjust;
  public List<Pair<Float, Double>> audioScaleFactorMap;
  public int audioTriggerType;
  public StickerItem.ValueRange audioValueRange;
  public int bodyTriggerDirection;
  public int bodyTriggerDistance;
  public int bodyTriggerPoint;
  public double bodyTriggerTimeGap;
  public int countTriggerType;
  public int playCount;
  public int preTriggerType;
  public int randomGroupNum;
  public boolean renderForBitmap;
  private StickerItem stickerItem;
  public int triggerType;
  private Pattern triggerWordsPattern;

  public TriggerConfig()
  {
    this.triggerType = PTFaceAttr.PTExpression.FACE_DETECT.value;
  }

  public TriggerConfig(FaceItem paramFaceItem)
  {
    this.preTriggerType = paramFaceItem.preTriggerType;
    this.countTriggerType = paramFaceItem.countTriggerType;
    this.activateTriggerCount = paramFaceItem.activateTriggerCount;
    this.activateTriggerTotalCount = paramFaceItem.activateTriggerTotalCount;
    this.randomGroupNum = paramFaceItem.randomGroupNum;
    this.alwaysTriggered = paramFaceItem.alwaysTriggered;
    this.triggerType = paramFaceItem.triggerType;
    this.playCount = paramFaceItem.playCount;
  }

  public TriggerConfig(FaceMeshItem paramFaceMeshItem)
  {
    this.alwaysTriggered = paramFaceMeshItem.alwaysTriggered;
    this.triggerType = paramFaceMeshItem.triggerType;
    this.playCount = paramFaceMeshItem.playCount;
  }

  public TriggerConfig(StickerItem paramStickerItem)
  {
    this.preTriggerType = paramStickerItem.preTriggerType;
    this.countTriggerType = paramStickerItem.countTriggerType;
    this.activateTriggerCount = paramStickerItem.activateTriggerCount;
    this.activateTriggerTotalCount = paramStickerItem.activateTriggerTotalCount;
    this.randomGroupNum = paramStickerItem.randomGroupNum;
    this.alwaysTriggered = paramStickerItem.alwaysTriggered;
    this.triggerType = paramStickerItem.triggerType;
    this.audioTriggerType = paramStickerItem.audioTriggerType;
    this.audioNeedAdjust = paramStickerItem.audioNeedAdjust;
    this.audioValueRange = paramStickerItem.audioValueRange;
    this.audioScaleFactorMap = paramStickerItem.audioScaleFactorMap;
    this.playCount = paramStickerItem.playCount;
    this.bodyTriggerPoint = paramStickerItem.bodyTriggerPoint;
    this.bodyTriggerDirection = paramStickerItem.bodyTriggerDirection;
    this.bodyTriggerDistance = paramStickerItem.bodyTriggerDistance;
    this.bodyTriggerTimeGap = paramStickerItem.bodyTriggerTimeGap;
    this.stickerItem = paramStickerItem;
  }

  public int getBodyTriggerAngle()
  {
    int i = 0;
    int j = i;
    switch (this.bodyTriggerDirection)
    {
    default:
      j = i;
    case 0:
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
    case 6:
    case 7:
    }
    while (true)
    {
      return j;
      j = 45;
      continue;
      j = 90;
      continue;
      j = 135;
      continue;
      j = 180;
      continue;
      j = 225;
      continue;
      j = 270;
      continue;
      j = 315;
    }
  }

  public boolean isDBTriggered()
  {
    AppMethodBeat.i(83555);
    boolean bool;
    if ((this.stickerItem != null) && (this.stickerItem.isDBTriggered()))
    {
      bool = true;
      AppMethodBeat.o(83555);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(83555);
    }
  }

  public boolean isRenderForBitmap()
  {
    return this.renderForBitmap;
  }

  public boolean isSentenceTriggered(String paramString)
  {
    AppMethodBeat.i(83554);
    boolean bool;
    if (this.triggerWordsPattern == null)
    {
      bool = false;
      AppMethodBeat.o(83554);
    }
    while (true)
    {
      return bool;
      bool = this.triggerWordsPattern.matcher(paramString).find();
      AppMethodBeat.o(83554);
    }
  }

  public void setRenderForBitmap(boolean paramBoolean)
  {
    this.renderForBitmap = paramBoolean;
  }

  public void setTriggerWords(String paramString)
  {
    AppMethodBeat.i(83553);
    if (paramString == null)
      AppMethodBeat.o(83553);
    while (true)
    {
      return;
      this.triggerWordsPattern = Pattern.compile(paramString);
      AppMethodBeat.o(83553);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.model.TriggerConfig
 * JD-Core Version:    0.6.2
 */