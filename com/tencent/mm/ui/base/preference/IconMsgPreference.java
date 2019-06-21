package com.tencent.mm.ui.base.preference;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;
import com.tencent.mm.sdk.platformtools.bo;

public class IconMsgPreference extends Preference
{
  private Context context;
  private Drawable drawable;
  private int height;
  private String pnJ;
  private int qle;
  private int qlf;
  private int yBD;
  private int yBE;
  private int yBF;
  private ImageView yBG;
  private ViewGroup yBH;
  private TextView yBI;
  private String yBJ;

  public IconMsgPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public IconMsgPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(107163);
    this.pnJ = "";
    this.qle = -1;
    this.qlf = 8;
    this.yBD = 8;
    this.yBE = 0;
    this.yBF = 8;
    this.yBG = null;
    this.yBH = null;
    this.height = -1;
    this.yBJ = "";
    this.context = paramContext;
    setLayoutResource(2130970127);
    AppMethodBeat.o(107163);
  }

  protected final void onBindView(View paramView)
  {
    AppMethodBeat.i(107165);
    super.onBindView(paramView);
    Object localObject = (ImageView)paramView.findViewById(2131822184);
    if (localObject != null)
    {
      if (this.drawable != null)
      {
        ((ImageView)localObject).setImageDrawable(this.drawable);
        ((ImageView)localObject).setVisibility(0);
      }
    }
    else
    {
      localObject = (LinearLayout)paramView.findViewById(2131822347);
      if (this.height != -1)
        ((LinearLayout)localObject).setMinimumHeight(this.height);
      localObject = (TextView)paramView.findViewById(2131822348);
      if (localObject != null)
      {
        ((TextView)localObject).setVisibility(this.qlf);
        ((TextView)localObject).setText(this.pnJ);
        if (this.qle != -1)
          ((TextView)localObject).setBackgroundDrawable(a.g(this.context, this.qle));
      }
      this.yBG = ((ImageView)paramView.findViewById(2131822349));
      this.yBG.setVisibility(this.yBD);
      this.yBH = ((ViewGroup)paramView.findViewById(2131822351));
      this.yBH.setVisibility(this.yBE);
      this.yBI = ((TextView)paramView.findViewById(16908310));
      paramView = (TextView)paramView.findViewById(2131826062);
      if (!bo.isNullOrNil(this.yBJ))
        break label248;
      paramView.setVisibility(8);
      AppMethodBeat.o(107165);
    }
    while (true)
    {
      return;
      if (this.ZV != 0)
      {
        ((ImageView)localObject).setImageResource(this.ZV);
        ((ImageView)localObject).setVisibility(0);
        break;
      }
      ((ImageView)localObject).setVisibility(8);
      break;
      label248: paramView.setVisibility(0);
      paramView.setText(this.yBJ);
      AppMethodBeat.o(107165);
    }
  }

  protected final View onCreateView(ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(107164);
    paramViewGroup = super.onCreateView(paramViewGroup);
    ViewGroup localViewGroup = (ViewGroup)paramViewGroup.findViewById(2131821019);
    localViewGroup.removeAllViews();
    View.inflate(this.mContext, 2130970179, localViewGroup);
    paramViewGroup.setMinimumHeight(paramViewGroup.getResources().getDimensionPixelSize(2131427857));
    AppMethodBeat.o(107164);
    return paramViewGroup;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.preference.IconMsgPreference
 * JD-Core Version:    0.6.2
 */