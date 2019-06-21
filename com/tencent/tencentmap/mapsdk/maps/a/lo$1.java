package com.tencent.tencentmap.mapsdk.maps.a;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.BitmapFactory;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.tencentmap.mapsdk.a.be;
import com.tencent.tencentmap.mapsdk.a.bg;
import java.lang.ref.WeakReference;

class lo$1
  implements Runnable
{
  lo$1(lo paramlo, String paramString, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
  }

  public void run()
  {
    AppMethodBeat.i(100453);
    if (!lo.a(this.d, this.a))
      AppMethodBeat.o(100453);
    while (true)
    {
      return;
      Object localObject = new bg();
      ((bg)localObject).a(this.b);
      be localbe = new be(((bg)localObject).a(), ((bg)localObject).b(), ((bg)localObject).c(), 0, lo.b(this.d, this.a));
      localObject = BitmapFactory.decodeByteArray(this.c, 0, this.c.length);
      if (localObject != null)
      {
        if ((lo.a(this.d) != null) && (lo.a(this.d).get() != null))
          ((ls)lo.a(this.d).get()).a(1);
        lo.b(this.d).a(ht.a((Bitmap)localObject, Bitmap.CompressFormat.PNG), localbe);
      }
      AppMethodBeat.o(100453);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.lo.1
 * JD-Core Version:    0.6.2
 */