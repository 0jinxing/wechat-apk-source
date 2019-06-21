package com.b.a.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Arrays;

final class l
{
  float bEK;
  long bEO;
  private final float[] bEP;
  private int bEQ;
  private long bER;
  long bES;

  l()
  {
    AppMethodBeat.i(55604);
    this.bEP = new float[3];
    AppMethodBeat.o(55604);
  }

  final void a(float paramFloat, int paramInt, long paramLong)
  {
    AppMethodBeat.i(55605);
    long l = paramLong - this.bER;
    if (l > this.bEO)
    {
      Arrays.fill(this.bEP, 0.0F);
      this.bEQ = 0;
      this.bER = 0L;
      this.bES = 0L;
      this.bEK = 0.0F;
      this.bEP[0] = this.bEP[1];
      this.bEP[1] = this.bEP[2];
      this.bEP[2] = paramFloat;
      if (this.bEP[2] != 0.0F)
      {
        if (this.bEP[0] == 0.0F)
          break label206;
        paramFloat = (this.bEP[0] + this.bEP[1] + this.bEP[2]) / 3.0F;
      }
    }
    while (true)
    {
      float f = y.bIP;
      this.bEK = (paramInt / (paramFloat + this.bEP[2] * 3.0F) * f + y.bIQ * (paramInt - this.bEQ) / (this.bEQ + paramInt + 1));
      this.bEQ = paramInt;
      this.bER = paramLong;
      AppMethodBeat.o(55605);
      return;
      this.bES = (l + this.bES);
      break;
      label206: if (this.bEP[1] != 0.0F)
        paramFloat = (this.bEP[1] + this.bEP[2]) / 2.0F;
      else
        paramFloat = this.bEP[2];
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.b.a.a.l
 * JD-Core Version:    0.6.2
 */