package android.support.v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.support.v4.view.b;
import android.support.v7.a.a.a;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.PopupWindow.OnDismissListener;

public class ActivityChooserView extends ViewGroup
{
  PopupWindow.OnDismissListener aaN;
  final ActivityChooserView.a aeA;
  private final ActivityChooserView.b aeB;
  final View aeC;
  final Drawable aeD;
  final FrameLayout aeE;
  private final ImageView aeF;
  final FrameLayout aeG;
  final ImageView aeH;
  private final int aeI;
  b aeJ;
  final DataSetObserver aeK = new ActivityChooserView.1(this);
  private final ViewTreeObserver.OnGlobalLayoutListener aeL = new ActivityChooserView.2(this);
  private ListPopupWindow aeM;
  boolean aeN;
  int aeO = 4;
  int aeP;
  private boolean pv;

  public ActivityChooserView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public ActivityChooserView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    Object localObject = paramContext.obtainStyledAttributes(paramAttributeSet, a.a.ActivityChooserView, paramInt, 0);
    this.aeO = ((TypedArray)localObject).getInt(0, 4);
    paramAttributeSet = ((TypedArray)localObject).getDrawable(1);
    ((TypedArray)localObject).recycle();
    LayoutInflater.from(getContext()).inflate(2130968590, this, true);
    this.aeB = new ActivityChooserView.b(this);
    this.aeC = findViewById(2131820911);
    this.aeD = this.aeC.getBackground();
    this.aeG = ((FrameLayout)findViewById(2131820913));
    this.aeG.setOnClickListener(this.aeB);
    this.aeG.setOnLongClickListener(this.aeB);
    this.aeH = ((ImageView)this.aeG.findViewById(2131820629));
    localObject = (FrameLayout)findViewById(2131820912);
    ((FrameLayout)localObject).setOnClickListener(this.aeB);
    ((FrameLayout)localObject).setAccessibilityDelegate(new ActivityChooserView.3(this));
    ((FrameLayout)localObject).setOnTouchListener(new ActivityChooserView.4(this, (View)localObject));
    this.aeE = ((FrameLayout)localObject);
    this.aeF = ((ImageView)((FrameLayout)localObject).findViewById(2131820629));
    this.aeF.setImageDrawable(paramAttributeSet);
    this.aeA = new ActivityChooserView.a(this);
    this.aeA.registerDataSetObserver(new ActivityChooserView.5(this));
    paramContext = paramContext.getResources();
    this.aeI = Math.max(paramContext.getDisplayMetrics().widthPixels / 2, paramContext.getDimensionPixelSize(2131427361));
  }

  final void bw(int paramInt)
  {
    if (this.aeA.aeR == null)
      throw new IllegalStateException("No data model. Did you call #setDataModel?");
    getViewTreeObserver().addOnGlobalLayoutListener(this.aeL);
    boolean bool;
    int j;
    label61: label93: ListPopupWindow localListPopupWindow;
    if (this.aeG.getVisibility() == 0)
    {
      bool = true;
      int i = this.aeA.aeR.hg();
      if (!bool)
        break label209;
      j = 1;
      if ((paramInt == 2147483647) || (i <= j + paramInt))
        break label215;
      this.aeA.setShowFooterView(true);
      this.aeA.bx(paramInt - 1);
      localListPopupWindow = getListPopupWindow();
      if (!localListPopupWindow.amH.isShowing())
      {
        if ((!this.aeN) && (bool))
          break label234;
        this.aeA.g(true, bool);
      }
    }
    while (true)
    {
      localListPopupWindow.setContentWidth(Math.min(this.aeA.ht(), this.aeI));
      localListPopupWindow.show();
      if (this.aeJ != null)
        this.aeJ.E(true);
      localListPopupWindow.amk.setContentDescription(getContext().getString(2131296262));
      localListPopupWindow.amk.setSelector(new ColorDrawable(0));
      return;
      bool = false;
      break;
      label209: j = 0;
      break label61;
      label215: this.aeA.setShowFooterView(false);
      this.aeA.bx(paramInt);
      break label93;
      label234: this.aeA.g(false, false);
    }
  }

  public e getDataModel()
  {
    return this.aeA.aeR;
  }

  ListPopupWindow getListPopupWindow()
  {
    if (this.aeM == null)
    {
      this.aeM = new ListPopupWindow(getContext());
      this.aeM.setAdapter(this.aeA);
      this.aeM.amx = this;
      this.aeM.setModal(true);
      this.aeM.amz = this.aeB;
      this.aeM.setOnDismissListener(this.aeB);
    }
    return this.aeM;
  }

  public final boolean hq()
  {
    boolean bool1 = false;
    boolean bool2 = bool1;
    if (!getListPopupWindow().amH.isShowing())
      if (this.pv)
        break label28;
    for (bool2 = bool1; ; bool2 = true)
    {
      return bool2;
      label28: this.aeN = false;
      bw(this.aeO);
    }
  }

  public final boolean hr()
  {
    if (getListPopupWindow().amH.isShowing())
    {
      getListPopupWindow().dismiss();
      ViewTreeObserver localViewTreeObserver = getViewTreeObserver();
      if (localViewTreeObserver.isAlive())
        localViewTreeObserver.removeGlobalOnLayoutListener(this.aeL);
    }
    return true;
  }

  public final boolean hs()
  {
    return getListPopupWindow().amH.isShowing();
  }

  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    e locale = this.aeA.aeR;
    if (locale != null)
      locale.registerObserver(this.aeK);
    this.pv = true;
  }

  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    Object localObject = this.aeA.aeR;
    if (localObject != null)
      ((e)localObject).unregisterObserver(this.aeK);
    localObject = getViewTreeObserver();
    if (((ViewTreeObserver)localObject).isAlive())
      ((ViewTreeObserver)localObject).removeGlobalOnLayoutListener(this.aeL);
    if (hs())
      hr();
    this.pv = false;
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.aeC.layout(0, 0, paramInt3 - paramInt1, paramInt4 - paramInt2);
    if (!hs())
      hr();
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    View localView = this.aeC;
    int i = paramInt2;
    if (this.aeG.getVisibility() != 0)
      i = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(paramInt2), 1073741824);
    measureChild(localView, paramInt1, i);
    setMeasuredDimension(localView.getMeasuredWidth(), localView.getMeasuredHeight());
  }

  public void setActivityChooserModel(e parame)
  {
    ActivityChooserView.a locala = this.aeA;
    e locale = locala.aeQ.aeA.aeR;
    if ((locale != null) && (locala.aeQ.isShown()))
      locale.unregisterObserver(locala.aeQ.aeK);
    locala.aeR = parame;
    if ((parame != null) && (locala.aeQ.isShown()))
      parame.registerObserver(locala.aeQ.aeK);
    locala.notifyDataSetChanged();
    if (getListPopupWindow().amH.isShowing())
    {
      hr();
      hq();
    }
  }

  public void setDefaultActionButtonContentDescription(int paramInt)
  {
    this.aeP = paramInt;
  }

  public void setExpandActivityOverflowButtonContentDescription(int paramInt)
  {
    String str = getContext().getString(paramInt);
    this.aeF.setContentDescription(str);
  }

  public void setExpandActivityOverflowButtonDrawable(Drawable paramDrawable)
  {
    this.aeF.setImageDrawable(paramDrawable);
  }

  public void setInitialActivityCount(int paramInt)
  {
    this.aeO = paramInt;
  }

  public void setOnDismissListener(PopupWindow.OnDismissListener paramOnDismissListener)
  {
    this.aaN = paramOnDismissListener;
  }

  public void setProvider(b paramb)
  {
    this.aeJ = paramb;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.ActivityChooserView
 * JD-Core Version:    0.6.2
 */