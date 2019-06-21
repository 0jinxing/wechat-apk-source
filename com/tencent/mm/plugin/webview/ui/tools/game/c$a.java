package com.tencent.mm.plugin.webview.ui.tools.game;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

public final class c$a
{
  public c$a(c paramc)
  {
  }

  public final void ao(Bundle paramBundle)
  {
    AppMethodBeat.i(8682);
    this.uDq.uDo = paramBundle;
    ab.i("MicroMsg.GamePageTimeReport", "setGamePageReportData");
    if ((paramBundle != null) && (paramBundle.getBoolean("game_page_report_time_begin")))
    {
      this.uDq.neL = 0L;
      this.uDq.mStartTime = System.currentTimeMillis();
      this.uDq.neM = System.currentTimeMillis();
    }
    AppMethodBeat.o(8682);
  }

  public final void dbY()
  {
    this.uDq.uDo = null;
    this.uDq.mStartTime = 0L;
    this.uDq.neL = 0L;
    this.uDq.mStartTime = 0L;
    this.uDq.neM = 0L;
  }

  public final void dbZ()
  {
    AppMethodBeat.i(8681);
    this.uDq.mStartTime = System.currentTimeMillis();
    this.uDq.neM = System.currentTimeMillis();
    AppMethodBeat.o(8681);
  }

  public final void onPause()
  {
    AppMethodBeat.i(8684);
    if (this.uDq.neM != 0L)
      this.uDq.neL += System.currentTimeMillis() - this.uDq.neM;
    AppMethodBeat.o(8684);
  }

  public final void onResume()
  {
    AppMethodBeat.i(8683);
    if (this.uDq.neM != 0L)
      this.uDq.neM = System.currentTimeMillis();
    AppMethodBeat.o(8683);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.game.c.a
 * JD-Core Version:    0.6.2
 */