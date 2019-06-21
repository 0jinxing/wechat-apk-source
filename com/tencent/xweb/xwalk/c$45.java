package com.tencent.xweb.xwalk;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.RadioButton;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.xweb.m;

final class c$45
  implements AdapterView.OnItemSelectedListener
{
  c$45(c paramc)
  {
  }

  public final void onItemSelected(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    int i = 1;
    AppMethodBeat.i(85173);
    paramAdapterView = this.ARk.AMr.getResources().getStringArray(2131755068);
    this.ARk.ARj = paramAdapterView[paramInt];
    c localc = this.ARk;
    localc.ARi = true;
    if (localc.ARj.equals("all"))
    {
      paramView = localc.AMr.getResources().getStringArray(2131755067);
      paramAdapterView = m.dTZ().avg(paramView[0]);
      paramInt = i;
      if (paramInt < paramView.length)
        if (m.dTZ().avg(paramView[paramInt]) != paramAdapterView)
        {
          ((RadioButton)localc.ARh.findViewById(2131823216)).setChecked(false);
          ((RadioButton)localc.ARh.findViewById(2131823217)).setChecked(false);
          ((RadioButton)localc.ARh.findViewById(2131823219)).setChecked(false);
          ((RadioButton)localc.ARh.findViewById(2131823218)).setChecked(false);
        }
    }
    while (true)
    {
      localc.ARi = false;
      AppMethodBeat.o(85173);
      return;
      paramInt++;
      break;
      localc.l(paramAdapterView);
      continue;
      localc.l(m.dTZ().avg(localc.ARj));
    }
  }

  public final void onNothingSelected(AdapterView<?> paramAdapterView)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.xwalk.c.45
 * JD-Core Version:    0.6.2
 */