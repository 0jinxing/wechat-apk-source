package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.game.f.c;
import com.tencent.mm.plugin.game.model.n;
import com.tencent.mm.sdk.platformtools.bo;

public final class o extends b
{
  public o(Context paramContext, int paramInt)
  {
    super(paramContext);
    this.mXC = paramInt;
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(112083);
    if (!(paramView.getTag() instanceof n))
      AppMethodBeat.o(112083);
    while (true)
    {
      return;
      paramView = (n)paramView.getTag();
      switch (paramView.field_msgType)
      {
      default:
        Bundle localBundle = new Bundle();
        localBundle.putCharSequence("game_app_id", paramView.field_appId);
        localBundle.putInt("game_report_from_scene", 1301);
        i = c.b(this.mContext, paramView.field_appId, null, localBundle);
        com.tencent.mm.plugin.game.e.b.a(this.mContext, 13, 1301, 5, i, 0, paramView.field_appId, this.mXC, paramView.field_msgType, paramView.field_gameMsgId, paramView.mXc, null);
      case 6:
      }
      do
      {
        AppMethodBeat.o(112083);
        break;
      }
      while (bo.isNullOrNil(paramView.mWo));
      int i = c.ax(this.mContext, paramView.mWo);
      com.tencent.mm.plugin.game.e.b.a(this.mContext, 13, 1301, 5, i, 0, paramView.field_appId, this.mXC, paramView.field_msgType, paramView.field_gameMsgId, paramView.mXc, null);
      AppMethodBeat.o(112083);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.ui.o
 * JD-Core Version:    0.6.2
 */