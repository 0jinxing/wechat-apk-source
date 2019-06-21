package com.google.android.gms.internal.measurement;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map.Entry;

final class zzabf extends AbstractSet<Map.Entry<K, V>>
{
  private zzabf(zzaay paramzzaay)
  {
  }

  public final void clear()
  {
    AppMethodBeat.i(3408);
    this.zzbuf.clear();
    AppMethodBeat.o(3408);
  }

  public final boolean contains(Object paramObject)
  {
    AppMethodBeat.i(3406);
    Object localObject = (Map.Entry)paramObject;
    paramObject = this.zzbuf.get(((Map.Entry)localObject).getKey());
    localObject = ((Map.Entry)localObject).getValue();
    boolean bool;
    if ((paramObject == localObject) || ((paramObject != null) && (paramObject.equals(localObject))))
    {
      bool = true;
      AppMethodBeat.o(3406);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(3406);
    }
  }

  public final Iterator<Map.Entry<K, V>> iterator()
  {
    AppMethodBeat.i(3404);
    zzabe localzzabe = new zzabe(this.zzbuf, null);
    AppMethodBeat.o(3404);
    return localzzabe;
  }

  public final boolean remove(Object paramObject)
  {
    AppMethodBeat.i(3407);
    paramObject = (Map.Entry)paramObject;
    boolean bool;
    if (contains(paramObject))
    {
      this.zzbuf.remove(paramObject.getKey());
      bool = true;
      AppMethodBeat.o(3407);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(3407);
    }
  }

  public final int size()
  {
    AppMethodBeat.i(3405);
    int i = this.zzbuf.size();
    AppMethodBeat.o(3405);
    return i;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.measurement.zzabf
 * JD-Core Version:    0.6.2
 */