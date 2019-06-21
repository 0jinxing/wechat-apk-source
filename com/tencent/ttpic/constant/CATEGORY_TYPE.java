package com.tencent.ttpic.constant;

import com.tencent.matrix.trace.core.AppMethodBeat;

public enum CATEGORY_TYPE
{
  public final int value;

  static
  {
    AppMethodBeat.i(81861);
    NORMAL = new CATEGORY_TYPE("NORMAL", 0, 0);
    EMOJI = new CATEGORY_TYPE("EMOJI", 1, 1);
    $VALUES = new CATEGORY_TYPE[] { NORMAL, EMOJI };
    AppMethodBeat.o(81861);
  }

  private CATEGORY_TYPE(int paramInt)
  {
    this.value = paramInt;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.constant.CATEGORY_TYPE
 * JD-Core Version:    0.6.2
 */