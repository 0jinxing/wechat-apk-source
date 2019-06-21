package com.google.android.gms.common.data;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.util.VisibleForTesting;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Iterator;

@VisibleForTesting
public final class ConcatenatedDataBuffer<T>
  implements DataBuffer<T>, ExclusionFilterable, TextFilterable
{
  private Bundle mBundle;
  private final ArrayList<DataBuffer<T>> zznf;
  private final ArrayList<Integer> zzng;
  private int zznh;

  public ConcatenatedDataBuffer()
  {
    AppMethodBeat.i(61020);
    this.zznf = new ArrayList();
    this.zzng = new ArrayList();
    AppMethodBeat.o(61020);
  }

  public ConcatenatedDataBuffer(DataBuffer<T> paramDataBuffer)
  {
    AppMethodBeat.i(61021);
    this.zznf = new ArrayList();
    this.zzng = new ArrayList();
    append(paramDataBuffer);
    AppMethodBeat.o(61021);
  }

  public static <T> ConcatenatedDataBuffer<T> extend(ConcatenatedDataBuffer<T> paramConcatenatedDataBuffer, DataBuffer<T> paramDataBuffer)
  {
    AppMethodBeat.i(61029);
    ConcatenatedDataBuffer localConcatenatedDataBuffer = new ConcatenatedDataBuffer();
    paramConcatenatedDataBuffer = (ArrayList)paramConcatenatedDataBuffer.zznf;
    int i = paramConcatenatedDataBuffer.size();
    int j = 0;
    while (j < i)
    {
      Object localObject = paramConcatenatedDataBuffer.get(j);
      j++;
      localConcatenatedDataBuffer.append((DataBuffer)localObject);
    }
    localConcatenatedDataBuffer.append(paramDataBuffer);
    AppMethodBeat.o(61029);
    return localConcatenatedDataBuffer;
  }

  public final void append(DataBuffer<T> paramDataBuffer)
  {
    AppMethodBeat.i(61024);
    if (paramDataBuffer == null)
      AppMethodBeat.o(61024);
    while (true)
    {
      return;
      try
      {
        if (this.zznf.isEmpty())
        {
          Bundle localBundle = new android/os/Bundle;
          localBundle.<init>();
          this.mBundle = localBundle;
          localBundle = paramDataBuffer.getMetadata();
          if (localBundle != null)
            this.mBundle.putString("prev_page_token", localBundle.getString("prev_page_token"));
        }
        this.zznf.add(paramDataBuffer);
        computeCounts();
        paramDataBuffer = paramDataBuffer.getMetadata();
        if (paramDataBuffer != null)
          this.mBundle.putString("next_page_token", paramDataBuffer.getString("next_page_token"));
        while (true)
        {
          AppMethodBeat.o(61024);
          break;
          this.mBundle.remove("next_page_token");
        }
      }
      finally
      {
        AppMethodBeat.o(61024);
      }
    }
    throw paramDataBuffer;
  }

  public final void clearFilters()
  {
    AppMethodBeat.i(61032);
    int i = this.zznf.size();
    for (int j = 0; j < i; j++)
    {
      DataBuffer localDataBuffer = (DataBuffer)this.zznf.get(j);
      if ((localDataBuffer instanceof ExclusionFilterable))
        ((ExclusionFilterable)localDataBuffer).clearFilters();
    }
    computeCounts();
    AppMethodBeat.o(61032);
  }

  @Deprecated
  public final void close()
  {
    AppMethodBeat.i(61025);
    release();
    AppMethodBeat.o(61025);
  }

  public final void computeCounts()
  {
    AppMethodBeat.i(61028);
    this.zzng.clear();
    int i = this.zznf.size();
    int j = 0;
    int k = 0;
    if (j < i)
    {
      DataBuffer localDataBuffer = (DataBuffer)this.zznf.get(j);
      if (localDataBuffer == null)
        break label86;
      k = localDataBuffer.getCount() + k;
    }
    label86: 
    while (true)
    {
      this.zzng.add(Integer.valueOf(k));
      j++;
      break;
      this.zznh = k;
      AppMethodBeat.o(61028);
      return;
    }
  }

  public final void filterOut(String paramString)
  {
    AppMethodBeat.i(61030);
    int i = this.zznf.size();
    for (int j = 0; j < i; j++)
    {
      DataBuffer localDataBuffer = (DataBuffer)this.zznf.get(j);
      if ((localDataBuffer instanceof ExclusionFilterable))
        ((ExclusionFilterable)localDataBuffer).filterOut(paramString);
    }
    computeCounts();
    AppMethodBeat.o(61030);
  }

  public final T get(int paramInt)
  {
    AppMethodBeat.i(61022);
    try
    {
      int i = this.zznf.size();
      int j = 0;
      Object localObject1;
      if (j < i)
      {
        int k = ((Integer)this.zzng.get(j)).intValue();
        if (paramInt < k)
        {
          localObject1 = (DataBuffer)this.zznf.get(j);
          if (localObject1 != null)
            localObject1 = ((DataBuffer)localObject1).get(paramInt - k + ((DataBuffer)localObject1).getCount());
        }
      }
      while (true)
      {
        return localObject1;
        j++;
        break;
        localObject1 = null;
        AppMethodBeat.o(61022);
      }
    }
    finally
    {
      AppMethodBeat.o(61022);
    }
  }

  public final int getCount()
  {
    try
    {
      int i = this.zznh;
      return i;
    }
    finally
    {
    }
  }

  public final Bundle getMetadata()
  {
    try
    {
      Bundle localBundle = this.mBundle;
      return localBundle;
    }
    finally
    {
    }
  }

  @Deprecated
  public final boolean isClosed()
  {
    return false;
  }

  public final Iterator<T> iterator()
  {
    AppMethodBeat.i(61026);
    DataBufferIterator localDataBufferIterator = new DataBufferIterator(this);
    AppMethodBeat.o(61026);
    return localDataBufferIterator;
  }

  public final void release()
  {
    AppMethodBeat.i(61023);
    try
    {
      int i = this.zznf.size();
      for (int j = 0; j < i; j++)
      {
        DataBuffer localDataBuffer = (DataBuffer)this.zznf.get(j);
        if (localDataBuffer != null)
          localDataBuffer.release();
      }
      this.zznf.clear();
      this.zzng.clear();
      this.mBundle = null;
      return;
    }
    finally
    {
      AppMethodBeat.o(61023);
    }
  }

  public final void setFilterTerm(Context paramContext, TextFilterable.StringFilter paramStringFilter, String paramString)
  {
    AppMethodBeat.i(61034);
    int i = this.zznf.size();
    for (int j = 0; j < i; j++)
    {
      DataBuffer localDataBuffer = (DataBuffer)this.zznf.get(j);
      if ((localDataBuffer instanceof TextFilterable))
        ((TextFilterable)localDataBuffer).setFilterTerm(paramContext, paramStringFilter, paramString);
    }
    computeCounts();
    AppMethodBeat.o(61034);
  }

  public final void setFilterTerm(Context paramContext, String paramString)
  {
    AppMethodBeat.i(61033);
    int i = this.zznf.size();
    for (int j = 0; j < i; j++)
    {
      DataBuffer localDataBuffer = (DataBuffer)this.zznf.get(j);
      if ((localDataBuffer instanceof TextFilterable))
        ((TextFilterable)localDataBuffer).setFilterTerm(paramContext, paramString);
    }
    computeCounts();
    AppMethodBeat.o(61033);
  }

  public final Iterator<T> singleRefIterator()
  {
    AppMethodBeat.i(61027);
    Iterator localIterator = iterator();
    AppMethodBeat.o(61027);
    return localIterator;
  }

  public final void unfilter(String paramString)
  {
    AppMethodBeat.i(61031);
    int i = this.zznf.size();
    for (int j = 0; j < i; j++)
    {
      DataBuffer localDataBuffer = (DataBuffer)this.zznf.get(j);
      if ((localDataBuffer instanceof ExclusionFilterable))
        ((ExclusionFilterable)localDataBuffer).unfilter(paramString);
    }
    computeCounts();
    AppMethodBeat.o(61031);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.data.ConcatenatedDataBuffer
 * JD-Core Version:    0.6.2
 */