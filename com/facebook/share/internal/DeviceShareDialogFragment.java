package com.facebook.share.internal;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.i;
import android.support.v4.app.m;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest;
import com.facebook.HttpMethod;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.facebook.internal.Validate;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.model.ShareOpenGraphContent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class DeviceShareDialogFragment extends DialogFragment
{
  private static final String DEVICE_SHARE_ENDPOINT = "device/share";
  private static final String EXTRA_ERROR = "error";
  private static final String REQUEST_STATE_KEY = "request_state";
  public static final String TAG = "DeviceShareDialogFragment";
  private static ScheduledThreadPoolExecutor backgroundExecutor;
  private volatile ScheduledFuture codeExpiredFuture;
  private TextView confirmationCode;
  private volatile RequestState currentRequestState;
  private Dialog dialog;
  private ProgressBar progressBar;
  private ShareContent shareContent;

  private void detach()
  {
    AppMethodBeat.i(96967);
    if (isAdded())
      getFragmentManager().beginTransaction().a(this).commit();
    AppMethodBeat.o(96967);
  }

  private void finishActivity(int paramInt, Intent paramIntent)
  {
    AppMethodBeat.i(96966);
    if (this.currentRequestState != null)
      DeviceRequestsHelper.cleanUpAdvertisementService(this.currentRequestState.getUserCode());
    Object localObject = (FacebookRequestError)paramIntent.getParcelableExtra("error");
    if (localObject != null)
      Toast.makeText(getContext(), ((FacebookRequestError)localObject).getErrorMessage(), 0).show();
    if (isAdded())
    {
      localObject = getActivity();
      ((Activity)localObject).setResult(paramInt, paramIntent);
      ((Activity)localObject).finish();
    }
    AppMethodBeat.o(96966);
  }

  private void finishActivityWithError(FacebookRequestError paramFacebookRequestError)
  {
    AppMethodBeat.i(96970);
    detach();
    Intent localIntent = new Intent();
    localIntent.putExtra("error", paramFacebookRequestError);
    finishActivity(-1, localIntent);
    AppMethodBeat.o(96970);
  }

  private static ScheduledThreadPoolExecutor getBackgroundExecutor()
  {
    try
    {
      AppMethodBeat.i(96971);
      if (backgroundExecutor == null)
      {
        localScheduledThreadPoolExecutor = new java/util/concurrent/ScheduledThreadPoolExecutor;
        localScheduledThreadPoolExecutor.<init>(1);
        backgroundExecutor = localScheduledThreadPoolExecutor;
      }
      ScheduledThreadPoolExecutor localScheduledThreadPoolExecutor = backgroundExecutor;
      AppMethodBeat.o(96971);
      return localScheduledThreadPoolExecutor;
    }
    finally
    {
    }
  }

  private Bundle getGraphParametersForShareContent()
  {
    AppMethodBeat.i(96968);
    Object localObject = this.shareContent;
    if (localObject == null)
    {
      AppMethodBeat.o(96968);
      localObject = null;
    }
    while (true)
    {
      return localObject;
      if ((localObject instanceof ShareLinkContent))
      {
        localObject = WebDialogParameters.create((ShareLinkContent)localObject);
        AppMethodBeat.o(96968);
      }
      else if ((localObject instanceof ShareOpenGraphContent))
      {
        localObject = WebDialogParameters.create((ShareOpenGraphContent)localObject);
        AppMethodBeat.o(96968);
      }
      else
      {
        AppMethodBeat.o(96968);
        localObject = null;
      }
    }
  }

  private void setCurrentRequestState(RequestState paramRequestState)
  {
    AppMethodBeat.i(96972);
    this.currentRequestState = paramRequestState;
    this.confirmationCode.setText(paramRequestState.getUserCode());
    this.confirmationCode.setVisibility(0);
    this.progressBar.setVisibility(8);
    this.codeExpiredFuture = getBackgroundExecutor().schedule(new DeviceShareDialogFragment.3(this), paramRequestState.getExpiresIn(), TimeUnit.SECONDS);
    AppMethodBeat.o(96972);
  }

  private void startShare()
  {
    AppMethodBeat.i(96969);
    Bundle localBundle = getGraphParametersForShareContent();
    if ((localBundle == null) || (localBundle.size() == 0))
      finishActivityWithError(new FacebookRequestError(0, "", "Failed to get share content"));
    localBundle.putString("access_token", Validate.hasAppID() + "|" + Validate.hasClientToken());
    localBundle.putString("device_info", DeviceRequestsHelper.getDeviceInfo());
    new GraphRequest(null, "device/share", localBundle, HttpMethod.POST, new DeviceShareDialogFragment.2(this)).executeAsync();
    AppMethodBeat.o(96969);
  }

  public Dialog onCreateDialog(Bundle paramBundle)
  {
    AppMethodBeat.i(96963);
    this.dialog = new Dialog(getActivity(), 2131493845);
    paramBundle = getActivity().getLayoutInflater().inflate(2130969168, null);
    this.progressBar = ((ProgressBar)paramBundle.findViewById(2131821099));
    this.confirmationCode = ((TextView)paramBundle.findViewById(2131822893));
    ((Button)paramBundle.findViewById(2131822895)).setOnClickListener(new DeviceShareDialogFragment.1(this));
    ((TextView)paramBundle.findViewById(2131822894)).setText(Html.fromHtml(getString(2131296295)));
    this.dialog.setContentView(paramBundle);
    startShare();
    paramBundle = this.dialog;
    AppMethodBeat.o(96963);
    return paramBundle;
  }

  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    AppMethodBeat.i(96962);
    paramLayoutInflater = super.onCreateView(paramLayoutInflater, paramViewGroup, paramBundle);
    if (paramBundle != null)
    {
      paramViewGroup = (RequestState)paramBundle.getParcelable("request_state");
      if (paramViewGroup != null)
        setCurrentRequestState(paramViewGroup);
    }
    AppMethodBeat.o(96962);
    return paramLayoutInflater;
  }

  public void onDismiss(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(96964);
    super.onDismiss(paramDialogInterface);
    if (this.codeExpiredFuture != null)
      this.codeExpiredFuture.cancel(true);
    finishActivity(-1, new Intent());
    AppMethodBeat.o(96964);
  }

  public void onSaveInstanceState(Bundle paramBundle)
  {
    AppMethodBeat.i(96965);
    super.onSaveInstanceState(paramBundle);
    if (this.currentRequestState != null)
      paramBundle.putParcelable("request_state", this.currentRequestState);
    AppMethodBeat.o(96965);
  }

  public void setShareContent(ShareContent paramShareContent)
  {
    this.shareContent = paramShareContent;
  }

  static class RequestState
    implements Parcelable
  {
    public static final Parcelable.Creator<RequestState> CREATOR;
    private long expiresIn;
    private String userCode;

    static
    {
      AppMethodBeat.i(96961);
      CREATOR = new DeviceShareDialogFragment.RequestState.1();
      AppMethodBeat.o(96961);
    }

    RequestState()
    {
    }

    protected RequestState(Parcel paramParcel)
    {
      AppMethodBeat.i(96959);
      this.userCode = paramParcel.readString();
      this.expiresIn = paramParcel.readLong();
      AppMethodBeat.o(96959);
    }

    public int describeContents()
    {
      return 0;
    }

    public long getExpiresIn()
    {
      return this.expiresIn;
    }

    public String getUserCode()
    {
      return this.userCode;
    }

    public void setExpiresIn(long paramLong)
    {
      this.expiresIn = paramLong;
    }

    public void setUserCode(String paramString)
    {
      this.userCode = paramString;
    }

    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      AppMethodBeat.i(96960);
      paramParcel.writeString(this.userCode);
      paramParcel.writeLong(this.expiresIn);
      AppMethodBeat.o(96960);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.facebook.share.internal.DeviceShareDialogFragment
 * JD-Core Version:    0.6.2
 */