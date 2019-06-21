package com.tencent.mm.plugin.account.friend.a;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class am
{
  int bJt;
  String gwA;
  String gwB;
  int gwu;
  int gwv;
  int gww;
  int gwx;
  int gwy;
  int gwz;

  public am()
  {
    AppMethodBeat.i(108493);
    this.bJt = -1;
    this.gwu = 0;
    this.gwv = 0;
    this.gww = 0;
    this.gwx = 0;
    this.gwy = 0;
    this.gwz = 0;
    this.gwA = "";
    this.gwB = "";
    AppMethodBeat.o(108493);
  }

  public final ContentValues aqk()
  {
    AppMethodBeat.i(108495);
    ContentValues localContentValues = new ContentValues();
    if ((this.bJt & 0x1) != 0)
      localContentValues.put("grouopid", Integer.valueOf(this.gwu));
    if ((this.bJt & 0x2) != 0)
      localContentValues.put("membernum", Integer.valueOf(this.gwv));
    if ((this.bJt & 0x4) != 0)
      localContentValues.put("weixinnum", Integer.valueOf(this.gww));
    if ((this.bJt & 0x8) != 0)
      localContentValues.put("insert_time", Integer.valueOf(this.gwx));
    if ((this.bJt & 0x10) != 0)
      localContentValues.put("lastupdate_time", Integer.valueOf(this.gwy));
    if ((this.bJt & 0x20) != 0)
      localContentValues.put("needupdate", Integer.valueOf(this.gwz));
    if ((this.bJt & 0x40) != 0)
      localContentValues.put("updatekey", aql());
    if ((this.bJt & 0x80) != 0)
      localContentValues.put("groupname", aqm());
    AppMethodBeat.o(108495);
    return localContentValues;
  }

  public final String aql()
  {
    if (this.gwA == null);
    for (String str = ""; ; str = this.gwA)
      return str;
  }

  public final String aqm()
  {
    if (this.gwB == null);
    for (String str = ""; ; str = this.gwB)
      return str;
  }

  public final void d(Cursor paramCursor)
  {
    AppMethodBeat.i(108494);
    this.gwu = paramCursor.getInt(0);
    this.gwv = paramCursor.getInt(1);
    this.gww = paramCursor.getInt(2);
    this.gwx = paramCursor.getInt(3);
    this.gwy = paramCursor.getInt(4);
    this.gwz = paramCursor.getInt(5);
    this.gwA = paramCursor.getString(6);
    this.gwB = paramCursor.getString(7);
    AppMethodBeat.o(108494);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.friend.a.am
 * JD-Core Version:    0.6.2
 */