package com.tencent.mm.plugin.game.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.a;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.game.d.ba;
import com.tencent.mm.plugin.game.d.br;
import com.tencent.mm.plugin.game.d.bs;
import com.tencent.mm.plugin.game.d.bt;
import com.tencent.mm.plugin.game.d.bv;
import com.tencent.mm.plugin.game.d.bw;
import com.tencent.mm.plugin.game.d.bz;
import com.tencent.mm.plugin.game.d.cf;
import com.tencent.mm.plugin.game.d.cl;
import com.tencent.mm.plugin.game.d.cv;
import com.tencent.mm.plugin.game.f.d;
import com.tencent.mm.plugin.game.ui.GameMediaList.a;
import com.tencent.mm.sdk.platformtools.ab;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;

public final class z extends x
{
  public ba mXK;
  private boolean mXL;
  public c mXM;
  public aa mXN;

  public z(a parama)
  {
    AppMethodBeat.i(111360);
    if (parama == null)
    {
      this.mXK = new ba();
      AppMethodBeat.o(111360);
    }
    while (true)
    {
      return;
      this.mXK = ((ba)parama);
      this.mXL = false;
      Kh();
      AppMethodBeat.o(111360);
    }
  }

  public z(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(111361);
    this.mXK = new ba();
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length == 0))
      AppMethodBeat.o(111361);
    while (true)
    {
      return;
      try
      {
        this.mXK.parseFrom(paramArrayOfByte);
        this.mXL = true;
        Kh();
        AppMethodBeat.o(111361);
      }
      catch (IOException paramArrayOfByte)
      {
        while (true)
          ab.e("MicroMsg.GamePBDataDetail", "Parsing Failed: %s", new Object[] { paramArrayOfByte.getMessage() });
      }
    }
  }

  private void Kh()
  {
    AppMethodBeat.i(111362);
    this.mXM = bEy();
    if (this.mXL)
    {
      this.mXN = new aa(this.mXM.field_appId);
      if (!this.mXL)
      {
        d.a(this.mXM);
        ((com.tencent.mm.plugin.game.a.c)g.K(com.tencent.mm.plugin.game.a.c.class)).bCZ().b(this.mXM.field_appId, this.mXK);
      }
      AppMethodBeat.o(111362);
      return;
    }
    String str = this.mXM.field_appId;
    if (this.mXK.nbO != null);
    for (LinkedList localLinkedList = this.mXK.nbO.ndo; ; localLinkedList = null)
    {
      this.mXN = new aa(str, localLinkedList);
      break;
    }
  }

  private c bEy()
  {
    AppMethodBeat.i(111363);
    c localc = a(this.mXK.mZk);
    if (localc != null)
    {
      localc.scene = 12;
      localc.cKG = 1201;
    }
    AppMethodBeat.o(111363);
    return localc;
  }

  public final LinkedList<z.b> bEA()
  {
    AppMethodBeat.i(111364);
    LinkedList localLinkedList;
    Iterator localIterator;
    Object localObject1;
    Object localObject2;
    if ((this.mXK.nbS != null) && (this.mXK.nbS.kfL != null))
    {
      localLinkedList = new LinkedList();
      localIterator = this.mXK.nbS.kfL.iterator();
      while (localIterator.hasNext())
      {
        localObject1 = (bz)localIterator.next();
        localObject2 = new z.b();
        ((z.b)localObject2).cIY = ((bz)localObject1).cIY;
        ((z.b)localObject2).desc = ((bz)localObject1).desc;
        localLinkedList.add(localObject2);
      }
      AppMethodBeat.o(111364);
    }
    while (true)
    {
      return localLinkedList;
      if ((this.mXK.nbN != null) && (this.mXK.nbN.ncz != null))
      {
        localLinkedList = new LinkedList();
        localIterator = this.mXK.nbN.ncz.iterator();
        while (localIterator.hasNext())
        {
          localObject2 = (bt)localIterator.next();
          localObject1 = new z.b();
          ((z.b)localObject1).cIY = ((bt)localObject2).ncC;
          ((z.b)localObject1).title = ((bt)localObject2).Title;
          ((z.b)localObject1).desc = ((bt)localObject2).naq;
          ((z.b)localObject1).url = ((bt)localObject2).mZm;
          localLinkedList.add(localObject1);
        }
        AppMethodBeat.o(111364);
      }
      else
      {
        localLinkedList = null;
        AppMethodBeat.o(111364);
      }
    }
  }

  public final int bEB()
  {
    if (this.mXK.nbS != null);
    for (int i = 2; ; i = 1)
      return i;
  }

  public final LinkedList<GameMediaList.a> bEC()
  {
    AppMethodBeat.i(111365);
    LinkedList localLinkedList = new LinkedList();
    if ((this.mXK.nbL == null) || (this.mXK.nbL.ncS == null))
      AppMethodBeat.o(111365);
    while (true)
    {
      return localLinkedList;
      Iterator localIterator = this.mXK.nbL.ncS.iterator();
      while (localIterator.hasNext())
      {
        cl localcl = (cl)localIterator.next();
        GameMediaList.a locala = new GameMediaList.a();
        locala.type = localcl.nda;
        locala.nkG = localcl.ndb;
        locala.url = localcl.ndc;
        localLinkedList.add(locala);
      }
      AppMethodBeat.o(111365);
    }
  }

  public final String bED()
  {
    if ((this.mXK.nbL == null) || (this.mXK.nbL.Title == null));
    for (String str = null; ; str = this.mXK.nbL.Title)
      return str;
  }

  public final String bEE()
  {
    if ((this.mXK.nbL == null) || (this.mXK.nbL.naq == null));
    for (String str = null; ; str = this.mXK.nbL.naq)
      return str;
  }

  public final String bEF()
  {
    if (this.mXK.nbM == null);
    for (String str = null; ; str = this.mXK.nbM.Title)
      return str;
  }

  public final LinkedList<bw> bEG()
  {
    if (this.mXK.nbM == null);
    for (Object localObject = null; ; localObject = this.mXK.nbM.ncE)
      return localObject;
  }

  public final String bEz()
  {
    String str;
    if (this.mXK.nbS != null)
      str = this.mXK.nbS.title;
    while (true)
    {
      return str;
      if (this.mXK.nbN != null)
        str = this.mXK.nbN.Title;
      else
        str = null;
    }
  }

  public static final class a
  {
    public String desc;
    public String title;
    public String url;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.model.z
 * JD-Core Version:    0.6.2
 */