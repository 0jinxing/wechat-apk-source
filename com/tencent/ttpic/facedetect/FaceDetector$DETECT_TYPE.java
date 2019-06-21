package com.tencent.ttpic.facedetect;

import com.tencent.matrix.trace.core.AppMethodBeat;

public enum FaceDetector$DETECT_TYPE
{
  public final int value;

  static
  {
    AppMethodBeat.i(81911);
    DETECT_TYPE_NONE = new DETECT_TYPE("DETECT_TYPE_NONE", 0, 0);
    DETECT_TYPE_AGE = new DETECT_TYPE("DETECT_TYPE_AGE", 1, 1);
    DETECT_TYPE_SEX = new DETECT_TYPE("DETECT_TYPE_SEX", 2, 2);
    DETECT_TYPE_POPULAR = new DETECT_TYPE("DETECT_TYPE_POPULAR", 3, 4);
    DETECT_TYPE_CP = new DETECT_TYPE("DETECT_TYPE_CP", 4, 8);
    $VALUES = new DETECT_TYPE[] { DETECT_TYPE_NONE, DETECT_TYPE_AGE, DETECT_TYPE_SEX, DETECT_TYPE_POPULAR, DETECT_TYPE_CP };
    AppMethodBeat.o(81911);
  }

  private FaceDetector$DETECT_TYPE(int paramInt)
  {
    this.value = paramInt;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.facedetect.FaceDetector.DETECT_TYPE
 * JD-Core Version:    0.6.2
 */