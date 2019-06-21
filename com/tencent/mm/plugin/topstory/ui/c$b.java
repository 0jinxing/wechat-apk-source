package com.tencent.mm.plugin.topstory.ui;

import android.support.design.widget.TabLayout.e;
import android.view.View;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class c$b
{
  public String cEh = "";
  public int category = 0;
  public TextView gne;
  public TextView sBA;
  public View sBB;
  public boolean sBs;
  public String sBt = "";
  public int sBu = 0;
  public int sBv = 0;
  public String sBw = "";
  public String sBx = "";
  public TabLayout.e sBy;
  public View sBz;

  public final void bn(int paramInt, String paramString)
  {
    AppMethodBeat.i(1533);
    this.sBv = paramInt;
    this.sBx = paramString;
    if (this.sBv <= 0)
    {
      this.sBA.setText("");
      this.sBA.setVisibility(4);
      if (this.sBu <= 0)
        break label121;
      bo(this.sBu, this.sBw);
      AppMethodBeat.o(1533);
    }
    while (true)
    {
      return;
      paramString = this.sBv;
      if (this.sBv > 99)
        paramString = "99+";
      this.sBA.setText(paramString);
      this.sBA.setVisibility(0);
      this.sBB.setVisibility(8);
      label121: AppMethodBeat.o(1533);
    }
  }

  public final void bo(int paramInt, String paramString)
  {
    AppMethodBeat.i(1534);
    this.sBu = paramInt;
    this.sBw = paramString;
    if (paramInt > 0)
    {
      if (this.sBv > 0)
        break label59;
      this.sBA.setVisibility(4);
      this.sBB.setVisibility(0);
      AppMethodBeat.o(1534);
    }
    while (true)
    {
      return;
      this.sBB.setVisibility(8);
      label59: AppMethodBeat.o(1534);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.ui.c.b
 * JD-Core Version:    0.6.2
 */