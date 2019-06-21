package com.tencent.ttpic;

import com.tencent.filter.BaseFilter;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class PTFilter$PTCropFilter extends PTFilter
{
  private float bottom = 0.0F;
  private float left = 0.0F;

  public void updateCorpRect(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(80653);
    float f1 = (paramInt3 - paramInt1) / 2.0F / paramInt3;
    float f2 = 1.0F - f1;
    float f3 = (paramInt4 - paramInt2) / 2.0F / paramInt4;
    float f4 = 1.0F - f3;
    if ((Float.compare(f1, this.left) == 0) && (Float.compare(f3, this.bottom) == 0))
      AppMethodBeat.o(80653);
    while (true)
    {
      return;
      this.left = f1;
      this.bottom = f3;
      this.mFilter.setTexCords(new float[] { f1, f3, f1, f4, f2, f4, f2, f3 });
      AppMethodBeat.o(80653);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.PTFilter.PTCropFilter
 * JD-Core Version:    0.6.2
 */