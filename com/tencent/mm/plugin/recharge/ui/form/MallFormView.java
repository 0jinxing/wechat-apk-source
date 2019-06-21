package com.tencent.mm.plugin.recharge.ui.form;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.Editable;
import android.text.InputFilter;
import android.text.InputFilter.LengthFilter;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wxpay.a.a;
import com.tencent.mm.pluginsdk.ui.wallet.WalletIconImageView;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import junit.framework.Assert;

public final class MallFormView extends LinearLayout
  implements View.OnFocusChangeListener
{
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
  public boolean pIQ;
  private TextView pIl;
  public EditText pIm;
  private WalletIconImageView pIn;
  private TextView pIo;
  private MallFormView.a pIp;
  private View.OnFocusChangeListener pIq;
  private View.OnClickListener pIr;
  private a pIs;
  private b pIt;
  private int pIu;
  private String pIv;
  private int pIw;
  private String pIx;
  private int pIy;
  private int pIz;

  public MallFormView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, -1);
  }

  public MallFormView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(44377);
    this.iDT = null;
    this.pIl = null;
    this.pIm = null;
    this.pIn = null;
    this.pIo = null;
    this.pIp = null;
    this.pIq = null;
    this.pIr = null;
    this.pIs = null;
    this.pIt = null;
    this.pIu = -1;
    this.pIv = "";
    this.pIw = 0;
    this.pIx = "";
    this.pIy = 8;
    this.pIz = -1;
    this.pIA = 4;
    this.pIB = "";
    this.pIC = 8;
    this.pID = "";
    this.pIE = 19;
    this.pIF = 2131690316;
    this.pIG = "";
    this.pIH = 2147483647;
    this.pII = 1;
    this.pIJ = 2130839563;
    this.pIK = true;
    this.pIL = false;
    this.pIM = true;
    this.pIN = 1;
    this.pIO = 5;
    this.pIP = 2131690211;
    this.pIQ = true;
    paramAttributeSet = paramContext.obtainStyledAttributes(paramAttributeSet, a.a.MallFormAttrs, paramInt, 0);
    this.pIu = paramAttributeSet.getResourceId(2, this.pIu);
    paramInt = paramAttributeSet.getResourceId(3, 0);
    if (paramInt != 0)
      this.pIv = paramContext.getString(paramInt);
    this.pIz = paramAttributeSet.getResourceId(4, this.pIz);
    paramInt = paramAttributeSet.getResourceId(5, 0);
    if (paramInt != 0)
      this.pIB = paramContext.getString(paramInt);
    this.pIA = paramAttributeSet.getInteger(8, this.pIA);
    this.pIw = paramAttributeSet.getInteger(9, this.pIw);
    this.pIC = paramAttributeSet.getInteger(10, this.pIC);
    this.pIy = paramAttributeSet.getInteger(11, this.pIy);
    paramInt = paramAttributeSet.getResourceId(12, 0);
    if (paramInt != 0)
      this.pIx = paramContext.getString(paramInt);
    paramInt = paramAttributeSet.getResourceId(13, 0);
    if (paramInt != 0)
      this.pID = paramContext.getString(paramInt);
    this.pIE = paramAttributeSet.getInteger(14, this.pIE);
    this.pIF = paramAttributeSet.getColor(15, this.pIF);
    paramInt = paramAttributeSet.getResourceId(16, 0);
    if (paramInt != 0)
      this.pIG = paramContext.getString(paramInt);
    this.pIH = paramAttributeSet.getInteger(18, this.pIH);
    this.pII = paramAttributeSet.getInteger(19, this.pII);
    this.pIJ = paramAttributeSet.getResourceId(20, this.pIJ);
    this.pIK = paramAttributeSet.getBoolean(21, this.pIK);
    this.pIL = paramAttributeSet.getBoolean(23, this.pIL);
    this.pIM = paramAttributeSet.getBoolean(21, this.pIM);
    this.pIN = paramAttributeSet.getInteger(0, this.pIN);
    this.pIO = paramAttributeSet.getInteger(1, this.pIO);
    this.pIP = paramAttributeSet.getInteger(24, this.pIP);
    paramAttributeSet.recycle();
    if (this.pIu > 0)
      bool = true;
    Assert.assertTrue(bool);
    setOrientation(1);
    inflate(paramContext, this.pIu, this);
    this.iDT = ((TextView)findViewById(2131820644));
    this.pIl = ((TextView)findViewById(2131820642));
    this.pIm = ((EditText)findViewById(2131820640));
    this.pIn = ((WalletIconImageView)findViewById(2131820641));
    this.pIo = ((TextView)findViewById(2131820643));
    AppMethodBeat.o(44377);
  }

  private boolean b(View paramView, MotionEvent paramMotionEvent)
  {
    boolean bool = false;
    AppMethodBeat.i(44389);
    if ((paramView != null) && (paramView.getVisibility() == 0))
      if (dt(paramView).contains((int)paramMotionEvent.getX(), (int)paramMotionEvent.getY()))
      {
        bool = true;
        AppMethodBeat.o(44389);
      }
    while (true)
    {
      return bool;
      AppMethodBeat.o(44389);
      continue;
      AppMethodBeat.o(44389);
    }
  }

  private Rect dt(View paramView)
  {
    AppMethodBeat.i(44390);
    if (paramView != null)
    {
      Rect localRect = new Rect();
      paramView.getHitRect(localRect);
      paramView = l(paramView, localRect);
      AppMethodBeat.o(44390);
    }
    while (true)
    {
      return paramView;
      paramView = null;
      AppMethodBeat.o(44390);
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

  public final boolean asa()
  {
    boolean bool = false;
    AppMethodBeat.i(44398);
    int i;
    if (this.pIm != null)
      if (this.pIm.getText() == null)
      {
        i = 0;
        if ((i <= this.pIH) && (i >= this.pII))
          break label67;
        AppMethodBeat.o(44398);
      }
    while (true)
    {
      return bool;
      i = this.pIm.getText().length();
      break;
      label67: if (this.pIt != null)
      {
        bool = this.pIt.a(this);
        AppMethodBeat.o(44398);
      }
      else
      {
        AppMethodBeat.o(44398);
        bool = true;
        continue;
        ab.e("MicroMsg.WalletFormView", "hy: no content edit text. true as default");
        AppMethodBeat.o(44398);
        bool = true;
      }
    }
  }

  public final void cew()
  {
    AppMethodBeat.i(44381);
    if ((this.pIn != null) && (!bo.isNullOrNil(getText())) && (this.pIm != null) && (this.pIm.isEnabled()) && (this.pIm.isClickable()) && (this.pIm.isFocusable()) && (this.pIm.isFocused()))
    {
      this.pIn.setToClearState(new MallFormView.2(this));
      AppMethodBeat.o(44381);
    }
    while (true)
    {
      return;
      if (this.pIn != null)
      {
        this.pIn.dlG();
        AppMethodBeat.o(44381);
      }
      else
      {
        ab.v("MicroMsg.WalletFormView", "hy: no info iv");
        AppMethodBeat.o(44381);
      }
    }
  }

  public final void cex()
  {
    AppMethodBeat.i(44391);
    ab.d("MicroMsg.WalletFormView", "shouldClearFocus: %s", new Object[] { Boolean.valueOf(this.pIQ) });
    if (this.pIQ)
    {
      getContentEditText().clearFocus();
      AppMethodBeat.o(44391);
    }
    while (true)
    {
      return;
      this.pIQ = true;
      AppMethodBeat.o(44391);
    }
  }

  public final void cey()
  {
    AppMethodBeat.i(44399);
    if (this.pIm != null)
      this.pIm.setText("");
    AppMethodBeat.o(44399);
  }

  public final EditText getContentEditText()
  {
    return this.pIm;
  }

  public final a getEventDelegate()
  {
    return this.pIs;
  }

  public final WalletIconImageView getInfoIv()
  {
    return this.pIn;
  }

  public final int getInputLength()
  {
    AppMethodBeat.i(44401);
    int i;
    if (this.pIm != null)
    {
      i = this.pIm.getText().length();
      AppMethodBeat.o(44401);
    }
    while (true)
    {
      return i;
      i = 0;
      AppMethodBeat.o(44401);
    }
  }

  public final MallFormView.a getInputValidChangeListener()
  {
    return this.pIp;
  }

  public final KeyListener getKeyListener()
  {
    AppMethodBeat.i(44394);
    KeyListener localKeyListener;
    if (this.pIm != null)
    {
      localKeyListener = this.pIm.getKeyListener();
      AppMethodBeat.o(44394);
    }
    while (true)
    {
      return localKeyListener;
      ab.w("MicroMsg.WalletFormView", "hy: no content et");
      localKeyListener = null;
      AppMethodBeat.o(44394);
    }
  }

  public final b getLogicDelegate()
  {
    return this.pIt;
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
    AppMethodBeat.i(44393);
    String str;
    if (this.pIm != null)
    {
      str = this.pIm.getText().toString();
      if ((this.pIt != null) && (this.pIt.cev()))
      {
        str = this.pIt.VG(str);
        AppMethodBeat.o(44393);
      }
    }
    while (true)
    {
      return str;
      AppMethodBeat.o(44393);
      continue;
      ab.e("MicroMsg.WalletFormView", "hy: no content et. return nil");
      str = "";
      AppMethodBeat.o(44393);
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

  protected final void onAttachedToWindow()
  {
    AppMethodBeat.i(44382);
    super.onAttachedToWindow();
    AppMethodBeat.o(44382);
  }

  protected final void onDetachedFromWindow()
  {
    AppMethodBeat.i(44383);
    super.onDetachedFromWindow();
    AppMethodBeat.o(44383);
  }

  protected final void onFinishInflate()
  {
    AppMethodBeat.i(44384);
    super.onFinishInflate();
    if (getTitleTv() != null)
    {
      getTitleTv().setText(this.pIv);
      getTitleTv().setVisibility(this.pIw);
    }
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
    getContext();
    if (this.pIm != null)
    {
      this.pIm.setHint(this.pID);
      this.pIm.setGravity(this.pIE);
      this.pIm.setTextColor(this.pIF);
      setText(this.pIG);
      this.pIm.setBackgroundResource(this.pIJ);
      this.pIm.setEnabled(this.pIK);
      this.pIm.setFocusable(this.pIM);
      this.pIm.setClickable(this.pIL);
      this.pIm.setHintTextColor(this.pIP);
      setImeOptions(this.pIO);
      setInputType(this.pIN);
      this.pIm.addTextChangedListener(new MallFormView.1(this));
      this.pIm.setOnFocusChangeListener(this);
    }
    cew();
    if (this.pIm != null)
    {
      if (this.pIN != 2)
        break label347;
      this.pIm.setKeyListener(new NumberKeyListener()
      {
        protected final char[] getAcceptedChars()
        {
          return new char[] { 49, 50, 51, 52, 53, 54, 55, 56, 57, 48 };
        }

        public final int getInputType()
        {
          return 3;
        }
      });
    }
    while (true)
    {
      if (this.pIH != -1)
        this.pIm.setFilters(new InputFilter[] { new InputFilter.LengthFilter(this.pIH) });
      AppMethodBeat.o(44384);
      return;
      label347: if (this.pIN == 4)
      {
        this.pIm.setKeyListener(new MallFormView.4(this));
      }
      else if (this.pIN == 128)
      {
        this.pIm.setTransformationMethod(PasswordTransformationMethod.getInstance());
        this.pIm.setKeyListener(new MallFormView.5(this));
        this.pIm.setRawInputType(18);
      }
      else if (this.pIN == 3)
      {
        this.pIm.setKeyListener(new MallFormView.6(this));
      }
      else
      {
        this.pIm.setInputType(this.pIN);
      }
    }
  }

  public final void onFocusChange(View paramView, boolean paramBoolean)
  {
    AppMethodBeat.i(44402);
    if (this.pIq != null)
      this.pIq.onFocusChange(this, paramBoolean);
    if (!asa())
      if (this.iDT != null)
        this.iDT.setEnabled(false);
    while (true)
    {
      cew();
      AppMethodBeat.o(44402);
      return;
      if (this.iDT != null)
        this.iDT.setEnabled(true);
    }
  }

  public final boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    boolean bool = true;
    AppMethodBeat.i(44388);
    if ((this.pIs == null) || (!this.pIs.ceu()))
      if ((this.pIm != null) && (b(this.pIm, paramMotionEvent)) && (!this.pIm.isClickable()))
      {
        ab.d("MicroMsg.WalletFormView", "hy: click on content but content is not clickable. whole view perform click");
        AppMethodBeat.o(44388);
      }
    while (true)
    {
      return bool;
      if ((b(this.pIn, paramMotionEvent)) && (paramMotionEvent.getAction() == 1))
      {
        ab.d("MicroMsg.WalletFormView", "hy: click on info iv");
        this.pIn.performClick();
        AppMethodBeat.o(44388);
      }
      else
      {
        bool = false;
        AppMethodBeat.o(44388);
        continue;
        AppMethodBeat.o(44388);
      }
    }
  }

  @SuppressLint({"WrongCall"})
  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(44387);
    if ((this.pIs == null) || (!this.pIs.cet()))
      super.onMeasure(paramInt1, paramInt2);
    AppMethodBeat.o(44387);
  }

  public final void setEventDelegate(a parama)
  {
    this.pIs = parama;
  }

  public final void setFilters(InputFilter[] paramArrayOfInputFilter)
  {
    AppMethodBeat.i(44400);
    if (this.pIm != null)
      this.pIm.setFilters(paramArrayOfInputFilter);
    AppMethodBeat.o(44400);
  }

  public final void setHint(String paramString)
  {
    AppMethodBeat.i(44385);
    if (this.pIm != null)
      this.pIm.setHint(paramString);
    AppMethodBeat.o(44385);
  }

  public final void setImeOptions(int paramInt)
  {
    AppMethodBeat.i(44378);
    if (this.pIm != null)
      this.pIm.setImeOptions(paramInt);
    AppMethodBeat.o(44378);
  }

  public final void setInputType(int paramInt)
  {
    AppMethodBeat.i(44379);
    if (this.pIm != null)
      this.pIm.setInputType(paramInt);
    AppMethodBeat.o(44379);
  }

  public final void setKeyListener(KeyListener paramKeyListener)
  {
    AppMethodBeat.i(44397);
    if (this.pIm != null)
      this.pIm.setKeyListener(paramKeyListener);
    AppMethodBeat.o(44397);
  }

  public final void setLogicDelegate(b paramb)
  {
    this.pIt = paramb;
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
    AppMethodBeat.i(44395);
    super.setOnClickListener(paramOnClickListener);
    AppMethodBeat.o(44395);
  }

  public final void setOnEditorActionListener(TextView.OnEditorActionListener paramOnEditorActionListener)
  {
    AppMethodBeat.i(44386);
    this.pIm.setOnEditorActionListener(paramOnEditorActionListener);
    AppMethodBeat.o(44386);
  }

  public final void setOnFocusChangeListener(View.OnFocusChangeListener paramOnFocusChangeListener)
  {
    this.pIq = paramOnFocusChangeListener;
  }

  public final void setOnInfoIvClickListener(View.OnClickListener paramOnClickListener)
  {
    AppMethodBeat.i(44396);
    this.pIr = paramOnClickListener;
    if (getInfoIv() != null)
      getInfoIv().setOnClickListener(this.pIr);
    AppMethodBeat.o(44396);
  }

  public final void setOnInputValidChangeListener(MallFormView.a parama)
  {
    this.pIp = parama;
  }

  public final void setSelection(int paramInt)
  {
    AppMethodBeat.i(44392);
    if (this.pIm != null)
      this.pIm.setSelection(paramInt);
    AppMethodBeat.o(44392);
  }

  public final void setText(String paramString)
  {
    AppMethodBeat.i(44380);
    if (this.pIm != null)
    {
      this.pIm.setText(paramString);
      this.pIm.setSelection(getInputLength());
    }
    AppMethodBeat.o(44380);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.recharge.ui.form.MallFormView
 * JD-Core Version:    0.6.2
 */