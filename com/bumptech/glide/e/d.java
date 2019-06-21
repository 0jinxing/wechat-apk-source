package com.bumptech.glide.e;

import android.support.v4.f.a;
import com.bumptech.glide.h.h;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public final class d
{
  private final AtomicReference<h> aHb;
  public final a<h, List<Class<?>>> aHc;

  public d()
  {
    AppMethodBeat.i(92438);
    this.aHb = new AtomicReference();
    this.aHc = new a();
    AppMethodBeat.o(92438);
  }

  public final List<Class<?>> f(Class<?> paramClass1, Class<?> arg2)
  {
    AppMethodBeat.i(92439);
    Object localObject = (h)this.aHb.getAndSet(null);
    if (localObject == null)
      paramClass1 = new h(paramClass1, ???);
    synchronized (this.aHc)
    {
      localObject = (List)this.aHc.get(paramClass1);
      this.aHb.set(paramClass1);
      AppMethodBeat.o(92439);
      return localObject;
      ((h)localObject).d(paramClass1, ???, null);
      paramClass1 = (Class<?>)localObject;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.e.d
 * JD-Core Version:    0.6.2
 */