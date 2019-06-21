package com.facebook.login;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.facebook.internal.Validate;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class LoginClient$Request
  implements Parcelable
{
  public static final Parcelable.Creator<Request> CREATOR;
  private final String applicationId;
  private final String authId;
  private String authType;
  private final DefaultAudience defaultAudience;
  private String deviceAuthTargetUserId;
  private String deviceRedirectUriString;
  private boolean isRerequest;
  private final LoginBehavior loginBehavior;
  private Set<String> permissions;

  static
  {
    AppMethodBeat.i(96800);
    CREATOR = new LoginClient.Request.1();
    AppMethodBeat.o(96800);
  }

  private LoginClient$Request(Parcel paramParcel)
  {
    AppMethodBeat.i(96798);
    this.isRerequest = false;
    Object localObject2 = paramParcel.readString();
    if (localObject2 != null)
    {
      localObject2 = LoginBehavior.valueOf((String)localObject2);
      this.loginBehavior = ((LoginBehavior)localObject2);
      localObject2 = new ArrayList();
      paramParcel.readStringList((List)localObject2);
      this.permissions = new HashSet((Collection)localObject2);
      String str = paramParcel.readString();
      localObject2 = localObject1;
      if (str != null)
        localObject2 = DefaultAudience.valueOf(str);
      this.defaultAudience = ((DefaultAudience)localObject2);
      this.applicationId = paramParcel.readString();
      this.authId = paramParcel.readString();
      if (paramParcel.readByte() == 0)
        break label151;
    }
    label151: for (boolean bool = true; ; bool = false)
    {
      this.isRerequest = bool;
      this.deviceRedirectUriString = paramParcel.readString();
      this.authType = paramParcel.readString();
      this.deviceAuthTargetUserId = paramParcel.readString();
      AppMethodBeat.o(96798);
      return;
      localObject2 = null;
      break;
    }
  }

  LoginClient$Request(LoginBehavior paramLoginBehavior, Set<String> paramSet, DefaultAudience paramDefaultAudience, String paramString1, String paramString2, String paramString3)
  {
    AppMethodBeat.i(96795);
    this.isRerequest = false;
    this.loginBehavior = paramLoginBehavior;
    if (paramSet != null);
    while (true)
    {
      this.permissions = paramSet;
      this.defaultAudience = paramDefaultAudience;
      this.authType = paramString1;
      this.applicationId = paramString2;
      this.authId = paramString3;
      AppMethodBeat.o(96795);
      return;
      paramSet = new HashSet();
    }
  }

  public int describeContents()
  {
    return 0;
  }

  String getApplicationId()
  {
    return this.applicationId;
  }

  String getAuthId()
  {
    return this.authId;
  }

  String getAuthType()
  {
    return this.authType;
  }

  DefaultAudience getDefaultAudience()
  {
    return this.defaultAudience;
  }

  String getDeviceAuthTargetUserId()
  {
    return this.deviceAuthTargetUserId;
  }

  String getDeviceRedirectUriString()
  {
    return this.deviceRedirectUriString;
  }

  LoginBehavior getLoginBehavior()
  {
    return this.loginBehavior;
  }

  Set<String> getPermissions()
  {
    return this.permissions;
  }

  boolean hasPublishPermission()
  {
    AppMethodBeat.i(96797);
    Iterator localIterator = this.permissions.iterator();
    boolean bool;
    while (localIterator.hasNext())
      if (LoginManager.isPublishPermission((String)localIterator.next()))
      {
        bool = true;
        AppMethodBeat.o(96797);
      }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(96797);
    }
  }

  boolean isRerequest()
  {
    return this.isRerequest;
  }

  void setAuthType(String paramString)
  {
    this.authType = paramString;
  }

  void setDeviceAuthTargetUserId(String paramString)
  {
    this.deviceAuthTargetUserId = paramString;
  }

  void setDeviceRedirectUriString(String paramString)
  {
    this.deviceRedirectUriString = paramString;
  }

  void setPermissions(Set<String> paramSet)
  {
    AppMethodBeat.i(96796);
    Validate.notNull(paramSet, "permissions");
    this.permissions = paramSet;
    AppMethodBeat.o(96796);
  }

  void setRerequest(boolean paramBoolean)
  {
    this.isRerequest = paramBoolean;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    Object localObject1 = null;
    AppMethodBeat.i(96799);
    Object localObject2;
    if (this.loginBehavior != null)
    {
      localObject2 = this.loginBehavior.name();
      paramParcel.writeString((String)localObject2);
      paramParcel.writeStringList(new ArrayList(this.permissions));
      localObject2 = localObject1;
      if (this.defaultAudience != null)
        localObject2 = this.defaultAudience.name();
      paramParcel.writeString((String)localObject2);
      paramParcel.writeString(this.applicationId);
      paramParcel.writeString(this.authId);
      if (!this.isRerequest)
        break label136;
    }
    label136: for (paramInt = 1; ; paramInt = 0)
    {
      paramParcel.writeByte((byte)paramInt);
      paramParcel.writeString(this.deviceRedirectUriString);
      paramParcel.writeString(this.authType);
      paramParcel.writeString(this.deviceAuthTargetUserId);
      AppMethodBeat.o(96799);
      return;
      localObject2 = null;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.facebook.login.LoginClient.Request
 * JD-Core Version:    0.6.2
 */