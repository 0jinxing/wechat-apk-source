package com.tencent.mm.plugin.location.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ak;

public class SimpleImageView extends ImageView
{
  public int eTi;
  public int eTj;
  public ak handler;
  public String imagePath;
  public String url;

  public SimpleImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(113529);
    this.url = null;
    this.handler = new SimpleImageView.1(this);
    AppMethodBeat.o(113529);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.location.ui.SimpleImageView
 * JD-Core Version:    0.6.2
 */