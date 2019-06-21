package com.google.firebase.components;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Arrays;
import java.util.Collections;
import java.util.Set;

@KeepForSdk
public final class a<T>
{
  final Set<Class<? super T>> buT;
  final Set<f> buU;
  final d<T> buV;
  private final int zzad;

  private a(Set<Class<? super T>> paramSet, Set<f> paramSet1, int paramInt, d<T> paramd)
  {
    AppMethodBeat.i(10605);
    this.buT = Collections.unmodifiableSet(paramSet);
    this.buU = Collections.unmodifiableSet(paramSet1);
    this.zzad = paramInt;
    this.buV = paramd;
    AppMethodBeat.o(10605);
  }

  @KeepForSdk
  public static <T> a<T> a(Class<T> paramClass, T paramT)
  {
    AppMethodBeat.i(10608);
    paramClass = y(paramClass).a(new j(paramT)).uA();
    AppMethodBeat.o(10608);
    return paramClass;
  }

  @KeepForSdk
  public static <T> a.a<T> y(Class<T> paramClass)
  {
    AppMethodBeat.i(10607);
    paramClass = new a.a(paramClass, new Class[0], (byte)0);
    AppMethodBeat.o(10607);
    return paramClass;
  }

  public final String toString()
  {
    AppMethodBeat.i(10606);
    String str = "Component<" + Arrays.toString(this.buT.toArray()) + ">{" + this.zzad + ", deps=" + Arrays.toString(this.buU.toArray()) + "}";
    AppMethodBeat.o(10606);
    return str;
  }

  public final boolean uy()
  {
    boolean bool = true;
    if (this.zzad == 1);
    while (true)
    {
      return bool;
      bool = false;
    }
  }

  public final boolean uz()
  {
    if (this.zzad == 2);
    for (boolean bool = true; ; bool = false)
      return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.google.firebase.components.a
 * JD-Core Version:    0.6.2
 */