package com.tencent.mm.compatible.h;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

public final class a
{
  public int cvG;
  public String euD;
  public long euE;
  public int euF;

  public a()
  {
    AppMethodBeat.i(93052);
    this.euD = null;
    this.euE = -1L;
    this.euF = -1;
    this.cvG = -1;
    this.euD = null;
    this.euE = -1L;
    this.euF = -1;
    this.cvG = -1;
    AppMethodBeat.o(93052);
  }

  public final String Mk()
  {
    AppMethodBeat.i(93053);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append(this.euD);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.euE);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.euF);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cvG);
    ab.d("MicroMsg.AudioRecorderInfo", " getStatInfo " + ((StringBuffer)localObject).toString());
    localObject = ((StringBuffer)localObject).toString();
    AppMethodBeat.o(93053);
    return localObject;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.compatible.h.a
 * JD-Core Version:    0.6.2
 */