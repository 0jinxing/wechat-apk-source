package com.tencent.mm.plugin.shake.b;

import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.ak.a;

public abstract class l$b
{
  public l.a qrT;
  protected boolean qrU = false;
  protected long qrV = l.qrP;
  private ak qrW = new ak(new ak.a()
  {
    public final boolean handleMessage(Message paramAnonymousMessage)
    {
      AppMethodBeat.i(24472);
      if ((paramAnonymousMessage.what == l.qrQ) && (!l.b.this.qrU) && (l.b.this.qrT != null))
        l.b.this.qrT.b(null, 5L);
      AppMethodBeat.o(24472);
      return false;
    }
  });

  public l$b(l.a parama)
  {
    this.qrT = parama;
  }

  public void cjw()
  {
    reset();
    this.qrT = null;
  }

  public abstract void init();

  public abstract void pause();

  public abstract void reset();

  public abstract void resume();

  public abstract void start();
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.shake.b.l.b
 * JD-Core Version:    0.6.2
 */