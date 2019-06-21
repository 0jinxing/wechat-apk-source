package android.support.v7.widget;

import android.view.View;
import android.view.animation.Interpolator;

public abstract class RecyclerView$r
{
  RecyclerView aiB;
  RecyclerView.i amP;
  public int ape = -1;
  boolean apf;
  boolean apg;
  View aph;
  private final a api = new a();

  protected abstract void a(int paramInt1, int paramInt2, a parama);

  protected abstract void a(View paramView, a parama);

  protected final void bL(View paramView)
  {
    if (RecyclerView.bp(paramView) == this.ape)
      this.aph = paramView;
  }

  public final void cv(int paramInt)
  {
    this.ape = paramInt;
  }

  protected abstract void onStop();

  protected final void stop()
  {
    if (!this.apg);
    while (true)
    {
      return;
      this.apg = false;
      onStop();
      this.aiB.anY.ape = -1;
      this.aph = null;
      this.ape = -1;
      this.apf = false;
      RecyclerView.i.a(this.amP, this);
      this.amP = null;
      this.aiB = null;
    }
  }

  public static final class a
  {
    private int apj = 0;
    private int apk = 0;
    int apl = -1;
    private boolean apm = false;
    private int apn = 0;
    private int mDuration = -2147483648;
    private Interpolator mInterpolator = null;

    public a()
    {
      this((byte)0);
    }

    private a(byte paramByte)
    {
    }

    private void validate()
    {
      if ((this.mInterpolator != null) && (this.mDuration <= 0))
        throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
      if (this.mDuration <= 0)
        throw new IllegalStateException("Scroll duration must be a positive number");
    }

    public final void a(int paramInt1, int paramInt2, int paramInt3, Interpolator paramInterpolator)
    {
      this.apj = paramInt1;
      this.apk = paramInt2;
      this.mDuration = paramInt3;
      this.mInterpolator = paramInterpolator;
      this.apm = true;
    }

    final void h(RecyclerView paramRecyclerView)
    {
      if (this.apl >= 0)
      {
        int i = this.apl;
        this.apl = -1;
        paramRecyclerView.cd(i);
        this.apm = false;
      }
      while (true)
      {
        return;
        if (this.apm)
        {
          validate();
          if (this.mInterpolator == null)
            if (this.mDuration == -2147483648)
              paramRecyclerView.anV.aG(this.apj, this.apk);
          while (true)
          {
            this.apn += 1;
            this.apm = false;
            break;
            paramRecyclerView.anV.n(this.apj, this.apk, this.mDuration);
            continue;
            paramRecyclerView.anV.b(this.apj, this.apk, this.mDuration, this.mInterpolator);
          }
        }
        this.apn = 0;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.RecyclerView.r
 * JD-Core Version:    0.6.2
 */