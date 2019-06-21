package android.support.constraint.a.a;

import android.support.constraint.a.h;

public final class m extends o
{
  float gQ;
  e kj;
  m kk;
  m kl;
  public float km;
  private m kn;
  private float ko;
  private n kp = null;
  private int kq = 1;
  private n kr = null;
  private int ks = 1;
  float offset;
  int type = 0;

  public m(e parame)
  {
    this.kj = parame;
  }

  private static String D(int paramInt)
  {
    String str;
    if (paramInt == 1)
      str = "DIRECT";
    while (true)
    {
      return str;
      if (paramInt == 2)
        str = "CENTER";
      else if (paramInt == 3)
        str = "MATCH";
      else if (paramInt == 4)
        str = "CHAIN";
      else if (paramInt == 5)
        str = "BARRIER";
      else
        str = "UNCONNECTED";
    }
  }

  public final void a(m paramm, float paramFloat)
  {
    if ((this.state == 0) || ((this.kl != paramm) && (this.km != paramFloat)))
    {
      this.kl = paramm;
      this.km = paramFloat;
      if (this.state == 1)
        invalidate();
      bf();
    }
  }

  public final void a(m paramm, int paramInt)
  {
    this.type = 1;
    this.kk = paramm;
    this.offset = paramInt;
    this.kk.a(this);
  }

  public final void a(m paramm, int paramInt, n paramn)
  {
    this.kk = paramm;
    this.kk.a(this);
    this.kp = paramn;
    this.kq = paramInt;
    this.kp.a(this);
  }

  public final void aE()
  {
    if (this.state == 1);
    while (true)
    {
      return;
      if (this.type != 4)
        if (this.kp != null)
        {
          if (this.kp.state == 1)
            this.offset = (this.kq * this.kp.value);
        }
        else if (this.kr != null)
        {
          if (this.kr.state == 1)
            this.ko = (this.ks * this.kr.value);
        }
        else
        {
          if ((this.type == 1) && ((this.kk == null) || (this.kk.state == 1)))
          {
            if (this.kk == null)
              this.kl = this;
            for (this.km = this.offset; ; this.km = (this.kk.km + this.offset))
            {
              bf();
              break;
              this.kl = this.kk.kl;
            }
          }
          Object localObject;
          if ((this.type == 2) && (this.kk != null) && (this.kk.state == 1) && (this.kn != null) && (this.kn.kk != null) && (this.kn.kk.state == 1))
          {
            if (android.support.constraint.a.e.au() != null)
            {
              localObject = android.support.constraint.a.e.au();
              ((android.support.constraint.a.f)localObject).gz += 1L;
            }
            this.kl = this.kk.kl;
            this.kn.kl = this.kn.kk.kl;
            int i;
            label303: float f1;
            label326: float f2;
            label378: int j;
            int k;
            if ((this.kj.hx == e.c.hQ) || (this.kj.hx == e.c.hR))
            {
              i = 1;
              if (i == 0)
                break label517;
              f1 = this.kk.km - this.kn.kk.km;
              if ((this.kj.hx != e.c.hO) && (this.kj.hx != e.c.hQ))
                break label539;
              f2 = f1 - this.kj.hw.getWidth();
              f1 = this.kj.hw.iV;
              j = this.kj.aH();
              k = this.kn.kj.aH();
              if (this.kj.hy == this.kn.kj.hy)
              {
                f1 = 0.5F;
                k = 0;
                j = 0;
              }
              f2 = f2 - j - k;
              if (i == 0)
                break label568;
              localObject = this.kn;
              float f3 = this.kn.kk.km;
              ((m)localObject).km = (k + f3 + f2 * f1);
            }
            for (this.km = (this.kk.km - j - (1.0F - f1) * f2); ; this.kn.km = (this.kn.kk.km - k - (1.0F - f1) * f2))
            {
              bf();
              this.kn.bf();
              break;
              i = 0;
              break label303;
              label517: f1 = this.kn.kk.km - this.kk.km;
              break label326;
              label539: f2 = f1 - this.kj.hw.getHeight();
              f1 = this.kj.hw.iW;
              break label378;
              label568: this.km = (this.kk.km + j + f2 * f1);
            }
          }
          if ((this.type == 3) && (this.kk != null) && (this.kk.state == 1) && (this.kn != null) && (this.kn.kk != null) && (this.kn.kk.state == 1))
          {
            if (android.support.constraint.a.e.au() != null)
            {
              localObject = android.support.constraint.a.e.au();
              ((android.support.constraint.a.f)localObject).gA += 1L;
            }
            this.kl = this.kk.kl;
            this.kn.kl = this.kn.kk.kl;
            this.km = (this.kk.km + this.offset);
            this.kn.km = (this.kn.kk.km + this.kn.offset);
            bf();
            this.kn.bf();
          }
          else if (this.type == 5)
          {
            this.kj.hw.aE();
          }
        }
    }
  }

  public final void b(m paramm, float paramFloat)
  {
    this.kn = paramm;
    this.ko = paramFloat;
  }

  public final void b(m paramm, int paramInt)
  {
    this.kk = paramm;
    this.offset = paramInt;
    this.kk.a(this);
  }

  public final void b(m paramm, int paramInt, n paramn)
  {
    this.kn = paramm;
    this.kr = paramn;
    this.ks = paramInt;
  }

  final void c(android.support.constraint.a.e parame)
  {
    h localh = this.kj.hE;
    if (this.kl == null)
      parame.a(localh, (int)(this.km + 0.5F));
    while (true)
    {
      return;
      parame.c(localh, parame.g(this.kl.kj), (int)(this.km + 0.5F), 6);
    }
  }

  public final void reset()
  {
    super.reset();
    this.kk = null;
    this.offset = 0.0F;
    this.kp = null;
    this.kq = 1;
    this.kr = null;
    this.ks = 1;
    this.kl = null;
    this.km = 0.0F;
    this.gQ = 0.0F;
    this.kn = null;
    this.ko = 0.0F;
    this.type = 0;
  }

  public final String toString()
  {
    String str;
    if (this.state == 1)
      if (this.kl == this)
        str = "[" + this.kj + ", RESOLVED: " + this.km + "]  type: " + D(this.type);
    while (true)
    {
      return str;
      str = "[" + this.kj + ", RESOLVED: " + this.kl + ":" + this.km + "] type: " + D(this.type);
      continue;
      str = "{ " + this.kj + " UNRESOLVED} type: " + D(this.type);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     android.support.constraint.a.a.m
 * JD-Core Version:    0.6.2
 */