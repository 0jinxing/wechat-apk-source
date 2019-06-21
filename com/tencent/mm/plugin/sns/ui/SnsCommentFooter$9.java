package com.tencent.mm.plugin.sns.ui;

import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.ChatFooterPanel.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.widget.MMEditText;

final class SnsCommentFooter$9
  implements ChatFooterPanel.a
{
  SnsCommentFooter$9(SnsCommentFooter paramSnsCommentFooter)
  {
  }

  public final void aRg()
  {
    AppMethodBeat.i(38887);
    if (SnsCommentFooter.b(this.rrD) != null)
      if (SnsCommentFooter.b(this.rrD).getInputConnection() == null)
        AppMethodBeat.o(38887);
    while (true)
    {
      return;
      SnsCommentFooter.b(this.rrD).getInputConnection().sendKeyEvent(new KeyEvent(0, 67));
      SnsCommentFooter.b(this.rrD).getInputConnection().sendKeyEvent(new KeyEvent(1, 67));
      AppMethodBeat.o(38887);
    }
  }

  public final void aYY()
  {
  }

  public final void append(String paramString)
  {
    AppMethodBeat.i(38888);
    try
    {
      SnsCommentFooter.b(this.rrD).asB(paramString);
      AppMethodBeat.o(38888);
      return;
    }
    catch (Exception paramString)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.SnsCommentFooter", paramString, "", new Object[0]);
        AppMethodBeat.o(38888);
      }
    }
  }

  public final void fC(boolean paramBoolean)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsCommentFooter.9
 * JD-Core Version:    0.6.2
 */