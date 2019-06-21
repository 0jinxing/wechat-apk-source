package com.facebook;

import com.facebook.internal.Logger;
import com.facebook.internal.Utility;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

public class GraphResponse
{
  private static final String BODY_KEY = "body";
  private static final String CODE_KEY = "code";
  public static final String NON_JSON_RESPONSE_PROPERTY = "FACEBOOK_NON_JSON_RESULT";
  private static final String RESPONSE_LOG_TAG = "Response";
  public static final String SUCCESS_KEY = "success";
  private static final String TAG;
  private final HttpURLConnection connection;
  private final FacebookRequestError error;
  private final JSONObject graphObject;
  private final JSONArray graphObjectArray;
  private final String rawResponse;
  private final GraphRequest request;

  static
  {
    AppMethodBeat.i(71770);
    TAG = GraphResponse.class.getSimpleName();
    AppMethodBeat.o(71770);
  }

  GraphResponse(GraphRequest paramGraphRequest, HttpURLConnection paramHttpURLConnection, FacebookRequestError paramFacebookRequestError)
  {
    this(paramGraphRequest, paramHttpURLConnection, null, null, null, paramFacebookRequestError);
  }

  GraphResponse(GraphRequest paramGraphRequest, HttpURLConnection paramHttpURLConnection, String paramString, JSONArray paramJSONArray)
  {
    this(paramGraphRequest, paramHttpURLConnection, paramString, null, paramJSONArray, null);
  }

  GraphResponse(GraphRequest paramGraphRequest, HttpURLConnection paramHttpURLConnection, String paramString, JSONObject paramJSONObject)
  {
    this(paramGraphRequest, paramHttpURLConnection, paramString, paramJSONObject, null, null);
  }

  GraphResponse(GraphRequest paramGraphRequest, HttpURLConnection paramHttpURLConnection, String paramString, JSONObject paramJSONObject, JSONArray paramJSONArray, FacebookRequestError paramFacebookRequestError)
  {
    this.request = paramGraphRequest;
    this.connection = paramHttpURLConnection;
    this.rawResponse = paramString;
    this.graphObject = paramJSONObject;
    this.graphObjectArray = paramJSONArray;
    this.error = paramFacebookRequestError;
  }

  static List<GraphResponse> constructErrorResponses(List<GraphRequest> paramList, HttpURLConnection paramHttpURLConnection, FacebookException paramFacebookException)
  {
    AppMethodBeat.i(71769);
    int i = paramList.size();
    ArrayList localArrayList = new ArrayList(i);
    for (int j = 0; j < i; j++)
      localArrayList.add(new GraphResponse((GraphRequest)paramList.get(j), paramHttpURLConnection, new FacebookRequestError(paramHttpURLConnection, paramFacebookException)));
    AppMethodBeat.o(71769);
    return localArrayList;
  }

  private static GraphResponse createResponseFromObject(GraphRequest paramGraphRequest, HttpURLConnection paramHttpURLConnection, Object paramObject1, Object paramObject2)
  {
    AppMethodBeat.i(71768);
    Object localObject = paramObject1;
    if ((paramObject1 instanceof JSONObject))
    {
      paramObject1 = (JSONObject)paramObject1;
      paramObject2 = FacebookRequestError.checkResponseAndCreateError(paramObject1, paramObject2, paramHttpURLConnection);
      if (paramObject2 != null)
        if ((paramObject2.getErrorCode() == 190) && (Utility.isCurrentAccessToken(paramGraphRequest.getAccessToken())))
        {
          if (paramObject2.getSubErrorCode() != 493)
            AccessToken.setCurrentAccessToken(null);
        }
        else
        {
          paramGraphRequest = new GraphResponse(paramGraphRequest, paramHttpURLConnection, paramObject2);
          AppMethodBeat.o(71768);
        }
    }
    while (true)
    {
      return paramGraphRequest;
      if (AccessToken.getCurrentAccessToken().isExpired())
        break;
      AccessToken.expireCurrentAccessToken();
      break;
      paramObject1 = Utility.getStringPropertyAsJSON(paramObject1, "body", "FACEBOOK_NON_JSON_RESULT");
      if ((paramObject1 instanceof JSONObject))
      {
        paramGraphRequest = new GraphResponse(paramGraphRequest, paramHttpURLConnection, paramObject1.toString(), (JSONObject)paramObject1);
        AppMethodBeat.o(71768);
      }
      else if ((paramObject1 instanceof JSONArray))
      {
        paramGraphRequest = new GraphResponse(paramGraphRequest, paramHttpURLConnection, paramObject1.toString(), (JSONArray)paramObject1);
        AppMethodBeat.o(71768);
      }
      else
      {
        localObject = JSONObject.NULL;
        if (localObject != JSONObject.NULL)
          break label210;
        paramGraphRequest = new GraphResponse(paramGraphRequest, paramHttpURLConnection, localObject.toString(), null);
        AppMethodBeat.o(71768);
      }
    }
    label210: paramGraphRequest = new FacebookException("Got unexpected object type in response, class: " + localObject.getClass().getSimpleName());
    AppMethodBeat.o(71768);
    throw paramGraphRequest;
  }

  private static List<GraphResponse> createResponsesFromObject(HttpURLConnection paramHttpURLConnection, List<GraphRequest> paramList, Object paramObject)
  {
    int i = 0;
    AppMethodBeat.i(71767);
    int j = paramList.size();
    ArrayList localArrayList = new ArrayList(j);
    if (j == 1)
      localObject1 = (GraphRequest)paramList.get(0);
    Object localObject3;
    while (true)
    {
      try
      {
        JSONObject localJSONObject = new org/json/JSONObject;
        localJSONObject.<init>();
        localJSONObject.put("body", paramObject);
        if (paramHttpURLConnection != null)
        {
          k = paramHttpURLConnection.getResponseCode();
          localJSONObject.put("code", k);
          JSONArray localJSONArray = new org/json/JSONArray;
          localJSONArray.<init>();
          localJSONArray.put(localJSONObject);
          if (((localJSONArray instanceof JSONArray)) && (((JSONArray)localJSONArray).length() == j))
            break;
          paramHttpURLConnection = new FacebookException("Unexpected number of results");
          AppMethodBeat.o(71767);
          throw paramHttpURLConnection;
        }
        k = 200;
        continue;
      }
      catch (JSONException localJSONException2)
      {
        localArrayList.add(new GraphResponse((GraphRequest)localObject1, paramHttpURLConnection, new FacebookRequestError(paramHttpURLConnection, localJSONException2)));
        Object localObject2 = paramObject;
        continue;
      }
      catch (IOException localIOException)
      {
        localArrayList.add(new GraphResponse((GraphRequest)localObject1, paramHttpURLConnection, new FacebookRequestError(paramHttpURLConnection, localIOException)));
      }
      localObject3 = paramObject;
    }
    Object localObject1 = (JSONArray)localObject3;
    int k = i;
    while (true)
      if (k < ((JSONArray)localObject1).length())
      {
        localObject3 = (GraphRequest)paramList.get(k);
        try
        {
          localArrayList.add(createResponseFromObject((GraphRequest)localObject3, paramHttpURLConnection, ((JSONArray)localObject1).get(k), paramObject));
          k++;
        }
        catch (JSONException localJSONException1)
        {
          while (true)
            localArrayList.add(new GraphResponse((GraphRequest)localObject3, paramHttpURLConnection, new FacebookRequestError(paramHttpURLConnection, localJSONException1)));
        }
        catch (FacebookException localFacebookException)
        {
          while (true)
            localArrayList.add(new GraphResponse((GraphRequest)localObject3, paramHttpURLConnection, new FacebookRequestError(paramHttpURLConnection, localFacebookException)));
        }
      }
    AppMethodBeat.o(71767);
    return localArrayList;
  }

  static List<GraphResponse> createResponsesFromStream(InputStream paramInputStream, HttpURLConnection paramHttpURLConnection, GraphRequestBatch paramGraphRequestBatch)
  {
    AppMethodBeat.i(71765);
    paramInputStream = Utility.readStreamToString(paramInputStream);
    Logger.log(LoggingBehavior.INCLUDE_RAW_RESPONSES, "Response", "Response (raw)\n  Size: %d\n  Response:\n%s\n", new Object[] { Integer.valueOf(paramInputStream.length()), paramInputStream });
    paramInputStream = createResponsesFromString(paramInputStream, paramHttpURLConnection, paramGraphRequestBatch);
    AppMethodBeat.o(71765);
    return paramInputStream;
  }

  static List<GraphResponse> createResponsesFromString(String paramString, HttpURLConnection paramHttpURLConnection, GraphRequestBatch paramGraphRequestBatch)
  {
    AppMethodBeat.i(71766);
    paramHttpURLConnection = createResponsesFromObject(paramHttpURLConnection, paramGraphRequestBatch, new JSONTokener(paramString).nextValue());
    Logger.log(LoggingBehavior.REQUESTS, "Response", "Response\n  Id: %s\n  Size: %d\n  Responses:\n%s\n", new Object[] { paramGraphRequestBatch.getId(), Integer.valueOf(paramString.length()), paramHttpURLConnection });
    AppMethodBeat.o(71766);
    return paramHttpURLConnection;
  }

  static List<GraphResponse> fromHttpConnection(HttpURLConnection paramHttpURLConnection, GraphRequestBatch paramGraphRequestBatch)
  {
    AppMethodBeat.i(71764);
    List localList = null;
    Object localObject1 = null;
    InputStream localInputStream1 = null;
    InputStream localInputStream2 = localInputStream1;
    Object localObject2 = localList;
    Object localObject3 = localObject1;
    try
    {
      if (paramHttpURLConnection.getResponseCode() >= 400)
      {
        localInputStream2 = localInputStream1;
        localObject2 = localList;
        localObject3 = localObject1;
      }
      for (localInputStream1 = paramHttpURLConnection.getErrorStream(); ; localInputStream1 = paramHttpURLConnection.getInputStream())
      {
        localInputStream2 = localInputStream1;
        localObject2 = localInputStream1;
        localObject3 = localInputStream1;
        localList = createResponsesFromStream(localInputStream1, paramHttpURLConnection, paramGraphRequestBatch);
        paramHttpURLConnection = localList;
        Utility.closeQuietly(localInputStream1);
        AppMethodBeat.o(71764);
        return paramHttpURLConnection;
        localInputStream2 = localInputStream1;
        localObject2 = localList;
        localObject3 = localObject1;
      }
    }
    catch (FacebookException localFacebookException1)
    {
      while (true)
      {
        localObject3 = localInputStream2;
        Logger.log(LoggingBehavior.REQUESTS, "Response", "Response <Error>: %s", new Object[] { localFacebookException1 });
        localObject3 = localInputStream2;
        paramHttpURLConnection = constructErrorResponses(paramGraphRequestBatch, paramHttpURLConnection, localFacebookException1);
        Utility.closeQuietly(localInputStream2);
        AppMethodBeat.o(71764);
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        localObject3 = localObject2;
        Logger.log(LoggingBehavior.REQUESTS, "Response", "Response <Error>: %s", new Object[] { localException });
        localObject3 = localObject2;
        FacebookException localFacebookException2 = new com/facebook/FacebookException;
        localObject3 = localObject2;
        localFacebookException2.<init>(localException);
        localObject3 = localObject2;
        paramHttpURLConnection = constructErrorResponses(paramGraphRequestBatch, paramHttpURLConnection, localFacebookException2);
        Utility.closeQuietly((Closeable)localObject2);
        AppMethodBeat.o(71764);
      }
    }
    finally
    {
      Utility.closeQuietly((Closeable)localObject3);
      AppMethodBeat.o(71764);
    }
    throw paramHttpURLConnection;
  }

  public final HttpURLConnection getConnection()
  {
    return this.connection;
  }

  public final FacebookRequestError getError()
  {
    return this.error;
  }

  public final JSONArray getJSONArray()
  {
    return this.graphObjectArray;
  }

  public final JSONObject getJSONObject()
  {
    return this.graphObject;
  }

  public String getRawResponse()
  {
    return this.rawResponse;
  }

  public GraphRequest getRequest()
  {
    return this.request;
  }

  public GraphRequest getRequestForPagedResults(GraphResponse.PagingDirection paramPagingDirection)
  {
    Object localObject1 = null;
    AppMethodBeat.i(71762);
    Object localObject2;
    if (this.graphObject != null)
    {
      localObject2 = this.graphObject.optJSONObject("paging");
      if (localObject2 != null)
        if (paramPagingDirection == GraphResponse.PagingDirection.NEXT)
          paramPagingDirection = ((JSONObject)localObject2).optString("next");
    }
    while (true)
    {
      if (Utility.isNullOrEmpty(paramPagingDirection))
      {
        AppMethodBeat.o(71762);
        paramPagingDirection = localObject1;
      }
      while (true)
      {
        return paramPagingDirection;
        paramPagingDirection = ((JSONObject)localObject2).optString("previous");
        break;
        if ((paramPagingDirection != null) && (paramPagingDirection.equals(this.request.getUrlForSingleRequest())))
        {
          AppMethodBeat.o(71762);
          paramPagingDirection = localObject1;
        }
        else
        {
          try
          {
            localObject2 = new com/facebook/GraphRequest;
            AccessToken localAccessToken = this.request.getAccessToken();
            URL localURL = new java/net/URL;
            localURL.<init>(paramPagingDirection);
            ((GraphRequest)localObject2).<init>(localAccessToken, localURL);
            AppMethodBeat.o(71762);
            paramPagingDirection = (GraphResponse.PagingDirection)localObject2;
          }
          catch (MalformedURLException paramPagingDirection)
          {
            AppMethodBeat.o(71762);
            paramPagingDirection = localObject1;
          }
        }
      }
      paramPagingDirection = null;
    }
  }

  public String toString()
  {
    AppMethodBeat.i(71763);
    try
    {
      Object localObject = Locale.US;
      if (this.connection != null);
      for (int i = this.connection.getResponseCode(); ; i = 200)
      {
        localObject = String.format((Locale)localObject, "%d", new Object[] { Integer.valueOf(i) });
        localObject = "{Response:  responseCode: " + (String)localObject + ", graphObject: " + this.graphObject + ", error: " + this.error + "}";
        AppMethodBeat.o(71763);
        return localObject;
      }
    }
    catch (IOException localIOException)
    {
      while (true)
        String str = "unknown";
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.facebook.GraphResponse
 * JD-Core Version:    0.6.2
 */