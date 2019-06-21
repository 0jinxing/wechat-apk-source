package com.tencent.mm.plugin.setting.ui.setting;

import android.widget.LinearLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class b
{
  LinearLayout qqB;
  LinearLayout qqC;
  LinearLayout qqD;
  LinearLayout qqE;
  LinearLayout qqF;

  public final void WA(String paramString)
  {
    AppMethodBeat.i(127689);
    if (paramString.equals("downloading"))
    {
      this.qqB.setVisibility(0);
      this.qqC.setVisibility(8);
      this.qqD.setVisibility(8);
      this.qqE.setVisibility(8);
      this.qqF.setVisibility(8);
      AppMethodBeat.o(127689);
    }
    while (true)
    {
      return;
      if (paramString.equals("downloaded"))
      {
        this.qqB.setVisibility(8);
        this.qqC.setVisibility(0);
        this.qqD.setVisibility(8);
        this.qqE.setVisibility(8);
        this.qqF.setVisibility(8);
        AppMethodBeat.o(127689);
      }
      else if (paramString.equals("undownloaded"))
      {
        this.qqB.setVisibility(8);
        this.qqC.setVisibility(8);
        this.qqD.setVisibility(0);
        this.qqE.setVisibility(8);
        this.qqF.setVisibility(8);
        AppMethodBeat.o(127689);
      }
      else if (paramString.equals("using"))
      {
        this.qqB.setVisibility(8);
        this.qqC.setVisibility(8);
        this.qqD.setVisibility(8);
        this.qqE.setVisibility(0);
        this.qqF.setVisibility(8);
        AppMethodBeat.o(127689);
      }
      else if (paramString.equals("canceling"))
      {
        this.qqB.setVisibility(8);
        this.qqC.setVisibility(8);
        this.qqD.setVisibility(8);
        this.qqE.setVisibility(8);
        this.qqF.setVisibility(0);
        AppMethodBeat.o(127689);
      }
      else
      {
        AppMethodBeat.o(127689);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.b
 * JD-Core Version:    0.6.2
 */