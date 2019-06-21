package com.tencent.mm.plugin.order.model;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;

public final class a
{
  public static com.tencent.mm.plugin.order.ui.a.e a(Context paramContext, MallTransactionObject paramMallTransactionObject)
  {
    AppMethodBeat.i(43748);
    com.tencent.mm.plugin.order.ui.a.e locale = new com.tencent.mm.plugin.order.ui.a.e(paramContext);
    if (!bo.isNullOrNil(paramMallTransactionObject.pcv));
    for (locale.pez = paramContext.getString(2131305077); ; locale.pez = paramContext.getString(2131305080))
    {
      locale.mOnClickListener = new a.1(paramMallTransactionObject, paramContext);
      AppMethodBeat.o(43748);
      return locale;
    }
  }

  public static void a(int paramInt, Context paramContext, MallTransactionObject paramMallTransactionObject)
  {
    AppMethodBeat.i(43749);
    switch (paramInt)
    {
    default:
    case 0:
    case 1:
    case 2:
    }
    while (true)
    {
      AppMethodBeat.o(43749);
      while (true)
      {
        return;
        g.RQ();
        ad localad = ((j)g.K(j.class)).XM().aoO(paramMallTransactionObject.pcm);
        if ((localad != null) && (com.tencent.mm.n.a.jh(localad.field_type)))
        {
          com.tencent.mm.wallet_core.ui.e.ag(paramContext, paramMallTransactionObject.pcm);
          AppMethodBeat.o(43749);
        }
        else
        {
          com.tencent.mm.wallet_core.ui.e.ae(paramContext, paramMallTransactionObject.pcm);
          AppMethodBeat.o(43749);
          continue;
          com.tencent.mm.wallet_core.ui.e.bU(paramContext, paramMallTransactionObject.pbP);
          AppMethodBeat.o(43749);
        }
      }
      com.tencent.mm.wallet_core.ui.e.n(paramContext, paramMallTransactionObject.pcv, false);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.order.model.a
 * JD-Core Version:    0.6.2
 */