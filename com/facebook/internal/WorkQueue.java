package com.facebook.internal;

import com.facebook.FacebookSdk;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.concurrent.Executor;

public class WorkQueue
{
  public static final int DEFAULT_MAX_CONCURRENT = 8;
  private final Executor executor;
  private final int maxConcurrent;
  private WorkQueue.WorkNode pendingJobs;
  private int runningCount;
  private WorkQueue.WorkNode runningJobs;
  private final Object workLock;

  static
  {
    AppMethodBeat.i(72610);
    if (!WorkQueue.class.desiredAssertionStatus());
    for (boolean bool = true; ; bool = false)
    {
      $assertionsDisabled = bool;
      AppMethodBeat.o(72610);
      return;
    }
  }

  public WorkQueue()
  {
    this(8);
  }

  public WorkQueue(int paramInt)
  {
    this(paramInt, FacebookSdk.getExecutor());
    AppMethodBeat.i(72601);
    AppMethodBeat.o(72601);
  }

  public WorkQueue(int paramInt, Executor paramExecutor)
  {
    AppMethodBeat.i(72602);
    this.workLock = new Object();
    this.runningJobs = null;
    this.runningCount = 0;
    this.maxConcurrent = paramInt;
    this.executor = paramExecutor;
    AppMethodBeat.o(72602);
  }

  private void execute(WorkQueue.WorkNode paramWorkNode)
  {
    AppMethodBeat.i(72608);
    this.executor.execute(new WorkQueue.1(this, paramWorkNode));
    AppMethodBeat.o(72608);
  }

  private void finishItemAndStartNew(WorkQueue.WorkNode paramWorkNode)
  {
    AppMethodBeat.i(72607);
    WorkQueue.WorkNode localWorkNode = null;
    Object localObject = this.workLock;
    if (paramWorkNode != null);
    try
    {
      this.runningJobs = paramWorkNode.removeFromList(this.runningJobs);
      this.runningCount -= 1;
      paramWorkNode = localWorkNode;
      if (this.runningCount < this.maxConcurrent)
      {
        localWorkNode = this.pendingJobs;
        paramWorkNode = localWorkNode;
        if (localWorkNode != null)
        {
          this.pendingJobs = localWorkNode.removeFromList(this.pendingJobs);
          this.runningJobs = localWorkNode.addToList(this.runningJobs, false);
          this.runningCount += 1;
          localWorkNode.setIsRunning(true);
          paramWorkNode = localWorkNode;
        }
      }
      if (paramWorkNode != null)
        execute(paramWorkNode);
      AppMethodBeat.o(72607);
      return;
    }
    finally
    {
      AppMethodBeat.o(72607);
    }
    throw paramWorkNode;
  }

  private void startItem()
  {
    AppMethodBeat.i(72606);
    finishItemAndStartNew(null);
    AppMethodBeat.o(72606);
  }

  public WorkQueue.WorkItem addActiveWorkItem(Runnable paramRunnable)
  {
    AppMethodBeat.i(72603);
    paramRunnable = addActiveWorkItem(paramRunnable, true);
    AppMethodBeat.o(72603);
    return paramRunnable;
  }

  public WorkQueue.WorkItem addActiveWorkItem(Runnable arg1, boolean paramBoolean)
  {
    AppMethodBeat.i(72604);
    WorkQueue.WorkNode localWorkNode = new WorkQueue.WorkNode(this, ???);
    synchronized (this.workLock)
    {
      this.pendingJobs = localWorkNode.addToList(this.pendingJobs, paramBoolean);
      startItem();
      AppMethodBeat.o(72604);
      return localWorkNode;
    }
  }

  public void validate()
  {
    AppMethodBeat.i(72605);
    Object localObject1 = this.workLock;
    int i = 0;
    int j = 0;
    try
    {
      Object localObject2;
      if (this.runningJobs != null)
      {
        localObject2 = this.runningJobs;
        i = j;
        WorkQueue.WorkNode localWorkNode;
        do
        {
          ((WorkQueue.WorkNode)localObject2).verify(true);
          j = i + 1;
          localWorkNode = ((WorkQueue.WorkNode)localObject2).getNext();
          i = j;
          localObject2 = localWorkNode;
        }
        while (localWorkNode != this.runningJobs);
        i = j;
      }
      if ((!$assertionsDisabled) && (this.runningCount != i))
      {
        localObject2 = new java/lang/AssertionError;
        ((AssertionError)localObject2).<init>();
        AppMethodBeat.o(72605);
        throw ((Throwable)localObject2);
      }
    }
    finally
    {
      AppMethodBeat.o(72605);
    }
    AppMethodBeat.o(72605);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.facebook.internal.WorkQueue
 * JD-Core Version:    0.6.2
 */