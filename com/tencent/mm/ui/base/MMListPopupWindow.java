package com.tencent.mm.ui.base;

import android.content.Context;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ListAdapter;
import android.widget.PopupWindow.OnDismissListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.ai;
import com.tencent.mm.ui.al;

public class MMListPopupWindow
{
  private ListAdapter Ei;
  private int age;
  private AdapterView.OnItemSelectedListener amA;
  private Runnable amF;
  private boolean amG;
  public int aml;
  public int amm;
  private int amn;
  private boolean amp;
  private boolean ams;
  public boolean amt;
  int amu;
  public View amv;
  public int amw;
  public View amx;
  private Drawable amy;
  public AdapterView.OnItemClickListener amz;
  public o gKG;
  public boolean jia;
  private Context mContext;
  private Handler mHandler;
  private DataSetObserver mObserver;
  private Rect mTempRect;
  private final MMListPopupWindow.f yvI;
  private final MMListPopupWindow.e yvJ;
  private final MMListPopupWindow.d yvK;
  private final b yvL;
  public MMListPopupWindow.a yvM;

  public MMListPopupWindow(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 2130772193);
  }

  public MMListPopupWindow(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    AppMethodBeat.i(112520);
    this.yvI = new MMListPopupWindow.f(this, (byte)0);
    this.yvJ = new MMListPopupWindow.e(this, (byte)0);
    this.yvK = new MMListPopupWindow.d(this, (byte)0);
    this.yvL = new b((byte)0);
    this.amu = 2147483647;
    this.aml = -2;
    this.age = -2;
    this.ams = false;
    this.amt = false;
    this.amw = 0;
    this.mHandler = new Handler();
    this.mTempRect = new Rect();
    this.jia = false;
    this.mContext = paramContext;
    this.gKG = new o(paramContext);
    this.gKG.setInputMethodMode(1);
    AppMethodBeat.o(112520);
  }

  public final void clearListSelection()
  {
    AppMethodBeat.i(112531);
    MMListPopupWindow.a locala = this.yvM;
    if (locala != null)
    {
      MMListPopupWindow.a.a(locala, true);
      locala.requestLayout();
    }
    AppMethodBeat.o(112531);
  }

  public final void dismiss()
  {
    AppMethodBeat.i(112527);
    this.gKG.dismiss();
    iY();
    this.gKG.setContentView(null);
    this.yvM = null;
    this.mHandler.removeCallbacks(this.yvI);
    AppMethodBeat.o(112527);
  }

  public final void iY()
  {
    AppMethodBeat.i(112529);
    if (this.amv != null)
    {
      ViewParent localViewParent = this.amv.getParent();
      if ((localViewParent instanceof ViewGroup))
        ((ViewGroup)localViewParent).removeView(this.amv);
    }
    AppMethodBeat.o(112529);
  }

  public final void iZ()
  {
    AppMethodBeat.i(112530);
    this.gKG.setInputMethodMode(2);
    AppMethodBeat.o(112530);
  }

  public final boolean isInputMethodNotNeeded()
  {
    AppMethodBeat.i(112532);
    boolean bool;
    if (this.gKG.getInputMethodMode() == 2)
    {
      bool = true;
      AppMethodBeat.o(112532);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(112532);
    }
  }

  public final void setAdapter(ListAdapter paramListAdapter)
  {
    AppMethodBeat.i(112521);
    if (this.mObserver == null)
      this.mObserver = new MMListPopupWindow.c(this, (byte)0);
    while (true)
    {
      this.Ei = paramListAdapter;
      if (this.Ei != null)
        paramListAdapter.registerDataSetObserver(this.mObserver);
      if (this.yvM != null)
        this.yvM.setAdapter(this.Ei);
      AppMethodBeat.o(112521);
      return;
      if (this.Ei != null)
        this.Ei.unregisterDataSetObserver(this.mObserver);
    }
  }

  public final void setAnimationStyle(int paramInt)
  {
    AppMethodBeat.i(112524);
    this.gKG.setAnimationStyle(paramInt);
    AppMethodBeat.o(112524);
  }

  public final void setBackgroundDrawable(Drawable paramDrawable)
  {
    AppMethodBeat.i(112523);
    this.gKG.setBackgroundDrawable(paramDrawable);
    AppMethodBeat.o(112523);
  }

  public final void setContentWidth(int paramInt)
  {
    AppMethodBeat.i(112525);
    Drawable localDrawable = this.gKG.getBackground();
    if (localDrawable != null)
    {
      localDrawable.getPadding(this.mTempRect);
      this.age = (this.mTempRect.left + this.mTempRect.right + paramInt);
      AppMethodBeat.o(112525);
    }
    while (true)
    {
      return;
      this.age = paramInt;
      AppMethodBeat.o(112525);
    }
  }

  public final void setModal(boolean paramBoolean)
  {
    AppMethodBeat.i(112522);
    this.amG = paramBoolean;
    this.gKG.setFocusable(this.amG);
    AppMethodBeat.o(112522);
  }

  public final void setOnDismissListener(PopupWindow.OnDismissListener paramOnDismissListener)
  {
    AppMethodBeat.i(112528);
    this.gKG.setOnDismissListener(paramOnDismissListener);
    AppMethodBeat.o(112528);
  }

  public final void setVerticalOffset(int paramInt)
  {
    this.amn = paramInt;
    this.amp = true;
  }

  public final void show()
  {
    boolean bool1 = true;
    boolean bool2 = true;
    int i = -1;
    AppMethodBeat.i(112526);
    Object localObject1;
    boolean bool3;
    Object localObject2;
    View localView;
    FrameLayout.LayoutParams localLayoutParams1;
    FrameLayout.LayoutParams localLayoutParams2;
    if (this.yvM == null)
    {
      localObject1 = this.mContext;
      this.amF = new MMListPopupWindow.1(this);
      if (!this.amG)
      {
        bool3 = true;
        this.yvM = new MMListPopupWindow.a((Context)localObject1, bool3, (byte)0);
        if (this.amy != null)
          this.yvM.setSelector(this.amy);
        this.yvM.setAdapter(this.Ei);
        this.yvM.setOnItemClickListener(this.amz);
        this.yvM.setFocusable(true);
        this.yvM.setFocusableInTouchMode(true);
        this.yvM.setDivider(null);
        this.yvM.setDividerHeight(0);
        this.yvM.setOnItemSelectedListener(new MMListPopupWindow.2(this));
        this.yvM.setOnScrollListener(this.yvK);
        if (this.amA != null)
          this.yvM.setOnItemSelectedListener(this.amA);
        localObject2 = this.yvM;
        localView = this.amv;
        if (localView == null)
          break label1367;
        iY();
        localObject1 = new FrameLayout((Context)localObject1);
        localLayoutParams1 = new FrameLayout.LayoutParams(-1, -1);
        localLayoutParams2 = new FrameLayout.LayoutParams(-1, -2);
        switch (this.amw)
        {
        default:
          ai.e("ListPopupWindow", "Invalid hint position " + this.amw, new Object[0]);
          label290: localView.measure(View.MeasureSpec.makeMeasureSpec(this.age, -2147483648), 0);
          localObject2 = localObject1;
        case 1:
        case 0:
        }
      }
    }
    label322: label579: label592: label1106: label1367: 
    while (true)
    {
      this.gKG.setContentView((View)localObject2);
      int j = 0;
      while (true)
      {
        localObject2 = this.gKG.getBackground();
        int m;
        int n;
        int i1;
        if (localObject2 != null)
        {
          ((Drawable)localObject2).getPadding(this.mTempRect);
          k = this.mTempRect.top + this.mTempRect.bottom;
          m = k;
          if (!this.amp)
          {
            this.amn = (-this.mTempRect.top);
            m = k;
          }
          if (this.gKG.getInputMethodMode() != 2)
            break label788;
          k = 1;
          localObject2 = this.amx;
          n = this.amn;
          localObject1 = new Rect();
          ((View)localObject2).getWindowVisibleDisplayFrame((Rect)localObject1);
          ((View)localObject2).getLocationOnScreen(new int[2]);
          i1 = ((Rect)localObject1).bottom;
          if (k == 0)
            break label1354;
          ((View)localObject2).getContext().getResources();
        }
        for (int k = al.hy(((View)localObject2).getContext()).y; ; k = i1)
        {
          k -= n;
          i1 = k;
          if (this.gKG.getBackground() != null)
          {
            this.gKG.getBackground().getPadding(this.mTempRect);
            i1 = k - (this.mTempRect.top + this.mTempRect.bottom);
          }
          if ((this.ams) || (this.aml == -1))
          {
            j = i1 + m;
            bool3 = isInputMethodNotNeeded();
            if (!this.gKG.isShowing())
              break label1084;
            if (this.age != -1)
              break label954;
            k = -1;
            if (this.aml != -1)
              break label1030;
            if (!bool3)
              break label984;
            if (!bool3)
              break label996;
            localObject2 = this.gKG;
            if (this.age != -1)
              break label990;
            m = i;
            label614: ((o)localObject2).setWindowLayoutMode(m, 0);
            label622: this.gKG.update(k, j);
            localObject2 = this.gKG;
            if ((this.amt) || (this.ams))
              break label1048;
            bool3 = bool2;
            ((o)localObject2).setOutsideTouchable(bool3);
            if (!this.jia)
              break label1054;
            this.gKG.showAtLocation(this.amx, 17, 0, 0);
            AppMethodBeat.o(112526);
          }
          while (true)
          {
            return;
            bool3 = false;
            break;
            localLayoutParams2.gravity = 80;
            ((FrameLayout)localObject1).addView((View)localObject2, localLayoutParams1);
            ((FrameLayout)localObject1).addView(localView, localLayoutParams2);
            break label290;
            localLayoutParams2.gravity = 48;
            ((FrameLayout)localObject1).addView((View)localObject2, localLayoutParams1);
            ((FrameLayout)localObject1).addView(localView, localLayoutParams2);
            break label290;
            localObject2 = this.amv;
            if (localObject2 == null)
              break label1361;
            j = ((View)localObject2).getMeasuredHeight();
            break label322;
            this.mTempRect.setEmpty();
            m = 0;
            break label390;
            k = 0;
            break label404;
            switch (this.age)
            {
            default:
              k = View.MeasureSpec.makeMeasureSpec(this.age, 1073741824);
            case -2:
            case -1:
            }
            while (true)
            {
              i1 = this.yvM.dt(k, i1 - j);
              k = j;
              if (i1 > 0)
                k = j + m;
              j = k + i1;
              break;
              k = View.MeasureSpec.makeMeasureSpec(this.mContext.getResources().getDisplayMetrics().widthPixels - (this.mTempRect.left + this.mTempRect.right), -2147483648);
              continue;
              k = View.MeasureSpec.makeMeasureSpec(this.mContext.getResources().getDisplayMetrics().widthPixels - (this.mTempRect.left + this.mTempRect.right), 1073741824);
            }
            if (this.age == -2)
            {
              k = this.amx.getWidth();
              break label579;
            }
            k = this.age;
            break label579;
            label984: j = -1;
            break label592;
            label990: m = 0;
            break label614;
            label996: localObject2 = this.gKG;
            if (this.age == -1);
            for (m = -1; ; m = 0)
            {
              ((o)localObject2).setWindowLayoutMode(m, -1);
              break;
            }
            if (this.aml == -2)
              break label622;
            j = this.aml;
            break label622;
            bool3 = false;
            break label656;
            this.gKG.showAtLocation(this.amx, 53, this.amm, this.amn);
            AppMethodBeat.o(112526);
          }
          if (this.age == -1)
          {
            k = -1;
            if (this.aml != -1)
              break label1283;
            j = -1;
            this.gKG.setWindowLayoutMode(k, j);
            localObject2 = this.gKG;
            if ((this.amt) || (this.ams))
              break label1324;
            bool3 = bool1;
            label1140: ((o)localObject2).setOutsideTouchable(bool3);
            this.gKG.setTouchInterceptor(this.yvJ);
            if (!this.jia)
              break label1330;
            this.gKG.showAtLocation(this.amx, 17, 0, 0);
          }
          while (true)
          {
            this.yvM.setSelection(-1);
            if ((!this.amG) || (this.yvM.isInTouchMode()))
              clearListSelection();
            if (!this.amG)
              this.mHandler.post(this.yvL);
            AppMethodBeat.o(112526);
            break;
            if (this.age == -2)
            {
              this.gKG.setWidth(this.amx.getWidth());
              k = 0;
              break label1095;
            }
            this.gKG.setWidth(this.age);
            k = 0;
            break label1095;
            if (this.aml == -2)
            {
              this.gKG.setHeight(j);
              j = 0;
              break label1106;
            }
            this.gKG.setHeight(this.aml);
            j = 0;
            break label1106;
            bool3 = false;
            break label1140;
            this.gKG.showAtLocation(this.amx, 53, this.amm, this.amn);
          }
        }
        j = 0;
      }
    }
  }

  final class b
    implements Runnable
  {
    private b()
    {
    }

    public final void run()
    {
      AppMethodBeat.i(112513);
      MMListPopupWindow.this.clearListSelection();
      AppMethodBeat.o(112513);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.MMListPopupWindow
 * JD-Core Version:    0.6.2
 */