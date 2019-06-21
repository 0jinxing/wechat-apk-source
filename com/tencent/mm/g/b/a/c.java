package com.tencent.mm.g.b.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.a;

public final class c extends a
{
  private String cTx = "";
  public long cTy = 0L;
  public a cTz;

  public final String Fj()
  {
    AppMethodBeat.i(128637);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append(this.cTx);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cTy);
    ((StringBuffer)localObject).append(",");
    if (this.cTz != null);
    for (int i = this.cTz.value; ; i = -1)
    {
      ((StringBuffer)localObject).append(i);
      localObject = ((StringBuffer)localObject).toString();
      VX((String)localObject);
      AppMethodBeat.o(128637);
      return localObject;
    }
  }

  public final String Fk()
  {
    AppMethodBeat.i(128638);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append("Url:").append(this.cTx);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("DownLoadCostStampMs:").append(this.cTy);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("PreLoadStatus:").append(this.cTz);
    localObject = ((StringBuffer)localObject).toString();
    AppMethodBeat.o(128638);
    return localObject;
  }

  public final c eq(String paramString)
  {
    AppMethodBeat.i(128636);
    this.cTx = t("Url", paramString, true);
    AppMethodBeat.o(128636);
    return this;
  }

  public final int getId()
  {
    return 15586;
  }

  public static enum a
  {
    final int value;

    static
    {
      AppMethodBeat.i(128635);
      cTA = new a("NoDownLoad", 0, 0);
      cTB = new a("DownLoading", 1, 1);
      cTC = new a("DownLoaded", 2, 2);
      cTD = new a("DownLoadFail", 3, 3);
      cTE = new a[] { cTA, cTB, cTC, cTD };
      AppMethodBeat.o(128635);
    }

    private a(int paramInt)
    {
      this.value = paramInt;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.b.a.c
 * JD-Core Version:    0.6.2
 */