package com.google.android.gms.common.data;

import android.text.TextUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

@VisibleForTesting
public final class ExclusionFilteredDataBuffer<T> extends FilteredDataBuffer<T>
  implements DataBufferObserver.Observable, ExclusionFilterable
{
  private AbstractDataBuffer<T> zzoc;
  private final String zzod;
  private final HashSet<Integer> zzoe;
  private DataBufferObserverSet zzof;

  public ExclusionFilteredDataBuffer(AbstractDataBuffer<T> paramAbstractDataBuffer, String paramString)
  {
    super(paramAbstractDataBuffer);
    AppMethodBeat.i(61126);
    this.zzoe = new HashSet();
    this.zzoc = paramAbstractDataBuffer;
    this.zzod = paramString;
    this.zzof = new DataBufferObserverSet();
    AppMethodBeat.o(61126);
  }

  private final ArrayList<Integer> zza(String paramString, ArrayList<Integer> paramArrayList)
  {
    AppMethodBeat.i(61135);
    ArrayList localArrayList = new ArrayList();
    if (paramArrayList != null)
      paramArrayList.clear();
    DataHolder localDataHolder = this.zzoc.mDataHolder;
    String str1 = this.zzod;
    boolean bool = this.zzoc instanceof EntityBuffer;
    int i = this.zzoc.getCount();
    int j = 0;
    int k = 0;
    int m;
    label86: String str2;
    if (j < i)
      if (bool)
      {
        m = ((EntityBuffer)this.zzoc).zzi(j);
        str2 = localDataHolder.getString(str1, m, localDataHolder.getWindowIndex(m));
        if (paramArrayList == null)
          break label208;
        if (!this.zzoe.contains(Integer.valueOf(j)))
          break label184;
        m = -k - 1;
      }
    while (true)
    {
      if ((!TextUtils.isEmpty(str2)) && (str2.equals(paramString)))
      {
        localArrayList.add(Integer.valueOf(j));
        if (paramArrayList != null)
          paramArrayList.add(Integer.valueOf(m));
      }
      j++;
      break;
      m = j;
      break label86;
      label184: int n = k + 1;
      m = k;
      k = n;
      continue;
      AppMethodBeat.o(61135);
      return localArrayList;
      label208: m = k;
    }
  }

  public final void addObserver(DataBufferObserver paramDataBufferObserver)
  {
    AppMethodBeat.i(61127);
    this.zzof.addObserver(paramDataBufferObserver);
    AppMethodBeat.o(61127);
  }

  public final void clearFilters()
  {
    AppMethodBeat.i(61134);
    if (!this.zzof.hasObservers())
    {
      this.zzoe.clear();
      AppMethodBeat.o(61134);
    }
    while (true)
    {
      return;
      int i = this.zzoe.size();
      Integer[] arrayOfInteger = new Integer[i];
      arrayOfInteger = (Integer[])this.zzoe.toArray(arrayOfInteger);
      Arrays.sort(arrayOfInteger);
      int j = 0;
      int k = 0;
      int m = 0;
      if (j < i)
      {
        int n = arrayOfInteger[j].intValue();
        this.zzoe.remove(Integer.valueOf(n));
        if (k == 0)
          m = 1;
        while (true)
        {
          j++;
          k = m;
          m = n;
          break;
          if (n == m + k)
          {
            k++;
            n = m;
            m = k;
          }
          else
          {
            this.zzof.onDataRangeRemoved(m, k);
            m = 1;
          }
        }
      }
      if (k > 0)
        this.zzof.onDataRangeRemoved(m, k);
      AppMethodBeat.o(61134);
    }
  }

  public final int computeRealPosition(int paramInt)
  {
    AppMethodBeat.i(61130);
    if (this.zzoe.isEmpty())
      AppMethodBeat.o(61130);
    while (true)
    {
      return paramInt;
      if ((paramInt < 0) || (paramInt >= getCount()))
      {
        IllegalArgumentException localIllegalArgumentException = new IllegalArgumentException(53 + "Position " + paramInt + " is out of bounds for this buffer");
        AppMethodBeat.o(61130);
        throw localIllegalArgumentException;
      }
      int i = this.mDataBuffer.getCount();
      int j = 0;
      int m;
      for (int k = 0; ; k = m)
      {
        if (j >= i)
          break label149;
        m = k;
        if (!this.zzoe.contains(Integer.valueOf(j)))
        {
          if (k == paramInt)
          {
            AppMethodBeat.o(61130);
            paramInt = j;
            break;
          }
          m = k + 1;
        }
        j++;
      }
      label149: paramInt = -1;
      AppMethodBeat.o(61130);
    }
  }

  public final void filterOut(String paramString)
  {
    AppMethodBeat.i(61132);
    if (TextUtils.isEmpty(paramString))
    {
      AppMethodBeat.o(61132);
      return;
    }
    if (this.zzof.hasObservers());
    for (ArrayList localArrayList = new ArrayList(); ; localArrayList = null)
    {
      paramString = zza(paramString, localArrayList);
      int i;
      int j;
      int k;
      label66: int m;
      int n;
      if (this.zzof.hasObservers())
      {
        i = paramString.size() - 1;
        j = 0;
        k = 0;
        if (i >= 0)
        {
          m = ((Integer)localArrayList.get(i)).intValue();
          if (m < 0)
          {
            n = 1;
            label91: if (n != 0)
              break label226;
            n = ((Integer)paramString.get(i)).intValue();
            this.zzoe.add(Integer.valueOf(n));
            if (j != 0)
              break label146;
            j = 1;
            k = m;
          }
        }
      }
      label146: label226: 
      while (true)
      {
        i--;
        break label66;
        n = 0;
        break label91;
        if (m == k - 1)
        {
          k--;
          j++;
        }
        else
        {
          this.zzof.onDataRangeRemoved(k, j);
          j = 1;
          k = m;
          continue;
          if (j > 0)
            this.zzof.onDataRangeRemoved(k, j);
          AppMethodBeat.o(61132);
          break;
          this.zzoe.addAll(paramString);
          AppMethodBeat.o(61132);
          break;
        }
      }
    }
  }

  public final int getCount()
  {
    AppMethodBeat.i(61129);
    int i = this.mDataBuffer.getCount();
    int j = this.zzoe.size();
    AppMethodBeat.o(61129);
    return i - j;
  }

  public final void release()
  {
    AppMethodBeat.i(61131);
    super.release();
    this.zzof.clear();
    AppMethodBeat.o(61131);
  }

  public final void removeObserver(DataBufferObserver paramDataBufferObserver)
  {
    AppMethodBeat.i(61128);
    this.zzof.removeObserver(paramDataBufferObserver);
    AppMethodBeat.o(61128);
  }

  public final void unfilter(String paramString)
  {
    AppMethodBeat.i(61133);
    if (TextUtils.isEmpty(paramString))
    {
      AppMethodBeat.o(61133);
      return;
    }
    if (this.zzof.hasObservers());
    for (ArrayList localArrayList = new ArrayList(); ; localArrayList = null)
    {
      paramString = zza(paramString, localArrayList);
      int i;
      int j;
      int k;
      label66: int n;
      if (this.zzof.hasObservers())
      {
        i = paramString.size() - 1;
        j = 0;
        k = 0;
        if (i >= 0)
        {
          int m = ((Integer)localArrayList.get(i)).intValue();
          if (m < 0)
          {
            n = 1;
            label91: if (n == 0)
              break label254;
            n = ((Integer)paramString.get(i)).intValue();
            this.zzoe.remove(Integer.valueOf(n));
            n = -m - 1;
            if (j != 0)
              break label168;
            k = 1;
            j = n;
          }
        }
      }
      while (true)
      {
        n = i - 1;
        i = j;
        j = k;
        k = i;
        i = n;
        break label66;
        n = 0;
        break label91;
        label168: if (n == k)
        {
          n = j + 1;
          j = k;
          k = n;
        }
        else
        {
          this.zzof.onDataRangeInserted(k, j);
          k = 1;
          j = n;
          continue;
          if (j > 0)
            this.zzof.onDataRangeInserted(k, j);
          AppMethodBeat.o(61133);
          break;
          this.zzoe.removeAll(paramString);
          AppMethodBeat.o(61133);
          break;
          label254: n = k;
          k = j;
          j = n;
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.data.ExclusionFilteredDataBuffer
 * JD-Core Version:    0.6.2
 */