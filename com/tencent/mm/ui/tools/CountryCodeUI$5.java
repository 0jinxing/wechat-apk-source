package com.tencent.mm.ui.tools;

import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.VerticalScrollBar.a;

final class CountryCodeUI$5
  implements VerticalScrollBar.a
{
  CountryCodeUI$5(CountryCodeUI paramCountryCodeUI)
  {
  }

  public final void kp(String paramString)
  {
    int i = 0;
    AppMethodBeat.i(34804);
    if (this.zAO.getString(2131302792).equals(paramString))
    {
      CountryCodeUI.b(this.zAO).setSelection(0);
      AppMethodBeat.o(34804);
    }
    while (true)
    {
      return;
      int j = Integer.decode(paramString.substring(0, paramString.length() - 1)).intValue();
      paramString = CountryCodeUI.c(this.zAO).nBK;
      if (paramString == null)
      {
        AppMethodBeat.o(34804);
      }
      else
      {
        do
        {
          i++;
          if (i >= paramString.length)
            break;
        }
        while (paramString[i] != j);
        CountryCodeUI.b(this.zAO).setSelection(i + CountryCodeUI.b(this.zAO).getHeaderViewsCount());
        AppMethodBeat.o(34804);
        continue;
        AppMethodBeat.o(34804);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.CountryCodeUI.5
 * JD-Core Version:    0.6.2
 */