package com.tencent.wework.api.model;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class WWMediaConversation extends WWMediaMessage.WWMediaObject
{
  public byte[] ALE;
  public WWMediaMessage.WWMediaObject ALF;
  public String mnu;
  public String name;
  public long pXQ;

  public final boolean checkArgs()
  {
    boolean bool = false;
    AppMethodBeat.i(80497);
    if (!super.checkArgs())
      AppMethodBeat.o(80497);
    while (true)
    {
      return bool;
      if ((this.ALE != null) && (this.ALE.length > 10485760))
      {
        AppMethodBeat.o(80497);
      }
      else if ((this.mnu != null) && (this.mnu.length() > 10240))
      {
        AppMethodBeat.o(80497);
      }
      else if ((this.mnu != null) && (getFileSize(this.mnu) > 10485760))
      {
        AppMethodBeat.o(80497);
      }
      else if ((this.ALF != null) && (this.ALF.checkArgs()))
      {
        bool = true;
        AppMethodBeat.o(80497);
      }
      else
      {
        AppMethodBeat.o(80497);
      }
    }
  }

  public final void toBundle(Bundle paramBundle)
  {
    AppMethodBeat.i(80498);
    super.toBundle(paramBundle);
    paramBundle.putString("_wwconvobject_name", this.name);
    paramBundle.putLong("_wwconvobject_date", this.pXQ);
    paramBundle.putByteArray("_wwconvobject_avatarData", this.ALE);
    paramBundle.putString("_wwconvobject_avatarPath", this.mnu);
    paramBundle.putBundle("_wwconvobject_message", BaseMessage.b(this.ALF));
    AppMethodBeat.o(80498);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.wework.api.model.WWMediaConversation
 * JD-Core Version:    0.6.2
 */