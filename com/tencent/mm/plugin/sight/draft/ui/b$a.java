package com.tencent.mm.plugin.sight.draft.ui;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.graphics.Bitmap;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.d;
import com.tencent.mm.modelvideo.j;
import com.tencent.mm.modelvideo.k;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.tools.h;

final class b$a
  implements View.OnClickListener
{
  private b$a(b paramb)
  {
  }

  public final boolean clw()
  {
    boolean bool = true;
    AppMethodBeat.i(24998);
    if (b.c(this.qzH) != null)
    {
      b.c(this.qzH).iqU.setVisibility(8);
      b.c(this.qzH).qzM.setCanPlay(false);
      b.c(this.qzH).qzM.bf(null, false);
      Bitmap localBitmap = b.e(this.qzH).x(b.c(this.qzH).qzO.field_fileName, k.tY(b.c(this.qzH).qzO.field_fileName), true);
      b.c(this.qzH).qzM.setThumbBmp(localBitmap);
      b.c(this.qzH).moR.setBackgroundResource(2130840200);
      h.r(b.c(this.qzH).qzL, 1.0F);
      b.a(this.qzH, null);
      AppMethodBeat.o(24998);
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(24998);
      bool = false;
    }
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(24997);
    if (!(paramView.getTag() instanceof b.e))
      AppMethodBeat.o(24997);
    while (true)
    {
      return;
      paramView = (b.e)paramView.getTag();
      if (paramView.qzO != null)
        break;
      ab.i("MicroMsg.SightDraftContainerAdapter", "click draft, but info null, curType %s", new Object[] { b.b(this.qzH) });
      clw();
      b.a(this.qzH, null);
      AppMethodBeat.o(24997);
    }
    Object localObject1;
    if (b.c(this.qzH) != paramView)
    {
      clw();
      localObject1 = k.tX(paramView.qzO.field_fileName);
      paramView.qzM.setCanPlay(true);
      paramView.qzM.bf((String)localObject1, false);
      paramView.moR.setBackgroundResource(2130840201);
      localObject1 = paramView.qzL;
      if ((localObject1 != null) && (!d.fP(11)))
        break label204;
    }
    while (true)
    {
      b.b(this.qzH, paramView);
      b.a(this.qzH, paramView);
      if (b.d(this.qzH) != null)
        b.d(this.qzH).clu();
      AppMethodBeat.o(24997);
      break;
      label204: Object localObject2 = (Animator)((View)localObject1).getTag(2131820652);
      if (localObject2 != null)
        ((Animator)localObject2).cancel();
      localObject2 = (AnimatorSet)AnimatorInflater.loadAnimator(((View)localObject1).getContext(), 2131099652);
      ((AnimatorSet)localObject2).setTarget(localObject1);
      ((AnimatorSet)localObject2).start();
      ((View)localObject1).setTag(2131820652, localObject2);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sight.draft.ui.b.a
 * JD-Core Version:    0.6.2
 */