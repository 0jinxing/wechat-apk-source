package com.tenpay.android.wechat;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.AccessibilityDelegate;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class MyKeyboardWindow extends LinearLayout
{
  public static final int X_MODE_CHARACTER = 1;
  public static final int X_MODE_DOT = 2;
  public static final int X_MODE_NONE = 0;
  private Context mContext;
  private EditText mInputEditText;
  private Button mKey0;
  private Button mKey1;
  private Button mKey2;
  private Button mKey3;
  private Button mKey4;
  private Button mKey5;
  private Button mKey6;
  private Button mKey7;
  private Button mKey8;
  private Button mKey9;
  private ImageButton mKeyD;
  private Button mKeyX;
  private int mXMode;

  public MyKeyboardWindow(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(5484);
    this.mXMode = 0;
    init(paramContext);
    AppMethodBeat.o(5484);
  }

  public MyKeyboardWindow(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(5485);
    this.mXMode = 0;
    init(paramContext);
    AppMethodBeat.o(5485);
  }

  private void init(Context paramContext)
  {
    AppMethodBeat.i(5486);
    this.mContext = paramContext.getApplicationContext();
    TenpayTTSUtil.init(paramContext);
    paramContext = LayoutInflater.from(paramContext).inflate(this.mContext.getResources().getIdentifier("tenpay_number_keyboard", "layout", this.mContext.getPackageName()), this, true);
    this.mKey1 = ((Button)paramContext.findViewById(getId("tenpay_keyboard_1")));
    this.mKey2 = ((Button)paramContext.findViewById(getId("tenpay_keyboard_2")));
    this.mKey3 = ((Button)paramContext.findViewById(getId("tenpay_keyboard_3")));
    this.mKey4 = ((Button)paramContext.findViewById(getId("tenpay_keyboard_4")));
    this.mKey5 = ((Button)paramContext.findViewById(getId("tenpay_keyboard_5")));
    this.mKey6 = ((Button)paramContext.findViewById(getId("tenpay_keyboard_6")));
    this.mKey7 = ((Button)paramContext.findViewById(getId("tenpay_keyboard_7")));
    this.mKey8 = ((Button)paramContext.findViewById(getId("tenpay_keyboard_8")));
    this.mKey9 = ((Button)paramContext.findViewById(getId("tenpay_keyboard_9")));
    this.mKeyX = ((Button)paramContext.findViewById(getId("tenpay_keyboard_x")));
    this.mKey0 = ((Button)paramContext.findViewById(getId("tenpay_keyboard_0")));
    this.mKeyD = ((ImageButton)paramContext.findViewById(getId("tenpay_keyboard_d")));
    paramContext = new MyKeyboardWindow.1(this);
    if (Build.VERSION.SDK_INT >= 14)
    {
      this.mKey1.setContentDescription("1");
      this.mKey2.setContentDescription("2");
      this.mKey3.setContentDescription("3");
      this.mKey4.setContentDescription("4");
      this.mKey5.setContentDescription("5");
      this.mKey6.setContentDescription("6");
      this.mKey7.setContentDescription("7");
      this.mKey8.setContentDescription("8");
      this.mKey9.setContentDescription("9");
      this.mKey0.setContentDescription("0");
      this.mKeyX.setContentDescription("字母X");
      this.mKeyD.setContentDescription("删除");
    }
    this.mKey1.setOnClickListener(paramContext);
    this.mKey2.setOnClickListener(paramContext);
    this.mKey3.setOnClickListener(paramContext);
    this.mKey4.setOnClickListener(paramContext);
    this.mKey5.setOnClickListener(paramContext);
    this.mKey6.setOnClickListener(paramContext);
    this.mKey7.setOnClickListener(paramContext);
    this.mKey8.setOnClickListener(paramContext);
    this.mKey9.setOnClickListener(paramContext);
    this.mKeyX.setOnClickListener(paramContext);
    this.mKey0.setOnClickListener(paramContext);
    this.mKeyD.setOnClickListener(paramContext);
    AppMethodBeat.o(5486);
  }

  protected int getDrawableId(String paramString)
  {
    AppMethodBeat.i(5492);
    int i = this.mContext.getResources().getIdentifier(paramString, "drawable", this.mContext.getPackageName());
    AppMethodBeat.o(5492);
    return i;
  }

  protected int getId(String paramString)
  {
    AppMethodBeat.i(5491);
    int i = this.mContext.getResources().getIdentifier(paramString, "id", this.mContext.getPackageName());
    AppMethodBeat.o(5491);
    return i;
  }

  public void onDetachedFromWindow()
  {
    AppMethodBeat.i(5493);
    super.onDetachedFromWindow();
    TenpayTTSUtil.destroy();
    AppMethodBeat.o(5493);
  }

  public void resetSecureAccessibility()
  {
    AppMethodBeat.i(5488);
    this.mKey0.setAccessibilityDelegate(null);
    this.mKey1.setAccessibilityDelegate(null);
    this.mKey2.setAccessibilityDelegate(null);
    this.mKey3.setAccessibilityDelegate(null);
    this.mKey4.setAccessibilityDelegate(null);
    this.mKey5.setAccessibilityDelegate(null);
    this.mKey6.setAccessibilityDelegate(null);
    this.mKey7.setAccessibilityDelegate(null);
    this.mKey8.setAccessibilityDelegate(null);
    this.mKey9.setAccessibilityDelegate(null);
    this.mKeyX.setAccessibilityDelegate(null);
    this.mKeyD.setAccessibilityDelegate(null);
    AppMethodBeat.o(5488);
  }

  public void setInputEditText(EditText paramEditText)
  {
    AppMethodBeat.i(5489);
    if (paramEditText != null)
    {
      this.mInputEditText = paramEditText;
      int i = this.mInputEditText.getImeOptions();
      paramEditText = this.mInputEditText.getImeActionLabel();
      if (!TextUtils.isEmpty(paramEditText))
        this.mKeyX.setText(paramEditText);
      switch (i)
      {
      default:
      case 1:
      }
    }
    while (true)
    {
      AppMethodBeat.o(5489);
      return;
      this.mXMode = 0;
      if (TextUtils.isEmpty(paramEditText))
        this.mKeyX.setText("");
    }
  }

  public void setSecureAccessibility(View.AccessibilityDelegate paramAccessibilityDelegate)
  {
    AppMethodBeat.i(5487);
    this.mKey0.setAccessibilityDelegate(paramAccessibilityDelegate);
    this.mKey1.setAccessibilityDelegate(paramAccessibilityDelegate);
    this.mKey2.setAccessibilityDelegate(paramAccessibilityDelegate);
    this.mKey3.setAccessibilityDelegate(paramAccessibilityDelegate);
    this.mKey4.setAccessibilityDelegate(paramAccessibilityDelegate);
    this.mKey5.setAccessibilityDelegate(paramAccessibilityDelegate);
    this.mKey6.setAccessibilityDelegate(paramAccessibilityDelegate);
    this.mKey7.setAccessibilityDelegate(paramAccessibilityDelegate);
    this.mKey8.setAccessibilityDelegate(paramAccessibilityDelegate);
    this.mKey9.setAccessibilityDelegate(paramAccessibilityDelegate);
    this.mKeyX.setAccessibilityDelegate(paramAccessibilityDelegate);
    this.mKeyD.setAccessibilityDelegate(paramAccessibilityDelegate);
    AppMethodBeat.o(5487);
  }

  public void setXMode(int paramInt)
  {
    AppMethodBeat.i(5490);
    this.mXMode = paramInt;
    switch (paramInt)
    {
    default:
      this.mXMode = 0;
      AppMethodBeat.o(5490);
    case 0:
    case 1:
    case 2:
    }
    while (true)
    {
      return;
      this.mKeyX.setText("");
      this.mKeyX.setBackgroundResource(getDrawableId("tenpay_keyitem_bottom"));
      AppMethodBeat.o(5490);
      continue;
      this.mKeyX.setText("X");
      this.mKeyX.setBackgroundResource(getDrawableId("tenpay_keybtn_bottom"));
      AppMethodBeat.o(5490);
      continue;
      this.mKeyX.setText(".");
      this.mKeyX.setBackgroundResource(getDrawableId("tenpay_keybtn_bottom"));
      AppMethodBeat.o(5490);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tenpay.android.wechat.MyKeyboardWindow
 * JD-Core Version:    0.6.2
 */