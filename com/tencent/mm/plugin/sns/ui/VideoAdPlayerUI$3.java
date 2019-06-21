package com.tencent.mm.plugin.sns.ui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.h.c;

final class VideoAdPlayerUI$3
  implements View.OnClickListener
{
  VideoAdPlayerUI$3(VideoAdPlayerUI paramVideoAdPlayerUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(39914);
    VideoAdPlayerUI localVideoAdPlayerUI = this.rEw;
    if (VideoAdPlayerUI.k(this.rEw));
    for (paramView = VideoAdPlayerUI.l(this.rEw); ; paramView = VideoAdPlayerUI.m(this.rEw))
    {
      h.a(localVideoAdPlayerUI, null, paramView, null, new h.c()
      {
        public final void iE(int paramAnonymousInt)
        {
          AppMethodBeat.i(39913);
          switch (paramAnonymousInt)
          {
          default:
          case 0:
          case 1:
          case 2:
          }
          while (true)
          {
            AppMethodBeat.o(39913);
            while (true)
            {
              return;
              Intent localIntent = new Intent();
              localIntent.putExtra("Select_Conv_Type", 3);
              localIntent.putExtra("select_is_ret", true);
              localIntent.putExtra("mutil_select_is_ret", true);
              localIntent.putExtra("ad_video_title", VideoAdPlayerUI.n(VideoAdPlayerUI.3.this.rEw));
              localIntent.putExtra("Retr_Msg_Type", 2);
              d.b(VideoAdPlayerUI.3.this.rEw, ".ui.transmit.SelectConversationUI", localIntent, 4097);
              AppMethodBeat.o(39913);
              continue;
              VideoAdPlayerUI.o(VideoAdPlayerUI.3.this.rEw);
              AppMethodBeat.o(39913);
            }
            VideoAdPlayerUI.p(VideoAdPlayerUI.3.this.rEw);
          }
        }
      });
      AppMethodBeat.o(39914);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI.3
 * JD-Core Version:    0.6.2
 */