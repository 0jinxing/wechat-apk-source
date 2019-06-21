package com.tencent.mm.plugin.downloader_app.b;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.downloader_app.d.a;
import com.tencent.mm.plugin.downloader_app.d.b;
import com.tencent.mm.plugin.downloader_app.d.c;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Iterator;
import java.util.LinkedList;

public final class j
{
  private static LinkedList<String> kPf;
  private static LinkedList<String> kPg;
  private static d.d kPh;

  static
  {
    AppMethodBeat.i(136159);
    kPf = new LinkedList();
    kPg = new LinkedList();
    AppMethodBeat.o(136159);
  }

  public static int IM(String paramString)
  {
    AppMethodBeat.i(136152);
    int i;
    if (kPg.contains(paramString))
    {
      i = k.kPi;
      AppMethodBeat.o(136152);
    }
    while (true)
    {
      return i;
      i = k.UN_INSTALLED;
      AppMethodBeat.o(136152);
    }
  }

  public static void Iz(String paramString)
  {
    AppMethodBeat.i(136154);
    if (!contains(paramString))
    {
      kPf.addFirst(paramString);
      if (b.biR() != null)
      {
        a locala = new a();
        locala.field_appId = paramString;
        locala.field_modifyTime = System.currentTimeMillis();
        b.biR().b(locala);
      }
    }
    AppMethodBeat.o(136154);
  }

  public static void biO()
  {
    Object localObject1 = null;
    AppMethodBeat.i(136148);
    Object localObject2;
    if (b.biR() == null)
    {
      if (localObject1 != null)
        localObject2 = ((LinkedList)localObject1).iterator();
    }
    else
      while (true)
      {
        if (!((Iterator)localObject2).hasNext())
          break label215;
        localObject1 = (a)((Iterator)localObject2).next();
        ab.d("MicroMsg.TaskManager", "initFromDB, appId:%s, status:%d", new Object[] { ((a)localObject1).field_appId, Integer.valueOf(((a)localObject1).field_status) });
        if (((a)localObject1).field_status == k.kPi)
        {
          if (kPg.contains(((a)localObject1).field_appId))
            continue;
          kPg.add(((a)localObject1).field_appId);
          continue;
          localObject2 = b.biR().rawQuery(String.format("select * from %s order by %s desc", new Object[] { "DownloadTaskItem", "modifyTime" }), new String[0]);
          if (localObject2 == null)
            break;
          localObject1 = new LinkedList();
          while (((Cursor)localObject2).moveToNext())
          {
            a locala = new a();
            locala.d((Cursor)localObject2);
            ((LinkedList)localObject1).add(locala);
          }
          ((Cursor)localObject2).close();
          break;
        }
        if (!kPf.contains(((a)localObject1).field_appId))
          kPf.add(((a)localObject1).field_appId);
      }
    label215: if (kPh == null)
      kPh = new j.1();
    d.a(kPh);
    AppMethodBeat.o(136148);
  }

  public static LinkedList<String> biP()
  {
    AppMethodBeat.i(136150);
    LinkedList localLinkedList = new LinkedList();
    localLinkedList.addAll(kPf);
    localLinkedList.addAll(kPg);
    AppMethodBeat.o(136150);
    return localLinkedList;
  }

  public static LinkedList<String> biQ()
  {
    AppMethodBeat.i(136151);
    LinkedList localLinkedList = new LinkedList();
    localLinkedList.addAll(kPf);
    AppMethodBeat.o(136151);
    return localLinkedList;
  }

  public static boolean bix()
  {
    AppMethodBeat.i(136156);
    boolean bool;
    if (kPf.size() > 0)
    {
      bool = true;
      AppMethodBeat.o(136156);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(136156);
    }
  }

  public static boolean contains(String paramString)
  {
    AppMethodBeat.i(136153);
    boolean bool;
    if ((kPg.contains(paramString)) || (kPf.contains(paramString)))
    {
      bool = true;
      AppMethodBeat.o(136153);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(136153);
    }
  }

  public static void kP(String paramString)
  {
    AppMethodBeat.i(136155);
    kPg.remove(paramString);
    kPf.remove(paramString);
    if (b.biR() != null)
      b.biR().hY("DownloadTaskItem", String.format("delete from %s where %s=\"%s\"", new Object[] { "DownloadTaskItem", "appId", paramString }));
    AppMethodBeat.o(136155);
  }

  public static void stop()
  {
    AppMethodBeat.i(136149);
    kPf.clear();
    kPg.clear();
    if (kPh != null)
      d.b(kPh);
    kPh = null;
    AppMethodBeat.o(136149);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader_app.b.j
 * JD-Core Version:    0.6.2
 */