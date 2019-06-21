package com.tencent.mm.plugin.sight.base;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;

public final class a
{
  public int eTk = 0;
  public int eWK = 0;
  public int fzS = 0;
  public int height = 0;
  public int qwV = 0;
  public int videoBitrate = 0;
  public int width = 0;

  public final int ckU()
  {
    AppMethodBeat.i(117301);
    int i = bo.mA(this.eWK);
    AppMethodBeat.o(117301);
    return i;
  }

  public final String toString()
  {
    AppMethodBeat.i(117302);
    String str = "[ videoDuration: " + this.eWK + " videoBitrate: " + this.videoBitrate + " width: " + this.width + " height: " + this.height + " frameRate: " + this.eTk + " audioChannel: " + this.qwV + " audioBitrate: " + this.fzS + "]";
    AppMethodBeat.o(117302);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sight.base.a
 * JD-Core Version:    0.6.2
 */