package android.support.constraint.a;

import java.util.Arrays;
import java.util.HashMap;

public final class e
{
  private static int fN = 1000;
  public static f gb;
  int fO = 0;
  private HashMap<String, h> fP = null;
  public e.a fQ;
  private int fR = 32;
  private int fS = this.fR;
  public b[] fT = null;
  public boolean fU = false;
  private boolean[] fV = new boolean[this.fR];
  public int fW = 0;
  private int fX = this.fR;
  private h[] fY = new h[fN];
  private int fZ = 0;
  public final c fw;
  private b[] ga = new b[this.fR];
  private final e.a gc;
  int mNumColumns = 1;

  public e()
  {
    aw();
    this.fw = new c();
    this.fQ = new d(this.fw);
    this.gc = new b(this.fw);
  }

  public static b a(e parame, h paramh1, h paramh2, h paramh3, float paramFloat, boolean paramBoolean)
  {
    b localb = parame.ax();
    if (paramBoolean)
      localb.a(parame, 0);
    localb.fI.a(paramh1, -1.0F);
    localb.fI.a(paramh2, 1.0F - paramFloat);
    localb.fI.a(paramh3, paramFloat);
    return localb;
  }

  private h a(h.a parama)
  {
    Object localObject = (h)this.fw.fL.aA();
    if (localObject == null)
    {
      localObject = new h(parama);
      ((h)localObject).gS = parama;
    }
    for (parama = (h.a)localObject; ; parama = (h.a)localObject)
    {
      if (this.fZ >= fN)
      {
        fN *= 2;
        this.fY = ((h[])Arrays.copyOf(this.fY, fN));
      }
      localObject = this.fY;
      int i = this.fZ;
      this.fZ = (i + 1);
      localObject[i] = parama;
      return parama;
      ((h)localObject).reset();
      ((h)localObject).gS = parama;
    }
  }

  private final void a(b paramb)
  {
    if (this.fW > 0)
    {
      paramb.fI.a(paramb, this.fT);
      if (paramb.fI.fu == 0)
        paramb.fJ = true;
    }
  }

  public static f au()
  {
    return gb;
  }

  private void av()
  {
    this.fR *= 2;
    this.fT = ((b[])Arrays.copyOf(this.fT, this.fR));
    this.fw.fM = ((h[])Arrays.copyOf(this.fw.fM, this.fR));
    this.fV = new boolean[this.fR];
    this.fS = this.fR;
    this.fX = this.fR;
    if (gb != null)
    {
      f localf = gb;
      localf.gg += 1L;
      localf = gb;
      localf.gs = Math.max(localf.gs, this.fR);
      localf = gb;
      localf.gG = localf.gs;
    }
  }

  private void aw()
  {
    for (int i = 0; i < this.fT.length; i++)
    {
      b localb = this.fT[i];
      if (localb != null)
        this.fw.fK.release(localb);
      this.fT[i] = null;
    }
  }

  private final int c(e.a parama)
  {
    Object localObject1;
    if (gb != null)
    {
      localObject1 = gb;
      ((f)localObject1).gk += 1L;
    }
    int i = 0;
    int j;
    Object localObject2;
    while (true)
      if (i < this.mNumColumns)
      {
        this.fV[i] = false;
        i++;
        continue;
        if (j >= 0)
        {
          b localb = this.fT[j];
          localb.fF.gO = -1;
          if (gb != null)
          {
            localObject2 = gb;
            ((f)localObject2).gm += 1L;
          }
          localb.d((h)localObject1);
          localb.fF.gO = j;
          localb.fF.f(localb);
        }
      }
    while (true)
    {
      int k = i;
      if (m == 0)
      {
        if (gb != null)
        {
          localObject1 = gb;
          ((f)localObject1).gl += 1L;
        }
        i++;
        if (i < this.mNumColumns * 2)
          break label162;
      }
      for (k = i; ; k = i)
      {
        return k;
        label162: if (parama.at() != null)
          this.fV[parama.at().id] = true;
        localObject1 = parama.a(this.fV);
        if (localObject1 == null)
          break label229;
        if (this.fV[localObject1.id] == 0)
          break;
      }
      this.fV[localObject1.id] = true;
      label229: if (localObject1 != null)
      {
        float f1 = 3.4028235E+38F;
        k = 0;
        j = -1;
        while (k < this.fW)
        {
          localObject2 = this.fT[k];
          int n = j;
          float f2 = f1;
          if (((b)localObject2).fF.gS != h.a.gW)
          {
            n = j;
            f2 = f1;
            if (!((b)localObject2).fJ)
            {
              n = j;
              f2 = f1;
              if (((b)localObject2).c((h)localObject1))
              {
                float f3 = ((b)localObject2).fI.b((h)localObject1);
                n = j;
                f2 = f1;
                if (f3 < 0.0F)
                {
                  f3 = -((b)localObject2).fG / f3;
                  n = j;
                  f2 = f1;
                  if (f3 < f1)
                  {
                    n = k;
                    f2 = f3;
                  }
                }
              }
            }
          }
          k++;
          j = n;
          f1 = f2;
        }
        break;
        m = 1;
        continue;
      }
      int m = 1;
      continue;
      i = 0;
      m = 0;
    }
  }

  private final void c(b paramb)
  {
    if (this.fT[this.fW] != null)
      this.fw.fK.release(this.fT[this.fW]);
    this.fT[this.fW] = paramb;
    paramb.fF.gO = this.fW;
    this.fW += 1;
    paramb.fF.f(paramb);
  }

  public static int h(Object paramObject)
  {
    paramObject = ((android.support.constraint.a.a.e)paramObject).hE;
    if (paramObject != null);
    for (int i = (int)(paramObject.gQ + 0.5F); ; i = 0)
      return i;
  }

  public final void a(b paramb, int paramInt1, int paramInt2)
  {
    h localh = t(paramInt2);
    paramb.fI.a(localh, paramInt1);
  }

  public final void a(h paramh, int paramInt)
  {
    int i = paramh.gO;
    b localb;
    if (paramh.gO != -1)
    {
      localb = this.fT[i];
      if (localb.fJ)
        localb.fG = paramInt;
    }
    while (true)
    {
      return;
      if (localb.fI.fu == 0)
      {
        localb.fJ = true;
        localb.fG = paramInt;
      }
      else
      {
        localb = ax();
        if (paramInt < 0)
        {
          localb.fG = (paramInt * -1);
          localb.fI.a(paramh, 1.0F);
        }
        while (true)
        {
          b(localb);
          break;
          localb.fG = paramInt;
          localb.fI.a(paramh, -1.0F);
        }
        localb = ax();
        localb.fF = paramh;
        paramh.gQ = paramInt;
        localb.fG = paramInt;
        localb.fJ = true;
        b(localb);
      }
    }
  }

  public final void a(h paramh1, h paramh2, int paramInt1, float paramFloat, h paramh3, h paramh4, int paramInt2, int paramInt3)
  {
    b localb = ax();
    if (paramh2 == paramh3)
    {
      localb.fI.a(paramh1, 1.0F);
      localb.fI.a(paramh4, 1.0F);
      localb.fI.a(paramh2, -2.0F);
    }
    while (true)
    {
      if (paramInt3 != 6)
        localb.a(this, paramInt3);
      b(localb);
      return;
      if (paramFloat == 0.5F)
      {
        localb.fI.a(paramh1, 1.0F);
        localb.fI.a(paramh2, -1.0F);
        localb.fI.a(paramh3, -1.0F);
        localb.fI.a(paramh4, 1.0F);
        if ((paramInt1 > 0) || (paramInt2 > 0))
          localb.fG = (-paramInt1 + paramInt2);
      }
      else if (paramFloat <= 0.0F)
      {
        localb.fI.a(paramh1, -1.0F);
        localb.fI.a(paramh2, 1.0F);
        localb.fG = paramInt1;
      }
      else if (paramFloat >= 1.0F)
      {
        localb.fI.a(paramh3, -1.0F);
        localb.fI.a(paramh4, 1.0F);
        localb.fG = paramInt2;
      }
      else
      {
        localb.fI.a(paramh1, (1.0F - paramFloat) * 1.0F);
        localb.fI.a(paramh2, (1.0F - paramFloat) * -1.0F);
        localb.fI.a(paramh3, -1.0F * paramFloat);
        localb.fI.a(paramh4, 1.0F * paramFloat);
        if ((paramInt1 > 0) || (paramInt2 > 0))
          localb.fG = (-paramInt1 * (1.0F - paramFloat) + paramInt2 * paramFloat);
      }
    }
  }

  public final void a(h paramh1, h paramh2, int paramInt1, int paramInt2)
  {
    b localb = ax();
    h localh = ay();
    localh.gP = 0;
    localb.a(paramh1, paramh2, localh, paramInt1);
    if (paramInt2 != 6)
      a(localb, (int)(localb.fI.b(localh) * -1.0F), paramInt2);
    b(localb);
  }

  public final b ax()
  {
    b localb = (b)this.fw.fK.aA();
    if (localb == null)
      localb = new b(this.fw);
    while (true)
    {
      h.aB();
      return localb;
      localb.fF = null;
      localb.fI.clear();
      localb.fG = 0.0F;
      localb.fJ = false;
    }
  }

  public final h ay()
  {
    if (gb != null)
    {
      localObject = gb;
      ((f)localObject).gq += 1L;
    }
    if (this.mNumColumns + 1 >= this.fS)
      av();
    Object localObject = a(h.a.gY);
    this.fO += 1;
    this.mNumColumns += 1;
    ((h)localObject).id = this.fO;
    this.fw.fM[this.fO] = localObject;
    return localObject;
  }

  public final void az()
  {
    for (int i = 0; i < this.fW; i++)
    {
      b localb = this.fT[i];
      localb.fF.gQ = localb.fG;
    }
  }

  public final void b(b paramb)
  {
    if (paramb == null);
    label206: label471: label1115: label1117: label1125: 
    while (true)
    {
      return;
      Object localObject1;
      if (gb != null)
      {
        localObject1 = gb;
        ((f)localObject1).gi += 1L;
        if (paramb.fJ)
        {
          localObject1 = gb;
          ((f)localObject1).gj += 1L;
        }
      }
      if ((this.fW + 1 >= this.fX) || (this.mNumColumns + 1 >= this.fS))
        av();
      int i;
      int j;
      Object localObject3;
      if (!paramb.fJ)
      {
        a(paramb);
        if ((paramb.fF == null) && (paramb.fG == 0.0F) && (paramb.fI.fu == 0));
        Object localObject2;
        for (i = 1; i == 0; i = 0)
        {
          if (paramb.fG >= 0.0F)
            break label206;
          paramb.fG *= -1.0F;
          localObject1 = paramb.fI;
          j = ((a)localObject1).fC;
          for (i = 0; (j != -1) && (i < ((a)localObject1).fu); i++)
          {
            localObject2 = ((a)localObject1).fB;
            localObject2[j] *= -1.0F;
            j = localObject1.fA[j];
          }
        }
        continue;
        a locala = paramb.fI;
        localObject3 = null;
        Object localObject4 = null;
        float f1 = 0.0F;
        float f2 = 0.0F;
        boolean bool1 = false;
        boolean bool2 = false;
        j = locala.fC;
        i = 0;
        if ((j != -1) && (i < locala.fu))
        {
          float f3 = locala.fB[j];
          localObject1 = locala.fw.fM[locala.fz[j]];
          float f4;
          boolean bool3;
          boolean bool4;
          float f5;
          Object localObject5;
          if (f3 < 0.0F)
          {
            f4 = f3;
            if (f3 > -0.001F)
            {
              locala.fB[j] = 0.0F;
              f4 = 0.0F;
              ((h)localObject1).e(locala.fv);
            }
            bool3 = bool2;
            bool4 = bool1;
            f3 = f2;
            f5 = f1;
            localObject2 = localObject4;
            localObject5 = localObject3;
            if (f4 != 0.0F)
            {
              if (((h)localObject1).gS != h.a.gW)
                break label592;
              if (localObject4 != null)
                break label471;
              bool4 = a.a((h)localObject1);
              localObject5 = localObject3;
              localObject2 = localObject1;
              f5 = f4;
              f3 = f2;
              bool3 = bool2;
            }
          }
          while (true)
          {
            j = locala.fA[j];
            i++;
            bool2 = bool3;
            bool1 = bool4;
            f2 = f3;
            f1 = f5;
            localObject4 = localObject2;
            localObject3 = localObject5;
            break;
            f4 = f3;
            if (f3 >= 0.001F)
              break label323;
            locala.fB[j] = 0.0F;
            f4 = 0.0F;
            ((h)localObject1).e(locala.fv);
            break label323;
            if (f1 > f4)
            {
              bool4 = a.a((h)localObject1);
              bool3 = bool2;
              f3 = f2;
              f5 = f4;
              localObject2 = localObject1;
              localObject5 = localObject3;
            }
            else
            {
              bool3 = bool2;
              bool4 = bool1;
              f3 = f2;
              f5 = f1;
              localObject2 = localObject4;
              localObject5 = localObject3;
              if (!bool1)
              {
                bool3 = bool2;
                bool4 = bool1;
                f3 = f2;
                f5 = f1;
                localObject2 = localObject4;
                localObject5 = localObject3;
                if (a.a((h)localObject1))
                {
                  bool4 = true;
                  bool3 = bool2;
                  f3 = f2;
                  f5 = f4;
                  localObject2 = localObject1;
                  localObject5 = localObject3;
                  continue;
                  bool3 = bool2;
                  bool4 = bool1;
                  f3 = f2;
                  f5 = f1;
                  localObject2 = localObject4;
                  localObject5 = localObject3;
                  if (localObject4 == null)
                  {
                    bool3 = bool2;
                    bool4 = bool1;
                    f3 = f2;
                    f5 = f1;
                    localObject2 = localObject4;
                    localObject5 = localObject3;
                    if (f4 < 0.0F)
                      if (localObject3 == null)
                      {
                        bool3 = a.a((h)localObject1);
                        bool4 = bool1;
                        f3 = f4;
                        f5 = f1;
                        localObject2 = localObject4;
                        localObject5 = localObject1;
                      }
                      else if (f2 > f4)
                      {
                        bool3 = a.a((h)localObject1);
                        bool4 = bool1;
                        f3 = f4;
                        f5 = f1;
                        localObject2 = localObject4;
                        localObject5 = localObject1;
                      }
                      else
                      {
                        bool3 = bool2;
                        bool4 = bool1;
                        f3 = f2;
                        f5 = f1;
                        localObject2 = localObject4;
                        localObject5 = localObject3;
                        if (!bool2)
                        {
                          bool3 = bool2;
                          bool4 = bool1;
                          f3 = f2;
                          f5 = f1;
                          localObject2 = localObject4;
                          localObject5 = localObject3;
                          if (a.a((h)localObject1))
                          {
                            bool3 = true;
                            bool4 = bool1;
                            f3 = f4;
                            f5 = f1;
                            localObject2 = localObject4;
                            localObject5 = localObject1;
                          }
                        }
                      }
                  }
                }
              }
            }
          }
        }
        if (localObject4 != null)
        {
          localObject3 = localObject4;
          if (localObject3 != null)
            break label1100;
          i = 1;
          if (paramb.fI.fu == 0)
            paramb.fJ = true;
          if (i == 0)
            break label1117;
          if (gb != null)
          {
            localObject1 = gb;
            ((f)localObject1).gr += 1L;
          }
          if (this.mNumColumns + 1 >= this.fS)
            av();
          localObject1 = a(h.a.gY);
          this.fO += 1;
          this.mNumColumns += 1;
          ((h)localObject1).id = this.fO;
          this.fw.fM[this.fO] = localObject1;
          paramb.fF = ((h)localObject1);
          c(paramb);
          j = 1;
          this.gc.a(paramb);
          c(this.gc);
          i = j;
          if (((h)localObject1).gO == -1)
          {
            if (paramb.fF == localObject1)
            {
              localObject2 = paramb.fI.a(null, (h)localObject1);
              if (localObject2 != null)
              {
                if (gb != null)
                {
                  localObject1 = gb;
                  ((f)localObject1).gm += 1L;
                }
                paramb.d((h)localObject2);
              }
            }
            if (!paramb.fJ)
              paramb.fF.f(paramb);
            this.fW -= 1;
            i = j;
          }
          if ((paramb.fF == null) || ((paramb.fF.gS != h.a.gW) && (paramb.fG < 0.0F)))
            break label1111;
          j = 1;
          if (j == 0)
            break label1115;
        }
      }
      else
      {
        while (true)
        {
          if (i != 0)
            break label1125;
          c(paramb);
          break;
          break label815;
          paramb.d(localObject3);
          i = 0;
          break label822;
          j = 0;
          break label1080;
          break;
          i = 0;
          break label1048;
          i = 0;
        }
      }
    }
  }

  public final void b(e.a parama)
  {
    Object localObject;
    if (gb != null)
    {
      localObject = gb;
      ((f)localObject).gw += 1L;
      localObject = gb;
      ((f)localObject).gx = Math.max(((f)localObject).gx, this.mNumColumns);
      localObject = gb;
      ((f)localObject).gy = Math.max(((f)localObject).gy, this.fW);
    }
    a((b)parama);
    int i = 0;
    if (i < this.fW)
      if ((this.fT[i].fF.gS == h.a.gW) || (this.fT[i].fG >= 0.0F));
    for (i = 1; ; i = 0)
    {
      int j;
      int k;
      int m;
      float f1;
      int n;
      int i1;
      label168: b localb;
      int i2;
      int i3;
      int i4;
      float f2;
      if (i != 0)
      {
        j = 0;
        k = 0;
        if (j == 0)
        {
          if (gb != null)
          {
            localObject = gb;
            ((f)localObject).gn += 1L;
          }
          m = k + 1;
          f1 = 3.4028235E+38F;
          i = 0;
          k = -1;
          n = -1;
          i1 = 0;
          if (i1 < this.fW)
          {
            localb = this.fT[i1];
            i2 = n;
            i3 = k;
            i4 = i;
            f2 = f1;
            if (localb.fF.gS != h.a.gW)
            {
              i2 = n;
              i3 = k;
              i4 = i;
              f2 = f1;
              if (!localb.fJ)
              {
                i2 = n;
                i3 = k;
                i4 = i;
                f2 = f1;
                if (localb.fG < 0.0F)
                {
                  i4 = 1;
                  label266: if (i4 < this.mNumColumns)
                  {
                    localObject = this.fw.fM[i4];
                    float f3 = localb.fI.b((h)localObject);
                    if (f3 <= 0.0F)
                      break label577;
                    int i5 = 0;
                    i3 = n;
                    i2 = k;
                    k = i5;
                    n = i;
                    i = i2;
                    while (true)
                      if (k < 7)
                      {
                        f2 = localObject.gR[k] / f3;
                        if (((f2 >= f1) || (k != n)) && (k <= n))
                          break label574;
                        i3 = i4;
                        i = i1;
                        n = k;
                        f1 = f2;
                        label381: k++;
                        continue;
                        i++;
                        break;
                      }
                    k = i3;
                  }
                }
              }
            }
          }
        }
      }
      while (true)
      {
        i4++;
        i3 = n;
        n = k;
        k = i;
        i = i3;
        break label266;
        f2 = f1;
        i4 = i;
        i3 = k;
        i2 = n;
        i1++;
        n = i2;
        k = i3;
        i = i4;
        f1 = f2;
        break label168;
        if (k != -1)
        {
          localb = this.fT[k];
          localb.fF.gO = -1;
          if (gb != null)
          {
            localObject = gb;
            ((f)localObject).gm += 1L;
          }
          localb.d(this.fw.fM[n]);
          localb.fF.gO = k;
          localb.fF.f(localb);
        }
        for (i = j; ; i = 1)
        {
          if (m > this.mNumColumns / 2)
            i = 1;
          k = m;
          j = i;
          break;
        }
        c(parama);
        az();
        return;
        label574: break label381;
        label577: i3 = n;
        i2 = k;
        n = i;
        k = i3;
        i = i2;
      }
    }
  }

  public final void b(h paramh1, h paramh2, int paramInt1, int paramInt2)
  {
    b localb = ax();
    h localh = ay();
    localh.gP = 0;
    localb.b(paramh1, paramh2, localh, paramInt1);
    if (paramInt2 != 6)
      a(localb, (int)(localb.fI.b(localh) * -1.0F), paramInt2);
    b(localb);
  }

  public final b c(h paramh1, h paramh2, int paramInt1, int paramInt2)
  {
    b localb = ax();
    int i = 0;
    int j = 0;
    if (paramInt1 != 0)
    {
      i = j;
      j = paramInt1;
      if (paramInt1 < 0)
      {
        j = paramInt1 * -1;
        i = 1;
      }
      localb.fG = j;
    }
    if (i == 0)
    {
      localb.fI.a(paramh1, -1.0F);
      localb.fI.a(paramh2, 1.0F);
    }
    while (true)
    {
      if (paramInt2 != 6)
        localb.a(this, paramInt2);
      b(localb);
      return localb;
      localb.fI.a(paramh1, 1.0F);
      localb.fI.a(paramh2, -1.0F);
    }
  }

  public final void c(h paramh1, h paramh2, h paramh3, h paramh4, float paramFloat)
  {
    b localb = ax();
    localb.a(paramh1, paramh2, paramh3, paramh4, paramFloat);
    b(localb);
  }

  public final h g(Object paramObject)
  {
    Object localObject1 = null;
    if (paramObject == null);
    while (true)
    {
      return localObject1;
      if (this.mNumColumns + 1 >= this.fS)
        av();
      if ((paramObject instanceof android.support.constraint.a.a.e))
      {
        localObject1 = ((android.support.constraint.a.a.e)paramObject).hE;
        Object localObject2 = localObject1;
        if (localObject1 == null)
        {
          ((android.support.constraint.a.a.e)paramObject).aG();
          localObject2 = ((android.support.constraint.a.a.e)paramObject).hE;
        }
        if ((((h)localObject2).id != -1) && (((h)localObject2).id <= this.fO))
        {
          localObject1 = localObject2;
          if (this.fw.fM[localObject2.id] != null);
        }
        else
        {
          if (((h)localObject2).id != -1)
            ((h)localObject2).reset();
          this.fO += 1;
          this.mNumColumns += 1;
          ((h)localObject2).id = this.fO;
          ((h)localObject2).gS = h.a.gW;
          this.fw.fM[this.fO] = localObject2;
          localObject1 = localObject2;
        }
      }
    }
  }

  public final void reset()
  {
    for (int i = 0; i < this.fw.fM.length; i++)
    {
      h localh = this.fw.fM[i];
      if (localh != null)
        localh.reset();
    }
    this.fw.fL.b(this.fY, this.fZ);
    this.fZ = 0;
    Arrays.fill(this.fw.fM, null);
    if (this.fP != null)
      this.fP.clear();
    this.fO = 0;
    this.fQ.clear();
    this.mNumColumns = 1;
    for (i = 0; i < this.fW; i++)
      this.fT[i].fH = false;
    aw();
    this.fW = 0;
  }

  public final h t(int paramInt)
  {
    if (gb != null)
    {
      localObject = gb;
      ((f)localObject).gp += 1L;
    }
    if (this.mNumColumns + 1 >= this.fS)
      av();
    Object localObject = a(h.a.gZ);
    this.fO += 1;
    this.mNumColumns += 1;
    ((h)localObject).id = this.fO;
    ((h)localObject).gP = paramInt;
    this.fw.fM[this.fO] = localObject;
    this.fQ.e((h)localObject);
    return localObject;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     android.support.constraint.a.e
 * JD-Core Version:    0.6.2
 */