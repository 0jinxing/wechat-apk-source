package com.facebook.internal;

import com.tencent.matrix.trace.core.AppMethodBeat;

class WorkQueue$WorkNode
  implements WorkQueue.WorkItem
{
  private final Runnable callback;
  private boolean isRunning;
  private WorkNode next;
  private WorkNode prev;

  static
  {
    AppMethodBeat.i(72600);
    if (!WorkQueue.class.desiredAssertionStatus());
    for (boolean bool = true; ; bool = false)
    {
      $assertionsDisabled = bool;
      AppMethodBeat.o(72600);
      return;
    }
  }

  WorkQueue$WorkNode(WorkQueue paramWorkQueue, Runnable paramRunnable)
  {
    this.callback = paramRunnable;
  }

  WorkNode addToList(WorkNode paramWorkNode, boolean paramBoolean)
  {
    AppMethodBeat.i(72597);
    if ((!$assertionsDisabled) && (this.next != null))
    {
      paramWorkNode = new AssertionError();
      AppMethodBeat.o(72597);
      throw paramWorkNode;
    }
    if ((!$assertionsDisabled) && (this.prev != null))
    {
      paramWorkNode = new AssertionError();
      AppMethodBeat.o(72597);
      throw paramWorkNode;
    }
    if (paramWorkNode == null)
    {
      this.prev = this;
      this.next = this;
      paramWorkNode = this;
      if (!paramBoolean)
        break label124;
      AppMethodBeat.o(72597);
      paramWorkNode = this;
    }
    while (true)
    {
      return paramWorkNode;
      this.next = paramWorkNode;
      this.prev = paramWorkNode.prev;
      WorkNode localWorkNode = this.next;
      this.prev.next = this;
      localWorkNode.prev = this;
      break;
      label124: AppMethodBeat.o(72597);
    }
  }

  public boolean cancel()
  {
    AppMethodBeat.i(72595);
    synchronized (WorkQueue.access$100(this.this$0))
    {
      if (!isRunning())
      {
        WorkQueue.access$202(this.this$0, removeFromList(WorkQueue.access$200(this.this$0)));
        bool = true;
        AppMethodBeat.o(72595);
        return bool;
      }
      boolean bool = false;
      AppMethodBeat.o(72595);
    }
  }

  Runnable getCallback()
  {
    return this.callback;
  }

  WorkNode getNext()
  {
    return this.next;
  }

  public boolean isRunning()
  {
    return this.isRunning;
  }

  public void moveToFront()
  {
    AppMethodBeat.i(72596);
    synchronized (WorkQueue.access$100(this.this$0))
    {
      if (!isRunning())
      {
        WorkQueue.access$202(this.this$0, removeFromList(WorkQueue.access$200(this.this$0)));
        WorkQueue.access$202(this.this$0, addToList(WorkQueue.access$200(this.this$0), true));
      }
      AppMethodBeat.o(72596);
      return;
    }
  }

  WorkNode removeFromList(WorkNode paramWorkNode)
  {
    AppMethodBeat.i(72598);
    if ((!$assertionsDisabled) && (this.next == null))
    {
      paramWorkNode = new AssertionError();
      AppMethodBeat.o(72598);
      throw paramWorkNode;
    }
    if ((!$assertionsDisabled) && (this.prev == null))
    {
      paramWorkNode = new AssertionError();
      AppMethodBeat.o(72598);
      throw paramWorkNode;
    }
    WorkNode localWorkNode = paramWorkNode;
    if (paramWorkNode == this)
      if (this.next != this)
        break label117;
    label117: for (localWorkNode = null; ; localWorkNode = this.next)
    {
      this.next.prev = this.prev;
      this.prev.next = this.next;
      this.prev = null;
      this.next = null;
      AppMethodBeat.o(72598);
      return localWorkNode;
    }
  }

  void setIsRunning(boolean paramBoolean)
  {
    this.isRunning = paramBoolean;
  }

  void verify(boolean paramBoolean)
  {
    AppMethodBeat.i(72599);
    AssertionError localAssertionError;
    if ((!$assertionsDisabled) && (this.prev.next != this))
    {
      localAssertionError = new AssertionError();
      AppMethodBeat.o(72599);
      throw localAssertionError;
    }
    if ((!$assertionsDisabled) && (this.next.prev != this))
    {
      localAssertionError = new AssertionError();
      AppMethodBeat.o(72599);
      throw localAssertionError;
    }
    if ((!$assertionsDisabled) && (isRunning() != paramBoolean))
    {
      localAssertionError = new AssertionError();
      AppMethodBeat.o(72599);
      throw localAssertionError;
    }
    AppMethodBeat.o(72599);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.facebook.internal.WorkQueue.WorkNode
 * JD-Core Version:    0.6.2
 */