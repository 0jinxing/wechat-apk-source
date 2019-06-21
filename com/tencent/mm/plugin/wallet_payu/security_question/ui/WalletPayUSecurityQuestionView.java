package com.tencent.mm.plugin.wallet_payu.security_question.ui;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wxpay.a.a;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.tools.CustomFitTextView;

public class WalletPayUSecurityQuestionView extends LinearLayout
{
  private Context mContext;
  private TextView tUW;
  private CustomFitTextView tUX;
  private String tUY;

  public WalletPayUSecurityQuestionView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, -1);
  }

  public WalletPayUSecurityQuestionView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(48594);
    this.mContext = paramContext;
    Object localObject = "";
    paramContext = "";
    boolean bool;
    if (paramAttributeSet != null)
    {
      TypedArray localTypedArray = this.mContext.obtainStyledAttributes(paramAttributeSet, a.a.EditHintView, -1, 0);
      paramInt = localTypedArray.getResourceId(7, 0);
      paramAttributeSet = (AttributeSet)localObject;
      if (paramInt != 0)
        paramAttributeSet = this.mContext.getString(paramInt);
      paramInt = localTypedArray.getResourceId(6, 0);
      if (paramInt != 0)
        paramContext = this.mContext.getString(paramInt);
      bool = localTypedArray.getBoolean(2, false);
      localTypedArray.recycle();
    }
    while (true)
    {
      localObject = LayoutInflater.from(this.mContext).inflate(2130970359, this, true);
      this.tUW = ((TextView)((View)localObject).findViewById(2131821051));
      this.tUX = ((CustomFitTextView)((View)localObject).findViewById(2131823383));
      this.tUW.setText(paramAttributeSet);
      paramAttributeSet = this.tUX;
      paramAttributeSet.a(paramContext, paramAttributeSet.maxLines, paramAttributeSet.zBN, paramAttributeSet.zBL, paramAttributeSet.getResources().getColor(2131690164));
      if (!bool)
      {
        this.tUX.setEnabled(false);
        this.tUX.setFocusable(false);
        this.tUX.setClickable(false);
        this.tUX.setBackgroundResource(2130840857);
        setBackgroundResource(2130839162);
        AppMethodBeat.o(48594);
      }
      while (true)
      {
        return;
        this.tUX.setEnabled(false);
        this.tUX.setTextColor(getResources().getColor(2131690778));
        this.tUX.setFocusable(false);
        this.tUX.setClickable(false);
        this.tUX.setBackgroundResource(2130840857);
        setBackgroundResource(2130838396);
        AppMethodBeat.o(48594);
      }
      bool = false;
      paramAttributeSet = "";
    }
  }

  public final boolean asa()
  {
    AppMethodBeat.i(48597);
    boolean bool;
    if (!bo.isNullOrNil(this.tUY))
    {
      bool = true;
      AppMethodBeat.o(48597);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(48597);
    }
  }

  public String getCurrentQuestion()
  {
    return this.tUY;
  }

  public void setQuestionText(String paramString)
  {
    AppMethodBeat.i(48595);
    this.tUY = paramString;
    KeyListener localKeyListener = this.tUX.getKeyListener();
    this.tUX.setInputType(1);
    this.tUX.setKeyListener(null);
    setValStr(paramString);
    this.tUX.setKeyListener(localKeyListener);
    AppMethodBeat.o(48595);
  }

  public void setValStr(String paramString)
  {
    AppMethodBeat.i(48596);
    CustomFitTextView localCustomFitTextView = this.tUX;
    localCustomFitTextView.a(paramString, 3, false, -1, localCustomFitTextView.getCurrentTextColor());
    AppMethodBeat.o(48596);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_payu.security_question.ui.WalletPayUSecurityQuestionView
 * JD-Core Version:    0.6.2
 */