package com.tencent.mm.at.a;

import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.ref.WeakReference;

public final class c
{
  public WeakReference<ImageView> eQD;
  public final int eQF;
  public int height;
  private String url;
  public int width;

  public c(ImageView paramImageView, String paramString)
  {
    AppMethodBeat.i(116046);
    this.width = 0;
    this.height = 0;
    this.url = "";
    this.eQD = new WeakReference(paramImageView);
    this.url = paramString;
    if (paramImageView != null)
    {
      this.eQF = paramImageView.hashCode();
      AppMethodBeat.o(116046);
    }
    while (true)
    {
      return;
      this.eQF = hashCode();
      AppMethodBeat.o(116046);
    }
  }

  public final ImageView getImageView()
  {
    AppMethodBeat.i(116047);
    ImageView localImageView;
    if (this.eQD != null)
    {
      localImageView = (ImageView)this.eQD.get();
      if (localImageView != null)
        AppMethodBeat.o(116047);
    }
    while (true)
    {
      return localImageView;
      localImageView = null;
      AppMethodBeat.o(116047);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.at.a.c
 * JD-Core Version:    0.6.2
 */