package com.tencent.ttpic;

import com.tencent.filter.BaseFilter;
import com.tencent.filter.o;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class PTFilter$PTYUV2RGBAFilter extends PTFilter
{
  public PTFilter$PTYUV2RGBAFilter()
  {
    AppMethodBeat.i(80692);
    this.mFilter = new o();
    AppMethodBeat.o(80692);
  }

  public void setRotationAndFlip(int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    int i = 1;
    AppMethodBeat.i(80693);
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
      AppMethodBeat.o(80693);
      return;
      j = 0;
      break;
      label48: i = 0;
    }
  }

  public void setTextureCoordsMatrix(float[] paramArrayOfFloat)
  {
    AppMethodBeat.i(80694);
    this.mFilter.nativeUpdateMatrix(paramArrayOfFloat);
    AppMethodBeat.o(80694);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.PTFilter.PTYUV2RGBAFilter
 * JD-Core Version:    0.6.2
 */