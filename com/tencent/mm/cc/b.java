package com.tencent.mm.cc;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.HashMap;

public final class b
{
  private final a<?>[] xHJ;
  private final HashMap<String, a<?>> xHK;

  public b(Context paramContext)
  {
    AppMethodBeat.i(58949);
    paramContext = new c(paramContext);
    this.xHJ = new a[] { paramContext.xHL, paramContext.xHM };
    this.xHK = new HashMap();
    AppMethodBeat.o(58949);
  }

  public static abstract interface a<T>
  {
    public abstract T get();

    public abstract String name();
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.cc.b
 * JD-Core Version:    0.6.2
 */