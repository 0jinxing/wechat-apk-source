package com.tencent.mm.plugin.game.model;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.game.e.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashMap;

public final class o
  implements View.OnClickListener
{
  private Context mContext;
  public int mXC;

  public o(Context paramContext)
  {
    this.mContext = paramContext;
  }

  public o(Context paramContext, int paramInt)
  {
    this.mContext = paramContext;
    this.mXC = paramInt;
  }

  private static int a(Context paramContext, n paramn, int paramInt)
  {
    AppMethodBeat.i(111297);
    if (paramn != null)
    {
      paramn.field_isRead = true;
      ((com.tencent.mm.plugin.game.a.c)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.game.a.c.class)).bCY().c(paramn, new String[0]);
    }
    paramn = new Intent();
    paramn.setClassName(paramContext, "com.tencent.mm.plugin.game.ui.GameMessageUI");
    paramn.putExtra("game_report_from_scene", paramInt);
    paramContext.startActivity(paramn);
    AppMethodBeat.o(111297);
    return 6;
  }

  public static int a(Context paramContext, n paramn, n.e parame, String paramString, int paramInt)
  {
    AppMethodBeat.i(111293);
    int i = 0;
    switch (parame.mXo)
    {
    default:
      ab.i("MicroMsg.GameMessageClickListener", "unknown msg jump type = " + parame.mXo);
      paramInt = i;
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
    }
    while (true)
    {
      AppMethodBeat.o(111293);
      return paramInt;
      paramInt = i(paramContext, paramString, paramInt);
      continue;
      paramInt = au(paramContext, paramString);
      continue;
      paramInt = j(paramContext, paramString, paramInt);
      continue;
      paramInt = a(paramContext, paramn, paramInt);
      continue;
      paramInt = av(paramContext, parame.lAF);
    }
  }

  private static int au(Context paramContext, String paramString)
  {
    AppMethodBeat.i(111294);
    int i;
    if (com.tencent.mm.pluginsdk.model.app.g.u(paramContext, paramString))
    {
      e.ak(paramContext, paramString);
      i = 3;
      AppMethodBeat.o(111294);
    }
    while (true)
    {
      return i;
      i = 0;
      AppMethodBeat.o(111294);
    }
  }

  private static int av(Context paramContext, String paramString)
  {
    AppMethodBeat.i(111298);
    int i;
    if (bo.isNullOrNil(paramString))
    {
      i = 0;
      AppMethodBeat.o(111298);
    }
    while (true)
    {
      return i;
      i = com.tencent.mm.plugin.game.f.c.ax(paramContext, paramString);
      AppMethodBeat.o(111298);
    }
  }

  private static int i(Context paramContext, String paramString, int paramInt)
  {
    AppMethodBeat.i(111295);
    if (com.tencent.mm.pluginsdk.model.app.g.u(paramContext, paramString))
    {
      e.ak(paramContext, paramString);
      paramInt = 3;
      AppMethodBeat.o(111295);
    }
    while (true)
    {
      return paramInt;
      paramInt = j(paramContext, paramString, paramInt);
      AppMethodBeat.o(111295);
    }
  }

  private static int j(Context paramContext, String paramString, int paramInt)
  {
    AppMethodBeat.i(111296);
    if (bo.isNullOrNil(paramString))
    {
      paramInt = 0;
      AppMethodBeat.o(111296);
    }
    while (true)
    {
      return paramInt;
      Bundle localBundle = new Bundle();
      localBundle.putCharSequence("game_app_id", paramString);
      localBundle.putInt("game_report_from_scene", paramInt);
      paramInt = com.tencent.mm.plugin.game.f.c.b(paramContext, paramString, null, localBundle);
      AppMethodBeat.o(111296);
    }
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(111292);
    if ((paramView.getTag() == null) || (!(paramView.getTag() instanceof o.a)))
    {
      ab.e("MicroMsg.GameMessageClickListener", "v.getTag is null");
      AppMethodBeat.o(111292);
    }
    while (true)
    {
      return;
      o.a locala = (o.a)paramView.getTag();
      if (locala.mXD == null)
      {
        ab.e("MicroMsg.GameMessageClickListener", "message is null");
        AppMethodBeat.o(111292);
      }
      else if (locala.mXx == null)
      {
        ab.e("MicroMsg.GameMessageClickListener", "jumpId is null");
        AppMethodBeat.o(111292);
      }
      else
      {
        paramView = (n.e)locala.mXD.mWu.get(locala.mXx);
        if (paramView == null)
        {
          ab.e("MicroMsg.GameMessageClickListener", "jumpInfo is null");
          AppMethodBeat.o(111292);
        }
        else
        {
          int i = a(this.mContext, locala.mXD, paramView, locala.mXD.field_appId, locala.cKG);
          if (i != 0)
            b.a(this.mContext, 13, locala.cKG, locala.position, i, 0, locala.mXD.field_appId, this.mXC, locala.mXD.mXb, locala.mXD.field_gameMsgId, locala.mXD.mXc, null);
          AppMethodBeat.o(111292);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.model.o
 * JD-Core Version:    0.6.2
 */