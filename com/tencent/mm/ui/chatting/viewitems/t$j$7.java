package com.tencent.mm.ui.chatting.viewitems;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.brandservice.ui.timeline.video.a.c;
import com.tencent.mm.ui.MMFragment;
import com.tencent.mm.ui.chatting.BaseChattingUIFragment;
import com.tencent.mm.ui.chatting.d.a;

final class t$j$7
  implements View.OnClickListener
{
  t$j$7(t.j paramj, int paramInt, long paramLong1, long paramLong2)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(33085);
    int i = t.j.a(this.zeF).yTx.getIntExtra("KOpenArticleSceneFromScene", 10000);
    View localView = paramView.findViewById(2131821404);
    paramView = new Bundle();
    paramView.putInt("biz_video_scene", 0);
    paramView.putInt("biz_video_subscene", i);
    paramView.putInt("geta8key_scene", 7);
    c.a(t.j.a(this.zeF).yTx.getContext(), this.cgB, this.fEC, this.val$index, localView, paramView);
    AppMethodBeat.o(33085);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.t.j.7
 * JD-Core Version:    0.6.2
 */