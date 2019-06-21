package com.bumptech.glide;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class h$d extends h.a
{
  public h$d(Class<?> paramClass)
  {
    super("Failed to find result encoder for resource class: " + paramClass + ", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary.");
    AppMethodBeat.i(91623);
    AppMethodBeat.o(91623);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.h.d
 * JD-Core Version:    0.6.2
 */