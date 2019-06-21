package android.support.v7.widget;

import android.graphics.PointF;
import android.os.Parcelable;
import android.support.v4.view.s;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

public class LinearLayoutManager extends RecyclerView.i
  implements RecyclerView.r.b
{
  am alA;
  private boolean alB;
  private boolean alC = false;
  boolean alD = false;
  private boolean alE = false;
  private boolean alF = true;
  int alG = -1;
  int alH = -2147483648;
  private boolean alI;
  LinearLayoutManager.SavedState alJ = null;
  final LinearLayoutManager.a alK = new LinearLayoutManager.a();
  private final LinearLayoutManager.b alL = new LinearLayoutManager.b();
  public int alM = 2;
  private LinearLayoutManager.c alz;
  int mOrientation = 1;

  public LinearLayoutManager()
  {
    this(1);
  }

  public LinearLayoutManager(int paramInt)
  {
    setOrientation(paramInt);
    ah(false);
  }

  private int a(int paramInt, RecyclerView.o paramo, RecyclerView.s params, boolean paramBoolean)
  {
    int i = this.alA.jf() - paramInt;
    int j;
    if (i > 0)
    {
      j = -c(-i, paramo, params);
      i = j;
      if (paramBoolean)
      {
        paramInt = this.alA.jf() - (paramInt + j);
        i = j;
        if (paramInt > 0)
          this.alA.cc(paramInt);
      }
    }
    for (i = j + paramInt; ; i = 0)
      return i;
  }

  private int a(RecyclerView.o paramo, LinearLayoutManager.c paramc, RecyclerView.s params, boolean paramBoolean)
  {
    int i = paramc.alg;
    if (paramc.alS != -2147483648)
    {
      if (paramc.alg < 0)
        paramc.alS += paramc.alg;
      a(paramo, paramc);
    }
    int j = paramc.alg + paramc.alT;
    LinearLayoutManager.b localb = this.alL;
    do
    {
      int k;
      do
      {
        if (((!paramc.alm) && (j <= 0)) || (!paramc.b(params)))
          break;
        localb.resetInternal();
        a(paramo, params, paramc, localb);
        if (localb.mFinished)
          break;
        paramc.Lp += localb.alQ * paramc.sE;
        if ((localb.alR) && (this.alz.alW == null))
        {
          k = j;
          if (params.apv);
        }
        else
        {
          paramc.alg -= localb.alQ;
          k = j - localb.alQ;
        }
        if (paramc.alS != -2147483648)
        {
          paramc.alS += localb.alQ;
          if (paramc.alg < 0)
            paramc.alS += paramc.alg;
          a(paramo, paramc);
        }
        j = k;
      }
      while (!paramBoolean);
      j = k;
    }
    while (!localb.YP);
    return i - paramc.alg;
  }

  private void a(int paramInt1, int paramInt2, boolean paramBoolean, RecyclerView.s params)
  {
    int i = -1;
    int j = 1;
    this.alz.alm = iK();
    this.alz.alT = c(params);
    this.alz.sE = paramInt1;
    if (paramInt1 == 1)
    {
      params = this.alz;
      params.alT += this.alA.getEndPadding();
      params = iN();
      localc = this.alz;
      if (this.alD);
      for (paramInt1 = i; ; paramInt1 = 1)
      {
        localc.ali = paramInt1;
        this.alz.alh = (bt(params) + this.alz.ali);
        this.alz.Lp = this.alA.bg(params);
        paramInt1 = this.alA.bg(params) - this.alA.jf();
        this.alz.alg = paramInt2;
        if (paramBoolean)
        {
          params = this.alz;
          params.alg -= paramInt1;
        }
        this.alz.alS = paramInt1;
        return;
      }
    }
    params = iM();
    LinearLayoutManager.c localc = this.alz;
    localc.alT += this.alA.je();
    localc = this.alz;
    if (this.alD);
    for (paramInt1 = j; ; paramInt1 = -1)
    {
      localc.ali = paramInt1;
      this.alz.alh = (bt(params) + this.alz.ali);
      this.alz.Lp = this.alA.bf(params);
      paramInt1 = -this.alA.bf(params) + this.alA.je();
      break;
    }
  }

  private void a(LinearLayoutManager.a parama)
  {
    af(parama.mPosition, parama.alN);
  }

  private void a(RecyclerView.o paramo, int paramInt1, int paramInt2)
  {
    if (paramInt1 == paramInt2);
    while (true)
    {
      return;
      int i = paramInt1;
      if (paramInt2 > paramInt1)
      {
        paramInt2--;
        while (paramInt2 >= paramInt1)
        {
          a(paramInt2, paramo);
          paramInt2--;
        }
      }
      else
      {
        while (i > paramInt2)
        {
          a(i, paramo);
          i--;
        }
      }
    }
  }

  private void a(RecyclerView.o paramo, LinearLayoutManager.c paramc)
  {
    if ((!paramc.alf) || (paramc.alm));
    label170: label310: 
    while (true)
    {
      return;
      int i;
      int j;
      int k;
      if (paramc.sE == -1)
      {
        i = paramc.alS;
        j = getChildCount();
        if (i >= 0)
        {
          k = this.alA.getEnd() - i;
          if (this.alD)
            for (i = 0; ; i++)
            {
              if (i >= j)
                break label110;
              paramc = getChildAt(i);
              if ((this.alA.bf(paramc) < k) || (this.alA.bi(paramc) < k))
              {
                a(paramo, 0, i);
                break;
              }
            }
          else
            label110: for (i = j - 1; ; i--)
            {
              if (i < 0)
                break label170;
              paramc = getChildAt(i);
              if ((this.alA.bf(paramc) < k) || (this.alA.bi(paramc) < k))
              {
                a(paramo, j - 1, i);
                break;
              }
            }
        }
      }
      else
      {
        j = paramc.alS;
        if (j >= 0)
        {
          k = getChildCount();
          if (this.alD)
            for (i = k - 1; ; i--)
            {
              if (i < 0)
                break label254;
              paramc = getChildAt(i);
              if ((this.alA.bg(paramc) > j) || (this.alA.bh(paramc) > j))
              {
                a(paramo, k - 1, i);
                break;
              }
            }
          else
            label254: for (i = 0; ; i++)
            {
              if (i >= k)
                break label310;
              paramc = getChildAt(i);
              if ((this.alA.bg(paramc) > j) || (this.alA.bh(paramc) > j))
              {
                a(paramo, 0, i);
                break;
              }
            }
        }
      }
    }
  }

  private void af(int paramInt1, int paramInt2)
  {
    this.alz.alg = (this.alA.jf() - paramInt2);
    LinearLayoutManager.c localc = this.alz;
    if (this.alD);
    for (int i = -1; ; i = 1)
    {
      localc.ali = i;
      this.alz.alh = paramInt1;
      this.alz.sE = 1;
      this.alz.Lp = paramInt2;
      this.alz.alS = -2147483648;
      return;
    }
  }

  private void ag(int paramInt1, int paramInt2)
  {
    this.alz.alg = (paramInt2 - this.alA.je());
    this.alz.alh = paramInt1;
    LinearLayoutManager.c localc = this.alz;
    if (this.alD);
    for (paramInt1 = 1; ; paramInt1 = -1)
    {
      localc.ali = paramInt1;
      this.alz.sE = -1;
      this.alz.Lp = paramInt2;
      this.alz.alS = -2147483648;
      return;
    }
  }

  private View ai(int paramInt1, int paramInt2)
  {
    iJ();
    int i;
    View localView;
    if (paramInt2 > paramInt1)
    {
      i = 1;
      if (i != 0)
        break label40;
      localView = getChildAt(paramInt1);
    }
    while (true)
    {
      return localView;
      if (paramInt2 < paramInt1)
      {
        i = -1;
        break;
      }
      i = 0;
      break;
      label40: if (this.alA.bf(getChildAt(paramInt1)) < this.alA.je())
        i = 16644;
      for (int j = 16388; ; j = 4097)
      {
        if (this.mOrientation != 0)
          break label107;
        localView = this.aoA.k(paramInt1, paramInt2, i, j);
        break;
        i = 4161;
      }
      label107: localView = this.aoB.k(paramInt1, paramInt2, i, j);
    }
  }

  private View ai(boolean paramBoolean)
  {
    if (this.alD);
    for (View localView = c(getChildCount() - 1, -1, paramBoolean, true); ; localView = c(0, getChildCount(), paramBoolean, true))
      return localView;
  }

  private View aj(boolean paramBoolean)
  {
    if (this.alD);
    for (View localView = c(0, getChildCount(), paramBoolean, true); ; localView = c(getChildCount() - 1, -1, paramBoolean, true))
      return localView;
  }

  private int b(int paramInt, RecyclerView.o paramo, RecyclerView.s params, boolean paramBoolean)
  {
    int i = paramInt - this.alA.je();
    int j;
    if (i > 0)
    {
      j = -c(i, paramo, params);
      i = j;
      if (paramBoolean)
      {
        paramInt = paramInt + j - this.alA.je();
        i = j;
        if (paramInt > 0)
          this.alA.cc(-paramInt);
      }
    }
    for (i = j - paramInt; ; i = 0)
      return i;
  }

  private void b(LinearLayoutManager.a parama)
  {
    ag(parama.mPosition, parama.alN);
  }

  private int c(int paramInt, RecyclerView.o paramo, RecyclerView.s params)
  {
    if ((getChildCount() == 0) || (paramInt == 0))
      paramInt = 0;
    while (true)
    {
      return paramInt;
      this.alz.alf = true;
      iJ();
      if (paramInt > 0);
      int j;
      int k;
      for (int i = 1; ; i = -1)
      {
        j = Math.abs(paramInt);
        a(i, j, true, params);
        k = this.alz.alS + a(paramo, this.alz, params, false);
        if (k >= 0)
          break label87;
        paramInt = 0;
        break;
      }
      label87: if (j > k)
        paramInt = i * k;
      this.alA.cc(-paramInt);
      this.alz.alV = paramInt;
    }
  }

  private View c(int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2)
  {
    int i = 320;
    iJ();
    int j;
    if (paramBoolean1)
    {
      j = 24579;
      if (!paramBoolean2)
        break label74;
    }
    while (true)
    {
      if (this.mOrientation == 0);
      for (View localView = this.aoA.k(paramInt1, paramInt2, j, i); ; localView = this.aoB.k(paramInt1, paramInt2, j, i))
      {
        return localView;
        j = 320;
        break;
      }
      label74: i = 0;
    }
  }

  private View d(RecyclerView.o paramo, RecyclerView.s params)
  {
    return a(paramo, params, getChildCount() - 1, -1, params.getItemCount());
  }

  private void iI()
  {
    boolean bool = true;
    if ((this.mOrientation == 1) || (!ib()))
      bool = this.alC;
    while (true)
    {
      this.alD = bool;
      return;
      if (this.alC)
        bool = false;
    }
  }

  private boolean iK()
  {
    if ((this.alA.getMode() == 0) && (this.alA.getEnd() == 0));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  private View iM()
  {
    if (this.alD);
    for (int i = getChildCount() - 1; ; i = 0)
      return getChildAt(i);
  }

  private View iN()
  {
    if (this.alD);
    for (int i = 0; ; i = getChildCount() - 1)
      return getChildAt(i);
  }

  private View iO()
  {
    return ai(0, getChildCount());
  }

  private View iP()
  {
    return ai(getChildCount() - 1, -1);
  }

  private int j(RecyclerView.s params)
  {
    boolean bool1 = true;
    int i = 0;
    if (getChildCount() == 0)
      return i;
    iJ();
    am localam = this.alA;
    label33: View localView;
    if (!this.alF)
    {
      bool2 = true;
      localView = ai(bool2);
      if (this.alF)
        break label84;
    }
    label84: for (boolean bool2 = bool1; ; bool2 = false)
    {
      i = at.a(params, localam, localView, aj(bool2), this, this.alF, this.alD);
      break;
      bool2 = false;
      break label33;
    }
  }

  private int k(RecyclerView.s params)
  {
    boolean bool1 = true;
    int i = 0;
    if (getChildCount() == 0)
      return i;
    iJ();
    am localam = this.alA;
    label33: View localView;
    if (!this.alF)
    {
      bool2 = true;
      localView = ai(bool2);
      if (this.alF)
        break label80;
    }
    label80: for (boolean bool2 = bool1; ; bool2 = false)
    {
      i = at.a(params, localam, localView, aj(bool2), this, this.alF);
      break;
      bool2 = false;
      break label33;
    }
  }

  private int l(RecyclerView.s params)
  {
    boolean bool1 = true;
    int i = 0;
    if (getChildCount() == 0)
      return i;
    iJ();
    am localam = this.alA;
    label33: View localView;
    if (!this.alF)
    {
      bool2 = true;
      localView = ai(bool2);
      if (this.alF)
        break label80;
    }
    label80: for (boolean bool2 = bool1; ; bool2 = false)
    {
      i = at.b(params, localam, localView, aj(bool2), this, this.alF);
      break;
      bool2 = false;
      break label33;
    }
  }

  public final void T(String paramString)
  {
    if (this.alJ == null)
      super.T(paramString);
  }

  public int a(int paramInt, RecyclerView.o paramo, RecyclerView.s params)
  {
    if (this.mOrientation == 1);
    for (paramInt = 0; ; paramInt = c(paramInt, paramo, params))
      return paramInt;
  }

  View a(RecyclerView.o paramo, RecyclerView.s params, int paramInt1, int paramInt2, int paramInt3)
  {
    iJ();
    int i = this.alA.je();
    int j = this.alA.jf();
    int k;
    label35: View localView;
    if (paramInt2 > paramInt1)
    {
      k = 1;
      paramo = null;
      params = null;
      if (paramInt1 == paramInt2)
        break label147;
      localView = getChildAt(paramInt1);
      int m = bt(localView);
      if ((m < 0) || (m >= paramInt3))
        break label163;
      if (!((RecyclerView.LayoutParams)localView.getLayoutParams()).aoM.isRemoved())
        break label105;
      if (params != null)
        break label163;
      params = localView;
    }
    label147: label157: label163: 
    while (true)
    {
      paramInt1 += k;
      break label35;
      k = -1;
      break;
      label105: if (this.alA.bf(localView) < j)
      {
        localObject = localView;
        if (this.alA.bg(localView) >= i);
      }
      else
      {
        if (paramo != null)
          break label163;
        paramo = localView;
        continue;
        if (paramo == null)
          break label157;
      }
      for (Object localObject = paramo; ; localObject = params)
        return localObject;
    }
  }

  public View a(View paramView, int paramInt, RecyclerView.o paramo, RecyclerView.s params)
  {
    iI();
    if (getChildCount() == 0)
      paramView = null;
    while (true)
    {
      return paramView;
      paramInt = bZ(paramInt);
      if (paramInt == -2147483648)
      {
        paramView = null;
      }
      else
      {
        iJ();
        iJ();
        a(paramInt, (int)(0.3333333F * this.alA.jg()), false, params);
        this.alz.alS = -2147483648;
        this.alz.alf = false;
        a(paramo, this.alz, params, true);
        if (paramInt == -1)
          if (this.alD)
          {
            paramView = iP();
            label108: paramo = paramView;
            if (paramInt != -1)
              break label169;
          }
        label169: for (paramView = iM(); ; paramView = iN())
        {
          if (!paramView.hasFocusable())
            break label177;
          if (paramo != null)
            break;
          paramView = null;
          break;
          paramView = iO();
          break label108;
          if (this.alD);
          for (paramView = iO(); ; paramView = iP())
          {
            paramo = paramView;
            break;
          }
        }
        label177: paramView = paramo;
      }
    }
  }

  public final void a(int paramInt1, int paramInt2, RecyclerView.s params, RecyclerView.i.a parama)
  {
    if (this.mOrientation == 0);
    while ((getChildCount() == 0) || (paramInt1 == 0))
    {
      return;
      paramInt1 = paramInt2;
    }
    iJ();
    if (paramInt1 > 0);
    for (paramInt2 = 1; ; paramInt2 = -1)
    {
      a(paramInt2, Math.abs(paramInt1), true, params);
      a(params, this.alz, parama);
      break;
    }
  }

  public final void a(int paramInt, RecyclerView.i.a parama)
  {
    boolean bool;
    int i;
    if ((this.alJ != null) && (this.alJ.iW()))
    {
      bool = this.alJ.alZ;
      i = this.alJ.alX;
      if (!bool)
        break label138;
    }
    label138: for (int j = -1; ; j = 1)
    {
      int k = 0;
      int m = i;
      for (i = k; (i < this.alM) && (m >= 0) && (m < paramInt); i++)
      {
        parama.T(m, 0);
        m += j;
      }
      iI();
      bool = this.alD;
      if (this.alG == -1)
      {
        if (bool);
        for (i = paramInt - 1; ; i = 0)
          break;
      }
      i = this.alG;
      break;
    }
  }

  void a(RecyclerView.o paramo, RecyclerView.s params, LinearLayoutManager.a parama, int paramInt)
  {
  }

  void a(RecyclerView.o paramo, RecyclerView.s params, LinearLayoutManager.c paramc, LinearLayoutManager.b paramb)
  {
    paramo = paramc.a(paramo);
    if (paramo == null)
    {
      paramb.mFinished = true;
      return;
    }
    params = (RecyclerView.LayoutParams)paramo.getLayoutParams();
    boolean bool1;
    boolean bool2;
    label49: label62: int i;
    int j;
    label119: int k;
    int m;
    int n;
    int i1;
    if (paramc.alW == null)
    {
      bool1 = this.alD;
      if (paramc.sE == -1)
      {
        bool2 = true;
        if (bool1 != bool2)
          break label217;
        addView(paramo, -1);
        bu(paramo);
        paramb.alQ = this.alA.bj(paramo);
        if (this.mOrientation != 1)
          break label333;
        if (!ib())
          break label274;
        i = this.mWidth - getPaddingRight();
        j = i - this.alA.bk(paramo);
        if (paramc.sE != -1)
          break label296;
        k = paramc.Lp;
        m = paramc.Lp - paramb.alQ;
        n = i;
        i1 = j;
        j = k;
        i = m;
      }
    }
    while (true)
    {
      k(paramo, i1, i, n, j);
      if ((params.aoM.isRemoved()) || (params.aoM.kx()))
        paramb.alR = true;
      paramb.YP = paramo.hasFocusable();
      break;
      bool2 = false;
      break label49;
      label217: addView(paramo, 0);
      break label62;
      bool1 = this.alD;
      if (paramc.sE == -1);
      for (bool2 = true; ; bool2 = false)
      {
        if (bool1 != bool2)
          break label265;
        z(paramo, -1);
        break;
      }
      label265: z(paramo, 0);
      break label62;
      label274: j = getPaddingLeft();
      i = this.alA.bk(paramo) + j;
      break label119;
      label296: k = paramc.Lp;
      m = paramc.Lp + paramb.alQ;
      i1 = j;
      n = i;
      i = k;
      j = m;
      continue;
      label333: j = getPaddingTop();
      i = this.alA.bk(paramo) + j;
      if (paramc.sE == -1)
      {
        n = paramc.Lp;
        m = paramc.Lp - paramb.alQ;
        i1 = j;
        j = i;
        i = i1;
        i1 = m;
      }
      else
      {
        m = paramc.Lp;
        n = paramc.Lp + paramb.alQ;
        i1 = i;
        i = j;
        j = i1;
        i1 = m;
      }
    }
  }

  public void a(RecyclerView.s params)
  {
    super.a(params);
    this.alJ = null;
    this.alG = -1;
    this.alH = -2147483648;
    this.alK.reset();
  }

  void a(RecyclerView.s params, LinearLayoutManager.c paramc, RecyclerView.i.a parama)
  {
    int i = paramc.alh;
    if ((i >= 0) && (i < params.getItemCount()))
      parama.T(i, Math.max(0, paramc.alS));
  }

  public void a(RecyclerView paramRecyclerView, int paramInt)
  {
    paramRecyclerView = new ah(paramRecyclerView.getContext());
    paramRecyclerView.ape = paramInt;
    a(paramRecyclerView);
  }

  public void a(RecyclerView paramRecyclerView, RecyclerView.o paramo)
  {
    super.a(paramRecyclerView, paramo);
    if (this.alI)
    {
      d(paramo);
      paramo.clear();
    }
  }

  public void ah(int paramInt1, int paramInt2)
  {
    this.alG = paramInt1;
    this.alH = paramInt2;
    if (this.alJ != null)
      this.alJ.alX = -1;
    requestLayout();
  }

  public void ah(boolean paramBoolean)
  {
    T(null);
    if (paramBoolean == this.alC);
    while (true)
    {
      return;
      this.alC = paramBoolean;
      requestLayout();
    }
  }

  public int b(int paramInt, RecyclerView.o paramo, RecyclerView.s params)
  {
    if (this.mOrientation == 0);
    for (paramInt = 0; ; paramInt = c(paramInt, paramo, params))
      return paramInt;
  }

  public View bW(int paramInt)
  {
    int i = getChildCount();
    Object localObject;
    if (i == 0)
      localObject = null;
    while (true)
    {
      return localObject;
      int j = paramInt - bt(getChildAt(0));
      if ((j >= 0) && (j < i))
      {
        View localView = getChildAt(j);
        localObject = localView;
        if (bt(localView) == paramInt);
      }
      else
      {
        localObject = super.bW(paramInt);
      }
    }
  }

  public final PointF bX(int paramInt)
  {
    int i = 1;
    int j = 0;
    PointF localPointF;
    if (getChildCount() == 0)
      localPointF = null;
    while (true)
    {
      return localPointF;
      if (paramInt < bt(getChildAt(0)))
        j = 1;
      paramInt = i;
      if (j != this.alD)
        paramInt = -1;
      if (this.mOrientation == 0)
        localPointF = new PointF(paramInt, 0.0F);
      else
        localPointF = new PointF(0.0F, paramInt);
    }
  }

  public void bY(int paramInt)
  {
    this.alG = paramInt;
    this.alH = -2147483648;
    if (this.alJ != null)
      this.alJ.alX = -1;
    requestLayout();
  }

  final int bZ(int paramInt)
  {
    int i = -1;
    switch (paramInt)
    {
    default:
      paramInt = -2147483648;
    case 1:
    case 2:
    case 33:
    case 130:
    case 17:
    case 66:
    }
    while (true)
    {
      return paramInt;
      paramInt = i;
      if (this.mOrientation != 1)
      {
        paramInt = i;
        if (ib())
        {
          paramInt = 1;
          continue;
          if (this.mOrientation == 1)
          {
            paramInt = 1;
          }
          else
          {
            paramInt = i;
            if (!ib())
            {
              paramInt = 1;
              continue;
              paramInt = i;
              if (this.mOrientation != 1)
              {
                paramInt = -2147483648;
                continue;
                if (this.mOrientation == 1)
                {
                  paramInt = 1;
                }
                else
                {
                  paramInt = -2147483648;
                  continue;
                  paramInt = i;
                  if (this.mOrientation != 0)
                  {
                    paramInt = -2147483648;
                    continue;
                    if (this.mOrientation == 0)
                      paramInt = 1;
                    else
                      paramInt = -2147483648;
                  }
                }
              }
            }
          }
        }
      }
    }
  }

  protected int c(RecyclerView.s params)
  {
    int i = 0;
    if (params.ape != -1);
    for (int j = 1; ; j = 0)
    {
      if (j != 0)
        i = this.alA.jg();
      return i;
    }
  }

  public void c(RecyclerView.o paramo, RecyclerView.s params)
  {
    if (((this.alJ != null) || (this.alG != -1)) && (params.getItemCount() == 0))
    {
      d(paramo);
      return;
    }
    if ((this.alJ != null) && (this.alJ.iW()))
      this.alG = this.alJ.alX;
    iJ();
    this.alz.alf = false;
    iI();
    Object localObject1 = getFocusedChild();
    Object localObject2;
    int i;
    label149: label218: label238: int j;
    label263: label278: label298: int k;
    int m;
    int n;
    if ((!this.alK.alP) || (this.alG != -1) || (this.alJ != null))
    {
      this.alK.reset();
      this.alK.alO = (this.alD ^ this.alE);
      localObject2 = this.alK;
      if ((params.apv) || (this.alG == -1))
      {
        i = 0;
        if (i == 0)
        {
          if (getChildCount() == 0)
            break label1451;
          View localView = getFocusedChild();
          if (localView == null)
            break label1262;
          localObject1 = (RecyclerView.LayoutParams)localView.getLayoutParams();
          if ((((RecyclerView.LayoutParams)localObject1).aoM.isRemoved()) || (((RecyclerView.LayoutParams)localObject1).aoM.ki() < 0) || (((RecyclerView.LayoutParams)localObject1).aoM.ki() >= params.getItemCount()))
            break label1256;
          i = 1;
          if (i == 0)
            break label1262;
          ((LinearLayoutManager.a)localObject2).x(localView, bt(localView));
          i = 1;
          if (i == 0)
          {
            ((LinearLayoutManager.a)localObject2).iU();
            if (!this.alE)
              break label1457;
            i = params.getItemCount() - 1;
            ((LinearLayoutManager.a)localObject2).mPosition = i;
          }
        }
        this.alK.alP = true;
        i = c(params);
        if (this.alz.alV < 0)
          break label1518;
        j = 0;
        k = this.alA.je() + j;
        m = i + this.alA.getEndPadding();
        j = m;
        n = k;
        if (params.apv)
        {
          j = m;
          n = k;
          if (this.alG != -1)
          {
            j = m;
            n = k;
            if (this.alH != -2147483648)
            {
              localObject1 = bW(this.alG);
              j = m;
              n = k;
              if (localObject1 != null)
              {
                if (!this.alD)
                  break label1532;
                i = this.alA.jf() - this.alA.bg((View)localObject1) - this.alH;
                label421: if (i <= 0)
                  break label1566;
                n = k + i;
                j = m;
              }
            }
          }
        }
        label437: if (!this.alK.alO)
          break label1586;
        if (!this.alD)
          break label1580;
        i = 1;
        label457: a(paramo, params, this.alK, i);
        b(paramo);
        this.alz.alm = iK();
        this.alz.alU = params.apv;
        if (!this.alK.alO)
          break label1605;
        b(this.alK);
        this.alz.alT = n;
        a(paramo, this.alz, params, false);
        n = this.alz.Lp;
        k = this.alz.alh;
        i = j;
        if (this.alz.alg > 0)
          i = j + this.alz.alg;
        a(this.alK);
        this.alz.alT = i;
        localObject1 = this.alz;
        ((LinearLayoutManager.c)localObject1).alh += this.alz.ali;
        a(paramo, this.alz, params, false);
        i = this.alz.Lp;
        if (this.alz.alg <= 0)
          break label2207;
        j = this.alz.alg;
        ag(k, n);
        this.alz.alT = j;
        a(paramo, this.alz, params, false);
        j = this.alz.Lp;
      }
    }
    while (true)
    {
      label695: if (getChildCount() > 0)
        if ((this.alD ^ this.alE))
        {
          n = a(i, paramo, params, true);
          k = j + n;
          j = b(k, paramo, params, false);
          n = i + n + j;
          k += j;
        }
      while (true)
      {
        label808: boolean bool;
        if ((!params.apz) || (getChildCount() == 0) || (params.apv) || (!iE()))
        {
          if (params.apv)
            break label2160;
          paramo = this.alA;
          paramo.amQ = paramo.jg();
          this.alB = this.alE;
          break;
          if ((this.alG < 0) || (this.alG >= params.getItemCount()))
          {
            this.alG = -1;
            this.alH = -2147483648;
            i = 0;
            break label149;
          }
          ((LinearLayoutManager.a)localObject2).mPosition = this.alG;
          if ((this.alJ != null) && (this.alJ.iW()))
          {
            ((LinearLayoutManager.a)localObject2).alO = this.alJ.alZ;
            if (((LinearLayoutManager.a)localObject2).alO);
            for (((LinearLayoutManager.a)localObject2).alN = (this.alA.jf() - this.alJ.alY); ; ((LinearLayoutManager.a)localObject2).alN = (this.alA.je() + this.alJ.alY))
            {
              i = 1;
              break;
            }
          }
          if (this.alH == -2147483648)
          {
            localObject1 = bW(this.alG);
            if (localObject1 != null)
              if (this.alA.bj((View)localObject1) > this.alA.jg())
                ((LinearLayoutManager.a)localObject2).iU();
          }
          while (true)
          {
            i = 1;
            break;
            if (this.alA.bf((View)localObject1) - this.alA.je() < 0)
            {
              ((LinearLayoutManager.a)localObject2).alN = this.alA.je();
              ((LinearLayoutManager.a)localObject2).alO = false;
            }
            else if (this.alA.jf() - this.alA.bg((View)localObject1) < 0)
            {
              ((LinearLayoutManager.a)localObject2).alN = this.alA.jf();
              ((LinearLayoutManager.a)localObject2).alO = true;
            }
            else
            {
              if (((LinearLayoutManager.a)localObject2).alO);
              for (i = this.alA.bg((View)localObject1) + this.alA.jd(); ; i = this.alA.bf((View)localObject1))
              {
                ((LinearLayoutManager.a)localObject2).alN = i;
                i = 1;
                break;
              }
              if (getChildCount() > 0)
              {
                i = bt(getChildAt(0));
                if (this.alG >= i)
                  break label1188;
                bool = true;
                label1161: if (bool != this.alD)
                  break label1194;
              }
              label1188: label1194: for (bool = true; ; bool = false)
              {
                ((LinearLayoutManager.a)localObject2).alO = bool;
                ((LinearLayoutManager.a)localObject2).iU();
                break;
                bool = false;
                break label1161;
              }
              ((LinearLayoutManager.a)localObject2).alO = this.alD;
              if (this.alD)
                ((LinearLayoutManager.a)localObject2).alN = (this.alA.jf() - this.alH);
              else
                ((LinearLayoutManager.a)localObject2).alN = (this.alA.je() + this.alH);
            }
          }
          label1256: i = 0;
          break label218;
          label1262: if (this.alB == this.alE)
          {
            if (((LinearLayoutManager.a)localObject2).alO)
            {
              if (this.alD)
                break label1414;
              localObject1 = d(paramo, params);
              if (localObject1 == null)
                break label1451;
              ((LinearLayoutManager.a)localObject2).y((View)localObject1, bt((View)localObject1));
              if ((!params.apv) && (iE()))
              {
                if ((this.alA.bf((View)localObject1) < this.alA.jf()) && (this.alA.bg((View)localObject1) >= this.alA.je()))
                  break label1433;
                i = 1;
                if (i != 0)
                  if (!((LinearLayoutManager.a)localObject2).alO)
                    break label1439;
              }
            }
            for (i = this.alA.jf(); ; i = this.alA.je())
            {
              ((LinearLayoutManager.a)localObject2).alN = i;
              i = 1;
              break;
              if (this.alD)
              {
                localObject1 = d(paramo, params);
                break label1295;
              }
              localObject1 = a(paramo, params, 0, getChildCount(), params.getItemCount());
              break label1295;
              i = 0;
              break label1362;
            }
          }
          label1295: label1362: i = 0;
          label1414: label1433: label1439: label1451: break label238;
          label1457: i = 0;
          break label263;
          if ((localObject1 == null) || ((this.alA.bf((View)localObject1) < this.alA.jf()) && (this.alA.bg((View)localObject1) > this.alA.je())))
            break label278;
          this.alK.x((View)localObject1, bt((View)localObject1));
          break label278;
          label1518: n = 0;
          j = i;
          i = n;
          break label298;
          label1532: i = this.alA.bf((View)localObject1);
          j = this.alA.je();
          i = this.alH - (i - j);
          break label421;
          label1566: j = m - i;
          n = k;
          break label437;
          label1580: i = -1;
          break label457;
          label1586: if (this.alD)
          {
            i = -1;
            break label457;
          }
          i = 1;
          break label457;
          label1605: a(this.alK);
          this.alz.alT = j;
          a(paramo, this.alz, params, false);
          j = this.alz.Lp;
          k = this.alz.alh;
          i = n;
          if (this.alz.alg > 0)
            i = n + this.alz.alg;
          b(this.alK);
          this.alz.alT = i;
          localObject1 = this.alz;
          ((LinearLayoutManager.c)localObject1).alh += this.alz.ali;
          a(paramo, this.alz, params, false);
          n = this.alz.Lp;
          if (this.alz.alg <= 0)
            break label2196;
          i = this.alz.alg;
          af(k, j);
          this.alz.alT = i;
          a(paramo, this.alz, params, false);
          i = this.alz.Lp;
          j = n;
          break label695;
          k = b(j, paramo, params, true);
          n = i + k;
          i = a(n, paramo, params, false);
          n += i;
          k = j + k + i;
          continue;
        }
        j = 0;
        i = 0;
        localObject1 = paramo.aoY;
        int i1 = ((List)localObject1).size();
        int i2 = bt(getChildAt(0));
        m = 0;
        label1882: int i3;
        if (m < i1)
        {
          localObject2 = (RecyclerView.v)((List)localObject1).get(m);
          if (((RecyclerView.v)localObject2).isRemoved())
            break label2170;
          if (((RecyclerView.v)localObject2).ki() < i2)
          {
            bool = true;
            label1923: if (bool == this.alD)
              break label1997;
            i3 = -1;
            label1935: if (i3 != -1)
              break label2003;
            i3 = this.alA.bj(((RecyclerView.v)localObject2).apJ) + j;
            j = i;
            i = i3;
          }
        }
        while (true)
        {
          i3 = m + 1;
          m = i;
          i = j;
          j = m;
          m = i3;
          break label1882;
          bool = false;
          break label1923;
          label1997: i3 = 1;
          break label1935;
          label2003: i3 = i + this.alA.bj(((RecyclerView.v)localObject2).apJ);
          i = j;
          j = i3;
          continue;
          this.alz.alW = ((List)localObject1);
          if (j > 0)
          {
            ag(bt(iM()), k);
            this.alz.alT = j;
            this.alz.alg = 0;
            this.alz.bd(null);
            a(paramo, this.alz, params, false);
          }
          if (i > 0)
          {
            af(bt(iN()), n);
            this.alz.alT = i;
            this.alz.alg = 0;
            this.alz.bd(null);
            a(paramo, this.alz, params, false);
          }
          this.alz.alW = null;
          break;
          label2160: this.alK.reset();
          break label808;
          label2170: i3 = j;
          j = i;
          i = i3;
        }
        n = i;
        k = j;
      }
      label2196: i = j;
      j = n;
      continue;
      label2207: j = n;
    }
  }

  public int d(RecyclerView.s params)
  {
    return j(params);
  }

  public int e(RecyclerView.s params)
  {
    return j(params);
  }

  public int f(RecyclerView.s params)
  {
    return k(params);
  }

  public int g(RecyclerView.s params)
  {
    return k(params);
  }

  public int getOrientation()
  {
    return this.mOrientation;
  }

  public int h(RecyclerView.s params)
  {
    return l(params);
  }

  public int i(RecyclerView.s params)
  {
    return l(params);
  }

  public RecyclerView.LayoutParams iA()
  {
    return new RecyclerView.LayoutParams(-2, -2);
  }

  public boolean iE()
  {
    if ((this.alJ == null) && (this.alB == this.alE));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean iF()
  {
    return true;
  }

  public boolean iG()
  {
    if (this.mOrientation == 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public boolean iH()
  {
    boolean bool = true;
    if (this.mOrientation == 1);
    while (true)
    {
      return bool;
      bool = false;
    }
  }

  protected void iJ()
  {
    if (this.alz == null)
      this.alz = new LinearLayoutManager.c();
  }

  final boolean iL()
  {
    boolean bool = true;
    int j;
    if ((this.aoK != 1073741824) && (this.aoJ != 1073741824))
    {
      int i = getChildCount();
      j = 0;
      if (j < i)
      {
        ViewGroup.LayoutParams localLayoutParams = getChildAt(j).getLayoutParams();
        if ((localLayoutParams.width < 0) && (localLayoutParams.height < 0))
        {
          j = 1;
          label62: if (j == 0)
            break label79;
        }
      }
    }
    while (true)
    {
      return bool;
      j++;
      break;
      j = 0;
      break label62;
      label79: bool = false;
    }
  }

  public final int iQ()
  {
    View localView = c(0, getChildCount(), false, true);
    if (localView == null);
    for (int i = -1; ; i = bt(localView))
      return i;
  }

  public final int iR()
  {
    View localView = c(0, getChildCount(), true, false);
    if (localView == null);
    for (int i = -1; ; i = bt(localView))
      return i;
  }

  public final int iS()
  {
    int i = -1;
    View localView = c(getChildCount() - 1, -1, false, true);
    if (localView == null);
    while (true)
    {
      return i;
      i = bt(localView);
    }
  }

  public final int iT()
  {
    int i = -1;
    View localView = c(getChildCount() - 1, -1, true, false);
    if (localView == null);
    while (true)
    {
      return i;
      i = bt(localView);
    }
  }

  protected final boolean ib()
  {
    boolean bool = true;
    if (s.T(this.aiB) == 1);
    while (true)
    {
      return bool;
      bool = false;
    }
  }

  public final void onInitializeAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    super.onInitializeAccessibilityEvent(paramAccessibilityEvent);
    if (getChildCount() > 0)
    {
      paramAccessibilityEvent.setFromIndex(iQ());
      paramAccessibilityEvent.setToIndex(iS());
    }
  }

  public void onRestoreInstanceState(Parcelable paramParcelable)
  {
    if ((paramParcelable instanceof LinearLayoutManager.SavedState))
    {
      this.alJ = ((LinearLayoutManager.SavedState)paramParcelable);
      requestLayout();
    }
  }

  public Parcelable onSaveInstanceState()
  {
    LinearLayoutManager.SavedState localSavedState;
    if (this.alJ != null)
      localSavedState = new LinearLayoutManager.SavedState(this.alJ);
    while (true)
    {
      return localSavedState;
      localSavedState = new LinearLayoutManager.SavedState();
      if (getChildCount() > 0)
      {
        iJ();
        boolean bool = this.alB ^ this.alD;
        localSavedState.alZ = bool;
        View localView;
        if (bool)
        {
          localView = iN();
          localSavedState.alY = (this.alA.jf() - this.alA.bg(localView));
          localSavedState.alX = bt(localView);
        }
        else
        {
          localView = iM();
          localSavedState.alX = bt(localView);
          localSavedState.alY = (this.alA.bf(localView) - this.alA.je());
        }
      }
      else
      {
        localSavedState.alX = -1;
      }
    }
  }

  public void setOrientation(int paramInt)
  {
    if ((paramInt != 0) && (paramInt != 1))
      throw new IllegalArgumentException("invalid orientation:".concat(String.valueOf(paramInt)));
    T(null);
    if ((paramInt != this.mOrientation) || (this.alA == null))
      switch (paramInt)
      {
      default:
        throw new IllegalArgumentException("invalid orientation");
      case 0:
      case 1:
      }
    for (am localam = am.d(this); ; localam = am.e(this))
    {
      this.alA = localam;
      this.alK.alA = this.alA;
      this.mOrientation = paramInt;
      requestLayout();
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.LinearLayoutManager
 * JD-Core Version:    0.6.2
 */