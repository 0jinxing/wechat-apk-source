package com.tencent.mm.plugin.nearlife.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ak;

public class LogoImageView extends ImageView
{
  int eTi;
  int eTj;
  ak handler;
  String imagePath;
  String url;

  public LogoImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(22970);
    this.url = null;
    this.handler = new LogoImageView.1(this);
    AppMethodBeat.o(22970);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.nearlife.ui.LogoImageView
 * JD-Core Version:    0.6.2
 */