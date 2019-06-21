package com.tencent.mm.plugin.wallet_core.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.n.d;
import com.tencent.mm.ui.widget.a.d;
import java.util.HashMap;
import java.util.List;

public final class h
{
  public static void a(Context paramContext, List<Bankcard> paramList, Bankcard paramBankcard, String paramString1, String paramString2, boolean paramBoolean, String paramString3, n.d paramd)
  {
    AppMethodBeat.i(47158);
    d locald = new d(paramContext, 2, true);
    locald.rBl = new h.1(paramList, paramContext, new HashMap(), locald, paramBoolean, paramString3);
    locald.rBm = paramd;
    locald.zQy = true;
    paramContext = LayoutInflater.from(paramContext).inflate(2130971046, null);
    if (!bo.isNullOrNil(paramString1))
      ((TextView)paramContext.findViewById(2131828598)).setText(paramString1);
    if (!bo.isNullOrNil(paramString2))
      ((TextView)paramContext.findViewById(2131828599)).setText(paramString2);
    while (true)
    {
      locald.F(paramContext, false);
      if (paramBankcard == null)
        break;
      for (int i = 0; i < paramList.size(); i++)
        if (((Bankcard)paramList.get(i)).field_bindSerial.equals(paramBankcard.field_bindSerial))
          locald.zQA = i;
      paramContext.findViewById(2131828599).setVisibility(8);
    }
    locald.cpD();
    AppMethodBeat.o(47158);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.h
 * JD-Core Version:    0.6.2
 */