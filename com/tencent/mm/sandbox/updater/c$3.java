package com.tencent.mm.sandbox.updater;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.e;
import com.tencent.mm.a.g;
import com.tencent.mm.protocal.protobuf.btd;
import com.tencent.mm.sandbox.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import java.io.File;

final class c$3
  implements b.a
{
  c$3(c paramc)
  {
  }

  public final void b(int paramInt1, int paramInt2, btd parambtd)
  {
    AppMethodBeat.i(28859);
    if (paramInt1 != 0)
    {
      ab.e("MicroMsg.NetSceneGetUpdatePackFromCDN", "scene error. netRet=".concat(String.valueOf(paramInt1)));
      if (paramInt1 == -2)
        new File(this.xwc.alN()).delete();
      c.e(this.xwc);
      this.xwc.a(c.b(this.xwc));
      AppMethodBeat.o(28859);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.NetSceneGetUpdatePackFromCDN", "scene success");
      try
      {
        if (e.cs(this.xwc.alN()) < c.f(this.xwc))
        {
          ab.i("MicroMsg.NetSceneGetUpdatePackFromCDN", "scene continue;");
          this.xwc.a(c.b(this.xwc));
          AppMethodBeat.o(28859);
        }
        else
        {
          Object localObject1;
          if (c.g(this.xwc))
          {
            if (!c.h(this.xwc).equalsIgnoreCase(g.cz(this.xwc.alN())))
            {
              ab.e("MicroMsg.NetSceneGetUpdatePackFromCDN", "pack md5 check error");
              localObject1 = new java/io/File;
              ((File)localObject1).<init>(this.xwc.alN());
              ((File)localObject1).delete();
              c.b(this.xwc).b(2, -1, parambtd);
              AppMethodBeat.o(28859);
            }
            else
            {
              c.a(this.xwc, parambtd);
              AppMethodBeat.o(28859);
            }
          }
          else if (!c.i(this.xwc).equalsIgnoreCase(g.cz(this.xwc.alN())))
          {
            ab.e("MicroMsg.NetSceneGetUpdatePackFromCDN", "update pack check error");
            localObject1 = new java/io/File;
            ((File)localObject1).<init>(this.xwc.alN());
            ((File)localObject1).delete();
            c.b(this.xwc).b(-1, -1, parambtd);
            AppMethodBeat.o(28859);
          }
          else
          {
            localObject1 = com.tencent.mm.sandbox.monitor.c.xvv;
            Object localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>();
            localObject2 = c.j(this.xwc) + ".temp";
            StringBuilder localStringBuilder = new java/lang/StringBuilder;
            localStringBuilder.<init>();
            e.h((String)localObject1, (String)localObject2, c.k(this.xwc) + ".apk");
            c.b(this.xwc).b(200, 0, parambtd);
            AppMethodBeat.o(28859);
          }
        }
      }
      catch (Exception localException)
      {
        ab.e("MicroMsg.NetSceneGetUpdatePackFromCDN", "error occured during pack processing");
        ab.printErrStackTrace("MicroMsg.NetSceneGetUpdatePackFromCDN", localException, "", new Object[0]);
        c.b(this.xwc).b(-1, -1, parambtd);
        AppMethodBeat.o(28859);
      }
    }
  }

  public final void dN(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(28858);
    ab.d("MicroMsg.NetSceneGetUpdatePackFromCDN", "progress, total=" + paramInt1 + ", offset=" + paramInt2);
    c.b(this.xwc).dN(paramInt1, paramInt2);
    AppMethodBeat.o(28858);
  }

  public final void mm(long paramLong)
  {
    AppMethodBeat.i(28860);
    c.b(this.xwc).mm(paramLong);
    AppMethodBeat.o(28860);
  }

  public final void mn(long paramLong)
  {
    AppMethodBeat.i(28861);
    c.b(this.xwc).mn(paramLong);
    AppMethodBeat.o(28861);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.sandbox.updater.c.3
 * JD-Core Version:    0.6.2
 */