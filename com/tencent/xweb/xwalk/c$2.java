package com.tencent.xweb.xwalk;

import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.xweb.i.a;
import com.tencent.xweb.m;
import org.xwalk.core.Log;

final class c$2
  implements RadioGroup.OnCheckedChangeListener
{
  c$2(c paramc)
  {
  }

  public final void onCheckedChanged(RadioGroup paramRadioGroup, int paramInt)
  {
    AppMethodBeat.i(85123);
    paramRadioGroup = i.a.AMd;
    if (paramInt == 2131823221)
      paramRadioGroup = i.a.AMd;
    while (true)
    {
      m.dTZ().a(paramRadioGroup);
      Log.d("WebDebugPage", "v8 type change to=".concat(String.valueOf(paramRadioGroup)));
      AppMethodBeat.o(85123);
      return;
      if (paramInt == 2131823223)
        paramRadioGroup = i.a.AMe;
      else if (paramInt == 2131823224)
        paramRadioGroup = i.a.AMi;
      else if (paramInt == 2131823222)
        paramRadioGroup = i.a.AMk;
      else if (paramInt == 2131823225)
        paramRadioGroup = i.a.AMl;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.xwalk.c.2
 * JD-Core Version:    0.6.2
 */