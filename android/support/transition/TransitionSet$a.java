package android.support.transition;

final class TransitionSet$a extends ad
{
  TransitionSet AA;

  TransitionSet$a(TransitionSet paramTransitionSet)
  {
    this.AA = paramTransitionSet;
  }

  public final void a(Transition paramTransition)
  {
    TransitionSet.b(this.AA);
    if (TransitionSet.c(this.AA) == 0)
    {
      TransitionSet.a(this.AA, false);
      this.AA.end();
    }
    paramTransition.b(this);
  }

  public final void cT()
  {
    if (!TransitionSet.a(this.AA))
    {
      this.AA.start();
      TransitionSet.a(this.AA, true);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     android.support.transition.TransitionSet.a
 * JD-Core Version:    0.6.2
 */