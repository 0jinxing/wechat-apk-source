package com.google.android.gms.common.data;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.HashSet;
import java.util.Iterator;

public final class DataBufferObserverSet
  implements DataBufferObserver, DataBufferObserver.Observable
{
  private HashSet<DataBufferObserver> zzni;

  public DataBufferObserverSet()
  {
    AppMethodBeat.i(61039);
    this.zzni = new HashSet();
    AppMethodBeat.o(61039);
  }

  public final void addObserver(DataBufferObserver paramDataBufferObserver)
  {
    AppMethodBeat.i(61042);
    this.zzni.add(paramDataBufferObserver);
    AppMethodBeat.o(61042);
  }

  public final void clear()
  {
    AppMethodBeat.i(61041);
    this.zzni.clear();
    AppMethodBeat.o(61041);
  }

  public final boolean hasObservers()
  {
    AppMethodBeat.i(61040);
    boolean bool;
    if (!this.zzni.isEmpty())
    {
      bool = true;
      AppMethodBeat.o(61040);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(61040);
    }
  }

  public final void onDataChanged()
  {
    AppMethodBeat.i(61044);
    Iterator localIterator = this.zzni.iterator();
    while (localIterator.hasNext())
      ((DataBufferObserver.Observable)localIterator.next()).onDataChanged();
    AppMethodBeat.o(61044);
  }

  public final void onDataRangeChanged(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(61045);
    Iterator localIterator = this.zzni.iterator();
    while (localIterator.hasNext())
      ((DataBufferObserver.Observable)localIterator.next()).onDataRangeChanged(paramInt1, paramInt2);
    AppMethodBeat.o(61045);
  }

  public final void onDataRangeInserted(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(61046);
    Iterator localIterator = this.zzni.iterator();
    while (localIterator.hasNext())
      ((DataBufferObserver.Observable)localIterator.next()).onDataRangeInserted(paramInt1, paramInt2);
    AppMethodBeat.o(61046);
  }

  public final void onDataRangeMoved(int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(61048);
    Iterator localIterator = this.zzni.iterator();
    while (localIterator.hasNext())
      ((DataBufferObserver.Observable)localIterator.next()).onDataRangeMoved(paramInt1, paramInt2, paramInt3);
    AppMethodBeat.o(61048);
  }

  public final void onDataRangeRemoved(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(61047);
    Iterator localIterator = this.zzni.iterator();
    while (localIterator.hasNext())
      ((DataBufferObserver.Observable)localIterator.next()).onDataRangeRemoved(paramInt1, paramInt2);
    AppMethodBeat.o(61047);
  }

  public final void removeObserver(DataBufferObserver paramDataBufferObserver)
  {
    AppMethodBeat.i(61043);
    this.zzni.remove(paramDataBufferObserver);
    AppMethodBeat.o(61043);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.data.DataBufferObserverSet
 * JD-Core Version:    0.6.2
 */