package com.tencent.mm.plugin.wear.model.f;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wear.model.a;
import com.tencent.mm.plugin.wear.model.e.r;
import com.tencent.mm.protocal.protobuf.cuk;
import java.io.IOException;

public final class k extends c
{
  private String bzH;
  private int code;

  public k(int paramInt, String paramString)
  {
    this.code = paramInt;
    this.bzH = paramString;
  }

  public final String getName()
  {
    return "WearPushPayResponseTask";
  }

  protected final void send()
  {
    AppMethodBeat.i(26451);
    cuk localcuk = new cuk();
    switch (this.code)
    {
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
    default:
    case 0:
    case 6:
    case 9:
    case 8:
    case 7:
    }
    while (true)
    {
      localcuk.xpw = this.bzH;
      try
      {
        a.cUn();
        r.b(20016, localcuk.toByteArray(), true);
        AppMethodBeat.o(26451);
        return;
        localcuk.xcZ = 0;
        continue;
        localcuk.xcZ = 196610;
        continue;
        localcuk.xcZ = 196613;
        continue;
        localcuk.xcZ = 196614;
        continue;
        localcuk.xcZ = 196615;
      }
      catch (IOException localIOException)
      {
        while (true)
          AppMethodBeat.o(26451);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wear.model.f.k
 * JD-Core Version:    0.6.2
 */