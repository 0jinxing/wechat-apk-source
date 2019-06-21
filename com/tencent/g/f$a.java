package com.tencent.g;

import com.tencent.g.b.c;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.HashMap;

final class f$a
{
  private final HashMap<String, Object> AHG;
  private final Object mLock;

  f$a(f paramf)
  {
    AppMethodBeat.i(127748);
    this.mLock = new Object();
    this.AHG = new HashMap();
    AppMethodBeat.o(127748);
  }

  final void iD(String arg1, String paramString2)
  {
    AppMethodBeat.i(127749);
    String str = ??? + paramString2;
    synchronized (this.mLock)
    {
      while (true)
      {
        Object localObject = this.AHG.get(str);
        if (localObject != null)
          try
          {
            this.mLock.wait();
          }
          catch (InterruptedException paramString2)
          {
            paramString2 = new com/tencent/g/b/c;
            paramString2.<init>("install fail,lock interrupted!");
            AppMethodBeat.o(127749);
            throw paramString2;
          }
      }
    }
    this.AHG.put(str, paramString2);
    AppMethodBeat.o(127749);
  }

  final void iE(String arg1, String paramString2)
  {
    AppMethodBeat.i(127750);
    paramString2 = ??? + paramString2;
    synchronized (this.mLock)
    {
      this.AHG.remove(paramString2);
      this.mLock.notifyAll();
      AppMethodBeat.o(127750);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.g.f.a
 * JD-Core Version:    0.6.2
 */