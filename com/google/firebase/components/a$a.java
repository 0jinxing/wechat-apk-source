package com.google.firebase.components;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@KeepForSdk
public final class a$a<T>
{
  private final Set<Class<? super T>> buT;
  private final Set<f> buU;
  private d<T> buV;
  public int zzad;

  private a$a(Class<T> paramClass, Class<? super T>[] paramArrayOfClass)
  {
    AppMethodBeat.i(10601);
    this.buT = new HashSet();
    this.buU = new HashSet();
    this.zzad = 0;
    r.zza(paramClass, "Null interface");
    this.buT.add(paramClass);
    int j = paramArrayOfClass.length;
    while (i < j)
    {
      r.zza(paramArrayOfClass[i], "Null interface");
      i++;
    }
    Collections.addAll(this.buT, paramArrayOfClass);
    AppMethodBeat.o(10601);
  }

  @KeepForSdk
  public final a<T> a(d<T> paramd)
  {
    AppMethodBeat.i(10603);
    this.buV = ((d)r.zza(paramd, "Null factory"));
    AppMethodBeat.o(10603);
    return this;
  }

  @KeepForSdk
  public final a<T> a(f paramf)
  {
    AppMethodBeat.i(10602);
    r.zza(paramf, "Null dependency");
    Class localClass = paramf.buW;
    if (!this.buT.contains(localClass));
    for (int i = 1; i == 0; i = 0)
    {
      paramf = new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
      AppMethodBeat.o(10602);
      throw paramf;
    }
    this.buU.add(paramf);
    AppMethodBeat.o(10602);
    return this;
  }

  @KeepForSdk
  public final a<T> uA()
  {
    AppMethodBeat.i(10604);
    if (this.buV != null);
    for (boolean bool = true; ; bool = false)
    {
      r.c(bool, "Missing required property: factory.");
      a locala = new a(new HashSet(this.buT), new HashSet(this.buU), this.zzad, this.buV, (byte)0);
      AppMethodBeat.o(10604);
      return locala;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.google.firebase.components.a.a
 * JD-Core Version:    0.6.2
 */