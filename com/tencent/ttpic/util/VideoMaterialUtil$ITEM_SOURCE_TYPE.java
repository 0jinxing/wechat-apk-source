package com.tencent.ttpic.util;

import com.tencent.matrix.trace.core.AppMethodBeat;

public enum VideoMaterialUtil$ITEM_SOURCE_TYPE
{
  static
  {
    AppMethodBeat.i(84113);
    IMAGE = new ITEM_SOURCE_TYPE("IMAGE", 0);
    VIDEO_UP_DOWN = new ITEM_SOURCE_TYPE("VIDEO_UP_DOWN", 1);
    VIDEO_LEFT_RIGHT = new ITEM_SOURCE_TYPE("VIDEO_LEFT_RIGHT", 2);
    VIDEO_NORMAL = new ITEM_SOURCE_TYPE("VIDEO_NORMAL", 3);
    $VALUES = new ITEM_SOURCE_TYPE[] { IMAGE, VIDEO_UP_DOWN, VIDEO_LEFT_RIGHT, VIDEO_NORMAL };
    AppMethodBeat.o(84113);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.util.VideoMaterialUtil.ITEM_SOURCE_TYPE
 * JD-Core Version:    0.6.2
 */