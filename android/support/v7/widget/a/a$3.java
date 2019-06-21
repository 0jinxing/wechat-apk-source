package android.support.v7.widget.a;

import android.animation.Animator;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.v;
import java.util.List;

final class a$3 extends a.c
{
  a$3(a parama, RecyclerView.v paramv1, int paramInt1, int paramInt2, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, int paramInt3, RecyclerView.v paramv2)
  {
    super(paramv1, paramInt1, paramInt2, paramFloat1, paramFloat2, 0.0F, 0.0F);
  }

  public final void onAnimationEnd(Animator paramAnimator)
  {
    super.onAnimationEnd(paramAnimator);
    if (this.avZ);
    label136: 
    while (true)
    {
      return;
      if (this.avI <= 0)
        this.avH.avu.a(this.avH.aiB, this.avJ);
      while (true)
      {
        if (this.avH.avB != this.avJ.apJ)
          break label136;
        this.avH.bY(this.avJ.apJ);
        break;
        this.avH.avj.add(this.avJ.apJ);
        this.avW = true;
        if (this.avI > 0)
        {
          paramAnimator = this.avH;
          int i = this.avI;
          paramAnimator.aiB.post(new a.4(paramAnimator, this, i));
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.a.a.3
 * JD-Core Version:    0.6.2
 */