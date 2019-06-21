package com.tencent.mm.sandbox.updater;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.g;
import com.tencent.mm.protocal.protobuf.BaseResponse;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.protocal.protobuf.apj;
import com.tencent.mm.protocal.protobuf.btd;
import com.tencent.mm.sandbox.b.a;
import com.tencent.mm.sandbox.monitor.c;
import com.tencent.mm.sdk.platformtools.ab;
import java.io.File;

final class b$1
  implements b.a
{
  b$1(b paramb)
  {
  }

  public final void b(int paramInt1, int paramInt2, btd parambtd)
  {
    AppMethodBeat.i(28843);
    if ((paramInt1 != 200) || (paramInt2 != 0) || ((parambtd != null) && (parambtd.getBaseResponse().Ret != 0)))
      if ((!this.xvU.dnf()) && (b.a(this.xvU) < b.b(this.xvU).length * 5))
      {
        this.xvU.a(b.c(this.xvU));
        AppMethodBeat.o(28843);
      }
    while (true)
    {
      return;
      b.c(this.xvU).b(paramInt1, paramInt2, parambtd);
      AppMethodBeat.o(28843);
      continue;
      Object localObject1 = (apj)parambtd;
      ab.d("MicroMsg.NetSceneGetUpdatePack", "onGYNetEnd : file dir = " + com.tencent.mm.compatible.util.e.eSl);
      ab.d("MicroMsg.NetSceneGetUpdatePack", "onGYNetEnd : total len = " + ((apj)localObject1).ptw);
      ab.d("MicroMsg.NetSceneGetUpdatePack", "onGYNetEnd : start pos = " + ((apj)localObject1).ptx);
      ab.d("MicroMsg.NetSceneGetUpdatePack", "onGYNetEnd : data len = " + ((apj)localObject1).pty);
      if ((((apj)localObject1).pty <= 0) || (((apj)localObject1).ptz == null))
      {
        ab.e("MicroMsg.NetSceneGetUpdatePack", "data is null");
        b.c(this.xvU).b(paramInt1, -1, null);
        AppMethodBeat.o(28843);
      }
      else if (((apj)localObject1).ptz.getILen() != ((apj)localObject1).pty)
      {
        ab.e("MicroMsg.NetSceneGetUpdatePack", "data len not match with data buf, dataLen = " + ((apj)localObject1).pty + " data buf len = " + ((apj)localObject1).ptz.getILen());
        b.c(this.xvU).b(4, -1, null);
        AppMethodBeat.o(28843);
      }
      else if ((((apj)localObject1).ptx < 0) || (((apj)localObject1).ptx + ((apj)localObject1).pty > ((apj)localObject1).ptw))
      {
        ab.e("MicroMsg.NetSceneGetUpdatePack", "startPos = " + ((apj)localObject1).ptx + " dataLen = " + ((apj)localObject1).pty + " totalLen = " + ((apj)localObject1).ptw);
        b.c(this.xvU).b(4, -1, null);
        AppMethodBeat.o(28843);
      }
      else if (((apj)localObject1).ptw <= 0)
      {
        ab.e("MicroMsg.NetSceneGetUpdatePack", "totalLen is invalid: totalLen = " + ((apj)localObject1).ptw);
        b.c(this.xvU).b(4, -1, null);
        AppMethodBeat.o(28843);
      }
      else
      {
        String str1 = c.xvv;
        String str2 = b.d(this.xvU);
        Object localObject2 = ((apj)localObject1).ptz.getBuffer().toByteArray();
        paramInt1 = com.tencent.mm.a.e.b(str1, str2 + ".temp", (byte[])localObject2);
        if (paramInt1 != 0)
        {
          ab.e("MicroMsg.NetSceneGetUpdatePack", "appendBuf failed : ".concat(String.valueOf(paramInt1)));
          b.c(this.xvU).b(4, -1, null);
          AppMethodBeat.o(28843);
        }
        else
        {
          b.a(this.xvU, ((apj)localObject1).pty + ((apj)localObject1).ptx);
          b.b(this.xvU, ((apj)localObject1).ptw);
          b.c(this.xvU).dN(((apj)localObject1).ptw, ((apj)localObject1).ptx);
          if (((apj)localObject1).ptx + ((apj)localObject1).pty >= ((apj)localObject1).ptw)
          {
            try
            {
              if (!b.f(this.xvU).equalsIgnoreCase(g.cz(b.e(this.xvU))))
                break label813;
              localObject1 = c.xvv;
              localObject2 = new java/lang/StringBuilder;
              ((StringBuilder)localObject2).<init>();
              str2 = b.g(this.xvU) + ".temp";
              localObject2 = new java/lang/StringBuilder;
              ((StringBuilder)localObject2).<init>();
              com.tencent.mm.a.e.h((String)localObject1, str2, b.h(this.xvU) + ".apk");
              b.c(this.xvU).b(200, 0, parambtd);
              AppMethodBeat.o(28843);
            }
            catch (Exception parambtd)
            {
              ab.printErrStackTrace("MicroMsg.NetSceneGetUpdatePack", parambtd, "", new Object[0]);
              AppMethodBeat.o(28843);
            }
            continue;
            label813: ab.e("MicroMsg.NetSceneGetUpdatePack", "update pack check error");
            localObject1 = new java/io/File;
            ((File)localObject1).<init>(b.i(this.xvU));
            ((File)localObject1).delete();
            b.c(this.xvU).b(-1, -1, parambtd);
            AppMethodBeat.o(28843);
          }
          else
          {
            this.xvU.a(b.c(this.xvU));
            AppMethodBeat.o(28843);
          }
        }
      }
    }
  }

  public final void dN(int paramInt1, int paramInt2)
  {
  }

  public final void mm(long paramLong)
  {
    AppMethodBeat.i(28844);
    b.c(this.xvU).mm(paramLong);
    AppMethodBeat.o(28844);
  }

  public final void mn(long paramLong)
  {
    AppMethodBeat.i(28845);
    b.c(this.xvU).mn(paramLong);
    AppMethodBeat.o(28845);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.sandbox.updater.b.1
 * JD-Core Version:    0.6.2
 */