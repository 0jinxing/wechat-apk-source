package com.google.android.exoplayer2.c.e;

import com.google.android.exoplayer2.c.f;
import com.google.android.exoplayer2.i.a;
import com.google.android.exoplayer2.i.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Arrays;

final class d
{
  final e aZP;
  final l bah;
  int bai;
  boolean baj;
  private int segmentCount;

  d()
  {
    AppMethodBeat.i(95039);
    this.aZP = new e();
    this.bah = new l(new byte[65025], 0);
    this.bai = -1;
    AppMethodBeat.o(95039);
  }

  private int ec(int paramInt)
  {
    int i = 0;
    this.segmentCount = 0;
    int j;
    int k;
    do
    {
      j = i;
      if (this.segmentCount + paramInt >= this.aZP.baq)
        break;
      int[] arrayOfInt = this.aZP.bas;
      j = this.segmentCount;
      this.segmentCount = (j + 1);
      k = arrayOfInt[(j + paramInt)];
      j = i + k;
      i = j;
    }
    while (k == 255);
    return j;
  }

  public final boolean k(f paramf)
  {
    boolean bool1 = false;
    AppMethodBeat.i(95040);
    if (paramf != null);
    for (boolean bool2 = true; ; bool2 = false)
    {
      a.checkState(bool2);
      if (this.baj)
      {
        this.baj = false;
        this.bah.reset();
      }
      if (this.baj)
        break label309;
      if (this.bai >= 0)
        break label140;
      if (this.aZP.c(paramf, true))
        break;
      AppMethodBeat.o(95040);
      bool2 = bool1;
      label69: return bool2;
    }
    int i = this.aZP.aVG;
    if (((this.aZP.type & 0x1) == 1) && (this.bah.limit == 0))
      i += ec(0);
    for (int j = this.segmentCount + 0; ; j = 0)
    {
      paramf.dG(i);
      this.bai = j;
      label140: j = ec(this.bai);
      i = this.bai + this.segmentCount;
      if (j > 0)
      {
        if (this.bah.capacity() < this.bah.limit + j)
          this.bah.data = Arrays.copyOf(this.bah.data, this.bah.limit + j);
        paramf.readFully(this.bah.data, this.bah.limit, j);
        this.bah.eL(j + this.bah.limit);
        if (this.aZP.bas[(i - 1)] != 255)
        {
          bool2 = true;
          label272: this.baj = bool2;
        }
      }
      else
      {
        if (i != this.aZP.baq)
          break label306;
        i = -1;
      }
      label306: 
      while (true)
      {
        this.bai = i;
        break;
        bool2 = false;
        break label272;
      }
      label309: AppMethodBeat.o(95040);
      bool2 = true;
      break label69;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.c.e.d
 * JD-Core Version:    0.6.2
 */