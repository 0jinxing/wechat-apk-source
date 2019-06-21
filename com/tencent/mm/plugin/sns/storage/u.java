package com.tencent.mm.plugin.sns.storage;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.b.k;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.List;

public final class u extends j<t>
  implements k
{
  public static final String[] fnj;
  private e bSd;

  static
  {
    AppMethodBeat.i(38016);
    fnj = new String[] { j.a(t.ccO, "snsTagInfo2") };
    AppMethodBeat.o(38016);
  }

  public u(e parame)
  {
    super(parame, t.ccO, "snsTagInfo2", null);
    this.bSd = parame;
  }

  public final boolean UV(String paramString)
  {
    AppMethodBeat.i(38013);
    t localt = kF(5L);
    boolean bool;
    if (bo.isNullOrNil(localt.field_memberList))
    {
      bool = false;
      AppMethodBeat.o(38013);
    }
    while (true)
    {
      return bool;
      bool = bo.P(localt.field_memberList.split(",")).contains(paramString);
      AppMethodBeat.o(38013);
    }
  }

  public final boolean a(t paramt)
  {
    boolean bool = false;
    AppMethodBeat.i(38009);
    if (paramt.field_tagId == 0L)
    {
      AppMethodBeat.o(38009);
      return bool;
    }
    long l = paramt.field_tagId;
    Cursor localCursor = this.bSd.a("select *, rowid from snsTagInfo2 where tagId = ? ", new String[] { String.valueOf(l) }, 2);
    bool = localCursor.moveToFirst();
    localCursor.close();
    if (!bool)
      super.b(paramt);
    while (true)
    {
      b(paramt.field_tagId, 0, paramt);
      AppMethodBeat.o(38009);
      bool = true;
      break;
      super.a(paramt);
    }
  }

  public final boolean cmo()
  {
    AppMethodBeat.i(38014);
    boolean bool;
    if (cru().size() == 0)
    {
      bool = false;
      AppMethodBeat.o(38014);
    }
    while (true)
    {
      return bool;
      bool = true;
      AppMethodBeat.o(38014);
    }
  }

  public final List<Long> cru()
  {
    AppMethodBeat.i(38008);
    Cursor localCursor = this.bSd.a("snsTagInfo2", new String[] { "tagId" }, null, null, null, null, null, 2);
    ArrayList localArrayList = new ArrayList();
    while (localCursor.moveToNext())
      localArrayList.add(Long.valueOf(localCursor.getLong(0)));
    localCursor.close();
    AppMethodBeat.o(38008);
    return localArrayList;
  }

  public final Cursor getCursor()
  {
    AppMethodBeat.i(38012);
    Cursor localCursor = this.bSd.rawQuery("select *, rowid from snsTagInfo2 where tagId > 5", null);
    AppMethodBeat.o(38012);
    return localCursor;
  }

  public final List<String> jT(long paramLong)
  {
    AppMethodBeat.i(38006);
    Object localObject = kF(paramLong);
    if ((((t)localObject).field_memberList != null) && (!((t)localObject).field_memberList.equals("")))
    {
      localObject = bo.P(((t)localObject).field_memberList.split(","));
      AppMethodBeat.o(38006);
    }
    while (true)
    {
      return localObject;
      localObject = new ArrayList();
      AppMethodBeat.o(38006);
    }
  }

  public final String jU(long paramLong)
  {
    AppMethodBeat.i(38007);
    String str = kF(paramLong).field_tagName;
    AppMethodBeat.o(38007);
    return str;
  }

  public final t kF(long paramLong)
  {
    AppMethodBeat.i(38005);
    Cursor localCursor = this.bSd.a("select *, rowid from snsTagInfo2 where tagId = ? ", new String[] { String.valueOf(paramLong) }, 2);
    t localt = new t();
    if (localCursor.moveToFirst())
      localt.d(localCursor);
    localCursor.close();
    AppMethodBeat.o(38005);
    return localt;
  }

  public final int kG(long paramLong)
  {
    AppMethodBeat.i(38010);
    int i = this.bSd.delete("snsTagInfo2", " tagId = ? ", new String[] { String.valueOf(paramLong) });
    AppMethodBeat.o(38010);
    return i;
  }

  public final boolean v(long paramLong, String paramString)
  {
    AppMethodBeat.i(38011);
    paramString = "select tagId, tagName, count, rowid from snsTagInfo2 where tagId > 5 AND  tagName  =\"" + bo.vA(paramString) + "\" AND  tagId != " + paramLong;
    ab.d("MicroMsg.SnsTagInfoStorage", "isTagNameExist ".concat(String.valueOf(paramString)));
    paramString = this.bSd.a(paramString, null, 2);
    boolean bool = paramString.moveToFirst();
    paramString.close();
    AppMethodBeat.o(38011);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.u
 * JD-Core Version:    0.6.2
 */