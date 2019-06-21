package com.tencent.mm.plugin.address.ui;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.R.a;
import com.tencent.mm.bz.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public class InvoiceQrcodeTextView extends RelativeLayout
  implements View.OnFocusChangeListener
{
  private int background;
  private View.OnFocusChangeListener gJD;
  private TextView gJE;
  private ImageView gJG;
  private String gJH;
  private String gJI;
  private int gJJ;
  private int gJK;
  public boolean gJL;
  private int gJM;
  public boolean gJN;
  private int gJO;
  private int gJP;
  private boolean gJQ;
  private View.OnClickListener gJR;
  private String gJS;
  public boolean gJU;
  private int gJY;
  public boolean gJZ;
  private InvoiceQrcodeTextView.a gKo;
  private InvoiceQrcodeTextView.c gKp;
  private InvoiceQrcodeTextView.b gKq;
  TextView gKr;
  private int gravity;
  private int imeOptions;
  private int inputType;

  public InvoiceQrcodeTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public InvoiceQrcodeTextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(16886);
    this.gJU = false;
    this.gJH = "";
    this.gJI = "";
    this.inputType = 1;
    this.gJY = 0;
    this.gravity = 19;
    this.gJJ = -1;
    this.background = -1;
    this.gJK = -1;
    this.gJL = true;
    this.gJZ = true;
    this.gJN = false;
    this.gJO = 0;
    this.gJP = 100;
    this.gJQ = true;
    this.gJR = new InvoiceQrcodeTextView.2(this);
    this.gJS = null;
    paramAttributeSet = paramContext.obtainStyledAttributes(paramAttributeSet, R.a.InvoiceEditView, paramInt, 0);
    paramInt = paramAttributeSet.getResourceId(5, 0);
    if (paramInt != 0)
      this.gJH = paramContext.getString(paramInt);
    paramInt = paramAttributeSet.getResourceId(6, 0);
    if (paramInt != 0)
      this.gJI = paramContext.getString(paramInt);
    this.inputType = paramAttributeSet.getInteger(3, 1);
    this.gJJ = paramAttributeSet.getInteger(7, 0);
    this.gJL = paramAttributeSet.getBoolean(10, true);
    this.gravity = paramAttributeSet.getInt(0, 19);
    this.imeOptions = paramAttributeSet.getInteger(4, 5);
    this.background = paramAttributeSet.getResourceId(1, 2130840857);
    this.gJM = paramAttributeSet.getResourceId(12, -1);
    this.gJK = paramAttributeSet.getResourceId(9, 2130840857);
    this.gJQ = paramAttributeSet.getBoolean(13, true);
    paramAttributeSet.recycle();
    paramAttributeSet = LayoutInflater.from(paramContext).inflate(2130969878, this, true);
    this.gKr = ((TextView)paramAttributeSet.findViewById(2131821052));
    this.gKr.setTextSize(0, a.al(paramContext, 2131427813));
    this.gJE = ((TextView)paramAttributeSet.findViewById(2131821051));
    this.gJG = ((ImageView)paramAttributeSet.findViewById(2131821053));
    this.gJG.setOnClickListener(this.gJR);
    this.gKr.setImeOptions(this.imeOptions);
    if (!bo.isNullOrNil(this.gJH))
      this.gKr.setHint(this.gJH);
    if (!bo.isNullOrNil(this.gJI))
      this.gJE.setText(this.gJI);
    paramContext = new Rect();
    i(this.gKr, paramContext);
    j(this.gKr, paramContext);
    setPadding(a.fromDPToPix(getContext(), 8), getPaddingTop(), getPaddingRight(), getPaddingBottom());
    if (this.gJM != -1)
      this.gJG.setImageResource(this.gJM);
    if (!this.gJQ)
      this.gKr.setSingleLine(false);
    this.gKr.setOnLongClickListener(new InvoiceQrcodeTextView.1(this));
    AppMethodBeat.o(16886);
  }

  private void dr(boolean paramBoolean)
  {
    AppMethodBeat.i(16893);
    if ((this.gJL) && (!bo.isNullOrNil(getText())))
    {
      this.gJG.setImageResource(2130839158);
      this.gJG.setContentDescription(getContext().getString(2131298329));
      switch (this.gJJ)
      {
      default:
        this.gJG.setVisibility(8);
        AppMethodBeat.o(16893);
      case 0:
      case 1:
      case 4:
      case 5:
      case 3:
      case 2:
      }
    }
    while (true)
    {
      return;
      if (paramBoolean)
      {
        this.gJG.setVisibility(0);
        AppMethodBeat.o(16893);
      }
      else
      {
        this.gJG.setVisibility(8);
        AppMethodBeat.o(16893);
        continue;
        this.gJG.setVisibility(0);
        this.gJG.setContentDescription(getContext().getString(2131296463));
        AppMethodBeat.o(16893);
        continue;
        this.gJG.setVisibility(0);
        this.gJG.setContentDescription(getContext().getString(2131296441));
        AppMethodBeat.o(16893);
        continue;
        switch (this.gJJ)
        {
        default:
          this.gJG.setVisibility(8);
          AppMethodBeat.o(16893);
          break;
        case 0:
        case 1:
        case 4:
          this.gJG.setVisibility(8);
          AppMethodBeat.o(16893);
          break;
        case 3:
          this.gJG.setVisibility(0);
          this.gJG.setContentDescription(getContext().getString(2131296463));
          AppMethodBeat.o(16893);
          break;
        case 2:
          this.gJG.setVisibility(0);
          this.gJG.setContentDescription(getContext().getString(2131296441));
          AppMethodBeat.o(16893);
        }
      }
    }
  }

  private Rect getValidRectOfInfoIv()
  {
    AppMethodBeat.i(16904);
    Rect localRect = new Rect();
    this.gJG.getHitRect(localRect);
    localRect.left -= 50;
    localRect.right += 50;
    localRect.top -= 25;
    localRect.bottom += 25;
    AppMethodBeat.o(16904);
    return localRect;
  }

  private static void i(View paramView, Rect paramRect)
  {
    AppMethodBeat.i(16905);
    paramRect.left = paramView.getPaddingLeft();
    paramRect.right = paramView.getPaddingRight();
    paramRect.top = paramView.getPaddingTop();
    paramRect.bottom = paramView.getPaddingBottom();
    AppMethodBeat.o(16905);
  }

  private static void j(View paramView, Rect paramRect)
  {
    AppMethodBeat.i(16906);
    paramView.setPadding(paramRect.left, paramRect.top, paramRect.right, paramRect.bottom);
    AppMethodBeat.o(16906);
  }

  public final void asd()
  {
    AppMethodBeat.i(16887);
    setBackgroundResource(0);
    this.gJE.setTextColor(getResources().getColor(2131690429));
    this.gKr.setTextColor(getResources().getColor(2131689761));
    this.gKr.setInputType(0);
    this.gKr.clearFocus();
    this.gKr.setSingleLine(false);
    ((InputMethodManager)getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.gKr.getWindowToken(), 0);
    AppMethodBeat.o(16887);
  }

  public String getText()
  {
    AppMethodBeat.i(16888);
    String str = this.gKr.getText().toString();
    AppMethodBeat.o(16888);
    return str;
  }

  public void onFocusChange(View paramView, boolean paramBoolean)
  {
    AppMethodBeat.i(16895);
    if (this.gJD != null)
      this.gJD.onFocusChange(this, paramBoolean);
    ab.d("MicroMsg.InvoiceEditView", "View:" + this.gJI + ", editType:" + this.gJJ + " onFocusChange to " + paramBoolean);
    if (!this.gJN)
    {
      this.gJE.setEnabled(false);
      if (paramView == this.gKr)
      {
        paramView = new Rect();
        i(this, paramView);
        if (!paramBoolean)
          break label148;
        setBackgroundResource(2130839104);
      }
    }
    while (true)
    {
      j(this, paramView);
      dr(paramBoolean);
      AppMethodBeat.o(16895);
      return;
      this.gJE.setEnabled(true);
      break;
      label148: setBackgroundResource(2130839105);
    }
  }

  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    boolean bool = true;
    AppMethodBeat.i(16891);
    int i;
    if (!this.gJL)
    {
      if (this.gJG.getVisibility() == 0)
      {
        i = 1;
        if (i == 0)
          break label77;
        if (!getValidRectOfInfoIv().contains((int)paramMotionEvent.getX(), (int)paramMotionEvent.getY()))
          break label72;
        i = 1;
        label53: if (i == 0)
          break label82;
      }
    }
    else
    {
      AppMethodBeat.o(16891);
      bool = false;
    }
    while (true)
    {
      return bool;
      i = 0;
      break;
      label72: i = 0;
      break label53;
      label77: i = 0;
      break label53;
      label82: AppMethodBeat.o(16891);
    }
  }

  public void setBankNumberValStr(String paramString)
  {
    AppMethodBeat.i(16899);
    String str1 = paramString;
    if (this.gJJ == 5)
    {
      String str2 = paramString.replace(" ", "");
      str1 = paramString;
      if (str2.length() >= 4)
      {
        paramString = new StringBuilder();
        for (int i = 0; i < str2.length() / 4; i++)
          paramString.append(str2.substring(i * 4, (i + 1) * 4)).append(" ");
        str1 = str2.substring(str2.length() / 4 * 4, str2.length());
      }
    }
    this.gKr.setText(str1);
    AppMethodBeat.o(16899);
  }

  public void setEditBG(int paramInt)
  {
    AppMethodBeat.i(16900);
    if (this.gKr != null)
    {
      Rect localRect = new Rect();
      i(this.gKr, localRect);
      this.gKr.setBackgroundResource(paramInt);
      j(this.gKr, localRect);
    }
    AppMethodBeat.o(16900);
  }

  public void setEllipsize(TextUtils.TruncateAt paramTruncateAt)
  {
    AppMethodBeat.i(16889);
    this.gKr.setEllipsize(paramTruncateAt);
    AppMethodBeat.o(16889);
  }

  public void setEnabled(boolean paramBoolean)
  {
    AppMethodBeat.i(16890);
    super.setEnabled(paramBoolean);
    this.gJL = paramBoolean;
    this.gJG.setEnabled(true);
    AppMethodBeat.o(16890);
  }

  public void setHintStr(String paramString)
  {
    AppMethodBeat.i(16896);
    this.gKr.setHint(paramString);
    AppMethodBeat.o(16896);
  }

  public void setImeOptions(int paramInt)
  {
    AppMethodBeat.i(16902);
    this.gKr.setImeOptions(paramInt);
    AppMethodBeat.o(16902);
  }

  public void setInfoIvOnClickListener(InvoiceQrcodeTextView.a parama)
  {
    this.gKo = parama;
  }

  public void setInfoIvVisible(int paramInt)
  {
    AppMethodBeat.i(16903);
    this.gJG.setVisibility(paramInt);
    AppMethodBeat.o(16903);
  }

  public void setOnClickListener(View.OnClickListener paramOnClickListener)
  {
    AppMethodBeat.i(16892);
    super.setOnClickListener(paramOnClickListener);
    AppMethodBeat.o(16892);
  }

  public void setOnFocusChangeListener(View.OnFocusChangeListener paramOnFocusChangeListener)
  {
    AppMethodBeat.i(16894);
    super.setOnFocusChangeListener(paramOnFocusChangeListener);
    this.gJD = paramOnFocusChangeListener;
    AppMethodBeat.o(16894);
  }

  public void setOnInputInvoiceTypeChangeListener(InvoiceQrcodeTextView.b paramb)
  {
    this.gKq = paramb;
  }

  public void setOnInputValidChangeListener(InvoiceQrcodeTextView.c paramc)
  {
    this.gKp = paramc;
  }

  public void setTipStr(String paramString)
  {
    AppMethodBeat.i(16897);
    this.gJE.setText(paramString);
    AppMethodBeat.o(16897);
  }

  public void setTipTextColor(int paramInt)
  {
    AppMethodBeat.i(16901);
    if (this.gJE != null)
      this.gJE.setTextColor(paramInt);
    AppMethodBeat.o(16901);
  }

  public void setValStr(String paramString)
  {
    AppMethodBeat.i(16898);
    this.gKr.setText(paramString);
    this.gJS = paramString;
    AppMethodBeat.o(16898);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.address.ui.InvoiceQrcodeTextView
 * JD-Core Version:    0.6.2
 */