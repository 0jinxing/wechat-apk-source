package com.facebook.appevents;

import com.facebook.AccessToken;
import com.facebook.FacebookSdk;
import com.facebook.internal.Utility;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.Serializable;

class AccessTokenAppIdPair
  implements Serializable
{
  private static final long serialVersionUID = 1L;
  private final String accessTokenString;
  private final String applicationId;

  public AccessTokenAppIdPair(AccessToken paramAccessToken)
  {
    this(paramAccessToken.getToken(), FacebookSdk.getApplicationId());
    AppMethodBeat.i(71852);
    AppMethodBeat.o(71852);
  }

  public AccessTokenAppIdPair(String paramString1, String paramString2)
  {
    AppMethodBeat.i(71853);
    String str = paramString1;
    if (Utility.isNullOrEmpty(paramString1))
      str = null;
    this.accessTokenString = str;
    this.applicationId = paramString2;
    AppMethodBeat.o(71853);
  }

  private Object writeReplace()
  {
    AppMethodBeat.i(71856);
    AccessTokenAppIdPair.SerializationProxyV1 localSerializationProxyV1 = new AccessTokenAppIdPair.SerializationProxyV1(this.accessTokenString, this.applicationId, null);
    AppMethodBeat.o(71856);
    return localSerializationProxyV1;
  }

  public boolean equals(Object paramObject)
  {
    boolean bool = false;
    AppMethodBeat.i(71855);
    if (!(paramObject instanceof AccessTokenAppIdPair))
      AppMethodBeat.o(71855);
    while (true)
    {
      return bool;
      paramObject = (AccessTokenAppIdPair)paramObject;
      if ((Utility.areObjectsEqual(paramObject.accessTokenString, this.accessTokenString)) && (Utility.areObjectsEqual(paramObject.applicationId, this.applicationId)))
      {
        bool = true;
        AppMethodBeat.o(71855);
      }
      else
      {
        AppMethodBeat.o(71855);
      }
    }
  }

  public String getAccessTokenString()
  {
    return this.accessTokenString;
  }

  public String getApplicationId()
  {
    return this.applicationId;
  }

  public int hashCode()
  {
    int i = 0;
    AppMethodBeat.i(71854);
    int j;
    if (this.accessTokenString == null)
    {
      j = 0;
      if (this.applicationId != null)
        break label43;
    }
    while (true)
    {
      AppMethodBeat.o(71854);
      return j ^ i;
      j = this.accessTokenString.hashCode();
      break;
      label43: i = this.applicationId.hashCode();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.facebook.appevents.AccessTokenAppIdPair
 * JD-Core Version:    0.6.2
 */