package com.tencent.mm.ui;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class a
{
  public TextView gnB;
  private ImageView lnh;
  private ImageView sDV;
  private View uCq;
  public TextView yeg;
  public ImageView yeh;
  public ImageView yei;
  private ImageView yej;
  public ImageView yek;
  private View yel;

  public a(View paramView)
  {
    AppMethodBeat.i(105936);
    ViewGroup.LayoutParams localLayoutParams = paramView.getLayoutParams();
    if (localLayoutParams == null)
      localLayoutParams = new ViewGroup.LayoutParams(-2, -1);
    while (true)
    {
      paramView.setLayoutParams(localLayoutParams);
      this.gnB = ((TextView)paramView.findViewById(2131820965));
      this.yeg = ((TextView)paramView.findViewById(2131820966));
      this.sDV = ((ImageView)paramView.findViewById(2131820968));
      this.yeh = ((ImageView)paramView.findViewById(2131820967));
      this.yei = ((ImageView)paramView.findViewById(2131820969));
      this.yej = ((ImageView)paramView.findViewById(2131820970));
      this.uCq = paramView.findViewById(2131820963);
      this.lnh = ((ImageView)paramView.findViewById(2131820964));
      this.yek = ((ImageView)paramView.findViewById(2131820971));
      this.yel = paramView;
      AppMethodBeat.o(105936);
      return;
      localLayoutParams.width = -2;
      localLayoutParams.height = -1;
    }
  }

  public final void b(View.OnClickListener paramOnClickListener)
  {
    AppMethodBeat.i(105940);
    this.uCq.setOnClickListener(paramOnClickListener);
    AppMethodBeat.o(105940);
  }

  public final void pv(boolean paramBoolean)
  {
    AppMethodBeat.i(105938);
    ImageView localImageView = this.sDV;
    if (paramBoolean);
    for (int i = 0; ; i = 8)
    {
      localImageView.setVisibility(i);
      AppMethodBeat.o(105938);
      return;
    }
  }

  public final void pw(boolean paramBoolean)
  {
    AppMethodBeat.i(105939);
    ImageView localImageView = this.yej;
    if (paramBoolean);
    for (int i = 0; ; i = 8)
    {
      localImageView.setVisibility(i);
      AppMethodBeat.o(105939);
      return;
    }
  }

  public final void setTitle(CharSequence paramCharSequence)
  {
    AppMethodBeat.i(105937);
    this.gnB.setText(paramCharSequence);
    if (com.tencent.mm.bz.a.ga(this.gnB.getContext()))
      this.gnB.setTextSize(0, com.tencent.mm.bz.a.am(this.gnB.getContext(), 2131427496) * com.tencent.mm.bz.a.fY(this.gnB.getContext()));
    AppMethodBeat.o(105937);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.a
 * JD-Core Version:    0.6.2
 */