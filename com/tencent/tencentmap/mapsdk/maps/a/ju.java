package com.tencent.tencentmap.mapsdk.maps.a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.util.DisplayMetrics;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.tencentmap.mapsdk.a.be;
import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ju
  implements jw
{
  private ll a;
  private jv b;
  private js c;
  private volatile ExecutorService d;

  public ju(Context paramContext)
  {
    AppMethodBeat.i(100113);
    this.d = null;
    this.a = ll.a(paramContext);
    this.b = new jv(a(paramContext));
    this.c = new js();
    this.d = Executors.newSingleThreadExecutor();
    AppMethodBeat.o(100113);
  }

  private int a(Context paramContext)
  {
    AppMethodBeat.i(100122);
    int i = paramContext.getResources().getDisplayMetrics().heightPixels;
    int j = paramContext.getResources().getDisplayMetrics().widthPixels;
    i = (int)(i * 1.0D / 256.0D + 0.5D);
    j = (int)(j * 1.0D / 256.0D + 0.5D);
    AppMethodBeat.o(100122);
    return i * 262144 * j * 3;
  }

  private Bitmap a(be parambe)
  {
    AppMethodBeat.i(100118);
    if (parambe == null)
    {
      parambe = null;
      AppMethodBeat.o(100118);
    }
    while (true)
    {
      return parambe;
      BitmapFactory.Options localOptions = c();
      Bitmap localBitmap = this.b.a();
      if (localBitmap != null)
        localOptions.inBitmap = localBitmap;
      parambe.a(localOptions);
      parambe = this.a.a(parambe);
      AppMethodBeat.o(100118);
    }
  }

  private void a(be parambe, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(100119);
    parambe = this.c.a(parambe.a(), parambe.b(), parambe.c());
    if (parambe == null)
      AppMethodBeat.o(100119);
    while (true)
    {
      return;
      parambe = parambe.getBytes();
      Arrays.fill(paramArrayOfByte, (byte)0);
      System.arraycopy(parambe, 0, paramArrayOfByte, 0, parambe.length);
      AppMethodBeat.o(100119);
    }
  }

  private boolean a(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(100121);
    if ((paramString != null) && (paramString.length() > 0))
    {
      paramString = Pattern.compile("version=\\d+").matcher(paramString);
      if (paramString.find())
      {
        paramString = paramString.group();
        if (Integer.parseInt(paramString.substring(paramString.indexOf("=") + 1)) == jp.a())
        {
          bool = true;
          AppMethodBeat.o(100121);
        }
      }
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(100121);
      continue;
      AppMethodBeat.o(100121);
    }
  }

  private BitmapFactory.Options c()
  {
    AppMethodBeat.i(100120);
    BitmapFactory.Options localOptions = new BitmapFactory.Options();
    localOptions.inPreferredConfig = Bitmap.Config.ARGB_8888;
    localOptions.inSampleSize = 1;
    localOptions.outWidth = 256;
    localOptions.outHeight = 256;
    localOptions.inMutable = true;
    AppMethodBeat.o(100120);
    return localOptions;
  }

  public Bitmap a(int paramInt1, int paramInt2, int paramInt3, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(100114);
    be localbe = new be(paramInt1, paramInt2, paramInt3, 1);
    Object localObject = this.b.a(localbe.toString());
    if (localObject != null)
    {
      AppMethodBeat.o(100114);
      paramArrayOfByte = (byte[])localObject;
    }
    while (true)
    {
      return paramArrayOfByte;
      localObject = c();
      Bitmap localBitmap = this.b.a();
      if (localBitmap != null)
        ((BitmapFactory.Options)localObject).inBitmap = localBitmap;
      localbe.a((BitmapFactory.Options)localObject);
      localObject = a(localbe);
      if (localObject != null)
      {
        this.b.a(localbe.toString(), (Bitmap)localObject);
        AppMethodBeat.o(100114);
        paramArrayOfByte = (byte[])localObject;
      }
      else
      {
        a(localbe, paramArrayOfByte);
        paramArrayOfByte = null;
        AppMethodBeat.o(100114);
      }
    }
  }

  public void a()
  {
    AppMethodBeat.i(100116);
    this.b.b();
    this.a.a(1);
    AppMethodBeat.o(100116);
  }

  public void a(int paramInt1, int paramInt2, int paramInt3, String paramString, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(100115);
    be localbe = new be(paramInt1, paramInt2, paramInt3, 1);
    if (!a(paramString))
      AppMethodBeat.o(100115);
    while (true)
    {
      return;
      BitmapFactory.Options localOptions = c();
      Bitmap localBitmap = this.b.a();
      if (localBitmap != null)
        localOptions.inBitmap = localBitmap;
      localBitmap = BitmapFactory.decodeByteArray(paramArrayOfByte, 0, paramArrayOfByte.length, localOptions);
      if (localBitmap != null)
      {
        this.b.a(localbe.toString(), localBitmap);
        this.d.execute(new ju.1(this, paramString, paramArrayOfByte, localbe));
      }
      AppMethodBeat.o(100115);
    }
  }

  public void b()
  {
    AppMethodBeat.i(100117);
    this.b.c();
    AppMethodBeat.o(100117);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.ju
 * JD-Core Version:    0.6.2
 */