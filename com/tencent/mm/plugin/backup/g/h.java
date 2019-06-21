package com.tencent.mm.plugin.backup.g;

import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ap;

public final class h
{
  static int index = 0;
  private h.a jwj;
  int[] jxO;
  int jxP;
  boolean jxQ;
  ap jxR;

  public h(h.a parama)
  {
    AppMethodBeat.i(17673);
    this.jxO = new int[] { 1000, 1000, 1000, 2000, 5000, 9000, 1000 };
    this.jxP = 0;
    this.jxQ = false;
    this.jxR = new ap(Looper.getMainLooper(), new h.1(this), false);
    this.jwj = parama;
    AppMethodBeat.o(17673);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.g.h
 * JD-Core Version:    0.6.2
 */