package com.tencent.mm.plugin.appbrand.appusage.a;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.bqd;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.j;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Iterator;
import java.util.LinkedList;

public class b extends j<a>
{
  public static final String[] fjY;
  private e bSd;

  static
  {
    AppMethodBeat.i(129737);
    fjY = new String[] { j.a(a.ccO, "AppBrandRecommendCard") };
    AppMethodBeat.o(129737);
  }

  public b(e parame)
  {
    super(parame, a.ccO, "AppBrandRecommendCard", null);
    this.bSd = parame;
  }

  public final void axQ()
  {
    AppMethodBeat.i(129734);
    this.bSd.hY("AppBrandRecommendCard", "delete from AppBrandRecommendCard");
    AppMethodBeat.o(129734);
  }

  public final LinkedList<bqd> axR()
  {
    Object localObject = null;
    AppMethodBeat.i(129736);
    Cursor localCursor = this.bSd.rawQuery("select * from AppBrandRecommendCard LIMIT 100", null);
    if (localCursor == null)
      AppMethodBeat.o(129736);
    while (true)
    {
      return localObject;
      ab.i("MicroMsg.Recommend.AppBrandRecommendCardStorage", "getRecommendWxaList()");
      localObject = new LinkedList();
      while (localCursor.moveToNext())
      {
        a locala = new a();
        locala.d(localCursor);
        ((LinkedList)localObject).add(locala.field_recommendCard);
      }
      localCursor.close();
      AppMethodBeat.o(129736);
    }
  }

  public final void t(LinkedList<bqd> paramLinkedList)
  {
    AppMethodBeat.i(129735);
    ab.i("MicroMsg.Recommend.AppBrandRecommendCardStorage", "addRecommendWxaList()");
    Object localObject = new LinkedList();
    ((LinkedList)localObject).addAll(paramLinkedList);
    localObject = ((LinkedList)localObject).iterator();
    while (((Iterator)localObject).hasNext())
    {
      bqd localbqd = (bqd)((Iterator)localObject).next();
      paramLinkedList = new a();
      paramLinkedList.field_appId = localbqd.wSq;
      paramLinkedList.field_recommendCard = localbqd;
      b(paramLinkedList);
    }
    AppMethodBeat.o(129735);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appusage.a.b
 * JD-Core Version:    0.6.2
 */