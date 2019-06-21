package com.tencent.mm.plugin.wallet_core.model;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.fh;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.protocal.protobuf.bjg;
import com.tencent.mm.protocal.protobuf.csg;
import com.tencent.mm.protocal.protobuf.csk;
import com.tencent.mm.protocal.protobuf.csl;
import com.tencent.mm.protocal.protobuf.csn;
import com.tencent.mm.sdk.e.c.a;
import com.tencent.mm.sdk.platformtools.ab;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

public final class ag extends fh
{
  public static c.a ccO;
  public String nYG;
  private bjg tCF;
  public csg tCG;
  public csl tCH;
  public boolean tCI;
  public String tCJ;
  public String tCK;
  public String tCL;
  public String tCM;

  static
  {
    AppMethodBeat.i(46943);
    c.a locala = new c.a();
    locala.xDb = new Field[2];
    locala.columns = new String[3];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "wallet_region";
    locala.xDd.put("wallet_region", "INTEGER PRIMARY KEY ");
    localStringBuilder.append(" wallet_region INTEGER PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.xDc = "wallet_region";
    locala.columns[1] = "wallet_grey_item_buf";
    locala.xDd.put("wallet_grey_item_buf", "BLOB");
    localStringBuilder.append(" wallet_grey_item_buf BLOB");
    locala.columns[2] = "rowid";
    locala.sql = localStringBuilder.toString();
    ccO = locala;
    AppMethodBeat.o(46943);
  }

  public ag()
  {
    AppMethodBeat.i(46941);
    this.tCF = new bjg();
    this.tCG = null;
    this.tCH = null;
    this.tCI = false;
    this.tCJ = "";
    this.tCK = "";
    this.tCL = "";
    this.nYG = "";
    this.tCM = "";
    if (this.tCG == null)
      this.tCG = new csg();
    if (this.tCH == null)
      this.tCH = new csl();
    AppMethodBeat.o(46941);
  }

  public final c.a Ag()
  {
    return ccO;
  }

  public final void d(Cursor paramCursor)
  {
    AppMethodBeat.i(46942);
    super.d(paramCursor);
    this.tCF = new bjg();
    try
    {
      this.tCF = ((bjg)this.tCF.parseFrom(this.field_wallet_grey_item_buf));
      this.tCG = this.tCF.wMz;
      this.tCH = this.tCF.wMA;
      this.tCI = this.tCF.wMB;
      this.tCM = "";
      Iterator localIterator = this.tCF.wMC.iterator();
      while (localIterator.hasNext())
      {
        paramCursor = (String)localIterator.next();
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        this.tCM = (this.tCM + paramCursor + "\n");
      }
    }
    catch (Exception paramCursor)
    {
      ab.e("WalletRegionGreyItem", "parser PayIBGGetOverseaWalletRsp error");
    }
    while (true)
    {
      if (this.tCG == null)
        this.tCG = new csg();
      if (this.tCH == null)
        this.tCH = new csl();
      AppMethodBeat.o(46942);
      return;
      if (this.tCF.wMx != null)
      {
        this.tCJ = aa.a(this.tCF.wMx.xpO);
        this.tCK = aa.a(this.tCF.wMx.xpP);
      }
      if (this.tCF.wMy != null)
      {
        this.tCL = aa.a(this.tCF.wMy.xpM);
        this.nYG = aa.a(this.tCF.wMy.xpN);
      }
      ab.v("WalletRegionGreyItem", "noticeContent %s", new Object[] { this.tCL });
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.model.ag
 * JD-Core Version:    0.6.2
 */