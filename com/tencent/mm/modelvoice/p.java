package com.tencent.mm.modelvoice;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class p
{
  public int bJt;
  public String cIS;
  public long cKK;
  public String clientId;
  public long createTime;
  int dqI;
  String dqJ;
  public int fVG;
  public String fWW;
  public int fWY;
  public long fXb;
  public int fXe;
  int fXf;
  String fYX;
  int fZe;
  public String fileName;
  public int frO;
  public int gaf;
  int gag;
  long gah;
  int gai;
  public int status;

  public p()
  {
    AppMethodBeat.i(116613);
    this.bJt = -1;
    this.fZe = 0;
    this.fileName = "";
    this.cIS = "";
    this.clientId = "";
    this.cKK = 0L;
    this.fVG = 0;
    this.fWY = 0;
    this.frO = 0;
    this.status = 0;
    this.createTime = 0L;
    this.fXb = 0L;
    this.gaf = 0;
    this.fXe = 0;
    this.fWW = "";
    this.fXf = 0;
    this.fYX = "";
    this.dqJ = "";
    this.dqI = 0;
    this.gag = 0;
    this.gah = 0L;
    this.gai = 0;
    AppMethodBeat.o(116613);
  }

  public final ContentValues Hl()
  {
    AppMethodBeat.i(116611);
    ContentValues localContentValues = new ContentValues();
    if ((this.bJt & 0x1) != 0)
      localContentValues.put("FileName", this.fileName);
    if ((this.bJt & 0x2) != 0)
      localContentValues.put("User", this.cIS);
    if ((this.bJt & 0x4) != 0)
      localContentValues.put("MsgId", Long.valueOf(this.cKK));
    if ((this.bJt & 0x8) != 0)
      localContentValues.put("NetOffset", Integer.valueOf(this.fVG));
    if ((this.bJt & 0x10) != 0)
      localContentValues.put("FileNowSize", Integer.valueOf(this.fWY));
    if ((this.bJt & 0x20) != 0)
      localContentValues.put("TotalLen", Integer.valueOf(this.frO));
    if ((this.bJt & 0x40) != 0)
      localContentValues.put("Status", Integer.valueOf(this.status));
    if ((this.bJt & 0x80) != 0)
      localContentValues.put("CreateTime", Long.valueOf(this.createTime));
    if ((this.bJt & 0x100) != 0)
      localContentValues.put("LastModifyTime", Long.valueOf(this.fXb));
    if ((this.bJt & 0x200) != 0)
      localContentValues.put("ClientId", this.clientId);
    if ((this.bJt & 0x400) != 0)
      localContentValues.put("VoiceLength", Integer.valueOf(this.gaf));
    if ((this.bJt & 0x800) != 0)
      localContentValues.put("MsgLocalId", Integer.valueOf(this.fXe));
    if ((this.bJt & 0x1000) != 0)
      localContentValues.put("Human", this.fWW);
    if ((this.bJt & 0x2000) != 0)
      localContentValues.put("reserved1", Integer.valueOf(this.fXf));
    if ((this.bJt & 0x4000) != 0)
      localContentValues.put("reserved2", this.fYX);
    if ((this.bJt & 0x8000) != 0)
      localContentValues.put("MsgSource", this.dqJ);
    if ((this.bJt & 0x10000) != 0)
      localContentValues.put("MsgFlag", Integer.valueOf(this.dqI));
    if ((this.bJt & 0x20000) != 0)
      localContentValues.put("MsgSeq", Integer.valueOf(this.gag));
    if ((this.bJt & 0x40000) != 0)
      localContentValues.put("MasterBufId", Long.valueOf(this.gah));
    if ((this.bJt & 0x80000) != 0)
      localContentValues.put("checksum", Integer.valueOf(this.gai));
    AppMethodBeat.o(116611);
    return localContentValues;
  }

  public final boolean amd()
  {
    if ((this.status == 5) || (this.status == 6));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean ame()
  {
    boolean bool1 = true;
    if (this.status > 1)
    {
      bool2 = bool1;
      if (this.status <= 3);
    }
    else
    {
      if (this.status != 8)
        break label33;
    }
    label33: for (boolean bool2 = bool1; ; bool2 = false)
      return bool2;
  }

  public final void d(Cursor paramCursor)
  {
    AppMethodBeat.i(116612);
    this.fileName = paramCursor.getString(0);
    this.cIS = paramCursor.getString(1);
    this.cKK = paramCursor.getLong(2);
    this.fVG = paramCursor.getInt(3);
    this.fWY = paramCursor.getInt(4);
    this.frO = paramCursor.getInt(5);
    this.status = paramCursor.getInt(6);
    this.createTime = paramCursor.getLong(7);
    this.fXb = paramCursor.getLong(8);
    this.clientId = paramCursor.getString(9);
    this.gaf = paramCursor.getInt(10);
    this.fXe = paramCursor.getInt(11);
    this.fWW = paramCursor.getString(12);
    this.fXf = paramCursor.getInt(13);
    this.fYX = paramCursor.getString(14);
    this.dqJ = paramCursor.getString(15);
    this.dqI = paramCursor.getInt(16);
    this.gag = paramCursor.getInt(17);
    this.gah = paramCursor.getLong(18);
    this.gai = paramCursor.getInt(19);
    AppMethodBeat.o(116612);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelvoice.p
 * JD-Core Version:    0.6.2
 */