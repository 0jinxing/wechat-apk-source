package com.google.android.exoplayer2.c.b;

import com.google.android.exoplayer2.c.f;
import com.google.android.exoplayer2.i.l;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class e
{
  final l aTj;
  int aVo;

  public e()
  {
    AppMethodBeat.i(94915);
    this.aTj = new l(8);
    AppMethodBeat.o(94915);
  }

  final long d(f paramf)
  {
    int i = 0;
    AppMethodBeat.i(94916);
    paramf.b(this.aTj.data, 0, 1);
    int j = this.aTj.data[0] & 0xFF;
    long l;
    if (j == 0)
    {
      l = -9223372036854775808L;
      AppMethodBeat.o(94916);
    }
    while (true)
    {
      return l;
      int k = 0;
      int m = 128;
      while ((j & m) == 0)
      {
        m >>= 1;
        k++;
      }
      j = (m ^ 0xFFFFFFFF) & j;
      paramf.b(this.aTj.data, 1, k);
      m = i;
      i = j;
      while (m < k)
      {
        i = (i << 8) + (this.aTj.data[(m + 1)] & 0xFF);
        m++;
      }
      this.aVo += k + 1;
      l = i;
      AppMethodBeat.o(94916);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.c.b.e
 * JD-Core Version:    0.6.2
 */