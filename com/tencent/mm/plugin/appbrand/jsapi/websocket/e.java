package com.tencent.mm.plugin.appbrand.jsapi.websocket;

import com.tencent.mm.plugin.appbrand.t.e.a;
import com.tencent.mm.plugin.appbrand.t.e.h;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.util.Timer;

public abstract interface e
{
  public static final String hvr = null;

  public abstract void BT(String paramString);

  public abstract void BU(String paramString);

  public abstract void a(a parama);

  public abstract void a(Socket paramSocket);

  public abstract void a(Timer paramTimer);

  public abstract String aBA();

  public abstract Timer aGo();

  public abstract void bk(String paramString, int paramInt);

  public abstract void close();

  public abstract void connect();

  public abstract Socket getSocket();

  public abstract boolean isOpen();

  public abstract void p(ByteBuffer paramByteBuffer);

  public abstract void setTcpNoDelay(boolean paramBoolean);

  public static abstract interface a
  {
    public abstract void BB(String paramString);

    public abstract void K(int paramInt, String paramString);

    public abstract void a(a parama);

    public abstract void b(h paramh);

    public abstract void l(ByteBuffer paramByteBuffer);

    public abstract void zJ(String paramString);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.websocket.e
 * JD-Core Version:    0.6.2
 */