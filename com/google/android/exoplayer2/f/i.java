package com.google.android.exoplayer2.f;

import com.google.android.exoplayer2.b.f;
import java.util.List;

public abstract class i extends f
  implements d
{
  private long aOr;
  private d ble;

  public final void a(long paramLong1, d paramd, long paramLong2)
  {
    this.aSk = paramLong1;
    this.ble = paramd;
    paramLong1 = paramLong2;
    if (paramLong2 == 9223372036854775807L)
      paramLong1 = this.aSk;
    this.aOr = paramLong1;
  }

  public final int aj(long paramLong)
  {
    return this.ble.aj(paramLong - this.aOr);
  }

  public final List<a> ak(long paramLong)
  {
    return this.ble.ak(paramLong - this.aOr);
  }

  public final void clear()
  {
    super.clear();
    this.ble = null;
  }

  public final long et(int paramInt)
  {
    return this.ble.et(paramInt) + this.aOr;
  }

  public abstract void release();

  public final int sG()
  {
    return this.ble.sG();
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.f.i
 * JD-Core Version:    0.6.2
 */