package com.tencent.mm.plugin.collect.model.voice;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class d
{
  public b kDp;

  private d()
  {
    AppMethodBeat.i(41032);
    this.kDp = new b();
    AppMethodBeat.o(41032);
  }

  public final int aA(float paramFloat)
  {
    this.kDp.JN = paramFloat;
    return 0;
  }

  public final int setVolume(float paramFloat)
  {
    this.kDp.mVolume = paramFloat;
    return 0;
  }

  public final int start(String paramString)
  {
    AppMethodBeat.i(41033);
    int i = this.kDp.start(paramString);
    AppMethodBeat.o(41033);
    return i;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.collect.model.voice.d
 * JD-Core Version:    0.6.2
 */