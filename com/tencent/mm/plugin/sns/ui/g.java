package com.tencent.mm.plugin.sns.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.h.a;
import com.tencent.mm.protocal.protobuf.ary;
import com.tencent.mm.protocal.protobuf.bau;
import com.tencent.mm.protocal.protobuf.db;
import com.tencent.mm.protocal.protobuf.fq;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.vfs.e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public final class g extends d<bau>
{
  private List<bau> list;
  private String nJy;
  private String path;
  private db rgA;
  private g.a rgB;
  private int rgh;
  private int rgi;
  private fq rgz;

  public g(g.a parama)
  {
    AppMethodBeat.i(38091);
    this.list = new ArrayList();
    this.rgh = 0;
    this.rgi = 0;
    this.nJy = "";
    this.path = "";
    this.rgB = parama;
    AppMethodBeat.o(38091);
  }

  public final List<bau> Kx()
  {
    AppMethodBeat.i(38093);
    ArrayList localArrayList = new ArrayList();
    try
    {
      localArrayList.clear();
      this.rgA = null;
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = this.path + this.nJy + "_ARTISTF.mm";
      Object localObject3;
      Object localObject4;
      if (e.ct((String)localObject2))
      {
        localObject3 = e.e((String)localObject2, 0, -1);
        localObject4 = new com/tencent/mm/protocal/protobuf/db;
        ((db)localObject4).<init>();
        this.rgA = ((db)((db)localObject4).parseFrom((byte[])localObject3));
      }
      Object localObject5;
      if (this.rgA == null)
      {
        localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>();
        localObject4 = this.path + this.nJy + "_ARTIST.mm";
        localObject3 = e.e((String)localObject4, 0, (int)e.asZ((String)localObject4));
        localObject5 = new java/lang/String;
        ((String)localObject5).<init>((byte[])localObject3);
        this.rgA = a.YD((String)localObject5);
        if (this.rgA == null)
        {
          e.deleteFile((String)localObject4);
          AppMethodBeat.o(38093);
        }
      }
      for (localArrayList = null; ; localArrayList = null)
      {
        return localArrayList;
        e.deleteFile((String)localObject2);
        localObject3 = this.rgA.toByteArray();
        e.b((String)localObject2, (byte[])localObject3, localObject3.length);
        localObject2 = this.rgA;
        if (localObject2 != null)
          break;
        AppMethodBeat.o(38093);
      }
      localObject2 = this.rgA.vFk.iterator();
      while (((Iterator)localObject2).hasNext())
      {
        localObject4 = (ary)((Iterator)localObject2).next();
        localObject3 = ((ary)localObject4).Name;
        localObject4 = ((ary)localObject4).wbK.iterator();
        while (((Iterator)localObject4).hasNext())
        {
          localObject5 = (bau)((Iterator)localObject4).next();
          ((bau)localObject5).Desc = ((String)localObject3);
          localArrayList.add(localObject5);
        }
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.ArtistAdapterHelper", localException, "loadData failed.", new Object[0]);
        AppMethodBeat.o(38093);
        Object localObject1 = null;
        continue;
        this.rgz = this.rgA.vFj;
        AppMethodBeat.o(38093);
      }
    }
  }

  public final void dq(List<bau> paramList)
  {
    AppMethodBeat.i(38092);
    if (this.rgB != null)
      if (paramList != null)
      {
        HashMap localHashMap1 = new HashMap();
        HashMap localHashMap2 = new HashMap();
        localHashMap1.clear();
        localHashMap2.clear();
        int i = paramList.size();
        ab.d("MicroMsg.ArtistAdapterHelper", "initFixType ".concat(String.valueOf(i)));
        int j = 0;
        int k = 0;
        int m = 0;
        if (j < i)
        {
          String str = ((bau)paramList.get(j)).Desc;
          int n;
          if (j + 1 < i)
          {
            if (str.equals(((bau)paramList.get(j + 1)).Desc))
              break label195;
            n = 1;
          }
          while (true)
          {
            localHashMap1.put(Integer.valueOf(k), Integer.valueOf(m));
            localHashMap2.put(Integer.valueOf(k), Integer.valueOf(n));
            m += n;
            k++;
            j = n + j;
            break;
            n = 1;
            continue;
            label195: if (j + 2 < i)
            {
              if (!str.equals(((bau)paramList.get(j + 2)).Desc))
                n = 2;
            }
            else
            {
              n = 2;
              continue;
              n = 3;
            }
          }
        }
        this.rgh = (k + 1);
        this.rgi = paramList.size();
        ab.d("MicroMsg.ArtistAdapterHelper", "icount " + this.rgh);
        this.list = paramList;
        this.rgB.a(this.list, localHashMap1, localHashMap2, this.rgi, this.rgh, this.rgz);
        AppMethodBeat.o(38092);
      }
    while (true)
    {
      return;
      this.rgB.crw();
      AppMethodBeat.o(38092);
    }
  }

  public final void gs(String paramString1, String paramString2)
  {
    AppMethodBeat.i(38094);
    this.nJy = paramString1;
    this.path = paramString2;
    hM(true);
    AppMethodBeat.o(38094);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.g
 * JD-Core Version:    0.6.2
 */