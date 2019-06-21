package com.tencent.mm.plugin.brandservice.ui.timeline.preload.a;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.w;
import com.tencent.mm.plugin.brandservice.d;
import com.tencent.mm.protocal.protobuf.er;
import com.tencent.mm.protocal.protobuf.es;
import com.tencent.mm.protocal.protobuf.et;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class c
{
  public static void FO(String paramString)
  {
    AppMethodBeat.i(14401);
    if (bo.isNullOrNil(paramString))
    {
      ab.w("MicroMsg.Preload.BizAppMsgReportMgr", "url is null, err");
      AppMethodBeat.o(14401);
    }
    while (true)
    {
      return;
      er localer = new er();
      localer.Url = paramString;
      com.tencent.mm.plugin.webview.preload.a.kT(50);
      com.tencent.mm.plugin.webview.preload.a.kT(56);
      a(localer, 0);
      AppMethodBeat.o(14401);
    }
  }

  private static b.a a(er paramer)
  {
    AppMethodBeat.i(14405);
    LinkedList localLinkedList = new LinkedList();
    localLinkedList.add(paramer);
    paramer = b(localLinkedList, 0);
    AppMethodBeat.o(14405);
    return paramer;
  }

  static void a(er paramer, int paramInt)
  {
    AppMethodBeat.i(14402);
    w.a(a(paramer).acD(), new c.1(paramInt, paramer));
    AppMethodBeat.o(14402);
  }

  public static void aXs()
  {
    AppMethodBeat.i(14403);
    Cursor localCursor = d.aVT().bSd.query("BizAppMsgReportContext", null, null, null, null, null, "reportTime DESC limit 50");
    LinkedList localLinkedList = new LinkedList();
    while (localCursor.moveToNext())
    {
      localObject = new a();
      ((a)localObject).d(localCursor);
      localLinkedList.add(localObject);
    }
    localCursor.close();
    Object localObject = bb(localLinkedList);
    if (((LinkedList)localObject).size() <= 0)
    {
      d.aVT().ba(localLinkedList);
      ab.w("MicroMsg.Preload.BizAppMsgReportMgr", "list is null, return");
      AppMethodBeat.o(14403);
    }
    while (true)
    {
      return;
      com.tencent.mm.plugin.webview.preload.a.kT(53);
      w.a(b((LinkedList)localObject, 1).acD(), new c.2((LinkedList)localObject, localLinkedList));
      AppMethodBeat.o(14403);
    }
  }

  private static b.a b(LinkedList<er> paramLinkedList, int paramInt)
  {
    AppMethodBeat.i(14406);
    b.a locala = new b.a();
    locala.fsI = 2998;
    locala.uri = "/cgi-bin/mmbiz-bin/appmsgreport";
    locala.fsL = 0;
    locala.fsM = 0;
    es locales = new es();
    locales.vGC = paramLinkedList;
    locales.vGD = paramInt;
    locala.fsJ = locales;
    locala.fsK = new et();
    AppMethodBeat.o(14406);
    return locala;
  }

  private static LinkedList<er> bb(List<a> paramList)
  {
    AppMethodBeat.i(14404);
    LinkedList localLinkedList = new LinkedList();
    if (paramList.size() > 0)
    {
      ab.i("MicroMsg.Preload.BizAppMsgReportMgr", "[processReportList] list size:%d", new Object[] { Integer.valueOf(paramList.size()) });
      Iterator localIterator = paramList.iterator();
      while (localIterator.hasNext())
      {
        paramList = (a)localIterator.next();
        if (!bo.isNullOrNil(paramList.field_url))
        {
          if (System.currentTimeMillis() - paramList.field_reportTime >= com.tencent.mm.plugin.brandservice.ui.timeline.preload.e.jQZ)
          {
            com.tencent.mm.plugin.webview.preload.a.e(908, 60, 1, true);
          }
          else
          {
            er localer = new er();
            localer.Url = paramList.field_url;
            localer.vGy = paramList.field_reportTime;
            localLinkedList.add(localer);
            ab.v("MicroMsg.Preload.BizAppMsgReportMgr", "[processReportList] url:%s reportTime:%d", new Object[] { localer.Url, Long.valueOf(localer.vGy) });
          }
        }
        else
          ab.w("MicroMsg.Preload.BizAppMsgReportMgr", "[processReportList] url is null, err");
      }
    }
    AppMethodBeat.o(14404);
    return localLinkedList;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.preload.a.c
 * JD-Core Version:    0.6.2
 */