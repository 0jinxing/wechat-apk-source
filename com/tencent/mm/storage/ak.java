package com.tencent.mm.storage;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.cy;

public final class ak extends com.tencent.mm.o.a
  implements com.tencent.mm.cd.a.a<String>
{
  public bi xXq;

  public ak()
  {
  }

  public ak(String paramString)
  {
    super(paramString);
  }

  public final void ag(int paramInt, long paramLong)
  {
    AppMethodBeat.i(60132);
    switch (paramInt)
    {
    case 4:
    case 5:
    case 6:
    case 8:
    case 9:
    case 11:
    default:
    case 0:
    case 1:
    case 2:
    case 3:
    case 7:
    case 10:
    case 12:
    case 13:
    case 14:
    }
    while (true)
    {
      AppMethodBeat.o(60132);
      while (true)
      {
        return;
        hM((int)paramLong);
        AppMethodBeat.o(60132);
        continue;
        setStatus((int)paramLong);
        AppMethodBeat.o(60132);
        continue;
        hO((int)paramLong);
        AppMethodBeat.o(60132);
        continue;
        eD(paramLong);
        AppMethodBeat.o(60132);
        continue;
        eE(paramLong);
        AppMethodBeat.o(60132);
        continue;
        hQ((int)paramLong);
        AppMethodBeat.o(60132);
        continue;
        hR((int)paramLong);
        AppMethodBeat.o(60132);
        continue;
        hS((int)paramLong);
        AppMethodBeat.o(60132);
      }
      hU((int)paramLong);
    }
  }

  public final void ap(bi parambi)
  {
    AppMethodBeat.i(60130);
    setStatus(parambi.field_status);
    hO(parambi.field_isSend);
    if (parambi.bwt());
    label97: 
    while (true)
    {
      long l = parambi.field_createTime;
      ak localak = this;
      localak.eD(l);
      if (parambi.dtv())
      {
        setContent(parambi.dtW());
        AppMethodBeat.o(60130);
      }
      while (true)
      {
        return;
        if (parambi.field_status != 1)
          break label97;
        l = 9223372036854775807L;
        localak = this;
        break;
        setContent(parambi.field_content);
        AppMethodBeat.o(60130);
      }
    }
  }

  public final void bK(int paramInt, String paramString)
  {
    AppMethodBeat.i(60133);
    switch (paramInt)
    {
    case 7:
    case 10:
    default:
    case 4:
    case 5:
    case 6:
    case 8:
    case 9:
    case 11:
    }
    while (true)
    {
      AppMethodBeat.o(60133);
      while (true)
      {
        return;
        setUsername(paramString);
        AppMethodBeat.o(60133);
        continue;
        setContent(paramString);
        AppMethodBeat.o(60133);
        continue;
        jg(paramString);
        AppMethodBeat.o(60133);
        continue;
        jh(paramString);
        AppMethodBeat.o(60133);
        continue;
        ji(paramString);
        AppMethodBeat.o(60133);
      }
      jk(paramString);
    }
  }

  public final void drw()
  {
  }

  public final void dsI()
  {
    AppMethodBeat.i(60131);
    setStatus(0);
    hO(0);
    setContent("");
    jg("0");
    hM(0);
    hU(0);
    eF(0L);
    hT(0);
    hT(0);
    super.jh("");
    super.ji("");
    AppMethodBeat.o(60131);
  }

  public final void q(int paramInt, byte[] paramArrayOfByte)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.storage.ak
 * JD-Core Version:    0.6.2
 */