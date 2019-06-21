package com.davemorrissey.labs.subscaleview.view;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.net.Uri;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

public final class a
{
  final Integer aIH;
  public boolean aII;
  public int aIJ;
  public int aIK;
  public Rect aIL;
  boolean aIM;
  public final Bitmap bitmap;
  public final Uri uri;

  a(int paramInt)
  {
    AppMethodBeat.i(115638);
    this.bitmap = null;
    this.uri = null;
    this.aIH = Integer.valueOf(paramInt);
    this.aII = true;
    AppMethodBeat.o(115638);
  }

  public a(Bitmap paramBitmap)
  {
    AppMethodBeat.i(115636);
    this.bitmap = paramBitmap;
    this.uri = null;
    this.aIH = null;
    this.aII = false;
    this.aIJ = paramBitmap.getWidth();
    this.aIK = paramBitmap.getHeight();
    this.aIM = true;
    AppMethodBeat.o(115636);
  }

  private a(Uri paramUri)
  {
    AppMethodBeat.i(115637);
    String str = paramUri.toString();
    Uri localUri1 = paramUri;
    if (str.startsWith("file:///"))
    {
      localUri1 = paramUri;
      if (new File(str.substring(7)).exists());
    }
    try
    {
      localUri1 = Uri.parse(URLDecoder.decode(str, "UTF-8"));
      this.bitmap = null;
      this.uri = localUri1;
      this.aIH = null;
      this.aII = true;
      AppMethodBeat.o(115637);
      return;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      while (true)
        Uri localUri2 = paramUri;
    }
  }

  public static a af(String paramString)
  {
    AppMethodBeat.i(115639);
    if (paramString == null)
    {
      paramString = new NullPointerException("Uri must not be null");
      AppMethodBeat.o(115639);
      throw paramString;
    }
    String str = paramString;
    if (!paramString.contains("://"))
    {
      str = paramString;
      if (paramString.startsWith("/"))
        str = paramString.substring(1);
      str = "file:///".concat(String.valueOf(str));
    }
    paramString = new a(Uri.parse(str));
    AppMethodBeat.o(115639);
    return paramString;
  }

  public final a ox()
  {
    this.aII = true;
    return this;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.davemorrissey.labs.subscaleview.view.a
 * JD-Core Version:    0.6.2
 */