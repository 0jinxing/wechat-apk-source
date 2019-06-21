package com.tencent.mm.ui.base.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ad.a.a;

public final class ImagePreference extends Preference
{
  private ImageView pnv;
  private e yCd;

  public ImagePreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public ImagePreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(107192);
    this.pnv = null;
    this.yCd = new e();
    setLayoutResource(2130970182);
    setWidgetLayoutResource(2130970202);
    paramAttributeSet = paramContext.obtainStyledAttributes(paramAttributeSet, a.a.ImagePreference);
    paramInt = paramAttributeSet.getResourceId(0, 0);
    if (paramInt > 0)
    {
      paramContext = this.yCd;
      paramContext.resId = paramInt;
      paramContext.bitmap = null;
      this.yCd.l(this.pnv);
    }
    paramAttributeSet.recycle();
    AppMethodBeat.o(107192);
  }

  protected final void onBindView(View paramView)
  {
    AppMethodBeat.i(107194);
    super.onBindView(paramView);
    this.pnv = ((ImageView)paramView.findViewById(2131822184));
    this.yCd.l(this.pnv);
    AppMethodBeat.o(107194);
  }

  protected final View onCreateView(ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(107193);
    paramViewGroup = super.onCreateView(paramViewGroup);
    ViewGroup localViewGroup = (ViewGroup)paramViewGroup.findViewById(2131821839);
    localViewGroup.removeAllViews();
    View.inflate(this.mContext, 2130970182, localViewGroup);
    AppMethodBeat.o(107193);
    return paramViewGroup;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.preference.ImagePreference
 * JD-Core Version:    0.6.2
 */