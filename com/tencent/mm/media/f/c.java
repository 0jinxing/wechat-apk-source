package com.tencent.mm.media.f;

import a.f.b.j;
import a.l;
import android.graphics.Bitmap;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/media/mix/FrameInfo;", "", "bitmap", "Landroid/graphics/Bitmap;", "frameDuration", "", "(Landroid/graphics/Bitmap;J)V", "getBitmap", "()Landroid/graphics/Bitmap;", "getFrameDuration", "()J", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "plugin-mediaeditor_release"})
public final class c
{
  public final Bitmap bitmap;
  public final long eWH;

  public c(Bitmap paramBitmap, long paramLong)
  {
    AppMethodBeat.i(12992);
    this.bitmap = paramBitmap;
    this.eWH = paramLong;
    AppMethodBeat.o(12992);
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool = false;
    AppMethodBeat.i(12995);
    int i;
    if (this != paramObject)
    {
      if (!(paramObject instanceof c))
        break label72;
      paramObject = (c)paramObject;
      if (!j.j(this.bitmap, paramObject.bitmap))
        break label72;
      if (this.eWH == paramObject.eWH)
      {
        i = 1;
        if (i == 0)
          break label72;
      }
    }
    else
    {
      AppMethodBeat.o(12995);
      bool = true;
    }
    while (true)
    {
      return bool;
      i = 0;
      break;
      label72: AppMethodBeat.o(12995);
    }
  }

  public final int hashCode()
  {
    AppMethodBeat.i(12994);
    Bitmap localBitmap = this.bitmap;
    if (localBitmap != null);
    for (int i = localBitmap.hashCode(); ; i = 0)
    {
      long l = this.eWH;
      int j = (int)(l ^ l >>> 32);
      AppMethodBeat.o(12994);
      return i * 31 + j;
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(12993);
    String str = "FrameInfo(bitmap=" + this.bitmap + ", frameDuration=" + this.eWH + ")";
    AppMethodBeat.o(12993);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.media.f.c
 * JD-Core Version:    0.6.2
 */