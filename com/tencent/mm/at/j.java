package com.tencent.mm.at;

import android.graphics.Bitmap;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.f;
import com.tencent.mm.cache.e;
import com.tencent.mm.memory.a.b;

final class j
  implements e
{
  private f<String, Bitmap> fEV;

  j()
  {
    AppMethodBeat.i(78306);
    this.fEV = new b(5, getClass());
    AppMethodBeat.o(78306);
  }

  public final void f(Object paramObject1, Object paramObject2)
  {
    AppMethodBeat.i(78307);
    this.fEV.k((String)paramObject1, (Bitmap)paramObject2);
    AppMethodBeat.o(78307);
  }

  public final Object get(Object paramObject)
  {
    AppMethodBeat.i(78308);
    paramObject = this.fEV.get((String)paramObject);
    AppMethodBeat.o(78308);
    return paramObject;
  }

  public final Object remove(Object paramObject)
  {
    AppMethodBeat.i(78309);
    this.fEV.remove((String)paramObject);
    AppMethodBeat.o(78309);
    return null;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.at.j
 * JD-Core Version:    0.6.2
 */