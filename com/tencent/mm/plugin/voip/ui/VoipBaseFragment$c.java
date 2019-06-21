package com.tencent.mm.plugin.voip.ui;

import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap;

public final class VoipBaseFragment$c
{
  ap gyS;
  TextView sW;
  int[] sWC;
  private int sWD;
  int sWE;

  protected VoipBaseFragment$c()
  {
    AppMethodBeat.i(4849);
    this.gyS = new ap(new VoipBaseFragment.c.1(this), true);
    AppMethodBeat.o(4849);
  }

  public final void a(TextView paramTextView, int[] paramArrayOfInt)
  {
    AppMethodBeat.i(4850);
    if ((paramArrayOfInt == null) || (paramTextView == null))
    {
      ab.e("MicroMsg.DynamicTextWrap", "textList or tv is null");
      AppMethodBeat.o(4850);
    }
    while (true)
    {
      return;
      cLc();
      this.sWE = 0;
      this.sWC = paramArrayOfInt;
      this.sW = paramTextView;
      this.sWD = 500;
      if (this.gyS != null)
      {
        paramArrayOfInt = this.gyS;
        long l = this.sWD;
        paramArrayOfInt.ae(l, l);
      }
      ab.b("MicroMsg.DynamicTextWrap", "start textview:".concat(String.valueOf(paramTextView)), new Object[0]);
      AppMethodBeat.o(4850);
    }
  }

  public final void cLc()
  {
    AppMethodBeat.i(4851);
    if (this.gyS != null)
      this.gyS.stopTimer();
    ab.b("MicroMsg.DynamicTextWrap", "stop textview: " + this.sW, new Object[0]);
    this.sW = null;
    AppMethodBeat.o(4851);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.ui.VoipBaseFragment.c
 * JD-Core Version:    0.6.2
 */