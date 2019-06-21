package com.tencent.mm.at.a.g;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory.Options;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.at.a.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.d;
import java.io.IOException;
import java.io.InputStream;

public final class a
{
  public static Bitmap a(c paramc, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(116119);
    if ((paramInt2 <= 0) || (paramInt3 <= 0))
      if ((paramc != null) && (paramc.width > 0) && (paramc.width > 0))
      {
        paramc = d.aw(paramInt1, paramc.width, paramc.height);
        AppMethodBeat.o(116119);
      }
    while (true)
    {
      return paramc;
      paramc = d.LV(paramInt1);
      AppMethodBeat.o(116119);
      continue;
      paramc = d.aw(paramInt1, paramInt2, paramInt3);
      AppMethodBeat.o(116119);
    }
  }

  public static Bitmap a(c paramc, InputStream paramInputStream, int paramInt1, int paramInt2, boolean paramBoolean1, float paramFloat, boolean paramBoolean2)
  {
    AppMethodBeat.i(116116);
    if ((paramInt1 <= 0) || (paramInt2 <= 0))
      if ((paramc != null) && (paramc.width > 0) && (paramc.width > 0))
        paramc = d.a(paramInputStream, 0.0F, paramc.width, paramc.height);
    while (true)
    {
      paramInputStream = paramc;
      if (paramBoolean1)
        paramInputStream = d.a(paramc, paramInt1, paramInt2, false, true);
      paramc = paramInputStream;
      if (paramFloat > 0.0F)
        paramc = d.c(paramInputStream, paramFloat);
      paramInputStream = paramc;
      if (paramBoolean2)
        paramInputStream = d.ak(paramc);
      AppMethodBeat.o(116116);
      return paramInputStream;
      paramc = d.decodeStream(paramInputStream);
      continue;
      paramc = d.a(paramInputStream, 0.0F, paramInt1, paramInt2);
    }
  }

  public static Bitmap a(c paramc, String paramString, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(116114);
    if ((paramInt1 <= 0) || (paramInt2 <= 0))
      if ((paramc != null) && (paramc.width > 0) && (paramc.width > 0))
      {
        paramc = d.ap(paramString, paramc.width, paramc.height);
        AppMethodBeat.o(116114);
      }
    while (true)
    {
      return paramc;
      paramc = d.aml(paramString);
      AppMethodBeat.o(116114);
      continue;
      paramc = d.d(paramString, paramInt2, paramInt1, false);
      AppMethodBeat.o(116114);
    }
  }

  public static Bitmap a(c paramc, byte[] paramArrayOfByte, int paramInt1, int paramInt2, boolean paramBoolean1, float paramFloat, boolean paramBoolean2)
  {
    AppMethodBeat.i(116117);
    if ((paramInt1 <= 0) || (paramInt2 <= 0))
      if ((paramc != null) && (paramc.width > 0) && (paramc.width > 0))
        paramc = d.decodeByteArray(paramArrayOfByte, paramc.width, paramc.height);
    while (true)
    {
      if (paramBoolean1)
        paramc = d.a(d.decodeByteArray(paramArrayOfByte, paramInt1, paramInt2), paramInt1, paramInt2, false, true);
      paramArrayOfByte = paramc;
      if (paramFloat > 0.0F)
        paramArrayOfByte = d.c(paramc, paramFloat);
      paramc = paramArrayOfByte;
      if (paramBoolean2)
        paramc = d.ak(paramArrayOfByte);
      AppMethodBeat.o(116117);
      return paramc;
      paramc = d.bQ(paramArrayOfByte);
      continue;
      paramc = d.decodeByteArray(paramArrayOfByte, paramInt1, paramInt2);
    }
  }

  public static Bitmap b(c paramc, String paramString, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(116115);
    BitmapFactory.Options localOptions = d.amj(paramString);
    if ((localOptions != null) && ((localOptions.outWidth >= localOptions.outHeight * 2) || (localOptions.outWidth * 2 <= localOptions.outHeight)))
      if ((paramInt1 <= 0) || (paramInt2 <= 0))
        if ((paramc != null) && (paramc.width > 0) && (paramc.width > 0))
        {
          paramc = d.d(paramString, paramc.height, paramc.width, true);
          AppMethodBeat.o(116115);
        }
    while (true)
    {
      return paramc;
      if ((paramc != null) && (paramc.getImageView() != null))
      {
        paramInt2 = paramc.getImageView().getMeasuredWidth();
        paramInt1 = paramc.getImageView().getMeasuredHeight();
      }
      while (true)
      {
        paramc = d.d(paramString, paramInt1, paramInt2, true);
        AppMethodBeat.o(116115);
        break;
        ab.w("MicroMsg.imageloader.ImageLoaderUtils", "crop bitmap cant not un set width or height");
        paramInt1 = 0;
        paramInt2 = 0;
      }
      paramc = d.d(paramString, paramInt2, paramInt1, true);
      AppMethodBeat.o(116115);
      continue;
      paramc = d.d(paramString, paramInt2, paramInt1, false);
      AppMethodBeat.o(116115);
    }
  }

  public static Bitmap c(c paramc, String paramString, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(116118);
    if (((paramInt1 > 0) && (paramInt2 > 0)) || (paramc != null));
    try
    {
      if ((paramc.width > 0) && (paramc.width > 0))
      {
        paramc = d.aq(paramString, paramc.width, paramc.height);
        AppMethodBeat.o(116118);
      }
      while (true)
      {
        return paramc;
        paramc = d.aq(paramString, 0, 0);
        AppMethodBeat.o(116118);
        continue;
        paramc = d.aq(paramString, paramInt1, paramInt2);
        AppMethodBeat.o(116118);
      }
    }
    catch (IOException paramc)
    {
      while (true)
      {
        ab.e("MicroMsg.imageloader.ImageLoaderUtils", "get bitmap from assert failed. :%s", new Object[] { paramc.toString() });
        paramc = null;
        AppMethodBeat.o(116118);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.at.a.g.a
 * JD-Core Version:    0.6.2
 */