package com.tencent.mm.plugin.sns.a.b;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.model.aj;
import com.tencent.mm.plugin.sns.storage.b;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.plugin.sns.storage.o;
import com.tencent.mm.protocal.protobuf.cbf;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.LinkedList;

public final class a
{
  public String czD;
  boolean eTf;
  private String hnw;
  public int iZo;
  int position;
  boolean qCW;
  public cbf qCX;
  public View qCY;
  public View qCZ;
  private int qDA;
  long qDB;
  int qDC;
  int qDD;
  int qDE;
  int qDF;
  int qDG;
  int qDH;
  public int qDa;
  public int qDb;
  public int qDc;
  private View qDd;
  private int qDe;
  private int qDf;
  public String qDg;
  long qDh;
  private com.tencent.mm.plugin.sns.storage.a qDi;
  b qDj;
  int qDk;
  private int qDl;
  int qDm;
  private int qDn;
  long qDo;
  long qDp;
  private int qDq;
  private int qDr;
  long qDs;
  private int qDt;
  private int qDu;
  long qDv;
  private int qDw;
  private int qDx;
  long qDy;
  private int qDz;
  public int sceneType;

  public a(com.tencent.mm.plugin.sns.storage.a parama, String paramString, long paramLong, View paramView1, int paramInt1, View paramView2, int paramInt2, int paramInt3, cbf paramcbf, int paramInt4, b paramb)
  {
    AppMethodBeat.i(35701);
    this.qCW = false;
    this.sceneType = 1;
    this.position = 0;
    this.qDa = 0;
    this.iZo = 0;
    this.qDb = 0;
    this.qDe = 0;
    this.qDg = "";
    this.qDh = 0L;
    this.qDi = null;
    this.hnw = "";
    this.qDk = -10086;
    this.qDl = -10086;
    this.qDm = -10086;
    this.qDn = -10086;
    this.qDo = 0L;
    this.qDp = 0L;
    this.qDq = -10086;
    this.qDr = -10086;
    this.qDs = 0L;
    this.qDt = -10086;
    this.qDu = -10086;
    this.qDv = 0L;
    this.qDw = -10086;
    this.qDx = -10086;
    this.qDy = 0L;
    this.qDz = -10086;
    this.qDA = -10086;
    this.qDB = 0L;
    this.qDC = 0;
    this.qDD = -1;
    this.qDE = -1;
    this.qDF = 0;
    this.qDG = 0;
    this.eTf = false;
    this.qDH = 0;
    this.czD = "";
    this.position = paramInt4;
    this.qCY = paramView1;
    this.qCX = paramcbf;
    this.qDj = paramb;
    this.qDi = parama;
    this.sceneType = paramInt3;
    if (parama == null)
    {
      paramView1 = "";
      this.hnw = paramView1;
      if (parama != null)
        break label354;
    }
    label354: for (parama = ""; ; parama = com.tencent.mm.sdk.platformtools.bo.bc(parama.qPj, ""))
    {
      this.qDg = parama;
      this.czD = paramString;
      this.qDh = paramLong;
      this.qDc = paramInt1;
      this.qDd = paramView2;
      this.qDe = paramInt2;
      if (this.qCY != null)
        this.qCZ = this.qCY.findViewById(2131827888);
      initView();
      AppMethodBeat.o(35701);
      return;
      paramView1 = com.tencent.mm.sdk.platformtools.bo.bc(parama.hnw, "");
      break;
    }
  }

  private void initView()
  {
    AppMethodBeat.i(35702);
    if ((this.iZo == 0) && (this.qCY != null))
    {
      this.iZo = this.qCY.getHeight();
      if (this.qCZ != null)
        this.qDa = this.qCZ.getHeight();
      if (this.iZo == 0)
        AppMethodBeat.o(35702);
    }
    while (true)
    {
      return;
      this.qDf = 0;
      if (this.qDd != null)
        this.qDf = this.qDd.getBottom();
      this.iZo -= this.qDa;
      this.qDb = (this.iZo / 2);
      this.qDc = (this.qDc - this.qDf - this.qDe);
      ab.i("MicroMsg.AdViewStatic", "viewHeight " + this.iZo + " SCREEN_HEIGHT: " + this.qDc + " abottom: " + this.qDf + " stHeight: " + this.qDe + " commentViewHeight:" + this.qDa);
      AppMethodBeat.o(35702);
    }
  }

  public final com.tencent.mm.protocal.protobuf.bo cmd()
  {
    AppMethodBeat.i(35704);
    com.tencent.mm.protocal.protobuf.bo localbo = new com.tencent.mm.protocal.protobuf.bo();
    Object localObject = af.cnF().kD(this.qDh);
    if (localObject != null)
    {
      localObject = aj.q((n)localObject);
      if (localObject != null)
      {
        localbo.vDR = ((cbf)localObject).xat.size();
        localbo.vDQ = ((cbf)localObject).xaq.size();
        AppMethodBeat.o(35704);
      }
    }
    while (true)
    {
      return localbo;
      if (this.qCX != null)
      {
        localbo.vDR = this.qCX.xas;
        localbo.vDQ = this.qCX.xap;
        AppMethodBeat.o(35704);
      }
      else
      {
        localbo = null;
        AppMethodBeat.o(35704);
      }
    }
  }

  public final boolean cme()
  {
    boolean bool = true;
    if (this.qDH == 1);
    while (true)
    {
      return bool;
      bool = false;
    }
  }

  public final void kG(boolean paramBoolean)
  {
    int i = 1;
    AppMethodBeat.i(35703);
    Object localObject;
    int j;
    int k;
    label105: int m;
    int n;
    if (this.qCY != null)
    {
      initView();
      if ((this.eTf) || (this.iZo <= 0))
      {
        AppMethodBeat.o(35703);
        return;
      }
      this.qCW = true;
      localObject = new int[2];
      this.qCY.getLocationOnScreen((int[])localObject);
      j = localObject[1] - this.qDf - this.qDe;
      k = j + this.iZo;
      if ((j < 0) || (k < 0) || (k > this.qDc))
        break label1101;
      this.qDH = 1;
      if ((this.qDk == -10086) && (this.qDl == -10086))
      {
        this.qDk = j;
        this.qDl = k;
      }
      this.qDm = j;
      this.qDn = k;
      ab.i("MicroMsg.AdViewStatic", "get top " + j + " bottom " + k + " body_half: " + this.qDb + "| " + (this.iZo + j) + "  firsttop " + this.qDk + " endtop " + this.qDm);
      if (j < 0)
      {
        m = j + this.iZo;
        n = this.iZo - m;
        ab.i("MicroMsg.AdViewStatic", "top " + j + " screen in " + m + " out: " + n);
        if ((m < this.qDb) || (this.qDq != -10086))
          break label1171;
        this.qDq = j;
        this.qDr = k;
        this.qDs = System.currentTimeMillis();
        ab.i("MicroMsg.AdViewStatic", "up first touch half" + m + " top " + j + " viewhieght " + this.iZo + " inscreenval: " + m + " outscreenval: " + n);
      }
    }
    label1157: label1165: label1171: for (int i1 = 0; ; i1 = 1)
    {
      if ((n >= this.qDb) && (this.qDt == -10086) && (i1 != 0) && (this.qDs > 0L))
      {
        this.qDt = j;
        this.qDu = k;
        this.qDv = System.currentTimeMillis();
        ab.i("MicroMsg.AdViewStatic", "down first touch half" + m + " bottom " + k + " viewhieght " + this.iZo + " inscreenval: " + m + " outscreenval: " + n);
      }
      if (k > this.qDc)
      {
        n = k - this.qDc;
        m = this.iZo - n;
        ab.i("MicroMsg.AdViewStatic", "bottom " + k + " screen in " + m + " out: " + n);
        i1 = i;
        if (m >= this.qDb)
        {
          i1 = i;
          if (this.qDq == -10086)
          {
            this.qDq = j;
            this.qDr = k;
            this.qDs = System.currentTimeMillis();
            ab.i("MicroMsg.AdViewStatic", "up first touch half" + n + " top " + j + " viewhieght " + this.iZo + " inscreenval: " + m + " outscreenval: " + n);
            i1 = 0;
          }
        }
        if ((n >= this.qDb) && (this.qDt == -10086) && (i1 != 0) && (this.qDs > 0L))
        {
          this.qDt = j;
          this.qDu = k;
          this.qDv = System.currentTimeMillis();
          ab.i("MicroMsg.AdViewStatic", "down first touch half" + n + " bottom " + k + " viewhieght " + this.iZo + " inscreenval: " + m + " outscreenval: " + n);
        }
      }
      label888: StringBuilder localStringBuilder;
      if ((j >= 0) && (k <= this.qDc))
      {
        if (this.qDy == 0L)
        {
          this.qDw = j;
          this.qDx = k;
          this.qDy = System.currentTimeMillis();
        }
        if (j >= 0)
          break label1149;
        i1 = -j;
        if ((this.qDD == -1) || (this.qDD > i1))
          this.qDD = i1;
        label921: if (k <= this.qDc)
          break label1157;
        i1 = k - this.qDc;
        if ((this.qDE == -1) || (this.qDE > i1))
          this.qDE = i1;
        label962: i = this.iZo;
        i1 = i;
        if (j < 0)
          i1 = i + j;
        i = i1;
        if (k > this.qDc)
          i = i1 - (k - this.qDc);
        if ((this.qDC == -1) || (this.qDC < i))
          this.qDC = i;
        localStringBuilder = new StringBuilder("unreadtop: ").append(this.qDD).append(" unreadBottom:").append(this.qDE).append(" readHeight: ").append(this.qDC);
        if (!paramBoolean)
          break label1165;
      }
      for (localObject = " isScrooIde"; ; localObject = "")
      {
        ab.i("MicroMsg.AdViewStatic", (String)localObject);
        AppMethodBeat.o(35703);
        break;
        label1101: this.qDH = 0;
        break label105;
        if ((this.qDB != 0L) || (this.qDy == 0L))
          break label888;
        this.qDz = j;
        this.qDA = k;
        this.qDB = System.currentTimeMillis();
        break label888;
        label1149: this.qDD = 0;
        break label921;
        this.qDE = 0;
        break label962;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.a.b.a
 * JD-Core Version:    0.6.2
 */