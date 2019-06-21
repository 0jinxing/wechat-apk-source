package com.tencent.mm.ui.widget.textview;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.FontMetrics;
import android.graphics.Point;
import android.graphics.Rect;
import android.text.Spannable;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.view.accessibility.AccessibilityManager;
import android.widget.PopupWindow;
import android.widget.PopupWindow.OnDismissListener;
import android.widget.TextView;
import android.widget.TextView.BufferType;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.ai;
import com.tencent.mm.ui.aj;
import com.tencent.mm.ui.base.c;
import com.tencent.neattextview.textview.view.NeatTextView;
import java.util.ArrayList;
import java.util.Iterator;

public final class a
{
  private boolean aGx;
  private View.OnAttachStateChangeListener aaA;
  private ViewTreeObserver.OnGlobalLayoutListener aeL;
  View.OnTouchListener jZu;
  View.OnClickListener lDG;
  Context mContext;
  int[] rGg;
  int[] yJQ;
  private ViewTreeObserver.OnPreDrawListener yL;
  boolean zWA;
  boolean zWB;
  public boolean zWC;
  public boolean zWD;
  boolean zWE;
  boolean zWF;
  boolean zWG;
  final Runnable zWH;
  final Runnable zWI;
  public a.e zWJ;
  ArrayList<a.c> zWK;
  b zWi;
  private b zWj;
  a.g zWk;
  public a.d zWl;
  View zWm;
  public a.f zWn;
  View.OnTouchListener zWo;
  private Spannable zWp;
  private com.tencent.mm.ui.widget.b.a zWq;
  int zWr;
  int zWs;
  private int zWt;
  int zWu;
  int zWv;
  private c zWw;
  int zWx;
  public int zWy;
  private ViewTreeObserver.OnScrollChangedListener zWz;

  public a(a.a parama)
  {
    AppMethodBeat.i(113143);
    this.zWk = new a.g(this);
    this.zWA = false;
    this.aGx = true;
    this.zWB = false;
    this.zWC = true;
    this.zWD = true;
    this.zWE = true;
    this.zWF = false;
    this.zWG = false;
    this.rGg = new int[2];
    this.zWH = new a.1(this);
    this.zWI = new a.5(this);
    this.yJQ = new int[2];
    this.zWm = parama.zWm;
    this.zWn = parama.zWn;
    this.lDG = parama.lDG;
    this.zWo = parama.zWo;
    this.zWq = parama.zWM;
    this.mContext = this.zWm.getContext();
    this.zWt = parama.zWt;
    this.zWu = parama.zWu;
    View localView = this.zWm;
    int i;
    float f;
    if ((localView instanceof NeatTextView))
    {
      i = ((NeatTextView)localView).getLineHeight();
      this.zWx = i;
      if (this.zWv != 0)
        break label344;
      parama = this.zWm;
      if (!(parama instanceof NeatTextView))
        break label319;
      f = ((NeatTextView)parama).getTextSize();
    }
    label219: for (this.zWv = ((int)f); ; this.zWv = aj.fromDPToPix(this.mContext, parama.zWN))
    {
      this.aaA = new a.6(this);
      this.yL = new ViewTreeObserver.OnPreDrawListener()
      {
        public final boolean onPreDraw()
        {
          AppMethodBeat.i(113124);
          if (a.this.zWB)
          {
            a.this.zWB = false;
            a locala = a.this;
            locala.zWm.removeCallbacks(locala.zWH);
            locala.zWm.postDelayed(locala.zWH, 100L);
          }
          AppMethodBeat.o(113124);
          return true;
        }
      };
      this.zWz = new a.8(this);
      this.aeL = new ViewTreeObserver.OnGlobalLayoutListener()
      {
        public final void onGlobalLayout()
        {
          AppMethodBeat.i(113126);
          ai.d("SelectableTextHelper", "onGlobalLayout", new Object[0]);
          if (a.this.zWn != null)
          {
            a.this.dLM();
            a.this.zWC = true;
            a.this.zWD = true;
            a.this.dLL();
          }
          AppMethodBeat.o(113126);
        }
      };
      this.jZu = new a.10(this);
      init();
      AppMethodBeat.o(113143);
      return;
      if ((localView instanceof TextView))
      {
        i = ((TextView)localView).getLineHeight();
        break;
      }
      i = 0;
      break;
      if ((parama instanceof TextView))
      {
        f = ((TextView)parama).getTextSize();
        break label219;
      }
      f = 0.0F;
      break label219;
    }
  }

  private void a(b paramb)
  {
    AppMethodBeat.i(113149);
    if (b.b(paramb));
    for (int i = this.zWk.aqm; (i < 0) || (i > b.fs(this.zWm).length()); i = this.zWk.Ls)
    {
      AppMethodBeat.o(113149);
      return;
    }
    Object localObject = b.ft(this.zWm);
    int j;
    if (localObject != null)
    {
      j = (int)((TextPaint)localObject).getFontMetrics().descent + b.aq(this.zWm, b.ar(this.zWm, i));
      i = (int)b.as(this.zWm, i);
    }
    while (true)
    {
      while (true)
      {
        paramb.zWL.zWm.getLocationInWindow(paramb.zWT);
        int k;
        int m;
        int n;
        if (paramb.zWO)
        {
          k = paramb.mWidth;
          m = i;
          n = j;
          if (!paramb.zWO)
          {
            localObject = paramb.hI(i, j);
            m = localObject[0];
            n = localObject[1];
          }
        }
        try
        {
          paramb.mPopupWindow.showAtLocation(paramb.zWL.zWm, 0, m - k + paramb.dLW(), n + paramb.dLX());
          AppMethodBeat.o(113149);
          break;
          k = 0;
        }
        catch (Exception paramb)
        {
          ai.e("SelectableTextHelper", "error! message: %s.", new Object[] { paramb.getMessage() });
          AppMethodBeat.o(113149);
        }
      }
      break;
      i = 0;
      j = 0;
    }
  }

  private int aI(int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(113156);
    a.c localc;
    if (this.zWK != null)
    {
      Iterator localIterator = this.zWK.iterator();
      while (true)
        if (localIterator.hasNext())
        {
          localc = (a.c)localIterator.next();
          if (localc.vX(paramInt))
            if (paramBoolean)
            {
              paramInt = localc.start;
              AppMethodBeat.o(113156);
            }
        }
    }
    while (true)
    {
      return paramInt;
      paramInt = localc.end;
      AppMethodBeat.o(113156);
      continue;
      AppMethodBeat.o(113156);
    }
  }

  private boolean dLN()
  {
    AppMethodBeat.i(138213);
    AccessibilityManager localAccessibilityManager = (AccessibilityManager)this.mContext.getSystemService("accessibility");
    boolean bool;
    if ((localAccessibilityManager.isEnabled()) && (localAccessibilityManager.isTouchExplorationEnabled()))
    {
      bool = true;
      AppMethodBeat.o(138213);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(138213);
    }
  }

  public final void dLL()
  {
    AppMethodBeat.i(113146);
    dLP();
    dLQ();
    if (this.zWn != null)
      this.zWn.dismiss();
    AppMethodBeat.o(113146);
  }

  public final void dLM()
  {
    AppMethodBeat.i(113147);
    this.zWk.zWW = null;
    if ((this.zWp != null) && (this.zWw != null))
    {
      this.zWp.removeSpan(this.zWw);
      this.zWw = null;
    }
    AppMethodBeat.o(113147);
  }

  public final void dLO()
  {
    AppMethodBeat.i(113150);
    if (!dLN())
    {
      a(this.zWi);
      a(this.zWj);
    }
    AppMethodBeat.o(113150);
  }

  public final void dLP()
  {
    AppMethodBeat.i(113151);
    if (this.zWi != null)
      this.zWi.mPopupWindow.dismiss();
    if (this.zWj != null)
      this.zWj.mPopupWindow.dismiss();
    AppMethodBeat.o(113151);
  }

  public final void dLQ()
  {
    AppMethodBeat.i(113152);
    if (this.zWq != null)
      this.zWq.dBX();
    AppMethodBeat.o(113152);
  }

  public final void dLR()
  {
    AppMethodBeat.i(113153);
    if (this.zWn != null)
      this.zWn.eQ(this.zWm);
    AppMethodBeat.o(113153);
  }

  public final void dLS()
  {
    int i = 16;
    AppMethodBeat.i(113154);
    int k;
    int m;
    if (this.zWq != null)
    {
      int[] arrayOfInt = new int[2];
      this.zWm.getLocationInWindow(arrayOfInt);
      int j = (int)b.as(this.zWm, this.zWk.aqm) + arrayOfInt[0];
      k = b.at(this.zWm, b.ar(this.zWm, this.zWk.aqm));
      m = arrayOfInt[1] + k - 16;
      k = j;
      if (j <= 0)
        k = 16;
      if (m >= 0)
        break label143;
    }
    while (true)
    {
      if (k > b.getScreenWidth(this.mContext))
        k = b.getScreenWidth(this.mContext) - 16;
      while (true)
      {
        this.zWq.dn(k, i);
        AppMethodBeat.o(113154);
        return;
      }
      label143: i = m;
    }
  }

  public final void destroy()
  {
    AppMethodBeat.i(113145);
    this.zWA = false;
    this.aGx = true;
    this.zWB = false;
    this.zWm.removeCallbacks(this.zWH);
    this.zWm.getViewTreeObserver().removeOnScrollChangedListener(this.zWz);
    this.zWm.getViewTreeObserver().removeOnPreDrawListener(this.yL);
    this.zWm.getViewTreeObserver().removeOnGlobalLayoutListener(this.aeL);
    this.zWm.removeOnAttachStateChangeListener(this.aaA);
    this.zWC = true;
    this.zWD = true;
    dLL();
    dLM();
    this.zWi = null;
    this.zWj = null;
    if (this.zWn != null)
      this.zWn.dismiss();
    AppMethodBeat.o(113145);
  }

  final void hG(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(113148);
    dLM();
    if ((b.fs(this.zWm) instanceof Spannable))
      this.zWp = ((Spannable)b.fs(this.zWm));
    if ((this.zWp == null) || (paramInt1 >= b.fs(this.zWm).length()))
    {
      this.zWk.aqm = 0;
      this.zWk.Ls = 0;
      AppMethodBeat.o(113148);
    }
    while (true)
    {
      return;
      hH(paramInt1, paramInt2);
      AppMethodBeat.o(113148);
    }
  }

  public final void hH(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(113155);
    if (paramInt1 != -1)
      this.zWk.aqm = aI(paramInt1, true);
    if (paramInt2 != -1)
      this.zWk.Ls = aI(paramInt2, false);
    if ((this.zWk.aqm < 0) || (this.zWk.aqm > b.fs(this.zWm).length()))
      AppMethodBeat.o(113155);
    while (true)
    {
      return;
      if ((this.zWk.Ls >= 0) && (this.zWk.Ls <= b.fs(this.zWm).length()))
        break;
      AppMethodBeat.o(113155);
    }
    if (this.zWk.aqm > this.zWk.Ls)
    {
      paramInt1 = this.zWk.aqm;
      this.zWk.aqm = this.zWk.Ls;
      this.zWk.Ls = paramInt1;
    }
    if (this.zWp != null)
    {
      this.zWk.zWW = this.zWp.subSequence(this.zWk.aqm, this.zWk.Ls).toString();
      if (this.zWw == null)
        break label318;
      this.zWw.setPosition(this.zWk.aqm, this.zWk.Ls);
    }
    while (true)
    {
      paramInt1 = b.ar(this.zWm, this.zWk.aqm);
      paramInt1 = b.aw(this.zWm, paramInt1);
      this.zWp.setSpan(this.zWw, paramInt1, this.zWk.Ls, 17);
      if (this.zWl != null)
        this.zWl.af(this.zWk.zWW);
      AppMethodBeat.o(113155);
      break;
      label318: this.zWw = new c(this.zWm, this.mContext.getResources().getColor(this.zWt), this.zWk.aqm, this.zWk.Ls);
    }
  }

  public final void init()
  {
    AppMethodBeat.i(113144);
    if (!this.aGx)
    {
      ai.d("SelectableTextHelper", "not destroy, isReInit: %s.", new Object[] { Boolean.valueOf(this.zWA) });
      this.zWA = true;
      AppMethodBeat.o(113144);
    }
    while (true)
    {
      return;
      ai.d("SelectableTextHelper", "not init yet, need to init.", new Object[0]);
      this.zWA = false;
      this.aGx = false;
      this.zWB = false;
      if (this.zWn == null)
        b.a(this.zWm, b.fs(this.zWm), TextView.BufferType.SPANNABLE);
      this.zWi = new b(true);
      if (this.zWn != null)
      {
        this.zWi.dLY();
        this.zWi.setTouchInterceptor(new a.11(this));
        this.zWi.setOnDismissListener(new a.12(this));
      }
      this.zWj = new b(false);
      this.zWm.setOnLongClickListener(new a.2(this));
      this.zWm.setOnTouchListener(this.jZu);
      this.zWm.setOnClickListener(new a.3(this));
      this.zWm.addOnAttachStateChangeListener(this.aaA);
      this.zWm.getViewTreeObserver().addOnPreDrawListener(this.yL);
      this.zWm.getViewTreeObserver().addOnScrollChangedListener(this.zWz);
      this.zWm.getViewTreeObserver().addOnGlobalLayoutListener(this.aeL);
      this.zWm.getViewTreeObserver().addOnGlobalLayoutListener(new a.4(this));
      AppMethodBeat.o(113144);
    }
  }

  final class b extends View
  {
    private int eno;
    private int mHeight;
    private Paint mPaint;
    PopupWindow mPopupWindow;
    int mWidth;
    private Rect rect;
    private int uQR;
    private int[] yJQ;
    boolean zWO;
    private int zWP;
    private int zWQ;
    private int zWR;
    private int zWS;
    int[] zWT;
    private Point zWU;
    private boolean zWV;

    b(boolean arg2)
    {
      super();
      AppMethodBeat.i(113131);
      this.uQR = (a.this.zWv / 2);
      this.mWidth = (this.uQR * 2);
      this.mHeight = (this.uQR * 2);
      this.eno = 25;
      this.zWT = new int[2];
      this.rect = new Rect();
      this.zWU = new Point();
      this.zWV = false;
      this.yJQ = new int[2];
      boolean bool;
      this.zWO = bool;
      this.mPaint = new Paint(1);
      this.mPaint.setColor(a.this.mContext.getResources().getColor(a.this.zWu));
      this.mPopupWindow = new PopupWindow(this);
      this.mPopupWindow.setClippingEnabled(false);
      this.mPopupWindow.setWidth(this.mWidth + this.eno * 2);
      this.mPopupWindow.setHeight(this.mHeight + this.eno / 2);
      invalidate();
      AppMethodBeat.o(113131);
    }

    private void dLU()
    {
      AppMethodBeat.i(113134);
      if (!this.zWO);
      for (boolean bool = true; ; bool = false)
      {
        this.zWO = bool;
        invalidate();
        AppMethodBeat.o(113134);
        return;
      }
    }

    private void dLV()
    {
      AppMethodBeat.i(113136);
      a.this.zWm.getLocationInWindow(this.zWT);
      Object localObject = b.ft(a.this.zWm);
      int i;
      if (localObject != null)
      {
        i = (int)((TextPaint)localObject).getFontMetrics().descent;
        if (this.zWO)
        {
          this.mPopupWindow.update((int)b.as(a.this.zWm, a.this.zWk.aqm) - this.mWidth + dLW(), i + b.aq(a.this.zWm, b.ar(a.this.zWm, a.this.zWk.aqm)) + dLX(), -1, -1);
          AppMethodBeat.o(113136);
        }
      }
      while (true)
      {
        return;
        localObject = hI((int)b.as(a.this.zWm, a.this.zWk.Ls), i + b.aq(a.this.zWm, b.ar(a.this.zWm, a.this.zWk.Ls)));
        int j = localObject[0];
        i = localObject[1];
        this.mPopupWindow.update(j + dLW(), i + dLX(), -1, -1);
        AppMethodBeat.o(113136);
      }
    }

    private void update(int paramInt1, int paramInt2)
    {
      AppMethodBeat.i(113135);
      a.this.zWm.getLocationInWindow(this.zWT);
      int i;
      b localb;
      if (this.zWO)
      {
        i = a.this.zWk.aqm;
        int j = this.zWT[1];
        paramInt1 = b.d(a.this.zWm, paramInt1, paramInt2 - j, i);
        if (paramInt1 == i)
          break label225;
        a.this.dLM();
        if (!this.zWO)
          break label169;
        if (paramInt1 <= this.zWS)
          break label157;
        localb = a.a(a.this, false);
        dLU();
        localb.dLU();
        this.zWR = this.zWS;
        a.this.hH(this.zWS, paramInt1);
        localb.dLV();
      }
      while (true)
      {
        dLV();
        AppMethodBeat.o(113135);
        return;
        i = a.this.zWk.Ls;
        break;
        label157: a.this.hH(paramInt1, -1);
      }
      label169: if (paramInt1 < this.zWR)
      {
        localb = a.a(a.this, true);
        localb.dLU();
        dLU();
        this.zWS = this.zWR;
        a.this.hH(paramInt1, this.zWR);
        localb.dLV();
      }
      while (true)
      {
        dLV();
        label225: AppMethodBeat.o(113135);
        break;
        a.this.hH(this.zWR, paramInt1);
      }
    }

    public final int dLW()
    {
      AppMethodBeat.i(113137);
      int i = this.zWT[0];
      int j = this.eno;
      int k = a.this.zWm.getPaddingLeft();
      AppMethodBeat.o(113137);
      return i - j + k;
    }

    public final int dLX()
    {
      AppMethodBeat.i(113138);
      int i = this.zWT[1];
      int j = a.this.zWm.getPaddingTop();
      AppMethodBeat.o(113138);
      return i + j;
    }

    public final void dLY()
    {
      AppMethodBeat.i(113140);
      this.mPopupWindow.setOutsideTouchable(true);
      AppMethodBeat.o(113140);
    }

    final int[] hI(int paramInt1, int paramInt2)
    {
      AppMethodBeat.i(113139);
      int i = paramInt1;
      int j = paramInt2;
      if (paramInt1 == 0)
      {
        i = paramInt1;
        j = paramInt2;
        if (a.this.zWk.Ls > 1)
        {
          a.this.zWm.getLocationInWindow(this.zWT);
          TextPaint localTextPaint = b.ft(a.this.zWm);
          i = paramInt1;
          j = paramInt2;
          if (localTextPaint != null)
          {
            paramInt1 = (int)localTextPaint.getFontMetrics().descent;
            paramInt2 = b.ar(a.this.zWm, a.this.zWk.Ls - 1);
            i = (int)b.av(a.this.zWm, paramInt2);
            j = b.aq(a.this.zWm, b.ar(a.this.zWm, a.this.zWk.Ls - 1)) + paramInt1;
          }
        }
      }
      AppMethodBeat.o(113139);
      return new int[] { i, j };
    }

    protected final void onDraw(Canvas paramCanvas)
    {
      AppMethodBeat.i(113132);
      int i;
      int j;
      int k;
      if (a.this.zWn != null)
        if (this.zWO)
        {
          i = a.this.zWk.aqm;
          TextPaint localTextPaint = b.ft(a.this.zWm);
          if (localTextPaint == null)
            break label497;
          j = b.aq(a.this.zWm, b.ar(a.this.zWm, i));
          j = (int)localTextPaint.getFontMetrics().descent + j;
          k = (int)b.as(a.this.zWm, i);
          i = j;
          j = k;
        }
      while (true)
      {
        a.this.zWm.getLocationInWindow(this.zWT);
        k = i;
        if (!this.zWO)
          k = hI(j, i)[1];
        i = dLX() + k;
        if (a.this.zWm.getGlobalVisibleRect(this.rect, this.zWU))
          if (i >= this.rect.bottom)
          {
            if (this.zWO)
            {
              ai.d("SelectableTextHelper", "start below bottom, dismiss all.", new Object[0]);
              a.this.dLM();
              a.this.zWC = true;
              a.this.zWD = true;
              a.this.dLL();
              a.this.zWn.dismiss();
            }
            ai.d("SelectableTextHelper", "cursor invisible.", new Object[0]);
            AppMethodBeat.o(113132);
          }
        while (true)
        {
          return;
          i = a.this.zWk.Ls;
          break;
          if (i <= this.rect.top)
          {
            if (!this.zWO)
            {
              ai.d("SelectableTextHelper", "end above top, dismiss all.", new Object[0]);
              a.this.dLM();
              a.this.zWC = true;
              a.this.zWD = true;
              a.this.dLL();
              a.this.zWn.dismiss();
            }
            ai.d("SelectableTextHelper", "cursor invisible.", new Object[0]);
            AppMethodBeat.o(113132);
            continue;
            ai.d("SelectableTextHelper", "view invisible.", new Object[0]);
            AppMethodBeat.o(113132);
          }
          else
          {
            paramCanvas.drawCircle(this.uQR + this.eno, this.uQR, this.uQR, this.mPaint);
            if (this.zWO)
            {
              paramCanvas.drawRect(this.uQR + this.eno, 0.0F, this.uQR * 2 + this.eno, this.uQR, this.mPaint);
              AppMethodBeat.o(113132);
            }
            else
            {
              paramCanvas.drawRect(this.eno, 0.0F, this.uQR + this.eno, this.uQR, this.mPaint);
              AppMethodBeat.o(113132);
            }
          }
        }
        label497: j = 0;
        i = 0;
      }
    }

    public final boolean onTouchEvent(MotionEvent paramMotionEvent)
    {
      AppMethodBeat.i(113133);
      switch (paramMotionEvent.getAction())
      {
      default:
      case 0:
      case 1:
      case 3:
      case 2:
      }
      while (true)
      {
        AppMethodBeat.o(113133);
        return true;
        this.zWR = a.this.zWk.aqm;
        this.zWS = a.this.zWk.Ls;
        this.zWP = ((int)paramMotionEvent.getX());
        this.zWQ = ((int)paramMotionEvent.getY());
        this.zWV = false;
        a.this.zWm.getLocationInWindow(this.yJQ);
        continue;
        if ((a.this.zWn != null) && (!this.zWV))
        {
          this.zWV = true;
          if (a.this.zWk.Ls - a.this.zWk.aqm == b.fs(a.this.zWm).length())
          {
            a.this.zWn.eQ(a.this.zWm);
            a.this.zWC = true;
            a.this.dLQ();
          }
          else
          {
            a.this.zWn.dismiss();
            a.this.zWC = false;
            a.this.dLS();
          }
        }
        else if (!a.this.zWC)
        {
          a.this.dLS();
          continue;
          if (a.this.zWn != null)
            a.this.zWn.dismiss();
          a.this.dLQ();
          int i = (int)paramMotionEvent.getRawX();
          int j = (int)paramMotionEvent.getRawY();
          if (a.this.zWn == null)
            update(i - this.yJQ[0], j + this.zWQ - this.mHeight - a.this.zWx);
          else
            update(i - this.yJQ[0] + this.uQR, j + this.zWQ - this.mHeight - a.this.zWx);
        }
      }
    }

    public final void setOnDismissListener(PopupWindow.OnDismissListener paramOnDismissListener)
    {
      AppMethodBeat.i(138212);
      this.mPopupWindow.setOnDismissListener(paramOnDismissListener);
      AppMethodBeat.o(138212);
    }

    public final void setTouchInterceptor(View.OnTouchListener paramOnTouchListener)
    {
      AppMethodBeat.i(113141);
      this.mPopupWindow.setTouchInterceptor(paramOnTouchListener);
      AppMethodBeat.o(113141);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.widget.textview.a
 * JD-Core Version:    0.6.2
 */