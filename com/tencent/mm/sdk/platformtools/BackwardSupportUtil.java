package com.tencent.mm.sdk.platformtools;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.Animation;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.Exif;
import com.tencent.mm.compatible.util.Exif.a;
import com.tencent.mm.vfs.e;
import java.io.InputStream;

public final class BackwardSupportUtil
{
  public static BackwardSupportUtil.ExifHelper.LatLongData amg(String paramString)
  {
    Object localObject = null;
    AppMethodBeat.i(93295);
    MediaMetadataRetriever localMediaMetadataRetriever = new MediaMetadataRetriever();
    int i;
    int j;
    try
    {
      localMediaMetadataRetriever.setDataSource(paramString);
      paramString = localMediaMetadataRetriever.extractMetadata(23);
      localMediaMetadataRetriever.release();
      ab.i("MicroMsg.SDK.BackwardSupportUtil", "getVideoLatLong locationString ".concat(String.valueOf(paramString)));
      if (!TextUtils.isEmpty(paramString))
      {
        localObject = paramString.toCharArray();
        paramString = new StringBuilder();
        i = localObject.length;
        for (j = 0; j < i; j++)
        {
          char c = localObject[j];
          if ((c == '+') || (c == '-') || (c == '.') || (TextUtils.isDigitsOnly(String.valueOf(c))))
            paramString.append(c);
        }
      }
    }
    catch (Exception paramString)
    {
      ab.e("MicroMsg.SDK.BackwardSupportUtil", "getVideoLatLong setDataSource failure: " + paramString.getMessage());
      AppMethodBeat.o(93295);
      paramString = (String)localObject;
    }
    while (true)
    {
      return paramString;
      localObject = paramString.toString();
      i = ((String)localObject).lastIndexOf('+');
      j = i;
      if (-1 == i)
        j = ((String)localObject).lastIndexOf('-');
      paramString = new BackwardSupportUtil.ExifHelper.LatLongData();
      paramString.cEB = bo.ann(((String)localObject).substring(0, j));
      paramString.fFz = bo.ann(((String)localObject).substring(j));
      AppMethodBeat.o(93295);
      continue;
      AppMethodBeat.o(93295);
      paramString = (String)localObject;
    }
  }

  public static String amh(String paramString)
  {
    AppMethodBeat.i(93296);
    MediaMetadataRetriever localMediaMetadataRetriever = new MediaMetadataRetriever();
    try
    {
      localMediaMetadataRetriever.setDataSource(paramString);
      paramString = localMediaMetadataRetriever.extractMetadata(5);
      localMediaMetadataRetriever.release();
      ab.i("MicroMsg.SDK.BackwardSupportUtil", "getVideoTakeTime timeString ".concat(String.valueOf(paramString)));
      AppMethodBeat.o(93296);
      return paramString;
    }
    catch (Exception paramString)
    {
      while (true)
      {
        ab.e("MicroMsg.SDK.BackwardSupportUtil", "getVideoLatLong setDataSource failure: " + paramString.getMessage());
        paramString = null;
        AppMethodBeat.o(93296);
      }
    }
  }

  public static final class ExifHelper
  {
    public static LatLongData ami(String paramString)
    {
      Object localObject = null;
      AppMethodBeat.i(93291);
      if (bo.isNullOrNil(paramString))
      {
        ab.d("MicroMsg.SDK.BackwardSupportUtil", "filepath is null or nil");
        AppMethodBeat.o(93291);
        paramString = localObject;
      }
      while (true)
      {
        return paramString;
        if (!e.ct(paramString))
        {
          ab.d("MicroMsg.SDK.BackwardSupportUtil", "file not exist:[%s]", new Object[] { paramString });
          AppMethodBeat.o(93291);
          paramString = localObject;
        }
        else
        {
          Exif.a locala = Exif.fromFile(paramString).getLocation();
          if (locala != null)
          {
            paramString = new LatLongData();
            paramString.cEB = ((float)locala.latitude);
            paramString.fFz = ((float)locala.longitude);
            AppMethodBeat.o(93291);
          }
          else
          {
            AppMethodBeat.o(93291);
            paramString = localObject;
          }
        }
      }
    }

    public static int bJ(String paramString)
    {
      int i = 0;
      AppMethodBeat.i(93290);
      if (bo.isNullOrNil(paramString))
      {
        ab.d("MicroMsg.SDK.BackwardSupportUtil", "filepath is null or nil");
        AppMethodBeat.o(93290);
      }
      while (true)
      {
        return i;
        if (!e.ct(paramString))
        {
          ab.d("MicroMsg.SDK.BackwardSupportUtil", "file not exist:[%s]", new Object[] { paramString });
          AppMethodBeat.o(93290);
        }
        else
        {
          i = Exif.fromFile(paramString).getOrientationInDegree();
          AppMethodBeat.o(93290);
        }
      }
    }

    public static class LatLongData
      implements Parcelable
    {
      public static final Parcelable.Creator<LatLongData> CREATOR;
      public float cEB;
      public float fFz;

      static
      {
        AppMethodBeat.i(93289);
        CREATOR = new Parcelable.Creator()
        {
        };
        AppMethodBeat.o(93289);
      }

      public LatLongData()
      {
        this.cEB = 0.0F;
        this.fFz = 0.0F;
      }

      public LatLongData(float paramFloat1, float paramFloat2)
      {
        this.cEB = paramFloat1;
        this.fFz = paramFloat2;
      }

      public int describeContents()
      {
        return 0;
      }

      public boolean equals(Object paramObject)
      {
        boolean bool = false;
        AppMethodBeat.i(93287);
        if (!(paramObject instanceof LatLongData))
          AppMethodBeat.o(93287);
        while (true)
        {
          return bool;
          paramObject = (LatLongData)paramObject;
          if ((Math.abs(this.cEB - paramObject.cEB) < 1.0E-006F) && (Math.abs(this.fFz - paramObject.fFz) < 1.0E-006F))
          {
            bool = true;
            AppMethodBeat.o(93287);
          }
          else
          {
            AppMethodBeat.o(93287);
          }
        }
      }

      public int hashCode()
      {
        return (int)(this.cEB * 10000.0F) + (int)(this.fFz * 10000.0F);
      }

      public void writeToParcel(Parcel paramParcel, int paramInt)
      {
        AppMethodBeat.i(93288);
        paramParcel.writeFloat(this.cEB);
        paramParcel.writeFloat(this.fFz);
        AppMethodBeat.o(93288);
      }
    }
  }

  public static final class a
  {
    public static void a(View paramView, Animation paramAnimation)
    {
      AppMethodBeat.i(93280);
      if (Build.VERSION.SDK_INT >= 8)
      {
        new b();
        paramAnimation.cancel();
        AppMethodBeat.o(93280);
      }
      while (true)
      {
        return;
        new a();
        a.ez(paramView);
        AppMethodBeat.o(93280);
      }
    }
  }

  public static final class b
  {
    public static Bitmap a(InputStream paramInputStream, float paramFloat)
    {
      AppMethodBeat.i(93283);
      paramInputStream = b(paramInputStream, paramFloat);
      AppMethodBeat.o(93283);
      return paramInputStream;
    }

    public static int b(Context paramContext, float paramFloat)
    {
      AppMethodBeat.i(93282);
      int i = Math.round(paramContext.getResources().getDisplayMetrics().densityDpi * paramFloat / 160.0F);
      AppMethodBeat.o(93282);
      return i;
    }

    public static Bitmap b(InputStream paramInputStream, float paramFloat)
    {
      AppMethodBeat.i(93284);
      paramInputStream = d.a(paramInputStream, paramFloat, 0, 0);
      if (paramInputStream != null)
        paramInputStream.setDensity((int)(160.0F * paramFloat));
      AppMethodBeat.o(93284);
      return paramInputStream;
    }

    public static String gi(Context paramContext)
    {
      AppMethodBeat.i(93285);
      Object localObject = paramContext.getResources().getDisplayMetrics();
      Configuration localConfiguration = paramContext.getResources().getConfiguration();
      if (((DisplayMetrics)localObject).density < 1.0F)
      {
        paramContext = "" + "LDPI";
        localObject = new StringBuilder().append(paramContext);
        if (localConfiguration.orientation != 2)
          break label148;
      }
      label148: for (paramContext = "_L"; ; paramContext = "_P")
      {
        paramContext = paramContext;
        AppMethodBeat.o(93285);
        return paramContext;
        if (((DisplayMetrics)localObject).density >= 1.5F)
        {
          paramContext = "" + "HDPI";
          break;
        }
        paramContext = "" + "MDPI";
        break;
      }
    }

    public static Bitmap i(String paramString, float paramFloat)
    {
      AppMethodBeat.i(93281);
      paramString = d.j(paramString, paramFloat);
      if (paramString != null)
        paramString.setDensity((int)(160.0F * paramFloat));
      AppMethodBeat.o(93281);
      return paramString;
    }
  }

  public static final class c
  {
    public static void a(ListView paramListView)
    {
      AppMethodBeat.i(93292);
      if (paramListView == null)
        AppMethodBeat.o(93292);
      while (true)
      {
        return;
        if (Build.VERSION.SDK_INT >= 8)
        {
          new bi();
          bi.c(paramListView);
          AppMethodBeat.o(93292);
        }
        else
        {
          new bh();
          paramListView.setSelection(0);
          AppMethodBeat.o(93292);
        }
      }
    }

    public static void b(ListView paramListView, int paramInt)
    {
      AppMethodBeat.i(93293);
      if (paramListView == null)
        AppMethodBeat.o(93293);
      while (true)
      {
        return;
        if (Build.VERSION.SDK_INT >= 8)
        {
          new bi();
          bi.d(paramListView, paramInt);
          AppMethodBeat.o(93293);
        }
        else
        {
          new bh();
          paramListView.setSelection(paramInt);
          AppMethodBeat.o(93293);
        }
      }
    }

    public static void c(ListView paramListView, int paramInt)
    {
      AppMethodBeat.i(93294);
      if (paramListView == null)
        AppMethodBeat.o(93294);
      while (true)
      {
        return;
        if (Build.VERSION.SDK_INT >= 11)
        {
          new bi();
          int i = paramListView.getFirstVisiblePosition();
          if ((i < paramInt) && (i + 10 < paramInt))
            paramListView.setSelectionFromTop(paramInt - 10, 0);
          while (true)
          {
            if (Build.VERSION.SDK_INT >= 11)
              paramListView.smoothScrollToPositionFromTop(paramInt, 0);
            AppMethodBeat.o(93294);
            break;
            if ((i > paramInt) && (i - 10 > paramInt))
              paramListView.setSelectionFromTop(paramInt + 10, 0);
          }
        }
        new bh();
        paramListView.setSelectionFromTop(paramInt, 0);
        AppMethodBeat.o(93294);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.platformtools.BackwardSupportUtil
 * JD-Core Version:    0.6.2
 */