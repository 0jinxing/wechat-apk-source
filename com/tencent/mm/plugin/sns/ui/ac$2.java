package com.tencent.mm.plugin.sns.ui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.n.c;
import com.tencent.mm.ui.base.n.d;
import com.tencent.mm.ui.base.t;

final class ac$2
  implements View.OnClickListener
{
  ac$2(ac paramac)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(38339);
    if (this.rkS.rkE)
    {
      g.RQ();
      if (!g.RP().isSDCardAvailable())
      {
        t.hO(this.rkS.crP);
        AppMethodBeat.o(38339);
      }
    }
    while (true)
    {
      return;
      try
      {
        paramView = new com/tencent/mm/plugin/sns/ui/ax;
        paramView.<init>(this.rkS.crP);
        localObject = new com/tencent/mm/plugin/sns/ui/ac$2$1;
        ((ac.2.1)localObject).<init>(this);
        paramView.rBl = ((n.c)localObject);
        localObject = new com/tencent/mm/plugin/sns/ui/ac$2$2;
        ((ac.2.2)localObject).<init>(this);
        paramView.rBm = ((n.d)localObject);
        paramView.cuu();
        AppMethodBeat.o(38339);
      }
      catch (Exception paramView)
      {
        AppMethodBeat.o(38339);
      }
      continue;
      if (com.tencent.mm.vfs.e.ct(this.rkS.videoPath))
        break;
      ab.i("MicroMsg.SightWidget", "click videopath is not exist " + this.rkS.videoPath);
      AppMethodBeat.o(38339);
    }
    Object localObject = new int[2];
    int i;
    int j;
    if (paramView != null)
    {
      paramView.getLocationInWindow((int[])localObject);
      i = paramView.getWidth();
      j = paramView.getHeight();
    }
    while (true)
    {
      paramView = new Intent(this.rkS.crP, SnsOnlineVideoActivity.class);
      paramView.putExtra("intent_videopath", this.rkS.videoPath);
      paramView.putExtra("intent_thumbpath", this.rkS.thumbPath);
      paramView.putExtra("intent_isad", false);
      paramView.putExtra("intent_ispreview", true);
      paramView.putExtra("KBlockAdd", this.rkS.rkM);
      paramView.putExtra("img_gallery_left", localObject[0]);
      paramView.putExtra("img_gallery_top", localObject[1]);
      paramView.putExtra("img_gallery_width", i);
      paramView.putExtra("img_gallery_height", j);
      this.rkS.crP.startActivityForResult(paramView, 12);
      this.rkS.crP.overridePendingTransition(0, 0);
      AppMethodBeat.o(38339);
      break;
      j = 0;
      i = 0;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.ac.2
 * JD-Core Version:    0.6.2
 */