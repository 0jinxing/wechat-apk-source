package com.tencent.ttpic.util;

import com.tencent.matrix.trace.core.AppMethodBeat;

public enum VideoMaterialUtil$FACE_OFF_TYPE
{
  public int value;

  static
  {
    AppMethodBeat.i(84098);
    NORMAL = new FACE_OFF_TYPE("NORMAL", 0, 0);
    BY_IMAGE = new FACE_OFF_TYPE("BY_IMAGE", 1, 1);
    $VALUES = new FACE_OFF_TYPE[] { NORMAL, BY_IMAGE };
    AppMethodBeat.o(84098);
  }

  private VideoMaterialUtil$FACE_OFF_TYPE(int paramInt)
  {
    this.value = paramInt;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.util.VideoMaterialUtil.FACE_OFF_TYPE
 * JD-Core Version:    0.6.2
 */