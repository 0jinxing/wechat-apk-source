package com.google.android.gms.internal.measurement;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

final class zzzm<FieldDescriptorType extends zzzo<FieldDescriptorType>>
{
  private static final zzzm zzbru;
  private boolean zzbls;
  private final zzaay<FieldDescriptorType, Object> zzbrs;
  private boolean zzbrt;

  static
  {
    AppMethodBeat.i(3580);
    zzbru = new zzzm(true);
    AppMethodBeat.o(3580);
  }

  private zzzm()
  {
    AppMethodBeat.i(3572);
    this.zzbrt = false;
    this.zzbrs = zzaay.zzag(16);
    AppMethodBeat.o(3572);
  }

  private zzzm(boolean paramBoolean)
  {
    AppMethodBeat.i(3573);
    this.zzbrt = false;
    this.zzbrs = zzaay.zzag(0);
    if (!this.zzbls)
    {
      this.zzbrs.zzrg();
      this.zzbls = true;
    }
    AppMethodBeat.o(3573);
  }

  private static void zza(zzabp paramzzabp, Object paramObject)
  {
    boolean bool = false;
    AppMethodBeat.i(3578);
    zzzr.checkNotNull(paramObject);
    switch (zzzn.zzbrv[paramzzabp.zzuv().ordinal()])
    {
    default:
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
    case 6:
    case 7:
    case 8:
    case 9:
    }
    while (!bool)
    {
      paramzzabp = new IllegalArgumentException("Wrong object type used with protocol message reflection.");
      AppMethodBeat.o(3578);
      throw paramzzabp;
      bool = paramObject instanceof Integer;
      continue;
      bool = paramObject instanceof Long;
      continue;
      bool = paramObject instanceof Float;
      continue;
      bool = paramObject instanceof Double;
      continue;
      bool = paramObject instanceof Boolean;
      continue;
      bool = paramObject instanceof String;
      continue;
      if (((paramObject instanceof zzyw)) || ((paramObject instanceof byte[])))
      {
        bool = true;
        continue;
        if (((paramObject instanceof Integer)) || ((paramObject instanceof zzzs)))
        {
          bool = true;
          continue;
          if (((paramObject instanceof zzaal)) || ((paramObject instanceof zzzu)))
            bool = true;
        }
      }
    }
    AppMethodBeat.o(3578);
  }

  private final void zza(FieldDescriptorType paramFieldDescriptorType, Object paramObject)
  {
    AppMethodBeat.i(3577);
    if (paramFieldDescriptorType.zztk())
    {
      if (!(paramObject instanceof List))
      {
        paramFieldDescriptorType = new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        AppMethodBeat.o(3577);
        throw paramFieldDescriptorType;
      }
      ArrayList localArrayList1 = new ArrayList();
      localArrayList1.addAll((List)paramObject);
      ArrayList localArrayList2 = (ArrayList)localArrayList1;
      int i = localArrayList2.size();
      int j = 0;
      while (true)
      {
        paramObject = localArrayList1;
        if (j >= i)
          break;
        paramObject = localArrayList2.get(j);
        j++;
        zza(paramFieldDescriptorType.zztj(), paramObject);
      }
    }
    zza(paramFieldDescriptorType.zztj(), paramObject);
    if ((paramObject instanceof zzzu))
      this.zzbrt = true;
    this.zzbrs.zza(paramFieldDescriptorType, paramObject);
    AppMethodBeat.o(3577);
  }

  public static <T extends zzzo<T>> zzzm<T> zzti()
  {
    return zzbru;
  }

  public final boolean equals(Object paramObject)
  {
    AppMethodBeat.i(3574);
    boolean bool;
    if (this == paramObject)
    {
      bool = true;
      AppMethodBeat.o(3574);
    }
    while (true)
    {
      return bool;
      if (!(paramObject instanceof zzzm))
      {
        bool = false;
        AppMethodBeat.o(3574);
      }
      else
      {
        paramObject = (zzzm)paramObject;
        bool = this.zzbrs.equals(paramObject.zzbrs);
        AppMethodBeat.o(3574);
      }
    }
  }

  public final int hashCode()
  {
    AppMethodBeat.i(3575);
    int i = this.zzbrs.hashCode();
    AppMethodBeat.o(3575);
    return i;
  }

  public final Iterator<Map.Entry<FieldDescriptorType, Object>> iterator()
  {
    AppMethodBeat.i(3576);
    Object localObject;
    if (this.zzbrt)
    {
      localObject = new zzzx(this.zzbrs.entrySet().iterator());
      AppMethodBeat.o(3576);
    }
    while (true)
    {
      return localObject;
      localObject = this.zzbrs.entrySet().iterator();
      AppMethodBeat.o(3576);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.measurement.zzzm
 * JD-Core Version:    0.6.2
 */