package android.support.constraint.a.a;

import android.support.constraint.a.b;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class g extends q
{
  public int dl = 7;
  public boolean hq = false;
  int jA;
  int jB = 0;
  int jC = 0;
  d[] jD = new d[4];
  d[] jE = new d[4];
  public List<h> jF = new ArrayList();
  public boolean jG = false;
  public boolean jH = false;
  public boolean jI = false;
  public int jJ = 0;
  public int jK = 0;
  public boolean jL = false;
  public boolean jM = false;
  public boolean jN = false;
  int jO = 0;
  protected android.support.constraint.a.e jv = new android.support.constraint.a.e();
  private p jw;
  int jx;
  int jy;
  int jz;

  private void b(f paramf)
  {
    if (this.jB + 1 >= this.jE.length)
      this.jE = ((d[])Arrays.copyOf(this.jE, this.jE.length * 2));
    this.jE[this.jB] = new d(paramf, 0, this.hq);
    this.jB += 1;
  }

  private void bc()
  {
    this.jB = 0;
    this.jC = 0;
  }

  private void c(f paramf)
  {
    if (this.jC + 1 >= this.jD.length)
      this.jD = ((d[])Arrays.copyOf(this.jD, this.jD.length * 2));
    this.jD[this.jC] = new d(paramf, 1, this.hq);
    this.jC += 1;
  }

  public final void aZ()
  {
    int i = this.iJ;
    int j = this.iK;
    int k = Math.max(0, getWidth());
    int m = Math.max(0, getHeight());
    this.jM = false;
    this.jN = false;
    Object localObject1;
    int i1;
    Object localObject2;
    label343: Object localObject5;
    Object localObject6;
    int i3;
    label448: int i4;
    if (this.iG != null)
    {
      if (this.jw == null)
        this.jw = new p(this);
      localObject1 = this.jw;
      ((p)localObject1).iJ = getX();
      ((p)localObject1).iK = getY();
      ((p)localObject1).mWidth = getWidth();
      ((p)localObject1).mHeight = getHeight();
      n = ((p)localObject1).ku.size();
      i1 = 0;
      if (i1 < n)
      {
        localObject2 = (p.a)((p)localObject1).ku.get(i1);
        ((p.a)localObject2).kc = a(((p.a)localObject2).kc.hx);
        if (((p.a)localObject2).kc != null)
        {
          ((p.a)localObject2).hy = ((p.a)localObject2).kc.hy;
          ((p.a)localObject2).hz = ((p.a)localObject2).kc.aH();
          ((p.a)localObject2).kv = ((p.a)localObject2).kc.hB;
        }
        for (((p.a)localObject2).kw = ((p.a)localObject2).kc.hD; ; ((p.a)localObject2).kw = 0)
        {
          i1++;
          break;
          ((p.a)localObject2).hy = null;
          ((p.a)localObject2).hz = 0;
          ((p.a)localObject2).kv = e.b.hK;
        }
      }
      setX(this.jx);
      setY(this.jy);
      aV();
      a(this.jv.fw);
      if (this.dl == 0)
        break label631;
      if (!z(8))
        bb();
      if (!z(32))
      {
        if (!z(8))
          u(this.dl);
        ba();
      }
      this.jv.fU = true;
      i1 = 0;
      localObject5 = this.iF[1];
      localObject1 = this.iF[0];
      bc();
      if (this.jF.size() == 0)
      {
        this.jF.clear();
        this.jF.add(0, new h(this.kx));
      }
      int i2 = this.jF.size();
      localObject6 = this.kx;
      if ((aW() != f.a.jr) && (aX() != f.a.jr))
        break label642;
      i3 = 1;
      i4 = 0;
      if ((i4 >= i2) || (this.jL))
        break label2025;
      if (((h)this.jF.get(i4)).jL)
        break label2011;
      if (z(32))
      {
        if ((aW() != f.a.jq) || (aX() != f.a.jq))
          break label768;
        localObject2 = (h)this.jF.get(i4);
        if (((h)localObject2).jX.isEmpty())
          break label648;
        localObject2 = ((h)localObject2).jX;
      }
    }
    label550: int i5;
    label631: Object localObject7;
    label768: for (this.kx = ((ArrayList)localObject2); ; this.kx = ((ArrayList)((h)this.jF.get(i4)).jP))
    {
      bc();
      i5 = this.kx.size();
      for (n = 0; n < i5; n++)
      {
        localObject2 = (f)this.kx.get(n);
        if ((localObject2 instanceof q))
          ((q)localObject2).aZ();
      }
      this.iJ = 0;
      this.iK = 0;
      break;
      this.jv.fU = false;
      break label343;
      label642: i3 = 0;
      break label448;
      label648: i6 = ((h)localObject2).jP.size();
      for (n = 0; n < i6; n++)
      {
        localObject7 = (f)((h)localObject2).jP.get(n);
        if (!((f)localObject7).jd)
          ((h)localObject2).a((ArrayList)((h)localObject2).jX, (f)localObject7);
      }
      ((h)localObject2).jY.clear();
      ((h)localObject2).jY.addAll(((h)localObject2).jP);
      ((h)localObject2).jY.removeAll(((h)localObject2).jX);
      localObject2 = ((h)localObject2).jX;
      break label550;
    }
    int n = 1;
    int i6 = 0;
    label801: int i7;
    int i8;
    Object localObject4;
    if (n != 0)
    {
      i7 = i6 + 1;
      while (true)
      {
        int i9;
        try
        {
          this.jv.reset();
          bc();
          b(this.jv);
          i6 = 0;
          if (i6 < i5)
          {
            ((f)this.kx.get(i6)).b(this.jv);
            i6++;
            continue;
          }
          locale = this.jv;
          a(locale);
          i8 = this.kx.size();
          i6 = 0;
          if (i6 < i8)
          {
            localObject7 = (f)this.kx.get(i6);
            if ((localObject7 instanceof g))
            {
              f.a locala = localObject7.iF[0];
              localObject2 = localObject7.iF[1];
              if (locala == f.a.jr)
                ((f)localObject7).a(f.a.jq);
              if (localObject2 == f.a.jr)
                ((f)localObject7).b(f.a.jq);
              ((f)localObject7).a(locale);
              if (locala == f.a.jr)
                ((f)localObject7).a(locala);
              if (localObject2 == f.a.jr)
                ((f)localObject7).b((f.a)localObject2);
              i6++;
              continue;
            }
            k.a(this, locale, (f)localObject7);
            ((f)localObject7).a(locale);
            continue;
          }
        }
        catch (Exception localException1)
        {
          android.support.constraint.a.e locale;
          System.out.println("EXCEPTION : ".concat(String.valueOf(localException1)));
          if (n != 0)
          {
            Object localObject3 = k.ki;
            localObject3[2] = 0;
            aY();
            i6 = this.kx.size();
            n = 0;
            if (n >= i6)
              continue;
            localObject7 = (f)this.kx.get(n);
            ((f)localObject7).aY();
            if ((localObject7.iF[0] == f.a.js) && (((f)localObject7).getWidth() < ((f)localObject7).iS))
              localObject3[2] = 1;
            if ((localObject7.iF[1] == f.a.js) && (((f)localObject7).getHeight() < ((f)localObject7).iT))
              localObject3[2] = 1;
            n++;
            continue;
            if (this.jB > 0)
              c.a(this, locale, 0);
            if (this.jC > 0)
              c.a(this, locale, 1);
            i9 = 1;
            i8 = 1;
            try
            {
              localObject3 = this.jv;
              if (android.support.constraint.a.e.gb != null)
              {
                localObject7 = android.support.constraint.a.e.gb;
                ((android.support.constraint.a.f)localObject7).gh += 1L;
              }
              if (!((android.support.constraint.a.e)localObject3).fU)
                continue;
              if (android.support.constraint.a.e.gb != null)
              {
                localObject7 = android.support.constraint.a.e.gb;
                ((android.support.constraint.a.f)localObject7).gu += 1L;
              }
              int i10 = 1;
              n = 0;
              i6 = i10;
              if (n < ((android.support.constraint.a.e)localObject3).fW)
              {
                if (localObject3.fT[n].fJ)
                  continue;
                i6 = 0;
              }
              if (i6 != 0)
                continue;
              ((android.support.constraint.a.e)localObject3).b(((android.support.constraint.a.e)localObject3).fQ);
              n = i9;
            }
            catch (Exception localException2)
            {
              n = i8;
            }
            continue;
            n++;
            continue;
            if (android.support.constraint.a.e.gb != null)
            {
              localObject7 = android.support.constraint.a.e.gb;
              ((android.support.constraint.a.f)localObject7).gt += 1L;
            }
            localException2.az();
            n = i9;
            continue;
            localException2.b(localException2.fQ);
            n = i9;
            continue;
          }
          aY();
          n = 0;
          if (n < i5)
          {
            localObject4 = (f)this.kx.get(n);
            if ((localObject4.iF[0] != f.a.js) || (((f)localObject4).getWidth() >= ((f)localObject4).iS))
              break label1577;
            k.ki[2] = true;
          }
          i8 = 0;
          i6 = i8;
          n = i1;
          if (i3 == 0)
            break label1716;
        }
        i6 = i8;
        n = i1;
        if (i7 >= 8)
          break label1716;
        i6 = i8;
        n = i1;
        if (k.ki[2] == 0)
          break label1716;
        i8 = 0;
        n = 0;
        for (i6 = 0; i6 < i5; i6++)
        {
          localObject4 = (f)this.kx.get(i6);
          i8 = Math.max(i8, ((f)localObject4).iJ + ((f)localObject4).getWidth());
          i9 = ((f)localObject4).iK;
          n = Math.max(n, ((f)localObject4).getHeight() + i9);
        }
        label1577: if ((localObject4.iF[1] == f.a.js) && (((f)localObject4).getHeight() < ((f)localObject4).iT))
          k.ki[2] = true;
        else
          n++;
      }
      i8 = Math.max(this.dg, i8);
      i6 = Math.max(this.dh, n);
      if ((localObject1 != f.a.jr) || (getWidth() >= i8))
        break label2361;
      setWidth(i8);
      this.iF[0] = f.a.jr;
      n = 1;
      i1 = 1;
    }
    while (true)
    {
      if ((localObject5 == f.a.jr) && (getHeight() < i6))
      {
        setHeight(i6);
        this.iF[1] = f.a.jr;
        n = 1;
        i6 = 1;
      }
      while (true)
      {
        label1716: i8 = Math.max(this.dg, getWidth());
        i1 = n;
        if (i8 > getWidth())
        {
          setWidth(i8);
          this.iF[0] = f.a.jq;
          i1 = 1;
          i6 = 1;
        }
        n = Math.max(this.dh, getHeight());
        if (n > getHeight())
        {
          setHeight(n);
          this.iF[1] = f.a.jq;
          i1 = 1;
        }
        for (n = 1; ; n = i6)
        {
          if (i1 == 0)
            if ((this.iF[0] == f.a.jr) && (k > 0) && (getWidth() > k))
            {
              this.jM = true;
              i8 = 1;
              this.iF[0] = f.a.jq;
              setWidth(k);
              i6 = 1;
              label1860: n = i6;
              i1 = i8;
              if (this.iF[1] == f.a.jr)
              {
                n = i6;
                i1 = i8;
                if (m > 0)
                {
                  n = i6;
                  i1 = i8;
                  if (getHeight() > m)
                  {
                    this.jN = true;
                    i1 = 1;
                    this.iF[1] = f.a.jq;
                    setHeight(m);
                    n = 1;
                  }
                }
              }
            }
          while (true)
          {
            i6 = i7;
            break label801;
            localObject4 = (h)this.jF.get(i4);
            i8 = ((h)localObject4).jY.size();
            for (i6 = 0; ; i6++)
            {
              n = i1;
              if (i6 >= i8)
                break;
              ((h)localObject4).d((f)((h)localObject4).jY.get(i6));
            }
            label2011: n = i1;
            i4++;
            i1 = n;
            break;
            label2025: this.kx = ((ArrayList)localObject6);
            if (this.iG != null)
            {
              i8 = Math.max(this.dg, getWidth());
              i6 = Math.max(this.dh, getHeight());
              localObject6 = this.jw;
              setX(((p)localObject6).iJ);
              setY(((p)localObject6).iK);
              setWidth(((p)localObject6).mWidth);
              setHeight(((p)localObject6).mHeight);
              i3 = ((p)localObject6).ku.size();
              for (n = 0; n < i3; n++)
              {
                localObject4 = (p.a)((p)localObject6).ku.get(n);
                a(((p.a)localObject4).kc.hx).a(((p.a)localObject4).hy, ((p.a)localObject4).hz, -1, ((p.a)localObject4).kv, ((p.a)localObject4).kw, false);
              }
              setWidth(this.jx + i8 + this.jz);
              setHeight(this.jy + i6 + this.jA);
              if (i1 != 0)
              {
                this.iF[0] = localObject1;
                this.iF[1] = localObject5;
              }
              a(this.jv.fw);
              localObject4 = this.iG;
              localObject1 = (g)this;
            }
            while (true)
            {
              if (localObject4 != null)
              {
                localObject5 = ((f)localObject4).iG;
                if (!(localObject4 instanceof g))
                  break label2322;
                localObject1 = (g)localObject4;
                localObject4 = localObject5;
                continue;
                this.iJ = i;
                this.iK = j;
                break;
              }
              if (this == localObject1)
                aU();
              return;
              label2322: localObject4 = localObject5;
            }
            i6 = n;
            i8 = i1;
            break label1860;
          }
        }
        i6 = n;
        n = i1;
      }
      label2361: n = 0;
    }
  }

  final void b(f paramf, int paramInt)
  {
    if (paramInt == 0)
      b(paramf);
    while (true)
    {
      return;
      if (paramInt == 1)
        c(paramf);
    }
  }

  public final void ba()
  {
    m localm1 = a(e.c.hO).hv;
    m localm2 = a(e.c.hP).hv;
    localm1.a(null, 0.0F);
    localm2.a(null, 0.0F);
  }

  public final void bb()
  {
    int i = this.kx.size();
    aD();
    for (int j = 0; j < i; j++)
      ((f)this.kx.get(j)).aD();
  }

  public final void j(int paramInt1, int paramInt2)
  {
    if ((this.iF[0] != f.a.jr) && (this.hZ != null))
      this.hZ.E(paramInt1);
    if ((this.iF[1] != f.a.jr) && (this.ia != null))
      this.ia.E(paramInt2);
  }

  public final void reset()
  {
    this.jv.reset();
    this.jx = 0;
    this.jz = 0;
    this.jy = 0;
    this.jA = 0;
    this.jF.clear();
    this.jL = false;
    super.reset();
  }

  public final void u(int paramInt)
  {
    super.u(paramInt);
    int i = this.kx.size();
    for (int j = 0; j < i; j++)
      ((f)this.kx.get(j)).u(paramInt);
  }

  public final boolean z(int paramInt)
  {
    if ((this.dl & paramInt) == paramInt);
    for (boolean bool = true; ; bool = false)
      return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     android.support.constraint.a.a.g
 * JD-Core Version:    0.6.2
 */