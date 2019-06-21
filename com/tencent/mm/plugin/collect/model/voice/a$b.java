package com.tencent.mm.plugin.collect.model.voice;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.concurrent.ConcurrentLinkedQueue;

public final class a$b
  implements c
{
  private a.c kDf;
  private ConcurrentLinkedQueue<a.a> kDg;

  public a$b(a parama, a.c paramc)
  {
    AppMethodBeat.i(41009);
    this.kDg = new ConcurrentLinkedQueue();
    this.kDf = paramc;
    AppMethodBeat.o(41009);
  }

  public final void a(a.a parama)
  {
    AppMethodBeat.i(41010);
    this.kDg.add(parama);
    AppMethodBeat.o(41010);
  }

  public final void l(int paramInt, byte[] paramArrayOfByte)
  {
    boolean bool = false;
    AppMethodBeat.i(41011);
    if (this.kDf == null)
      bool = true;
    ab.i("MicroMsg.F2fRcvVoiceOffLineLogic.Listener", "onGetResult() errorCode:%s (voiceLlistener == null):%s", new Object[] { Integer.valueOf(paramInt), Boolean.valueOf(bool) });
    if (this.kDf != null)
    {
      a.a locala = (a.a)this.kDg.poll();
      this.kDf.a(paramInt, locala.cva, locala.cvb, locala.cve, locala.cuY, a.bgJ().bgO(), paramArrayOfByte);
    }
    AppMethodBeat.o(41011);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.collect.model.voice.a.b
 * JD-Core Version:    0.6.2
 */