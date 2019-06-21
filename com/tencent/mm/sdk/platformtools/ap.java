package com.tencent.mm.sdk.platformtools;

import android.os.Looper;
import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class ap extends ak
{
  private static int xyU;
  private final boolean hZl;
  private boolean mStop;
  private final int xyV;
  private long xzC;
  private final a xzD;

  public ap(Looper paramLooper, a parama, boolean paramBoolean)
  {
    super(paramLooper);
    AppMethodBeat.i(52158);
    this.xzC = 0L;
    this.mStop = false;
    this.xzD = parama;
    this.xyV = doS();
    this.hZl = paramBoolean;
    if (paramLooper.getThread().getName().equals("initThread"))
      ab.e("MicroMsg.MTimerHandler", "MTimerHandler can not init handler with initThread looper, stack %s", new Object[] { bo.dpG() });
    AppMethodBeat.o(52158);
  }

  public ap(a parama, boolean paramBoolean)
  {
    AppMethodBeat.i(52157);
    this.xzC = 0L;
    this.mStop = false;
    this.xzD = parama;
    this.xyV = doS();
    this.hZl = paramBoolean;
    if (getLooper().getThread().getName().equals("initThread"))
      ab.e("MicroMsg.MTimerHandler", "MTimerHandler can not init handler with initThread looper, stack %s", new Object[] { bo.dpG() });
    AppMethodBeat.o(52157);
  }

  private static int doS()
  {
    if (xyU >= 8192)
      xyU = 0;
    int i = xyU + 1;
    xyU = i;
    return i;
  }

  public final void ae(long paramLong1, long paramLong2)
  {
    AppMethodBeat.i(52163);
    this.xzC = paramLong2;
    stopTimer();
    this.mStop = false;
    sendEmptyMessageDelayed(this.xyV, paramLong1);
    AppMethodBeat.o(52163);
  }

  public final boolean doT()
  {
    AppMethodBeat.i(52164);
    boolean bool;
    if ((this.mStop) || (!hasMessages(this.xyV)))
    {
      bool = true;
      AppMethodBeat.o(52164);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(52164);
    }
  }

  protected void finalize()
  {
    AppMethodBeat.i(52159);
    stopTimer();
    super.finalize();
    AppMethodBeat.o(52159);
  }

  public void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(52160);
    if (paramMessage.what == this.xyV)
      if (this.xzD == null)
        AppMethodBeat.o(52160);
    while (true)
    {
      return;
      if (!this.xzD.BI())
      {
        AppMethodBeat.o(52160);
      }
      else
      {
        if ((this.hZl) && (!this.mStop))
          sendEmptyMessageDelayed(this.xyV, this.xzC);
        AppMethodBeat.o(52160);
      }
    }
  }

  public final void ms(long paramLong)
  {
    AppMethodBeat.i(138334);
    ae(paramLong, paramLong);
    AppMethodBeat.o(138334);
  }

  public final void stopTimer()
  {
    AppMethodBeat.i(52162);
    removeMessages(this.xyV);
    this.mStop = true;
    AppMethodBeat.o(52162);
  }

  public String toString()
  {
    AppMethodBeat.i(52165);
    String str;
    if (this.xzD == null)
    {
      str = "MTimerHandler(" + getClass().getName() + "){mCallBack = null}";
      AppMethodBeat.o(52165);
    }
    while (true)
    {
      return str;
      str = "MTimerHandler(" + getClass().getName() + "){mCallBack = " + this.xzD.getClass().getName() + "}";
      AppMethodBeat.o(52165);
    }
  }

  public static abstract interface a
  {
    public abstract boolean BI();
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.platformtools.ap
 * JD-Core Version:    0.6.2
 */