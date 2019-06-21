package com.tencent.mm.plugin.profile.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.preference.Preference;

public class IconWidgetPreference extends Preference
{
  private ImageView pnG;
  private int pnH;
  private Bitmap pnI;

  public IconWidgetPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public IconWidgetPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(23643);
    this.pnG = null;
    this.pnH = -1;
    this.pnI = null;
    setLayoutResource(2130970127);
    setWidgetLayoutResource(0);
    AppMethodBeat.o(23643);
  }

  public final void O(Bitmap paramBitmap)
  {
    AppMethodBeat.i(23645);
    this.pnI = paramBitmap;
    if (this.pnG != null)
      this.pnG.setImageBitmap(paramBitmap);
    AppMethodBeat.o(23645);
  }

  public final void onBindView(View paramView)
  {
    AppMethodBeat.i(23646);
    super.onBindView(paramView);
    this.pnG = ((ImageView)paramView.findViewById(2131826082));
    if (this.pnG != null)
    {
      this.pnG.setVisibility(8);
      if (this.pnH != -1)
      {
        this.pnG.setImageResource(this.pnH);
        this.pnG.setVisibility(0);
        AppMethodBeat.o(23646);
      }
    }
    while (true)
    {
      return;
      if (this.pnI != null)
      {
        this.pnG.setImageBitmap(this.pnI);
        this.pnG.setVisibility(0);
      }
      AppMethodBeat.o(23646);
    }
  }

  public final View onCreateView(ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(23644);
    View localView = super.onCreateView(paramViewGroup);
    paramViewGroup = (ViewGroup)localView.findViewById(2131821019);
    paramViewGroup.removeAllViews();
    View.inflate(this.mContext, 2130970211, paramViewGroup);
    AppMethodBeat.o(23644);
    return localView;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.ui.IconWidgetPreference
 * JD-Core Version:    0.6.2
 */