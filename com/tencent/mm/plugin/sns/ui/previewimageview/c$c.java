package com.tencent.mm.plugin.sns.ui.previewimageview;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.model.h;
import com.tencent.mm.sdk.g.b.a;

final class c$c extends h<String, Integer, Boolean>
{
  private ImageView cDh;
  private Bitmap fru;
  private String path;

  public c$c(c paramc, ImageView paramImageView, String paramString)
  {
    this.cDh = paramImageView;
    this.path = paramString;
  }

  public final a cin()
  {
    AppMethodBeat.i(40302);
    a locala = af.cnp();
    AppMethodBeat.o(40302);
    return locala;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.previewimageview.c.c
 * JD-Core Version:    0.6.2
 */