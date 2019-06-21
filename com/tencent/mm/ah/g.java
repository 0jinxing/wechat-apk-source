package com.tencent.mm.ah;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.h;
import com.tencent.mm.sdk.e.k;
import com.tencent.mm.sdk.platformtools.bo;

public final class g extends k
{
  public static final String[] fnj = { "CREATE TABLE IF NOT EXISTS hdheadimginfo ( username text  PRIMARY KEY , imgwidth int  , imgheigth int  , imgformat text  , totallen int  , startpos int  , headimgtype int  , reserved1 text  , reserved2 text  , reserved3 int  , reserved4 int  ) " };
  h fni;

  public g(h paramh)
  {
    this.fni = paramh;
  }

  public final int a(String paramString, f paramf)
  {
    AppMethodBeat.i(77917);
    paramf = paramf.Hl();
    int i = this.fni.update("hdheadimginfo", paramf, "username=?", new String[] { paramString });
    AppMethodBeat.o(77917);
    return i;
  }

  public final f qm(String paramString)
  {
    Object localObject1 = null;
    Object localObject2 = null;
    AppMethodBeat.i(77918);
    paramString = "select hdheadimginfo.username,hdheadimginfo.imgwidth,hdheadimginfo.imgheigth,hdheadimginfo.imgformat,hdheadimginfo.totallen,hdheadimginfo.startpos,hdheadimginfo.headimgtype,hdheadimginfo.reserved1,hdheadimginfo.reserved2,hdheadimginfo.reserved3,hdheadimginfo.reserved4 from hdheadimginfo   where hdheadimginfo.username = \"" + bo.vA(String.valueOf(paramString)) + "\"";
    Cursor localCursor = this.fni.a(paramString, null, 2);
    if (localCursor == null)
    {
      AppMethodBeat.o(77918);
      paramString = localObject2;
    }
    while (true)
    {
      return paramString;
      paramString = localObject1;
      if (localCursor.moveToFirst())
      {
        paramString = new f();
        paramString.username = localCursor.getString(0);
        paramString.frL = localCursor.getInt(1);
        paramString.frM = localCursor.getInt(2);
        paramString.frN = localCursor.getString(3);
        paramString.frO = localCursor.getInt(4);
        paramString.coc = localCursor.getInt(5);
        paramString.frP = localCursor.getInt(6);
        paramString.frQ = localCursor.getString(7);
        paramString.frR = localCursor.getString(8);
        paramString.frS = localCursor.getInt(9);
        paramString.frT = localCursor.getInt(10);
      }
      localCursor.close();
      AppMethodBeat.o(77918);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ah.g
 * JD-Core Version:    0.6.2
 */