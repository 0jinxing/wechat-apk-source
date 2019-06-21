package com.tencent.mm.plugin.emoji.ui.v2;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;

public class PaddingImageView extends FrameLayout
{
  ImageView ikh;
  ImageView lgi;
  private int lgj;

  public PaddingImageView(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(53836);
    init(paramContext);
    AppMethodBeat.o(53836);
  }

  public PaddingImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(53837);
    init(paramContext);
    AppMethodBeat.o(53837);
  }

  public PaddingImageView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(53838);
    init(paramContext);
    AppMethodBeat.o(53838);
  }

  private void init(Context paramContext)
  {
    AppMethodBeat.i(53839);
    this.lgj = a.al(getContext(), 2131427812);
    this.ikh = new ImageView(paramContext);
    this.ikh.setPadding(this.lgj, this.lgj, this.lgj, this.lgj);
    this.lgi = new ImageView(paramContext);
    AppMethodBeat.o(53839);
  }

  public ImageView getImageView()
  {
    return this.ikh;
  }

  public ImageView getImageViewFG()
  {
    return this.lgi;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.ui.v2.PaddingImageView
 * JD-Core Version:    0.6.2
 */