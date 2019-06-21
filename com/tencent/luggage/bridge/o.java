package com.tencent.luggage.bridge;

import com.tencent.luggage.g.d;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;

public final class o
{
  s bOF;
  n bOG;
  public f bOH;
  public p bOI;
  public ConcurrentHashMap<String, l> bOJ;
  private ConcurrentHashMap<String, j> bOK;
  private ConcurrentHashMap<Integer, h> bOL;
  private AtomicInteger bOM;

  public o(s params)
  {
    AppMethodBeat.i(90736);
    this.bOJ = new ConcurrentHashMap();
    this.bOK = new ConcurrentHashMap();
    this.bOL = new ConcurrentHashMap();
    this.bOM = new AtomicInteger(1);
    this.bOF = params;
    this.bOG = new n(this);
    this.bOH = new f(this.bOF);
    this.bOI = new q(this);
    this.bOF.addJavascriptInterface(new r(this.bOG), "_luggageBridgeNative");
    AppMethodBeat.o(90736);
  }

  private void a(i parami)
  {
    AppMethodBeat.i(90740);
    if ((j)this.bOK.get(parami.bOu) == null)
    {
      d.e("LuggageBridge", "no listener for event: %s", new Object[] { parami.bOu });
      AppMethodBeat.o(90740);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(90740);
    }
  }

  final e a(m paramm, boolean paramBoolean)
  {
    AppMethodBeat.i(90738);
    try
    {
      localk = new com/tencent/luggage/bridge/k;
      localk.<init>(this.bOH, paramm, paramBoolean);
      paramm = (l)this.bOJ.get(localk.bOr);
      if (paramm != null)
      {
        paramm.a(localk);
        if (!localk.bOx)
          break label118;
        paramm = localk.wN();
        AppMethodBeat.o(90738);
        return paramm;
      }
    }
    catch (JSONException paramm)
    {
      while (true)
      {
        k localk;
        d.e("LuggageBridge", "inflate Js2JavaInvokeContext failed: %s", new Object[] { paramm });
        AppMethodBeat.o(90738);
        paramm = null;
        continue;
        d.e("LuggageBridge", "Invoke Listener Not Found: %s", new Object[] { localk.bOr });
        localk.a("system:function_not_exist", null);
        continue;
        label118: AppMethodBeat.o(90738);
        paramm = null;
      }
    }
  }

  final void a(m paramm)
  {
    AppMethodBeat.i(90739);
    try
    {
      i locali = new com/tencent/luggage/bridge/i;
      locali.<init>(paramm);
      d.i("LuggageBridge", "processEventFromJs, EventName = %s", new Object[] { locali.bOu });
      a(locali);
      AppMethodBeat.o(90739);
      return;
    }
    catch (JSONException paramm)
    {
      while (true)
      {
        d.e("LuggageBridge", "inflate Js2JavaEventContext failed: %s", new Object[] { paramm });
        AppMethodBeat.o(90739);
      }
    }
  }

  final void b(m paramm)
  {
    AppMethodBeat.i(90741);
    try
    {
      localg = new com/tencent/luggage/bridge/g;
      localg.<init>(paramm);
      if ((h)this.bOL.get(Integer.valueOf(localg.bOs)) == null)
      {
        d.e("LuggageBridge", "no listener for callback: %d", new Object[] { Integer.valueOf(localg.bOs) });
        AppMethodBeat.o(90741);
        return;
      }
    }
    catch (JSONException paramm)
    {
      while (true)
      {
        g localg;
        d.e("LuggageBridge", "inflate Js2JavaEventContext failed: %s", new Object[] { paramm });
        AppMethodBeat.o(90741);
        continue;
        if (!localg.bOt)
          this.bOL.remove(Integer.valueOf(localg.bOs));
        AppMethodBeat.o(90741);
      }
    }
  }

  public final void bw(String paramString)
  {
    AppMethodBeat.i(90737);
    this.bOF.by(paramString);
    AppMethodBeat.o(90737);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.luggage.bridge.o
 * JD-Core Version:    0.6.2
 */