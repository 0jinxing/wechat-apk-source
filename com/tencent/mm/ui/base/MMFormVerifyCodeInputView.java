package com.tencent.mm.ui.base;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ad.a.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap;

public class MMFormVerifyCodeInputView extends LinearLayout
{
  private ap fNJ;
  private Button gGm;
  private TextView gnB;
  private int layout;
  private Context mContext;
  private View.OnFocusChangeListener mLV;
  private EditText pwu;
  private int vaH;
  private int yuj;
  private int[] yuk;
  private TextView yut;
  private int yuu;
  private int yuv;
  private int yuw;
  private View.OnClickListener yux;

  public MMFormVerifyCodeInputView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, -1);
  }

  @TargetApi(11)
  public MMFormVerifyCodeInputView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(106595);
    this.mContext = null;
    this.vaH = -1;
    this.yuj = -1;
    this.yuu = -1;
    this.layout = -1;
    this.yuv = 60;
    this.yuw = this.yuv;
    this.mLV = null;
    this.yux = null;
    paramAttributeSet = paramContext.obtainStyledAttributes(paramAttributeSet, a.a.FormItemView, paramInt, 0);
    this.yuj = paramAttributeSet.getResourceId(2, -1);
    this.vaH = paramAttributeSet.getResourceId(1, -1);
    this.yuu = paramAttributeSet.getResourceId(3, -1);
    this.layout = paramAttributeSet.getResourceId(0, this.layout);
    paramAttributeSet.recycle();
    inflate(paramContext, this.layout, this);
    this.mContext = paramContext;
    AppMethodBeat.o(106595);
  }

  public final void addTextChangedListener(TextWatcher paramTextWatcher)
  {
    AppMethodBeat.i(106608);
    if (this.pwu != null)
    {
      this.pwu.addTextChangedListener(paramTextWatcher);
      AppMethodBeat.o(106608);
    }
    while (true)
    {
      return;
      ab.w("MicroMsg.MMFormVerifyCodeInputView", "watcher : %s, contentET : %s", new Object[] { paramTextWatcher, this.pwu });
      AppMethodBeat.o(106608);
    }
  }

  public final void dzH()
  {
    AppMethodBeat.i(106605);
    this.gGm.setVisibility(8);
    this.yut.setVisibility(0);
    this.yut.setText(getContext().getString(2131301471, new Object[] { Integer.valueOf(this.yuv) }));
    if (this.fNJ != null)
    {
      this.fNJ.stopTimer();
      this.fNJ.ae(1000L, 1000L);
      AppMethodBeat.o(106605);
    }
    while (true)
    {
      return;
      if (getContext() != null)
      {
        this.fNJ = new ap(getContext().getMainLooper(), new MMFormVerifyCodeInputView.3(this), true);
        this.fNJ.ae(1000L, 1000L);
        AppMethodBeat.o(106605);
      }
      else
      {
        if (this.fNJ != null)
          this.fNJ.stopTimer();
        AppMethodBeat.o(106605);
      }
    }
  }

  public EditText getContentEditText()
  {
    return this.pwu;
  }

  public Editable getText()
  {
    AppMethodBeat.i(106609);
    Editable localEditable;
    if (this.pwu != null)
    {
      localEditable = this.pwu.getText();
      AppMethodBeat.o(106609);
    }
    while (true)
    {
      return localEditable;
      ab.e("MicroMsg.MMFormVerifyCodeInputView", "contentET is null!");
      localEditable = null;
      AppMethodBeat.o(106609);
    }
  }

  public TextView getTitleTextView()
  {
    return this.gnB;
  }

  public void onFinishInflate()
  {
    AppMethodBeat.i(106596);
    super.onFinishInflate();
    this.gnB = ((TextView)findViewById(2131820678));
    this.pwu = ((EditText)findViewById(2131820980));
    this.yut = ((TextView)findViewById(2131826000));
    this.gGm = ((Button)findViewById(2131825999));
    if ((this.gnB == null) || (this.pwu == null) || (this.yut == null) || (this.gGm == null))
      ab.w("MicroMsg.MMFormVerifyCodeInputView", "titleTV : %s, contentET : %s, timerTv: %s, sendSmsBtn: %s", new Object[] { this.gnB, this.pwu, this.yut, this.gGm });
    while (true)
    {
      if (this.pwu != null)
      {
        MMFormVerifyCodeInputView.1 local1 = new MMFormVerifyCodeInputView.1(this);
        this.pwu.setOnFocusChangeListener(local1);
      }
      if (this.gGm != null)
        this.gGm.setOnClickListener(new MMFormVerifyCodeInputView.2(this));
      AppMethodBeat.o(106596);
      return;
      if (this.vaH != -1)
        this.gnB.setText(this.vaH);
      if (this.yuj != -1)
        this.pwu.setHint(this.yuj);
      if (this.yuu != -1)
        this.gGm.setText(this.yuu);
    }
  }

  public final void reset()
  {
    AppMethodBeat.i(106606);
    if (this.fNJ != null)
      this.fNJ.stopTimer();
    this.pwu.setText("");
    this.yut.setVisibility(8);
    this.yuw = this.yuv;
    this.gGm.setVisibility(0);
    AppMethodBeat.o(106606);
  }

  public void setFocusListener(View.OnFocusChangeListener paramOnFocusChangeListener)
  {
    this.mLV = paramOnFocusChangeListener;
  }

  public void setHint(int paramInt)
  {
    AppMethodBeat.i(106600);
    if (this.pwu != null)
    {
      this.pwu.setHint(paramInt);
      AppMethodBeat.o(106600);
    }
    while (true)
    {
      return;
      ab.e("MicroMsg.MMFormVerifyCodeInputView", "contentET is null!");
      AppMethodBeat.o(106600);
    }
  }

  public void setHint(String paramString)
  {
    AppMethodBeat.i(106598);
    if (this.pwu != null)
    {
      this.pwu.setHint(paramString);
      AppMethodBeat.o(106598);
    }
    while (true)
    {
      return;
      ab.e("MicroMsg.MMFormVerifyCodeInputView", "contentET is null!");
      AppMethodBeat.o(106598);
    }
  }

  public void setImeOption(int paramInt)
  {
    AppMethodBeat.i(106602);
    if (this.pwu != null)
    {
      this.pwu.setImeOptions(paramInt);
      AppMethodBeat.o(106602);
    }
    while (true)
    {
      return;
      ab.e("MicroMsg.MMFormVerifyCodeInputView", "contentET is null!");
      AppMethodBeat.o(106602);
    }
  }

  public void setInputType(int paramInt)
  {
    AppMethodBeat.i(106607);
    if (this.pwu != null)
    {
      this.pwu.setInputType(paramInt);
      AppMethodBeat.o(106607);
    }
    while (true)
    {
      return;
      ab.e("MicroMsg.MMFormVerifyCodeInputView", "contentET is null!");
      AppMethodBeat.o(106607);
    }
  }

  public void setSendSmsBtnClickListener(View.OnClickListener paramOnClickListener)
  {
    this.yux = paramOnClickListener;
  }

  public void setSmsBtnText(int paramInt)
  {
    AppMethodBeat.i(106603);
    if (this.gGm != null)
    {
      this.gGm.setText(paramInt);
      AppMethodBeat.o(106603);
    }
    while (true)
    {
      return;
      ab.e("MicroMsg.MMFormVerifyCodeInputView", "sendSmsBtn is null!");
      AppMethodBeat.o(106603);
    }
  }

  public void setSmsBtnText(String paramString)
  {
    AppMethodBeat.i(106604);
    if (this.gGm != null)
    {
      this.gGm.setText(paramString);
      AppMethodBeat.o(106604);
    }
    while (true)
    {
      return;
      ab.e("MicroMsg.MMFormVerifyCodeInputView", "sendSmsBtn is null!");
      AppMethodBeat.o(106604);
    }
  }

  public void setText(String paramString)
  {
    AppMethodBeat.i(106601);
    if (this.pwu != null)
    {
      this.pwu.setText(paramString);
      AppMethodBeat.o(106601);
    }
    while (true)
    {
      return;
      ab.e("MicroMsg.MMFormVerifyCodeInputView", "contentET is null!");
      AppMethodBeat.o(106601);
    }
  }

  public void setTitle(int paramInt)
  {
    AppMethodBeat.i(106599);
    if (this.gnB != null)
    {
      this.gnB.setText(paramInt);
      AppMethodBeat.o(106599);
    }
    while (true)
    {
      return;
      ab.e("MicroMsg.MMFormVerifyCodeInputView", "titleTV is null!");
      AppMethodBeat.o(106599);
    }
  }

  public void setTitle(String paramString)
  {
    AppMethodBeat.i(106597);
    if (this.gnB != null)
    {
      this.gnB.setText(paramString);
      AppMethodBeat.o(106597);
    }
    while (true)
    {
      return;
      ab.e("MicroMsg.MMFormVerifyCodeInputView", "titleTV is null!");
      AppMethodBeat.o(106597);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.MMFormVerifyCodeInputView
 * JD-Core Version:    0.6.2
 */