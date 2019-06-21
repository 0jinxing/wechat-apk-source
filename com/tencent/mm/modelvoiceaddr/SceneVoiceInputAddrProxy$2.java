package com.tencent.mm.modelvoiceaddr;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.List;

final class SceneVoiceInputAddrProxy$2
  implements g.b
{
  SceneVoiceInputAddrProxy$2(SceneVoiceInputAddrProxy paramSceneVoiceInputAddrProxy)
  {
  }

  public final void ams()
  {
    AppMethodBeat.i(116725);
    this.gbq.CLIENT_CALL("onRecordFinCli", new Object[0]);
    AppMethodBeat.o(116725);
  }

  public final void amw()
  {
    AppMethodBeat.i(116726);
    this.gbq.CLIENT_CALL("onRecognizeFinishCli", new Object[0]);
    AppMethodBeat.o(116726);
  }

  public final void b(String[] paramArrayOfString, List<String> paramList)
  {
    AppMethodBeat.i(138329);
    this.gbq.CLIENT_CALL("onResCli", new Object[] { paramArrayOfString, paramList });
    AppMethodBeat.o(138329);
  }

  public final void c(int paramInt1, int paramInt2, int paramInt3, long paramLong)
  {
    AppMethodBeat.i(116724);
    this.gbq.CLIENT_CALL("onErrorCli", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Long.valueOf(paramLong) });
    AppMethodBeat.o(116724);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelvoiceaddr.SceneVoiceInputAddrProxy.2
 * JD-Core Version:    0.6.2
 */