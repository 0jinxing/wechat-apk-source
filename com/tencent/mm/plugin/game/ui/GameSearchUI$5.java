package com.tencent.mm.plugin.game.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.game.e.a;
import com.tencent.mm.plugin.game.e.b;
import com.tencent.mm.plugin.game.f.c;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashMap;
import java.util.Map;

final class GameSearchUI$5
  implements AdapterView.OnItemClickListener
{
  GameSearchUI$5(GameSearchUI paramGameSearchUI)
  {
  }

  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(112192);
    paramAdapterView = GameSearchUI.b(this.nmW);
    if ((paramInt < 0) || (paramInt >= paramAdapterView.getCount()))
    {
      paramAdapterView = null;
      if (paramAdapterView != null)
        break label52;
      AppMethodBeat.o(112192);
    }
    while (true)
    {
      return;
      paramAdapterView = ((r.b)paramAdapterView.getItem(paramInt)).nmy;
      break;
      label52: if ((paramAdapterView.actionType == 1) && (!bo.isNullOrNil(paramAdapterView.appId)))
      {
        paramView = new Bundle();
        paramView.putCharSequence("game_app_id", paramAdapterView.appId);
        paramView.putInt("game_report_from_scene", paramAdapterView.cKG);
        paramInt = c.b(this.nmW, paramAdapterView.appId, null, paramView);
        paramView = new HashMap();
        paramView.put("function_type", "search");
        paramView.put("funtion_value", paramAdapterView.nmA);
        paramView.put("keyword", GameSearchUI.f(this.nmW));
        paramView = a.K(paramView);
        b.a(this.nmW, 14, paramAdapterView.cKG, paramAdapterView.position, paramInt, paramAdapterView.appId, GameSearchUI.g(this.nmW), paramView);
        AppMethodBeat.o(112192);
      }
      else
      {
        if ((paramAdapterView.actionType == 2) && (!bo.isNullOrNil(paramAdapterView.nmz)))
        {
          paramInt = c.t(this.nmW, paramAdapterView.nmz, "game_center_detail");
          paramView = new HashMap();
          paramView.put("function_type", "search");
          paramView.put("funtion_value", paramAdapterView.nmA);
          paramView.put("keyword", GameSearchUI.f(this.nmW));
          paramView = a.K(paramView);
          b.a(this.nmW, 14, paramAdapterView.cKG, paramAdapterView.position, paramInt, 0, paramAdapterView.appId, GameSearchUI.g(this.nmW), paramAdapterView.nmu, String.valueOf(paramAdapterView.nmv), null, paramView);
        }
        AppMethodBeat.o(112192);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.ui.GameSearchUI.5
 * JD-Core Version:    0.6.2
 */