package com.facebook;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.facebook.internal.ImageRequest;
import com.facebook.internal.Utility;
import com.facebook.internal.Validate;
import com.tencent.matrix.trace.core.AppMethodBeat;
import org.json.JSONException;
import org.json.JSONObject;

public final class Profile
  implements Parcelable
{
  public static final Parcelable.Creator<Profile> CREATOR;
  private static final String FIRST_NAME_KEY = "first_name";
  private static final String ID_KEY = "id";
  private static final String LAST_NAME_KEY = "last_name";
  private static final String LINK_URI_KEY = "link_uri";
  private static final String MIDDLE_NAME_KEY = "middle_name";
  private static final String NAME_KEY = "name";
  private static final String TAG;
  private final String firstName;
  private final String id;
  private final String lastName;
  private final Uri linkUri;
  private final String middleName;
  private final String name;

  static
  {
    AppMethodBeat.i(71820);
    TAG = Profile.class.getSimpleName();
    CREATOR = new Profile.2();
    AppMethodBeat.o(71820);
  }

  private Profile(Parcel paramParcel)
  {
    AppMethodBeat.i(71818);
    this.id = paramParcel.readString();
    this.firstName = paramParcel.readString();
    this.middleName = paramParcel.readString();
    this.lastName = paramParcel.readString();
    this.name = paramParcel.readString();
    paramParcel = paramParcel.readString();
    if (paramParcel == null);
    for (paramParcel = null; ; paramParcel = Uri.parse(paramParcel))
    {
      this.linkUri = paramParcel;
      AppMethodBeat.o(71818);
      return;
    }
  }

  public Profile(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, Uri paramUri)
  {
    AppMethodBeat.i(71812);
    Validate.notNullOrEmpty(paramString1, "id");
    this.id = paramString1;
    this.firstName = paramString2;
    this.middleName = paramString3;
    this.lastName = paramString4;
    this.name = paramString5;
    this.linkUri = paramUri;
    AppMethodBeat.o(71812);
  }

  Profile(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(71817);
    this.id = paramJSONObject.optString("id", null);
    this.firstName = paramJSONObject.optString("first_name", null);
    this.middleName = paramJSONObject.optString("middle_name", null);
    this.lastName = paramJSONObject.optString("last_name", null);
    this.name = paramJSONObject.optString("name", null);
    paramJSONObject = paramJSONObject.optString("link_uri", null);
    if (paramJSONObject == null);
    for (paramJSONObject = localObject; ; paramJSONObject = Uri.parse(paramJSONObject))
    {
      this.linkUri = paramJSONObject;
      AppMethodBeat.o(71817);
      return;
    }
  }

  public static void fetchProfileForCurrentAccessToken()
  {
    AppMethodBeat.i(71811);
    AccessToken localAccessToken = AccessToken.getCurrentAccessToken();
    if (!AccessToken.isCurrentAccessTokenActive())
    {
      setCurrentProfile(null);
      AppMethodBeat.o(71811);
    }
    while (true)
    {
      return;
      Utility.getGraphMeRequestWithCacheAsync(localAccessToken.getToken(), new Profile.1());
      AppMethodBeat.o(71811);
    }
  }

  public static Profile getCurrentProfile()
  {
    AppMethodBeat.i(71809);
    Profile localProfile = ProfileManager.getInstance().getCurrentProfile();
    AppMethodBeat.o(71809);
    return localProfile;
  }

  public static void setCurrentProfile(Profile paramProfile)
  {
    AppMethodBeat.i(71810);
    ProfileManager.getInstance().setCurrentProfile(paramProfile);
    AppMethodBeat.o(71810);
  }

  public final int describeContents()
  {
    return 0;
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    AppMethodBeat.i(71814);
    if (this == paramObject)
      AppMethodBeat.o(71814);
    while (true)
    {
      return bool;
      if (!(paramObject instanceof Profile))
      {
        AppMethodBeat.o(71814);
        bool = false;
      }
      else
      {
        paramObject = (Profile)paramObject;
        if ((this.id.equals(paramObject.id)) && (this.firstName == null))
        {
          if (paramObject.firstName == null)
          {
            AppMethodBeat.o(71814);
          }
          else
          {
            AppMethodBeat.o(71814);
            bool = false;
          }
        }
        else if ((this.firstName.equals(paramObject.firstName)) && (this.middleName == null))
        {
          if (paramObject.middleName == null)
          {
            AppMethodBeat.o(71814);
          }
          else
          {
            AppMethodBeat.o(71814);
            bool = false;
          }
        }
        else if ((this.middleName.equals(paramObject.middleName)) && (this.lastName == null))
        {
          if (paramObject.lastName == null)
          {
            AppMethodBeat.o(71814);
          }
          else
          {
            AppMethodBeat.o(71814);
            bool = false;
          }
        }
        else if ((this.lastName.equals(paramObject.lastName)) && (this.name == null))
        {
          if (paramObject.name == null)
          {
            AppMethodBeat.o(71814);
          }
          else
          {
            AppMethodBeat.o(71814);
            bool = false;
          }
        }
        else if ((this.name.equals(paramObject.name)) && (this.linkUri == null))
        {
          if (paramObject.linkUri == null)
          {
            AppMethodBeat.o(71814);
          }
          else
          {
            AppMethodBeat.o(71814);
            bool = false;
          }
        }
        else
        {
          bool = this.linkUri.equals(paramObject.linkUri);
          AppMethodBeat.o(71814);
        }
      }
    }
  }

  public final String getFirstName()
  {
    return this.firstName;
  }

  public final String getId()
  {
    return this.id;
  }

  public final String getLastName()
  {
    return this.lastName;
  }

  public final Uri getLinkUri()
  {
    return this.linkUri;
  }

  public final String getMiddleName()
  {
    return this.middleName;
  }

  public final String getName()
  {
    return this.name;
  }

  public final Uri getProfilePictureUri(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(71813);
    Uri localUri = ImageRequest.getProfilePictureUri(this.id, paramInt1, paramInt2);
    AppMethodBeat.o(71813);
    return localUri;
  }

  public final int hashCode()
  {
    AppMethodBeat.i(71815);
    int i = this.id.hashCode() + 527;
    int j = i;
    if (this.firstName != null)
      j = i * 31 + this.firstName.hashCode();
    i = j;
    if (this.middleName != null)
      i = j * 31 + this.middleName.hashCode();
    j = i;
    if (this.lastName != null)
      j = i * 31 + this.lastName.hashCode();
    i = j;
    if (this.name != null)
      i = j * 31 + this.name.hashCode();
    j = i;
    if (this.linkUri != null)
      j = i * 31 + this.linkUri.hashCode();
    AppMethodBeat.o(71815);
    return j;
  }

  final JSONObject toJSONObject()
  {
    AppMethodBeat.i(71816);
    JSONObject localJSONObject1 = new JSONObject();
    try
    {
      localJSONObject1.put("id", this.id);
      localJSONObject1.put("first_name", this.firstName);
      localJSONObject1.put("middle_name", this.middleName);
      localJSONObject1.put("last_name", this.lastName);
      localJSONObject1.put("name", this.name);
      JSONObject localJSONObject2 = localJSONObject1;
      if (this.linkUri != null)
      {
        localJSONObject1.put("link_uri", this.linkUri.toString());
        localJSONObject2 = localJSONObject1;
      }
      AppMethodBeat.o(71816);
      return localJSONObject2;
    }
    catch (JSONException localJSONException)
    {
      while (true)
        Object localObject = null;
    }
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(71819);
    paramParcel.writeString(this.id);
    paramParcel.writeString(this.firstName);
    paramParcel.writeString(this.middleName);
    paramParcel.writeString(this.lastName);
    paramParcel.writeString(this.name);
    if (this.linkUri == null);
    for (String str = null; ; str = this.linkUri.toString())
    {
      paramParcel.writeString(str);
      AppMethodBeat.o(71819);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.facebook.Profile
 * JD-Core Version:    0.6.2
 */