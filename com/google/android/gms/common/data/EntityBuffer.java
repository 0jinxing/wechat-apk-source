package com.google.android.gms.common.data;

import java.util.ArrayList;

public abstract class EntityBuffer<T> extends AbstractDataBuffer<T>
{
  private boolean zzoa = false;
  private ArrayList<Integer> zzob;

  protected EntityBuffer(DataHolder paramDataHolder)
  {
    super(paramDataHolder);
  }

  private final void zzck()
  {
    int j;
    Object localObject4;
    try
    {
      if (this.zzoa)
        break label219;
      int i = this.mDataHolder.getCount();
      Object localObject1 = new java/util/ArrayList;
      ((ArrayList)localObject1).<init>();
      this.zzob = ((ArrayList)localObject1);
      if (i <= 0)
        break label214;
      this.zzob.add(Integer.valueOf(0));
      String str = getPrimaryDataMarkerColumn();
      j = this.mDataHolder.getWindowIndex(0);
      localObject1 = this.mDataHolder.getString(str, 0, j);
      j = 1;
      if (j >= i)
        break label214;
      int k = this.mDataHolder.getWindowIndex(j);
      localObject4 = this.mDataHolder.getString(str, j, k);
      if (localObject4 == null)
      {
        localObject4 = new java/lang/NullPointerException;
        i = String.valueOf(str).length();
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>(i + 78);
        ((NullPointerException)localObject4).<init>("Missing value for markerColumn: " + str + ", at row: " + j + ", for window: " + k);
        throw ((Throwable)localObject4);
      }
    }
    finally
    {
    }
    if (!((String)localObject4).equals(localObject2))
    {
      this.zzob.add(Integer.valueOf(j));
      Object localObject3 = localObject4;
    }
    while (true)
    {
      j++;
      break;
      label214: this.zzoa = true;
      label219: return;
    }
  }

  public final T get(int paramInt)
  {
    zzck();
    return getEntry(zzi(paramInt), getChildCount(paramInt));
  }

  protected int getChildCount(int paramInt)
  {
    int i;
    if ((paramInt < 0) || (paramInt == this.zzob.size()))
    {
      i = 0;
      return i;
    }
    if (paramInt == this.zzob.size() - 1);
    for (int j = this.mDataHolder.getCount() - ((Integer)this.zzob.get(paramInt)).intValue(); ; j = ((Integer)this.zzob.get(paramInt + 1)).intValue() - ((Integer)this.zzob.get(paramInt)).intValue())
    {
      i = j;
      if (j != 1)
        break;
      paramInt = zzi(paramInt);
      int k = this.mDataHolder.getWindowIndex(paramInt);
      String str = getChildDataMarkerColumn();
      i = j;
      if (str == null)
        break;
      i = j;
      if (this.mDataHolder.getString(str, paramInt, k) != null)
        break;
      i = 0;
      break;
    }
  }

  protected String getChildDataMarkerColumn()
  {
    return null;
  }

  public int getCount()
  {
    zzck();
    return this.zzob.size();
  }

  protected abstract T getEntry(int paramInt1, int paramInt2);

  protected abstract String getPrimaryDataMarkerColumn();

  final int zzi(int paramInt)
  {
    if ((paramInt < 0) || (paramInt >= this.zzob.size()))
      throw new IllegalArgumentException(53 + "Position " + paramInt + " is out of bounds for this buffer");
    return ((Integer)this.zzob.get(paramInt)).intValue();
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.data.EntityBuffer
 * JD-Core Version:    0.6.2
 */