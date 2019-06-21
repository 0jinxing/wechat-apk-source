package com.tencent.mm.pluginsdk.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.View.BaseSavedState;
import android.view.View.OnFocusChangeListener;
import android.widget.EditText;
import android.widget.TextView.SavedState;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cb.g;
import com.tencent.mm.sdk.platformtools.ab;

public class MMPhoneNumberEditText extends EditText
{
  public String jjo;
  private View.OnFocusChangeListener pIq;
  int uQn;
  public boolean vhQ;
  public Drawable vhR;
  private MMPhoneNumberEditText.a vhS;
  public boolean vhT;
  private boolean vhU;

  public MMPhoneNumberEditText(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(27495);
    this.jjo = "";
    this.vhQ = false;
    this.vhU = false;
    this.uQn = 0;
    this.pIq = null;
    init();
    AppMethodBeat.o(27495);
  }

  public MMPhoneNumberEditText(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(27496);
    this.jjo = "";
    this.vhQ = false;
    this.vhU = false;
    this.uQn = 0;
    this.pIq = null;
    init();
    AppMethodBeat.o(27496);
  }

  private void ajp(String paramString)
  {
    AppMethodBeat.i(27500);
    int i = getSelectionStart();
    g localg = g.dqQ();
    getContext();
    setText(localg.b(paramString, getTextSize()));
    int j = getText().length() - paramString.length();
    if (j > 0)
    {
      j = i + j;
      if (j <= getText().length())
        setSelection(j);
      AppMethodBeat.o(27500);
    }
    while (true)
    {
      return;
      setSelection(i);
      AppMethodBeat.o(27500);
    }
  }

  private void dja()
  {
    AppMethodBeat.i(27501);
    if (getText().toString().equals(""))
    {
      djc();
      AppMethodBeat.o(27501);
    }
    while (true)
    {
      return;
      djb();
      AppMethodBeat.o(27501);
    }
  }

  private void djb()
  {
    AppMethodBeat.i(27502);
    setCompoundDrawables(getCompoundDrawables()[0], getCompoundDrawables()[1], this.vhR, getCompoundDrawables()[3]);
    AppMethodBeat.o(27502);
  }

  private void djc()
  {
    AppMethodBeat.i(27503);
    setCompoundDrawables(getCompoundDrawables()[0], getCompoundDrawables()[1], null, getCompoundDrawables()[3]);
    AppMethodBeat.o(27503);
  }

  private void init()
  {
    AppMethodBeat.i(27498);
    this.vhR = getResources().getDrawable(2130839158);
    this.vhR.setBounds(0, 0, this.vhR.getIntrinsicWidth(), this.vhR.getIntrinsicHeight());
    ab.d("MicroMsg.MMClearEditText", "imgX width %d height %d", new Object[] { Integer.valueOf(this.vhR.getIntrinsicWidth()), Integer.valueOf(this.vhR.getIntrinsicHeight()) });
    dja();
    setHeight(this.vhR.getIntrinsicHeight() + getResources().getDimensionPixelSize(2131427815) * 5);
    clearFocus();
    setOnTouchListener(new MMPhoneNumberEditText.1(this));
    addTextChangedListener(new MMPhoneNumberEditText.2(this));
    super.setOnFocusChangeListener(new MMPhoneNumberEditText.3(this));
    AppMethodBeat.o(27498);
  }

  public final void diZ()
  {
    AppMethodBeat.i(27497);
    this.vhT = true;
    this.vhR = getResources().getDrawable(2131231506);
    this.vhR.setBounds(0, 0, this.vhR.getIntrinsicWidth(), this.vhR.getIntrinsicHeight());
    setFocusable(false);
    djb();
    AppMethodBeat.o(27497);
  }

  public void onRestoreInstanceState(Parcelable paramParcelable)
  {
    AppMethodBeat.i(27504);
    if (!(paramParcelable instanceof TextView.SavedState))
    {
      super.onRestoreInstanceState(paramParcelable);
      AppMethodBeat.o(27504);
    }
    while (true)
    {
      return;
      if (!this.vhQ)
        paramParcelable = View.BaseSavedState.EMPTY_STATE;
      super.onRestoreInstanceState(paramParcelable);
      AppMethodBeat.o(27504);
    }
  }

  public boolean onTextContextMenuItem(int paramInt)
  {
    AppMethodBeat.i(27499);
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
      AppMethodBeat.o(27499);
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

  public void setCallback(MMPhoneNumberEditText.a parama)
  {
    this.vhS = parama;
  }

  public void setOnFocusChangeListener(View.OnFocusChangeListener paramOnFocusChangeListener)
  {
    this.pIq = paramOnFocusChangeListener;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.MMPhoneNumberEditText
 * JD-Core Version:    0.6.2
 */