package com.tencent.mm.plugin.ipcall.a;

import android.database.Cursor;
import android.os.Looper;
import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.ipcall.a.g.d;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class a$1 extends ak
{
  a$1(a parama, Looper paramLooper)
  {
    super(paramLooper);
  }

  public final void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(21705);
    long l1 = System.currentTimeMillis();
    Object localObject1 = i.bHw();
    ArrayList localArrayList = (ArrayList)paramMessage.obj;
    if ((localArrayList != null) && (localArrayList.size() > 0))
    {
      long l2 = ((d)localObject1).iV(Thread.currentThread().getId());
      ab.i("MicroMsg.IPCallAddressStorage", "getContactIdMap start");
      Object localObject2 = ((d)localObject1).bSd.a("IPCallAddressItem", new String[] { "contactId" }, null, null, null, null, null, 2);
      paramMessage = new HashMap();
      Object localObject3;
      if ((localObject2 != null) && (((Cursor)localObject2).moveToFirst()))
        do
        {
          localObject3 = ((Cursor)localObject2).getString(0);
          if (!paramMessage.containsKey(localObject3))
            paramMessage.put(localObject3, Boolean.TRUE);
        }
        while (((Cursor)localObject2).moveToNext());
      if (localObject2 != null)
        ((Cursor)localObject2).close();
      ab.i("MicroMsg.IPCallAddressStorage", "getContactIdMap end");
      localObject2 = localArrayList.iterator();
      while (((Iterator)localObject2).hasNext())
      {
        localObject3 = (com.tencent.mm.plugin.ipcall.a.g.c)((Iterator)localObject2).next();
        if (!paramMessage.containsKey(((com.tencent.mm.plugin.ipcall.a.g.c)localObject3).field_contactId))
          ((d)localObject1).b((com.tencent.mm.sdk.e.c)localObject3);
      }
      ((d)localObject1).iW(l2);
    }
    ab.d("MicroMsg.IPCallAddressBookLoader", "batchInsert, used %dms", new Object[] { Long.valueOf(System.currentTimeMillis() - l1) });
    a.a(this.nvm, System.currentTimeMillis());
    ab.d("MicroMsg.IPCallAddressBookLoader", "loadAllAddressItem, used: %dms", new Object[] { Long.valueOf(a.a(this.nvm) - a.b(this.nvm)) });
    a.c(this.nvm);
    a.a(this.nvm, -1L);
    a.d(this.nvm);
    localObject1 = this.nvm.nvk.iterator();
    while (((Iterator)localObject1).hasNext())
    {
      paramMessage = (a.a)((Iterator)localObject1).next();
      if (paramMessage != null)
        paramMessage.aLj();
    }
    this.nvm.nvk.clear();
    AppMethodBeat.o(21705);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.a.a.1
 * JD-Core Version:    0.6.2
 */