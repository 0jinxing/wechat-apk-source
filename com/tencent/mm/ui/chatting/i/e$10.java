package com.tencent.mm.ui.chatting.i;

import android.content.Context;
import android.content.res.Resources;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.chatting.a.b;
import com.tencent.mm.ui.chatting.a.b.b;
import com.tencent.mm.ui.chatting.a.b.c;
import com.tencent.mm.ui.chatting.e.a.b;
import com.tencent.mm.ui.chatting.gallery.h;
import com.tencent.mm.ui.chatting.gallery.h.a;
import java.util.ArrayList;

final class e$10
  implements b.b
{
  e$10(e parame)
  {
  }

  public final void a(boolean paramBoolean, b.c paramc, int paramInt)
  {
    AppMethodBeat.i(32570);
    ab.i("MicroMsg.MediaHistoryGalleryPresenter", "[onCheck] isChecked :%s pos:%s", new Object[] { Boolean.valueOf(paramBoolean), Integer.valueOf(paramInt) });
    if ((paramBoolean) && (h.a.dFX().mnX.size() >= 9))
    {
      Toast.makeText(e.b(this.yZo), e.b(this.yZo).getResources().getString(2131300199, new Object[] { Integer.valueOf(9) }), 1).show();
      this.yZo.yZl.cg(paramInt);
      AppMethodBeat.o(32570);
      return;
    }
    if (paramBoolean)
      h.a.dFX().bC(paramc.cKd);
    while (true)
    {
      e.c(this.yZo).vF(h.a.dFX().mnX.size());
      AppMethodBeat.o(32570);
      break;
      h.a.dFX().bD(paramc.cKd);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.i.e.10
 * JD-Core Version:    0.6.2
 */