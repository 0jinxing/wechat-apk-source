package com.tencent.tencentmap.mapsdk.maps.a;

import android.util.SparseArray;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class ah<E>
{
  public static SparseArray<E> a(SparseArray<E> paramSparseArray)
  {
    AppMethodBeat.i(98426);
    if (paramSparseArray != null)
    {
      SparseArray localSparseArray = new SparseArray(paramSparseArray.size());
      for (int i = 0; i < paramSparseArray.size(); i++)
      {
        int j = paramSparseArray.keyAt(i);
        localSparseArray.append(j, paramSparseArray.get(j));
      }
      AppMethodBeat.o(98426);
      paramSparseArray = localSparseArray;
    }
    while (true)
    {
      return paramSparseArray;
      paramSparseArray = null;
      AppMethodBeat.o(98426);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.ah
 * JD-Core Version:    0.6.2
 */