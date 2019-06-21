package com.tencent.ttpic.util;

import com.tencent.matrix.trace.core.AppMethodBeat;

public enum VideoMaterialUtil$FACE_CROP_ITEM_FRAME
{
  public String value;

  static
  {
    AppMethodBeat.i(84083);
    FACE_ANGLE = new FACE_CROP_ITEM_FRAME("FACE_ANGLE", 0, "faceAngle");
    FACE_WIDTH = new FACE_CROP_ITEM_FRAME("FACE_WIDTH", 1, "faceWidth");
    INDEX = new FACE_CROP_ITEM_FRAME("INDEX", 2, "index");
    NOSE_POINT = new FACE_CROP_ITEM_FRAME("NOSE_POINT", 3, "nosePoint");
    SIZE = new FACE_CROP_ITEM_FRAME("SIZE", 4, "size");
    $VALUES = new FACE_CROP_ITEM_FRAME[] { FACE_ANGLE, FACE_WIDTH, INDEX, NOSE_POINT, SIZE };
    AppMethodBeat.o(84083);
  }

  private VideoMaterialUtil$FACE_CROP_ITEM_FRAME(String paramString)
  {
    this.value = paramString;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.util.VideoMaterialUtil.FACE_CROP_ITEM_FRAME
 * JD-Core Version:    0.6.2
 */