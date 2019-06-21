package android.support.v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.support.v4.widget.n;
import android.support.v7.a.a.a;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.PopupWindow.OnDismissListener;
import java.lang.reflect.Method;

public class ListPopupWindow
  implements android.support.v7.view.menu.s
{
  private static Method amh;
  private static Method ami;
  private static Method amj;
  private ListAdapter Ei;
  public int aaD = 0;
  public Rect ach;
  private boolean afP;
  public int age = -2;
  private AdapterView.OnItemSelectedListener amA;
  final e amB = new e();
  private final d amC = new d();
  private final c amD = new c();
  private final a amE = new a();
  private Runnable amF;
  public boolean amG;
  public PopupWindow amH;
  public ab amk;
  private int aml = -2;
  public int amm;
  private int amn;
  private int amo = 1002;
  private boolean amp;
  private boolean amq = true;
  private boolean amr;
  private boolean ams = false;
  private boolean amt = false;
  int amu = 2147483647;
  private View amv;
  int amw = 0;
  public View amx;
  private Drawable amy;
  public AdapterView.OnItemClickListener amz;
  private Context mContext;
  final Handler mHandler;
  private DataSetObserver mObserver;
  private final Rect mTempRect = new Rect();

  static
  {
    try
    {
      amh = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", new Class[] { Boolean.TYPE });
      try
      {
        label20: ami = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", new Class[] { View.class, Integer.TYPE, Boolean.TYPE });
        try
        {
          label51: amj = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", new Class[] { Rect.class });
          label70: return;
        }
        catch (NoSuchMethodException localNoSuchMethodException1)
        {
          break label70;
        }
      }
      catch (NoSuchMethodException localNoSuchMethodException2)
      {
        break label51;
      }
    }
    catch (NoSuchMethodException localNoSuchMethodException3)
    {
      break label20;
    }
  }

  public ListPopupWindow(Context paramContext)
  {
    this(paramContext, null, 2130772193);
  }

  public ListPopupWindow(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 2130772193);
  }

  public ListPopupWindow(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    this(paramContext, paramAttributeSet, paramInt, 0);
  }

  public ListPopupWindow(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    this.mContext = paramContext;
    this.mHandler = new Handler(paramContext.getMainLooper());
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, a.a.ListPopupWindow, paramInt1, paramInt2);
    this.amm = localTypedArray.getDimensionPixelOffset(0, 0);
    this.amn = localTypedArray.getDimensionPixelOffset(1, 0);
    if (this.amn != 0)
      this.amp = true;
    localTypedArray.recycle();
    this.amH = new AppCompatPopupWindow(paramContext, paramAttributeSet, paramInt1, paramInt2);
    this.amH.setInputMethodMode(1);
  }

  private int getMaxAvailableHeight(View paramView, int paramInt, boolean paramBoolean)
  {
    if (ami != null);
    while (true)
    {
      try
      {
        int i = ((Integer)ami.invoke(this.amH, new Object[] { paramView, Integer.valueOf(paramInt), Boolean.valueOf(paramBoolean) })).intValue();
        paramInt = i;
        return paramInt;
      }
      catch (Exception localException)
      {
      }
      paramInt = this.amH.getMaxAvailableHeight(paramView, paramInt);
    }
  }

  private void iY()
  {
    if (this.amv != null)
    {
      ViewParent localViewParent = this.amv.getParent();
      if ((localViewParent instanceof ViewGroup))
        ((ViewGroup)localViewParent).removeView(this.amv);
    }
  }

  public final void clearListSelection()
  {
    ab localab = this.amk;
    if (localab != null)
    {
      localab.setListSelectionHidden(true);
      localab.requestLayout();
    }
  }

  public final void dismiss()
  {
    this.amH.dismiss();
    iY();
    this.amH.setContentView(null);
    this.amk = null;
    this.mHandler.removeCallbacks(this.amB);
  }

  ab g(Context paramContext, boolean paramBoolean)
  {
    return new ab(paramContext, paramBoolean);
  }

  public final ListView getListView()
  {
    return this.amk;
  }

  public final int getVerticalOffset()
  {
    if (!this.amp);
    for (int i = 0; ; i = this.amn)
      return i;
  }

  public final void iZ()
  {
    this.amH.setInputMethodMode(2);
  }

  public final boolean isInputMethodNotNeeded()
  {
    if (this.amH.getInputMethodMode() == 2);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean isShowing()
  {
    return this.amH.isShowing();
  }

  public final void ja()
  {
    this.amr = true;
    this.afP = true;
  }

  public void setAdapter(ListAdapter paramListAdapter)
  {
    if (this.mObserver == null)
      this.mObserver = new b();
    while (true)
    {
      this.Ei = paramListAdapter;
      if (paramListAdapter != null)
        paramListAdapter.registerDataSetObserver(this.mObserver);
      if (this.amk != null)
        this.amk.setAdapter(this.Ei);
      return;
      if (this.Ei != null)
        this.Ei.unregisterDataSetObserver(this.mObserver);
    }
  }

  public final void setAnimationStyle(int paramInt)
  {
    this.amH.setAnimationStyle(paramInt);
  }

  public final void setBackgroundDrawable(Drawable paramDrawable)
  {
    this.amH.setBackgroundDrawable(paramDrawable);
  }

  public final void setContentWidth(int paramInt)
  {
    Drawable localDrawable = this.amH.getBackground();
    if (localDrawable != null)
      localDrawable.getPadding(this.mTempRect);
    for (this.age = (this.mTempRect.left + this.mTempRect.right + paramInt); ; this.age = paramInt)
      return;
  }

  public final void setHeight(int paramInt)
  {
    if ((paramInt < 0) && (-2 != paramInt) && (-1 != paramInt))
      throw new IllegalArgumentException("Invalid height. Must be a positive value, MATCH_PARENT, or WRAP_CONTENT.");
    this.aml = paramInt;
  }

  public final void setModal(boolean paramBoolean)
  {
    this.amG = paramBoolean;
    this.amH.setFocusable(paramBoolean);
  }

  public final void setOnDismissListener(PopupWindow.OnDismissListener paramOnDismissListener)
  {
    this.amH.setOnDismissListener(paramOnDismissListener);
  }

  public final void setVerticalOffset(int paramInt)
  {
    this.amn = paramInt;
    this.amp = true;
  }

  public void show()
  {
    boolean bool1 = true;
    boolean bool2 = true;
    Object localObject1;
    boolean bool3;
    Object localObject3;
    View localView;
    LinearLayout.LayoutParams localLayoutParams;
    label238: int i;
    int j;
    if (this.amk == null)
    {
      localObject1 = this.mContext;
      this.amF = new Runnable()
      {
        public final void run()
        {
          View localView = ListPopupWindow.this.amx;
          if ((localView != null) && (localView.getWindowToken() != null))
            ListPopupWindow.this.show();
        }
      };
      if (!this.amG)
      {
        bool3 = true;
        this.amk = g((Context)localObject1, bool3);
        if (this.amy != null)
          this.amk.setSelector(this.amy);
        this.amk.setAdapter(this.Ei);
        this.amk.setOnItemClickListener(this.amz);
        this.amk.setFocusable(true);
        this.amk.setFocusableInTouchMode(true);
        this.amk.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
          public final void onItemSelected(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
          {
            if (paramAnonymousInt != -1)
            {
              paramAnonymousAdapterView = ListPopupWindow.this.amk;
              if (paramAnonymousAdapterView != null)
                paramAnonymousAdapterView.setListSelectionHidden(false);
            }
          }

          public final void onNothingSelected(AdapterView<?> paramAnonymousAdapterView)
          {
          }
        });
        this.amk.setOnScrollListener(this.amD);
        if (this.amA != null)
          this.amk.setOnItemSelectedListener(this.amA);
        localObject3 = this.amk;
        localView = this.amv;
        if (localView == null)
          break label1305;
        localObject1 = new LinearLayout((Context)localObject1);
        ((LinearLayout)localObject1).setOrientation(1);
        localLayoutParams = new LinearLayout.LayoutParams(-1, 0, 1.0F);
        switch (this.amw)
        {
        default:
          new StringBuilder("Invalid hint position ").append(this.amw);
          if (this.age >= 0)
          {
            i = this.age;
            j = -2147483648;
            label256: localView.measure(View.MeasureSpec.makeMeasureSpec(i, j), 0);
            localObject3 = (LinearLayout.LayoutParams)localView.getLayoutParams();
            j = localView.getMeasuredHeight() + ((LinearLayout.LayoutParams)localObject3).topMargin + ((LinearLayout.LayoutParams)localObject3).bottomMargin;
          }
          break;
        case 1:
        case 0:
        }
      }
    }
    while (true)
    {
      this.amH.setContentView((View)localObject1);
      while (true)
      {
        label306: localObject1 = this.amH.getBackground();
        if (localObject1 != null)
        {
          ((Drawable)localObject1).getPadding(this.mTempRect);
          i = this.mTempRect.top + this.mTempRect.bottom;
          if (this.amp)
            break label1296;
          this.amn = (-this.mTempRect.top);
        }
        label773: label1293: label1296: 
        while (true)
        {
          label363: if (this.amH.getInputMethodMode() == 2);
          int k;
          for (bool3 = true; ; bool3 = false)
          {
            k = getMaxAvailableHeight(this.amx, this.amn, bool3);
            if ((!this.ams) && (this.aml != -1))
              break label568;
            j = k + i;
            bool3 = isInputMethodNotNeeded();
            n.a(this.amH, this.amo);
            if (!this.amH.isShowing())
              break label1005;
            if (android.support.v4.view.s.av(this.amx))
              break label749;
            return;
            bool3 = false;
            break;
            ((LinearLayout)localObject1).addView((View)localObject3, localLayoutParams);
            ((LinearLayout)localObject1).addView(localView);
            break label238;
            ((LinearLayout)localObject1).addView(localView);
            ((LinearLayout)localObject1).addView((View)localObject3, localLayoutParams);
            break label238;
            j = 0;
            i = 0;
            break label256;
            this.amH.getContentView();
            localObject1 = this.amv;
            if (localObject1 == null)
              break label1299;
            localObject3 = (LinearLayout.LayoutParams)((View)localObject1).getLayoutParams();
            j = ((View)localObject1).getMeasuredHeight() + ((LinearLayout.LayoutParams)localObject3).topMargin + ((LinearLayout.LayoutParams)localObject3).bottomMargin;
            break label306;
            this.mTempRect.setEmpty();
            i = 0;
            break label363;
          }
          label568: int m;
          switch (this.age)
          {
          default:
            m = View.MeasureSpec.makeMeasureSpec(this.age, 1073741824);
          case -2:
          case -1:
          }
          while (true)
          {
            k = this.amk.d(m, 0, -1, k - j, -1);
            m = j;
            if (k > 0)
              m = j + (this.amk.getPaddingTop() + this.amk.getPaddingBottom() + i);
            j = k + m;
            break;
            m = View.MeasureSpec.makeMeasureSpec(this.mContext.getResources().getDisplayMetrics().widthPixels - (this.mTempRect.left + this.mTempRect.right), -2147483648);
            continue;
            m = View.MeasureSpec.makeMeasureSpec(this.mContext.getResources().getDisplayMetrics().widthPixels - (this.mTempRect.left + this.mTempRect.right), 1073741824);
          }
          label749: if (this.age == -1)
          {
            i = -1;
            label760: if (this.aml != -1)
              break label981;
            if (!bool3)
              break label930;
            if (!bool3)
              break label942;
            localObject1 = this.amH;
            if (this.age != -1)
              break label936;
            m = -1;
            ((PopupWindow)localObject1).setWidth(m);
            this.amH.setHeight(0);
          }
          while (true)
            while (true)
            {
              label794: label808: localObject1 = this.amH;
              if ((!this.amt) && (!this.ams));
              for (bool3 = bool2; ; bool3 = false)
              {
                ((PopupWindow)localObject1).setOutsideTouchable(bool3);
                localObject1 = this.amH;
                localObject3 = this.amx;
                k = this.amm;
                int n = this.amn;
                m = i;
                if (i < 0)
                  m = -1;
                i = j;
                if (j < 0)
                  i = -1;
                ((PopupWindow)localObject1).update((View)localObject3, k, n, m, i);
                break;
                if (this.age == -2)
                {
                  i = this.amx.getWidth();
                  break label760;
                }
                i = this.age;
                break label760;
                label930: j = -1;
                break label773;
                label936: m = 0;
                break label794;
                label942: localObject1 = this.amH;
                if (this.age == -1);
                for (m = -1; ; m = 0)
                {
                  ((PopupWindow)localObject1).setWidth(m);
                  this.amH.setHeight(-1);
                  break;
                }
                label981: if (this.aml == -2)
                  break label1293;
                j = this.aml;
                break label808;
              }
              label1005: if (this.age == -1)
              {
                i = -1;
                label1016: if (this.aml != -1)
                  break label1261;
                j = -1;
                this.amH.setWidth(i);
                this.amH.setHeight(j);
                if (amh == null);
              }
              try
              {
                while (true)
                {
                  amh.invoke(this.amH, new Object[] { Boolean.TRUE });
                  label1072: localObject1 = this.amH;
                  if ((!this.amt) && (!this.ams))
                  {
                    bool3 = bool1;
                    ((PopupWindow)localObject1).setOutsideTouchable(bool3);
                    this.amH.setTouchInterceptor(this.amC);
                    if (this.amr)
                      n.a(this.amH, this.afP);
                    if (amj == null);
                  }
                  try
                  {
                    amj.invoke(this.amH, new Object[] { this.ach });
                    n.a(this.amH, this.amx, this.amm, this.amn, this.aaD);
                    this.amk.setSelection(-1);
                    if ((!this.amG) || (this.amk.isInTouchMode()))
                      clearListSelection();
                    if (this.amG)
                      break;
                    this.mHandler.post(this.amE);
                    break;
                    if (this.age == -2)
                    {
                      i = this.amx.getWidth();
                      break label1016;
                    }
                    i = this.age;
                    break label1016;
                    label1261: if (this.aml == -2)
                      break label1027;
                    j = this.aml;
                    break label1027;
                    bool3 = false;
                  }
                  catch (Exception localException1)
                  {
                    break label1157;
                  }
                }
              }
              catch (Exception localException2)
              {
                break label1072;
              }
            }
        }
        label1027: label1157: label1299: j = 0;
      }
      label1305: j = 0;
      Object localObject2 = localObject3;
    }
  }

  final class a
    implements Runnable
  {
    a()
    {
    }

    public final void run()
    {
      ListPopupWindow.this.clearListSelection();
    }
  }

  final class b extends DataSetObserver
  {
    b()
    {
    }

    public final void onChanged()
    {
      if (ListPopupWindow.this.amH.isShowing())
        ListPopupWindow.this.show();
    }

    public final void onInvalidated()
    {
      ListPopupWindow.this.dismiss();
    }
  }

  final class c
    implements AbsListView.OnScrollListener
  {
    c()
    {
    }

    public final void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3)
    {
    }

    public final void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
    {
      if ((paramInt == 1) && (!ListPopupWindow.this.isInputMethodNotNeeded()) && (ListPopupWindow.this.amH.getContentView() != null))
      {
        ListPopupWindow.this.mHandler.removeCallbacks(ListPopupWindow.this.amB);
        ListPopupWindow.this.amB.run();
      }
    }
  }

  final class d
    implements View.OnTouchListener
  {
    d()
    {
    }

    public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
    {
      int i = paramMotionEvent.getAction();
      int j = (int)paramMotionEvent.getX();
      int k = (int)paramMotionEvent.getY();
      if ((i == 0) && (ListPopupWindow.this.amH != null) && (ListPopupWindow.this.amH.isShowing()) && (j >= 0) && (j < ListPopupWindow.this.amH.getWidth()) && (k >= 0) && (k < ListPopupWindow.this.amH.getHeight()))
        ListPopupWindow.this.mHandler.postDelayed(ListPopupWindow.this.amB, 250L);
      while (true)
      {
        return false;
        if (i == 1)
          ListPopupWindow.this.mHandler.removeCallbacks(ListPopupWindow.this.amB);
      }
    }
  }

  final class e
    implements Runnable
  {
    e()
    {
    }

    public final void run()
    {
      if ((ListPopupWindow.this.amk != null) && (android.support.v4.view.s.av(ListPopupWindow.this.amk)) && (ListPopupWindow.this.amk.getCount() > ListPopupWindow.this.amk.getChildCount()) && (ListPopupWindow.this.amk.getChildCount() <= ListPopupWindow.this.amu))
      {
        ListPopupWindow.this.amH.setInputMethodMode(2);
        ListPopupWindow.this.show();
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.ListPopupWindow
 * JD-Core Version:    0.6.2
 */