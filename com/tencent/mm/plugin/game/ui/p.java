package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.game.model.n;
import com.tencent.mm.plugin.game.model.r;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public final class p extends b
{
  public p(Context paramContext, int paramInt)
  {
    super(paramContext);
    this.mXC = paramInt;
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(112087);
    paramView = paramView.getTag();
    if (paramView == null)
    {
      ab.e("MicroMsg.GameMessageOnClickListener", "Tag is null.");
      paramView = null;
      if (paramView != null)
        break label94;
      ab.e("MicroMsg.GameMessageContentClickListener", "The game message is null.");
      AppMethodBeat.o(112087);
    }
    while (true)
    {
      return;
      if (!(paramView instanceof Long))
      {
        ab.e("MicroMsg.GameMessageOnClickListener", "The tag of action listener is not instance of Long");
        paramView = null;
        break;
      }
      paramView = ((com.tencent.mm.plugin.game.a.c)g.K(com.tencent.mm.plugin.game.a.c.class)).bCY().iP(((Long)paramView).longValue());
      if (paramView != null)
        paramView.bEl();
      break;
      label94: switch (paramView.field_msgType)
      {
      case 7:
      case 8:
      case 9:
      default:
        i = a(this.mContext, paramView);
        com.tencent.mm.plugin.game.e.b.a(this.mContext, 13, 1301, 3, i, 0, paramView.field_appId, this.mXC, paramView.field_msgType, paramView.field_gameMsgId, paramView.mXc, null);
      case 10:
      case 11:
      case 6:
      case 5:
      }
      do
      {
        do
        {
          AppMethodBeat.o(112087);
          break;
          if (!bo.isNullOrNil(paramView.mWh))
          {
            i = com.tencent.mm.plugin.game.f.c.ax(this.mContext, paramView.mWh);
            com.tencent.mm.plugin.game.e.b.a(this.mContext, 13, 1301, 3, i, 0, paramView.field_appId, this.mXC, paramView.field_msgType, paramView.field_gameMsgId, paramView.mXc, null);
            AppMethodBeat.o(112087);
            break;
          }
          i = a(this.mContext, paramView);
          com.tencent.mm.plugin.game.e.b.a(this.mContext, 13, 1301, 3, i, 0, paramView.field_appId, this.mXC, paramView.field_msgType, paramView.field_gameMsgId, paramView.mXc, null);
          AppMethodBeat.o(112087);
          break;
        }
        while (bo.isNullOrNil(paramView.mWJ));
        i = com.tencent.mm.plugin.game.f.c.ax(this.mContext, paramView.mWJ);
        com.tencent.mm.plugin.game.e.b.a(this.mContext, 13, 1301, 3, i, 0, paramView.field_appId, this.mXC, paramView.field_msgType, paramView.field_gameMsgId, paramView.mXc, null);
        AppMethodBeat.o(112087);
        break;
      }
      while (bo.isNullOrNil(paramView.mWM));
      int i = com.tencent.mm.plugin.game.f.c.ax(this.mContext, paramView.mWM);
      com.tencent.mm.plugin.game.e.b.a(this.mContext, 13, 1301, 3, i, 0, paramView.field_appId, this.mXC, paramView.field_msgType, paramView.field_gameMsgId, paramView.mXc, null);
      AppMethodBeat.o(112087);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.ui.p
 * JD-Core Version:    0.6.2
 */