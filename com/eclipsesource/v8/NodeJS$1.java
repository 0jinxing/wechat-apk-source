package com.eclipsesource.v8;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class NodeJS$1
  implements JavaVoidCallback
{
  NodeJS$1(NodeJS paramNodeJS)
  {
  }

  public final void invoke(V8Object paramV8Object, V8Array paramV8Array)
  {
    AppMethodBeat.i(74991);
    paramV8Object = (V8Function)paramV8Array.get(0);
    try
    {
      NodeJS.access$000(this.val$node, paramV8Object.twin());
      return;
    }
    finally
    {
      paramV8Object.release();
      AppMethodBeat.o(74991);
    }
    throw paramV8Array;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.eclipsesource.v8.NodeJS.1
 * JD-Core Version:    0.6.2
 */