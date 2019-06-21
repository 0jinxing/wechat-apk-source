package com.samsung.android.sdk.look.airbutton;

import android.content.ContentUris;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory.Options;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore.Audio.Media;
import android.provider.MediaStore.Images.Media;
import android.provider.MediaStore.Images.Thumbnails;
import android.provider.MediaStore.Video.Media;
import android.provider.MediaStore.Video.Thumbnails;
import android.view.View;
import com.samsung.android.sdk.look.Slook;
import com.samsung.android.sdk.look.SlookResourceManager;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;

public final class SlookAirButtonRecentMediaAdapter extends SlookAirButtonAdapter
{
  public static final String AUDIO_TYPE = "audio";
  private static final String ID = "id";
  public static final String IMAGE_TYPE = "image";
  private static final String MIME_TYPE = "mime_type";
  private static final String ORIENTATION = "orientation";
  private static final String TAG = "AirButtonRecentMediaAdapter";
  private static final String TITLE = "title";
  public static final String VIDEO_TYPE = "video";
  private static final String VOLUME = "external";
  private boolean DEBUG;
  private Context mContext;
  private int mCount;
  private ArrayList<Bundle> mData;
  private String mFilter;
  private boolean mIsShowing;
  private int mMaxCount;
  private boolean mNeedUpdate;
  private Slook mSlook;

  public SlookAirButtonRecentMediaAdapter(View paramView, Bundle paramBundle)
  {
    AppMethodBeat.i(117221);
    this.mMaxCount = 15;
    this.mData = new ArrayList();
    this.mSlook = new Slook();
    this.DEBUG = false;
    this.mIsShowing = false;
    this.mNeedUpdate = true;
    this.mCount = 0;
    if ((paramView == null) && (paramBundle == null))
    {
      paramView = new IllegalArgumentException("You should set the View and Bundle in Param");
      AppMethodBeat.o(117221);
      throw paramView;
    }
    if (!isSupport(1))
      AppMethodBeat.o(117221);
    while (true)
    {
      return;
      this.mFilter = getFilter(paramBundle);
      if (paramView != null)
      {
        this.mContext = paramView.getContext();
        this.DEBUG = true;
        this.mMaxCount = SlookResourceManager.getInt(3);
        setEmptyText(SlookResourceManager.getText(this.mContext, 1));
      }
      AppMethodBeat.o(117221);
    }
  }

  private Drawable getAudioDrawable(String paramString)
  {
    AppMethodBeat.i(117224);
    Bitmap localBitmap = Bitmap.createBitmap(200, 200, Bitmap.Config.ARGB_8888);
    Canvas localCanvas = new Canvas(localBitmap);
    int i = SlookResourceManager.getDrawableId(2);
    paramString = this.mContext.getResources().getDrawable(i);
    paramString.setBounds(new Rect(0, 0, 200, 200));
    localCanvas.drawColor(-2236963, PorterDuff.Mode.SRC);
    paramString.draw(localCanvas);
    paramString = new BitmapDrawable(this.mContext.getResources(), localBitmap);
    AppMethodBeat.o(117224);
    return paramString;
  }

  private String getFilter(Bundle paramBundle)
  {
    AppMethodBeat.i(117226);
    int i = 0;
    StringBuilder localStringBuilder = new StringBuilder();
    if ((paramBundle == null) || (paramBundle.getBoolean("image")))
    {
      localStringBuilder.append("media_type = ");
      localStringBuilder.append(1);
      i = 1;
    }
    int j;
    if (paramBundle != null)
    {
      j = i;
      if (!paramBundle.getBoolean("video"));
    }
    else
    {
      if (i != 0)
        localStringBuilder.append(" or ");
      localStringBuilder.append("media_type = ");
      localStringBuilder.append(3);
      j = 1;
    }
    if ((paramBundle == null) || (paramBundle.getBoolean("audio")))
    {
      if (j != 0)
        localStringBuilder.append(" or ");
      localStringBuilder.append("media_type = ");
      localStringBuilder.append(2);
    }
    paramBundle = localStringBuilder.toString();
    if ((paramBundle == null) || (paramBundle.length() <= 0))
    {
      paramBundle = null;
      AppMethodBeat.o(117226);
    }
    while (true)
    {
      return paramBundle;
      AppMethodBeat.o(117226);
    }
  }

  private Drawable getThumbNail(int paramInt1, int paramInt2, String paramString, int paramInt3)
  {
    AppMethodBeat.i(117223);
    switch (paramInt2)
    {
    default:
      AppMethodBeat.o(117223);
      paramString = null;
      return paramString;
    case 1:
      paramString = new BitmapFactory.Options();
      paramString.inSampleSize = 2;
      paramString = MediaStore.Images.Thumbnails.getThumbnail(this.mContext.getContentResolver(), paramInt1, 1, paramString);
      if (paramString != null)
        if ((paramInt3 == 90) || (paramInt3 == 180) || (paramInt3 == 270))
        {
          Matrix localMatrix = new Matrix();
          localMatrix.postRotate(paramInt3);
          paramString = Bitmap.createBitmap(paramString, 0, 0, paramString.getWidth(), paramString.getHeight(), localMatrix, true);
          paramString = new BitmapDrawable(this.mContext.getResources(), paramString);
        }
      break;
    case 3:
    case 2:
    }
    while (true)
    {
      AppMethodBeat.o(117223);
      break;
      paramString = new BitmapDrawable(this.mContext.getResources(), paramString);
      continue;
      paramString = MediaStore.Video.Thumbnails.getThumbnail(this.mContext.getContentResolver(), paramInt1, 3, null);
      paramString = new BitmapDrawable(this.mContext.getResources(), paramString);
      AppMethodBeat.o(117223);
      break;
      paramString = getAudioDrawable(paramString);
      AppMethodBeat.o(117223);
      break;
      paramString = null;
    }
  }

  private Uri getUri(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(117225);
    Uri localUri;
    switch (paramInt2)
    {
    default:
      localUri = null;
      AppMethodBeat.o(117225);
    case 1:
    case 3:
    case 2:
    }
    while (true)
    {
      return localUri;
      localUri = ContentUris.withAppendedId(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, paramInt1);
      AppMethodBeat.o(117225);
      continue;
      localUri = ContentUris.withAppendedId(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, paramInt1);
      AppMethodBeat.o(117225);
      continue;
      localUri = ContentUris.withAppendedId(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, paramInt1);
      AppMethodBeat.o(117225);
    }
  }

  private boolean isSupport(int paramInt)
  {
    boolean bool = true;
    AppMethodBeat.i(117231);
    if (this.mSlook.isFeatureEnabled(1))
      AppMethodBeat.o(117231);
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(117231);
    }
  }

  // ERROR //
  private void updateData()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc_w 286
    //   5: invokestatic 59	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   8: aload_0
    //   9: getfield 77	com/samsung/android/sdk/look/airbutton/SlookAirButtonRecentMediaAdapter:mNeedUpdate	Z
    //   12: ifeq +10 -> 22
    //   15: aload_0
    //   16: getfield 75	com/samsung/android/sdk/look/airbutton/SlookAirButtonRecentMediaAdapter:mIsShowing	Z
    //   19: ifeq +12 -> 31
    //   22: ldc_w 286
    //   25: invokestatic 89	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   28: aload_0
    //   29: monitorexit
    //   30: return
    //   31: aload_0
    //   32: iconst_0
    //   33: putfield 77	com/samsung/android/sdk/look/airbutton/SlookAirButtonRecentMediaAdapter:mNeedUpdate	Z
    //   36: aload_0
    //   37: getfield 66	com/samsung/android/sdk/look/airbutton/SlookAirButtonRecentMediaAdapter:mData	Ljava/util/ArrayList;
    //   40: invokevirtual 289	java/util/ArrayList:clear	()V
    //   43: aload_0
    //   44: getfield 107	com/samsung/android/sdk/look/airbutton/SlookAirButtonRecentMediaAdapter:mContext	Landroid/content/Context;
    //   47: invokevirtual 232	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   50: astore_1
    //   51: ldc 32
    //   53: invokestatic 295	android/provider/MediaStore$Files:getContentUri	(Ljava/lang/String;)Landroid/net/Uri;
    //   56: astore_2
    //   57: aload_0
    //   58: getfield 99	com/samsung/android/sdk/look/airbutton/SlookAirButtonRecentMediaAdapter:mFilter	Ljava/lang/String;
    //   61: astore_3
    //   62: new 191	java/lang/StringBuilder
    //   65: astore 4
    //   67: aload 4
    //   69: ldc_w 297
    //   72: invokespecial 298	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   75: aload 4
    //   77: aload_0
    //   78: getfield 61	com/samsung/android/sdk/look/airbutton/SlookAirButtonRecentMediaAdapter:mMaxCount	I
    //   81: invokevirtual 207	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   84: invokevirtual 213	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   87: astore 4
    //   89: aload_1
    //   90: aload_2
    //   91: iconst_4
    //   92: anewarray 215	java/lang/String
    //   95: dup
    //   96: iconst_0
    //   97: ldc_w 300
    //   100: aastore
    //   101: dup
    //   102: iconst_1
    //   103: ldc_w 302
    //   106: aastore
    //   107: dup
    //   108: iconst_2
    //   109: ldc 26
    //   111: aastore
    //   112: dup
    //   113: iconst_3
    //   114: ldc 20
    //   116: aastore
    //   117: aload_3
    //   118: aconst_null
    //   119: aload 4
    //   121: invokevirtual 308	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   124: astore_3
    //   125: aload_3
    //   126: ifnonnull +27 -> 153
    //   129: aload_3
    //   130: ifnull +9 -> 139
    //   133: aload_3
    //   134: invokeinterface 313 1 0
    //   139: ldc_w 286
    //   142: invokestatic 89	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   145: goto -117 -> 28
    //   148: astore_3
    //   149: aload_0
    //   150: monitorexit
    //   151: aload_3
    //   152: athrow
    //   153: aload_3
    //   154: invokeinterface 317 1 0
    //   159: ifeq +81 -> 240
    //   162: new 194	android/os/Bundle
    //   165: astore_2
    //   166: aload_2
    //   167: invokespecial 318	android/os/Bundle:<init>	()V
    //   170: aload_2
    //   171: ldc 11
    //   173: aload_3
    //   174: iconst_0
    //   175: invokeinterface 319 2 0
    //   180: invokevirtual 323	android/os/Bundle:putInt	(Ljava/lang/String;I)V
    //   183: aload_2
    //   184: ldc 17
    //   186: aload_3
    //   187: iconst_1
    //   188: invokeinterface 319 2 0
    //   193: invokevirtual 323	android/os/Bundle:putInt	(Ljava/lang/String;I)V
    //   196: aload_2
    //   197: ldc 20
    //   199: aload_3
    //   200: iconst_3
    //   201: invokeinterface 319 2 0
    //   206: invokevirtual 323	android/os/Bundle:putInt	(Ljava/lang/String;I)V
    //   209: aload_0
    //   210: getfield 66	com/samsung/android/sdk/look/airbutton/SlookAirButtonRecentMediaAdapter:mData	Ljava/util/ArrayList;
    //   213: aload_2
    //   214: invokevirtual 327	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   217: pop
    //   218: goto -65 -> 153
    //   221: astore_2
    //   222: aload_3
    //   223: ifnull +9 -> 232
    //   226: aload_3
    //   227: invokeinterface 313 1 0
    //   232: ldc_w 286
    //   235: invokestatic 89	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   238: aload_2
    //   239: athrow
    //   240: aload_3
    //   241: ifnull +9 -> 250
    //   244: aload_3
    //   245: invokeinterface 313 1 0
    //   250: aload_0
    //   251: aload_0
    //   252: getfield 66	com/samsung/android/sdk/look/airbutton/SlookAirButtonRecentMediaAdapter:mData	Ljava/util/ArrayList;
    //   255: invokevirtual 330	java/util/ArrayList:size	()I
    //   258: putfield 79	com/samsung/android/sdk/look/airbutton/SlookAirButtonRecentMediaAdapter:mCount	I
    //   261: ldc_w 286
    //   264: invokestatic 89	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   267: goto -239 -> 28
    //   270: astore_2
    //   271: aconst_null
    //   272: astore_3
    //   273: goto -51 -> 222
    //
    // Exception table:
    //   from	to	target	type
    //   2	22	148	finally
    //   22	28	148	finally
    //   31	43	148	finally
    //   133	139	148	finally
    //   139	145	148	finally
    //   226	232	148	finally
    //   232	240	148	finally
    //   244	250	148	finally
    //   250	267	148	finally
    //   153	218	221	finally
    //   43	125	270	finally
  }

  public final int getCount()
  {
    return this.mCount;
  }

  public final SlookAirButtonAdapter.AirButtonItem getItem(int paramInt)
  {
    AppMethodBeat.i(117222);
    Object localObject = (Bundle)this.mData.get(paramInt);
    paramInt = ((Bundle)localObject).getInt("id");
    int i = ((Bundle)localObject).getInt("mime_type");
    localObject = new SlookAirButtonAdapter.AirButtonItem(getThumbNail(paramInt, i, ((Bundle)localObject).getString("title"), ((Bundle)localObject).getInt("orientation")), null, getUri(paramInt, i));
    AppMethodBeat.o(117222);
    return localObject;
  }

  public final void onDismiss(View paramView)
  {
    AppMethodBeat.i(117229);
    this.mIsShowing = false;
    this.mNeedUpdate = true;
    this.mData.clear();
    super.onDismiss(paramView);
    AppMethodBeat.o(117229);
  }

  public final void onHide(View paramView)
  {
    AppMethodBeat.i(117228);
    this.mIsShowing = false;
    this.mNeedUpdate = true;
    this.mData.clear();
    super.onHide(paramView);
    AppMethodBeat.o(117228);
  }

  public final void onShow(View paramView)
  {
    AppMethodBeat.i(117227);
    updateData();
    this.mIsShowing = true;
    super.onShow(paramView);
    AppMethodBeat.o(117227);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.samsung.android.sdk.look.airbutton.SlookAirButtonRecentMediaAdapter
 * JD-Core Version:    0.6.2
 */