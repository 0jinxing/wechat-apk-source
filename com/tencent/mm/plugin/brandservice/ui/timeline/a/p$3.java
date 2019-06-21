package com.tencent.mm.plugin.brandservice.ui.timeline.a;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.plugin.brandservice.ui.timeline.a;
import com.tencent.mm.plugin.fav.a.n;
import com.tencent.mm.plugin.messenger.foundation.a.a.h;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.sdk.platformtools.ab;

public final class p$3
  implements View.OnClickListener
{
  public p$3(p paramp, com.tencent.mm.storage.q paramq, ImageView paramImageView)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(14278);
    if ((this.jQc.jPm.jNv.isPlaying()) && (this.jEl.field_msgId == this.jQc.jPm.jNv.jON))
    {
      this.jQc.jPm.jNv.stopPlay();
      this.jQd.setImageResource(2130838271);
      AppMethodBeat.o(14278);
    }
    while (true)
    {
      return;
      com.tencent.mm.plugin.brandservice.ui.timeline.g localg = this.jQc.jPm.jNv;
      paramView = this.jQc.mContext;
      String str = com.tencent.mm.modelvoice.q.getFullPath(this.jEl.field_imgPath);
      long l = this.jEl.field_msgId;
      localg.aWG().a(localg);
      ab.d("MicroMsg.FavVoiceLogic", "start play, path[%s]", new Object[] { str });
      if (localg.aWG().startPlay(str, -1));
      for (localg.jON = l; ; localg.jON = 0L)
      {
        paramView = ((j)com.tencent.mm.kernel.g.K(j.class)).bOr().jf(this.jEl.field_msgId);
        if (paramView.field_msgId == 0L)
          break label228;
        if (!com.tencent.mm.modelvoice.q.K(paramView))
          com.tencent.mm.modelvoice.q.M(paramView);
        AppMethodBeat.o(14278);
        break;
        Toast.makeText(paramView, 2131297682, 1).show();
      }
      label228: AppMethodBeat.o(14278);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.a.p.3
 * JD-Core Version:    0.6.2
 */