package com.tencent.mm.plugin.emojicapture.proxy;

import a.f.b.j;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelvoiceaddr.g;
import com.tencent.mm.modelvoiceaddr.g.b;
import com.tencent.mm.remoteservice.a;
import com.tencent.mm.remoteservice.d;
import com.tencent.mm.remoteservice.e;
import com.tencent.mm.remoteservice.f;
import com.tencent.mm.sdk.platformtools.ab;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/emojicapture/proxy/VoiceInputProxy;", "Lcom/tencent/mm/remoteservice/BaseClientRequest;", "uiCallback", "Lcom/tencent/mm/plugin/emojicapture/proxy/VoiceInputProxy$UICallback;", "serverProxy", "Lcom/tencent/mm/remoteservice/RemoteServiceProxy;", "(Lcom/tencent/mm/plugin/emojicapture/proxy/VoiceInputProxy$UICallback;Lcom/tencent/mm/remoteservice/RemoteServiceProxy;)V", "TAG", "", "getUiCallback", "()Lcom/tencent/mm/plugin/emojicapture/proxy/VoiceInputProxy$UICallback;", "setUiCallback", "(Lcom/tencent/mm/plugin/emojicapture/proxy/VoiceInputProxy$UICallback;)V", "getMaxAmplitudeRate", "", "getMaxAmplitudeRateRemote", "onRecongnizeFinish", "", "onRes", "voiceText", "start", "startRemote", "stop", "fromUI", "", "stopRemote", "Companion", "UICallback", "plugin-emojicapture_release"})
public final class VoiceInputProxy extends a
{
  private static g lkR;
  public static final VoiceInputProxy.a lkS;
  private final String TAG;
  private VoiceInputProxy.b lkQ;

  static
  {
    AppMethodBeat.i(2855);
    lkS = new VoiceInputProxy.a((byte)0);
    AppMethodBeat.o(2855);
  }

  public VoiceInputProxy(VoiceInputProxy.b paramb, d paramd)
  {
    super(paramd);
    this.lkQ = paramb;
    this.TAG = "MicroMsg.VoiceInputProxy";
  }

  @e
  public final int getMaxAmplitudeRate()
  {
    AppMethodBeat.i(2851);
    Object localObject = REMOTE_CALL("getMaxAmplitudeRateRemote", new Object[0]);
    int i;
    if ((localObject != null) && ((localObject instanceof Integer)))
    {
      i = ((Number)localObject).intValue();
      AppMethodBeat.o(2851);
    }
    while (true)
    {
      return i;
      AppMethodBeat.o(2851);
      i = 0;
    }
  }

  @f
  public final int getMaxAmplitudeRateRemote()
  {
    AppMethodBeat.i(2853);
    ab.d(this.TAG, "getMaxAmplitudeRateRemote call " + lkR);
    int i;
    if (lkR != null)
    {
      g localg = lkR;
      if (localg == null)
        j.dWJ();
      i = localg.getMaxAmplitudeRate();
      AppMethodBeat.o(2853);
    }
    while (true)
    {
      return i;
      i = 0;
      AppMethodBeat.o(2853);
    }
  }

  public final VoiceInputProxy.b getUiCallback()
  {
    return this.lkQ;
  }

  @e
  public final void onRecongnizeFinish()
  {
    AppMethodBeat.i(2850);
    VoiceInputProxy.b localb = this.lkQ;
    if (localb != null)
    {
      localb.amw();
      AppMethodBeat.o(2850);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(2850);
    }
  }

  @e
  public final void onRes(String paramString)
  {
    AppMethodBeat.i(2849);
    VoiceInputProxy.b localb = this.lkQ;
    if (localb != null)
    {
      localb.onRes(paramString);
      AppMethodBeat.o(2849);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(2849);
    }
  }

  public final void setUiCallback(VoiceInputProxy.b paramb)
  {
    this.lkQ = paramb;
  }

  @e
  public final void start()
  {
    AppMethodBeat.i(2847);
    REMOTE_CALL("startRemote", new Object[0]);
    AppMethodBeat.o(2847);
  }

  @f
  public final void startRemote()
  {
    AppMethodBeat.i(2852);
    Object localObject = new VoiceInputProxy.c(this);
    localObject = new g(g.gbc, 9, (g.b)localObject);
    lkR = (g)localObject;
    ((g)localObject).start();
    AppMethodBeat.o(2852);
  }

  @e
  public final void stop(boolean paramBoolean)
  {
    AppMethodBeat.i(2848);
    REMOTE_CALL("stopRemote", new Object[] { Boolean.valueOf(paramBoolean) });
    AppMethodBeat.o(2848);
  }

  @f
  public final void stopRemote(boolean paramBoolean)
  {
    AppMethodBeat.i(2854);
    g localg = lkR;
    if (localg != null)
      localg.stop(paramBoolean);
    lkR = null;
    AppMethodBeat.o(2854);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emojicapture.proxy.VoiceInputProxy
 * JD-Core Version:    0.6.2
 */