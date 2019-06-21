package com.tencent.mm.ui.chatting.view;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.f.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.widget.picker.OptionPicker;
import java.util.ArrayList;

final class b$3
  implements View.OnClickListener
{
  b$3(b paramb)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(32778);
    b localb;
    long l;
    int i;
    int j;
    if (this.zba.zaY != null)
    {
      paramView = this.zba.zaY;
      localb = this.zba;
      l = System.currentTimeMillis();
      i = localb.zaU.getValue();
      j = localb.zaV.getValue();
      if (i != 0)
        break label144;
      if (!com.tencent.mm.sdk.a.b.dnO())
        break label129;
      l += 360000L;
    }
    while (true)
    {
      ab.i("MicroMsg.MMRemindDatePicker", "[getTimestamp] date:%s", new Object[] { h.formatTime(localb.mContext.getString(2131299953) + "HH:mm", l / 1000L) });
      paramView.ne(l);
      AppMethodBeat.o(32778);
      return;
      label129: l += (j + 1) * 3600000L;
      continue;
      label144: l = ((Long)localb.zaZ.get(i)).longValue() + (j + 1) * 3600000L;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.view.b.3
 * JD-Core Version:    0.6.2
 */