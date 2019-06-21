package android.support.v7.widget;

final class aw$1 extends RecyclerView.m
{
  boolean arP = false;

  aw$1(aw paramaw)
  {
  }

  public final void a(RecyclerView paramRecyclerView, int paramInt1, int paramInt2)
  {
    if ((paramInt1 != 0) || (paramInt2 != 0))
      this.arP = true;
  }

  public final void c(RecyclerView paramRecyclerView, int paramInt)
  {
    super.c(paramRecyclerView, paramInt);
    if ((paramInt == 0) && (this.arP))
    {
      this.arP = false;
      this.arQ.kR();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.aw.1
 * JD-Core Version:    0.6.2
 */