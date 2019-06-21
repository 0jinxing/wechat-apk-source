package com.tencent.mm.ui.voicesearch;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.bq;
import com.tencent.mm.model.c;
import com.tencent.mm.model.t;
import com.tencent.mm.storage.bd;
import java.util.ArrayList;
import java.util.List;

final class b$9
  implements Runnable
{
  b$9(b paramb, boolean paramBoolean)
  {
  }

  public final void run()
  {
    int i = 0;
    AppMethodBeat.i(35336);
    Object localObject1;
    Object localObject2;
    Object localObject3;
    if ((b.g(this.zLA) != null) && (b.g(this.zLA).length != 0))
    {
      localObject1 = new ArrayList();
      localObject2 = b.g(this.zLA);
      int j = localObject2.length;
      while (i < j)
      {
        localObject3 = localObject2[i];
        if (this.zLA.asz((String)localObject3))
          ((List)localObject1).add(localObject3);
        i++;
      }
      if (((List)localObject1).size() > 0)
      {
        localObject3 = this.zLA;
        aw.ZK();
        b.a((b)localObject3, c.XM().a((String[])((List)localObject1).toArray(new String[((List)localObject1).size()]), b.h(this.zLA), b.a(this.zLA)));
        AppMethodBeat.o(35336);
      }
    }
    while (true)
    {
      return;
      localObject1 = this.zLA;
      aw.ZK();
      b.b((b)localObject1, c.XM().dsF());
      AppMethodBeat.o(35336);
      continue;
      if (b.i(this.zLA) != null)
      {
        if (!b.h(this.zLA).equals("@all.chatroom.contact"))
        {
          localObject1 = aw.ZK().fke.a(b.i(this.zLA), b.h(this.zLA), b.a(this.zLA), true);
          b.c(this.zLA, (Cursor)localObject1);
          AppMethodBeat.o(35336);
        }
        else
        {
          ArrayList localArrayList;
          if (this.zLC)
          {
            localObject1 = aw.ZK().fke.a(b.i(this.zLA), "@micromsg.with.all.biz.qq.com.openim", b.a(this.zLA), false);
            localObject3 = new ArrayList();
            localArrayList = new ArrayList();
          }
          while (true)
          {
            if (!((Cursor)localObject1).moveToNext())
              break label391;
            localObject2 = ((Cursor)localObject1).getString(((Cursor)localObject1).getColumnIndex("username"));
            if (!t.mN((String)localObject2))
            {
              ((ArrayList)localObject3).add(localObject2);
              continue;
              localObject1 = aw.ZK().fke.a(b.i(this.zLA), "@micromsg.with.all.biz.qq.com", b.a(this.zLA), false);
              break;
            }
            localArrayList.add(localObject2);
          }
          label391: if (!((Cursor)localObject1).isClosed())
            ((Cursor)localObject1).close();
          if ((((ArrayList)localObject3).size() != 0) || (localArrayList.size() != 0));
          for (localObject1 = aw.ZK().fke.a(b.i(this.zLA), (ArrayList)localObject3, null, localArrayList, b.a(this.zLA)); ; localObject1 = c.XM().dsF())
          {
            b.d(this.zLA, (Cursor)localObject1);
            AppMethodBeat.o(35336);
            break;
            aw.ZK();
          }
        }
      }
      else
      {
        localObject1 = this.zLA;
        aw.ZK();
        b.e((b)localObject1, c.XM().dsF());
        AppMethodBeat.o(35336);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.voicesearch.b.9
 * JD-Core Version:    0.6.2
 */