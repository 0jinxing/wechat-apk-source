package com.tencent.mm.plugin.extqlauncher;

import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.Message;
import com.jg.JgMethodChecked;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.aw;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ak;

final class b$3 extends ak
{
  b$3(b paramb, Looper paramLooper)
  {
    super(paramLooper);
  }

  @JgMethodChecked(author=20, fComment="checked", lastDate="20140429", reviewer=20, vComment={com.jg.EType.INTENTCHECK})
  public final void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(20476);
    if ((ah.getContext() == null) || (!aw.RK()))
    {
      ab.w("MicroMsg.SubCoreExtQLauncher", "wrong status");
      AppMethodBeat.o(20476);
    }
    while (true)
    {
      return;
      if (b.a(this.lRT))
      {
        int i = b.bsb();
        if ((i > 0) || (i < this.lRT.lRR))
        {
          ab.d("MicroMsg.SubCoreExtQLauncher", "notify unread");
          paramMessage = new Intent("com.tencent.mm.ext.ACTION_EXT_NOTIFY");
          paramMessage.putExtra("EXTRA_EXT_NOTIFY_TYPE", "NEW_UNREAD");
          ah.getContext().sendBroadcast(paramMessage);
          this.lRT.lRR = i;
        }
      }
      AppMethodBeat.o(20476);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.extqlauncher.b.3
 * JD-Core Version:    0.6.2
 */