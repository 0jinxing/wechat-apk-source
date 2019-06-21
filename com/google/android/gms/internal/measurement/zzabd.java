package com.google.android.gms.internal.measurement;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Map.Entry;

final class zzabd
  implements Comparable<zzabd>, Map.Entry<K, V>
{
  private V value;
  private final K zzbue;

  zzabd(K paramK, V paramV)
  {
    this.zzbue = paramV;
    Object localObject;
    this.value = localObject;
  }

  zzabd(Map.Entry<K, V> paramEntry)
  {
    this(paramEntry, (Comparable)localObject.getKey(), localObject.getValue());
    AppMethodBeat.i(3393);
    AppMethodBeat.o(3393);
  }

  private static boolean equals(Object paramObject1, Object paramObject2)
  {
    AppMethodBeat.i(3398);
    boolean bool;
    if (paramObject1 == null)
      if (paramObject2 == null)
      {
        bool = true;
        AppMethodBeat.o(3398);
      }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(3398);
      continue;
      bool = paramObject1.equals(paramObject2);
      AppMethodBeat.o(3398);
    }
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    AppMethodBeat.i(3395);
    if (paramObject == this)
      AppMethodBeat.o(3395);
    while (true)
    {
      return bool;
      if (!(paramObject instanceof Map.Entry))
      {
        AppMethodBeat.o(3395);
        bool = false;
      }
      else
      {
        paramObject = (Map.Entry)paramObject;
        if ((equals(this.zzbue, paramObject.getKey())) && (equals(this.value, paramObject.getValue())))
        {
          AppMethodBeat.o(3395);
        }
        else
        {
          AppMethodBeat.o(3395);
          bool = false;
        }
      }
    }
  }

  public final V getValue()
  {
    return this.value;
  }

  public final int hashCode()
  {
    int i = 0;
    AppMethodBeat.i(3396);
    int j;
    if (this.zzbue == null)
    {
      j = 0;
      if (this.value != null)
        break label45;
    }
    while (true)
    {
      AppMethodBeat.o(3396);
      return j ^ i;
      j = this.zzbue.hashCode();
      break;
      label45: i = this.value.hashCode();
    }
  }

  public final V setValue(V paramV)
  {
    AppMethodBeat.i(3394);
    zzaay.zza(this.zzbuf);
    Object localObject = this.value;
    this.value = paramV;
    AppMethodBeat.o(3394);
    return localObject;
  }

  public final String toString()
  {
    AppMethodBeat.i(3397);
    String str1 = String.valueOf(this.zzbue);
    String str2 = String.valueOf(this.value);
    str1 = String.valueOf(str1).length() + 1 + String.valueOf(str2).length() + str1 + "=" + str2;
    AppMethodBeat.o(3397);
    return str1;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.measurement.zzabd
 * JD-Core Version:    0.6.2
 */