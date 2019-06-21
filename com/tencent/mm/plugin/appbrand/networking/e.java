package com.tencent.mm.plugin.appbrand.networking;

import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.i;
import com.tencent.mm.plugin.appbrand.jsapi.q.a;
import com.tencent.mm.plugin.appbrand.q;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedDeque;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/appbrand/networking/NetworkServiceImpl;", "Lcom/tencent/mm/plugin/appbrand/networking/INetworkService;", "Lcom/tencent/mm/kernel/service/IServiceLifeCycle;", "rt", "Lcom/tencent/mm/plugin/appbrand/AppBrandRuntime;", "(Lcom/tencent/mm/plugin/appbrand/AppBrandRuntime;)V", "mListeners", "Ljava/util/concurrent/ConcurrentLinkedDeque;", "Lcom/tencent/mm/plugin/appbrand/networking/IOnNetworkStateChanged;", "mRuntime", "getMRuntime", "()Lcom/tencent/mm/plugin/appbrand/AppBrandRuntime;", "addListener", "", "l", "notifyNetworkStateChanged", "onRegister", "onUnregister", "removeListener", "luggage-wxa-app_release"})
public class e
  implements com.tencent.mm.kernel.c.b, b
{
  final i gPI;
  private final ConcurrentLinkedDeque<c> ipI;

  public e(i parami)
  {
    AppMethodBeat.i(87591);
    this.gPI = parami;
    this.ipI = new ConcurrentLinkedDeque();
    AppMethodBeat.o(87591);
  }

  public void SH()
  {
    AppMethodBeat.i(87586);
    a((c)new a(this));
    AppMethodBeat.o(87586);
  }

  public void SI()
  {
    AppMethodBeat.i(87587);
    this.ipI.clear();
    AppMethodBeat.o(87587);
  }

  public final void a(c paramc)
  {
    AppMethodBeat.i(87589);
    this.ipI.add(paramc);
    AppMethodBeat.o(87589);
  }

  public final void aIQ()
  {
    AppMethodBeat.i(87588);
    Object localObject = this.gPI.xT();
    if (localObject != null)
    {
      if (((q)localObject).isRunning() == true)
      {
        localObject = this.ipI.iterator();
        while (((Iterator)localObject).hasNext())
          ((c)((Iterator)localObject).next()).aEU();
      }
    }
    else
      AppMethodBeat.o(87588);
    while (true)
    {
      return;
      AppMethodBeat.o(87588);
    }
  }

  public final void b(c paramc)
  {
    AppMethodBeat.i(87590);
    this.ipI.remove(paramc);
    AppMethodBeat.o(87590);
  }

  @l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "onNetworkStateChanged"})
  static final class a
    implements c
  {
    a(e parame)
    {
    }

    public final void aEU()
    {
      AppMethodBeat.i(87585);
      a.k((com.tencent.mm.plugin.appbrand.jsapi.c)this.ipJ.gPI.xT());
      AppMethodBeat.o(87585);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.networking.e
 * JD-Core Version:    0.6.2
 */