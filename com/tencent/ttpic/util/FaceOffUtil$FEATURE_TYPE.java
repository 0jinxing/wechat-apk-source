package com.tencent.ttpic.util;

import com.tencent.matrix.trace.core.AppMethodBeat;

public enum FaceOffUtil$FEATURE_TYPE
{
  public int value;

  static
  {
    AppMethodBeat.i(83886);
    NO_EYE = new FEATURE_TYPE("NO_EYE", 0, 0);
    HAS_EYE = new FEATURE_TYPE("HAS_EYE", 1, 1);
    CRAZY_FACE = new FEATURE_TYPE("CRAZY_FACE", 2, 2);
    FACE_HEAD_CROP = new FEATURE_TYPE("FACE_HEAD_CROP", 3, 3);
    FACE_SKIN = new FEATURE_TYPE("FACE_SKIN", 4, 4);
    $VALUES = new FEATURE_TYPE[] { NO_EYE, HAS_EYE, CRAZY_FACE, FACE_HEAD_CROP, FACE_SKIN };
    AppMethodBeat.o(83886);
  }

  private FaceOffUtil$FEATURE_TYPE(int paramInt)
  {
    this.value = paramInt;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.util.FaceOffUtil.FEATURE_TYPE
 * JD-Core Version:    0.6.2
 */