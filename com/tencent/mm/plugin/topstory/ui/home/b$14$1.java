package com.tencent.mm.plugin.topstory.ui.home;

import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.List;

final class b$14$1
  implements Runnable
{
  b$14$1(b.14 param14, int paramInt)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(1596);
    if (this.gvp == this.sCt.sCf.sBW)
    {
      ((b.a)this.sCt.sCf.rsl.get(this.sCt.sCf.sBW)).sCw.setVisibility(8);
      ab.i("MicroMsg.TopStory.TopStoryUIComponentImpl", "onPageScrollStateChanged hide fakeIv " + this.sCt.sCf.sBW);
    }
    AppMethodBeat.o(1596);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.ui.home.b.14.1
 * JD-Core Version:    0.6.2
 */