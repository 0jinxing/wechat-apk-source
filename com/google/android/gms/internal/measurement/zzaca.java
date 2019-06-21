package com.google.android.gms.internal.measurement;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class zzaca
  implements Cloneable
{
  private static final zzacb zzbxa;
  private int mSize;
  private boolean zzbxb;
  private int[] zzbxc;
  private zzacb[] zzbxd;

  static
  {
    AppMethodBeat.i(3493);
    zzbxa = new zzacb();
    AppMethodBeat.o(3493);
  }

  zzaca()
  {
    this(10);
  }

  private zzaca(int paramInt)
  {
    AppMethodBeat.i(3487);
    this.zzbxb = false;
    paramInt = idealIntArraySize(paramInt);
    this.zzbxc = new int[paramInt];
    this.zzbxd = new zzacb[paramInt];
    this.mSize = 0;
    AppMethodBeat.o(3487);
  }

  private static int idealIntArraySize(int paramInt)
  {
    int i = paramInt << 2;
    for (paramInt = 4; ; paramInt++)
    {
      int j = i;
      if (paramInt < 32)
      {
        if (i <= (1 << paramInt) - 12)
          j = (1 << paramInt) - 12;
      }
      else
        return j / 4;
    }
  }

  private final int zzav(int paramInt)
  {
    int i = 0;
    int j = this.mSize - 1;
    while (i <= j)
    {
      int k = i + j >>> 1;
      int m = this.zzbxc[k];
      if (m < paramInt)
      {
        i = k + 1;
      }
      else
      {
        j = k;
        if (m <= paramInt)
          break label65;
        j = k - 1;
      }
    }
    j = i ^ 0xFFFFFFFF;
    label65: return j;
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    AppMethodBeat.i(3490);
    if (paramObject == this)
      AppMethodBeat.o(3490);
    while (true)
    {
      return bool;
      if (!(paramObject instanceof zzaca))
      {
        AppMethodBeat.o(3490);
        bool = false;
      }
      else
      {
        paramObject = (zzaca)paramObject;
        if (this.mSize != paramObject.mSize)
        {
          AppMethodBeat.o(3490);
          bool = false;
        }
        else
        {
          Object localObject = this.zzbxc;
          int[] arrayOfInt = paramObject.zzbxc;
          int i = this.mSize;
          int j = 0;
          label86: if (j < i)
            if (localObject[j] != arrayOfInt[j])
            {
              j = 0;
              label108: if (j == 0)
                break label194;
              localObject = this.zzbxd;
              paramObject = paramObject.zzbxd;
              i = this.mSize;
              j = 0;
              if (j >= i)
                break label188;
              if (localObject[j].equals(paramObject[j]))
                break label182;
            }
          label132: label182: label188: for (j = 0; ; j = 1)
          {
            if (j == 0)
              break label194;
            AppMethodBeat.o(3490);
            break;
            j++;
            break label86;
            j = 1;
            break label108;
            j++;
            break label132;
          }
          label194: AppMethodBeat.o(3490);
          bool = false;
        }
      }
    }
  }

  public final int hashCode()
  {
    AppMethodBeat.i(3491);
    int i = 17;
    for (int j = 0; j < this.mSize; j++)
      i = (i * 31 + this.zzbxc[j]) * 31 + this.zzbxd[j].hashCode();
    AppMethodBeat.o(3491);
    return i;
  }

  public final boolean isEmpty()
  {
    if (this.mSize == 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  final int size()
  {
    return this.mSize;
  }

  final void zza(int paramInt, zzacb paramzzacb)
  {
    AppMethodBeat.i(3489);
    int i = zzav(paramInt);
    if (i >= 0)
    {
      this.zzbxd[i] = paramzzacb;
      AppMethodBeat.o(3489);
    }
    while (true)
    {
      return;
      int j = i ^ 0xFFFFFFFF;
      if ((j < this.mSize) && (this.zzbxd[j] == zzbxa))
      {
        this.zzbxc[j] = paramInt;
        this.zzbxd[j] = paramzzacb;
        AppMethodBeat.o(3489);
      }
      else
      {
        Object localObject;
        if (this.mSize >= this.zzbxc.length)
        {
          i = idealIntArraySize(this.mSize + 1);
          localObject = new int[i];
          zzacb[] arrayOfzzacb = new zzacb[i];
          System.arraycopy(this.zzbxc, 0, localObject, 0, this.zzbxc.length);
          System.arraycopy(this.zzbxd, 0, arrayOfzzacb, 0, this.zzbxd.length);
          this.zzbxc = ((int[])localObject);
          this.zzbxd = arrayOfzzacb;
        }
        if (this.mSize - j != 0)
        {
          localObject = this.zzbxc;
          System.arraycopy(localObject, j, localObject, j + 1, this.mSize - j);
          localObject = this.zzbxd;
          System.arraycopy(localObject, j, localObject, j + 1, this.mSize - j);
        }
        this.zzbxc[j] = paramInt;
        this.zzbxd[j] = paramzzacb;
        this.mSize += 1;
        AppMethodBeat.o(3489);
      }
    }
  }

  final zzacb zzat(int paramInt)
  {
    AppMethodBeat.i(3488);
    paramInt = zzav(paramInt);
    zzacb localzzacb;
    if ((paramInt < 0) || (this.zzbxd[paramInt] == zzbxa))
    {
      localzzacb = null;
      AppMethodBeat.o(3488);
    }
    while (true)
    {
      return localzzacb;
      localzzacb = this.zzbxd[paramInt];
      AppMethodBeat.o(3488);
    }
  }

  final zzacb zzau(int paramInt)
  {
    return this.zzbxd[paramInt];
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.measurement.zzaca
 * JD-Core Version:    0.6.2
 */