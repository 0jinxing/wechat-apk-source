package com.tencent.mm.kernel.b;

import android.app.Application;
import com.tencent.mm.kernel.a.a;

public abstract class g
{
  public Application cc;
  public String eHT;
  public a eJE;
  private Boolean eMo;
  public a eMp = new a();

  public g(String paramString, Application paramApplication)
  {
    this.eHT = paramString;
    this.eJE = new a();
    this.cc = paramApplication;
  }

  public final a SF()
  {
    return this.eMp;
  }

  public final boolean SG()
  {
    if (this.eMo == null)
      this.eMo = Boolean.valueOf(lQ(""));
    return this.eMo.booleanValue();
  }

  public abstract String getPackageName();

  public final boolean lQ(String paramString)
  {
    if ((this.eHT != null) && (this.eHT.equals(getPackageName() + paramString)));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public String toString()
  {
    if (this.eHT != null);
    for (String str = this.eHT; ; str = super.toString())
      return str;
  }

  public static final class a
  {
    public long eMq;
    public long eMr;
    public long eMs;
    public long eMt;
    public long eMu;
    public long eMv;
    public long eMw;
    public long eMx;
    public long eMy;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.kernel.b.g
 * JD-Core Version:    0.6.2
 */