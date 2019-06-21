package com.tencent.mm.svg.a;

import android.annotation.TargetApi;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Picture;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.svg.WeChatSVG;
import com.tencent.mm.svg.b.b;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.http.util.EncodingUtils;

public final class a
{
  private static String ycM;
  protected static int ycN;
  private static String ycO;
  private static Map<Integer, com.tencent.mm.svg.c> ycP;
  private static Map<Integer, Picture> ycQ;
  private static Map<String, Picture> ycR;
  private static Float ycS;
  private TypedValue ycK;
  private byte[] ycL;

  static
  {
    AppMethodBeat.i(70088);
    ycM = ".svg.code.drawable";
    ycN = 3;
    ycO = "";
    ycP = new ConcurrentHashMap();
    ycQ = new ConcurrentHashMap();
    ycR = new ConcurrentHashMap();
    AppMethodBeat.o(70088);
  }

  public a()
  {
    AppMethodBeat.i(70074);
    this.ycK = new TypedValue();
    this.ycL = new byte[0];
    AppMethodBeat.o(70074);
  }

  private static Picture a(float paramFloat1, com.tencent.mm.svg.c paramc, float paramFloat2)
  {
    AppMethodBeat.i(70087);
    Picture localPicture = new Picture();
    if (paramc == null)
    {
      com.tencent.mm.svg.b.c.e("MicroMsg.SVGCompat", "fromCodeToPicture code is null!", new Object[0]);
      AppMethodBeat.o(70087);
    }
    while (true)
    {
      return localPicture;
      paramFloat1 = bm(paramFloat1) * paramFloat2;
      float f = com.tencent.mm.svg.c.a(paramc);
      paramFloat2 = com.tencent.mm.svg.c.b(paramc);
      Canvas localCanvas = localPicture.beginRecording((int)(f * paramFloat1), (int)(paramFloat2 * paramFloat1));
      localCanvas.save();
      localCanvas.scale(paramFloat1, paramFloat1);
      com.tencent.mm.svg.c.a(paramc, localCanvas, Looper.myLooper());
      localCanvas.restore();
      localPicture.endRecording();
      AppMethodBeat.o(70087);
    }
  }

  private static Drawable a(Resources paramResources, int paramInt, float paramFloat)
  {
    AppMethodBeat.i(70077);
    if (paramInt == 0)
    {
      com.tencent.mm.svg.b.c.e("MicroMsg.SVGCompat", "getSVGDrawable a invalid resource!!! %s", new Object[] { Integer.valueOf(paramInt) });
      com.tencent.mm.svg.b.c.e("MicroMsg.SVGCompat", "Why no log??", new Object[0]);
      com.tencent.mm.svg.b.c.e("MicroMsg.SVGCompat", "The stack : %s", new Object[] { doR() });
      paramResources = new c(new Picture(), paramInt);
      AppMethodBeat.o(70077);
    }
    while (true)
    {
      return paramResources;
      if (b.dvK())
      {
        paramResources = c(paramResources, paramInt, paramFloat);
        AppMethodBeat.o(70077);
      }
      else
      {
        paramResources = a(paramResources, paramInt, ycO + ycM, paramFloat);
        AppMethodBeat.o(70077);
      }
    }
  }

  private static Drawable a(Resources paramResources, int paramInt, String paramString, float paramFloat)
  {
    AppMethodBeat.i(70085);
    float f1 = paramResources.getDisplayMetrics().density;
    float f2;
    Picture localPicture1;
    Picture localPicture2;
    if (paramFloat > 0.0F)
    {
      f2 = paramFloat;
      if (paramFloat <= 0.0F)
        break label130;
      String str = paramInt + "_scale_" + paramFloat;
      localPicture1 = (Picture)ycR.get(str);
      localPicture2 = localPicture1;
      if (localPicture1 == null)
      {
        localPicture2 = a(f1, a(paramResources, paramInt, paramString), f2);
        ycR.put(str, localPicture2);
      }
    }
    for (paramResources = new c(localPicture2, paramInt); ; paramResources = new c(localPicture2, paramInt))
    {
      AppMethodBeat.o(70085);
      return paramResources;
      f2 = 1.0F;
      break;
      label130: localPicture1 = (Picture)ycQ.get(Integer.valueOf(paramInt));
      localPicture2 = localPicture1;
      if (localPicture1 == null)
      {
        localPicture2 = a(f1, a(paramResources, paramInt, paramString), f2);
        ycQ.put(Integer.valueOf(paramInt), localPicture2);
      }
    }
  }

  private static com.tencent.mm.svg.c a(Resources paramResources, int paramInt, String paramString)
  {
    AppMethodBeat.i(70086);
    String str = "";
    Object localObject1 = str;
    Object localObject2 = str;
    Object localObject3 = str;
    try
    {
      if (ycP.containsKey(Integer.valueOf(paramInt)))
      {
        localObject1 = str;
        localObject2 = str;
        localObject3 = str;
      }
      for (paramResources = (com.tencent.mm.svg.c)ycP.get(Integer.valueOf(paramInt)); ; paramResources = paramString)
      {
        AppMethodBeat.o(70086);
        while (true)
        {
          return paramResources;
          localObject1 = str;
          localObject2 = str;
          localObject3 = str;
          paramResources = paramResources.getResourceName(paramInt);
          if (paramResources != null)
            break;
          localObject1 = str;
          localObject2 = str;
          localObject3 = str;
          com.tencent.mm.svg.b.c.e("MicroMsg.SVGCompat", "Get SVGCodeDrawable failed. Reason : resource not found", new Object[0]);
          AppMethodBeat.o(70086);
          paramResources = null;
        }
        localObject1 = str;
        localObject2 = str;
        localObject3 = str;
        int i = paramResources.indexOf("/");
        if (i <= 0)
          break;
        localObject1 = str;
        localObject2 = str;
        localObject3 = str;
        localStringBuilder = new java/lang/StringBuilder;
        localObject1 = str;
        localObject2 = str;
        localObject3 = str;
        localStringBuilder.<init>();
        localObject1 = str;
        localObject2 = str;
        localObject3 = str;
        paramResources = paramString + "." + paramResources.substring(i + 1);
        localObject1 = paramResources;
        localObject2 = paramResources;
        localObject3 = paramResources;
        paramString = (com.tencent.mm.svg.c)Class.forName(paramResources).newInstance();
        localObject1 = paramResources;
        localObject2 = paramResources;
        localObject3 = paramResources;
        ycP.put(Integer.valueOf(paramInt), paramString);
      }
    }
    catch (ClassNotFoundException paramResources)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.SVGCompat", paramResources, "", new Object[0]);
        com.tencent.mm.svg.b.c.e("MicroMsg.SVGCompat", "Get SVGCodeDrawable failed. Reason : ClassNotFoundException %s", new Object[] { localObject1 });
        AppMethodBeat.o(70086);
        paramResources = null;
        continue;
        localObject1 = str;
        localObject2 = str;
        localObject3 = str;
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localObject1 = str;
        localObject2 = str;
        localObject3 = str;
        localStringBuilder.<init>();
        localObject1 = str;
        localObject2 = str;
        localObject3 = str;
        paramResources = paramString + "." + paramResources;
      }
    }
    catch (InstantiationException paramResources)
    {
      while (true)
      {
        com.tencent.mm.svg.b.c.e("MicroMsg.SVGCompat", "Get SVGCodeDrawable failed. Reason : InstantiationException %s", new Object[] { localObject2 });
        ab.printErrStackTrace("MicroMsg.SVGCompat", paramResources, "", new Object[0]);
        AppMethodBeat.o(70086);
        paramResources = null;
      }
    }
    catch (IllegalAccessException paramResources)
    {
      while (true)
      {
        com.tencent.mm.svg.b.c.e("MicroMsg.SVGCompat", "Get SVGCodeDrawable failed. Reason : IllegalAccessException %s", new Object[] { localObject3 });
        ab.printErrStackTrace("MicroMsg.SVGCompat", paramResources, "", new Object[0]);
        AppMethodBeat.o(70086);
        paramResources = null;
      }
    }
  }

  public static Bitmap b(Resources paramResources, int paramInt, float paramFloat)
  {
    AppMethodBeat.i(70078);
    Drawable localDrawable = a(paramResources, paramInt, paramFloat);
    if (localDrawable == null)
    {
      paramResources = null;
      AppMethodBeat.o(70078);
    }
    while (true)
    {
      return paramResources;
      paramResources = Bitmap.createBitmap(localDrawable.getIntrinsicWidth(), localDrawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
      localDrawable.draw(new Canvas(paramResources));
      AppMethodBeat.o(70078);
    }
  }

  protected static boolean b(View paramView, Paint paramPaint)
  {
    AppMethodBeat.i(70080);
    boolean bool;
    if (Build.VERSION.SDK_INT > 10)
    {
      bool = c(paramView, paramPaint);
      AppMethodBeat.o(70080);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(70080);
    }
  }

  private static float bm(float paramFloat)
  {
    AppMethodBeat.i(70084);
    if (ycS == null)
      ycS = Float.valueOf(paramFloat / ycN);
    paramFloat = ycS.floatValue();
    AppMethodBeat.o(70084);
    return paramFloat;
  }

  private static Drawable c(Resources paramResources, int paramInt, float paramFloat)
  {
    AppMethodBeat.i(70083);
    com.tencent.mm.svg.b.c.d("MicroMsg.SVGCompat", "Using wechat svg library.", new Object[0]);
    InputStream localInputStream = paramResources.openRawResource(paramInt);
    try
    {
      byte[] arrayOfByte = new byte[localInputStream.available()];
      localInputStream.read(arrayOfByte);
      if (localInputStream != null);
      try
      {
        localInputStream.close();
        l = WeChatSVG.parse(EncodingUtils.getString(arrayOfByte, "UTF-8").toString());
        if (l == 0L)
        {
          com.tencent.mm.svg.b.c.e("MicroMsg.SVGCompat", "Parse SVG failed.", new Object[0]);
          AppMethodBeat.o(70083);
          paramResources = null;
          return paramResources;
        }
      }
      catch (IOException localIOException1)
      {
        while (true)
          ab.printErrStackTrace("MicroMsg.SVGCompat", localIOException1, "", new Object[0]);
      }
    }
    catch (IOException paramResources)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.SVGCompat", paramResources, "", new Object[0]);
        com.tencent.mm.svg.b.c.e("MicroMsg.SVGCompat", "Get SVGPictureDrawable failed. Reason : IOException", new Object[0]);
        if (localIOException1 != null);
        try
        {
          localIOException1.close();
          AppMethodBeat.o(70083);
          paramResources = null;
        }
        catch (IOException paramResources)
        {
          while (true)
            ab.printErrStackTrace("MicroMsg.SVGCompat", paramResources, "", new Object[0]);
        }
      }
    }
    finally
    {
      while (true)
      {
        long l;
        if (localIOException1 != null);
        try
        {
          localIOException1.close();
          AppMethodBeat.o(70083);
          throw paramResources;
        }
        catch (IOException localIOException2)
        {
          while (true)
            ab.printErrStackTrace("MicroMsg.SVGCompat", localIOException2, "", new Object[0]);
        }
        float[] arrayOfFloat = WeChatSVG.getViewPort(l);
        float f1 = paramResources.getDisplayMetrics().density;
        float f2 = arrayOfFloat[0] / ycN;
        float f3;
        if (paramFloat > 0.0F)
        {
          f3 = paramFloat;
          label235: f3 *= f2 * f1;
          f2 = arrayOfFloat[1] / ycN;
          if (paramFloat <= 0.0F)
            break label361;
        }
        while (true)
        {
          paramFloat = f2 * f1 * paramFloat;
          paramResources = new Picture();
          int i = WeChatSVG.renderViewPort(l, paramResources.beginRecording((int)f3, (int)paramFloat), (int)f3, (int)paramFloat);
          paramResources.endRecording();
          WeChatSVG.release(l);
          paramResources = new c(paramResources, paramInt);
          if (i >= 0)
            break label366;
          com.tencent.mm.svg.b.c.e("MicroMsg.SVGCompat", "Render SVG failed. Reason : %s", new Object[] { Integer.valueOf(i) });
          AppMethodBeat.o(70083);
          paramResources = null;
          break;
          f3 = 1.0F;
          break label235;
          label361: paramFloat = 1.0F;
        }
        label366: AppMethodBeat.o(70083);
      }
    }
  }

  @TargetApi(11)
  private static boolean c(View paramView, Paint paramPaint)
  {
    boolean bool = true;
    AppMethodBeat.i(70081);
    if (paramView != null);
    while (true)
    {
      try
      {
        if (paramView.getLayerType() != 1)
          paramView.setLayerType(1, paramPaint);
        if (paramView.willNotCacheDrawing())
        {
          paramView.setWillNotCacheDrawing(false);
          if (paramView.getWindowToken() != null)
            paramView.buildLayer();
        }
        AppMethodBeat.o(70081);
        return bool;
      }
      catch (NullPointerException paramPaint)
      {
        ab.printErrStackTrace("MicroMsg.SVGCompat", paramPaint, "", new Object[0]);
        continue;
      }
      AppMethodBeat.o(70081);
      bool = false;
    }
  }

  public static void cY(String paramString)
  {
    ycO = paramString;
  }

  private static String doR()
  {
    AppMethodBeat.i(70076);
    Object localObject = new Throwable().getStackTrace();
    if ((localObject == null) || (localObject.length < 4))
    {
      localObject = "";
      AppMethodBeat.o(70076);
    }
    while (true)
    {
      return localObject;
      StringBuilder localStringBuilder = new StringBuilder();
      for (int i = 3; i < localObject.length; i++)
        if ((localObject[i].getClassName().contains("com.tencent.mm")) && (!localObject[i].getClassName().contains("sdk.platformtools.Log")))
        {
          localStringBuilder.append("[");
          localStringBuilder.append(localObject[i].getClassName().substring(15));
          localStringBuilder.append(":");
          localStringBuilder.append(localObject[i].getMethodName());
          localStringBuilder.append("(" + localObject[i].getLineNumber() + ")]");
        }
      localObject = localStringBuilder.toString();
      AppMethodBeat.o(70076);
    }
  }

  public static Map<Integer, com.tencent.mm.svg.c> dvD()
  {
    return ycP;
  }

  public static Drawable f(Resources paramResources, int paramInt)
  {
    AppMethodBeat.i(70075);
    paramResources = a(paramResources, paramInt, 0.0F);
    AppMethodBeat.o(70075);
    return paramResources;
  }

  protected static View w(Drawable paramDrawable)
  {
    AppMethodBeat.i(70082);
    paramDrawable = paramDrawable.getCallback();
    if (paramDrawable != null)
      if ((paramDrawable instanceof View))
      {
        paramDrawable = (View)paramDrawable;
        AppMethodBeat.o(70082);
      }
    while (true)
    {
      return paramDrawable;
      if ((paramDrawable instanceof Drawable))
      {
        paramDrawable = (Drawable)paramDrawable;
        break;
      }
      paramDrawable = null;
      AppMethodBeat.o(70082);
    }
  }

  public final boolean g(Resources paramResources, int paramInt)
  {
    boolean bool = true;
    AppMethodBeat.i(70079);
    while (true)
    {
      try
      {
        localObject = paramResources.getResourceTypeName(paramInt);
        if (!((String)localObject).equals("raw"));
      }
      catch (Resources.NotFoundException paramResources)
      {
        synchronized (this.ycL)
        {
          TypedValue localTypedValue = this.ycK;
          Object localObject = localTypedValue;
          if (localTypedValue == null)
          {
            localObject = new android/util/TypedValue;
            ((TypedValue)localObject).<init>();
            this.ycK = ((TypedValue)localObject);
          }
          paramResources.getValue(paramInt, (TypedValue)localObject, true);
          paramResources = ((TypedValue)localObject).string.toString();
          if (paramResources.endsWith(".svg"))
          {
            AppMethodBeat.o(70079);
            return bool;
            paramResources = paramResources;
            com.tencent.mm.svg.b.c.printErrStackTrace("MicroMsg.SVGCompat", paramResources, "resource not found", new Object[0]);
            AppMethodBeat.o(70079);
            bool = false;
          }
        }
      }
      AppMethodBeat.o(70079);
      bool = false;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.svg.a.a
 * JD-Core Version:    0.6.2
 */