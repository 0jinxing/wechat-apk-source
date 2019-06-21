package com.tencent.mm.plugin.game.ui;

import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.s.a;
import com.tencent.mm.pluginsdk.model.app.g;
import com.tencent.mm.pluginsdk.model.app.i;
import com.tencent.mm.sdk.e.k.a;
import com.tencent.mm.sdk.e.m;

final class j$a$1
  implements k.a
{
  j$a$1(String paramString, float paramFloat, ImageView paramImageView)
  {
  }

  public final void a(String paramString, m paramm)
  {
    AppMethodBeat.i(111906);
    if (this.val$appId.equals(paramString))
    {
      paramString = g.b(this.val$appId, 1, this.hsC);
      if (paramString != null)
      {
        this.lvs.setImageBitmap(paramString);
        a.bYJ().d(this);
      }
    }
    AppMethodBeat.o(111906);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.ui.j.a.1
 * JD-Core Version:    0.6.2
 */