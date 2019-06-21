package com.tencent.mm.plugin.label.ui.widget;

import android.content.Context;
import android.text.InputFilter;
import android.text.InputFilter.LengthFilter;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;
import com.tencent.mm.pluginsdk.ui.e.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.tools.f;
import com.tencent.mm.ui.widget.MMEditText;

public class InputClearablePreference extends Preference
{
  public String hAa;
  private String mText;
  public String nJe;
  public String nJf;
  public int nJg;
  private int nJh;
  public boolean nJi;
  public MMEditText nJj;
  private ImageView nJk;
  public TextView nJl;
  private int nJm;
  public InputClearablePreference.a nJn;

  public InputClearablePreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public InputClearablePreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  private void PN(String paramString)
  {
    boolean bool1 = true;
    AppMethodBeat.i(22711);
    if (!bo.isNullOrNil(paramString))
    {
      int i = f.asg(paramString);
      if (i <= this.nJg)
        break label92;
      bool2 = true;
      d(bool2, f.bP(this.nJg, ""), f.bQ(this.nJg, paramString));
      if (this.nJn != null)
      {
        paramString = this.nJn;
        if (i > this.nJg)
          break label98;
      }
    }
    label92: label98: for (boolean bool2 = bool1; ; bool2 = false)
    {
      paramString.iy(bool2);
      AppMethodBeat.o(22711);
      return;
      bool2 = false;
      break;
    }
  }

  private void d(boolean paramBoolean, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(22712);
    if (this.nJl != null)
      if (paramBoolean)
      {
        this.nJl.setText(String.format(this.hAa, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }));
        this.nJl.setVisibility(0);
        AppMethodBeat.o(22712);
      }
    while (true)
    {
      return;
      this.nJl.setVisibility(8);
      AppMethodBeat.o(22712);
    }
  }

  public final void iA(boolean paramBoolean)
  {
    AppMethodBeat.i(22713);
    if (this.nJl != null)
      if (paramBoolean)
      {
        this.nJl.setText(this.nJf);
        this.nJl.setVisibility(0);
        AppMethodBeat.o(22713);
      }
    while (true)
    {
      return;
      this.nJl.setVisibility(8);
      AppMethodBeat.o(22713);
    }
  }

  public final void onBindView(View paramView)
  {
    AppMethodBeat.i(22710);
    super.onBindView(paramView);
    this.nJm = a.al(this.mContext, 2131427762);
    this.nJj = ((MMEditText)paramView.findViewById(2131820980));
    this.nJk = ((ImageView)paramView.findViewById(2131823259));
    this.nJl = ((TextView)paramView.findViewById(2131826065));
    if (this.nJj != null)
    {
      if (this.nJh <= 0)
        break label273;
      this.nJj.setFilters(new InputFilter[] { new InputFilter.LengthFilter(this.nJh), new InputClearablePreference.b(this) });
    }
    while (true)
    {
      this.nJj.addTextChangedListener(new InputClearablePreference.1(this));
      ab.d("MicroMsg.Label.InputClearablePreference", "mText %s", new Object[] { this.mText });
      setText(this.mText);
      if (!bo.isNullOrNil(this.mText))
        this.nJj.setSelection(this.mText.length());
      if (this.nJi)
        new ak().postDelayed(new InputClearablePreference.4(this), 0L);
      this.nJj.setHint(this.nJe);
      this.nJk.setOnClickListener(new InputClearablePreference.2(this));
      if (this.nJl != null)
        this.nJl.setOnTouchListener(new InputClearablePreference.3(this));
      AppMethodBeat.o(22710);
      return;
      label273: this.nJj.setFilters(new InputFilter[] { new InputClearablePreference.b(this) });
    }
  }

  public final void setText(String paramString)
  {
    AppMethodBeat.i(22709);
    this.mText = paramString;
    if ((this.nJj != null) && (!bo.isNullOrNil(paramString)))
    {
      paramString = j.b(this.mContext, this.mText, this.nJm);
      this.nJj.setText(paramString);
      PN(this.mText);
    }
    AppMethodBeat.o(22709);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.label.ui.widget.InputClearablePreference
 * JD-Core Version:    0.6.2
 */