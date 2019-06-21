package com.tencent.mm.plugin.appbrand;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.b.b;
import com.tencent.mm.plugin.appbrand.b.d;
import com.tencent.mm.plugin.appbrand.jsapi.ah;
import com.tencent.mm.plugin.appbrand.jsapi.c.a;
import com.tencent.mm.plugin.appbrand.jsapi.c.b;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import com.tencent.mm.plugin.appbrand.permission.e;
import com.tencent.mm.plugin.appbrand.permission.e.a;
import com.tencent.mm.plugin.appbrand.permission.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bp;
import java.util.concurrent.atomic.AtomicBoolean;

public class c
  implements c.b
{
  private final i gMH;
  private final e gMI;
  final com.tencent.mm.plugin.appbrand.jsapi.c gMJ;

  public c(i parami, com.tencent.mm.plugin.appbrand.jsapi.c paramc, e parame)
  {
    this.gMH = parami;
    this.gMJ = paramc;
    this.gMI = parame;
  }

  public void D(int paramInt, String paramString)
  {
  }

  public final void a(ah paramah, c.a parama)
  {
    AppMethodBeat.i(101711);
    Object localObject1 = null;
    try
    {
      boolean bool1;
      if (this.gMH != null)
      {
        localObject2 = this.gMH.gNN;
        localObject1 = localObject2;
        if (localObject2 != null)
        {
          i = 1;
          localObject1 = localObject2;
          if (i == 0)
            break label336;
          bool1 = ((com.tencent.mm.plugin.appbrand.b.c)localObject1).gWy.gWG.get();
          if (bool1)
            break label336;
          if (this.gMJ.isRunning())
            break label135;
        }
      }
      label135: for (int i = 1; ; i = 0)
      {
        if (i == 0)
          break label141;
        ab.e("MicroMsg.AppBrandComponentInterceptor", "onDispatch, event[%s], appId[%s], runtimeStopped[%b], envStopped[%b]", new Object[] { paramah.getName(), this.gMJ.getAppId(), Boolean.valueOf(bool1), Boolean.TRUE });
        AppMethodBeat.o(101711);
        return;
        i = 0;
        break;
      }
      label141: Object localObject2 = this.gMI;
      label163: boolean bool2;
      boolean bool3;
      if (((com.tencent.mm.plugin.appbrand.b.c)localObject1).gWy.awz() == b.gWv)
      {
        bool1 = true;
        bool2 = ((e)localObject2).a(this.gMJ, paramah);
        if ((!bool1) && (!bool2))
          break label350;
        bool3 = true;
        label188: localObject1 = (g)this.gMJ.B(g.class);
        if ((localObject1 != null) && (((g)localObject1).a(paramah)))
          break label356;
      }
      label336: label350: label356: for (i = 1; ; i = 0)
      {
        if (i != 0)
        {
          int j = ((e)localObject2).a(this.gMJ, paramah, null, false);
          ab.i("MicroMsg.AppBrandComponentInterceptor", "dispatchToService, canSend %B, event %s, index %d, suspend %b, hasPermission %b", new Object[] { Boolean.valueOf(bool3), paramah.getName(), Integer.valueOf(j), Boolean.valueOf(bool1), Boolean.valueOf(bool2) });
          if ((i != 0) && (bp.dpJ()))
            ab.d("MicroMsg.AppBrandComponentInterceptor", "dispatchToAutoTest, event %s, data %s, ", new Object[] { paramah.getName(), paramah.getData() });
        }
        if (bool3)
          parama.proceed();
        AppMethodBeat.o(101711);
        break;
        bool1 = false;
        break label163;
        bool3 = false;
        break label188;
      }
    }
    catch (NullPointerException parama)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.AppBrandComponentInterceptor", parama, "onDispatchImpl %s", new Object[] { paramah.getName() });
        AppMethodBeat.o(101711);
      }
    }
  }

  public void a(m paramm, String paramString1, int paramInt, String paramString2)
  {
  }

  public boolean a(m paramm, String paramString, int paramInt, c.a parama)
  {
    boolean bool = true;
    AppMethodBeat.i(101710);
    paramString = this.gMI.a(this.gMJ, paramm, paramString, new c.1(this, parama, paramm));
    if (-2 == paramString.ret)
      AppMethodBeat.o(101710);
    while (true)
    {
      return bool;
      if (paramString.ret != 0)
      {
        parama.AH(paramm.j(paramString.bzH, null));
        AppMethodBeat.o(101710);
      }
      else
      {
        bool = false;
        AppMethodBeat.o(101710);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.c
 * JD-Core Version:    0.6.2
 */