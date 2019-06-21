package com.tencent.mm.plugin.appbrand.jsapi.media;

import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.BitmapFactory.Options;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.Exif;
import com.tencent.mm.graphics.MMBitmapFactory;
import com.tencent.mm.plugin.appbrand.g.b;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask.ProcessRequest;
import com.tencent.mm.plugin.appbrand.r.m;
import com.tencent.mm.plugin.appbrand.s.c;
import com.tencent.mm.pluginsdk.ui.tools.n;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.d;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.p;
import com.tencent.mm.ui.base.t;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class JsApiChooseImage$a extends AppBrandProxyUIProcessTask
{
  private p ejZ;
  JsApiChooseImage.ChooseRequest hOX;
  JsApiChooseImage.ChooseResult hOY;
  int hOZ;
  private DialogInterface.OnCancelListener hPa;

  private JsApiChooseImage$a()
  {
    AppMethodBeat.i(131139);
    this.hOY = new JsApiChooseImage.ChooseResult();
    AppMethodBeat.o(131139);
  }

  private static String Bn(String paramString)
  {
    AppMethodBeat.i(131142);
    int i = Exif.fromFile(paramString).getOrientationInDegree();
    if (i != 0);
    while (true)
    {
      try
      {
        BitmapFactory.Options localOptions = new android/graphics/BitmapFactory$Options;
        localOptions.<init>();
        Object localObject1 = MMBitmapFactory.decodeFile(paramString, localOptions);
        if (localObject1 == null)
        {
          ab.e("MicroMsg.JsApiChooseImage", "rotate image, get null bmp");
          AppMethodBeat.o(131142);
          return paramString;
        }
        float f = i % 360;
        Bitmap localBitmap = d.b((Bitmap)localObject1, f);
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        Object localObject2 = ((StringBuilder)localObject1).append(com.tencent.mm.compatible.util.e.euR).append("microMsg.tmp.").append(System.currentTimeMillis());
        if (c.e(localOptions))
        {
          localObject1 = ".jpg";
          localObject2 = (String)localObject1;
          if (!c.e(localOptions))
            continue;
          localObject1 = Bitmap.CompressFormat.JPEG;
        }
        try
        {
          d.a(localBitmap, 80, (Bitmap.CompressFormat)localObject1, (String)localObject2, true);
          if (c.e(localOptions))
            b.bY(paramString, (String)localObject2);
          AppMethodBeat.o(131142);
          paramString = (String)localObject2;
          continue;
          localObject1 = ".png";
          continue;
          localObject1 = Bitmap.CompressFormat.PNG;
          continue;
        }
        catch (Exception localException)
        {
          ab.e("MicroMsg.JsApiChooseImage", "rotate image, exception occurred when saving | %s", new Object[] { localException });
          com.tencent.mm.a.e.deleteFile((String)localObject2);
          AppMethodBeat.o(131142);
        }
        continue;
      }
      catch (OutOfMemoryError localOutOfMemoryError)
      {
        AppMethodBeat.o(131142);
        continue;
      }
      catch (NullPointerException localNullPointerException)
      {
        AppMethodBeat.o(131142);
        continue;
      }
      AppMethodBeat.o(131142);
    }
  }

  private static String Bo(String paramString)
  {
    AppMethodBeat.i(131143);
    String str = com.tencent.mm.compatible.util.e.euR + "microMsg." + System.currentTimeMillis() + ".jpg";
    try
    {
      Bitmap localBitmap1 = MMBitmapFactory.decodeFile(paramString);
      if (localBitmap1 == null)
      {
        ab.e("MicroMsg.JsApiChooseImage", "doCompressImage, decode bmp return null");
        AppMethodBeat.o(131143);
        paramString = null;
        return paramString;
      }
    }
    catch (OutOfMemoryError localOutOfMemoryError1)
    {
      while (true)
      {
        ab.e("MicroMsg.JsApiChooseImage", "doCompressImage, decode bmp oom");
        try
        {
          Bitmap localBitmap2 = d.decodeFile(paramString, null);
        }
        catch (OutOfMemoryError localOutOfMemoryError2)
        {
          ab.e("MicroMsg.JsApiChooseImage", "doCompressImage, decode bmp oom retry, oom again");
          Object localObject1 = null;
        }
        catch (Exception localException1)
        {
          ab.e("MicroMsg.JsApiChooseImage", "doCompressImage, decode bmp oom retry, e ".concat(String.valueOf(localException1)));
          Object localObject2 = null;
        }
      }
    }
    catch (NullPointerException localNullPointerException)
    {
      while (true)
        try
        {
          Bitmap localBitmap3 = d.decodeFile(paramString, null);
        }
        catch (Exception localException2)
        {
          ab.e("MicroMsg.JsApiChooseImage", "doCompressImage, decode bmp npe retry, e ".concat(String.valueOf(localException2)));
          Object localObject3 = null;
        }
    }
    catch (Exception localException3)
    {
      while (true)
      {
        ab.e("MicroMsg.JsApiChooseImage", "doCompressImage, decode bmp e ".concat(String.valueOf(localException3)));
        File localFile = null;
        continue;
        localFile.recycle();
        long l1 = bo.anU();
        try
        {
          boolean bool = c.cU(str, paramString);
          long l2 = bo.anU();
          localFile = new java/io/File;
          localFile.<init>(paramString);
          long l3 = localFile.length();
          localFile = new java/io/File;
          localFile.<init>(str);
          ab.i("MicroMsg.JsApiChooseImage", "doCompressImage, ret = %b, cost = %d, %s (%d) -> %s (%d)", new Object[] { Boolean.valueOf(bool), Long.valueOf(l2 - l1), paramString, Long.valueOf(l3), str, Long.valueOf(localFile.length()) });
          if (bool)
          {
            AppMethodBeat.o(131143);
            paramString = str;
          }
          else
          {
            AppMethodBeat.o(131143);
          }
        }
        catch (OutOfMemoryError localOutOfMemoryError3)
        {
          ab.e("MicroMsg.JsApiChooseImage", "compressImage, oom");
          AppMethodBeat.o(131143);
        }
      }
    }
  }

  private void or(int paramInt)
  {
    AppMethodBeat.i(131141);
    this.hPa = new JsApiChooseImage.a.1(this);
    MMActivity localMMActivity = aBQ();
    ah.getResources().getString(2131297061);
    this.ejZ = h.b(localMMActivity, ah.getResources().getString(paramInt), true, this.hPa);
    AppMethodBeat.o(131141);
  }

  public final void a(AppBrandProxyUIProcessTask.ProcessRequest paramProcessRequest)
  {
    AppMethodBeat.i(131140);
    this.hOX = ((JsApiChooseImage.ChooseRequest)paramProcessRequest);
    this.hOX.count = Math.max(1, Math.min(9, this.hOX.count));
    int i;
    label79: boolean bool;
    if ((this.hOX.hOU & this.hOX.hOV))
    {
      i = 8;
      this.hOZ = i;
      if (bo.gO(aBQ()) <= 200L)
        break label202;
      i = 1;
      if (i == 0)
        t.makeText(aBQ(), ah.getResources().getString(2131296577), 1).show();
      aBQ().ifE = this;
      paramProcessRequest = new Intent();
      if (this.hOX.hOU)
        break label207;
      bool = true;
      label131: paramProcessRequest.putExtra("key_send_raw_image", bool);
      paramProcessRequest.putExtra("query_media_type", 1);
      if ((!this.hOX.hOS) || (!this.hOX.hOT))
        break label212;
      n.a(aBQ(), 1, this.hOX.count, this.hOZ, paramProcessRequest);
      AppMethodBeat.o(131140);
    }
    while (true)
    {
      return;
      i = 7;
      break;
      label202: i = 0;
      break label79;
      label207: bool = false;
      break label131;
      label212: if (this.hOX.hOT)
      {
        paramProcessRequest.putExtra("show_header_view", false);
        n.a(aBQ(), 1, this.hOX.count, this.hOZ, paramProcessRequest);
        AppMethodBeat.o(131140);
      }
      else if (this.hOX.hOS)
      {
        n.c(aBQ(), com.tencent.mm.compatible.util.e.euR, "microMsg." + System.currentTimeMillis() + ".jpg", 2);
        AppMethodBeat.o(131140);
      }
      else
      {
        ab.e("MicroMsg.JsApiChooseImage", "unknown scene, ignore this request");
        this.hOY.bFZ = -2;
        a(this.hOY);
        AppMethodBeat.o(131140);
      }
    }
  }

  public final void aBX()
  {
    AppMethodBeat.i(131144);
    super.aBX();
    if (this.ejZ != null)
    {
      this.ejZ.dismiss();
      this.ejZ = null;
    }
    AppMethodBeat.o(131144);
  }

  public final void c(int paramInt1, int paramInt2, Intent paramIntent)
  {
    boolean bool1 = true;
    AppMethodBeat.i(131145);
    if (paramInt2 == 0)
    {
      this.hOY.bFZ = 0;
      a(this.hOY);
      AppMethodBeat.o(131145);
    }
    while (true)
    {
      return;
      switch (paramInt1)
      {
      default:
        this.hOY.bFZ = -2;
        a(this.hOY);
        AppMethodBeat.o(131145);
        break;
      case 1:
      case 3:
        if (paramIntent == null)
        {
          this.hOY.bFZ = 0;
          a(this.hOY);
          AppMethodBeat.o(131145);
        }
        else
        {
          ArrayList localArrayList = paramIntent.getStringArrayListExtra("CropImage_OutputPath_List");
          boolean bool2 = paramIntent.getBooleanExtra("CropImage_Compress_Img", false);
          int i = this.hOX.hOU;
          boolean bool3;
          if (!this.hOX.hOV)
          {
            paramInt1 = 1;
            if (((paramInt1 & i) == 0) && (!(this.hOX.hOU & this.hOX.hOV & bool2)))
              break label392;
            i = 1;
            if ((!paramIntent.getBooleanExtra("isTakePhoto", false)) && (!paramIntent.getBooleanExtra("isPreviewPhoto", false)))
              break label398;
            bool3 = true;
            ab.d("MicroMsg.JsApiChooseImage", "onActivityResult, fromCamera = %b, canCompress = %b, canOriginal = %b, CropImageUI.KCompressImg = %b, doCompress = %b", new Object[] { Boolean.valueOf(bool3), Boolean.valueOf(this.hOX.hOU), Boolean.valueOf(this.hOX.hOV), Boolean.valueOf(bool2), Boolean.valueOf(i) });
            if (i != 0)
              or(2131296578);
            if (i != 0)
              break label409;
            if (bo.ek(localArrayList))
              break label404;
            paramIntent = localArrayList.iterator();
            while (paramIntent.hasNext())
              if (Exif.fromFile((String)paramIntent.next()).getOrientationInDegree() != 0)
              {
                paramInt1 = 1;
                if (paramInt1 == 0)
                  break label409;
              }
          }
          while (true)
          {
            if (bool1)
              or(2131296683);
            m.aNS().aa(new JsApiChooseImage.a.2(this, localArrayList, bool3, i, bool1));
            AppMethodBeat.o(131145);
            break;
            paramInt1 = 0;
            break label159;
            i = 0;
            break label190;
            bool3 = false;
            break label215;
            paramInt1 = 0;
            break label339;
            bool1 = false;
          }
        }
        break;
      case 2:
        label159: label190: label215: paramIntent = n.h(aBQ().getApplicationContext(), paramIntent, com.tencent.mm.compatible.util.e.euR);
        label339: if (bo.isNullOrNil(paramIntent))
        {
          ab.w("MicroMsg.JsApiChooseImage", "take photo, but result is null");
          this.hOY.bFZ = -2;
          a(this.hOY);
          AppMethodBeat.o(131145);
        }
        else
        {
          ab.i("MicroMsg.JsApiChooseImage", "take photo, result[%s]", new Object[] { paramIntent });
          al.d(new JsApiChooseImage.a.3(this, paramIntent));
          AppMethodBeat.o(131145);
        }
        label392: label398: label404: label409: break;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseImage.a
 * JD-Core Version:    0.6.2
 */