package com.facebook.internal;

import com.tencent.matrix.trace.core.AppMethodBeat;

class WorkQueue$1
  implements Runnable
{
  WorkQueue$1(WorkQueue paramWorkQueue, WorkQueue.WorkNode paramWorkNode)
  {
  }

  public void run()
  {
    AppMethodBeat.i(72594);
    try
    {
      this.val$node.getCallback().run();
      return;
    }
    finally
    {
      WorkQueue.access$000(this.this$0, this.val$node);
      AppMethodBeat.o(72594);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.facebook.internal.WorkQueue.1
 * JD-Core Version:    0.6.2
 */