package android.support.constraint.a.a;

public final class n extends o
{
  float value = 0.0F;

  public final void E(int paramInt)
  {
    if ((this.state == 0) || (this.value != paramInt))
    {
      this.value = paramInt;
      if (this.state == 1)
        invalidate();
      bf();
    }
  }

  public final void reset()
  {
    super.reset();
    this.value = 0.0F;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     android.support.constraint.a.a.n
 * JD-Core Version:    0.6.2
 */