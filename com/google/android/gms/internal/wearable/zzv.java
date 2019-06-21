package com.google.android.gms.internal.wearable;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Arrays;

final class zzv
{
  final int tag;
  final byte[] zzhm;

  zzv(int paramInt, byte[] paramArrayOfByte)
  {
    this.tag = paramInt;
    this.zzhm = paramArrayOfByte;
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    AppMethodBeat.i(70782);
    if (paramObject == this)
      AppMethodBeat.o(70782);
    while (true)
    {
      return bool;
      if (!(paramObject instanceof zzv))
      {
        AppMethodBeat.o(70782);
        bool = false;
      }
      else
      {
        paramObject = (zzv)paramObject;
        if ((this.tag == paramObject.tag) && (Arrays.equals(this.zzhm, paramObject.zzhm)))
        {
          AppMethodBeat.o(70782);
        }
        else
        {
          AppMethodBeat.o(70782);
          bool = false;
        }
      }
    }
  }

  public final int hashCode()
  {
    AppMethodBeat.i(70783);
    int i = this.tag;
    int j = Arrays.hashCode(this.zzhm);
    AppMethodBeat.o(70783);
    return (i + 527) * 31 + j;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.wearable.zzv
 * JD-Core Version:    0.6.2
 */