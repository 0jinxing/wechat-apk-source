package com.tencent.tencentmap.mapsdk.maps.a;

import android.content.Context;
import android.graphics.Bitmap;
import com.tencent.map.lib.f;
import com.tencent.map.lib.gl.JNICallback.j;
import com.tencent.map.lib.gl.JNICallback.k;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.tencentmap.mapsdk.a.be;
import com.tencent.tencentmap.mapsdk.a.bg;
import com.tencent.tencentmap.mapsdk.a.da;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.microedition.khronos.opengles.GL10;

public class lo extends hz
  implements JNICallback.j, JNICallback.k
{
  lt a;
  private WeakReference<ls> b;
  private ll c;
  private volatile int d;
  private volatile ExecutorService e;

  public lo(ls paramls, lt paramlt)
  {
    AppMethodBeat.i(100454);
    this.d = -1;
    this.e = null;
    if ((paramls == null) || (paramls.a() == null))
      AppMethodBeat.o(100454);
    while (true)
    {
      return;
      f localf = paramls.a().b();
      this.c = ll.a(paramls.a().i().getApplicationContext());
      this.b = new WeakReference(paramls);
      this.a = paramlt;
      localf.a(this);
      localf.a(this);
      this.d = localf.e(false);
      AppMethodBeat.o(100454);
    }
  }

  private boolean a(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(100459);
    if ((paramString != null) && (paramString.length() > 0))
    {
      paramString = Pattern.compile("version=\\d+").matcher(paramString);
      if (paramString.find())
      {
        paramString = paramString.group();
        if (Integer.parseInt(paramString.substring(paramString.indexOf("=") + 1)) == lq.c())
        {
          bool = true;
          AppMethodBeat.o(100459);
        }
      }
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(100459);
      continue;
      AppMethodBeat.o(100459);
    }
  }

  private da b(String paramString)
  {
    AppMethodBeat.i(100460);
    if ((paramString == null) || (paramString.length() == 0))
    {
      paramString = null;
      AppMethodBeat.o(100460);
    }
    while (true)
    {
      return paramString;
      int i = paramString.lastIndexOf("foreignLanguage");
      paramString = da.valueOf(paramString.substring("foreignLanguage".length() + 1 + i));
      AppMethodBeat.o(100460);
    }
  }

  public Bitmap a(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(100456);
    if ((this.b == null) || (this.b.get() == null) || (this.d == -1))
    {
      AppMethodBeat.o(100456);
      paramArrayOfByte = null;
    }
    while (true)
    {
      return paramArrayOfByte;
      Object localObject = new bg();
      ((bg)localObject).a(paramArrayOfByte);
      be localbe = new be(((bg)localObject).a(), ((bg)localObject).b(), ((bg)localObject).c(), 0, this.a.a());
      localObject = this.c.a(localbe);
      if (localObject != null)
      {
        AppMethodBeat.o(100456);
        paramArrayOfByte = (byte[])localObject;
      }
      else
      {
        localObject = this.a.a(localbe.a(), localbe.b(), localbe.c());
        if (localObject == null)
        {
          AppMethodBeat.o(100456);
          paramArrayOfByte = null;
        }
        else
        {
          localObject = ((String)localObject).getBytes();
          Arrays.fill(paramArrayOfByte, (byte)0);
          System.arraycopy(localObject, 0, paramArrayOfByte, 0, localObject.length);
          AppMethodBeat.o(100456);
          paramArrayOfByte = null;
        }
      }
    }
  }

  public void a(String paramString, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    AppMethodBeat.i(100457);
    if (this.e == null);
    try
    {
      if (this.e == null)
        this.e = Executors.newSingleThreadExecutor();
      if (!this.e.isShutdown())
        this.e.execute(new lo.1(this, paramString, paramArrayOfByte1, paramArrayOfByte2));
      AppMethodBeat.o(100457);
      return;
    }
    finally
    {
      AppMethodBeat.o(100457);
    }
    throw paramString;
  }

  public void a(GL10 paramGL10)
  {
  }

  public boolean a()
  {
    return false;
  }

  public boolean a(float paramFloat1, float paramFloat2)
  {
    return false;
  }

  public void b()
  {
  }

  public void c()
  {
  }

  public void d()
  {
    AppMethodBeat.i(100455);
    if ((this.b != null) && (this.b.get() != null))
    {
      Object localObject = ((ls)this.b.get()).a();
      if ((localObject != null) && (((iz)localObject).b() != null))
      {
        localObject = ((iz)localObject).b();
        ((f)localObject).a(null);
        ((f)localObject).a(null);
        ((f)localObject).i(this.d);
        this.d = -1;
      }
    }
    AppMethodBeat.o(100455);
  }

  public void e()
  {
    AppMethodBeat.i(100458);
    if ((this.d != -1) && (this.b != null) && (this.b.get() != null))
      ((ls)this.b.get()).a().b().j(this.d);
    AppMethodBeat.o(100458);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.lo
 * JD-Core Version:    0.6.2
 */