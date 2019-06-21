package com.github.henryye.nativeiv.comm;

import com.github.henryye.nativeiv.bitmap.IBitmap;
import com.github.henryye.nativeiv.bitmap.NativeBitmapStruct;
import com.github.henryye.nativeiv.bitmap.b;
import com.github.henryye.nativeiv.bitmap.c;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

public final class a
  implements b<NativeBitmapStruct>
{
  HashMap<Integer, NativeImage> aMo;
  private NativeImageJni jni;

  public a()
  {
    AppMethodBeat.i(115768);
    this.aMo = new HashMap();
    this.jni = new NativeImageJni();
    Object localObject = this.jni;
    if (((NativeImageJni)localObject).mNativeInst != 0L)
    {
      localObject = new IllegalStateException("NativeImageJni not released last time");
      AppMethodBeat.o(115768);
      throw ((Throwable)localObject);
    }
    ((NativeImageJni)localObject).mNativeInst = ((NativeImageJni)localObject).nativeInit();
    AppMethodBeat.o(115768);
  }

  public final boolean a(c paramc)
  {
    if ((paramc == c.aMf) || (paramc == c.aMe));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final void destroy()
  {
    AppMethodBeat.i(115770);
    Object localObject1 = this.jni;
    if (((NativeImageJni)localObject1).mNativeInst != 0L)
      ((NativeImageJni)localObject1).nativeDestroy(((NativeImageJni)localObject1).mNativeInst);
    localObject1 = new LinkedList();
    try
    {
      localIterator = this.aMo.values().iterator();
      while (localIterator.hasNext())
        ((LinkedList)localObject1).push((NativeImage)localIterator.next());
    }
    finally
    {
      AppMethodBeat.o(115770);
    }
    this.aMo.clear();
    Iterator localIterator = localObject2.iterator();
    while (localIterator.hasNext())
      ((NativeImage)localIterator.next()).recycle();
    localObject2.clear();
    AppMethodBeat.o(115770);
  }

  public final IBitmap<NativeBitmapStruct> pz()
  {
    AppMethodBeat.i(115769);
    NativeImage localNativeImage = new NativeImage(this.jni, this);
    AppMethodBeat.o(115769);
    return localNativeImage;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.github.henryye.nativeiv.comm.a
 * JD-Core Version:    0.6.2
 */