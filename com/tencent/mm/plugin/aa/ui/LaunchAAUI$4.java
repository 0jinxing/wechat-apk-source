package com.tencent.mm.plugin.aa.ui;

import android.text.Editable;
import android.text.TextWatcher;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.aa.a.d;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.List;

final class LaunchAAUI$4
  implements TextWatcher
{
  LaunchAAUI$4(LaunchAAUI paramLaunchAAUI)
  {
  }

  public final void afterTextChanged(Editable paramEditable)
  {
    AppMethodBeat.i(40826);
    if (paramEditable.toString().startsWith("."))
      paramEditable.insert(0, "0");
    String str = paramEditable.toString();
    int i = str.indexOf(".");
    int j = str.length();
    if ((i >= 0) && (j - i > 3))
    {
      paramEditable.delete(i + 3, j);
      double d = bo.getDouble(paramEditable.toString(), 0.0D);
      if ((LaunchAAUI.f(this.gpj) == null) || (LaunchAAUI.f(this.gpj).size() <= 0))
        break label245;
      d = d * 100.0D / LaunchAAUI.f(this.gpj).size();
      LaunchAAUI.d(this.gpj);
      if (d <= d.aoj())
        break label245;
      LaunchAAUI.a(this.gpj, true);
      h.pYm.e(13722, new Object[] { Integer.valueOf(2) });
    }
    while (true)
    {
      LaunchAAUI.c(this.gpj);
      LaunchAAUI.g(this.gpj);
      LaunchAAUI.h(this.gpj);
      AppMethodBeat.o(40826);
      return;
      if (i > 6)
      {
        paramEditable.delete(6, i);
        break;
      }
      if ((i != -1) || (j <= 6))
        break;
      paramEditable.delete(6, j);
      break;
      label245: LaunchAAUI.a(this.gpj, false);
    }
  }

  public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.aa.ui.LaunchAAUI.4
 * JD-Core Version:    0.6.2
 */