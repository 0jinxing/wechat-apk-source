package android.support.constraint.a.a;

import android.support.constraint.a.h;
import android.support.constraint.a.h.a;

public final class e
{
  int hA = -1;
  e.b hB = e.b.hJ;
  private e.a hC = e.a.hG;
  int hD = 0;
  public h hE;
  public m hv = new m(this);
  final f hw;
  final e.c hx;
  public e hy;
  public int hz = 0;

  public e(f paramf, e.c paramc)
  {
    this.hw = paramf;
    this.hx = paramc;
  }

  private boolean a(e parame)
  {
    boolean bool1 = false;
    boolean bool2;
    if (parame == null)
      bool2 = bool1;
    label294: 
    while (true)
    {
      return bool2;
      e.c localc = parame.hx;
      if (localc == this.hx)
      {
        if (this.hx == e.c.hS)
        {
          bool2 = bool1;
          if (parame.hw.aS())
          {
            bool2 = bool1;
            if (!this.hw.aS());
          }
        }
        else
        {
          bool2 = true;
        }
      }
      else
      {
        bool2 = bool1;
        boolean bool3;
        switch (e.1.hF[this.hx.ordinal()])
        {
        case 6:
        case 7:
        case 8:
        case 9:
        default:
          throw new AssertionError(this.hx.name());
        case 1:
          bool2 = bool1;
          if (localc != e.c.hS)
          {
            bool2 = bool1;
            if (localc != e.c.hU)
            {
              bool2 = bool1;
              if (localc != e.c.hV)
                bool2 = true;
            }
          }
          break;
        case 2:
        case 3:
          if ((localc == e.c.hO) || (localc == e.c.hQ));
          for (bool3 = true; ; bool3 = false)
          {
            bool2 = bool3;
            if (!(parame.hw instanceof i))
              break label294;
            if (!bool3)
            {
              bool2 = bool1;
              if (localc != e.c.hU)
                break;
            }
            bool2 = true;
            break;
          }
        case 4:
        case 5:
          if ((localc == e.c.hP) || (localc == e.c.hR));
          for (bool3 = true; ; bool3 = false)
          {
            bool2 = bool3;
            if (!(parame.hw instanceof i))
              break label294;
            if (!bool3)
            {
              bool2 = bool1;
              if (localc != e.c.hV)
                break;
            }
            bool2 = true;
            break;
          }
        }
      }
    }
  }

  public final boolean a(e parame, int paramInt1, int paramInt2, e.b paramb, int paramInt3, boolean paramBoolean)
  {
    boolean bool = true;
    if (parame == null)
    {
      this.hy = null;
      this.hz = 0;
      this.hA = -1;
      this.hB = e.b.hJ;
      this.hD = 2;
    }
    for (paramBoolean = bool; ; paramBoolean = false)
    {
      return paramBoolean;
      if ((paramBoolean) || (a(parame)))
        break;
    }
    this.hy = parame;
    if (paramInt1 > 0);
    for (this.hz = paramInt1; ; this.hz = 0)
    {
      this.hA = paramInt2;
      this.hB = paramb;
      this.hD = paramInt3;
      paramBoolean = bool;
      break;
    }
  }

  public final void aG()
  {
    if (this.hE == null)
      this.hE = new h(h.a.gW);
    while (true)
    {
      return;
      this.hE.reset();
    }
  }

  public final int aH()
  {
    int i;
    if (this.hw.iZ == 8)
      i = 0;
    while (true)
    {
      return i;
      if ((this.hA >= 0) && (this.hy != null) && (this.hy.hw.iZ == 8))
        i = this.hA;
      else
        i = this.hz;
    }
  }

  public final boolean isConnected()
  {
    if (this.hy != null);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final void reset()
  {
    this.hy = null;
    this.hz = 0;
    this.hA = -1;
    this.hB = e.b.hK;
    this.hD = 0;
    this.hC = e.a.hG;
    this.hv.reset();
  }

  public final String toString()
  {
    return this.hw.ja + ":" + this.hx.toString();
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     android.support.constraint.a.a.e
 * JD-Core Version:    0.6.2
 */