package com.tencent.mm.network.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.t;
import java.net.InetAddress;

public final class c
{
  private InetAddress geK;
  private int port;
  private int type;

  private c(InetAddress paramInetAddress, int paramInt1, int paramInt2)
  {
    this.geK = paramInetAddress;
    this.port = paramInt1;
    this.type = paramInt2;
  }

  public static c vd(String paramString)
  {
    Object localObject = null;
    AppMethodBeat.i(58716);
    if (paramString == null)
    {
      AppMethodBeat.o(58716);
      paramString = localObject;
    }
    while (true)
    {
      return paramString;
      paramString = paramString.split(":");
      if ((paramString == null) || (paramString.length != 3))
      {
        AppMethodBeat.o(58716);
        paramString = localObject;
      }
      else
      {
        try
        {
          InetAddress localInetAddress = t.ams(paramString[0]);
          int i = Integer.parseInt(paramString[1]);
          int j = Integer.parseInt(paramString[2]);
          paramString = new com/tencent/mm/network/a/c;
          paramString.<init>(localInetAddress, i, j);
          AppMethodBeat.o(58716);
        }
        catch (Exception paramString)
        {
          ab.e("MicroMsg.InAddress", "exception:%s", new Object[] { bo.l(paramString) });
          AppMethodBeat.o(58716);
          paramString = localObject;
        }
      }
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(58715);
    String str = "hc";
    if (this.type == 2)
      str = "dns";
    while (true)
    {
      str = this.geK.getHostAddress() + ":" + this.port + "(" + str + ")";
      AppMethodBeat.o(58715);
      return str;
      if (this.type == 3)
        str = "svrdns";
      else if (this.type == 4)
        str = "waphc";
      else if (this.type == 5)
        str = "newdns";
      else if (this.type == 6)
        str = "auth";
      else if (this.type == 7)
        str = "debug";
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.network.a.c
 * JD-Core Version:    0.6.2
 */