package android.support.constraint.a.a;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class a
{
  private static int a(f paramf)
  {
    int i = -1;
    if (paramf.aW() == f.a.js)
      if (paramf.iI == 0)
      {
        i = (int)(paramf.getHeight() * paramf.iH);
        paramf.setWidth(i);
      }
    while (paramf.aX() != f.a.js)
      while (true)
      {
        return i;
        i = (int)(paramf.getHeight() / paramf.iH);
      }
    if (paramf.iI == 1);
    for (i = (int)(paramf.getWidth() * paramf.iH); ; i = (int)(paramf.getWidth() / paramf.iH))
    {
      paramf.setHeight(i);
      break;
    }
  }

  private static int a(f paramf, int paramInt)
  {
    int i = paramInt * 2;
    e locale1 = paramf.iD[i];
    e locale2 = paramf.iD[(i + 1)];
    float f;
    if ((locale1.hy != null) && (locale1.hy.hw == paramf.iG) && (locale2.hy != null) && (locale2.hy.hw == paramf.iG))
    {
      i = paramf.iG.v(paramInt);
      if (paramInt == 0)
      {
        f = paramf.iV;
        paramInt = paramf.v(paramInt);
      }
    }
    for (paramInt = (int)(f * (i - locale1.aH() - locale2.aH() - paramInt)); ; paramInt = 0)
    {
      return paramInt;
      f = paramf.iW;
      break;
    }
  }

  private static int a(f paramf, int paramInt1, boolean paramBoolean, int paramInt2)
  {
    if (!paramf.jd)
    {
      paramInt2 = 0;
      return paramInt2;
    }
    int i;
    int j;
    int k;
    int m;
    label61: int i1;
    int i2;
    label98: int i3;
    int i4;
    int i5;
    if ((paramf.iz.hy != null) && (paramInt1 == 1))
    {
      i = 1;
      if (!paramBoolean)
        break label225;
      j = paramf.iR;
      k = paramf.getHeight() - paramf.iR;
      m = paramInt1 * 2;
      n = m + 1;
      if ((paramf.iD[n].hy == null) || (paramf.iD[m].hy != null))
        break label256;
      i1 = -1;
      i2 = m;
      m = n;
      i3 = paramInt2;
      if (i != 0)
        i3 = paramInt2 - j;
      i4 = paramf.iD[m].aH() * i1 + a(paramf, paramInt1);
      i5 = i4 + i3;
      if (paramInt1 != 0)
        break label266;
    }
    int i6;
    label256: label266: for (paramInt2 = paramf.getWidth(); ; paramInt2 = paramf.getHeight())
    {
      i6 = paramInt2 * i1;
      localObject = paramf.iD[m].hv.kt.iterator();
      for (paramInt2 = 0; ((Iterator)localObject).hasNext(); paramInt2 = Math.max(paramInt2, a(((m)((Iterator)localObject).next()).kj.hw, paramInt1, paramBoolean, i5)));
      i = 0;
      break;
      label225: j = paramf.getHeight() - paramf.iR;
      k = paramf.iR;
      n = paramInt1 * 2;
      m = n + 1;
      break label61;
      i1 = 1;
      i2 = n;
      break label98;
    }
    Object localObject = paramf.iD[i2].hv.kt.iterator();
    for (int n = 0; ((Iterator)localObject).hasNext(); n = Math.max(n, a(((m)((Iterator)localObject).next()).kj.hw, paramInt1, paramBoolean, i6 + i5)));
    int i7;
    int i8;
    Iterator localIterator;
    if (i != 0)
    {
      i7 = n + k;
      i8 = paramInt2 - j;
      if (paramInt1 == 1)
      {
        localIterator = paramf.iz.hv.kt.iterator();
        paramInt2 = 0;
      }
    }
    else
    {
      while (true)
      {
        if (!localIterator.hasNext())
          break label505;
        localObject = (m)localIterator.next();
        if (i1 == 1)
        {
          paramInt2 = Math.max(paramInt2, a(((m)localObject).kj.hw, paramInt1, paramBoolean, j + i5));
          continue;
          if (paramInt1 == 0);
          for (i7 = paramf.getWidth(); ; i7 = paramf.getHeight())
          {
            i7 = i7 * i1 + n;
            i8 = paramInt2;
            break;
          }
        }
        else
        {
          paramInt2 = Math.max(paramInt2, a(((m)localObject).kj.hw, paramInt1, paramBoolean, k * i1 + i5));
        }
      }
      label505: n = paramInt2;
      if (paramf.iz.hv.kt.size() > 0)
      {
        n = paramInt2;
        if (i == 0)
        {
          if (i1 != 1)
            break label722;
          n = paramInt2 + j;
        }
      }
    }
    while (true)
    {
      label544: j = Math.max(i8, Math.max(i7, n)) + i4;
      paramInt2 = i3 + i4;
      n = paramInt2 + i6;
      if (i1 == -1);
      while (true)
      {
        if (paramBoolean)
        {
          k.b(paramf, paramInt1, n);
          paramf.e(n, paramInt2, paramInt1);
        }
        while (true)
        {
          if ((paramf.x(paramInt1) == f.a.js) && (paramf.iH != 0.0F))
            paramf.ir.c(paramf, paramInt1);
          paramInt2 = j;
          if (paramf.iD[m].hy == null)
            break;
          paramInt2 = j;
          if (paramf.iD[i2].hy == null)
            break;
          localObject = paramf.iG;
          paramInt2 = j;
          if (paramf.iD[m].hy.hw != localObject)
            break;
          paramInt2 = j;
          if (paramf.iD[i2].hy.hw != localObject)
            break;
          paramf.ir.c(paramf, paramInt1);
          paramInt2 = j;
          break;
          label722: n = paramInt2 - k;
          break label544;
          paramf.ir.c(paramf, paramInt1);
          paramf.i(n, paramInt1);
        }
        i = n;
        n = paramInt2;
        paramInt2 = i;
      }
      n = 0;
    }
  }

  private static int a(h paramh, int paramInt)
  {
    int i = paramInt * 2;
    List localList;
    int k;
    int m;
    label27: f localf;
    if (paramInt == 0)
    {
      localList = paramh.jT;
      int j = localList.size();
      k = 0;
      m = 0;
      if (k >= j)
        break label139;
      localf = (f)localList.get(k);
      if ((localf.iD[(i + 1)].hy != null) && ((localf.iD[i].hy == null) || (localf.iD[(i + 1)].hy == null)))
        break label133;
    }
    label133: for (boolean bool = true; ; bool = false)
    {
      m = Math.max(m, a(localf, paramInt, bool, 0));
      k++;
      break label27;
      if (paramInt == 1)
      {
        localList = paramh.jU;
        break;
      }
      localList = null;
      break;
    }
    label139: paramh.jS[paramInt] = m;
    return m;
  }

  private static void a(f paramf, int paramInt1, int paramInt2)
  {
    int i = paramInt1 * 2;
    e locale1 = paramf.iD[i];
    e locale2 = paramf.iD[(i + 1)];
    int j;
    if ((locale1.hy != null) && (locale2.hy != null))
    {
      j = 1;
      if (j == 0)
        break label69;
      k.b(paramf, paramInt1, a(paramf, paramInt1) + locale1.aH());
    }
    while (true)
    {
      return;
      j = 0;
      break;
      label69: if ((paramf.iH != 0.0F) && (paramf.x(paramInt1) == f.a.js))
      {
        paramInt2 = a(paramf);
        j = (int)paramf.iD[i].hv.km;
        locale2.hv.kl = locale1.hv;
        locale2.hv.km = paramInt2;
        locale2.hv.state = 1;
        paramf.e(j, j + paramInt2, paramInt1);
      }
      else
      {
        paramInt2 -= paramf.w(paramInt1);
        j = paramInt2 - paramf.v(paramInt1);
        paramf.e(j, paramInt2, paramInt1);
        k.b(paramf, paramInt1, j);
      }
    }
  }

  public static void a(g paramg)
  {
    if ((paramg.dl & 0x20) != 32)
      b(paramg);
    while (true)
    {
      return;
      paramg.jL = true;
      paramg.jG = false;
      paramg.jH = false;
      paramg.jI = false;
      Object localObject1 = paramg.kx;
      List localList = paramg.jF;
      int i;
      int j;
      if (paramg.aW() == f.a.jr)
      {
        i = 1;
        if (paramg.aX() != f.a.jr)
          break label145;
        j = 1;
        label72: if ((i == 0) && (j == 0))
          break label151;
      }
      Object localObject2;
      label145: label151: for (boolean bool = true; ; bool = false)
      {
        localList.clear();
        localIterator = ((List)localObject1).iterator();
        while (localIterator.hasNext())
        {
          localObject2 = (f)localIterator.next();
          ((f)localObject2).ir = null;
          ((f)localObject2).jf = false;
          ((f)localObject2).aD();
        }
        i = 0;
        break;
        j = 0;
        break label72;
      }
      Iterator localIterator = ((List)localObject1).iterator();
      while (true)
        if (localIterator.hasNext())
        {
          localObject1 = (f)localIterator.next();
          if (((f)localObject1).ir == null)
          {
            localObject2 = new h(new ArrayList(), (byte)0);
            localList.add(localObject2);
            if (!a((f)localObject1, (h)localObject2, localList, bool))
            {
              b(paramg);
              paramg.jL = false;
              break;
            }
          }
        }
      localIterator = localList.iterator();
      int k = 0;
      int m = 0;
      while (localIterator.hasNext())
      {
        localObject1 = (h)localIterator.next();
        m = Math.max(m, a((h)localObject1, 0));
        k = Math.max(k, a((h)localObject1, 1));
      }
      if (i != 0)
      {
        paramg.a(f.a.jq);
        paramg.setWidth(m);
        paramg.jG = true;
        paramg.jH = true;
        paramg.jJ = m;
      }
      if (j != 0)
      {
        paramg.b(f.a.jq);
        paramg.setHeight(k);
        paramg.jG = true;
        paramg.jI = true;
        paramg.jK = k;
      }
      a(localList, 0, paramg.getWidth());
      a(localList, 1, paramg.getHeight());
    }
  }

  private static void a(g paramg, f paramf, h paramh)
  {
    paramh.jL = false;
    paramg.jL = false;
    paramf.jd = false;
  }

  public static void a(List<h> paramList, int paramInt1, int paramInt2)
  {
    int i = paramList.size();
    for (int j = 0; j < i; j++)
    {
      Iterator localIterator = ((h)paramList.get(j)).A(paramInt1).iterator();
      while (localIterator.hasNext())
      {
        f localf = (f)localIterator.next();
        if (localf.jd)
          a(localf, paramInt1, paramInt2);
      }
    }
  }

  private static boolean a(f paramf, h paramh, List<h> paramList, boolean paramBoolean)
  {
    boolean bool1 = false;
    boolean bool2;
    if (paramf == null)
      bool2 = true;
    while (true)
    {
      return bool2;
      paramf.je = false;
      g localg = (g)paramf.iG;
      Object localObject;
      int i;
      label311: int j;
      if (paramf.ir == null)
      {
        paramf.jd = true;
        paramh.jP.add(paramf);
        paramf.ir = paramh;
        if ((paramf.iu.hy == null) && (paramf.ix.hy == null) && (paramf.iw.hy == null) && (paramf.iy.hy == null) && (paramf.iz.hy == null) && (paramf.iC.hy == null))
        {
          a(localg, paramf, paramh);
          bool2 = bool1;
          if (paramBoolean);
        }
        else if ((paramf.iw.hy != null) && (paramf.iy.hy != null))
        {
          localObject = f.a.jr;
          if (paramBoolean)
          {
            a(localg, paramf, paramh);
            bool2 = bool1;
          }
          else if ((paramf.iw.hy.hw != paramf.iG) || (paramf.iy.hy.hw != paramf.iG))
          {
            a(localg, paramf, paramh);
          }
        }
        else if ((paramf.iu.hy != null) && (paramf.ix.hy != null))
        {
          localObject = f.a.jr;
          if (paramBoolean)
          {
            a(localg, paramf, paramh);
            bool2 = bool1;
          }
          else if ((paramf.iu.hy.hw != paramf.iG) || (paramf.ix.hy.hw != paramf.iG))
          {
            a(localg, paramf, paramh);
          }
        }
        else
        {
          if (paramf.aW() == f.a.js)
          {
            i = 1;
            if (paramf.aX() != f.a.js)
              break label796;
            j = 1;
            label324: if (((i ^ j) == 0) || (paramf.iH == 0.0F))
              break label802;
            a(paramf);
          }
          label796: label802: 
          do
          {
            do
            {
              if (((paramf.iu.hy == null) && (paramf.ix.hy == null)) || ((paramf.iu.hy != null) && (paramf.iu.hy.hw == paramf.iG) && (paramf.ix.hy == null)) || ((paramf.ix.hy != null) && (paramf.ix.hy.hw == paramf.iG) && (paramf.iu.hy == null)) || ((paramf.iu.hy != null) && (paramf.iu.hy.hw == paramf.iG) && (paramf.ix.hy != null) && (paramf.ix.hy.hw == paramf.iG) && (paramf.iC.hy == null) && (!(paramf instanceof i)) && (!(paramf instanceof j))))
                paramh.jT.add(paramf);
              if (((paramf.iw.hy == null) && (paramf.iy.hy == null)) || ((paramf.iw.hy != null) && (paramf.iw.hy.hw == paramf.iG) && (paramf.iy.hy == null)) || ((paramf.iy.hy != null) && (paramf.iy.hy.hw == paramf.iG) && (paramf.iw.hy == null)) || ((paramf.iw.hy != null) && (paramf.iw.hy.hw == paramf.iG) && (paramf.iy.hy != null) && (paramf.iy.hy.hw == paramf.iG) && (paramf.iC.hy == null) && (paramf.iz.hy == null) && (!(paramf instanceof i)) && (!(paramf instanceof j))))
                paramh.jU.add(paramf);
              if (!(paramf instanceof j))
                break label969;
              a(localg, paramf, paramh);
              bool2 = bool1;
              if (paramBoolean)
                break;
              localObject = (j)paramf;
              for (i = 0; ; i++)
              {
                if (i >= ((j)localObject).hn)
                  break label969;
                bool2 = bool1;
                if (!a(localObject.kh[i], paramh, paramList, paramBoolean))
                  break;
              }
              i = 0;
              break label311;
              j = 0;
              break label324;
            }
            while ((paramf.aW() != f.a.js) && (paramf.aX() != f.a.js));
            a(localg, paramf, paramh);
          }
          while (!paramBoolean);
          bool2 = bool1;
        }
      }
      else
      {
        if (paramf.ir != paramh)
        {
          paramh.jP.addAll(paramf.ir.jP);
          paramh.jT.addAll(paramf.ir.jT);
          paramh.jU.addAll(paramf.ir.jU);
          if (!paramf.ir.jL)
            paramh.jL = false;
          paramList.remove(paramf.ir);
          paramf = paramf.ir.jP.iterator();
          while (paramf.hasNext())
            ((f)paramf.next()).ir = paramh;
        }
        bool2 = true;
        continue;
        label969: j = paramf.iD.length;
        i = 0;
        label979: if (i < j)
        {
          e locale = paramf.iD[i];
          if ((locale.hy != null) && (locale.hy.hw != paramf.iG))
          {
            if (locale.hx == e.c.hT)
            {
              a(localg, paramf, paramh);
              bool2 = bool1;
              if (paramBoolean)
                continue;
            }
          }
          else
            while (true)
            {
              bool2 = bool1;
              if (!a(locale.hy.hw, paramh, paramList, paramBoolean))
                break;
              i++;
              break label979;
              localObject = locale.hv;
              if ((locale.hy != null) && (locale.hy.hy != locale))
                locale.hy.hv.a((o)localObject);
            }
        }
        else
        {
          bool2 = true;
        }
      }
    }
  }

  private static void b(g paramg)
  {
    paramg.jF.clear();
    paramg.jF.add(0, new h(paramg.kx));
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     android.support.constraint.a.a.a
 * JD-Core Version:    0.6.2
 */