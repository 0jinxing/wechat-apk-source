package com.tencent.mm.ui.tools;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnKeyListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow.OnDismissListener;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.aj;
import com.tencent.mm.ui.base.MMListPopupWindow;
import com.tencent.mm.ui.base.o;

public abstract class p
  implements View.OnKeyListener, ViewTreeObserver.OnGlobalLayoutListener, AdapterView.OnItemClickListener, PopupWindow.OnDismissListener
{
  private ViewTreeObserver aaM;
  private int acm;
  private int dividerHeight;
  private boolean jia = false;
  private BaseAdapter khG;
  protected Context mContext;
  private View pP;
  private boolean uEM = false;
  private MMListPopupWindow yHM;
  private int yHN = 2131493179;
  private DialogInterface.OnCancelListener yes;
  private ViewGroup zHL;
  private PopupWindow.OnDismissListener zHM;
  private boolean zHN = true;
  private View zHO;
  private int zHP;
  private int zHQ = 0;
  private int zHR = 0;
  private int zHS = 0;
  private float zHT = 0.0F;
  private float zHU = 0.0F;

  public p(Context paramContext)
  {
    this.mContext = paramContext;
    Resources localResources = paramContext.getResources();
    this.acm = Math.min(localResources.getDisplayMetrics().widthPixels * 4 / 5, localResources.getDimensionPixelSize(2131427817));
    if ((this.mContext instanceof Activity))
    {
      paramContext = (ViewGroup)((Activity)this.mContext).getWindow().getDecorView();
      if (paramContext.getChildCount() <= 0)
        break label183;
    }
    label183: for (this.pP = paramContext.getChildAt(0); ; this.pP = paramContext)
    {
      this.dividerHeight = BackwardSupportUtil.b.b(this.mContext, 1.0F);
      this.zHQ = (localResources.getDimensionPixelSize(2131427812) * 2);
      this.zHR = localResources.getDimensionPixelSize(2131427566);
      this.zHS = BackwardSupportUtil.b.b(this.mContext, 36.0F);
      this.khG = Kw();
      return;
    }
  }

  private int b(ListAdapter paramListAdapter)
  {
    int i = View.MeasureSpec.makeMeasureSpec(0, 0);
    int j = View.MeasureSpec.makeMeasureSpec(0, 0);
    int k = paramListAdapter.getCount();
    int m = 0;
    int n = 0;
    View localView = null;
    int i1 = 0;
    if (m < k)
    {
      int i2 = paramListAdapter.getItemViewType(m);
      if (i2 == n)
        break label129;
      localView = null;
      n = i2;
    }
    label129: 
    while (true)
    {
      if (this.zHL == null)
        this.zHL = new FrameLayout(this.mContext);
      localView = paramListAdapter.getView(m, localView, this.zHL);
      localView.measure(i, j);
      i1 = Math.max(i1, localView.getMeasuredWidth());
      m++;
      break;
      return i1;
    }
  }

  private boolean isLandscape()
  {
    DisplayMetrics localDisplayMetrics = this.mContext.getResources().getDisplayMetrics();
    if (localDisplayMetrics.widthPixels > localDisplayMetrics.heightPixels);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  protected abstract BaseAdapter Kw();

  public final void dismiss()
  {
    if (isShowing())
      this.yHM.dismiss();
  }

  public boolean gP()
  {
    Object localObject1 = new Rect();
    int i;
    int j;
    int k;
    Object localObject2;
    label144: boolean bool;
    if ((this.mContext instanceof AppCompatActivity))
    {
      i = ((AppCompatActivity)this.mContext).getSupportActionBar().getHeight();
      j = aj.am(this.mContext, 2131427603);
      k = i;
      if ((this.mContext instanceof Activity))
      {
        ((Activity)this.mContext).getWindow().getDecorView().getWindowVisibleDisplayFrame((Rect)localObject1);
        k = ((Activity)this.mContext).getWindow().getDecorView().getHeight();
        localObject2 = new int[2];
        ((Activity)this.mContext).getWindow().getDecorView().getLocationOnScreen((int[])localObject2);
        if ((k - ((Rect)localObject1).height() < 0) || (localObject2[1] <= 200))
          break label859;
        k = i + (k - ((Rect)localObject1).height());
      }
      this.uEM = isLandscape();
      if (this.yHM == null)
        this.yHM = new MMListPopupWindow(this.mContext, null, 0);
      this.yHM.setOnDismissListener(this);
      this.yHM.amz = this;
      this.yHM.setAdapter(this.khG);
      this.yHM.setModal(true);
      this.yHM.setBackgroundDrawable(this.mContext.getResources().getDrawable(2130839744));
      this.yHM.setAnimationStyle(this.yHN);
      this.yHM.amm = j;
      this.yHM.amx = this.pP;
      if (this.pP != null)
      {
        if (this.aaM != null)
          break label870;
        bool = true;
        label277: this.aaM = this.pP.getViewTreeObserver();
        ab.v("MicroMsg.SubMenuHelperBase", "tryshow addGlobalListener:%b", new Object[] { Boolean.valueOf(bool) });
        if (bool)
          this.aaM.addOnGlobalLayoutListener(this);
      }
      this.yHM.setVerticalOffset(k);
      this.yHM.jia = this.jia;
      this.yHM.setContentWidth(Math.min(b(this.khG), this.acm));
      this.yHM.iZ();
      if ((this.zHT != 0.0F) && (this.zHU != 0.0F))
      {
        localObject1 = new DisplayMetrics();
        ((Activity)this.mContext).getWindowManager().getDefaultDisplay().getMetrics((DisplayMetrics)localObject1);
        if (((DisplayMetrics)localObject1).widthPixels <= ((DisplayMetrics)localObject1).heightPixels)
          break label876;
        k = 1;
        label430: localObject1 = new Rect();
        ((Activity)this.mContext).getWindow().getDecorView().getWindowVisibleDisplayFrame((Rect)localObject1);
        i = ((Activity)this.mContext).getWindow().getDecorView().getHeight();
        if (i <= ((Rect)localObject1).height())
          break label949;
        i = ((Rect)localObject1).height();
      }
    }
    label937: label949: 
    while (true)
    {
      if (k != 0)
      {
        k = (int)(this.zHU * i);
        label500: ab.d("MicroMsg.SubMenuHelperBase", "menuHeightPercentPort(%f), menuHeightPercentLand(%f), frameHeight(%d), decorViewHeight(%d), menuHeight(%d)", new Object[] { Float.valueOf(this.zHT), Float.valueOf(this.zHU), Integer.valueOf(((Rect)localObject1).height()), Integer.valueOf(i), Integer.valueOf(k) });
        i = Math.round(k / this.zHR);
        if ((i <= 0) || (this.khG == null))
          break label937;
        k = this.zHR * i + this.zHQ;
        if ((k == 0) || (k >= this.khG.getCount() * this.zHR))
          break label895;
        j = this.zHR;
        k = this.zHQ;
        int m = this.zHS;
        this.yHM.aml = ((i - 1) * j + k + m);
      }
      while (true)
      {
        if ((this.yHM != null) && (this.zHO != null))
        {
          localObject2 = this.yHM;
          localObject1 = this.zHO;
          bool = ((MMListPopupWindow)localObject2).gKG.isShowing();
          if (bool)
            ((MMListPopupWindow)localObject2).iY();
          ((MMListPopupWindow)localObject2).amv = ((View)localObject1);
          if (bool)
            ((MMListPopupWindow)localObject2).show();
          this.yHM.amw = this.zHP;
        }
        this.yHM.show();
        this.yHM.yvM.setOnKeyListener(this);
        this.yHM.yvM.setSelector(new ColorDrawable(this.mContext.getResources().getColor(2131690597)));
        this.yHM.yvM.setDividerHeight(0);
        this.yHM.yvM.setVerticalScrollBarEnabled(true);
        this.yHM.yvM.setHorizontalScrollBarEnabled(false);
        return true;
        localObject2 = this.mContext.getResources().getDisplayMetrics();
        if (((DisplayMetrics)localObject2).widthPixels > ((DisplayMetrics)localObject2).heightPixels)
        {
          i = BackwardSupportUtil.b.b(this.mContext, 40.0F);
          break;
        }
        i = BackwardSupportUtil.b.b(this.mContext, 49.0F);
        break;
        label859: k = i + ((Rect)localObject1).top;
        break label144;
        label870: bool = false;
        break label277;
        label876: k = 0;
        break label430;
        k = (int)(this.zHT * i);
        break label500;
        label895: ab.w("MicroMsg.SubMenuHelperBase", "[cpan] menuheight:%d,listHeight:%d", new Object[] { Integer.valueOf(k), Integer.valueOf(this.khG.getCount() * this.zHR) });
        continue;
        ab.e("MicroMsg.SubMenuHelperBase", "[cpan] setpopuHeight error.");
      }
    }
  }

  public final boolean isShowing()
  {
    if ((this.yHM != null) && (this.yHM.gKG.isShowing()));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public void onDismiss()
  {
    if (this.aaM != null)
    {
      if (!this.aaM.isAlive())
        this.aaM = this.pP.getViewTreeObserver();
      this.aaM.removeGlobalOnLayoutListener(this);
      this.aaM = null;
    }
    if (this.yes != null)
      this.yes.onCancel(null);
    if (this.zHM != null)
      this.zHM.onDismiss();
  }

  public void onGlobalLayout()
  {
    ab.v("MicroMsg.SubMenuHelperBase", "onGlobalLayout showing:%b, anchorshown:%b", new Object[] { Boolean.valueOf(isShowing()), Boolean.valueOf(this.pP.isShown()) });
    if (isShowing())
    {
      View localView = this.pP;
      if ((localView != null) && (localView.isShown()))
        break label64;
      dismiss();
    }
    while (true)
    {
      return;
      label64: if ((isShowing()) && (this.uEM != isLandscape()))
        this.yHM.dismiss();
    }
  }

  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    dismiss();
  }

  public boolean onKey(View paramView, int paramInt, KeyEvent paramKeyEvent)
  {
    boolean bool = true;
    ab.v("MicroMsg.SubMenuHelperBase", "onKey");
    if ((paramKeyEvent.getAction() == 1) && (paramInt == 82))
      dismiss();
    while (true)
    {
      return bool;
      bool = false;
    }
  }

  public final void qR(boolean paramBoolean)
  {
    this.jia = paramBoolean;
    if (paramBoolean);
    for (this.yHN = 2131493126; ; this.yHN = 2131493179)
      return;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.p
 * JD-Core Version:    0.6.2
 */