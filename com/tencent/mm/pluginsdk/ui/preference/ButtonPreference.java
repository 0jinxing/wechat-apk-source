package com.tencent.mm.pluginsdk.ui.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.R.a;
import com.tencent.mm.ui.ah;
import com.tencent.mm.ui.base.preference.Preference;

public class ButtonPreference extends Preference
{
  private Drawable icon;
  private Context mContext;
  private View omq;
  private TextView sW;
  private int textColor;
  private ImageView vqi;
  private int vqj;
  private String vqk;
  public int vql;

  public ButtonPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(28020);
    setLayoutResource(2130970127);
    c(paramContext, paramAttributeSet);
    AppMethodBeat.o(28020);
  }

  public ButtonPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(28019);
    setLayoutResource(2130970127);
    c(paramContext, paramAttributeSet);
    AppMethodBeat.o(28019);
  }

  private void c(Context paramContext, AttributeSet paramAttributeSet)
  {
    AppMethodBeat.i(28022);
    this.mContext = paramContext;
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, R.a.ButtonPreference);
    this.vqj = paramContext.getColor(0, 0);
    this.textColor = paramContext.getColor(2, 0);
    this.vqk = paramContext.getString(3);
    this.icon = paramContext.getDrawable(1);
    paramContext.recycle();
    AppMethodBeat.o(28022);
  }

  public final void ed(String paramString, int paramInt)
  {
    AppMethodBeat.i(28023);
    this.vqk = paramString;
    this.textColor = paramInt;
    if (this.sW != null)
    {
      this.sW.setText(paramString);
      this.sW.setTextColor(paramInt);
      this.sW.getPaint().setFakeBoldText(true);
    }
    AppMethodBeat.o(28023);
  }

  public final void onBindView(View paramView)
  {
    AppMethodBeat.i(28024);
    super.onBindView(paramView);
    this.vqi = ((ImageView)paramView.findViewById(2131820915));
    this.sW = ((TextView)paramView.findViewById(2131820674));
    if ((this.vqi != null) && (this.icon != null))
    {
      this.vqi.setVisibility(0);
      this.vqi.setImageDrawable(ah.e(this.icon, this.vqj));
    }
    if (this.sW != null)
    {
      this.sW.setText(this.vqk);
      this.sW.setTextColor(this.textColor);
      this.sW.getPaint().setFakeBoldText(true);
    }
    if ((this.omq != null) && (this.vql != 0))
      this.omq.setId(this.vql);
    AppMethodBeat.o(28024);
  }

  public final View onCreateView(ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(28021);
    if (this.omq == null)
      this.omq = LayoutInflater.from(this.mContext).inflate(2130970373, null);
    paramViewGroup = this.omq;
    AppMethodBeat.o(28021);
    return paramViewGroup;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.preference.ButtonPreference
 * JD-Core Version:    0.6.2
 */