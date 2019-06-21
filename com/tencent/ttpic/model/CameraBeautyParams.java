package com.tencent.ttpic.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.ttpic.config.BeautyRealConfig.TYPE;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class CameraBeautyParams
  implements Serializable
{
  public static final int RESHAPE_FILTER_ID_EYEBROW_ANGLE = 23;
  public static final int RESHAPE_FILTER_ID_EYEBROW_DISTANCE = 21;
  public static final int RESHAPE_FILTER_ID_EYEBROW_HEIGHT = 20;
  public static final int RESHAPE_FILTER_ID_EYES_ANGLE = 5;
  public static final int RESHAPE_FILTER_ID_EYES_DISTANCE = 6;
  public static final int RESHAPE_FILTER_ID_EYES_HEIGHT = 3;
  public static final int RESHAPE_FILTER_ID_EYES_SIZE = 4;
  public static final int RESHAPE_FILTER_ID_EYES_WIDTH = 2;
  public static final int RESHAPE_FILTER_ID_FACEOFF = 0;
  public static final int RESHAPE_FILTER_ID_FACE_JAW = 17;
  public static final int RESHAPE_FILTER_ID_FACE_SMILE = 16;
  public static final int RESHAPE_FILTER_ID_FACE_V = 19;
  public static final int RESHAPE_FILTER_ID_FACE_WIDTH = 18;
  public static final int RESHAPE_FILTER_ID_FOREHEAD_HEIGHT = 22;
  public static final int RESHAPE_FILTER_ID_LIPS_HEIGHT = 13;
  public static final int RESHAPE_FILTER_ID_LIPS_POSITION = 15;
  public static final int RESHAPE_FILTER_ID_LIPS_SIZE = 12;
  public static final int RESHAPE_FILTER_ID_LIPS_WIDTH = 14;
  public static final int RESHAPE_FILTER_ID_NOSE_BRIDGE_WIDTH = 9;
  public static final int RESHAPE_FILTER_ID_NOSE_OUTLINE_WIDTH = 8;
  public static final int RESHAPE_FILTER_ID_NOSE_POSITION = 10;
  public static final int RESHAPE_FILTER_ID_NOSE_SIZE = 7;
  public static final int RESHAPE_FILTER_ID_NOSE_TIP_SIZE = 11;
  public static final int RESHAPE_FILTER_ID_TOTAL = 1;
  public static List<Integer> RESHAPE_OTHER_FACE_PARAM;
  public static final int[] RESHAPE_WHOLE_FACE_PARAM;
  public float[] mProgress;
  public Map<String, Object> param;

  static
  {
    AppMethodBeat.i(83460);
    RESHAPE_WHOLE_FACE_PARAM = new int[] { 16, 17, 18, 19, 22 };
    RESHAPE_OTHER_FACE_PARAM = new ArrayList();
    for (int i = 0; i < 24; i++)
      if (!isInWholeFaceParam(i))
        RESHAPE_OTHER_FACE_PARAM.add(Integer.valueOf(i));
    AppMethodBeat.o(83460);
  }

  public CameraBeautyParams()
  {
    AppMethodBeat.i(83454);
    this.mProgress = new float[24];
    this.param = new HashMap();
    AppMethodBeat.o(83454);
  }

  private static boolean isInWholeFaceParam(int paramInt)
  {
    boolean bool1 = false;
    int[] arrayOfInt = RESHAPE_WHOLE_FACE_PARAM;
    int i = arrayOfInt.length;
    for (int j = 0; ; j++)
    {
      boolean bool2 = bool1;
      if (j < i)
      {
        if (paramInt == arrayOfInt[j])
          bool2 = true;
      }
      else
        return bool2;
    }
  }

  public boolean needRender()
  {
    AppMethodBeat.i(83459);
    boolean bool;
    if ((needRenderEyeNoseLips()) || (needRenderWholeFace()))
    {
      bool = true;
      AppMethodBeat.o(83459);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(83459);
    }
  }

  public boolean needRenderEyeNoseLips()
  {
    AppMethodBeat.i(83458);
    Iterator localIterator = RESHAPE_OTHER_FACE_PARAM.iterator();
    boolean bool;
    while (localIterator.hasNext())
    {
      int i = ((Integer)localIterator.next()).intValue();
      if (Math.abs(this.mProgress[i]) > 0.001D)
      {
        bool = true;
        AppMethodBeat.o(83458);
      }
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(83458);
    }
  }

  public boolean needRenderWholeFace()
  {
    boolean bool = false;
    AppMethodBeat.i(83457);
    int[] arrayOfInt = RESHAPE_WHOLE_FACE_PARAM;
    int i = arrayOfInt.length;
    int j = 0;
    if (j < i)
    {
      int k = arrayOfInt[j];
      if (Math.abs(this.mProgress[k]) > 0.001D)
      {
        bool = true;
        AppMethodBeat.o(83457);
      }
    }
    while (true)
    {
      return bool;
      j++;
      break;
      AppMethodBeat.o(83457);
    }
  }

  public void setParam(int paramInt, float paramFloat)
  {
    if (paramInt == BeautyRealConfig.TYPE.FOREHEAD.value)
      this.mProgress[22] = paramFloat;
    while (true)
    {
      return;
      if (paramInt == BeautyRealConfig.TYPE.EYE.value)
        this.mProgress[4] = paramFloat;
      else if (paramInt == BeautyRealConfig.TYPE.EYE_DISTANCE.value)
        this.mProgress[6] = paramFloat;
      else if (paramInt == BeautyRealConfig.TYPE.EYE_ANGLE.value)
        this.mProgress[5] = paramFloat;
      else if (paramInt == BeautyRealConfig.TYPE.MOUTH_SHAPE.value)
        this.mProgress[12] = (-paramFloat);
      else if (paramInt == BeautyRealConfig.TYPE.CHIN.value)
        this.mProgress[17] = paramFloat;
      else if (paramInt == BeautyRealConfig.TYPE.FACE_THIN.value)
        this.mProgress[18] = paramFloat;
      else if (paramInt == BeautyRealConfig.TYPE.FACE_V.value)
        this.mProgress[19] = paramFloat;
      else if (paramInt == BeautyRealConfig.TYPE.NOSE_WING.value)
        this.mProgress[8] = paramFloat;
      else if (paramInt == BeautyRealConfig.TYPE.NOSE_POSITION.value)
        this.mProgress[10] = paramFloat;
      else if (paramInt == BeautyRealConfig.TYPE.LIPS_THICKNESS.value)
        this.mProgress[13] = paramFloat;
      else if (paramInt == BeautyRealConfig.TYPE.LIPS_WIDTH.value)
        this.mProgress[14] = paramFloat;
    }
  }

  public void updateReshapeParams()
  {
    AppMethodBeat.i(83455);
    this.param.clear();
    this.param.put("eyesWidth", Float.valueOf(this.mProgress[2]));
    this.param.put("eyesHeight", Float.valueOf(this.mProgress[3]));
    this.param.put("eyesSize", Float.valueOf(this.mProgress[4]));
    this.param.put("eyesTiltAngle", Float.valueOf(this.mProgress[5]));
    this.param.put("eyesDistance", Float.valueOf(this.mProgress[6]));
    this.param.put("noseSize", Float.valueOf(this.mProgress[7]));
    this.param.put("noseOutlineWidth", Float.valueOf(this.mProgress[8]));
    this.param.put("noseBridgeWidth", Float.valueOf(this.mProgress[9]));
    this.param.put("nosePosition", Float.valueOf(this.mProgress[10]));
    this.param.put("noseTipSize", Float.valueOf(this.mProgress[11]));
    this.param.put("lipsSize", Float.valueOf(this.mProgress[12]));
    this.param.put("lipsWidth", Float.valueOf(this.mProgress[14]));
    this.param.put("lipsHeight", Float.valueOf(this.mProgress[13]));
    this.param.put("lipsYPosition", Float.valueOf(this.mProgress[15]));
    this.param.put("faceSmile", Float.valueOf(this.mProgress[16]));
    this.param.put("faceJaw", Float.valueOf(this.mProgress[17]));
    this.param.put("faceWidth", Float.valueOf(this.mProgress[18]));
    this.param.put("faceWidth2", Float.valueOf(this.mProgress[19]));
    this.param.put("eyebrowHeight", Float.valueOf(this.mProgress[20]));
    this.param.put("eyebrowDistance", Float.valueOf(this.mProgress[21]));
    this.param.put("eyebrowAngle", Float.valueOf(this.mProgress[23]));
    this.param.put("foreheadHeight", Float.valueOf(this.mProgress[22]));
    AppMethodBeat.o(83455);
  }

  public void updateReshapeParams4()
  {
    AppMethodBeat.i(83456);
    this.param.clear();
    this.param.put("eyesWidth", Float.valueOf(this.mProgress[2]));
    this.param.put("eyesHeight", Float.valueOf(this.mProgress[3]));
    this.param.put("eyesSize", Float.valueOf(this.mProgress[4]));
    this.param.put("eyesTiltAngle", Float.valueOf(this.mProgress[5]));
    this.param.put("eyesDistance", Float.valueOf(this.mProgress[6]));
    this.param.put("noseSize", Float.valueOf(this.mProgress[7]));
    this.param.put("noseOutlineWidth", Float.valueOf(this.mProgress[8]));
    this.param.put("noseBridgeWidth", Float.valueOf(this.mProgress[9]));
    this.param.put("nosePosition", Float.valueOf(this.mProgress[10]));
    this.param.put("noseTipSize", Float.valueOf(this.mProgress[11]));
    this.param.put("lipsSize", Float.valueOf(this.mProgress[12]));
    this.param.put("lipsWidth", Float.valueOf(this.mProgress[14]));
    this.param.put("lipsHeight", Float.valueOf(this.mProgress[13]));
    this.param.put("lipsYPosition", Float.valueOf(this.mProgress[15]));
    this.param.put("eyebrowHeight", Float.valueOf(this.mProgress[20]));
    this.param.put("eyebrowDistance", Float.valueOf(this.mProgress[21]));
    this.param.put("eyebrowAngle", Float.valueOf(this.mProgress[23]));
    this.param.put("faceSmile", Float.valueOf(this.mProgress[16]));
    this.param.put("faceJaw", Float.valueOf(this.mProgress[17]));
    this.param.put("faceWidth", Float.valueOf(this.mProgress[18]));
    this.param.put("faceWidth2", Float.valueOf(this.mProgress[19]));
    this.param.put("foreheadHeight", Float.valueOf(this.mProgress[22]));
    AppMethodBeat.o(83456);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.model.CameraBeautyParams
 * JD-Core Version:    0.6.2
 */