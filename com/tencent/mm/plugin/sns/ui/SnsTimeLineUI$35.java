package com.tencent.mm.plugin.sns.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class SnsTimeLineUI$35
  implements TestTimeForSns.a
{
  SnsTimeLineUI$35(SnsTimeLineUI paramSnsTimeLineUI)
  {
  }

  public final void bCv()
  {
    AppMethodBeat.i(39508);
    ab.i("MicroMsg.SnsTimeLineUI", "sns has drawed");
    SnsTimeLineUI.D(this.rzs).post(new SnsTimeLineUI.35.1(this));
    AppMethodBeat.o(39508);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsTimeLineUI.35
 * JD-Core Version:    0.6.2
 */