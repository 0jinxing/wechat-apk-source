package com.tencent.mm.plugin.appbrand.jsapi.s;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.widget.c.a;

final class b$1$1
  implements Runnable
{
  b$1$1(b.1 param1, byte[] paramArrayOfByte)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(126628);
    if ((this.ibu == null) || (this.ibu.length == 0))
      AppMethodBeat.o(126628);
    while (true)
    {
      return;
      Object localObject = this.ibu;
      int i;
      if ((localObject == null) || (localObject.length <= 0))
        i = 0;
      while (true)
      {
        label42: if (i == 0)
          break label206;
        this.ibv.ibt.setImageByteArray(this.ibu);
        AppMethodBeat.o(126628);
        break;
        BitmapFactory.Options localOptions = new BitmapFactory.Options();
        localOptions.inJustDecodeBounds = true;
        BitmapFactory.decodeByteArray((byte[])localObject, 0, localObject.length, localOptions);
        localObject = localOptions.outMimeType;
        com.tencent.luggage.g.d.v("Util", "imageType:%s", new Object[] { localObject });
        i = -1;
        switch (((String)localObject).hashCode())
        {
        default:
        case -879267568:
        case -879299344:
        }
        while (true)
          switch (i)
          {
          default:
            i = 0;
            break label42;
            if (((String)localObject).equals("image/gif"))
            {
              i = 0;
              continue;
              if (((String)localObject).equals("image/GIF"))
                i = 1;
            }
            break;
          case 0:
          case 1:
          }
        i = 1;
      }
      try
      {
        label206: localObject = com.tencent.mm.sdk.platformtools.d.bQ(this.ibu);
        this.ibv.ibt.setImageBitmap((Bitmap)localObject);
        AppMethodBeat.o(126628);
      }
      catch (Exception localException)
      {
        com.tencent.luggage.g.d.c("Luggage.ViewAttributeHelper", "", new Object[] { localException });
        AppMethodBeat.o(126628);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.s.b.1.1
 * JD-Core Version:    0.6.2
 */