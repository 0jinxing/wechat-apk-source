package com.tencent.mm.plugin.game.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.a;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.game.d.b;
import com.tencent.mm.plugin.game.d.bm;
import com.tencent.mm.plugin.game.d.ch;
import com.tencent.mm.plugin.game.d.cq;
import com.tencent.mm.plugin.game.d.cr;
import com.tencent.mm.plugin.game.d.dc;
import com.tencent.mm.plugin.game.d.e;
import com.tencent.mm.plugin.game.d.l;
import com.tencent.mm.plugin.game.f.d;
import com.tencent.mm.plugin.game.ui.GameLibraryCategoriesView.a;
import com.tencent.mm.sdk.platformtools.ab;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;

public final class ae extends x
{
  private int mXJ;
  public bm mYe;
  public LinkedList<c> mYf;
  public LinkedList<c> mYg;

  public ae(a parama, boolean paramBoolean, int paramInt)
  {
    AppMethodBeat.i(111378);
    this.mXJ = 0;
    if (parama == null)
    {
      this.mYe = new bm();
      AppMethodBeat.o(111378);
    }
    while (true)
    {
      return;
      this.mYe = ((bm)parama);
      this.mXJ = paramInt;
      this.mYf = bEM();
      this.mYg = bEN();
      if (paramBoolean)
        ((com.tencent.mm.plugin.game.a.c)g.K(com.tencent.mm.plugin.game.a.c.class)).bCZ().b("pb_library", parama);
      d.ac(this.mYf);
      d.ac(this.mYg);
      AppMethodBeat.o(111378);
    }
  }

  public ae(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(111379);
    this.mXJ = 0;
    this.mYe = new bm();
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length == 0))
      AppMethodBeat.o(111379);
    while (true)
    {
      return;
      try
      {
        this.mYe.parseFrom(paramArrayOfByte);
        this.mYf = bEM();
        this.mYg = bEN();
        d.ac(this.mYf);
        d.ac(this.mYg);
        AppMethodBeat.o(111379);
      }
      catch (IOException paramArrayOfByte)
      {
        while (true)
          ab.e("MicroMsg.GamePBDataLibrary", "Parsing Failed: %s", new Object[] { paramArrayOfByte.getMessage() });
      }
    }
  }

  private LinkedList<c> bEM()
  {
    AppMethodBeat.i(111380);
    LinkedList localLinkedList = new LinkedList();
    if ((this.mYe.ncr == null) || (this.mYe.ncr.ncV == null) || (this.mYe.ncr.ncV.ndk == null))
      AppMethodBeat.o(111380);
    while (true)
    {
      return localLinkedList;
      Iterator localIterator = this.mYe.ncr.ncV.ndk.iterator();
      int i = 1;
      while (localIterator.hasNext())
      {
        cr localcr = (cr)localIterator.next();
        c localc = a(localcr.mZk);
        if (localc != null)
        {
          localc.mVu = localcr.mZk.mZz;
          localc.scene = 11;
          localc.cKG = 1110;
          localc.position = i;
          localLinkedList.add(localc);
          i++;
        }
      }
      AppMethodBeat.o(111380);
    }
  }

  private LinkedList<c> bEN()
  {
    AppMethodBeat.i(111381);
    LinkedList localLinkedList = new LinkedList();
    if (this.mYe.ncs == null)
    {
      AppMethodBeat.o(111381);
      return localLinkedList;
    }
    int i = this.mXJ + 1;
    int j = this.mXJ / 15;
    Iterator localIterator = this.mYe.ncs.iterator();
    j += 901;
    label272: 
    while (true)
    {
      if (localIterator.hasNext())
      {
        com.tencent.mm.plugin.game.d.c localc = (com.tencent.mm.plugin.game.d.c)localIterator.next();
        Object localObject = null;
        switch (localc.jCt)
        {
        default:
        case 1:
        case 2:
        }
        while (true)
        {
          if (localObject == null)
            break label272;
          localObject.scene = 11;
          localObject.cKG = 1111;
          localLinkedList.add(localObject);
          break;
          c localc1 = a(localc.mZk);
          localObject = localc1;
          if (localc1 != null)
          {
            localc1.position = i;
            i++;
            localObject = localc1;
            continue;
            if (localc.mZn != null)
            {
              localc1 = a(localc.mZn.mZk);
              localObject = localc1;
              if (localc1 != null)
              {
                localc1.type = 1;
                localc1.mVm = localc.mZn.mZm;
                localc1.mVn = localc.mZn.mZl;
                int k = j + 1;
                localc1.position = j;
                j = k;
                localObject = localc1;
              }
            }
          }
        }
      }
      AppMethodBeat.o(111381);
      break;
    }
  }

  public final HashMap<Integer, String> bEO()
  {
    AppMethodBeat.i(111382);
    LinkedHashMap localLinkedHashMap = new LinkedHashMap();
    if ((this.mYe.ncr == null) || (this.mYe.ncr.ncY == null))
      AppMethodBeat.o(111382);
    while (true)
    {
      return localLinkedHashMap;
      Iterator localIterator = this.mYe.ncr.ncY.iterator();
      while (localIterator.hasNext())
      {
        dc localdc = (dc)localIterator.next();
        localLinkedHashMap.put(Integer.valueOf(localdc.ncp), localdc.Name);
      }
      AppMethodBeat.o(111382);
    }
  }

  public final LinkedList<GameLibraryCategoriesView.a> bEP()
  {
    AppMethodBeat.i(111383);
    Object localObject;
    if ((this.mYe.ncr == null) || (this.mYe.ncr.ncW == null))
    {
      localObject = null;
      AppMethodBeat.o(111383);
    }
    while (true)
    {
      return localObject;
      localObject = new LinkedList();
      Iterator localIterator = this.mYe.ncr.ncW.iterator();
      int i = 0;
      while (localIterator.hasNext())
      {
        l locall = (l)localIterator.next();
        GameLibraryCategoriesView.a locala = new GameLibraryCategoriesView.a();
        locala.njM = locall.mZU;
        locala.njN = locall.Name;
        locala.njO = locall.mZm;
        locala.haO = locall.mZs;
        i++;
        locala.position = i;
        ((LinkedList)localObject).add(locala);
      }
      AppMethodBeat.o(111383);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.model.ae
 * JD-Core Version:    0.6.2
 */