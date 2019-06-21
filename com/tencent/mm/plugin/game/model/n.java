package com.tencent.mm.plugin.game.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.by;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public final class n extends by
{
  protected static c.a ccO;
  public String kYQ;
  public String mAppName;
  public String mWA;
  public String mWB;
  public int mWC;
  public long mWD;
  public long mWE;
  public int mWF;
  public n.a mWG;
  public String mWH;
  public String mWI;
  public String mWJ;
  public String mWK;
  public String mWL;
  public String mWM;
  public String mWN;
  public String mWO;
  public String mWP;
  public String mWQ;
  public String mWR;
  public String mWS;
  public n.g mWT;
  public n.f mWU;
  public n.h mWV;
  public n.j mWW;
  public n.b mWX;
  public k mWY;
  public n.l mWZ;
  public long mWf;
  private boolean mWg;
  public String mWh;
  public String mWi;
  public String mWj;
  public String mWk;
  public String mWl;
  public int mWm;
  public String mWn;
  public String mWo;
  public LinkedList<n.i> mWp;
  public boolean mWq;
  public n.d mWr;
  public boolean mWs;
  public n.c mWt;
  public HashMap<String, n.e> mWu;
  public String mWv;
  public int mWw;
  public int mWx;
  public int mWy;
  public String mWz;
  public int mXa;
  public int mXb;
  public String mXc;
  public int mXd;
  public String mXe;
  public boolean mXf;

  static
  {
    AppMethodBeat.i(111291);
    c.a locala = new c.a();
    locala.xDb = new Field[14];
    locala.columns = new String[15];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "msgId";
    locala.xDd.put("msgId", "LONG PRIMARY KEY ");
    localStringBuilder.append(" msgId LONG PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.xDc = "msgId";
    locala.columns[1] = "mergerId";
    locala.xDd.put("mergerId", "TEXT");
    localStringBuilder.append(" mergerId TEXT");
    localStringBuilder.append(", ");
    locala.columns[2] = "gameMsgId";
    locala.xDd.put("gameMsgId", "TEXT");
    localStringBuilder.append(" gameMsgId TEXT");
    localStringBuilder.append(", ");
    locala.columns[3] = "msgType";
    locala.xDd.put("msgType", "INTEGER");
    localStringBuilder.append(" msgType INTEGER");
    localStringBuilder.append(", ");
    locala.columns[4] = "createTime";
    locala.xDd.put("createTime", "LONG default '0' ");
    localStringBuilder.append(" createTime LONG default '0' ");
    localStringBuilder.append(", ");
    locala.columns[5] = "expireTime";
    locala.xDd.put("expireTime", "LONG default '0' ");
    localStringBuilder.append(" expireTime LONG default '0' ");
    localStringBuilder.append(", ");
    locala.columns[6] = "appId";
    locala.xDd.put("appId", "TEXT");
    localStringBuilder.append(" appId TEXT");
    localStringBuilder.append(", ");
    locala.columns[7] = "showInMsgList";
    locala.xDd.put("showInMsgList", "INTEGER default 'true' ");
    localStringBuilder.append(" showInMsgList INTEGER default 'true' ");
    localStringBuilder.append(", ");
    locala.columns[8] = "isRead";
    locala.xDd.put("isRead", "INTEGER default 'false' ");
    localStringBuilder.append(" isRead INTEGER default 'false' ");
    localStringBuilder.append(", ");
    locala.columns[9] = "label";
    locala.xDd.put("label", "TEXT default '' ");
    localStringBuilder.append(" label TEXT default '' ");
    localStringBuilder.append(", ");
    locala.columns[10] = "isHidden";
    locala.xDd.put("isHidden", "INTEGER default 'false' ");
    localStringBuilder.append(" isHidden INTEGER default 'false' ");
    localStringBuilder.append(", ");
    locala.columns[11] = "weight";
    locala.xDd.put("weight", "TEXT default '' ");
    localStringBuilder.append(" weight TEXT default '' ");
    localStringBuilder.append(", ");
    locala.columns[12] = "rawXML";
    locala.xDd.put("rawXML", "TEXT default '' ");
    localStringBuilder.append(" rawXML TEXT default '' ");
    localStringBuilder.append(", ");
    locala.columns[13] = "receiveTime";
    locala.xDd.put("receiveTime", "LONG default '0' ");
    localStringBuilder.append(" receiveTime LONG default '0' ");
    locala.columns[14] = "rowid";
    locala.sql = localStringBuilder.toString();
    ccO = locala;
    AppMethodBeat.o(111291);
  }

  public n()
  {
    AppMethodBeat.i(111289);
    this.mWf = 0L;
    this.mWg = false;
    this.kYQ = "";
    this.mWh = "";
    this.mWi = "";
    this.mAppName = "";
    this.mWj = "";
    this.mWk = "";
    this.mWl = "";
    this.mWm = 0;
    this.mWn = "";
    this.mWo = "";
    this.mWp = new LinkedList();
    this.mWr = new n.d();
    this.mWt = new n.c();
    this.mWu = new HashMap();
    this.mWv = "";
    this.mWw = 0;
    this.mWx = 0;
    this.mWy = 0;
    this.mWz = "";
    this.mWA = "";
    this.mWB = "";
    this.mWC = 0;
    this.mWD = 0L;
    this.mWE = 0L;
    this.mWF = 0;
    this.mWG = new n.a();
    this.mWH = "";
    this.mWI = "";
    this.mWJ = "";
    this.mWK = "";
    this.mWL = "";
    this.mWM = "";
    this.mWN = "";
    this.mWU = new n.f();
    this.mWV = new n.h();
    this.mWW = new n.j();
    this.mWX = new n.b();
    this.mWY = new k();
    this.mWZ = new n.l();
    this.mXd = 0;
    this.mXe = "";
    this.mXf = false;
    AppMethodBeat.o(111289);
  }

  public final c.a Ag()
  {
    return ccO;
  }

  public final void bEl()
  {
    AppMethodBeat.i(111290);
    if (this.mWg)
    {
      AppMethodBeat.o(111290);
      return;
    }
    if (this.field_msgType == 100)
    {
      u.bEx();
      u.a(this);
    }
    while (true)
    {
      this.mWg = true;
      AppMethodBeat.o(111290);
      break;
      p.a(this);
    }
  }

  public static final class k
  {
    public int mXA;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.model.n
 * JD-Core Version:    0.6.2
 */