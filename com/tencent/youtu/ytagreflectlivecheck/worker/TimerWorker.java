package com.tencent.youtu.ytagreflectlivecheck.worker;

import android.os.SystemClock;
import com.tencent.youtu.ytcommon.tools.YTLogger;
import java.util.Timer;
import java.util.TimerTask;

public abstract class TimerWorker
{
  private static final String TAG = "CloudFaceCountDownTimer";
  private boolean mCancelled = false;
  private final long mCountdownInterval;
  private final long mMillisInFuture;
  private long mStopTimeInFuture;
  private Timer mTimer;

  protected TimerWorker(long paramLong1, long paramLong2)
  {
    YTLogger.i("CloudFaceCountDownTimer", "[TimerWorker.TimerWorker] mCountDownTimer");
    this.mMillisInFuture = paramLong1;
    this.mCountdownInterval = paramLong2;
  }

  private void continueTimerJudge()
  {
    if (this.mCancelled);
    while (true)
    {
      return;
      long l = this.mStopTimeInFuture - SystemClock.elapsedRealtime();
      if (l <= 0L)
      {
        this.mTimer.cancel();
        onFinish();
      }
      else if (l >= this.mCountdownInterval)
      {
        SystemClock.elapsedRealtime();
        onTick(l);
        SystemClock.elapsedRealtime();
      }
    }
  }

  public final void cancel()
  {
    try
    {
      this.mCancelled = true;
      if (this.mTimer != null)
        this.mTimer = null;
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public abstract void onFinish();

  public abstract void onTick(long paramLong);

  public final TimerWorker start()
  {
    try
    {
      this.mCancelled = false;
      if (this.mMillisInFuture <= 0L)
        onFinish();
      while (true)
      {
        return this;
        this.mStopTimeInFuture = (SystemClock.elapsedRealtime() + this.mMillisInFuture);
        Object localObject1 = new java/util/Timer;
        ((Timer)localObject1).<init>();
        this.mTimer = ((Timer)localObject1);
        Timer localTimer = this.mTimer;
        localObject1 = new com/tencent/youtu/ytagreflectlivecheck/worker/TimerWorker$1;
        ((TimerWorker.1)localObject1).<init>(this);
        localTimer.schedule((TimerTask)localObject1, 0L, this.mCountdownInterval);
      }
    }
    finally
    {
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.youtu.ytagreflectlivecheck.worker.TimerWorker
 * JD-Core Version:    0.6.2
 */