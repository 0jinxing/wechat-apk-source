package com.tencent.mm.plugin.sns.ui;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.g;
import com.tencent.mm.modelsns.SnsAdClick;
import com.tencent.mm.plugin.sns.a.b.a.a;
import com.tencent.mm.plugin.sns.a.b.h;
import com.tencent.mm.plugin.sns.a.b.j;
import com.tencent.mm.plugin.sns.a.b.j.a;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;

final class VideoAdPlayerUI$4
  implements View.OnClickListener
{
  VideoAdPlayerUI$4(VideoAdPlayerUI paramVideoAdPlayerUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(39916);
    if (VideoAdPlayerUI.q(this.rEw) != 0)
      j.a(j.a.qEN, this.rEw.rEg, this.rEw.rEf, VideoAdPlayerUI.r(this.rEw), VideoAdPlayerUI.q(this.rEw), VideoAdPlayerUI.s(this.rEw), VideoAdPlayerUI.t(this.rEw), VideoAdPlayerUI.u(this.rEw), VideoAdPlayerUI.v(this.rEw), VideoAdPlayerUI.w(this.rEw), VideoAdPlayerUI.x(this.rEw));
    if (VideoAdPlayerUI.e(this.rEw) != 0)
    {
      int i = VideoAdPlayerUI.a(this.rEw).qEs.qFq;
      int j = i;
      if (VideoAdPlayerUI.b(this.rEw))
      {
        j = i;
        if (VideoAdPlayerUI.a(this.rEw).qEs.qFu != 0L)
          j = i + (int)(bo.az(VideoAdPlayerUI.a(this.rEw).qEs.qFu) / 1000L);
      }
      paramView = new com.tencent.mm.modelstat.i(13228, "1,1," + j + "," + VideoAdPlayerUI.f(this.rEw) + "," + VideoAdPlayerUI.g(this.rEw) + "," + bo.anT() + "," + VideoAdPlayerUI.h(this.rEw) + "," + VideoAdPlayerUI.i(this.rEw), (int)bo.anT());
      g.RQ();
      g.RO().eJo.a(paramView, 0);
    }
    this.rEw.finish();
    paramView = new Intent();
    Bundle localBundle = new Bundle();
    localBundle.putString("key_snsad_statextstr", VideoAdPlayerUI.y(this.rEw));
    paramView.putExtra("jsapiargs", localBundle);
    paramView.putExtra("rawUrl", VideoAdPlayerUI.z(this.rEw));
    paramView.putExtra("useJs", true);
    if (VideoAdPlayerUI.A(this.rEw))
      com.tencent.mm.plugin.sns.data.i.a(new SnsAdClick(0, 6, VideoAdPlayerUI.B(this.rEw).field_snsId, 18, 0));
    new ak(Looper.getMainLooper()).post(new VideoAdPlayerUI.4.1(this, paramView));
    AppMethodBeat.o(39916);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI.4
 * JD-Core Version:    0.6.2
 */