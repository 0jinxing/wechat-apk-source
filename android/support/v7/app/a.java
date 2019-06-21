package android.support.v7.app;

import android.support.v4.widget.DrawerLayout.c;
import android.support.v7.d.a.b;

public final class a
  implements DrawerLayout.c
{
  private final a Tb;
  private b Tc;
  private boolean Td;
  boolean Te;
  private final int Tf;
  private final int Tg;

  private void bc(int paramInt)
  {
    this.Tb.bc(paramInt);
  }

  private void setPosition(float paramFloat)
  {
    if (paramFloat == 1.0F)
      this.Tc.T(true);
    while (true)
    {
      this.Tc.setProgress(paramFloat);
      return;
      if (paramFloat == 0.0F)
        this.Tc.T(false);
    }
  }

  public final void E(float paramFloat)
  {
    if (this.Td)
      setPosition(Math.min(1.0F, Math.max(0.0F, paramFloat)));
    while (true)
    {
      return;
      setPosition(0.0F);
    }
  }

  public final void eH()
  {
    setPosition(1.0F);
    if (this.Te)
      bc(this.Tg);
  }

  public final void eI()
  {
    setPosition(0.0F);
    if (this.Te)
      bc(this.Tf);
  }

  public static abstract interface a
  {
    public abstract void bc(int paramInt);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v7.app.a
 * JD-Core Version:    0.6.2
 */