package com.tencent.mm.plugin.appbrand.widget.input;

import android.content.Context;
import android.content.res.Resources;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Layout;
import android.text.Layout.Alignment;
import android.text.Spannable;
import android.text.TextUtils;
import android.text.method.MetaKeyKeyListener;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.s.d.f;

public final class q extends y
{
  private com.tencent.mm.plugin.appbrand.widget.h.a iTW;
  private float ibD;
  private final InputFilter jfd;
  private float jfe;
  private float jff;
  private float jfg;
  private boolean jfh;
  private MotionEvent jfi;
  private boolean jfj;
  final ag<q> jfk;

  public q(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(123702);
    this.jfd = new q.4(this);
    this.jfe = 0.0F;
    this.jff = 1.2F;
    this.jfg = getTextSize();
    this.jfh = false;
    this.jfj = false;
    this.jfk = new ag(this);
    super.setSingleLine(false);
    super.setLineSpacing(0.0F, 1.0F);
    super.setVerticalScrollbarPosition(2);
    super.setSpannableFactory(new q.1(this));
    super.a(new q.2(this));
    super.setOnLongClickListener(new q.3(this));
    this.ibD = ViewConfiguration.get(paramContext).getScaledTouchSlop();
    setAutoHeight(false);
    b(0.0F, false);
    AppMethodBeat.o(123702);
  }

  private void b(float paramFloat, boolean paramBoolean)
  {
    AppMethodBeat.i(123709);
    float f = paramFloat;
    if (paramFloat <= 0.0F)
      f = this.jff * this.jfg + this.jfe;
    if ((this.iTW != null) && (!this.iTW.ax(f)))
      AppMethodBeat.o(123709);
    while (true)
    {
      return;
      this.iTW = new com.tencent.mm.plugin.appbrand.widget.h.a(f);
      if (!paramBoolean)
      {
        AppMethodBeat.o(123709);
      }
      else if (hasFocus())
      {
        invalidate();
        AppMethodBeat.o(123709);
      }
      else
      {
        aRl();
        AppMethodBeat.o(123709);
      }
    }
  }

  public final void N(float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(123725);
    if (!isEnabled())
      AppMethodBeat.o(123725);
    while (true)
    {
      return;
      if (aOQ())
      {
        int i = aj.a.a(this, paramFloat1, paramFloat2);
        if (i >= 0)
          setSelection(i);
      }
      super.performClick();
      AppMethodBeat.o(123725);
    }
  }

  public final boolean aOQ()
  {
    AppMethodBeat.i(123719);
    if (!this.jfh)
    {
      aRh();
      getMeasuredHeight();
    }
    boolean bool;
    if ((!isFocusable()) && (!aQT()))
    {
      bool = true;
      AppMethodBeat.o(123719);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(123719);
    }
  }

  protected final void aQO()
  {
    AppMethodBeat.i(123705);
    if (this.jfh)
      if (getMeasuredHeight() > getMaxHeight())
      {
        setMeasuredDimension(getMeasuredWidth(), getMaxHeight());
        AppMethodBeat.o(123705);
      }
    while (true)
    {
      return;
      if ((getMeasuredHeight() < getMinHeight()) && (getMinHeight() > 0))
        setMeasuredDimension(getMeasuredWidth(), getMinHeight());
      AppMethodBeat.o(123705);
    }
  }

  public final boolean aQP()
  {
    return true;
  }

  public final boolean aQQ()
  {
    return false;
  }

  public final void aQR()
  {
    AppMethodBeat.i(123718);
    aj.cS(this).restartInput(this);
    AppMethodBeat.o(123718);
  }

  final Editable c(Editable paramEditable)
  {
    AppMethodBeat.i(123703);
    paramEditable = super.c(paramEditable);
    if ((this.iTW != null) && (!TextUtils.isEmpty(paramEditable)))
      paramEditable.setSpan(this.iTW, 0, paramEditable.length(), 18);
    AppMethodBeat.o(123703);
    return paramEditable;
  }

  public final boolean canScrollVertically(int paramInt)
  {
    AppMethodBeat.i(123723);
    boolean bool;
    if (aRh() <= getHeight())
    {
      bool = false;
      AppMethodBeat.o(123723);
    }
    while (true)
    {
      return bool;
      bool = super.canScrollVertically(paramInt);
      AppMethodBeat.o(123723);
    }
  }

  public final View getInputPanel()
  {
    AppMethodBeat.i(123717);
    w localw = w.cN(this);
    AppMethodBeat.o(123717);
    return localw;
  }

  public final int getLineHeight()
  {
    AppMethodBeat.i(123713);
    int i;
    if (this.iTW != null)
    {
      i = this.iTW.height;
      AppMethodBeat.o(123713);
    }
    while (true)
    {
      return i;
      i = super.getLineHeight();
      AppMethodBeat.o(123713);
    }
  }

  @Deprecated
  public final float getLineSpacingExtra()
  {
    AppMethodBeat.i(123711);
    float f = super.getLineSpacingExtra();
    AppMethodBeat.o(123711);
    return f;
  }

  @Deprecated
  public final float getLineSpacingMultiplier()
  {
    AppMethodBeat.i(123710);
    float f = super.getLineSpacingMultiplier();
    AppMethodBeat.o(123710);
    return f;
  }

  protected final void onScrollChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(123720);
    super.onScrollChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    AppMethodBeat.o(123720);
  }

  public final boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(123724);
    int i;
    float f1;
    float f2;
    boolean bool;
    label168: label236: float f3;
    if ((aOQ()) && ((getParent() instanceof com.tencent.mm.plugin.appbrand.widget.base.d)))
    {
      ag localag;
      Object localObject1;
      if ((paramMotionEvent.getActionMasked() != 0) || (((com.tencent.mm.plugin.appbrand.widget.base.d)getParent()).E(paramMotionEvent)))
      {
        localag = this.jfk;
        com.tencent.mm.plugin.appbrand.widget.base.a.a(localag.TAG, "processTouchEvent", paramMotionEvent);
        localObject1 = localag.jgG;
        i = paramMotionEvent.getActionIndex();
        f1 = paramMotionEvent.getX(i);
        f2 = paramMotionEvent.getY(i);
        if ((paramMotionEvent.getActionMasked() != 0) && (localag.jgJ == null))
        {
          com.tencent.mm.sdk.platformtools.ab.v(localag.TAG, "[textscroll] no pointer down before, just return");
          localag.aRq();
          bool = false;
          AppMethodBeat.o(123724);
        }
      }
      while (true)
      {
        return bool;
        int j = 0;
        Object localObject2;
        Object localObject3;
        switch (paramMotionEvent.getActionMasked())
        {
        default:
          localObject2 = localag.jgG;
          localObject3 = localag.jgG.getText();
          if ((((TextView)localObject2).canScrollVertically(-1)) || (((TextView)localObject2).canScrollVertically(1)))
            switch (paramMotionEvent.getActionMasked())
            {
            default:
            case 0:
            case 1:
            case 3:
            case 2:
            }
          break;
        case 1:
        case 0:
        case 3:
        case 2:
        }
        while (true)
        {
          i = 0;
          while (true)
          {
            bool = i | j;
            com.tencent.mm.plugin.appbrand.widget.base.a.a(localag.TAG, "[textscroll] handled | ".concat(String.valueOf(bool)), paramMotionEvent);
            AppMethodBeat.o(123724);
            break;
            com.tencent.mm.sdk.platformtools.ab.v(localag.TAG, "[apptouch] ACTION_UP, pointerDown %B", new Object[] { Boolean.valueOf(localag.jgK) });
            if ((localag.jgK) && (localag.jgJ != null))
            {
              localObject2 = com.tencent.mm.plugin.appbrand.jsapi.s.d.co(localag.jgG);
              if ((localag.jgI != null) && (Math.abs(localag.jgI.x - ((d.f)localObject2).x) <= 1.0F) && (Math.abs(localag.jgI.y - ((d.f)localObject2).y) <= 1.0F))
                break label387;
              com.tencent.mm.sdk.platformtools.ab.v(localag.TAG, "[apptouch] check tap on ACTION_UP, but view has moved.");
            }
            while (true)
            {
              localag.aRq();
              break;
              label387: if (!localag.a(localag.jgJ, paramMotionEvent))
                com.tencent.mm.sdk.platformtools.ab.v(localag.TAG, "[apptouch] check tap on ACTION_UP exceed tap scope");
              else
                ((ab)localObject1).N(f1, f2);
            }
            localag.jgJ = MotionEvent.obtain(paramMotionEvent);
            localag.jgI = com.tencent.mm.plugin.appbrand.jsapi.s.d.co((View)localObject1);
            if (localObject1 != null)
            {
              localObject2 = ((View)localObject1).getParent();
              label454: if ((localObject2 != null) && ((localObject2 instanceof ViewGroup)))
                if (((ViewGroup)localObject2).shouldDelayChildPressedState())
                {
                  i = 1;
                  label481: ((EditText)localObject1).removeCallbacks(localag.jgL);
                  if (i == 0)
                    break label532;
                  ((EditText)localObject1).postDelayed(localag.jgL, ViewConfiguration.getTapTimeout());
                }
            }
            while (true)
            {
              j = 1;
              break;
              localObject2 = ((ViewParent)localObject2).getParent();
              break label454;
              i = 0;
              break label481;
              label532: localag.jgL.run();
            }
            localag.aRq();
            break label168;
            f3 = localag.jgH;
            if ((f1 >= -f3) && (f2 >= -f3) && (f1 < ((View)localObject1).getWidth() + f3) && (f2 < ((View)localObject1).getHeight() + f3));
            for (i = 1; ; i = 0)
            {
              if ((i != 0) && (localag.a(localag.jgJ, paramMotionEvent)))
                break label655;
              localag.jgK = false;
              ((EditText)localObject1).removeCallbacks(localag.jgL);
              ((EditText)localObject1).removeCallbacks(localag.jgM);
              break;
            }
            label655: j = 1;
            break label168;
            localObject1 = (ai.a[])((Spannable)localObject3).getSpans(0, ((Spannable)localObject3).length(), ai.a.class);
            for (i = 0; i < localObject1.length; i++)
              ((Spannable)localObject3).removeSpan(localObject1[i]);
            ((Spannable)localObject3).setSpan(new ai.a(paramMotionEvent.getX(), paramMotionEvent.getY(), ((TextView)localObject2).getScrollX(), ((TextView)localObject2).getScrollY()), 0, 0, 17);
            i = 1;
            continue;
            localObject2 = ai.g((TextView)localObject2);
            if ((localObject2 != null) && (localObject2.length > 0) && (localObject2[0].jgY))
            {
              i = 1;
            }
            else
            {
              i = 0;
              continue;
              localObject1 = (ai.a[])((Spannable)localObject3).getSpans(0, ((Spannable)localObject3).length(), ai.a.class);
              if (localObject1.length <= 0)
                break label236;
              if (!localObject1[0].jgX)
              {
                i = ViewConfiguration.get(((TextView)localObject2).getContext()).getScaledTouchSlop();
                if ((Math.abs(paramMotionEvent.getX() - localObject1[0].avX) >= i) || (Math.abs(paramMotionEvent.getY() - localObject1[0].avY) >= i))
                  localObject1[0].jgX = true;
              }
              if (!localObject1[0].jgX)
                break label236;
              localObject1[0].jgY = true;
              if (((paramMotionEvent.getMetaState() & 0x1) != 0) || (MetaKeyKeyListener.getMetaState((CharSequence)localObject3, 1) == 1) || (MetaKeyKeyListener.getMetaState((CharSequence)localObject3, 2048) != 0))
              {
                i = 1;
                label939: if (i == 0)
                  break label1022;
                f2 = paramMotionEvent.getX() - localObject1[0].avX;
              }
              for (f1 = paramMotionEvent.getY() - localObject1[0].avY; ; f1 = localObject1[0].avY - paramMotionEvent.getY())
              {
                localObject1[0].avX = paramMotionEvent.getX();
                localObject1[0].avY = paramMotionEvent.getY();
                if (!localObject1[0].jgZ)
                  break label1051;
                localObject1[0].jgZ = false;
                localObject1[0].jgX = false;
                break;
                i = 0;
                break label939;
                label1022: f2 = localObject1[0].avX - paramMotionEvent.getX();
              }
              label1051: int k = ((TextView)localObject2).getScrollX();
              int m = (int)f2;
              int n = ((TextView)localObject2).getScrollY();
              int i1 = (int)f1;
              i = ((TextView)localObject2).getTotalPaddingTop();
              int i2 = ((TextView)localObject2).getTotalPaddingBottom();
              Layout localLayout = ((TextView)localObject2).getLayout();
              i1 = Math.max(Math.min(i1 + n, localLayout.getHeight() - (((TextView)localObject2).getHeight() - (i + i2))), 0);
              i2 = ((TextView)localObject2).getScrollX();
              n = ((TextView)localObject2).getScrollY();
              int i3 = ((TextView)localObject2).getTotalPaddingLeft();
              i = ((TextView)localObject2).getTotalPaddingRight();
              i3 = ((TextView)localObject2).getWidth() - (i3 + i);
              i = localLayout.getLineForVertical(i1);
              localObject3 = localLayout.getParagraphAlignment(i);
              label1199: int i4;
              if (localLayout.getParagraphDirection(i) > 0)
              {
                i = 1;
                i4 = i3 + 0;
                if (i4 >= i3)
                  break label1328;
                if (localObject3 != Layout.Alignment.ALIGN_CENTER)
                  break label1284;
                i = 0 - (i3 - i4) / 2;
              }
              while (true)
              {
                ((TextView)localObject2).scrollTo(i, i1);
                if ((i2 == ((TextView)localObject2).getScrollX()) && (n == ((TextView)localObject2).getScrollY()))
                  break label1346;
                ((TextView)localObject2).cancelLongPress();
                localObject1[0].arP = true;
                i = 1;
                break;
                i = 0;
                break label1199;
                label1284: if (((i != 0) && (localObject3 == Layout.Alignment.ALIGN_OPPOSITE)) || ((i == 0) && (localObject3 == Layout.Alignment.ALIGN_NORMAL)))
                {
                  i = 0 - (i3 - i4);
                }
                else
                {
                  i = 0;
                  continue;
                  label1328: i = Math.max(Math.min(m + k, 0), 0);
                }
              }
              label1346: if (!localObject1[0].arP)
                break label1361;
              i = 1;
            }
          }
          label1361: ai.g((TextView)localObject2);
        }
        bool = false;
        AppMethodBeat.o(123724);
      }
    }
    switch (paramMotionEvent.getActionMasked())
    {
    default:
    case 1:
    case 3:
    case 0:
    case 2:
    }
    while (true)
    {
      bool = super.onTouchEvent(paramMotionEvent);
      AppMethodBeat.o(123724);
      break;
      this.jfj = false;
      if (this.jfi != null)
      {
        this.jfi.recycle();
        this.jfi = null;
      }
      if (this.jfj)
      {
        i = aj.a.a(this, paramMotionEvent.getX(paramMotionEvent.getActionIndex()), paramMotionEvent.getY(paramMotionEvent.getActionIndex()));
        if (i >= 0)
          setSelection(i);
      }
      if (getParent() == null)
      {
        bool = true;
        AppMethodBeat.o(123724);
        break;
        this.jfi = MotionEvent.obtain(paramMotionEvent);
        this.jfj = true;
        continue;
        if (this.jfj)
        {
          f2 = this.jfi.getX(this.jfi.getActionIndex());
          f1 = this.jfi.getY(this.jfi.getActionIndex());
          f3 = paramMotionEvent.getX(paramMotionEvent.getActionIndex());
          float f4 = paramMotionEvent.getY(paramMotionEvent.getActionIndex());
          if ((Math.abs(f2 - f3) > this.ibD) || (Math.abs(f1 - f4) > this.ibD))
          {
            cancelLongPress();
            setPressed(false);
            this.jfj = false;
          }
        }
      }
    }
  }

  public final boolean performHapticFeedback(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(123726);
    boolean bool = super.performHapticFeedback(paramInt1, paramInt2);
    AppMethodBeat.o(123726);
    return bool;
  }

  public final void scrollBy(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(123722);
    super.scrollBy(paramInt1, paramInt2);
    AppMethodBeat.o(123722);
  }

  public final void scrollTo(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(123721);
    super.scrollTo(paramInt1, paramInt2);
    AppMethodBeat.o(123721);
  }

  public final void setAutoHeight(boolean paramBoolean)
  {
    AppMethodBeat.i(123704);
    this.jfh = paramBoolean;
    if (!this.jfh);
    for (paramBoolean = true; ; paramBoolean = false)
    {
      setVerticalScrollBarEnabled(paramBoolean);
      AppMethodBeat.o(123704);
      return;
    }
  }

  public final void setFilters(InputFilter[] paramArrayOfInputFilter)
  {
    int i = 0;
    AppMethodBeat.i(123708);
    InputFilter[] arrayOfInputFilter = paramArrayOfInputFilter;
    if (this.jfd != null)
    {
      arrayOfInputFilter = paramArrayOfInputFilter;
      if (paramArrayOfInputFilter == null)
        arrayOfInputFilter = new InputFilter[0];
      paramArrayOfInputFilter = new InputFilter[arrayOfInputFilter.length + 1];
      while (i < arrayOfInputFilter.length)
      {
        paramArrayOfInputFilter[i] = arrayOfInputFilter[i];
        i++;
      }
      paramArrayOfInputFilter[i] = this.jfd;
      arrayOfInputFilter = paramArrayOfInputFilter;
    }
    super.setFilters(arrayOfInputFilter);
    AppMethodBeat.o(123708);
  }

  public final void setGravity(int paramInt)
  {
    AppMethodBeat.i(123706);
    super.setGravity(paramInt & 0xFFFFFFAF & 0xFFFFFFEF | 0x30);
    AppMethodBeat.o(123706);
  }

  public final void setInputType(int paramInt)
  {
    AppMethodBeat.i(123707);
    super.setInputType(0x20000 | paramInt);
    AppMethodBeat.o(123707);
  }

  public final void setLineHeight(float paramFloat)
  {
    AppMethodBeat.i(123716);
    if (paramFloat <= 0.0F)
      AppMethodBeat.o(123716);
    while (true)
    {
      return;
      b(paramFloat, true);
      AppMethodBeat.o(123716);
    }
  }

  public final void setLineSpace(float paramFloat)
  {
    AppMethodBeat.i(123715);
    setLineSpacing(paramFloat, this.jff);
    AppMethodBeat.o(123715);
  }

  public final void setLineSpacing(float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(123714);
    this.jfe = paramFloat1;
    this.jff = paramFloat2;
    b(0.0F, true);
    AppMethodBeat.o(123714);
  }

  public final void setSingleLine(boolean paramBoolean)
  {
  }

  public final void setTextSize(int paramInt, float paramFloat)
  {
    AppMethodBeat.i(123712);
    super.setTextSize(paramInt, paramFloat);
    this.jfg = TypedValue.applyDimension(paramInt, paramFloat, getResources().getDisplayMetrics());
    b(0.0F, true);
    AppMethodBeat.o(123712);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.input.q
 * JD-Core Version:    0.6.2
 */