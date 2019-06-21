package com.tencent.mm.pluginsdk.ui.chat;

import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.ui.ae;
import com.tencent.mm.ui.base.o;

final class i$2 extends ak
{
  i$2(i parami, Looper paramLooper)
  {
    super(paramLooper);
  }

  public final void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(27956);
    paramMessage = this.vox;
    if ((paramMessage.cDh == null) || (paramMessage.vos == null) || (paramMessage.bitmap == null) || (paramMessage.vot == null) || (paramMessage.jWH == null) || (paramMessage.nOh == null))
    {
      AppMethodBeat.o(27956);
      return;
    }
    paramMessage.cDh.setImageBitmap(paramMessage.bitmap);
    int i;
    label81: int j;
    label90: int k;
    label108: int m;
    int n;
    Rect localRect;
    if (paramMessage.vou)
    {
      i = 83;
      if (!paramMessage.vou)
        break label239;
      j = 0;
      if (paramMessage.vov == null)
        break label245;
      k = paramMessage.vov.getYFromBottom();
      m = j;
      n = k;
      if (Build.VERSION.SDK_INT >= 21)
      {
        localRect = ae.dze();
        if (!paramMessage.vou)
          break label257;
        j = 0;
      }
    }
    while (true)
    {
      n = k + localRect.bottom;
      ab.i("MicroMsg.RecentImageBubble", "recent bubble navbar height %s %s", new Object[] { Integer.valueOf(localRect.right), Integer.valueOf(localRect.bottom) });
      m = j;
      paramMessage.vot.showAtLocation(paramMessage.jWH, i, m, n);
      new ap(new i.4(paramMessage), false).ae(10000L, 10000L);
      AppMethodBeat.o(27956);
      break;
      i = 85;
      break label81;
      label239: j = 10;
      break label90;
      label245: k = paramMessage.nOh.getHeight();
      break label108;
      label257: j += localRect.right;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.chat.i.2
 * JD-Core Version:    0.6.2
 */