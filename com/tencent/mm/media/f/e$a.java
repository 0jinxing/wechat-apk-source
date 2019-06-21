package com.tencent.mm.media.f;

import a.f.b.j;
import a.l;
import android.graphics.Bitmap;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/media/mix/MixFrameSyncMgr$NextFrameInfo;", "", "mixBitmap", "Landroid/graphics/Bitmap;", "skip", "", "(Landroid/graphics/Bitmap;Z)V", "getMixBitmap", "()Landroid/graphics/Bitmap;", "getSkip", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "plugin-mediaeditor_release"})
public final class e$a
{
  public final boolean cAi;
  public final Bitmap eWX;

  public e$a(Bitmap paramBitmap, boolean paramBoolean)
  {
    this.eWX = paramBitmap;
    this.cAi = paramBoolean;
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool = false;
    AppMethodBeat.i(12998);
    int i;
    if (this != paramObject)
    {
      if (!(paramObject instanceof a))
        break label71;
      paramObject = (a)paramObject;
      if (!j.j(this.eWX, paramObject.eWX))
        break label71;
      if (this.cAi == paramObject.cAi)
      {
        i = 1;
        if (i == 0)
          break label71;
      }
    }
    else
    {
      AppMethodBeat.o(12998);
      bool = true;
    }
    while (true)
    {
      return bool;
      i = 0;
      break;
      label71: AppMethodBeat.o(12998);
    }
  }

  public final int hashCode()
  {
    AppMethodBeat.i(12997);
    Bitmap localBitmap = this.eWX;
    if (localBitmap != null);
    for (int i = localBitmap.hashCode(); ; i = 0)
    {
      int j = this.cAi;
      int k = j;
      if (j != 0)
        k = 1;
      AppMethodBeat.o(12997);
      return k + i * 31;
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(12996);
    String str = "NextFrameInfo(mixBitmap=" + this.eWX + ", skip=" + this.cAi + ")";
    AppMethodBeat.o(12996);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.media.f.e.a
 * JD-Core Version:    0.6.2
 */