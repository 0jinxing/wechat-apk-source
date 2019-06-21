package com.tencent.mm.plugin.brandservice.ui.timeline;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.brandservice.ui.timeline.video.a.c;
import com.tencent.mm.storage.q;

final class a$6
  implements View.OnClickListener
{
  a$6(a parama, int paramInt, q paramq)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(14103);
    int i = (int)(System.currentTimeMillis() / 1000L);
    if ((this.jEo > 0) || (!this.jEl.xHT));
    for (paramView = paramView.findViewById(2131821842); ; paramView = paramView.findViewById(2131821404))
    {
      Bundle localBundle = new Bundle();
      localBundle.putInt("biz_video_scene", 90);
      localBundle.putInt("biz_video_subscene", a.a(this.jNG).getIntent().getIntExtra("KOpenArticleSceneFromScene", 10000));
      localBundle.putInt("geta8key_scene", 56);
      c.a(a.a(this.jNG), this.jEl.field_msgId, this.jEl.field_msgSvrId, this.jEo, paramView, localBundle);
      a.f(this.jNG).a(this.jEl, this.jEo, i);
      AppMethodBeat.o(14103);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.a.6
 * JD-Core Version:    0.6.2
 */