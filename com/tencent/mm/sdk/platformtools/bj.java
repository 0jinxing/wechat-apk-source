package com.tencent.mm.sdk.platformtools;

import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;

public abstract class bj<R>
{
  long fmV;
  private final long ftP;
  private Object lock = new Object();
  private R result;
  long xBL;
  boolean xBM = false;
  private Runnable xzE = new Runnable()
  {
    public final void run()
    {
      AppMethodBeat.i(52277);
      ab.i("MicroMsg.SDK.SyncTask", "task run manualFinish = " + bj.this.xBM);
      if (bj.this.xBM)
        bj.this.run();
      while (true)
      {
        bj.this.xBL = bo.az(bj.this.fmV);
        AppMethodBeat.o(52277);
        return;
        bj.this.cC(bj.this.run());
      }
    }
  };

  public bj()
  {
    this(0L, null, (byte)0);
  }

  public bj(long paramLong, R paramR)
  {
    this.ftP = paramLong;
    this.result = paramR;
    this.xBM = true;
  }

  public bj(long paramLong, R paramR, byte paramByte)
  {
    this.ftP = paramLong;
    this.result = paramR;
  }

  public final R b(ak paramak)
  {
    if (paramak == null)
      ab.d("MicroMsg.SDK.SyncTask", "null handler, task in exec thread, return now");
    for (paramak = run(); ; paramak = run())
    {
      return paramak;
      ab.i("MicroMsg.SDK.SyncTask", "sync task exec...");
      if (Thread.currentThread().getId() != paramak.getLooper().getThread().getId())
        break;
      ab.i("MicroMsg.SDK.SyncTask", "same tid, task in exec thread, return now");
    }
    this.fmV = bo.yz();
    try
    {
      synchronized (this.lock)
      {
        ab.i("MicroMsg.SDK.SyncTask", "sync task exec at synchronized");
        paramak.post(this.xzE);
        this.lock.wait(this.ftP);
        long l = bo.az(this.fmV);
        ab.i("MicroMsg.SDK.SyncTask", "sync task done, return=%s, cost=%d(wait=%d, run=%d)", new Object[] { this.result, Long.valueOf(l), Long.valueOf(this.xBL), Long.valueOf(l - this.xBL) });
        paramak = this.result;
      }
    }
    catch (InterruptedException paramak)
    {
      while (true)
        ab.printErrStackTrace("MicroMsg.SDK.SyncTask", paramak, "", new Object[0]);
    }
  }

  public final void cC(R arg1)
  {
    ab.i("MicroMsg.SDK.SyncTask", "setResultFinish ");
    this.result = ???;
    synchronized (this.lock)
    {
      ab.i("MicroMsg.SDK.SyncTask", "setResultFinish synchronized");
      this.lock.notify();
      return;
    }
  }

  protected abstract R run();
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.platformtools.bj
 * JD-Core Version:    0.6.2
 */