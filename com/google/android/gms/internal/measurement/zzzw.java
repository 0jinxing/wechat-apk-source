package com.google.android.gms.internal.measurement;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Map.Entry;

final class zzzw<K>
  implements Map.Entry<K, Object>
{
  private Map.Entry<K, zzzu> zzbsu;

  private zzzw(Map.Entry<K, zzzu> paramEntry)
  {
    this.zzbsu = paramEntry;
  }

  public final K getKey()
  {
    AppMethodBeat.i(3594);
    Object localObject = this.zzbsu.getKey();
    AppMethodBeat.o(3594);
    return localObject;
  }

  public final Object getValue()
  {
    AppMethodBeat.i(3595);
    Object localObject;
    if ((zzzu)this.zzbsu.getValue() == null)
    {
      localObject = null;
      AppMethodBeat.o(3595);
    }
    while (true)
    {
      return localObject;
      localObject = zzzu.zzto();
      AppMethodBeat.o(3595);
    }
  }

  public final Object setValue(Object paramObject)
  {
    AppMethodBeat.i(3596);
    if (!(paramObject instanceof zzaal))
    {
      paramObject = new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
      AppMethodBeat.o(3596);
      throw paramObject;
    }
    paramObject = ((zzzu)this.zzbsu.getValue()).zzc((zzaal)paramObject);
    AppMethodBeat.o(3596);
    return paramObject;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.measurement.zzzw
 * JD-Core Version:    0.6.2
 */