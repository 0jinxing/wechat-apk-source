package com.tencent.ttpic.facedetect;

import com.tencent.matrix.trace.core.AppMethodBeat;

public enum FaceDetector$FACE_DETECT_MODE
{
  static
  {
    AppMethodBeat.i(81914);
    SINGLE = new FACE_DETECT_MODE("SINGLE", 0);
    MULTIPLE = new FACE_DETECT_MODE("MULTIPLE", 1);
    $VALUES = new FACE_DETECT_MODE[] { SINGLE, MULTIPLE };
    AppMethodBeat.o(81914);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.facedetect.FaceDetector.FACE_DETECT_MODE
 * JD-Core Version:    0.6.2
 */