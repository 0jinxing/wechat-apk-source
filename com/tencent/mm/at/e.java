package com.tencent.mm.at;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

public final class e
{
  public int bJt = -2;
  public long cKK;
  int cvd;
  public int dJA = 0;
  public String fDA = "";
  public String fDB = "";
  public int fDC;
  public int fDD;
  public String fDE = "";
  private String fDF = "";
  public int fDG;
  public long fDH;
  int fDI;
  public int fDJ = 0;
  public String fDK = "";
  int fDL = 1;
  private boolean fDM;
  private boolean fDN;
  private boolean fDO;
  private boolean fDP;
  private boolean fDQ;
  private boolean fDR;
  private boolean fDS;
  private boolean fDT;
  private boolean fDU;
  private boolean fDV;
  private boolean fDW;
  private boolean fDX;
  private boolean fDY;
  private boolean fDZ;
  public long fDy;
  public String fDz = "";
  private boolean fEa;
  private boolean fEb;
  private boolean fEc;
  private boolean fEd;
  private boolean fEe;
  private boolean fEf;
  public int frO;
  public int offset;
  public int status;

  public final ContentValues Hl()
  {
    AppMethodBeat.i(78195);
    ContentValues localContentValues = new ContentValues();
    if (this.fDM)
      localContentValues.put("id", Long.valueOf(this.fDy));
    if (this.fDN)
      localContentValues.put("msgSvrId", Long.valueOf(this.cKK));
    if (this.fDO)
      localContentValues.put("offset", Integer.valueOf(this.offset));
    if (this.fDP)
      localContentValues.put("totalLen", Integer.valueOf(this.frO));
    if (this.fDQ)
      localContentValues.put("bigImgPath", this.fDz);
    if (this.fDR)
      localContentValues.put("midImgPath", this.fDA);
    if (this.fDS)
      localContentValues.put("thumbImgPath", this.fDB);
    if (this.fDT)
      localContentValues.put("createtime", Integer.valueOf(this.fDG));
    if (this.fDU)
      localContentValues.put("msglocalid", Long.valueOf(this.fDH));
    if (this.fDV)
      localContentValues.put("status", Integer.valueOf(this.status));
    if (this.fDW)
      localContentValues.put("nettimes", Integer.valueOf(this.fDI));
    if (this.fDX)
      localContentValues.put("reserved1", Integer.valueOf(this.fDJ));
    if (this.fDY)
      localContentValues.put("reserved2", Integer.valueOf(this.cvd));
    if (this.fDZ)
      localContentValues.put("reserved3", this.fDK);
    if (this.fEa)
      localContentValues.put("hashdthumb", Integer.valueOf(this.dJA));
    if (this.fEb)
      if (this.offset >= this.frO)
        break label412;
    label412: for (int i = 0; ; i = 1)
    {
      localContentValues.put("iscomplete", Integer.valueOf(i));
      if (this.fEc)
        localContentValues.put("origImgMD5", this.fDF);
      if (this.fEd)
        localContentValues.put("compressType", Integer.valueOf(this.fDC));
      if (this.fEe)
        localContentValues.put("forwardType", Integer.valueOf(this.fDD));
      if (this.fEf)
        localContentValues.put("hevcPath", this.fDE);
      AppMethodBeat.o(78195);
      return localContentValues;
    }
  }

  public final boolean agP()
  {
    if ((this.frO != 0) && (this.frO == this.offset));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean agQ()
  {
    if (this.fDJ > 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final void agR()
  {
    this.dJA = 1;
    this.fEa = true;
  }

  public final void agS()
  {
    this.fDM = false;
    this.fDN = false;
    this.fDO = false;
    this.fDP = false;
    this.fDQ = false;
    this.fDR = false;
    this.fDS = false;
    this.fDT = false;
    this.fDU = false;
    this.fDV = false;
    this.fDW = false;
    this.fDX = false;
    this.fDY = false;
    this.fDZ = false;
    this.fEa = false;
    this.fEb = false;
    this.fEc = false;
    this.fEd = false;
    this.fEe = false;
    this.fEf = false;
  }

  public final void d(Cursor paramCursor)
  {
    AppMethodBeat.i(78194);
    this.fDy = paramCursor.getInt(0);
    this.cKK = paramCursor.getLong(1);
    this.offset = paramCursor.getInt(2);
    this.frO = paramCursor.getInt(3);
    this.fDz = paramCursor.getString(4);
    this.fDB = paramCursor.getString(5);
    this.fDG = paramCursor.getInt(6);
    this.fDH = paramCursor.getInt(7);
    this.status = paramCursor.getInt(8);
    this.fDI = paramCursor.getInt(9);
    this.fDJ = paramCursor.getInt(10);
    this.cvd = paramCursor.getInt(11);
    this.fDK = paramCursor.getString(12);
    this.dJA = paramCursor.getInt(14);
    this.fDL = paramCursor.getInt(15);
    this.fDF = paramCursor.getString(16);
    this.fDC = paramCursor.getInt(17);
    this.fDA = paramCursor.getString(18);
    this.fDD = paramCursor.getInt(19);
    this.fDE = paramCursor.getString(20);
    AppMethodBeat.o(78194);
  }

  public final void eI(long paramLong)
  {
    if (this.cKK != paramLong)
      this.fDN = true;
    this.cKK = paramLong;
  }

  public final void fG(long paramLong)
  {
    this.fDH = paramLong;
    this.fDU = true;
  }

  public final void fH(long paramLong)
  {
    this.fDy = paramLong;
    this.fDM = true;
  }

  public final void lr(int paramInt)
  {
    this.fDI = paramInt;
    this.fDW = true;
  }

  public final void ls(int paramInt)
  {
    this.fDG = paramInt;
    this.fDT = true;
  }

  public final void lt(int paramInt)
  {
    this.frO = paramInt;
    this.fDP = true;
  }

  public final void lu(int paramInt)
  {
    this.fDJ = paramInt;
    this.fDX = true;
  }

  public final void lv(int paramInt)
  {
    this.fDD = paramInt;
    this.fEe = true;
  }

  public final void lw(int paramInt)
  {
    if (this.fDL != paramInt)
      this.fEb = true;
    this.fDL = paramInt;
  }

  public final void lx(int paramInt)
  {
    this.fDC = paramInt;
    this.fEd = true;
  }

  public final void sa(String paramString)
  {
    this.fDF = paramString;
    this.fEc = true;
  }

  public final void sb(String paramString)
  {
    this.fDz = paramString;
    this.fDQ = true;
  }

  public final void sc(String paramString)
  {
    this.fDA = paramString;
    this.fDR = true;
  }

  public final void sd(String paramString)
  {
    this.fDB = paramString;
    this.fDS = true;
  }

  public final void se(String paramString)
  {
    AppMethodBeat.i(78193);
    if (((this.fDK == null) && (paramString != null)) || ((this.fDK != null) && (!this.fDK.equals(paramString))))
      this.fDZ = true;
    this.fDK = paramString;
    AppMethodBeat.o(78193);
  }

  public final void setOffset(int paramInt)
  {
    int i = 0;
    AppMethodBeat.i(78192);
    if (this.offset != paramInt)
      this.fDO = true;
    this.offset = paramInt;
    ab.e("MicroMsg.Imgfo", "set offset : %d  id:%d total:%d", new Object[] { Integer.valueOf(paramInt), Long.valueOf(this.fDH), Integer.valueOf(this.frO) });
    if (paramInt < this.frO);
    for (paramInt = i; ; paramInt = 1)
    {
      lw(paramInt);
      AppMethodBeat.o(78192);
      return;
    }
  }

  public final void setSource(int paramInt)
  {
    this.cvd = paramInt;
    this.fDY = true;
  }

  public final void setStatus(int paramInt)
  {
    this.status = paramInt;
    this.fDV = true;
  }

  public final void sf(String paramString)
  {
    this.fDE = paramString;
    this.fEf = true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.at.e
 * JD-Core Version:    0.6.2
 */