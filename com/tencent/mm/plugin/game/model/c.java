package com.tencent.mm.plugin.game.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.game.d.bx;
import com.tencent.mm.pluginsdk.model.app.f;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.LinkedList;

public final class c extends f
{
  public int cBA;
  public int cKG;
  public String ctu;
  public int egi;
  public String haO;
  public String mVA;
  public String mVB;
  public boolean mVC;
  public String mVD;
  public long mVE;
  public bx mVF;
  public String mVj;
  public String mVk;
  public String mVl;
  public String mVm;
  public String mVn;
  public boolean mVo;
  public String mVp;
  public String mVq;
  public String mVr;
  public LinkedList<String> mVs;
  public String mVt;
  public LinkedList<String> mVu;
  public boolean mVv;
  public boolean mVw;
  public String mVx;
  public String mVy;
  public String mVz;
  public String name;
  public int position;
  public int scene;
  public int status;
  public int type;
  public int versionCode;

  public c()
  {
    AppMethodBeat.i(111194);
    this.status = 0;
    this.type = 0;
    this.mVj = "";
    this.mVk = "";
    this.mVl = "#929292";
    this.mVm = "";
    this.mVn = "";
    this.ctu = "";
    this.mVo = false;
    this.scene = 0;
    this.cKG = 0;
    this.position = 1;
    this.versionCode = 0;
    this.mVp = "";
    this.mVq = "";
    this.mVr = "";
    this.mVs = new LinkedList();
    this.mVt = "";
    this.mVu = new LinkedList();
    this.mVv = false;
    this.mVw = false;
    this.mVx = "";
    this.mVy = "#fca28a";
    this.mVz = "";
    this.haO = "";
    this.name = "";
    this.mVA = "#222222";
    this.mVB = "";
    this.mVC = false;
    this.mVD = "";
    this.mVE = 0L;
    this.cBA = 0;
    this.egi = 0;
    AppMethodBeat.o(111194);
  }

  public final boolean bDP()
  {
    boolean bool = true;
    AppMethodBeat.i(111195);
    if (((this.egi == 1) || (this.egi == 2)) && (this.mVF != null) && (!bo.isNullOrNil(this.mVF.ncG)))
      AppMethodBeat.o(111195);
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(111195);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.model.c
 * JD-Core Version:    0.6.2
 */