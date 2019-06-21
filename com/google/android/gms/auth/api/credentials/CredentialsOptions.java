package com.google.android.gms.auth.api.credentials;

import com.google.android.gms.auth.api.Auth.AuthCredentialsOptions;
import com.google.android.gms.auth.api.Auth.AuthCredentialsOptions.Builder;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class CredentialsOptions extends Auth.AuthCredentialsOptions
{
  public static final CredentialsOptions DEFAULT;

  static
  {
    AppMethodBeat.i(50343);
    DEFAULT = (CredentialsOptions)new CredentialsOptions.Builder().zzh();
    AppMethodBeat.o(50343);
  }

  private CredentialsOptions(CredentialsOptions.Builder paramBuilder)
  {
    super(paramBuilder);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.google.android.gms.auth.api.credentials.CredentialsOptions
 * JD-Core Version:    0.6.2
 */