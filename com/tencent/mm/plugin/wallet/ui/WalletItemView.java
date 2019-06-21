package com.tencent.mm.plugin.wallet.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.Spanned;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wxpay.a.a;

public class WalletItemView extends LinearLayout
{
  private TextView iDT;
  private Object mData;
  private String mTitle;
  private int mType;
  private String peG;
  private int piW;
  private TextView pip;

  public WalletItemView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public WalletItemView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(46452);
    this.piW = 1;
    this.mType = 0;
    this.mData = null;
    paramAttributeSet = paramContext.obtainStyledAttributes(paramAttributeSet, a.a.WalletItemView, paramInt, 0);
    paramInt = paramAttributeSet.getResourceId(2, 0);
    if (paramInt != 0)
      this.mTitle = paramContext.getString(paramInt);
    paramInt = paramAttributeSet.getResourceId(3, 0);
    if (paramInt != 0)
      this.peG = paramContext.getString(paramInt);
    this.piW = paramAttributeSet.getInt(0, 1);
    paramAttributeSet.recycle();
    paramContext = LayoutInflater.from(paramContext).inflate(2130971113, this, true);
    this.iDT = ((TextView)paramContext.findViewById(2131821185));
    this.pip = ((TextView)paramContext.findViewById(2131826598));
    if (this.iDT != null)
      this.iDT.setText(this.mTitle);
    if (this.pip != null)
    {
      this.pip.setText(this.peG);
      this.pip.setLines(this.piW);
    }
    AppMethodBeat.o(46452);
  }

  public Object getData()
  {
    return this.mData;
  }

  public int getType()
  {
    return this.mType;
  }

  public void setSummary(Spanned paramSpanned)
  {
    AppMethodBeat.i(46455);
    this.peG = paramSpanned.toString();
    this.pip.setText(this.peG);
    AppMethodBeat.o(46455);
  }

  public void setSummary(String paramString)
  {
    AppMethodBeat.i(46454);
    this.peG = paramString;
    this.pip.setText(this.peG);
    AppMethodBeat.o(46454);
  }

  public void setTitle(String paramString)
  {
    AppMethodBeat.i(46453);
    this.mTitle = paramString;
    this.iDT.setText(this.mTitle);
    AppMethodBeat.o(46453);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.ui.WalletItemView
 * JD-Core Version:    0.6.2
 */