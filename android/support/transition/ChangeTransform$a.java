package android.support.transition;

import android.view.View;

final class ChangeTransform$a extends ad
{
  private View mView;
  private j yg;

  ChangeTransform$a(View paramView, j paramj)
  {
    this.mView = paramView;
    this.yg = paramj;
  }

  public final void a(Transition paramTransition)
  {
    paramTransition.b(this);
    k.A(this.mView);
    this.mView.setTag(2131820684, null);
    this.mView.setTag(2131820647, null);
  }

  public final void cO()
  {
    this.yg.setVisibility(4);
  }

  public final void cP()
  {
    this.yg.setVisibility(0);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     android.support.transition.ChangeTransform.a
 * JD-Core Version:    0.6.2
 */