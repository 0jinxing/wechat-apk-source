package com.bumptech.glide.c.b;

import com.bumptech.glide.c.h;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.HashMap;
import java.util.Map;

final class r
{
  private final Map<h, k<?>> aCa;
  private final Map<h, k<?>> aCb;

  r()
  {
    AppMethodBeat.i(91862);
    this.aCa = new HashMap();
    this.aCb = new HashMap();
    AppMethodBeat.o(91862);
  }

  final void a(h paramh, k<?> paramk)
  {
    AppMethodBeat.i(91863);
    Map localMap = ax(paramk.aAz);
    if (paramk.equals(localMap.get(paramh)))
      localMap.remove(paramh);
    AppMethodBeat.o(91863);
  }

  final Map<h, k<?>> ax(boolean paramBoolean)
  {
    if (paramBoolean);
    for (Map localMap = this.aCb; ; localMap = this.aCa)
      return localMap;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.c.b.r
 * JD-Core Version:    0.6.2
 */