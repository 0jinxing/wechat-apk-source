package com.tencent.mm.plugin.fts.ui;

import android.support.v7.app.AppCompatActivity;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fts.ui.widget.c.a;
import com.tencent.mm.plugin.fts.ui.widget.d;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

final class FTSMainUI$17
  implements c.a
{
  FTSMainUI$17(FTSMainUI paramFTSMainUI)
  {
  }

  public final void Nx(String paramString)
  {
    AppMethodBeat.i(61888);
    this.mJJ.mIu.setSearchContent(paramString);
    AppMethodBeat.o(61888);
  }

  public final void Ny(String paramString)
  {
    AppMethodBeat.i(61890);
    FTSMainUI.d(this.mJJ).mIS.mLI = paramString;
    this.mJJ.mIu.setSearchContent(paramString);
    FTSMainUI.a(this.mJJ, paramString);
    AppMethodBeat.o(61890);
  }

  public final void a(boolean paramBoolean1, boolean paramBoolean2, String paramString)
  {
    AppMethodBeat.i(61889);
    this.mJJ.mIu.setSearchContent(paramString);
    FTSMainUI.a(this.mJJ, paramString);
    if (!paramBoolean1)
      if (paramBoolean2)
      {
        FTSMainUI.Nw(this.mJJ.getString(2131300138));
        AppMethodBeat.o(61889);
      }
    while (true)
    {
      return;
      FTSMainUI.Nw(this.mJJ.getString(2131300139));
      AppMethodBeat.o(61889);
    }
  }

  public final void bBh()
  {
    AppMethodBeat.i(61887);
    this.mJJ.mIu.setCursorVisible(false);
    FTSMainUI.d(this.mJJ).wd(1);
    FTSMainUI.e(this.mJJ);
    this.mJJ.mIu.setHint(this.mJJ.mController.ylL.getString(2131300136));
    AppMethodBeat.o(61887);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.ui.FTSMainUI.17
 * JD-Core Version:    0.6.2
 */