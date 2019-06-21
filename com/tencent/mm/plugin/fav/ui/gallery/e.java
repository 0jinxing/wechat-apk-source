package com.tencent.mm.plugin.fav.ui.gallery;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.aar;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.ArrayList;
import java.util.Iterator;

public final class e
{
  ArrayList<d> mnX;
  boolean mnY;
  ArrayList<e.b> mnZ;

  private e()
  {
    AppMethodBeat.i(74561);
    this.mnX = new ArrayList();
    this.mnY = false;
    this.mnZ = new ArrayList();
    AppMethodBeat.o(74561);
  }

  public final d Mg(String paramString)
  {
    AppMethodBeat.i(74562);
    Iterator localIterator = this.mnX.iterator();
    while (localIterator.hasNext())
    {
      d locald = (d)localIterator.next();
      if (locald.cAJ.mnd.equals(paramString))
      {
        AppMethodBeat.o(74562);
        paramString = locald;
      }
    }
    while (true)
    {
      return paramString;
      paramString = null;
      AppMethodBeat.o(74562);
    }
  }

  public final void bwu()
  {
    AppMethodBeat.i(74564);
    Iterator localIterator = this.mnZ.iterator();
    while (localIterator.hasNext())
      ((e.b)localIterator.next()).bww();
    AppMethodBeat.o(74564);
  }

  public final void clear()
  {
    AppMethodBeat.i(74563);
    ab.i("MicroMsg.ImageGallerySelectedHandle", "clear..");
    this.mnX.clear();
    Iterator localIterator = this.mnZ.iterator();
    while (localIterator.hasNext())
      localIterator.next();
    AppMethodBeat.o(74563);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.gallery.e
 * JD-Core Version:    0.6.2
 */