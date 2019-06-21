package com.tencent.mm.plugin.ipcall.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.ipcall.b.a;
import com.tencent.mm.plugin.ipcall.b.c;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;

final class b$7
  implements View.OnClickListener
{
  b$7(b paramb)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(21977);
    b localb = this.nAl;
    localb.nAa = localb.nzS.getText().toString();
    localb.nAb = localb.nzT.getText().toString();
    if ((!bo.isNullOrNil(localb.nAa)) && (!bo.isNullOrNil(localb.nAb)))
    {
      localb.nAa = localb.nzS.getText().toString().replace("+", "");
      localb.nAc = a.aE(localb.crP, localb.nAa + localb.nAb);
      localb.fmB = a.aG(localb.crP, localb.nAc);
      paramView = c.PA(localb.nAb);
      Object localObject = ah.getContext().getSharedPreferences("IPCall_LastInputPref", 0).edit();
      ((SharedPreferences.Editor)localObject).putString("IPCall_LastInputPhoneNumber", paramView);
      ((SharedPreferences.Editor)localObject).apply();
      String str = localb.nzS.getText().toString();
      localObject = localb.nzZ;
      if (!bo.isNullOrNil(str))
      {
        paramView = (View)localObject;
        if (bo.isNullOrNil((String)localObject))
          paramView = "";
        localObject = ah.getContext().getSharedPreferences("IPCall_LastInputPref", 0).edit();
        ((SharedPreferences.Editor)localObject).putString("IPCall_LastInputCountryCode", str.replace("+", ""));
        ((SharedPreferences.Editor)localObject).putString("IPCall_LastInputCountryName", paramView);
        ((SharedPreferences.Editor)localObject).apply();
      }
      if (localb.nzQ == null)
        break label374;
      localb.nzQ.p(localb.nAa, c.PA(localb.nAb), localb.nAc, localb.fmB);
      AppMethodBeat.o(21977);
    }
    while (true)
    {
      return;
      paramView = ah.getContext().getSharedPreferences("IPCall_LastInputPref", 0).getString("IPCall_LastInputPhoneNumber", "");
      if (!bo.isNullOrNil(paramView))
      {
        paramView = c.PA(paramView);
        localb.nAb = b.eL(localb.nzS.getText().toString().replace("+", ""), paramView);
        localb.cq(localb.nAb, -1);
        localb.bId();
      }
      label374: AppMethodBeat.o(21977);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.ui.b.7
 * JD-Core Version:    0.6.2
 */