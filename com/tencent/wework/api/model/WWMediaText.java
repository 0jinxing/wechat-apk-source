package com.tencent.wework.api.model;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class WWMediaText extends WWMediaMessage.WWMediaObject
{
  public String text;

  public WWMediaText()
  {
  }

  public WWMediaText(String paramString)
  {
    this.text = paramString;
  }

  public final boolean checkArgs()
  {
    boolean bool = false;
    AppMethodBeat.i(80513);
    if (!super.checkArgs())
      AppMethodBeat.o(80513);
    while (true)
    {
      return bool;
      if ((this.text != null) && (this.text.length() != 0) && (this.text.length() <= 10240))
      {
        bool = true;
        AppMethodBeat.o(80513);
      }
      else
      {
        AppMethodBeat.o(80513);
      }
    }
  }

  public final void toBundle(Bundle paramBundle)
  {
    AppMethodBeat.i(80514);
    paramBundle.putString("_wwtextobject_text", this.text);
    super.toBundle(paramBundle);
    AppMethodBeat.o(80514);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.wework.api.model.WWMediaText
 * JD-Core Version:    0.6.2
 */