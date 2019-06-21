package com.bumptech.glide.e;

import android.support.v4.f.a;
import com.bumptech.glide.c.b.s;
import com.bumptech.glide.c.d.f.g;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

public final class c
{
  public static final s<?, ?, ?> aGY;
  public final a<com.bumptech.glide.h.h, s<?, ?, ?>> aGZ;
  private final AtomicReference<com.bumptech.glide.h.h> aHa;

  static
  {
    AppMethodBeat.i(92437);
    aGY = new s(Object.class, Object.class, Object.class, Collections.singletonList(new com.bumptech.glide.c.b.h(Object.class, Object.class, Object.class, Collections.emptyList(), new g(), null)), null);
    AppMethodBeat.o(92437);
  }

  public c()
  {
    AppMethodBeat.i(92434);
    this.aGZ = new a();
    this.aHa = new AtomicReference();
    AppMethodBeat.o(92434);
  }

  public static boolean a(s<?, ?, ?> params)
  {
    AppMethodBeat.i(92435);
    boolean bool = aGY.equals(params);
    AppMethodBeat.o(92435);
    return bool;
  }

  public final <Data, TResource, Transcode> s<Data, TResource, Transcode> c(Class<Data> arg1, Class<TResource> paramClass1, Class<Transcode> paramClass2)
  {
    AppMethodBeat.i(92436);
    com.bumptech.glide.h.h localh = (com.bumptech.glide.h.h)this.aHa.getAndSet(null);
    if (localh == null)
      localh = new com.bumptech.glide.h.h();
    while (true)
    {
      localh.d(???, paramClass1, paramClass2);
      synchronized (this.aGZ)
      {
        paramClass1 = (s)this.aGZ.get(localh);
        this.aHa.set(localh);
        AppMethodBeat.o(92436);
        return paramClass1;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.e.c
 * JD-Core Version:    0.6.2
 */