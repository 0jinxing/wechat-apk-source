package com.facebook.login;

import android.net.Uri;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Collection;

public class DeviceLoginManager extends LoginManager
{
  private static volatile DeviceLoginManager instance;
  private String deviceAuthTargetUserId;
  private Uri deviceRedirectUri;

  public static DeviceLoginManager getInstance()
  {
    AppMethodBeat.i(92627);
    if (instance == null);
    try
    {
      if (instance == null)
      {
        localDeviceLoginManager = new com/facebook/login/DeviceLoginManager;
        localDeviceLoginManager.<init>();
        instance = localDeviceLoginManager;
      }
      DeviceLoginManager localDeviceLoginManager = instance;
      AppMethodBeat.o(92627);
      return localDeviceLoginManager;
    }
    finally
    {
      AppMethodBeat.o(92627);
    }
  }

  protected LoginClient.Request createLoginRequest(Collection<String> paramCollection)
  {
    AppMethodBeat.i(92628);
    paramCollection = super.createLoginRequest(paramCollection);
    Object localObject = getDeviceRedirectUri();
    if (localObject != null)
      paramCollection.setDeviceRedirectUriString(((Uri)localObject).toString());
    localObject = getDeviceAuthTargetUserId();
    if (localObject != null)
      paramCollection.setDeviceAuthTargetUserId((String)localObject);
    AppMethodBeat.o(92628);
    return paramCollection;
  }

  public String getDeviceAuthTargetUserId()
  {
    return this.deviceAuthTargetUserId;
  }

  public Uri getDeviceRedirectUri()
  {
    return this.deviceRedirectUri;
  }

  public void setDeviceAuthTargetUserId(String paramString)
  {
    this.deviceAuthTargetUserId = paramString;
  }

  public void setDeviceRedirectUri(Uri paramUri)
  {
    this.deviceRedirectUri = paramUri;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.facebook.login.DeviceLoginManager
 * JD-Core Version:    0.6.2
 */