package com.tencent.mm.plugin.masssend.a;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class a
{
  int bJt;
  public int cde;
  public long createTime;
  String fQv;
  int fWZ;
  long fXb;
  public String filename;
  String fng;
  String fnh;
  public int msgType;
  String onY;
  public String onZ;
  public int ooa;
  public int oob;
  int ooc;
  int ood;
  public int ooe;
  int status;
  public int videoSource;

  public a()
  {
    AppMethodBeat.i(22721);
    this.bJt = -1;
    this.fQv = "";
    this.status = 0;
    this.createTime = 0L;
    this.fXb = 0L;
    this.filename = "";
    this.onY = "";
    this.onZ = "";
    this.ooa = 0;
    this.msgType = 0;
    this.oob = 0;
    this.ooc = 0;
    this.cde = 0;
    this.fWZ = 0;
    this.ood = 0;
    this.videoSource = 0;
    this.ooe = 0;
    this.fng = "";
    this.fnh = "";
    AppMethodBeat.o(22721);
  }

  public final String bNv()
  {
    if (this.fQv == null);
    for (String str = ""; ; str = this.fQv)
      return str;
  }

  public final String bNw()
  {
    if (this.filename == null);
    for (String str = ""; ; str = this.filename)
      return str;
  }

  public final String bNx()
  {
    if (this.onY == null);
    for (String str = ""; ; str = this.onY)
      return str;
  }

  public final String bNy()
  {
    if (this.onZ == null);
    for (String str = ""; ; str = this.onZ)
      return str;
  }

  public final void d(Cursor paramCursor)
  {
    AppMethodBeat.i(22722);
    this.fQv = paramCursor.getString(0);
    this.status = paramCursor.getInt(1);
    this.createTime = paramCursor.getLong(2);
    this.fXb = paramCursor.getLong(3);
    this.filename = paramCursor.getString(4);
    this.onY = paramCursor.getString(5);
    this.onZ = paramCursor.getString(6);
    this.ooa = paramCursor.getInt(7);
    this.msgType = paramCursor.getInt(8);
    this.oob = paramCursor.getInt(9);
    this.ooc = paramCursor.getInt(10);
    this.cde = paramCursor.getInt(11);
    this.fWZ = paramCursor.getInt(12);
    this.ood = paramCursor.getInt(13);
    this.videoSource = paramCursor.getInt(14);
    this.ooe = paramCursor.getInt(15);
    this.fng = paramCursor.getString(16);
    this.fnh = paramCursor.getString(17);
    AppMethodBeat.o(22722);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.masssend.a.a
 * JD-Core Version:    0.6.2
 */