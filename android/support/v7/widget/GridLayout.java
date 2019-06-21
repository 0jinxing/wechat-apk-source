package android.support.v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.support.v4.view.s;
import android.support.v7.e.a.a;
import android.util.AttributeSet;
import android.util.LogPrinter;
import android.util.Printer;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class GridLayout extends ViewGroup
{
  public static final GridLayout.a ajA = ajy;
  public static final GridLayout.a ajB = ajx;
  public static final GridLayout.a ajC = ajy;
  public static final GridLayout.a ajD = a(ajB, ajC);
  public static final GridLayout.a ajE = a(ajC, ajB);
  public static final GridLayout.a ajF = new GridLayout.a()
  {
    final String in()
    {
      return "CENTER";
    }

    public final int k(View paramAnonymousView, int paramAnonymousInt1, int paramAnonymousInt2)
    {
      return paramAnonymousInt1 >> 1;
    }

    final int w(View paramAnonymousView, int paramAnonymousInt)
    {
      return paramAnonymousInt >> 1;
    }
  };
  public static final GridLayout.a ajG = new GridLayout.7();
  public static final GridLayout.a ajH = new GridLayout.8();
  static final Printer ajh = new LogPrinter(3, GridLayout.class.getName());
  static final Printer aji = new GridLayout.1();
  private static final int ajj = 0;
  private static final int ajk = 1;
  private static final int ajl = 2;
  private static final int ajm = 3;
  private static final int ajn = 4;
  private static final int ajo = 5;
  private static final int ajp = 6;
  static final GridLayout.a ajw = new GridLayout.2();
  private static final GridLayout.a ajx = new GridLayout.3();
  private static final GridLayout.a ajy = new GridLayout.4();
  public static final GridLayout.a ajz = ajx;
  final GridLayout.d ajq = new GridLayout.d(this, true);
  final GridLayout.d ajr = new GridLayout.d(this, false);
  boolean ajs = false;
  int ajt = 1;
  int aju;
  int ajv = 0;
  int mOrientation = 0;
  Printer mPrinter = ajh;

  public GridLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public GridLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.aju = paramContext.getResources().getDimensionPixelOffset(2131428264);
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, a.a.GridLayout);
    try
    {
      setRowCount(paramContext.getInt(ajk, -2147483648));
      setColumnCount(paramContext.getInt(ajl, -2147483648));
      setOrientation(paramContext.getInt(ajj, 0));
      setUseDefaultMargins(paramContext.getBoolean(ajm, false));
      setAlignmentMode(paramContext.getInt(ajn, 1));
      setRowOrderPreserved(paramContext.getBoolean(ajo, true));
      setColumnOrderPreserved(paramContext.getBoolean(ajp, true));
      return;
    }
    finally
    {
      paramContext.recycle();
    }
    throw paramAttributeSet;
  }

  static void S(String paramString)
  {
    throw new IllegalArgumentException(paramString + ". ");
  }

  private static int U(int paramInt1, int paramInt2)
  {
    return View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(paramInt1 + paramInt2), View.MeasureSpec.getMode(paramInt1));
  }

  private static GridLayout.a a(GridLayout.a parama1, GridLayout.a parama2)
  {
    return new GridLayout.5(parama1, parama2);
  }

  public static GridLayout.i a(int paramInt1, int paramInt2, GridLayout.a parama, float paramFloat)
  {
    if (paramInt1 != -2147483648);
    for (boolean bool = true; ; bool = false)
      return new GridLayout.i(bool, paramInt1, paramInt2, parama, paramFloat);
  }

  private static void a(GridLayout.LayoutParams paramLayoutParams, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GridLayout.f localf = new GridLayout.f(paramInt1, paramInt1 + paramInt2);
    paramLayoutParams.akL = paramLayoutParams.akL.a(localf);
    localf = new GridLayout.f(paramInt3, paramInt3 + paramInt4);
    paramLayoutParams.akM = paramLayoutParams.akM.a(localf);
  }

  private void a(GridLayout.LayoutParams paramLayoutParams, boolean paramBoolean)
  {
    String str;
    label17: GridLayout.f localf;
    if (paramBoolean)
    {
      str = "column";
      if (!paramBoolean)
        break label180;
      paramLayoutParams = paramLayoutParams.akM;
      localf = paramLayoutParams.ajL;
      if ((localf.min != -2147483648) && (localf.min < 0))
        S(str + " indices must be positive");
      if (!paramBoolean)
        break label188;
    }
    label180: label188: for (paramLayoutParams = this.ajq; ; paramLayoutParams = this.ajr)
    {
      int i = paramLayoutParams.ajR;
      if (i != -2147483648)
      {
        if (localf.max > i)
          S(str + " indices (start + span) mustn't exceed the " + str + " count");
        if (localf.size() > i)
          S(str + " span mustn't exceed the " + str + " count");
      }
      return;
      str = "row";
      break;
      paramLayoutParams = paramLayoutParams.akL;
      break label17;
    }
  }

  static <T> T[] a(T[] paramArrayOfT1, T[] paramArrayOfT2)
  {
    Object[] arrayOfObject = (Object[])Array.newInstance(paramArrayOfT1.getClass().getComponentType(), paramArrayOfT1.length + paramArrayOfT2.length);
    System.arraycopy(paramArrayOfT1, 0, arrayOfObject, 0, paramArrayOfT1.length);
    System.arraycopy(paramArrayOfT2, 0, arrayOfObject, paramArrayOfT1.length, paramArrayOfT2.length);
    return arrayOfObject;
  }

  private int b(View paramView, boolean paramBoolean1, boolean paramBoolean2)
  {
    if (this.ajt == 1)
    {
      i = a(paramView, paramBoolean1, paramBoolean2);
      return i;
    }
    Object localObject;
    if (paramBoolean1)
    {
      localObject = this.ajq;
      label30: if (!paramBoolean2)
        break label132;
      if (((GridLayout.d)localObject).ajZ == null)
        ((GridLayout.d)localObject).ajZ = new int[((GridLayout.d)localObject).getCount() + 1];
      if (!((GridLayout.d)localObject).aka)
      {
        ((GridLayout.d)localObject).af(true);
        ((GridLayout.d)localObject).aka = true;
      }
      localObject = ((GridLayout.d)localObject).ajZ;
      label83: paramView = (GridLayout.LayoutParams)paramView.getLayoutParams();
      if (!paramBoolean1)
        break label184;
      paramView = paramView.akM;
      label100: if (!paramBoolean2)
        break label192;
    }
    label132: label184: label192: for (int i = paramView.ajL.min; ; i = paramView.ajL.max)
    {
      i = localObject[i];
      break;
      localObject = this.ajr;
      break label30;
      if (((GridLayout.d)localObject).akb == null)
        ((GridLayout.d)localObject).akb = new int[((GridLayout.d)localObject).getCount() + 1];
      if (!((GridLayout.d)localObject).akc)
      {
        ((GridLayout.d)localObject).af(false);
        ((GridLayout.d)localObject).akc = true;
      }
      localObject = ((GridLayout.d)localObject).akb;
      break label83;
      paramView = paramView.akL;
      break label100;
    }
  }

  static boolean bN(int paramInt)
  {
    if ((paramInt & 0x2) != 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  static GridLayout.LayoutParams bc(View paramView)
  {
    return (GridLayout.LayoutParams)paramView.getLayoutParams();
  }

  private void d(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    int i = getChildCount();
    int j = 0;
    if (j < i)
    {
      View localView = getChildAt(j);
      GridLayout.LayoutParams localLayoutParams;
      if (localView.getVisibility() != 8)
      {
        localLayoutParams = (GridLayout.LayoutParams)localView.getLayoutParams();
        if (!paramBoolean)
          break label72;
        g(localView, paramInt1, paramInt2, localLayoutParams.width, localLayoutParams.height);
      }
      while (true)
      {
        j++;
        break;
        label72: boolean bool;
        label82: label94: GridLayout.f localf;
        if (this.mOrientation == 0)
        {
          bool = true;
          if (!bool)
            break label189;
          localObject = localLayoutParams.akM;
          if (((GridLayout.i)localObject).ag(bool) != ajH)
            break label197;
          localf = ((GridLayout.i)localObject).ajL;
          if (!bool)
            break label199;
        }
        int k;
        label189: label197: label199: for (Object localObject = this.ajq; ; localObject = this.ajr)
        {
          localObject = ((GridLayout.d)localObject).iz();
          k = localObject[localf.max] - localObject[localf.min] - g(localView, bool);
          if (!bool)
            break label208;
          g(localView, paramInt1, paramInt2, k, localLayoutParams.height);
          break;
          bool = false;
          break label82;
          localObject = localLayoutParams.akL;
          break label94;
          break;
        }
        label208: g(localView, paramInt1, paramInt2, localLayoutParams.width, k);
      }
    }
  }

  static int g(int[] paramArrayOfInt)
  {
    int i = -1;
    int j = 0;
    int k = paramArrayOfInt.length;
    while (j < k)
    {
      i = Math.max(i, paramArrayOfInt[j]);
      j++;
    }
    return i;
  }

  private void g(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    paramView.measure(getChildMeasureSpec(paramInt1, g(paramView, true), paramInt3), getChildMeasureSpec(paramInt2, g(paramView, false), paramInt4));
  }

  static int h(View paramView, boolean paramBoolean)
  {
    if (paramBoolean);
    for (int i = paramView.getMeasuredWidth(); ; i = paramView.getMeasuredHeight())
      return i;
  }

  private boolean ih()
  {
    boolean bool = true;
    if (s.T(this) == 1);
    while (true)
    {
      return bool;
      bool = false;
    }
  }

  private void ii()
  {
    this.ajv = 0;
    if (this.ajq != null)
      this.ajq.ii();
    if (this.ajr != null)
      this.ajr.ii();
    ij();
  }

  private void ij()
  {
    if ((this.ajq != null) && (this.ajr != null))
    {
      this.ajq.ij();
      this.ajr.ij();
    }
  }

  private int ik()
  {
    int i = 1;
    int j = getChildCount();
    int k = 0;
    if (k < j)
    {
      View localView = getChildAt(k);
      if (localView.getVisibility() == 8)
        break label56;
      i = ((GridLayout.LayoutParams)localView.getLayoutParams()).hashCode() + i * 31;
    }
    label56: 
    while (true)
    {
      k++;
      break;
      return i;
    }
  }

  private void il()
  {
    int i;
    Object localObject;
    label25: int j;
    label39: int k;
    int m;
    int[] arrayOfInt;
    int i1;
    GridLayout.LayoutParams localLayoutParams;
    label90: GridLayout.f localf;
    boolean bool1;
    int i2;
    label131: boolean bool2;
    int i3;
    if (this.ajv == 0)
      if (this.mOrientation == 0)
      {
        i = 1;
        if (i == 0)
          break label259;
        localObject = this.ajq;
        if (((GridLayout.d)localObject).ajR == -2147483648)
          break label267;
        j = ((GridLayout.d)localObject).ajR;
        k = 0;
        m = 0;
        arrayOfInt = new int[j];
        int n = getChildCount();
        i1 = 0;
        if (i1 >= n)
          break label471;
        localLayoutParams = (GridLayout.LayoutParams)getChildAt(i1).getLayoutParams();
        if (i == 0)
          break label272;
        localObject = localLayoutParams.akL;
        localf = ((GridLayout.i)localObject).ajL;
        bool1 = ((GridLayout.i)localObject).akR;
        i2 = localf.size();
        if (bool1)
          k = localf.min;
        if (i == 0)
          break label281;
        localObject = localLayoutParams.akM;
        localf = ((GridLayout.i)localObject).ajL;
        bool2 = ((GridLayout.i)localObject).akR;
        i3 = localf.size();
        if (j != 0)
          break label290;
        if (!bool2)
          break label510;
      }
    label212: label359: label365: label510: for (int i4 = localf.min; ; i4 = m)
    {
      int i5 = i4;
      int i6 = k;
      if (j != 0)
      {
        m = i4;
        int i7 = k;
        if (bool1)
        {
          i5 = i4;
          i6 = k;
          if (!bool2)
          {
            i7 = k;
            m = i4;
          }
        }
        else
        {
          while (true)
          {
            i4 = m + i3;
            if (i4 > arrayOfInt.length)
              k = 0;
            while (true)
            {
              i5 = m;
              i6 = i7;
              if (k != 0)
                break label389;
              if (!bool2)
                break label365;
              i7++;
              break label212;
              i = 0;
              break;
              localObject = this.ajr;
              break label25;
              j = 0;
              break label39;
              localObject = localLayoutParams.akM;
              break label90;
              localObject = localLayoutParams.akL;
              break label131;
              if (bool2);
              for (i4 = Math.min(localf.min, j); ; i4 = 0)
              {
                i3 = Math.min(i3, j - i4);
                break;
              }
              for (k = m; ; k++)
              {
                if (k >= i4)
                  break label359;
                if (arrayOfInt[k] > i7)
                {
                  k = 0;
                  break;
                }
              }
              k = 1;
            }
            if (m + i3 <= j)
            {
              m++;
            }
            else
            {
              m = 0;
              i7++;
            }
          }
        }
        k = arrayOfInt.length;
        Arrays.fill(arrayOfInt, Math.min(i5, k), Math.min(i5 + i3, k), i6 + i2);
      }
      if (i != 0)
        a(localLayoutParams, i6, i2, i5, i3);
      while (true)
      {
        m = i5 + i3;
        i1++;
        k = i6;
        break;
        a(localLayoutParams, i5, i3, i6, i2);
      }
      this.ajv = ik();
      do
        return;
      while (this.ajv == ik());
      this.mPrinter.println("The fields of some layout parameters were modified in between layout operations. Check the javadoc for GridLayout.LayoutParams#rowSpec.");
      ii();
      break;
    }
  }

  public static GridLayout.i im()
  {
    return a(-2147483648, 1, ajw, 0.0F);
  }

  static GridLayout.a n(int paramInt, boolean paramBoolean)
  {
    int i;
    int j;
    label13: GridLayout.a locala;
    if (paramBoolean)
    {
      i = 7;
      if (!paramBoolean)
        break label90;
      j = 0;
      switch ((i & paramInt) >> j)
      {
      default:
        locala = ajw;
      case 3:
      case 5:
      case 7:
      case 1:
      case 8388611:
      case 8388613:
      }
    }
    while (true)
    {
      return locala;
      i = 112;
      break;
      label90: j = 4;
      break label13;
      if (paramBoolean)
      {
        locala = ajD;
      }
      else
      {
        locala = ajz;
        continue;
        if (paramBoolean)
        {
          locala = ajE;
        }
        else
        {
          locala = ajA;
          continue;
          locala = ajH;
          continue;
          locala = ajF;
          continue;
          locala = ajB;
          continue;
          locala = ajC;
        }
      }
    }
  }

  final int a(View paramView, boolean paramBoolean1, boolean paramBoolean2)
  {
    Object localObject = (GridLayout.LayoutParams)paramView.getLayoutParams();
    int i;
    if (paramBoolean1)
      if (paramBoolean2)
      {
        i = ((GridLayout.LayoutParams)localObject).leftMargin;
        if (i != -2147483648)
          break label214;
        if (this.ajs)
          break label78;
        i = 0;
      }
    label78: label214: 
    while (true)
    {
      return i;
      i = ((GridLayout.LayoutParams)localObject).rightMargin;
      break;
      if (paramBoolean2)
      {
        i = ((GridLayout.LayoutParams)localObject).topMargin;
        break;
      }
      i = ((GridLayout.LayoutParams)localObject).bottomMargin;
      break;
      label89: GridLayout.d locald;
      label99: boolean bool;
      if (paramBoolean1)
      {
        localObject = ((GridLayout.LayoutParams)localObject).akM;
        if (!paramBoolean1)
          break label179;
        locald = this.ajq;
        localObject = ((GridLayout.i)localObject).ajL;
        bool = paramBoolean2;
        if (paramBoolean1)
        {
          bool = paramBoolean2;
          if (ih())
          {
            if (paramBoolean2)
              break label188;
            bool = true;
          }
        }
        if (!bool)
          break label194;
        if (((GridLayout.f)localObject).min == 0);
      }
      while (true)
      {
        if ((paramView.getClass() != android.support.v4.widget.Space.class) && (paramView.getClass() != android.widget.Space.class))
          break label203;
        i = 0;
        break;
        localObject = ((GridLayout.LayoutParams)localObject).akL;
        break label89;
        locald = this.ajr;
        break label99;
        bool = false;
        break label130;
        locald.getCount();
      }
      i = this.aju / 2;
    }
  }

  protected boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    boolean bool = false;
    if (!(paramLayoutParams instanceof GridLayout.LayoutParams));
    while (true)
    {
      return bool;
      paramLayoutParams = (GridLayout.LayoutParams)paramLayoutParams;
      a(paramLayoutParams, true);
      a(paramLayoutParams, false);
      bool = true;
    }
  }

  final int g(View paramView, boolean paramBoolean)
  {
    return b(paramView, paramBoolean, true) + b(paramView, paramBoolean, false);
  }

  public int getAlignmentMode()
  {
    return this.ajt;
  }

  public int getColumnCount()
  {
    return this.ajq.getCount();
  }

  public int getOrientation()
  {
    return this.mOrientation;
  }

  public Printer getPrinter()
  {
    return this.mPrinter;
  }

  public int getRowCount()
  {
    return this.ajr.getCount();
  }

  public boolean getUseDefaultMargins()
  {
    return this.ajs;
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    il();
    int i = paramInt3 - paramInt1;
    paramInt3 = getPaddingLeft();
    int j = getPaddingTop();
    int k = getPaddingRight();
    paramInt1 = getPaddingBottom();
    this.ajq.bP(i - paramInt3 - k);
    this.ajr.bP(paramInt4 - paramInt2 - j - paramInt1);
    int[] arrayOfInt1 = this.ajq.iz();
    int[] arrayOfInt2 = this.ajr.iz();
    paramInt4 = getChildCount();
    paramInt1 = 0;
    if (paramInt1 < paramInt4)
    {
      View localView = getChildAt(paramInt1);
      int m;
      int n;
      int i1;
      int i2;
      int i5;
      int i8;
      int i9;
      if (localView.getVisibility() != 8)
      {
        Object localObject1 = (GridLayout.LayoutParams)localView.getLayoutParams();
        Object localObject2 = ((GridLayout.LayoutParams)localObject1).akM;
        localObject1 = ((GridLayout.LayoutParams)localObject1).akL;
        Object localObject3 = ((GridLayout.i)localObject2).ajL;
        Object localObject4 = ((GridLayout.i)localObject1).ajL;
        paramInt2 = arrayOfInt1[localObject3.min];
        m = arrayOfInt2[localObject4.min];
        n = arrayOfInt1[localObject3.max];
        i1 = arrayOfInt2[localObject4.max];
        i2 = n - paramInt2;
        int i3 = i1 - m;
        int i4 = h(localView, true);
        i5 = h(localView, false);
        localObject2 = ((GridLayout.i)localObject2).ag(true);
        localObject4 = ((GridLayout.i)localObject1).ag(false);
        localObject1 = (GridLayout.e)this.ajq.it().bR(paramInt1);
        localObject3 = (GridLayout.e)this.ajr.it().bR(paramInt1);
        int i6 = ((GridLayout.a)localObject2).w(localView, i2 - ((GridLayout.e)localObject1).ac(true));
        i1 = ((GridLayout.a)localObject4).w(localView, i3 - ((GridLayout.e)localObject3).ac(true));
        int i7 = b(localView, true, true);
        n = b(localView, false, true);
        i8 = b(localView, true, false);
        i9 = b(localView, false, false);
        int i10 = i7 + i8;
        int i11 = n + i9;
        int i12 = ((GridLayout.e)localObject1).a(this, localView, (GridLayout.a)localObject2, i4 + i10, true);
        i9 = ((GridLayout.e)localObject3).a(this, localView, (GridLayout.a)localObject4, i5 + i11, false);
        i2 = ((GridLayout.a)localObject2).W(i4, i2 - i10);
        i5 = ((GridLayout.a)localObject4).W(i5, i3 - i11);
        paramInt2 = i12 + (paramInt2 + i6);
        if (ih())
          break label524;
        paramInt2 += paramInt3 + i7;
      }
      while (true)
      {
        m = i9 + (j + m + i1) + n;
        if ((i2 != localView.getMeasuredWidth()) || (i5 != localView.getMeasuredHeight()))
          localView.measure(View.MeasureSpec.makeMeasureSpec(i2, 1073741824), View.MeasureSpec.makeMeasureSpec(i5, 1073741824));
        localView.layout(paramInt2, m, i2 + paramInt2, i5 + m);
        paramInt1++;
        break;
        label524: paramInt2 = i - i2 - k - i8 - paramInt2;
      }
    }
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    il();
    ij();
    int i = getPaddingLeft() + getPaddingRight();
    int j = getPaddingTop() + getPaddingBottom();
    int k = U(paramInt1, -i);
    int m = U(paramInt2, -j);
    d(k, m, true);
    int n;
    int i1;
    if (this.mOrientation == 0)
    {
      n = this.ajq.bO(k);
      d(k, m, false);
      i1 = this.ajr.bO(m);
    }
    while (true)
    {
      n = Math.max(n + i, getSuggestedMinimumWidth());
      i1 = Math.max(i1 + j, getSuggestedMinimumHeight());
      setMeasuredDimension(View.resolveSizeAndState(n, paramInt1, 0), View.resolveSizeAndState(i1, paramInt2, 0));
      return;
      i1 = this.ajr.bO(m);
      d(k, m, false);
      n = this.ajq.bO(k);
    }
  }

  public void requestLayout()
  {
    super.requestLayout();
    ii();
  }

  public void setAlignmentMode(int paramInt)
  {
    this.ajt = paramInt;
    requestLayout();
  }

  public void setColumnCount(int paramInt)
  {
    this.ajq.setCount(paramInt);
    ii();
    requestLayout();
  }

  public void setColumnOrderPreserved(boolean paramBoolean)
  {
    this.ajq.ad(paramBoolean);
    ii();
    requestLayout();
  }

  public void setOrientation(int paramInt)
  {
    if (this.mOrientation != paramInt)
    {
      this.mOrientation = paramInt;
      ii();
      requestLayout();
    }
  }

  public void setPrinter(Printer paramPrinter)
  {
    Printer localPrinter = paramPrinter;
    if (paramPrinter == null)
      localPrinter = aji;
    this.mPrinter = localPrinter;
  }

  public void setRowCount(int paramInt)
  {
    this.ajr.setCount(paramInt);
    ii();
    requestLayout();
  }

  public void setRowOrderPreserved(boolean paramBoolean)
  {
    this.ajr.ad(paramBoolean);
    ii();
    requestLayout();
  }

  public void setUseDefaultMargins(boolean paramBoolean)
  {
    this.ajs = paramBoolean;
    requestLayout();
  }

  static final class h<K, V>
  {
    public final int[] akN;
    public final K[] akO;
    public final V[] akP;

    h(K[] paramArrayOfK, V[] paramArrayOfV)
    {
      this.akN = c(paramArrayOfK);
      this.akO = a(paramArrayOfK, this.akN);
      this.akP = a(paramArrayOfV, this.akN);
    }

    private static <K> K[] a(K[] paramArrayOfK, int[] paramArrayOfInt)
    {
      int i = paramArrayOfK.length;
      Object[] arrayOfObject = (Object[])Array.newInstance(paramArrayOfK.getClass().getComponentType(), GridLayout.g(paramArrayOfInt) + 1);
      for (int j = 0; j < i; j++)
        arrayOfObject[paramArrayOfInt[j]] = paramArrayOfK[j];
      return arrayOfObject;
    }

    private static <K> int[] c(K[] paramArrayOfK)
    {
      int i = paramArrayOfK.length;
      int[] arrayOfInt = new int[i];
      HashMap localHashMap = new HashMap();
      for (int j = 0; j < i; j++)
      {
        K ? = paramArrayOfK[j];
        Integer localInteger1 = (Integer)localHashMap.get(?);
        Integer localInteger2 = localInteger1;
        if (localInteger1 == null)
        {
          localInteger2 = Integer.valueOf(localHashMap.size());
          localHashMap.put(?, localInteger2);
        }
        arrayOfInt[j] = localInteger2.intValue();
      }
      return arrayOfInt;
    }

    public final V bR(int paramInt)
    {
      return this.akP[this.akN[paramInt]];
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.GridLayout
 * JD-Core Version:    0.6.2
 */