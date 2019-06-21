package com.google.android.gms.common.internal;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class Objects
{
  private Objects()
  {
    AppMethodBeat.i(89690);
    AssertionError localAssertionError = new AssertionError("Uninstantiable");
    AppMethodBeat.o(89690);
    throw localAssertionError;
  }

  public static boolean equal(Object paramObject1, Object paramObject2)
  {
    AppMethodBeat.i(89687);
    boolean bool;
    if ((paramObject1 == paramObject2) || ((paramObject1 != null) && (paramObject1.equals(paramObject2))))
    {
      bool = true;
      AppMethodBeat.o(89687);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(89687);
    }
  }

  public static int hashCode(Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(89688);
    int i = Arrays.hashCode(paramArrayOfObject);
    AppMethodBeat.o(89688);
    return i;
  }

  public static ToStringHelper toStringHelper(Object paramObject)
  {
    AppMethodBeat.i(89689);
    paramObject = new ToStringHelper(paramObject, null);
    AppMethodBeat.o(89689);
    return paramObject;
  }

  public static final class ToStringHelper
  {
    private final List<String> zzul;
    private final Object zzum;

    private ToStringHelper(Object paramObject)
    {
      AppMethodBeat.i(89683);
      this.zzum = Preconditions.checkNotNull(paramObject);
      this.zzul = new ArrayList();
      AppMethodBeat.o(89683);
    }

    public final ToStringHelper add(String paramString, Object paramObject)
    {
      AppMethodBeat.i(89684);
      List localList = this.zzul;
      paramString = (String)Preconditions.checkNotNull(paramString);
      paramObject = String.valueOf(paramObject);
      localList.add(String.valueOf(paramString).length() + 1 + String.valueOf(paramObject).length() + paramString + "=" + paramObject);
      AppMethodBeat.o(89684);
      return this;
    }

    public final ToStringHelper addValue(Object paramObject)
    {
      AppMethodBeat.i(89685);
      this.zzul.add(String.valueOf(paramObject));
      AppMethodBeat.o(89685);
      return this;
    }

    public final String toString()
    {
      AppMethodBeat.i(89686);
      Object localObject = new StringBuilder(100).append(this.zzum.getClass().getSimpleName()).append('{');
      int i = this.zzul.size();
      for (int j = 0; j < i; j++)
      {
        ((StringBuilder)localObject).append((String)this.zzul.get(j));
        if (j < i - 1)
          ((StringBuilder)localObject).append(", ");
      }
      localObject = '}';
      AppMethodBeat.o(89686);
      return localObject;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.internal.Objects
 * JD-Core Version:    0.6.2
 */