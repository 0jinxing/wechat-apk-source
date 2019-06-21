package com.google.android.gms.internal.wearable;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class zzp
  implements Cloneable
{
  private static final zzq zzhe;
  private int mSize;
  private boolean zzhf;
  private int[] zzhg;
  private zzq[] zzhh;

  static
  {
    AppMethodBeat.i(70758);
    zzhe = new zzq();
    AppMethodBeat.o(70758);
  }

  zzp()
  {
    this(10);
  }

  private zzp(int paramInt)
  {
    AppMethodBeat.i(70752);
    this.zzhf = false;
    paramInt = idealIntArraySize(paramInt);
    this.zzhg = new int[paramInt];
    this.zzhh = new zzq[paramInt];
    this.mSize = 0;
    AppMethodBeat.o(70752);
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

  private final int zzq(int paramInt)
  {
    int i = 0;
    int j = this.mSize - 1;
    while (i <= j)
    {
      int k = i + j >>> 1;
      int m = this.zzhg[k];
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
    AppMethodBeat.i(70755);
    if (paramObject == this)
      AppMethodBeat.o(70755);
    while (true)
    {
      return bool;
      if (!(paramObject instanceof zzp))
      {
        AppMethodBeat.o(70755);
        bool = false;
      }
      else
      {
        paramObject = (zzp)paramObject;
        if (this.mSize != paramObject.mSize)
        {
          AppMethodBeat.o(70755);
          bool = false;
        }
        else
        {
          Object localObject = this.zzhg;
          int[] arrayOfInt = paramObject.zzhg;
          int i = this.mSize;
          int j = 0;
          label82: if (j < i)
            if (localObject[j] != arrayOfInt[j])
            {
              j = 0;
              label104: if (j == 0)
                break label189;
              localObject = this.zzhh;
              paramObject = paramObject.zzhh;
              i = this.mSize;
              j = 0;
              if (j >= i)
                break label183;
              if (localObject[j].equals(paramObject[j]))
                break label177;
            }
          label128: label177: label183: for (j = 0; ; j = 1)
          {
            if (j == 0)
              break label189;
            AppMethodBeat.o(70755);
            break;
            j++;
            break label82;
            j = 1;
            break label104;
            j++;
            break label128;
          }
          label189: AppMethodBeat.o(70755);
          bool = false;
        }
      }
    }
  }

  public final int hashCode()
  {
    AppMethodBeat.i(70756);
    int i = 17;
    for (int j = 0; j < this.mSize; j++)
      i = (i * 31 + this.zzhg[j]) * 31 + this.zzhh[j].hashCode();
    AppMethodBeat.o(70756);
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

  final void zza(int paramInt, zzq paramzzq)
  {
    AppMethodBeat.i(70754);
    int i = zzq(paramInt);
    if (i >= 0)
    {
      this.zzhh[i] = paramzzq;
      AppMethodBeat.o(70754);
    }
    while (true)
    {
      return;
      int j = i ^ 0xFFFFFFFF;
      if ((j < this.mSize) && (this.zzhh[j] == zzhe))
      {
        this.zzhg[j] = paramInt;
        this.zzhh[j] = paramzzq;
        AppMethodBeat.o(70754);
      }
      else
      {
        Object localObject;
        if (this.mSize >= this.zzhg.length)
        {
          i = idealIntArraySize(this.mSize + 1);
          int[] arrayOfInt = new int[i];
          localObject = new zzq[i];
          System.arraycopy(this.zzhg, 0, arrayOfInt, 0, this.zzhg.length);
          System.arraycopy(this.zzhh, 0, localObject, 0, this.zzhh.length);
          this.zzhg = arrayOfInt;
          this.zzhh = ((zzq[])localObject);
        }
        if (this.mSize - j != 0)
        {
          localObject = this.zzhg;
          System.arraycopy(localObject, j, localObject, j + 1, this.mSize - j);
          localObject = this.zzhh;
          System.arraycopy(localObject, j, localObject, j + 1, this.mSize - j);
        }
        this.zzhg[j] = paramInt;
        this.zzhh[j] = paramzzq;
        this.mSize += 1;
        AppMethodBeat.o(70754);
      }
    }
  }

  final zzq zzo(int paramInt)
  {
    AppMethodBeat.i(70753);
    paramInt = zzq(paramInt);
    zzq localzzq;
    if ((paramInt < 0) || (this.zzhh[paramInt] == zzhe))
    {
      localzzq = null;
      AppMethodBeat.o(70753);
    }
    while (true)
    {
      return localzzq;
      localzzq = this.zzhh[paramInt];
      AppMethodBeat.o(70753);
    }
  }

  final zzq zzp(int paramInt)
  {
    return this.zzhh[paramInt];
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.wearable.zzp
 * JD-Core Version:    0.6.2
 */