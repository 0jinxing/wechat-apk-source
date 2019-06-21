package com.tencent.wecall.talkroom.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.TimerTask;

final class f$7 extends TimerTask
{
  f$7(f paramf)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(127876);
    if (!this.AKd.AJY)
    {
      f.a(this.AKd, f.n(this.AKd) + 1);
      if (f.o(this.AKd))
        f.b(this.AKd, f.p(this.AKd) + 1);
      if ((f.q(this.AKd) == 3) || (f.q(this.AKd) == 2))
      {
        f.c(this.AKd, f.r(this.AKd) + 1);
        this.AKd.AJC.tdt = f.r(this.AKd);
      }
      this.AKd.AJC.AKV = (f.n(this.AKd) * 1000);
      this.AKd.AJC.tds = f.n(this.AKd);
    }
    if (this.AKd.AJi != null)
      f.n(this.AKd);
    AppMethodBeat.o(127876);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.wecall.talkroom.model.f.7
 * JD-Core Version:    0.6.2
 */