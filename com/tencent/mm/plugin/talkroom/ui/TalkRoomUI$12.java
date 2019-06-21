package com.tencent.mm.plugin.talkroom.ui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.base.i;
import com.tencent.mm.ui.v;

final class TalkRoomUI$12
  implements View.OnClickListener
{
  TalkRoomUI$12(TalkRoomUI paramTalkRoomUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(25917);
    TalkRoomUI localTalkRoomUI = this.szE;
    aw.ZK();
    if (bo.a((Integer)c.Ry().get(144641, null), 0) > 0);
    for (int i = 0; ; i = 1)
    {
      if (i == 0)
        this.szE.onBackPressed();
      AppMethodBeat.o(25917);
      return;
      i locali = new i(localTalkRoomUI, 2131493870);
      paramView = (LinearLayout)v.hu(ah.getContext()).inflate(2130970919, null);
      paramView.setMinimumWidth(10000);
      Button localButton = (Button)paramView.findViewById(2131828229);
      locali.setCanceledOnTouchOutside(true);
      locali.setOnDismissListener(new TalkRoomUI.17(localTalkRoomUI));
      locali.setCancelable(false);
      localButton.setOnClickListener(new TalkRoomUI.2(localTalkRoomUI, locali));
      locali.setContentView(paramView);
      locali.show();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.talkroom.ui.TalkRoomUI.12
 * JD-Core Version:    0.6.2
 */