package com.tencent.mm.ui.base.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ad.a.a;

public final class PluginTextPreference extends Preference
{
  private TextView eku;
  private ImageView pnv;
  private String text;
  private int textColor;
  public int visibility;
  public int yCV;

  public PluginTextPreference(Context paramContext)
  {
    this(paramContext, null);
  }

  public PluginTextPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public PluginTextPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(107250);
    this.pnv = null;
    this.eku = null;
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, a.a.PluginTextPreference);
    setLayoutResource(paramContext.getResourceId(1, 2130970161));
    this.yCV = paramContext.getResourceId(0, 0);
    this.text = paramContext.getString(2);
    this.textColor = paramContext.getColor(3, -7039852);
    paramContext.recycle();
    AppMethodBeat.o(107250);
  }

  public final void NV(int paramInt)
  {
    AppMethodBeat.i(107251);
    this.text = this.mContext.getString(paramInt);
    AppMethodBeat.o(107251);
  }

  protected final void onBindView(View paramView)
  {
    AppMethodBeat.i(107252);
    super.onBindView(paramView);
    this.pnv = ((ImageView)paramView.findViewById(2131822184));
    this.pnv.setImageResource(this.yCV);
    this.pnv.setVisibility(this.visibility);
    this.eku = ((TextView)paramView.findViewById(2131821513));
    this.eku.setText(this.text);
    this.eku.setTextColor(this.textColor);
    AppMethodBeat.o(107252);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.preference.PluginTextPreference
 * JD-Core Version:    0.6.2
 */