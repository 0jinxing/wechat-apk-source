package com.google.android.gms.internal.measurement;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Arrays;

final class zzacg
{
  final int tag;
  final byte[] zzbrc;

  zzacg(int paramInt, byte[] paramArrayOfByte)
  {
    this.tag = paramInt;
    this.zzbrc = paramArrayOfByte;
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    AppMethodBeat.i(3519);
    if (paramObject == this)
      AppMethodBeat.o(3519);
    while (true)
    {
      return bool;
      if (!(paramObject instanceof zzacg))
      {
        AppMethodBeat.o(3519);
        bool = false;
      }
      else
      {
        paramObject = (zzacg)paramObject;
        if ((this.tag == paramObject.tag) && (Arrays.equals(this.zzbrc, paramObject.zzbrc)))
        {
          AppMethodBeat.o(3519);
        }
        else
        {
          AppMethodBeat.o(3519);
          bool = false;
        }
      }
    }
  }

  public final int hashCode()
  {
    AppMethodBeat.i(3520);
    int i = this.tag;
    int j = Arrays.hashCode(this.zzbrc);
    AppMethodBeat.o(3520);
    return (i + 527) * 31 + j;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.measurement.zzacg
 * JD-Core Version:    0.6.2
 */