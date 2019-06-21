package com.facebook.login;

import com.facebook.AccessToken;
import java.util.Set;

public class LoginResult
{
  private final AccessToken accessToken;
  private final Set<String> recentlyDeniedPermissions;
  private final Set<String> recentlyGrantedPermissions;

  public LoginResult(AccessToken paramAccessToken, Set<String> paramSet1, Set<String> paramSet2)
  {
    this.accessToken = paramAccessToken;
    this.recentlyGrantedPermissions = paramSet1;
    this.recentlyDeniedPermissions = paramSet2;
  }

  public AccessToken getAccessToken()
  {
    return this.accessToken;
  }

  public Set<String> getRecentlyDeniedPermissions()
  {
    return this.recentlyDeniedPermissions;
  }

  public Set<String> getRecentlyGrantedPermissions()
  {
    return this.recentlyGrantedPermissions;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.facebook.login.LoginResult
 * JD-Core Version:    0.6.2
 */