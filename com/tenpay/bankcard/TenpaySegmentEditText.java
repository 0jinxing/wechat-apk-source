package com.tenpay.bankcard;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.os.Build.VERSION;
import android.text.InputFilter;
import android.text.InputFilter.LengthFilter;
import android.util.AttributeSet;
import android.view.View.OnClickListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.wallet_core.b;
import com.tenpay.android.wechat.MyKeyboardWindow;
import com.tenpay.android.wechat.TenpayUtil;
import com.tenpay.ndk.Encrypt;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class TenpaySegmentEditText extends LinearLayout
{
  private static String mTimeStamp;
  private final int BG_LINE_COLOR;
  private final int BG_LINE_HEIGHT;
  private final int BG_LINE_SIZE;
  private final String TAG;
  private Context mContext;
  private List<EditText> mEditArray;
  TenpaySegmentEditText.EditState mEditState;
  private MyKeyboardWindow mKeyboard;
  private boolean mNoFocus;
  private View.OnClickListener mOnClickListener;
  private Paint mPaintBg;
  private Paint mPaintSplit;

  public TenpaySegmentEditText(Context paramContext)
  {
    this(paramContext, null);
    AppMethodBeat.i(49524);
    this.mContext = paramContext;
    init();
    AppMethodBeat.o(49524);
  }

  public TenpaySegmentEditText(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(49525);
    this.TAG = "MyTag";
    this.BG_LINE_COLOR = -11615450;
    this.BG_LINE_SIZE = 4;
    this.BG_LINE_HEIGHT = 9;
    this.mOnClickListener = null;
    this.mNoFocus = true;
    this.mEditState = TenpaySegmentEditText.EditState.DEFAULT;
    this.mContext = null;
    this.mEditArray = new ArrayList();
    this.mKeyboard = null;
    this.mContext = paramContext;
    init();
    AppMethodBeat.o(49525);
  }

  private void drawBackgroundLine(Canvas paramCanvas)
  {
    AppMethodBeat.i(49531);
    int i = getWidth();
    int j = getHeight();
    float f1 = j - 4;
    paramCanvas.drawRect(0.0F, f1, i, j, this.mPaintBg);
    float f2 = f1 - 9.0F;
    int k = this.mEditArray.size();
    paramCanvas.drawRect(0.0F, f2, 4.0F, f1, this.mPaintBg);
    j = 0;
    float f3 = 0.0F;
    if (j < k)
      if (j != k - 1)
        break label157;
    label157: for (i = -4; ; i = -2)
    {
      f3 += ((EditText)this.mEditArray.get(j)).getWidth() + i;
      paramCanvas.drawRect(f3, f2, f3 + 4.0F, f1, this.mPaintBg);
      float f4 = i;
      j++;
      f3 -= f4;
      break;
      AppMethodBeat.o(49531);
      return;
    }
  }

  private String getInputText()
  {
    AppMethodBeat.i(49532);
    Object localObject = new StringBuffer();
    for (int i = 0; i < this.mEditArray.size(); i++)
      ((StringBuffer)localObject).append(((EditText)this.mEditArray.get(i)).getText().toString());
    localObject = ((StringBuffer)localObject).toString();
    if ((localObject == null) || (((String)localObject).length() == 0))
    {
      localObject = null;
      AppMethodBeat.o(49532);
    }
    while (true)
    {
      return localObject;
      ((String)localObject).trim().replaceAll(" ", "");
      AppMethodBeat.o(49532);
    }
  }

  private void init()
  {
    AppMethodBeat.i(49526);
    setBackgroundColor(-1);
    setOrientation(0);
    setIsBankcardFormat(true);
    this.mPaintSplit = new Paint();
    this.mPaintSplit.setStrokeWidth(0.0F);
    this.mPaintSplit.setColor(-7829368);
    this.mPaintBg = new Paint();
    this.mPaintBg.setColor(-11615450);
    this.mPaintBg.setStyle(Paint.Style.FILL);
    AppMethodBeat.o(49526);
  }

  private boolean isMatchPattern(String paramString1, String paramString2)
  {
    boolean bool1 = false;
    AppMethodBeat.i(49536);
    if (paramString2 != null);
    while (true)
    {
      try
      {
        bool2 = Pattern.compile(paramString2).matcher(paramString1).matches();
        AppMethodBeat.o(49536);
        return bool2;
      }
      catch (Exception paramString1)
      {
        AppMethodBeat.o(49536);
        bool2 = bool1;
        continue;
      }
      AppMethodBeat.o(49536);
      boolean bool2 = bool1;
    }
  }

  public static void setNoSystemInputOnEditText(EditText paramEditText)
  {
    AppMethodBeat.i(49538);
    if (Build.VERSION.SDK_INT < 11)
    {
      paramEditText.setInputType(0);
      AppMethodBeat.o(49538);
    }
    while (true)
    {
      return;
      try
      {
        Method localMethod1 = EditText.class.getMethod("setShowSoftInputOnFocus", new Class[] { Boolean.TYPE });
        localMethod1.setAccessible(true);
        localMethod1.invoke(paramEditText, new Object[] { Boolean.FALSE });
        AppMethodBeat.o(49538);
      }
      catch (NoSuchMethodException localNoSuchMethodException)
      {
        try
        {
          Method localMethod2 = EditText.class.getMethod("setSoftInputShownOnFocus", new Class[] { Boolean.TYPE });
          localMethod2.setAccessible(true);
          localMethod2.invoke(paramEditText, new Object[] { Boolean.FALSE });
          AppMethodBeat.o(49538);
        }
        catch (Exception localException)
        {
          paramEditText.setInputType(0);
          AppMethodBeat.o(49538);
        }
      }
      catch (Exception paramEditText)
      {
        AppMethodBeat.o(49538);
      }
    }
  }

  public static void setSalt(String paramString)
  {
    mTimeStamp = paramString;
  }

  public final void ClearInput()
  {
  }

  public final String get3DesEncrptData()
  {
    AppMethodBeat.i(49534);
    String str = getInputText();
    Object localObject;
    if ((str == null) || (str.length() == 0))
    {
      localObject = null;
      AppMethodBeat.o(49534);
    }
    while (true)
    {
      return localObject;
      localObject = new Encrypt();
      localObject = ((Encrypt)localObject).desedeEncode(str, ((Encrypt)localObject).getRandomKey());
      AppMethodBeat.o(49534);
    }
  }

  public final String getEncryptDataWithHash(boolean paramBoolean)
  {
    AppMethodBeat.i(49533);
    Object localObject1 = getInputText();
    Object localObject2;
    if ((localObject1 == null) || (((String)localObject1).length() == 0))
    {
      localObject2 = null;
      AppMethodBeat.o(49533);
    }
    while (true)
    {
      return localObject2;
      localObject2 = localObject1;
      if (paramBoolean)
        localObject2 = TenpayUtil.md5HexDigest((String)localObject1);
      localObject1 = new Encrypt();
      if (mTimeStamp != null)
        ((Encrypt)localObject1).setTimeStamp(mTimeStamp);
      b.dNA();
      if (b.dNB())
      {
        localObject2 = ((Encrypt)localObject1).encryptPasswdWithRSA2048((String)localObject2);
        AppMethodBeat.o(49533);
      }
      else
      {
        localObject2 = ((Encrypt)localObject1).encryptPasswd((String)localObject2);
        AppMethodBeat.o(49533);
      }
    }
  }

  public final int getInputLength()
  {
    AppMethodBeat.i(49537);
    String str = getInputText();
    int i;
    if (str == null)
    {
      i = 0;
      AppMethodBeat.o(49537);
    }
    while (true)
    {
      return i;
      i = str.length();
      AppMethodBeat.o(49537);
    }
  }

  public final boolean isMatchPattern(String paramString)
  {
    boolean bool1 = false;
    AppMethodBeat.i(49535);
    if (paramString != null);
    while (true)
    {
      try
      {
        String str = getInputText();
        boolean bool2 = Pattern.compile(paramString).matcher(str).matches();
        bool1 = bool2;
        AppMethodBeat.o(49535);
        return bool1;
      }
      catch (Exception paramString)
      {
        AppMethodBeat.o(49535);
        continue;
      }
      AppMethodBeat.o(49535);
    }
  }

  protected final void onDraw(Canvas paramCanvas)
  {
    AppMethodBeat.i(49530);
    super.onDraw(paramCanvas);
    drawBackgroundLine(paramCanvas);
    AppMethodBeat.o(49530);
  }

  public final void setFocusable(boolean paramBoolean)
  {
    AppMethodBeat.i(49529);
    LogUtil.d("MyTag", new Object[] { "setFocusable ".concat(String.valueOf(paramBoolean)) });
    for (int i = 0; i < this.mEditArray.size(); i++)
    {
      EditText localEditText = (EditText)this.mEditArray.get(i);
      localEditText.setFocusable(paramBoolean);
      localEditText.setFocusableInTouchMode(paramBoolean);
    }
    AppMethodBeat.o(49529);
  }

  public final void setIsBankcardFormat(boolean paramBoolean)
  {
    if (paramBoolean)
      this.mEditState = TenpaySegmentEditText.EditState.BANKCARD;
    while (true)
    {
      return;
      if (TenpaySegmentEditText.EditState.BANKCARD == this.mEditState)
        this.mEditState = TenpaySegmentEditText.EditState.DEFAULT;
    }
  }

  public final void setKeyboard(MyKeyboardWindow paramMyKeyboardWindow)
  {
    this.mKeyboard = paramMyKeyboardWindow;
  }

  public final void setOnClickListener(View.OnClickListener paramOnClickListener)
  {
    this.mOnClickListener = paramOnClickListener;
  }

  public final void setText(String paramString)
  {
    AppMethodBeat.i(49527);
    setText(paramString, null);
    AppMethodBeat.o(49527);
  }

  public final void setText(String paramString1, String paramString2)
  {
    AppMethodBeat.i(49528);
    Encrypt localEncrypt = new Encrypt();
    String str = paramString2;
    if (bo.isNullOrNil(paramString2))
      str = localEncrypt.getRandomKey();
    paramString1 = localEncrypt.desedeDecode(paramString1, str).split("-");
    removeAllViews();
    this.mNoFocus = true;
    this.mEditArray.clear();
    for (int i = 0; i < paramString1.length; i++)
    {
      paramString2 = new EditText(this.mContext);
      paramString2.setText(paramString1[i]);
      paramString2.setMaxLines(1);
      paramString2.setFilters(new InputFilter[] { new InputFilter.LengthFilter(paramString1[i].length()) });
      paramString2.setGravity(17);
      paramString2.setInputType(2);
      paramString2.setBackgroundColor(0);
      paramString2.setSelectAllOnFocus(true);
      paramString2.setOnClickListener(new TenpaySegmentEditText.1(this, paramString2));
      setNoSystemInputOnEditText(paramString2);
      ((InputMethodManager)this.mContext.getSystemService("input_method")).hideSoftInputFromWindow(paramString2.getWindowToken(), 2);
      paramString2.setOnFocusChangeListener(new TenpaySegmentEditText.2(this, paramString2));
      addView(paramString2, new LinearLayout.LayoutParams(-2, -1, paramString1[i].length()));
      this.mEditArray.add(paramString2);
    }
    setFocusable(false);
    AppMethodBeat.o(49528);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tenpay.bankcard.TenpaySegmentEditText
 * JD-Core Version:    0.6.2
 */