package com.tencent.xweb.sys;

import android.annotation.TargetApi;
import android.webkit.WebChromeClient.FileChooserParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.xweb.l.a;

public final class c$b extends l.a
{
  public WebChromeClient.FileChooserParams APH;

  public c$b(WebChromeClient.FileChooserParams paramFileChooserParams)
  {
    this.APH = paramFileChooserParams;
  }

  @TargetApi(21)
  public final String[] getAcceptTypes()
  {
    AppMethodBeat.i(84652);
    String[] arrayOfString;
    if (this.APH != null)
    {
      arrayOfString = this.APH.getAcceptTypes();
      AppMethodBeat.o(84652);
    }
    while (true)
    {
      return arrayOfString;
      arrayOfString = new String[0];
      AppMethodBeat.o(84652);
    }
  }

  @TargetApi(21)
  public final int getMode()
  {
    AppMethodBeat.i(84651);
    int i;
    if (this.APH != null)
    {
      i = this.APH.getMode();
      AppMethodBeat.o(84651);
    }
    while (true)
    {
      return i;
      i = 0;
      AppMethodBeat.o(84651);
    }
  }

  @TargetApi(21)
  public final boolean isCaptureEnabled()
  {
    AppMethodBeat.i(84653);
    boolean bool;
    if (this.APH != null)
    {
      bool = this.APH.isCaptureEnabled();
      AppMethodBeat.o(84653);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(84653);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.sys.c.b
 * JD-Core Version:    0.6.2
 */