package com.tencent.mm.plugin.subapp.ui.pluginapp;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;
import com.tencent.mm.ui.base.preference.Preference;

public class AddFriendItemPreference extends Preference
{
  private Context context;
  private Drawable drawable;
  private int height;
  private String pnJ;
  private int qle;
  int qlf;

  public AddFriendItemPreference(Context paramContext)
  {
    this(paramContext, null);
  }

  public AddFriendItemPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public AddFriendItemPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(25490);
    this.pnJ = "";
    this.qle = -1;
    this.qlf = 8;
    this.height = -1;
    this.context = paramContext;
    setLayoutResource(2130970127);
    AppMethodBeat.o(25490);
  }

  public final void onBindView(View paramView)
  {
    AppMethodBeat.i(25492);
    super.onBindView(paramView);
    Object localObject = (ImageView)paramView.findViewById(2131822184);
    if (localObject != null)
    {
      ((ImageView)localObject).setVisibility(8);
      if (this.drawable == null)
        break label137;
      ((ImageView)localObject).setImageDrawable(this.drawable);
      ((ImageView)localObject).setVisibility(0);
    }
    while (true)
    {
      localObject = (LinearLayout)paramView.findViewById(2131822347);
      if (this.height != -1)
        ((LinearLayout)localObject).setMinimumHeight(this.height);
      paramView = (TextView)paramView.findViewById(2131822348);
      if (paramView != null)
      {
        paramView.setVisibility(this.qlf);
        paramView.setText(this.pnJ);
        if (this.qle != -1)
          paramView.setBackgroundDrawable(a.g(this.context, this.qle));
      }
      AppMethodBeat.o(25492);
      return;
      label137: if (this.rP != null)
      {
        ((ImageView)localObject).setImageDrawable(this.rP);
        ((ImageView)localObject).setVisibility(0);
      }
      else if (this.ZV != 0)
      {
        ((ImageView)localObject).setImageResource(this.ZV);
        ((ImageView)localObject).setVisibility(0);
      }
    }
  }

  public final View onCreateView(ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(25491);
    View localView = super.onCreateView(paramViewGroup);
    paramViewGroup = (ViewGroup)localView.findViewById(2131821019);
    paramViewGroup.removeAllViews();
    View.inflate(this.mContext, 2130970142, paramViewGroup);
    paramViewGroup.setPadding(0, paramViewGroup.getPaddingTop(), paramViewGroup.getPaddingRight(), paramViewGroup.getPaddingBottom());
    AppMethodBeat.o(25491);
    return localView;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.subapp.ui.pluginapp.AddFriendItemPreference
 * JD-Core Version:    0.6.2
 */