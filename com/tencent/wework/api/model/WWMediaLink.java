package com.tencent.wework.api.model;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class WWMediaLink extends WWMediaMessage.WWMediaObject
{
  public String thumbUrl;
  public String webpageUrl;

  public final boolean checkArgs()
  {
    boolean bool = false;
    AppMethodBeat.i(80501);
    if (!super.checkArgs())
      AppMethodBeat.o(80501);
    while (true)
    {
      return bool;
      if ((this.webpageUrl != null) && (this.webpageUrl.length() != 0) && (this.webpageUrl.length() <= 10240))
      {
        bool = true;
        AppMethodBeat.o(80501);
      }
      else
      {
        AppMethodBeat.o(80501);
      }
    }
  }

  public final void toBundle(Bundle paramBundle)
  {
    AppMethodBeat.i(80502);
    paramBundle.putString("_wwwebpageobject_thumbUrl", this.thumbUrl);
    paramBundle.putString("_wwwebpageobject_webpageUrl", this.webpageUrl);
    super.toBundle(paramBundle);
    AppMethodBeat.o(80502);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.wework.api.model.WWMediaLink
 * JD-Core Version:    0.6.2
 */