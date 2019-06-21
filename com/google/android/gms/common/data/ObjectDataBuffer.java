package com.google.android.gms.common.data;

import android.os.Bundle;
import com.google.android.gms.common.internal.Asserts;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public final class ObjectDataBuffer<T> extends AbstractDataBuffer<T>
  implements DataBufferObserver.Observable, ObjectExclusionFilterable<T>
{
  private final ArrayList<Integer> zzob;
  private final HashSet<Integer> zzoe;
  private DataBufferObserverSet zzof;
  private final ArrayList<T> zzog;

  public ObjectDataBuffer()
  {
    super(null);
    AppMethodBeat.i(61139);
    this.zzoe = new HashSet();
    this.zzob = new ArrayList();
    this.zzog = new ArrayList();
    this.zzof = new DataBufferObserverSet();
    zzcl();
    AppMethodBeat.o(61139);
  }

  public ObjectDataBuffer(ArrayList<T> paramArrayList)
  {
    super(null);
    AppMethodBeat.i(61141);
    this.zzoe = new HashSet();
    this.zzob = new ArrayList();
    this.zzog = paramArrayList;
    this.zzof = new DataBufferObserverSet();
    zzcl();
    AppMethodBeat.o(61141);
  }

  public ObjectDataBuffer(T[] paramArrayOfT)
  {
    super(null);
    AppMethodBeat.i(61140);
    this.zzoe = new HashSet();
    this.zzob = new ArrayList();
    this.zzog = new ArrayList(Arrays.asList(paramArrayOfT));
    this.zzof = new DataBufferObserverSet();
    zzcl();
    AppMethodBeat.o(61140);
  }

  private final void zzcl()
  {
    AppMethodBeat.i(61161);
    this.zzob.clear();
    int i = 0;
    int j = this.zzog.size();
    while (i < j)
    {
      if (!this.zzoe.contains(Integer.valueOf(i)))
        this.zzob.add(Integer.valueOf(i));
      i++;
    }
    AppMethodBeat.o(61161);
  }

  public final void add(T paramT)
  {
    boolean bool1 = false;
    AppMethodBeat.i(61144);
    int i = this.zzog.size();
    this.zzog.add(paramT);
    zzcl();
    int j;
    if (this.zzof.hasObservers())
    {
      if (this.zzoe.contains(Integer.valueOf(i)))
        break label132;
      bool2 = true;
      Asserts.checkState(bool2);
      j = this.zzob.size();
      if (j <= 0)
        break label138;
    }
    label132: label138: for (boolean bool2 = true; ; bool2 = false)
    {
      Asserts.checkState(bool2);
      bool2 = bool1;
      if (((Integer)this.zzob.get(j - 1)).intValue() == i)
        bool2 = true;
      Asserts.checkState(bool2);
      this.zzof.onDataRangeInserted(j - 1, 1);
      AppMethodBeat.o(61144);
      return;
      bool2 = false;
      break;
    }
  }

  public final void addObserver(DataBufferObserver paramDataBufferObserver)
  {
    AppMethodBeat.i(61142);
    this.zzof.addObserver(paramDataBufferObserver);
    AppMethodBeat.o(61142);
  }

  public final void filterOut(T paramT)
  {
    AppMethodBeat.i(61156);
    int i = this.zzog.size();
    int j = 0;
    int k = -1;
    int m = -1;
    int n = 0;
    int i1 = -1;
    int i2;
    if (j < i)
    {
      i2 = i1;
      if (this.zzoe.contains(Integer.valueOf(j)))
        break label202;
      i1++;
      if (paramT.equals(this.zzog.get(j)))
      {
        this.zzoe.add(Integer.valueOf(j));
        if (!this.zzof.hasObservers())
          break label213;
        if (m < 0)
        {
          k = 1;
          m = i1;
          i2 = 1;
        }
      }
    }
    while (true)
    {
      j++;
      n = i2;
      break;
      k++;
      i2 = 1;
      continue;
      i2 = i1;
      if (m >= 0)
      {
        zzcl();
        this.zzof.onDataRangeRemoved(m, k);
        n = -1;
        m = -1;
        i2 = 0;
        i1 -= k;
        k = n;
        continue;
        if (n != 0)
          zzcl();
        if (m >= 0)
          this.zzof.onDataRangeRemoved(m, k);
        AppMethodBeat.o(61156);
      }
      else
      {
        label202: i1 = i2;
        i2 = n;
        continue;
        label213: i2 = 1;
      }
    }
  }

  public final void filterOutRaw(int paramInt)
  {
    AppMethodBeat.i(61157);
    boolean bool = this.zzoe.add(Integer.valueOf(paramInt));
    int i;
    if ((this.zzof.hasObservers()) && (bool))
    {
      i = 0;
      int j = this.zzob.size();
      if (i < j)
        if (((Integer)this.zzob.get(i)).intValue() != paramInt);
    }
    while (true)
    {
      zzcl();
      if (i >= 0)
        this.zzof.onDataRangeRemoved(i, 1);
      AppMethodBeat.o(61157);
      return;
      i++;
      break;
      i = -1;
    }
  }

  public final T get(int paramInt)
  {
    AppMethodBeat.i(61148);
    Object localObject = this.zzog.get(getRawPosition(paramInt));
    AppMethodBeat.o(61148);
    return localObject;
  }

  public final int getCount()
  {
    AppMethodBeat.i(61147);
    int i = this.zzog.size();
    int j = this.zzoe.size();
    AppMethodBeat.o(61147);
    return i - j;
  }

  public final Bundle getMetadata()
  {
    return null;
  }

  public final int getPositionFromRawPosition(int paramInt)
  {
    AppMethodBeat.i(61152);
    int i = -1;
    int j = 0;
    while (j <= paramInt)
    {
      int k = i;
      if (!this.zzoe.contains(Integer.valueOf(j)))
        k = i + 1;
      j++;
      i = k;
    }
    AppMethodBeat.o(61152);
    return i;
  }

  public final T getRaw(int paramInt)
  {
    AppMethodBeat.i(61150);
    Object localObject = this.zzog.get(paramInt);
    AppMethodBeat.o(61150);
    return localObject;
  }

  public final int getRawCount()
  {
    AppMethodBeat.i(61149);
    int i = this.zzog.size();
    AppMethodBeat.o(61149);
    return i;
  }

  public final int getRawPosition(int paramInt)
  {
    AppMethodBeat.i(61151);
    if ((paramInt < 0) || (paramInt >= getCount()))
    {
      IllegalArgumentException localIllegalArgumentException = new IllegalArgumentException(53 + "Position " + paramInt + " is out of bounds for this buffer");
      AppMethodBeat.o(61151);
      throw localIllegalArgumentException;
    }
    paramInt = ((Integer)this.zzob.get(paramInt)).intValue();
    AppMethodBeat.o(61151);
    return paramInt;
  }

  public final void insertRaw(int paramInt, T paramT)
  {
    AppMethodBeat.i(61145);
    this.zzog.add(paramInt, paramT);
    Object localObject = new HashSet(this.zzoe.size());
    paramT = this.zzoe.iterator();
    int i = paramInt;
    while (paramT.hasNext())
    {
      Integer localInteger = (Integer)paramT.next();
      if (localInteger.intValue() < paramInt)
      {
        i--;
      }
      else
      {
        ((HashSet)localObject).add(Integer.valueOf(localInteger.intValue() + 1));
        paramT.remove();
      }
    }
    localObject = ((HashSet)localObject).iterator();
    while (((Iterator)localObject).hasNext())
    {
      paramT = (Integer)((Iterator)localObject).next();
      this.zzoe.add(paramT);
    }
    zzcl();
    if (this.zzof.hasObservers())
      this.zzof.onDataRangeInserted(i, 1);
    AppMethodBeat.o(61145);
  }

  public final boolean isRawPositionFiltered(int paramInt)
  {
    AppMethodBeat.i(61153);
    boolean bool = this.zzoe.contains(Integer.valueOf(paramInt));
    AppMethodBeat.o(61153);
    return bool;
  }

  public final void notifyChanged(T paramT)
  {
    AppMethodBeat.i(61160);
    if (!this.zzof.hasObservers())
      AppMethodBeat.o(61160);
    while (true)
    {
      return;
      int i = this.zzob.size();
      for (int j = 0; j < i; j++)
        if (paramT.equals(this.zzog.get(((Integer)this.zzob.get(j)).intValue())))
          this.zzof.onDataRangeChanged(j, 1);
      AppMethodBeat.o(61160);
    }
  }

  public final void release()
  {
    AppMethodBeat.i(61154);
    this.zzof.clear();
    AppMethodBeat.o(61154);
  }

  public final void removeObserver(DataBufferObserver paramDataBufferObserver)
  {
    AppMethodBeat.i(61143);
    this.zzof.removeObserver(paramDataBufferObserver);
    AppMethodBeat.o(61143);
  }

  public final void removeRaw(int paramInt)
  {
    AppMethodBeat.i(61155);
    this.zzog.remove(paramInt);
    boolean bool = this.zzoe.remove(Integer.valueOf(paramInt));
    Object localObject = new HashSet(this.zzoe.size());
    Iterator localIterator = this.zzoe.iterator();
    int i = paramInt;
    while (localIterator.hasNext())
    {
      Integer localInteger = (Integer)localIterator.next();
      if (localInteger.intValue() < paramInt)
      {
        i--;
      }
      else
      {
        localIterator.remove();
        ((HashSet)localObject).add(Integer.valueOf(localInteger.intValue() - 1));
      }
    }
    localIterator = ((HashSet)localObject).iterator();
    while (localIterator.hasNext())
    {
      localObject = (Integer)localIterator.next();
      this.zzoe.add(localObject);
    }
    zzcl();
    if ((!bool) && (this.zzof.hasObservers()))
      this.zzof.onDataRangeRemoved(i, 1);
    AppMethodBeat.o(61155);
  }

  public final boolean setRaw(int paramInt, T paramT)
  {
    AppMethodBeat.i(61146);
    this.zzog.set(paramInt, paramT);
    boolean bool;
    int i;
    if (!this.zzoe.contains(Integer.valueOf(paramInt)))
    {
      bool = true;
      if ((bool) && (this.zzof.hasObservers()))
        i = this.zzob.size();
    }
    for (int j = 0; ; j++)
      if (j < i)
      {
        if (((Integer)this.zzob.get(j)).intValue() == paramInt)
          this.zzof.onDataRangeChanged(j, 1);
      }
      else
      {
        AppMethodBeat.o(61146);
        return bool;
        bool = false;
        break;
      }
  }

  public final void unfilter(T paramT)
  {
    AppMethodBeat.i(61158);
    int i = this.zzog.size();
    int j = 0;
    int k = -1;
    int m = -1;
    int n = 0;
    int i1 = 0;
    int i2;
    if (j < i)
      if (!this.zzoe.contains(Integer.valueOf(j)))
      {
        i1++;
        i2 = i1;
        if (m < 0)
          break label259;
        zzcl();
        this.zzof.onDataRangeInserted(m, k);
        n = -1;
        m = -1;
        i2 = 0;
        i1 += k;
        k = n;
      }
    while (true)
    {
      j++;
      n = i2;
      break;
      if (paramT.equals(this.zzog.get(j)))
      {
        this.zzoe.remove(Integer.valueOf(j));
        if (this.zzof.hasObservers())
        {
          if (m < 0)
          {
            k = 1;
            m = i1;
            i2 = 1;
            continue;
          }
          k++;
          i2 = 1;
        }
      }
      else
      {
        i2 = i1;
        if (this.zzof.hasObservers())
        {
          i2 = i1;
          if (m >= 0)
          {
            zzcl();
            this.zzof.onDataRangeInserted(m, k);
            n = -1;
            m = -1;
            i2 = 0;
            i1 += k;
            k = n;
            continue;
            if (n != 0)
              zzcl();
            if (m >= 0)
              this.zzof.onDataRangeInserted(m, k);
            AppMethodBeat.o(61158);
          }
        }
        else
        {
          label259: i1 = i2;
          i2 = n;
          continue;
          i2 = 1;
        }
      }
    }
  }

  public final void unfilterRaw(int paramInt)
  {
    AppMethodBeat.i(61159);
    boolean bool = this.zzoe.remove(Integer.valueOf(paramInt));
    zzcl();
    if ((!this.zzof.hasObservers()) || (!bool))
    {
      AppMethodBeat.o(61159);
      return;
    }
    int i = 0;
    int j = this.zzob.size();
    label52: if (i < j)
      if (((Integer)this.zzob.get(i)).intValue() != paramInt);
    while (true)
    {
      if (i >= 0)
        this.zzof.onDataRangeInserted(i, 1);
      AppMethodBeat.o(61159);
      break;
      i++;
      break label52;
      i = -1;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.data.ObjectDataBuffer
 * JD-Core Version:    0.6.2
 */