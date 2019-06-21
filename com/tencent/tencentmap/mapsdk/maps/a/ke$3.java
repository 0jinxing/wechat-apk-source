package com.tencent.tencentmap.mapsdk.maps.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Comparator;

final class ke$3
  implements Comparator<R>
{
  ke$3(mf parammf)
  {
  }

  public final int compare(R paramR1, R paramR2)
  {
    AppMethodBeat.i(100211);
    int i = ((Comparable)this.a.a(paramR1)).compareTo(this.a.a(paramR2));
    AppMethodBeat.o(100211);
    return i;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.ke.3
 * JD-Core Version:    0.6.2
 */