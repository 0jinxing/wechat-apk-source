package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.facebook.internal.FacebookRequestErrorClassification;
import com.facebook.internal.FetchedAppSettings;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.Utility;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.net.HttpURLConnection;
import org.json.JSONException;
import org.json.JSONObject;

public final class FacebookRequestError
  implements Parcelable
{
  private static final String BODY_KEY = "body";
  private static final String CODE_KEY = "code";
  public static final Parcelable.Creator<FacebookRequestError> CREATOR;
  private static final String ERROR_CODE_FIELD_KEY = "code";
  private static final String ERROR_CODE_KEY = "error_code";
  private static final String ERROR_IS_TRANSIENT_KEY = "is_transient";
  private static final String ERROR_KEY = "error";
  private static final String ERROR_MESSAGE_FIELD_KEY = "message";
  private static final String ERROR_MSG_KEY = "error_msg";
  private static final String ERROR_REASON_KEY = "error_reason";
  private static final String ERROR_SUB_CODE_KEY = "error_subcode";
  private static final String ERROR_TYPE_FIELD_KEY = "type";
  private static final String ERROR_USER_MSG_KEY = "error_user_msg";
  private static final String ERROR_USER_TITLE_KEY = "error_user_title";
  static final FacebookRequestError.Range HTTP_RANGE_SUCCESS;
  public static final int INVALID_ERROR_CODE = -1;
  public static final int INVALID_HTTP_STATUS_CODE = -1;
  private final Object batchRequestResult;
  private final FacebookRequestError.Category category;
  private final HttpURLConnection connection;
  private final int errorCode;
  private final String errorMessage;
  private final String errorRecoveryMessage;
  private final String errorType;
  private final String errorUserMessage;
  private final String errorUserTitle;
  private final FacebookException exception;
  private final JSONObject requestResult;
  private final JSONObject requestResultBody;
  private final int requestStatusCode;
  private final int subErrorCode;

  static
  {
    AppMethodBeat.i(71596);
    HTTP_RANGE_SUCCESS = new FacebookRequestError.Range(200, 299, null);
    CREATOR = new FacebookRequestError.1();
    AppMethodBeat.o(71596);
  }

  private FacebookRequestError(int paramInt1, int paramInt2, int paramInt3, String paramString1, String paramString2, String paramString3, String paramString4, boolean paramBoolean, JSONObject paramJSONObject1, JSONObject paramJSONObject2, Object paramObject, HttpURLConnection paramHttpURLConnection, FacebookException paramFacebookException)
  {
    AppMethodBeat.i(71588);
    this.requestStatusCode = paramInt1;
    this.errorCode = paramInt2;
    this.subErrorCode = paramInt3;
    this.errorType = paramString1;
    this.errorMessage = paramString2;
    this.requestResultBody = paramJSONObject1;
    this.requestResult = paramJSONObject2;
    this.batchRequestResult = paramObject;
    this.connection = paramHttpURLConnection;
    this.errorUserTitle = paramString3;
    this.errorUserMessage = paramString4;
    paramInt1 = 0;
    if (paramFacebookException != null)
    {
      this.exception = paramFacebookException;
      paramInt1 = 1;
      paramString2 = getErrorClassification();
      if (paramInt1 == 0)
        break label143;
    }
    label143: for (paramString1 = FacebookRequestError.Category.OTHER; ; paramString1 = paramString2.classify(paramInt2, paramInt3, paramBoolean))
    {
      this.category = paramString1;
      this.errorRecoveryMessage = paramString2.getRecoveryMessage(this.category);
      AppMethodBeat.o(71588);
      return;
      this.exception = new FacebookServiceException(this, paramString2);
      break;
    }
  }

  public FacebookRequestError(int paramInt, String paramString1, String paramString2)
  {
    this(-1, paramInt, -1, paramString1, paramString2, null, null, false, null, null, null, null, null);
  }

  private FacebookRequestError(Parcel paramParcel)
  {
    this(paramParcel.readInt(), paramParcel.readInt(), paramParcel.readInt(), paramParcel.readString(), paramParcel.readString(), paramParcel.readString(), paramParcel.readString(), false, null, null, null, null, null);
    AppMethodBeat.i(71595);
    AppMethodBeat.o(71595);
  }

  FacebookRequestError(HttpURLConnection paramHttpURLConnection, Exception paramException)
  {
  }

  static FacebookRequestError checkResponseAndCreateError(JSONObject paramJSONObject, Object paramObject, HttpURLConnection paramHttpURLConnection)
  {
    AppMethodBeat.i(71592);
    try
    {
      if (paramJSONObject.has("code"))
      {
        int i = paramJSONObject.getInt("code");
        Object localObject1 = Utility.getStringPropertyAsJSON(paramJSONObject, "body", "FACEBOOK_NON_JSON_RESULT");
        if ((localObject1 != null) && ((localObject1 instanceof JSONObject)))
        {
          JSONObject localJSONObject = (JSONObject)localObject1;
          localObject1 = null;
          String str = null;
          Object localObject2 = null;
          Object localObject3 = null;
          boolean bool1 = false;
          int j = 0;
          int k = 0;
          int m = 0;
          Object localObject4;
          Object localObject5;
          boolean bool2;
          if (localJSONObject.has("error"))
          {
            localObject3 = (JSONObject)Utility.getStringPropertyAsJSON(localJSONObject, "error", null);
            localObject1 = ((JSONObject)localObject3).optString("type", null);
            str = ((JSONObject)localObject3).optString("message", null);
            j = ((JSONObject)localObject3).optInt("code", -1);
            k = ((JSONObject)localObject3).optInt("error_subcode", -1);
            localObject4 = ((JSONObject)localObject3).optString("error_user_msg", null);
            localObject5 = ((JSONObject)localObject3).optString("error_user_title", null);
            bool2 = ((JSONObject)localObject3).optBoolean("is_transient", false);
            m = 1;
          }
          while (m != 0)
          {
            localObject3 = new com/facebook/FacebookRequestError;
            ((FacebookRequestError)localObject3).<init>(i, j, k, (String)localObject1, str, (String)localObject5, (String)localObject4, bool2, localJSONObject, paramJSONObject, paramObject, paramHttpURLConnection, null);
            AppMethodBeat.o(71592);
            paramJSONObject = (JSONObject)localObject3;
            return paramJSONObject;
            if ((!localJSONObject.has("error_code")) && (!localJSONObject.has("error_msg")))
            {
              localObject5 = localObject3;
              localObject4 = localObject2;
              bool2 = bool1;
              if (!localJSONObject.has("error_reason"));
            }
            else
            {
              localObject1 = localJSONObject.optString("error_reason", null);
              str = localJSONObject.optString("error_msg", null);
              j = localJSONObject.optInt("error_code", -1);
              k = localJSONObject.optInt("error_subcode", -1);
              m = 1;
              localObject5 = localObject3;
              localObject4 = localObject2;
              bool2 = bool1;
            }
          }
        }
        if (!HTTP_RANGE_SUCCESS.contains(i))
        {
          if (paramJSONObject.has("body"));
          for (localObject1 = (JSONObject)Utility.getStringPropertyAsJSON(paramJSONObject, "body", "FACEBOOK_NON_JSON_RESULT"); ; localObject1 = null)
          {
            paramJSONObject = new FacebookRequestError(i, -1, -1, null, null, null, null, false, (JSONObject)localObject1, paramJSONObject, paramObject, paramHttpURLConnection, null);
            AppMethodBeat.o(71592);
            break;
          }
        }
      }
    }
    catch (JSONException paramJSONObject)
    {
      while (true)
      {
        paramJSONObject = null;
        AppMethodBeat.o(71592);
      }
    }
  }

  static FacebookRequestErrorClassification getErrorClassification()
  {
    try
    {
      AppMethodBeat.i(71593);
      Object localObject1 = FetchedAppSettingsManager.getAppSettingsWithoutQuery(FacebookSdk.getApplicationId());
      if (localObject1 == null)
      {
        localObject1 = FacebookRequestErrorClassification.getDefaultErrorClassification();
        AppMethodBeat.o(71593);
      }
      while (true)
      {
        return localObject1;
        localObject1 = ((FetchedAppSettings)localObject1).getErrorClassification();
        AppMethodBeat.o(71593);
      }
    }
    finally
    {
    }
  }

  public final int describeContents()
  {
    return 0;
  }

  public final Object getBatchRequestResult()
  {
    return this.batchRequestResult;
  }

  public final FacebookRequestError.Category getCategory()
  {
    return this.category;
  }

  public final HttpURLConnection getConnection()
  {
    return this.connection;
  }

  public final int getErrorCode()
  {
    return this.errorCode;
  }

  public final String getErrorMessage()
  {
    AppMethodBeat.i(71590);
    String str;
    if (this.errorMessage != null)
    {
      str = this.errorMessage;
      AppMethodBeat.o(71590);
    }
    while (true)
    {
      return str;
      str = this.exception.getLocalizedMessage();
      AppMethodBeat.o(71590);
    }
  }

  public final String getErrorRecoveryMessage()
  {
    return this.errorRecoveryMessage;
  }

  public final String getErrorType()
  {
    return this.errorType;
  }

  public final String getErrorUserMessage()
  {
    return this.errorUserMessage;
  }

  public final String getErrorUserTitle()
  {
    return this.errorUserTitle;
  }

  public final FacebookException getException()
  {
    return this.exception;
  }

  public final JSONObject getRequestResult()
  {
    return this.requestResult;
  }

  public final JSONObject getRequestResultBody()
  {
    return this.requestResultBody;
  }

  public final int getRequestStatusCode()
  {
    return this.requestStatusCode;
  }

  public final int getSubErrorCode()
  {
    return this.subErrorCode;
  }

  public final String toString()
  {
    AppMethodBeat.i(71591);
    String str = "{HttpStatus: " + this.requestStatusCode + ", errorCode: " + this.errorCode + ", subErrorCode: " + this.subErrorCode + ", errorType: " + this.errorType + ", errorMessage: " + getErrorMessage() + "}";
    AppMethodBeat.o(71591);
    return str;
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(71594);
    paramParcel.writeInt(this.requestStatusCode);
    paramParcel.writeInt(this.errorCode);
    paramParcel.writeInt(this.subErrorCode);
    paramParcel.writeString(this.errorType);
    paramParcel.writeString(this.errorMessage);
    paramParcel.writeString(this.errorUserTitle);
    paramParcel.writeString(this.errorUserMessage);
    AppMethodBeat.o(71594);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.facebook.FacebookRequestError
 * JD-Core Version:    0.6.2
 */