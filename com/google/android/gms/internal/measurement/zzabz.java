package com.google.android.gms.internal.measurement;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public final class zzabz<M extends zzaby<M>, T>
{
  public final int tag;
  private final int type;
  protected final Class<T> zzbwx;
  protected final boolean zzbwy;
  private final zzzq<?, ?> zzbwz;

  private zzabz(int paramInt1, Class<T> paramClass, int paramInt2, boolean paramBoolean)
  {
    this(11, paramClass, null, 810, false);
  }

  private zzabz(int paramInt1, Class<T> paramClass, zzzq<?, ?> paramzzzq, int paramInt2, boolean paramBoolean)
  {
    this.type = paramInt1;
    this.zzbwx = paramClass;
    this.tag = paramInt2;
    this.zzbwy = false;
    this.zzbwz = null;
  }

  public static <M extends zzaby<M>, T extends zzace> zzabz<M, T> zza(int paramInt, Class<T> paramClass, long paramLong)
  {
    AppMethodBeat.i(3481);
    paramClass = new zzabz(11, paramClass, 810, false);
    AppMethodBeat.o(3481);
    return paramClass;
  }

  private final Object zzf(zzabv paramzzabv)
  {
    AppMethodBeat.i(3484);
    Object localObject1;
    if (this.zzbwy)
      localObject1 = this.zzbwx.getComponentType();
    try
    {
      switch (this.type)
      {
      default:
        localObject2 = new java/lang/IllegalArgumentException;
        int i = this.type;
        paramzzabv = new java/lang/StringBuilder;
        paramzzabv.<init>(24);
        ((IllegalArgumentException)localObject2).<init>("Unknown type " + i);
        AppMethodBeat.o(3484);
        throw ((Throwable)localObject2);
      case 10:
      case 11:
      }
    }
    catch (InstantiationException paramzzabv)
    {
      while (true)
      {
        localObject1 = String.valueOf(localObject1);
        paramzzabv = new IllegalArgumentException(String.valueOf(localObject1).length() + 33 + "Error creating instance of class " + (String)localObject1, paramzzabv);
        AppMethodBeat.o(3484);
        throw paramzzabv;
        localObject1 = this.zzbwx;
      }
      Object localObject2 = (zzace)((Class)localObject1).newInstance();
      paramzzabv.zza((zzace)localObject2, this.tag >>> 3);
      AppMethodBeat.o(3484);
      for (paramzzabv = (zzabv)localObject2; ; paramzzabv = (zzabv)localObject2)
      {
        return paramzzabv;
        localObject2 = (zzace)((Class)localObject1).newInstance();
        paramzzabv.zza((zzace)localObject2);
        AppMethodBeat.o(3484);
      }
    }
    catch (IllegalAccessException paramzzabv)
    {
      localObject1 = String.valueOf(localObject1);
      paramzzabv = new IllegalArgumentException(String.valueOf(localObject1).length() + 33 + "Error creating instance of class " + (String)localObject1, paramzzabv);
      AppMethodBeat.o(3484);
      throw paramzzabv;
    }
    catch (IOException paramzzabv)
    {
      paramzzabv = new IllegalArgumentException("Error reading extension field", paramzzabv);
      AppMethodBeat.o(3484);
    }
    throw paramzzabv;
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject);
    while (true)
    {
      return bool;
      if (!(paramObject instanceof zzabz))
      {
        bool = false;
      }
      else
      {
        paramObject = (zzabz)paramObject;
        if ((this.type != paramObject.type) || (this.zzbwx != paramObject.zzbwx) || (this.tag != paramObject.tag) || (this.zzbwy != paramObject.zzbwy))
          bool = false;
      }
    }
  }

  public final int hashCode()
  {
    AppMethodBeat.i(3482);
    int i = this.type;
    int j = this.zzbwx.hashCode();
    int k = this.tag;
    if (this.zzbwy);
    for (int m = 1; ; m = 0)
    {
      AppMethodBeat.o(3482);
      return m + (((i + 1147) * 31 + j) * 31 + k) * 31;
    }
  }

  protected final void zza(Object paramObject, zzabw paramzzabw)
  {
    AppMethodBeat.i(3485);
    try
    {
      paramzzabw.zzar(this.tag);
      switch (this.type)
      {
      default:
        paramzzabw = new java/lang/IllegalArgumentException;
        i = this.type;
        paramObject = new java/lang/StringBuilder;
        paramObject.<init>(24);
        paramzzabw.<init>("Unknown type " + i);
        AppMethodBeat.o(3485);
        throw paramzzabw;
      case 10:
      case 11:
      }
    }
    catch (IOException paramObject)
    {
      paramObject = new IllegalStateException(paramObject);
      AppMethodBeat.o(3485);
      throw paramObject;
    }
    int i = this.tag;
    ((zzace)paramObject).zza(paramzzabw);
    paramzzabw.zzg(i >>> 3, 4);
    AppMethodBeat.o(3485);
    while (true)
    {
      return;
      paramzzabw.zzb((zzace)paramObject);
      AppMethodBeat.o(3485);
    }
  }

  final T zzi(List<zzacg> paramList)
  {
    int i = 0;
    AppMethodBeat.i(3483);
    if (paramList == null)
    {
      AppMethodBeat.o(3483);
      paramList = null;
    }
    while (true)
    {
      return paramList;
      if (this.zzbwy)
      {
        ArrayList localArrayList = new ArrayList();
        for (int j = 0; j < paramList.size(); j++)
        {
          zzacg localzzacg = (zzacg)paramList.get(j);
          if (localzzacg.zzbrc.length != 0)
            localArrayList.add(zzf(zzabv.zzi(localzzacg.zzbrc)));
        }
        int k = localArrayList.size();
        if (k == 0)
        {
          AppMethodBeat.o(3483);
          paramList = null;
        }
        else
        {
          paramList = this.zzbwx.cast(Array.newInstance(this.zzbwx.getComponentType(), k));
          for (j = i; j < k; j++)
            Array.set(paramList, j, localArrayList.get(j));
          AppMethodBeat.o(3483);
        }
      }
      else if (paramList.isEmpty())
      {
        AppMethodBeat.o(3483);
        paramList = null;
      }
      else
      {
        paramList = (zzacg)paramList.get(paramList.size() - 1);
        paramList = this.zzbwx.cast(zzf(zzabv.zzi(paramList.zzbrc)));
        AppMethodBeat.o(3483);
      }
    }
  }

  protected final int zzv(Object paramObject)
  {
    AppMethodBeat.i(3486);
    int i = this.tag >>> 3;
    switch (this.type)
    {
    default:
      i = this.type;
      paramObject = new IllegalArgumentException(24 + "Unknown type " + i);
      AppMethodBeat.o(3486);
      throw paramObject;
    case 10:
      paramObject = (zzace)paramObject;
      i = (zzabw.zzaq(i) << 1) + paramObject.zzvm();
      AppMethodBeat.o(3486);
    case 11:
    }
    while (true)
    {
      return i;
      i = zzabw.zzb(i, (zzace)paramObject);
      AppMethodBeat.o(3486);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.measurement.zzabz
 * JD-Core Version:    0.6.2
 */