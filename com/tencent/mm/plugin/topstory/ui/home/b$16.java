package com.tencent.mm.plugin.topstory.ui.home;

import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.List;

final class b$16
  implements Runnable
{
  b$16(b paramb, int paramInt)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(1600);
    if (this.gvp == this.sCf.sBW)
    {
      ((b.a)this.sCf.rsl.get(this.sCf.sBW)).sCw.setVisibility(8);
      ab.i("MicroMsg.TopStory.TopStoryUIComponentImpl", "onH5RenderFinished hide fakeIv " + this.sCf.sBW);
    }
    AppMethodBeat.o(1600);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.ui.home.b.16
 * JD-Core Version:    0.6.2
 */