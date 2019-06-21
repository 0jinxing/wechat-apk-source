package com.google.android.gms.internal.measurement;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

class zzaay<K extends Comparable<K>, V> extends AbstractMap<K, V>
{
  private boolean zzbls;
  private final int zzbtx;
  private List<zzabd> zzbty;
  private Map<K, V> zzbtz;
  private volatile zzabf zzbua;
  private Map<K, V> zzbub;

  private zzaay(int paramInt)
  {
    AppMethodBeat.i(3367);
    this.zzbtx = paramInt;
    this.zzbty = Collections.emptyList();
    this.zzbtz = Collections.emptyMap();
    this.zzbub = Collections.emptyMap();
    AppMethodBeat.o(3367);
  }

  private final int zza(K paramK)
  {
    AppMethodBeat.i(3379);
    int i = 0;
    int j = this.zzbty.size() - 1;
    int k;
    if (j >= 0)
    {
      k = paramK.compareTo((Comparable)((zzabd)this.zzbty.get(j)).getKey());
      if (k > 0)
      {
        j = -(j + 2);
        AppMethodBeat.o(3379);
      }
      while (true)
      {
        return j;
        if (k != 0)
          break;
        AppMethodBeat.o(3379);
      }
    }
    while (true)
    {
      if (i <= j)
      {
        k = (i + j) / 2;
        int m = paramK.compareTo((Comparable)((zzabd)this.zzbty.get(k)).getKey());
        if (m < 0)
        {
          j = k - 1;
          continue;
        }
        if (m > 0)
        {
          i = k + 1;
          continue;
        }
        AppMethodBeat.o(3379);
        j = k;
        break;
      }
      j = -(i + 1);
      AppMethodBeat.o(3379);
      break;
    }
  }

  static <FieldDescriptorType extends zzzo<FieldDescriptorType>> zzaay<FieldDescriptorType, Object> zzag(int paramInt)
  {
    AppMethodBeat.i(3366);
    zzaaz localzzaaz = new zzaaz(paramInt);
    AppMethodBeat.o(3366);
    return localzzaaz;
  }

  private final V zzai(int paramInt)
  {
    AppMethodBeat.i(3378);
    zzul();
    Object localObject = ((zzabd)this.zzbty.remove(paramInt)).getValue();
    if (!this.zzbtz.isEmpty())
    {
      Iterator localIterator = zzum().entrySet().iterator();
      this.zzbty.add(new zzabd(this, (Map.Entry)localIterator.next()));
      localIterator.remove();
    }
    AppMethodBeat.o(3378);
    return localObject;
  }

  private final void zzul()
  {
    AppMethodBeat.i(3381);
    if (this.zzbls)
    {
      UnsupportedOperationException localUnsupportedOperationException = new UnsupportedOperationException();
      AppMethodBeat.o(3381);
      throw localUnsupportedOperationException;
    }
    AppMethodBeat.o(3381);
  }

  private final SortedMap<K, V> zzum()
  {
    AppMethodBeat.i(3382);
    zzul();
    if ((this.zzbtz.isEmpty()) && (!(this.zzbtz instanceof TreeMap)))
    {
      this.zzbtz = new TreeMap();
      this.zzbub = ((TreeMap)this.zzbtz).descendingMap();
    }
    SortedMap localSortedMap = (SortedMap)this.zzbtz;
    AppMethodBeat.o(3382);
    return localSortedMap;
  }

  public void clear()
  {
    AppMethodBeat.i(3376);
    zzul();
    if (!this.zzbty.isEmpty())
      this.zzbty.clear();
    if (!this.zzbtz.isEmpty())
      this.zzbtz.clear();
    AppMethodBeat.o(3376);
  }

  public boolean containsKey(Object paramObject)
  {
    AppMethodBeat.i(3373);
    paramObject = (Comparable)paramObject;
    boolean bool;
    if ((zza(paramObject) >= 0) || (this.zzbtz.containsKey(paramObject)))
    {
      bool = true;
      AppMethodBeat.o(3373);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(3373);
    }
  }

  public Set<Map.Entry<K, V>> entrySet()
  {
    AppMethodBeat.i(3380);
    if (this.zzbua == null)
      this.zzbua = new zzabf(this, null);
    zzabf localzzabf = this.zzbua;
    AppMethodBeat.o(3380);
    return localzzabf;
  }

  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    AppMethodBeat.i(3383);
    if (this == paramObject)
      AppMethodBeat.o(3383);
    while (true)
    {
      return bool;
      if (!(paramObject instanceof zzaay))
      {
        bool = super.equals(paramObject);
        AppMethodBeat.o(3383);
      }
      else
      {
        paramObject = (zzaay)paramObject;
        int i = size();
        if (i != paramObject.size())
        {
          AppMethodBeat.o(3383);
          bool = false;
        }
        else
        {
          int j = zzuj();
          if (j != paramObject.zzuj())
          {
            bool = entrySet().equals(paramObject.entrySet());
            AppMethodBeat.o(3383);
          }
          else
          {
            for (int k = 0; ; k++)
            {
              if (k >= j)
                break label157;
              if (!zzah(k).equals(paramObject.zzah(k)))
              {
                AppMethodBeat.o(3383);
                bool = false;
                break;
              }
            }
            label157: if (j != i)
            {
              bool = this.zzbtz.equals(paramObject.zzbtz);
              AppMethodBeat.o(3383);
            }
            else
            {
              AppMethodBeat.o(3383);
            }
          }
        }
      }
    }
  }

  public V get(Object paramObject)
  {
    AppMethodBeat.i(3374);
    paramObject = (Comparable)paramObject;
    int i = zza(paramObject);
    if (i >= 0)
    {
      paramObject = ((zzabd)this.zzbty.get(i)).getValue();
      AppMethodBeat.o(3374);
    }
    while (true)
    {
      return paramObject;
      paramObject = this.zzbtz.get(paramObject);
      AppMethodBeat.o(3374);
    }
  }

  public int hashCode()
  {
    AppMethodBeat.i(3384);
    int i = zzuj();
    int j = 0;
    int k = 0;
    while (j < i)
    {
      k += ((zzabd)this.zzbty.get(j)).hashCode();
      j++;
    }
    if (this.zzbtz.size() > 0)
      k = this.zzbtz.hashCode() + k;
    while (true)
    {
      AppMethodBeat.o(3384);
      return k;
    }
  }

  public final boolean isImmutable()
  {
    return this.zzbls;
  }

  public V remove(Object paramObject)
  {
    AppMethodBeat.i(3377);
    zzul();
    paramObject = (Comparable)paramObject;
    int i = zza(paramObject);
    if (i >= 0)
    {
      paramObject = zzai(i);
      AppMethodBeat.o(3377);
    }
    while (true)
    {
      return paramObject;
      if (this.zzbtz.isEmpty())
      {
        paramObject = null;
        AppMethodBeat.o(3377);
      }
      else
      {
        paramObject = this.zzbtz.remove(paramObject);
        AppMethodBeat.o(3377);
      }
    }
  }

  public int size()
  {
    AppMethodBeat.i(3372);
    int i = this.zzbty.size();
    int j = this.zzbtz.size();
    AppMethodBeat.o(3372);
    return i + j;
  }

  public final V zza(K paramK, V paramV)
  {
    AppMethodBeat.i(3375);
    zzul();
    int i = zza(paramK);
    if (i >= 0)
    {
      paramK = ((zzabd)this.zzbty.get(i)).setValue(paramV);
      AppMethodBeat.o(3375);
    }
    while (true)
    {
      return paramK;
      zzul();
      if ((this.zzbty.isEmpty()) && (!(this.zzbty instanceof ArrayList)))
        this.zzbty = new ArrayList(this.zzbtx);
      i = -(i + 1);
      if (i >= this.zzbtx)
      {
        paramK = zzum().put(paramK, paramV);
        AppMethodBeat.o(3375);
      }
      else
      {
        if (this.zzbty.size() == this.zzbtx)
        {
          zzabd localzzabd = (zzabd)this.zzbty.remove(this.zzbtx - 1);
          zzum().put((Comparable)localzzabd.getKey(), localzzabd.getValue());
        }
        this.zzbty.add(i, new zzabd(this, paramK, paramV));
        paramK = null;
        AppMethodBeat.o(3375);
      }
    }
  }

  public final Map.Entry<K, V> zzah(int paramInt)
  {
    AppMethodBeat.i(3370);
    Map.Entry localEntry = (Map.Entry)this.zzbty.get(paramInt);
    AppMethodBeat.o(3370);
    return localEntry;
  }

  public void zzrg()
  {
    AppMethodBeat.i(3368);
    if (!this.zzbls)
    {
      if (!this.zzbtz.isEmpty())
        break label67;
      localMap = Collections.emptyMap();
      this.zzbtz = localMap;
      if (!this.zzbub.isEmpty())
        break label78;
    }
    label67: label78: for (Map localMap = Collections.emptyMap(); ; localMap = Collections.unmodifiableMap(this.zzbub))
    {
      this.zzbub = localMap;
      this.zzbls = true;
      AppMethodBeat.o(3368);
      return;
      localMap = Collections.unmodifiableMap(this.zzbtz);
      break;
    }
  }

  public final int zzuj()
  {
    AppMethodBeat.i(3369);
    int i = this.zzbty.size();
    AppMethodBeat.o(3369);
    return i;
  }

  public final Iterable<Map.Entry<K, V>> zzuk()
  {
    AppMethodBeat.i(3371);
    Object localObject;
    if (this.zzbtz.isEmpty())
    {
      localObject = zzaba.zzun();
      AppMethodBeat.o(3371);
    }
    while (true)
    {
      return localObject;
      localObject = this.zzbtz.entrySet();
      AppMethodBeat.o(3371);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.measurement.zzaay
 * JD-Core Version:    0.6.2
 */