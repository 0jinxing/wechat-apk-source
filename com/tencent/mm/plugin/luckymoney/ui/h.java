package com.tencent.mm.plugin.luckymoney.ui;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.luckymoney.model.as;
import com.tencent.mm.protocal.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.wallet_core.ui.e;

public final class h
{
  public static void a(Context paramContext, ViewGroup paramViewGroup, as paramas, h.c paramc)
  {
    AppMethodBeat.i(42900);
    if (paramas == null)
      AppMethodBeat.o(42900);
    while (true)
    {
      return;
      a(paramContext, paramViewGroup, paramas, paramc, paramas.type);
      AppMethodBeat.o(42900);
    }
  }

  public static void a(Context paramContext, ViewGroup paramViewGroup, as paramas, h.c paramc, String paramString)
  {
    AppMethodBeat.i(42901);
    if ((paramViewGroup == null) || (paramas == null))
      AppMethodBeat.o(42901);
    while (true)
    {
      return;
      if (paramas.erD == 0)
      {
        ab.i("MicroMsg.LuckyMoneyOperationViewMgr", "operInfo enable:" + paramas.erD);
        paramViewGroup.setVisibility(8);
        AppMethodBeat.o(42901);
      }
      else if (!paramas.type.equalsIgnoreCase(paramString))
      {
        ab.i("MicroMsg.LuckyMoneyOperationViewMgr", "not match type:" + paramas.type + ", " + paramString);
        paramViewGroup.setVisibility(8);
        AppMethodBeat.o(42901);
      }
      else if ((paramString.equalsIgnoreCase("Text")) || (paramString.equalsIgnoreCase("Native")))
      {
        paramString = new h.e();
        paramString.ogG = paramc;
        paramString.a(paramContext, paramViewGroup, paramas);
        AppMethodBeat.o(42901);
      }
      else if (paramString.equalsIgnoreCase("Pic"))
      {
        paramString = new h.a();
        paramString.ogG = paramc;
        paramString.a(paramContext, paramViewGroup, paramas);
        AppMethodBeat.o(42901);
      }
      else
      {
        if (paramString.equalsIgnoreCase("Appid"))
        {
          paramString = new h.b();
          paramString.ogG = paramc;
          paramString.a(paramContext, paramViewGroup, paramas);
        }
        AppMethodBeat.o(42901);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.ui.h
 * JD-Core Version:    0.6.2
 */