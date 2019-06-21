package com.tencent.mm.plugin.sns.model.a;

import android.util.SparseArray;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.data.e;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.model.an;
import com.tencent.mm.protocal.protobuf.bau;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.az;

public final class a
{
  public String cFc;
  public String cHr = "";
  public String cvZ = "";
  public e qFJ = null;
  public SparseArray<e> qFK;
  public String qFR = "";
  public String qFS = "";
  public SparseArray<bau> qFU;
  public String qJc = "";
  public String qJg = "";
  public bau qJh;
  public boolean qNT = false;
  public boolean qNU = false;
  public int qNV = 0;
  public az qNW;
  public float qNX = 0.0F;
  public String url = "";

  public a(String paramString)
  {
    this.cHr = paramString;
  }

  public a(String paramString, SparseArray<bau> paramSparseArray, SparseArray<e> paramSparseArray1)
  {
    this.cFc = paramString;
    this.qFU = paramSparseArray;
    this.qFK = paramSparseArray1;
  }

  public final boolean EK()
  {
    AppMethodBeat.i(36742);
    this.qJc = an.fZ(af.getAccSnsPath(), this.cHr);
    AppMethodBeat.o(36742);
    return true;
  }

  public final String cop()
  {
    AppMethodBeat.i(36743);
    String str;
    if (this.qNV == 4)
    {
      str = i.p(this.qJh);
      AppMethodBeat.o(36743);
    }
    while (true)
    {
      return str;
      if (this.qNV == 6)
      {
        str = i.q(this.qJh);
        AppMethodBeat.o(36743);
      }
      else if (this.qNT)
      {
        str = i.n(this.qJh);
        AppMethodBeat.o(36743);
      }
      else
      {
        str = i.m(this.qJh);
        AppMethodBeat.o(36743);
      }
    }
  }

  public final String getPath()
  {
    AppMethodBeat.i(36744);
    String str;
    if (!bo.isNullOrNil(this.qFR))
    {
      str = this.qFR;
      AppMethodBeat.o(36744);
    }
    while (true)
    {
      return str;
      if (bo.isNullOrNil(this.qJc))
        EK();
      str = this.qJc;
      AppMethodBeat.o(36744);
    }
  }

  public final a gf(String paramString1, String paramString2)
  {
    this.qFR = paramString1;
    this.qFS = paramString2;
    return this;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.model.a.a
 * JD-Core Version:    0.6.2
 */