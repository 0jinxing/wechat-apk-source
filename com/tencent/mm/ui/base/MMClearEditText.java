package com.tencent.mm.ui.base;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View.BaseSavedState;
import android.view.View.OnFocusChangeListener;
import android.view.View.OnTouchListener;
import android.widget.EditText;
import android.widget.TextView.SavedState;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.e.c.b;

public class MMClearEditText extends EditText
{
  private View.OnTouchListener jZu;
  public String jjo;
  private View.OnFocusChangeListener pIq;
  int uQn;
  public boolean vhQ;
  final Drawable vhR;
  private boolean ytV;

  public MMClearEditText(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(106507);
    this.jjo = "";
    this.vhQ = false;
    this.vhR = getResources().getDrawable(2130839158);
    this.uQn = 0;
    this.pIq = null;
    this.jZu = new MMClearEditText.3(this);
    this.ytV = false;
    dzF();
    AppMethodBeat.o(106507);
  }

  public MMClearEditText(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(106508);
    this.jjo = "";
    this.vhQ = false;
    this.vhR = getResources().getDrawable(2130839158);
    this.uQn = 0;
    this.pIq = null;
    this.jZu = new MMClearEditText.3(this);
    this.ytV = false;
    dzF();
    AppMethodBeat.o(106508);
  }

  private void ajp(String paramString)
  {
    AppMethodBeat.i(106511);
    int i = getSelectionStart();
    setText(b.c(getContext(), paramString, getTextSize()));
    int j = getText().length() - paramString.length();
    if (j > 0)
    {
      i += j;
      if (i <= getText().length())
        setSelection(i);
      AppMethodBeat.o(106511);
    }
    while (true)
    {
      return;
      setSelection(i);
      AppMethodBeat.o(106511);
    }
  }

  private void dja()
  {
    AppMethodBeat.i(106512);
    if ((getText().toString().equals("")) || (!isFocused()))
    {
      djc();
      AppMethodBeat.o(106512);
    }
    while (true)
    {
      return;
      djb();
      AppMethodBeat.o(106512);
    }
  }

  private void djb()
  {
    AppMethodBeat.i(106513);
    if (!this.ytV)
      setCompoundDrawables(getCompoundDrawables()[0], getCompoundDrawables()[1], this.vhR, getCompoundDrawables()[3]);
    AppMethodBeat.o(106513);
  }

  private void djc()
  {
    AppMethodBeat.i(106514);
    setCompoundDrawables(getCompoundDrawables()[0], getCompoundDrawables()[1], null, getCompoundDrawables()[3]);
    AppMethodBeat.o(106514);
  }

  private void dzF()
  {
    AppMethodBeat.i(106509);
    this.vhR.setBounds(0, 0, this.vhR.getIntrinsicWidth(), this.vhR.getIntrinsicHeight());
    ab.d("MicroMsg.MMClearEditText", "imgX width %d height %d", new Object[] { Integer.valueOf(this.vhR.getIntrinsicWidth()), Integer.valueOf(this.vhR.getIntrinsicHeight()) });
    dja();
    setHeight(this.vhR.getIntrinsicHeight() + getResources().getDimensionPixelSize(2131427815) * 5);
    setOnTouchListener(this.jZu);
    addTextChangedListener(new TextWatcher()
    {
      public final void afterTextChanged(Editable paramAnonymousEditable)
      {
      }

      public final void beforeTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
      }

      public final void onTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        AppMethodBeat.i(106504);
        MMClearEditText.a(MMClearEditText.this);
        AppMethodBeat.o(106504);
      }
    });
    super.setOnFocusChangeListener(new MMClearEditText.2(this));
    AppMethodBeat.o(106509);
  }

  public View.OnTouchListener getDefaultOnTouchListener()
  {
    return this.jZu;
  }

  public void onRestoreInstanceState(Parcelable paramParcelable)
  {
    AppMethodBeat.i(106515);
    if (!(paramParcelable instanceof TextView.SavedState))
    {
      super.onRestoreInstanceState(paramParcelable);
      AppMethodBeat.o(106515);
    }
    while (true)
    {
      return;
      if (!this.vhQ)
        paramParcelable = View.BaseSavedState.EMPTY_STATE;
      super.onRestoreInstanceState(paramParcelable);
      AppMethodBeat.o(106515);
    }
  }

  public boolean onTextContextMenuItem(int paramInt)
  {
    AppMethodBeat.i(106510);
    boolean bool = super.onTextContextMenuItem(paramInt);
    String str;
    if (paramInt == 16908322)
    {
      this.uQn = 0;
      str = getText().toString();
    }
    try
    {
      ajp(str);
      AppMethodBeat.o(106510);
      return bool;
    }
    catch (IndexOutOfBoundsException localIndexOutOfBoundsException)
    {
      while (true)
      {
        ab.e("MicroMsg.MMClearEditText", "!!MMClearEditText Exception %d", new Object[] { Integer.valueOf(this.uQn) });
        if (this.uQn < 3)
        {
          this.uQn += 1;
          ajp(" ".concat(String.valueOf(str)));
        }
        else
        {
          ab.e("MicroMsg.MMClearEditText", "!!MMClearEditText, IndexOutOfBoundsException cannot fix");
        }
      }
    }
  }

  public void setOnFocusChangeListener(View.OnFocusChangeListener paramOnFocusChangeListener)
  {
    this.pIq = paramOnFocusChangeListener;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.MMClearEditText
 * JD-Core Version:    0.6.2
 */