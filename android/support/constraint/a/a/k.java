package android.support.constraint.a.a;

public final class k
{
  static boolean[] ki = new boolean[3];

  static void a(int paramInt, f paramf)
  {
    int i = 0;
    paramf.aK();
    m localm1 = paramf.iu.hv;
    m localm2 = paramf.iw.hv;
    m localm3 = paramf.ix.hv;
    m localm4 = paramf.iy.hv;
    int j;
    if ((paramInt & 0x8) == 8)
    {
      paramInt = 1;
      if ((paramf.iF[0] != f.a.js) || (!d(paramf, 0)))
        break label329;
      j = 1;
      label75: if ((localm1.type != 4) && (localm3.type != 4))
      {
        if ((paramf.iF[0] != f.a.jq) && ((j == 0) || (paramf.iZ != 8)))
          break label587;
        if ((paramf.iu.hy != null) || (paramf.ix.hy != null))
          break label348;
        localm1.type = 1;
        localm3.type = 1;
        if (paramInt == 0)
          break label335;
        localm3.a(localm1, 1, paramf.aM());
      }
      label164: j = i;
      if (paramf.iF[1] == f.a.js)
      {
        j = i;
        if (d(paramf, 1))
          j = 1;
      }
      if ((localm2.type != 4) && (localm4.type != 4))
      {
        if ((paramf.iF[1] != f.a.jq) && ((j == 0) || (paramf.iZ != 8)))
          break label1197;
        if ((paramf.iw.hy != null) || (paramf.iy.hy != null))
          break label888;
        localm2.type = 1;
        localm4.type = 1;
        if (paramInt == 0)
          break label874;
        localm4.a(localm2, 1, paramf.aN());
        label285: if (paramf.iz.hy != null)
        {
          paramf.iz.hv.type = 1;
          localm2.a(paramf.iz.hv, -paramf.iR);
        }
      }
    }
    label329: label587: label974: 
    while (true)
    {
      return;
      paramInt = 0;
      break;
      j = 0;
      break label75;
      label335: localm3.b(localm1, paramf.getWidth());
      break label164;
      label348: if ((paramf.iu.hy != null) && (paramf.ix.hy == null))
      {
        localm1.type = 1;
        localm3.type = 1;
        if (paramInt != 0)
        {
          localm3.a(localm1, 1, paramf.aM());
          break label164;
        }
        localm3.b(localm1, paramf.getWidth());
        break label164;
      }
      if ((paramf.iu.hy == null) && (paramf.ix.hy != null))
      {
        localm1.type = 1;
        localm3.type = 1;
        localm1.b(localm3, -paramf.getWidth());
        if (paramInt != 0)
        {
          localm1.a(localm3, -1, paramf.aM());
          break label164;
        }
        localm1.b(localm3, -paramf.getWidth());
        break label164;
      }
      if ((paramf.iu.hy == null) || (paramf.ix.hy == null))
        break label164;
      localm1.type = 2;
      localm3.type = 2;
      if (paramInt != 0)
      {
        paramf.aM().a(localm1);
        paramf.aM().a(localm3);
        localm1.b(localm3, -1, paramf.aM());
        localm3.b(localm1, 1, paramf.aM());
        break label164;
      }
      localm1.b(localm3, -paramf.getWidth());
      localm3.b(localm1, paramf.getWidth());
      break label164;
      if (j == 0)
        break label164;
      j = paramf.getWidth();
      localm1.type = 1;
      localm3.type = 1;
      if ((paramf.iu.hy == null) && (paramf.ix.hy == null))
      {
        if (paramInt != 0)
        {
          localm3.a(localm1, 1, paramf.aM());
          break label164;
        }
        localm3.b(localm1, j);
        break label164;
      }
      if ((paramf.iu.hy != null) && (paramf.ix.hy == null))
      {
        if (paramInt != 0)
        {
          localm3.a(localm1, 1, paramf.aM());
          break label164;
        }
        localm3.b(localm1, j);
        break label164;
      }
      if ((paramf.iu.hy == null) && (paramf.ix.hy != null))
      {
        if (paramInt != 0)
        {
          localm1.a(localm3, -1, paramf.aM());
          break label164;
        }
        localm1.b(localm3, -j);
        break label164;
      }
      if ((paramf.iu.hy == null) || (paramf.ix.hy == null))
        break label164;
      if (paramInt != 0)
      {
        paramf.aM().a(localm1);
        paramf.aM().a(localm3);
      }
      if (paramf.iH == 0.0F)
      {
        localm1.type = 3;
        localm3.type = 3;
        localm1.b(localm3, 0.0F);
        localm3.b(localm1, 0.0F);
        break label164;
      }
      localm1.type = 2;
      localm3.type = 2;
      localm1.b(localm3, -j);
      localm3.b(localm1, j);
      paramf.setWidth(j);
      break label164;
      label874: localm4.b(localm2, paramf.getHeight());
      break label285;
      label888: if ((paramf.iw.hy != null) && (paramf.iy.hy == null))
      {
        localm2.type = 1;
        localm4.type = 1;
        if (paramInt != 0)
          localm4.a(localm2, 1, paramf.aN());
        while (true)
        {
          if (paramf.iR <= 0)
            break label974;
          paramf.iz.hv.a(localm2, paramf.iR);
          break;
          localm4.b(localm2, paramf.getHeight());
        }
      }
      else if ((paramf.iw.hy == null) && (paramf.iy.hy != null))
      {
        localm2.type = 1;
        localm4.type = 1;
        if (paramInt != 0)
          localm2.a(localm4, -1, paramf.aN());
        while (true)
        {
          if (paramf.iR <= 0)
            break label1063;
          paramf.iz.hv.a(localm2, paramf.iR);
          break;
          localm2.b(localm4, -paramf.getHeight());
        }
      }
      else if ((paramf.iw.hy != null) && (paramf.iy.hy != null))
      {
        localm2.type = 2;
        localm4.type = 2;
        if (paramInt != 0)
        {
          localm2.b(localm4, -1, paramf.aN());
          localm4.b(localm2, 1, paramf.aN());
          paramf.aN().a(localm2);
          paramf.aM().a(localm4);
        }
        while (true)
        {
          if (paramf.iR <= 0)
            break label1195;
          paramf.iz.hv.a(localm2, paramf.iR);
          break;
          localm2.b(localm4, -paramf.getHeight());
          localm4.b(localm2, paramf.getHeight());
        }
        continue;
        if (j != 0)
        {
          j = paramf.getHeight();
          localm2.type = 1;
          localm4.type = 1;
          if ((paramf.iw.hy == null) && (paramf.iy.hy == null))
          {
            if (paramInt != 0)
              localm4.a(localm2, 1, paramf.aN());
            else
              localm4.b(localm2, j);
          }
          else if ((paramf.iw.hy != null) && (paramf.iy.hy == null))
          {
            if (paramInt != 0)
              localm4.a(localm2, 1, paramf.aN());
            else
              localm4.b(localm2, j);
          }
          else if ((paramf.iw.hy == null) && (paramf.iy.hy != null))
          {
            if (paramInt != 0)
              localm2.a(localm4, -1, paramf.aN());
            else
              localm2.b(localm4, -j);
          }
          else if ((paramf.iw.hy != null) && (paramf.iy.hy != null))
          {
            if (paramInt != 0)
            {
              paramf.aN().a(localm2);
              paramf.aM().a(localm4);
            }
            if (paramf.iH == 0.0F)
            {
              localm2.type = 3;
              localm4.type = 3;
              localm2.b(localm4, 0.0F);
              localm4.b(localm2, 0.0F);
            }
            else
            {
              localm2.type = 2;
              localm4.type = 2;
              localm2.b(localm4, -j);
              localm4.b(localm2, j);
              paramf.setHeight(j);
              if (paramf.iR > 0)
                paramf.iz.hv.a(localm2, paramf.iR);
            }
          }
        }
      }
    }
  }

  static void a(g paramg, android.support.constraint.a.e parame, f paramf)
  {
    int i;
    int j;
    if ((paramg.iF[0] != f.a.jr) && (paramf.iF[0] == f.a.jt))
    {
      i = paramf.iu.hz;
      j = paramg.getWidth() - paramf.ix.hz;
      paramf.iu.hE = parame.g(paramf.iu);
      paramf.ix.hE = parame.g(paramf.ix);
      parame.a(paramf.iu.hE, i);
      parame.a(paramf.ix.hE, j);
      paramf.hX = 2;
      paramf.g(i, j);
    }
    if ((paramg.iF[1] != f.a.jr) && (paramf.iF[1] == f.a.jt))
    {
      j = paramf.iw.hz;
      i = paramg.getHeight() - paramf.iy.hz;
      paramf.iw.hE = parame.g(paramf.iw);
      paramf.iy.hE = parame.g(paramf.iy);
      parame.a(paramf.iw.hE, j);
      parame.a(paramf.iy.hE, i);
      if ((paramf.iR > 0) || (paramf.iZ == 8))
      {
        paramf.iz.hE = parame.g(paramf.iz);
        parame.a(paramf.iz.hE, paramf.iR + j);
      }
      paramf.hY = 2;
      paramf.h(j, i);
    }
  }

  static boolean a(android.support.constraint.a.e parame, int paramInt1, int paramInt2, d paramd)
  {
    Object localObject1 = paramd.hf;
    f localf1 = paramd.hh;
    f localf2 = paramd.hg;
    f localf3 = paramd.hi;
    Object localObject2 = paramd.hj;
    int i = 0;
    int j = 0;
    float f1 = paramd.hp;
    paramd = f.a.jr;
    int k;
    int m;
    label73: int n;
    label85: float f2;
    float f3;
    int i1;
    label98: float f4;
    label131: float f5;
    if (paramInt1 == 0)
      if (((f)localObject2).jg == 0)
      {
        k = 1;
        if (((f)localObject2).jg != 1)
          break label276;
        m = 1;
        if (((f)localObject2).jg != 2)
          break label282;
        n = 1;
        f2 = 0.0F;
        f3 = 0.0F;
        i1 = 0;
        localObject2 = localObject1;
        if (i != 0)
          break label526;
        if (((f)localObject2).iZ == 8)
          break label1803;
        i1++;
        if (paramInt1 != 0)
          break label344;
        f4 = ((f)localObject2).getWidth() + f2;
        f5 = f4;
        if (localObject2 != localf2)
          f5 = f4 + localObject2.iD[paramInt2].aH();
        f4 = f5;
        if (localObject2 != localf3)
          f4 = f5 + localObject2.iD[(paramInt2 + 1)].aH();
        f3 = f3 + localObject2.iD[paramInt2].aH() + localObject2.iD[(paramInt2 + 1)].aH();
        f2 = f4;
      }
    label516: label1796: label1803: 
    while (true)
    {
      int i2 = j;
      boolean bool;
      if (((f)localObject2).iZ != 8)
      {
        i2 = j;
        if (localObject2.iF[paramInt1] == f.a.js)
          if (paramInt1 == 0)
            if (((f)localObject2).ib != 0)
              bool = false;
      }
      label276: label282: label299: label332: label338: label344: Object localObject3;
      while (true)
      {
        return bool;
        k = 0;
        break;
        m = 0;
        break label73;
        n = 0;
        break label85;
        if (((f)localObject2).jh == 0)
        {
          k = 1;
          if (((f)localObject2).jh != 1)
            break label332;
        }
        for (m = 1; ; m = 0)
        {
          if (((f)localObject2).jh != 2)
            break label338;
          n = 1;
          break;
          k = 0;
          break label299;
        }
        n = 0;
        break label85;
        f4 = ((f)localObject2).getHeight() + f2;
        break label131;
        if ((((f)localObject2).jdField_if != 0) || (((f)localObject2).ig != 0))
        {
          bool = false;
          continue;
          if (((f)localObject2).ic != 0)
            bool = false;
          else if ((((f)localObject2).ii != 0) || (((f)localObject2).ij != 0))
            bool = false;
        }
        else if (((f)localObject2).iH != 0.0F)
        {
          bool = false;
        }
        else
        {
          i2 = j + 1;
          paramd = localObject2.iD[(paramInt2 + 1)].hy;
          if (paramd != null)
          {
            localObject3 = paramd.hw;
            if (localObject3.iD[paramInt2].hy != null)
            {
              paramd = (d)localObject3;
              if (localObject3.iD[paramInt2].hy.hw == localObject2)
                break label497;
            }
          }
          for (paramd = null; ; paramd = null)
          {
            label497: if (paramd == null)
              break label516;
            j = i2;
            localObject2 = paramd;
            break;
          }
          i = 1;
          j = i2;
          break label98;
          label526: localObject3 = localObject1.iD[paramInt2].hv;
          paramd = localf1.iD[(paramInt2 + 1)].hv;
          if ((((m)localObject3).kk == null) || (paramd.kk == null))
          {
            bool = false;
          }
          else if ((((m)localObject3).kk.state != 1) || (paramd.kk.state != 1))
          {
            bool = false;
          }
          else
          {
            if ((j <= 0) || (j == i1))
              break label619;
            bool = false;
          }
        }
      }
      label619: f4 = 0.0F;
      f5 = 0.0F;
      if ((n != 0) || (k != 0) || (m != 0))
      {
        if (localf2 != null)
          f5 = localf2.iD[paramInt2].aH();
        f4 = f5;
        if (localf3 != null)
          f4 = f5 + localf3.iD[(paramInt2 + 1)].aH();
      }
      float f6 = ((m)localObject3).kk.km;
      f5 = paramd.kk.km;
      if (f6 < f5)
        f5 = f5 - f6 - f2;
      while (true)
        if ((j > 0) && (j == i1))
        {
          if ((((f)localObject2).iG != null) && (localObject2.iG.iF[paramInt1] == f.a.jr))
          {
            bool = false;
            break;
            f5 = f6 - f5 - f2;
            continue;
          }
          f3 = f5 + f2 - f3;
          f5 = f6;
          label791: if (localObject1 != null)
          {
            if (android.support.constraint.a.e.gb != null)
            {
              paramd = android.support.constraint.a.e.gb;
              paramd.gE -= 1L;
              paramd = android.support.constraint.a.e.gb;
              paramd.gv += 1L;
              paramd = android.support.constraint.a.e.gb;
              paramd.gB += 1L;
            }
            paramd = localObject1.jm[paramInt1];
            if ((paramd == null) && (localObject1 != localf1))
              break label1796;
            f4 = f3 / j;
            if (f1 > 0.0F)
            {
              if (localObject1.jk[paramInt1] == -1.0F)
                f4 = 0.0F;
            }
            else
            {
              label894: if (((f)localObject1).iZ == 8)
                f4 = 0.0F;
              f5 += localObject1.iD[paramInt2].aH();
              localObject1.iD[paramInt2].hv.a(((m)localObject3).kl, f5);
              localObject1.iD[(paramInt2 + 1)].hv.a(((m)localObject3).kl, f5 + f4);
              localObject1.iD[paramInt2].hv.c(parame);
              localObject1.iD[(paramInt2 + 1)].hv.c(parame);
            }
          }
        }
      for (f4 = f4 + f5 + localObject1.iD[(paramInt2 + 1)].aH(); ; f4 = f5)
      {
        localObject1 = paramd;
        f5 = f4;
        break label791;
        f4 = localObject1.jk[paramInt1] * f3 / f1;
        break label894;
        bool = true;
        break;
        if (f5 < 0.0F)
        {
          k = 1;
          m = 0;
        }
        for (n = 0; ; n = i)
        {
          if (k != 0)
            if (paramInt1 == 0)
            {
              f3 = ((f)localObject1).iV;
              label1085: f4 = f6 + f3 * (f5 - f4);
              label1098: if (localObject1 == null)
                break label1752;
              if (android.support.constraint.a.e.gb != null)
              {
                paramd = android.support.constraint.a.e.gb;
                paramd.gE -= 1L;
                paramd = android.support.constraint.a.e.gb;
                paramd.gv += 1L;
                paramd = android.support.constraint.a.e.gb;
                paramd.gB += 1L;
              }
              paramd = localObject1.jm[paramInt1];
              if ((paramd == null) && (localObject1 != localf1))
                break label1778;
              if (paramInt1 != 0)
                break label1322;
              f5 = ((f)localObject1).getWidth();
              label1182: f4 += localObject1.iD[paramInt2].aH();
              localObject1.iD[paramInt2].hv.a(((m)localObject3).kl, f4);
              localObject1.iD[(paramInt2 + 1)].hv.a(((m)localObject3).kl, f4 + f5);
              localObject1.iD[paramInt2].hv.c(parame);
              localObject1.iD[(paramInt2 + 1)].hv.c(parame);
              f4 = f5 + f4 + localObject1.iD[(paramInt2 + 1)].aH();
            }
          label1322: label1386: label1771: label1778: 
          while (true)
          {
            localObject1 = paramd;
            break label1098;
            if (paramInt1 == 1)
            {
              f3 = ((f)localObject1).iW;
              break label1085;
            }
            f3 = -1.0F;
            break label1085;
            f5 = ((f)localObject1).getHeight();
            break label1182;
            if ((n != 0) || (m != 0))
              if (n != 0)
                f4 = f5 - f4;
            while (true)
            {
              f5 = f4 / (i1 + 1);
              if (m != 0)
              {
                if (i1 > 1)
                  f5 = f4 / (i1 - 1);
              }
              else
                if (((f)localObject1).iZ == 8)
                  break label1764;
              for (f3 = f6 + f5; ; f3 = f6)
              {
                f4 = f3;
                if (m != 0)
                {
                  f4 = f3;
                  if (i1 > 1)
                    f4 = localf2.iD[paramInt2].aH() + f6;
                }
                if ((n != 0) && (localf2 != null))
                {
                  f4 += localf2.iD[paramInt2].aH();
                  paramd = (d)localObject1;
                }
                while (true)
                {
                  if (paramd != null)
                  {
                    if (android.support.constraint.a.e.gb != null)
                    {
                      localObject1 = android.support.constraint.a.e.gb;
                      ((android.support.constraint.a.f)localObject1).gE -= 1L;
                      localObject1 = android.support.constraint.a.e.gb;
                      ((android.support.constraint.a.f)localObject1).gv += 1L;
                      localObject1 = android.support.constraint.a.e.gb;
                      ((android.support.constraint.a.f)localObject1).gB += 1L;
                    }
                    localObject1 = paramd.jm[paramInt1];
                    if (localObject1 == null)
                    {
                      f3 = f4;
                      if (paramd != localf1);
                    }
                    else
                    {
                      if (paramInt1 != 0)
                        break label1742;
                    }
                    for (f3 = paramd.getWidth(); ; f3 = paramd.getHeight())
                    {
                      f6 = f4;
                      if (paramd != localf2)
                        f6 = f4 + paramd.iD[paramInt2].aH();
                      paramd.iD[paramInt2].hv.a(((m)localObject3).kl, f6);
                      paramd.iD[(paramInt2 + 1)].hv.a(((m)localObject3).kl, f6 + f3);
                      paramd.iD[paramInt2].hv.c(parame);
                      paramd.iD[(paramInt2 + 1)].hv.c(parame);
                      f4 = f6 + (paramd.iD[(paramInt2 + 1)].aH() + f3);
                      f3 = f4;
                      if (localObject1 != null)
                      {
                        f3 = f4;
                        if (((f)localObject1).iZ != 8)
                          f3 = f4 + f5;
                      }
                      paramd = (d)localObject1;
                      f4 = f3;
                      break label1467;
                      if (m == 0)
                        break label1771;
                      f4 = f5 - f4;
                      break;
                      f5 = f4 / 2.0F;
                      break label1386;
                    }
                  }
                  bool = true;
                  break;
                  paramd = (d)localObject1;
                }
              }
              f4 = f5;
            }
          }
          label1467: label1742: label1752: label1764: i = k;
          k = n;
        }
      }
    }
  }

  static void b(f paramf, int paramInt1, int paramInt2)
  {
    int i = paramInt1 * 2;
    int j = i + 1;
    paramf.iD[i].hv.kl = paramf.iG.iu.hv;
    paramf.iD[i].hv.km = paramInt2;
    paramf.iD[i].hv.state = 1;
    paramf.iD[j].hv.kl = paramf.iD[i].hv;
    paramf.iD[j].hv.km = paramf.v(paramInt1);
    paramf.iD[j].hv.state = 1;
  }

  private static boolean d(f paramf, int paramInt)
  {
    int i = 1;
    boolean bool1 = false;
    boolean bool2;
    if (paramf.iF[paramInt] != f.a.js)
      bool2 = bool1;
    while (true)
    {
      return bool2;
      if (paramf.iH != 0.0F)
      {
        paramf = paramf.iF;
        if (paramInt == 0);
        for (paramInt = i; ; paramInt = 0)
        {
          bool2 = bool1;
          if (paramf[paramInt] != f.a.js)
            break;
          bool2 = bool1;
          break;
        }
      }
      if (paramInt == 0)
      {
        bool2 = bool1;
        if (paramf.ib == 0)
        {
          bool2 = bool1;
          if (paramf.jdField_if == 0)
          {
            bool2 = bool1;
            if (paramf.ig != 0);
          }
        }
      }
      else
      {
        do
        {
          bool2 = true;
          break;
          bool2 = bool1;
          if (paramf.ic != 0)
            break;
          bool2 = bool1;
          if (paramf.ii != 0)
            break;
        }
        while (paramf.ij == 0);
        bool2 = bool1;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     android.support.constraint.a.a.k
 * JD-Core Version:    0.6.2
 */