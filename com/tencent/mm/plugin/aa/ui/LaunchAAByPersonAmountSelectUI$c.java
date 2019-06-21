package com.tencent.mm.plugin.aa.ui;

import android.text.Editable;
import android.text.TextWatcher;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Map;

public final class LaunchAAByPersonAmountSelectUI$c
  implements TextWatcher
{
  String username;

  public LaunchAAByPersonAmountSelectUI$c(LaunchAAByPersonAmountSelectUI paramLaunchAAByPersonAmountSelectUI, String paramString)
  {
    this.username = paramString;
  }

  public final void afterTextChanged(Editable paramEditable)
  {
    AppMethodBeat.i(40804);
    try
    {
      if (paramEditable.toString().startsWith("."))
        paramEditable.insert(0, "0");
      String str = paramEditable.toString();
      int i = str.indexOf(".");
      int j = str.length();
      if ((i >= 0) && (j - i > 2))
        paramEditable.delete(i + 3, j);
      int k = str.lastIndexOf(".");
      if ((k != i) && (k > 0) && (j > k))
        paramEditable.delete(k, j);
      label106: if ((!bo.ac(paramEditable)) && (bo.getDouble(paramEditable.toString(), 0.0D) > 0.0D))
        LaunchAAByPersonAmountSelectUI.c(this.gou).put(this.username, paramEditable.toString());
      while (true)
      {
        LaunchAAByPersonAmountSelectUI.j(this.gou).removeCallbacks(LaunchAAByPersonAmountSelectUI.i(this.gou));
        LaunchAAByPersonAmountSelectUI.j(this.gou).postDelayed(LaunchAAByPersonAmountSelectUI.i(this.gou), 50L);
        AppMethodBeat.o(40804);
        return;
        LaunchAAByPersonAmountSelectUI.c(this.gou).remove(this.username);
      }
    }
    catch (Exception localException)
    {
      break label106;
    }
  }

  public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.aa.ui.LaunchAAByPersonAmountSelectUI.c
 * JD-Core Version:    0.6.2
 */