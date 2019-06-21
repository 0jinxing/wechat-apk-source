package android.support.constraint.a.a;

import android.support.constraint.a.h;
import java.util.ArrayList;

public final class i extends f
{
  protected float jZ = -1.0F;
  protected int ka = -1;
  protected int kb = -1;
  private e kc = this.iw;
  private boolean kd = false;
  private int ke = 0;
  private l kf = new l();
  private int kg = 8;
  private int mOrientation = 0;

  public i()
  {
    this.iE.clear();
    this.iE.add(this.kc);
    int j = this.iD.length;
    while (i < j)
    {
      this.iD[i] = this.kc;
      i++;
    }
  }

  public final void B(int paramInt)
  {
    if (paramInt >= 0)
    {
      this.jZ = -1.0F;
      this.ka = paramInt;
      this.kb = -1;
    }
  }

  public final void C(int paramInt)
  {
    if (paramInt >= 0)
    {
      this.jZ = -1.0F;
      this.ka = -1;
      this.kb = paramInt;
    }
  }

  public final e a(e.c paramc)
  {
    switch (i.1.hF[paramc.ordinal()])
    {
    default:
    case 1:
    case 2:
      do
        throw new AssertionError(paramc.name());
      while (this.mOrientation != 1);
      paramc = this.kc;
    case 3:
    case 4:
    case 5:
    case 6:
    case 7:
    case 8:
    case 9:
    }
    while (true)
    {
      return paramc;
      if (this.mOrientation != 0)
        break;
      paramc = this.kc;
      continue;
      paramc = null;
    }
  }

  public final void a(android.support.constraint.a.e parame)
  {
    int i = 1;
    Object localObject1 = (g)this.iG;
    if (localObject1 == null)
      return;
    e locale = ((g)localObject1).a(e.c.hO);
    Object localObject2 = ((g)localObject1).a(e.c.hQ);
    int j;
    if (this.iG != null)
      if (this.iG.iF[0] == f.a.jr)
      {
        j = 1;
        label58: if (this.mOrientation != 0)
          break label307;
        locale = ((g)localObject1).a(e.c.hP);
        localObject2 = ((g)localObject1).a(e.c.hR);
        if (this.iG == null)
          break label182;
        if (this.iG.iF[1] != f.a.jr)
          break label176;
        j = i;
      }
    label176: label307: 
    while (true)
    {
      if (this.ka != -1)
      {
        localObject1 = parame.g(this.kc);
        parame.c((h)localObject1, parame.g(locale), this.ka, 6);
        if (j == 0)
          break;
        parame.a(parame.g(localObject2), (h)localObject1, 0, 5);
        break;
        j = 0;
        break label58;
        j = 0;
        break label58;
        j = 0;
        continue;
        label182: j = 0;
        continue;
      }
      if (this.kb != -1)
      {
        localObject1 = parame.g(this.kc);
        localObject2 = parame.g(localObject2);
        parame.c((h)localObject1, (h)localObject2, -this.kb, 6);
        if (j == 0)
          break;
        parame.a((h)localObject1, parame.g(locale), 0, 5);
        parame.a((h)localObject2, (h)localObject1, 0, 5);
        break;
      }
      if (this.jZ == -1.0F)
        break;
      parame.b(android.support.constraint.a.e.a(parame, parame.g(this.kc), parame.g(locale), parame.g(localObject2), this.jZ, this.kd));
      break;
    }
  }

  public final boolean aC()
  {
    return true;
  }

  public final ArrayList<e> aT()
  {
    return this.iE;
  }

  public final void aY()
  {
    if (this.iG == null);
    while (true)
    {
      return;
      int i = android.support.constraint.a.e.h(this.kc);
      if (this.mOrientation == 1)
      {
        setX(i);
        setY(0);
        setHeight(this.iG.getHeight());
        setWidth(0);
      }
      else
      {
        setX(0);
        setY(i);
        setWidth(this.iG.getWidth());
        setHeight(0);
      }
    }
  }

  public final void g(float paramFloat)
  {
    if (paramFloat > -1.0F)
    {
      this.jZ = paramFloat;
      this.ka = -1;
      this.kb = -1;
    }
  }

  public final void setOrientation(int paramInt)
  {
    if (this.mOrientation == paramInt)
      return;
    this.mOrientation = paramInt;
    this.iE.clear();
    if (this.mOrientation == 1);
    for (this.kc = this.iu; ; this.kc = this.iw)
    {
      this.iE.add(this.kc);
      int i = this.iD.length;
      for (paramInt = 0; paramInt < i; paramInt++)
        this.iD[paramInt] = this.kc;
      break;
    }
  }

  public final void u(int paramInt)
  {
    f localf = this.iG;
    if (localf == null);
    while (true)
    {
      return;
      if (this.mOrientation == 1)
      {
        this.iw.hv.a(localf.iw.hv, 0);
        this.iy.hv.a(localf.iw.hv, 0);
        if (this.ka != -1)
        {
          this.iu.hv.a(localf.iu.hv, this.ka);
          this.ix.hv.a(localf.iu.hv, this.ka);
        }
        else if (this.kb != -1)
        {
          this.iu.hv.a(localf.ix.hv, -this.kb);
          this.ix.hv.a(localf.ix.hv, -this.kb);
        }
        else if ((this.jZ != -1.0F) && (localf.aW() == f.a.jq))
        {
          paramInt = (int)(localf.mWidth * this.jZ);
          this.iu.hv.a(localf.iu.hv, paramInt);
          this.ix.hv.a(localf.iu.hv, paramInt);
        }
      }
      else
      {
        this.iu.hv.a(localf.iu.hv, 0);
        this.ix.hv.a(localf.iu.hv, 0);
        if (this.ka != -1)
        {
          this.iw.hv.a(localf.iw.hv, this.ka);
          this.iy.hv.a(localf.iw.hv, this.ka);
        }
        else if (this.kb != -1)
        {
          this.iw.hv.a(localf.iy.hv, -this.kb);
          this.iy.hv.a(localf.iy.hv, -this.kb);
        }
        else if ((this.jZ != -1.0F) && (localf.aX() == f.a.jq))
        {
          paramInt = (int)(localf.mHeight * this.jZ);
          this.iw.hv.a(localf.iw.hv, paramInt);
          this.iy.hv.a(localf.iw.hv, paramInt);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     android.support.constraint.a.a.i
 * JD-Core Version:    0.6.2
 */