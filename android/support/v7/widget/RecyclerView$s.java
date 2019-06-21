package android.support.v7.widget;

import android.util.SparseArray;

public final class RecyclerView$s
{
  int apA;
  long apB;
  int apC;
  int apD;
  int apE;
  int ape = -1;
  private SparseArray<Object> apo;
  int apq = 0;
  int apr = 0;
  int aps = 1;
  int apt = 0;
  boolean apu = false;
  public boolean apv = false;
  boolean apw = false;
  boolean apx = false;
  boolean apy = false;
  boolean apz = false;

  final void cw(int paramInt)
  {
    if ((this.aps & paramInt) == 0)
      throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(paramInt) + " but it is " + Integer.toBinaryString(this.aps));
  }

  public final int getItemCount()
  {
    if (this.apv);
    for (int i = this.apq - this.apr; ; i = this.apt)
      return i;
  }

  public final String toString()
  {
    return "State{mTargetPosition=" + this.ape + ", mData=" + this.apo + ", mItemCount=" + this.apt + ", mIsMeasuring=" + this.apx + ", mPreviousLayoutItemCount=" + this.apq + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.apr + ", mStructureChanged=" + this.apu + ", mInPreLayout=" + this.apv + ", mRunSimpleAnimations=" + this.apy + ", mRunPredictiveAnimations=" + this.apz + '}';
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.RecyclerView.s
 * JD-Core Version:    0.6.2
 */