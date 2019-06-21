package com.tencent.tencentmap.mapsdk.maps.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Comparator;

final class ke$4
  implements Comparator<T>
{
  ke$4(Comparator[] paramArrayOfComparator)
  {
  }

  public final int compare(T paramT1, T paramT2)
  {
    AppMethodBeat.i(100212);
    Comparator[] arrayOfComparator = this.a;
    int i = arrayOfComparator.length;
    int j = 0;
    int k;
    if (j < i)
    {
      k = arrayOfComparator[j].compare(paramT1, paramT2);
      if (k != 0)
        AppMethodBeat.o(100212);
    }
    for (j = k; ; j = 0)
    {
      return j;
      j++;
      break;
      AppMethodBeat.o(100212);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.ke.4
 * JD-Core Version:    0.6.2
 */