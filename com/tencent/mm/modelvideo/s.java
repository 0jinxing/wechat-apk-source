package com.tencent.mm.modelvideo;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.baa;
import com.tencent.mm.protocal.protobuf.cfh;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.br;
import java.util.Map;

public final class s
{
  public int bJt;
  public int cFa;
  public String cIS;
  public long cKK;
  public String cMW;
  public String cMn;
  String clientId;
  public long createTime;
  public int egF;
  public String fUG;
  public int fVG;
  public long fVs;
  public String fWW;
  public int fWY;
  public int fWZ;
  public int fXa;
  public long fXb;
  public long fXc;
  public int fXd;
  public int fXe;
  public int fXf;
  public int fXg;
  public int fXh;
  public int fXi;
  public String fXj;
  public int fXk;
  public String fXl;
  public cfh fXm;
  public baa fXn;
  public String fileName;
  public int frO;
  public int status;
  public int videoFormat;

  public s()
  {
    AppMethodBeat.i(50782);
    this.bJt = -1;
    this.fileName = "";
    this.clientId = "";
    this.cKK = 0L;
    this.fVG = 0;
    this.fWY = 0;
    this.frO = 0;
    this.fWZ = 0;
    this.fXa = 0;
    this.status = 0;
    this.createTime = 0L;
    this.fXb = 0L;
    this.fXc = 0L;
    this.fXd = 0;
    this.fXe = 0;
    this.fXf = 0;
    this.fXg = 0;
    this.cIS = "";
    this.fWW = "";
    this.fXh = 0;
    this.fXi = 0;
    this.fUG = "";
    this.fXj = "";
    this.fXk = 0;
    this.fVs = 0L;
    this.fXl = "";
    this.cMW = "";
    this.fXm = new cfh();
    this.cMn = "";
    this.egF = 0;
    this.fXn = new baa();
    this.cFa = 0;
    this.videoFormat = 0;
    AppMethodBeat.o(50782);
  }

  private void Z(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(50787);
    this.fXm = new cfh();
    try
    {
      this.fXm.parseFrom(paramArrayOfByte);
      AppMethodBeat.o(50787);
      return;
    }
    catch (Exception paramArrayOfByte)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.VideoInfo", paramArrayOfByte, "", new Object[0]);
        AppMethodBeat.o(50787);
      }
    }
  }

  private void aa(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(50788);
    this.fXn = new baa();
    try
    {
      this.fXn.parseFrom(paramArrayOfByte);
      AppMethodBeat.o(50788);
      return;
    }
    catch (Exception paramArrayOfByte)
    {
      while (true)
        AppMethodBeat.o(50788);
    }
  }

  private byte[] alA()
  {
    AppMethodBeat.i(50789);
    Object localObject = new byte[0];
    try
    {
      byte[] arrayOfByte = this.fXn.toByteArray();
      localObject = arrayOfByte;
      label19: AppMethodBeat.o(50789);
      return localObject;
    }
    catch (Exception localException)
    {
      break label19;
    }
  }

  private byte[] alu()
  {
    AppMethodBeat.i(50786);
    Object localObject = new byte[0];
    try
    {
      byte[] arrayOfByte = this.fXm.toByteArray();
      localObject = arrayOfByte;
      AppMethodBeat.o(50786);
      return localObject;
    }
    catch (Exception localException)
    {
      while (true)
        ab.printErrStackTrace("MicroMsg.VideoInfo", localException, "", new Object[0]);
    }
  }

  public static String ue(String paramString)
  {
    AppMethodBeat.i(50783);
    try
    {
      paramString = br.z(paramString, "msg");
      if (paramString != null)
      {
        paramString = (String)paramString.get(".msg.videomsg.$cdnvideourl");
        AppMethodBeat.o(50783);
        return paramString;
      }
    }
    catch (Exception paramString)
    {
      while (true)
      {
        paramString = "";
        AppMethodBeat.o(50783);
      }
    }
  }

  public final ContentValues Hl()
  {
    AppMethodBeat.i(50785);
    ContentValues localContentValues = new ContentValues();
    if ((this.bJt & 0x1) != 0)
      localContentValues.put("filename", getFileName());
    if ((this.bJt & 0x2) != 0)
      if (this.clientId != null)
        break label759;
    label759: for (String str = ""; ; str = this.clientId)
    {
      localContentValues.put("clientid", str);
      if ((this.bJt & 0x4) != 0)
        localContentValues.put("msgsvrid", Long.valueOf(this.cKK));
      if ((this.bJt & 0x8) != 0)
        localContentValues.put("netoffset", Integer.valueOf(this.fVG));
      if ((this.bJt & 0x10) != 0)
        localContentValues.put("filenowsize", Integer.valueOf(this.fWY));
      if ((this.bJt & 0x20) != 0)
        localContentValues.put("totallen", Integer.valueOf(this.frO));
      if ((this.bJt & 0x40) != 0)
        localContentValues.put("thumbnetoffset", Integer.valueOf(this.fWZ));
      if ((this.bJt & 0x80) != 0)
        localContentValues.put("thumblen", Integer.valueOf(this.fXa));
      if ((this.bJt & 0x100) != 0)
        localContentValues.put("status", Integer.valueOf(this.status));
      if ((this.bJt & 0x200) != 0)
        localContentValues.put("createtime", Long.valueOf(this.createTime));
      if ((this.bJt & 0x400) != 0)
        localContentValues.put("lastmodifytime", Long.valueOf(this.fXb));
      if ((this.bJt & 0x800) != 0)
        localContentValues.put("downloadtime", Long.valueOf(this.fXc));
      if ((this.bJt & 0x1000) != 0)
        localContentValues.put("videolength", Integer.valueOf(this.fXd));
      if ((this.bJt & 0x2000) != 0)
        localContentValues.put("msglocalid", Integer.valueOf(this.fXe));
      if ((this.bJt & 0x4000) != 0)
        localContentValues.put("nettimes", Integer.valueOf(this.fXf));
      if ((this.bJt & 0x8000) != 0)
        localContentValues.put("cameratype", Integer.valueOf(this.fXg));
      if ((this.bJt & 0x10000) != 0)
        localContentValues.put("user", getUser());
      if ((this.bJt & 0x20000) != 0)
        localContentValues.put("human", alt());
      if ((this.bJt & 0x40000) != 0)
        localContentValues.put("reserved1", Integer.valueOf(this.fXh));
      if ((this.bJt & 0x80000) != 0)
        localContentValues.put("reserved2", Integer.valueOf(this.fXi));
      if ((this.bJt & 0x100000) != 0)
        localContentValues.put("reserved3", alv());
      if ((this.bJt & 0x200000) != 0)
        localContentValues.put("reserved4", alw());
      if ((this.bJt & 0x400000) != 0)
        localContentValues.put("videofuncflag", Integer.valueOf(this.fXk));
      if ((this.bJt & 0x800000) != 0)
        localContentValues.put("masssendid", Long.valueOf(this.fVs));
      if ((this.bJt & 0x1000000) != 0)
        localContentValues.put("masssendlist", this.fXl);
      if ((this.bJt & 0x2000000) != 0)
        localContentValues.put("videomd5", this.cMW);
      if ((this.bJt & 0x4000000) != 0)
        localContentValues.put("streamvideo", alu());
      if ((this.bJt & 0x8000000) != 0)
        localContentValues.put("statextstr", this.cMn);
      if ((this.bJt & 0x10000000) != 0)
        localContentValues.put("downloadscene", Integer.valueOf(this.egF));
      if ((this.bJt & 0x20000000) != 0)
        localContentValues.put("mmsightextinfo", alA());
      if ((this.bJt & 0x1) != 0)
        localContentValues.put("preloadsize", Integer.valueOf(this.cFa));
      if ((this.bJt & 0x2) != 0)
        localContentValues.put("videoformat", Integer.valueOf(this.videoFormat));
      AppMethodBeat.o(50785);
      return localContentValues;
    }
  }

  public final String alt()
  {
    if (this.fWW == null);
    for (String str = ""; ; str = this.fWW)
      return str;
  }

  public final String alv()
  {
    if (this.fUG == null);
    for (String str = ""; ; str = this.fUG)
      return str;
  }

  public final String alw()
  {
    if (this.fXj == null);
    for (String str = ""; ; str = this.fXj)
      return str;
  }

  public final boolean alx()
  {
    if ((this.status == 140) || (this.status == 141) || (this.status == 142));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean aly()
  {
    if ((this.status == 121) || (this.status == 122) || (this.status == 120) || (this.status == 123));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean alz()
  {
    if ((this.status == 199) || (this.status == 199));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final void d(Cursor paramCursor)
  {
    AppMethodBeat.i(50784);
    this.fileName = paramCursor.getString(0);
    this.clientId = paramCursor.getString(1);
    this.cKK = paramCursor.getLong(2);
    this.fVG = paramCursor.getInt(3);
    this.fWY = paramCursor.getInt(4);
    this.frO = paramCursor.getInt(5);
    this.fWZ = paramCursor.getInt(6);
    this.fXa = paramCursor.getInt(7);
    this.status = paramCursor.getInt(8);
    this.createTime = paramCursor.getLong(9);
    this.fXb = paramCursor.getLong(10);
    this.fXc = paramCursor.getLong(11);
    this.fXd = paramCursor.getInt(12);
    this.fXe = paramCursor.getInt(13);
    this.fXf = paramCursor.getInt(14);
    this.fXg = paramCursor.getInt(15);
    this.cIS = paramCursor.getString(16);
    this.fWW = paramCursor.getString(17);
    this.fXh = paramCursor.getInt(18);
    this.fXi = paramCursor.getInt(19);
    this.fUG = paramCursor.getString(20);
    this.fXj = paramCursor.getString(21);
    this.fXk = paramCursor.getInt(22);
    this.fVs = paramCursor.getLong(23);
    this.fXl = paramCursor.getString(24);
    this.cMW = paramCursor.getString(25);
    Z(paramCursor.getBlob(26));
    this.cMn = paramCursor.getString(27);
    this.egF = paramCursor.getInt(28);
    aa(paramCursor.getBlob(29));
    this.cFa = paramCursor.getInt(30);
    this.videoFormat = paramCursor.getInt(31);
    AppMethodBeat.o(50784);
  }

  public final String getFileName()
  {
    if (this.fileName == null);
    for (String str = ""; ; str = this.fileName)
      return str;
  }

  public final String getUser()
  {
    if (this.cIS == null);
    for (String str = ""; ; str = this.cIS)
      return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelvideo.s
 * JD-Core Version:    0.6.2
 */