package com.tencent.mm.plugin.gallery.ui;

import android.support.v7.widget.RecyclerView.v;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class f$a extends RecyclerView.v
{
  public ImageView mOW;
  public ImageView mOX;
  public RelativeLayout mOY;
  public TextView mOZ;
  public ImageView mPb;
  public ImageView mPc;
  public ImageView mPd;
  public ImageView mRQ;
  public View mRR;
  public int mRS;

  public f$a(View paramView)
  {
    super(paramView);
    AppMethodBeat.i(21577);
    this.mRR = paramView;
    this.mPc = ((ImageView)paramView.findViewById(2131826566));
    this.mPd = ((ImageView)paramView.findViewById(2131826567));
    this.mRQ = ((ImageView)paramView.findViewById(2131822521));
    this.mOW = ((ImageView)paramView.findViewById(2131826569));
    this.mOX = ((ImageView)paramView.findViewById(2131822355));
    this.mOY = ((RelativeLayout)paramView.findViewById(2131825005));
    this.mOZ = ((TextView)paramView.findViewById(2131826565));
    this.mPb = ((ImageView)paramView.findViewById(2131826568));
    this.mPb.setBackgroundResource(2131690155);
    this.mPb.setVisibility(8);
    AppMethodBeat.o(21577);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.gallery.ui.f.a
 * JD-Core Version:    0.6.2
 */