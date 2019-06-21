package com.tencent.mm.ui;

import android.content.Intent;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.Window;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.OnLayoutChangedLinearLayout;
import com.tencent.mm.ui.tools.TestTimeForChatting;
import com.tencent.mm.ui.widget.h;

final class NewChattingTabUI$5
  implements Runnable
{
  NewChattingTabUI$5(NewChattingTabUI paramNewChattingTabUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(29797);
    if (!NewChattingTabUI.j(this.ypr))
    {
      ab.e("MicroMsg.LauncherUI.NewChattingTabUI", "start chatting but last chatting does't be close!");
      this.ypr.pW(false);
    }
    if ((NewChattingTabUI.g(this.ypr).isFinishing()) || (NewChattingTabUI.g(this.ypr).isPaused()) || (!NewChattingTabUI.j(this.ypr)))
    {
      ab.w("MicroMsg.LauncherUI.NewChattingTabUI", "[mStartChattingRunnable] pass! isPause:%s mChattingClosed:%s", new Object[] { Boolean.valueOf(NewChattingTabUI.g(this.ypr).isPaused()), Boolean.valueOf(NewChattingTabUI.j(this.ypr)) });
      NewChattingTabUI.k(this.ypr);
      AppMethodBeat.o(29797);
      return;
    }
    NewChattingTabUI.l(this.ypr);
    boolean bool;
    if (NewChattingTabUI.d(this.ypr) == null)
    {
      bool = false;
      label143: ab.i("MicroMsg.LauncherUI.NewChattingTabUI", "ashutest::startChatting, ishow:%b", new Object[] { Boolean.valueOf(bool) });
      Intent localIntent = new Intent().putExtra("Chat_User", NewChattingTabUI.m(this.ypr));
      if (NewChattingTabUI.n(this.ypr) != null)
        localIntent.putExtras(NewChattingTabUI.n(this.ypr));
      localIntent.putExtra("img_gallery_enter_from_chatting_ui", true);
      NewChattingTabUI.a(this.ypr, localIntent, false);
      NewChattingTabUI.p(this.ypr).setOnChattingLayoutChangedListener(NewChattingTabUI.o(this.ypr));
      NewChattingTabUI.d(this.ypr).setVisibility(0);
      if (NewChattingTabUI.g(this.ypr).getWindow().getDecorView().getWidth() != 0)
        break label360;
    }
    label360: for (float f = NewChattingTabUI.g(this.ypr).getResources().getDisplayMetrics().widthPixels; ; f = NewChattingTabUI.g(this.ypr).getWindow().getDecorView().getWidth())
    {
      NewChattingTabUI.d(this.ypr).setTranslationX(f - 0.1F);
      NewChattingTabUI.a(this.ypr, ah.anT());
      NewChattingTabUI.q(this.ypr);
      if (NewChattingTabUI.r(this.ypr))
        h.a(NewChattingTabUI.g(this.ypr));
      AppMethodBeat.o(29797);
      break;
      bool = NewChattingTabUI.d(this.ypr).isShown();
      break label143;
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(29798);
    String str = super.toString() + "|startChattingRunnable";
    AppMethodBeat.o(29798);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.NewChattingTabUI.5
 * JD-Core Version:    0.6.2
 */