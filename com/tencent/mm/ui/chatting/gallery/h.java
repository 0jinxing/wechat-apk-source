package com.tencent.mm.ui.chatting.gallery;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.bi;
import java.util.ArrayList;
import java.util.Iterator;

public final class h
{
  public ArrayList<bi> mnX;
  public boolean mnY;
  ArrayList<h.b> mnZ;

  private h()
  {
    AppMethodBeat.i(32166);
    this.mnX = new ArrayList();
    this.mnY = false;
    this.mnZ = new ArrayList();
    AppMethodBeat.o(32166);
  }

  private void bfa()
  {
    AppMethodBeat.i(32174);
    Iterator localIterator = this.mnZ.iterator();
    while (localIterator.hasNext())
      ((h.b)localIterator.next()).clear();
    AppMethodBeat.o(32174);
  }

  private void dFW()
  {
    AppMethodBeat.i(32173);
    Iterator localIterator = this.mnZ.iterator();
    while (localIterator.hasNext())
      ((h.b)localIterator.next()).dFU();
    AppMethodBeat.o(32173);
  }

  private bi no(long paramLong)
  {
    AppMethodBeat.i(32168);
    Iterator localIterator = this.mnX.iterator();
    bi localbi;
    while (localIterator.hasNext())
    {
      localbi = (bi)localIterator.next();
      if (localbi.field_msgId == paramLong)
        AppMethodBeat.o(32168);
    }
    while (true)
    {
      return localbi;
      localbi = null;
      AppMethodBeat.o(32168);
    }
  }

  public final void a(h.b paramb)
  {
    AppMethodBeat.i(32175);
    this.mnZ.remove(paramb);
    this.mnZ.add(paramb);
    AppMethodBeat.o(32175);
  }

  public final void bC(bi parambi)
  {
    AppMethodBeat.i(32167);
    if (parambi == null)
      AppMethodBeat.o(32167);
    while (true)
    {
      return;
      ab.i("MicroMsg.ImageGallerySelectedHandle", "add : %s", new Object[] { Long.valueOf(parambi.field_msgId) });
      this.mnX.remove(parambi);
      this.mnX.remove(no(parambi.field_msgId));
      this.mnX.add(parambi);
      dFW();
      AppMethodBeat.o(32167);
    }
  }

  public final void bD(bi parambi)
  {
    AppMethodBeat.i(32169);
    if (parambi == null)
      AppMethodBeat.o(32169);
    while (true)
    {
      return;
      ab.i("MicroMsg.ImageGallerySelectedHandle", "remove : %s", new Object[] { Long.valueOf(parambi.field_msgId) });
      this.mnX.remove(parambi);
      this.mnX.remove(no(parambi.field_msgId));
      dFW();
      AppMethodBeat.o(32169);
    }
  }

  public final boolean bE(bi parambi)
  {
    AppMethodBeat.i(32172);
    boolean bool;
    if (parambi == null)
    {
      AppMethodBeat.o(32172);
      bool = false;
    }
    while (true)
    {
      return bool;
      Iterator localIterator = this.mnX.iterator();
      while (true)
        if (localIterator.hasNext())
          if (((bi)localIterator.next()).field_msgId == parambi.field_msgId)
          {
            bool = true;
            AppMethodBeat.o(32172);
            break;
          }
      AppMethodBeat.o(32172);
      bool = false;
    }
  }

  public final void clear()
  {
    AppMethodBeat.i(32170);
    ab.i("MicroMsg.ImageGallerySelectedHandle", "clear..");
    this.mnX.clear();
    bfa();
    AppMethodBeat.o(32170);
  }

  public final void detach()
  {
    AppMethodBeat.i(32171);
    this.mnZ.clear();
    clear();
    this.mnY = false;
    AppMethodBeat.o(32171);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.gallery.h
 * JD-Core Version:    0.6.2
 */