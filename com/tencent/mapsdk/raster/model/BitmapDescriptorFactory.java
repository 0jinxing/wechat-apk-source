package com.tencent.mapsdk.raster.model;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.tencentmap.mapsdk.a.j;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public final class BitmapDescriptorFactory
{
  public static BitmapDescriptor defaultMarker()
  {
    AppMethodBeat.i(101159);
    BitmapDescriptor localBitmapDescriptor = fromAsset("marker.png");
    AppMethodBeat.o(101159);
    return localBitmapDescriptor;
  }

  public static BitmapDescriptor fromAsset(String paramString)
  {
    AppMethodBeat.i(101157);
    try
    {
      InputStream localInputStream = BitmapDescriptorFactory.class.getResourceAsStream("/assets/".concat(String.valueOf(paramString)));
      paramString = BitmapFactory.decodeStream(localInputStream);
      localInputStream.close();
      paramString = fromBitmap(paramString);
      AppMethodBeat.o(101157);
      return paramString;
    }
    catch (Exception paramString)
    {
      while (true)
      {
        paramString = null;
        AppMethodBeat.o(101157);
      }
    }
  }

  public static BitmapDescriptor fromBitmap(Bitmap paramBitmap)
  {
    AppMethodBeat.i(101160);
    if (paramBitmap == null)
    {
      paramBitmap = null;
      AppMethodBeat.o(101160);
    }
    while (true)
    {
      return paramBitmap;
      paramBitmap = new BitmapDescriptor(paramBitmap);
      AppMethodBeat.o(101160);
    }
  }

  public static BitmapDescriptor fromFile(String paramString)
  {
    AppMethodBeat.i(101158);
    try
    {
      Object localObject = new java/io/File;
      ((File)localObject).<init>(paramString);
      paramString = new java/io/FileInputStream;
      paramString.<init>((File)localObject);
      localObject = BitmapFactory.decodeStream(paramString);
      paramString.close();
      paramString = fromBitmap((Bitmap)localObject);
      AppMethodBeat.o(101158);
      return paramString;
    }
    catch (Exception paramString)
    {
      while (true)
      {
        paramString = null;
        AppMethodBeat.o(101158);
      }
    }
  }

  public static BitmapDescriptor fromPath(String paramString)
  {
    AppMethodBeat.i(101156);
    try
    {
      paramString = fromBitmap(BitmapFactory.decodeFile(paramString));
      AppMethodBeat.o(101156);
      return paramString;
    }
    catch (Exception paramString)
    {
      while (true)
      {
        paramString = null;
        AppMethodBeat.o(101156);
      }
    }
  }

  // ERROR //
  public static BitmapDescriptor fromResource(int paramInt)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: ldc 91
    //   4: invokestatic 18	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   7: invokestatic 97	com/tencent/tencentmap/mapsdk/a/j:a	()Landroid/content/Context;
    //   10: astore_2
    //   11: aload_2
    //   12: ifnull +33 -> 45
    //   15: aload_2
    //   16: invokevirtual 103	android/content/Context:getResources	()Landroid/content/res/Resources;
    //   19: iload_0
    //   20: invokevirtual 109	android/content/res/Resources:openRawResource	(I)Ljava/io/InputStream;
    //   23: astore_2
    //   24: aload_2
    //   25: invokestatic 54	android/graphics/BitmapFactory:decodeStream	(Ljava/io/InputStream;)Landroid/graphics/Bitmap;
    //   28: invokestatic 63	com/tencent/mapsdk/raster/model/BitmapDescriptorFactory:fromBitmap	(Landroid/graphics/Bitmap;)Lcom/tencent/mapsdk/raster/model/BitmapDescriptor;
    //   31: astore_3
    //   32: aload_3
    //   33: astore_1
    //   34: aload_2
    //   35: invokestatic 114	com/tencent/tencentmap/mapsdk/a/k:a	(Ljava/io/Closeable;)V
    //   38: ldc 91
    //   40: invokestatic 27	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   43: aload_1
    //   44: areturn
    //   45: aconst_null
    //   46: invokestatic 114	com/tencent/tencentmap/mapsdk/a/k:a	(Ljava/io/Closeable;)V
    //   49: ldc 91
    //   51: invokestatic 27	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   54: goto -11 -> 43
    //   57: astore_2
    //   58: aconst_null
    //   59: astore_2
    //   60: aload_2
    //   61: invokestatic 114	com/tencent/tencentmap/mapsdk/a/k:a	(Ljava/io/Closeable;)V
    //   64: ldc 91
    //   66: invokestatic 27	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   69: goto -26 -> 43
    //   72: astore_1
    //   73: aconst_null
    //   74: astore_2
    //   75: aload_2
    //   76: invokestatic 114	com/tencent/tencentmap/mapsdk/a/k:a	(Ljava/io/Closeable;)V
    //   79: ldc 91
    //   81: invokestatic 27	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   84: aload_1
    //   85: athrow
    //   86: astore_1
    //   87: goto -12 -> 75
    //   90: astore_3
    //   91: goto -31 -> 60
    //
    // Exception table:
    //   from	to	target	type
    //   7	11	57	java/lang/Exception
    //   15	24	57	java/lang/Exception
    //   7	11	72	finally
    //   15	24	72	finally
    //   24	32	86	finally
    //   24	32	90	java/lang/Exception
  }

  public static BitmapDescriptor fromView(View paramView)
  {
    Object localObject = null;
    AppMethodBeat.i(101154);
    try
    {
      Context localContext = j.a();
      if (localContext != null)
      {
        FrameLayout localFrameLayout = new android/widget/FrameLayout;
        localFrameLayout.<init>(localContext);
        localFrameLayout.addView(paramView);
        localFrameLayout.destroyDrawingCache();
        paramView = fromBitmap(getViewBitmap(localFrameLayout));
        AppMethodBeat.o(101154);
      }
      while (true)
      {
        return paramView;
        AppMethodBeat.o(101154);
        paramView = localObject;
      }
    }
    catch (Exception paramView)
    {
      while (true)
      {
        AppMethodBeat.o(101154);
        paramView = localObject;
      }
    }
  }

  private static Bitmap getViewBitmap(View paramView)
  {
    AppMethodBeat.i(101155);
    paramView.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
    paramView.layout(0, 0, paramView.getMeasuredWidth(), paramView.getMeasuredHeight());
    paramView.buildDrawingCache();
    paramView = paramView.getDrawingCache().copy(Bitmap.Config.ARGB_8888, false);
    AppMethodBeat.o(101155);
    return paramView;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mapsdk.raster.model.BitmapDescriptorFactory
 * JD-Core Version:    0.6.2
 */