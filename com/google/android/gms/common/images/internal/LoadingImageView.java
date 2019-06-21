package com.google.android.gms.common.images.internal;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.google.android.gms.base.R.styleable;
import com.google.android.gms.common.images.ImageManager;
import com.google.android.gms.common.images.ImageManager.OnImageLoadedListener;
import com.google.android.gms.common.images.ImageRequest;
import com.google.android.gms.common.images.ImageRequest.ImageViewImageRequest;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.util.PlatformVersion;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class LoadingImageView extends ImageView
{
  public static final int ASPECT_RATIO_ADJUST_HEIGHT = 2;
  public static final int ASPECT_RATIO_ADJUST_NONE = 0;
  public static final int ASPECT_RATIO_ADJUST_WIDTH = 1;
  private static ImageManager zzqm;
  private ImageManager.OnImageLoadedListener mOnImageLoadedListener;
  private int mPostProcessingFlags;
  private boolean zzpl;
  private boolean zzpm;
  private Uri zzqn;
  private int zzqo;
  private boolean zzqp;
  private int zzqq;
  private LoadingImageView.ClipPathProvider zzqr;
  private int zzqs;
  private float zzqt;

  public LoadingImageView(Context paramContext)
  {
    this(paramContext, null, 0);
  }

  public LoadingImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public LoadingImageView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(61282);
    this.zzqo = 0;
    this.zzpl = true;
    this.zzpm = false;
    this.zzqp = false;
    this.zzqq = 0;
    this.mPostProcessingFlags = 0;
    this.zzqs = 0;
    this.zzqt = 1.0F;
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, R.styleable.LoadingImageView);
    this.zzqs = paramContext.getInt(0, 0);
    this.zzqt = paramContext.getFloat(1, 1.0F);
    setCircleCropEnabled(paramContext.getBoolean(2, false));
    paramContext.recycle();
    AppMethodBeat.o(61282);
  }

  private final void zzc(boolean paramBoolean)
  {
    AppMethodBeat.i(61295);
    if (this.mOnImageLoadedListener != null)
      this.mOnImageLoadedListener.onImageLoaded(this.zzqn, null, paramBoolean);
    AppMethodBeat.o(61295);
  }

  public final void clearAspectRatioAdjust()
  {
    AppMethodBeat.i(61292);
    if (this.zzqs != 0)
    {
      this.zzqs = 0;
      requestLayout();
    }
    AppMethodBeat.o(61292);
  }

  public final void clearImage()
  {
    AppMethodBeat.i(61283);
    loadUri(null);
    this.zzqp = true;
    AppMethodBeat.o(61283);
  }

  public final int getLoadedNoDataPlaceholderResId()
  {
    return this.zzqo;
  }

  public final Uri getLoadedUri()
  {
    return this.zzqn;
  }

  public final void loadUri(Uri paramUri)
  {
    AppMethodBeat.i(61284);
    loadUri(paramUri, 0, true, false);
    AppMethodBeat.o(61284);
  }

  public final void loadUri(Uri paramUri, int paramInt)
  {
    AppMethodBeat.i(61285);
    loadUri(paramUri, paramInt, true, false);
    AppMethodBeat.o(61285);
  }

  public final void loadUri(Uri paramUri, int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(61286);
    loadUri(paramUri, paramInt, paramBoolean, false);
    AppMethodBeat.o(61286);
  }

  public final void loadUri(Uri paramUri, int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    boolean bool1 = true;
    AppMethodBeat.i(61287);
    if (paramUri != null)
    {
      bool2 = paramUri.equals(this.zzqn);
      if (!bool2)
        break label85;
      if (this.zzqn == null)
        break label64;
      zzc(true);
      AppMethodBeat.o(61287);
    }
    while (true)
    {
      return;
      if (this.zzqn == null)
      {
        bool2 = true;
        break;
      }
      bool2 = false;
      break;
      label64: if (this.zzqo != paramInt)
        break label85;
      zzc(false);
      AppMethodBeat.o(61287);
    }
    label85: if (zzqm == null)
    {
      bool2 = getContext().getApplicationContext().getPackageName().equals("com.google.android.play.games");
      zzqm = ImageManager.create(getContext(), bool2);
    }
    boolean bool2 = bool1;
    if (!this.zzpm)
      if (!this.zzqp)
        break label218;
    label218: for (bool2 = bool1; ; bool2 = false)
    {
      this.zzqp = false;
      paramUri = new ImageRequest.ImageViewImageRequest(this, paramUri);
      paramUri.setNoDataPlaceholder(paramInt);
      paramUri.setCrossFadeEnabled(this.zzpl);
      paramUri.setCrossFadeAlwaysEnabled(bool2);
      paramUri.setLoadingPlaceholderEnabled(paramBoolean1);
      paramUri.setPostProcessingFlags(this.mPostProcessingFlags);
      paramUri.setOnImageLoadedListener(this.mOnImageLoadedListener);
      paramUri.setUseNewDrawable(paramBoolean2);
      zzqm.loadImage(paramUri);
      AppMethodBeat.o(61287);
      break;
    }
  }

  protected final void onDraw(Canvas paramCanvas)
  {
    AppMethodBeat.i(61294);
    if (this.zzqr != null)
      paramCanvas.clipPath(this.zzqr.getClipPath(getWidth(), getHeight()));
    super.onDraw(paramCanvas);
    if (this.zzqq != 0)
      paramCanvas.drawColor(this.zzqq);
    AppMethodBeat.o(61294);
  }

  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(61293);
    super.onMeasure(paramInt1, paramInt2);
    switch (this.zzqs)
    {
    default:
      AppMethodBeat.o(61293);
      return;
    case 1:
      paramInt2 = getMeasuredHeight();
      paramInt1 = (int)(paramInt2 * this.zzqt);
    case 2:
    }
    while (true)
    {
      setMeasuredDimension(paramInt1, paramInt2);
      AppMethodBeat.o(61293);
      break;
      paramInt1 = getMeasuredWidth();
      paramInt2 = (int)(paramInt1 / this.zzqt);
    }
  }

  public final void setCircleCropEnabled(boolean paramBoolean)
  {
    if (paramBoolean);
    for (this.mPostProcessingFlags |= 1; ; this.mPostProcessingFlags &= -2)
      return;
  }

  public final void setClipPathProvider(LoadingImageView.ClipPathProvider paramClipPathProvider)
  {
    AppMethodBeat.i(61290);
    this.zzqr = paramClipPathProvider;
    if (!PlatformVersion.isAtLeastJellyBean())
      setLayerType(1, null);
    AppMethodBeat.o(61290);
  }

  public final void setCrossFadeAlwaysEnabled(boolean paramBoolean)
  {
    this.zzpm = paramBoolean;
  }

  public final void setCrossFadeEnabled(boolean paramBoolean)
  {
    this.zzpl = paramBoolean;
  }

  public final void setImageAspectRatioAdjust(int paramInt, float paramFloat)
  {
    boolean bool1 = true;
    AppMethodBeat.i(61291);
    if ((paramInt == 0) || (paramInt == 1) || (paramInt == 2))
    {
      bool2 = true;
      Asserts.checkState(bool2);
      if (paramFloat <= 0.0F)
        break label71;
    }
    label71: for (boolean bool2 = bool1; ; bool2 = false)
    {
      Asserts.checkState(bool2);
      this.zzqs = paramInt;
      this.zzqt = paramFloat;
      requestLayout();
      AppMethodBeat.o(61291);
      return;
      bool2 = false;
      break;
    }
  }

  public final void setLoadedNoDataPlaceholderResId(int paramInt)
  {
    this.zzqo = paramInt;
  }

  public final void setLoadedUri(Uri paramUri)
  {
    this.zzqn = paramUri;
  }

  public final void setOnImageLoadedListener(ImageManager.OnImageLoadedListener paramOnImageLoadedListener)
  {
    this.mOnImageLoadedListener = paramOnImageLoadedListener;
  }

  public final void setTintColor(int paramInt)
  {
    AppMethodBeat.i(61289);
    this.zzqq = paramInt;
    if (this.zzqq != 0)
      setColorFilter(ColorFilters.COLOR_FILTER_BW);
    while (true)
    {
      invalidate();
      AppMethodBeat.o(61289);
      return;
      setColorFilter(null);
    }
  }

  public final void setTintColorId(int paramInt)
  {
    AppMethodBeat.i(61288);
    int i = 0;
    int j = i;
    if (paramInt > 0)
    {
      Resources localResources = getResources();
      j = i;
      if (localResources != null)
        j = localResources.getColor(paramInt);
    }
    setTintColor(j);
    AppMethodBeat.o(61288);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.images.internal.LoadingImageView
 * JD-Core Version:    0.6.2
 */