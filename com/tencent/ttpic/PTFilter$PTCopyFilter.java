package com.tencent.ttpic;

import com.tencent.filter.BaseFilter;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class PTFilter$PTCopyFilter extends PTFilter
{
  public void setRotationAndFlip(int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    int i = 1;
    AppMethodBeat.i(80652);
    BaseFilter localBaseFilter = this.mFilter;
    int j;
    if (paramBoolean1)
    {
      j = 1;
      if (!paramBoolean2)
        break label48;
    }
    while (true)
    {
      localBaseFilter.nativeSetRotationAndFlip(paramInt, j, i);
      AppMethodBeat.o(80652);
      return;
      j = 0;
      break;
      label48: i = 0;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.PTFilter.PTCopyFilter
 * JD-Core Version:    0.6.2
 */