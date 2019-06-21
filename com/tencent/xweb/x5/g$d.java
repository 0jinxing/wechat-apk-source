package com.tencent.xweb.x5;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.smtt.sdk.WebChromeClient.FileChooserParams;
import com.tencent.xweb.l.a;

public final class g$d extends l.a
{
  public WebChromeClient.FileChooserParams AQx;

  public g$d(WebChromeClient.FileChooserParams paramFileChooserParams)
  {
    this.AQx = paramFileChooserParams;
  }

  public final String[] getAcceptTypes()
  {
    AppMethodBeat.i(84827);
    String[] arrayOfString;
    if (this.AQx != null)
    {
      arrayOfString = this.AQx.getAcceptTypes();
      AppMethodBeat.o(84827);
    }
    while (true)
    {
      return arrayOfString;
      arrayOfString = new String[0];
      AppMethodBeat.o(84827);
    }
  }

  public final int getMode()
  {
    AppMethodBeat.i(84826);
    int i;
    if (this.AQx != null)
    {
      i = this.AQx.getMode();
      AppMethodBeat.o(84826);
    }
    while (true)
    {
      return i;
      i = 0;
      AppMethodBeat.o(84826);
    }
  }

  public final boolean isCaptureEnabled()
  {
    AppMethodBeat.i(84828);
    boolean bool;
    if (this.AQx != null)
    {
      bool = this.AQx.isCaptureEnabled();
      AppMethodBeat.o(84828);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(84828);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.x5.g.d
 * JD-Core Version:    0.6.2
 */