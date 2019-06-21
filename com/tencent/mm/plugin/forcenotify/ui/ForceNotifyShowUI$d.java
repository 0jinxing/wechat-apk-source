package com.tencent.mm.plugin.forcenotify.ui;

import a.f.b.j;
import a.l;
import android.media.MediaPlayer;
import android.os.Vibrator;
import android.view.View;
import android.view.Window;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "run"})
final class ForceNotifyShowUI$d
  implements Runnable
{
  ForceNotifyShowUI$d(ForceNotifyShowUI paramForceNotifyShowUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(51087);
    try
    {
      Object localObject = ForceNotifyShowUI.b(this.mtB);
      if (localObject != null)
        ((Vibrator)localObject).cancel();
      localObject = ForceNotifyShowUI.a(this.mtB);
      if (localObject != null)
        ((MediaPlayer)localObject).stop();
      localObject = this.mtB.getWindow();
      j.o(localObject, "window");
      localObject = ((Window)localObject).getDecorView();
      j.o(localObject, "window.decorView");
      ((View)localObject).setKeepScreenOn(false);
      AppMethodBeat.o(51087);
      return;
    }
    catch (Exception localException)
    {
      while (true)
        AppMethodBeat.o(51087);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.forcenotify.ui.ForceNotifyShowUI.d
 * JD-Core Version:    0.6.2
 */