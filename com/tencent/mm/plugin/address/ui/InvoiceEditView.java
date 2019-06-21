package com.tencent.mm.plugin.address.ui;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.Editable;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.R.a;
import com.tencent.mm.bz.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public class InvoiceEditView extends RelativeLayout
  implements View.OnFocusChangeListener
{
  private int background;
  private View.OnFocusChangeListener gJD;
  private TextView gJE;
  EditText gJF;
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
  private a gJV;
  private InvoiceEditView.c gJW;
  private b gJX;
  private int gJY;
  public boolean gJZ;
  private int gravity;
  private int imeOptions;
  private int inputType;

  public InvoiceEditView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public InvoiceEditView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(16834);
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
    this.gJR = new InvoiceEditView.4(this);
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
    paramAttributeSet = LayoutInflater.from(paramContext).inflate(2130969875, this, true);
    this.gJF = ((EditText)paramAttributeSet.findViewById(2131821052));
    this.gJF.setTextSize(0, a.al(paramContext, 2131427813));
    this.gJE = ((TextView)paramAttributeSet.findViewById(2131821051));
    this.gJG = ((ImageView)paramAttributeSet.findViewById(2131821053));
    this.gJG.setOnClickListener(this.gJR);
    this.gJF.setImeOptions(this.imeOptions);
    this.gJF.setInputType(this.inputType);
    if (this.inputType == 2)
    {
      this.gJF.setKeyListener(new InvoiceEditView.1(this));
      dr(this.gJF.isFocused());
      this.gJF.addTextChangedListener(new InvoiceEditView.3(this));
      this.gJF.setOnFocusChangeListener(this);
      if (!bo.isNullOrNil(this.gJH))
        this.gJF.setHint(this.gJH);
      if (!bo.isNullOrNil(this.gJI))
        this.gJE.setText(this.gJI);
      paramContext = new Rect();
      i(this.gJF, paramContext);
      if (this.gJL)
        break label660;
      this.gJF.setEnabled(false);
      this.gJF.setTextColor(getResources().getColor(2131689659));
      this.gJF.setFocusable(false);
      this.gJF.setClickable(false);
      this.gJF.setBackgroundResource(2130840857);
      if (this.gJZ)
        setBackgroundResource(2130838396);
      setPadding(a.fromDPToPix(getContext(), 8), getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }
    while (true)
    {
      j(this.gJF, paramContext);
      if (this.gJM != -1)
        this.gJG.setImageResource(this.gJM);
      if (!this.gJQ)
        this.gJF.setSingleLine(false);
      AppMethodBeat.o(16834);
      return;
      if (this.inputType == 3)
      {
        this.gJF.setKeyListener(new InvoiceEditView.2(this));
        break;
      }
      this.gJF.setInputType(this.inputType);
      break;
      label660: this.gJN = false;
      this.gJF.setBackgroundResource(this.gJK);
      setBackgroundResource(this.background);
    }
  }

  private void dr(boolean paramBoolean)
  {
    AppMethodBeat.i(16841);
    if ((this.gJL) && (!bo.isNullOrNil(getText())))
    {
      this.gJG.setImageResource(2130839158);
      this.gJG.setContentDescription(getContext().getString(2131298329));
      switch (this.gJJ)
      {
      default:
        this.gJG.setVisibility(8);
        AppMethodBeat.o(16841);
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
        AppMethodBeat.o(16841);
      }
      else
      {
        this.gJG.setVisibility(8);
        AppMethodBeat.o(16841);
        continue;
        this.gJG.setVisibility(0);
        this.gJG.setContentDescription(getContext().getString(2131296463));
        AppMethodBeat.o(16841);
        continue;
        this.gJG.setVisibility(0);
        this.gJG.setContentDescription(getContext().getString(2131296441));
        AppMethodBeat.o(16841);
        continue;
        switch (this.gJJ)
        {
        default:
          this.gJG.setVisibility(8);
          AppMethodBeat.o(16841);
          break;
        case 0:
        case 1:
        case 4:
          this.gJG.setVisibility(8);
          AppMethodBeat.o(16841);
          break;
        case 3:
          this.gJG.setVisibility(0);
          this.gJG.setContentDescription(getContext().getString(2131296463));
          AppMethodBeat.o(16841);
          break;
        case 2:
          this.gJG.setVisibility(0);
          this.gJG.setContentDescription(getContext().getString(2131296441));
          AppMethodBeat.o(16841);
        }
      }
    }
  }

  private Rect getValidRectOfInfoIv()
  {
    AppMethodBeat.i(16853);
    Rect localRect = new Rect();
    this.gJG.getHitRect(localRect);
    localRect.left -= 50;
    localRect.right += 50;
    localRect.top -= 25;
    localRect.bottom += 25;
    AppMethodBeat.o(16853);
    return localRect;
  }

  private static void i(View paramView, Rect paramRect)
  {
    AppMethodBeat.i(16854);
    paramRect.left = paramView.getPaddingLeft();
    paramRect.right = paramView.getPaddingRight();
    paramRect.top = paramView.getPaddingTop();
    paramRect.bottom = paramView.getPaddingBottom();
    AppMethodBeat.o(16854);
  }

  private static void j(View paramView, Rect paramRect)
  {
    AppMethodBeat.i(16855);
    paramView.setPadding(paramRect.left, paramRect.top, paramRect.right, paramRect.bottom);
    AppMethodBeat.o(16855);
  }

  public final boolean asa()
  {
    boolean bool = true;
    AppMethodBeat.i(16840);
    String str = this.gJF.getText().toString();
    switch (this.gJJ)
    {
    case 2:
    case 3:
    default:
      if ((str.length() >= this.gJO) && (str.length() <= this.gJP))
        AppMethodBeat.o(16840);
      break;
    case 0:
    case 1:
    case 4:
    case 5:
    }
    while (true)
    {
      return bool;
      if ((str.length() >= this.gJO) && (str.length() <= this.gJP))
      {
        AppMethodBeat.o(16840);
      }
      else
      {
        AppMethodBeat.o(16840);
        bool = false;
        continue;
        if ((str.length() == 0) || ((str.length() >= this.gJO) && (str.length() <= this.gJP)))
        {
          AppMethodBeat.o(16840);
        }
        else
        {
          AppMethodBeat.o(16840);
          bool = false;
          continue;
          if (str.length() <= 100)
          {
            AppMethodBeat.o(16840);
          }
          else
          {
            AppMethodBeat.o(16840);
            bool = false;
            continue;
            if (str.length() <= 48)
            {
              AppMethodBeat.o(16840);
            }
            else
            {
              AppMethodBeat.o(16840);
              bool = false;
              continue;
              AppMethodBeat.o(16840);
              bool = false;
            }
          }
        }
      }
    }
  }

  public final boolean asb()
  {
    AppMethodBeat.i(16848);
    boolean bool;
    if (getText().equals(bo.nullAsNil(this.gJS)))
    {
      bool = false;
      AppMethodBeat.o(16848);
    }
    while (true)
    {
      return bool;
      bool = true;
      AppMethodBeat.o(16848);
    }
  }

  public String getText()
  {
    AppMethodBeat.i(16835);
    String str = this.gJF.getText().toString();
    AppMethodBeat.o(16835);
    return str;
  }

  public void onFocusChange(View paramView, boolean paramBoolean)
  {
    AppMethodBeat.i(16843);
    if (this.gJD != null)
      this.gJD.onFocusChange(this, paramBoolean);
    ab.d("MicroMsg.InvoiceEditView", "View:" + this.gJI + ", editType:" + this.gJJ + " onFocusChange to " + paramBoolean);
    if (this.gJW != null)
      this.gJW.arX();
    if (!this.gJN)
    {
      this.gJE.setEnabled(false);
      if (paramView == this.gJF)
      {
        paramView = new Rect();
        i(this, paramView);
        if (!paramBoolean)
          break label164;
        setBackgroundResource(2130839104);
      }
    }
    while (true)
    {
      j(this, paramView);
      dr(paramBoolean);
      AppMethodBeat.o(16843);
      return;
      this.gJE.setEnabled(true);
      break;
      label164: setBackgroundResource(2130839105);
    }
  }

  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    boolean bool = true;
    AppMethodBeat.i(16838);
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
      AppMethodBeat.o(16838);
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
      label82: AppMethodBeat.o(16838);
    }
  }

  public void setBankNumberValStr(String paramString)
  {
    int i = 0;
    int j = 0;
    AppMethodBeat.i(16847);
    String str1 = paramString;
    if (this.gJJ == 5)
    {
      String str2 = paramString.replace(" ", "");
      str1 = paramString;
      if (str2.length() >= 4)
      {
        StringBuilder localStringBuilder = new StringBuilder();
        if (str2.length() % 4 == 0)
          for (i = j; ; i++)
          {
            str1 = paramString;
            if (i >= str2.length() / 4 - 1)
              break;
            localStringBuilder.append(str2.substring(i * 4, (i + 1) * 4)).append(" ");
          }
        while (i < str2.length() / 4)
        {
          localStringBuilder.append(str2.substring(i * 4, (i + 1) * 4)).append(" ");
          i++;
        }
        str1 = str2.substring(str2.length() / 4 * 4, str2.length());
      }
    }
    this.gJF.setText(str1);
    this.gJF.setSelection(this.gJF.getText().length());
    AppMethodBeat.o(16847);
  }

  public void setEditBG(int paramInt)
  {
    AppMethodBeat.i(16849);
    if (this.gJF != null)
    {
      Rect localRect = new Rect();
      i(this.gJF, localRect);
      this.gJF.setBackgroundResource(paramInt);
      j(this.gJF, localRect);
    }
    AppMethodBeat.o(16849);
  }

  public void setEllipsize(TextUtils.TruncateAt paramTruncateAt)
  {
    AppMethodBeat.i(16836);
    this.gJF.setEllipsize(paramTruncateAt);
    AppMethodBeat.o(16836);
  }

  public void setEnabled(boolean paramBoolean)
  {
    AppMethodBeat.i(16837);
    super.setEnabled(paramBoolean);
    this.gJL = paramBoolean;
    this.gJG.setEnabled(true);
    AppMethodBeat.o(16837);
  }

  public void setHintStr(String paramString)
  {
    AppMethodBeat.i(16844);
    this.gJF.setHint(paramString);
    AppMethodBeat.o(16844);
  }

  public void setImeOptions(int paramInt)
  {
    AppMethodBeat.i(16851);
    this.gJF.setImeOptions(paramInt);
    AppMethodBeat.o(16851);
  }

  public void setInfoIvOnClickListener(a parama)
  {
    this.gJV = parama;
  }

  public void setInfoIvVisible(int paramInt)
  {
    AppMethodBeat.i(16852);
    this.gJG.setVisibility(paramInt);
    AppMethodBeat.o(16852);
  }

  public void setOnClickListener(View.OnClickListener paramOnClickListener)
  {
    AppMethodBeat.i(16839);
    super.setOnClickListener(paramOnClickListener);
    AppMethodBeat.o(16839);
  }

  public void setOnFocusChangeListener(View.OnFocusChangeListener paramOnFocusChangeListener)
  {
    AppMethodBeat.i(16842);
    super.setOnFocusChangeListener(paramOnFocusChangeListener);
    this.gJD = paramOnFocusChangeListener;
    AppMethodBeat.o(16842);
  }

  public void setOnInputInvoiceTypeChangeListener(b paramb)
  {
    this.gJX = paramb;
  }

  public void setOnInputValidChangeListener(InvoiceEditView.c paramc)
  {
    this.gJW = paramc;
  }

  public void setTipStr(String paramString)
  {
    AppMethodBeat.i(16845);
    this.gJE.setText(paramString);
    AppMethodBeat.o(16845);
  }

  public void setTipTextColor(int paramInt)
  {
    AppMethodBeat.i(16850);
    if (this.gJE != null)
      this.gJE.setTextColor(paramInt);
    AppMethodBeat.o(16850);
  }

  public void setValStr(String paramString)
  {
    AppMethodBeat.i(16846);
    this.gJF.setText(paramString);
    this.gJF.setSelection(this.gJF.getText().length());
    this.gJS = paramString;
    AppMethodBeat.o(16846);
  }

  public static abstract interface a
  {
  }

  public static abstract interface b
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.address.ui.InvoiceEditView
 * JD-Core Version:    0.6.2
 */