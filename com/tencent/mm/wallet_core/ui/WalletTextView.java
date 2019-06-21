package com.tencent.mm.wallet_core.ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.Selection;
import android.util.AttributeSet;
import android.widget.TextView;
import android.widget.TextView.BufferType;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.h;
import com.tencent.mm.plugin.secinforeport.a.d;
import com.tencent.mm.plugin.wxpay.a.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.wallet_core.f.a;
import java.util.WeakHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@SuppressLint({"AppCompatCustomView"})
public class WalletTextView extends TextView
{
  private static final String TAG;
  private Object AhP;
  private int AhQ;
  private String mPrefix;
  private Object xzW;

  static
  {
    AppMethodBeat.i(49352);
    TAG = "MicroMsg." + new StringBuilder("weiVtxeTtellaW").reverse().toString();
    AppMethodBeat.o(49352);
  }

  public WalletTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, -1);
  }

  public WalletTextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(49345);
    this.xzW = "";
    this.AhP = "";
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, a.a.WalletTextViewAttrs, paramInt, 0);
    this.AhQ = paramContext.getInteger(0, 4);
    this.mPrefix = paramContext.getString(1);
    paramContext.recycle();
    dON();
    AppMethodBeat.o(49345);
  }

  private void dON()
  {
    AppMethodBeat.i(49347);
    String str = e.QQ(this.AhQ);
    setTypeface(Typeface.createFromAsset(getContext().getAssets(), str));
    AppMethodBeat.o(49347);
  }

  public int getSelectionEnd()
  {
    AppMethodBeat.i(49351);
    int i = Selection.getSelectionEnd((CharSequence)this.xzW);
    AppMethodBeat.o(49351);
    return i;
  }

  public int getSelectionStart()
  {
    AppMethodBeat.i(49350);
    int i = Selection.getSelectionStart((CharSequence)this.xzW);
    AppMethodBeat.o(49350);
    return i;
  }

  @Deprecated
  public CharSequence getText()
  {
    AppMethodBeat.i(49349);
    Object localObject = a.dOl();
    int i;
    if (com.tencent.mm.plugin.normsg.a.b.oTO.cg(this))
      if (((a)localObject).Ags.containsKey(this))
      {
        i = 0;
        if (i == 0)
          break label111;
        localObject = (CharSequence)this.xzW;
        AppMethodBeat.o(49349);
      }
    while (true)
    {
      return localObject;
      ((a)localObject).Ags.put(this, Boolean.TRUE);
      com.tencent.mm.plugin.report.e.pXa.a(715L, 0L, 1L, false);
      if (((com.tencent.mm.wallet_core.f.b.dOo()) || (h.Ms())) && (com.tencent.mm.wallet_core.f.b.dOm()))
        d.qjp.Ch(-2147483648);
      i = 0;
      break;
      i = 1;
      break;
      label111: ab.printErrStackTrace(TAG, new Throwable(), "check point 0.", new Object[0]);
      if ((com.tencent.mm.wallet_core.f.b.dOo()) || (h.Ms()))
      {
        if (com.tencent.mm.wallet_core.f.b.dOn());
        for (localObject = this.AhP; ; localObject = this.xzW)
        {
          localObject = (CharSequence)localObject;
          AppMethodBeat.o(49349);
          break;
        }
      }
      localObject = (CharSequence)this.xzW;
      AppMethodBeat.o(49349);
    }
  }

  public void setPrefix(String paramString)
  {
    this.mPrefix = paramString;
  }

  public void setText(CharSequence paramCharSequence, TextView.BufferType paramBufferType)
  {
    AppMethodBeat.i(49346);
    this.xzW = paramCharSequence;
    String str1 = paramCharSequence.toString();
    if ((str1 == null) || (str1.length() == 0));
    String str2;
    for (Object localObject = ""; ; localObject = str1.replaceAll(str2, ((StringBuilder)localObject).toString()))
    {
      this.AhP = localObject;
      localObject = paramCharSequence;
      if (!bo.isNullOrNil(this.mPrefix))
        localObject = this.mPrefix + paramCharSequence;
      if ((this.AhQ != 4) && (!bo.ac((CharSequence)localObject)) && (Pattern.compile(".*?[a-zA-Z]+.*?").matcher((CharSequence)localObject).matches()))
      {
        ab.i(TAG, "force use std font");
        this.AhQ = 4;
        dON();
      }
      super.setText((CharSequence)localObject, paramBufferType);
      AppMethodBeat.o(49346);
      return;
      localObject = new StringBuilder(7);
      for (int i = 0; i < 7; i++)
        ((StringBuilder)localObject).append((char)(int)(6222620280936476253L >> (6 - i) * 8 & 0xFF));
      str2 = ((StringBuilder)localObject).toString();
      ((StringBuilder)localObject).delete(0, ((StringBuilder)localObject).length());
    }
  }

  public void setTypeface(int paramInt)
  {
    AppMethodBeat.i(49348);
    this.AhQ = paramInt;
    String str = e.QQ(paramInt);
    setTypeface(Typeface.createFromAsset(getContext().getAssets(), str));
    AppMethodBeat.o(49348);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.wallet_core.ui.WalletTextView
 * JD-Core Version:    0.6.2
 */