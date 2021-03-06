package com.facebook.internal;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.webkit.WebView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import org.json.JSONException;
import org.json.JSONObject;

public class FacebookWebFallbackDialog extends WebDialog
{
  private static final int OS_BACK_BUTTON_RESPONSE_TIMEOUT_MILLISECONDS = 1500;
  private static final String TAG;
  private boolean waitingForDialogToClose;

  static
  {
    AppMethodBeat.i(96646);
    TAG = FacebookWebFallbackDialog.class.getName();
    AppMethodBeat.o(96646);
  }

  private FacebookWebFallbackDialog(Context paramContext, String paramString1, String paramString2)
  {
    super(paramContext, paramString1);
    AppMethodBeat.i(96642);
    setExpectedRedirectUrl(paramString2);
    AppMethodBeat.o(96642);
  }

  public static FacebookWebFallbackDialog newInstance(Context paramContext, String paramString1, String paramString2)
  {
    AppMethodBeat.i(96641);
    WebDialog.initDefaultTheme(paramContext);
    paramContext = new FacebookWebFallbackDialog(paramContext, paramString1, paramString2);
    AppMethodBeat.o(96641);
    return paramContext;
  }

  public void cancel()
  {
    AppMethodBeat.i(96644);
    WebView localWebView = getWebView();
    if ((!isPageFinished()) || (isListenerCalled()) || (localWebView == null) || (!localWebView.isShown()))
    {
      super.cancel();
      AppMethodBeat.o(96644);
    }
    while (true)
    {
      return;
      if (this.waitingForDialogToClose)
      {
        AppMethodBeat.o(96644);
      }
      else
      {
        this.waitingForDialogToClose = true;
        localWebView.loadUrl("javascript:".concat(String.valueOf("(function() {  var event = document.createEvent('Event');  event.initEvent('fbPlatformDialogMustClose',true,true);  document.dispatchEvent(event);})();")));
        new Handler(Looper.getMainLooper()).postDelayed(new FacebookWebFallbackDialog.1(this), 1500L);
        AppMethodBeat.o(96644);
      }
    }
  }

  protected Bundle parseResponseUri(String paramString)
  {
    AppMethodBeat.i(96643);
    Bundle localBundle = Utility.parseUrlQueryString(Uri.parse(paramString).getQuery());
    Object localObject = localBundle.getString("bridge_args");
    localBundle.remove("bridge_args");
    if (!Utility.isNullOrEmpty((String)localObject));
    try
    {
      paramString = new org/json/JSONObject;
      paramString.<init>((String)localObject);
      localBundle.putBundle("com.facebook.platform.protocol.BRIDGE_ARGS", BundleJSONConverter.convertToBundle(paramString));
      localObject = localBundle.getString("method_results");
      localBundle.remove("method_results");
      if (!Utility.isNullOrEmpty((String)localObject))
      {
        paramString = (String)localObject;
        if (Utility.isNullOrEmpty((String)localObject))
          paramString = "{}";
      }
    }
    catch (JSONException paramString)
    {
      try
      {
        localObject = new org/json/JSONObject;
        ((JSONObject)localObject).<init>(paramString);
        localBundle.putBundle("com.facebook.platform.protocol.RESULT_ARGS", BundleJSONConverter.convertToBundle((JSONObject)localObject));
        localBundle.remove("version");
        localBundle.putInt("com.facebook.platform.protocol.PROTOCOL_VERSION", NativeProtocol.getLatestKnownVersion());
        AppMethodBeat.o(96643);
        return localBundle;
        paramString = paramString;
        Utility.logd(TAG, "Unable to parse bridge_args JSON", paramString);
      }
      catch (JSONException paramString)
      {
        while (true)
          Utility.logd(TAG, "Unable to parse bridge_args JSON", paramString);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.facebook.internal.FacebookWebFallbackDialog
 * JD-Core Version:    0.6.2
 */