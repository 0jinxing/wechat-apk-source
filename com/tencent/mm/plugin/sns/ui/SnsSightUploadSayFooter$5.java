package com.tencent.mm.plugin.sns.ui;

import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.ChatFooterPanel.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.widget.MMEditText;

final class SnsSightUploadSayFooter$5
  implements ChatFooterPanel.a
{
  SnsSightUploadSayFooter$5(SnsSightUploadSayFooter paramSnsSightUploadSayFooter)
  {
  }

  public final void aRg()
  {
    AppMethodBeat.i(39289);
    SnsSightUploadSayFooter.b(this.rxa).getInputConnection().sendKeyEvent(new KeyEvent(0, 67));
    SnsSightUploadSayFooter.b(this.rxa).getInputConnection().sendKeyEvent(new KeyEvent(1, 67));
    AppMethodBeat.o(39289);
  }

  public final void aYY()
  {
  }

  public final void append(String paramString)
  {
    AppMethodBeat.i(39290);
    try
    {
      SnsSightUploadSayFooter.b(this.rxa).asB(paramString);
      AppMethodBeat.o(39290);
      return;
    }
    catch (Exception paramString)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.SnsSightUploadSayFooter", paramString, "", new Object[0]);
        AppMethodBeat.o(39290);
      }
    }
  }

  public final void fC(boolean paramBoolean)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsSightUploadSayFooter.5
 * JD-Core Version:    0.6.2
 */