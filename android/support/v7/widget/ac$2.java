package android.support.v7.widget;

final class ac$2 extends RecyclerView.m
{
  ac$2(ac paramac)
  {
  }

  public final void a(RecyclerView paramRecyclerView, int paramInt1, int paramInt2)
  {
    ac localac = this.aiJ;
    int i = paramRecyclerView.computeHorizontalScrollOffset();
    int j = paramRecyclerView.computeVerticalScrollOffset();
    int k = localac.aiB.computeVerticalScrollRange();
    paramInt1 = localac.aiA;
    boolean bool;
    int m;
    if ((k - paramInt1 > 0) && (localac.aiA >= localac.aik))
    {
      bool = true;
      localac.aiC = bool;
      m = localac.aiB.computeHorizontalScrollRange();
      paramInt2 = localac.aiz;
      if ((m - paramInt2 <= 0) || (localac.aiz < localac.aik))
        break label147;
      bool = true;
      label103: localac.aiD = bool;
      if ((localac.aiC) || (localac.aiD))
        break label153;
      if (localac.mState != 0)
        localac.setState(0);
    }
    while (true)
    {
      return;
      bool = false;
      break;
      label147: bool = false;
      break label103;
      label153: if (localac.aiC)
      {
        localac.aiu = ((int)((j + paramInt1 / 2.0F) * paramInt1 / k));
        localac.ait = Math.min(paramInt1, paramInt1 * paramInt1 / k);
      }
      if (localac.aiD)
      {
        localac.aix = ((int)((i + paramInt2 / 2.0F) * paramInt2 / m));
        localac.aiw = Math.min(paramInt2, paramInt2 * paramInt2 / m);
      }
      if ((localac.mState == 0) || (localac.mState == 1))
        localac.setState(1);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.ac.2
 * JD-Core Version:    0.6.2
 */