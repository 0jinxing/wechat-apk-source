package com.tencent.mm.plugin.sns.ui;

import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.ChatFooterPanel.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.widget.MMEditText;

final class SnsUploadSayFooter$4
  implements ChatFooterPanel.a
{
  SnsUploadSayFooter$4(SnsUploadSayFooter paramSnsUploadSayFooter)
  {
  }

  public final void aRg()
  {
    AppMethodBeat.i(39719);
    SnsUploadSayFooter.c(this.rCC).getInputConnection().sendKeyEvent(new KeyEvent(0, 67));
    SnsUploadSayFooter.c(this.rCC).getInputConnection().sendKeyEvent(new KeyEvent(1, 67));
    AppMethodBeat.o(39719);
  }

  public final void aYY()
  {
  }

  public final void append(String paramString)
  {
    AppMethodBeat.i(39720);
    try
    {
      SnsUploadSayFooter.c(this.rCC).asB(paramString);
      AppMethodBeat.o(39720);
      return;
    }
    catch (Exception paramString)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.SnsUploadSayFooter", paramString, "", new Object[0]);
        AppMethodBeat.o(39720);
      }
    }
  }

  public final void fC(boolean paramBoolean)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsUploadSayFooter.4
 * JD-Core Version:    0.6.2
 */