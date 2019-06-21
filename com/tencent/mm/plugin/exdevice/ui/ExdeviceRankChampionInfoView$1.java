package com.tencent.mm.plugin.exdevice.ui;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class ExdeviceRankChampionInfoView$1
  implements View.OnClickListener
{
  ExdeviceRankChampionInfoView$1(ExdeviceRankChampionInfoView paramExdeviceRankChampionInfoView, Context paramContext)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(20109);
    if (bo.isNullOrNil(ExdeviceRankChampionInfoView.a(this.lCY)))
    {
      ab.w("MicroMsg.ExdeviceRankChampionInfoView", "username is null.");
      AppMethodBeat.o(20109);
    }
    while (true)
    {
      return;
      paramView = new Intent(this.val$context, ExdeviceProfileUI.class);
      paramView.putExtra("username", ExdeviceRankChampionInfoView.a(this.lCY));
      this.val$context.startActivity(paramView);
      AppMethodBeat.o(20109);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.ui.ExdeviceRankChampionInfoView.1
 * JD-Core Version:    0.6.2
 */