package android.support.constraint.a.a;

import android.support.constraint.a.a;
import android.support.constraint.a.h;
import java.util.ArrayList;

public final class b extends j
{
  public int hc = 0;
  private ArrayList<m> hd = new ArrayList(4);
  public boolean he = true;

  public final void a(android.support.constraint.a.e parame)
  {
    this.iD[0] = this.iu;
    this.iD[2] = this.iw;
    this.iD[1] = this.ix;
    this.iD[3] = this.iy;
    for (int i = 0; i < this.iD.length; i++)
      this.iD[i].hE = parame.g(this.iD[i]);
    e locale;
    Object localObject1;
    if ((this.hc >= 0) && (this.hc < 4))
    {
      locale = this.iD[this.hc];
      i = 0;
      if (i >= this.hn)
        break label716;
      localObject1 = this.kh[i];
      if ((this.he) || (((f)localObject1).aC()))
        if (((this.hc == 0) || (this.hc == 1)) && (((f)localObject1).aW() == f.a.js))
          i = 1;
    }
    while (true)
    {
      label162: label192: int j;
      label195: Object localObject2;
      h localh1;
      h localh2;
      if ((this.hc == 0) || (this.hc == 1))
      {
        if (this.iG.aW() == f.a.jr)
          i = 0;
        j = 0;
        if (j >= this.hn)
          break label475;
        localObject2 = this.kh[j];
        if ((this.he) || (((f)localObject2).aC()))
        {
          localObject1 = parame.g(localObject2.iD[this.hc]);
          localObject2.iD[this.hc].hE = ((h)localObject1);
          if ((this.hc != 0) && (this.hc != 2))
            break label404;
          localh1 = locale.hE;
          localObject2 = parame.ax();
          localh2 = parame.ay();
          localh2.gP = 0;
          ((android.support.constraint.a.b)localObject2).b(localh1, (h)localObject1, localh2, 0);
          if (i != 0)
            parame.a((android.support.constraint.a.b)localObject2, (int)(((android.support.constraint.a.b)localObject2).fI.b(localh2) * -1.0F), 1);
          parame.b((android.support.constraint.a.b)localObject2);
        }
      }
      while (true)
      {
        j++;
        break label195;
        if (((this.hc == 2) || (this.hc == 3)) && (((f)localObject1).aX() == f.a.js))
        {
          i = 1;
          break label162;
        }
        i++;
        break;
        if (this.iG.aX() != f.a.jr)
          break label192;
        i = 0;
        break label192;
        label404: localh2 = locale.hE;
        localObject2 = parame.ax();
        localh1 = parame.ay();
        localh1.gP = 0;
        ((android.support.constraint.a.b)localObject2).a(localh2, (h)localObject1, localh1, 0);
        if (i != 0)
          parame.a((android.support.constraint.a.b)localObject2, (int)(((android.support.constraint.a.b)localObject2).fI.b(localh1) * -1.0F), 1);
        parame.b((android.support.constraint.a.b)localObject2);
      }
      label475: if (this.hc == 0)
      {
        parame.c(this.ix.hE, this.iu.hE, 0, 6);
        if (i == 0)
          parame.c(this.iu.hE, this.iG.ix.hE, 0, 5);
      }
      while (true)
      {
        return;
        if (this.hc == 1)
        {
          parame.c(this.iu.hE, this.ix.hE, 0, 6);
          if (i == 0)
            parame.c(this.iu.hE, this.iG.iu.hE, 0, 5);
        }
        else if (this.hc == 2)
        {
          parame.c(this.iy.hE, this.iw.hE, 0, 6);
          if (i == 0)
            parame.c(this.iw.hE, this.iG.iy.hE, 0, 5);
        }
        else if (this.hc == 3)
        {
          parame.c(this.iw.hE, this.iy.hE, 0, 6);
          if (i == 0)
            parame.c(this.iw.hE, this.iG.iw.hE, 0, 5);
        }
      }
      label716: i = 0;
    }
  }

  public final boolean aC()
  {
    return true;
  }

  public final void aD()
  {
    super.aD();
    this.hd.clear();
  }

  public final void aE()
  {
    float f = 3.4028235E+38F;
    m localm1;
    label45: m localm2;
    int j;
    label59: Object localObject;
    switch (this.hc)
    {
    default:
    case 0:
      do
      {
        return;
        localm1 = this.iu.hv;
        int i = this.hd.size();
        localm2 = null;
        j = 0;
        if (j >= i)
          break;
        localObject = (m)this.hd.get(j);
      }
      while (((m)localObject).state != 1);
      if ((this.hc == 0) || (this.hc == 2))
      {
        if (((m)localObject).km >= f)
          break label335;
        f = ((m)localObject).km;
        localm2 = ((m)localObject).kl;
      }
      break;
    case 1:
    case 2:
    case 3:
    }
    label335: 
    while (true)
    {
      j++;
      break label59;
      localm1 = this.ix.hv;
      f = 0.0F;
      break label45;
      localm1 = this.iw.hv;
      break label45;
      localm1 = this.iy.hv;
      f = 0.0F;
      break label45;
      if (((m)localObject).km > f)
      {
        f = ((m)localObject).km;
        localm2 = ((m)localObject).kl;
        continue;
        if (android.support.constraint.a.e.au() != null)
        {
          localObject = android.support.constraint.a.e.au();
          ((android.support.constraint.a.f)localObject).gC += 1L;
        }
        localm1.kl = localm2;
        localm1.km = f;
        localm1.bf();
        switch (this.hc)
        {
        default:
          break;
        case 0:
          this.ix.hv.a(localm2, f);
          break;
        case 1:
          this.iu.hv.a(localm2, f);
          break;
        case 2:
          this.iy.hv.a(localm2, f);
          break;
        case 3:
          this.iw.hv.a(localm2, f);
          break;
        }
      }
    }
  }

  public final void u(int paramInt)
  {
    if (this.iG == null);
    m localm;
    label111: label120: 
    do
    {
      while (true)
      {
        return;
        if (((g)this.iG).z(2))
          switch (this.hc)
          {
          default:
          case 0:
          case 1:
          case 2:
          case 3:
          }
      }
      localm = this.iu.hv;
      localm.type = 5;
      if ((this.hc != 0) && (this.hc != 1))
        break;
      this.iw.hv.a(null, 0.0F);
      this.iy.hv.a(null, 0.0F);
      this.hd.clear();
      paramInt = 0;
    }
    while (paramInt >= this.hn);
    Object localObject = this.kh[paramInt];
    if ((this.he) || (((f)localObject).aC()))
      switch (this.hc)
      {
      default:
        localObject = null;
      case 0:
      case 1:
      case 2:
      case 3:
      }
    while (true)
    {
      if (localObject != null)
      {
        this.hd.add(localObject);
        ((m)localObject).a(localm);
      }
      paramInt++;
      break label120;
      localm = this.ix.hv;
      break;
      localm = this.iw.hv;
      break;
      localm = this.iy.hv;
      break;
      this.iu.hv.a(null, 0.0F);
      this.ix.hv.a(null, 0.0F);
      break label111;
      localObject = ((f)localObject).iu.hv;
      continue;
      localObject = ((f)localObject).ix.hv;
      continue;
      localObject = ((f)localObject).iw.hv;
      continue;
      localObject = ((f)localObject).iy.hv;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     android.support.constraint.a.a.b
 * JD-Core Version:    0.6.2
 */