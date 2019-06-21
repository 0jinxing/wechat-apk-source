package com.google.android.exoplayer2.i;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Arrays;

public final class g
{
  private long[] brk;
  public int size;

  public g()
  {
    this((byte)0);
  }

  private g(byte paramByte)
  {
    AppMethodBeat.i(95876);
    this.brk = new long[32];
    AppMethodBeat.o(95876);
  }

  public final void add(long paramLong)
  {
    AppMethodBeat.i(95877);
    if (this.size == this.brk.length)
      this.brk = Arrays.copyOf(this.brk, this.size * 2);
    long[] arrayOfLong = this.brk;
    int i = this.size;
    this.size = (i + 1);
    arrayOfLong[i] = paramLong;
    AppMethodBeat.o(95877);
  }

  public final long get(int paramInt)
  {
    AppMethodBeat.i(95878);
    if ((paramInt < 0) || (paramInt >= this.size))
    {
      IndexOutOfBoundsException localIndexOutOfBoundsException = new IndexOutOfBoundsException("Invalid index " + paramInt + ", size is " + this.size);
      AppMethodBeat.o(95878);
      throw localIndexOutOfBoundsException;
    }
    long l = this.brk[paramInt];
    AppMethodBeat.o(95878);
    return l;
  }

  public final long[] toArray()
  {
    AppMethodBeat.i(95879);
    long[] arrayOfLong = Arrays.copyOf(this.brk, this.size);
    AppMethodBeat.o(95879);
    return arrayOfLong;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.i.g
 * JD-Core Version:    0.6.2
 */