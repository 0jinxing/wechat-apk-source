package com.tencent.mm.plugin.ipcall.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Looper;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.az;
import com.tencent.mm.sdk.platformtools.bo;
import java.lang.ref.WeakReference;

public final class d
{
  Context context;
  ae<String, WeakReference<Bitmap>> exy;
  private ak fbD;
  az nAP;

  public d(Context paramContext)
  {
    AppMethodBeat.i(22021);
    this.exy = new ae(50);
    this.fbD = new ak(Looper.getMainLooper());
    this.nAP = new az(5, "IPCallAddressAvatarLoader", 1, Looper.getMainLooper());
    this.context = paramContext;
    AppMethodBeat.o(22021);
  }

  private static String Pd(String paramString)
  {
    AppMethodBeat.i(22029);
    paramString = paramString + "@username";
    AppMethodBeat.o(22029);
    return paramString;
  }

  private static String Pe(String paramString)
  {
    AppMethodBeat.i(22030);
    paramString = paramString + "@contactId";
    AppMethodBeat.o(22030);
    return paramString;
  }

  private boolean b(String paramString1, String paramString2, ImageView paramImageView)
  {
    AppMethodBeat.i(22027);
    boolean bool = g(eM(paramString1, paramString2), paramImageView);
    AppMethodBeat.o(22027);
    return bool;
  }

  private boolean d(String paramString, ImageView paramImageView)
  {
    AppMethodBeat.i(22024);
    boolean bool = g(Pe(paramString), paramImageView);
    AppMethodBeat.o(22024);
    return bool;
  }

  public static String eM(String paramString1, String paramString2)
  {
    AppMethodBeat.i(22031);
    paramString1 = paramString1 + "@" + paramString2 + "@contactId@username";
    AppMethodBeat.o(22031);
    return paramString1;
  }

  private boolean f(String paramString, ImageView paramImageView)
  {
    AppMethodBeat.i(22026);
    boolean bool = g(Pd(paramString), paramImageView);
    AppMethodBeat.o(22026);
    return bool;
  }

  private boolean g(String paramString, ImageView paramImageView)
  {
    AppMethodBeat.i(22028);
    Object localObject = (WeakReference)this.exy.get(paramString);
    boolean bool;
    if (localObject != null)
    {
      localObject = (Bitmap)((WeakReference)localObject).get();
      if ((localObject != null) && (paramImageView.getTag() != null) && (paramImageView.getTag().toString().equals(paramString)))
      {
        if ((localObject != null) && (!((Bitmap)localObject).isRecycled()))
          paramImageView.setImageBitmap((Bitmap)localObject);
        bool = true;
        AppMethodBeat.o(22028);
      }
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(22028);
    }
  }

  public final void a(String paramString1, String paramString2, ImageView paramImageView)
  {
    AppMethodBeat.i(22022);
    if ((bo.isNullOrNil(paramString1)) || (bo.isNullOrNil(paramString2)) || (paramImageView == null))
      AppMethodBeat.o(22022);
    while (true)
    {
      return;
      String str = eM(paramString1, paramString2);
      paramImageView.setTag(str);
      if (!b(paramString1, paramString2, paramImageView))
        this.nAP.e(new d.1(this, paramString1, str, paramImageView, paramString2));
      AppMethodBeat.o(22022);
    }
  }

  public final void c(String paramString, ImageView paramImageView)
  {
    AppMethodBeat.i(22023);
    if ((bo.isNullOrNil(paramString)) || (paramImageView == null))
      AppMethodBeat.o(22023);
    while (true)
    {
      return;
      String str = Pe(paramString);
      paramImageView.setTag(str);
      if (!d(paramString, paramImageView))
        this.nAP.e(new d.3(this, paramString, paramImageView, str));
      AppMethodBeat.o(22023);
    }
  }

  public final void e(String paramString, ImageView paramImageView)
  {
    AppMethodBeat.i(22025);
    if ((bo.isNullOrNil(paramString)) || (paramImageView == null))
      AppMethodBeat.o(22025);
    while (true)
    {
      return;
      String str = Pd(paramString);
      paramImageView.setTag(str);
      if (!f(paramString, paramImageView))
        this.nAP.e(new d.4(this, paramString, paramImageView, str));
      AppMethodBeat.o(22025);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.ui.d
 * JD-Core Version:    0.6.2
 */