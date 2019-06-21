package com.tencent.smtt.sdk;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.smtt.export.external.interfaces.IX5WebChromeClient.FileChooserParams;

class u extends WebChromeClient.FileChooserParams
{
  u(q paramq, IX5WebChromeClient.FileChooserParams paramFileChooserParams)
  {
  }

  public Intent createIntent()
  {
    AppMethodBeat.i(64090);
    Intent localIntent = this.a.createIntent();
    AppMethodBeat.o(64090);
    return localIntent;
  }

  public String[] getAcceptTypes()
  {
    AppMethodBeat.i(64086);
    String[] arrayOfString = this.a.getAcceptTypes();
    AppMethodBeat.o(64086);
    return arrayOfString;
  }

  public String getFilenameHint()
  {
    AppMethodBeat.i(64089);
    String str = this.a.getFilenameHint();
    AppMethodBeat.o(64089);
    return str;
  }

  public int getMode()
  {
    AppMethodBeat.i(64085);
    int i = this.a.getMode();
    AppMethodBeat.o(64085);
    return i;
  }

  public CharSequence getTitle()
  {
    AppMethodBeat.i(64088);
    CharSequence localCharSequence = this.a.getTitle();
    AppMethodBeat.o(64088);
    return localCharSequence;
  }

  public boolean isCaptureEnabled()
  {
    AppMethodBeat.i(64087);
    boolean bool = this.a.isCaptureEnabled();
    AppMethodBeat.o(64087);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.smtt.sdk.u
 * JD-Core Version:    0.6.2
 */