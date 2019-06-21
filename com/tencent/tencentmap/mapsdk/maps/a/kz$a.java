package com.tencent.tencentmap.mapsdk.maps.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Iterator;

class kz$a<U>
  implements Iterator<U>
{
  private kz<U> a;

  public kz$a(kz<U> paramkz)
  {
    this.a = paramkz;
  }

  public boolean hasNext()
  {
    AppMethodBeat.i(100290);
    boolean bool;
    if (!this.a.b())
    {
      bool = true;
      AppMethodBeat.o(100290);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(100290);
    }
  }

  public U next()
  {
    AppMethodBeat.i(100291);
    Object localObject = this.a.c();
    this.a = this.a.d();
    AppMethodBeat.o(100291);
    return localObject;
  }

  public void remove()
  {
    AppMethodBeat.i(100292);
    RuntimeException localRuntimeException = new RuntimeException("not supported");
    AppMethodBeat.o(100292);
    throw localRuntimeException;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.kz.a
 * JD-Core Version:    0.6.2
 */