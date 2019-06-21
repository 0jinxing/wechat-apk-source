package com.facebook.login.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import com.facebook.FacebookException;
import com.facebook.LoggingBehavior;
import com.facebook.internal.ImageDownloader;
import com.facebook.internal.ImageRequest;
import com.facebook.internal.ImageRequest.Builder;
import com.facebook.internal.ImageResponse;
import com.facebook.internal.Logger;
import com.facebook.internal.Utility;
import com.facebook.login.R.styleable;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class ProfilePictureView extends FrameLayout
{
  private static final String BITMAP_HEIGHT_KEY = "ProfilePictureView_height";
  private static final String BITMAP_KEY = "ProfilePictureView_bitmap";
  private static final String BITMAP_WIDTH_KEY = "ProfilePictureView_width";
  public static final int CUSTOM = -1;
  private static final boolean IS_CROPPED_DEFAULT_VALUE = true;
  private static final String IS_CROPPED_KEY = "ProfilePictureView_isCropped";
  public static final int LARGE = -4;
  private static final int MIN_SIZE = 1;
  public static final int NORMAL = -3;
  private static final String PENDING_REFRESH_KEY = "ProfilePictureView_refresh";
  private static final String PRESET_SIZE_KEY = "ProfilePictureView_presetSize";
  private static final String PROFILE_ID_KEY = "ProfilePictureView_profileId";
  public static final int SMALL = -2;
  private static final String SUPER_STATE_KEY = "ProfilePictureView_superState";
  public static final String TAG;
  private Bitmap customizedDefaultProfilePicture;
  private ImageView image;
  private Bitmap imageContents;
  private boolean isCropped;
  private ImageRequest lastRequest;
  private ProfilePictureView.OnErrorListener onErrorListener;
  private int presetSizeType;
  private String profileId;
  private int queryHeight;
  private int queryWidth;

  static
  {
    AppMethodBeat.i(92710);
    TAG = ProfilePictureView.class.getSimpleName();
    AppMethodBeat.o(92710);
  }

  public ProfilePictureView(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(92689);
    this.queryHeight = 0;
    this.queryWidth = 0;
    this.isCropped = true;
    this.presetSizeType = -1;
    this.customizedDefaultProfilePicture = null;
    initialize(paramContext);
    AppMethodBeat.o(92689);
  }

  public ProfilePictureView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(92690);
    this.queryHeight = 0;
    this.queryWidth = 0;
    this.isCropped = true;
    this.presetSizeType = -1;
    this.customizedDefaultProfilePicture = null;
    initialize(paramContext);
    parseAttributes(paramAttributeSet);
    AppMethodBeat.o(92690);
  }

  public ProfilePictureView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(92691);
    this.queryHeight = 0;
    this.queryWidth = 0;
    this.isCropped = true;
    this.presetSizeType = -1;
    this.customizedDefaultProfilePicture = null;
    initialize(paramContext);
    parseAttributes(paramAttributeSet);
    AppMethodBeat.o(92691);
  }

  private int getPresetSizeInPixels(boolean paramBoolean)
  {
    int i = 2131428245;
    AppMethodBeat.i(92708);
    int j = i;
    switch (this.presetSizeType)
    {
    default:
      AppMethodBeat.o(92708);
      j = 0;
    case -2:
    case -3:
    case -4:
    case -1:
    }
    while (true)
    {
      return j;
      j = 2131428246;
      do
      {
        while (true)
        {
          j = getResources().getDimensionPixelSize(j);
          AppMethodBeat.o(92708);
          break;
          j = 2131428244;
        }
        j = i;
      }
      while (paramBoolean);
      AppMethodBeat.o(92708);
      j = 0;
    }
  }

  private void initialize(Context paramContext)
  {
    AppMethodBeat.i(92700);
    removeAllViews();
    this.image = new ImageView(paramContext);
    paramContext = new FrameLayout.LayoutParams(-1, -1);
    this.image.setLayoutParams(paramContext);
    this.image.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
    addView(this.image);
    AppMethodBeat.o(92700);
  }

  private void parseAttributes(AttributeSet paramAttributeSet)
  {
    AppMethodBeat.i(92701);
    paramAttributeSet = getContext().obtainStyledAttributes(paramAttributeSet, R.styleable.com_facebook_profile_picture_view);
    setPresetSize(paramAttributeSet.getInt(0, -1));
    this.isCropped = paramAttributeSet.getBoolean(1, true);
    paramAttributeSet.recycle();
    AppMethodBeat.o(92701);
  }

  private void processResponse(ImageResponse paramImageResponse)
  {
    AppMethodBeat.i(92706);
    Bitmap localBitmap;
    Exception localException;
    if (paramImageResponse.getRequest() == this.lastRequest)
    {
      this.lastRequest = null;
      localBitmap = paramImageResponse.getBitmap();
      localException = paramImageResponse.getError();
      if (localException != null)
      {
        paramImageResponse = this.onErrorListener;
        if (paramImageResponse != null)
        {
          paramImageResponse.onError(new FacebookException("Error in downloading profile picture for profileId: " + getProfileId(), localException));
          AppMethodBeat.o(92706);
        }
      }
    }
    while (true)
    {
      return;
      Logger.log(LoggingBehavior.REQUESTS, 6, TAG, localException.toString());
      AppMethodBeat.o(92706);
      continue;
      if (localBitmap != null)
      {
        setImageBitmap(localBitmap);
        if (paramImageResponse.isCachedRedirect())
          sendImageRequest(false);
      }
      AppMethodBeat.o(92706);
    }
  }

  private void refreshImage(boolean paramBoolean)
  {
    AppMethodBeat.i(92702);
    boolean bool = updateImageQueryParameters();
    if ((this.profileId == null) || (this.profileId.length() == 0) || ((this.queryWidth == 0) && (this.queryHeight == 0)))
    {
      setBlankProfilePicture();
      AppMethodBeat.o(92702);
    }
    while (true)
    {
      return;
      if ((bool) || (paramBoolean))
        sendImageRequest(true);
      AppMethodBeat.o(92702);
    }
  }

  private void sendImageRequest(boolean paramBoolean)
  {
    AppMethodBeat.i(92705);
    ImageRequest localImageRequest = new ImageRequest.Builder(getContext(), ImageRequest.getProfilePictureUri(this.profileId, this.queryWidth, this.queryHeight)).setAllowCachedRedirects(paramBoolean).setCallerTag(this).setCallback(new ProfilePictureView.1(this)).build();
    if (this.lastRequest != null)
      ImageDownloader.cancelRequest(this.lastRequest);
    this.lastRequest = localImageRequest;
    ImageDownloader.downloadAsync(localImageRequest);
    AppMethodBeat.o(92705);
  }

  private void setBlankProfilePicture()
  {
    AppMethodBeat.i(92703);
    if (this.lastRequest != null)
      ImageDownloader.cancelRequest(this.lastRequest);
    int i;
    if (this.customizedDefaultProfilePicture == null)
      if (isCropped())
      {
        i = 2130838386;
        setImageBitmap(BitmapFactory.decodeResource(getResources(), i));
        AppMethodBeat.o(92703);
      }
    while (true)
    {
      return;
      i = 2130838385;
      break;
      updateImageQueryParameters();
      setImageBitmap(Bitmap.createScaledBitmap(this.customizedDefaultProfilePicture, this.queryWidth, this.queryHeight, false));
      AppMethodBeat.o(92703);
    }
  }

  private void setImageBitmap(Bitmap paramBitmap)
  {
    AppMethodBeat.i(92704);
    if ((this.image != null) && (paramBitmap != null))
    {
      this.imageContents = paramBitmap;
      this.image.setImageBitmap(paramBitmap);
    }
    AppMethodBeat.o(92704);
  }

  private boolean updateImageQueryParameters()
  {
    boolean bool1 = false;
    boolean bool2 = false;
    AppMethodBeat.i(92707);
    int i = getHeight();
    int j = getWidth();
    if ((j <= 0) || (i <= 0))
    {
      AppMethodBeat.o(92707);
      return bool2;
    }
    int k = getPresetSizeInPixels(false);
    if (k != 0)
    {
      j = k;
      i = k;
    }
    if (j <= i)
    {
      if (isCropped());
      for (i = j; ; i = 0)
      {
        if (j == this.queryWidth)
        {
          bool2 = bool1;
          if (i == this.queryHeight);
        }
        else
        {
          bool2 = true;
        }
        this.queryWidth = j;
        this.queryHeight = i;
        AppMethodBeat.o(92707);
        break;
      }
    }
    if (isCropped());
    for (j = i; ; j = 0)
      break;
  }

  public final ProfilePictureView.OnErrorListener getOnErrorListener()
  {
    return this.onErrorListener;
  }

  public final int getPresetSize()
  {
    return this.presetSizeType;
  }

  public final String getProfileId()
  {
    return this.profileId;
  }

  public final boolean isCropped()
  {
    return this.isCropped;
  }

  protected void onDetachedFromWindow()
  {
    AppMethodBeat.i(92699);
    super.onDetachedFromWindow();
    this.lastRequest = null;
    AppMethodBeat.o(92699);
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(92696);
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    refreshImage(false);
    AppMethodBeat.o(92696);
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i = 1;
    AppMethodBeat.i(92695);
    ViewGroup.LayoutParams localLayoutParams = getLayoutParams();
    int j = 0;
    int k = View.MeasureSpec.getSize(paramInt2);
    int m = View.MeasureSpec.getSize(paramInt1);
    int n = k;
    int i1 = j;
    int i2 = paramInt2;
    if (View.MeasureSpec.getMode(paramInt2) != 1073741824)
    {
      n = k;
      i1 = j;
      i2 = paramInt2;
      if (localLayoutParams.height == -2)
      {
        n = getPresetSizeInPixels(true);
        i2 = View.MeasureSpec.makeMeasureSpec(n, 1073741824);
        i1 = 1;
      }
    }
    if ((View.MeasureSpec.getMode(paramInt1) != 1073741824) && (localLayoutParams.width == -2))
    {
      i1 = getPresetSizeInPixels(true);
      paramInt1 = View.MeasureSpec.makeMeasureSpec(i1, 1073741824);
      paramInt2 = i;
    }
    while (true)
    {
      if (paramInt2 != 0)
      {
        setMeasuredDimension(i1, n);
        measureChildren(paramInt1, i2);
        AppMethodBeat.o(92695);
      }
      while (true)
      {
        return;
        super.onMeasure(paramInt1, i2);
        AppMethodBeat.o(92695);
      }
      paramInt2 = i1;
      i1 = m;
    }
  }

  protected void onRestoreInstanceState(Parcelable paramParcelable)
  {
    AppMethodBeat.i(92698);
    if (paramParcelable.getClass() != Bundle.class)
    {
      super.onRestoreInstanceState(paramParcelable);
      AppMethodBeat.o(92698);
    }
    while (true)
    {
      return;
      paramParcelable = (Bundle)paramParcelable;
      super.onRestoreInstanceState(paramParcelable.getParcelable("ProfilePictureView_superState"));
      this.profileId = paramParcelable.getString("ProfilePictureView_profileId");
      this.presetSizeType = paramParcelable.getInt("ProfilePictureView_presetSize");
      this.isCropped = paramParcelable.getBoolean("ProfilePictureView_isCropped");
      this.queryWidth = paramParcelable.getInt("ProfilePictureView_width");
      this.queryHeight = paramParcelable.getInt("ProfilePictureView_height");
      refreshImage(true);
      AppMethodBeat.o(92698);
    }
  }

  protected Parcelable onSaveInstanceState()
  {
    AppMethodBeat.i(92697);
    Parcelable localParcelable = super.onSaveInstanceState();
    Bundle localBundle = new Bundle();
    localBundle.putParcelable("ProfilePictureView_superState", localParcelable);
    localBundle.putString("ProfilePictureView_profileId", this.profileId);
    localBundle.putInt("ProfilePictureView_presetSize", this.presetSizeType);
    localBundle.putBoolean("ProfilePictureView_isCropped", this.isCropped);
    localBundle.putInt("ProfilePictureView_width", this.queryWidth);
    localBundle.putInt("ProfilePictureView_height", this.queryHeight);
    if (this.lastRequest != null);
    for (boolean bool = true; ; bool = false)
    {
      localBundle.putBoolean("ProfilePictureView_refresh", bool);
      AppMethodBeat.o(92697);
      return localBundle;
    }
  }

  public final void setCropped(boolean paramBoolean)
  {
    AppMethodBeat.i(92693);
    this.isCropped = paramBoolean;
    refreshImage(false);
    AppMethodBeat.o(92693);
  }

  public final void setDefaultProfilePicture(Bitmap paramBitmap)
  {
    this.customizedDefaultProfilePicture = paramBitmap;
  }

  public final void setOnErrorListener(ProfilePictureView.OnErrorListener paramOnErrorListener)
  {
    this.onErrorListener = paramOnErrorListener;
  }

  public final void setPresetSize(int paramInt)
  {
    AppMethodBeat.i(92692);
    switch (paramInt)
    {
    default:
      IllegalArgumentException localIllegalArgumentException = new IllegalArgumentException("Must use a predefined preset size");
      AppMethodBeat.o(92692);
      throw localIllegalArgumentException;
    case -4:
    case -3:
    case -2:
    case -1:
    }
    this.presetSizeType = paramInt;
    requestLayout();
    AppMethodBeat.o(92692);
  }

  public final void setProfileId(String paramString)
  {
    AppMethodBeat.i(92694);
    boolean bool = false;
    if ((Utility.isNullOrEmpty(this.profileId)) || (!this.profileId.equalsIgnoreCase(paramString)))
    {
      setBlankProfilePicture();
      bool = true;
    }
    this.profileId = paramString;
    refreshImage(bool);
    AppMethodBeat.o(92694);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.facebook.login.widget.ProfilePictureView
 * JD-Core Version:    0.6.2
 */