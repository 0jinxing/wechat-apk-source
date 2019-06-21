package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.s;
import com.tencent.mm.plugin.game.d.bx;
import com.tencent.mm.plugin.game.e.b;
import com.tencent.mm.pluginsdk.model.app.g;
import com.tencent.mm.pluginsdk.model.app.q;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public final class k
  implements View.OnClickListener, AdapterView.OnItemClickListener
{
  protected int mXC = 0;

  private void a(Context paramContext, com.tencent.mm.plugin.game.model.c paramc)
  {
    AppMethodBeat.i(112008);
    int i = 0;
    if (paramc.type == 1)
      i = com.tencent.mm.plugin.game.f.c.ax(paramContext, paramc.mVm);
    while (true)
    {
      a(paramContext, paramc, i);
      AppMethodBeat.o(112008);
      return;
      if (paramc.type == 0)
        if ((paramc.bDP()) && (!bo.isNullOrNil(paramc.mVF.mZj)) && (!g.a(paramContext, paramc)))
        {
          i = com.tencent.mm.plugin.game.f.c.ax(paramContext, paramc.mVF.mZj);
        }
        else
        {
          if ((bo.isNullOrNil(paramc.dng)) || (paramc.dnj != 4))
            break;
          ab.i("MicroMsg.GameItemClickListener", "Download via Google Play");
          q.by(paramContext, paramc.dng);
          i = 25;
        }
    }
    Bundle localBundle = new Bundle();
    localBundle.putCharSequence("game_app_id", paramc.field_appId);
    if (paramc.cKG == 1601)
      localBundle.putInt("game_report_from_scene", this.mXC);
    while (true)
    {
      i = com.tencent.mm.plugin.game.f.c.b(paramContext, paramc.field_appId, paramc.mVm, localBundle);
      break;
      localBundle.putInt("game_report_from_scene", paramc.cKG);
    }
  }

  private void a(Context paramContext, com.tencent.mm.plugin.game.model.c paramc, int paramInt)
  {
    AppMethodBeat.i(112009);
    b.a(paramContext, paramc.scene, paramc.cKG, paramc.position, paramInt, paramc.field_appId, this.mXC, paramc.ctu, paramc.mVB);
    AppMethodBeat.o(112009);
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(112007);
    if ((paramView.getTag() == null) || (!(paramView.getTag() instanceof com.tencent.mm.plugin.game.model.c)))
      AppMethodBeat.o(112007);
    while (true)
    {
      return;
      com.tencent.mm.plugin.game.model.c localc = (com.tencent.mm.plugin.game.model.c)paramView.getTag();
      a(paramView.getContext(), localc);
      AppMethodBeat.o(112007);
    }
  }

  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(112006);
    paramAdapterView = paramAdapterView.getAdapter().getItem(paramInt);
    if ((paramAdapterView == null) || (!(paramAdapterView instanceof com.tencent.mm.plugin.game.model.c)))
      AppMethodBeat.o(112006);
    while (true)
    {
      return;
      paramAdapterView = (com.tencent.mm.plugin.game.model.c)paramAdapterView;
      if (bo.isNullOrNil(paramAdapterView.field_appId))
      {
        AppMethodBeat.o(112006);
      }
      else
      {
        a(paramView.getContext(), paramAdapterView);
        AppMethodBeat.o(112006);
      }
    }
  }

  public final void setSourceScene(int paramInt)
  {
    this.mXC = paramInt;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.ui.k
 * JD-Core Version:    0.6.2
 */