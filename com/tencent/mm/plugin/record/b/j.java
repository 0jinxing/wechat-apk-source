package com.tencent.mm.plugin.record.b;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.record.a.d;
import com.tencent.mm.plugin.record.a.i;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public final class j extends com.tencent.mm.sdk.e.j<i>
  implements com.tencent.mm.plugin.record.a.e
{
  private com.tencent.mm.sdk.e.e bSd;
  private Vector<d> pJJ;

  public j(com.tencent.mm.sdk.e.e parame)
  {
    super(parame, i.ccO, "RecordCDNInfo", null);
    AppMethodBeat.i(135678);
    this.pJJ = new Vector();
    this.bSd = parame;
    AppMethodBeat.o(135678);
  }

  private void b(int paramInt, i parami)
  {
    AppMethodBeat.i(135681);
    g.RS().aa(new j.3(this, paramInt, parami));
    AppMethodBeat.o(135681);
  }

  public final List<i> BE(int paramInt)
  {
    AppMethodBeat.i(135683);
    LinkedList localLinkedList = new LinkedList();
    Object localObject = "SELECT * FROM RecordCDNInfo WHERE recordLocalId = ".concat(String.valueOf(paramInt));
    Cursor localCursor = this.bSd.a((String)localObject, null, 2);
    if (localCursor != null)
    {
      while (localCursor.moveToNext())
      {
        localObject = new i();
        ((i)localObject).d(localCursor);
        localLinkedList.add(localObject);
      }
      localCursor.close();
    }
    ab.d("MicroMsg.RecordMsgCDNStorage", "get all finish, result count %d", new Object[] { Integer.valueOf(localLinkedList.size()) });
    AppMethodBeat.o(135683);
    return localLinkedList;
  }

  public final i VH(String paramString)
  {
    Object localObject = null;
    AppMethodBeat.i(135684);
    paramString = "SELECT * FROM RecordCDNInfo WHERE mediaId='" + paramString + "'";
    Cursor localCursor = this.bSd.a(paramString, null, 2);
    paramString = localObject;
    if (localCursor != null)
    {
      paramString = localObject;
      if (localCursor.moveToFirst())
      {
        paramString = new i();
        paramString.d(localCursor);
      }
    }
    if (localCursor != null)
      localCursor.close();
    AppMethodBeat.o(135684);
    return paramString;
  }

  public final void a(d paramd)
  {
    AppMethodBeat.i(135679);
    g.RS().aa(new j.1(this, paramd));
    AppMethodBeat.o(135679);
  }

  public final boolean a(i parami)
  {
    boolean bool = true;
    AppMethodBeat.i(135687);
    if (super.a(parami))
    {
      b(1, parami);
      AppMethodBeat.o(135687);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(135687);
    }
  }

  public final boolean a(i parami, String[] paramArrayOfString)
  {
    boolean bool = false;
    AppMethodBeat.i(135685);
    if (super.a(parami, paramArrayOfString))
    {
      b(0, parami);
      bool = true;
      AppMethodBeat.o(135685);
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(135685);
    }
  }

  public final void b(d paramd)
  {
    AppMethodBeat.i(135680);
    g.RS().aa(new j.2(this, paramd));
    AppMethodBeat.o(135680);
  }

  public final boolean b(i parami)
  {
    boolean bool = true;
    AppMethodBeat.i(135688);
    if (parami != null)
    {
      ab.v("MicroMsg.RecordMsgCDNStorage", "insert record cdn info %s", new Object[] { parami });
      if (!super.b(parami))
        break label64;
      b(2, parami);
      AppMethodBeat.o(135688);
    }
    while (true)
    {
      return bool;
      ab.e("MicroMsg.RecordMsgCDNStorage", "insert null record cdn info");
      AppMethodBeat.o(135688);
      bool = false;
      continue;
      label64: AppMethodBeat.o(135688);
      bool = false;
    }
  }

  public final boolean b(i parami, String[] paramArrayOfString)
  {
    boolean bool = true;
    AppMethodBeat.i(135686);
    if (super.c(parami, paramArrayOfString))
    {
      b(1, parami);
      AppMethodBeat.o(135686);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(135686);
    }
  }

  public final List<i> ceA()
  {
    AppMethodBeat.i(135682);
    LinkedList localLinkedList = new LinkedList();
    Cursor localCursor = this.bSd.a("SELECT * FROM RecordCDNInfo WHERE status != 3 AND status != 4 AND status != 2 AND status != -1", null, 2);
    if (localCursor != null)
    {
      while (localCursor.moveToNext())
      {
        i locali = new i();
        locali.d(localCursor);
        localLinkedList.add(locali);
      }
      localCursor.close();
    }
    ab.d("MicroMsg.RecordMsgCDNStorage", "get all finish, result count %d", new Object[] { Integer.valueOf(localLinkedList.size()) });
    AppMethodBeat.o(135682);
    return localLinkedList;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.record.b.j
 * JD-Core Version:    0.6.2
 */