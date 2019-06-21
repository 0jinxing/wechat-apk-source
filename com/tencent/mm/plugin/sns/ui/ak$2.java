package com.tencent.mm.plugin.sns.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sight.decode.ui.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.vfs.e;

final class ak$2
  implements View.OnClickListener
{
  ak$2(ak paramak)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(38599);
    if (!e.ct(this.rnA.videoPath))
    {
      ab.i("MicroMsg.SightWidget", "click videopath is not exist " + this.rnA.videoPath);
      AppMethodBeat.o(38599);
    }
    while (true)
    {
      return;
      if (this.rnA.rnz != null)
      {
        this.rnA.rnz.dismiss();
        this.rnA.rnz = null;
      }
      this.rnA.rnz = new c(this.rnA.crP);
      c localc = this.rnA.rnz;
      paramView = this.rnA.videoPath;
      String str = this.rnA.thumbPath;
      localc.ePJ = paramView;
      localc.imagePath = str;
      paramView = this.rnA.rnz;
      paramView.cPL = 0;
      paramView.qxZ = 0;
      paramView.mik = 1;
      this.rnA.rnz.show();
      AppMethodBeat.o(38599);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.ak.2
 * JD-Core Version:    0.6.2
 */