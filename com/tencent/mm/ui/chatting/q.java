package com.tencent.mm.ui.chatting;

import android.os.Build.VERSION;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnHoverListener;
import android.view.View.OnTouchListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

public final class q
{
  public static q.b yJv;

  static
  {
    AppMethodBeat.i(30707);
    yJv = new q.b();
    AppMethodBeat.o(30707);
  }

  public static void dismiss()
  {
    AppMethodBeat.i(30705);
    try
    {
      if (yJv != null)
        q.b.a(yJv);
      AppMethodBeat.o(30705);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.ChattingItemAvatarOnHoverHelper", "exception in dismiss, %s", new Object[] { localException.getMessage() });
        AppMethodBeat.o(30705);
      }
    }
  }

  public static void eJ(View paramView)
  {
    AppMethodBeat.i(30704);
    Object localObject = yJv;
    if ((paramView == null) || (localObject == null))
    {
      ab.w("MicroMsg.OnHoverCompatibleHelper", "view or callback is null.");
      AppMethodBeat.o(30704);
    }
    while (true)
    {
      return;
      if (Build.VERSION.SDK_INT >= 14)
      {
        ai localai = ai.dCK();
        if ((Build.VERSION.SDK_INT >= 14) && (localai.yLS == null))
          localai.yLS = new ai.a((ai.b)localObject);
        localObject = localai.yLS;
        if ((localObject != null) && (Build.VERSION.SDK_INT >= 14) && ((localObject instanceof View.OnHoverListener)))
          paramView.setOnHoverListener((View.OnHoverListener)localObject);
      }
      AppMethodBeat.o(30704);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.q
 * JD-Core Version:    0.6.2
 */