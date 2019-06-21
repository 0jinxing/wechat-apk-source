package com.tencent.mm.plugin.sns.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.tools.b.c.a;
import com.tencent.mm.ui.widget.MMEditText;

final class SnsCommentFooter$1$1
  implements c.a
{
  SnsCommentFooter$1$1(SnsCommentFooter.1 param1)
  {
  }

  public final void JW()
  {
  }

  public final void JX()
  {
    AppMethodBeat.i(38874);
    h.g(SnsCommentFooter.h(this.rrE.rrD), 2131303848, 2131303849);
    AppMethodBeat.o(38874);
  }

  public final void ki(String paramString)
  {
    AppMethodBeat.i(38873);
    this.rrE.rrC.Zr(SnsCommentFooter.b(this.rrE.rrD).getText().toString());
    SnsCommentFooter.b(this.rrE.rrD).setText("");
    AppMethodBeat.o(38873);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsCommentFooter.1.1
 * JD-Core Version:    0.6.2
 */