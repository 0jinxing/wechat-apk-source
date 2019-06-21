package com.tencent.smtt.sdk;

import com.tencent.matrix.trace.core.AppMethodBeat;

class af extends com.tencent.smtt.export.external.interfaces.WebResourceError
{
  af(ad paramad, android.webkit.WebResourceError paramWebResourceError)
  {
  }

  public CharSequence getDescription()
  {
    AppMethodBeat.i(64200);
    CharSequence localCharSequence = this.a.getDescription();
    AppMethodBeat.o(64200);
    return localCharSequence;
  }

  public int getErrorCode()
  {
    AppMethodBeat.i(64201);
    int i = this.a.getErrorCode();
    AppMethodBeat.o(64201);
    return i;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.smtt.sdk.af
 * JD-Core Version:    0.6.2
 */