package com.tencent.mm.plugin.product.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.Spanned;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wxpay.a.a;

public class MallProductItemView extends LinearLayout
{
  private TextView iDT;
  private Object mData;
  private String mTitle;
  private int mType;
  private String peG;
  private int piW;
  private TextView pip;
  private ImageView piq;

  public MallProductItemView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public MallProductItemView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(44079);
    this.piW = 1;
    this.mType = 0;
    this.mData = null;
    paramAttributeSet = paramContext.obtainStyledAttributes(paramAttributeSet, a.a.MallProductItemView, paramInt, 0);
    paramInt = paramAttributeSet.getResourceId(2, 0);
    if (paramInt != 0)
      this.mTitle = paramContext.getString(paramInt);
    paramInt = paramAttributeSet.getResourceId(3, 0);
    if (paramInt != 0)
      this.peG = paramContext.getString(paramInt);
    this.piW = paramAttributeSet.getInt(0, 1);
    paramAttributeSet.recycle();
    paramContext = LayoutInflater.from(paramContext).inflate(2130970390, this, true);
    this.iDT = ((TextView)paramContext.findViewById(2131821185));
    this.pip = ((TextView)paramContext.findViewById(2131826598));
    this.piq = ((ImageView)paramContext.findViewById(2131826599));
    this.iDT.setText(this.mTitle);
    this.pip.setText(this.peG);
    this.pip.setLines(this.piW);
    AppMethodBeat.o(44079);
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
    AppMethodBeat.i(44082);
    this.peG = paramSpanned.toString();
    this.pip.setText(this.peG);
    AppMethodBeat.o(44082);
  }

  public void setSummary(String paramString)
  {
    AppMethodBeat.i(44081);
    this.peG = paramString;
    this.pip.setText(this.peG);
    AppMethodBeat.o(44081);
  }

  public void setTitle(String paramString)
  {
    AppMethodBeat.i(44080);
    this.mTitle = paramString;
    this.iDT.setText(this.mTitle);
    AppMethodBeat.o(44080);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.product.ui.MallProductItemView
 * JD-Core Version:    0.6.2
 */