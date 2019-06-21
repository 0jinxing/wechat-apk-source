package com.tencent.mm.ipcinvoker.extension;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ipcinvoker.g.b;
import junit.framework.Assert;

public final class e<T>
{
  private volatile T eGy;
  private Class<T> targetClass;

  public e(Class<T> paramClass)
  {
    AppMethodBeat.i(114088);
    Assert.assertNotNull(paramClass);
    this.targetClass = paramClass;
    AppMethodBeat.o(114088);
  }

  public final T get()
  {
    AppMethodBeat.i(114089);
    if (this.eGy == null);
    try
    {
      if (this.eGy == null)
        this.eGy = b.H(this.targetClass);
      Object localObject1 = this.eGy;
      AppMethodBeat.o(114089);
      return localObject1;
    }
    finally
    {
      AppMethodBeat.o(114089);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ipcinvoker.extension.e
 * JD-Core Version:    0.6.2
 */