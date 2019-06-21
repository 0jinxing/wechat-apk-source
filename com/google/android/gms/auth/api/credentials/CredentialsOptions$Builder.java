package com.google.android.gms.auth.api.credentials;

import com.google.android.gms.auth.api.Auth.AuthCredentialsOptions.Builder;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class CredentialsOptions$Builder extends Auth.AuthCredentialsOptions.Builder
{
  public final CredentialsOptions build()
  {
    AppMethodBeat.i(50340);
    CredentialsOptions localCredentialsOptions = new CredentialsOptions(this, null);
    AppMethodBeat.o(50340);
    return localCredentialsOptions;
  }

  public final Builder forceEnableSaveDialog()
  {
    this.zzar = Boolean.TRUE;
    return this;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.google.android.gms.auth.api.credentials.CredentialsOptions.Builder
 * JD-Core Version:    0.6.2
 */