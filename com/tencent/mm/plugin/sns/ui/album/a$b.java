package com.tencent.mm.plugin.sns.ui.album;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.storage.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class a$b
{
  public String label;
  public List<n> rFt;

  public a$b()
  {
    AppMethodBeat.i(39960);
    this.rFt = new ArrayList();
    this.label = "";
    AppMethodBeat.o(39960);
  }

  public final String toString()
  {
    AppMethodBeat.i(39961);
    StringBuilder localStringBuilder = new StringBuilder();
    Iterator localIterator = this.rFt.iterator();
    while (localIterator.hasNext())
    {
      localObject = (n)localIterator.next();
      localStringBuilder.append("\t[localId=").append(((n)localObject).reX).append(", snsId=").append(((n)localObject).field_snsId).append("\n");
    }
    Object localObject = this.label + "\n" + localStringBuilder.toString();
    AppMethodBeat.o(39961);
    return localObject;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.album.a.b
 * JD-Core Version:    0.6.2
 */