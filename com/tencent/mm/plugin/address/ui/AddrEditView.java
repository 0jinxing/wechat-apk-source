package com.tencent.mm.plugin.address.ui;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.telephony.PhoneNumberUtils;
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

public class AddrEditView extends RelativeLayout
  implements View.OnFocusChangeListener
{
  private int background;
  private AddrEditView.a gJB;
  private AddrEditView.b gJC;
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
  private boolean gJN;
  private int gJO;
  private int gJP;
  private boolean gJQ;
  private View.OnClickListener gJR;
  private String gJS;
  private int gravity;
  private int imeOptions;
  private int inputType;

  public AddrEditView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public AddrEditView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(16809);
    this.gJH = "";
    this.gJI = "";
    this.inputType = 1;
    this.gravity = 19;
    this.gJJ = -1;
    this.background = -1;
    this.gJK = -1;
    this.gJL = true;
    this.gJN = false;
    this.gJO = 1;
    this.gJP = 30;
    this.gJQ = true;
    this.gJR = new AddrEditView.4(this);
    this.gJS = null;
    paramAttributeSet = paramContext.obtainStyledAttributes(paramAttributeSet, R.a.AddrEditView, paramInt, 0);
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
    paramAttributeSet = LayoutInflater.from(paramContext).inflate(2130968637, this, true);
    this.gJF = ((EditText)paramAttributeSet.findViewById(2131821052));
    this.gJF.setTextSize(0, a.al(paramContext, 2131427813));
    this.gJE = ((TextView)paramAttributeSet.findViewById(2131821051));
    this.gJG = ((ImageView)paramAttributeSet.findViewById(2131821053));
    this.gJG.setOnClickListener(this.gJR);
    this.gJF.setImeOptions(this.imeOptions);
    this.gJF.setInputType(this.inputType);
    if (this.inputType == 2)
    {
      this.gJF.setKeyListener(new AddrEditView.1(this));
      dr(this.gJF.isFocused());
      this.gJF.addTextChangedListener(new AddrEditView.3(this));
      this.gJF.setOnFocusChangeListener(this);
      if (!bo.isNullOrNil(this.gJH))
        this.gJF.setHint(this.gJH);
      if (!bo.isNullOrNil(this.gJI))
        this.gJE.setText(this.gJI);
      paramContext = new Rect();
      i(this.gJF, paramContext);
      if (this.gJL)
        break label649;
      this.gJF.setEnabled(false);
      this.gJF.setTextColor(getResources().getColor(2131689659));
      this.gJF.setFocusable(false);
      this.gJF.setClickable(false);
      this.gJF.setBackgroundResource(2130840857);
      setBackgroundResource(2130838396);
      setPadding(a.fromDPToPix(getContext(), 8), getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }
    while (true)
    {
      j(this.gJF, paramContext);
      this.gJF.setGravity(this.gravity);
      if (this.gJM != -1)
        this.gJG.setImageResource(this.gJM);
      if (!this.gJQ)
        this.gJF.setSingleLine(false);
      AppMethodBeat.o(16809);
      return;
      if (this.inputType == 3)
      {
        this.gJF.setKeyListener(new AddrEditView.2(this));
        break;
      }
      this.gJF.setInputType(this.inputType);
      break;
      label649: this.gJN = false;
      this.gJF.setBackgroundResource(this.gJK);
      setBackgroundResource(this.background);
    }
  }

  private void dr(boolean paramBoolean)
  {
    AppMethodBeat.i(16816);
    if ((this.gJL) && (!bo.isNullOrNil(getText())))
    {
      this.gJG.setImageResource(2130839158);
      this.gJG.setContentDescription(getContext().getString(2131298329));
      switch (this.gJJ)
      {
      default:
        this.gJG.setVisibility(8);
        AppMethodBeat.o(16816);
      case 0:
      case 1:
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
        AppMethodBeat.o(16816);
      }
      else
      {
        this.gJG.setVisibility(8);
        AppMethodBeat.o(16816);
        continue;
        this.gJG.setVisibility(0);
        this.gJG.setImageResource(2131232119);
        this.gJG.setContentDescription(getContext().getString(2131296463));
        AppMethodBeat.o(16816);
        continue;
        this.gJG.setVisibility(0);
        this.gJG.setImageResource(2131232118);
        this.gJG.setContentDescription(getContext().getString(2131296441));
        AppMethodBeat.o(16816);
        continue;
        switch (this.gJJ)
        {
        default:
          this.gJG.setVisibility(8);
          AppMethodBeat.o(16816);
          break;
        case 0:
        case 1:
          this.gJG.setVisibility(8);
          AppMethodBeat.o(16816);
          break;
        case 3:
          this.gJG.setVisibility(0);
          this.gJG.setImageResource(2131232119);
          this.gJG.setContentDescription(getContext().getString(2131296463));
          AppMethodBeat.o(16816);
          break;
        case 2:
          this.gJG.setVisibility(0);
          this.gJG.setImageResource(2131232118);
          this.gJG.setContentDescription(getContext().getString(2131296441));
          AppMethodBeat.o(16816);
        }
      }
    }
  }

  private Rect getValidRectOfInfoIv()
  {
    AppMethodBeat.i(16827);
    Rect localRect = new Rect();
    this.gJG.getHitRect(localRect);
    localRect.left -= 50;
    localRect.right += 50;
    localRect.top -= 25;
    localRect.bottom += 25;
    AppMethodBeat.o(16827);
    return localRect;
  }

  private static void i(View paramView, Rect paramRect)
  {
    AppMethodBeat.i(16828);
    paramRect.left = paramView.getPaddingLeft();
    paramRect.right = paramView.getPaddingRight();
    paramRect.top = paramView.getPaddingTop();
    paramRect.bottom = paramView.getPaddingBottom();
    AppMethodBeat.o(16828);
  }

  private static void j(View paramView, Rect paramRect)
  {
    AppMethodBeat.i(16829);
    paramView.setPadding(paramRect.left, paramRect.top, paramRect.right, paramRect.bottom);
    AppMethodBeat.o(16829);
  }

  private static int wF(String paramString)
  {
    AppMethodBeat.i(16830);
    int i = 0;
    int j = 0;
    if (i < paramString.length())
    {
      if (paramString.substring(i, i + 1).matches("[Α-￥]"))
        j += 2;
      while (true)
      {
        i++;
        break;
        j++;
      }
    }
    AppMethodBeat.o(16830);
    return j;
  }

  public final boolean asa()
  {
    AppMethodBeat.i(16815);
    Object localObject = this.gJF.getText().toString();
    boolean bool;
    switch (this.gJJ)
    {
    case 0:
    default:
      if (((String)localObject).length() >= this.gJO)
      {
        AppMethodBeat.o(16815);
        bool = true;
      }
      break;
    case 1:
    case 2:
    case 3:
    case 5:
    case 4:
    }
    while (true)
    {
      return bool;
      if ((((String)localObject).length() >= this.gJO) && (((String)localObject).length() <= this.gJP))
      {
        if (localObject == null)
          localObject = null;
        while (true)
        {
          if (!PhoneNumberUtils.isGlobalPhoneNumber((String)localObject))
            break label158;
          AppMethodBeat.o(16815);
          bool = true;
          break;
          String str = ((String)localObject).replaceAll("\\D", "");
          localObject = str;
          if (str.startsWith("86"))
            localObject = str.substring(2);
        }
      }
      label158: AppMethodBeat.o(16815);
      bool = false;
      continue;
      if ((((String)localObject).length() >= this.gJO) && (wF((String)localObject) <= 32))
      {
        AppMethodBeat.o(16815);
        bool = true;
      }
      else
      {
        AppMethodBeat.o(16815);
        bool = false;
        continue;
        if ((((String)localObject).length() >= this.gJO) && (wF((String)localObject) <= 128))
        {
          AppMethodBeat.o(16815);
          bool = true;
        }
        else
        {
          AppMethodBeat.o(16815);
          bool = false;
          continue;
          if (((String)localObject).length() <= this.gJP)
          {
            AppMethodBeat.o(16815);
            bool = true;
          }
          else
          {
            AppMethodBeat.o(16815);
            bool = false;
            continue;
            AppMethodBeat.o(16815);
            bool = false;
          }
        }
      }
    }
  }

  public final boolean asb()
  {
    AppMethodBeat.i(16822);
    boolean bool;
    if (getText().equals(bo.nullAsNil(this.gJS)))
    {
      bool = false;
      AppMethodBeat.o(16822);
    }
    while (true)
    {
      return bool;
      bool = true;
      AppMethodBeat.o(16822);
    }
  }

  public String getText()
  {
    AppMethodBeat.i(16810);
    String str = this.gJF.getText().toString();
    AppMethodBeat.o(16810);
    return str;
  }

  public void onFocusChange(View paramView, boolean paramBoolean)
  {
    AppMethodBeat.i(16818);
    if (this.gJD != null)
      this.gJD.onFocusChange(this, paramBoolean);
    ab.d("MicroMsg.AddrEditView", "View:" + this.gJI + ", editType:" + this.gJJ + " onFocusChange to " + paramBoolean);
    if (this.gJC != null)
      this.gJC.arX();
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
      AppMethodBeat.o(16818);
      return;
      this.gJE.setEnabled(true);
      break;
      label164: setBackgroundResource(2130839105);
    }
  }

  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    boolean bool = true;
    AppMethodBeat.i(16813);
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
      AppMethodBeat.o(16813);
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
      label82: AppMethodBeat.o(16813);
    }
  }

  public void setEditBG(int paramInt)
  {
    AppMethodBeat.i(16823);
    if (this.gJF != null)
    {
      Rect localRect = new Rect();
      i(this.gJF, localRect);
      this.gJF.setBackgroundResource(paramInt);
      j(this.gJF, localRect);
    }
    AppMethodBeat.o(16823);
  }

  public void setEllipsize(TextUtils.TruncateAt paramTruncateAt)
  {
    AppMethodBeat.i(16811);
    this.gJF.setEllipsize(paramTruncateAt);
    AppMethodBeat.o(16811);
  }

  public void setEnabled(boolean paramBoolean)
  {
    AppMethodBeat.i(16812);
    super.setEnabled(paramBoolean);
    this.gJL = paramBoolean;
    this.gJG.setEnabled(true);
    AppMethodBeat.o(16812);
  }

  public void setHintStr(String paramString)
  {
    AppMethodBeat.i(16819);
    this.gJF.setHint(paramString);
    AppMethodBeat.o(16819);
  }

  public void setImeOptions(int paramInt)
  {
    AppMethodBeat.i(16825);
    this.gJF.setImeOptions(paramInt);
    AppMethodBeat.o(16825);
  }

  public void setInfoIvOnClickListener(AddrEditView.a parama)
  {
    this.gJB = parama;
  }

  public void setInfoIvVisible(int paramInt)
  {
    AppMethodBeat.i(16826);
    this.gJG.setVisibility(paramInt);
    AppMethodBeat.o(16826);
  }

  public void setOnClickListener(View.OnClickListener paramOnClickListener)
  {
    AppMethodBeat.i(16814);
    super.setOnClickListener(paramOnClickListener);
    AppMethodBeat.o(16814);
  }

  public void setOnFocusChangeListener(View.OnFocusChangeListener paramOnFocusChangeListener)
  {
    AppMethodBeat.i(16817);
    super.setOnFocusChangeListener(paramOnFocusChangeListener);
    this.gJD = paramOnFocusChangeListener;
    AppMethodBeat.o(16817);
  }

  public void setOnInputValidChangeListener(AddrEditView.b paramb)
  {
    this.gJC = paramb;
  }

  public void setTipStr(String paramString)
  {
    AppMethodBeat.i(16820);
    this.gJE.setText(paramString);
    AppMethodBeat.o(16820);
  }

  public void setTipTextColor(int paramInt)
  {
    AppMethodBeat.i(16824);
    if (this.gJE != null)
      this.gJE.setTextColor(paramInt);
    AppMethodBeat.o(16824);
  }

  public void setValStr(String paramString)
  {
    AppMethodBeat.i(16821);
    this.gJF.setText(paramString);
    this.gJF.setSelection(this.gJF.getText().length());
    this.gJS = paramString;
    AppMethodBeat.o(16821);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.address.ui.AddrEditView
 * JD-Core Version:    0.6.2
 */