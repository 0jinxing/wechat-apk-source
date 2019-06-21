package com.tencent.mm.plugin.webview.model;

import android.content.Context;
import android.graphics.Bitmap;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ah.d;
import com.tencent.mm.ah.d.a;
import com.tencent.mm.ah.o;
import com.tencent.mm.plugin.base.model.b;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.List;

final class at$2
  implements d.a
{
  at$2(String paramString1, Context paramContext, at.a parama, String paramString2, String paramString3)
  {
  }

  public final void qj(String paramString)
  {
    AppMethodBeat.i(6803);
    if (!this.eiH.equals(paramString))
      AppMethodBeat.o(6803);
    while (true)
    {
      return;
      ab.i("MicroMsg.WebviewShrotcutManager", "notifyChanged avatar(%s).", new Object[] { paramString });
      at.XC().remove(this);
      o.acd().b(this);
      paramString = at.bk(this.val$context, this.eiH);
      if ((paramString == null) || (paramString.isRecycled()))
      {
        if (this.unA != null)
        {
          this.unA.hJ(false);
          AppMethodBeat.o(6803);
        }
      }
      else
      {
        paramString = at.a(this.val$context, this.eiH, this.hxh, this.unB, paramString, true);
        if (paramString == null)
        {
          ab.e("MicroMsg.WebviewShrotcutManager", "intent is null");
          if (this.unA != null)
          {
            this.unA.hJ(false);
            AppMethodBeat.o(6803);
          }
        }
        else
        {
          b.r(this.val$context, paramString);
          if (this.unA != null)
            this.unA.hJ(true);
          AppMethodBeat.o(6803);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.model.at.2
 * JD-Core Version:    0.6.2
 */