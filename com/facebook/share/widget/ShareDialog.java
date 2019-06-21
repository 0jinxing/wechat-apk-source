package com.facebook.share.widget;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.facebook.AccessToken;
import com.facebook.FacebookCallback;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.internal.AppCall;
import com.facebook.internal.CallbackManagerImpl;
import com.facebook.internal.CallbackManagerImpl.RequestCodeOffset;
import com.facebook.internal.DialogFeature;
import com.facebook.internal.DialogPresenter;
import com.facebook.internal.FacebookDialogBase;
import com.facebook.internal.FacebookDialogBase.ModeHandler;
import com.facebook.internal.FragmentWrapper;
import com.facebook.internal.Utility;
import com.facebook.share.Sharer;
import com.facebook.share.Sharer.Result;
import com.facebook.share.internal.CameraEffectFeature;
import com.facebook.share.internal.OpenGraphActionDialogFeature;
import com.facebook.share.internal.ShareContentValidation;
import com.facebook.share.internal.ShareDialogFeature;
import com.facebook.share.internal.ShareInternalUtility;
import com.facebook.share.internal.ShareStoryFeature;
import com.facebook.share.model.ShareCameraEffectContent;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.model.ShareMediaContent;
import com.facebook.share.model.ShareOpenGraphContent;
import com.facebook.share.model.SharePhotoContent;
import com.facebook.share.model.ShareStoryContent;
import com.facebook.share.model.ShareVideoContent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.List;

public final class ShareDialog extends FacebookDialogBase<ShareContent, Sharer.Result>
  implements Sharer
{
  private static final int DEFAULT_REQUEST_CODE;
  private static final String FEED_DIALOG = "feed";
  private static final String TAG;
  private static final String WEB_OG_SHARE_DIALOG = "share_open_graph";
  public static final String WEB_SHARE_DIALOG = "share";
  private boolean isAutomaticMode;
  private boolean shouldFailOnDataError;

  static
  {
    AppMethodBeat.i(97736);
    TAG = ShareDialog.class.getSimpleName();
    DEFAULT_REQUEST_CODE = CallbackManagerImpl.RequestCodeOffset.Share.toRequestCode();
    AppMethodBeat.o(97736);
  }

  public ShareDialog(Activity paramActivity)
  {
    super(paramActivity, DEFAULT_REQUEST_CODE);
    AppMethodBeat.i(97714);
    this.shouldFailOnDataError = false;
    this.isAutomaticMode = true;
    ShareInternalUtility.registerStaticShareCallback(DEFAULT_REQUEST_CODE);
    AppMethodBeat.o(97714);
  }

  ShareDialog(Activity paramActivity, int paramInt)
  {
    super(paramActivity, paramInt);
    AppMethodBeat.i(97718);
    this.shouldFailOnDataError = false;
    this.isAutomaticMode = true;
    ShareInternalUtility.registerStaticShareCallback(paramInt);
    AppMethodBeat.o(97718);
  }

  public ShareDialog(android.app.Fragment paramFragment)
  {
    this(new FragmentWrapper(paramFragment));
    AppMethodBeat.i(97716);
    AppMethodBeat.o(97716);
  }

  ShareDialog(android.app.Fragment paramFragment, int paramInt)
  {
    this(new FragmentWrapper(paramFragment), paramInt);
    AppMethodBeat.i(97720);
    AppMethodBeat.o(97720);
  }

  public ShareDialog(android.support.v4.app.Fragment paramFragment)
  {
    this(new FragmentWrapper(paramFragment));
    AppMethodBeat.i(97715);
    AppMethodBeat.o(97715);
  }

  ShareDialog(android.support.v4.app.Fragment paramFragment, int paramInt)
  {
    this(new FragmentWrapper(paramFragment), paramInt);
    AppMethodBeat.i(97719);
    AppMethodBeat.o(97719);
  }

  private ShareDialog(FragmentWrapper paramFragmentWrapper)
  {
    super(paramFragmentWrapper, DEFAULT_REQUEST_CODE);
    AppMethodBeat.i(97717);
    this.shouldFailOnDataError = false;
    this.isAutomaticMode = true;
    ShareInternalUtility.registerStaticShareCallback(DEFAULT_REQUEST_CODE);
    AppMethodBeat.o(97717);
  }

  private ShareDialog(FragmentWrapper paramFragmentWrapper, int paramInt)
  {
    super(paramFragmentWrapper, paramInt);
    AppMethodBeat.i(97721);
    this.shouldFailOnDataError = false;
    this.isAutomaticMode = true;
    ShareInternalUtility.registerStaticShareCallback(paramInt);
    AppMethodBeat.o(97721);
  }

  public static boolean canShow(Class<? extends ShareContent> paramClass)
  {
    AppMethodBeat.i(97710);
    boolean bool;
    if ((canShowWebTypeCheck(paramClass)) || (canShowNative(paramClass)))
    {
      bool = true;
      AppMethodBeat.o(97710);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(97710);
    }
  }

  private static boolean canShowNative(Class<? extends ShareContent> paramClass)
  {
    AppMethodBeat.i(97711);
    paramClass = getFeature(paramClass);
    boolean bool;
    if ((paramClass != null) && (DialogPresenter.canPresentNativeDialogWithFeature(paramClass)))
    {
      bool = true;
      AppMethodBeat.o(97711);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(97711);
    }
  }

  private static boolean canShowWebCheck(ShareContent paramShareContent)
  {
    boolean bool = false;
    AppMethodBeat.i(97713);
    if (!canShowWebTypeCheck(paramShareContent.getClass()))
      AppMethodBeat.o(97713);
    while (true)
    {
      return bool;
      if ((paramShareContent instanceof ShareOpenGraphContent))
        paramShareContent = (ShareOpenGraphContent)paramShareContent;
      try
      {
        ShareInternalUtility.toJSONObjectForWeb(paramShareContent);
        bool = true;
        AppMethodBeat.o(97713);
      }
      catch (Exception paramShareContent)
      {
        Utility.logd(TAG, "canShow returned false because the content of the Opem Graph object can't be shared via the web dialog", paramShareContent);
        AppMethodBeat.o(97713);
      }
    }
  }

  private static boolean canShowWebTypeCheck(Class<? extends ShareContent> paramClass)
  {
    AppMethodBeat.i(97712);
    boolean bool;
    if ((ShareLinkContent.class.isAssignableFrom(paramClass)) || (ShareOpenGraphContent.class.isAssignableFrom(paramClass)) || ((SharePhotoContent.class.isAssignableFrom(paramClass)) && (AccessToken.isCurrentAccessTokenActive())))
    {
      bool = true;
      AppMethodBeat.o(97712);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(97712);
    }
  }

  private static DialogFeature getFeature(Class<? extends ShareContent> paramClass)
  {
    AppMethodBeat.i(97727);
    if (ShareLinkContent.class.isAssignableFrom(paramClass))
    {
      paramClass = ShareDialogFeature.SHARE_DIALOG;
      AppMethodBeat.o(97727);
    }
    while (true)
    {
      return paramClass;
      if (SharePhotoContent.class.isAssignableFrom(paramClass))
      {
        paramClass = ShareDialogFeature.PHOTOS;
        AppMethodBeat.o(97727);
      }
      else if (ShareVideoContent.class.isAssignableFrom(paramClass))
      {
        paramClass = ShareDialogFeature.VIDEO;
        AppMethodBeat.o(97727);
      }
      else if (ShareOpenGraphContent.class.isAssignableFrom(paramClass))
      {
        paramClass = OpenGraphActionDialogFeature.OG_ACTION_DIALOG;
        AppMethodBeat.o(97727);
      }
      else if (ShareMediaContent.class.isAssignableFrom(paramClass))
      {
        paramClass = ShareDialogFeature.MULTIMEDIA;
        AppMethodBeat.o(97727);
      }
      else if (ShareCameraEffectContent.class.isAssignableFrom(paramClass))
      {
        paramClass = CameraEffectFeature.SHARE_CAMERA_EFFECT;
        AppMethodBeat.o(97727);
      }
      else if (ShareStoryContent.class.isAssignableFrom(paramClass))
      {
        paramClass = ShareStoryFeature.SHARE_STORY_ASSET;
        AppMethodBeat.o(97727);
      }
      else
      {
        paramClass = null;
        AppMethodBeat.o(97727);
      }
    }
  }

  private void logDialogShare(Context paramContext, ShareContent paramShareContent, ShareDialog.Mode paramMode)
  {
    AppMethodBeat.i(97728);
    if (this.isAutomaticMode)
      paramMode = ShareDialog.Mode.AUTOMATIC;
    switch (ShareDialog.1.$SwitchMap$com$facebook$share$widget$ShareDialog$Mode[paramMode.ordinal()])
    {
    default:
      paramMode = "unknown";
      paramShareContent = getFeature(paramShareContent.getClass());
      if (paramShareContent == ShareDialogFeature.SHARE_DIALOG)
        paramShareContent = "status";
      break;
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      paramContext = AppEventsLogger.newLogger(paramContext);
      Bundle localBundle = new Bundle();
      localBundle.putString("fb_share_dialog_show", paramMode);
      localBundle.putString("fb_share_dialog_content_type", paramShareContent);
      paramContext.logSdkEvent("fb_share_dialog_show", null, localBundle);
      AppMethodBeat.o(97728);
      return;
      paramMode = "automatic";
      break;
      paramMode = "web";
      break;
      paramMode = "native";
      break;
      if (paramShareContent == ShareDialogFeature.PHOTOS)
        paramShareContent = "photo";
      else if (paramShareContent == ShareDialogFeature.VIDEO)
        paramShareContent = "video";
      else if (paramShareContent == OpenGraphActionDialogFeature.OG_ACTION_DIALOG)
        paramShareContent = "open_graph";
      else
        paramShareContent = "unknown";
    }
  }

  public static void show(Activity paramActivity, ShareContent paramShareContent)
  {
    AppMethodBeat.i(97706);
    new ShareDialog(paramActivity).show(paramShareContent);
    AppMethodBeat.o(97706);
  }

  public static void show(android.app.Fragment paramFragment, ShareContent paramShareContent)
  {
    AppMethodBeat.i(97708);
    show(new FragmentWrapper(paramFragment), paramShareContent);
    AppMethodBeat.o(97708);
  }

  public static void show(android.support.v4.app.Fragment paramFragment, ShareContent paramShareContent)
  {
    AppMethodBeat.i(97707);
    show(new FragmentWrapper(paramFragment), paramShareContent);
    AppMethodBeat.o(97707);
  }

  private static void show(FragmentWrapper paramFragmentWrapper, ShareContent paramShareContent)
  {
    AppMethodBeat.i(97709);
    new ShareDialog(paramFragmentWrapper).show(paramShareContent);
    AppMethodBeat.o(97709);
  }

  public final boolean canShow(ShareContent paramShareContent, ShareDialog.Mode paramMode)
  {
    AppMethodBeat.i(97723);
    Object localObject = paramMode;
    if (paramMode == ShareDialog.Mode.AUTOMATIC)
      localObject = BASE_AUTOMATIC_MODE;
    boolean bool = canShowImpl(paramShareContent, localObject);
    AppMethodBeat.o(97723);
    return bool;
  }

  public final AppCall createBaseAppCall()
  {
    AppMethodBeat.i(97725);
    AppCall localAppCall = new AppCall(getRequestCode());
    AppMethodBeat.o(97725);
    return localAppCall;
  }

  public final List<FacebookDialogBase<ShareContent, Sharer.Result>.ModeHandler> getOrderedModeHandlers()
  {
    AppMethodBeat.i(97726);
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(new NativeHandler(null));
    localArrayList.add(new ShareDialog.FeedHandler(this, null));
    localArrayList.add(new ShareDialog.WebShareHandler(this, null));
    localArrayList.add(new ShareDialog.CameraEffectHandler(this, null));
    localArrayList.add(new ShareDialog.ShareStoryHandler(this, null));
    AppMethodBeat.o(97726);
    return localArrayList;
  }

  public final boolean getShouldFailOnDataError()
  {
    return this.shouldFailOnDataError;
  }

  public final void registerCallbackImpl(CallbackManagerImpl paramCallbackManagerImpl, FacebookCallback<Sharer.Result> paramFacebookCallback)
  {
    AppMethodBeat.i(97722);
    ShareInternalUtility.registerSharerCallback(getRequestCode(), paramCallbackManagerImpl, paramFacebookCallback);
    AppMethodBeat.o(97722);
  }

  public final void setShouldFailOnDataError(boolean paramBoolean)
  {
    this.shouldFailOnDataError = paramBoolean;
  }

  public final void show(ShareContent paramShareContent, ShareDialog.Mode paramMode)
  {
    AppMethodBeat.i(97724);
    if (paramMode == ShareDialog.Mode.AUTOMATIC);
    for (boolean bool = true; ; bool = false)
    {
      this.isAutomaticMode = bool;
      if (this.isAutomaticMode)
        paramMode = BASE_AUTOMATIC_MODE;
      showImpl(paramShareContent, paramMode);
      AppMethodBeat.o(97724);
      return;
    }
  }

  class NativeHandler extends FacebookDialogBase<ShareContent, Sharer.Result>.ModeHandler
  {
    private NativeHandler()
    {
      super();
    }

    public boolean canShow(ShareContent paramShareContent, boolean paramBoolean)
    {
      boolean bool1 = true;
      AppMethodBeat.i(97691);
      if ((paramShareContent == null) || ((paramShareContent instanceof ShareCameraEffectContent)) || ((paramShareContent instanceof ShareStoryContent)))
      {
        AppMethodBeat.o(97691);
        paramBoolean = false;
        return paramBoolean;
      }
      if (!paramBoolean)
        if (paramShareContent.getShareHashtag() != null)
        {
          paramBoolean = DialogPresenter.canPresentNativeDialogWithFeature(ShareDialogFeature.HASHTAG);
          label52: bool2 = paramBoolean;
          if ((paramShareContent instanceof ShareLinkContent))
          {
            bool2 = paramBoolean;
            if (Utility.isNullOrEmpty(((ShareLinkContent)paramShareContent).getQuote()));
          }
        }
      for (boolean bool2 = paramBoolean & DialogPresenter.canPresentNativeDialogWithFeature(ShareDialogFeature.LINK_SHARE_QUOTES); ; bool2 = true)
      {
        if ((bool2) && (ShareDialog.access$500(paramShareContent.getClass())))
        {
          AppMethodBeat.o(97691);
          paramBoolean = bool1;
          break;
        }
        AppMethodBeat.o(97691);
        paramBoolean = false;
        break;
        paramBoolean = true;
        break label52;
      }
    }

    public AppCall createAppCall(ShareContent paramShareContent)
    {
      AppMethodBeat.i(97692);
      ShareDialog.access$700(ShareDialog.this, ShareDialog.access$600(ShareDialog.this), paramShareContent, ShareDialog.Mode.NATIVE);
      ShareContentValidation.validateForNativeShare(paramShareContent);
      AppCall localAppCall = ShareDialog.this.createBaseAppCall();
      DialogPresenter.setupAppCallForNativeDialog(localAppCall, new ShareDialog.NativeHandler.1(this, localAppCall, paramShareContent, ShareDialog.this.getShouldFailOnDataError()), ShareDialog.access$800(paramShareContent.getClass()));
      AppMethodBeat.o(97692);
      return localAppCall;
    }

    public Object getMode()
    {
      return ShareDialog.Mode.NATIVE;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.facebook.share.widget.ShareDialog
 * JD-Core Version:    0.6.2
 */