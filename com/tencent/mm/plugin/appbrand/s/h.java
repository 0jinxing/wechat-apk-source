package com.tencent.mm.plugin.appbrand.s;

import android.os.Looper;
import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.d.d;
import java.util.LinkedList;
import java.util.Queue;

public abstract class h<Task> extends d
{
  final h<Task>.b iRp = new h.b(this, (byte)0);
  private final h<Task>.a iRq = new a((byte)0);
  final String iRr;
  private final Queue<Task> iRs = new LinkedList();

  protected h(String paramString, Looper paramLooper)
  {
    super(paramString, paramLooper);
    this.iRr = paramString;
    a(this.iRp);
    a(this.iRq);
    b(this.iRp);
    start();
  }

  protected abstract boolean aCD();

  public final void avC()
  {
    super.avC();
    synchronized (this.iRs)
    {
      this.iRs.clear();
      return;
    }
  }

  public final void bF(Task paramTask)
  {
    if (aCD());
    while (true)
    {
      return;
      synchronized (this.iRs)
      {
        this.iRs.offer(paramTask);
        sendMessage(1);
      }
    }
  }

  protected abstract void bu(Task paramTask);

  final class a extends com.tencent.mm.plugin.appbrand.report.h
  {
    private a()
    {
    }

    public final String getName()
    {
      AppMethodBeat.i(73197);
      String str = h.this.iRr + "|StateExecuting";
      AppMethodBeat.o(73197);
      return str;
    }

    public final boolean k(Message paramMessage)
    {
      AppMethodBeat.i(73196);
      boolean bool;
      if (2 == paramMessage.what)
      {
        h.this.b(h.this.iRp);
        bool = true;
        AppMethodBeat.o(73196);
      }
      while (true)
      {
        return bool;
        bool = super.k(paramMessage);
        AppMethodBeat.o(73196);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.s.h
 * JD-Core Version:    0.6.2
 */