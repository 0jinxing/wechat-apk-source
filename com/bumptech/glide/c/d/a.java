package com.bumptech.glide.c.d;

import com.bumptech.glide.c.b.u;
import com.bumptech.glide.h.i;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class a<T>
  implements u<T>
{
  protected final T data;

  public a(T paramT)
  {
    AppMethodBeat.i(92176);
    this.data = i.d(paramT, "Argument must not be null");
    AppMethodBeat.o(92176);
  }

  public final T get()
  {
    return this.data;
  }

  public final int getSize()
  {
    return 1;
  }

  public final Class<T> mK()
  {
    AppMethodBeat.i(92177);
    Class localClass = this.data.getClass();
    AppMethodBeat.o(92177);
    return localClass;
  }

  public final void recycle()
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.c.d.a
 * JD-Core Version:    0.6.2
 */