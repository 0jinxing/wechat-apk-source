package com.tencent.mm.pluginsdk.ui.preference;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.preference.Preference;

public final class HeadImgPreference extends Preference
{
  private int height;
  private ImageView iNr;
  private View.OnClickListener qqV;
  private Bitmap vqD;

  public HeadImgPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public HeadImgPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(28066);
    this.height = -1;
    setLayoutResource(2130970127);
    AppMethodBeat.o(28066);
  }

  public final void onBindView(View paramView)
  {
    AppMethodBeat.i(28068);
    super.onBindView(paramView);
    if (this.iNr == null)
      this.iNr = ((ImageView)paramView.findViewById(2131826036));
    if (this.qqV != null)
      this.iNr.setOnClickListener(this.qqV);
    if (this.vqD != null)
    {
      this.iNr.setImageBitmap(this.vqD);
      this.vqD = null;
    }
    paramView = (LinearLayout)paramView.findViewById(2131822347);
    if (this.height != -1)
      paramView.setMinimumHeight(this.height);
    AppMethodBeat.o(28068);
  }

  public final View onCreateView(ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(28067);
    View localView = super.onCreateView(paramViewGroup);
    paramViewGroup = (ViewGroup)localView.findViewById(2131821019);
    paramViewGroup.removeAllViews();
    View.inflate(this.mContext, 2130970149, paramViewGroup);
    this.iNr = ((ImageView)localView.findViewById(2131826036));
    AppMethodBeat.o(28067);
    return localView;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.preference.HeadImgPreference
 * JD-Core Version:    0.6.2
 */