package com.google.android.gms.auth.api.credentials;

import com.google.android.gms.common.api.Response;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class CredentialRequestResponse extends Response<CredentialRequestResult>
{
  public Credential getCredential()
  {
    AppMethodBeat.i(50328);
    Credential localCredential = ((CredentialRequestResult)getResult()).getCredential();
    AppMethodBeat.o(50328);
    return localCredential;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.google.android.gms.auth.api.credentials.CredentialRequestResponse
 * JD-Core Version:    0.6.2
 */