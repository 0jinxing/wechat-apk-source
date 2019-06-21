package com.eclipsesource.v8;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class MultiContextNodeJS$1
  implements JavaVoidCallback
{
  MultiContextNodeJS$1(MultiContextNodeJS paramMultiContextNodeJS)
  {
  }

  public final void invoke(V8Object paramV8Object, V8Array paramV8Array)
  {
    AppMethodBeat.i(74963);
    paramV8Object = (V8Function)paramV8Array.get(0);
    try
    {
      MultiContextNodeJS.access$000(this.val$node, paramV8Object.twin());
      return;
    }
    finally
    {
      paramV8Object.release();
      AppMethodBeat.o(74963);
    }
    throw paramV8Array;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.eclipsesource.v8.MultiContextNodeJS.1
 * JD-Core Version:    0.6.2
 */