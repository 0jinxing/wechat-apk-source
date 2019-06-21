package android.support.v7.widget;

import android.support.v4.f.k.a;
import android.support.v4.f.k.b;
import java.util.ArrayList;
import java.util.List;

final class f
  implements al.a
{
  private k.a<b> aeW = new k.b(30);
  final ArrayList<b> aeX = new ArrayList();
  final ArrayList<b> aeY = new ArrayList();
  final f.a aeZ;
  Runnable afa;
  final boolean afb;
  final al afc;
  int afd = 0;

  f(f.a parama)
  {
    this(parama, (byte)0);
  }

  private f(f.a parama, byte paramByte)
  {
    this.aeZ = parama;
    this.afb = false;
    this.afc = new al(this);
  }

  private int M(int paramInt1, int paramInt2)
  {
    int i = this.aeY.size() - 1;
    b localb;
    if (i >= 0)
    {
      localb = (b)this.aeY.get(i);
      int j;
      int k;
      if (localb.Cn == 8)
        if (localb.afe < localb.afg)
        {
          j = localb.afe;
          k = localb.afg;
          label64: if ((paramInt1 < j) || (paramInt1 > k))
            break label192;
          if (j != localb.afe)
            break label149;
          if (paramInt2 != 1)
            break label129;
          localb.afg += 1;
          label103: paramInt1++;
        }
      while (true)
      {
        i--;
        break;
        j = localb.afg;
        k = localb.afe;
        break label64;
        label129: if (paramInt2 != 2)
          break label103;
        localb.afg -= 1;
        break label103;
        label149: if (paramInt2 == 1)
          localb.afe += 1;
        while (true)
        {
          paramInt1--;
          break;
          if (paramInt2 == 2)
            localb.afe -= 1;
        }
        label192: if (paramInt1 < localb.afe)
        {
          if (paramInt2 == 1)
          {
            localb.afe += 1;
            localb.afg += 1;
          }
          else if (paramInt2 == 2)
          {
            localb.afe -= 1;
            localb.afg -= 1;
          }
        }
        else
        {
          continue;
          if (localb.afe <= paramInt1)
          {
            if (localb.Cn == 1)
              paramInt1 -= localb.afg;
            else if (localb.Cn == 2)
              paramInt1 = localb.afg + paramInt1;
          }
          else if (paramInt2 == 1)
            localb.afe += 1;
          else if (paramInt2 == 2)
            localb.afe -= 1;
        }
      }
    }
    paramInt2 = this.aeY.size() - 1;
    if (paramInt2 >= 0)
    {
      localb = (b)this.aeY.get(paramInt2);
      if (localb.Cn == 8)
        if ((localb.afg == localb.afe) || (localb.afg < 0))
        {
          this.aeY.remove(paramInt2);
          c(localb);
        }
      while (true)
      {
        paramInt2--;
        break;
        if (localb.afg <= 0)
        {
          this.aeY.remove(paramInt2);
          c(localb);
        }
      }
    }
    return paramInt1;
  }

  private void a(b paramb)
  {
    if ((paramb.Cn == 1) || (paramb.Cn == 8))
      throw new IllegalArgumentException("should not dispatch add or move for pre layout");
    int i = M(paramb.afe, paramb.Cn);
    int j = paramb.afe;
    int k;
    int m;
    int n;
    label102: int i1;
    switch (paramb.Cn)
    {
    case 3:
    default:
      throw new IllegalArgumentException("op should be remove or update.".concat(String.valueOf(paramb)));
    case 4:
      k = 1;
      m = 1;
      n = 1;
      if (m >= paramb.afg)
        break label291;
      i1 = M(paramb.afe + k * m, paramb.Cn);
      switch (paramb.Cn)
      {
      case 3:
      default:
        i2 = 0;
        label163: if (i2 == 0);
        break;
      case 4:
      case 2:
      }
      break;
    case 2:
    }
    for (int i2 = n + 1; ; i2 = n)
    {
      m++;
      n = i2;
      break label102;
      k = 0;
      break;
      if (i1 == i + 1)
      {
        i2 = 1;
        break label163;
      }
      i2 = 0;
      break label163;
      if (i1 == i)
      {
        i2 = 1;
        break label163;
      }
      i2 = 0;
      break label163;
      localObject = a(paramb.Cn, i, n, paramb.aff);
      a((b)localObject, j);
      c((b)localObject);
      i2 = j;
      if (paramb.Cn == 4)
        i2 = j + n;
      n = 1;
      i = i1;
      j = i2;
    }
    label291: Object localObject = paramb.aff;
    c(paramb);
    if (n > 0)
    {
      paramb = a(paramb.Cn, i, n, localObject);
      a(paramb, j);
      c(paramb);
    }
  }

  private void a(b paramb, int paramInt)
  {
    this.aeZ.d(paramb);
    switch (paramb.Cn)
    {
    case 3:
    default:
      throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
    case 2:
      this.aeZ.O(paramInt, paramb.afg);
    case 4:
    }
    while (true)
    {
      return;
      this.aeZ.b(paramInt, paramb.afg, paramb.aff);
    }
  }

  private void b(b paramb)
  {
    this.aeY.add(paramb);
    switch (paramb.Cn)
    {
    case 3:
    case 5:
    case 6:
    case 7:
    default:
      throw new IllegalArgumentException("Unknown update op type for ".concat(String.valueOf(paramb)));
    case 1:
      this.aeZ.Q(paramb.afe, paramb.afg);
    case 8:
    case 2:
    case 4:
    }
    while (true)
    {
      return;
      this.aeZ.R(paramb.afe, paramb.afg);
      continue;
      this.aeZ.P(paramb.afe, paramb.afg);
      continue;
      this.aeZ.b(paramb.afe, paramb.afg, paramb.aff);
    }
  }

  private boolean by(int paramInt)
  {
    int i = this.aeY.size();
    int j = 0;
    b localb;
    boolean bool;
    if (j < i)
    {
      localb = (b)this.aeY.get(j);
      if (localb.Cn == 8)
      {
        if (N(localb.afg, j + 1) != paramInt)
          break label125;
        bool = true;
      }
    }
    while (true)
    {
      return bool;
      if (localb.Cn == 1)
      {
        int k = localb.afe;
        int m = localb.afg;
        for (int n = localb.afe; ; n++)
        {
          if (n >= k + m)
            break label125;
          if (N(n, j + 1) == paramInt)
          {
            bool = true;
            break;
          }
        }
      }
      label125: j++;
      break;
      bool = false;
    }
  }

  private void n(List<b> paramList)
  {
    int i = paramList.size();
    for (int j = 0; j < i; j++)
      c((b)paramList.get(j));
    paramList.clear();
  }

  final int N(int paramInt1, int paramInt2)
  {
    int i = this.aeY.size();
    int j = paramInt2;
    paramInt2 = paramInt1;
    paramInt1 = paramInt2;
    b localb;
    if (j < i)
    {
      localb = (b)this.aeY.get(j);
      if (localb.Cn == 8)
        if (localb.afe == paramInt2)
          paramInt1 = localb.afg;
    }
    while (true)
    {
      j++;
      paramInt2 = paramInt1;
      break;
      int k = paramInt2;
      if (localb.afe < paramInt2)
        k = paramInt2 - 1;
      paramInt1 = k;
      if (localb.afg <= k)
      {
        paramInt1 = k + 1;
        continue;
        paramInt1 = paramInt2;
        if (localb.afe <= paramInt2)
          if (localb.Cn == 2)
          {
            if (paramInt2 < localb.afe + localb.afg)
            {
              paramInt1 = -1;
              return paramInt1;
            }
            paramInt1 = paramInt2 - localb.afg;
          }
          else
          {
            paramInt1 = paramInt2;
            if (localb.Cn == 1)
              paramInt1 = paramInt2 + localb.afg;
          }
      }
    }
  }

  public final b a(int paramInt1, int paramInt2, int paramInt3, Object paramObject)
  {
    b localb = (b)this.aeW.aA();
    if (localb == null);
    for (paramObject = new b(paramInt1, paramInt2, paramInt3, paramObject); ; paramObject = localb)
    {
      return paramObject;
      localb.Cn = paramInt1;
      localb.afe = paramInt2;
      localb.afg = paramInt3;
      localb.aff = paramObject;
    }
  }

  final int bA(int paramInt)
  {
    return N(paramInt, 0);
  }

  public final int bB(int paramInt)
  {
    int i = this.aeX.size();
    int j = 0;
    int k = paramInt;
    paramInt = k;
    b localb;
    if (j < i)
    {
      localb = (b)this.aeX.get(j);
      switch (localb.Cn)
      {
      default:
        paramInt = k;
      case 1:
      case 2:
      case 8:
      }
    }
    while (true)
    {
      j++;
      k = paramInt;
      break;
      paramInt = k;
      if (localb.afe <= k)
      {
        paramInt = k + localb.afg;
        continue;
        paramInt = k;
        if (localb.afe <= k)
        {
          if (localb.afe + localb.afg > k)
          {
            paramInt = -1;
            return paramInt;
          }
          paramInt = k - localb.afg;
          continue;
          if (localb.afe == k)
          {
            paramInt = localb.afg;
          }
          else
          {
            int m = k;
            if (localb.afe < k)
              m = k - 1;
            paramInt = m;
            if (localb.afg <= m)
              paramInt = m + 1;
          }
        }
      }
    }
  }

  final boolean bz(int paramInt)
  {
    if ((this.afd & paramInt) != 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final void c(b paramb)
  {
    if (!this.afb)
    {
      paramb.aff = null;
      this.aeW.release(paramb);
    }
  }

  final void hu()
  {
    al localal = this.afc;
    ArrayList localArrayList = this.aeX;
    int j;
    label22: label53: int k;
    b localb1;
    b localb2;
    int m;
    while (true)
    {
      i = 0;
      j = localArrayList.size() - 1;
      if (j < 0)
        break label272;
      if (((b)localArrayList.get(j)).Cn != 8)
        break;
      if (i == 0)
        break label1868;
      i = j;
      if (i == -1)
        break label1254;
      k = i + 1;
      localb1 = (b)localArrayList.get(i);
      localb2 = (b)localArrayList.get(k);
      switch (localb2.Cn)
      {
      case 3:
      default:
        break;
      case 1:
        j = 0;
        if (localb1.afg < localb2.afe)
          j = -1;
        m = j;
        if (localb1.afe < localb2.afe)
          m = j + 1;
        if (localb2.afe <= localb1.afe)
          localb1.afe += localb2.afg;
        if (localb2.afe <= localb1.afg)
          localb1.afg += localb2.afg;
        localb2.afe = (m + localb2.afe);
        localArrayList.set(i, localb2);
        localArrayList.set(k, localb1);
      case 2:
      case 4:
      }
    }
    int i = 1;
    label272: label579: label967: label1868: 
    while (true)
    {
      j--;
      break label22;
      i = -1;
      break label53;
      b localb3 = null;
      int n = 0;
      int i1;
      if (localb1.afe < localb1.afg)
      {
        i1 = 0;
        m = i1;
        j = n;
        if (localb2.afe == localb1.afe)
        {
          m = i1;
          j = n;
          if (localb2.afg == localb1.afg - localb1.afe)
          {
            j = 1;
            m = i1;
          }
        }
        label354: if (localb1.afg >= localb2.afe)
          break label505;
        localb2.afe -= 1;
        label379: if (localb1.afe > localb2.afe)
          break label579;
        localb2.afe += 1;
      }
      while (true)
      {
        if (j == 0)
          break label666;
        localArrayList.set(i, localb2);
        localArrayList.remove(k);
        localal.amO.c(localb1);
        break;
        i1 = 1;
        m = i1;
        j = n;
        if (localb2.afe != localb1.afg + 1)
          break label354;
        m = i1;
        j = n;
        if (localb2.afg != localb1.afe - localb1.afg)
          break label354;
        j = 1;
        m = i1;
        break label354;
        label505: if (localb1.afg >= localb2.afe + localb2.afg)
          break label379;
        localb2.afg -= 1;
        localb1.Cn = 2;
        localb1.afg = 1;
        if (localb2.afg != 0)
          break;
        localArrayList.remove(k);
        localal.amO.c(localb2);
        break;
        if (localb1.afe < localb2.afe + localb2.afg)
        {
          i2 = localb2.afe;
          i1 = localb2.afg;
          n = localb1.afe;
          localb3 = localal.amO.a(2, localb1.afe + 1, i2 + i1 - n, null);
          localb2.afg = (localb1.afe - localb2.afe);
        }
      }
      if (m != 0)
      {
        if (localb3 != null)
        {
          if (localb1.afe > localb3.afe)
            localb1.afe -= localb3.afg;
          if (localb1.afg > localb3.afe)
            localb1.afg -= localb3.afg;
        }
        if (localb1.afe > localb2.afe)
          localb1.afe -= localb2.afg;
        if (localb1.afg > localb2.afe)
          localb1.afg -= localb2.afg;
        localArrayList.set(i, localb2);
        if (localb1.afe == localb1.afg)
          break label967;
        localArrayList.set(k, localb1);
      }
      while (localb3 != null)
      {
        localArrayList.add(i, localb3);
        break;
        if (localb3 != null)
        {
          if (localb1.afe >= localb3.afe)
            localb1.afe -= localb3.afg;
          if (localb1.afg >= localb3.afe)
            localb1.afg -= localb3.afg;
        }
        if (localb1.afe >= localb2.afe)
          localb1.afe -= localb2.afg;
        if (localb1.afg < localb2.afe)
          break label792;
        localb1.afg -= localb2.afg;
        break label792;
        localArrayList.remove(k);
      }
      localb3 = null;
      Object localObject = null;
      if (localb1.afg < localb2.afe)
      {
        localb2.afe -= 1;
        label1010: if (localb1.afe > localb2.afe)
          break label1152;
        localb2.afe += 1;
        localArrayList.set(k, localb1);
        if (localb2.afg <= 0)
          break label1232;
        localArrayList.set(i, localb2);
      }
      while (true)
      {
        if (localb3 != null)
          localArrayList.add(i, localb3);
        if (localObject == null)
          break;
        localArrayList.add(i, localObject);
        break;
        if (localb1.afg >= localb2.afe + localb2.afg)
          break label1010;
        localb2.afg -= 1;
        localb3 = localal.amO.a(4, localb1.afe, 1, localb2.aff);
        break label1010;
        if (localb1.afe >= localb2.afe + localb2.afg)
          break label1035;
        j = localb2.afe + localb2.afg - localb1.afe;
        localObject = localal.amO.a(4, localb1.afe + 1, j, localb2.aff);
        localb2.afg -= j;
        break label1035;
        label1232: localArrayList.remove(i);
        localal.amO.c(localb2);
      }
      label1254: int i3 = this.aeX.size();
      int i2 = 0;
      if (i2 < i3)
      {
        localb3 = (b)this.aeX.get(i2);
        switch (localb3.Cn)
        {
        case 3:
        case 5:
        case 6:
        case 7:
        default:
        case 1:
        case 2:
        case 4:
        case 8:
        }
        while (true)
        {
          if (this.afa != null)
            this.afa.run();
          i2++;
          break;
          b(localb3);
          continue;
          int i4 = localb3.afe;
          j = localb3.afe;
          i = localb3.afg + j;
          k = -1;
          j = localb3.afe;
          i1 = 0;
          if (j < i)
          {
            m = 0;
            n = 0;
            if ((this.aeZ.bC(j) != null) || (by(j)))
            {
              if (k == 0)
              {
                a(a(2, i4, i1, null));
                n = 1;
              }
              m = 1;
              if (n == 0)
                break label1542;
              n = j - i1;
              i -= i1;
            }
            for (j = 1; ; j = i1)
            {
              n++;
              i1 = j;
              j = n;
              k = m;
              break;
              if (k == 1)
              {
                b(a(2, i4, i1, null));
                m = 1;
              }
              k = 0;
              n = m;
              m = k;
              break label1467;
              i1++;
              n = j;
            }
          }
          localObject = localb3;
          if (i1 != localb3.afg)
          {
            c(localb3);
            localObject = a(2, i4, i1, null);
          }
          if (k == 0)
          {
            a((b)localObject);
          }
          else
          {
            b((b)localObject);
            continue;
            i = localb3.afe;
            m = 0;
            int i5 = localb3.afe;
            int i6 = localb3.afg;
            i4 = -1;
            j = localb3.afe;
            if (j < i5 + i6)
            {
              if ((this.aeZ.bC(j) != null) || (by(j)))
              {
                i1 = i;
                k = m;
                if (i4 == 0)
                {
                  a(a(4, i, m, localb3.aff));
                  k = 0;
                  i1 = j;
                }
                n = 1;
                i = i1;
              }
              while (true)
              {
                m = k + 1;
                j++;
                i4 = n;
                break;
                i1 = i;
                n = m;
                if (i4 == 1)
                {
                  b(a(4, i, m, localb3.aff));
                  n = 0;
                  i1 = j;
                }
                m = 0;
                i = i1;
                k = n;
                n = m;
              }
            }
            localObject = localb3;
            if (m != localb3.afg)
            {
              localObject = localb3.aff;
              c(localb3);
              localObject = a(4, i, m, localObject);
            }
            if (i4 == 0)
            {
              a((b)localObject);
            }
            else
            {
              b((b)localObject);
              continue;
              b(localb3);
            }
          }
        }
      }
      this.aeX.clear();
      return;
    }
  }

  final void hv()
  {
    int i = this.aeY.size();
    for (int j = 0; j < i; j++)
      this.aeZ.e((b)this.aeY.get(j));
    n(this.aeY);
    this.afd = 0;
  }

  final boolean hw()
  {
    if (this.aeX.size() > 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  final void hx()
  {
    hv();
    int i = this.aeX.size();
    int j = 0;
    if (j < i)
    {
      b localb = (b)this.aeX.get(j);
      switch (localb.Cn)
      {
      case 3:
      case 5:
      case 6:
      case 7:
      default:
      case 1:
      case 2:
      case 4:
      case 8:
      }
      while (true)
      {
        if (this.afa != null)
          this.afa.run();
        j++;
        break;
        this.aeZ.e(localb);
        this.aeZ.Q(localb.afe, localb.afg);
        continue;
        this.aeZ.e(localb);
        this.aeZ.O(localb.afe, localb.afg);
        continue;
        this.aeZ.e(localb);
        this.aeZ.b(localb.afe, localb.afg, localb.aff);
        continue;
        this.aeZ.e(localb);
        this.aeZ.R(localb.afe, localb.afg);
      }
    }
    n(this.aeX);
    this.afd = 0;
  }

  final boolean hy()
  {
    if ((!this.aeY.isEmpty()) && (!this.aeX.isEmpty()));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  final void reset()
  {
    n(this.aeX);
    n(this.aeY);
    this.afd = 0;
  }

  static final class b
  {
    int Cn;
    int afe;
    Object aff;
    int afg;

    b(int paramInt1, int paramInt2, int paramInt3, Object paramObject)
    {
      this.Cn = paramInt1;
      this.afe = paramInt2;
      this.afg = paramInt3;
      this.aff = paramObject;
    }

    public final boolean equals(Object paramObject)
    {
      boolean bool1 = true;
      boolean bool2;
      if (this == paramObject)
        bool2 = bool1;
      while (true)
      {
        return bool2;
        if ((paramObject == null) || (getClass() != paramObject.getClass()))
        {
          bool2 = false;
        }
        else
        {
          paramObject = (b)paramObject;
          if (this.Cn != paramObject.Cn)
          {
            bool2 = false;
          }
          else if ((this.Cn == 8) && (Math.abs(this.afg - this.afe) == 1) && (this.afg == paramObject.afe))
          {
            bool2 = bool1;
            if (this.afe == paramObject.afg);
          }
          else if (this.afg != paramObject.afg)
          {
            bool2 = false;
          }
          else if (this.afe != paramObject.afe)
          {
            bool2 = false;
          }
          else if (this.aff != null)
          {
            bool2 = bool1;
            if (!this.aff.equals(paramObject.aff))
              bool2 = false;
          }
          else
          {
            bool2 = bool1;
            if (paramObject.aff != null)
              bool2 = false;
          }
        }
      }
    }

    public final int hashCode()
    {
      return (this.Cn * 31 + this.afe) * 31 + this.afg;
    }

    public final String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder().append(Integer.toHexString(System.identityHashCode(this))).append("[");
      String str;
      switch (this.Cn)
      {
      case 3:
      case 5:
      case 6:
      case 7:
      default:
        str = "??";
      case 1:
      case 2:
      case 4:
      case 8:
      }
      while (true)
      {
        return str + ",s:" + this.afe + "c:" + this.afg + ",p:" + this.aff + "]";
        str = "add";
        continue;
        str = "rm";
        continue;
        str = "up";
        continue;
        str = "mv";
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.f
 * JD-Core Version:    0.6.2
 */