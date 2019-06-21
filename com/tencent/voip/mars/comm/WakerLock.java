package com.tencent.voip.mars.comm;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class WakerLock
{
  private static final String TAG = "MicroMsg.WakerLock";
  private Handler mHandler;
  private Runnable mReleaser;
  private PowerManager.WakeLock wakeLock;

  @SuppressLint({"InvalidWakeLockTag"})
  public WakerLock(Context paramContext)
  {
    AppMethodBeat.i(92751);
    this.wakeLock = null;
    this.mHandler = null;
    this.mReleaser = new WakerLock.1(this);
    this.wakeLock = ((PowerManager)paramContext.getSystemService("power")).newWakeLock(1, "MicroMsg.WakerLock");
    this.wakeLock.setReferenceCounted(false);
    this.mHandler = new Handler(paramContext.getMainLooper());
    AppMethodBeat.o(92751);
  }

  protected void finalize()
  {
    AppMethodBeat.i(92752);
    unLock();
    AppMethodBeat.o(92752);
  }

  public boolean isLocking()
  {
    AppMethodBeat.i(92756);
    try
    {
      bool = this.wakeLock.isHeld();
      AppMethodBeat.o(92756);
      return bool;
    }
    catch (Exception localException)
    {
      while (true)
      {
        boolean bool = false;
        AppMethodBeat.o(92756);
      }
    }
  }

  public void lock()
  {
    AppMethodBeat.i(92754);
    try
    {
      this.mHandler.removeCallbacks(this.mReleaser);
      this.wakeLock.acquire();
      AppMethodBeat.o(92754);
      return;
    }
    catch (Exception localException)
    {
      while (true)
        AppMethodBeat.o(92754);
    }
  }

  public void lock(long paramLong)
  {
    AppMethodBeat.i(92753);
    try
    {
      lock();
      this.mHandler.postDelayed(this.mReleaser, paramLong);
      AppMethodBeat.o(92753);
      return;
    }
    catch (Exception localException)
    {
      while (true)
        AppMethodBeat.o(92753);
    }
  }

  public void unLock()
  {
    AppMethodBeat.i(92755);
    try
    {
      this.mHandler.removeCallbacks(this.mReleaser);
      if (this.wakeLock.isHeld())
        this.wakeLock.release();
      AppMethodBeat.o(92755);
      return;
    }
    catch (Exception localException)
    {
      while (true)
        AppMethodBeat.o(92755);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.voip.mars.comm.WakerLock
 * JD-Core Version:    0.6.2
 */