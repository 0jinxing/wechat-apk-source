package com.tencent.smtt.sdk;

import android.graphics.Bitmap;
import android.webkit.WebIconDatabase.IconListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

class bl
  implements WebIconDatabase.IconListener
{
  bl(WebIconDatabase paramWebIconDatabase, WebIconDatabase.a parama)
  {
  }

  public void onReceivedIcon(String paramString, Bitmap paramBitmap)
  {
    AppMethodBeat.i(64700);
    this.a.a(paramString, paramBitmap);
    AppMethodBeat.o(64700);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.smtt.sdk.bl
 * JD-Core Version:    0.6.2
 */