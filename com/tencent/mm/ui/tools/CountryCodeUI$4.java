package com.tencent.mm.ui.tools;

import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.VerticalScrollBar.a;

final class CountryCodeUI$4
  implements VerticalScrollBar.a
{
  CountryCodeUI$4(CountryCodeUI paramCountryCodeUI)
  {
  }

  public final void kp(String paramString)
  {
    int i = 0;
    AppMethodBeat.i(34803);
    int j = paramString.charAt(0);
    if (this.zAO.getString(2131302792).equals(paramString))
    {
      CountryCodeUI.b(this.zAO).setSelection(0);
      AppMethodBeat.o(34803);
    }
    while (true)
    {
      return;
      paramString = CountryCodeUI.c(this.zAO).nBK;
      if (paramString == null)
      {
        AppMethodBeat.o(34803);
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
        AppMethodBeat.o(34803);
        continue;
        AppMethodBeat.o(34803);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.CountryCodeUI.4
 * JD-Core Version:    0.6.2
 */