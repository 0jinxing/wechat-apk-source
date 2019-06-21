package com.google.android.gms.auth;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class UserRecoverableAuthException extends GoogleAuthException
{
  private final Intent mIntent;

  public UserRecoverableAuthException(String paramString, Intent paramIntent)
  {
    super(paramString);
    this.mIntent = paramIntent;
  }

  public Intent getIntent()
  {
    AppMethodBeat.i(76961);
    Intent localIntent;
    if (this.mIntent == null)
    {
      localIntent = null;
      AppMethodBeat.o(76961);
    }
    while (true)
    {
      return localIntent;
      localIntent = new Intent(this.mIntent);
      AppMethodBeat.o(76961);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.google.android.gms.auth.UserRecoverableAuthException
 * JD-Core Version:    0.6.2
 */