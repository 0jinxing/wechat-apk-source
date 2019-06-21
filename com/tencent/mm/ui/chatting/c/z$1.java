package com.tencent.mm.ui.chatting.c;

import android.content.res.Resources;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.ui.base.h.c;
import com.tencent.mm.ui.chatting.BaseChattingUIFragment;

final class z$1
  implements h.c
{
  z$1(z paramz)
  {
  }

  public final void iE(int paramInt)
  {
    AppMethodBeat.i(31569);
    switch (paramInt)
    {
    default:
    case 0:
    case 1:
    }
    while (true)
    {
      AppMethodBeat.o(31569);
      while (true)
      {
        return;
        if (com.tencent.mm.au.b.sO((String)g.RP().Ry().get(274436, null)))
        {
          if (!com.tencent.mm.pluginsdk.permission.b.o(this.yQT.cgL.yTx.getContext(), "android.permission.ACCESS_COARSE_LOCATION"))
          {
            if (!((Boolean)g.RP().Ry().get(ac.a.xVP, Boolean.FALSE)).booleanValue())
            {
              com.tencent.mm.plugin.account.a.b.a.b(this.yQT.cgL.yTx.getContext(), this.yQT.cgL.yTx.getMMResources().getString(2131305910, new Object[] { aa.dor() }), 30763, true);
              AppMethodBeat.o(31569);
              continue;
            }
            com.tencent.mm.pluginsdk.permission.b.b(this.yQT.cgL.yTx.getContext(), "android.permission.ACCESS_COARSE_LOCATION", 67);
            AppMethodBeat.o(31569);
          }
        }
        else
        {
          boolean bool = com.tencent.mm.pluginsdk.permission.b.a(this.yQT.cgL.yTx.getContext(), "android.permission.ACCESS_COARSE_LOCATION", 67, null, null);
          ab.d("MicroMsg.ChattingUI.LocationComponent", "summerper checkPermission checkLocation[%b]", new Object[] { Boolean.valueOf(bool) });
          if (!bool)
          {
            AppMethodBeat.o(31569);
          }
          else
          {
            this.yQT.dEI();
            AppMethodBeat.o(31569);
            continue;
            if (com.tencent.mm.au.b.sO((String)g.RP().Ry().get(274436, null)))
            {
              if (com.tencent.mm.pluginsdk.permission.b.o(this.yQT.cgL.yTx.getContext(), "android.permission.ACCESS_COARSE_LOCATION"))
                break;
              if (!((Boolean)g.RP().Ry().get(ac.a.xVP, Boolean.FALSE)).booleanValue())
              {
                com.tencent.mm.plugin.account.a.b.a.b(this.yQT.cgL.yTx.getContext(), this.yQT.cgL.yTx.getMMResources().getString(2131305910, new Object[] { aa.dor() }), 30762, true);
                AppMethodBeat.o(31569);
              }
              else
              {
                com.tencent.mm.pluginsdk.permission.b.b(this.yQT.cgL.yTx.getContext(), "android.permission.ACCESS_COARSE_LOCATION", 68);
                AppMethodBeat.o(31569);
              }
            }
            else
            {
              bool = com.tencent.mm.pluginsdk.permission.b.a(this.yQT.cgL.yTx.getContext(), "android.permission.ACCESS_COARSE_LOCATION", 68, null, null);
              ab.d("MicroMsg.ChattingUI.LocationComponent", "summerper checkPermission checkLocation[%b]", new Object[] { Boolean.valueOf(bool) });
              if (bool)
                break;
              AppMethodBeat.o(31569);
            }
          }
        }
      }
      this.yQT.dEJ();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.c.z.1
 * JD-Core Version:    0.6.2
 */