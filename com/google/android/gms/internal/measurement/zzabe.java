package com.google.android.gms.internal.measurement;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

final class zzabe
  implements Iterator<Map.Entry<K, V>>
{
  private int pos = -1;
  private boolean zzbug;
  private Iterator<Map.Entry<K, V>> zzbuh;

  private zzabe(zzaay paramzzaay)
  {
  }

  private final Iterator<Map.Entry<K, V>> zzup()
  {
    AppMethodBeat.i(3402);
    if (this.zzbuh == null)
      this.zzbuh = zzaay.zzc(this.zzbuf).entrySet().iterator();
    Iterator localIterator = this.zzbuh;
    AppMethodBeat.o(3402);
    return localIterator;
  }

  public final boolean hasNext()
  {
    AppMethodBeat.i(3400);
    boolean bool;
    if ((this.pos + 1 < zzaay.zzb(this.zzbuf).size()) || ((!zzaay.zzc(this.zzbuf).isEmpty()) && (zzup().hasNext())))
    {
      bool = true;
      AppMethodBeat.o(3400);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(3400);
    }
  }

  public final void remove()
  {
    AppMethodBeat.i(3401);
    Object localObject;
    if (!this.zzbug)
    {
      localObject = new IllegalStateException("remove() was called before next()");
      AppMethodBeat.o(3401);
      throw ((Throwable)localObject);
    }
    this.zzbug = false;
    zzaay.zza(this.zzbuf);
    if (this.pos < zzaay.zzb(this.zzbuf).size())
    {
      localObject = this.zzbuf;
      int i = this.pos;
      this.pos = (i - 1);
      zzaay.zza((zzaay)localObject, i);
      AppMethodBeat.o(3401);
    }
    while (true)
    {
      return;
      zzup().remove();
      AppMethodBeat.o(3401);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.measurement.zzabe
 * JD-Core Version:    0.6.2
 */