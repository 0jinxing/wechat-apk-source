package com.tencent.mm.plugin.gif;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.AppCompatImageView;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.ih;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.r;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;

public class MMAnimateView extends AppCompatImageView
{
  private String kRZ;
  private float mDensity;
  private int nox;
  private int noy;
  private boolean noz;

  public MMAnimateView(Context paramContext)
  {
    this(paramContext, null);
  }

  public MMAnimateView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, -1);
  }

  public MMAnimateView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(62358);
    this.nox = 2130838562;
    this.noy = 2130838177;
    this.noz = true;
    this.mDensity = 0.0F;
    if (com.tencent.mm.compatible.util.d.iW(26))
      setLayerType(1, null);
    AppMethodBeat.o(62358);
  }

  private void a(Resources paramResources, int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(62366);
    try
    {
      if (!bo.isNullOrNil(null))
        setCacheKey(null);
      for (paramResources = c.bFN().b(paramResources, paramInt); paramBoolean; paramResources = new d(paramResources, paramInt))
      {
        setImageDrawable(paramResources);
        AppMethodBeat.o(62366);
        return;
      }
    }
    catch (IOException paramResources)
    {
      while (true)
      {
        ab.e("MicroMsg.GIF.MMGIFImageView", "setMMGIFResource failed. %s" + paramResources.toString());
        if (paramBoolean)
        {
          super.setImageResource(paramInt);
          AppMethodBeat.o(62366);
          continue;
          setBackgroundDrawable(paramResources);
          AppMethodBeat.o(62366);
        }
        else
        {
          super.setBackgroundResource(paramInt);
          AppMethodBeat.o(62366);
        }
      }
    }
  }

  public static void a(MMGIFException paramMMGIFException)
  {
    AppMethodBeat.i(62378);
    ih localih = new ih();
    localih.cDr.errorCode = paramMMGIFException.getErrorCode();
    com.tencent.mm.sdk.b.a.xxA.m(localih);
    AppMethodBeat.o(62378);
  }

  private void eF(String paramString1, String paramString2)
  {
    AppMethodBeat.i(62368);
    try
    {
      if (r.amp(paramString1))
      {
        paramString2 = new com/tencent/mm/plugin/gif/h;
        paramString2.<init>(com.tencent.mm.vfs.e.e(paramString1, 0, -1));
        paramString2.start();
        setImageDrawable(paramString2);
        AppMethodBeat.o(62368);
        return;
      }
      if (!bo.isNullOrNil(paramString2))
        setCacheKey(paramString2);
      for (paramString2 = c.bFN().eD(getCacheKey(), paramString1); ; paramString2 = new d(paramString1))
      {
        setImageDrawable(paramString2);
        AppMethodBeat.o(62368);
        break;
      }
    }
    catch (MMGIFException paramString2)
    {
      while (true)
        try
        {
          a(paramString2);
          int i = paramString2.getErrorCode();
          if (i == 103)
          {
            try
            {
              paramString2 = com.tencent.mm.sdk.platformtools.d.decodeFile(paramString1, null);
              if (paramString2 == null)
                continue;
              paramString2.setDensity(getEmojiDensity());
              setImageBitmap(paramString2);
              AppMethodBeat.o(62368);
            }
            catch (OutOfMemoryError paramString2)
            {
              ab.printErrStackTrace("MicroMsg.GIF.MMGIFImageView", paramString2, "setMMGIFFilePath failed, oom happened. show default. path %s", new Object[] { paramString1 });
              init();
            }
          }
          else
          {
            AppMethodBeat.o(62368);
            continue;
            ab.w("MicroMsg.GIF.MMGIFImageView", "setMMGIFFilePath failedbitmap is null. show default and delete file. path %s", new Object[] { paramString1 });
            init();
            com.tencent.mm.vfs.e.deleteFile(paramString1);
            AppMethodBeat.o(62368);
          }
        }
        catch (Exception paramString1)
        {
          ab.e("MicroMsg.GIF.MMGIFImageView", "setMMGIFFilePath failed1. %s", new Object[] { bo.l(paramString1) });
          AppMethodBeat.o(62368);
        }
    }
    catch (IOException paramString2)
    {
      while (true)
      {
        ab.e("MicroMsg.GIF.MMGIFImageView", "setMMGIFFilePath failed3. %s", new Object[] { bo.l(paramString2) });
        com.tencent.mm.vfs.e.deleteFile(paramString1);
        init();
        AppMethodBeat.o(62368);
      }
    }
    catch (NullPointerException paramString1)
    {
      while (true)
      {
        init();
        AppMethodBeat.o(62368);
      }
    }
  }

  public final void a(String paramString, k paramk)
  {
    AppMethodBeat.i(62367);
    try
    {
      localObject = new com/tencent/mm/plugin/gif/d;
      ((d)localObject).<init>(paramString);
      setImageDrawable((Drawable)localObject);
      ((d)localObject).noS = 2147483647;
      ((d)localObject).noU = paramk;
      AppMethodBeat.o(62367);
      return;
    }
    catch (MMGIFException paramk)
    {
      while (true)
      {
        try
        {
          Object localObject;
          a(paramk);
          if (paramk.getErrorCode() == 103)
          {
            localObject = com.tencent.mm.sdk.platformtools.d.decodeStream(com.tencent.mm.vfs.e.openRead(paramString));
            if (localObject == null)
              break label146;
            ((Bitmap)localObject).setDensity(getEmojiDensity());
            setImageBitmap((Bitmap)localObject);
            AppMethodBeat.o(62367);
          }
        }
        catch (FileNotFoundException paramString)
        {
          ab.e("MicroMsg.GIF.MMGIFImageView", "setMMGIFFilePath failed. %s" + paramString.toString());
          ab.e("MicroMsg.GIF.MMGIFImageView", "setMMGIFFilePath failed. %s" + paramk.toString());
        }
        init();
        AppMethodBeat.o(62367);
        continue;
        ab.w("MicroMsg.GIF.MMGIFImageView", "setMMGIFFilePath failed bitmap is null. show default and delete file. path:%s", new Object[] { paramString });
        init();
        com.tencent.mm.vfs.e.deleteFile(paramString);
        AppMethodBeat.o(62367);
      }
    }
    catch (IOException paramString)
    {
      while (true)
        label146: ab.e("MicroMsg.GIF.MMGIFImageView", "setMMGIFFilePath failed. %s" + paramString.toString());
    }
  }

  public final void a(boolean paramBoolean1, boolean paramBoolean2, int paramInt, int[] paramArrayOfInt, String paramString1, String paramString2)
  {
    AppMethodBeat.i(62365);
    c localc;
    Context localContext;
    Object localObject;
    if (!bo.isNullOrNil(paramString2))
    {
      setCacheKey(paramString2);
      localc = c.bFN();
      localContext = getContext();
      if (TextUtils.isEmpty(paramString1))
      {
        localObject = null;
        if (localObject == null)
          break label217;
        ((e)localObject).npj = paramBoolean2;
        if (paramBoolean1 == ((e)localObject).mIsPlaying)
        {
          ((e)localObject).start();
          label67: setImageDrawable((Drawable)localObject);
          AppMethodBeat.o(62365);
        }
      }
      else
      {
        label79: if ((localc.nou.get(paramString2) == null) || (((WeakReference)localc.nou.get(paramString2)).get() == null))
          break label274;
      }
    }
    label274: for (e locale = (e)((WeakReference)localc.nou.get(paramString2)).get(); ; locale = null)
    {
      localObject = locale;
      if (locale != null)
        break;
      localObject = new e(localContext, paramBoolean1, paramBoolean2, paramInt, paramArrayOfInt, paramString1);
      localc.nou.put(paramString2, new WeakReference(localObject));
      break;
      ((e)localObject).lfO = 0;
      ((e)localObject).npl = 0;
      ((e)localObject).mIsPlaying = true;
      ((e)localObject).start();
      break label67;
      label217: ab.e("MicroMsg.GIF.MMGIFImageView", "can not get drawable.");
      AppMethodBeat.o(62365);
      break label79;
      paramArrayOfInt = new e(getContext(), paramBoolean1, paramBoolean2, paramInt, paramArrayOfInt, paramString1);
      paramArrayOfInt.start();
      setImageDrawable(paramArrayOfInt);
      AppMethodBeat.o(62365);
      break label79;
    }
  }

  public final void b(InputStream paramInputStream, String paramString)
  {
    com.tencent.mm.a.f localf = null;
    Object localObject = null;
    AppMethodBeat.i(62363);
    try
    {
      if (!bo.isNullOrNil(paramString))
      {
        setCacheKey(paramString);
        c localc = c.bFN();
        String str = getCacheKey();
        if (paramInputStream == null)
          paramString = (String)localObject;
        while (true)
        {
          setImageDrawable(paramString);
          AppMethodBeat.o(62363);
          return;
          ab.d("MicroMsg.GIF.MMAnimateDrawableCacheMgr", "stream key:%s", new Object[] { str });
          localObject = localf;
          if (localc.nov.get(str) != null)
            localObject = (b)((WeakReference)localc.nov.get(str)).get();
          paramString = (String)localObject;
          if (localObject == null)
          {
            paramString = new com/tencent/mm/plugin/gif/d;
            paramString.<init>(paramInputStream);
            localf = localc.nov;
            localObject = new java/lang/ref/WeakReference;
            ((WeakReference)localObject).<init>(paramString);
            localf.put(str, localObject);
          }
        }
      }
    }
    catch (MMGIFException paramString)
    {
      while (true)
      {
        a(paramString);
        if (paramString.getErrorCode() != 103)
          break label271;
        paramInputStream = com.tencent.mm.sdk.platformtools.d.decodeStream(paramInputStream);
        if (paramInputStream == null)
          break;
        paramInputStream.setDensity(getEmojiDensity());
        setImageBitmap(paramInputStream);
        AppMethodBeat.o(62363);
        continue;
        paramString = new d(paramInputStream);
      }
    }
    catch (IOException paramInputStream)
    {
      ab.e("MicroMsg.GIF.MMGIFImageView", "setMMGIFFileInputStream failed. %s", new Object[] { paramInputStream.toString() });
    }
    while (true)
    {
      init();
      AppMethodBeat.o(62363);
      break;
      ab.w("MicroMsg.GIF.MMGIFImageView", "setMMGIFFileInputStream failedbitmap is null. bytes %s");
      init();
      AppMethodBeat.o(62363);
      break;
      label271: ab.e("MicroMsg.GIF.MMGIFImageView", "setMMGIFFileInputStream failed. %s", new Object[] { paramString.toString() });
    }
  }

  public final void eE(String paramString1, String paramString2)
  {
    AppMethodBeat.i(62362);
    eF(paramString1, paramString2);
    AppMethodBeat.o(62362);
  }

  public final void f(byte[] paramArrayOfByte, String paramString)
  {
    AppMethodBeat.i(62369);
    if (paramArrayOfByte == null);
    try
    {
      ab.e("MicroMsg.GIF.MMGIFImageView", "[setMMGIFFileByteArray] bytes is null! src:%s cacheKey:%s", new Object[] { Boolean.TRUE, paramString });
      AppMethodBeat.o(62369);
      return;
      if (!bo.isNullOrNil(paramString))
      {
        setCacheKey(paramString);
        paramString = c.bFN().x(getCacheKey(), paramArrayOfByte);
      }
      while (true)
      {
        setImageDrawable(paramString);
        AppMethodBeat.o(62369);
        break;
        if (!r.bU(paramArrayOfByte))
          break label145;
        paramString = new com/tencent/mm/plugin/gif/h;
        paramString.<init>(paramArrayOfByte);
        paramString.start();
      }
    }
    catch (MMGIFException paramString)
    {
      while (true)
      {
        a(paramString);
        if (paramString.getErrorCode() != 103)
          break label222;
        paramString = com.tencent.mm.sdk.platformtools.d.bQ(paramArrayOfByte);
        if (paramString == null)
          break;
        paramString.setDensity(getEmojiDensity());
        setImageBitmap(paramString);
        AppMethodBeat.o(62369);
        continue;
        paramString = new d(paramArrayOfByte);
      }
    }
    catch (IOException paramArrayOfByte)
    {
      label145: ab.e("MicroMsg.GIF.MMGIFImageView", "setMMGIFFileByteArray failed. %s", new Object[] { paramArrayOfByte.toString() });
    }
    while (true)
    {
      init();
      AppMethodBeat.o(62369);
      break;
      ab.w("MicroMsg.GIF.MMGIFImageView", "setMMGIFFileByteArray failed bitmap is null. bytes %s", new Object[] { paramArrayOfByte.toString() });
      init();
      AppMethodBeat.o(62369);
      break;
      label222: ab.e("MicroMsg.GIF.MMGIFImageView", "setMMGIFFileByteArray failed. %s", new Object[] { paramString.toString() });
    }
  }

  public String getCacheKey()
  {
    return this.kRZ;
  }

  public int getEmojiDensity()
  {
    return 320;
  }

  public float getEmojiDensityScale()
  {
    AppMethodBeat.i(62364);
    if (this.mDensity == 0.0F)
    {
      this.mDensity = (com.tencent.mm.bz.a.getDensity(ah.getContext()) / 2.0F);
      if (this.mDensity >= 1.0F)
        break label54;
      this.mDensity = 1.0F;
    }
    while (true)
    {
      float f = this.mDensity;
      AppMethodBeat.o(62364);
      return f;
      label54: if (this.mDensity > 2.0F)
        this.mDensity = 2.0F;
    }
  }

  public int getIntrinsicHeight()
  {
    AppMethodBeat.i(62372);
    int i;
    if (getDrawable() == null)
    {
      i = 0;
      AppMethodBeat.o(62372);
    }
    while (true)
    {
      return i;
      i = getDrawable().getIntrinsicHeight();
      AppMethodBeat.o(62372);
    }
  }

  public int getIntrinsicWidth()
  {
    AppMethodBeat.i(62371);
    int i;
    if (getDrawable() == null)
    {
      i = 0;
      AppMethodBeat.o(62371);
    }
    while (true)
    {
      return i;
      i = getDrawable().getIntrinsicWidth();
      AppMethodBeat.o(62371);
    }
  }

  public final void init()
  {
    AppMethodBeat.i(62370);
    this.noz = com.tencent.mm.compatible.util.f.Mn();
    if (this.noz)
    {
      if (this.nox <= 0)
        break label57;
      super.setImageResource(this.nox);
      AppMethodBeat.o(62370);
    }
    while (true)
    {
      return;
      if (this.noy > 0)
        super.setImageResource(this.noy);
      label57: AppMethodBeat.o(62370);
    }
  }

  public final void pause()
  {
    AppMethodBeat.i(62374);
    if ((getDrawable() != null) && ((getDrawable() instanceof b)))
      ((b)getDrawable()).pause();
    AppMethodBeat.o(62374);
  }

  public final void recycle()
  {
    AppMethodBeat.i(62379);
    if ((getDrawable() != null) && ((getDrawable() instanceof d)))
      ((d)getDrawable()).recycle();
    AppMethodBeat.o(62379);
  }

  public final void reset()
  {
    AppMethodBeat.i(62377);
    if ((getDrawable() != null) && ((getDrawable() instanceof b)))
      ((b)getDrawable()).reset();
    AppMethodBeat.o(62377);
  }

  public final void resume()
  {
    AppMethodBeat.i(62375);
    if ((getDrawable() != null) && ((getDrawable() instanceof b)))
      ((b)getDrawable()).resume();
    AppMethodBeat.o(62375);
  }

  public void setBackgroundResource(int paramInt)
  {
    AppMethodBeat.i(62360);
    a(getResources(), paramInt, false);
    AppMethodBeat.o(62360);
  }

  public void setCacheKey(String paramString)
  {
    this.kRZ = paramString;
  }

  public void setDefaultBackgroundResource(int paramInt)
  {
    this.nox = paramInt;
  }

  public void setDefaultImageResource(int paramInt)
  {
    this.nox = paramInt;
  }

  public void setImageFilePath(String paramString)
  {
    AppMethodBeat.i(62361);
    eF(paramString, null);
    AppMethodBeat.o(62361);
  }

  public void setImageResource(int paramInt)
  {
    AppMethodBeat.i(62359);
    a(getResources(), paramInt, true);
    AppMethodBeat.o(62359);
  }

  public final void start()
  {
    AppMethodBeat.i(62373);
    if ((getDrawable() != null) && ((getDrawable() instanceof b)))
      ((b)getDrawable()).start();
    AppMethodBeat.o(62373);
  }

  public final void stop()
  {
    AppMethodBeat.i(62376);
    if ((getDrawable() != null) && ((getDrawable() instanceof b)))
      ((b)getDrawable()).stop();
    AppMethodBeat.o(62376);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.gif.MMAnimateView
 * JD-Core Version:    0.6.2
 */