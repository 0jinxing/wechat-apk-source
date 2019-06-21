package android.support.v7.widget;

import android.util.Printer;
import android.view.View;
import android.view.View.MeasureSpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.List<Landroid.support.v7.widget.GridLayout.b;>;

final class GridLayout$d
{
  public final boolean ajQ;
  public int ajR = -2147483648;
  private int ajS = -2147483648;
  GridLayout.h<GridLayout.i, GridLayout.e> ajT;
  public boolean ajU = false;
  GridLayout.h<GridLayout.f, GridLayout.g> ajV;
  public boolean ajW = false;
  GridLayout.h<GridLayout.f, GridLayout.g> ajX;
  public boolean ajY = false;
  public int[] ajZ;
  public boolean aka = false;
  public int[] akb;
  public boolean akc = false;
  public GridLayout.b[] akd;
  public boolean ake = false;
  public int[] akf;
  public boolean akg = false;
  public boolean akh;
  public boolean aki = false;
  public int[] akj;
  boolean akk = true;
  private GridLayout.g akl = new GridLayout.g(0);
  private GridLayout.g akm = new GridLayout.g(-100000);

  static
  {
    if (!GridLayout.class.desiredAssertionStatus());
    for (boolean bool = true; ; bool = false)
    {
      $assertionsDisabled = bool;
      return;
    }
  }

  GridLayout$d(GridLayout paramGridLayout, boolean paramBoolean)
  {
    this.ajQ = paramBoolean;
  }

  private void X(int paramInt1, int paramInt2)
  {
    this.akl.value = paramInt1;
    this.akm.value = (-paramInt2);
    this.akg = false;
  }

  private int Y(int paramInt1, int paramInt2)
  {
    X(paramInt1, paramInt2);
    return iz()[getCount()];
  }

  private void a(GridLayout.h<GridLayout.f, GridLayout.g> paramh, boolean paramBoolean)
  {
    int i = 0;
    Object localObject = (GridLayout.g[])paramh.akP;
    for (int j = 0; j < localObject.length; j++)
      localObject[j].value = -2147483648;
    GridLayout.e[] arrayOfe = (GridLayout.e[])it().akP;
    j = i;
    if (j < arrayOfe.length)
    {
      i = arrayOfe[j].ac(paramBoolean);
      localObject = (GridLayout.g)paramh.bR(j);
      int k = ((GridLayout.g)localObject).value;
      if (paramBoolean);
      while (true)
      {
        ((GridLayout.g)localObject).value = Math.max(k, i);
        j++;
        break;
        i = -i;
      }
    }
  }

  private static void a(List<GridLayout.b> paramList, GridLayout.f paramf, GridLayout.g paramg)
  {
    a(paramList, paramf, paramg, true);
  }

  private static void a(List<GridLayout.b> paramList, GridLayout.f paramf, GridLayout.g paramg, boolean paramBoolean)
  {
    if (paramf.size() == 0);
    while (true)
    {
      return;
      if (paramBoolean)
      {
        Iterator localIterator = paramList.iterator();
        while (true)
          if (localIterator.hasNext())
            if (((GridLayout.b)localIterator.next()).ajL.equals(paramf))
              break;
      }
      paramList.add(new GridLayout.b(paramf, paramg));
    }
  }

  private static void a(List<GridLayout.b> paramList, GridLayout.h<GridLayout.f, GridLayout.g> paramh)
  {
    for (int i = 0; i < ((GridLayout.f[])paramh.akO).length; i++)
      a(paramList, ((GridLayout.f[])paramh.akO)[i], ((GridLayout.g[])paramh.akP)[i], false);
  }

  private static boolean a(int[] paramArrayOfInt, GridLayout.b paramb)
  {
    boolean bool = false;
    if (!paramb.ajN);
    while (true)
    {
      return bool;
      GridLayout.f localf = paramb.ajL;
      int i = localf.min;
      int j = localf.max;
      int k = paramb.ajM.value;
      i = paramArrayOfInt[i] + k;
      if (i > paramArrayOfInt[j])
      {
        paramArrayOfInt[j] = i;
        bool = true;
      }
    }
  }

  private boolean a(GridLayout.b[] paramArrayOfb, int[] paramArrayOfInt, boolean paramBoolean)
  {
    boolean bool1 = false;
    int i = 0;
    if (this.ajQ);
    int j;
    Object localObject1;
    int k;
    int m;
    label46: int i1;
    boolean bool2;
    for (String str = "horizontal"; ; str = "vertical")
    {
      j = getCount() + 1;
      localObject1 = null;
      k = 0;
      if (k >= paramArrayOfb.length)
        break label390;
      Arrays.fill(paramArrayOfInt, 0);
      m = 0;
      if (m >= j)
        break label251;
      int n = paramArrayOfb.length;
      i1 = 0;
      bool2 = false;
      while (i1 < n)
      {
        bool2 |= a(paramArrayOfInt, paramArrayOfb[i1]);
        i1++;
      }
    }
    Object localObject2;
    Object localObject3;
    boolean bool3;
    if (!bool2)
    {
      if (localObject1 != null)
      {
        localObject2 = new ArrayList();
        localObject3 = new ArrayList();
        for (k = i; k < paramArrayOfb.length; k++)
        {
          paramArrayOfInt = paramArrayOfb[k];
          if (localObject1[k] != 0)
            ((List)localObject2).add(paramArrayOfInt);
          if (!paramArrayOfInt.ajN)
            ((List)localObject3).add(paramArrayOfInt);
        }
        this.akn.mPrinter.println(str + " constraints: " + q((List)localObject2) + " are inconsistent; permanently removing: " + q((List)localObject3) + ". ");
      }
      bool3 = true;
    }
    while (true)
    {
      return bool3;
      m++;
      break label46;
      label251: bool3 = bool1;
      if (paramBoolean)
      {
        localObject2 = new boolean[paramArrayOfb.length];
        for (m = 0; m < j; m++)
        {
          int i2 = paramArrayOfb.length;
          for (i1 = 0; i1 < i2; i1++)
            localObject2[i1] |= a(paramArrayOfInt, paramArrayOfb[i1]);
        }
        if (k == 0)
          localObject1 = localObject2;
        for (m = 0; ; m++)
          if (m < paramArrayOfb.length)
          {
            if (localObject2[m] != 0)
            {
              localObject3 = paramArrayOfb[m];
              if (((GridLayout.b)localObject3).ajL.min >= ((GridLayout.b)localObject3).ajL.max)
                ((GridLayout.b)localObject3).ajN = false;
            }
          }
          else
          {
            k++;
            break;
          }
        label390: bool3 = true;
      }
    }
  }

  private GridLayout.h<GridLayout.f, GridLayout.g> ae(boolean paramBoolean)
  {
    GridLayout.c localc = GridLayout.c.a(GridLayout.f.class, GridLayout.g.class);
    GridLayout.i[] arrayOfi = (GridLayout.i[])it().akO;
    int i = arrayOfi.length;
    int j = 0;
    if (j < i)
    {
      if (paramBoolean);
      for (GridLayout.f localf = arrayOfi[j].ajL; ; localf = new GridLayout.f(localf.max, localf.min))
      {
        localc.f(localf, new GridLayout.g());
        j++;
        break;
        localf = arrayOfi[j].ajL;
      }
    }
    return localc.ip();
  }

  private void f(int paramInt, float paramFloat)
  {
    Arrays.fill(this.akj, 0);
    int i = this.akn.getChildCount();
    int j = 0;
    int k = paramInt;
    paramInt = j;
    Object localObject;
    if (paramInt < i)
    {
      localObject = this.akn.getChildAt(paramInt);
      if (((View)localObject).getVisibility() == 8)
        break label135;
      localObject = GridLayout.bc((View)localObject);
      if (this.ajQ)
      {
        localObject = ((GridLayout.LayoutParams)localObject).akM;
        label71: float f = ((GridLayout.i)localObject).weight;
        if (f == 0.0F)
          break label135;
        j = Math.round(k * f / paramFloat);
        this.akj[paramInt] = j;
        k -= j;
        paramFloat -= f;
      }
    }
    label135: 
    while (true)
    {
      paramInt++;
      break;
      localObject = ((GridLayout.LayoutParams)localObject).akL;
      break label71;
      return;
    }
  }

  private boolean h(int[] paramArrayOfInt)
  {
    return a(ix(), paramArrayOfInt, true);
  }

  private void i(int[] paramArrayOfInt)
  {
    float f = 0.0F;
    boolean bool1 = true;
    int i = 0;
    int j;
    int k;
    Object localObject;
    label75: boolean bool2;
    if (!this.aki)
    {
      j = this.akn.getChildCount();
      k = 0;
      if (k >= j)
        break label172;
      localObject = this.akn.getChildAt(k);
      if (((View)localObject).getVisibility() == 8)
        break label166;
      localObject = GridLayout.bc((View)localObject);
      if (this.ajQ)
      {
        localObject = ((GridLayout.LayoutParams)localObject).akM;
        if (((GridLayout.i)localObject).weight == 0.0F)
          break label166;
        bool2 = true;
        label88: this.akh = bool2;
        this.aki = true;
      }
    }
    else
    {
      if (this.akh)
        break label178;
      h(paramArrayOfInt);
    }
    label112: int m;
    while (true)
      if (!this.akk)
      {
        m = paramArrayOfInt[0];
        j = paramArrayOfInt.length;
        k = i;
        while (true)
          label278: if (k < j)
          {
            paramArrayOfInt[k] -= m;
            k++;
            continue;
            localObject = ((GridLayout.LayoutParams)localObject).akL;
            break label75;
            label166: k++;
            break;
            label172: bool2 = false;
            break label88;
            label178: Arrays.fill(iy(), 0);
            h(paramArrayOfInt);
            j = this.akl.value * this.akn.getChildCount() + 1;
            if (j < 2)
              break label112;
            m = this.akn.getChildCount();
            k = 0;
            label229: if (k < m)
            {
              localObject = this.akn.getChildAt(k);
              if (((View)localObject).getVisibility() == 8)
                break label419;
              localObject = GridLayout.bc((View)localObject);
              if (this.ajQ)
              {
                localObject = ((GridLayout.LayoutParams)localObject).akM;
                f = ((GridLayout.i)localObject).weight + f;
              }
            }
          }
      }
    label419: 
    while (true)
    {
      k++;
      break label229;
      localObject = ((GridLayout.LayoutParams)localObject).akL;
      break label278;
      m = -1;
      int n = 0;
      k = j;
      j = n;
      bool2 = bool1;
      while (j < k)
      {
        n = (int)((j + k) / 2L);
        ij();
        f(n, f);
        bool2 = a(ix(), paramArrayOfInt, false);
        if (bool2)
        {
          j = n + 1;
          m = n;
        }
        else
        {
          k = n;
        }
      }
      if ((m <= 0) || (bool2))
        break;
      ij();
      f(m, f);
      h(paramArrayOfInt);
      break;
      return;
    }
  }

  private int iq()
  {
    int k;
    if (this.ajS == -2147483648)
    {
      int i = this.akn.getChildCount();
      int j = 0;
      k = -1;
      if (j < i)
      {
        Object localObject = GridLayout.bc(this.akn.getChildAt(j));
        if (this.ajQ);
        for (localObject = ((GridLayout.LayoutParams)localObject).akM; ; localObject = ((GridLayout.LayoutParams)localObject).akL)
        {
          localObject = ((GridLayout.i)localObject).ajL;
          k = Math.max(Math.max(Math.max(k, ((GridLayout.f)localObject).min), ((GridLayout.f)localObject).max), ((GridLayout.f)localObject).size());
          j++;
          break;
        }
      }
      if (k != -1)
        break label124;
      k = -2147483648;
    }
    label124: 
    while (true)
    {
      this.ajS = Math.max(0, k);
      return this.ajS;
    }
  }

  private GridLayout.h<GridLayout.i, GridLayout.e> ir()
  {
    GridLayout.c localc = GridLayout.c.a(GridLayout.i.class, GridLayout.e.class);
    int i = this.akn.getChildCount();
    int j = 0;
    if (j < i)
    {
      Object localObject = GridLayout.bc(this.akn.getChildAt(j));
      if (this.ajQ);
      for (localObject = ((GridLayout.LayoutParams)localObject).akM; ; localObject = ((GridLayout.LayoutParams)localObject).akL)
      {
        localc.f(localObject, ((GridLayout.i)localObject).ag(this.ajQ).io());
        j++;
        break;
      }
    }
    return localc.ip();
  }

  private void is()
  {
    Object localObject = (GridLayout.e[])this.ajT.akP;
    for (int i = 0; i < localObject.length; i++)
      localObject[i].reset();
    int j = this.akn.getChildCount();
    i = 0;
    if (i < j)
    {
      View localView = this.akn.getChildAt(i);
      localObject = GridLayout.bc(localView);
      label74: GridLayout localGridLayout;
      boolean bool;
      int k;
      if (this.ajQ)
      {
        localObject = ((GridLayout.LayoutParams)localObject).akM;
        localGridLayout = this.akn;
        bool = this.ajQ;
        if (localView.getVisibility() != 8)
          break label152;
        k = 0;
        label99: if (((GridLayout.i)localObject).weight != 0.0F)
          break label178;
      }
      label152: label178: for (int m = 0; ; m = iy()[i])
      {
        ((GridLayout.e)this.ajT.bR(i)).a(this.akn, localView, (GridLayout.i)localObject, this, k + m);
        i++;
        break;
        localObject = ((GridLayout.LayoutParams)localObject).akL;
        break label74;
        k = GridLayout.h(localView, bool);
        k = localGridLayout.g(localView, bool) + k;
        break label99;
      }
    }
  }

  private GridLayout.h<GridLayout.f, GridLayout.g> iu()
  {
    if (this.ajV == null)
      this.ajV = ae(true);
    if (!this.ajW)
    {
      a(this.ajV, true);
      this.ajW = true;
    }
    return this.ajV;
  }

  private GridLayout.h<GridLayout.f, GridLayout.g> iv()
  {
    if (this.ajX == null)
      this.ajX = ae(false);
    if (!this.ajY)
    {
      a(this.ajX, false);
      this.ajY = true;
    }
    return this.ajX;
  }

  private void iw()
  {
    iu();
    iv();
  }

  private GridLayout.b[] ix()
  {
    if (this.akd == null)
    {
      ArrayList localArrayList1 = new ArrayList();
      ArrayList localArrayList2 = new ArrayList();
      a(localArrayList1, iu());
      a(localArrayList2, iv());
      if (this.akk)
        for (i = 0; i < getCount(); i++)
          a(localArrayList1, new GridLayout.f(i, i + 1), new GridLayout.g(0));
      int i = getCount();
      a(localArrayList1, new GridLayout.f(0, i), this.akl, false);
      a(localArrayList2, new GridLayout.f(i, 0), this.akm, false);
      this.akd = ((GridLayout.b[])GridLayout.a(p(localArrayList1), p(localArrayList2)));
    }
    if (!this.ake)
    {
      iw();
      this.ake = true;
    }
    return this.akd;
  }

  private int[] iy()
  {
    if (this.akj == null)
      this.akj = new int[this.akn.getChildCount()];
    return this.akj;
  }

  private GridLayout.b[] p(List<GridLayout.b> paramList)
  {
    paramList = new Object()
    {
      GridLayout.b[] ako = new GridLayout.b[this.aks.length];
      int akp = this.ako.length - 1;
      GridLayout.b[][] akq = GridLayout.d.this.a(this.aks);
      int[] akr = new int[GridLayout.d.this.getCount() + 1];

      static
      {
        if (!GridLayout.class.desiredAssertionStatus());
        for (boolean bool = true; ; bool = false)
        {
          $assertionsDisabled = bool;
          return;
        }
      }

      final void bQ(int paramAnonymousInt)
      {
        switch (this.akr[paramAnonymousInt])
        {
        default:
        case 0:
        case 1:
        }
        do
          while (true)
          {
            return;
            this.akr[paramAnonymousInt] = 1;
            for (GridLayout.b localb : this.akq[paramAnonymousInt])
            {
              bQ(localb.ajL.max);
              GridLayout.b[] arrayOfb2 = this.ako;
              int k = this.akp;
              this.akp = (k - 1);
              arrayOfb2[k] = localb;
            }
            this.akr[paramAnonymousInt] = 2;
          }
        while ($assertionsDisabled);
        throw new AssertionError();
      }
    };
    int i = 0;
    int j = paramList.akq.length;
    while (i < j)
    {
      paramList.bQ(i);
      i++;
    }
    if ((!1.$assertionsDisabled) && (paramList.akp != -1))
      throw new AssertionError();
    return paramList.ako;
  }

  private String q(List<GridLayout.b> paramList)
  {
    String str;
    label32: label61: int j;
    int k;
    int m;
    if (this.ajQ)
    {
      str = "x";
      localObject = new StringBuilder();
      Iterator localIterator = paramList.iterator();
      int i = 1;
      paramList = (List<GridLayout.b>)localObject;
      if (!localIterator.hasNext())
        break label218;
      localObject = (GridLayout.b)localIterator.next();
      if (i == 0)
        break label157;
      i = 0;
      j = ((GridLayout.b)localObject).ajL.min;
      k = ((GridLayout.b)localObject).ajL.max;
      m = ((GridLayout.b)localObject).ajM.value;
      if (j >= k)
        break label168;
    }
    label157: label168: for (Object localObject = str + k + "-" + str + j + ">=" + m; ; localObject = str + j + "-" + str + k + "<=" + -m)
    {
      paramList.append((String)localObject);
      break label32;
      str = "y";
      break;
      paramList = paramList.append(", ");
      break label61;
    }
    label218: return paramList.toString();
  }

  final GridLayout.b[][] a(GridLayout.b[] paramArrayOfb)
  {
    int i = 0;
    int j = getCount() + 1;
    GridLayout.b[][] arrayOfb; = new GridLayout.b[j][];
    int[] arrayOfInt = new int[j];
    int k = paramArrayOfb.length;
    int m;
    for (j = 0; j < k; j++)
    {
      m = paramArrayOfb[j].ajL.min;
      arrayOfInt[m] += 1;
    }
    for (j = 0; j < arrayOfInt.length; j++)
      arrayOfb;[j] = new GridLayout.b[arrayOfInt[j]];
    Arrays.fill(arrayOfInt, 0);
    k = paramArrayOfb.length;
    for (j = i; j < k; j++)
    {
      GridLayout.b localb = paramArrayOfb[j];
      i = localb.ajL.min;
      [Landroid.support.v7.widget.GridLayout.b localb; = arrayOfb;[i];
      m = arrayOfInt[i];
      arrayOfInt[i] = (m + 1);
      localb;[m] = localb;
    }
    return arrayOfb;;
  }

  public final void ad(boolean paramBoolean)
  {
    this.akk = paramBoolean;
    ii();
  }

  final void af(boolean paramBoolean)
  {
    int[] arrayOfInt;
    int j;
    label20: View localView;
    Object localObject;
    if (paramBoolean)
    {
      arrayOfInt = this.ajZ;
      int i = this.akn.getChildCount();
      j = 0;
      if (j >= i)
        return;
      localView = this.akn.getChildAt(j);
      if (localView.getVisibility() != 8)
      {
        localObject = GridLayout.bc(localView);
        if (!this.ajQ)
          break label125;
        localObject = ((GridLayout.LayoutParams)localObject).akM;
        label68: localObject = ((GridLayout.i)localObject).ajL;
        if (!paramBoolean)
          break label135;
      }
    }
    label135: for (int k = ((GridLayout.f)localObject).min; ; k = ((GridLayout.f)localObject).max)
    {
      arrayOfInt[k] = Math.max(arrayOfInt[k], this.akn.a(localView, this.ajQ, paramBoolean));
      j++;
      break label20;
      arrayOfInt = this.akb;
      break;
      label125: localObject = ((GridLayout.LayoutParams)localObject).akL;
      break label68;
    }
  }

  public final int bO(int paramInt)
  {
    int i = 0;
    int j = View.MeasureSpec.getMode(paramInt);
    paramInt = View.MeasureSpec.getSize(paramInt);
    switch (j)
    {
    default:
      paramInt = i;
      if (!$assertionsDisabled)
        throw new AssertionError();
      break;
    case 0:
      paramInt = Y(0, 100000);
    case 1073741824:
    case -2147483648:
    }
    while (true)
    {
      return paramInt;
      paramInt = Y(paramInt, paramInt);
      continue;
      paramInt = Y(0, paramInt);
    }
  }

  public final void bP(int paramInt)
  {
    X(paramInt, paramInt);
    iz();
  }

  public final int getCount()
  {
    return Math.max(this.ajR, iq());
  }

  public final void ii()
  {
    this.ajS = -2147483648;
    this.ajT = null;
    this.ajV = null;
    this.ajX = null;
    this.ajZ = null;
    this.akb = null;
    this.akd = null;
    this.akf = null;
    this.akj = null;
    this.aki = false;
    ij();
  }

  public final void ij()
  {
    this.ajU = false;
    this.ajW = false;
    this.ajY = false;
    this.aka = false;
    this.akc = false;
    this.ake = false;
    this.akg = false;
  }

  public final GridLayout.h<GridLayout.i, GridLayout.e> it()
  {
    if (this.ajT == null)
      this.ajT = ir();
    if (!this.ajU)
    {
      is();
      this.ajU = true;
    }
    return this.ajT;
  }

  public final int[] iz()
  {
    if (this.akf == null)
      this.akf = new int[getCount() + 1];
    if (!this.akg)
    {
      i(this.akf);
      this.akg = true;
    }
    return this.akf;
  }

  public final void setCount(int paramInt)
  {
    StringBuilder localStringBuilder;
    if ((paramInt != -2147483648) && (paramInt < iq()))
    {
      localStringBuilder = new StringBuilder();
      if (!this.ajQ)
        break label56;
    }
    label56: for (String str = "column"; ; str = "row")
    {
      GridLayout.S(str + "Count must be greater than or equal to the maximum of all grid indices (and spans) defined in the LayoutParams of each child");
      this.ajR = paramInt;
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.GridLayout.d
 * JD-Core Version:    0.6.2
 */