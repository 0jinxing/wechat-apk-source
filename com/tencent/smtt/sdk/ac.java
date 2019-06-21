package com.tencent.smtt.sdk;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;

class ac extends WebChromeClient.FileChooserParams
{
  ac(SystemWebChromeClient paramSystemWebChromeClient, android.webkit.WebChromeClient.FileChooserParams paramFileChooserParams)
  {
  }

  public Intent createIntent()
  {
    AppMethodBeat.i(64161);
    Intent localIntent = this.a.createIntent();
    AppMethodBeat.o(64161);
    return localIntent;
  }

  public String[] getAcceptTypes()
  {
    AppMethodBeat.i(64157);
    String[] arrayOfString = this.a.getAcceptTypes();
    AppMethodBeat.o(64157);
    return arrayOfString;
  }

  public String getFilenameHint()
  {
    AppMethodBeat.i(64160);
    String str = this.a.getFilenameHint();
    AppMethodBeat.o(64160);
    return str;
  }

  public int getMode()
  {
    AppMethodBeat.i(64156);
    int i = this.a.getMode();
    AppMethodBeat.o(64156);
    return i;
  }

  public CharSequence getTitle()
  {
    AppMethodBeat.i(64159);
    CharSequence localCharSequence = this.a.getTitle();
    AppMethodBeat.o(64159);
    return localCharSequence;
  }

  public boolean isCaptureEnabled()
  {
    AppMethodBeat.i(64158);
    boolean bool = this.a.isCaptureEnabled();
    AppMethodBeat.o(64158);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.smtt.sdk.ac
 * JD-Core Version:    0.6.2
 */