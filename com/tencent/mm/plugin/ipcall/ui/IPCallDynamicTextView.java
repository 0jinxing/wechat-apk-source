package com.tencent.mm.plugin.ipcall.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ak;
import java.math.BigDecimal;
import java.text.DecimalFormat;

public class IPCallDynamicTextView extends TextView
{
  private ak mHandler;
  private int mHeight;
  private String mValue;
  DecimalFormat nCA;
  private String nCB;
  private String nCC;
  private int nCt;
  private double nCu;
  private double nCv;
  private double nCw;
  private boolean nCx;
  private int nCy;
  private int nCz;

  public IPCallDynamicTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(22144);
    this.nCy = 4000;
    this.nCz = 50;
    this.nCA = new DecimalFormat("0.00");
    this.nCB = "";
    this.nCC = "";
    this.mHandler = new IPCallDynamicTextView.1(this);
    init();
    AppMethodBeat.o(22144);
  }

  public IPCallDynamicTextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(22145);
    this.nCy = 4000;
    this.nCz = 50;
    this.nCA = new DecimalFormat("0.00");
    this.nCB = "";
    this.nCC = "";
    this.mHandler = new IPCallDynamicTextView.1(this);
    init();
    AppMethodBeat.o(22145);
  }

  public static String Pg(String paramString)
  {
    AppMethodBeat.i(22148);
    String str1 = "";
    for (int i = 0; (i < paramString.length()) && (!Character.isDigit(paramString.charAt(i))); i++)
      str1 = str1 + paramString.charAt(i);
    String str2 = "";
    for (i = paramString.length() - 1; (i > 0) && (!Character.isDigit(paramString.charAt(i))); i--)
      str2 = str2 + paramString.charAt(i);
    paramString = paramString.substring(str1.length(), paramString.length() - str2.length());
    AppMethodBeat.o(22148);
    return paramString;
  }

  private void init()
  {
    AppMethodBeat.i(22146);
    getViewTreeObserver().addOnGlobalLayoutListener(new IPCallDynamicTextView.2(this));
    AppMethodBeat.o(22146);
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(22149);
    super.onMeasure(paramInt1, paramInt2);
    this.mHeight = getMeasuredHeight();
    AppMethodBeat.o(22149);
  }

  public void setLocHeight(int paramInt)
  {
    this.nCt = paramInt;
  }

  public final void setValue(String paramString1, String paramString2)
  {
    AppMethodBeat.i(22147);
    if ((paramString1 == null) || (paramString1.length() <= 0) || (paramString2 == null) || (paramString2.length() <= 0))
    {
      setText(paramString2);
      AppMethodBeat.o(22147);
    }
    while (true)
    {
      return;
      try
      {
        this.nCv = Double.parseDouble(Pg(paramString1));
        this.nCB = "";
        for (i = 0; (i < paramString2.length()) && (!Character.isDigit(paramString2.charAt(i))); i++)
          this.nCB += paramString2.charAt(i);
      }
      catch (NumberFormatException paramString1)
      {
        setText(paramString2);
        AppMethodBeat.o(22147);
      }
      continue;
      this.nCC = "";
      for (int i = paramString2.length() - 1; (i > 0) && (!Character.isDigit(paramString2.charAt(i))); i--)
        this.nCC += paramString2.charAt(i);
      paramString1 = paramString2.substring(this.nCB.length(), paramString2.length() - this.nCC.length());
      try
      {
        this.nCw = Double.parseDouble(paramString1);
        this.mValue = paramString2;
        this.nCu = ((this.nCw - this.nCv) / (this.nCy / this.nCz));
        if (this.nCu != 0.0D)
          break label290;
        setText(paramString2);
        AppMethodBeat.o(22147);
      }
      catch (NumberFormatException paramString1)
      {
        setText(paramString2);
        AppMethodBeat.o(22147);
      }
      continue;
      label290: this.nCu = new BigDecimal(this.nCu).setScale(2, 4).doubleValue();
      if (isShown())
        this.mHandler.sendEmptyMessage(1);
      AppMethodBeat.o(22147);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.ui.IPCallDynamicTextView
 * JD-Core Version:    0.6.2
 */