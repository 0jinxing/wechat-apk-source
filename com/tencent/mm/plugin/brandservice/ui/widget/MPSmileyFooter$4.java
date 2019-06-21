package com.tencent.mm.plugin.brandservice.ui.widget;

import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.ChatFooterPanel.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.widget.MMEditText;

final class MPSmileyFooter$4
  implements ChatFooterPanel.a
{
  MPSmileyFooter$4(MPSmileyFooter paramMPSmileyFooter)
  {
  }

  public final void aRg()
  {
    AppMethodBeat.i(14468);
    MPSmileyFooter.c(this.jZo).getInputConnection().sendKeyEvent(new KeyEvent(0, 67));
    MPSmileyFooter.c(this.jZo).getInputConnection().sendKeyEvent(new KeyEvent(1, 67));
    AppMethodBeat.o(14468);
  }

  public final void aYY()
  {
  }

  public final void append(String paramString)
  {
    AppMethodBeat.i(14469);
    try
    {
      MPSmileyFooter.c(this.jZo).asB(paramString);
      AppMethodBeat.o(14469);
      return;
    }
    catch (Exception paramString)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.SnsUploadSayFooter", paramString, "", new Object[0]);
        AppMethodBeat.o(14469);
      }
    }
  }

  public final void fC(boolean paramBoolean)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.widget.MPSmileyFooter.4
 * JD-Core Version:    0.6.2
 */