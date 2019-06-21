package com.google.android.gms.internal.measurement;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class zzzg extends zzze
{
  private final byte[] buffer;
  private int limit;
  private int pos;
  private final boolean zzbrh;
  private int zzbri;
  private int zzbrj;
  private int zzbrk;

  private zzzg(byte[] paramArrayOfByte, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    super(null);
    AppMethodBeat.i(3558);
    this.zzbrk = 2147483647;
    this.buffer = paramArrayOfByte;
    this.limit = (paramInt1 + paramInt2);
    this.pos = paramInt1;
    this.zzbrj = this.pos;
    this.zzbrh = paramBoolean;
    AppMethodBeat.o(3558);
  }

  private final void zzta()
  {
    this.limit += this.zzbri;
    int i = this.limit - this.zzbrj;
    if (i > this.zzbrk)
    {
      this.zzbri = (i - this.zzbrk);
      this.limit -= this.zzbri;
    }
    while (true)
    {
      return;
      this.zzbri = 0;
    }
  }

  public final int zzaf(int paramInt)
  {
    AppMethodBeat.i(3559);
    zzzt localzzzt;
    if (paramInt < 0)
    {
      localzzzt = zzzt.zztn();
      AppMethodBeat.o(3559);
      throw localzzzt;
    }
    int i = zzsz() + paramInt;
    paramInt = this.zzbrk;
    if (i > paramInt)
    {
      localzzzt = zzzt.zztm();
      AppMethodBeat.o(3559);
      throw localzzzt;
    }
    this.zzbrk = i;
    zzta();
    AppMethodBeat.o(3559);
    return paramInt;
  }

  public final int zzsz()
  {
    return this.pos - this.zzbrj;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.measurement.zzzg
 * JD-Core Version:    0.6.2
 */