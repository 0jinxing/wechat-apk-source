package com.tencent.mm.plugin.order.ui.a;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;
import com.tencent.mm.ui.base.preference.Preference;

public final class c extends Preference
{
  Bitmap fru;
  View.OnClickListener mOnClickListener;
  private View mView;
  private TextView oZK;
  private ImageView pex;
  String pey;

  public c(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(43898);
    this.mView = null;
    this.pey = "";
    this.fru = null;
    setLayoutResource(2130970043);
    AppMethodBeat.o(43898);
  }

  public final View getView(View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(43899);
    if (this.mView == null)
      this.mView = onCreateView(paramViewGroup);
    onBindView(this.mView);
    paramView = this.mView;
    AppMethodBeat.o(43899);
    return paramView;
  }

  public final void onBindView(View paramView)
  {
    AppMethodBeat.i(43900);
    super.onBindView(paramView);
    this.oZK = ((TextView)paramView.findViewById(2131825802));
    this.pex = ((ImageView)paramView.findViewById(2131825801));
    this.oZK.setText(this.pey);
    this.pex.setImageBitmap(this.fru);
    this.pex.setOnClickListener(this.mOnClickListener);
    if ((this.pey != null) && (this.pey.length() > 48))
      this.oZK.setTextSize(0, a.al(this.mContext, 2131427762));
    AppMethodBeat.o(43900);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.order.ui.a.c
 * JD-Core Version:    0.6.2
 */