package com.tencent.d.e.a.b;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;

public final class a extends JceStruct
{
  static ArrayList<e> Auf;
  public String ArS = "";
  public long Aua = 0L;
  public ArrayList<e> Aub = null;
  public String Auc = "";
  public String Aud = "";
  public int Aue = 0;
  public int cIb = 0;
  public String ceI = "";
  public String few = "";
  public String fwM = "";
  public String imei = "";
  public String imsi = "";
  public String model = "";
  public int platform = 0;
  public int requestType = 0;
  public int sdkVer = 0;
  public int uaV = 0;

  public final void readFrom(JceInputStream paramJceInputStream)
  {
    AppMethodBeat.i(114575);
    this.Aua = paramJceInputStream.read(this.Aua, 0, true);
    this.few = paramJceInputStream.readString(1, true);
    if (Auf == null)
    {
      Auf = new ArrayList();
      e locale = new e();
      Auf.add(locale);
    }
    this.Aub = ((ArrayList)paramJceInputStream.read(Auf, 2, true));
    this.uaV = paramJceInputStream.read(this.uaV, 3, true);
    this.ArS = paramJceInputStream.readString(4, true);
    this.cIb = paramJceInputStream.read(this.cIb, 5, true);
    this.requestType = paramJceInputStream.read(this.requestType, 6, true);
    this.Auc = paramJceInputStream.readString(7, true);
    this.imei = paramJceInputStream.readString(8, false);
    this.imsi = paramJceInputStream.readString(9, false);
    this.fwM = paramJceInputStream.readString(10, false);
    this.model = paramJceInputStream.readString(11, false);
    this.Aud = paramJceInputStream.readString(12, false);
    this.Aue = paramJceInputStream.read(this.Aue, 13, false);
    this.sdkVer = paramJceInputStream.read(this.sdkVer, 14, false);
    this.ceI = paramJceInputStream.readString(15, false);
    this.platform = paramJceInputStream.read(this.platform, 16, false);
    AppMethodBeat.o(114575);
  }

  public final void writeTo(JceOutputStream paramJceOutputStream)
  {
    AppMethodBeat.i(114574);
    paramJceOutputStream.write(this.Aua, 0);
    paramJceOutputStream.write(this.few, 1);
    paramJceOutputStream.write(this.Aub, 2);
    paramJceOutputStream.write(this.uaV, 3);
    paramJceOutputStream.write(this.ArS, 4);
    paramJceOutputStream.write(this.cIb, 5);
    paramJceOutputStream.write(this.requestType, 6);
    paramJceOutputStream.write(this.Auc, 7);
    if (this.imei != null)
      paramJceOutputStream.write(this.imei, 8);
    if (this.imsi != null)
      paramJceOutputStream.write(this.imsi, 9);
    if (this.fwM != null)
      paramJceOutputStream.write(this.fwM, 10);
    if (this.model != null)
      paramJceOutputStream.write(this.model, 11);
    if (this.Aud != null)
      paramJceOutputStream.write(this.Aud, 12);
    if (this.Aue != 0)
      paramJceOutputStream.write(this.Aue, 13);
    if (this.sdkVer != 0)
      paramJceOutputStream.write(this.sdkVer, 14);
    if (this.ceI != null)
      paramJceOutputStream.write(this.ceI, 15);
    paramJceOutputStream.write(this.platform, 16);
    AppMethodBeat.o(114574);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.d.e.a.b.a
 * JD-Core Version:    0.6.2
 */