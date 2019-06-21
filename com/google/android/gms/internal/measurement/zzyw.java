package com.google.android.gms.internal.measurement;

import java.io.Serializable;

public abstract class zzyw
  implements Serializable, Iterable<Byte>
{
  public static final zzyw zzbqx = new zzzc(zzzr.zzbsq);
  private static final zzza zzbqy;
  private int zzboc = 0;

  static
  {
    if (zzyv.zzsv());
    for (Object localObject = new zzzd(null); ; localObject = new zzyy(null))
    {
      zzbqy = (zzza)localObject;
      return;
    }
  }

  static int zzb(int paramInt1, int paramInt2, int paramInt3)
  {
    int i = paramInt2 - paramInt1;
    if ((paramInt1 | paramInt2 | i | paramInt3 - paramInt2) < 0)
    {
      if (paramInt1 < 0)
        throw new IndexOutOfBoundsException(32 + "Beginning index: " + paramInt1 + " < 0");
      if (paramInt2 < paramInt1)
        throw new IndexOutOfBoundsException(66 + "Beginning index larger than ending index: " + paramInt1 + ", " + paramInt2);
      throw new IndexOutOfBoundsException(37 + "End index: " + paramInt2 + " >= " + paramInt3);
    }
    return i;
  }

  public static zzyw zzfi(String paramString)
  {
    return new zzzc(paramString.getBytes(zzzr.UTF_8));
  }

  public abstract boolean equals(Object paramObject);

  public final int hashCode()
  {
    int i = this.zzboc;
    int j = i;
    if (i == 0)
    {
      j = size();
      i = zza(j, 0, j);
      j = i;
      if (i == 0)
        j = 1;
      this.zzboc = j;
    }
    return j;
  }

  public abstract int size();

  public final String toString()
  {
    return String.format("<ByteString@%s size=%d>", new Object[] { Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()) });
  }

  protected abstract int zza(int paramInt1, int paramInt2, int paramInt3);

  public abstract byte zzae(int paramInt);

  public abstract zzyw zzb(int paramInt1, int paramInt2);

  protected final int zzsx()
  {
    return this.zzboc;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.measurement.zzyw
 * JD-Core Version:    0.6.2
 */