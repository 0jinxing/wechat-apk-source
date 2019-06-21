package com.tencent.mm.pluginsdk.model;

import android.os.FileObserver;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

public final class t extends FileObserver
{
  private String qlC;
  private t.a vbH;

  public t(String paramString, t.a parama)
  {
    super(paramString);
    AppMethodBeat.i(79226);
    ab.i("MicroMsg.ScreenshotObserver", "observer  ".concat(String.valueOf(paramString)));
    this.vbH = parama;
    AppMethodBeat.o(79226);
  }

  public final void onEvent(int paramInt, String paramString)
  {
    AppMethodBeat.i(79227);
    if ((paramString != null) && (paramInt == 8) && ((this.qlC == null) || (!paramString.equalsIgnoreCase(this.qlC))))
    {
      this.qlC = paramString;
      this.vbH.csU();
      ab.i("MicroMsg.ScreenshotObserver", "Send event to listener. ".concat(String.valueOf(paramString)));
    }
    AppMethodBeat.o(79227);
  }

  public final void start()
  {
    AppMethodBeat.i(79228);
    super.startWatching();
    AppMethodBeat.o(79228);
  }

  public final void stop()
  {
    AppMethodBeat.i(79229);
    super.stopWatching();
    AppMethodBeat.o(79229);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.model.t
 * JD-Core Version:    0.6.2
 */