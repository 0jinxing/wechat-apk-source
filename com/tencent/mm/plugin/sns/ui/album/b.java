package com.tencent.mm.plugin.sns.ui.album;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.model.aj;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.plugin.sns.ui.aw;
import com.tencent.mm.plugin.sns.ui.d;
import com.tencent.mm.protocal.protobuf.TimeLineObject;
import com.tencent.mm.protocal.protobuf.uf;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class b extends d<a.b>
{
  private boolean czr;
  private String lQD;
  private Map<String, List<n>> map;
  private b.a rFC;
  private boolean rwo;
  private String userName;

  public b(b.a parama, String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(39976);
    this.userName = "";
    this.czr = false;
    this.lQD = "";
    this.rwo = false;
    this.rFC = null;
    this.map = new LinkedHashMap();
    this.rFC = parama;
    this.userName = paramString;
    this.czr = paramBoolean;
    AppMethodBeat.o(39976);
  }

  public final List<a.b> Kx()
  {
    AppMethodBeat.i(39979);
    this.map.clear();
    ArrayList localArrayList = new ArrayList();
    ab.i("MicroMsg.SnsAlbumAdapterHelper", "loadData isSelf=%s limitSeq=%s isPrivate=%s", new Object[] { Boolean.valueOf(this.czr), this.lQD, Boolean.valueOf(this.rwo) });
    List localList = aj.c(this.userName, this.czr, this.lQD);
    Iterator localIterator = localList.iterator();
    Object localObject1;
    Object localObject2;
    while (localIterator.hasNext())
    {
      localObject1 = (n)localIterator.next();
      if (((((n)localObject1).field_type == 1) || (((n)localObject1).field_type == 15)) && (((n)localObject1).cqu() != null) && (((n)localObject1).cqu().xfI != null) && (!((n)localObject1).cqu().xfI.wbK.isEmpty()))
      {
        long l = ((n)localObject1).field_createTime;
        String str = aw.kL(1000L * l).toString();
        ab.i("MicroMsg.SnsAlbumAdapterHelper", "key:%s createTime:%s info.id:%s", new Object[] { str, Long.valueOf(l * 1000L), Long.valueOf(((n)localObject1).field_snsId) });
        localObject2 = (List)this.map.get(str);
        localObject3 = localObject2;
        if (localObject2 == null)
        {
          localObject3 = new ArrayList();
          this.map.put(str, localObject3);
        }
        ((List)localObject3).add(localObject1);
      }
    }
    Object localObject3 = this.map.entrySet().iterator();
    while (((Iterator)localObject3).hasNext())
    {
      localObject1 = (Map.Entry)((Iterator)localObject3).next();
      localObject2 = new a.b();
      ((a.b)localObject2).label = ((String)((Map.Entry)localObject1).getKey());
      ((a.b)localObject2).rFt = ((List)((Map.Entry)localObject1).getValue());
      ab.i("MicroMsg.SnsAlbumAdapterHelper", "%s", new Object[] { localObject2 });
      localArrayList.add(localObject2);
    }
    ab.i("MicroMsg.SnsAlbumAdapterHelper", "loadData thread: %d count: %d  realCount:%s", new Object[] { Long.valueOf(Thread.currentThread().getId()), Integer.valueOf(localList.size()), Integer.valueOf(localArrayList.size()) });
    AppMethodBeat.o(39979);
    return localArrayList;
  }

  public final void dq(List<a.b> paramList)
  {
    AppMethodBeat.i(39978);
    if (this.rFC != null)
      this.rFC.dt(paramList);
    AppMethodBeat.o(39978);
  }

  public final void g(String paramString, boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(39977);
    ab.d("MicroMsg.SnsAlbumAdapterHelper", "limitSeq ".concat(String.valueOf(paramString)));
    this.lQD = paramString;
    this.rwo = paramBoolean1;
    hM(paramBoolean2);
    AppMethodBeat.o(39977);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.album.b
 * JD-Core Version:    0.6.2
 */