package com.tencent.tencentmap.mapsdk.maps.a;

import android.graphics.Bitmap;
import com.tencent.map.lib.f;
import com.tencent.map.lib.gl.JNICallback.b;
import com.tencent.map.lib.gl.JNICallback.c;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.tencentmap.mapsdk.a.bg;
import java.lang.ref.WeakReference;

public class jq
  implements JNICallback.b, JNICallback.c, jt.b
{
  private WeakReference<iz> a;
  private WeakReference<f> b;
  private jw c;
  private int d;

  public jq(iz paramiz)
  {
    AppMethodBeat.i(100090);
    this.d = -1;
    this.a = new WeakReference(paramiz);
    this.b = new WeakReference(paramiz.b());
    this.c = new ju(paramiz.i());
    a(this);
    a(this);
    AppMethodBeat.o(100090);
  }

  public int a()
  {
    AppMethodBeat.i(100093);
    if ((this.b != null) && (this.b.get() != null))
    {
      this.d = ((f)this.b.get()).C();
      if (this.d != -1)
        ((f)this.b.get()).a(this.d, 4, 20);
    }
    int i = this.d;
    AppMethodBeat.o(100093);
    return i;
  }

  public Bitmap a(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(100096);
    if ((this.a == null) || (this.a.get() == null) || (this.d == -1))
    {
      paramArrayOfByte = null;
      AppMethodBeat.o(100096);
    }
    while (true)
    {
      return paramArrayOfByte;
      bg localbg = new bg();
      localbg.a(paramArrayOfByte);
      paramArrayOfByte = this.c.a(localbg.a(), localbg.b(), localbg.c(), paramArrayOfByte);
      AppMethodBeat.o(100096);
    }
  }

  public void a(JNICallback.b paramb)
  {
    AppMethodBeat.i(100091);
    if ((this.b != null) && (this.b.get() != null))
      ((f)this.b.get()).a(paramb);
    AppMethodBeat.o(100091);
  }

  public void a(JNICallback.c paramc)
  {
    AppMethodBeat.i(100092);
    if ((this.b != null) && (this.b.get() != null))
      ((f)this.b.get()).a(paramc);
    AppMethodBeat.o(100092);
  }

  public void a(String paramString, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    AppMethodBeat.i(100097);
    if ((paramArrayOfByte2 == null) || (paramArrayOfByte1 == null) || (paramArrayOfByte2.length == 0) || (paramArrayOfByte1.length == 0))
      AppMethodBeat.o(100097);
    while (true)
    {
      return;
      bg localbg = new bg();
      localbg.a(paramArrayOfByte1);
      this.c.a(localbg.a(), localbg.b(), localbg.c(), paramString, paramArrayOfByte2);
      AppMethodBeat.o(100097);
    }
  }

  public void b()
  {
    AppMethodBeat.i(100094);
    if ((this.b != null) && (this.b.get() != null) && (this.d != -1))
    {
      f localf = (f)this.b.get();
      localf.a(null);
      localf.a(null);
      localf.i(this.d);
      this.c.b();
      this.d = -1;
    }
    AppMethodBeat.o(100094);
  }

  public void b_()
  {
    AppMethodBeat.i(100098);
    this.c.a();
    c();
    AppMethodBeat.o(100098);
  }

  public void c()
  {
    AppMethodBeat.i(100095);
    if ((this.b != null) && (this.b.get() != null) && (this.d != -2147483648))
      ((f)this.b.get()).j(this.d);
    AppMethodBeat.o(100095);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.jq
 * JD-Core Version:    0.6.2
 */