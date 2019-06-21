package com.tencent.mm.plugin.appbrand.widget.input;

import android.app.Activity;
import android.os.Looper;
import android.support.v4.view.s;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.inputmethod.InputMethodManager;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.page.u;
import com.tencent.mm.plugin.appbrand.ui.n;
import com.tencent.mm.plugin.appbrand.widget.input.c.a;
import com.tencent.mm.plugin.appbrand.widget.input.d.a.a;
import com.tencent.mm.pointers.PBool;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.tools.b.c;
import com.tencent.mm.ui.tools.b.c.a;
import com.tencent.mm.ui.tools.f.a;
import java.lang.ref.WeakReference;
import java.util.Locale;
import junit.framework.Assert;

public abstract class i
  implements aa<y>
{
  public volatile i.c jdL;
  private volatile i.a jdM;
  public volatile i.b jdN;
  final View.OnFocusChangeListener jdO = new i.1(this);
  private int jdP = -1;
  private int jdQ = -1;
  i.d jdR = null;
  public com.tencent.mm.plugin.appbrand.widget.input.d.e jdS;
  protected WeakReference<u> jdT;
  public int jdU;
  public y jdV;
  w jdW;
  private v jdX;
  private final Runnable jdY = new i.11(this);
  public final a jdZ = new a();
  private final c.a jdo = new p.a()
  {
    public final void JX()
    {
      AppMethodBeat.i(123636);
      if (i.this.jdV != null);
      while (true)
      {
        try
        {
          i.this.jdZ.a(i.this.jdV.getEditableText(), false);
          AppMethodBeat.o(123636);
          return;
        }
        catch (Exception localException)
        {
        }
        AppMethodBeat.o(123636);
      }
    }
  };
  boolean jea = false;
  final Runnable jeb = new i.12(this);
  final ak jec = new ak(Looper.getMainLooper());
  private final w.d jed = new i.5(this);
  private final w.c jee = new i.6(this);
  private final w.e jef = new i.7(this);

  private void aQB()
  {
    if ((this.jdS.jjF.booleanValue()) && (this.jdW != null) && (this.jdW.isShown()) && (this.jdV != null) && (this.jdV == this.jdW.getAttachedEditText()))
      k.a(this.jdT).qA(this.jdU);
  }

  private void aQC()
  {
    if (this.jdS.jjF.booleanValue())
      aQH();
    if ((this.jdW != null) && (this.jdV != null))
    {
      this.jdW.jfW = this.jdV;
      this.jdW.setShowDoneButton(aj.g(this.jdS.jjG));
      aQF();
      if ((n.ct(this.jdV)) && (this.jdV.hasFocus()))
        this.jdW.show();
    }
  }

  private void aQD()
  {
    this.jdW.b(this.jdV);
    a(this.jdV);
    this.jdV.destroy();
    onDestroy();
  }

  private void aQE()
  {
    boolean bool1 = true;
    u localu;
    boolean bool2;
    label32: boolean bool3;
    if (this.jdT == null)
    {
      localu = null;
      if (this.jdW == null)
        aQH();
      if (this.jdV != null)
        break label114;
      bool2 = true;
      if (localu != null)
        break label119;
      bool3 = true;
      label39: if (this.jdW != null)
        break label125;
      label46: com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.AppBrandInputInvokeHandler", "ensureInputFocusedWithSoftKeyboard, null==mInput[%b], null==page[%b], null==mSmileyPanel[%b]", new Object[] { Boolean.valueOf(bool2), Boolean.valueOf(bool3), Boolean.valueOf(bool1) });
      if ((localu != null) && (this.jdV != null) && (this.jdW != null))
        break label130;
    }
    while (true)
    {
      return;
      localu = (u)this.jdT.get();
      break;
      label114: bool2 = false;
      break label32;
      label119: bool3 = false;
      break label39;
      label125: bool1 = false;
      break label46;
      label130: o.a(localu, this.jdV);
      final PBool localPBool = new PBool();
      localPBool.value = false;
      final i.2 local2 = new i.2(this, localPBool);
      Object localObject = com.tencent.mm.ui.statusbar.d.cY(localu.mContext);
      if ((localObject != null) && (((Activity)localObject).getCurrentFocus() != null))
      {
        localObject = ((Activity)localObject).getCurrentFocus();
        bool2 = aj.cS((View)localObject).isActive((View)localObject);
        bool3 = aj.f(localu.aJz().getWrapperView(), (View)localObject);
        if ((bool2) && (bool3))
        {
          com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.AppBrandInputInvokeHandler", "ensureInputFocusedWithSoftKeyboard, servedConnecting && servedForWebView, delay checkForInput");
          this.jdW.setOnVisibilityChangedListener(new i.3(this, localPBool, local2));
          com.tencent.mm.sdk.g.d.xDG.q(new Runnable()
          {
            public final void run()
            {
              AppMethodBeat.i(123630);
              if (localPBool.value)
                AppMethodBeat.o(123630);
              while (true)
              {
                return;
                local2.run();
                AppMethodBeat.o(123630);
              }
            }
          }
          , 100L);
        }
      }
      else
      {
        local2.run();
      }
    }
  }

  private void aQF()
  {
    if (this.jdW == null);
    while (true)
    {
      return;
      this.jdW.setOnSmileyChosenListener(this.jed);
      this.jdW.setOnDoneListener(this.jee);
      this.jdW.setOnVisibilityChangedListener(this.jef);
    }
  }

  private void aQG()
  {
    Object localObject = (u)this.jdT.get();
    if (!s.av(((u)localObject).getContentView()));
    label137: label169: label198: label326: 
    while (true)
    {
      return;
      this.jdW = w.cO(((u)localObject).getContentView());
      if (this.jdS.jjl)
      {
        aQF();
        aQI();
      }
      this.jdV.a(this.jdO);
      this.jdV.setOnKeyListener(new i.8(this));
      if (this.jdS.jjl)
        o.a((u)this.jdT.get(), this.jdV);
      localObject = this.jdW;
      boolean bool;
      if ((!this.jdS.jjk) && ("emoji".equals(this.jdS.jjj)))
      {
        bool = true;
        ((w)localObject).setCanSmileyInput(bool);
        if (this.jdS.jjF.booleanValue())
          break label283;
        if (this.jdS.jjK != null)
          break label272;
        localObject = com.tencent.mm.plugin.appbrand.widget.input.d.b.aRI();
        int i = ((com.tencent.mm.plugin.appbrand.widget.input.d.b)localObject).jjd;
        this.jdV.setImeOptions(i);
        this.jdV.setOnEditorActionListener(new i.9(this, i));
        this.jdW.setShowDoneButton(this.jdS.jjG.booleanValue());
        this.jdW.jfW = this.jdV;
        if (!this.jdS.jjl)
          break label302;
        aQE();
      }
      while (true)
      {
        if (!this.jdS.jjl)
          break label326;
        k.a(this.jdT).qA(this.jdU);
        break;
        bool = false;
        break label137;
        localObject = this.jdS.jjK;
        break label169;
        this.jdV.setOnEditorActionListener(null);
        this.jdV.setImeOptions(0);
        break label198;
        this.jdV.setFocusable(false);
        this.jdV.setFocusableInTouchMode(false);
        this.jdW.hide();
      }
    }
  }

  private w aQH()
  {
    Object localObject;
    if (this.jdW != null)
      localObject = this.jdW;
    while (true)
    {
      return localObject;
      if (this.jdT != null)
      {
        localObject = (u)this.jdT.get();
        if (localObject != null);
      }
      else
      {
        localObject = null;
        continue;
      }
      localObject = w.cN(((u)localObject).getContentView());
      this.jdW = ((w)localObject);
    }
  }

  private void aQI()
  {
    if (aQu() != null)
      this.jdX.setVisibility(8);
  }

  private v aQu()
  {
    Object localObject;
    if (this.jdX != null)
      localObject = this.jdX;
    while (true)
    {
      return localObject;
      if (this.jdT != null)
      {
        localObject = (u)this.jdT.get();
        if (localObject != null);
      }
      else
      {
        localObject = null;
        continue;
      }
      localObject = v.cL(((u)localObject).getContentView());
      this.jdX = ((v)localObject);
    }
  }

  private void dq(int paramInt1, int paramInt2)
  {
    b.a(this.jdV, paramInt1, paramInt2);
    aQB();
  }

  private void fc(boolean paramBoolean)
  {
    if (this.jdV == null)
      return;
    String str = this.jdV.getText().toString();
    int i = this.jdV.getSelectionEnd();
    if (this.jdR == i.d.jel);
    for (boolean bool = true; ; bool = false)
    {
      b(str, i, bool, paramBoolean);
      break;
    }
  }

  private void onDestroy()
  {
    this.jdV = null;
    com.tencent.mm.plugin.appbrand.s.e.at(this);
  }

  public abstract void Ba(String paramString);

  void a(y paramy)
  {
    if (paramy == null);
    label60: 
    while (true)
    {
      return;
      paramy.b(this.jdO);
      if (this.jdT == null);
      for (Object localObject = null; ; localObject = (u)this.jdT.get())
      {
        if (localObject == null)
          break label60;
        localObject = (g)((u)localObject).aAY();
        if (localObject == null)
          break;
        ((g)localObject).cF(paramy);
        break;
      }
    }
  }

  public final void a(String paramString, Integer paramInteger)
  {
    if (this.jdV == null)
      return;
    this.jdV.B(paramString);
    if (paramInteger == null);
    for (int i = -1; ; i = paramInteger.intValue())
    {
      paramString = Integer.valueOf(i);
      dq(paramString.intValue(), paramString.intValue());
      aQA();
      break;
    }
  }

  boolean a(y paramy, com.tencent.mm.plugin.appbrand.widget.input.d.e parame)
  {
    boolean bool;
    if ((paramy == null) || (this.jdT == null) || (this.jdT.get() == null))
      bool = false;
    while (true)
    {
      return bool;
      g localg = (g)((u)this.jdT.get()).aAY();
      if ((localg != null) && (localg.a(((u)this.jdT.get()).aJz(), paramy, parame.jjp.intValue(), parame.jjq.intValue(), parame.jjs.intValue(), parame.jjr.intValue())))
        bool = true;
      else
        bool = false;
    }
  }

  public abstract void aDA();

  public abstract void aDB();

  public final void aQA()
  {
    if (this.jdV == null)
      return;
    if ((this.jdV.getLineCount() != this.jdP) || (this.jdV.aRh() != this.jdQ))
      if (this.jdP != -1)
        break label120;
    label120: for (int i = 1; ; i = 0)
    {
      this.jdP = this.jdV.getLineCount();
      this.jdQ = this.jdV.aRh();
      if (this.jdL != null)
        this.jdL.db(this.jdP, this.jdQ);
      if ((!this.jdS.jjF.booleanValue()) || (i != 0))
        break;
      aQy();
      aQB();
      break;
      break;
    }
  }

  public final boolean aQn()
  {
    int i;
    if ((this.jdV == null) || (this.jdT == null) || (this.jdT.get() == null))
    {
      i = 0;
      if (i == 0)
        break label131;
      onDestroy();
    }
    label131: for (boolean bool = true; ; bool = false)
    {
      return bool;
      this.jdV.destroy();
      g localg = (g)((u)this.jdT.get()).aAY();
      if (localg == null)
      {
        i = 0;
        break;
      }
      if (this.jdV.hasFocus())
      {
        if (this.jdX != null)
          this.jdX.setVisibility(8);
        aQH();
        if (this.jdW != null)
          this.jdW.setVisibility(8);
      }
      localg.cF(this.jdV);
      i = 1;
      break;
    }
  }

  public final boolean aQr()
  {
    if ((this.jdS != null) && (aj.g(this.jdS.jjM)));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final int aQs()
  {
    int i;
    if ((this.jdS != null) && (this.jdS.jjJ != null))
      i = this.jdS.jjJ.intValue();
    while (true)
    {
      return i;
      if ((this.jdV != null) && (this.jdV.aQP()))
        i = 5;
      else
        i = 0;
    }
  }

  public final boolean aQt()
  {
    int i;
    if ((this.jdV != null) && ((this.jdV.isFocused()) || ((aQH() != null) && (aQH().getAttachedEditText() == this.jdV))))
    {
      i = 1;
      if (i != 0)
        break label60;
      com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.AppBrandInputInvokeHandler", "doHideKeyboard, not focused, return");
    }
    while (true)
    {
      return true;
      i = 0;
      break;
      label60: w localw = aQH();
      if (localw != null)
        localw.setVisibility(8);
    }
  }

  public final void aQy()
  {
    int j;
    int k;
    if ((this.jdV != null) && (aj.g(this.jdS.jjH)) && (aj.g(this.jdS.jjF)))
    {
      ((q)this.jdV).setAutoHeight(true);
      i = this.jdV.getLineHeight();
      j = this.jdV.aRh();
      if ((this.jdS.jjt != null) && (this.jdS.jjt.intValue() > 0))
        break label161;
      k = i;
      if ((this.jdS.jju != null) && (this.jdS.jju.intValue() > 0))
        break label175;
    }
    label161: label175: for (int i = 2147483647; ; i = Math.max(this.jdS.jju.intValue(), i))
    {
      this.jdV.setMinHeight(k);
      this.jdV.setMaxHeight(i);
      this.jdS.jjq = Integer.valueOf(Math.max(k, Math.min(j, i)));
      b(this.jdV, this.jdS);
      return;
      k = this.jdS.jjt.intValue();
      break;
    }
  }

  public final void aQz()
  {
    b.a(this.jdV, this.jdS);
    if (this.jdS.jjy == null)
    {
      this.jdS.jjy = Integer.valueOf(140);
      c localc = p.a(this.jdV).PM(this.jdS.jjy.intValue());
      localc.zIx = false;
      localc.jeZ = f.a.zFu;
      localc.a(this.jdo);
      this.jdV.setPasswordMode(this.jdS.jjk);
      if (!aj.g(this.jdS.jjD))
        break label236;
      this.jdV.setEnabled(false);
      this.jdV.setFocusable(false);
      this.jdV.setFocusableInTouchMode(false);
      this.jdV.setClickable(false);
    }
    while (true)
    {
      if ((this.jdV instanceof q))
      {
        if (this.jdS.jjN != null)
          ((q)this.jdV).setLineSpace(this.jdS.jjN.intValue());
        if (this.jdS.jjO != null)
          ((q)this.jdV).setLineHeight(this.jdS.jjO.intValue());
      }
      return;
      if (this.jdS.jjy.intValue() > 0)
        break;
      this.jdS.jjy = Integer.valueOf(2147483647);
      break;
      label236: this.jdV.setEnabled(true);
      this.jdV.setClickable(true);
    }
  }

  public abstract void b(String paramString, int paramInt, boolean paramBoolean1, boolean paramBoolean2);

  public boolean b(y paramy, com.tencent.mm.plugin.appbrand.widget.input.d.e parame)
  {
    boolean bool;
    if ((paramy == null) || (this.jdT == null) || (this.jdT.get() == null))
      bool = false;
    while (true)
    {
      return bool;
      g localg = (g)((u)this.jdT.get()).aAY();
      if ((localg != null) && (localg.c(((u)this.jdT.get()).aJz(), paramy, parame.jjp.intValue(), parame.jjq.intValue(), parame.jjs.intValue(), parame.jjr.intValue())))
        bool = true;
      else
        bool = false;
    }
  }

  public final boolean dr(int paramInt1, int paramInt2)
  {
    if ((this.jdV == null) || (this.jdT == null) || (this.jdT.get() == null));
    while (true)
    {
      dq(paramInt1, paramInt2);
      return true;
      this.jdV.performClick();
    }
  }

  public final void ds(int paramInt1, int paramInt2)
  {
    this.jdT = this.jdS.jdm;
    if (this.jdT == null);
    for (u localu = null; (localu == null) || (localu.aJz() == null); localu = (u)this.jdT.get())
    {
      com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.AppBrandInputInvokeHandler", "insertInputImpl, view not ready, return fail");
      aDB();
      return;
    }
    if (aj.g(this.jdS.jjF));
    for (Object localObject = new q(localu.mContext); ; localObject = new t(localu.mContext))
    {
      this.jdV = ((y)localObject);
      this.jdU = this.jdS.jdk;
      this.jdV.setInputId(this.jdU);
      o.b(localu, this);
      aQz();
      this.jdV.setText(bo.nullAsNil(this.jdS.jjo));
      if (aj.g(this.jdS.jjH))
        aQA();
      this.jdV.addTextChangedListener(new i.13(this));
      this.jdV.setOnComposingDismissedListener(new i.14(this));
      this.jdV.setOnKeyUpPostImeListener(new ab.b()
      {
        public final boolean qy(int paramAnonymousInt)
        {
          boolean bool = false;
          AppMethodBeat.i(123640);
          if (paramAnonymousInt == 67)
            if (aj.D(i.this.jdV.getText()))
              AppMethodBeat.o(123640);
          while (true)
          {
            return bool;
            i.this.Ba(i.this.jdV.getText().toString());
            bool = true;
            AppMethodBeat.o(123640);
            continue;
            AppMethodBeat.o(123640);
          }
        }
      });
      if (a(this.jdV, this.jdS))
        break label248;
      com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.AppBrandInputInvokeHandler", "add custom view into webView failed");
      aDB();
      break;
    }
    label248: if ((this.jdS.jjn != null) && (!bo.ek(this.jdS.jjn.jiX)))
      com.tencent.mm.plugin.appbrand.widget.input.autofill.d.a(localu, this.jdV, this.jdS.jjn);
    if (!aj.g(this.jdS.jjF))
      b.a(this.jdV, paramInt1, paramInt2);
    if (aj.g(this.jdS.jjF))
      this.jdV.post(new Runnable()
      {
        public final void run()
        {
          AppMethodBeat.i(123641);
          i.c(i.this);
          AppMethodBeat.o(123641);
        }
      });
    if (("text".equalsIgnoreCase(this.jdS.jjj)) || ("emoji".equalsIgnoreCase(this.jdS.jjj)))
      aQG();
    while (true)
    {
      this.jdV.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          AppMethodBeat.i(123642);
          if (i.this.jdV == null)
            AppMethodBeat.o(123642);
          while (true)
          {
            return;
            if (i.this.jdV.hasFocus())
            {
              i.d(i.this);
              AppMethodBeat.o(123642);
            }
            else
            {
              if (i.this.jdV == paramAnonymousView)
                i.e(i.this);
              AppMethodBeat.o(123642);
            }
          }
        }
      });
      aDA();
      break;
      Assert.assertTrue(String.format(Locale.US, "Unrecognized type(%s) implementation removed from here", new Object[] { this.jdS.jjj }), true);
      aQG();
    }
  }

  public final int getInputId()
  {
    return this.jdU;
  }

  public final <P extends View,  extends ac> P getInputPanel()
  {
    return this.jdW;
  }

  public final void qx(int paramInt)
  {
    i.b localb = this.jdN;
    if (localb != null)
      localb.a(this, paramInt);
  }

  public final boolean s(u paramu)
  {
    if ((paramu != null) && (this.jdT != null) && (paramu == this.jdT.get()));
    for (boolean bool = true; ; bool = false)
      return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.input.i
 * JD-Core Version:    0.6.2
 */