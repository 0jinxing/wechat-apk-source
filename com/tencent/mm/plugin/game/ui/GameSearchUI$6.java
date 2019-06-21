package com.tencent.mm.plugin.game.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.game.e.b;
import com.tencent.mm.plugin.game.f.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import java.util.LinkedList;

final class GameSearchUI$6
  implements AdapterView.OnItemClickListener
{
  GameSearchUI$6(GameSearchUI paramGameSearchUI)
  {
  }

  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(112193);
    paramAdapterView = ((s)paramAdapterView.getAdapter()).wO(paramInt);
    if (bo.isNullOrNil(paramAdapterView.text))
      AppMethodBeat.o(112193);
    while (true)
    {
      return;
      if (bo.isNullOrNil(paramAdapterView.appId))
      {
        paramView = new LinkedList();
        paramView.add(paramAdapterView.text);
        GameSearchUI.b(this.nmW, paramView);
        GameSearchUI.h(this.nmW);
        AppMethodBeat.o(112193);
      }
      else
      {
        int i;
        switch (paramAdapterView.actionType)
        {
        default:
          ab.e("MicroMsg.GameSearchUI", "unknowed actionType : " + paramAdapterView.actionType);
          AppMethodBeat.o(112193);
          break;
        case 1:
          paramView = new Bundle();
          paramView.putCharSequence("game_app_id", paramAdapterView.appId);
          paramView.putInt("game_report_from_scene", 1402);
          i = c.b(this.nmW, paramAdapterView.appId, null, paramView);
          b.a(this.nmW, 14, 1402, paramInt, i, paramAdapterView.appId, GameSearchUI.g(this.nmW), null);
          AppMethodBeat.o(112193);
          break;
        case 2:
          i = c.t(this.nmW.mController.ylL, paramAdapterView.nmB, "game_center_detail");
          b.a(this.nmW, 14, 1402, paramInt, i, paramAdapterView.appId, GameSearchUI.g(this.nmW), null);
          AppMethodBeat.o(112193);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.ui.GameSearchUI.6
 * JD-Core Version:    0.6.2
 */