package com.tencent.ttpic.util;

import com.tencent.matrix.trace.core.AppMethodBeat;

public enum VideoMaterialUtil$FACE_CROP_ITEM
{
  public String value;

  static
  {
    AppMethodBeat.i(84080);
    FRAME_DURATION = new FACE_CROP_ITEM("FRAME_DURATION", 0, "frameDuration");
    FRAMES = new FACE_CROP_ITEM("FRAMES", 1, "frames");
    FRAME_LIST = new FACE_CROP_ITEM("FRAME_LIST", 2, "frameList");
    $VALUES = new FACE_CROP_ITEM[] { FRAME_DURATION, FRAMES, FRAME_LIST };
    AppMethodBeat.o(84080);
  }

  private VideoMaterialUtil$FACE_CROP_ITEM(String paramString)
  {
    this.value = paramString;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.util.VideoMaterialUtil.FACE_CROP_ITEM
 * JD-Core Version:    0.6.2
 */