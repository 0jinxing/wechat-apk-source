package com.tencent.mm.lan_cs;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class Client
{
  public static a eOt;

  public static class C2Java
  {
    public static void onDisconnect(String paramString, int paramInt)
    {
      AppMethodBeat.i(114645);
      if (Client.eOt != null)
        Client.eOt.SX();
      AppMethodBeat.o(114645);
    }

    public static void onRecv(String paramString, int paramInt, byte[] paramArrayOfByte)
    {
      AppMethodBeat.i(114644);
      if (Client.eOt != null)
        Client.eOt.onRecv(paramString, paramInt, paramArrayOfByte);
      AppMethodBeat.o(114644);
    }
  }

  public static class Java2C
  {
    public static native void disconnect();

    public static native int send(String paramString, int paramInt, byte[] paramArrayOfByte);
  }

  public static abstract interface a
  {
    public abstract void SX();

    public abstract void onRecv(String paramString, int paramInt, byte[] paramArrayOfByte);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.lan_cs.Client
 * JD-Core Version:    0.6.2
 */