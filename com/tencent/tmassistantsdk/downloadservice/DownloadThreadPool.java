package com.tencent.tmassistantsdk.downloadservice;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

public class DownloadThreadPool
{
  public static final String TAG = "DownloadThreadPool";
  protected static DownloadThreadPool mDownloadThreadPool = null;
  final ArrayList<DownloadThreadPool.TaskThread> mDownloadThreadList;
  final ArrayList<DownloadTask> mExecList;
  protected final Comparator<DownloadTask> mPriorityQueueComparator;
  final Object mTaskLock;
  final Object mThreadlock;
  final PriorityQueue<DownloadTask> mWaitingList;

  private DownloadThreadPool()
  {
    AppMethodBeat.i(75763);
    this.mPriorityQueueComparator = new Comparator()
    {
      public int compare(DownloadTask paramAnonymousDownloadTask1, DownloadTask paramAnonymousDownloadTask2)
      {
        AppMethodBeat.i(75757);
        int i;
        if (paramAnonymousDownloadTask1.getPriority() > paramAnonymousDownloadTask2.getPriority())
        {
          i = 1;
          AppMethodBeat.o(75757);
        }
        while (true)
        {
          return i;
          if (paramAnonymousDownloadTask1.getPriority() == paramAnonymousDownloadTask2.getPriority())
          {
            i = 0;
            AppMethodBeat.o(75757);
          }
          else
          {
            i = -1;
            AppMethodBeat.o(75757);
          }
        }
      }
    };
    this.mWaitingList = new PriorityQueue(16, this.mPriorityQueueComparator);
    this.mExecList = new ArrayList();
    this.mDownloadThreadList = new ArrayList();
    this.mThreadlock = new Object();
    this.mTaskLock = new Object();
    int i = DownloadSetting.getInstance().getMaxTaskNum();
    for (int j = 0; j < i; j++)
    {
      DownloadThreadPool.TaskThread localTaskThread = new DownloadThreadPool.TaskThread(this, j);
      this.mDownloadThreadList.add(localTaskThread);
    }
    AppMethodBeat.o(75763);
  }

  public static DownloadThreadPool getInstance()
  {
    AppMethodBeat.i(75762);
    if (mDownloadThreadPool == null)
      mDownloadThreadPool = new DownloadThreadPool();
    DownloadThreadPool localDownloadThreadPool = mDownloadThreadPool;
    AppMethodBeat.o(75762);
    return localDownloadThreadPool;
  }

  int addDownloadTask(DownloadTask paramDownloadTask)
  {
    AppMethodBeat.i(75764);
    synchronized (this.mTaskLock)
    {
      this.mWaitingList.add(paramDownloadTask);
      synchronized (this.mThreadlock)
      {
        this.mThreadlock.notifyAll();
        int i = paramDownloadTask.getTaskId();
        AppMethodBeat.o(75764);
        return i;
      }
    }
  }

  void cancelDownloadTask(int paramInt)
  {
    AppMethodBeat.i(75765);
    synchronized (this.mTaskLock)
    {
      Thread localThread = new java/lang/Thread;
      DownloadThreadPool.2 local2 = new com/tencent/tmassistantsdk/downloadservice/DownloadThreadPool$2;
      local2.<init>(this, paramInt);
      localThread.<init>(local2);
      localThread.start();
      AppMethodBeat.o(75765);
      return;
    }
  }

  public DownloadTask getDownloadTask(String paramString)
  {
    AppMethodBeat.i(75767);
    synchronized (this.mTaskLock)
    {
      Iterator localIterator = this.mExecList.iterator();
      DownloadTask localDownloadTask;
      while (localIterator.hasNext())
      {
        localDownloadTask = (DownloadTask)localIterator.next();
        if (localDownloadTask.getDownloadURI().equals(paramString))
          AppMethodBeat.o(75767);
      }
      for (paramString = localDownloadTask; ; paramString = localDownloadTask)
      {
        return paramString;
        localIterator = this.mWaitingList.iterator();
        do
        {
          if (!localIterator.hasNext())
            break;
          localDownloadTask = (DownloadTask)localIterator.next();
        }
        while (!localDownloadTask.getDownloadURI().equals(paramString));
        AppMethodBeat.o(75767);
      }
      paramString = null;
      AppMethodBeat.o(75767);
    }
  }

  boolean hasWaitingTask()
  {
    AppMethodBeat.i(75766);
    synchronized (this.mTaskLock)
    {
      if (this.mWaitingList.size() > 0)
      {
        bool = true;
        AppMethodBeat.o(75766);
        return bool;
      }
      boolean bool = false;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.tmassistantsdk.downloadservice.DownloadThreadPool
 * JD-Core Version:    0.6.2
 */