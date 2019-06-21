package com.tencent.mm.ui.base;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ad.a.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.av;
import com.tencent.mm.ui.v;
import com.tencent.mm.ui.widget.MMEditText.c;

public class MMFormMobileInputView extends LinearLayout
{
  private Context mContext;
  private int yuj;
  private int[] yuk;
  private EditText yum;
  private EditText yun;
  private String yuo;
  private String yup;
  private final int yuq;
  private MMFormMobileInputView.a yur;

  public MMFormMobileInputView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, -1);
  }

  @TargetApi(11)
  public MMFormMobileInputView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(106574);
    this.mContext = null;
    this.yuj = -1;
    this.yuo = "";
    this.yup = "";
    this.yuq = 13;
    this.yur = null;
    paramAttributeSet = paramContext.obtainStyledAttributes(paramAttributeSet, a.a.FormItemView, paramInt, 0);
    this.yuj = paramAttributeSet.getResourceId(2, -1);
    paramAttributeSet.recycle();
    v.hu(paramContext).inflate(2130970118, this);
    this.mContext = paramContext;
    AppMethodBeat.o(106574);
  }

  private void eG(View paramView)
  {
    AppMethodBeat.i(106577);
    this.yuk = new int[] { paramView.getPaddingLeft(), paramView.getPaddingTop(), paramView.getPaddingRight(), paramView.getPaddingBottom() };
    AppMethodBeat.o(106577);
  }

  private void eH(View paramView)
  {
    AppMethodBeat.i(106578);
    if (this.yuk != null)
      paramView.setPadding(this.yuk[0], this.yuk[1], this.yuk[2], this.yuk[3]);
    AppMethodBeat.o(106578);
  }

  public String getCountryCode()
  {
    AppMethodBeat.i(106583);
    String str;
    if (this.yum != null)
    {
      str = this.yum.getText().toString().trim();
      AppMethodBeat.o(106583);
    }
    while (true)
    {
      return str;
      str = "";
      AppMethodBeat.o(106583);
    }
  }

  public EditText getCountryCodeEditText()
  {
    return this.yum;
  }

  public String getMobileNumber()
  {
    AppMethodBeat.i(106582);
    String str;
    if (this.yun != null)
    {
      str = av.amN(this.yun.getText().toString());
      AppMethodBeat.o(106582);
    }
    while (true)
    {
      return str;
      str = "";
      AppMethodBeat.o(106582);
    }
  }

  public EditText getMobileNumberEditText()
  {
    return this.yun;
  }

  public void onFinishInflate()
  {
    AppMethodBeat.i(106575);
    this.yum = ((EditText)findViewById(2131821727));
    this.yun = ((EditText)findViewById(2131826001));
    if ((this.yum == null) || (this.yun == null))
    {
      ab.w("MicroMsg.MMFormMobileInputView", "countryCodeET : %s, mobileNumberET : %s", new Object[] { this.yum, this.yun });
      if ((this.yum != null) && (this.yun != null))
      {
        if ((!this.yum.hasFocus()) && (!this.yun.hasFocus()))
          break label213;
        qb(true);
      }
    }
    while (true)
    {
      MMFormMobileInputView.1 local1 = new MMFormMobileInputView.1(this);
      this.yum.setOnFocusChangeListener(local1);
      this.yun.setOnFocusChangeListener(local1);
      this.yun.addTextChangedListener(new MMEditText.c(this.yun, null, 20));
      this.yun.addTextChangedListener(new MMFormMobileInputView.2(this));
      this.yum.addTextChangedListener(new MMFormMobileInputView.3(this));
      AppMethodBeat.o(106575);
      return;
      if (this.yuj == -1)
        break;
      this.yun.setHint(this.yuj);
      break;
      label213: qb(false);
    }
  }

  public final void qb(boolean paramBoolean)
  {
    AppMethodBeat.i(106576);
    eG(this.yum);
    if (paramBoolean)
    {
      this.yum.setBackgroundResource(2130839104);
      eH(this.yum);
      eG(this.yun);
      if (!paramBoolean)
        break label81;
      this.yun.setBackgroundResource(2130839104);
    }
    while (true)
    {
      eH(this.yun);
      AppMethodBeat.o(106576);
      return;
      this.yum.setBackgroundResource(2130839105);
      break;
      label81: this.yun.setBackgroundResource(2130839105);
    }
  }

  public void setCountryCode(String paramString)
  {
    AppMethodBeat.i(106579);
    if (this.yum != null)
    {
      this.yum.setText(paramString);
      AppMethodBeat.o(106579);
    }
    while (true)
    {
      return;
      ab.e("MicroMsg.MMFormMobileInputView", "countryCodeET is null!");
      AppMethodBeat.o(106579);
    }
  }

  public void setHint(String paramString)
  {
    AppMethodBeat.i(106580);
    if (this.yun != null)
    {
      this.yun.setHint(paramString);
      AppMethodBeat.o(106580);
    }
    while (true)
    {
      return;
      ab.e("MicroMsg.MMFormMobileInputView", "mobileNumberET is null!");
      AppMethodBeat.o(106580);
    }
  }

  public void setMobileNumber(String paramString)
  {
    AppMethodBeat.i(106581);
    if (this.yun != null)
    {
      this.yun.setText(paramString);
      AppMethodBeat.o(106581);
    }
    while (true)
    {
      return;
      ab.e("MicroMsg.MMFormMobileInputView", "mobileNumberET is null!");
      AppMethodBeat.o(106581);
    }
  }

  public void setOnCountryCodeChangedListener(MMFormMobileInputView.a parama)
  {
    this.yur = parama;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.MMFormMobileInputView
 * JD-Core Version:    0.6.2
 */