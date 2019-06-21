package com.tencent.mm.plugin.wepkg.b;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.h;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.wepkg.model.WepkgPreloadFile;
import com.tencent.mm.sdk.e.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.List;

public class d extends j<c>
{
  public static final String[] fnj;
  private static volatile d uVK;
  private final h fni;
  public final boolean hrm;

  static
  {
    AppMethodBeat.i(63398);
    fnj = new String[] { j.a(c.fjX, "WepkgPreloadFiles") };
    uVK = null;
    AppMethodBeat.o(63398);
  }

  private d(h paramh)
  {
    super(paramh, c.fjX, "WepkgPreloadFiles", c.diI);
    AppMethodBeat.i(63393);
    this.fni = paramh;
    if (paramh != null);
    for (boolean bool = true; ; bool = false)
    {
      this.hrm = bool;
      if (!this.hrm)
        ab.e("MicroMsg.Wepkg.WepkgPreloadFilesStorage", "storage can not work!!!");
      AppMethodBeat.o(63393);
      return;
    }
  }

  public static d dgo()
  {
    AppMethodBeat.i(63392);
    d locald;
    if (!g.RK())
    {
      locald = new d(null);
      AppMethodBeat.o(63392);
    }
    while (true)
    {
      return locald;
      if (uVK == null);
      try
      {
        if ((uVK == null) || (!uVK.hrm))
        {
          locald = new com/tencent/mm/plugin/wepkg/b/d;
          locald.<init>(g.RP().eJN);
          uVK = locald;
        }
        locald = uVK;
        AppMethodBeat.o(63392);
      }
      finally
      {
        AppMethodBeat.o(63392);
      }
    }
  }

  public final List<WepkgPreloadFile> ahD(String paramString)
  {
    WepkgPreloadFile localWepkgPreloadFile = null;
    AppMethodBeat.i(63395);
    if ((!this.hrm) || (bo.isNullOrNil(paramString)))
    {
      AppMethodBeat.o(63395);
      paramString = localWepkgPreloadFile;
    }
    while (true)
    {
      return paramString;
      Object localObject = String.format("select * from %s where %s=?", new Object[] { "WepkgPreloadFiles", "pkgId" });
      Cursor localCursor = rawQuery((String)localObject, new String[] { paramString });
      ab.i("MicroMsg.Wepkg.WepkgPreloadFilesStorage", "getPreLoadFileList queryStr:%s", new Object[] { localObject });
      if (localCursor == null)
      {
        ab.i("MicroMsg.Wepkg.WepkgPreloadFilesStorage", "cursor is null");
        AppMethodBeat.o(63395);
        paramString = localWepkgPreloadFile;
      }
      else if (localCursor.moveToFirst())
      {
        paramString = new ArrayList();
        do
        {
          localWepkgPreloadFile = new WepkgPreloadFile();
          localObject = new c();
          ((c)localObject).d(localCursor);
          localWepkgPreloadFile.a((c)localObject);
          paramString.add(localWepkgPreloadFile);
        }
        while (localCursor.moveToNext());
        localCursor.close();
        ab.i("MicroMsg.Wepkg.WepkgPreloadFilesStorage", "record list size:%s", new Object[] { Integer.valueOf(paramString.size()) });
        AppMethodBeat.o(63395);
      }
      else
      {
        localCursor.close();
        ab.i("MicroMsg.Wepkg.WepkgPreloadFilesStorage", "no record");
        AppMethodBeat.o(63395);
        paramString = localWepkgPreloadFile;
      }
    }
  }

  public final boolean ahE(String paramString)
  {
    AppMethodBeat.i(63396);
    boolean bool;
    if ((!this.hrm) || (bo.isNullOrNil(paramString)))
    {
      AppMethodBeat.o(63396);
      bool = false;
    }
    while (true)
    {
      return bool;
      c localc = new c();
      localc.field_pkgId = paramString;
      bool = super.a(localc, new String[] { "pkgId" });
      ab.i("MicroMsg.Wepkg.WepkgPreloadFilesStorage", "deleteRecordByPkgid pkgid:%s, ret:%s", new Object[] { paramString, Boolean.valueOf(bool) });
      AppMethodBeat.o(63396);
    }
  }

  public final boolean h(String paramString1, String paramString2, String paramString3, boolean paramBoolean)
  {
    boolean bool = false;
    AppMethodBeat.i(63397);
    if ((!this.hrm) || (bo.isNullOrNil(paramString1)) || (bo.isNullOrNil(paramString2)))
    {
      AppMethodBeat.o(63397);
      paramBoolean = bool;
    }
    while (true)
    {
      return paramBoolean;
      c localc = hu(paramString1, paramString2);
      if (localc == null)
      {
        AppMethodBeat.o(63397);
        paramBoolean = bool;
      }
      else
      {
        localc.field_completeDownload = paramBoolean;
        localc.field_filePath = paramString3;
        bool = super.c(localc, new String[0]);
        ab.i("MicroMsg.Wepkg.WepkgPreloadFilesStorage", "updateDownloadCompleteState pkgid:%s, rid:%s, completeDownload:%s, filePath:%s, ret:%s", new Object[] { paramString1, paramString2, Boolean.valueOf(paramBoolean), paramString3, Boolean.valueOf(bool) });
        AppMethodBeat.o(63397);
        paramBoolean = bool;
      }
    }
  }

  public final c hu(String paramString1, String paramString2)
  {
    Object localObject1 = null;
    AppMethodBeat.i(63394);
    if ((!this.hrm) || (bo.isNullOrNil(paramString1)) || (bo.isNullOrNil(paramString2)))
    {
      AppMethodBeat.o(63394);
      paramString1 = localObject1;
    }
    while (true)
    {
      return paramString1;
      Object localObject2 = com.tencent.mm.plugin.wepkg.utils.d.hA(paramString1, paramString2);
      localObject2 = rawQuery(String.format("select * from %s where %s=?", new Object[] { "WepkgPreloadFiles", "key" }), new String[] { localObject2 });
      if (((Cursor)localObject2).moveToFirst())
      {
        paramString1 = new c();
        paramString1.d((Cursor)localObject2);
        ((Cursor)localObject2).close();
        ab.i("MicroMsg.Wepkg.WepkgPreloadFilesStorage", "getRecordByRid exist record in DB, pkgid:%s, rid:%s, version:%s", new Object[] { paramString1.field_pkgId, paramString1.field_rid, paramString1.field_version });
        AppMethodBeat.o(63394);
      }
      else
      {
        ab.i("MicroMsg.Wepkg.WepkgPreloadFilesStorage", "getRecordByRid pkgid:%s, rid:%s, no record in DB", new Object[] { paramString1, paramString2 });
        ((Cursor)localObject2).close();
        AppMethodBeat.o(63394);
        paramString1 = localObject1;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wepkg.b.d
 * JD-Core Version:    0.6.2
 */