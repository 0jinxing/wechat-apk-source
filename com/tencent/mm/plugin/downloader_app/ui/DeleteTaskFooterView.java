package com.tencent.mm.plugin.downloader_app.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.downloader_app.b.d;
import com.tencent.mm.plugin.downloader_app.b.d.c;

public class DeleteTaskFooterView extends LinearLayout
{
  private boolean Sr;
  private LinearLayout kPU;
  ImageView kPV;
  LinearLayout kPW;
  TextView kPX;
  ImageView kPY;
  boolean kPZ;
  private d.c kQa;

  public DeleteTaskFooterView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(136218);
    this.Sr = true;
    this.kPZ = false;
    this.kQa = new DeleteTaskFooterView.1(this);
    AppMethodBeat.o(136218);
  }

  public void onAttachedToWindow()
  {
    AppMethodBeat.i(136220);
    super.onAttachedToWindow();
    d.a(this.kQa);
    AppMethodBeat.o(136220);
  }

  public void onDetachedFromWindow()
  {
    AppMethodBeat.i(136221);
    super.onDetachedFromWindow();
    d.b(this.kQa);
    AppMethodBeat.o(136221);
  }

  protected void onFinishInflate()
  {
    AppMethodBeat.i(136219);
    super.onFinishInflate();
    View localView = LayoutInflater.from(getContext()).inflate(2130969270, this, true);
    this.kPU = ((LinearLayout)localView.findViewById(2131823255));
    this.kPV = ((ImageView)localView.findViewById(2131823256));
    this.kPU.setOnClickListener(new DeleteTaskFooterView.2(this));
    this.kPW = ((LinearLayout)localView.findViewById(2131823257));
    this.kPW.setOnClickListener(new DeleteTaskFooterView.3(this));
    this.kPW.setClickable(false);
    this.kPX = ((TextView)localView.findViewById(2131823259));
    this.kPY = ((ImageView)localView.findViewById(2131823258));
    AppMethodBeat.o(136219);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader_app.ui.DeleteTaskFooterView
 * JD-Core Version:    0.6.2
 */