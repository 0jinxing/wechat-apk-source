package com.tencent.wework.api.model;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.File;

public class WWMediaMessage extends WWBaseMessage
{
  public String description;
  public byte[] thumbData;
  public String title;

  public boolean checkArgs()
  {
    boolean bool = false;
    AppMethodBeat.i(80510);
    if ((this.thumbData != null) && (this.thumbData.length > 32768))
      AppMethodBeat.o(80510);
    while (true)
    {
      return bool;
      if ((this.title != null) && (this.title.length() > 512))
      {
        AppMethodBeat.o(80510);
      }
      else if ((this.description != null) && (this.description.length() > 1024))
      {
        AppMethodBeat.o(80510);
      }
      else
      {
        bool = true;
        AppMethodBeat.o(80510);
      }
    }
  }

  public void toBundle(Bundle paramBundle)
  {
    AppMethodBeat.i(80509);
    super.toBundle(paramBundle);
    paramBundle.putString("_wwobject_title", this.title);
    paramBundle.putString("_wwobject_description", this.description);
    paramBundle.putByteArray("_wwobject_thumbdata", this.thumbData);
    AppMethodBeat.o(80509);
  }

  public static abstract class WWMediaObject extends WWMediaMessage
  {
    protected static int getFileSize(String paramString)
    {
      if ((paramString != null) && (paramString.length() != 0))
      {
        paramString = new File(paramString);
        if (!paramString.exists());
      }
      for (int i = (int)paramString.length(); ; i = 0)
        return i;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.wework.api.model.WWMediaMessage
 * JD-Core Version:    0.6.2
 */