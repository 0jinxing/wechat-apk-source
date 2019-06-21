package com.tencent.mm.plugin.gallery.ui;

import android.graphics.Canvas;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.v;
import android.support.v7.widget.a.a.a;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class f$1 extends a.a
{
  int cPK = -1;

  f$1(f paramf)
  {
  }

  public final void a(Canvas paramCanvas, RecyclerView paramRecyclerView, RecyclerView.v paramv, float paramFloat1, float paramFloat2, int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(21575);
    super.a(paramCanvas, paramRecyclerView, paramv, paramFloat1 / 1.3F, paramFloat2 / 1.3F, paramInt, paramBoolean);
    AppMethodBeat.o(21575);
  }

  public final void a(RecyclerView paramRecyclerView, RecyclerView.v paramv)
  {
    AppMethodBeat.i(21574);
    if (paramv != null)
    {
      super.a(paramRecyclerView, paramv);
      paramRecyclerView = AnimationUtils.loadAnimation(f.b(this.mRM), 2131034202);
      paramRecyclerView.setAnimationListener(new f.1.2(this));
      ((f.a)paramv).mRR.startAnimation(paramRecyclerView);
    }
    AppMethodBeat.o(21574);
  }

  public final boolean a(RecyclerView.v paramv1, RecyclerView.v paramv2)
  {
    AppMethodBeat.i(21572);
    int i = paramv1.kj();
    int j = paramv2.kj();
    this.mRM.as(i, j);
    if (f.a(this.mRM) != null)
      f.a(this.mRM).ek(i, j);
    f.a(this.mRM, j);
    AppMethodBeat.o(21572);
    return false;
  }

  public final void f(RecyclerView.v paramv, int paramInt)
  {
    AppMethodBeat.i(21573);
    super.f(paramv, paramInt);
    if (paramv != null)
    {
      Animation localAnimation = AnimationUtils.loadAnimation(f.b(this.mRM), 2131034203);
      localAnimation.setAnimationListener(new f.1.1(this, paramInt, paramv));
      ((f.a)paramv).mRR.startAnimation(localAnimation);
    }
    AppMethodBeat.o(21573);
  }

  public final boolean lB()
  {
    return false;
  }

  public final float lC()
  {
    return 0.295858F;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.gallery.ui.f.1
 * JD-Core Version:    0.6.2
 */