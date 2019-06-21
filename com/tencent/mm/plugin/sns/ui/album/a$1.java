package com.tencent.mm.plugin.sns.ui.album;

import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.b;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Iterator;
import java.util.List;

final class a$1
  implements b.a
{
  a$1(a parama)
  {
  }

  public final void dt(List<a.b> paramList)
  {
    int i = 0;
    AppMethodBeat.i(39959);
    if (paramList == null);
    Object localObject;
    a locala;
    for (int j = 0; ; j = paramList.size())
    {
      ab.d("MicroMsg.SnsAlbumAdapter", "onLoadingFinish list.size=%s", new Object[] { Integer.valueOf(j) });
      this.rFs.rFg.clear();
      localObject = new a.b();
      ((a.b)localObject).label = "my_timeline";
      this.rFs.rFg.add(localObject);
      this.rFs.rFg.addAll(paramList);
      locala = this.rFs;
      localObject = this.rFs.rFg.iterator();
      j = i;
      while (((Iterator)localObject).hasNext())
        j += ((a.b)((Iterator)localObject).next()).rFt.size();
    }
    locala.rFo = j;
    if (!paramList.isEmpty())
    {
      localObject = new a.b();
      ((a.b)localObject).label = "loading";
      this.rFs.rFg.add(localObject);
    }
    this.rFs.aop.notifyChanged();
    if (this.rFs.rFr != null)
      this.rFs.rFr.du(paramList);
    AppMethodBeat.o(39959);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.album.a.1
 * JD-Core Version:    0.6.2
 */