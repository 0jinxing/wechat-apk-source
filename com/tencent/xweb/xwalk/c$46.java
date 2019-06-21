package com.tencent.xweb.xwalk;

import android.content.Context;
import android.content.res.Resources;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.xweb.WebView.d;
import com.tencent.xweb.m;
import org.xwalk.core.Log;

final class c$46
  implements RadioGroup.OnCheckedChangeListener
{
  c$46(c paramc)
  {
  }

  public final void onCheckedChanged(RadioGroup paramRadioGroup, int paramInt)
  {
    AppMethodBeat.i(85174);
    if (this.ARk.ARi)
      AppMethodBeat.o(85174);
    while (true)
    {
      return;
      paramRadioGroup = WebView.d.ANa;
      if (paramInt == 2131823216)
        paramRadioGroup = WebView.d.ANa;
      while (true)
      {
        if (this.ARk.ARj.equals("all"))
          break label125;
        m.dTZ().a(this.ARk.ARj, paramRadioGroup);
        Log.d("WebDebugPage", "webview change to=".concat(String.valueOf(paramRadioGroup)));
        AppMethodBeat.o(85174);
        break;
        if (paramInt == 2131823217)
          paramRadioGroup = WebView.d.ANb;
        else if (paramInt == 2131823219)
          paramRadioGroup = WebView.d.ANc;
        else if (paramInt == 2131823218)
          paramRadioGroup = WebView.d.ANd;
      }
      label125: String[] arrayOfString = this.ARk.AMr.getResources().getStringArray(2131755067);
      for (paramInt = 0; paramInt < arrayOfString.length; paramInt++)
      {
        m.dTZ().a(arrayOfString[paramInt], paramRadioGroup);
        Log.d("WebDebugPage", "webview " + arrayOfString[paramInt] + " change to=" + paramRadioGroup);
      }
      AppMethodBeat.o(85174);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.xwalk.c.46
 * JD-Core Version:    0.6.2
 */