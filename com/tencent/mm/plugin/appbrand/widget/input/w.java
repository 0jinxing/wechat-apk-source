package com.tencent.mm.plugin.appbrand.widget.input;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.widget.input.panel.e.a;
import com.tencent.mm.plugin.appbrand.widget.input.panel.e.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.ui.statusbar.d;

public class w extends LinearLayout
  implements ac, u.b
{
  private static final int huq;
  private static final w.b jfY;
  private Context context;
  private final Runnable jfK;
  private d jfL;
  private c jfM;
  private boolean jfN;
  private e jfO;
  private com.tencent.mm.plugin.appbrand.widget.input.panel.e jfP;
  private View jfQ;
  private View jfR;
  private ImageButton jfS;
  private boolean jfT;
  private View jfU;
  private boolean jfV;
  protected EditText jfW;
  private final ad jfX;
  private int state;

  static
  {
    AppMethodBeat.i(123815);
    huq = 2131820561;
    jfY = new w.f((byte)0);
    AppMethodBeat.o(123815);
  }

  public w(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(123790);
    this.jfK = new w.1(this);
    this.jfN = false;
    this.state = 2;
    this.context = paramContext;
    if ((paramContext instanceof ad))
    {
      paramContext = (ad)paramContext;
      this.jfX = paramContext;
      super.setId(huq);
      setOrientation(1);
      paramContext = aBL();
      this.jfR = paramContext;
      addView(paramContext);
      paramContext = (e.b)com.tencent.luggage.a.e.B(e.b.class);
      if (paramContext != null)
        break label199;
    }
    label199: for (paramContext = null; ; paramContext = paramContext.cT(this.context))
    {
      this.jfP = paramContext;
      if (this.jfP == null)
        this.jfP = new e.a(this.context);
      this.jfQ = this.jfP.getPanelView();
      this.jfQ.setVisibility(8);
      this.jfQ.setBackgroundColor(0);
      this.jfP.setOnTextOperationListener(new w.4(this));
      addView(this.jfQ);
      aBJ();
      AppMethodBeat.o(123790);
      return;
      paramContext = new com.tencent.mm.plugin.appbrand.widget.input.b.a();
      break;
    }
  }

  private void aRa()
  {
    AppMethodBeat.i(123793);
    ((u)n.cG(this).getOnLayoutListener()).jft = this;
    AppMethodBeat.o(123793);
  }

  private void aRb()
  {
    AppMethodBeat.i(123794);
    ((u)n.cG(this).getOnLayoutListener()).jft = null;
    AppMethodBeat.o(123794);
  }

  private void aRc()
  {
    AppMethodBeat.i(123796);
    aRe();
    if (this.jfW != null)
    {
      InputMethodManager localInputMethodManager = aj.cS(this.jfW);
      if (!localInputMethodManager.showSoftInput(this.jfW, 1))
        localInputMethodManager.showSoftInput(this.jfW, 2);
      AppMethodBeat.o(123796);
    }
    while (true)
    {
      return;
      this.jfX.showVKB();
      AppMethodBeat.o(123796);
    }
  }

  private void aRd()
  {
    AppMethodBeat.i(123797);
    jfY.n(this);
    if (this.jfS != null)
      this.jfS.setSelected(true);
    qF(1);
    AppMethodBeat.o(123797);
  }

  private void aRe()
  {
    AppMethodBeat.i(123798);
    jfY.m(this);
    if (this.jfS != null)
      this.jfS.setSelected(false);
    qF(0);
    AppMethodBeat.o(123798);
  }

  public static w cN(View paramView)
  {
    AppMethodBeat.i(123781);
    paramView = (w)paramView.getRootView().findViewById(huq);
    AppMethodBeat.o(123781);
    return paramView;
  }

  public static w cO(View paramView)
  {
    AppMethodBeat.i(123782);
    n localn = n.cG(paramView);
    if ((localn.getOnLayoutListener() == null) || (!(localn.getOnLayoutListener() instanceof u)))
      localn.setOnLayoutListener(new u());
    Object localObject1 = cN(paramView);
    Object localObject2 = localObject1;
    if (localObject1 == null)
    {
      localObject1 = d.cY(paramView.getContext());
      localObject2 = localObject1;
      if (localObject1 == null)
      {
        paramView = paramView.getContext();
        if (paramView == null)
          break label132;
        if (!(paramView instanceof ContextThemeWrapper))
          break label107;
      }
    }
    label132: for (localObject2 = (ContextThemeWrapper)paramView; ; localObject2 = null)
    {
      localObject2 = new w((Context)localObject2);
      localn.cH((View)localObject2);
      AppMethodBeat.o(123782);
      return localObject2;
      label107: if ((paramView instanceof ContextWrapper))
      {
        localObject2 = ((ContextWrapper)paramView).getBaseContext();
        if (localObject2 != paramView)
        {
          paramView = (View)localObject2;
          break;
        }
      }
    }
  }

  private void qF(int paramInt)
  {
    AppMethodBeat.i(123795);
    post(new w.5(this, paramInt, this.jfN));
    AppMethodBeat.o(123795);
  }

  private void setPanelHeightImpl(int paramInt)
  {
    AppMethodBeat.i(123787);
    if (this.jfP.qD(paramInt))
      this.jfK.run();
    AppMethodBeat.o(123787);
  }

  protected void aBJ()
  {
    boolean bool = false;
    AppMethodBeat.i(123799);
    if (this.jfR == null)
    {
      AppMethodBeat.o(123799);
      return;
    }
    w.a locala = (w.a)this.jfR;
    int i;
    if (!this.jfT)
    {
      i = 1;
      label39: if (this.jfV)
        break label86;
    }
    label86: for (int j = 1; ; j = 0)
    {
      if (((i & j) != 0) || (com.tencent.mm.plugin.appbrand.ui.n.ct(this)))
        bool = true;
      locala.setIsHide(bool);
      AppMethodBeat.o(123799);
      break;
      i = 0;
      break label39;
    }
  }

  protected void aBK()
  {
    AppMethodBeat.i(123807);
    setCanSmileyInput(this.jfT);
    setShowDoneButton(this.jfV);
    aBJ();
    AppMethodBeat.o(123807);
  }

  protected <T extends View,  extends w.a> T aBL()
  {
    AppMethodBeat.i(123792);
    w.g localg = new w.g(getContext());
    StateListDrawable localStateListDrawable = new StateListDrawable();
    Drawable localDrawable = ah.getResources().getDrawable(2130840449);
    localStateListDrawable.addState(new int[] { 16842913 }, localDrawable);
    localDrawable = ah.getResources().getDrawable(2130840448);
    localStateListDrawable.addState(new int[0], localDrawable);
    this.jfS = ((ImageButton)localg.findViewById(2131821510));
    this.jfS.setSelected(false);
    this.jfS.setImageDrawable(localStateListDrawable);
    this.jfS.setOnClickListener(new w.2(this));
    this.jfU = localg.findViewById(2131821509);
    this.jfU.setOnClickListener(new w.3(this));
    AppMethodBeat.o(123792);
    return localg;
  }

  public final boolean aQV()
  {
    AppMethodBeat.i(123783);
    boolean bool = this.jfP.aQV();
    AppMethodBeat.o(123783);
    return bool;
  }

  public final boolean b(EditText paramEditText)
  {
    if (paramEditText == this.jfW)
      this.jfW = null;
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final void et(boolean paramBoolean)
  {
    AppMethodBeat.i(123786);
    ab.d("MicroMsg.AppBrandSoftKeyboardPanel", "onKeyboardStateChanged, kbShown = %b", new Object[] { Boolean.valueOf(paramBoolean) });
    if (paramBoolean)
    {
      qG(0);
      aRe();
      AppMethodBeat.o(123786);
    }
    while (true)
    {
      return;
      if (isShown())
      {
        if ((this.jfT) && (1 == this.state))
        {
          aRd();
          AppMethodBeat.o(123786);
        }
        else
        {
          hide();
        }
      }
      else
        AppMethodBeat.o(123786);
    }
  }

  protected final void fd(boolean paramBoolean)
  {
    AppMethodBeat.i(123789);
    if ((!this.jfN) && (this.jfM != null))
    {
      this.jfN = true;
      this.jfM.fd(paramBoolean);
      this.jfN = false;
    }
    AppMethodBeat.o(123789);
  }

  public EditText getAttachedEditText()
  {
    return this.jfW;
  }

  public int getMinimumHeight()
  {
    AppMethodBeat.i(123788);
    int i;
    if (getVisibility() == 0)
    {
      i = com.tencent.mm.bz.a.fromDPToPix(getContext(), 48);
      AppMethodBeat.o(123788);
    }
    while (true)
    {
      return i;
      i = 0;
      AppMethodBeat.o(123788);
    }
  }

  public final void hide()
  {
    AppMethodBeat.i(123809);
    if (!isShown())
      AppMethodBeat.o(123809);
    while (true)
    {
      return;
      qG(8);
      if (!this.jfX.aRp())
        aj.cS(this).hideSoftInputFromWindow(getWindowToken(), 0);
      aRe();
      AppMethodBeat.o(123809);
    }
  }

  public final void oD(int paramInt)
  {
    AppMethodBeat.i(123784);
    ab.d("MicroMsg.AppBrandSoftKeyboardPanel", "[scrollUp] refreshHeight %d", new Object[] { Integer.valueOf(paramInt) });
    jfY.c(this, paramInt);
    AppMethodBeat.o(123784);
  }

  protected void onAttachedToWindow()
  {
    AppMethodBeat.i(123801);
    super.onAttachedToWindow();
    aRa();
    AppMethodBeat.o(123801);
  }

  protected void onDetachedFromWindow()
  {
    AppMethodBeat.i(123802);
    super.onDetachedFromWindow();
    qG(8);
    if (this.context != null)
    {
      if (this.jfW == null)
        break label92;
      this.jfX.hideVKB(this.jfW);
    }
    while (true)
    {
      this.jfP.onDestroy();
      if (this.jfS != null)
        this.jfS.setOnClickListener(null);
      this.jfL = null;
      removeAllViews();
      this.context = null;
      aRb();
      AppMethodBeat.o(123802);
      return;
      label92: this.jfX.aqX();
    }
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(123785);
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    ab.v("MicroMsg.AppBrandSoftKeyboardPanel", "[scrollUp] SoftKeyboardPanel onLayout measuredHeight = %d", new Object[] { Integer.valueOf(getMeasuredHeight()) });
    AppMethodBeat.o(123785);
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(123800);
    super.onMeasure(paramInt1, paramInt2);
    ab.d("MicroMsg.AppBrandSoftKeyboardPanel", "smileyPanelWrapper, onMeasure");
    AppMethodBeat.o(123800);
  }

  protected final void qE(int paramInt)
  {
    AppMethodBeat.i(138586);
    super.setId(paramInt);
    AppMethodBeat.o(138586);
  }

  final void qG(int paramInt)
  {
    AppMethodBeat.i(123804);
    int i = paramInt;
    if (paramInt == 0)
    {
      i = paramInt;
      if (com.tencent.mm.plugin.appbrand.ui.n.ct(this))
        i = 8;
    }
    if (getVisibility() == i)
      AppMethodBeat.o(123804);
    while (true)
    {
      return;
      super.setVisibility(i);
      if (i == 0)
      {
        aRa();
        AppMethodBeat.o(123804);
      }
      else
      {
        aRb();
        AppMethodBeat.o(123804);
      }
    }
  }

  public void setCanSmileyInput(boolean paramBoolean)
  {
    int i = 0;
    AppMethodBeat.i(123805);
    this.jfT = false;
    ImageButton localImageButton;
    if (this.jfS != null)
    {
      localImageButton = this.jfS;
      if (!this.jfT)
        break label48;
    }
    while (true)
    {
      localImageButton.setVisibility(i);
      aBJ();
      AppMethodBeat.o(123805);
      return;
      label48: i = 4;
    }
  }

  public void setId(int paramInt)
  {
  }

  public void setOnDoneListener(c paramc)
  {
    this.jfM = paramc;
  }

  public void setOnSmileyChosenListener(d paramd)
  {
    this.jfL = paramd;
  }

  public void setOnVisibilityChangedListener(e parame)
  {
    this.jfO = parame;
  }

  public void setShowDoneButton(boolean paramBoolean)
  {
    AppMethodBeat.i(123806);
    this.jfV = paramBoolean;
    View localView;
    if (this.jfU != null)
    {
      localView = this.jfU;
      if (!this.jfV)
        break label48;
    }
    label48: for (int i = 0; ; i = 4)
    {
      localView.setVisibility(i);
      aBJ();
      AppMethodBeat.o(123806);
      return;
    }
  }

  public void setVisibility(int paramInt)
  {
    AppMethodBeat.i(123803);
    if (paramInt == 8)
    {
      if (getVisibility() != paramInt)
        fd(false);
      hide();
      AppMethodBeat.o(123803);
    }
    while (true)
    {
      return;
      if (paramInt == 0)
      {
        show();
        AppMethodBeat.o(123803);
      }
      else
      {
        qG(paramInt);
        AppMethodBeat.o(123803);
      }
    }
  }

  public void show()
  {
    AppMethodBeat.i(123808);
    aRc();
    aBK();
    if (!isShown())
      qG(0);
    AppMethodBeat.o(123808);
  }

  public static abstract interface c
  {
    public abstract void fd(boolean paramBoolean);
  }

  public static abstract interface d
  {
    public abstract boolean EH(String paramString);
  }

  public static abstract interface e
  {
    public abstract void nS(int paramInt);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.input.w
 * JD-Core Version:    0.6.2
 */