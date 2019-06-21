package com.google.android.gms.internal.measurement;

import com.tencent.matrix.trace.core.AppMethodBeat;

class zzzc extends zzzb
{
  protected final byte[] zzbrc;

  zzzc(byte[] paramArrayOfByte)
  {
    this.zzbrc = paramArrayOfByte;
  }

  public final boolean equals(Object paramObject)
  {
    AppMethodBeat.i(3555);
    boolean bool;
    if (paramObject == this)
    {
      AppMethodBeat.o(3555);
      bool = true;
    }
    while (true)
    {
      return bool;
      if (!(paramObject instanceof zzyw))
      {
        AppMethodBeat.o(3555);
        bool = false;
      }
      else if (size() != ((zzyw)paramObject).size())
      {
        AppMethodBeat.o(3555);
        bool = false;
      }
      else if (size() == 0)
      {
        AppMethodBeat.o(3555);
        bool = true;
      }
      else if ((paramObject instanceof zzzc))
      {
        zzzc localzzzc = (zzzc)paramObject;
        int i = zzsx();
        int j = localzzzc.zzsx();
        if ((i != 0) && (j != 0) && (i != j))
        {
          AppMethodBeat.o(3555);
          bool = false;
        }
        else
        {
          bool = zza((zzzc)paramObject, 0, size());
          AppMethodBeat.o(3555);
        }
      }
      else
      {
        bool = paramObject.equals(this);
        AppMethodBeat.o(3555);
      }
    }
  }

  public int size()
  {
    return this.zzbrc.length;
  }

  protected final int zza(int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(3557);
    paramInt1 = zzzr.zza(paramInt1, this.zzbrc, zzsy(), paramInt3);
    AppMethodBeat.o(3557);
    return paramInt1;
  }

  final boolean zza(zzyw paramzzyw, int paramInt1, int paramInt2)
  {
    boolean bool = false;
    AppMethodBeat.i(3556);
    if (paramInt2 > paramzzyw.size())
    {
      paramInt1 = size();
      paramzzyw = new IllegalArgumentException(40 + "Length too large: " + paramInt2 + paramInt1);
      AppMethodBeat.o(3556);
      throw paramzzyw;
    }
    if (paramInt2 > paramzzyw.size())
    {
      paramInt1 = paramzzyw.size();
      paramzzyw = new IllegalArgumentException(59 + "Ran off end of other: 0, " + paramInt2 + ", " + paramInt1);
      AppMethodBeat.o(3556);
      throw paramzzyw;
    }
    int j;
    if ((paramzzyw instanceof zzzc))
    {
      zzzc localzzzc = (zzzc)paramzzyw;
      paramzzyw = this.zzbrc;
      byte[] arrayOfByte = localzzzc.zzbrc;
      int i = zzsy();
      j = zzsy();
      paramInt1 = localzzzc.zzsy();
      if (j < i + paramInt2)
        if (paramzzyw[j] != arrayOfByte[paramInt1])
          AppMethodBeat.o(3556);
    }
    while (true)
    {
      return bool;
      j++;
      paramInt1++;
      break;
      bool = true;
      AppMethodBeat.o(3556);
      continue;
      bool = paramzzyw.zzb(0, paramInt2).equals(zzb(0, paramInt2));
      AppMethodBeat.o(3556);
    }
  }

  public byte zzae(int paramInt)
  {
    return this.zzbrc[paramInt];
  }

  public final zzyw zzb(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(3554);
    paramInt1 = zzb(0, paramInt2, size());
    Object localObject;
    if (paramInt1 == 0)
    {
      localObject = zzyw.zzbqx;
      AppMethodBeat.o(3554);
    }
    while (true)
    {
      return localObject;
      localObject = new zzyz(this.zzbrc, zzsy(), paramInt1);
      AppMethodBeat.o(3554);
    }
  }

  protected int zzsy()
  {
    return 0;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.measurement.zzzc
 * JD-Core Version:    0.6.2
 */