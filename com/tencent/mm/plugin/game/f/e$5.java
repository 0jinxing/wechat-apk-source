package com.tencent.mm.plugin.game.f;

import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.f;
import com.tencent.mm.plugin.s.a;
import com.tencent.mm.pluginsdk.model.app.g;
import com.tencent.mm.pluginsdk.model.app.i;
import com.tencent.mm.sdk.e.k.a;
import com.tencent.mm.sdk.e.m;
import java.lang.ref.WeakReference;

final class e$5
  implements k.a
{
  e$5(e parame, String paramString, float paramFloat, WeakReference paramWeakReference)
  {
  }

  public final void a(String paramString, m paramm)
  {
    AppMethodBeat.i(112333);
    if (this.val$appId.equals(paramString))
    {
      paramString = g.b(this.val$appId, 1, this.hsC);
      if (paramString != null)
      {
        if ((this.nnO != null) && (this.nnO.get() != null))
          ((ImageView)this.nnO.get()).setImageBitmap(paramString);
        e.a(this.nnF).put(this.val$appId, paramString);
        a.bYJ().d(this);
      }
    }
    AppMethodBeat.o(112333);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.f.e.5
 * JD-Core Version:    0.6.2
 */