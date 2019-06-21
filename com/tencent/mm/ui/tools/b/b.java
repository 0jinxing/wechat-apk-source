package com.tencent.mm.ui.tools.b;

import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public final class b extends a
{
  private int mHeight = 2048;
  public int mSize = 104857600;
  private int mWidth = 2048;
  private String zIs;
  public int zIt = 0;
  public int zIu = 0;
  public int zIv = 0;
  private b.a zIw;

  private b(String paramString)
  {
    this.zIs = paramString;
  }

  public static b asm(String paramString)
  {
    AppMethodBeat.i(107829);
    paramString = new b(paramString);
    AppMethodBeat.o(107829);
    return paramString;
  }

  public final b PL(int paramInt)
  {
    this.mWidth = paramInt;
    this.mHeight = paramInt;
    return this;
  }

  public final void a(b.a parama)
  {
    AppMethodBeat.i(107830);
    this.zIw = parama;
    dkS();
    AppMethodBeat.o(107830);
  }

  protected final int aAa()
  {
    int i = 0;
    AppMethodBeat.i(107831);
    if (bo.isNullOrNil(this.zIs))
      ab.w("MicroMsg.ImageBoundaryCheck", "dz[check image but path is null or nil]");
    this.zIt = e.cs(this.zIs);
    String str = this.zIs;
    BitmapFactory.Options localOptions = new BitmapFactory.Options();
    localOptions.inJustDecodeBounds = true;
    BitmapFactory.decodeFile(str, localOptions);
    this.zIu = localOptions.outWidth;
    this.zIv = localOptions.outHeight;
    if (this.zIt <= this.mSize)
    {
      if (this.zIt < 0)
      {
        j = 1;
        if (j == 0)
          break label221;
      }
    }
    else
      ab.d("MicroMsg.ImageBoundaryCheck", "dz[over size] size = %d", new Object[] { Integer.valueOf(this.zIt) });
    label221: for (int j = 0; ; j = 1)
    {
      if ((this.zIu > this.mWidth) || (this.zIv > this.mHeight))
      {
        ab.d("MicroMsg.ImageBoundaryCheck", "dz[over width or height] width = %d, height = %d", new Object[] { Integer.valueOf(this.zIu), Integer.valueOf(this.zIv) });
        j = 0;
      }
      if (j != 0)
      {
        ab.i("MicroMsg.ImageBoundaryCheck", "dz[status ok]");
        AppMethodBeat.o(107831);
      }
      for (j = i; ; j = 1)
      {
        return j;
        j = 0;
        break;
        AppMethodBeat.o(107831);
      }
    }
  }

  protected final void dkS()
  {
    AppMethodBeat.i(107832);
    if (this.zIw == null)
    {
      ab.w("MicroMsg.ImageBoundaryCheck", "dz[callback is null]");
      AppMethodBeat.o(107832);
      return;
    }
    switch (aAa())
    {
    default:
    case 0:
    case 1:
    }
    while (true)
    {
      AppMethodBeat.o(107832);
      break;
      this.zIw.a(this);
      AppMethodBeat.o(107832);
      break;
      this.zIw.bln();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.b.b
 * JD-Core Version:    0.6.2
 */