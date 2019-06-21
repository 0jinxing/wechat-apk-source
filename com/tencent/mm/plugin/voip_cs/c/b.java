package com.tencent.mm.plugin.voip_cs.c;

import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap;

public final class b
{
  public ap gyS;
  public TextView sW;
  public int[] sWC;
  public int sWD;
  public int sWE;

  public b()
  {
    AppMethodBeat.i(135438);
    this.gyS = new ap(new b.1(this), true);
    AppMethodBeat.o(135438);
  }

  public final void cLc()
  {
    AppMethodBeat.i(135439);
    if (this.gyS != null)
      this.gyS.stopTimer();
    ab.b("MicroMsg.DynamicTextWrap", "stop textview: " + this.sW, new Object[0]);
    this.sW = null;
    AppMethodBeat.o(135439);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip_cs.c.b
 * JD-Core Version:    0.6.2
 */