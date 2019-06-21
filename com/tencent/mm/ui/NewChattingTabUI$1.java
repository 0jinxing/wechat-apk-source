package com.tencent.mm.ui;

import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Handler;
import android.os.MessageQueue.IdleHandler;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.y;
import com.tencent.mm.ui.tools.TestTimeForChatting;

final class NewChattingTabUI$1
  implements MessageQueue.IdleHandler
{
  NewChattingTabUI$1(NewChattingTabUI paramNewChattingTabUI)
  {
  }

  @TargetApi(17)
  public final boolean queueIdle()
  {
    boolean bool1 = true;
    AppMethodBeat.i(29792);
    try
    {
      boolean bool2;
      if ((NewChattingTabUI.a(this.ypr).isFinishing()) || (NewChattingTabUI.a(this.ypr).isDestroyed()))
      {
        bool2 = bool1;
        if (!NewChattingTabUI.a(this.ypr).isDestroyed())
        {
          if (NewChattingTabUI.a(this.ypr).isFinishing())
            bool2 = bool1;
        }
        else
        {
          ab.i("MicroMsg.LauncherUI.NewChattingTabUI", "prepare chattingUI but activity finished isDestroyed[%b]", new Object[] { Boolean.valueOf(bool2) });
          AppMethodBeat.o(29792);
        }
      }
      while (true)
      {
        return false;
        bool2 = false;
        break;
        ab.i("MicroMsg.LauncherUI.NewChattingTabUI", "prepare chattingUI logic start");
        long l = System.currentTimeMillis();
        if (NewChattingTabUI.d(this.ypr) == null)
        {
          Intent localIntent = new android/content/Intent;
          localIntent.<init>();
          localIntent = localIntent.putExtra("Chat_User", "");
          NewChattingTabUI.a(this.ypr, localIntent, true);
          NewChattingTabUI.d(this.ypr).setVisibility(8);
          NewChattingTabUI.e(this.ypr).dxr();
          localIntent = new android/content/Intent;
          localIntent.<init>();
          StringBuilder localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>();
          y.d(true, localIntent.putExtra("classname", LauncherUI.class.getName()));
        }
        ab.i("MicroMsg.LauncherUI.NewChattingTabUI", "prepare chattingUI logic use %dms", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
        AppMethodBeat.o(29792);
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.LauncherUI.NewChattingTabUI", localException, "", new Object[0]);
        new Handler().post(new Runnable()
        {
          public final void run()
          {
            AppMethodBeat.i(29791);
            RuntimeException localRuntimeException = new RuntimeException(localException);
            AppMethodBeat.o(29791);
            throw localRuntimeException;
          }
        });
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.NewChattingTabUI.1
 * JD-Core Version:    0.6.2
 */