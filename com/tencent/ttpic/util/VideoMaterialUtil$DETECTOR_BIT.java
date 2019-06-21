package com.tencent.ttpic.util;

import com.tencent.matrix.trace.core.AppMethodBeat;

public enum VideoMaterialUtil$DETECTOR_BIT
{
  private final int value;

  static
  {
    AppMethodBeat.i(84065);
    REFINE = new DETECTOR_BIT("REFINE", 0, 1);
    $VALUES = new DETECTOR_BIT[] { REFINE };
    AppMethodBeat.o(84065);
  }

  private VideoMaterialUtil$DETECTOR_BIT(int paramInt)
  {
    this.value = paramInt;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.util.VideoMaterialUtil.DETECTOR_BIT
 * JD-Core Version:    0.6.2
 */