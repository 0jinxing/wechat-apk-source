package com.eclipsesource.v8;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class V8ContextSessionMgr
{
  private V8ContextWrapper currentContext;
  private final V8 v8;

  V8ContextSessionMgr(V8 paramV8)
  {
    this.v8 = paramV8;
  }

  public final void enterContext(V8ContextWrapper paramV8ContextWrapper)
  {
    AppMethodBeat.i(75448);
    if (paramV8ContextWrapper == null)
      AppMethodBeat.o(75448);
    while (true)
    {
      return;
      if (paramV8ContextWrapper.equals(this.currentContext))
      {
        AppMethodBeat.o(75448);
      }
      else
      {
        this.v8.switchV8Context(paramV8ContextWrapper.getPtr());
        this.currentContext = paramV8ContextWrapper;
        AppMethodBeat.o(75448);
      }
    }
  }

  public final void releaseContext(V8ContextWrapper paramV8ContextWrapper)
  {
    AppMethodBeat.i(75449);
    if (paramV8ContextWrapper == null)
      AppMethodBeat.o(75449);
    while (true)
    {
      return;
      this.v8.releaseV8Context(paramV8ContextWrapper.getPtr());
      AppMethodBeat.o(75449);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.eclipsesource.v8.V8ContextSessionMgr
 * JD-Core Version:    0.6.2
 */