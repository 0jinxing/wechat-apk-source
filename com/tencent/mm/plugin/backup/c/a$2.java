package com.tencent.mm.plugin.backup.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.lan_cs.Client.a;
import java.io.IOException;

final class a$2
  implements Client.a
{
  a$2(a parama)
  {
  }

  public final void SX()
  {
    AppMethodBeat.i(17154);
    a.a(this.jrr, 10011, "client onDisconnect".getBytes());
    AppMethodBeat.o(17154);
  }

  public final void onRecv(String paramString, int paramInt, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(17153);
    a.a(this.jrr, paramString);
    a.a(this.jrr, paramInt);
    try
    {
      a.a(this.jrr, paramArrayOfByte);
      AppMethodBeat.o(17153);
      return;
    }
    catch (IOException paramString)
    {
      while (true)
      {
        a.a(this.jrr, 10006, ("client readErr:" + paramString.toString()).getBytes());
        AppMethodBeat.o(17153);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.c.a.2
 * JD-Core Version:    0.6.2
 */