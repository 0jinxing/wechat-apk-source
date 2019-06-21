package com.tencent.mm.plugin.appbrand.report;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.d.d;
import com.tencent.mm.sdk.platformtools.ab;

public final class l extends d
{
  final l.a iAA;
  private boolean iAB;
  long iAw;
  public long iAx;
  private final l.c iAy;
  final l.b iAz;
  public boolean mStopped;

  public l(String paramString)
  {
    super("MicroMsg.StayingRecorder[" + paramString + "]", Looper.getMainLooper());
    AppMethodBeat.i(114405);
    this.iAy = new l.c(this, (byte)0);
    this.iAz = new l.b(this, (byte)0);
    this.iAA = new l.a(this, (byte)0);
    this.mStopped = false;
    this.iAB = false;
    a(this.iAz);
    a(this.iAA);
    a(this.iAy);
    b(this.iAy);
    AppMethodBeat.o(114405);
  }

  private void nt(int paramInt)
  {
    AppMethodBeat.i(114409);
    if (dpP() == null)
    {
      sendMessage(paramInt);
      AppMethodBeat.o(114409);
    }
    while (true)
    {
      return;
      if (Looper.myLooper() == this.xCt.getLooper())
      {
        this.xCt.handleMessage(Message.obtain(this.xCt, paramInt));
        AppMethodBeat.o(114409);
      }
      else
      {
        Mc(paramInt);
        AppMethodBeat.o(114409);
      }
    }
  }

  public final boolean aLf()
  {
    AppMethodBeat.i(114406);
    boolean bool;
    if ((dpQ() == this.iAA) || (this.iAB))
    {
      bool = true;
      AppMethodBeat.o(114406);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(114406);
    }
  }

  public final void aLg()
  {
    AppMethodBeat.i(114407);
    ab.d(this.mName, "toForeground");
    nt(2);
    AppMethodBeat.o(114407);
  }

  public final void aLh()
  {
    AppMethodBeat.i(114408);
    ab.d(this.mName, "toBackground");
    nt(1);
    AppMethodBeat.o(114408);
  }

  public final void avC()
  {
    AppMethodBeat.i(114411);
    super.avC();
    this.iAB = true;
    AppMethodBeat.o(114411);
  }

  public final void start()
  {
    AppMethodBeat.i(114410);
    if (this.mStopped)
      AppMethodBeat.o(114410);
    while (true)
    {
      return;
      super.start();
      AppMethodBeat.o(114410);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.report.l
 * JD-Core Version:    0.6.2
 */