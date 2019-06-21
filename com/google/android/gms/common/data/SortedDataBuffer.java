package com.google.android.gms.common.data;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;

public final class SortedDataBuffer<T>
  implements DataBuffer<T>
{
  private final DataBuffer<T> zzok;
  private final Integer[] zzol;

  public SortedDataBuffer(DataBuffer<T> paramDataBuffer, Comparator<T> paramComparator)
  {
    AppMethodBeat.i(61173);
    this.zzok = paramDataBuffer;
    this.zzol = new Integer[paramDataBuffer.getCount()];
    for (int i = 0; i < this.zzol.length; i++)
      this.zzol[i] = Integer.valueOf(i);
    Arrays.sort(this.zzol, new zzb(this, paramComparator));
    AppMethodBeat.o(61173);
  }

  public final void close()
  {
    AppMethodBeat.i(61177);
    this.zzok.release();
    AppMethodBeat.o(61177);
  }

  public final T get(int paramInt)
  {
    AppMethodBeat.i(61174);
    Object localObject = this.zzok.get(this.zzol[paramInt].intValue());
    AppMethodBeat.o(61174);
    return localObject;
  }

  public final int getCount()
  {
    return this.zzol.length;
  }

  public final Bundle getMetadata()
  {
    AppMethodBeat.i(61176);
    Bundle localBundle = this.zzok.getMetadata();
    AppMethodBeat.o(61176);
    return localBundle;
  }

  public final boolean isClosed()
  {
    AppMethodBeat.i(61178);
    boolean bool = this.zzok.isClosed();
    AppMethodBeat.o(61178);
    return bool;
  }

  public final Iterator<T> iterator()
  {
    AppMethodBeat.i(61179);
    DataBufferIterator localDataBufferIterator = new DataBufferIterator(this);
    AppMethodBeat.o(61179);
    return localDataBufferIterator;
  }

  public final void release()
  {
    AppMethodBeat.i(61175);
    this.zzok.release();
    AppMethodBeat.o(61175);
  }

  public final Iterator<T> singleRefIterator()
  {
    AppMethodBeat.i(61180);
    Iterator localIterator = iterator();
    AppMethodBeat.o(61180);
    return localIterator;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.data.SortedDataBuffer
 * JD-Core Version:    0.6.2
 */