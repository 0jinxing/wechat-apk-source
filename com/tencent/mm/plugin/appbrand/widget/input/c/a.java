package com.tencent.mm.plugin.appbrand.widget.input.c;

import android.os.Looper;
import android.text.Selection;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ak;

public final class a
{
  private final ak jec;
  public volatile c jin;

  public a()
  {
    AppMethodBeat.i(77443);
    this.jec = new a.1(this, Looper.getMainLooper());
    AppMethodBeat.o(77443);
  }

  public final void a(CharSequence paramCharSequence, boolean paramBoolean)
  {
    AppMethodBeat.i(77444);
    if (paramCharSequence == null)
    {
      AppMethodBeat.o(77444);
      return;
    }
    paramCharSequence = this.jec.obtainMessage(1000, Selection.getSelectionEnd(paramCharSequence), 0, paramCharSequence.toString());
    this.jec.removeMessages(1000);
    ak localak = this.jec;
    if (paramBoolean);
    for (long l = 150L; ; l = 0L)
    {
      localak.sendMessageDelayed(paramCharSequence, l);
      AppMethodBeat.o(77444);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.input.c.a
 * JD-Core Version:    0.6.2
 */