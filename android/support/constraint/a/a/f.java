package android.support.constraint.a.a;

import android.support.constraint.a.c;
import java.util.ArrayList;

public class f
{
  public static float iU = 0.5F;
  protected int dg;
  protected int dh;
  public int hX = -1;
  public int hY = -1;
  n hZ;
  e iA = new e(this, e.c.hU);
  e iB = new e(this, e.c.hV);
  e iC = new e(this, e.c.hT);
  protected e[] iD = { this.iu, this.ix, this.iw, this.iy, this.iz, this.iC };
  protected ArrayList<e> iE = new ArrayList();
  protected f.a[] iF = { f.a.jq, f.a.jq };
  f iG = null;
  protected float iH = 0.0F;
  protected int iI = -1;
  protected int iJ = 0;
  protected int iK = 0;
  int iL = 0;
  int iM = 0;
  private int iN = 0;
  private int iO = 0;
  private int iP = 0;
  private int iQ = 0;
  public int iR = 0;
  public int iS;
  public int iT;
  public float iV = iU;
  public float iW = iU;
  public Object iX;
  private int iY = 0;
  public int iZ = 0;
  n ia;
  public int ib = 0;
  public int ic = 0;
  int[] ie = new int[2];
  public int jdField_if = 0;
  public int ig = 0;
  public float ih = 1.0F;
  public int ii = 0;
  public int ij = 0;
  public float ik = 1.0F;
  public boolean il;
  public boolean im;
  int io = -1;
  float iq = 1.0F;
  h ir = null;
  public int[] is = { 2147483647, 2147483647 };
  public float it = 0.0F;
  e iu = new e(this, e.c.hO);
  e iw = new e(this, e.c.hP);
  e ix = new e(this, e.c.hQ);
  e iy = new e(this, e.c.hR);
  e iz = new e(this, e.c.hS);
  public String ja = null;
  boolean jb;
  boolean jc;
  boolean jd = false;
  boolean je = false;
  boolean jf = false;
  public int jg = 0;
  public int jh = 0;
  boolean ji;
  boolean jj;
  public float[] jk = { -1.0F, -1.0F };
  protected f[] jl = { null, null };
  protected f[] jm = { null, null };
  f jn = null;
  f jo = null;
  int mHeight = 0;
  protected int mOffsetX = 0;
  protected int mOffsetY = 0;
  private String mType = null;
  int mWidth = 0;

  public f()
  {
    this.iE.add(this.iu);
    this.iE.add(this.iw);
    this.iE.add(this.ix);
    this.iE.add(this.iy);
    this.iE.add(this.iA);
    this.iE.add(this.iB);
    this.iE.add(this.iC);
    this.iE.add(this.iz);
  }

  private void a(android.support.constraint.a.e parame, boolean paramBoolean1, android.support.constraint.a.h paramh1, android.support.constraint.a.h paramh2, f.a parama, boolean paramBoolean2, e parame1, e parame2, int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat1, boolean paramBoolean3, boolean paramBoolean4, int paramInt5, int paramInt6, int paramInt7, float paramFloat2, boolean paramBoolean5)
  {
    android.support.constraint.a.h localh1 = parame.g(parame1);
    android.support.constraint.a.h localh2 = parame.g(parame2);
    android.support.constraint.a.h localh3 = parame.g(parame1.hy);
    android.support.constraint.a.h localh4 = parame.g(parame2.hy);
    if ((parame.fU) && (parame1.hv.state == 1) && (parame2.hv.state == 1))
    {
      if (android.support.constraint.a.e.au() != null)
      {
        paramh1 = android.support.constraint.a.e.au();
        paramh1.gv += 1L;
      }
      parame1.hv.c(parame);
      parame2.hv.c(parame);
      if ((!paramBoolean4) && (paramBoolean1))
        parame.a(paramh2, localh2, 0, 6);
      return;
    }
    Object localObject;
    if (android.support.constraint.a.e.au() != null)
    {
      localObject = android.support.constraint.a.e.au();
      ((android.support.constraint.a.f)localObject).gE += 1L;
    }
    boolean bool1 = parame1.isConnected();
    boolean bool2 = parame2.isConnected();
    boolean bool3 = this.iC.isConnected();
    int i = 0;
    int j = 0;
    if (bool1)
      j = 1;
    int k = j;
    if (bool2)
      k = j + 1;
    if (bool3);
    for (int m = k + 1; ; m = k)
    {
      int n = paramInt5;
      if (paramBoolean3)
        n = 3;
      switch (f.1.jp[parama.ordinal()])
      {
      default:
        paramInt5 = i;
        label268: if (this.iZ == 8)
        {
          paramInt2 = 0;
          paramInt5 = 0;
        }
        break;
      case 1:
      case 2:
      case 3:
      case 4:
      }
      while (true)
      {
        if (paramBoolean5)
        {
          if ((!bool1) && (!bool2) && (!bool3))
            parame.a(localh1, paramInt1);
        }
        else
        {
          label311: if (paramInt5 != 0)
            break label518;
          if (!paramBoolean2)
            break label494;
          parame.c(localh2, localh1, 0, 3);
          if (paramInt3 > 0)
            parame.a(localh2, localh1, paramInt3, 6);
          k = paramInt5;
          j = paramInt6;
          paramInt2 = paramInt7;
          if (paramInt4 >= 2147483647)
            break label1492;
          parame.b(localh2, localh1, paramInt4, 6);
          paramInt4 = paramInt5;
        }
        for (paramInt1 = paramInt6; ; paramInt1 = paramInt6)
        {
          label388: if ((paramBoolean5) && (!paramBoolean4))
            break label886;
          if ((m >= 2) || (!paramBoolean1))
            break;
          parame.a(localh1, paramh1, 0, 6);
          parame.a(paramh2, localh2, 0, 6);
          break;
          paramInt5 = 0;
          break label268;
          paramInt5 = 0;
          break label268;
          paramInt5 = 0;
          break label268;
          paramInt5 = 1;
          if (n != 4)
            break label268;
          paramInt5 = 0;
          break label268;
          if ((!bool1) || (bool2))
            break label311;
          parame.c(localh1, localh3, parame1.aH(), 6);
          break label311;
          label494: parame.c(localh2, localh1, paramInt2, 6);
          paramInt4 = paramInt5;
        }
        label518: paramInt1 = paramInt6;
        if (paramInt6 == -2)
          paramInt1 = paramInt2;
        paramInt6 = paramInt7;
        if (paramInt7 == -2)
          paramInt6 = paramInt2;
        paramInt4 = paramInt2;
        if (paramInt1 > 0)
        {
          parame.a(localh2, localh1, paramInt1, 6);
          paramInt4 = Math.max(paramInt2, paramInt1);
        }
        if (paramInt6 > 0)
        {
          parame.b(localh2, localh1, paramInt6, 6);
          paramInt4 = Math.min(paramInt4, paramInt6);
        }
        while (true)
        {
          if (n == 1)
            if (paramBoolean1)
              parame.c(localh2, localh1, paramInt4, 6);
          while (n != 2)
            while (true)
            {
              k = paramInt5;
              j = paramInt1;
              paramInt2 = paramInt6;
              if (paramInt5 == 0)
                break label1492;
              k = paramInt5;
              j = paramInt1;
              paramInt2 = paramInt6;
              if (m == 2)
                break label1492;
              k = paramInt5;
              j = paramInt1;
              paramInt2 = paramInt6;
              if (paramBoolean3)
                break label1492;
              paramInt4 = Math.max(paramInt1, paramInt4);
              paramInt2 = paramInt4;
              if (paramInt6 > 0)
                paramInt2 = Math.min(paramInt6, paramInt4);
              parame.c(localh2, localh1, paramInt2, 6);
              paramInt4 = 0;
              paramInt7 = paramInt6;
              break;
              if (paramBoolean4)
                parame.c(localh2, localh1, paramInt4, 4);
              else
                parame.c(localh2, localh1, paramInt4, 1);
            }
          if ((parame1.hx == e.c.hP) || (parame1.hx == e.c.hR))
            parama = parame.g(this.iG.a(e.c.hP));
          for (localObject = parame.g(this.iG.a(e.c.hR)); ; localObject = parame.g(this.iG.a(e.c.hQ)))
          {
            parame.b(parame.ax().a(localh2, localh1, (android.support.constraint.a.h)localObject, parama, paramFloat2));
            paramInt5 = 0;
            break;
            parama = parame.g(this.iG.a(e.c.hO));
          }
          label886: if ((!bool1) && (!bool2) && (!bool3))
            if (paramBoolean1)
              parame.a(paramh2, localh2, 0, 5);
          while (true)
            label915: if (paramBoolean1)
            {
              parame.a(paramh2, localh2, 0, 6);
              break;
              if ((bool1) && (!bool2))
              {
                if (paramBoolean1)
                  parame.a(paramh2, localh2, 0, 5);
              }
              else if ((!bool1) && (bool2))
              {
                parame.c(localh2, localh4, -parame2.aH(), 6);
                if (paramBoolean1)
                  parame.a(localh1, paramh1, 0, 5);
              }
              else if ((bool1) && (bool2))
              {
                paramInt2 = 0;
                paramInt5 = 0;
                paramInt6 = 5;
                if (paramInt4 == 0)
                  break label1416;
                if ((paramBoolean1) && (paramInt3 == 0))
                  parame.a(localh2, localh1, 0, 6);
                if (n != 0)
                  break label1308;
                paramInt3 = 6;
                if ((paramInt7 > 0) || (paramInt1 > 0))
                {
                  paramInt3 = 4;
                  paramInt2 = 1;
                }
                parame.c(localh1, localh3, parame1.aH(), paramInt3);
                parame.c(localh2, localh4, -parame2.aH(), paramInt3);
                if ((paramInt7 <= 0) && (paramInt1 <= 0))
                  break label1486;
              }
            }
          label1308: label1472: label1486: for (paramInt1 = 1; ; paramInt1 = 0)
          {
            paramInt5 = paramInt1;
            paramInt1 = paramInt2;
            paramInt3 = paramInt6;
            paramInt2 = paramInt5;
            while (true)
            {
              label1134: paramInt5 = 5;
              if (paramInt2 != 0)
              {
                parame.a(localh1, localh3, parame1.aH(), paramFloat1, localh4, localh2, parame2.aH(), paramInt3);
                paramBoolean3 = parame1.hy.hw instanceof b;
                paramBoolean2 = parame2.hy.hw instanceof b;
                if ((paramBoolean3) && (!paramBoolean2))
                {
                  paramInt3 = 6;
                  paramBoolean2 = true;
                  paramBoolean3 = paramBoolean1;
                  paramInt2 = 5;
                }
              }
              while (true)
              {
                if (paramInt1 != 0)
                {
                  paramInt2 = 6;
                  paramInt3 = 6;
                }
                if (((paramInt4 == 0) && (paramBoolean3)) || (paramInt1 != 0))
                  parame.a(localh1, localh3, parame1.aH(), paramInt2);
                if (((paramInt4 == 0) && (paramBoolean2)) || (paramInt1 != 0))
                  parame.b(localh2, localh4, -parame2.aH(), paramInt3);
                if (!paramBoolean1)
                  break label915;
                parame.a(localh1, paramh1, 0, 6);
                break label915;
                break;
                if (n == 1)
                {
                  paramInt3 = 6;
                  paramInt2 = 1;
                  paramInt1 = 1;
                  break label1134;
                }
                if (n != 3)
                  break label1472;
                paramInt2 = 1;
                paramInt3 = 4;
                paramInt1 = paramInt3;
                if (!paramBoolean3)
                {
                  paramInt1 = paramInt3;
                  if (this.io != -1)
                  {
                    paramInt1 = paramInt3;
                    if (paramInt7 <= 0)
                      paramInt1 = 6;
                  }
                }
                parame.c(localh1, localh3, parame1.aH(), paramInt1);
                parame.c(localh2, localh4, -parame2.aH(), paramInt1);
                paramInt1 = 1;
                paramInt3 = paramInt6;
                break label1134;
                paramInt2 = 1;
                paramInt1 = 0;
                paramInt3 = paramInt6;
                break label1134;
                if ((!paramBoolean3) && (paramBoolean2))
                {
                  paramInt2 = 6;
                  paramBoolean3 = true;
                  paramBoolean2 = paramBoolean1;
                  paramInt3 = paramInt5;
                }
                else
                {
                  paramBoolean2 = paramBoolean1;
                  paramBoolean3 = paramBoolean1;
                  paramInt2 = 5;
                  paramInt3 = paramInt5;
                }
              }
              paramInt1 = 0;
              paramInt2 = paramInt5;
              paramInt3 = paramInt6;
            }
          }
          label1416: label1492: paramInt4 = k;
          paramInt1 = j;
          paramInt7 = paramInt2;
          break label388;
        }
      }
    }
  }

  private boolean y(int paramInt)
  {
    paramInt *= 2;
    if ((this.iD[paramInt].hy != null) && (this.iD[paramInt].hy.hy != this.iD[paramInt]) && (this.iD[(paramInt + 1)].hy != null) && (this.iD[(paramInt + 1)].hy.hy == this.iD[(paramInt + 1)]));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final void B(String paramString)
  {
    int i = 0;
    if ((paramString == null) || (paramString.length() == 0))
    {
      this.iH = 0.0F;
      return;
    }
    int j = paramString.length();
    int k = paramString.indexOf(',');
    String str;
    if ((k > 0) && (k < j - 1))
    {
      str = paramString.substring(0, k);
      if (!str.equalsIgnoreCase("W"));
    }
    while (true)
    {
      label65: int m = k + 1;
      k = i;
      i = m;
      label77: m = paramString.indexOf(':');
      if ((m >= 0) && (m < j - 1))
      {
        str = paramString.substring(i, m);
        paramString = paramString.substring(m + 1);
        if ((str.length() <= 0) || (paramString.length() <= 0));
      }
      while (true)
      {
        try
        {
          f1 = Float.parseFloat(str);
          float f2 = Float.parseFloat(paramString);
          if ((f1 <= 0.0F) || (f2 <= 0.0F))
            break label267;
          if (k == 1)
          {
            f1 = Math.abs(f2 / f1);
            if (f1 <= 0.0F)
              break;
            this.iH = f1;
            this.iI = k;
            break;
            if (!str.equalsIgnoreCase("H"))
              break label273;
            i = 1;
            break label65;
            i = 0;
            k = -1;
            break label77;
          }
          f1 /= f2;
          f1 = Math.abs(f1);
          continue;
        }
        catch (NumberFormatException paramString)
        {
        }
        float f1 = 0.0F;
        continue;
        paramString = paramString.substring(i);
        if (paramString.length() > 0)
          try
          {
            f1 = Float.parseFloat(paramString);
          }
          catch (NumberFormatException paramString)
          {
          }
        else
          label267: f1 = 0.0F;
      }
      label273: i = -1;
    }
  }

  public e a(e.c paramc)
  {
    switch (f.1.hF[paramc.ordinal()])
    {
    default:
      throw new AssertionError(paramc.name());
    case 1:
      paramc = this.iu;
    case 2:
    case 3:
    case 4:
    case 5:
    case 7:
    case 8:
    case 6:
    case 9:
    }
    while (true)
    {
      return paramc;
      paramc = this.iw;
      continue;
      paramc = this.ix;
      continue;
      paramc = this.iy;
      continue;
      paramc = this.iz;
      continue;
      paramc = this.iA;
      continue;
      paramc = this.iB;
      continue;
      paramc = this.iC;
      continue;
      paramc = null;
    }
  }

  public final void a(e.c paramc1, f paramf, e.c paramc2, int paramInt1, int paramInt2)
  {
    a(paramc1).a(paramf.a(paramc2), paramInt1, paramInt2, e.b.hK, 0, true);
  }

  public final void a(f.a parama)
  {
    this.iF[0] = parama;
    if (parama == f.a.jr)
      setWidth(this.iS);
  }

  public void a(c paramc)
  {
    this.iu.aG();
    this.iw.aG();
    this.ix.aG();
    this.iy.aG();
    this.iz.aG();
    this.iC.aG();
    this.iA.aG();
    this.iB.aG();
  }

  public void a(android.support.constraint.a.e parame)
  {
    android.support.constraint.a.h localh1 = parame.g(this.iu);
    Object localObject1 = parame.g(this.ix);
    android.support.constraint.a.h localh2 = parame.g(this.iw);
    android.support.constraint.a.h localh3 = parame.g(this.iy);
    android.support.constraint.a.h localh4 = parame.g(this.iz);
    boolean bool1 = false;
    boolean bool2 = false;
    boolean bool3 = false;
    boolean bool4 = false;
    boolean bool5;
    boolean bool6;
    label117: boolean bool7;
    label140: boolean bool8;
    if (this.iG != null)
    {
      if (this.iG == null)
        break label1048;
      if (this.iG.iF[0] != f.a.jr)
        break label1042;
      bool5 = true;
      if (this.iG == null)
        break label1060;
      if (this.iG.iF[1] != f.a.jr)
        break label1054;
      bool6 = true;
      if (!y(0))
        break label1066;
      ((g)this.iG).b(this, 0);
      bool7 = true;
      if (!y(1))
        break label1132;
      ((g)this.iG).b(this, 1);
      bool8 = true;
      label163: if ((bool5) && (this.iZ != 8) && (this.iu.hy == null) && (this.ix.hy == null))
        parame.a(parame.g(this.iG.ix), (android.support.constraint.a.h)localObject1, 0, 1);
      bool2 = bool8;
      bool3 = bool5;
      bool4 = bool6;
      bool1 = bool7;
      if (bool6)
      {
        bool2 = bool8;
        bool3 = bool5;
        bool4 = bool6;
        bool1 = bool7;
        if (this.iZ != 8)
        {
          bool2 = bool8;
          bool3 = bool5;
          bool4 = bool6;
          bool1 = bool7;
          if (this.iw.hy == null)
          {
            bool2 = bool8;
            bool3 = bool5;
            bool4 = bool6;
            bool1 = bool7;
            if (this.iy.hy == null)
            {
              bool2 = bool8;
              bool3 = bool5;
              bool4 = bool6;
              bool1 = bool7;
              if (this.iz == null)
              {
                parame.a(parame.g(this.iG.iy), localh3, 0, 1);
                bool1 = bool7;
                bool4 = bool6;
                bool3 = bool5;
                bool2 = bool8;
              }
            }
          }
        }
      }
    }
    int i = this.mWidth;
    int j = i;
    if (i < this.dg)
      j = this.dg;
    i = this.mHeight;
    int k = i;
    if (i < this.dh)
      k = this.dh;
    int m;
    label436: int n;
    label451: int i1;
    int i3;
    int i4;
    int i5;
    int i6;
    if (this.iF[0] != f.a.js)
    {
      m = 1;
      if (this.iF[1] == f.a.js)
        break label1204;
      n = 1;
      i = 0;
      this.io = this.iI;
      this.iq = this.iH;
      i1 = this.ib;
      int i2 = this.ic;
      i3 = i1;
      i4 = i2;
      i5 = i;
      if (this.iH <= 0.0F)
        break label2123;
      i3 = i1;
      i4 = i2;
      i5 = i;
      if (this.iZ == 8)
        break label2123;
      i6 = 1;
      i = i1;
      if (this.iF[0] == f.a.js)
      {
        i = i1;
        if (i1 == 0)
          i = 3;
      }
      i1 = i2;
      if (this.iF[1] == f.a.js)
      {
        i1 = i2;
        if (i2 == 0)
          i1 = 3;
      }
      if ((this.iF[0] != f.a.js) || (this.iF[1] != f.a.js) || (i != 3) || (i1 != 3))
        break label1380;
      if (this.io == -1)
      {
        if ((m == 0) || (n != 0))
          break label1210;
        this.io = 0;
      }
      label642: if ((this.io != 0) || ((this.iw.isConnected()) && (this.iy.isConnected())))
        break label1246;
      this.io = 1;
      label674: if ((this.io == -1) && ((!this.iw.isConnected()) || (!this.iy.isConnected()) || (!this.iu.isConnected()) || (!this.ix.isConnected())))
      {
        if ((!this.iw.isConnected()) || (!this.iy.isConnected()))
          break label1282;
        this.io = 0;
      }
      label747: if (this.io == -1)
      {
        if ((!bool3) || (bool4))
          break label1320;
        this.io = 0;
      }
      label770: if (this.io == -1)
      {
        if ((this.jdField_if <= 0) || (this.ii != 0))
          break label1348;
        this.io = 0;
      }
      label797: if ((this.io == -1) && (bool3) && (bool4))
      {
        this.iq = (1.0F / this.iq);
        this.io = 1;
      }
      i3 = 1;
      i5 = j;
      j = i3;
    }
    while (true)
    {
      label841: this.ie[0] = i;
      this.ie[1] = i1;
      label880: android.support.constraint.a.h localh5;
      label902: label946: android.support.constraint.a.h localh6;
      if ((j != 0) && ((this.io == 0) || (this.io == -1)))
      {
        bool6 = true;
        if ((this.iF[0] != f.a.jr) || (!(this instanceof g)))
          break label1550;
        bool7 = true;
        bool5 = true;
        if (this.iC.isConnected())
          bool5 = false;
        if (this.hX != 2)
        {
          if (this.iG == null)
            break label1556;
          localh5 = parame.g(this.iG.ix);
          if (this.iG == null)
            break label1562;
          localh6 = parame.g(this.iG.iu);
          label966: a(parame, bool3, localh6, localh5, this.iF[0], bool7, this.iu, this.ix, this.iJ, i5, this.dg, this.is[0], this.iV, bool6, bool1, i, this.jdField_if, this.ig, this.ih, bool5);
        }
        if (this.hY != 2)
          break label1568;
      }
      label1042: label1048: label1054: label1060: label1066: label1204: label1210: label2107: 
      while (true)
      {
        return;
        bool5 = false;
        break;
        bool5 = false;
        break;
        bool6 = false;
        break label117;
        bool6 = false;
        break label117;
        if (((this.iu.hy != null) && (this.iu.hy.hy == this.iu)) || ((this.ix.hy != null) && (this.ix.hy.hy == this.ix)))
        {
          bool7 = true;
          break label140;
        }
        bool7 = false;
        break label140;
        label1132: if (((this.iw.hy != null) && (this.iw.hy.hy == this.iw)) || ((this.iy.hy != null) && (this.iy.hy.hy == this.iy)))
        {
          bool8 = true;
          break label163;
        }
        bool8 = false;
        break label163;
        m = 0;
        break label436;
        n = 0;
        break label451;
        if ((m != 0) || (n == 0))
          break label642;
        this.io = 1;
        if (this.iI != -1)
          break label642;
        this.iq = (1.0F / this.iq);
        break label642;
        label1246: if ((this.io != 1) || ((this.iu.isConnected()) && (this.ix.isConnected())))
          break label674;
        this.io = 0;
        break label674;
        if ((!this.iu.isConnected()) || (!this.ix.isConnected()))
          break label747;
        this.iq = (1.0F / this.iq);
        this.io = 1;
        break label747;
        if ((bool3) || (!bool4))
          break label770;
        this.iq = (1.0F / this.iq);
        this.io = 1;
        break label770;
        label1348: if ((this.jdField_if != 0) || (this.ii <= 0))
          break label797;
        this.iq = (1.0F / this.iq);
        this.io = 1;
        break label797;
        label1380: if ((this.iF[0] == f.a.js) && (i == 3))
        {
          this.io = 0;
          i5 = (int)(this.iq * this.mHeight);
          if (this.iF[1] == f.a.js)
            break label2146;
          i = 4;
          j = 0;
          break label841;
        }
        i3 = i;
        i4 = i1;
        i5 = i6;
        if (this.iF[1] != f.a.js)
          break label2123;
        i3 = i;
        i4 = i1;
        i5 = i6;
        if (i1 != 3)
          break label2123;
        this.io = 1;
        if (this.iI == -1)
          this.iq = (1.0F / this.iq);
        k = (int)(this.iq * this.mWidth);
        if (this.iF[0] == f.a.js)
          break label2109;
        i1 = 4;
        i3 = 0;
        i5 = j;
        j = i3;
        break label841;
        bool6 = false;
        break label880;
        bool7 = false;
        break label902;
        localh5 = null;
        break label946;
        localh6 = null;
        break label966;
        if ((this.iF[1] == f.a.jr) && ((this instanceof g)))
        {
          bool6 = true;
          if ((j == 0) || ((this.io != 1) && (this.io != -1)))
            break label2018;
          bool7 = true;
          label1614: bool8 = bool5;
          if (this.iR > 0)
          {
            if (this.iz.hv.state != 1)
              break label2024;
            this.iz.hv.c(parame);
            bool8 = bool5;
          }
          label1654: if (this.iG == null)
            break label2080;
          localh5 = parame.g(this.iG.iy);
          if (this.iG == null)
            break label2086;
          localh6 = parame.g(this.iG.iw);
          a(parame, bool4, localh6, localh5, this.iF[1], bool6, this.iw, this.iy, this.iK, k, this.dh, this.is[1], this.iW, bool7, bool2, i1, this.ii, this.ij, this.ik, bool8);
          if (j != 0)
          {
            if (this.io != 1)
              break label2092;
            parame.c(localh3, localh2, (android.support.constraint.a.h)localObject1, localh1, this.iq);
          }
        }
        while (true)
        {
          if (!this.iC.isConnected())
            break label2107;
          Object localObject2 = this.iC.hy.hw;
          float f = (float)Math.toRadians(this.it + 90.0F);
          i = this.iC.aH();
          localh6 = parame.g(a(e.c.hO));
          localh4 = parame.g(a(e.c.hP));
          localh3 = parame.g(a(e.c.hQ));
          localObject1 = parame.g(a(e.c.hR));
          localh5 = parame.g(((f)localObject2).a(e.c.hO));
          localh2 = parame.g(((f)localObject2).a(e.c.hP));
          localh1 = parame.g(((f)localObject2).a(e.c.hQ));
          android.support.constraint.a.h localh7 = parame.g(((f)localObject2).a(e.c.hR));
          localObject2 = parame.ax();
          ((android.support.constraint.a.b)localObject2).b(localh4, (android.support.constraint.a.h)localObject1, localh2, localh7, (float)(Math.sin(f) * i));
          parame.b((android.support.constraint.a.b)localObject2);
          localObject1 = parame.ax();
          ((android.support.constraint.a.b)localObject1).b(localh6, localh3, localh5, localh1, (float)(Math.cos(f) * i));
          parame.b((android.support.constraint.a.b)localObject1);
          break;
          bool6 = false;
          break label1590;
          label2018: bool7 = false;
          break label1614;
          label2024: parame.c(localh4, localh2, this.iR, 6);
          bool8 = bool5;
          if (this.iz.hy == null)
            break label1654;
          parame.c(localh4, parame.g(this.iz.hy), 0, 6);
          bool8 = false;
          break label1654;
          localh5 = null;
          break label1674;
          localh6 = null;
          break label1694;
          parame.c((android.support.constraint.a.h)localObject1, localh1, localh3, localh2, this.iq);
        }
      }
      label1282: label1320: label1590: label2109: i3 = 1;
      label1550: label1556: label1562: label1568: label2080: label2086: label2092: i5 = j;
      label1674: label1694: j = i3;
      continue;
      label2123: i1 = i4;
      i = i3;
      i3 = i5;
      i5 = j;
      j = i3;
      continue;
      label2146: j = 1;
    }
  }

  public boolean aC()
  {
    if (this.iZ != 8);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public void aD()
  {
    for (int i = 0; i < 6; i++)
      this.iD[i].hv.reset();
  }

  public void aE()
  {
  }

  public final boolean aI()
  {
    boolean bool1 = false;
    boolean bool2 = bool1;
    if (this.ib == 0)
    {
      bool2 = bool1;
      if (this.iH == 0.0F)
      {
        bool2 = bool1;
        if (this.jdField_if == 0)
        {
          bool2 = bool1;
          if (this.ig == 0)
          {
            bool2 = bool1;
            if (this.iF[0] == f.a.js)
              bool2 = true;
          }
        }
      }
    }
    return bool2;
  }

  public final boolean aJ()
  {
    boolean bool = true;
    if ((this.ic == 0) && (this.iH == 0.0F) && (this.ii == 0) && (this.ij == 0) && (this.iF[1] == f.a.js));
    while (true)
    {
      return bool;
      bool = false;
    }
  }

  public final void aK()
  {
    for (int i = 0; i < 6; i++)
    {
      m localm = this.iD[i].hv;
      e locale = localm.kj.hy;
      if (locale != null)
      {
        if (locale.hy == localm.kj)
        {
          localm.type = 4;
          locale.hv.type = 4;
        }
        int j = localm.kj.aH();
        int k;
        if (localm.kj.hx != e.c.hQ)
        {
          k = j;
          if (localm.kj.hx != e.c.hR);
        }
        else
        {
          k = -j;
        }
        localm.b(locale.hv, k);
      }
    }
  }

  public final boolean aL()
  {
    boolean bool = true;
    if ((this.iu.hv.state == 1) && (this.ix.hv.state == 1) && (this.iw.hv.state == 1) && (this.iy.hv.state == 1));
    while (true)
    {
      return bool;
      bool = false;
    }
  }

  public final n aM()
  {
    if (this.hZ == null)
      this.hZ = new n();
    return this.hZ;
  }

  public final n aN()
  {
    if (this.ia == null)
      this.ia = new n();
    return this.ia;
  }

  public final int aO()
  {
    return this.iN + this.mOffsetX;
  }

  public final int aP()
  {
    return this.iO + this.mOffsetY;
  }

  protected final int aQ()
  {
    return this.iJ + this.mOffsetX;
  }

  protected final int aR()
  {
    return this.iK + this.mOffsetY;
  }

  public final boolean aS()
  {
    if (this.iR > 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public ArrayList<e> aT()
  {
    return this.iE;
  }

  public void aU()
  {
    int i = this.iJ;
    int j = this.iK;
    int k = this.iJ;
    int m = this.mWidth;
    int n = this.iK;
    int i1 = this.mHeight;
    this.iN = i;
    this.iO = j;
    this.iP = (k + m - i);
    this.iQ = (n + i1 - j);
  }

  public final void aV()
  {
    int i = this.iE.size();
    for (int j = 0; j < i; j++)
      ((e)this.iE.get(j)).reset();
  }

  public final f.a aW()
  {
    return this.iF[0];
  }

  public final f.a aX()
  {
    return this.iF[1];
  }

  public void aY()
  {
    int i = android.support.constraint.a.e.h(this.iu);
    int j = android.support.constraint.a.e.h(this.iw);
    int k = android.support.constraint.a.e.h(this.ix);
    int m = android.support.constraint.a.e.h(this.iy);
    int n;
    if ((k - i >= 0) && (m - j >= 0) && (i != -2147483648) && (i != 2147483647) && (j != -2147483648) && (j != 2147483647) && (k != -2147483648) && (k != 2147483647) && (m != -2147483648))
    {
      n = m;
      if (m != 2147483647);
    }
    else
    {
      n = 0;
      k = 0;
      j = 0;
      i = 0;
    }
    k -= i;
    n -= j;
    this.iJ = i;
    this.iK = j;
    if (this.iZ == 8)
    {
      this.mWidth = 0;
      this.mHeight = 0;
      return;
    }
    if ((this.iF[0] == f.a.jq) && (k < this.mWidth));
    for (j = this.mWidth; ; j = k)
    {
      if ((this.iF[1] == f.a.jq) && (n < this.mHeight));
      for (i = this.mHeight; ; i = n)
      {
        this.mWidth = j;
        this.mHeight = i;
        if (this.mHeight < this.dh)
          this.mHeight = this.dh;
        if (this.mWidth < this.dg)
          this.mWidth = this.dg;
        this.je = true;
        break;
      }
    }
  }

  public final void b(f.a parama)
  {
    this.iF[1] = parama;
    if (parama == f.a.jr)
      setHeight(this.iT);
  }

  public final void b(android.support.constraint.a.e parame)
  {
    parame.g(this.iu);
    parame.g(this.iw);
    parame.g(this.ix);
    parame.g(this.iy);
    if (this.iR > 0)
      parame.g(this.iz);
  }

  public final void e(int paramInt1, int paramInt2, int paramInt3)
  {
    if (paramInt3 == 0)
      g(paramInt1, paramInt2);
    while (true)
    {
      this.je = true;
      return;
      if (paramInt3 == 1)
        h(paramInt1, paramInt2);
    }
  }

  public final void f(int paramInt1, int paramInt2)
  {
    this.iJ = paramInt1;
    this.iK = paramInt2;
  }

  public final void g(int paramInt1, int paramInt2)
  {
    this.iJ = paramInt1;
    this.mWidth = (paramInt2 - paramInt1);
    if (this.mWidth < this.dg)
      this.mWidth = this.dg;
  }

  public final int getBottom()
  {
    return this.iK + this.mHeight;
  }

  public final int getHeight()
  {
    if (this.iZ == 8);
    for (int i = 0; ; i = this.mHeight)
      return i;
  }

  public final int getRight()
  {
    return this.iJ + this.mWidth;
  }

  public final int getWidth()
  {
    if (this.iZ == 8);
    for (int i = 0; ; i = this.mWidth)
      return i;
  }

  public final int getX()
  {
    return this.iJ;
  }

  public final int getY()
  {
    return this.iK;
  }

  public final void h(int paramInt1, int paramInt2)
  {
    this.iK = paramInt1;
    this.mHeight = (paramInt2 - paramInt1);
    if (this.mHeight < this.dh)
      this.mHeight = this.dh;
  }

  final void i(int paramInt1, int paramInt2)
  {
    if (paramInt2 == 0)
      this.iL = paramInt1;
    while (true)
    {
      return;
      if (paramInt2 == 1)
        this.iM = paramInt1;
    }
  }

  public void reset()
  {
    this.iu.reset();
    this.iw.reset();
    this.ix.reset();
    this.iy.reset();
    this.iz.reset();
    this.iA.reset();
    this.iB.reset();
    this.iC.reset();
    this.iG = null;
    this.it = 0.0F;
    this.mWidth = 0;
    this.mHeight = 0;
    this.iH = 0.0F;
    this.iI = -1;
    this.iJ = 0;
    this.iK = 0;
    this.iN = 0;
    this.iO = 0;
    this.iP = 0;
    this.iQ = 0;
    this.mOffsetX = 0;
    this.mOffsetY = 0;
    this.iR = 0;
    this.dg = 0;
    this.dh = 0;
    this.iS = 0;
    this.iT = 0;
    this.iV = iU;
    this.iW = iU;
    this.iF[0] = f.a.jq;
    this.iF[1] = f.a.jq;
    this.iX = null;
    this.iY = 0;
    this.iZ = 0;
    this.mType = null;
    this.jb = false;
    this.jc = false;
    this.jg = 0;
    this.jh = 0;
    this.ji = false;
    this.jj = false;
    this.jk[0] = -1.0F;
    this.jk[1] = -1.0F;
    this.hX = -1;
    this.hY = -1;
    this.is[0] = 2147483647;
    this.is[1] = 2147483647;
    this.ib = 0;
    this.ic = 0;
    this.ih = 1.0F;
    this.ik = 1.0F;
    this.ig = 2147483647;
    this.ij = 2147483647;
    this.jdField_if = 0;
    this.ii = 0;
    this.io = -1;
    this.iq = 1.0F;
    if (this.hZ != null)
      this.hZ.reset();
    if (this.ia != null)
      this.ia.reset();
    this.ir = null;
    this.jd = false;
    this.je = false;
    this.jf = false;
  }

  public final void setHeight(int paramInt)
  {
    this.mHeight = paramInt;
    if (this.mHeight < this.dh)
      this.mHeight = this.dh;
  }

  public final void setMinHeight(int paramInt)
  {
    if (paramInt < 0);
    for (this.dh = 0; ; this.dh = paramInt)
      return;
  }

  public final void setMinWidth(int paramInt)
  {
    if (paramInt < 0);
    for (this.dg = 0; ; this.dg = paramInt)
      return;
  }

  public void setOffset(int paramInt1, int paramInt2)
  {
    this.mOffsetX = paramInt1;
    this.mOffsetY = paramInt2;
  }

  public final void setWidth(int paramInt)
  {
    this.mWidth = paramInt;
    if (this.mWidth < this.dg)
      this.mWidth = this.dg;
  }

  public final void setX(int paramInt)
  {
    this.iJ = paramInt;
  }

  public final void setY(int paramInt)
  {
    this.iK = paramInt;
  }

  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    if (this.mType != null)
    {
      str = "type: " + this.mType + " ";
      localStringBuilder = localStringBuilder.append(str);
      if (this.ja == null)
        break label182;
    }
    label182: for (String str = "id: " + this.ja + " "; ; str = "")
    {
      return str + "(" + this.iJ + ", " + this.iK + ") - (" + this.mWidth + " x " + this.mHeight + ") wrap: (" + this.iS + " x " + this.iT + ")";
      str = "";
      break;
    }
  }

  public void u(int paramInt)
  {
    k.a(paramInt, this);
  }

  public final int v(int paramInt)
  {
    if (paramInt == 0)
      paramInt = getWidth();
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
        paramInt = getHeight();
      else
        paramInt = 0;
    }
  }

  final int w(int paramInt)
  {
    if (paramInt == 0)
      paramInt = this.iL;
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
        paramInt = this.iM;
      else
        paramInt = 0;
    }
  }

  public final f.a x(int paramInt)
  {
    f.a locala;
    if (paramInt == 0)
      locala = this.iF[0];
    while (true)
    {
      return locala;
      if (paramInt == 1)
        locala = this.iF[1];
      else
        locala = null;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     android.support.constraint.a.a.f
 * JD-Core Version:    0.6.2
 */