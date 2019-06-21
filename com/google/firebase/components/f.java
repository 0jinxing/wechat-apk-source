package com.google.firebase.components;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.tencent.matrix.trace.core.AppMethodBeat;

@KeepForSdk
public final class f
{
  final Class<?> buW;
  final int buX;
  private final int buY;

  private f(Class<?> paramClass)
  {
    AppMethodBeat.i(10610);
    this.buW = ((Class)r.zza(paramClass, "Null dependency interface."));
    this.buX = 1;
    this.buY = 0;
    AppMethodBeat.o(10610);
  }

  @KeepForSdk
  public static f A(Class<?> paramClass)
  {
    AppMethodBeat.i(10611);
    paramClass = new f(paramClass);
    AppMethodBeat.o(10611);
    return paramClass;
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool1 = false;
    boolean bool2 = bool1;
    if ((paramObject instanceof f))
    {
      paramObject = (f)paramObject;
      bool2 = bool1;
      if (this.buW == paramObject.buW)
      {
        bool2 = bool1;
        if (this.buX == paramObject.buX)
        {
          bool2 = bool1;
          if (this.buY == paramObject.buY)
            bool2 = true;
        }
      }
    }
    return bool2;
  }

  public final int hashCode()
  {
    AppMethodBeat.i(10612);
    int i = this.buW.hashCode();
    int j = this.buX;
    int k = this.buY;
    AppMethodBeat.o(10612);
    return ((i ^ 0xF4243) * 1000003 ^ j) * 1000003 ^ k;
  }

  public final String toString()
  {
    boolean bool1 = true;
    AppMethodBeat.i(10613);
    Object localObject = new StringBuilder("Dependency{interface=").append(this.buW).append(", required=");
    if (this.buX == 1)
    {
      bool2 = true;
      localObject = ((StringBuilder)localObject).append(bool2).append(", direct=");
      if (this.buY != 0)
        break label87;
    }
    label87: for (boolean bool2 = bool1; ; bool2 = false)
    {
      localObject = bool2 + "}";
      AppMethodBeat.o(10613);
      return localObject;
      bool2 = false;
      break;
    }
  }

  public final boolean uB()
  {
    if (this.buY == 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.google.firebase.components.f
 * JD-Core Version:    0.6.2
 */