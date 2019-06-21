package com.tencent.mm.wallet_core.ui;

import android.app.DatePickerDialog;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.Editable;
import android.text.InputFilter;
import android.text.InputFilter.LengthFilter;
import android.text.TextUtils.TruncateAt;
import android.text.method.KeyListener;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.wxpay.a.a;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.v;
import com.tencent.mm.ui.widget.a.c;
import com.tencent.mm.wallet_core.a.a;
import com.tencent.mm.wallet_core.b;
import com.tenpay.android.wechat.TenpaySecureEditText;

@Deprecated
public class EditHintView extends RelativeLayout
  implements View.OnFocusChangeListener
{
  private EditHintView.b AgV;
  private TextView AgW;
  TenpaySecureEditText AgX;
  private int AgY;
  private int AgZ;
  private int Aha;
  private boolean Ahb;
  private String Ahc;
  private DatePickerDialog Ahd;
  private int Ahe;
  private int Ahf;
  private c Ahg;
  private EditHintView.a Ahh;
  private int background;
  private View.OnFocusChangeListener gJD;
  private TextView gJE;
  private ImageView gJG;
  private String gJH;
  private String gJI;
  private int gJJ;
  private int gJK;
  public boolean gJL;
  private boolean gJN;
  private int gJO;
  private int gJP;
  private View.OnClickListener gJR;
  private int gravity;
  private boolean hNO;
  private int imeOptions;
  private int inputType;
  private int mode;
  public boolean yCj;

  public EditHintView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public EditHintView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(49187);
    this.gJH = "";
    this.gJI = "";
    this.inputType = 1;
    this.hNO = true;
    this.gJP = -1;
    this.gJO = 1;
    this.gravity = 19;
    this.AgY = -1;
    this.gJJ = -1;
    this.gJN = false;
    this.AgZ = 1;
    this.Aha = -1;
    this.background = -1;
    this.gJK = -1;
    this.gJL = true;
    this.yCj = true;
    this.Ahb = true;
    this.Ahc = null;
    this.mode = 0;
    this.Ahd = null;
    this.Ahe = 0;
    this.Ahf = 0;
    this.gJR = new EditHintView.8(this);
    this.Ahg = null;
    paramAttributeSet = paramContext.obtainStyledAttributes(paramAttributeSet, a.a.EditHintView, paramInt, 0);
    paramInt = paramAttributeSet.getResourceId(6, 0);
    if (paramInt != 0)
      this.gJH = paramContext.getString(paramInt);
    paramInt = paramAttributeSet.getResourceId(7, 0);
    if (paramInt != 0)
      this.gJI = paramContext.getString(paramInt);
    this.inputType = paramAttributeSet.getInteger(4, 1);
    this.gJL = paramAttributeSet.getBoolean(11, true);
    this.gravity = paramAttributeSet.getInt(0, 19);
    this.hNO = paramAttributeSet.getBoolean(2, true);
    this.gJP = paramAttributeSet.getInteger(12, -1);
    this.gJJ = paramAttributeSet.getInteger(8, 0);
    this.imeOptions = paramAttributeSet.getInteger(5, 5);
    this.Aha = paramAttributeSet.getColor(9, 2131689761);
    this.background = paramAttributeSet.getResourceId(1, -1);
    this.gJK = paramAttributeSet.getResourceId(10, 2130838534);
    this.gJO = paramAttributeSet.getInteger(13, 1);
    this.yCj = paramAttributeSet.getBoolean(3, true);
    paramAttributeSet.recycle();
    paramContext = v.hu(paramContext).inflate(2130969315, this, true);
    this.AgX = ((TenpaySecureEditText)paramContext.findViewById(2131821052));
    this.gJE = ((TextView)paramContext.findViewById(2131821051));
    this.AgW = ((TextView)paramContext.findViewById(2131823383));
    this.gJG = ((ImageView)paramContext.findViewById(2131821053));
    this.AgX.setImeOptions(this.imeOptions);
    switch (this.gJJ)
    {
    case 11:
    default:
      this.inputType = 1;
    case 0:
      dOu();
      this.AgX.setSingleLine(this.yCj);
      if (!this.yCj)
        this.AgX.setMaxLines(1073741823);
      this.gJG.setOnClickListener(this.gJR);
      this.AgX.addTextChangedListener(new EditHintView.1(this));
      this.AgX.setOnFocusChangeListener(this);
      if (!bo.isNullOrNil(this.gJH))
        this.AgX.setHint(this.gJH);
      if (!bo.isNullOrNil(this.gJI))
        this.gJE.setText(this.gJI);
      this.AgX.setGravity(this.gravity);
      if (this.inputType == 2)
      {
        this.AgX.setKeyListener(new EditHintView.2(this));
        label638: if (this.gJP != -1)
          this.AgX.setFilters(new InputFilter[] { new InputFilter.LengthFilter(this.gJP) });
        super.setEnabled(true);
        super.setClickable(true);
        if (!this.hNO)
        {
          this.AgX.setEnabled(false);
          this.AgX.setTextColor(getResources().getColor(this.Aha));
          this.AgX.setFocusable(false);
          this.AgX.setClickable(false);
          this.AgX.setBackgroundResource(2130840857);
          setBackgroundResource(2130839162);
        }
        if (this.gJL)
          break label1306;
        this.gJN = true;
        this.AgX.setEnabled(false);
        this.AgX.setTextColor(getResources().getColor(2131690209));
        this.AgX.setFocusable(false);
        this.AgX.setClickable(false);
        this.AgX.setBackgroundResource(2130840857);
        setBackgroundResource(2130838396);
      }
      break;
    case 1:
    case 7:
    case 17:
    case 14:
    case 15:
    case 2:
    case 9:
    case 5:
    case 4:
    case 3:
    case 6:
    case 8:
    case 10:
    case 12:
    case 13:
    case 16:
    }
    while (true)
    {
      if (this.background > 0)
        setBackgroundResource(this.background);
      if ((this.gJE != null) && (this.AgY != -1))
      {
        paramContext = this.gJE.getLayoutParams();
        paramContext.width = this.AgY;
        this.gJE.setLayoutParams(paramContext);
      }
      if (r.YM())
        this.AgX.setSecureEncrypt(new a(getEncryptType()));
      AppMethodBeat.o(49187);
      return;
      this.gJP = 25;
      this.AgX.setIsBankcardFormat(true);
      this.inputType = 2;
      break;
      this.gJP = 6;
      this.gJE.setVisibility(8);
      this.AgX.setIsPasswordFormat(true);
      this.AgX.setImeOptions(6);
      this.inputType = 128;
      break;
      this.gJP = 3;
      this.gJE.setVisibility(8);
      this.AgX.setIsCvvPaymentFormat(true);
      this.AgX.setImeOptions(6);
      this.inputType = 128;
      break;
      this.gJP = 4;
      this.gJE.setVisibility(8);
      this.AgX.setIsCvv4PaymentFormat(true);
      this.AgX.setImeOptions(6);
      this.inputType = 128;
      break;
      this.gJP = 30;
      this.inputType = 3;
      break;
      this.gJP = 18;
      this.inputType = 4;
      break;
      this.gJP = 4;
      this.inputType = 2;
      break;
      this.gJL = false;
      this.AgX.setIsValidThru(true);
      setOnClickListener(new EditHintView.7(this));
      break;
      this.gJP = 6;
      this.gJE.setVisibility(8);
      this.inputType = 2;
      break;
      this.inputType = 32;
      break;
      if ((this.gJL) || (!this.hNO))
        break;
      break;
      this.gJP = 12;
      this.AgX.setIsMoneyAmountFormat(true);
      break;
      this.AgX.setIsSecurityAnswerFormat(true);
      break;
      if (this.inputType == 4)
      {
        this.AgX.setKeyListener(new EditHintView.3(this));
        break label638;
      }
      if (this.inputType == 128)
      {
        this.AgX.setTransformationMethod(PasswordTransformationMethod.getInstance());
        this.AgX.setKeyListener(new EditHintView.4(this));
        this.AgX.setRawInputType(18);
        break label638;
      }
      if (this.inputType == 3)
      {
        this.AgX.setKeyListener(new EditHintView.5(this));
        break label638;
      }
      this.AgX.setInputType(this.inputType);
      break label638;
      label1306: this.gJN = false;
      this.AgX.setBackgroundResource(this.gJK);
      setBackgroundResource(2130840857);
    }
  }

  private void dOu()
  {
    AppMethodBeat.i(49212);
    if ((this.gJJ == 7) || (this.gJJ == 14) || (this.gJJ == 15))
      AppMethodBeat.o(49212);
    while (true)
    {
      return;
      if ((this.gJL) && (!bo.isNullOrNil(getText())))
      {
        this.gJG.setVisibility(0);
        this.gJG.setImageResource(2130839158);
        AppMethodBeat.o(49212);
      }
      else
      {
        switch (this.gJJ)
        {
        case 2:
        case 5:
        case 6:
        case 7:
        case 8:
        default:
          this.gJG.setVisibility(8);
          AppMethodBeat.o(49212);
          break;
        case 3:
        case 4:
        case 9:
        case 10:
          this.gJG.setVisibility(0);
          this.gJG.setImageResource(2130839789);
          AppMethodBeat.o(49212);
          break;
        case 1:
          if (this.Ahb)
          {
            this.gJG.setVisibility(0);
            this.gJG.setImageResource(2131232128);
            AppMethodBeat.o(49212);
          }
          else
          {
            this.gJG.setVisibility(8);
            AppMethodBeat.o(49212);
          }
          break;
        }
      }
    }
  }

  private int getEncryptType()
  {
    int i;
    switch (this.gJJ)
    {
    case 2:
    case 3:
    case 5:
    case 8:
    case 9:
    case 10:
    case 11:
    case 12:
    default:
      i = 0;
    case 17:
    case 7:
    case 6:
    case 13:
    case 16:
    case 4:
    case 14:
    case 15:
    case 1:
    }
    while (true)
    {
      return i;
      i = -10;
      continue;
      i = 20;
      continue;
      i = 60;
      continue;
      i = 40;
      continue;
      i = -20;
      continue;
      i = 30;
      continue;
      i = 50;
    }
  }

  private Rect getValidRectOfInfoIv()
  {
    AppMethodBeat.i(49217);
    Rect localRect = new Rect();
    this.gJG.getHitRect(localRect);
    localRect.left -= 50;
    localRect.right += 50;
    localRect.top -= 25;
    localRect.bottom += 25;
    AppMethodBeat.o(49217);
    return localRect;
  }

  private void setValStrForce(String paramString)
  {
    AppMethodBeat.i(49195);
    KeyListener localKeyListener = this.AgX.getKeyListener();
    this.AgX.setKeyListener(null);
    setEnabled(false);
    setClickable(false);
    setValStr(paramString);
    this.AgX.setKeyListener(localKeyListener);
    AppMethodBeat.o(49195);
  }

  public final boolean asa()
  {
    boolean bool = true;
    AppMethodBeat.i(49204);
    if ((!this.gJL) && (!this.hNO))
      AppMethodBeat.o(49204);
    while (true)
    {
      return bool;
      switch (this.gJJ)
      {
      case 0:
      case 2:
      case 3:
      case 6:
      case 10:
      case 11:
      case 13:
      case 16:
      default:
        if (this.AgX.getInputLength() >= this.gJO)
          AppMethodBeat.o(49204);
        break;
      case 1:
        bool = this.AgX.isBankcardNum();
        AppMethodBeat.o(49204);
        break;
      case 9:
        bool = this.AgX.isPhoneNum();
        AppMethodBeat.o(49204);
        break;
      case 4:
        if (this.AgX.getInputLength() > 0)
        {
          AppMethodBeat.o(49204);
        }
        else
        {
          AppMethodBeat.o(49204);
          bool = false;
        }
        break;
      case 5:
        bool = this.AgX.isAreaIDCardNum(this.AgZ);
        AppMethodBeat.o(49204);
        break;
      case 7:
      case 17:
        if (this.AgX.getInputLength() == 6)
        {
          AppMethodBeat.o(49204);
        }
        else
        {
          AppMethodBeat.o(49204);
          bool = false;
        }
        break;
      case 14:
        if (this.AgX.getInputLength() == 3)
        {
          AppMethodBeat.o(49204);
        }
        else
        {
          AppMethodBeat.o(49204);
          bool = false;
        }
        break;
      case 15:
        if (this.AgX.getInputLength() == 4)
        {
          AppMethodBeat.o(49204);
        }
        else
        {
          AppMethodBeat.o(49204);
          bool = false;
        }
        break;
      case 8:
        bool = bo.amW(this.AgX.getText().toString());
        AppMethodBeat.o(49204);
        break;
      case 12:
        bool = this.AgX.isMoneyAmount();
        AppMethodBeat.o(49204);
        continue;
        AppMethodBeat.o(49204);
        bool = false;
      }
    }
  }

  public String get3DesEncrptData()
  {
    AppMethodBeat.i(49205);
    String str = this.AgX.get3DesEncrptData();
    AppMethodBeat.o(49205);
    return str;
  }

  public String getMD5Value()
  {
    AppMethodBeat.i(49203);
    if (this.gJJ == 3);
    for (String str = bo.bc(this.Ahc, "").replace("/", ""); ; str = this.AgX.getText().toString())
    {
      str = ag.ck(str);
      AppMethodBeat.o(49203);
      return str;
    }
  }

  public String getText()
  {
    AppMethodBeat.i(49202);
    Object localObject;
    switch (this.gJJ)
    {
    case 11:
    case 12:
    default:
      localObject = bo.bc(this.AgX.getText().toString(), "");
      AppMethodBeat.o(49202);
    case 1:
    case 13:
    case 16:
    case 4:
    case 14:
    case 15:
    case 5:
    case 3:
    case 2:
    case 9:
    case 0:
    case 8:
    case 10:
    case 6:
    case 7:
    }
    while (true)
    {
      return localObject;
      localObject = this.AgX;
      b.dNA();
      localObject = ((TenpaySecureEditText)localObject).getEncryptDataWithHash(false, b.dNB());
      AppMethodBeat.o(49202);
      continue;
      localObject = this.AgX.get3DesEncrptData();
      AppMethodBeat.o(49202);
      continue;
      localObject = this.AgX.get3DesEncrptData();
      AppMethodBeat.o(49202);
      continue;
      localObject = bo.bc(this.Ahc, "").replace("/", "");
      AppMethodBeat.o(49202);
      continue;
      localObject = bo.bc(this.AgX.getText().toString(), "");
      AppMethodBeat.o(49202);
      continue;
      localObject = bo.bc(this.AgX.getText().toString(), "");
      AppMethodBeat.o(49202);
      continue;
      localObject = this.AgX.get3DesVerifyCode();
      AppMethodBeat.o(49202);
      continue;
      localObject = this.AgX;
      b.dNA();
      localObject = ((TenpaySecureEditText)localObject).getEncryptDataWithHash(true, b.dNB());
      AppMethodBeat.o(49202);
    }
  }

  public void onFocusChange(View paramView, boolean paramBoolean)
  {
    AppMethodBeat.i(49213);
    if (this.gJD != null)
      this.gJD.onFocusChange(this, paramBoolean);
    ab.d("MicroMsg.EditHintView", "View:" + this.gJI + ", editType:" + this.gJJ + " onFocusChange to " + paramBoolean);
    if (!this.gJN)
    {
      this.gJE.setEnabled(false);
      AppMethodBeat.o(49213);
    }
    while (true)
    {
      return;
      this.gJE.setEnabled(true);
      AppMethodBeat.o(49213);
    }
  }

  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    boolean bool = true;
    AppMethodBeat.i(49209);
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
      AppMethodBeat.o(49209);
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
      label82: AppMethodBeat.o(49209);
    }
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(49189);
    int i;
    int j;
    if ((this.gJJ != 7) && (this.gJJ != 17) && (this.gJJ != 14))
    {
      i = paramInt1;
      j = paramInt2;
      if (this.gJJ != 15);
    }
    else
    {
      setMeasuredDimension(getDefaultSize(BackwardSupportUtil.b.b(getContext(), 960.0F), paramInt1), getDefaultSize(BackwardSupportUtil.b.b(getContext(), 720.0F), paramInt2));
      paramInt2 = getMeasuredWidth();
      if ((this.gJJ != 7) && (this.gJJ != 17))
        break label153;
      paramInt1 = paramInt2 / 6;
    }
    while (true)
    {
      i = View.MeasureSpec.makeMeasureSpec(paramInt2, 1073741824);
      j = View.MeasureSpec.makeMeasureSpec(paramInt1, 1073741824);
      setMeasuredDimension(getDefaultSize(paramInt2, i), getDefaultSize(paramInt1, j));
      super.onMeasure(i, j);
      AppMethodBeat.o(49189);
      return;
      label153: if (this.gJJ == 14)
        paramInt1 = paramInt2 / 3;
      else
        paramInt1 = paramInt2 / 4;
    }
  }

  public void set3DesValStr(String paramString)
  {
    AppMethodBeat.i(49194);
    switch (this.gJJ)
    {
    default:
      this.AgX.setText(paramString);
      this.AgX.setSelection(this.AgX.getText().length());
      AppMethodBeat.o(49194);
    case 1:
    }
    while (true)
    {
      return;
      if ((!bo.isNullOrNil(paramString)) && (paramString.length() <= 5))
      {
        this.AgX.setSelection(0);
        this.AgX.set3DesEncrptData(paramString);
        this.gJP = (24 - paramString.length());
        this.AgX.setFilters(new InputFilter[] { new InputFilter.LengthFilter(this.gJP) });
        AppMethodBeat.o(49194);
      }
      else
      {
        this.AgX.set3DesEncrptData(paramString);
        this.AgX.setSelection(this.AgX.getText().length());
        AppMethodBeat.o(49194);
      }
    }
  }

  public void setClickable(boolean paramBoolean)
  {
    AppMethodBeat.i(49208);
    super.setClickable(paramBoolean);
    this.hNO = paramBoolean;
    if (!paramBoolean)
    {
      this.AgX.setEnabled(false);
      if (!this.gJL)
        this.AgX.setTextColor(getResources().getColor(2131690205));
      while (true)
      {
        this.AgX.setFocusable(false);
        this.AgX.setClickable(false);
        AppMethodBeat.o(49208);
        return;
        this.AgX.setTextColor(getResources().getColor(this.Aha));
      }
    }
    this.AgX.setEnabled(true);
    if (!this.gJL)
      this.AgX.setTextColor(getResources().getColor(2131690209));
    while (true)
    {
      this.AgX.setFocusable(true);
      this.AgX.setClickable(true);
      AppMethodBeat.o(49208);
      break;
      this.AgX.setTextColor(getResources().getColor(this.Aha));
    }
  }

  public void setEditBG(int paramInt)
  {
    AppMethodBeat.i(49197);
    if (this.AgX != null)
      this.AgX.setBackgroundResource(paramInt);
    AppMethodBeat.o(49197);
  }

  public void setEllipsize(TextUtils.TruncateAt paramTruncateAt)
  {
    AppMethodBeat.i(49206);
    this.AgX.setEllipsize(paramTruncateAt);
    AppMethodBeat.o(49206);
  }

  public void setEnabled(boolean paramBoolean)
  {
    AppMethodBeat.i(49207);
    super.setEnabled(paramBoolean);
    this.gJL = paramBoolean;
    this.gJG.setEnabled(true);
    AppMethodBeat.o(49207);
  }

  public void setEncryptType(int paramInt)
  {
    AppMethodBeat.i(49198);
    if (r.YM())
      this.AgX.setSecureEncrypt(new a(paramInt));
    AppMethodBeat.o(49198);
  }

  public void setHintStr(String paramString)
  {
    AppMethodBeat.i(49190);
    this.AgX.setHint(paramString);
    AppMethodBeat.o(49190);
  }

  public void setIdentifyCardType(int paramInt)
  {
    AppMethodBeat.i(49201);
    this.AgZ = paramInt;
    if (paramInt == 1)
    {
      this.AgX.setKeyListener(new EditHintView.6(this));
      AppMethodBeat.o(49201);
    }
    while (true)
    {
      return;
      this.AgX.setInputType(1);
      AppMethodBeat.o(49201);
    }
  }

  public void setImeOptions(int paramInt)
  {
    AppMethodBeat.i(49214);
    this.AgX.setImeOptions(paramInt);
    AppMethodBeat.o(49214);
  }

  public void setInfoIvVisible(int paramInt)
  {
    AppMethodBeat.i(49216);
    this.gJG.setVisibility(paramInt);
    AppMethodBeat.o(49216);
  }

  public void setMaxLen(int paramInt)
  {
    AppMethodBeat.i(49200);
    if (paramInt != -1)
    {
      this.gJP = paramInt;
      this.AgX.setFilters(new InputFilter[] { new InputFilter.LengthFilter(paramInt) });
    }
    AppMethodBeat.o(49200);
  }

  public void setOnClickListener(View.OnClickListener paramOnClickListener)
  {
    AppMethodBeat.i(49210);
    super.setOnClickListener(paramOnClickListener);
    AppMethodBeat.o(49210);
  }

  public void setOnEditorActionListener(TextView.OnEditorActionListener paramOnEditorActionListener)
  {
    AppMethodBeat.i(49215);
    this.AgX.setOnEditorActionListener(paramOnEditorActionListener);
    AppMethodBeat.o(49215);
  }

  public void setOnFocusChangeListener(View.OnFocusChangeListener paramOnFocusChangeListener)
  {
    AppMethodBeat.i(49211);
    super.setOnFocusChangeListener(paramOnFocusChangeListener);
    this.gJD = paramOnFocusChangeListener;
    AppMethodBeat.o(49211);
  }

  public void setOnInfoListener(EditHintView.a parama)
  {
    this.Ahh = parama;
  }

  public void setOnInputValidChangeListener(EditHintView.b paramb)
  {
    this.AgV = paramb;
  }

  public void setPreFilledStr(String paramString)
  {
    AppMethodBeat.i(49192);
    if (!bo.isNullOrNil(paramString))
    {
      this.AgW.setText(paramString);
      this.AgW.setVisibility(0);
      AppMethodBeat.o(49192);
    }
    while (true)
    {
      return;
      this.AgW.setText("");
      this.AgW.setVisibility(8);
      AppMethodBeat.o(49192);
    }
  }

  public void setPreText(String paramString)
  {
    AppMethodBeat.i(49196);
    KeyListener localKeyListener = this.AgX.getKeyListener();
    this.AgX.setInputType(1);
    this.AgX.setKeyListener(null);
    setValStr(paramString);
    this.AgX.setKeyListener(localKeyListener);
    this.mode = 4;
    AppMethodBeat.o(49196);
  }

  public void setShowScanCamera(boolean paramBoolean)
  {
    AppMethodBeat.i(49218);
    this.Ahb = paramBoolean;
    dOu();
    AppMethodBeat.o(49218);
  }

  public void setTipStr(String paramString)
  {
    AppMethodBeat.i(49191);
    this.gJE.setText(paramString);
    AppMethodBeat.o(49191);
  }

  public void setTipTextColor(int paramInt)
  {
    AppMethodBeat.i(49199);
    if (this.gJE != null)
      this.gJE.setTextColor(paramInt);
    AppMethodBeat.o(49199);
  }

  public void setTipWidth(int paramInt)
  {
    AppMethodBeat.i(49188);
    this.AgY = BackwardSupportUtil.b.b(getContext(), paramInt * 1.0F);
    if (this.gJE != null)
    {
      ViewGroup.LayoutParams localLayoutParams = this.gJE.getLayoutParams();
      localLayoutParams.width = this.AgY;
      this.gJE.setLayoutParams(localLayoutParams);
    }
    AppMethodBeat.o(49188);
  }

  public void setValStr(String paramString)
  {
    AppMethodBeat.i(49193);
    switch (this.gJJ)
    {
    default:
      this.AgX.setText(paramString);
      this.AgX.setSelection(this.AgX.getText().length());
      AppMethodBeat.o(49193);
    case 1:
    }
    while (true)
    {
      return;
      if ((!bo.isNullOrNil(paramString)) && (paramString.length() <= 5))
      {
        this.AgX.setSelection(0);
        this.AgX.setBankcardTailNum(paramString);
        this.gJP = (24 - paramString.length());
        this.AgX.setFilters(new InputFilter[] { new InputFilter.LengthFilter(this.gJP) });
        AppMethodBeat.o(49193);
      }
      else
      {
        this.AgX.setText(paramString);
        this.AgX.setSelection(this.AgX.getText().length());
        AppMethodBeat.o(49193);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.wallet_core.ui.EditHintView
 * JD-Core Version:    0.6.2
 */