package com.tencent.mm.plugin.appbrand.widget.input.panel;

import android.content.Context;
import android.view.Display;
import android.view.WindowManager;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cb.e;
import com.tencent.mm.sdk.platformtools.ah;

public class c
{
  boolean jiH = false;
  b jiJ;
  f jiK;
  int jiL;
  int jiM;
  Context jiq;

  public static int[] aMw()
  {
    AppMethodBeat.i(134331);
    Display localDisplay = ((WindowManager)ah.getContext().getSystemService("window")).getDefaultDisplay();
    int i = localDisplay.getWidth();
    int j = localDisplay.getHeight();
    AppMethodBeat.o(134331);
    return new int[] { i, j };
  }

  public final a aRH()
  {
    AppMethodBeat.i(134330);
    if (this.jiJ == null)
    {
      this.jiJ = new b();
      this.jiJ.jiq = this.jiq;
      this.jiJ.setPanelManager(this);
    }
    b localb = this.jiJ;
    AppMethodBeat.o(134330);
    return localb;
  }

  protected e aRr()
  {
    AppMethodBeat.i(134332);
    e locale = e.dqK();
    AppMethodBeat.o(134332);
    return locale;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.input.panel.c
 * JD-Core Version:    0.6.2
 */