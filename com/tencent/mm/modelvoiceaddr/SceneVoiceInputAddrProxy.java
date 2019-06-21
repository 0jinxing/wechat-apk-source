package com.tencent.mm.modelvoiceaddr;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.remoteservice.a;
import com.tencent.mm.remoteservice.d;
import com.tencent.mm.remoteservice.e;
import com.tencent.mm.remoteservice.f;
import com.tencent.mm.sdk.platformtools.ah;
import java.util.List;

public class SceneVoiceInputAddrProxy extends a
  implements b
{
  private static SceneVoiceInputAddrProxy gbn;
  private d ext;
  private b gbo;
  private g.b gbp;

  public SceneVoiceInputAddrProxy(d paramd)
  {
    super(paramd);
    AppMethodBeat.i(116729);
    if (paramd == null)
      AppMethodBeat.o(116729);
    while (true)
    {
      return;
      this.ext = paramd;
      paramd.connect(new SceneVoiceInputAddrProxy.1(this));
      AppMethodBeat.o(116729);
    }
  }

  public static void create(d paramd)
  {
    AppMethodBeat.i(116727);
    gbn = new SceneVoiceInputAddrProxy(paramd);
    AppMethodBeat.o(116727);
  }

  public static SceneVoiceInputAddrProxy getInstance()
  {
    AppMethodBeat.i(116728);
    if (gbn == null)
      create(new d(ah.getContext()));
    SceneVoiceInputAddrProxy localSceneVoiceInputAddrProxy = gbn;
    AppMethodBeat.o(116728);
    return localSceneVoiceInputAddrProxy;
  }

  @e
  public void cancel(boolean paramBoolean)
  {
    AppMethodBeat.i(116732);
    REMOTE_CALL("cancelMM", new Object[] { Boolean.valueOf(paramBoolean) });
    AppMethodBeat.o(116732);
  }

  @f
  public void cancelMM(boolean paramBoolean)
  {
    AppMethodBeat.i(116733);
    if (getInstance().gbo != null)
      getInstance().gbo.cancel(paramBoolean);
    AppMethodBeat.o(116733);
  }

  public void connect(Runnable paramRunnable)
  {
    AppMethodBeat.i(116731);
    if (this.ext == null)
      AppMethodBeat.o(116731);
    while (true)
    {
      return;
      this.ext.connect(paramRunnable);
      AppMethodBeat.o(116731);
    }
  }

  @e
  public int getMaxAmplitudeRate()
  {
    AppMethodBeat.i(116738);
    Integer localInteger = (Integer)REMOTE_CALL("getMaxAmplitudeRateMM", new Object[0]);
    int i;
    if (localInteger == null)
    {
      AppMethodBeat.o(116738);
      i = 0;
    }
    while (true)
    {
      return i;
      i = localInteger.intValue();
      AppMethodBeat.o(116738);
    }
  }

  @f
  public int getMaxAmplitudeRateMM()
  {
    AppMethodBeat.i(116741);
    int i;
    if (getInstance().gbo != null)
    {
      i = getInstance().gbo.getMaxAmplitudeRate();
      AppMethodBeat.o(116741);
    }
    while (true)
    {
      return i;
      i = 0;
      AppMethodBeat.o(116741);
    }
  }

  public void init(int paramInt1, int paramInt2, g.b paramb)
  {
    AppMethodBeat.i(116739);
    getInstance().gbp = paramb;
    REMOTE_CALL("initMM", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    AppMethodBeat.o(116739);
  }

  @f
  public void initMM(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(116740);
    getInstance().gbo = new g(paramInt1, paramInt2, new SceneVoiceInputAddrProxy.2(this));
    AppMethodBeat.o(116740);
  }

  public boolean isConnected()
  {
    AppMethodBeat.i(116730);
    boolean bool;
    if (this.ext == null)
    {
      bool = false;
      AppMethodBeat.o(116730);
    }
    while (true)
    {
      return bool;
      bool = this.ext.isConnected();
      AppMethodBeat.o(116730);
    }
  }

  @e
  public void onErrorCli(int paramInt1, int paramInt2, int paramInt3, long paramLong)
  {
    AppMethodBeat.i(116743);
    if (getInstance().gbp != null)
      getInstance().gbp.c(paramInt1, paramInt2, paramInt3, paramLong);
    AppMethodBeat.o(116743);
  }

  @e
  public void onRecognizeFinishCli()
  {
    AppMethodBeat.i(116745);
    if (getInstance().gbp != null)
      getInstance().gbp.amw();
    AppMethodBeat.o(116745);
  }

  @e
  public void onRecordFinCli()
  {
    AppMethodBeat.i(116744);
    if (getInstance().gbp != null)
      getInstance().gbp.ams();
    AppMethodBeat.o(116744);
  }

  @e
  public void onResCli(String[] paramArrayOfString, List<String> paramList)
  {
    AppMethodBeat.i(138330);
    if (getInstance().gbp != null)
      getInstance().gbp.b(paramArrayOfString, paramList);
    AppMethodBeat.o(138330);
  }

  @e
  public void start()
  {
    AppMethodBeat.i(116736);
    REMOTE_CALL("startMM", new Object[0]);
    AppMethodBeat.o(116736);
  }

  @f
  public void startMM()
  {
    AppMethodBeat.i(116737);
    if (getInstance().gbo != null)
      getInstance().gbo.start();
    AppMethodBeat.o(116737);
  }

  @e
  public void stop(boolean paramBoolean)
  {
    AppMethodBeat.i(116734);
    REMOTE_CALL("stopMM", new Object[] { Boolean.valueOf(paramBoolean) });
    AppMethodBeat.o(116734);
  }

  @f
  public void stopMM(boolean paramBoolean)
  {
    AppMethodBeat.i(116735);
    if (getInstance().gbo != null)
      getInstance().gbo.stop(paramBoolean);
    AppMethodBeat.o(116735);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelvoiceaddr.SceneVoiceInputAddrProxy
 * JD-Core Version:    0.6.2
 */