package com.facebook;

import android.content.Context;
import android.graphics.Bitmap;
import android.location.Location;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Bundle;
import android.os.Handler;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Pair;
import com.facebook.internal.AttributionIdentifiers;
import com.facebook.internal.InternalSettings;
import com.facebook.internal.Logger;
import com.facebook.internal.ServerProtocol;
import com.facebook.internal.Utility;
import com.facebook.internal.Validate;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.File;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;

public class GraphRequest
{
  private static final String ACCEPT_LANGUAGE_HEADER = "Accept-Language";
  public static final String ACCESS_TOKEN_PARAM = "access_token";
  private static final String ATTACHED_FILES_PARAM = "attached_files";
  private static final String ATTACHMENT_FILENAME_PREFIX = "file";
  private static final String BATCH_APP_ID_PARAM = "batch_app_id";
  private static final String BATCH_BODY_PARAM = "body";
  private static final String BATCH_ENTRY_DEPENDS_ON_PARAM = "depends_on";
  private static final String BATCH_ENTRY_NAME_PARAM = "name";
  private static final String BATCH_ENTRY_OMIT_RESPONSE_ON_SUCCESS_PARAM = "omit_response_on_success";
  private static final String BATCH_METHOD_PARAM = "method";
  private static final String BATCH_PARAM = "batch";
  private static final String BATCH_RELATIVE_URL_PARAM = "relative_url";
  private static final String CAPTION_PARAM = "caption";
  private static final String CONTENT_ENCODING_HEADER = "Content-Encoding";
  private static final String CONTENT_TYPE_HEADER = "Content-Type";
  private static final String DEBUG_KEY = "__debug__";
  private static final String DEBUG_MESSAGES_KEY = "messages";
  private static final String DEBUG_MESSAGE_KEY = "message";
  private static final String DEBUG_MESSAGE_LINK_KEY = "link";
  private static final String DEBUG_MESSAGE_TYPE_KEY = "type";
  private static final String DEBUG_PARAM = "debug";
  private static final String DEBUG_SEVERITY_INFO = "info";
  private static final String DEBUG_SEVERITY_WARNING = "warning";
  public static final String FIELDS_PARAM = "fields";
  private static final String FORMAT_JSON = "json";
  private static final String FORMAT_PARAM = "format";
  private static final String GRAPH_PATH_FORMAT = "%s/%s";
  private static final String ISO_8601_FORMAT_STRING = "yyyy-MM-dd'T'HH:mm:ssZ";
  public static final int MAXIMUM_BATCH_SIZE = 50;
  private static final String ME = "me";
  private static final String MIME_BOUNDARY;
  private static final String MY_FRIENDS = "me/friends";
  private static final String MY_PHOTOS = "me/photos";
  private static final String PICTURE_PARAM = "picture";
  private static final String SDK_ANDROID = "android";
  private static final String SDK_PARAM = "sdk";
  private static final String SEARCH = "search";
  public static final String TAG;
  private static final String USER_AGENT_BASE = "FBAndroidSDK";
  private static final String USER_AGENT_HEADER = "User-Agent";
  private static final String VIDEOS_SUFFIX = "/videos";
  private static String defaultBatchApplicationId;
  private static volatile String userAgent;
  private static Pattern versionPattern;
  private AccessToken accessToken;
  private String batchEntryDependsOn;
  private String batchEntryName;
  private boolean batchEntryOmitResultOnSuccess;
  private GraphRequest.Callback callback;
  private JSONObject graphObject;
  private String graphPath;
  private HttpMethod httpMethod;
  private String overriddenURL;
  private Bundle parameters;
  private boolean skipClientToken;
  private Object tag;
  private String version;

  static
  {
    AppMethodBeat.i(71723);
    TAG = GraphRequest.class.getSimpleName();
    versionPattern = Pattern.compile("^/?v\\d+\\.\\d+/(.*)");
    char[] arrayOfChar = "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    StringBuilder localStringBuilder = new StringBuilder();
    SecureRandom localSecureRandom = new SecureRandom();
    int i = localSecureRandom.nextInt(11);
    for (int j = 0; j < i + 30; j++)
      localStringBuilder.append(arrayOfChar[localSecureRandom.nextInt(arrayOfChar.length)]);
    MIME_BOUNDARY = localStringBuilder.toString();
    AppMethodBeat.o(71723);
  }

  public GraphRequest()
  {
    this(null, null, null, null, null);
  }

  public GraphRequest(AccessToken paramAccessToken, String paramString)
  {
    this(paramAccessToken, paramString, null, null, null);
  }

  public GraphRequest(AccessToken paramAccessToken, String paramString, Bundle paramBundle, HttpMethod paramHttpMethod)
  {
    this(paramAccessToken, paramString, paramBundle, paramHttpMethod, null);
  }

  public GraphRequest(AccessToken paramAccessToken, String paramString, Bundle paramBundle, HttpMethod paramHttpMethod, GraphRequest.Callback paramCallback)
  {
    this(paramAccessToken, paramString, paramBundle, paramHttpMethod, paramCallback, null);
  }

  public GraphRequest(AccessToken paramAccessToken, String paramString1, Bundle paramBundle, HttpMethod paramHttpMethod, GraphRequest.Callback paramCallback, String paramString2)
  {
    AppMethodBeat.i(71664);
    this.batchEntryOmitResultOnSuccess = true;
    this.skipClientToken = false;
    this.accessToken = paramAccessToken;
    this.graphPath = paramString1;
    this.version = paramString2;
    setCallback(paramCallback);
    setHttpMethod(paramHttpMethod);
    if (paramBundle != null);
    for (this.parameters = new Bundle(paramBundle); ; this.parameters = new Bundle())
    {
      if (this.version == null)
        this.version = FacebookSdk.getGraphApiVersion();
      AppMethodBeat.o(71664);
      return;
    }
  }

  GraphRequest(AccessToken paramAccessToken, URL paramURL)
  {
    AppMethodBeat.i(71665);
    this.batchEntryOmitResultOnSuccess = true;
    this.skipClientToken = false;
    this.accessToken = paramAccessToken;
    this.overriddenURL = paramURL.toString();
    setHttpMethod(HttpMethod.GET);
    this.parameters = new Bundle();
    AppMethodBeat.o(71665);
  }

  private void addCommonParameters()
  {
    AppMethodBeat.i(71698);
    String str1;
    if (this.accessToken != null)
      if (!this.parameters.containsKey("access_token"))
      {
        str1 = this.accessToken.getToken();
        Logger.registerAccessToken(str1);
        this.parameters.putString("access_token", str1);
      }
    label214: 
    while (true)
    {
      this.parameters.putString("sdk", "android");
      this.parameters.putString("format", "json");
      if (FacebookSdk.isLoggingBehaviorEnabled(LoggingBehavior.GRAPH_API_DEBUG_INFO))
      {
        this.parameters.putString("debug", "info");
        AppMethodBeat.o(71698);
      }
      while (true)
      {
        return;
        if ((this.skipClientToken) || (this.parameters.containsKey("access_token")))
          break label214;
        str1 = FacebookSdk.getApplicationId();
        String str2 = FacebookSdk.getClientToken();
        if ((!Utility.isNullOrEmpty(str1)) && (!Utility.isNullOrEmpty(str2)))
        {
          str1 = str1 + "|" + str2;
          this.parameters.putString("access_token", str1);
          break;
        }
        Utility.logd(TAG, "Warning: Request without access token missing application ID or client token.");
        break;
        if (FacebookSdk.isLoggingBehaviorEnabled(LoggingBehavior.GRAPH_API_DEBUG_WARNING))
          this.parameters.putString("debug", "warning");
        AppMethodBeat.o(71698);
      }
    }
  }

  private String appendParametersToBaseUrl(String paramString, Boolean paramBoolean)
  {
    AppMethodBeat.i(71699);
    if ((!paramBoolean.booleanValue()) && (this.httpMethod == HttpMethod.POST))
      AppMethodBeat.o(71699);
    while (true)
    {
      return paramString;
      Uri.Builder localBuilder = Uri.parse(paramString).buildUpon();
      Iterator localIterator = this.parameters.keySet().iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        paramBoolean = this.parameters.get(str);
        paramString = paramBoolean;
        if (paramBoolean == null)
          paramString = "";
        if (isSupportedParameterType(paramString))
        {
          localBuilder.appendQueryParameter(str, parameterToString(paramString).toString());
        }
        else if (this.httpMethod == HttpMethod.GET)
        {
          paramString = new IllegalArgumentException(String.format(Locale.US, "Unsupported parameter type for GET request: %s", new Object[] { paramString.getClass().getSimpleName() }));
          AppMethodBeat.o(71699);
          throw paramString;
        }
      }
      paramString = localBuilder.toString();
      AppMethodBeat.o(71699);
    }
  }

  private static HttpURLConnection createConnection(URL paramURL)
  {
    AppMethodBeat.i(71697);
    paramURL = (HttpURLConnection)paramURL.openConnection();
    paramURL.setRequestProperty("User-Agent", getUserAgent());
    paramURL.setRequestProperty("Accept-Language", Locale.getDefault().toString());
    paramURL.setChunkedStreamingMode(0);
    AppMethodBeat.o(71697);
    return paramURL;
  }

  public static GraphResponse executeAndWait(GraphRequest paramGraphRequest)
  {
    AppMethodBeat.i(71684);
    paramGraphRequest = executeBatchAndWait(new GraphRequest[] { paramGraphRequest });
    if ((paramGraphRequest == null) || (paramGraphRequest.size() != 1))
    {
      paramGraphRequest = new FacebookException("invalid state: expected a single response");
      AppMethodBeat.o(71684);
      throw paramGraphRequest;
    }
    paramGraphRequest = (GraphResponse)paramGraphRequest.get(0);
    AppMethodBeat.o(71684);
    return paramGraphRequest;
  }

  public static List<GraphResponse> executeBatchAndWait(GraphRequestBatch paramGraphRequestBatch)
  {
    Object localObject1 = null;
    AppMethodBeat.i(71687);
    Validate.notEmptyAndContainsNoNulls(paramGraphRequestBatch, "requests");
    Object localObject2 = localObject1;
    try
    {
      HttpURLConnection localHttpURLConnection = toHttpConnection(paramGraphRequestBatch);
      localObject1 = localHttpURLConnection;
      localObject2 = localObject1;
      paramGraphRequestBatch = executeConnectionAndWait(localObject1, paramGraphRequestBatch);
      return paramGraphRequestBatch;
    }
    catch (Exception localException)
    {
      while (true)
      {
        localObject2 = localObject1;
        List localList2 = paramGraphRequestBatch.getRequests();
        localObject2 = localObject1;
        FacebookException localFacebookException = new com/facebook/FacebookException;
        localObject2 = localObject1;
        localFacebookException.<init>(localException);
        localObject2 = localObject1;
        List localList1 = GraphResponse.constructErrorResponses(localList2, null, localFacebookException);
        localObject2 = localObject1;
        runCallbacks(paramGraphRequestBatch, localList1);
        Utility.disconnectQuietly(null);
        AppMethodBeat.o(71687);
        paramGraphRequestBatch = localList1;
      }
    }
    finally
    {
      Utility.disconnectQuietly(localObject2);
      AppMethodBeat.o(71687);
    }
    throw paramGraphRequestBatch;
  }

  public static List<GraphResponse> executeBatchAndWait(Collection<GraphRequest> paramCollection)
  {
    AppMethodBeat.i(71686);
    paramCollection = executeBatchAndWait(new GraphRequestBatch(paramCollection));
    AppMethodBeat.o(71686);
    return paramCollection;
  }

  public static List<GraphResponse> executeBatchAndWait(GraphRequest[] paramArrayOfGraphRequest)
  {
    AppMethodBeat.i(71685);
    Validate.notNull(paramArrayOfGraphRequest, "requests");
    paramArrayOfGraphRequest = executeBatchAndWait(Arrays.asList(paramArrayOfGraphRequest));
    AppMethodBeat.o(71685);
    return paramArrayOfGraphRequest;
  }

  public static GraphRequestAsyncTask executeBatchAsync(GraphRequestBatch paramGraphRequestBatch)
  {
    AppMethodBeat.i(71690);
    Validate.notEmptyAndContainsNoNulls(paramGraphRequestBatch, "requests");
    paramGraphRequestBatch = new GraphRequestAsyncTask(paramGraphRequestBatch);
    paramGraphRequestBatch.executeOnExecutor(FacebookSdk.getExecutor(), new Void[0]);
    AppMethodBeat.o(71690);
    return paramGraphRequestBatch;
  }

  public static GraphRequestAsyncTask executeBatchAsync(Collection<GraphRequest> paramCollection)
  {
    AppMethodBeat.i(71689);
    paramCollection = executeBatchAsync(new GraphRequestBatch(paramCollection));
    AppMethodBeat.o(71689);
    return paramCollection;
  }

  public static GraphRequestAsyncTask executeBatchAsync(GraphRequest[] paramArrayOfGraphRequest)
  {
    AppMethodBeat.i(71688);
    Validate.notNull(paramArrayOfGraphRequest, "requests");
    paramArrayOfGraphRequest = executeBatchAsync(Arrays.asList(paramArrayOfGraphRequest));
    AppMethodBeat.o(71688);
    return paramArrayOfGraphRequest;
  }

  public static List<GraphResponse> executeConnectionAndWait(HttpURLConnection paramHttpURLConnection, GraphRequestBatch paramGraphRequestBatch)
  {
    AppMethodBeat.i(71692);
    List localList = GraphResponse.fromHttpConnection(paramHttpURLConnection, paramGraphRequestBatch);
    Utility.disconnectQuietly(paramHttpURLConnection);
    int i = paramGraphRequestBatch.size();
    if (i != localList.size())
    {
      paramHttpURLConnection = new FacebookException(String.format(Locale.US, "Received %d responses while expecting %d", new Object[] { Integer.valueOf(localList.size()), Integer.valueOf(i) }));
      AppMethodBeat.o(71692);
      throw paramHttpURLConnection;
    }
    runCallbacks(paramGraphRequestBatch, localList);
    AccessTokenManager.getInstance().extendAccessTokenIfNeeded();
    AppMethodBeat.o(71692);
    return localList;
  }

  public static List<GraphResponse> executeConnectionAndWait(HttpURLConnection paramHttpURLConnection, Collection<GraphRequest> paramCollection)
  {
    AppMethodBeat.i(71691);
    paramHttpURLConnection = executeConnectionAndWait(paramHttpURLConnection, new GraphRequestBatch(paramCollection));
    AppMethodBeat.o(71691);
    return paramHttpURLConnection;
  }

  public static GraphRequestAsyncTask executeConnectionAsync(Handler paramHandler, HttpURLConnection paramHttpURLConnection, GraphRequestBatch paramGraphRequestBatch)
  {
    AppMethodBeat.i(71694);
    Validate.notNull(paramHttpURLConnection, "connection");
    paramHttpURLConnection = new GraphRequestAsyncTask(paramHttpURLConnection, paramGraphRequestBatch);
    paramGraphRequestBatch.setCallbackHandler(paramHandler);
    paramHttpURLConnection.executeOnExecutor(FacebookSdk.getExecutor(), new Void[0]);
    AppMethodBeat.o(71694);
    return paramHttpURLConnection;
  }

  public static GraphRequestAsyncTask executeConnectionAsync(HttpURLConnection paramHttpURLConnection, GraphRequestBatch paramGraphRequestBatch)
  {
    AppMethodBeat.i(71693);
    paramHttpURLConnection = executeConnectionAsync(null, paramHttpURLConnection, paramGraphRequestBatch);
    AppMethodBeat.o(71693);
    return paramHttpURLConnection;
  }

  private static String getBatchAppId(GraphRequestBatch paramGraphRequestBatch)
  {
    AppMethodBeat.i(71719);
    if (!Utility.isNullOrEmpty(paramGraphRequestBatch.getBatchApplicationId()))
    {
      paramGraphRequestBatch = paramGraphRequestBatch.getBatchApplicationId();
      AppMethodBeat.o(71719);
    }
    while (true)
    {
      return paramGraphRequestBatch;
      Iterator localIterator = paramGraphRequestBatch.iterator();
      while (true)
        if (localIterator.hasNext())
        {
          paramGraphRequestBatch = ((GraphRequest)localIterator.next()).accessToken;
          if (paramGraphRequestBatch != null)
          {
            paramGraphRequestBatch = paramGraphRequestBatch.getApplicationId();
            if (paramGraphRequestBatch != null)
            {
              AppMethodBeat.o(71719);
              break;
            }
          }
        }
      if (!Utility.isNullOrEmpty(defaultBatchApplicationId))
      {
        paramGraphRequestBatch = defaultBatchApplicationId;
        AppMethodBeat.o(71719);
      }
      else
      {
        paramGraphRequestBatch = FacebookSdk.getApplicationId();
        AppMethodBeat.o(71719);
      }
    }
  }

  public static final String getDefaultBatchApplicationId()
  {
    return defaultBatchApplicationId;
  }

  private static String getDefaultPhotoPathIfNull(String paramString)
  {
    String str = paramString;
    if (paramString == null)
      str = "me/photos";
    return str;
  }

  private String getGraphPathWithVersion()
  {
    AppMethodBeat.i(71702);
    String str;
    if (versionPattern.matcher(this.graphPath).matches())
    {
      str = this.graphPath;
      AppMethodBeat.o(71702);
    }
    while (true)
    {
      return str;
      str = String.format("%s/%s", new Object[] { this.version, this.graphPath });
      AppMethodBeat.o(71702);
    }
  }

  private static String getMimeContentType()
  {
    AppMethodBeat.i(71717);
    String str = String.format("multipart/form-data; boundary=%s", new Object[] { MIME_BOUNDARY });
    AppMethodBeat.o(71717);
    return str;
  }

  private static String getUserAgent()
  {
    AppMethodBeat.i(71718);
    if (userAgent == null)
    {
      userAgent = String.format("%s.%s", new Object[] { "FBAndroidSDK", "4.38.1" });
      str = InternalSettings.getCustomUserAgent();
      if (!Utility.isNullOrEmpty(str))
        userAgent = String.format(Locale.ROOT, "%s/%s", new Object[] { userAgent, str });
    }
    String str = userAgent;
    AppMethodBeat.o(71718);
    return str;
  }

  private static boolean hasOnProgressCallbacks(GraphRequestBatch paramGraphRequestBatch)
  {
    AppMethodBeat.i(71704);
    Iterator localIterator = paramGraphRequestBatch.getCallbacks().iterator();
    boolean bool;
    while (localIterator.hasNext())
      if (((GraphRequestBatch.Callback)localIterator.next() instanceof GraphRequestBatch.OnProgressCallback))
      {
        AppMethodBeat.o(71704);
        bool = true;
      }
    while (true)
    {
      return bool;
      paramGraphRequestBatch = paramGraphRequestBatch.iterator();
      while (true)
        if (paramGraphRequestBatch.hasNext())
          if ((((GraphRequest)paramGraphRequestBatch.next()).getCallback() instanceof OnProgressCallback))
          {
            AppMethodBeat.o(71704);
            bool = true;
            break;
          }
      bool = false;
      AppMethodBeat.o(71704);
    }
  }

  private static boolean isGzipCompressible(GraphRequestBatch paramGraphRequestBatch)
  {
    AppMethodBeat.i(71706);
    GraphRequest localGraphRequest;
    String str;
    do
    {
      paramGraphRequestBatch = paramGraphRequestBatch.iterator();
      Iterator localIterator;
      while (!localIterator.hasNext())
      {
        if (!paramGraphRequestBatch.hasNext())
          break;
        localGraphRequest = (GraphRequest)paramGraphRequestBatch.next();
        localIterator = localGraphRequest.parameters.keySet().iterator();
      }
      str = (String)localIterator.next();
    }
    while (!isSupportedAttachmentType(localGraphRequest.parameters.get(str)));
    boolean bool = false;
    AppMethodBeat.o(71706);
    while (true)
    {
      return bool;
      bool = true;
      AppMethodBeat.o(71706);
    }
  }

  private static boolean isMeRequest(String paramString)
  {
    boolean bool = true;
    AppMethodBeat.i(71711);
    Matcher localMatcher = versionPattern.matcher(paramString);
    if (localMatcher.matches())
      paramString = localMatcher.group(1);
    if ((paramString.startsWith("me/")) || (paramString.startsWith("/me/")))
      AppMethodBeat.o(71711);
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(71711);
    }
  }

  private static boolean isSupportedAttachmentType(Object paramObject)
  {
    if (((paramObject instanceof Bitmap)) || ((paramObject instanceof byte[])) || ((paramObject instanceof Uri)) || ((paramObject instanceof ParcelFileDescriptor)) || ((paramObject instanceof GraphRequest.ParcelableResourceWithMimeType)));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  private static boolean isSupportedParameterType(Object paramObject)
  {
    if (((paramObject instanceof String)) || ((paramObject instanceof Boolean)) || ((paramObject instanceof Number)) || ((paramObject instanceof Date)));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public static GraphRequest newCustomAudienceThirdPartyIdRequest(AccessToken paramAccessToken, Context paramContext, GraphRequest.Callback paramCallback)
  {
    AppMethodBeat.i(71676);
    paramAccessToken = newCustomAudienceThirdPartyIdRequest(paramAccessToken, paramContext, null, paramCallback);
    AppMethodBeat.o(71676);
    return paramAccessToken;
  }

  public static GraphRequest newCustomAudienceThirdPartyIdRequest(AccessToken paramAccessToken, Context paramContext, String paramString, GraphRequest.Callback paramCallback)
  {
    AppMethodBeat.i(71675);
    if ((paramString == null) && (paramAccessToken != null))
      paramString = paramAccessToken.getApplicationId();
    while (true)
    {
      Object localObject = paramString;
      if (paramString == null)
        localObject = Utility.getMetadataApplicationId(paramContext);
      if (localObject == null)
      {
        paramAccessToken = new FacebookException("Facebook App ID cannot be determined");
        AppMethodBeat.o(71675);
        throw paramAccessToken;
      }
      String str = (String)localObject + "/custom_audience_third_party_id";
      AttributionIdentifiers localAttributionIdentifiers = AttributionIdentifiers.getAttributionIdentifiers(paramContext);
      localObject = new Bundle();
      if (paramAccessToken == null)
      {
        if (localAttributionIdentifiers == null)
        {
          paramAccessToken = new FacebookException("There is no access token and attribution identifiers could not be retrieved");
          AppMethodBeat.o(71675);
          throw paramAccessToken;
        }
        if (localAttributionIdentifiers.getAttributionId() == null)
          break label209;
      }
      label209: for (paramString = localAttributionIdentifiers.getAttributionId(); ; paramString = localAttributionIdentifiers.getAndroidAdvertiserId())
      {
        if (localAttributionIdentifiers.getAttributionId() != null)
          ((Bundle)localObject).putString("udid", paramString);
        if ((FacebookSdk.getLimitEventAndDataUsage(paramContext)) || ((localAttributionIdentifiers != null) && (localAttributionIdentifiers.isTrackingLimited())))
          ((Bundle)localObject).putString("limit_event_usage", "1");
        paramAccessToken = new GraphRequest(paramAccessToken, str, (Bundle)localObject, HttpMethod.GET, paramCallback);
        AppMethodBeat.o(71675);
        return paramAccessToken;
      }
    }
  }

  public static GraphRequest newDeleteObjectRequest(AccessToken paramAccessToken, String paramString, GraphRequest.Callback paramCallback)
  {
    AppMethodBeat.i(71666);
    paramAccessToken = new GraphRequest(paramAccessToken, paramString, null, HttpMethod.DELETE, paramCallback);
    AppMethodBeat.o(71666);
    return paramAccessToken;
  }

  public static GraphRequest newGraphPathRequest(AccessToken paramAccessToken, String paramString, GraphRequest.Callback paramCallback)
  {
    AppMethodBeat.i(71670);
    paramAccessToken = new GraphRequest(paramAccessToken, paramString, null, null, paramCallback);
    AppMethodBeat.o(71670);
    return paramAccessToken;
  }

  public static GraphRequest newMeRequest(AccessToken paramAccessToken, GraphJSONObjectCallback paramGraphJSONObjectCallback)
  {
    AppMethodBeat.i(71667);
    paramAccessToken = new GraphRequest(paramAccessToken, "me", null, null, new GraphRequest.Callback()
    {
      public final void onCompleted(GraphResponse paramAnonymousGraphResponse)
      {
        AppMethodBeat.i(71640);
        if (this.val$callback != null)
          this.val$callback.onCompleted(paramAnonymousGraphResponse.getJSONObject(), paramAnonymousGraphResponse);
        AppMethodBeat.o(71640);
      }
    });
    AppMethodBeat.o(71667);
    return paramAccessToken;
  }

  public static GraphRequest newMyFriendsRequest(AccessToken paramAccessToken, GraphRequest.GraphJSONArrayCallback paramGraphJSONArrayCallback)
  {
    AppMethodBeat.i(71669);
    paramAccessToken = new GraphRequest(paramAccessToken, "me/friends", null, null, new GraphRequest.Callback()
    {
      public final void onCompleted(GraphResponse paramAnonymousGraphResponse)
      {
        AppMethodBeat.i(71641);
        if (this.val$callback != null)
        {
          localObject = paramAnonymousGraphResponse.getJSONObject();
          if (localObject == null)
            break label45;
        }
        label45: for (Object localObject = ((JSONObject)localObject).optJSONArray("data"); ; localObject = null)
        {
          this.val$callback.onCompleted((JSONArray)localObject, paramAnonymousGraphResponse);
          AppMethodBeat.o(71641);
          return;
        }
      }
    });
    AppMethodBeat.o(71669);
    return paramAccessToken;
  }

  public static GraphRequest newPlacesSearchRequest(AccessToken paramAccessToken, Location paramLocation, int paramInt1, int paramInt2, String paramString, GraphRequest.GraphJSONArrayCallback paramGraphJSONArrayCallback)
  {
    AppMethodBeat.i(71671);
    if ((paramLocation == null) && (Utility.isNullOrEmpty(paramString)))
    {
      paramAccessToken = new FacebookException("Either location or searchText must be specified.");
      AppMethodBeat.o(71671);
      throw paramAccessToken;
    }
    Bundle localBundle = new Bundle(5);
    localBundle.putString("type", "place");
    localBundle.putInt("limit", paramInt2);
    if (paramLocation != null)
    {
      localBundle.putString("center", String.format(Locale.US, "%f,%f", new Object[] { Double.valueOf(paramLocation.getLatitude()), Double.valueOf(paramLocation.getLongitude()) }));
      localBundle.putInt("distance", paramInt1);
    }
    if (!Utility.isNullOrEmpty(paramString))
      localBundle.putString("q", paramString);
    paramLocation = new GraphRequest.Callback()
    {
      public final void onCompleted(GraphResponse paramAnonymousGraphResponse)
      {
        AppMethodBeat.i(71642);
        if (this.val$callback != null)
        {
          localObject = paramAnonymousGraphResponse.getJSONObject();
          if (localObject == null)
            break label45;
        }
        label45: for (Object localObject = ((JSONObject)localObject).optJSONArray("data"); ; localObject = null)
        {
          this.val$callback.onCompleted((JSONArray)localObject, paramAnonymousGraphResponse);
          AppMethodBeat.o(71642);
          return;
        }
      }
    };
    paramAccessToken = new GraphRequest(paramAccessToken, "search", localBundle, HttpMethod.GET, paramLocation);
    AppMethodBeat.o(71671);
    return paramAccessToken;
  }

  public static GraphRequest newPostRequest(AccessToken paramAccessToken, String paramString, JSONObject paramJSONObject, GraphRequest.Callback paramCallback)
  {
    AppMethodBeat.i(71668);
    paramAccessToken = new GraphRequest(paramAccessToken, paramString, null, HttpMethod.POST, paramCallback);
    paramAccessToken.setGraphObject(paramJSONObject);
    AppMethodBeat.o(71668);
    return paramAccessToken;
  }

  public static GraphRequest newUploadPhotoRequest(AccessToken paramAccessToken, String paramString1, Bitmap paramBitmap, String paramString2, Bundle paramBundle, GraphRequest.Callback paramCallback)
  {
    AppMethodBeat.i(71672);
    String str = getDefaultPhotoPathIfNull(paramString1);
    paramString1 = new Bundle();
    if (paramBundle != null)
      paramString1.putAll(paramBundle);
    paramString1.putParcelable("picture", paramBitmap);
    if ((paramString2 != null) && (!paramString2.isEmpty()))
      paramString1.putString("caption", paramString2);
    paramAccessToken = new GraphRequest(paramAccessToken, str, paramString1, HttpMethod.POST, paramCallback);
    AppMethodBeat.o(71672);
    return paramAccessToken;
  }

  public static GraphRequest newUploadPhotoRequest(AccessToken paramAccessToken, String paramString1, Uri paramUri, String paramString2, Bundle paramBundle, GraphRequest.Callback paramCallback)
  {
    AppMethodBeat.i(71674);
    String str = getDefaultPhotoPathIfNull(paramString1);
    if (Utility.isFileUri(paramUri))
    {
      paramAccessToken = newUploadPhotoRequest(paramAccessToken, str, new File(paramUri.getPath()), paramString2, paramBundle, paramCallback);
      AppMethodBeat.o(71674);
    }
    while (true)
    {
      return paramAccessToken;
      if (!Utility.isContentUri(paramUri))
      {
        paramAccessToken = new FacebookException("The photo Uri must be either a file:// or content:// Uri");
        AppMethodBeat.o(71674);
        throw paramAccessToken;
      }
      paramString1 = new Bundle();
      if (paramBundle != null)
        paramString1.putAll(paramBundle);
      paramString1.putParcelable("picture", paramUri);
      if ((paramString2 != null) && (!paramString2.isEmpty()))
        paramString1.putString("caption", paramString2);
      paramAccessToken = new GraphRequest(paramAccessToken, str, paramString1, HttpMethod.POST, paramCallback);
      AppMethodBeat.o(71674);
    }
  }

  public static GraphRequest newUploadPhotoRequest(AccessToken paramAccessToken, String paramString1, File paramFile, String paramString2, Bundle paramBundle, GraphRequest.Callback paramCallback)
  {
    AppMethodBeat.i(71673);
    paramString1 = getDefaultPhotoPathIfNull(paramString1);
    paramFile = ParcelFileDescriptor.open(paramFile, 268435456);
    Bundle localBundle = new Bundle();
    if (paramBundle != null)
      localBundle.putAll(paramBundle);
    localBundle.putParcelable("picture", paramFile);
    if ((paramString2 != null) && (!paramString2.isEmpty()))
      localBundle.putString("caption", paramString2);
    paramAccessToken = new GraphRequest(paramAccessToken, paramString1, localBundle, HttpMethod.POST, paramCallback);
    AppMethodBeat.o(71673);
    return paramAccessToken;
  }

  private static String parameterToString(Object paramObject)
  {
    AppMethodBeat.i(71720);
    if ((paramObject instanceof String))
    {
      paramObject = (String)paramObject;
      AppMethodBeat.o(71720);
    }
    while (true)
    {
      return paramObject;
      if (((paramObject instanceof Boolean)) || ((paramObject instanceof Number)))
      {
        paramObject = paramObject.toString();
        AppMethodBeat.o(71720);
      }
      else
      {
        if (!(paramObject instanceof Date))
          break;
        paramObject = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US).format(paramObject);
        AppMethodBeat.o(71720);
      }
    }
    paramObject = new IllegalArgumentException("Unsupported parameter type.");
    AppMethodBeat.o(71720);
    throw paramObject;
  }

  private static void processGraphObject(JSONObject paramJSONObject, String paramString, GraphRequest.KeyValueSerializer paramKeyValueSerializer)
  {
    AppMethodBeat.i(71712);
    int i;
    if (isMeRequest(paramString))
    {
      i = paramString.indexOf(":");
      int j = paramString.indexOf("?");
      if ((i > 3) && ((j == -1) || (i < j)))
        i = 1;
    }
    while (true)
    {
      Iterator localIterator = paramJSONObject.keys();
      label55: if (localIterator.hasNext())
      {
        paramString = (String)localIterator.next();
        Object localObject = paramJSONObject.opt(paramString);
        if ((i != 0) && (paramString.equalsIgnoreCase("image")));
        for (boolean bool = true; ; bool = false)
        {
          processGraphObjectProperty(paramString, localObject, paramKeyValueSerializer, bool);
          break label55;
          i = 0;
          break;
        }
      }
      AppMethodBeat.o(71712);
      return;
      i = 0;
    }
  }

  private static void processGraphObjectProperty(String paramString, Object paramObject, GraphRequest.KeyValueSerializer paramKeyValueSerializer, boolean paramBoolean)
  {
    AppMethodBeat.i(71713);
    Object localObject = paramObject.getClass();
    JSONObject localJSONObject;
    if (JSONObject.class.isAssignableFrom((Class)localObject))
    {
      localJSONObject = (JSONObject)paramObject;
      if (paramBoolean)
      {
        paramObject = localJSONObject.keys();
        while (paramObject.hasNext())
        {
          localObject = (String)paramObject.next();
          processGraphObjectProperty(String.format("%s[%s]", new Object[] { paramString, localObject }), localJSONObject.opt((String)localObject), paramKeyValueSerializer, paramBoolean);
        }
        AppMethodBeat.o(71713);
      }
    }
    while (true)
    {
      return;
      if (localJSONObject.has("id"))
      {
        paramObject = localJSONObject.optString("id");
        break;
      }
      if (localJSONObject.has("url"))
      {
        paramObject = localJSONObject.optString("url");
        break;
      }
      if (localJSONObject.has("fbsdk:create_object"))
      {
        paramObject = localJSONObject.toString();
        break;
      }
      AppMethodBeat.o(71713);
      continue;
      if (JSONArray.class.isAssignableFrom((Class)localObject))
      {
        paramObject = (JSONArray)paramObject;
        int i = paramObject.length();
        for (int j = 0; j < i; j++)
          processGraphObjectProperty(String.format(Locale.ROOT, "%s[%d]", new Object[] { paramString, Integer.valueOf(j) }), paramObject.opt(j), paramKeyValueSerializer, paramBoolean);
        AppMethodBeat.o(71713);
      }
      else if ((String.class.isAssignableFrom((Class)localObject)) || (Number.class.isAssignableFrom((Class)localObject)) || (Boolean.class.isAssignableFrom((Class)localObject)))
      {
        paramKeyValueSerializer.writeString(paramString, paramObject.toString());
        AppMethodBeat.o(71713);
      }
      else
      {
        if (Date.class.isAssignableFrom((Class)localObject))
        {
          paramObject = (Date)paramObject;
          paramKeyValueSerializer.writeString(paramString, new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US).format(paramObject));
        }
        AppMethodBeat.o(71713);
      }
    }
  }

  private static void processRequest(GraphRequestBatch paramGraphRequestBatch, Logger paramLogger, int paramInt, URL paramURL, OutputStream paramOutputStream, boolean paramBoolean)
  {
    AppMethodBeat.i(71710);
    paramOutputStream = new GraphRequest.Serializer(paramOutputStream, paramLogger, paramBoolean);
    if (paramInt == 1)
    {
      paramGraphRequestBatch = paramGraphRequestBatch.get(0);
      HashMap localHashMap = new HashMap();
      Iterator localIterator = paramGraphRequestBatch.parameters.keySet().iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        Object localObject = paramGraphRequestBatch.parameters.get(str);
        if (isSupportedAttachmentType(localObject))
          localHashMap.put(str, new GraphRequest.Attachment(paramGraphRequestBatch, localObject));
      }
      if (paramLogger != null)
        paramLogger.append("  Parameters:\n");
      serializeParameters(paramGraphRequestBatch.parameters, paramOutputStream, paramGraphRequestBatch);
      if (paramLogger != null)
        paramLogger.append("  Attachments:\n");
      serializeAttachments(localHashMap, paramOutputStream);
      if (paramGraphRequestBatch.graphObject != null)
        processGraphObject(paramGraphRequestBatch.graphObject, paramURL.getPath(), paramOutputStream);
      AppMethodBeat.o(71710);
    }
    while (true)
    {
      return;
      paramURL = getBatchAppId(paramGraphRequestBatch);
      if (Utility.isNullOrEmpty(paramURL))
      {
        paramGraphRequestBatch = new FacebookException("App ID was not specified at the request or Settings.");
        AppMethodBeat.o(71710);
        throw paramGraphRequestBatch;
      }
      paramOutputStream.writeString("batch_app_id", paramURL);
      paramURL = new HashMap();
      serializeRequestsAsJSON(paramOutputStream, paramGraphRequestBatch, paramURL);
      if (paramLogger != null)
        paramLogger.append("  Attachments:\n");
      serializeAttachments(paramURL, paramOutputStream);
      AppMethodBeat.o(71710);
    }
  }

  static void runCallbacks(final GraphRequestBatch paramGraphRequestBatch, List<GraphResponse> paramList)
  {
    AppMethodBeat.i(71696);
    int i = paramGraphRequestBatch.size();
    ArrayList localArrayList = new ArrayList();
    for (int j = 0; j < i; j++)
    {
      GraphRequest localGraphRequest = paramGraphRequestBatch.get(j);
      if (localGraphRequest.callback != null)
        localArrayList.add(new Pair(localGraphRequest.callback, paramList.get(j)));
    }
    if (localArrayList.size() > 0)
    {
      paramList = new Runnable()
      {
        public final void run()
        {
          AppMethodBeat.i(71644);
          Iterator localIterator = this.val$callbacks.iterator();
          while (localIterator.hasNext())
          {
            localObject = (Pair)localIterator.next();
            ((GraphRequest.Callback)((Pair)localObject).first).onCompleted((GraphResponse)((Pair)localObject).second);
          }
          Object localObject = paramGraphRequestBatch.getCallbacks().iterator();
          while (((Iterator)localObject).hasNext())
            ((GraphRequestBatch.Callback)((Iterator)localObject).next()).onBatchCompleted(paramGraphRequestBatch);
          AppMethodBeat.o(71644);
        }
      };
      paramGraphRequestBatch = paramGraphRequestBatch.getCallbackHandler();
      if (paramGraphRequestBatch == null)
      {
        paramList.run();
        AppMethodBeat.o(71696);
      }
    }
    while (true)
    {
      return;
      paramGraphRequestBatch.post(paramList);
      AppMethodBeat.o(71696);
    }
  }

  private static void serializeAttachments(Map<String, GraphRequest.Attachment> paramMap, GraphRequest.Serializer paramSerializer)
  {
    AppMethodBeat.i(71715);
    Iterator localIterator = paramMap.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      GraphRequest.Attachment localAttachment = (GraphRequest.Attachment)paramMap.get(str);
      if (isSupportedAttachmentType(localAttachment.getValue()))
        paramSerializer.writeObject(str, localAttachment.getValue(), localAttachment.getRequest());
    }
    AppMethodBeat.o(71715);
  }

  private static void serializeParameters(Bundle paramBundle, GraphRequest.Serializer paramSerializer, GraphRequest paramGraphRequest)
  {
    AppMethodBeat.i(71714);
    Iterator localIterator = paramBundle.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      Object localObject = paramBundle.get(str);
      if (isSupportedParameterType(localObject))
        paramSerializer.writeObject(str, localObject, paramGraphRequest);
    }
    AppMethodBeat.o(71714);
  }

  private static void serializeRequestsAsJSON(GraphRequest.Serializer paramSerializer, Collection<GraphRequest> paramCollection, Map<String, GraphRequest.Attachment> paramMap)
  {
    AppMethodBeat.i(71716);
    JSONArray localJSONArray = new JSONArray();
    Iterator localIterator = paramCollection.iterator();
    while (localIterator.hasNext())
      ((GraphRequest)localIterator.next()).serializeToBatch(localJSONArray, paramMap);
    paramSerializer.writeRequestsAsJson("batch", localJSONArray, paramCollection);
    AppMethodBeat.o(71716);
  }

  private void serializeToBatch(JSONArray paramJSONArray, Map<String, GraphRequest.Attachment> paramMap)
  {
    AppMethodBeat.i(71703);
    JSONObject localJSONObject = new JSONObject();
    if (this.batchEntryName != null)
    {
      localJSONObject.put("name", this.batchEntryName);
      localJSONObject.put("omit_response_on_success", this.batchEntryOmitResultOnSuccess);
    }
    if (this.batchEntryDependsOn != null)
      localJSONObject.put("depends_on", this.batchEntryDependsOn);
    String str1 = getRelativeUrlForBatchedRequest();
    localJSONObject.put("relative_url", str1);
    localJSONObject.put("method", this.httpMethod);
    if (this.accessToken != null)
      Logger.registerAccessToken(this.accessToken.getToken());
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = this.parameters.keySet().iterator();
    while (localIterator.hasNext())
    {
      Object localObject = (String)localIterator.next();
      localObject = this.parameters.get((String)localObject);
      if (isSupportedAttachmentType(localObject))
      {
        String str2 = String.format(Locale.ROOT, "%s%d", new Object[] { "file", Integer.valueOf(paramMap.size()) });
        localArrayList.add(str2);
        paramMap.put(str2, new GraphRequest.Attachment(this, localObject));
      }
    }
    if (!localArrayList.isEmpty())
      localJSONObject.put("attached_files", TextUtils.join(",", localArrayList));
    if (this.graphObject != null)
    {
      paramMap = new ArrayList();
      processGraphObject(this.graphObject, str1, new GraphRequest.6(this, paramMap));
      localJSONObject.put("body", TextUtils.join("&", paramMap));
    }
    paramJSONArray.put(localJSONObject);
    AppMethodBeat.o(71703);
  }

  // ERROR //
  static final void serializeToUrlConnection(GraphRequestBatch paramGraphRequestBatch, HttpURLConnection paramHttpURLConnection)
  {
    // Byte code:
    //   0: ldc_w 1079
    //   3: invokestatic 183	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: new 313	com/facebook/internal/Logger
    //   9: dup
    //   10: getstatic 1082	com/facebook/LoggingBehavior:REQUESTS	Lcom/facebook/LoggingBehavior;
    //   13: ldc_w 1084
    //   16: invokespecial 1087	com/facebook/internal/Logger:<init>	(Lcom/facebook/LoggingBehavior;Ljava/lang/String;)V
    //   19: astore_2
    //   20: aload_0
    //   21: invokevirtual 574	com/facebook/GraphRequestBatch:size	()I
    //   24: istore_3
    //   25: aload_0
    //   26: invokestatic 1089	com/facebook/GraphRequest:isGzipCompressible	(Lcom/facebook/GraphRequestBatch;)Z
    //   29: istore 4
    //   31: iload_3
    //   32: iconst_1
    //   33: if_icmpne +139 -> 172
    //   36: aload_0
    //   37: iconst_0
    //   38: invokevirtual 932	com/facebook/GraphRequestBatch:get	(I)Lcom/facebook/GraphRequest;
    //   41: getfield 366	com/facebook/GraphRequest:httpMethod	Lcom/facebook/HttpMethod;
    //   44: astore 5
    //   46: aload_1
    //   47: aload 5
    //   49: invokevirtual 1091	com/facebook/HttpMethod:name	()Ljava/lang/String;
    //   52: invokevirtual 1094	java/net/HttpURLConnection:setRequestMethod	(Ljava/lang/String;)V
    //   55: aload_1
    //   56: iload 4
    //   58: invokestatic 1098	com/facebook/GraphRequest:setConnectionContentType	(Ljava/net/HttpURLConnection;Z)V
    //   61: aload_1
    //   62: invokevirtual 1102	java/net/HttpURLConnection:getURL	()Ljava/net/URL;
    //   65: astore 6
    //   67: aload_2
    //   68: ldc_w 1104
    //   71: invokevirtual 948	com/facebook/internal/Logger:append	(Ljava/lang/String;)V
    //   74: aload_2
    //   75: ldc_w 1106
    //   78: aload_0
    //   79: invokevirtual 1109	com/facebook/GraphRequestBatch:getId	()Ljava/lang/String;
    //   82: invokevirtual 1113	com/facebook/internal/Logger:appendKeyValue	(Ljava/lang/String;Ljava/lang/Object;)V
    //   85: aload_2
    //   86: ldc_w 1115
    //   89: aload 6
    //   91: invokevirtual 1113	com/facebook/internal/Logger:appendKeyValue	(Ljava/lang/String;Ljava/lang/Object;)V
    //   94: aload_2
    //   95: ldc_w 1117
    //   98: aload_1
    //   99: invokevirtual 1120	java/net/HttpURLConnection:getRequestMethod	()Ljava/lang/String;
    //   102: invokevirtual 1113	com/facebook/internal/Logger:appendKeyValue	(Ljava/lang/String;Ljava/lang/Object;)V
    //   105: aload_2
    //   106: ldc 147
    //   108: aload_1
    //   109: ldc 147
    //   111: invokevirtual 1123	java/net/HttpURLConnection:getRequestProperty	(Ljava/lang/String;)Ljava/lang/String;
    //   114: invokevirtual 1113	com/facebook/internal/Logger:appendKeyValue	(Ljava/lang/String;Ljava/lang/Object;)V
    //   117: aload_2
    //   118: ldc 76
    //   120: aload_1
    //   121: ldc 76
    //   123: invokevirtual 1123	java/net/HttpURLConnection:getRequestProperty	(Ljava/lang/String;)Ljava/lang/String;
    //   126: invokevirtual 1113	com/facebook/internal/Logger:appendKeyValue	(Ljava/lang/String;Ljava/lang/Object;)V
    //   129: aload_1
    //   130: aload_0
    //   131: invokevirtual 1126	com/facebook/GraphRequestBatch:getTimeout	()I
    //   134: invokevirtual 1129	java/net/HttpURLConnection:setConnectTimeout	(I)V
    //   137: aload_1
    //   138: aload_0
    //   139: invokevirtual 1126	com/facebook/GraphRequestBatch:getTimeout	()I
    //   142: invokevirtual 1132	java/net/HttpURLConnection:setReadTimeout	(I)V
    //   145: aload 5
    //   147: getstatic 369	com/facebook/HttpMethod:POST	Lcom/facebook/HttpMethod;
    //   150: if_acmpne +30 -> 180
    //   153: iconst_1
    //   154: istore 7
    //   156: iload 7
    //   158: ifne +28 -> 186
    //   161: aload_2
    //   162: invokevirtual 1135	com/facebook/internal/Logger:log	()V
    //   165: ldc_w 1079
    //   168: invokestatic 233	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   171: return
    //   172: getstatic 369	com/facebook/HttpMethod:POST	Lcom/facebook/HttpMethod;
    //   175: astore 5
    //   177: goto -131 -> 46
    //   180: iconst_0
    //   181: istore 7
    //   183: goto -27 -> 156
    //   186: aload_1
    //   187: iconst_1
    //   188: invokevirtual 1139	java/net/HttpURLConnection:setDoOutput	(Z)V
    //   191: new 1141	java/io/BufferedOutputStream
    //   194: astore 8
    //   196: aload 8
    //   198: aload_1
    //   199: invokevirtual 1145	java/net/HttpURLConnection:getOutputStream	()Ljava/io/OutputStream;
    //   202: invokespecial 1148	java/io/BufferedOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   205: aload 8
    //   207: astore_1
    //   208: iload 4
    //   210: ifeq +21 -> 231
    //   213: aload 8
    //   215: astore 5
    //   217: new 1150	java/util/zip/GZIPOutputStream
    //   220: astore_1
    //   221: aload 8
    //   223: astore 5
    //   225: aload_1
    //   226: aload 8
    //   228: invokespecial 1151	java/util/zip/GZIPOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   231: aload_1
    //   232: astore 5
    //   234: aload_0
    //   235: invokestatic 1153	com/facebook/GraphRequest:hasOnProgressCallbacks	(Lcom/facebook/GraphRequestBatch;)Z
    //   238: ifeq +145 -> 383
    //   241: aload_1
    //   242: astore 5
    //   244: new 1155	com/facebook/ProgressNoopOutputStream
    //   247: astore 8
    //   249: aload_1
    //   250: astore 5
    //   252: aload 8
    //   254: aload_0
    //   255: invokevirtual 994	com/facebook/GraphRequestBatch:getCallbackHandler	()Landroid/os/Handler;
    //   258: invokespecial 1157	com/facebook/ProgressNoopOutputStream:<init>	(Landroid/os/Handler;)V
    //   261: aload_1
    //   262: astore 5
    //   264: aload_0
    //   265: aconst_null
    //   266: iload_3
    //   267: aload 6
    //   269: aload 8
    //   271: iload 4
    //   273: invokestatic 1159	com/facebook/GraphRequest:processRequest	(Lcom/facebook/GraphRequestBatch;Lcom/facebook/internal/Logger;ILjava/net/URL;Ljava/io/OutputStream;Z)V
    //   276: aload_1
    //   277: astore 5
    //   279: aload 8
    //   281: invokevirtual 1162	com/facebook/ProgressNoopOutputStream:getMaxProgress	()I
    //   284: istore 7
    //   286: aload_1
    //   287: astore 5
    //   289: aload 8
    //   291: invokevirtual 1166	com/facebook/ProgressNoopOutputStream:getProgressMap	()Ljava/util/Map;
    //   294: astore 9
    //   296: aload_1
    //   297: astore 5
    //   299: new 1168	com/facebook/ProgressOutputStream
    //   302: astore 8
    //   304: aload_1
    //   305: astore 5
    //   307: aload 8
    //   309: aload_1
    //   310: aload_0
    //   311: aload 9
    //   313: iload 7
    //   315: i2l
    //   316: invokespecial 1171	com/facebook/ProgressOutputStream:<init>	(Ljava/io/OutputStream;Lcom/facebook/GraphRequestBatch;Ljava/util/Map;J)V
    //   319: aload 8
    //   321: astore_1
    //   322: aload_0
    //   323: aload_2
    //   324: iload_3
    //   325: aload 6
    //   327: aload_1
    //   328: iload 4
    //   330: invokestatic 1159	com/facebook/GraphRequest:processRequest	(Lcom/facebook/GraphRequestBatch;Lcom/facebook/internal/Logger;ILjava/net/URL;Ljava/io/OutputStream;Z)V
    //   333: aload_1
    //   334: invokevirtual 1176	java/io/OutputStream:close	()V
    //   337: aload_2
    //   338: invokevirtual 1135	com/facebook/internal/Logger:log	()V
    //   341: ldc_w 1079
    //   344: invokestatic 233	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   347: goto -176 -> 171
    //   350: astore_0
    //   351: aconst_null
    //   352: astore 5
    //   354: aload 5
    //   356: ifnull +8 -> 364
    //   359: aload 5
    //   361: invokevirtual 1176	java/io/OutputStream:close	()V
    //   364: ldc_w 1079
    //   367: invokestatic 233	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   370: aload_0
    //   371: athrow
    //   372: astore_0
    //   373: goto -19 -> 354
    //   376: astore_0
    //   377: aload_1
    //   378: astore 5
    //   380: goto -26 -> 354
    //   383: goto -61 -> 322
    //
    // Exception table:
    //   from	to	target	type
    //   191	205	350	finally
    //   217	221	372	finally
    //   225	231	372	finally
    //   234	241	372	finally
    //   244	249	372	finally
    //   252	261	372	finally
    //   264	276	372	finally
    //   279	286	372	finally
    //   289	296	372	finally
    //   299	304	372	finally
    //   307	319	372	finally
    //   322	333	376	finally
  }

  private static void setConnectionContentType(HttpURLConnection paramHttpURLConnection, boolean paramBoolean)
  {
    AppMethodBeat.i(71705);
    if (paramBoolean)
    {
      paramHttpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
      paramHttpURLConnection.setRequestProperty("Content-Encoding", "gzip");
      AppMethodBeat.o(71705);
    }
    while (true)
    {
      return;
      paramHttpURLConnection.setRequestProperty("Content-Type", getMimeContentType());
      AppMethodBeat.o(71705);
    }
  }

  public static final void setDefaultBatchApplicationId(String paramString)
  {
    defaultBatchApplicationId = paramString;
  }

  static final boolean shouldWarnOnMissingFieldsParam(GraphRequest paramGraphRequest)
  {
    AppMethodBeat.i(71707);
    String str = paramGraphRequest.getVersion();
    boolean bool;
    if (Utility.isNullOrEmpty(str))
    {
      AppMethodBeat.o(71707);
      bool = true;
    }
    while (true)
    {
      return bool;
      paramGraphRequest = str;
      if (str.startsWith("v"))
        paramGraphRequest = str.substring(1);
      paramGraphRequest = paramGraphRequest.split("\\.");
      if (((paramGraphRequest.length >= 2) && (Integer.parseInt(paramGraphRequest[0]) > 2)) || ((Integer.parseInt(paramGraphRequest[0]) >= 2) && (Integer.parseInt(paramGraphRequest[1]) >= 4)))
      {
        AppMethodBeat.o(71707);
        bool = true;
      }
      else
      {
        AppMethodBeat.o(71707);
        bool = false;
      }
    }
  }

  // ERROR //
  public static HttpURLConnection toHttpConnection(GraphRequestBatch paramGraphRequestBatch)
  {
    // Byte code:
    //   0: ldc_w 1211
    //   3: invokestatic 183	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: aload_0
    //   7: invokestatic 1214	com/facebook/GraphRequest:validateFieldsParamForGetRequests	(Lcom/facebook/GraphRequestBatch;)V
    //   10: aload_0
    //   11: invokevirtual 574	com/facebook/GraphRequestBatch:size	()I
    //   14: iconst_1
    //   15: if_icmpne +45 -> 60
    //   18: new 279	java/net/URL
    //   21: dup
    //   22: aload_0
    //   23: iconst_0
    //   24: invokevirtual 932	com/facebook/GraphRequestBatch:get	(I)Lcom/facebook/GraphRequest;
    //   27: invokevirtual 1217	com/facebook/GraphRequest:getUrlForSingleRequest	()Ljava/lang/String;
    //   30: invokespecial 1218	java/net/URL:<init>	(Ljava/lang/String;)V
    //   33: astore_1
    //   34: aconst_null
    //   35: astore_2
    //   36: aconst_null
    //   37: astore_3
    //   38: aload_1
    //   39: invokestatic 1220	com/facebook/GraphRequest:createConnection	(Ljava/net/URL;)Ljava/net/HttpURLConnection;
    //   42: astore_1
    //   43: aload_1
    //   44: astore_3
    //   45: aload_1
    //   46: astore_2
    //   47: aload_0
    //   48: aload_1
    //   49: invokestatic 1222	com/facebook/GraphRequest:serializeToUrlConnection	(Lcom/facebook/GraphRequestBatch;Ljava/net/HttpURLConnection;)V
    //   52: ldc_w 1211
    //   55: invokestatic 233	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   58: aload_1
    //   59: areturn
    //   60: new 279	java/net/URL
    //   63: dup
    //   64: invokestatic 1227	com/facebook/internal/ServerProtocol:getGraphUrlBase	()Ljava/lang/String;
    //   67: invokespecial 1218	java/net/URL:<init>	(Ljava/lang/String;)V
    //   70: astore_1
    //   71: goto -37 -> 34
    //   74: astore_0
    //   75: new 469	com/facebook/FacebookException
    //   78: dup
    //   79: ldc_w 1229
    //   82: aload_0
    //   83: invokespecial 1232	com/facebook/FacebookException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   86: astore_0
    //   87: ldc_w 1211
    //   90: invokestatic 233	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   93: aload_0
    //   94: athrow
    //   95: astore_0
    //   96: aload_3
    //   97: invokestatic 501	com/facebook/internal/Utility:disconnectQuietly	(Ljava/net/URLConnection;)V
    //   100: new 469	com/facebook/FacebookException
    //   103: dup
    //   104: ldc_w 1234
    //   107: aload_0
    //   108: invokespecial 1232	com/facebook/FacebookException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   111: astore_0
    //   112: ldc_w 1211
    //   115: invokestatic 233	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   118: aload_0
    //   119: athrow
    //   120: astore_0
    //   121: aload_2
    //   122: astore_3
    //   123: goto -27 -> 96
    //
    // Exception table:
    //   from	to	target	type
    //   10	34	74	java/net/MalformedURLException
    //   60	71	74	java/net/MalformedURLException
    //   38	43	95	org/json/JSONException
    //   47	52	95	org/json/JSONException
    //   38	43	120	java/io/IOException
    //   47	52	120	java/io/IOException
  }

  public static HttpURLConnection toHttpConnection(Collection<GraphRequest> paramCollection)
  {
    AppMethodBeat.i(71682);
    Validate.notEmptyAndContainsNoNulls(paramCollection, "requests");
    paramCollection = toHttpConnection(new GraphRequestBatch(paramCollection));
    AppMethodBeat.o(71682);
    return paramCollection;
  }

  public static HttpURLConnection toHttpConnection(GraphRequest[] paramArrayOfGraphRequest)
  {
    AppMethodBeat.i(71681);
    paramArrayOfGraphRequest = toHttpConnection(Arrays.asList(paramArrayOfGraphRequest));
    AppMethodBeat.o(71681);
    return paramArrayOfGraphRequest;
  }

  static final void validateFieldsParamForGetRequests(GraphRequestBatch paramGraphRequestBatch)
  {
    AppMethodBeat.i(71708);
    Iterator localIterator = paramGraphRequestBatch.iterator();
    while (localIterator.hasNext())
    {
      GraphRequest localGraphRequest = (GraphRequest)localIterator.next();
      if ((HttpMethod.GET.equals(localGraphRequest.getHttpMethod())) && (shouldWarnOnMissingFieldsParam(localGraphRequest)))
      {
        paramGraphRequestBatch = localGraphRequest.getParameters();
        if ((!paramGraphRequestBatch.containsKey("fields")) || (Utility.isNullOrEmpty(paramGraphRequestBatch.getString("fields"))))
          Logger.log(LoggingBehavior.DEVELOPER_ERRORS, 5, "Request", "starting with Graph API v2.4, GET requests for /%s should contain an explicit \"fields\" parameter.", new Object[] { localGraphRequest.getGraphPath() });
      }
    }
    AppMethodBeat.o(71708);
  }

  public final GraphResponse executeAndWait()
  {
    AppMethodBeat.i(71679);
    GraphResponse localGraphResponse = executeAndWait(this);
    AppMethodBeat.o(71679);
    return localGraphResponse;
  }

  public final GraphRequestAsyncTask executeAsync()
  {
    AppMethodBeat.i(71680);
    GraphRequestAsyncTask localGraphRequestAsyncTask = executeBatchAsync(new GraphRequest[] { this });
    AppMethodBeat.o(71680);
    return localGraphRequestAsyncTask;
  }

  public final AccessToken getAccessToken()
  {
    return this.accessToken;
  }

  public final String getBatchEntryDependsOn()
  {
    return this.batchEntryDependsOn;
  }

  public final String getBatchEntryName()
  {
    return this.batchEntryName;
  }

  public final boolean getBatchEntryOmitResultOnSuccess()
  {
    return this.batchEntryOmitResultOnSuccess;
  }

  public final GraphRequest.Callback getCallback()
  {
    return this.callback;
  }

  public final JSONObject getGraphObject()
  {
    return this.graphObject;
  }

  public final String getGraphPath()
  {
    return this.graphPath;
  }

  public final HttpMethod getHttpMethod()
  {
    return this.httpMethod;
  }

  public final Bundle getParameters()
  {
    return this.parameters;
  }

  final String getRelativeUrlForBatchedRequest()
  {
    AppMethodBeat.i(71700);
    if (this.overriddenURL != null)
    {
      localObject = new FacebookException("Can't override URL for a batch request");
      AppMethodBeat.o(71700);
      throw ((Throwable)localObject);
    }
    Object localObject = String.format("%s/%s", new Object[] { ServerProtocol.getGraphUrlBase(), getGraphPathWithVersion() });
    addCommonParameters();
    localObject = Uri.parse(appendParametersToBaseUrl((String)localObject, Boolean.TRUE));
    localObject = String.format("%s?%s", new Object[] { ((Uri)localObject).getPath(), ((Uri)localObject).getQuery() });
    AppMethodBeat.o(71700);
    return localObject;
  }

  public final Object getTag()
  {
    return this.tag;
  }

  final String getUrlForSingleRequest()
  {
    AppMethodBeat.i(71701);
    if (this.overriddenURL != null)
    {
      str = this.overriddenURL.toString();
      AppMethodBeat.o(71701);
      return str;
    }
    if ((getHttpMethod() == HttpMethod.POST) && (this.graphPath != null) && (this.graphPath.endsWith("/videos")));
    for (String str = ServerProtocol.getGraphVideoUrlBase(); ; str = ServerProtocol.getGraphUrlBase())
    {
      str = String.format("%s/%s", new Object[] { str, getGraphPathWithVersion() });
      addCommonParameters();
      str = appendParametersToBaseUrl(str, Boolean.FALSE);
      AppMethodBeat.o(71701);
      break;
    }
  }

  public final String getVersion()
  {
    return this.version;
  }

  public final void setAccessToken(AccessToken paramAccessToken)
  {
    this.accessToken = paramAccessToken;
  }

  public final void setBatchEntryDependsOn(String paramString)
  {
    this.batchEntryDependsOn = paramString;
  }

  public final void setBatchEntryName(String paramString)
  {
    this.batchEntryName = paramString;
  }

  public final void setBatchEntryOmitResultOnSuccess(boolean paramBoolean)
  {
    this.batchEntryOmitResultOnSuccess = paramBoolean;
  }

  public final void setCallback(GraphRequest.Callback paramCallback)
  {
    AppMethodBeat.i(71678);
    if ((FacebookSdk.isLoggingBehaviorEnabled(LoggingBehavior.GRAPH_API_DEBUG_INFO)) || (FacebookSdk.isLoggingBehaviorEnabled(LoggingBehavior.GRAPH_API_DEBUG_WARNING)))
    {
      this.callback = new GraphRequest.4(this, paramCallback);
      AppMethodBeat.o(71678);
    }
    while (true)
    {
      return;
      this.callback = paramCallback;
      AppMethodBeat.o(71678);
    }
  }

  public final void setGraphObject(JSONObject paramJSONObject)
  {
    this.graphObject = paramJSONObject;
  }

  public final void setGraphPath(String paramString)
  {
    this.graphPath = paramString;
  }

  public final void setHttpMethod(HttpMethod paramHttpMethod)
  {
    AppMethodBeat.i(71677);
    if ((this.overriddenURL != null) && (paramHttpMethod != HttpMethod.GET))
    {
      paramHttpMethod = new FacebookException("Can't change HTTP method on request with overridden URL.");
      AppMethodBeat.o(71677);
      throw paramHttpMethod;
    }
    if (paramHttpMethod != null);
    while (true)
    {
      this.httpMethod = paramHttpMethod;
      AppMethodBeat.o(71677);
      return;
      paramHttpMethod = HttpMethod.GET;
    }
  }

  public final void setParameters(Bundle paramBundle)
  {
    this.parameters = paramBundle;
  }

  public final void setSkipClientToken(boolean paramBoolean)
  {
    this.skipClientToken = paramBoolean;
  }

  public final void setTag(Object paramObject)
  {
    this.tag = paramObject;
  }

  public final void setVersion(String paramString)
  {
    this.version = paramString;
  }

  public String toString()
  {
    AppMethodBeat.i(71695);
    StringBuilder localStringBuilder = new StringBuilder("{Request:  accessToken: ");
    if (this.accessToken == null);
    for (Object localObject = "null"; ; localObject = this.accessToken)
    {
      localObject = localObject + ", graphPath: " + this.graphPath + ", graphObject: " + this.graphObject + ", httpMethod: " + this.httpMethod + ", parameters: " + this.parameters + "}";
      AppMethodBeat.o(71695);
      return localObject;
    }
  }

  public static abstract interface GraphJSONObjectCallback
  {
    public abstract void onCompleted(JSONObject paramJSONObject, GraphResponse paramGraphResponse);
  }

  public static abstract interface OnProgressCallback extends GraphRequest.Callback
  {
    public abstract void onProgress(long paramLong1, long paramLong2);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.facebook.GraphRequest
 * JD-Core Version:    0.6.2
 */