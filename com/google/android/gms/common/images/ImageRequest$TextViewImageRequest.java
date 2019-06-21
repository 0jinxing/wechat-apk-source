package com.google.android.gms.common.images;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.TextView;
import com.google.android.gms.common.images.internal.CrossFadingDrawable;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.util.PlatformVersion;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.ref.WeakReference;

public final class ImageRequest$TextViewImageRequest extends ImageRequest
{
  public static final int POSITION_BOTTOM = 3;
  public static final int POSITION_END = 2;
  public static final int POSITION_START = 0;
  public static final int POSITION_TOP = 1;
  private WeakReference<TextView> zzpq;
  private int zzpr;

  public ImageRequest$TextViewImageRequest(TextView paramTextView, int paramInt1, int paramInt2)
  {
    super(null, paramInt2);
    AppMethodBeat.i(61237);
    this.zzpr = -1;
    Asserts.checkNotNull(paramTextView);
    if ((paramInt1 != 0) && (paramInt1 != 1) && (paramInt1 != 2) && (paramInt1 != 3));
    while (true)
    {
      Asserts.checkState(bool, 29 + "Invalid position: " + paramInt1);
      this.zzpq = new WeakReference(paramTextView);
      this.zzpr = paramInt1;
      AppMethodBeat.o(61237);
      return;
      bool = false;
    }
  }

  public ImageRequest$TextViewImageRequest(TextView paramTextView, int paramInt, Uri paramUri)
  {
    super(paramUri, 0);
    AppMethodBeat.i(61236);
    this.zzpr = -1;
    Asserts.checkNotNull(paramTextView);
    if ((paramInt != 0) && (paramInt != 1) && (paramInt != 2) && (paramInt != 3));
    while (true)
    {
      Asserts.checkState(bool, 29 + "Invalid position: " + paramInt);
      this.zzpq = new WeakReference(paramTextView);
      this.zzpr = paramInt;
      AppMethodBeat.o(61236);
      return;
      bool = false;
    }
  }

  public final boolean equals(Object paramObject)
  {
    AppMethodBeat.i(61239);
    boolean bool;
    if (!(paramObject instanceof TextViewImageRequest))
    {
      AppMethodBeat.o(61239);
      bool = false;
    }
    while (true)
    {
      return bool;
      if (this == paramObject)
      {
        AppMethodBeat.o(61239);
        bool = true;
      }
      else
      {
        TextViewImageRequest localTextViewImageRequest = (TextViewImageRequest)paramObject;
        TextView localTextView = (TextView)this.zzpq.get();
        paramObject = (TextView)localTextViewImageRequest.zzpq.get();
        if ((paramObject != null) && (localTextView != null) && (Objects.equal(paramObject, localTextView)) && (Objects.equal(Integer.valueOf(localTextViewImageRequest.zzpr), Integer.valueOf(this.zzpr))))
        {
          AppMethodBeat.o(61239);
          bool = true;
        }
        else
        {
          AppMethodBeat.o(61239);
          bool = false;
        }
      }
    }
  }

  public final int hashCode()
  {
    AppMethodBeat.i(61238);
    int i = Objects.hashCode(new Object[] { Integer.valueOf(this.zzpr) });
    AppMethodBeat.o(61238);
    return i;
  }

  protected final void loadImage(Drawable paramDrawable, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    AppMethodBeat.i(61240);
    TextView localTextView = (TextView)this.zzpq.get();
    int i;
    Object localObject;
    Drawable localDrawable1;
    if (localTextView != null)
    {
      i = this.zzpr;
      paramBoolean1 = shouldCrossFade(paramBoolean1, paramBoolean2);
      if (!PlatformVersion.isAtLeastJellyBeanMR1())
        break label141;
      localObject = localTextView.getCompoundDrawablesRelative();
      localDrawable1 = localObject[i];
      if (!paramBoolean1)
        break label203;
      paramDrawable = createTransitionDrawable(localDrawable1, paramDrawable);
    }
    label141: label160: label169: label178: label187: label203: 
    while (true)
    {
      label75: Drawable localDrawable2;
      label84: Drawable localDrawable3;
      if (i == 0)
      {
        localDrawable1 = paramDrawable;
        if (i != 1)
          break label160;
        localDrawable2 = paramDrawable;
        if (i != 2)
          break label169;
        localDrawable3 = paramDrawable;
        label93: if (i != 3)
          break label178;
        localObject = paramDrawable;
        label102: if (!PlatformVersion.isAtLeastJellyBeanMR1())
          break label187;
        localTextView.setCompoundDrawablesRelativeWithIntrinsicBounds(localDrawable1, localDrawable2, localDrawable3, (Drawable)localObject);
      }
      while (true)
      {
        if (paramBoolean1)
          ((CrossFadingDrawable)paramDrawable).startTransition(250);
        AppMethodBeat.o(61240);
        return;
        localObject = localTextView.getCompoundDrawables();
        break;
        localDrawable1 = localObject[0];
        break label75;
        localDrawable2 = localObject[1];
        break label84;
        localDrawable3 = localObject[2];
        break label93;
        localObject = localObject[3];
        break label102;
        localTextView.setCompoundDrawablesWithIntrinsicBounds(localDrawable1, localDrawable2, localDrawable3, (Drawable)localObject);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.images.ImageRequest.TextViewImageRequest
 * JD-Core Version:    0.6.2
 */