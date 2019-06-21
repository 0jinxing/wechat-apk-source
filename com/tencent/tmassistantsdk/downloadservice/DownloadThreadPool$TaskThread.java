package com.tencent.tmassistantsdk.downloadservice;

import android.os.PowerManager.WakeLock;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.tmassistantsdk.util.TMLog;
import java.util.ArrayList;
import java.util.PriorityQueue;

class DownloadThreadPool$TaskThread extends Thread
{
  private int mIndex;

  public DownloadThreadPool$TaskThread(DownloadThreadPool paramDownloadThreadPool, int paramInt)
  {
    AppMethodBeat.i(75760);
    this.mIndex = 0;
    this.mIndex = paramInt;
    setName("download_thread_" + this.mIndex);
    start();
    AppMethodBeat.o(75760);
  }

  public void run()
  {
    AppMethodBeat.i(75761);
    TMLog.i("DownloadThreadPool", "Thread " + this.mIndex + " starts running...");
    while (true)
    {
      synchronized (this.this$0.mThreadlock)
      {
        try
        {
          StringBuilder localStringBuilder1 = new java/lang/StringBuilder;
          localStringBuilder1.<init>("Thread ");
          TMLog.i("DownloadThreadPool", this.mIndex + " is waitting...");
          this.this$0.mThreadlock.wait();
          if (!Thread.currentThread().isInterrupted())
            break label283;
          TMLog.i("DownloadThreadPool", "Thread " + this.mIndex + " is interrupted...");
          AppMethodBeat.o(75761);
          return;
        }
        catch (InterruptedException localInterruptedException)
        {
          StringBuilder localStringBuilder2 = new java/lang/StringBuilder;
          localStringBuilder2.<init>("Thread ");
          TMLog.i("DownloadThreadPool", this.mIndex + " is interrupted...");
          ab.printErrStackTrace("DownloadThreadPool", localInterruptedException, "", new Object[0]);
          AppMethodBeat.o(75761);
          continue;
        }
      }
      label195: if (??? != null)
      {
        TMLog.i("DownloadThreadPool", "TaskThread::Run ThreadName: " + getName() + " url: " + ((DownloadTask)???).getDownloadURI());
        ??? = DownloadHelper.getWakeLock();
        ((DownloadTask)???).exec(getName());
        if (??? != null)
          ((PowerManager.WakeLock)???).release();
      }
      ??? = this.this$0.mTaskLock;
      if (??? != null);
      try
      {
        this.this$0.mExecList.remove(???);
        label283: if (!this.this$0.hasWaitingTask())
          continue;
        ??? = null;
        synchronized (this.this$0.mTaskLock)
        {
          if (this.this$0.mWaitingList.size() > 0)
          {
            ??? = (DownloadTask)this.this$0.mWaitingList.remove();
            this.this$0.mExecList.add(???);
          }
          if (!Thread.currentThread().isInterrupted())
            break label195;
          TMLog.i("DownloadThreadPool", "Thread " + this.mIndex + " is interrupted...");
          AppMethodBeat.o(75761);
        }
      }
      finally
      {
        AppMethodBeat.o(75761);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.tmassistantsdk.downloadservice.DownloadThreadPool.TaskThread
 * JD-Core Version:    0.6.2
 */