package com.tencent.mm.sdk.d;

import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class d
{
  public String mName;
  public volatile d.c xCt;
  volatile HandlerThread xCu;

  protected d(String paramString, Looper paramLooper)
  {
    AppMethodBeat.i(52473);
    this.mName = paramString;
    this.xCt = new d.c(paramLooper, this, (byte)0);
    AppMethodBeat.o(52473);
  }

  private Message obtainMessage(int paramInt)
  {
    AppMethodBeat.i(52480);
    Message localMessage = Message.obtain(this.xCt, paramInt);
    AppMethodBeat.o(52480);
    return localMessage;
  }

  protected final void Mc(int paramInt)
  {
    AppMethodBeat.i(52482);
    d.c localc = this.xCt;
    if (localc == null)
      AppMethodBeat.o(52482);
    while (true)
    {
      return;
      localc.sendMessageAtFrontOfQueue(obtainMessage(paramInt));
      AppMethodBeat.o(52482);
    }
  }

  public final void a(c paramc)
  {
    AppMethodBeat.i(52474);
    d.c.a(this.xCt, paramc);
    AppMethodBeat.o(52474);
  }

  protected void avC()
  {
  }

  public final void b(a parama)
  {
    AppMethodBeat.i(52478);
    d.c.a(this.xCt, parama);
    AppMethodBeat.o(52478);
  }

  public final void b(c paramc)
  {
    AppMethodBeat.i(52475);
    d.c.b(this.xCt, paramc);
    AppMethodBeat.o(52475);
  }

  protected final Message dpP()
  {
    AppMethodBeat.i(52476);
    Object localObject = this.xCt;
    if (localObject == null)
    {
      localObject = null;
      AppMethodBeat.o(52476);
    }
    while (true)
    {
      return localObject;
      localObject = d.c.b((d.c)localObject);
      AppMethodBeat.o(52476);
    }
  }

  public final a dpQ()
  {
    AppMethodBeat.i(52477);
    Object localObject = this.xCt;
    if (localObject == null)
    {
      localObject = null;
      AppMethodBeat.o(52477);
    }
    while (true)
    {
      return localObject;
      localObject = d.c.c((d.c)localObject);
      AppMethodBeat.o(52477);
    }
  }

  protected boolean i(Message paramMessage)
  {
    return true;
  }

  protected void j(Message paramMessage)
  {
    AppMethodBeat.i(52479);
    if (d.c.d(this.xCt))
      new StringBuilder(" - unhandledMessage: msg.what=").append(paramMessage.what);
    AppMethodBeat.o(52479);
  }

  public final void quit()
  {
    AppMethodBeat.i(52483);
    d.c localc = this.xCt;
    if (localc == null)
      AppMethodBeat.o(52483);
    while (true)
    {
      return;
      d.c.e(localc);
      AppMethodBeat.o(52483);
    }
  }

  public final void sendMessage(int paramInt)
  {
    AppMethodBeat.i(52481);
    d.c localc = this.xCt;
    if (localc == null)
      AppMethodBeat.o(52481);
    while (true)
    {
      return;
      localc.sendMessage(obtainMessage(paramInt));
      AppMethodBeat.o(52481);
    }
  }

  public void start()
  {
    AppMethodBeat.i(52484);
    d.c localc = this.xCt;
    if (localc == null)
      AppMethodBeat.o(52484);
    while (true)
    {
      return;
      d.c.g(localc);
      AppMethodBeat.o(52484);
    }
  }

  final class c$b extends c
  {
    private c$b()
    {
    }

    public final boolean k(Message paramMessage)
    {
      return false;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.d.d
 * JD-Core Version:    0.6.2
 */