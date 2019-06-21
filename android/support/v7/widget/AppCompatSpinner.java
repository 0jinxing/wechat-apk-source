package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.database.DataSetObserver;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.view.r;
import android.support.v7.c.a.b;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.PopupWindow.OnDismissListener;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;

public class AppCompatSpinner extends Spinner
  implements r
{
  private static final int[] aga = { 16843505 };
  private ae aad;
  private final Context acv;
  private final g afh;
  private SpinnerAdapter agb;
  private final boolean agc;
  private b agd;
  private int age;
  private final Rect mTempRect;

  public AppCompatSpinner(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 2130772230);
  }

  public AppCompatSpinner(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    this(paramContext, paramAttributeSet, paramInt, (byte)0);
  }

  private AppCompatSpinner(Context paramContext, AttributeSet paramAttributeSet, int paramInt, byte paramByte)
  {
    this(paramContext, paramAttributeSet, paramInt, -1);
  }

  // ERROR //
  private AppCompatSpinner(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: aload_2
    //   3: iload_3
    //   4: invokespecial 59	android/widget/Spinner:<init>	(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    //   7: aload_0
    //   8: new 61	android/graphics/Rect
    //   11: dup
    //   12: invokespecial 63	android/graphics/Rect:<init>	()V
    //   15: putfield 65	android/support/v7/widget/AppCompatSpinner:mTempRect	Landroid/graphics/Rect;
    //   18: aload_1
    //   19: aload_2
    //   20: getstatic 70	android/support/v7/a/a$a:Spinner	[I
    //   23: iload_3
    //   24: iconst_0
    //   25: invokestatic 75	android/support/v7/widget/bc:a	(Landroid/content/Context;Landroid/util/AttributeSet;[III)Landroid/support/v7/widget/bc;
    //   28: astore 5
    //   30: aload_0
    //   31: new 77	android/support/v7/widget/g
    //   34: dup
    //   35: aload_0
    //   36: invokespecial 80	android/support/v7/widget/g:<init>	(Landroid/view/View;)V
    //   39: putfield 82	android/support/v7/widget/AppCompatSpinner:afh	Landroid/support/v7/widget/g;
    //   42: aload 5
    //   44: iconst_4
    //   45: iconst_0
    //   46: invokevirtual 86	android/support/v7/widget/bc:getResourceId	(II)I
    //   49: istore 6
    //   51: iload 6
    //   53: ifeq +263 -> 316
    //   56: new 88	android/support/v7/view/d
    //   59: dup
    //   60: aload_1
    //   61: iload 6
    //   63: invokespecial 91	android/support/v7/view/d:<init>	(Landroid/content/Context;I)V
    //   66: astore 7
    //   68: aload_0
    //   69: aload 7
    //   71: putfield 93	android/support/v7/widget/AppCompatSpinner:acv	Landroid/content/Context;
    //   74: aload_0
    //   75: getfield 93	android/support/v7/widget/AppCompatSpinner:acv	Landroid/content/Context;
    //   78: ifnull +155 -> 233
    //   81: aload_1
    //   82: aload_2
    //   83: getstatic 43	android/support/v7/widget/AppCompatSpinner:aga	[I
    //   86: iload_3
    //   87: iconst_0
    //   88: invokevirtual 99	android/content/Context:obtainStyledAttributes	(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;
    //   91: astore 7
    //   93: iload 4
    //   95: istore 6
    //   97: aload 7
    //   99: iconst_0
    //   100: invokevirtual 105	android/content/res/TypedArray:hasValue	(I)Z
    //   103: ifeq +12 -> 115
    //   106: aload 7
    //   108: iconst_0
    //   109: iconst_0
    //   110: invokevirtual 108	android/content/res/TypedArray:getInt	(II)I
    //   113: istore 6
    //   115: iload 6
    //   117: istore 8
    //   119: aload 7
    //   121: ifnull +12 -> 133
    //   124: aload 7
    //   126: invokevirtual 111	android/content/res/TypedArray:recycle	()V
    //   129: iload 6
    //   131: istore 8
    //   133: iload 8
    //   135: iconst_1
    //   136: if_icmpne +97 -> 233
    //   139: new 13	android/support/v7/widget/AppCompatSpinner$b
    //   142: dup
    //   143: aload_0
    //   144: aload_0
    //   145: getfield 93	android/support/v7/widget/AppCompatSpinner:acv	Landroid/content/Context;
    //   148: aload_2
    //   149: iload_3
    //   150: invokespecial 114	android/support/v7/widget/AppCompatSpinner$b:<init>	(Landroid/support/v7/widget/AppCompatSpinner;Landroid/content/Context;Landroid/util/AttributeSet;I)V
    //   153: astore 9
    //   155: aload_0
    //   156: getfield 93	android/support/v7/widget/AppCompatSpinner:acv	Landroid/content/Context;
    //   159: aload_2
    //   160: getstatic 70	android/support/v7/a/a$a:Spinner	[I
    //   163: iload_3
    //   164: iconst_0
    //   165: invokestatic 75	android/support/v7/widget/bc:a	(Landroid/content/Context;Landroid/util/AttributeSet;[III)Landroid/support/v7/widget/bc;
    //   168: astore 7
    //   170: aload_0
    //   171: aload 7
    //   173: iconst_3
    //   174: bipush 254
    //   176: invokevirtual 117	android/support/v7/widget/bc:getLayoutDimension	(II)I
    //   179: putfield 119	android/support/v7/widget/AppCompatSpinner:age	I
    //   182: aload 9
    //   184: aload 7
    //   186: iconst_1
    //   187: invokevirtual 123	android/support/v7/widget/bc:getDrawable	(I)Landroid/graphics/drawable/Drawable;
    //   190: invokevirtual 127	android/support/v7/widget/AppCompatSpinner$b:setBackgroundDrawable	(Landroid/graphics/drawable/Drawable;)V
    //   193: aload 9
    //   195: aload 5
    //   197: iconst_2
    //   198: invokevirtual 131	android/support/v7/widget/bc:getString	(I)Ljava/lang/String;
    //   201: putfield 135	android/support/v7/widget/AppCompatSpinner$b:agj	Ljava/lang/CharSequence;
    //   204: aload 7
    //   206: getfield 139	android/support/v7/widget/bc:atG	Landroid/content/res/TypedArray;
    //   209: invokevirtual 111	android/content/res/TypedArray:recycle	()V
    //   212: aload_0
    //   213: aload 9
    //   215: putfield 141	android/support/v7/widget/AppCompatSpinner:agd	Landroid/support/v7/widget/AppCompatSpinner$b;
    //   218: aload_0
    //   219: new 8	android/support/v7/widget/AppCompatSpinner$1
    //   222: dup
    //   223: aload_0
    //   224: aload_0
    //   225: aload 9
    //   227: invokespecial 144	android/support/v7/widget/AppCompatSpinner$1:<init>	(Landroid/support/v7/widget/AppCompatSpinner;Landroid/view/View;Landroid/support/v7/widget/AppCompatSpinner$b;)V
    //   230: putfield 146	android/support/v7/widget/AppCompatSpinner:aad	Landroid/support/v7/widget/ae;
    //   233: aload 5
    //   235: getfield 139	android/support/v7/widget/bc:atG	Landroid/content/res/TypedArray;
    //   238: iconst_0
    //   239: invokevirtual 150	android/content/res/TypedArray:getTextArray	(I)[Ljava/lang/CharSequence;
    //   242: astore 7
    //   244: aload 7
    //   246: ifnull +27 -> 273
    //   249: new 152	android/widget/ArrayAdapter
    //   252: dup
    //   253: aload_1
    //   254: ldc 153
    //   256: aload 7
    //   258: invokespecial 156	android/widget/ArrayAdapter:<init>	(Landroid/content/Context;I[Ljava/lang/Object;)V
    //   261: astore_1
    //   262: aload_1
    //   263: ldc 157
    //   265: invokevirtual 161	android/widget/ArrayAdapter:setDropDownViewResource	(I)V
    //   268: aload_0
    //   269: aload_1
    //   270: invokevirtual 165	android/support/v7/widget/AppCompatSpinner:setAdapter	(Landroid/widget/SpinnerAdapter;)V
    //   273: aload 5
    //   275: getfield 139	android/support/v7/widget/bc:atG	Landroid/content/res/TypedArray;
    //   278: invokevirtual 111	android/content/res/TypedArray:recycle	()V
    //   281: aload_0
    //   282: iconst_1
    //   283: putfield 167	android/support/v7/widget/AppCompatSpinner:agc	Z
    //   286: aload_0
    //   287: getfield 169	android/support/v7/widget/AppCompatSpinner:agb	Landroid/widget/SpinnerAdapter;
    //   290: ifnull +16 -> 306
    //   293: aload_0
    //   294: aload_0
    //   295: getfield 169	android/support/v7/widget/AppCompatSpinner:agb	Landroid/widget/SpinnerAdapter;
    //   298: invokevirtual 165	android/support/v7/widget/AppCompatSpinner:setAdapter	(Landroid/widget/SpinnerAdapter;)V
    //   301: aload_0
    //   302: aconst_null
    //   303: putfield 169	android/support/v7/widget/AppCompatSpinner:agb	Landroid/widget/SpinnerAdapter;
    //   306: aload_0
    //   307: getfield 82	android/support/v7/widget/AppCompatSpinner:afh	Landroid/support/v7/widget/g;
    //   310: aload_2
    //   311: iload_3
    //   312: invokevirtual 172	android/support/v7/widget/g:a	(Landroid/util/AttributeSet;I)V
    //   315: return
    //   316: getstatic 177	android/os/Build$VERSION:SDK_INT	I
    //   319: bipush 23
    //   321: if_icmpge +9 -> 330
    //   324: aload_1
    //   325: astore 7
    //   327: goto -259 -> 68
    //   330: aconst_null
    //   331: astore 7
    //   333: goto -265 -> 68
    //   336: astore 7
    //   338: aconst_null
    //   339: astore 7
    //   341: iload 4
    //   343: istore 8
    //   345: aload 7
    //   347: ifnull -214 -> 133
    //   350: aload 7
    //   352: invokevirtual 111	android/content/res/TypedArray:recycle	()V
    //   355: iload 4
    //   357: istore 8
    //   359: goto -226 -> 133
    //   362: astore_1
    //   363: aconst_null
    //   364: astore 7
    //   366: aload 7
    //   368: ifnull +8 -> 376
    //   371: aload 7
    //   373: invokevirtual 111	android/content/res/TypedArray:recycle	()V
    //   376: aload_1
    //   377: athrow
    //   378: astore_1
    //   379: goto -13 -> 366
    //   382: astore 9
    //   384: goto -43 -> 341
    //
    // Exception table:
    //   from	to	target	type
    //   81	93	336	java/lang/Exception
    //   81	93	362	finally
    //   97	115	378	finally
    //   97	115	382	java/lang/Exception
  }

  final int a(SpinnerAdapter paramSpinnerAdapter, Drawable paramDrawable)
  {
    int i = 0;
    if (paramSpinnerAdapter == null)
      return i;
    int j = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
    int k = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
    i = Math.max(0, getSelectedItemPosition());
    int m = Math.min(paramSpinnerAdapter.getCount(), i + 15);
    int n = Math.max(0, i - (15 - (m - i)));
    int i1 = 0;
    View localView = null;
    i = 0;
    label75: if (n < m)
    {
      int i2 = paramSpinnerAdapter.getItemViewType(n);
      if (i2 == i1)
        break label205;
      localView = null;
      i1 = i2;
    }
    label205: 
    while (true)
    {
      localView = paramSpinnerAdapter.getView(n, localView, this);
      if (localView.getLayoutParams() == null)
        localView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
      localView.measure(j, k);
      i = Math.max(i, localView.getMeasuredWidth());
      n++;
      break label75;
      if (paramDrawable != null)
      {
        paramDrawable.getPadding(this.mTempRect);
        i = this.mTempRect.left + this.mTempRect.right + i;
        break;
      }
      break;
    }
  }

  protected void drawableStateChanged()
  {
    super.drawableStateChanged();
    if (this.afh != null)
      this.afh.hA();
  }

  public int getDropDownHorizontalOffset()
  {
    int i;
    if (this.agd != null)
      i = this.agd.amm;
    while (true)
    {
      return i;
      if (Build.VERSION.SDK_INT >= 16)
        i = super.getDropDownHorizontalOffset();
      else
        i = 0;
    }
  }

  public int getDropDownVerticalOffset()
  {
    int i;
    if (this.agd != null)
      i = this.agd.getVerticalOffset();
    while (true)
    {
      return i;
      if (Build.VERSION.SDK_INT >= 16)
        i = super.getDropDownVerticalOffset();
      else
        i = 0;
    }
  }

  public int getDropDownWidth()
  {
    int i;
    if (this.agd != null)
      i = this.age;
    while (true)
    {
      return i;
      if (Build.VERSION.SDK_INT >= 16)
        i = super.getDropDownWidth();
      else
        i = 0;
    }
  }

  public Drawable getPopupBackground()
  {
    Drawable localDrawable;
    if (this.agd != null)
      localDrawable = this.agd.amH.getBackground();
    while (true)
    {
      return localDrawable;
      if (Build.VERSION.SDK_INT >= 16)
        localDrawable = super.getPopupBackground();
      else
        localDrawable = null;
    }
  }

  public Context getPopupContext()
  {
    Context localContext;
    if (this.agd != null)
      localContext = this.acv;
    while (true)
    {
      return localContext;
      if (Build.VERSION.SDK_INT >= 23)
        localContext = super.getPopupContext();
      else
        localContext = null;
    }
  }

  public CharSequence getPrompt()
  {
    if (this.agd != null);
    for (CharSequence localCharSequence = this.agd.agj; ; localCharSequence = super.getPrompt())
      return localCharSequence;
  }

  public ColorStateList getSupportBackgroundTintList()
  {
    if (this.afh != null);
    for (ColorStateList localColorStateList = this.afh.getSupportBackgroundTintList(); ; localColorStateList = null)
      return localColorStateList;
  }

  public PorterDuff.Mode getSupportBackgroundTintMode()
  {
    if (this.afh != null);
    for (PorterDuff.Mode localMode = this.afh.getSupportBackgroundTintMode(); ; localMode = null)
      return localMode;
  }

  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    if ((this.agd != null) && (this.agd.amH.isShowing()))
      this.agd.dismiss();
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    if ((this.agd != null) && (View.MeasureSpec.getMode(paramInt1) == -2147483648))
      setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(paramInt1)), getMeasuredHeight());
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    if ((this.aad != null) && (this.aad.onTouch(this, paramMotionEvent)));
    for (boolean bool = true; ; bool = super.onTouchEvent(paramMotionEvent))
      return bool;
  }

  public boolean performClick()
  {
    if (this.agd != null)
      if (!this.agd.amH.isShowing())
        this.agd.show();
    for (boolean bool = true; ; bool = super.performClick())
      return bool;
  }

  public void setAdapter(SpinnerAdapter paramSpinnerAdapter)
  {
    if (!this.agc)
      this.agb = paramSpinnerAdapter;
    do
    {
      return;
      super.setAdapter(paramSpinnerAdapter);
    }
    while (this.agd == null);
    if (this.acv == null);
    for (Context localContext = getContext(); ; localContext = this.acv)
    {
      this.agd.setAdapter(new a(paramSpinnerAdapter, localContext.getTheme()));
      break;
    }
  }

  public void setBackgroundDrawable(Drawable paramDrawable)
  {
    super.setBackgroundDrawable(paramDrawable);
    if (this.afh != null)
      this.afh.hz();
  }

  public void setBackgroundResource(int paramInt)
  {
    super.setBackgroundResource(paramInt);
    if (this.afh != null)
      this.afh.bD(paramInt);
  }

  public void setDropDownHorizontalOffset(int paramInt)
  {
    if (this.agd != null)
      this.agd.amm = paramInt;
    while (true)
    {
      return;
      if (Build.VERSION.SDK_INT >= 16)
        super.setDropDownHorizontalOffset(paramInt);
    }
  }

  public void setDropDownVerticalOffset(int paramInt)
  {
    if (this.agd != null)
      this.agd.setVerticalOffset(paramInt);
    while (true)
    {
      return;
      if (Build.VERSION.SDK_INT >= 16)
        super.setDropDownVerticalOffset(paramInt);
    }
  }

  public void setDropDownWidth(int paramInt)
  {
    if (this.agd != null)
      this.age = paramInt;
    while (true)
    {
      return;
      if (Build.VERSION.SDK_INT >= 16)
        super.setDropDownWidth(paramInt);
    }
  }

  public void setPopupBackgroundDrawable(Drawable paramDrawable)
  {
    if (this.agd != null)
      this.agd.setBackgroundDrawable(paramDrawable);
    while (true)
    {
      return;
      if (Build.VERSION.SDK_INT >= 16)
        super.setPopupBackgroundDrawable(paramDrawable);
    }
  }

  public void setPopupBackgroundResource(int paramInt)
  {
    setPopupBackgroundDrawable(b.g(getPopupContext(), paramInt));
  }

  public void setPrompt(CharSequence paramCharSequence)
  {
    if (this.agd != null)
      this.agd.agj = paramCharSequence;
    while (true)
    {
      return;
      super.setPrompt(paramCharSequence);
    }
  }

  public void setSupportBackgroundTintList(ColorStateList paramColorStateList)
  {
    if (this.afh != null)
      this.afh.setSupportBackgroundTintList(paramColorStateList);
  }

  public void setSupportBackgroundTintMode(PorterDuff.Mode paramMode)
  {
    if (this.afh != null)
      this.afh.setSupportBackgroundTintMode(paramMode);
  }

  static final class a
    implements ListAdapter, SpinnerAdapter
  {
    private SpinnerAdapter agh;
    private ListAdapter agi;

    public a(SpinnerAdapter paramSpinnerAdapter, Resources.Theme paramTheme)
    {
      this.agh = paramSpinnerAdapter;
      if ((paramSpinnerAdapter instanceof SpinnerAdapter))
        this.agi = ((SpinnerAdapter)paramSpinnerAdapter);
      if ((paramTheme != null) && (Build.VERSION.SDK_INT >= 23) && ((paramSpinnerAdapter instanceof ThemedSpinnerAdapter)))
      {
        paramSpinnerAdapter = (ThemedSpinnerAdapter)paramSpinnerAdapter;
        if (paramSpinnerAdapter.getDropDownViewTheme() != paramTheme)
          paramSpinnerAdapter.setDropDownViewTheme(paramTheme);
      }
    }

    public final boolean areAllItemsEnabled()
    {
      ListAdapter localListAdapter = this.agi;
      if (localListAdapter != null);
      for (boolean bool = localListAdapter.areAllItemsEnabled(); ; bool = true)
        return bool;
    }

    public final int getCount()
    {
      if (this.agh == null);
      for (int i = 0; ; i = this.agh.getCount())
        return i;
    }

    public final View getDropDownView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      if (this.agh == null);
      for (paramView = null; ; paramView = this.agh.getDropDownView(paramInt, paramView, paramViewGroup))
        return paramView;
    }

    public final Object getItem(int paramInt)
    {
      if (this.agh == null);
      for (Object localObject = null; ; localObject = this.agh.getItem(paramInt))
        return localObject;
    }

    public final long getItemId(int paramInt)
    {
      if (this.agh == null);
      for (long l = -1L; ; l = this.agh.getItemId(paramInt))
        return l;
    }

    public final int getItemViewType(int paramInt)
    {
      return 0;
    }

    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      return getDropDownView(paramInt, paramView, paramViewGroup);
    }

    public final int getViewTypeCount()
    {
      return 1;
    }

    public final boolean hasStableIds()
    {
      if ((this.agh != null) && (this.agh.hasStableIds()));
      for (boolean bool = true; ; bool = false)
        return bool;
    }

    public final boolean isEmpty()
    {
      if (getCount() == 0);
      for (boolean bool = true; ; bool = false)
        return bool;
    }

    public final boolean isEnabled(int paramInt)
    {
      ListAdapter localListAdapter = this.agi;
      if (localListAdapter != null);
      for (boolean bool = localListAdapter.isEnabled(paramInt); ; bool = true)
        return bool;
    }

    public final void registerDataSetObserver(DataSetObserver paramDataSetObserver)
    {
      if (this.agh != null)
        this.agh.registerDataSetObserver(paramDataSetObserver);
    }

    public final void unregisterDataSetObserver(DataSetObserver paramDataSetObserver)
    {
      if (this.agh != null)
        this.agh.unregisterDataSetObserver(paramDataSetObserver);
    }
  }

  final class b extends ListPopupWindow
  {
    ListAdapter Ei;
    CharSequence agj;
    final Rect agk = new Rect();

    public b(Context paramAttributeSet, AttributeSet paramInt, int arg4)
    {
      super(paramInt, i);
      this.amx = AppCompatSpinner.this;
      setModal(true);
      this.amw = 0;
      this.amz = new AdapterView.OnItemClickListener()
      {
        public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
        {
          AppCompatSpinner.this.setSelection(paramAnonymousInt);
          if (AppCompatSpinner.this.getOnItemClickListener() != null)
            AppCompatSpinner.this.performItemClick(paramAnonymousView, paramAnonymousInt, AppCompatSpinner.b.this.Ei.getItemId(paramAnonymousInt));
          AppCompatSpinner.b.this.dismiss();
        }
      };
    }

    final void hH()
    {
      Object localObject = this.amH.getBackground();
      int i;
      int j;
      int k;
      int m;
      int n;
      int i1;
      if (localObject != null)
      {
        ((Drawable)localObject).getPadding(AppCompatSpinner.b(AppCompatSpinner.this));
        if (bk.bW(AppCompatSpinner.this))
        {
          i = AppCompatSpinner.b(AppCompatSpinner.this).right;
          j = AppCompatSpinner.this.getPaddingLeft();
          k = AppCompatSpinner.this.getPaddingRight();
          m = AppCompatSpinner.this.getWidth();
          if (AppCompatSpinner.c(AppCompatSpinner.this) != -2)
            break label242;
          n = AppCompatSpinner.this.a((SpinnerAdapter)this.Ei, this.amH.getBackground());
          i1 = AppCompatSpinner.this.getContext().getResources().getDisplayMetrics().widthPixels - AppCompatSpinner.b(AppCompatSpinner.this).left - AppCompatSpinner.b(AppCompatSpinner.this).right;
          if (n <= i1)
            break label288;
        }
      }
      while (true)
      {
        setContentWidth(Math.max(i1, m - j - k));
        label169: if (bk.bW(AppCompatSpinner.this))
          i = m - k - this.age + i;
        while (true)
        {
          this.amm = i;
          return;
          i = -AppCompatSpinner.b(AppCompatSpinner.this).left;
          break;
          localObject = AppCompatSpinner.b(AppCompatSpinner.this);
          AppCompatSpinner.b(AppCompatSpinner.this).right = 0;
          ((Rect)localObject).left = 0;
          i = 0;
          break;
          label242: if (AppCompatSpinner.c(AppCompatSpinner.this) == -1)
          {
            setContentWidth(m - j - k);
            break label169;
          }
          setContentWidth(AppCompatSpinner.c(AppCompatSpinner.this));
          break label169;
          i += j;
        }
        label288: i1 = n;
      }
    }

    public final void setAdapter(ListAdapter paramListAdapter)
    {
      super.setAdapter(paramListAdapter);
      this.Ei = paramListAdapter;
    }

    public final void show()
    {
      boolean bool = this.amH.isShowing();
      hH();
      iZ();
      super.show();
      this.amk.setChoiceMode(1);
      int i = AppCompatSpinner.this.getSelectedItemPosition();
      Object localObject = this.amk;
      if ((this.amH.isShowing()) && (localObject != null))
      {
        ((ab)localObject).setListSelectionHidden(false);
        ((ab)localObject).setSelection(i);
        if (((ab)localObject).getChoiceMode() != 0)
          ((ab)localObject).setItemChecked(i, true);
      }
      if (bool);
      while (true)
      {
        return;
        ViewTreeObserver localViewTreeObserver = AppCompatSpinner.this.getViewTreeObserver();
        if (localViewTreeObserver != null)
        {
          localObject = new ViewTreeObserver.OnGlobalLayoutListener()
          {
            public final void onGlobalLayout()
            {
              AppCompatSpinner.b localb = AppCompatSpinner.b.this;
              AppCompatSpinner localAppCompatSpinner = AppCompatSpinner.this;
              int i;
              if ((android.support.v4.view.s.av(localAppCompatSpinner)) && (localAppCompatSpinner.getGlobalVisibleRect(localb.agk)))
              {
                i = 1;
                if (i != 0)
                  break label50;
                AppCompatSpinner.b.this.dismiss();
              }
              while (true)
              {
                return;
                i = 0;
                break;
                label50: AppCompatSpinner.b.this.hH();
                AppCompatSpinner.b.a(AppCompatSpinner.b.this);
              }
            }
          };
          localViewTreeObserver.addOnGlobalLayoutListener((ViewTreeObserver.OnGlobalLayoutListener)localObject);
          setOnDismissListener(new PopupWindow.OnDismissListener()
          {
            public final void onDismiss()
            {
              ViewTreeObserver localViewTreeObserver = AppCompatSpinner.this.getViewTreeObserver();
              if (localViewTreeObserver != null)
                localViewTreeObserver.removeGlobalOnLayoutListener(this.agn);
            }
          });
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.AppCompatSpinner
 * JD-Core Version:    0.6.2
 */