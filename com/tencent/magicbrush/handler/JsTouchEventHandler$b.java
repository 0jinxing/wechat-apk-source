package com.tencent.magicbrush.handler;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.ref.WeakReference;

public final class JsTouchEventHandler$b
  implements JsTouchEventHandler.a
{
  private WeakReference<JsTouchEventHandler> bSI;

  public JsTouchEventHandler$b(JsTouchEventHandler paramJsTouchEventHandler)
  {
    AppMethodBeat.i(115884);
    this.bSI = new WeakReference(paramJsTouchEventHandler);
    AppMethodBeat.o(115884);
  }

  public final void aA(long paramLong)
  {
    AppMethodBeat.i(115885);
    JsTouchEventHandler localJsTouchEventHandler = (JsTouchEventHandler)this.bSI.get();
    if (localJsTouchEventHandler != null)
      JsTouchEventHandler.a(localJsTouchEventHandler, paramLong);
    AppMethodBeat.o(115885);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.magicbrush.handler.JsTouchEventHandler.b
 * JD-Core Version:    0.6.2
 */