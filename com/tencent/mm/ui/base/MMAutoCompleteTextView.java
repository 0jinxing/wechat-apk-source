package com.tencent.mm.ui.base;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.widget.AutoCompleteTextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;

public class MMAutoCompleteTextView extends AutoCompleteTextView
{
  final Drawable vhR;
  private a ytE;

  public MMAutoCompleteTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(106476);
    this.vhR = getResources().getDrawable(2130839158);
    this.vhR.setBounds(0, 0, this.vhR.getIntrinsicWidth(), this.vhR.getIntrinsicHeight());
    dja();
    setOnTouchListener(new MMAutoCompleteTextView.1(this));
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
        AppMethodBeat.i(106473);
        MMAutoCompleteTextView.b(MMAutoCompleteTextView.this);
        AppMethodBeat.o(106473);
      }
    });
    setOnFocusChangeListener(new MMAutoCompleteTextView.3(this));
    AppMethodBeat.o(106476);
  }

  private void dja()
  {
    AppMethodBeat.i(106477);
    if ((getText().toString().equals("")) || (!isFocused()))
    {
      djc();
      AppMethodBeat.o(106477);
    }
    while (true)
    {
      return;
      djb();
      AppMethodBeat.o(106477);
    }
  }

  private void djb()
  {
    AppMethodBeat.i(106478);
    setCompoundDrawables(getCompoundDrawables()[0], getCompoundDrawables()[1], this.vhR, getCompoundDrawables()[3]);
    AppMethodBeat.o(106478);
  }

  private void djc()
  {
    AppMethodBeat.i(106479);
    setCompoundDrawables(getCompoundDrawables()[0], getCompoundDrawables()[1], null, getCompoundDrawables()[3]);
    AppMethodBeat.o(106479);
  }

  public void setSpilter(String paramString)
  {
    AppMethodBeat.i(106480);
    if (!bo.isNullOrNil(paramString))
    {
      this.ytE = new a(paramString);
      addTextChangedListener(this.ytE);
    }
    AppMethodBeat.o(106480);
  }

  final class a
    implements TextWatcher
  {
    private String ytG;

    public a(String arg2)
    {
      Object localObject;
      this.ytG = localObject;
    }

    public final void afterTextChanged(Editable paramEditable)
    {
      AppMethodBeat.i(106475);
      if (paramEditable.toString().endsWith(this.ytG))
        MMAutoCompleteTextView.this.showDropDown();
      AppMethodBeat.o(106475);
    }

    public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
    {
    }

    public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
    {
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.MMAutoCompleteTextView
 * JD-Core Version:    0.6.2
 */