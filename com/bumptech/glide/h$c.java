package com.bumptech.glide;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class h$c extends h.a
{
  public h$c(Class<?> paramClass1, Class<?> paramClass2)
  {
    super("Failed to find any ModelLoaders for model: " + paramClass1 + " and data: " + paramClass2);
    AppMethodBeat.i(91622);
    AppMethodBeat.o(91622);
  }

  public h$c(Object paramObject)
  {
    super("Failed to find any ModelLoaders for model: ".concat(String.valueOf(paramObject)));
    AppMethodBeat.i(91621);
    AppMethodBeat.o(91621);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.h.c
 * JD-Core Version:    0.6.2
 */