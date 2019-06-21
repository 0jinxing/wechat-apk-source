package com.tencent.mm.ui.tools;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.cl;
import com.tencent.mm.pluginsdk.model.e;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.h.d;

final class ShowImageUI$2$1
  implements h.d
{
  ShowImageUI$2$1(ShowImageUI.2 param2)
  {
  }

  public final void bV(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(34992);
    switch (paramInt2)
    {
    default:
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      AppMethodBeat.o(34992);
      while (true)
      {
        return;
        ShowImageUI.b(this.zHI.zHH);
        AppMethodBeat.o(34992);
        continue;
        ShowImageUI localShowImageUI = this.zHI.zHH;
        cl localcl = new cl();
        long l = localShowImageUI.getIntent().getLongExtra("key_message_id", -1L);
        if (-1L == l)
        {
          ab.w("MicroMsg.ShowImageUI", "msg id error, try fav simple data");
          e.a(localcl, localShowImageUI.getIntent().getIntExtra("key_favorite_source_type", 1), localShowImageUI.getIntent().getStringExtra("key_image_path"));
        }
        while (true)
        {
          localcl.cvA.activity = localShowImageUI;
          a.xxA.m(localcl);
          AppMethodBeat.o(34992);
          break;
          e.a(localcl, l);
        }
        ShowImageUI.c(this.zHI.zHH);
        AppMethodBeat.o(34992);
      }
      ShowImageUI.d(this.zHI.zHH);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.ShowImageUI.2.1
 * JD-Core Version:    0.6.2
 */