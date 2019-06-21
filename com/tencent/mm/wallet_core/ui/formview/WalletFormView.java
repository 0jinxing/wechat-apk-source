package com.tencent.mm.wallet_core.ui.formview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.text.InputFilter;
import android.text.InputFilter.LengthFilter;
import android.text.SpannableString;
import android.text.SpannedString;
import android.text.TextWatcher;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.text.method.PasswordTransformationMethod;
import android.text.style.AbsoluteSizeSpan;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wxpay.a.a;
import com.tencent.mm.pluginsdk.ui.wallet.WalletIconImageView;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.e;
import com.tencent.mm.wallet_core.ui.formview.a.a;
import com.tenpay.android.wechat.TenpaySecureEditText;
import java.lang.reflect.Field;
import junit.framework.Assert;

public final class WalletFormView extends LinearLayout
  implements View.OnFocusChangeListener
{
  public TenpaySecureEditText Aih;
  private WalletFormView.a Aii;
  private a Aij;
  private com.tencent.mm.wallet_core.ui.formview.a.b Aik;
  private int Ail;
  private int Aim;
  private int Ain;
  private int Aio;

  @Deprecated
  private int Aip;
  private int Aiq;
  private int Air;
  private TextView iDT;
  private int pIA;
  private String pIB;
  private int pIC;
  private String pID;
  private int pIE;
  private int pIF;
  private String pIG;
  private int pIH;
  private int pII;
  private int pIJ;
  private boolean pIK;
  private boolean pIL;
  private boolean pIM;
  private int pIN;
  private int pIO;
  private int pIP;
  private TextView pIl;
  private WalletIconImageView pIn;
  private TextView pIo;
  private View.OnFocusChangeListener pIq;
  private View.OnClickListener pIr;
  private int pIu;
  private String pIv;
  private int pIw;
  private String pIx;
  private int pIy;
  private int pIz;

  public WalletFormView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, -1);
  }

  public WalletFormView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(49412);
    this.iDT = null;
    this.pIl = null;
    this.Aih = null;
    this.pIn = null;
    this.pIo = null;
    this.Aii = null;
    this.pIq = null;
    this.pIr = null;
    this.Aij = null;
    this.Aik = null;
    this.pIu = -1;
    this.Ail = this.pIu;
    this.Aim = 100;
    this.pIv = "";
    this.pIw = 0;
    this.pIx = "";
    this.pIy = 8;
    this.pIz = -1;
    this.pIA = 4;
    this.pIB = "";
    this.pIC = 8;
    this.pID = "";
    this.Ain = -1;
    this.pIE = 19;
    this.pIF = 2131690316;
    this.pIG = "";
    this.Aio = 0;
    this.pIH = 2147483647;
    this.pII = 1;
    this.pIJ = 2130839563;
    this.pIK = true;
    this.pIL = false;
    this.pIM = true;
    this.pIN = 1;
    this.pIO = 5;
    this.pIP = 2131690211;
    this.Aip = 0;
    this.Aiq = 0;
    this.Air = 0;
    paramAttributeSet = paramContext.obtainStyledAttributes(paramAttributeSet, a.a.WalletFormAttrs, paramInt, 0);
    this.pIu = paramAttributeSet.getResourceId(4, this.pIu);
    paramInt = paramAttributeSet.getResourceId(6, 0);
    if (paramInt != 0)
      this.pIv = paramContext.getString(paramInt);
    this.pIz = paramAttributeSet.getResourceId(7, this.pIz);
    paramInt = paramAttributeSet.getResourceId(8, 0);
    if (paramInt != 0)
      this.pIB = paramContext.getString(paramInt);
    this.pIA = paramAttributeSet.getInteger(10, this.pIA);
    this.pIw = paramAttributeSet.getInteger(11, this.pIw);
    this.pIC = paramAttributeSet.getInteger(12, this.pIC);
    this.pIy = paramAttributeSet.getInteger(13, this.pIy);
    paramInt = paramAttributeSet.getResourceId(14, 0);
    if (paramInt != 0)
      this.pIx = paramContext.getString(paramInt);
    paramInt = paramAttributeSet.getResourceId(15, 0);
    if (paramInt != 0)
      this.pID = paramContext.getString(paramInt);
    this.Ain = paramAttributeSet.getDimensionPixelSize(16, -1);
    this.pIE = paramAttributeSet.getInteger(17, this.pIE);
    this.pIF = paramAttributeSet.getColor(18, this.pIF);
    paramInt = paramAttributeSet.getResourceId(19, 0);
    if (paramInt != 0)
      this.pIG = paramContext.getString(paramInt);
    this.Aio = paramAttributeSet.getInt(20, this.Aio);
    this.pIH = paramAttributeSet.getInteger(21, this.pIH);
    this.pII = paramAttributeSet.getInteger(22, this.pII);
    this.pIJ = paramAttributeSet.getResourceId(23, this.pIJ);
    this.pIK = paramAttributeSet.getBoolean(24, this.pIK);
    this.pIL = paramAttributeSet.getBoolean(26, this.pIL);
    this.pIM = paramAttributeSet.getBoolean(24, this.pIM);
    this.pIN = paramAttributeSet.getInteger(0, this.pIN);
    this.pIO = paramAttributeSet.getInteger(1, this.pIO);
    this.Aim = paramAttributeSet.getInteger(28, this.Aim);
    this.pIP = paramAttributeSet.getInteger(27, this.pIP);
    this.Ail = paramAttributeSet.getResourceId(5, this.Ail);
    this.Aip = paramAttributeSet.getInteger(30, 0);
    this.Aiq = paramAttributeSet.getInteger(3, -1);
    if ((this.Aip == 1) && (this.Aiq == -1))
      this.Aiq = 4;
    this.Air = paramAttributeSet.getResourceId(2, 0);
    paramAttributeSet.recycle();
    if (this.pIu > 0)
      bool = true;
    Assert.assertTrue(bool);
    setOrientation(1);
    if ((!bo.isNullOrNil(this.pIv)) && (this.pIv.length() > 6))
      inflate(paramContext, this.Ail, this);
    while (true)
    {
      this.iDT = ((TextView)findViewById(2131820694));
      this.pIl = ((TextView)findViewById(2131820692));
      this.Aih = ((TenpaySecureEditText)findViewById(2131820687));
      this.pIn = ((WalletIconImageView)findViewById(2131820691));
      this.pIo = ((TextView)findViewById(2131820693));
      AppMethodBeat.o(49412);
      return;
      inflate(paramContext, this.pIu, this);
    }
  }

  private boolean b(View paramView, MotionEvent paramMotionEvent)
  {
    boolean bool = false;
    AppMethodBeat.i(49435);
    if ((paramView != null) && (paramView.getVisibility() == 0))
      if (dt(paramView).contains((int)paramMotionEvent.getX(), (int)paramMotionEvent.getY()))
      {
        bool = true;
        AppMethodBeat.o(49435);
      }
    while (true)
    {
      return bool;
      AppMethodBeat.o(49435);
      continue;
      AppMethodBeat.o(49435);
    }
  }

  private void cew()
  {
    AppMethodBeat.i(49423);
    if ((this.pIn != null) && (!bo.isNullOrNil(getText())) && (this.Aih != null) && (this.Aih.isEnabled()) && (this.Aih.isClickable()) && (this.Aih.isFocusable()) && (this.Aih.isFocused()))
    {
      this.pIn.setToClearState(new WalletFormView.2(this));
      AppMethodBeat.o(49423);
    }
    while (true)
    {
      return;
      if (this.pIn != null)
      {
        this.pIn.dlG();
        AppMethodBeat.o(49423);
      }
      else
      {
        ab.v("MicroMsg.WalletFormView", "hy: no info iv");
        AppMethodBeat.o(49423);
      }
    }
  }

  private void dOR()
  {
    AppMethodBeat.i(49437);
    if (getTitleTv() != null)
    {
      getTitleTv().setText(this.pIv);
      getTitleTv().setVisibility(this.pIw);
    }
    AppMethodBeat.o(49437);
  }

  private Rect dt(View paramView)
  {
    AppMethodBeat.i(49436);
    if (paramView != null)
    {
      Rect localRect = new Rect();
      paramView.getHitRect(localRect);
      paramView = l(paramView, localRect);
      AppMethodBeat.o(49436);
    }
    while (true)
    {
      return paramView;
      paramView = null;
      AppMethodBeat.o(49436);
    }
  }

  private Rect l(View paramView, Rect paramRect)
  {
    if (paramView == this.pIn)
    {
      paramRect.left -= 50;
      paramRect.right += 50;
      paramRect.top -= 25;
      paramRect.bottom += 25;
    }
    return paramRect;
  }

  public final void a(TextWatcher paramTextWatcher)
  {
    AppMethodBeat.i(49445);
    if (this.Aih != null)
      this.Aih.addTextChangedListener(paramTextWatcher);
    AppMethodBeat.o(49445);
  }

  public final boolean asa()
  {
    boolean bool = true;
    AppMethodBeat.i(49447);
    if (this.Aih != null)
    {
      int i = this.Aih.getInputLength();
      if ((i > this.pIH) || (i < this.pII))
      {
        bool = false;
        AppMethodBeat.o(49447);
      }
    }
    while (true)
    {
      return bool;
      if (this.Aik != null)
      {
        bool = this.Aik.a(this);
        AppMethodBeat.o(49447);
      }
      else
      {
        AppMethodBeat.o(49447);
        continue;
        ab.e("MicroMsg.WalletFormView", "hy: no content edit text. true as default");
        AppMethodBeat.o(49447);
      }
    }
  }

  public final void cex()
  {
    AppMethodBeat.i(49449);
    if (this.Aih != null)
      this.Aih.clearFocus();
    AppMethodBeat.o(49449);
  }

  public final void cey()
  {
    AppMethodBeat.i(49448);
    if (this.Aih != null)
      this.Aih.ClearInput();
    AppMethodBeat.o(49448);
  }

  public final void dOP()
  {
    AppMethodBeat.i(49414);
    if (this.Aih != null)
      this.Aih.setPadding(0, 0, 0, 0);
    AppMethodBeat.o(49414);
  }

  public final boolean dOQ()
  {
    AppMethodBeat.i(49424);
    boolean bool;
    if (this.Aih != null)
    {
      bool = this.Aih.isFocusable();
      AppMethodBeat.o(49424);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(49424);
    }
  }

  public final void dOS()
  {
    AppMethodBeat.i(49453);
    if (this.Aih != null)
    {
      this.Aih.setFocusable(true);
      this.Aih.requestFocus();
      ((InputMethodManager)getContext().getSystemService("input_method")).showSoftInput(this.Aih, 0);
    }
    AppMethodBeat.o(49453);
  }

  public final void f(WalletBaseUI paramWalletBaseUI)
  {
    AppMethodBeat.i(49454);
    if (this.Aih != null)
    {
      this.Aih.setFocusable(true);
      this.Aih.requestFocus();
      paramWalletBaseUI.dOC();
    }
    AppMethodBeat.o(49454);
  }

  public final boolean fx(View paramView)
  {
    boolean bool = false;
    AppMethodBeat.i(49450);
    if (getVisibility() == 0)
      if (bo.isNullOrNil(getText()))
      {
        if (paramView != null)
          paramView.setVisibility(4);
        if (this.iDT != null)
          this.iDT.setEnabled(true);
        AppMethodBeat.o(49450);
      }
    while (true)
    {
      return bool;
      if (asa())
      {
        if (paramView != null)
          paramView.setVisibility(4);
        if (this.iDT != null)
          this.iDT.setEnabled(true);
        AppMethodBeat.o(49450);
        bool = true;
      }
      else
      {
        if (paramView != null)
          paramView.setVisibility(0);
        if (this.iDT != null)
          this.iDT.setEnabled(false);
        AppMethodBeat.o(49450);
        continue;
        if (paramView != null)
          paramView.setVisibility(8);
        AppMethodBeat.o(49450);
        bool = true;
      }
    }
  }

  public final EditText getContentEt()
  {
    return this.Aih;
  }

  public final int getEncrptType()
  {
    return this.Aim;
  }

  public final a getEventDelegate()
  {
    return this.Aij;
  }

  public final WalletIconImageView getInfoIv()
  {
    return this.pIn;
  }

  public final int getInputLength()
  {
    AppMethodBeat.i(49452);
    int i;
    if (this.Aih != null)
    {
      i = this.Aih.getInputLength();
      AppMethodBeat.o(49452);
    }
    while (true)
    {
      return i;
      i = 0;
      AppMethodBeat.o(49452);
    }
  }

  public final WalletFormView.a getInputValidChangeListener()
  {
    return this.Aii;
  }

  public final KeyListener getKeyListener()
  {
    AppMethodBeat.i(49440);
    KeyListener localKeyListener;
    if (this.Aih != null)
    {
      localKeyListener = this.Aih.getKeyListener();
      AppMethodBeat.o(49440);
    }
    while (true)
    {
      return localKeyListener;
      ab.w("MicroMsg.WalletFormView", "hy: no content et");
      localKeyListener = null;
      AppMethodBeat.o(49440);
    }
  }

  public final com.tencent.mm.wallet_core.ui.formview.a.b getLogicDelegate()
  {
    return this.Aik;
  }

  public final String getMD5Value()
  {
    AppMethodBeat.i(49416);
    String str1 = bo.nullAsNil(this.Aih.getText().toString());
    String str2 = str1;
    if (this.Aik != null)
    {
      str2 = str1;
      if (this.Aik.cev())
        str2 = this.Aik.e(this, str1);
    }
    str2 = ag.ck(str2);
    AppMethodBeat.o(49416);
    return str2;
  }

  public final int getMaxInputLength()
  {
    return this.pIH;
  }

  public final int getMinInputLength()
  {
    return this.pII;
  }

  public final TextView getPrefilledTv()
  {
    return this.pIl;
  }

  public final String getText()
  {
    AppMethodBeat.i(49439);
    String str;
    if (this.Aih != null)
    {
      str = c.a.a(this.Aim, this.Aih);
      if ((this.Aik != null) && (this.Aik.cev()))
      {
        str = this.Aik.e(this, str);
        AppMethodBeat.o(49439);
      }
    }
    while (true)
    {
      return str;
      AppMethodBeat.o(49439);
      continue;
      ab.e("MicroMsg.WalletFormView", "hy: no content et. return nil");
      str = "";
      AppMethodBeat.o(49439);
    }
  }

  public final TextView getTipsTv()
  {
    return this.pIo;
  }

  public final TextView getTitleTv()
  {
    return this.iDT;
  }

  public final boolean isPhoneNum()
  {
    AppMethodBeat.i(49444);
    boolean bool;
    if (this.Aih == null)
    {
      bool = false;
      AppMethodBeat.o(49444);
    }
    while (true)
    {
      return bool;
      bool = this.Aih.isPhoneNum();
      AppMethodBeat.o(49444);
    }
  }

  protected final void onAttachedToWindow()
  {
    AppMethodBeat.i(49425);
    super.onAttachedToWindow();
    AppMethodBeat.o(49425);
  }

  protected final void onDetachedFromWindow()
  {
    AppMethodBeat.i(49426);
    super.onDetachedFromWindow();
    AppMethodBeat.o(49426);
  }

  protected final void onFinishInflate()
  {
    AppMethodBeat.i(49427);
    super.onFinishInflate();
    dOR();
    if (getPrefilledTv() != null)
    {
      getPrefilledTv().setText(this.pIx);
      getPrefilledTv().setVisibility(this.pIy);
    }
    if (getInfoIv() != null)
    {
      getInfoIv().setImageResource(this.pIz);
      getInfoIv().setVisibility(this.pIA);
    }
    if (getTipsTv() != null)
    {
      getTipsTv().setText(this.pIB);
      getTipsTv().setVisibility(this.pIC);
    }
    Object localObject = getContext();
    if (this.Aih != null)
    {
      if (this.Aiq >= 0)
      {
        String str = e.QQ(this.Aiq);
        this.Aih.setTypeface(Typeface.createFromAsset(((Context)localObject).getAssets(), str));
      }
      if (this.Ain != -1)
        break label411;
      this.Aih.setHint(this.pID);
    }
    while (true)
    {
      this.Aih.setGravity(this.pIE);
      this.Aih.setTextColor(this.pIF);
      setText(this.pIG);
      b.a(this.Aih, this.Aio);
      this.Aih.setBackgroundResource(this.pIJ);
      this.Aih.setEnabled(this.pIK);
      this.Aih.setFocusable(this.pIM);
      this.Aih.setClickable(this.pIL);
      this.Aih.setHintTextColor(this.pIP);
      setImeOptions(this.pIO);
      setInputType(this.pIN);
      this.Aih.addTextChangedListener(new WalletFormView.1(this));
      this.Aih.setOnFocusChangeListener(this);
      try
      {
        if (!bo.gW(this.Air, 0))
        {
          localObject = TextView.class.getDeclaredField("mCursorDrawableRes");
          ((Field)localObject).setAccessible(true);
          ((Field)localObject).set(this.Aih, Integer.valueOf(this.Air));
        }
        cew();
        if (this.Aih != null)
        {
          if (this.pIN != 2)
            break label529;
          this.Aih.setKeyListener(new WalletFormView.3(this));
          if (this.pIH != -1)
            this.Aih.setFilters(new InputFilter[] { new InputFilter.LengthFilter(this.pIH) });
        }
        AppMethodBeat.o(49427);
        return;
        label411: localObject = new SpannableString(this.pID + "  ");
        ((SpannableString)localObject).setSpan(new d(this.Ain), 0, ((SpannableString)localObject).length() - 2, 33);
        ((SpannableString)localObject).setSpan(new AbsoluteSizeSpan((int)this.Aih.getTextSize(), false), ((SpannableString)localObject).length() - 2, ((SpannableString)localObject).length(), 33);
        this.Aih.setHint(new SpannedString((CharSequence)localObject));
      }
      catch (Exception localException)
      {
        while (true)
        {
          ab.e("MicroMsg.WalletFormView", "set textCursorDrawable fail!!");
          continue;
          label529: if (this.pIN == 4)
          {
            this.Aih.setKeyListener(new NumberKeyListener()
            {
              protected final char[] getAcceptedChars()
              {
                return new char[] { 49, 50, 51, 52, 53, 54, 55, 56, 57, 48, 120, 88 };
              }

              public final int getInputType()
              {
                return 1;
              }
            });
          }
          else if (this.pIN == 128)
          {
            this.Aih.setTransformationMethod(PasswordTransformationMethod.getInstance());
            this.Aih.setKeyListener(new WalletFormView.5(this));
            this.Aih.setRawInputType(18);
          }
          else if (this.pIN == 3)
          {
            this.Aih.setKeyListener(new WalletFormView.6(this));
          }
          else
          {
            this.Aih.setInputType(this.pIN);
          }
        }
      }
    }
  }

  public final void onFocusChange(View paramView, boolean paramBoolean)
  {
    AppMethodBeat.i(49456);
    if (this.pIq != null)
      this.pIq.onFocusChange(this, paramBoolean);
    if (this.Aii != null)
      this.Aii.hY(asa());
    if (!asa())
      if (this.iDT != null)
        this.iDT.setEnabled(false);
    while (true)
    {
      cew();
      AppMethodBeat.o(49456);
      return;
      if (this.iDT != null)
        this.iDT.setEnabled(true);
    }
  }

  public final boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    boolean bool = true;
    AppMethodBeat.i(49434);
    if ((this.Aij == null) || (!this.Aij.dOU()))
      if ((this.Aih != null) && (b(this.Aih, paramMotionEvent)) && (!this.Aih.isClickable()))
      {
        ab.d("MicroMsg.WalletFormView", "hy: click on content but content is not clickable. whole view perform click");
        AppMethodBeat.o(49434);
      }
    while (true)
    {
      return bool;
      if ((b(this.pIn, paramMotionEvent)) && (paramMotionEvent.getAction() == 1))
      {
        ab.d("MicroMsg.WalletFormView", "hy: click on info iv");
        cew();
        this.pIn.performClick();
        AppMethodBeat.o(49434);
      }
      else
      {
        bool = false;
        AppMethodBeat.o(49434);
        continue;
        AppMethodBeat.o(49434);
      }
    }
  }

  @SuppressLint({"WrongCall"})
  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(49433);
    if ((this.Aij == null) || (!this.Aij.dOT()))
      super.onMeasure(paramInt1, paramInt2);
    AppMethodBeat.o(49433);
  }

  public final void set3DesToView(String paramString)
  {
    AppMethodBeat.i(49457);
    if (this.Aih != null)
      this.Aih.set3DesEncrptData(paramString);
    AppMethodBeat.o(49457);
  }

  public final void set3DesValStr(String paramString)
  {
    AppMethodBeat.i(49415);
    if ((this.Aih != null) && ((this.Aik == null) || (!this.Aik.d(this, paramString))))
    {
      this.Aih.set3DesEncrptData(paramString);
      setSelection(getInputLength());
    }
    AppMethodBeat.o(49415);
  }

  public final void setBankcardTail(String paramString)
  {
    AppMethodBeat.i(49441);
    if (this.Aih != null)
      this.Aih.setBankcardTailNum(paramString);
    AppMethodBeat.o(49441);
  }

  public final void setContentClickable(boolean paramBoolean)
  {
    AppMethodBeat.i(49429);
    if (this.Aih != null)
      this.Aih.setClickable(paramBoolean);
    AppMethodBeat.o(49429);
  }

  public final void setContentEnabled(boolean paramBoolean)
  {
    AppMethodBeat.i(49431);
    if (this.Aih != null)
      this.Aih.setEnabled(paramBoolean);
    AppMethodBeat.o(49431);
  }

  public final void setContentFocusable(boolean paramBoolean)
  {
    AppMethodBeat.i(49430);
    if (this.Aih != null)
      this.Aih.setFocusable(paramBoolean);
    AppMethodBeat.o(49430);
  }

  public final void setContentTextColor(int paramInt)
  {
    AppMethodBeat.i(49422);
    if (this.Aih != null)
      this.Aih.setTextColor(paramInt);
    AppMethodBeat.o(49422);
  }

  @SuppressLint({"ResourceType"})
  public final void setContentTextColorRes(int paramInt)
  {
    AppMethodBeat.i(49421);
    this.pIF = paramInt;
    if (this.Aih != null)
      this.Aih.setTextColor(getResources().getColor(this.pIF));
    AppMethodBeat.o(49421);
  }

  public final void setEncryptType(int paramInt)
  {
    this.Aim = paramInt;
  }

  public final void setEventDelegate(a parama)
  {
    this.Aij = parama;
  }

  public final void setFilterChar(char[] paramArrayOfChar)
  {
  }

  public final void setFilters(InputFilter[] paramArrayOfInputFilter)
  {
    AppMethodBeat.i(49451);
    if (this.Aih != null)
      this.Aih.setFilters(paramArrayOfInputFilter);
    AppMethodBeat.o(49451);
  }

  public final void setHint(CharSequence paramCharSequence)
  {
    AppMethodBeat.i(49428);
    if (this.Aih != null)
      if (this.Ain == -1)
      {
        this.Aih.setHint(paramCharSequence);
        AppMethodBeat.o(49428);
      }
    while (true)
    {
      return;
      paramCharSequence = new SpannableString(paramCharSequence);
      paramCharSequence.setSpan(new AbsoluteSizeSpan(this.Ain, false), 0, paramCharSequence.length(), 33);
      this.Aih.setHint(new SpannedString(paramCharSequence));
      AppMethodBeat.o(49428);
    }
  }

  public final void setImeOptions(int paramInt)
  {
    AppMethodBeat.i(49417);
    if (this.Aih != null)
      this.Aih.setImeOptions(paramInt);
    AppMethodBeat.o(49417);
  }

  public final void setInputEnable(boolean paramBoolean)
  {
    AppMethodBeat.i(49420);
    if (this.Aih != null)
      this.Aih.setEnabled(paramBoolean);
    AppMethodBeat.o(49420);
  }

  public final void setInputType(int paramInt)
  {
    AppMethodBeat.i(49418);
    if (this.Aih != null)
      this.Aih.setInputType(paramInt);
    AppMethodBeat.o(49418);
  }

  public final void setIsSecretAnswer(boolean paramBoolean)
  {
    AppMethodBeat.i(49455);
    if (this.Aih != null)
      this.Aih.setIsSecurityAnswerFormat(paramBoolean);
    AppMethodBeat.o(49455);
  }

  public final void setKeyListener(KeyListener paramKeyListener)
  {
    AppMethodBeat.i(49446);
    if (this.Aih != null)
      this.Aih.setKeyListener(paramKeyListener);
    AppMethodBeat.o(49446);
  }

  public final void setLogicDelegate(com.tencent.mm.wallet_core.ui.formview.a.b paramb)
  {
    this.Aik = paramb;
  }

  public final void setMaxInputLength(int paramInt)
  {
    this.pIH = paramInt;
  }

  public final void setMinInputLength(int paramInt)
  {
    this.pII = paramInt;
  }

  public final void setOnClickListener(View.OnClickListener paramOnClickListener)
  {
    AppMethodBeat.i(49442);
    super.setOnClickListener(paramOnClickListener);
    AppMethodBeat.o(49442);
  }

  public final void setOnEditorActionListener(TextView.OnEditorActionListener paramOnEditorActionListener)
  {
    AppMethodBeat.i(49432);
    this.Aih.setOnEditorActionListener(paramOnEditorActionListener);
    AppMethodBeat.o(49432);
  }

  public final void setOnFocusChangeListener(View.OnFocusChangeListener paramOnFocusChangeListener)
  {
    this.pIq = paramOnFocusChangeListener;
  }

  public final void setOnInfoIvClickListener(View.OnClickListener paramOnClickListener)
  {
    AppMethodBeat.i(49443);
    this.pIr = paramOnClickListener;
    if (getInfoIv() != null)
      getInfoIv().setOnClickListener(this.pIr);
    AppMethodBeat.o(49443);
  }

  public final void setOnInputValidChangeListener(WalletFormView.a parama)
  {
    this.Aii = parama;
  }

  public final void setSelection(int paramInt)
  {
    AppMethodBeat.i(49438);
    if (this.Aih != null)
      this.Aih.setSelection(paramInt);
    AppMethodBeat.o(49438);
  }

  public final void setText(String paramString)
  {
    AppMethodBeat.i(49419);
    if ((this.Aih != null) && ((this.Aik == null) || (!this.Aik.c(this, paramString))))
    {
      this.Aih.setText(paramString);
      this.Aih.setSelection(getInputLength());
    }
    AppMethodBeat.o(49419);
  }

  public final void setTitleText(String paramString)
  {
    AppMethodBeat.i(49413);
    this.pIv = paramString;
    dOR();
    AppMethodBeat.o(49413);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.wallet_core.ui.formview.WalletFormView
 * JD-Core Version:    0.6.2
 */