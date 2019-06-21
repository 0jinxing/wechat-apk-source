package com.tencent.mm.plugin.sight.encode.ui;

import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class MainSightForwardContainerView$3
  implements Runnable
{
  public MainSightForwardContainerView$3(MainSightForwardContainerView paramMainSightForwardContainerView)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(25036);
    MainSightSelectContactView localMainSightSelectContactView = MainSightForwardContainerView.a(this.qAL);
    localMainSightSelectContactView.qAC = false;
    localMainSightSelectContactView.mListView.clearAnimation();
    localMainSightSelectContactView.mListView.clearFocus();
    localMainSightSelectContactView.mListView.setAdapter(localMainSightSelectContactView.qBi);
    localMainSightSelectContactView.I(false, true);
    localMainSightSelectContactView.setVisibility(0);
    if (localMainSightSelectContactView.qBh == null)
    {
      localMainSightSelectContactView.qBh = new TranslateAnimation(0.0F, 0.0F, localMainSightSelectContactView.qBf, 0.0F);
      localMainSightSelectContactView.qBh.setDuration(300L);
    }
    localMainSightSelectContactView.mListView.startAnimation(localMainSightSelectContactView.qBh);
    AppMethodBeat.o(25036);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sight.encode.ui.MainSightForwardContainerView.3
 * JD-Core Version:    0.6.2
 */