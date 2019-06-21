package com.tencent.smtt.sdk;

import android.graphics.Bitmap;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.smtt.export.external.interfaces.IconListener;

class bk
  implements IconListener
{
  bk(WebIconDatabase paramWebIconDatabase, WebIconDatabase.a parama)
  {
  }

  public void onReceivedIcon(String paramString, Bitmap paramBitmap)
  {
    AppMethodBeat.i(64699);
    this.a.a(paramString, paramBitmap);
    AppMethodBeat.o(64699);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.smtt.sdk.bk
 * JD-Core Version:    0.6.2
 */