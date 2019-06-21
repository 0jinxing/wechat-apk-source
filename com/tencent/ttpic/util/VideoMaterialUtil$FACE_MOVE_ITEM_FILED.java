package com.tencent.ttpic.util;

import com.tencent.matrix.trace.core.AppMethodBeat;

public enum VideoMaterialUtil$FACE_MOVE_ITEM_FILED
{
  public String value;

  static
  {
    AppMethodBeat.i(84092);
    POSITION = new FACE_MOVE_ITEM_FILED("POSITION", 0, "position");
    POS1 = new FACE_MOVE_ITEM_FILED("POS1", 1, "pos1");
    POS2 = new FACE_MOVE_ITEM_FILED("POS2", 2, "pos2");
    RATIO1 = new FACE_MOVE_ITEM_FILED("RATIO1", 3, "ratio1");
    RATIO2 = new FACE_MOVE_ITEM_FILED("RATIO2", 4, "ratio2");
    X = new FACE_MOVE_ITEM_FILED("X", 5, "x");
    Y = new FACE_MOVE_ITEM_FILED("Y", 6, "y");
    $VALUES = new FACE_MOVE_ITEM_FILED[] { POSITION, POS1, POS2, RATIO1, RATIO2, X, Y };
    AppMethodBeat.o(84092);
  }

  private VideoMaterialUtil$FACE_MOVE_ITEM_FILED(String paramString)
  {
    this.value = paramString;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.util.VideoMaterialUtil.FACE_MOVE_ITEM_FILED
 * JD-Core Version:    0.6.2
 */