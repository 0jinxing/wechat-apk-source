package com.tencent.mm.plugin.wear.model.f;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wear.model.a;
import com.tencent.mm.plugin.wear.model.e.r;
import com.tencent.mm.plugin.wear.model.h;
import com.tencent.mm.protocal.protobuf.cuz;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

public final class l extends c
{
  private int tXZ;
  private String talker;

  public l(int paramInt, String paramString)
  {
    this.tXZ = paramInt;
    this.talker = paramString;
  }

  public final String getName()
  {
    return "WearVoipControllerTask";
  }

  protected final void send()
  {
    AppMethodBeat.i(26452);
    switch (this.tXZ)
    {
    default:
    case 20010:
    case 20011:
    case 20012:
    }
    while (true)
    {
      AppMethodBeat.o(26452);
      while (true)
      {
        return;
        cuz localcuz = new cuz();
        localcuz.wyw = this.talker;
        localcuz.jCH = h.adw(this.talker);
        try
        {
          a.cUn();
          r.b(this.tXZ, localcuz.toByteArray(), false);
          AppMethodBeat.o(26452);
        }
        catch (IOException localIOException)
        {
          AppMethodBeat.o(26452);
        }
        continue;
        try
        {
          a.cUn();
          r.b(this.tXZ, this.talker.getBytes("utf8"), false);
          AppMethodBeat.o(26452);
        }
        catch (UnsupportedEncodingException localUnsupportedEncodingException)
        {
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wear.model.f.l
 * JD-Core Version:    0.6.2
 */