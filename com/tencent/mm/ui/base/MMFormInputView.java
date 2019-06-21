package com.tencent.mm.ui.base;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View.OnFocusChangeListener;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ad.a.a;
import com.tencent.mm.sdk.platformtools.ab;

public class MMFormInputView extends LinearLayout
{
  private TextView gnB;
  private int layout;
  private Context mContext;
  private View.OnFocusChangeListener mLV;
  private EditText pwu;
  private int vaH;
  private int yuj;
  private int[] yuk;

  public MMFormInputView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, -1);
  }

  @TargetApi(11)
  public MMFormInputView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(106557);
    this.mContext = null;
    this.vaH = -1;
    this.yuj = -1;
    this.layout = -1;
    this.mLV = null;
    paramAttributeSet = paramContext.obtainStyledAttributes(paramAttributeSet, a.a.FormItemView, paramInt, 0);
    this.yuj = paramAttributeSet.getResourceId(2, -1);
    this.vaH = paramAttributeSet.getResourceId(1, -1);
    this.layout = paramAttributeSet.getResourceId(0, this.layout);
    paramAttributeSet.recycle();
    inflate(paramContext, this.layout, this);
    this.mContext = paramContext;
    AppMethodBeat.o(106557);
  }

  public final void addTextChangedListener(TextWatcher paramTextWatcher)
  {
    AppMethodBeat.i(106566);
    if ((paramTextWatcher != null) && (this.pwu != null))
    {
      this.pwu.addTextChangedListener(paramTextWatcher);
      AppMethodBeat.o(106566);
    }
    while (true)
    {
      return;
      ab.w("MicroMsg.MMFormInputView", "watcher : %s, contentET : %s", new Object[] { paramTextWatcher, this.pwu });
      AppMethodBeat.o(106566);
    }
  }

  public EditText getContentEditText()
  {
    return this.pwu;
  }

  public Editable getText()
  {
    AppMethodBeat.i(106567);
    Editable localEditable;
    if (this.pwu != null)
    {
      localEditable = this.pwu.getText();
      AppMethodBeat.o(106567);
    }
    while (true)
    {
      return localEditable;
      ab.e("MicroMsg.MMFormInputView", "contentET is null!");
      localEditable = null;
      AppMethodBeat.o(106567);
    }
  }

  public TextView getTitleTextView()
  {
    return this.gnB;
  }

  public void onFinishInflate()
  {
    AppMethodBeat.i(106558);
    this.gnB = ((TextView)findViewById(2131820678));
    this.pwu = ((EditText)findViewById(2131820980));
    if ((this.gnB == null) || (this.pwu == null))
      ab.w("MicroMsg.MMFormInputView", "titleTV : %s, contentET : %s", new Object[] { this.gnB, this.pwu });
    while (true)
    {
      if (this.pwu != null)
      {
        MMFormInputView.1 local1 = new MMFormInputView.1(this);
        this.pwu.setOnFocusChangeListener(local1);
      }
      AppMethodBeat.o(106558);
      return;
      if (this.vaH != -1)
        this.gnB.setText(this.vaH);
      if (this.yuj != -1)
        this.pwu.setHint(this.yuj);
    }
  }

  public void setFocusListener(View.OnFocusChangeListener paramOnFocusChangeListener)
  {
    this.mLV = paramOnFocusChangeListener;
  }

  public void setHint(int paramInt)
  {
    AppMethodBeat.i(106562);
    if (this.pwu != null)
    {
      this.pwu.setHint(paramInt);
      AppMethodBeat.o(106562);
    }
    while (true)
    {
      return;
      ab.e("MicroMsg.MMFormInputView", "contentET is null!");
      AppMethodBeat.o(106562);
    }
  }

  public void setHint(String paramString)
  {
    AppMethodBeat.i(106560);
    if (this.pwu != null)
    {
      this.pwu.setHint(paramString);
      AppMethodBeat.o(106560);
    }
    while (true)
    {
      return;
      ab.e("MicroMsg.MMFormInputView", "contentET is null!");
      AppMethodBeat.o(106560);
    }
  }

  public void setImeOption(int paramInt)
  {
    AppMethodBeat.i(106564);
    if (this.pwu != null)
    {
      this.pwu.setImeOptions(paramInt);
      AppMethodBeat.o(106564);
    }
    while (true)
    {
      return;
      ab.e("MicroMsg.MMFormInputView", "contentET is null!");
      AppMethodBeat.o(106564);
    }
  }

  public void setInputType(int paramInt)
  {
    AppMethodBeat.i(106565);
    if (this.pwu != null)
    {
      this.pwu.setInputType(paramInt);
      AppMethodBeat.o(106565);
    }
    while (true)
    {
      return;
      ab.e("MicroMsg.MMFormInputView", "contentET is null!");
      AppMethodBeat.o(106565);
    }
  }

  public void setText(String paramString)
  {
    AppMethodBeat.i(106563);
    if (this.pwu != null)
    {
      this.pwu.setText(paramString);
      AppMethodBeat.o(106563);
    }
    while (true)
    {
      return;
      ab.e("MicroMsg.MMFormInputView", "contentET is null!");
      AppMethodBeat.o(106563);
    }
  }

  public void setTitle(int paramInt)
  {
    AppMethodBeat.i(106561);
    if (this.gnB != null)
    {
      this.gnB.setText(paramInt);
      AppMethodBeat.o(106561);
    }
    while (true)
    {
      return;
      ab.e("MicroMsg.MMFormInputView", "titleTV is null!");
      AppMethodBeat.o(106561);
    }
  }

  public void setTitle(String paramString)
  {
    AppMethodBeat.i(106559);
    if (this.gnB != null)
    {
      this.gnB.setText(paramString);
      AppMethodBeat.o(106559);
    }
    while (true)
    {
      return;
      ab.e("MicroMsg.MMFormInputView", "titleTV is null!");
      AppMethodBeat.o(106559);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.MMFormInputView
 * JD-Core Version:    0.6.2
 */