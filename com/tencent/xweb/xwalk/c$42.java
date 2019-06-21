package com.tencent.xweb.xwalk;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.xweb.m;

final class c$42
  implements CompoundButton.OnCheckedChangeListener
{
  c$42(c paramc)
  {
  }

  public final void onCheckedChanged(CompoundButton paramCompoundButton, boolean paramBoolean)
  {
    AppMethodBeat.i(85170);
    paramCompoundButton = m.dTZ();
    if (paramBoolean != paramCompoundButton.AMu)
    {
      paramCompoundButton.AMu = paramBoolean;
      paramCompoundButton.AMr.getSharedPreferences("wcwebview", 0).edit().putBoolean("bShowVersion", paramCompoundButton.AMu).commit();
    }
    if (paramBoolean)
    {
      this.ARk.dVD();
      this.ARk.ARe.setVisibility(0);
      AppMethodBeat.o(85170);
    }
    while (true)
    {
      return;
      if (this.ARk.ARe != null)
        this.ARk.ARe.setVisibility(8);
      AppMethodBeat.o(85170);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.xwalk.c.42
 * JD-Core Version:    0.6.2
 */