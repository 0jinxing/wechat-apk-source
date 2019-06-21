package com.tencent.mm.ui;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.aw;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.ui.chatting.BaseChattingUIFragment;

final class NewChattingTabUI$a
  implements Runnable
{
  int bFZ;
  Intent cEd;
  int requestCode;
  int ypy = 0;

  private NewChattingTabUI$a(NewChattingTabUI paramNewChattingTabUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(29809);
    if ((aw.RK()) && (NewChattingTabUI.a(this.ypr) != null))
    {
      ab.i("MicroMsg.LauncherUI.NewChattingTabUI", "on post select image job, acc has ready, retry count %d", new Object[] { Integer.valueOf(this.ypy) });
      this.ypr.startChatting(NewChattingTabUI.b(this.ypr), null, false);
      al.d(new Runnable()
      {
        public final void run()
        {
          boolean bool = true;
          AppMethodBeat.i(29807);
          if (NewChattingTabUI.c(NewChattingTabUI.a.this.ypr) == null);
          while (true)
          {
            ab.d("MicroMsg.LauncherUI.NewChattingTabUI", "on select image ActivityResult. after creat chattingUI, chatting fragment is null? %B", new Object[] { Boolean.valueOf(bool) });
            if (NewChattingTabUI.c(NewChattingTabUI.a.this.ypr) != null)
            {
              ab.d("MicroMsg.LauncherUI.NewChattingTabUI", "on select image ActivityResult. do post activity result");
              NewChattingTabUI.c(NewChattingTabUI.a.this.ypr).onActivityResult(NewChattingTabUI.a.this.requestCode & 0xFFFF, NewChattingTabUI.a.this.bFZ, NewChattingTabUI.a.this.cEd);
            }
            AppMethodBeat.o(29807);
            return;
            bool = false;
          }
        }

        public final String toString()
        {
          AppMethodBeat.i(29808);
          String str = super.toString() + "|PostSelectImageJob_onActivityResult";
          AppMethodBeat.o(29808);
          return str;
        }
      });
      AppMethodBeat.o(29809);
    }
    while (true)
    {
      return;
      if (this.ypy < 3)
        break;
      ab.w("MicroMsg.LauncherUI.NewChattingTabUI", "on post select image job, match max retry count");
      AppMethodBeat.o(29809);
    }
    if (NewChattingTabUI.a(this.ypr) != null);
    for (boolean bool = true; ; bool = false)
    {
      ab.w("MicroMsg.LauncherUI.NewChattingTabUI", "on post select image job, acc not ready or view init(%B), cur retry count %d", new Object[] { Boolean.valueOf(bool), Integer.valueOf(this.ypy) });
      this.ypy += 1;
      al.n(this, 300L);
      AppMethodBeat.o(29809);
      break;
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(29810);
    String str = super.toString() + "|PostSelectImageJob";
    AppMethodBeat.o(29810);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.NewChattingTabUI.a
 * JD-Core Version:    0.6.2
 */