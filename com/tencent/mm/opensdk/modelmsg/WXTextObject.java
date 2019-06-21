package com.tencent.mm.opensdk.modelmsg;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.opensdk.utils.Log;

public class WXTextObject
  implements WXMediaMessage.IMediaObject
{
  private static final int LENGTH_LIMIT = 10240;
  private static final String TAG = "MicroMsg.SDK.WXTextObject";
  public String text;

  public WXTextObject()
  {
    this(null);
  }

  public WXTextObject(String paramString)
  {
    this.text = paramString;
  }

  public boolean checkArgs()
  {
    AppMethodBeat.i(128282);
    boolean bool;
    if ((this.text == null) || (this.text.length() == 0) || (this.text.length() > 10240))
    {
      Log.e("MicroMsg.SDK.WXTextObject", "checkArgs fail, text is invalid");
      bool = false;
      AppMethodBeat.o(128282);
    }
    while (true)
    {
      return bool;
      bool = true;
      AppMethodBeat.o(128282);
    }
  }

  public void serialize(Bundle paramBundle)
  {
    AppMethodBeat.i(128280);
    paramBundle.putString("_wxtextobject_text", this.text);
    AppMethodBeat.o(128280);
  }

  public int type()
  {
    return 1;
  }

  public void unserialize(Bundle paramBundle)
  {
    AppMethodBeat.i(128281);
    this.text = paramBundle.getString("_wxtextobject_text");
    AppMethodBeat.o(128281);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.opensdk.modelmsg.WXTextObject
 * JD-Core Version:    0.6.2
 */