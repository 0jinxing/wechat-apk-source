package com.tencent.mm.plugin.webview.ui.tools;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.Color;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Base64;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.ae;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public final class g
{
  private static final HashMap<String, WeakReference<Bitmap>> usl;

  static
  {
    AppMethodBeat.i(7489);
    usl = new HashMap();
    AppMethodBeat.o(7489);
  }

  public static int Jj(int paramInt)
  {
    AppMethodBeat.i(7487);
    paramInt = ae.Jj(paramInt);
    AppMethodBeat.o(7487);
    return paramInt;
  }

  public static void a(com.tencent.mm.plugin.webview.stub.d paramd, int paramInt, List<String> paramList)
  {
    AppMethodBeat.i(7481);
    if ((paramList == null) || (paramList.size() == 0))
      AppMethodBeat.o(7481);
    while (true)
    {
      return;
      try
      {
        paramd.k(paramInt, paramList);
        AppMethodBeat.o(7481);
      }
      catch (Exception paramd)
      {
        ab.w("MicroMsg.WebView.RemoteUtil", "kvReport, ex = " + paramd.getMessage());
        AppMethodBeat.o(7481);
      }
    }
  }

  public static void a(com.tencent.mm.plugin.webview.stub.d paramd, int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(7480);
    ArrayList localArrayList = new ArrayList();
    if ((paramArrayOfObject == null) || (paramArrayOfObject.length == 0))
      AppMethodBeat.o(7480);
    while (true)
    {
      return;
      try
      {
        int i = paramArrayOfObject.length;
        for (int j = 0; j < i; j++)
          localArrayList.add(String.valueOf(paramArrayOfObject[j]));
        paramd.k(paramInt, localArrayList);
        AppMethodBeat.o(7480);
      }
      catch (Exception paramd)
      {
        ab.w("MicroMsg.WebView.RemoteUtil", "kvReport, ex = " + paramd.getMessage());
        AppMethodBeat.o(7480);
      }
    }
  }

  public static boolean a(Bundle paramBundle, String paramString1, String paramString2, com.tencent.mm.plugin.webview.stub.e parame, Runnable paramRunnable)
  {
    boolean bool = true;
    AppMethodBeat.i(7488);
    if (parame == null)
    {
      if (paramRunnable != null)
        paramRunnable.run();
      AppMethodBeat.o(7488);
    }
    while (true)
    {
      return bool;
      Bundle localBundle = new Bundle(3);
      localBundle.putBundle("open_ui_with_webview_ui_extras", paramBundle);
      localBundle.putString("open_ui_with_webview_ui_plugin_name", paramString1);
      localBundle.putString("open_ui_with_webview_ui_plugin_entry", paramString2);
      try
      {
        parame.g(101, localBundle);
        AppMethodBeat.o(7488);
      }
      catch (RemoteException paramBundle)
      {
        ab.printErrStackTrace("MicroMsg.WebView.RemoteUtil", paramBundle, "startUIWithWebViewUI, exp, pluginName %s, pluginEntry %s", new Object[] { paramString1, paramString2 });
        AppMethodBeat.o(7488);
        bool = false;
      }
      catch (Exception paramBundle)
      {
        if (paramRunnable != null)
          paramRunnable.run();
        ab.printErrStackTrace("MicroMsg.WebView.RemoteUtil", paramBundle, "startUIWithWebViewUI, exp, pluginName %s, pluginEntry %s", new Object[] { paramString1, paramString2 });
        AppMethodBeat.o(7488);
        bool = false;
      }
    }
  }

  public static Bitmap afx(String paramString)
  {
    AppMethodBeat.i(7482);
    Object localObject = (WeakReference)usl.get(paramString);
    if ((localObject != null) && (((WeakReference)localObject).get() != null) && (!((Bitmap)((WeakReference)localObject).get()).isRecycled()))
    {
      localObject = (Bitmap)((WeakReference)localObject).get();
      AppMethodBeat.o(7482);
      return localObject;
    }
    if (com.tencent.mm.vfs.e.ct(paramString));
    for (localObject = com.tencent.mm.sdk.platformtools.d.decodeFile(paramString, null); ; localObject = null)
    {
      if (localObject != null)
        usl.put(paramString, new WeakReference(localObject));
      while (true)
      {
        AppMethodBeat.o(7482);
        break;
        try
        {
          Bitmap localBitmap = BackwardSupportUtil.b.b(ah.getContext().getAssets().open("avatar/default_nor_avatar.png"), a.getDensity(null));
          localObject = localBitmap;
          HashMap localHashMap = usl;
          localObject = localBitmap;
          WeakReference localWeakReference = new java/lang/ref/WeakReference;
          localObject = localBitmap;
          localWeakReference.<init>(localBitmap);
          localObject = localBitmap;
          localHashMap.put(paramString, localWeakReference);
          localObject = localBitmap;
        }
        catch (Exception paramString)
        {
          ab.printErrStackTrace("MicroMsg.WebView.RemoteUtil", paramString, "", new Object[0]);
        }
      }
    }
  }

  public static long afy(String paramString)
  {
    AppMethodBeat.i(7483);
    long l = z(paramString, -1L);
    AppMethodBeat.o(7483);
    return l;
  }

  public static Bitmap afz(String paramString)
  {
    AppMethodBeat.i(7486);
    if (bo.isNullOrNil(paramString))
    {
      AppMethodBeat.o(7486);
      paramString = null;
    }
    while (true)
    {
      return paramString;
      Object localObject1 = (WeakReference)usl.get(paramString);
      if ((localObject1 != null) && (((WeakReference)localObject1).get() != null) && (!((Bitmap)((WeakReference)localObject1).get()).isRecycled()))
      {
        paramString = (Bitmap)((WeakReference)localObject1).get();
        AppMethodBeat.o(7486);
      }
      else
      {
        localObject1 = Base64.decode(paramString, 0);
        if (localObject1 == null)
        {
          AppMethodBeat.o(7486);
          paramString = null;
        }
        else
        {
          Object localObject2 = new BitmapFactory.Options();
          ((BitmapFactory.Options)localObject2).inJustDecodeBounds = true;
          BitmapFactory.decodeByteArray((byte[])localObject1, 0, localObject1.length, (BitmapFactory.Options)localObject2);
          int i = ((BitmapFactory.Options)localObject2).outWidth;
          int j = ((BitmapFactory.Options)localObject2).outHeight;
          int k = Math.min(((BitmapFactory.Options)localObject2).outWidth, ((BitmapFactory.Options)localObject2).outHeight);
          ((BitmapFactory.Options)localObject2).inJustDecodeBounds = false;
          if (k > 96)
          {
            ((BitmapFactory.Options)localObject2).inSampleSize = Math.max((int)(k * 1.0F / 96.0F), 1);
            localObject1 = BitmapFactory.decodeByteArray((byte[])localObject1, 0, localObject1.length, (BitmapFactory.Options)localObject2);
            if (localObject1 == null)
            {
              AppMethodBeat.o(7486);
              paramString = null;
            }
            else
            {
              i = ((Bitmap)localObject1).getWidth();
              j = ((Bitmap)localObject1).getHeight();
              k = Math.min(i, j);
            }
          }
          else
          {
            do
            {
              localObject2 = Bitmap.createBitmap((Bitmap)localObject1, Math.max(i / 2 - k / 2, 0), Math.max(j / 2 - k / 2, 0), k, k);
              if (localObject2 != localObject1)
                ((Bitmap)localObject1).recycle();
              localObject1 = Bitmap.createScaledBitmap((Bitmap)localObject2, 96, 96, false);
              if (localObject2 != localObject1)
              {
                ab.i("MicroMsg.WebView.RemoteUtil", "bitmap recycle %s", new Object[] { localObject2.toString() });
                ((Bitmap)localObject2).recycle();
              }
              if ((localObject1 != null) && (!((Bitmap)localObject1).isRecycled()))
                usl.put(paramString, new WeakReference(localObject1));
              AppMethodBeat.o(7486);
              paramString = (String)localObject1;
              break;
              localObject2 = BitmapFactory.decodeByteArray((byte[])localObject1, 0, localObject1.length, (BitmapFactory.Options)localObject2);
              localObject1 = localObject2;
            }
            while (localObject2 != null);
            AppMethodBeat.o(7486);
            paramString = null;
          }
        }
      }
    }
  }

  public static int bx(String paramString, int paramInt)
  {
    AppMethodBeat.i(7484);
    paramInt = (int)z(paramString, paramInt);
    AppMethodBeat.o(7484);
    return paramInt;
  }

  private static long z(String paramString, long paramLong)
  {
    AppMethodBeat.i(7485);
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(7485);
    while (true)
    {
      return paramLong;
      Object localObject = paramString;
      if (paramString.startsWith("#"))
      {
        localObject = paramString;
        if (paramString.length() == 4)
        {
          localObject = new StringBuilder(paramString);
          ((StringBuilder)localObject).insert(2, paramString.charAt(1));
          ((StringBuilder)localObject).insert(4, paramString.charAt(2));
          ((StringBuilder)localObject).insert(6, paramString.charAt(3));
          localObject = ((StringBuilder)localObject).toString();
        }
      }
      try
      {
        int i = Color.parseColor((String)localObject);
        paramLong = 0xFFFFFFFF & i;
        AppMethodBeat.o(7485);
      }
      catch (Exception paramString)
      {
        ab.e("MicroMsg.WebView.RemoteUtil", "Failed to parse color: %s", new Object[] { localObject });
        AppMethodBeat.o(7485);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.g
 * JD-Core Version:    0.6.2
 */