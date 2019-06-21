package com.tencent.mm.plugin.appbrand.widget.input.autofill;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
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
import android.widget.PopupWindow;
import android.widget.PopupWindow.OnDismissListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ak;

public class AutoFillListPopupWindowBase
{
  ListAdapter Ei;
  int age;
  private AdapterView.OnItemSelectedListener amA;
  private Runnable amF;
  boolean amG;
  PopupWindow amH;
  int aml;
  int amm;
  int amn;
  boolean amp;
  boolean ams;
  boolean amt;
  int amu;
  private View amv;
  private int amw;
  View amx;
  private Drawable amy;
  private AdapterView.OnItemClickListener amz;
  AutoFillListPopupWindowBase.a jhV;
  private final AutoFillListPopupWindowBase.f jhW;
  private final AutoFillListPopupWindowBase.e jhX;
  private final AutoFillListPopupWindowBase.d jhY;
  private final AutoFillListPopupWindowBase.b jhZ;
  private boolean jia;
  private Context mContext;
  private ak mHandler;
  DataSetObserver mObserver;
  private Rect mTempRect;

  public AutoFillListPopupWindowBase(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 2130772193);
  }

  public AutoFillListPopupWindowBase(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    AppMethodBeat.i(123922);
    this.aml = -2;
    this.age = -2;
    this.ams = false;
    this.amt = false;
    this.amu = 2147483647;
    this.amw = 0;
    this.jhW = new AutoFillListPopupWindowBase.f(this, (byte)0);
    this.jhX = new AutoFillListPopupWindowBase.e(this, (byte)0);
    this.jhY = new AutoFillListPopupWindowBase.d(this, (byte)0);
    this.jhZ = new AutoFillListPopupWindowBase.b(this, (byte)0);
    this.mHandler = new ak();
    this.mTempRect = new Rect();
    this.jia = false;
    this.mContext = paramContext;
    this.amH = new PopupWindow(paramContext);
    this.amH.setInputMethodMode(1);
    paramContext = this.mContext.getResources().getConfiguration().locale;
    AppMethodBeat.o(123922);
  }

  private void iY()
  {
    AppMethodBeat.i(123926);
    if (this.amv != null)
    {
      ViewParent localViewParent = this.amv.getParent();
      if ((localViewParent instanceof ViewGroup))
        ((ViewGroup)localViewParent).removeView(this.amv);
    }
    AppMethodBeat.o(123926);
  }

  public final void clearListSelection()
  {
    AppMethodBeat.i(123927);
    AutoFillListPopupWindowBase.a locala = this.jhV;
    if (locala != null)
    {
      AutoFillListPopupWindowBase.a.a(locala, true);
      locala.requestLayout();
    }
    AppMethodBeat.o(123927);
  }

  public final void dismiss()
  {
    AppMethodBeat.i(123924);
    this.amH.dismiss();
    iY();
    this.amH.setContentView(null);
    this.jhV = null;
    this.mHandler.removeCallbacks(this.jhW);
    AppMethodBeat.o(123924);
  }

  public final boolean isInputMethodNotNeeded()
  {
    AppMethodBeat.i(123928);
    boolean bool;
    if (this.amH.getInputMethodMode() == 2)
    {
      bool = true;
      AppMethodBeat.o(123928);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(123928);
    }
  }

  public final void setOnDismissListener(PopupWindow.OnDismissListener paramOnDismissListener)
  {
    AppMethodBeat.i(123925);
    this.amH.setOnDismissListener(paramOnDismissListener);
    AppMethodBeat.o(123925);
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
    int i = -1;
    AppMethodBeat.i(123923);
    Object localObject1;
    boolean bool3;
    Object localObject2;
    View localView;
    FrameLayout.LayoutParams localLayoutParams1;
    FrameLayout.LayoutParams localLayoutParams2;
    if (this.jhV == null)
    {
      localObject1 = this.mContext;
      this.amF = new AutoFillListPopupWindowBase.1(this);
      if (!this.amG)
      {
        bool3 = true;
        this.jhV = new AutoFillListPopupWindowBase.a((Context)localObject1, bool3);
        if (this.amy != null)
          this.jhV.setSelector(this.amy);
        this.jhV.setAdapter(this.Ei);
        this.jhV.setOnItemClickListener(this.amz);
        this.jhV.setFocusable(true);
        this.jhV.setFocusableInTouchMode(true);
        this.jhV.setDivider(null);
        this.jhV.setDividerHeight(0);
        this.jhV.setOnItemSelectedListener(new AutoFillListPopupWindowBase.2(this));
        this.jhV.setOnScrollListener(this.jhY);
        if (this.amA != null)
          this.jhV.setOnItemSelectedListener(this.amA);
        localObject2 = this.jhV;
        localView = this.amv;
        if (localView == null)
          break label1397;
        iY();
        localObject1 = new FrameLayout((Context)localObject1);
        localLayoutParams1 = new FrameLayout.LayoutParams(-1, -1);
        localLayoutParams2 = new FrameLayout.LayoutParams(-1, -2);
        switch (this.amw)
        {
        default:
          new StringBuilder("Invalid hint position ").append(this.amw);
          label278: localView.measure(View.MeasureSpec.makeMeasureSpec(this.age, -2147483648), 0);
          localObject2 = localObject1;
        case 1:
        case 0:
        }
      }
    }
    label310: label574: label596: label604: label1139: label1397: 
    while (true)
    {
      this.amH.setContentView((View)localObject2);
      int j = 0;
      while (true)
      {
        localObject2 = this.amH.getBackground();
        int m;
        label378: int n;
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
          if (this.amH.getInputMethodMode() != 2)
            break label777;
          k = 1;
          localObject1 = this.amx;
          n = this.amn;
          localObject2 = new Rect();
          ((View)localObject1).getWindowVisibleDisplayFrame((Rect)localObject2);
          ((View)localObject1).getLocationOnScreen(new int[2]);
          i1 = ((Rect)localObject2).bottom;
          if (k == 0)
            break label1384;
        }
        for (int k = ((View)localObject1).getContext().getResources().getDisplayMetrics().heightPixels; ; k = i1)
        {
          k -= n;
          i1 = k;
          if (this.amH.getBackground() != null)
          {
            this.amH.getBackground().getPadding(this.mTempRect);
            i1 = k - (this.mTempRect.top + this.mTempRect.bottom);
          }
          if ((this.ams) || (this.aml == -1))
          {
            j = i1 + m;
            bool3 = isInputMethodNotNeeded();
            if (!this.amH.isShowing())
              break label1083;
            if (this.age != -1)
              break label942;
            k = -1;
            if (this.aml != -1)
              break label1018;
            if (!bool3)
              break label972;
            if (!bool3)
              break label984;
            localObject2 = this.amH;
            if (this.age != -1)
              break label978;
            m = i;
            ((PopupWindow)localObject2).setWindowLayoutMode(m, 0);
            this.amH.update(k, j);
            localObject2 = this.amH;
            if ((this.amt) || (this.ams))
              break label1036;
            bool3 = bool2;
            label638: ((PopupWindow)localObject2).setOutsideTouchable(bool3);
            if (!this.jia)
              break label1042;
            this.amH.showAtLocation(this.amx, 17, 0, 0);
            AppMethodBeat.o(123923);
          }
          while (true)
          {
            return;
            bool3 = false;
            break;
            localLayoutParams2.gravity = 80;
            ((FrameLayout)localObject1).addView((View)localObject2, localLayoutParams1);
            ((FrameLayout)localObject1).addView(localView, localLayoutParams2);
            break label278;
            localLayoutParams2.gravity = 48;
            ((FrameLayout)localObject1).addView((View)localObject2, localLayoutParams1);
            ((FrameLayout)localObject1).addView(localView, localLayoutParams2);
            break label278;
            this.amH.getContentView();
            localObject2 = this.amv;
            if (localObject2 == null)
              break label1391;
            j = ((View)localObject2).getMeasuredHeight();
            break label310;
            this.mTempRect.setEmpty();
            m = 0;
            break label378;
            k = 0;
            break label392;
            switch (this.age)
            {
            default:
              k = View.MeasureSpec.makeMeasureSpec(this.age, 1073741824);
            case -2:
            case -1:
            }
            while (true)
            {
              i1 = this.jhV.dt(k, i1 - j);
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
              break label561;
            }
            k = this.age;
            break label561;
            j = -1;
            break label574;
            m = 0;
            break label596;
            localObject2 = this.amH;
            if (this.age == -1);
            for (m = -1; ; m = 0)
            {
              ((PopupWindow)localObject2).setWindowLayoutMode(m, -1);
              break;
            }
            label1018: if (this.aml == -2)
              break label604;
            j = this.aml;
            break label604;
            bool3 = false;
            break label638;
            this.amH.update(this.amx, this.amm, this.amn, this.amH.getWidth(), this.amH.getHeight());
            AppMethodBeat.o(123923);
          }
          if (this.age == -1)
          {
            k = -1;
            if (this.aml != -1)
              break label1281;
            j = -1;
            this.amH.setWindowLayoutMode(k, j);
            localObject2 = this.amH;
            if ((this.amt) || (this.ams))
              break label1322;
            bool3 = bool1;
            ((PopupWindow)localObject2).setOutsideTouchable(bool3);
            this.amH.setTouchInterceptor(this.jhX);
            if (!this.jia)
              break label1328;
            this.amH.showAtLocation(this.amx, 17, 0, 0);
          }
          while (true)
          {
            this.jhV.setSelection(-1);
            if ((!this.amG) || (this.jhV.isInTouchMode()))
              clearListSelection();
            if (!this.amG)
              this.mHandler.post(this.jhZ);
            AppMethodBeat.o(123923);
            break;
            if (this.age == -2)
            {
              this.amH.setWidth(this.amx.getWidth());
              k = 0;
              break label1094;
            }
            this.amH.setWidth(this.age);
            k = 0;
            break label1094;
            if (this.aml == -2)
            {
              this.amH.setHeight(j);
              j = 0;
              break label1105;
            }
            this.amH.setHeight(this.aml);
            j = 0;
            break label1105;
            bool3 = false;
            break label1139;
            if (Build.VERSION.SDK_INT >= 19)
              this.amH.showAsDropDown(this.amx, this.amm, this.amn, 53);
            else
              this.amH.showAtLocation(this.amx, 53, this.amm, this.amn);
          }
        }
        j = 0;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.input.autofill.AutoFillListPopupWindowBase
 * JD-Core Version:    0.6.2
 */