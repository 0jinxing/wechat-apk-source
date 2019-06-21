package com.tencent.mm.plugin.topstory.ui.home;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.topstory.ui.c.b;
import com.tencent.mm.plugin.topstory.ui.webview.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import java.util.List;

final class b$8$1
  implements Runnable
{
  b$8$1(b.8 param8, Bitmap paramBitmap)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(1585);
    if (this.val$bitmap != null)
      this.sCr.sCo.sCw.setImageBitmap(this.val$bitmap);
    while (true)
    {
      this.sCr.sCo.sCw.setVisibility(0);
      ab.i("MicroMsg.TopStory.TopStoryUIComponentImpl", "layout %s,%s, fakeIv %s,%s", new Object[] { Integer.valueOf(this.sCr.sCo.sCv.getWidth()), Integer.valueOf(this.sCr.sCo.sCv.getHeight()), Integer.valueOf(this.sCr.sCo.sCw.getWidth()), Integer.valueOf(this.sCr.sCo.sCw.getHeight()) });
      if (this.sCr.sCf.sBV.getParent() != null)
      {
        ((ViewGroup)this.sCr.sCf.sBV.getParent()).removeView(this.sCr.sCf.sBV);
        ab.i("MicroMsg.TopStory.TopStoryUIComponentImpl", "remove view from:" + this.sCr.sCp);
      }
      FrameLayout.LayoutParams localLayoutParams = new FrameLayout.LayoutParams(-1, -1);
      ((b.a)this.sCr.sCf.rsl.get(this.sCr.sCf.sBW)).sCv.addView(this.sCr.sCf.sBV, localLayoutParams);
      ab.i("MicroMsg.TopStory.TopStoryUIComponentImpl", "add view to:" + this.sCr.sCf.sBW);
      this.sCr.sCf.sBL.aj(this.sCr.sCq.sBt, this.sCr.sCq.sBu, this.sCr.sCq.sBv);
      AppMethodBeat.o(1585);
      return;
      this.sCr.sCo.sCw.setImageDrawable(this.sCr.sCf.sBH.getResources().getDrawable(2131689497));
      this.sCr.sCo.sCx = 0;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.ui.home.b.8.1
 * JD-Core Version:    0.6.2
 */