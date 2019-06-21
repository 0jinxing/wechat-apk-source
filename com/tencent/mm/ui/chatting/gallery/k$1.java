package com.tencent.mm.ui.chatting.gallery;

import android.util.Base64;
import android.view.View;
import android.view.animation.AnimationUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelvideo.s;
import com.tencent.mm.plugin.sight.base.d;
import com.tencent.mm.pluginsdk.ui.tools.e;
import com.tencent.mm.pluginsdk.ui.tools.e.a;
import com.tencent.mm.protocal.protobuf.cfh;
import com.tencent.mm.sdk.a.b;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashMap;

final class k$1
  implements e.a
{
  k$1(k paramk)
  {
  }

  public final void EA()
  {
    AppMethodBeat.i(32381);
    this.yXH.yXh.start();
    this.yXH.yXl.post(new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(32379);
        if ((k.1.this.yXH.yXl == null) || (k.1.this.yXH.yXl.getVisibility() == 0))
          AppMethodBeat.o(32379);
        while (true)
        {
          return;
          if ((k.1.this.yXH.yXl.getTag() != null) && ((k.1.this.yXH.yXl.getTag() instanceof s)))
          {
            s locals = (s)k.1.this.yXH.yXl.getTag();
            if ((locals.fXm != null) && (!bo.isNullOrNil(locals.fXm.fiG)))
            {
              k.1.this.yXH.yXl.setVisibility(8);
              AppMethodBeat.o(32379);
            }
            else if ((locals.fXm != null) && (!bo.isNullOrNil(locals.fXm.fiJ)) && (!bo.isNullOrNil(locals.fXm.fiK)))
            {
              k.1.this.yXH.yXl.setVisibility(8);
              AppMethodBeat.o(32379);
            }
          }
          else
          {
            k.1.this.yXH.yXl.setVisibility(0);
            k.1.this.yXH.yXl.startAnimation(AnimationUtils.loadAnimation(k.1.this.yXH.yXl.getContext(), 2131034180));
            AppMethodBeat.o(32379);
          }
        }
      }
    });
    AppMethodBeat.o(32381);
  }

  public final int dG(int paramInt1, int paramInt2)
  {
    return 0;
  }

  public final void dH(int paramInt1, int paramInt2)
  {
  }

  public final void onError(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(32380);
    this.yXH.yXh.stop();
    String str = (String)((View)this.yXH.yXh).getTag();
    b.A(Base64.encodeToString((d.ckW() + "[ImageGallery] on play sight error, what=" + paramInt1 + ", extra=" + paramInt2 + ", path=" + bo.bc(str, "")).getBytes(), 2), "FullScreenPlaySight");
    al.d(new k.1.1(this, str));
    this.yXH.yXf.put(str, Boolean.TRUE);
    AppMethodBeat.o(32380);
  }

  public final void pL()
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.gallery.k.1
 * JD-Core Version:    0.6.2
 */