package com.tencent.tencentmap.mapsdk.a;

import android.graphics.Bitmap;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedHashMap;

public class aq
{
  private a<String, Bitmap> a;

  public aq(int paramInt)
  {
    AppMethodBeat.i(100578);
    this.a = new a(paramInt);
    AppMethodBeat.o(100578);
  }

  public Bitmap a(String paramString)
  {
    AppMethodBeat.i(100581);
    paramString = (Bitmap)this.a.a(paramString);
    AppMethodBeat.o(100581);
    return paramString;
  }

  public void a()
  {
    AppMethodBeat.i(100579);
    this.a.a();
    AppMethodBeat.o(100579);
  }

  public void a(String paramString, Bitmap paramBitmap)
  {
    AppMethodBeat.i(100580);
    this.a.a(paramString, paramBitmap);
    AppMethodBeat.o(100580);
  }

  static class a<K, V>
  {
    byte[] a;
    private LinkedHashMap<K, V> b;
    private int c;

    public a(int paramInt)
    {
      AppMethodBeat.i(100574);
      this.a = new byte[0];
      this.c = paramInt;
      this.b = new aq.a.1(this, (int)Math.ceil(paramInt / 0.75F) + 1, 0.75F, true);
      AppMethodBeat.o(100574);
    }

    public V a(K paramK)
    {
      AppMethodBeat.i(100575);
      synchronized (this.a)
      {
        paramK = this.b.get(paramK);
        AppMethodBeat.o(100575);
        return paramK;
      }
    }

    public void a()
    {
      AppMethodBeat.i(100577);
      synchronized (this.a)
      {
        this.b.clear();
        AppMethodBeat.o(100577);
        return;
      }
    }

    public void a(K paramK, V paramV)
    {
      AppMethodBeat.i(100576);
      synchronized (this.a)
      {
        this.b.put(paramK, paramV);
        AppMethodBeat.o(100576);
        return;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.a.aq
 * JD-Core Version:    0.6.2
 */