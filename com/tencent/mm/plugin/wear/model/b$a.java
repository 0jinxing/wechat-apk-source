package com.tencent.mm.plugin.wear.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.model.aw;
import com.tencent.mm.plugin.wear.model.f.d;
import java.util.LinkedList;
import java.util.List;

final class b$a extends d
{
  private b$a(b paramb)
  {
  }

  public final void execute()
  {
    AppMethodBeat.i(26278);
    aw.Rg().a(30, this.tXG);
    LinkedList localLinkedList = new LinkedList();
    localLinkedList.add("gh_43f2581f6fd6");
    Object localObject = new LinkedList();
    ((LinkedList)localObject).add(Integer.valueOf(1));
    localObject = new com.tencent.mm.pluginsdk.model.m(1, localLinkedList, (List)localObject, "", "");
    aw.Rg().a((com.tencent.mm.ai.m)localObject, 0);
    AppMethodBeat.o(26278);
  }

  public final String getName()
  {
    return "AddContactTask";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wear.model.b.a
 * JD-Core Version:    0.6.2
 */