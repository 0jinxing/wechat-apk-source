package com.tencent.mm.ui.chatting;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.s;
import com.tencent.mm.model.t;

final class w$1
  implements View.OnClickListener
{
  w$1(w paramw)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(30814);
    com.tencent.mm.plugin.sport.a.d.kT(1);
    t.na("gh_43f2581f6fd6");
    Intent localIntent = new Intent();
    localIntent.putExtra("key_is_latest", true);
    localIntent.putExtra("rank_id", "#");
    localIntent.putExtra("key_only_show_latest_rank", true);
    localIntent.putExtra("app_username", s.mJ("gh_43f2581f6fd6"));
    localIntent.putExtra("device_type", 1);
    com.tencent.mm.bp.d.b(paramView.getContext(), "exdevice", ".ui.ExdeviceRankInfoUI", localIntent);
    AppMethodBeat.o(30814);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.w.1
 * JD-Core Version:    0.6.2
 */